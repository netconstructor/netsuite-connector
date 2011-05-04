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

import org.mule.module.netsuite.api.annotation.NetSuiteOperation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

import org.springframework.core.annotation.AnnotationUtils;

public final class NetSuiteClientAdaptor
{
    private static final Object LOCK = new Object();

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
                    NetSuiteOperation operationMetadata = AnnotationUtils.findAnnotation(method,
                        NetSuiteOperation.class);
                    if (operationMetadata == null)
                    {
                        return method.invoke(client, args);
                    }
                    try
                    {
                        synchronized (LOCK)
                        {
                            return adaptReturnType(method.invoke(client, args), operationMetadata);
                        }
                    }
                    catch (Exception e)
                    {
                        throw soften(e);
                    }
                }
            });
    }

    private static Exception soften(Exception e)
    {
        if (!(e instanceof RuntimeException))
        {
            return new NetSuiteGenericException(e);
        }
        return e;
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
