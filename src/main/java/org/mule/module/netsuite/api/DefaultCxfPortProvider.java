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

import com.netsuite.webservices.platform.core_2010_2.Passport;
import com.netsuite.webservices.platform.core_2010_2.RecordRef;
import com.netsuite.webservices.platform.messages_2010_2.LoginRequest;
import com.netsuite.webservices.platform_2010_2.NetSuitePortType;

import java.rmi.RemoteException;

import javax.validation.constraints.NotNull;
import javax.xml.ws.BindingProvider;

import org.apache.commons.lang.Validate;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class DefaultCxfPortProvider implements CxfPortProvider
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
    public DefaultCxfPortProvider(@NotNull String address,
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

    private JaxWsProxyFactoryBean getProxyFactory(final Class clazz, final String address)
    {
        final JaxWsProxyFactoryBean ret = new JaxWsProxyFactoryBean();
        ret.getInInterceptors().add(new LoggingInInterceptor());
        ret.getOutInterceptors().add(new LoggingOutInterceptor());
        ret.setServiceClass(clazz);
        ret.setAddress(address);
        return ret;
    }

    public NetSuitePortType getPort() throws RemoteException
    {
        final JaxWsProxyFactoryBean factory = getProxyFactory(NetSuitePortType.class, address);

        return (NetSuitePortType) factory.create();
    }

    public NetSuitePortType getAuthenticatedPort() throws RemoteException, Exception
    {
        NetSuitePortType port = getPort();
        ((BindingProvider) port).getRequestContext().put(BindingProvider.SESSION_MAINTAIN_PROPERTY, true);
        port.login(new LoginRequest(new Passport(email, password, account, new RecordRef(null, roleId, null))));
        return port;
    }

}
