/**
 * Mule S3 Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite.api;

import java.lang.reflect.Method;

public class NetSuiteAdaptor
{
    // TODO soft exception interceptor
    
    //TODO composite interceptor

    private static class RetryingInterceptor implements Interceptor
    {
        public Object invoke(Object proxy, Object target, Method method, Object[] args) throws Throwable
        {
            do
            {
                try
                {
                    return method.invoke(target, args);
                }
                catch (Exception ex)
                {
                    if (!isRetryError(ex))
                    {
                        throw ex;
                    }
                }
            }
            while (true);
        }

        private boolean isRetryError(Exception ex)
        {// TODO
            return false;
        }
    }

    private static class SynchronizingInterceptor implements Interceptor
    {
        private static final Object LOCK = new Object();

        public Object invoke(Object proxy, Object target, Method method, Object[] args) throws Throwable
        {
            synchronized (LOCK)
            {
                return method.invoke(target, args);
            }
        }
    }

    private interface Interceptor
    {
        Object invoke(Object proxy, Object target, Method method, Object[] args) throws Throwable;
    }

}
