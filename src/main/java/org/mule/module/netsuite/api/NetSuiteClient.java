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

import com.netsuite.webservices.platform.core_2010_2.types.CalendarEventAttendeeResponse;
import com.netsuite.webservices.platform.core_2010_2.types.RecordType;
import com.netsuite.webservices.platform.messages_2010_2.AddRequest;
import com.netsuite.webservices.platform.messages_2010_2.UpdateRequest;

import java.util.Map;

import javax.validation.constraints.NotNull;

/**
 * A NetSuite facade
 * 
 * @author flbulgarelli
 */
public interface NetSuiteClient<CollectionType, ExceptionType extends Exception, VoidType>
{
    void find() throws ExceptionType;

    VoidType update(RecordType recordType, Map<String, Object> recordAttributes) throws Exception;

    VoidType add(RecordType recordType, Map<String, Object> recordAttributes) throws Exception;

    Object getEntity(@NotNull EntityReference sourceEntity) throws ExceptionType;

    @NotNull
    CollectionType getDeletedEntity(@NotNull RecordType type, @NotNull String whenExpression)
        throws ExceptionType;

    VoidType attachEntity(@NotNull EntityReference sourceEntity,
                          @NotNull EntityReference destinationEntity,
                          EntityReference contactEntity) throws ExceptionType;

    VoidType detachEntity(@NotNull EntityReference sourceEntity, @NotNull EntityReference destinationEntity)
        throws ExceptionType;

    VoidType deleteEntity(@NotNull EntityReference entity) throws ExceptionType;

    @NotNull
    CollectionType getEntities(@NotNull RecordType type) throws ExceptionType;

    Object getServerTime() throws ExceptionType;

    VoidType updateInviteeStatus(@NotNull EntityReference entity,
                                 @NotNull CalendarEventAttendeeResponse status) throws ExceptionType;

    CollectionType getCustomizationId(@NotNull RecordType type, boolean includeInactives)
        throws ExceptionType;

    CollectionType getItemAvailability() throws ExceptionType;

    CollectionType getBudgetExchangeRate(@NotNull EntityId period,
                                         @NotNull EntityId fromSubsidiary,
                                         EntityId toSubsidiary) throws ExceptionType;

    CollectionType getConsolidatedExchangeRate(@NotNull EntityId period,
                                               @NotNull EntityId fromSubsidiary,
                                               EntityId toSubsidiary) throws ExceptionType;

    CollectionType getSavedSearch(@NotNull RecordType type) throws ExceptionType;

    Object checkAsyncStatus(@NotNull String jobId) throws ExceptionType;

    Object getAsyncResult(@NotNull String jobId, int pageIndex) throws ExceptionType;

    // TODO
    Object initialize() throws ExceptionType;

    // TODO
    Object initializeList() throws ExceptionType;

}
