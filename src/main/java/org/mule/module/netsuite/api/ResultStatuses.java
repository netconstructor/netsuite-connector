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

import com.netsuite.webservices.platform.core_2010_2.Status;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.builder.ToStringBuilder;

public final class ResultStatuses
{
    private ResultStatuses()
    {
    }

    public static <T> T checkStatus(T result)
    {
        Status status;
        try
        {
            status = (Status) PropertyUtils.getProperty(result, "status");
        }
        catch (Exception e)
        {
            throw new IllegalArgumentException("Result " + result.getClass() + " has no status property");
        }
        if (status.isIsSuccess())
        {
            return result;
        }
        throw new NetSuiteGenericException("Request failed. Details: " + getStatusDetails(status));
    }

    private static String getStatusDetails(Status status)
    {
        if (status.getStatusDetail().isEmpty())
        {
            return "<no details>";
        }
        return ToStringBuilder.reflectionToString(status.getStatusDetail().get(0));
    }
}
