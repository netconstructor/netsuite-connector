/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite.api;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.netsuite.webservices.platform.core_2010_2.GetServerTimeResult;
import com.netsuite.webservices.platform.core_2010_2.Status;
import com.netsuite.webservices.platform.core_2010_2.StatusDetail;
import com.netsuite.webservices.platform.messages_2010_2.GetServerTimeResponse;

import java.util.Collections;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Before;
import org.junit.Test;

public class NetSuiteClientAdaptorUnitTest
{
    private NetSuiteClient<Object, Exception, Object> mock;
    private NetSuiteClient<List<Object>, RuntimeException, Void> client;

    @Before
    public void setup()
    {
        mock = mock(SoapNetSuiteClient.class);
        client = NetSuiteClientAdaptor.adapt(mock);
    }

    @Test
    public void testAdaptReturnType() throws Exception
    {
        XMLGregorianCalendar calendar = newCalendar();
        when(mock.getServerTime()).thenReturn(
            new GetServerTimeResponse(new GetServerTimeResult(new Status(
                Collections.<StatusDetail> emptyList(), true), calendar)));

        assertSame(calendar, client.getServerTime());
    }

    @Test(expected = NetSuiteGenericException.class)
    public void testAdaptReturnTypeIsError() throws Exception
    {
        XMLGregorianCalendar calendar = newCalendar();
        when(mock.getServerTime()).thenReturn(
            new GetServerTimeResponse(new GetServerTimeResult(new Status(
                Collections.<StatusDetail> emptyList(), false), calendar)));
        client.getServerTime();
    }

    private XMLGregorianCalendar newCalendar() throws DatatypeConfigurationException
    {
        return DatatypeFactory.newInstance().newXMLGregorianCalendar();
    }

}
