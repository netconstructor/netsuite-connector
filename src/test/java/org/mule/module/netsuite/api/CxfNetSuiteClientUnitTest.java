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

import com.netsuite.webservices.platform.core_2010_2.types.RecordType;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class CxfNetSuiteClientUnitTest
{
    private CxfNetSuiteClient client;
    private CxfPortProvider portProvider;

    @Before
    public void setup()
    {
        portProvider = mock(CxfPortProvider.class);
        client = new CxfNetSuiteClient(portProvider);
    }

    @Test
    public void testAdd() throws Exception
    {
        client.addRecord(RecordType.ACCOUNT, new HashMap<String, Object>()
        {
            {
                put("acctNumber", "986");
                put("acctNumber", "9");
                put("description", "lalla");
                put("description", "lalla");
                put("curDocNum", "56");
                put("isInactive", "true");
            }
        });
    }
}
