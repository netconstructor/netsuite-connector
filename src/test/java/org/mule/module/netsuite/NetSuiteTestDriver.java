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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.cxf.service.factory.FactoryBeanListener.Event;
import org.junit.Before;
import org.junit.Test;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.module.netsuite.api.util.XmlGregorianCalendarFactory;

import com.netsuite.webservices.activities.scheduling_2010_2.CalendarEvent;
import com.netsuite.webservices.activities.scheduling_2010_2.CalendarEventAttendeeList;
import com.netsuite.webservices.activities.scheduling_2010_2.CalendarEventResourceList;
import com.netsuite.webservices.activities.scheduling_2010_2.ExclusionDateList;
import com.netsuite.webservices.activities.scheduling_2010_2.RecurrenceDowMaskList;
import com.netsuite.webservices.activities.scheduling_2010_2.types.CalendarEventAccessLevel;
import com.netsuite.webservices.activities.scheduling_2010_2.types.CalendarEventDow;
import com.netsuite.webservices.activities.scheduling_2010_2.types.CalendarEventDowim;
import com.netsuite.webservices.activities.scheduling_2010_2.types.CalendarEventFrequency;
import com.netsuite.webservices.activities.scheduling_2010_2.types.CalendarEventReminderType;
import com.netsuite.webservices.activities.scheduling_2010_2.types.CalendarEventStatus;
import com.netsuite.webservices.lists.employees_2010_2.Employee;
import com.netsuite.webservices.platform.core_2010_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2010_2.RecordRef;
import com.netsuite.webservices.platform.core_2010_2.types.CalendarEventAttendeeResponse;
import com.netsuite.webservices.platform.core_2010_2.types.RecordType;

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
        //TODO file attachements?
        RecordRef employee = null, campaign = null;
        try
        {
            employee = connector.addRecord(RecordType.EMPLOYEE, new HashMap<String, Object>()
            {
                {
                    put("firstName", "John");
                    put("lastName", "Doe");
                }
            });
            campaign = connector.addRecord(RecordType.CONTACT, new HashMap<String, Object>()
            {
                {
                    put("title", "The Campaignola");

                }
            });
            connector.attachRecord(RecordType.EMPLOYEE, employee.getInternalId(), RecordIdType.INTERNAL,
                RecordType.CAMPAIGN, campaign.getInternalId(), RecordIdType.INTERNAL, null, null, null);
            connector.detachRecord(RecordType.EMPLOYEE, employee.getInternalId(), RecordIdType.INTERNAL,
                RecordType.CAMPAIGN, campaign.getInternalId(), RecordIdType.INTERNAL);
        }
        finally
        {
            if (employee != null)
            {
                connector.deleteRecord(RecordType.EMPLOYEE, employee.getInternalId(), RecordIdType.INTERNAL);
            }
            if (campaign != null)
            {
                connector.deleteRecord(RecordType.CAMPAIGN, campaign.getInternalId(), RecordIdType.INTERNAL);
            }
        }
    }
    /**
     * Test that a record can be created and updated, and that the modification are persistent 
     */
    @Test
    public void updateRecord() throws Exception
    {

        RecordRef recordRef = connector.addRecord(RecordType.EMPLOYEE, new HashMap<String, Object>()
        {
            {
                put("fax", "159-945-56");
                put("firstName", "John");
                put("lastName", "Doe");
            }
        });
        try
        {
            connector.updateRecord(RecordType.EMPLOYEE, recordRef.getInternalId(), RecordIdType.INTERNAL,
                new HashMap<String, Object>()
                {
                    {
                        put("fax", "159-945-57");
                    }
                });
            Employee record = (Employee) connector.getRecord(RecordType.EMPLOYEE, recordRef.getInternalId(), RecordIdType.INTERNAL);
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
        List<Object> budgetExchangeRate = connector.getBudgetExchangeRate("10", RecordIdType.INTERNAL, "65",
            RecordIdType.INTERNAL, null, null);
        assertNotNull(budgetExchangeRate);
    }

    @Test
    public void getConsolidatedExchangeRate()
    {
        List<Object> consolidatedExchangeRate = connector.getConsolidatedExchangeRate("10",
            RecordIdType.INTERNAL, "65", RecordIdType.INTERNAL, null, null);
        assertNotNull(consolidatedExchangeRate);
        // TODO
    }

    public void getCustomizationId()
    {
        List<Object> customizations = connector.getCustomizationId(RecordType.CALENDAR_EVENT, false);
        assertNotNull(customizations);
        // TODO test more in depth
    }

    @Test
    public void getDeletedEntity()
    {
        // TODO perhaps it would be also a good ide to expose a more object oriented
        // instead of string oriented date query
        Date serverTime = connector.GetServerTime();
        RecordRef recordRef = connector.addRecord(RecordType.EMPLOYEE, new HashMap<String, Object>()
        {
            {
                put("fax", "159-945-56");
                put("firstName", "John");
                put("lastName", "Doe");
            }
        });
        connector.deleteRecord(RecordType.EMPLOYEE, recordRef.getInternalId(), RecordIdType.INTERNAL);
        connector.getDeletedRecord(RecordType.EMPLOYEE, // 
            "after(dateTime('" + new SimpleDateFormat("HH:mm:ss").format(serverTime) + "','HH:mm:ss'))");
    }

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
    
    @Test
    public void findRecord() throws Exception
    {
        assertNotNull(connector.findRecord(RecordType.CUSTOMER,
                "isTrue(giveAccess), is(email, 'john.doe@foobar.com')"));
    }
    
    @Test
    public void getItemAvailability()
    {
        assertNotNull(connector.getItemAvailability(RecordType.JOB, "150", RecordIdType.INTERNAL, null));
    }

    @Test
    public void getSavedSearch()
    {
        connector.getSavedSearch(RecordType.CONTACT);
    }

    @Test
    public void updateInviteeStatus()
    {
        RecordRef event = connector.addRecord(RecordType.CALENDAR_EVENT, new HashMap<String, Object>()
        {
            {
                put("sendMail", false);
                put("title", "An importat event");
                put("location", "Pekin");
                //TODO date to xmlCalendar conversion 
                put("location", XmlGregorianCalendarFactory.newInstance().toXmlCalendar(new Date()));
            }
        });
        connector.updateInviteeStatus(event.getInternalId(), RecordIdType.INTERNAL,
            CalendarEventAttendeeResponse.DECLINED);
    }

}
