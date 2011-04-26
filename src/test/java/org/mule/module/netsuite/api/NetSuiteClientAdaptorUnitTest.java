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

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;
import org.mule.module.netsuite.api.internal.GetServerTimeResult;
import org.mule.module.netsuite.api.internal.Status;
import org.mule.module.netsuite.api.internal.StatusDetail;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class NetSuiteClientAdaptorUnitTest
{
    private NetSuiteClient<Object, Exception> mock;
    private NetSuiteClient<List<Object>, RuntimeException> client;

    @SuppressWarnings("unchecked")
    @Before
    public void setup()
    {
        mock = mock(NetSuiteClient.class);
        client = NetSuiteClientAdaptor.adapt(mock);
    }

    @Test
    public void testAdaptReturnType() throws Exception
    {
        Calendar calendar = new GregorianCalendar();
        when(mock.getServerTime()).thenReturn(
            new GetServerTimeResult(new Status(new StatusDetail[0], true), calendar));

        assertSame(calendar, client.getServerTime());
    }

    @Test(expected = NetSuiteGenericException.class)
    public void testAdaptReturnTypeIsError() throws Exception
    {
        Calendar calendar = new GregorianCalendar();
        when(mock.getServerTime()).thenReturn(
            new GetServerTimeResult(new Status(new StatusDetail[0], false), calendar));
        client.getServerTime();
    }

}
