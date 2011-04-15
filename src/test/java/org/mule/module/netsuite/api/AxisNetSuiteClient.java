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

import org.mule.module.netsuite.api.entity.EntityReference;
import org.mule.module.netsuite.api.entity.EntityType;
import org.mule.module.netsuite.api.internal.AttachBasicReference;
import org.mule.module.netsuite.api.internal.AttachContactReference;
import org.mule.module.netsuite.api.internal.DetachBasicReference;
import org.mule.module.netsuite.api.internal.GetAllRecord;
import org.mule.module.netsuite.api.internal.GetAllRecordType;
import org.mule.module.netsuite.api.internal.NetSuitePortType;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang.Validate;

public class AxisNetSuiteClient implements NetSuiteClient<Exception>
{
    private final AxisPortProvider portProvider;

    // TODO read and write responses may return false error responses - see .isSucced

    public AxisNetSuiteClient(@NotNull AxisPortProvider portProvider)
    {
        Validate.notNull(portProvider);
        this.portProvider = portProvider;
    }

    public void attachEntity(@NotNull EntityReference sourceEntity,
                             @NotNull EntityReference destinationEntity,
                             EntityReference contactEntity) throws Exception
    {
        Validate.notNull(sourceEntity);
        Validate.notNull(destinationEntity);

        if (contactEntity == null)
        {
            getAuthenticatedPort().attach(
                new AttachBasicReference(destinationEntity.createRecordRef(), sourceEntity.createRecordRef()));
        }
        else
        {
            getAuthenticatedPort().attach(
                new AttachContactReference(destinationEntity.createRecordRef(),
                    contactEntity.createRecordRef(), sourceEntity.createRecordRef()));
        }
    }

    public void deleteEntity(EntityReference entity) throws Exception
    {
        // TODO use customRecordRef?
        getAuthenticatedPort().delete(entity.createRecordRef());
    }

    public void detachEntity(@NotNull EntityReference sourceEntity, @NotNull EntityReference destinationEntity)
        throws Exception
    {
        // TODO test arguments order, seems inconsistent
        getAuthenticatedPort().detach(
            new DetachBasicReference(sourceEntity.createRecordRef(), destinationEntity.createRecordRef()));
    }

    public List<Object> getDeletedEntity(EntityType type, String whenExpression) throws Exception
    {
        // TODO Auto-generated method stub
        return null;
    }

    public Object getEntity(EntityReference entity) throws Exception
    {
        return getAuthenticatedPort().get(entity.createRecordRef()).getRecord();
    }

    public List<Object> listEntities(EntityType type) throws Exception
    {
        return Arrays.asList((Object[]) getAuthenticatedPort().getAll(
            new GetAllRecord(GetAllRecordType.fromValue(type.getType().getValue())))
            .getRecordList()
            .getRecord());
    }

    public NetSuitePortType getAuthenticatedPort() throws RemoteException
    {
        return portProvider.getAuthenticatedPort();
    }

}
