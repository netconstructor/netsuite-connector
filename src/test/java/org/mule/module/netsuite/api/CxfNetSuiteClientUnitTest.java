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

import com.netsuite.webservices.lists.accounting_2010_2.Account;
import com.netsuite.webservices.platform.core_2010_2.types.RecordType;
import com.netsuite.webservices.platform.messages_2010_2.AddRequest;
import com.netsuite.webservices.platform_2010_2.NetSuitePortType;

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
    public void setup()
    {
        portProvider = mock(CxfPortProvider.class);
        port = mock(NetSuitePortType.class);
        client = new CxfNetSuiteClient(portProvider);
    }

    /**
     * Tests that {@link SoapNetSuiteClient#addRecord(RecordType, java.util.Map)}
     * converts maps into records properly
     */
    @Test
    @SuppressWarnings("serial")
    public void testAdd() throws Exception
    {
        when(portProvider.getAuthenticatedPort()).thenReturn(port);
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

        verify(port).add(argThat(new BaseMatcher<AddRequest>()
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
            public void describeTo(Description description)
            {
            }
        }));
    }
}
