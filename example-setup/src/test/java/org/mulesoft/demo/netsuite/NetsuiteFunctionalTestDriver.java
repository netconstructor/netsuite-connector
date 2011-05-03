/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mulesoft.demo.netsuite;

import org.mule.construct.SimpleFlowConstruct;
import org.mule.tck.FunctionalTestCase;

import java.util.Collections;

public class NetsuiteFunctionalTestDriver extends FunctionalTestCase
{

    @Override
    protected String getConfigResources()
    {
        return "mule-config.xml";
    }

    /**
     * Creates some employees for this test. Run this test only once
     */
    public void testCreateProductsFlow() throws Exception
    {
        lookupFlowConstruct("CreateRecordsFlow").process(getTestEvent(""));
    }
    
    /**
     * Creates some employees updates for this test. Run this test only 
     * once
     */
    public void testSetupFlow() throws Exception
    {
        lookupFlowConstruct("CreateRecordUpdatesFlow").process(getTestEvent(""));
    }

    private SimpleFlowConstruct lookupFlowConstruct(final String name)
    {
        return (SimpleFlowConstruct) muleContext.getRegistry().lookupFlowConstruct(name);
    }

}
