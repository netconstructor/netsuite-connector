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
     * Creates the resources necessary for the rest of the tests
     */
    public void setup() throws Exception
    {
        lookupFlowConstruct("CreateEmployeePhoneUpdatesFlow").process(getTestEvent(""));
        lookupFlowConstruct("CreateS3BucketFlow").process(getTestEvent(""));
        lookupFlowConstruct("UploadS3ImageFlow").process(getTestEvent(""));
        lookupFlowConstruct("CreateEmployeesFlow").process(getTestEvent(""));
        lookupFlowConstruct("CreateAttachmentsFolderFlow").process(getTestEvent(""));
    }
    

    private SimpleFlowConstruct lookupFlowConstruct(final String name)
    {
        return (SimpleFlowConstruct) muleContext.getRegistry().lookupFlowConstruct(name);
    }
}
