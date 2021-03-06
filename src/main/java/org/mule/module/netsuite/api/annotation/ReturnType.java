/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite.api.annotation;

import static org.apache.commons.beanutils.MethodUtils.invokeExactMethod;

import org.mule.module.netsuite.api.NetSuiteGenericException;
import org.mule.module.netsuite.api.ResultStatuses;

import com.netsuite.webservices.platform.core_2010_2.Status;
import com.netsuite.webservices.platform.core_2010_2.StatusDetail;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

public enum ReturnType
{

    VOID
    {
        @Override
        public Object adaptImpl(Object result, String recordName) throws Throwable
        {
            return null;
        }
    },
    RECORD
    {
        @Override
        public Object adaptImpl(Object result, String recordName) throws Throwable
        {
            return invokeExactMethod(result, "get" + recordName, EMPTY_ARRAY);
        }
    },
    LIST
    {
        @SuppressWarnings("unchecked")
        @Override
        public List<Object> adaptImpl(Object result, String recordName) throws Throwable
        {
            return (List<Object>) invokeExactMethod(invokeExactMethod(result, "get" + recordName + "List",
                EMPTY_ARRAY), "get" + recordName, EMPTY_ARRAY);
        }

    };

    private static final Object[] EMPTY_ARRAY = new Object[0];

    protected abstract Object adaptImpl(Object returnValue, String recordName) throws Throwable;

    public Object adapt(Object returnValue, String responseName, String resultName) throws Throwable
    {
        Object result = invokeExactMethod(returnValue, "get" + responseName, EMPTY_ARRAY);
        ResultStatuses.checkStatus(result);
        return adaptImpl(result, resultName);
    }

}
