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
    private final String email;
    private final String password;
    private final String account;
    private final String roleId;

    /**
     * Creates the port provider
     * 
     * @param address
     * @param email
     * @param password
     * @param account
     * @param roleId
     */
    public DefaultAxisPortProvider(@NotNull String address,
                                   @NotNull String email,
                                   @NotNull String password,
                                   @NotNull String account,
                                   @NotNull String roleId)
    {
        Validate.notNull(address);
        Validate.notNull(email);
        Validate.notNull(password);
        Validate.notNull(account);
        Validate.notNull(roleId);
        this.address = address;
        this.email = email;
        this.password = password;
        this.account = account;
        this.roleId = roleId;
    }

    public NetSuitePortType getPort() throws RemoteException
    {
        NetSuiteServiceLocator serviceLocator = new NetSuiteServiceLocator();
        serviceLocator.setNetSuitePortEndpointAddress(address);
        serviceLocator.setMaintainSession(true);
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
        
        port.login(new Passport(email, password, account, new RecordRef(null, roleId, null, null)));
        return port;
    }

}
