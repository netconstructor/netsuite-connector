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

public class NetSuiteGenericException extends RuntimeException
{
    private static final long serialVersionUID = -7402816091328386196L;

    public NetSuiteGenericException(Throwable cause)
    {
        super(cause);
    }

    public NetSuiteGenericException(String message)
    {
        super(message);
    }

    public static RuntimeException soften(Exception e)
    {
        if (!(e instanceof RuntimeException))
        {
            return new NetSuiteGenericException(e);
        }
        return (RuntimeException) e;
    }

}
