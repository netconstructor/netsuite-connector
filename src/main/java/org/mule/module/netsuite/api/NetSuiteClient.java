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
import org.mule.module.netsuite.api.model.entity.RecordId;
import org.mule.module.netsuite.api.model.entity.RecordReference;
import org.mule.module.netsuite.api.model.expression.date.DateExpression;

import com.netsuite.webservices.platform.core_2010_2.AsyncStatusResult;
import com.netsuite.webservices.platform.core_2010_2.Record;
import com.netsuite.webservices.platform.core_2010_2.types.CalendarEventAttendeeResponse;
import com.netsuite.webservices.platform.core_2010_2.types.GetCustomizationType;
import com.netsuite.webservices.platform.core_2010_2.types.RecordType;
import com.netsuite.webservices.platform.core_2010_2.types.SearchRecordType;
import com.netsuite.webservices.platform.messages_2010_2.AsyncResult;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

/**
 * A NetSuite facade
 * 
 * @author flbulgarelli
 */
public interface NetSuiteClient<CollectionType, ExceptionType extends Exception, VoidType>
{
    Iterable<Record> findRecords(@NotNull SearchRecordType recordType, String expression) throws ExceptionType;

    VoidType updateRecord(@NotNull RecordReference recordReference,
                          @NotNull Map<String, Object> recordAttributes) throws Exception;

    Object addRecord(@NotNull RecordType recordType, @NotNull Map<String, Object> recordAttributes)
        throws ExceptionType;

    Object getRecord(@NotNull RecordReference sourceEntity) throws ExceptionType;

    @NotNull
    CollectionType getDeletedRecords(@NotNull RecordType type, @NotNull DateExpression whenExpression)
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

    VoidType updateInviteeStatus(@NotNull RecordId eventId, @NotNull CalendarEventAttendeeResponse status)
        throws ExceptionType;

    CollectionType getCustomizationIds(@NotNull GetCustomizationType type, boolean includeInactives)
        throws ExceptionType;

    CollectionType getItemAvailabilities(@NotNull RecordReference recordReference, Date ifModifiedSince)
        throws ExceptionType;

    CollectionType getBudgetExchangeRates(@NotNull RecordId period,
                                          @NotNull RecordId fromSubsidiary,
                                          RecordId toSubsidiary) throws ExceptionType;

    CollectionType getConsolidatedExchangeRates(@NotNull RecordId period,
                                                @NotNull RecordId fromSubsidiary,
                                                RecordId toSubsidiary) throws ExceptionType;

    CollectionType getSavedSearch(@NotNull RecordType type) throws ExceptionType;

    Object initialize(@NotNull RecordType type, @NotNull RecordReference recordReference)
        throws ExceptionType;

    AsyncStatusResult asyncFindRecord(@NotNull SearchRecordType recordType, @NotNull String expression)
        throws Exception;

    AsyncStatusResult checkAsyncStatus(@NotNull String jobId) throws ExceptionType;

    Iterable<Record> getAsyncFindResult(@NotNull String jobId) throws ExceptionType;

}
