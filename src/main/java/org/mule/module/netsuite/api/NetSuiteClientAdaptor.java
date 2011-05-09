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

import org.mule.module.netsuite.NetSuiteCloudConnector;
import org.mule.module.netsuite.api.annotation.NetSuiteOperation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;

public final class NetSuiteClientAdaptor
{
    private static final Object LOCK = new Object();
    private static final Logger log = LoggerFactory.getLogger(NetSuiteCloudConnector.class);

    private NetSuiteClientAdaptor()
    {
    }

    @SuppressWarnings("unchecked")
    public static NetSuiteClient<List<Object>, RuntimeException, Void> adapt(final NetSuiteClient<?, ?, ?> client)
    {
        return (NetSuiteClient<List<Object>, RuntimeException, Void>) Proxy.newProxyInstance(
            NetSuiteClientAdaptor.class.getClassLoader(), new Class[]{SoapNetSuiteClient.class},
            new InvocationHandler()
            {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
                {
                    if (log.isDebugEnabled())
                    {
                        log.debug("Entering into {} with args {}", method.getName(), args);
                    }
                    try
                    {
                        Object ret = handle(method, args);
                        if (log.isDebugEnabled())
                        {
                            log.debug("Returning from {} with value {}", method.getName(), ret);
                        }
                        return ret;
                    }
                    catch (Throwable e)
                    {
                        log.warn("Throwing {} at {}", e, method.getName());
                        throw e;
                    }
                }

                private Object handle(Method method, Object[] args) throws Throwable
                {
                    NetSuiteOperation operationMetadata = AnnotationUtils.findAnnotation(method,
                        NetSuiteOperation.class);
                    if (operationMetadata == null)
                    {
                        return invokeMethod(method, client, args);
                    }
                    try
                    {
                        synchronized (LOCK)
                        {
                            return adaptReturnType(invokeMethod(method, client, args), operationMetadata);
                        }
                    }
                    catch (Throwable e)
                    {
                        throw NetSuiteGenericException.soften(e);
                    }
                }
            });
    }

    private static Object invokeMethod(Method m, Object obj, Object... args) throws Throwable
    {
        try
        {
            return m.invoke(obj, args);
        }
        catch (InvocationTargetException e)
        {
            throw e.getCause();
        }
    }

    private static Object adaptReturnType(Object returnValue, NetSuiteOperation operationMetadata)
        throws Throwable
    {
        if (!operationMetadata.adapt())
        {
            return returnValue;
        }
        return operationMetadata.resultType().adapt(returnValue, operationMetadata.responseName(),
            operationMetadata.resultName());
    }

    // TODO retry
    // private static abstract class RetryingInterceptor implements Interceptor
    // {
    // public Object intercept(Object target, Block block, Object[] args) throws
    // Throwable
    // {
    // do
    // {
    // try
    // {
    // return block.proceed(target, args);
    // }
    // catch (Throwable ex)
    // {
    // if (!isRetryError(ex))
    // {
    // throw ex;
    // }
    // }
    // }
    // while (true);
    // }
    //
    // protected abstract boolean isRetryError(Throwable ex);
    // }

}
