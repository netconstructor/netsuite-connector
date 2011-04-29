/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite.api;

import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.mule.module.netsuite.api.model.entity.RecordId;
import org.mule.module.netsuite.api.model.entity.RecordReference;

import com.netsuite.webservices.lists.accounting_2010_2.Account;
import com.netsuite.webservices.lists.accounting_2010_2.Bin;
import com.netsuite.webservices.platform.core_2010_2.AttachBasicReference;
import com.netsuite.webservices.platform.core_2010_2.AttachContactReference;
import com.netsuite.webservices.platform.core_2010_2.ItemAvailabilityFilter;
import com.netsuite.webservices.platform.core_2010_2.RecordRef;
import com.netsuite.webservices.platform.core_2010_2.SearchEnumMultiSelectField;
import com.netsuite.webservices.platform.core_2010_2.types.RecordType;
import com.netsuite.webservices.platform.core_2010_2.types.SearchEnumMultiSelectFieldOperator;
import com.netsuite.webservices.platform.messages_2010_2.AddRequest;
import com.netsuite.webservices.platform.messages_2010_2.AttachRequest;
import com.netsuite.webservices.platform.messages_2010_2.GetDeletedRequest;
import com.netsuite.webservices.platform.messages_2010_2.GetItemAvailabilityRequest;
import com.netsuite.webservices.platform.messages_2010_2.UpdateRequest;
import com.netsuite.webservices.platform_2010_2.NetSuitePortType;

import java.util.Arrays;
import java.util.HashMap;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Before;
import org.junit.Test;

public class CxfNetSuiteClientUnitTest
{
    private CxfNetSuiteClient client;
    private CxfPortProvider portProvider;
    private NetSuitePortType port;

    @Before
    public void setup() throws Exception
    {
        portProvider = mock(CxfPortProvider.class);
        port = mock(NetSuitePortType.class);
        client = new CxfNetSuiteClient(portProvider);
        when(portProvider.getAuthenticatedPort()).thenReturn(port);
    }

    /**
     * Tests that {@link SoapNetSuiteClient#addRecord(RecordType, java.util.Map)}
     * converts maps into records properly
     */
    @Test
    @SuppressWarnings("serial")
    public void testAdd() throws Exception
    {
        client.addRecord(RecordType.ACCOUNT, new HashMap<String, Object>()
        {
            {
                put("acctName", "986");
                put("acctNumber", "9");
                put("description", "foo");
                put("curDocNum", "56");
                put("isInactive", "true");
            }
        });

        verify(port).add(argThat(new Matcher<AddRequest>()
        {
            public boolean matches(Object item)
            {
                AddRequest r = (AddRequest) item;
                Account a = (Account) r.getRecord();
                return a.getAcctName().equals("986")//
                       && a.getAcctNumber().equals("9")
                       && a.getDescription().equals("foo")
                       && a.getCurDocNum().equals(56L)//
                       && a.isIsInactive();
            }
        }));
    }

    @Test
    @SuppressWarnings("serial")
    public void updateRecord() throws Exception
    {

        client.updateRecord(new RecordReference(new RecordId.InternalId("12"), RecordType.BIN),
            new HashMap<String, Object>()
            {
                {
                    put("binNumber", "100");
                    put("memo", "bar");
                    put("isInactive", "true");
                }
            });

        verify(port).update(argThat(new Matcher<UpdateRequest>()
        {
            public boolean matches(Object item)
            {
                UpdateRequest r = (UpdateRequest) item;
                Bin b = (Bin) r.getRecord();
                return b.getBinNumber().equals("100")//
                       && b.getMemo().equals("bar")//
                       && b.getInternalId().equals("12")//
                       && b.isIsInactive();
            }
        }));
    }

    @Test
    public void attachRecordBasic() throws Exception
    {
        client.attachRecord(//
            new RecordReference(new RecordId.ExternalId("968"), RecordType.BUDGET), //
            new RecordReference(new RecordId.InternalId("100"), RecordType.CUSTOMER_STATUS), null);

        verify(port).attach(argThat(new Matcher<AttachRequest>()
        {
            public boolean matches(Object item)
            {
                AttachRequest r = (AttachRequest) item;
                AttachBasicReference br = (AttachBasicReference) r.getAttachReference();
                RecordRef attachedRecord = (RecordRef) br.getAttachedRecord();
                RecordRef attachTo = (RecordRef) br.getAttachTo();
                return attachedRecord.getExternalId().equals("968") && attachTo.getInternalId().equals("100");
            }
        }));
    }

    @Test
    public void attachRecordConact() throws Exception
    {
        client.attachRecord(
            //
            new RecordReference(new RecordId.ExternalId("968"), RecordType.BUDGET), //
            new RecordReference(new RecordId.InternalId("100"), RecordType.CUSTOMER_STATUS),
            new RecordReference(new RecordId.InternalId("10"), RecordType.CAMPAIGN_OFFER));
        verify(port).attach(argThat(new Matcher<AttachRequest>()
        {
            public boolean matches(Object item)
            {
                AttachRequest r = (AttachRequest) item;
                return r.getAttachReference() instanceof AttachContactReference;
            }
        }));
    }

    // TODO move cxf files to another dir

    @Test
    public void getItemAvailability() throws Exception
    {
        client.getItemAvailability(new RecordReference(new RecordId.ExternalId("489"), RecordType.BIN), null);
        verify(port).getItemAvailability(argThat(new Matcher<GetItemAvailabilityRequest>()
        {
            public boolean matches(Object item)
            {
                GetItemAvailabilityRequest r = (GetItemAvailabilityRequest) item;
                ItemAvailabilityFilter filter = r.getItemAvailabilityFilter();
                return filter.getItem().getRecordRef().size() == 1
                       && filter.getItem().getRecordRef().get(0).getExternalId().equals("489")
                       && filter.getLastQtyAvailableChange() == null;
            }
        }));
    }

    @Test
    public void getDeletedRecord() throws Exception
    {
        client.getDeletedRecord(RecordType.BUDGET, "within(isoDateRange(2010-1-6, 2011-2-9))");
        verify(port).getDeleted(argThat(new Matcher<GetDeletedRequest>()
        {
            public boolean matches(Object item)
            {
                GetDeletedRequest r = (GetDeletedRequest) item;
                SearchEnumMultiSelectField type = r.getGetDeletedFilter().getType();
                return type.getOperator() == SearchEnumMultiSelectFieldOperator.ANY_OF
                       && type.getSearchValue().equals(Arrays.asList("budget"));
            }
        }));
    }

    abstract class Matcher<T> extends BaseMatcher<T>
    {
        public void describeTo(Description description)
        {
        }
    }
}
