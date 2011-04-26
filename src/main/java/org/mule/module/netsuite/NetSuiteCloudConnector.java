/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

/**
 * This file was automatically generated by the Mule Cloud Connector Development Kit
 */

package org.mule.module.netsuite;

import static org.mule.module.netsuite.EntityReferences.from;
import static org.mule.module.netsuite.EntityReferences.nulSafeFrom;

import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.module.netsuite.api.AxisNetSuiteClient;
import org.mule.module.netsuite.api.DefaultAxisPortProvider;
import org.mule.module.netsuite.api.NetSuiteClient;
import org.mule.module.netsuite.api.NetSuiteClientAdaptor;
import org.mule.module.netsuite.api.model.entity.EntityType;
import org.mule.module.netsuite.api.model.event.EventAttendeeStatus;
import org.mule.tools.cloudconnect.annotations.Connector;
import org.mule.tools.cloudconnect.annotations.Operation;
import org.mule.tools.cloudconnect.annotations.Parameter;
import org.mule.tools.cloudconnect.annotations.Property;

import java.util.List;

@Connector(namespacePrefix = "netsuite", namespaceUri = "http://www.mulesoft.org/schema/mule/netsuite")
public class NetSuiteCloudConnector implements Initialisable
{
    @Property(name = "client-ref", optional = true)
    private NetSuiteClient<List<Object>, RuntimeException> client;
    @Property
    private String address;
    @Property
    private String email;
    @Property
    private String password;
    @Property
    private String account;
    @Property
    private String roleId;

    @Operation
    public void attachEntity(@Parameter(optional = false) EntityType sourceEntityType,
                             @Parameter(optional = true) String sourceInternalId,
                             @Parameter(optional = true) String sourceExternalId,
                             @Parameter(optional = false) EntityType destinationEntityType,
                             @Parameter(optional = true) String destinationInternalId,
                             @Parameter(optional = true) String destinationExternalId,
                             @Parameter(optional = true) EntityType contanctEntityType,
                             @Parameter(optional = true) String contanctInternalId,
                             @Parameter(optional = true) String contanctExternalId)
    {
        client.attachEntity( //
            from(sourceEntityType, sourceInternalId, sourceExternalId), //
            from(destinationEntityType, destinationInternalId, destinationExternalId), // 
            nulSafeFrom(contanctEntityType, contanctInternalId, contanctExternalId));
    }

    @Operation
    public void deleteEntity(@Parameter EntityType entityType,
                             @Parameter(optional = true) String internalId,
                             @Parameter(optional = true) String externalId)
    {
        client.deleteEntity(from(entityType, internalId, externalId));
    }

    @Operation
    public void detachEntity(@Parameter EntityType sourceEntityType,
                             @Parameter(optional = true) String sourceInternalId,
                             @Parameter(optional = true) String sourceExternalId,
                             @Parameter EntityType destinationEntityType,
                             @Parameter(optional = true) String destinationInternalId,
                             @Parameter(optional = true) String destinationExternalId)
    {
        client.detachEntity(//
            from(sourceEntityType, sourceInternalId, sourceExternalId),// 
            from(destinationEntityType, destinationInternalId, destinationExternalId));
    }

    @Operation
    public List<Object> getBudgetExchangeRate(@Parameter(optional = true) String periodInternalId,
                                              @Parameter(optional = true) String periodExternalId,
                                              @Parameter(optional = true) String fromSubsidiaryInternalId,
                                              @Parameter(optional = true) String fromSubsidiaryExternalId,
                                              @Parameter(optional = true) String toSubsidiaryInternalId,
                                              @Parameter(optional = true) String toSubsidiaryExternalId)
    {
        return client.getBudgetExchangeRate(//
            EntityIds.from(periodInternalId, periodExternalId), // 
            EntityIds.from(fromSubsidiaryInternalId, fromSubsidiaryExternalId), //
            EntityIds.nullSafeFrom(toSubsidiaryInternalId, toSubsidiaryExternalId));
    }

    @Operation
    public List<Object> getConsolidatedExchangeRate(@Parameter(optional = true) String periodInternalId,
                                                    @Parameter(optional = true) String periodExternalId,
                                                    @Parameter(optional = true) String fromSubsidiaryInternalId,
                                                    @Parameter(optional = true) String fromSubsidiaryExternalId,
                                                    @Parameter(optional = true) String toSubsidiaryInternalId,
                                                    @Parameter(optional = true) String toSubsidiaryExternalId)
    {
        return client.getConsolidatedExchangeRate(//
            EntityIds.from(periodInternalId, periodExternalId), // 
            EntityIds.from(fromSubsidiaryInternalId, fromSubsidiaryExternalId), //
            EntityIds.nullSafeFrom(toSubsidiaryInternalId, toSubsidiaryExternalId));
    }

    @Operation
    public List<Object> getCustomizationId(@Parameter EntityType type,
                                           @Parameter(optional = true, defaultValue = "false") boolean includeInactives)
    {
        return client.getCustomizationId(type, includeInactives);
    }

    @Operation
    public List<Object> getDeletedEntity(@Parameter EntityType type, @Parameter String whenExpression)
    {
        return client.getDeletedEntity(type, whenExpression);
    }

    @Operation
    public List<Object> getEntities(@Parameter EntityType type)
    {
        return client.getEntities(type);
    }

    @Operation
    public Object getEntity(@Parameter EntityType entityType,
                            @Parameter(optional = true) String internalId,
                            @Parameter(optional = true) String externalId)
    {
        return client.getEntity(from(entityType, internalId, externalId));
    }

    @Operation
    public List<Object> GetItemAvailability()
    {
        return client.getItemAvailability();
    }

    @Operation
    public List<Object> getSavedSearch(@Parameter EntityType type)
    {
        return client.getSavedSearch(type);
    }

    @Operation
    public Object GetServerTime()
    {
        return client.getServerTime();
    }

    @Operation
    public void updateInviteeStatus(@Parameter EntityType entityType,
                                    @Parameter(optional = true) String internalId,
                                    @Parameter(optional = true) String externalId,
                                    @Parameter EventAttendeeStatus status)
    {
        client.updateInviteeStatus(from(entityType, internalId, externalId), status);
    }

    public void initialise() throws InitialisationException
    {
        if (client == null)
        {
            setClient(new AxisNetSuiteClient(new DefaultAxisPortProvider(address, email, password, account,
                roleId)));
        }
    }

    public NetSuiteClient<List<Object>, RuntimeException> getClient()
    {
        return client;
    }

    public void setClient(NetSuiteClient<?, ?> client)
    {
        this.client = NetSuiteClientAdaptor.adapt(client);
    }

    public String getAddress()
    {
        return address;
    }

    public String getRoleId()
    {
        return roleId;
    }

    public void setRoleId(String roleId)
    {
        this.roleId = roleId;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getAccount()
    {
        return account;
    }

    public void setAccount(String account)
    {
        this.account = account;
    }

}
