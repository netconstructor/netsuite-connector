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
import org.mule.module.netsuite.api.annotation.ReturnType;
import org.mule.module.netsuite.api.internal.AttachBasicReference;
import org.mule.module.netsuite.api.internal.AttachContactReference;
import org.mule.module.netsuite.api.internal.BudgetExchangeRateFilter;
import org.mule.module.netsuite.api.internal.ConsolidatedExchangeRateFilter;
import org.mule.module.netsuite.api.internal.CustomizationType;
import org.mule.module.netsuite.api.internal.DetachBasicReference;
import org.mule.module.netsuite.api.internal.GetAllRecord;
import org.mule.module.netsuite.api.internal.GetAllRecordType;
import org.mule.module.netsuite.api.internal.GetCustomizationType;
import org.mule.module.netsuite.api.internal.GetDeletedFilter;
import org.mule.module.netsuite.api.internal.GetSavedSearchRecord;
import org.mule.module.netsuite.api.internal.ItemAvailabilityFilter;
import org.mule.module.netsuite.api.internal.NetSuitePortType;
import org.mule.module.netsuite.api.internal.RecordRef;
import org.mule.module.netsuite.api.internal.SearchRecordType;
import org.mule.module.netsuite.api.internal.UpdateInviteeStatusReference;
import org.mule.module.netsuite.api.model.entity.EntityId;
import org.mule.module.netsuite.api.model.entity.EntityReference;
import org.mule.module.netsuite.api.model.entity.EntityType;
import org.mule.module.netsuite.api.model.event.EventAttendeeStatus;

import java.rmi.RemoteException;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang.Validate;

public class AxisNetSuiteClient implements NetSuiteClient<Object, Exception>
{
    private final AxisPortProvider portProvider;

    public AxisNetSuiteClient(@NotNull AxisPortProvider portProvider)
    {
        Validate.notNull(portProvider);
        this.portProvider = portProvider;
    }

    @NetSuiteOperation
    public void attachEntity(@NotNull EntityReference sourceEntity,
                             @NotNull EntityReference destinationEntity,
                             EntityReference contactEntity) throws Exception
    {
        Validate.notNull(sourceEntity);
        Validate.notNull(destinationEntity);

        if (contactEntity == null)
        {
            getAuthenticatedPort().attach(
                new AttachBasicReference(destinationEntity.createRef(), sourceEntity.createRef()));
        }
        else
        {
            getAuthenticatedPort().attach(
                new AttachContactReference(destinationEntity.createRef(), contactEntity.createRef(),
                    sourceEntity.createRef()));
        }
    }

    @NetSuiteOperation
    public void deleteEntity(EntityReference entity) throws Exception
    {
        // TODO use customRecordRef?
        getAuthenticatedPort().delete(entity.createRef());
    }

    @NetSuiteOperation
    public void detachEntity(@NotNull EntityReference sourceEntity, @NotNull EntityReference destinationEntity)
        throws Exception
    {
        // TODO test arguments order, seems inconsistent
        getAuthenticatedPort().detach(
            new DetachBasicReference(sourceEntity.createRef(), destinationEntity.createRef()));
    }

    @NetSuiteOperation(resultName = "DeletedRecord", resultType = ReturnType.LIST)
    public Object getDeletedEntity(EntityType type, String whenExpression) throws Exception
    {
        return getAuthenticatedPort().getDeleted(new GetDeletedFilter(/* TODO */));
    }

    @NetSuiteOperation(resultName = "Record", resultType = ReturnType.RECORD)
    public Object getEntity(EntityReference entity) throws Exception
    {
        return getAuthenticatedPort().get(entity.createRef());
    }

    @NetSuiteOperation(resultName = "Record", resultType = ReturnType.RECORD)
    public Object getEntities(EntityType type) throws Exception
    {
        return getAuthenticatedPort().getAll(
            new GetAllRecord(GetAllRecordType.fromValue(type.getType().getValue())));
    }

    @NetSuiteOperation(resultName = "BudgetExchangeRate", resultType = ReturnType.LIST)
    public Object getBudgetExchangeRate(@NotNull EntityId period,
                                        @NotNull EntityId fromSubsidiary,
                                        EntityId toSubsidiary) throws Exception
    {
        Validate.notNull(period);
        Validate.notNull(fromSubsidiary);
        return getAuthenticatedPort().getBudgetExchangeRate(
            new BudgetExchangeRateFilter(createRefNullSafe(period), createRefNullSafe(fromSubsidiary),
                createRefNullSafe(toSubsidiary)));
    }

    @NetSuiteOperation(resultName = "ConsolidatedExchangeRate", resultType = ReturnType.LIST)
    public Object getConsolidatedExchangeRate(@NotNull EntityId period,
                                              @NotNull EntityId fromSubsidiary,
                                              EntityId toSubsidiary) throws Exception
    {
        return getAuthenticatedPort().getConsolidatedExchangeRate(
            new ConsolidatedExchangeRateFilter(createRefNullSafe(period), createRefNullSafe(fromSubsidiary),
                createRefNullSafe(toSubsidiary)));
    }

    @NetSuiteOperation(resultName = "CustomizationRef", resultType = ReturnType.LIST)
    public Object getCustomizationId(@NotNull EntityType type, boolean includeInactives) throws Exception
    {
        Validate.notNull(type);
        return getAuthenticatedPort().getCustomizationId(
            new CustomizationType(GetCustomizationType.fromValue(type.getType().getValue())),
            includeInactives);
    }

    @NetSuiteOperation(resultName = "ItemAvailability", resultType = ReturnType.LIST)
    public Object getItemAvailability() throws Exception
    {
        return getAuthenticatedPort().getItemAvailability(new ItemAvailabilityFilter(/* TODO */));
    }

    @NetSuiteOperation(resultName = "RecordRef", resultType = ReturnType.LIST)
    public Object getSavedSearch(@NotNull EntityType type) throws Exception
    {
        Validate.notNull(type);
        return getAuthenticatedPort().getSavedSearch(
            new GetSavedSearchRecord(SearchRecordType.fromValue(type.getType().getValue())));
    }

    @NetSuiteOperation(resultName = "ServerTime", resultType = ReturnType.RECORD)
    public Object getServerTime() throws Exception
    {
        return getAuthenticatedPort().getServerTime();
    }

    @NetSuiteOperation
    public void updateInviteeStatus(@NotNull EntityReference entity, @NotNull EventAttendeeStatus status)
        throws Exception
    {
        Validate.notNull(entity);
        Validate.notNull(status);
        getAuthenticatedPort().updateInviteeStatus(
            new UpdateInviteeStatusReference(entity.createRef(), status.getCalendarEventAttendeeResponse()));
    }

    public NetSuitePortType getAuthenticatedPort() throws RemoteException
    {
        return portProvider.getAuthenticatedPort();
    }

    private RecordRef createRefNullSafe(EntityId toSubsidiary)
    {
        return toSubsidiary != null ? toSubsidiary.createRef() : null;
    }

}
