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

import org.mule.module.netsuite.api.internal.NetSuitePortType;
import org.mule.module.netsuite.api.internal.NetSuiteServiceLocator;
import org.mule.module.netsuite.api.internal.Passport;
import org.mule.module.netsuite.api.internal.RecordRef;

import java.rmi.RemoteException;

import javax.validation.constraints.NotNull;
import javax.xml.rpc.ServiceException;

import org.apache.commons.lang.Validate;

public class DefaultAxisPortProvider implements AxisPortProvider
{
    private final String address;

    /**
     * Creates the port provider
     * 
     * @param address
     */
    public DefaultAxisPortProvider(@NotNull String address)
    {
        Validate.notNull(address);
        this.address = address;
    }

    public NetSuitePortType getPort() throws RemoteException
    {
        NetSuiteServiceLocator serviceLocator = new NetSuiteServiceLocator();
        serviceLocator.setNetSuitePortEndpointAddress(address);
        try
        {
            return serviceLocator.getNetSuitePort();
        }
        catch (ServiceException e)
        {
            throw new RemoteException("A Service exception occured while trying to create the port", e);
        }
    }
    
    public NetSuitePortType getAuthenticatedPort() throws RemoteException
    {
        NetSuitePortType port = getPort();
        port.login(/*TODO new Passport(email, password, account, )*/ new Passport());
        return port;
    }

}
