/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

/**
 * This file was automatically generated by the Mule Cloud Connector Development Kit
 */

package org.mule.module.netsuite;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.mule.api.lifecycle.InitialisationException;

import com.netsuite.webservices.documents.filecabinet_2010_2.FileSiteCategoryList;
import com.netsuite.webservices.documents.filecabinet_2010_2.types.FileAttachFrom;
import com.netsuite.webservices.documents.filecabinet_2010_2.types.FileEncoding;
import com.netsuite.webservices.documents.filecabinet_2010_2.types.MediaType;
import com.netsuite.webservices.documents.filecabinet_2010_2.types.TextFileEncoding;
import com.netsuite.webservices.lists.accounting_2010_2.types.ItemWeightUnit;
import com.netsuite.webservices.lists.employees_2010_2.Employee;
import com.netsuite.webservices.platform.core_2010_2.AsyncStatusResult;
import com.netsuite.webservices.platform.core_2010_2.RecordRef;
import com.netsuite.webservices.platform.core_2010_2.types.AsyncStatusType;
import com.netsuite.webservices.platform.core_2010_2.types.CalendarEventAttendeeResponse;
import com.netsuite.webservices.platform.core_2010_2.types.GetCustomizationType;
import com.netsuite.webservices.platform.core_2010_2.types.RecordType;
import com.netsuite.webservices.platform.core_2010_2.types.SearchDateFieldOperator;
import com.netsuite.webservices.platform.core_2010_2.types.SearchRecordType;
import com.netsuite.webservices.platform.messages_2010_2.AsyncResult;
import com.netsuite.webservices.platform.messages_2010_2.AsyncSearchResult;
import com.netsuite.webservices.transactions.financial_2010_2.types.BudgetBudgetType;

import java.awt.color.CMMException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("serial")
public class NetSuiteTestDriver
{
    // FIXME the file path of the wsdl is embedded in the generated classes
    private NetSuiteCloudConnector connector;

    @Before
    public void setup() throws InitialisationException
    {
        connector = new NetSuiteCloudConnector();
        connector.setAccount(System.getenv("netsuiteAccount"));
        connector.setEmail(System.getenv("netsuiteEmail"));
        connector.setPassword(System.getenv("netsuitePassword"));
        connector.setRoleId("3");
        connector.initialise();
    }

    @Test
    public void getServerTime() throws Exception
    {
        assertThat(connector.GetServerTime(), instanceOf(Date.class));
    }

    @Test
    public void getRecords() throws Exception
    {
        assertFalse(connector.getRecords(RecordType.CURRENCY).isEmpty());
    }
    

    @Test
    public void attachAndDetachEntity()
    {
        RecordRef file = null, folder = null, employee = createEmployeeJohnDoe();
        try
        {
            folder = createFolder();
            file = createFile(folder);
            connector.attachRecord(RecordType.FILE, file.getInternalId(), RecordIdType.INTERNAL,
                RecordType.EMPLOYEE, employee.getInternalId(), RecordIdType.INTERNAL, null, null, null);
            connector.detachRecord(RecordType.FILE, file.getInternalId(), RecordIdType.INTERNAL,
                RecordType.EMPLOYEE, employee.getInternalId(), RecordIdType.INTERNAL);
        }
        finally
        {
            connector.deleteRecord(RecordType.EMPLOYEE, employee.getInternalId(), RecordIdType.INTERNAL);
            if (file != null)
            {
                connector.deleteRecord(RecordType.FILE, file.getInternalId(), RecordIdType.INTERNAL);
            }
            if (folder != null)
            {
                connector.deleteRecord(RecordType.FOLDER, folder.getInternalId(), RecordIdType.INTERNAL);
            }
        }
    }

    private RecordRef createFolder()
    {
        return connector.addRecord(RecordType.FOLDER, new HashMap<String, Object>()
        {
            {
                put("isPrivate", false);
                put("name", "Folder1");
            }
        });
    }
    
    private RecordRef createFile(final RecordRef folder)
    {
        return connector.addRecord(RecordType.FILE, new HashMap<String, Object>()
        {
            {
                put("isPrivate", false);
                put("description", "File1.txt");
                put("textFileEncoding", TextFileEncoding.UTF_8);
                put("name", "foobar");
                put("content", "foo bar".getBytes());
                put("folder", folder);
            }
        });
    }

    /**
     * Test creating a file using the
     * {@link NetSuiteCloudConnector#addFile(java.util.Map, Object, String, String, RecordIdType)}
     * method
     */
    @Test
    public void addFile() throws Exception
    {
        RecordRef file = null, folder = createFolder();
        try
        {
            file = connector.addFile(null, "foobar", "File2.txt", folder.getInternalId(), RecordIdType.INTERNAL);
        }
        finally
        {
            if (file != null)
            {
                connector.deleteRecord(RecordType.FILE, file.getInternalId(), RecordIdType.INTERNAL);
            }
            connector.deleteRecord(RecordType.FOLDER, folder.getInternalId(), RecordIdType.INTERNAL);
        }
    }


    /**
     * Test that a record can be created and updated, and that the modification are
     * persistent
     */
    @Test
    public void updateRecord() throws Exception
    {

        RecordRef recordRef = createEmployeeJohnDoe();
        try
        {
            connector.updateRecord(RecordType.EMPLOYEE, recordRef.getInternalId(), RecordIdType.INTERNAL,
                new HashMap<String, Object>()
                {
                    {
                        put("fax", "159-945-57");
                    }
                });
            Employee record = (Employee) connector.getRecord(RecordType.EMPLOYEE, recordRef.getInternalId(),
                RecordIdType.INTERNAL);
            assertEquals("159-945-57", record.getFax());
        }
        finally
        {
            connector.deleteRecord(RecordType.EMPLOYEE, recordRef.getInternalId(), RecordIdType.INTERNAL);
        }
    }

    @Test
    public void getBudgetExchangeRate()
    {
        final RecordRef subsidiary = connector.addRecord(RecordType.SUBSIDIARY, new HashMap<String, Object>()
        {
            {
                put("Name", "ACME");
            }
        });
        RecordRef budget = connector.addRecord(RecordType.BUDGET, new HashMap<String, Object>()
        {
            {
                put("amount", 150000.00);
                put("subsidiary", subsidiary);
                put("budgetType", BudgetBudgetType.LOCAL);
            }
        });
        List<Object> budgetExchangeRate = connector.getBudgetExchangeRates(budget.getInternalId(),
            RecordIdType.INTERNAL, subsidiary.getInternalId(), RecordIdType.INTERNAL, null, null);
        assertNotNull(budgetExchangeRate);
    }

    @Test
    public void getConsolidatedExchangeRate()
    {
        List<Object> consolidatedExchangeRate = connector.getConsolidatedExchangeRates("10",
            RecordIdType.INTERNAL, "65", RecordIdType.INTERNAL, null, null);
        assertNotNull(consolidatedExchangeRate);
        // TODO
    }

    @Test
    public void getCustomizationId()
    {
        List<Object> customizations = connector.getCustomizationIds(GetCustomizationType.CRM_CUSTOM_FIELD,
            false);
        assertNotNull(customizations);
        assertFalse(customizations.isEmpty());
    }

    /**
     * Test that deleted records are retrieved in the getDeletedRecords query, using
     * the string oriented style
     */
    @Test
    public void getDeletedEntityStringExpression()
    {
        Date serverTime = connector.GetServerTime();
        RecordRef recordRef = createEmployeeJohnDoe();
        connector.deleteRecord(RecordType.EMPLOYEE, recordRef.getInternalId(), RecordIdType.INTERNAL);
        List<Object> deletedRecords = connector.getDeletedRecords(RecordType.EMPLOYEE, // 
            "after(dateTime('" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(serverTime)
                            + "','yyyy-MM-dd HH:mm:ss'))", null, null, null);
        assertEquals(1, deletedRecords.size());
    }

    /**
     * Test that deleted records are retrieved in the getDeletedRecords query, using
     * the simple style.
     */
    @Test
    public void getDeletedEntitySimpleExpression()
    {
        Date serverTime = connector.GetServerTime();
        RecordRef recordRef = createEmployeeJohnDoe();
        connector.deleteRecord(RecordType.EMPLOYEE, recordRef.getInternalId(), RecordIdType.INTERNAL);
        List<Object> deletedRecords = connector.getDeletedRecords(RecordType.EMPLOYEE, null, serverTime,
            null, SearchDateFieldOperator.AFTER);
        assertEquals(1, deletedRecords.size());
    }

    /**
     * Test that existing records can be fetched
     */
    @Test
    public void getRecord()
    {
        RecordRef campaign = connector.addRecord(RecordType.CAMPAIGN, new HashMap<String, Object>()
        {
            {
                put("title", "The Campagniola");
            }
        });
        try
        {
            connector.getRecord(RecordType.CAMPAIGN, campaign.getInternalId(), RecordIdType.INTERNAL);
        }
        finally
        {
            connector.deleteRecord(RecordType.CAMPAIGN, campaign.getInternalId(), RecordIdType.INTERNAL);
        }
    }

    /**
     * Tests that simple searches that involve multiple record attributes work
     * properly
     */
    @Test
    public void findRecordSimpleSearch() throws Exception
    {
        List<Object> employees = findJohnDoe();
        assertTrue(employees.isEmpty());

        RecordRef ref = createEmployeeJohnDoe();
        try
        {
            assertEquals(1, findJohnDoe().size());
            assertEquals(0, findMaryDoe().size());
        }
        finally
        {
            connector.deleteRecord(RecordType.EMPLOYEE, ref.getInternalId(), RecordIdType.INTERNAL);
        }
    }

    private List<Object> findJohnDoe()
    {
        return connector.findRecord(SearchRecordType.EMPLOYEE, "is(firstName, 'John'), is(lastName, 'Doe')");
    }

    private List<Object> findMaryDoe()
    {
        return connector.findRecord(SearchRecordType.EMPLOYEE, "is(firstName, 'Mary'), is(lastName, 'Doe')");
    }

    @Test
    public void findRecordJoinedSearch() throws Exception
    {
        assertNotNull(connector.findRecord(SearchRecordType.EMPLOYEE,
            "is(email, 'john.doe@foobar.com'), is(userNotes.title, 'A note')"));
    }

    /**
     * Test that item availability queries work for existing inventory items
     */
    @Test
    public void getItemAvailability()
    {
        RecordRef inventoryItem = connector.addRecord(RecordType.INVENTORY_ITEM,
            new HashMap<String, Object>()
            {
                {
                    put("isTaxable", false);
                    put("isOnline", true);
                    put("weight", 59.10);
                    put("weightUnit", ItemWeightUnit.G);
                    put("displayName", "A thing");
                    put("storeDisplayName", "A thing");
                    put("vendorName", "A vendor");
                    put("itemId", "Item");
                }
            });
        try
        {
            assertNotNull(connector.getItemAvailabilities(RecordType.INVENTORY_ITEM,
                inventoryItem.getInternalId(), RecordIdType.INTERNAL, null));
        }
        finally
        {
            connector.deleteRecord(RecordType.INVENTORY_ITEM, inventoryItem.getInternalId(),
                RecordIdType.INTERNAL);
        }
    }

    @Test
    public void getSavedSearch()
    {
        connector.getSavedSearch(RecordType.CONTACT);
    }

    /**
     * Tests that the invitation status of a calendar event can be updated
     */
    @Test
    public void updateInviteeStatus()
    {
        RecordRef event = connector.addRecord(RecordType.CALENDAR_EVENT, new HashMap<String, Object>()
        {
            {
                put("sendMail", false);
                put("title", "An importat event");
                put("location", "Pekin");
                put("startDate", new Date());
            }
        });
        connector.updateInviteeStatus(event.getInternalId(), RecordIdType.INTERNAL,
            CalendarEventAttendeeResponse.DECLINED);
    }

    private RecordRef createEmployeeJohnDoe()
    {
        RecordRef recordRef = connector.addRecord(RecordType.EMPLOYEE, new HashMap<String, Object>()
        {
            {
                put("fax", "159-945-56");
                put("firstName", "John");
                put("lastName", "Doe");
                put("salesRep", true);
                put("email", "john.doe@foobar.com");

            }
        });
        return recordRef;
    }
    
    @Test
    public void asyncFindRecord() throws Exception
    {
        AsyncStatusResult initialStatus = connector.asyncFindRecord(SearchRecordType.EMPLOYEE,
            "is(firstName, 'John'), is(lastName, 'Doe')");
        assertNotNull(initialStatus);
        assertTrue(initialStatus.getStatus().isActive());
        AsyncStatusType status;
        do
        {
            Thread.sleep(500);
            status = connector.checkAsyncStatus(initialStatus.getJobId()).getStatus();
            System.out.println(status);
        }
        while (status.isActive());
        assertSame(AsyncStatusType.FINISHED, status);
        // TODO
//        AsyncResult result = connector.getAsyncResult(initialStatus.getJobId(), 0);
//        assertThat(result, instanceOf(AsyncSearchResult.class));
    }

    // TODO pagination
}
