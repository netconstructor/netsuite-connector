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

import org.mule.module.netsuite.api.model.entity.EntityId;
import org.mule.module.netsuite.api.model.entity.EntityReference;
import org.mule.module.netsuite.api.model.entity.EntityType;
import org.mule.module.netsuite.api.model.event.EventAttendeeStatus;

import javax.validation.constraints.NotNull;

/**
 * A NetSuite facade
 * 
 * @author flbulgarelli
 */
public interface NetSuiteClient<CollectionType, ExceptionType extends Exception>
{
    Object getEntity(@NotNull EntityReference sourceEntity) throws ExceptionType;

    @NotNull
    CollectionType getDeletedEntity(@NotNull EntityType type, @NotNull String whenExpression)
        throws ExceptionType;

    void attachEntity(@NotNull EntityReference sourceEntity,
                      @NotNull EntityReference destinationEntity,
                      EntityReference contactEntity) throws ExceptionType;

    void detachEntity(@NotNull EntityReference sourceEntity, @NotNull EntityReference destinationEntity)
        throws ExceptionType;

    void deleteEntity(@NotNull EntityReference entity) throws ExceptionType;

    @NotNull
    CollectionType getEntities(@NotNull EntityType type) throws ExceptionType;

    Object getServerTime() throws ExceptionType;

    void updateInviteeStatus(@NotNull EntityReference entity, @NotNull EventAttendeeStatus status)
        throws ExceptionType;

    CollectionType getCustomizationId(@NotNull EntityType type, boolean includeInactives)
        throws ExceptionType;

    CollectionType getItemAvailability() throws ExceptionType;

    CollectionType getBudgetExchangeRate(@NotNull EntityId period,
                                         @NotNull EntityId fromSubsidiary,
                                         EntityId toSubsidiary) throws ExceptionType;

    CollectionType getConsolidatedExchangeRate(@NotNull EntityId period,
                                               @NotNull EntityId fromSubsidiary,
                                               EntityId toSubsidiary) throws ExceptionType;

    CollectionType getSavedSearch(@NotNull EntityType type) throws ExceptionType;

}
