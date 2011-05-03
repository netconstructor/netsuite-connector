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

import org.mule.module.netsuite.api.model.entity.RecordId;
import org.mule.module.netsuite.api.model.entity.RecordReference;

import com.netsuite.webservices.platform.core_2010_2.types.CalendarEventAttendeeResponse;
import com.netsuite.webservices.platform.core_2010_2.types.RecordType;

import java.util.Date;
import java.util.Map;

import javax.validation.constraints.NotNull;

/**
 * A NetSuite facade
 * 
 * @author flbulgarelli
 */
public interface NetSuiteClient<CollectionType, ExceptionType extends Exception, VoidType>
{
    CollectionType findRecord(@NotNull RecordType recordType, @NotNull String expression)
        throws ExceptionType;

    VoidType updateRecord(@NotNull RecordReference recordReference,
                          @NotNull Map<String, Object> recordAttributes) throws Exception;

    Object addRecord(@NotNull RecordType recordType, @NotNull Map<String, Object> recordAttributes)
        throws ExceptionType;

    Object getRecord(@NotNull RecordReference sourceEntity) throws ExceptionType;

    @NotNull
    CollectionType getDeletedRecord(@NotNull RecordType type, @NotNull String whenExpression)
        throws ExceptionType;

    VoidType attachRecord(@NotNull RecordReference sourceEntity,
                          @NotNull RecordReference destinationEntity,
                          RecordReference contactEntity) throws ExceptionType;

    VoidType detachRecord(@NotNull RecordReference sourceEntity, @NotNull RecordReference destinationEntity)
        throws ExceptionType;

    VoidType deleteRecord(@NotNull RecordReference recordReference) throws ExceptionType;

    @NotNull
    CollectionType getRecords(@NotNull RecordType type) throws ExceptionType;

    Object getServerTime() throws ExceptionType;

    VoidType updateInviteeStatus(@NotNull RecordId eventId,
                                 @NotNull CalendarEventAttendeeResponse status) throws ExceptionType;

    CollectionType getCustomizationId(@NotNull RecordType type, boolean includeInactives)
        throws ExceptionType;

    CollectionType getItemAvailability(@NotNull RecordReference recordReference, Date ifModifiedSince)
        throws ExceptionType;

    CollectionType getBudgetExchangeRate(@NotNull RecordId period,
                                         @NotNull RecordId fromSubsidiary,
                                         RecordId toSubsidiary) throws ExceptionType;

    CollectionType getConsolidatedExchangeRate(@NotNull RecordId period,
                                               @NotNull RecordId fromSubsidiary,
                                               RecordId toSubsidiary) throws ExceptionType;

    CollectionType getSavedSearch(@NotNull RecordType type) throws ExceptionType;

    Object checkAsyncStatus(@NotNull String jobId) throws ExceptionType;

    Object getAsyncResult(@NotNull String jobId, int pageIndex) throws ExceptionType;

    Object initialize(@NotNull RecordType type, @NotNull RecordReference recordReference)
        throws ExceptionType;


}
