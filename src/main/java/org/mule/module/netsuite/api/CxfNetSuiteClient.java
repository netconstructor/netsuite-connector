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
import org.mule.module.netsuite.api.model.expression.date.DateExpression;
import org.mule.module.netsuite.api.model.expression.filter.FilterExpressionParser;
import org.mule.module.netsuite.api.paging.AsyncRecordSearchIterable;
import org.mule.module.netsuite.api.paging.RecordSearchIterable;
import org.mule.module.netsuite.api.paging.SavedRecordSearchIterable;
import org.mule.module.netsuite.api.util.MapToRecordConverter;
import org.mule.module.netsuite.api.util.XmlGregorianCalendarFactory;

import com.netsuite.webservices.platform.core_2010_2.AsyncStatusResult;
import com.netsuite.webservices.platform.core_2010_2.AttachBasicReference;
import com.netsuite.webservices.platform.core_2010_2.AttachContactReference;
import com.netsuite.webservices.platform.core_2010_2.BudgetExchangeRateFilter;
import com.netsuite.webservices.platform.core_2010_2.ConsolidatedExchangeRateFilter;
import com.netsuite.webservices.platform.core_2010_2.CustomizationType;
import com.netsuite.webservices.platform.core_2010_2.DetachBasicReference;
import com.netsuite.webservices.platform.core_2010_2.GetAllRecord;
import com.netsuite.webservices.platform.core_2010_2.GetDeletedFilter;
import com.netsuite.webservices.platform.core_2010_2.GetSavedSearchRecord;
import com.netsuite.webservices.platform.core_2010_2.InitializeRecord;
import com.netsuite.webservices.platform.core_2010_2.ItemAvailabilityFilter;
import com.netsuite.webservices.platform.core_2010_2.Record;
import com.netsuite.webservices.platform.core_2010_2.RecordRef;
import com.netsuite.webservices.platform.core_2010_2.RecordRefList;
import com.netsuite.webservices.platform.core_2010_2.SearchEnumMultiSelectField;
import com.netsuite.webservices.platform.core_2010_2.UpdateInviteeStatusReference;
import com.netsuite.webservices.platform.core_2010_2.types.CalendarEventAttendeeResponse;
import com.netsuite.webservices.platform.core_2010_2.types.GetAllRecordType;
import com.netsuite.webservices.platform.core_2010_2.types.GetCustomizationType;
import com.netsuite.webservices.platform.core_2010_2.types.InitializeType;
import com.netsuite.webservices.platform.core_2010_2.types.RecordType;
import com.netsuite.webservices.platform.core_2010_2.types.SearchEnumMultiSelectFieldOperator;
import com.netsuite.webservices.platform.core_2010_2.types.SearchRecordType;
import com.netsuite.webservices.platform.messages_2010_2.AddRequest;
import com.netsuite.webservices.platform.messages_2010_2.AsyncSearchRequest;
import com.netsuite.webservices.platform.messages_2010_2.AttachRequest;
import com.netsuite.webservices.platform.messages_2010_2.CheckAsyncStatusRequest;
import com.netsuite.webservices.platform.messages_2010_2.DeleteRequest;
import com.netsuite.webservices.platform.messages_2010_2.DetachRequest;
import com.netsuite.webservices.platform.messages_2010_2.GetAllRequest;
import com.netsuite.webservices.platform.messages_2010_2.GetBudgetExchangeRateRequest;
import com.netsuite.webservices.platform.messages_2010_2.GetConsolidatedExchangeRateRequest;
import com.netsuite.webservices.platform.messages_2010_2.GetCustomizationIdRequest;
import com.netsuite.webservices.platform.messages_2010_2.GetDeletedRequest;
import com.netsuite.webservices.platform.messages_2010_2.GetItemAvailabilityRequest;
import com.netsuite.webservices.platform.messages_2010_2.GetRequest;
import com.netsuite.webservices.platform.messages_2010_2.GetSavedSearchRequest;
import com.netsuite.webservices.platform.messages_2010_2.GetServerTimeRequest;
import com.netsuite.webservices.platform.messages_2010_2.InitializeRequest;
import com.netsuite.webservices.platform.messages_2010_2.UpdateInviteeStatusRequest;
import com.netsuite.webservices.platform.messages_2010_2.UpdateRequest;
import com.netsuite.webservices.platform_2010_2.NetSuitePortType;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang.Validate;

/**
 * Implementation of the {@link SoapNetSuiteClient} that uses CXF generated-based
 * interface
 */
public class CxfNetSuiteClient implements SoapNetSuiteClient, CxfPortProvider
{

    private final CxfPortProvider portProvider;
    private final XmlGregorianCalendarFactory xmlGregorianCalendarFactory = XmlGregorianCalendarFactory.newInstance();
    private final MapToRecordConverter converter = new MapToRecordConverter(xmlGregorianCalendarFactory);

    public CxfNetSuiteClient(@NotNull CxfPortProvider portProvider)
    {
        Validate.notNull(portProvider);
        this.portProvider = portProvider;
    }

    public Object updateRecord(RecordReference recordReference, Map<String, Object> recordAttributes)
        throws Exception
    {
        Validate.notNull(recordReference);
        Validate.notEmpty(recordAttributes);
        return getAuthenticatedPort().update(
            new UpdateRequest(createRecord(recordReference.getType(), recordReference.getId().populate(
                new HashMap<String, Object>(recordAttributes)))));
    }

    public Object addRecord(RecordType recordType, Map<String, Object> recordAttributes) throws Exception
    {
        Validate.notNull(recordType);
        Validate.notEmpty(recordAttributes);
        return getAuthenticatedPort().add(new AddRequest(createRecord(recordType, recordAttributes)));
    }

    public Iterable<Record> findRecords(@NotNull final SearchRecordType recordType,
                                        @NotNull final String expression) throws Exception
    {
        Validate.notNull(recordType);
        return new RecordSearchIterable(this, recordType, expression);
    }

    public Iterable<Record> savedFindRecords(@NotNull final SearchRecordType recordType,
                                             @NotNull String searchId) throws Exception
    {
        Validate.notEmpty(searchId);
        return new SavedRecordSearchIterable(this, recordType, searchId);
    }

    public AsyncStatusResult asyncFindRecord(@NotNull SearchRecordType recordType, @NotNull String expression)
        throws Exception
    {
        Validate.notNull(recordType);
        Validate.notEmpty(expression);
        return getAuthenticatedPort().asyncSearch(
            new AsyncSearchRequest(FilterExpressionParser.parse(recordType, expression)))
            .getAsyncStatusResult();
    }

    private Record createRecord(RecordType recordType, Map<String, Object> recordAttributes) throws Exception
    {
        return converter.toRecord(recordType, recordAttributes);
    }

    public Object attachRecord(@NotNull RecordReference sourceRecord,
                               @NotNull RecordReference destinationRecord,
                               RecordReference contactEntity) throws Exception
    {
        Validate.notNull(sourceRecord);
        Validate.notNull(destinationRecord);

        if (contactEntity == null)
        {
            return getAuthenticatedPort().attach(
                new AttachRequest(new AttachBasicReference(destinationRecord.createRef(),
                    sourceRecord.createRef())));
        }
        else
        {
            return getAuthenticatedPort().attach(
                new AttachRequest(new AttachContactReference(destinationRecord.createRef(),
                    sourceRecord.createRef(), contactEntity.createRef())));
        }
    }

    public Object deleteRecord(RecordReference record) throws Exception
    {
        Validate.notNull(record);
        return getAuthenticatedPort().delete(new DeleteRequest(record.createRef()));
    }

    public Object detachRecord(@NotNull RecordReference sourceEntity,
                               @NotNull RecordReference destinationEntity) throws Exception
    {
        return getAuthenticatedPort().detach(
            new DetachRequest(new DetachBasicReference(sourceEntity.createRef(),
                destinationEntity.createRef())));
    }

    public Object getDeletedRecords(RecordType type, DateExpression expression) throws Exception
    {
        GetDeletedFilter filter = new GetDeletedFilter();
        filter.setDeletedDate(expression.createSearchDateField(xmlGregorianCalendarFactory));
        filter.setType(new SearchEnumMultiSelectField(Arrays.asList(type.value()),
            SearchEnumMultiSelectFieldOperator.ANY_OF));
        return getAuthenticatedPort().getDeleted(new GetDeletedRequest(filter));
    }

    public Object getRecord(RecordReference record) throws Exception
    {
        Validate.notNull(record);
        return getAuthenticatedPort().get(new GetRequest(record.createRef()));
    }

    public Object getRecords(RecordType type) throws Exception
    {
        Validate.notNull(type);
        return getAuthenticatedPort().getAll(
            new GetAllRequest(new GetAllRecord(GetAllRecordType.fromValue(type.value()))));
    }

    public Object getBudgetExchangeRates(@NotNull RecordId period,
                                         @NotNull RecordId fromSubsidiary,
                                         RecordId toSubsidiary) throws Exception
    {
        Validate.notNull(period);
        Validate.notNull(fromSubsidiary);
        return getAuthenticatedPort().getBudgetExchangeRate(
            new GetBudgetExchangeRateRequest(new BudgetExchangeRateFilter(period.createRef(),
                fromSubsidiary.createRef(), createRefNullSafe(toSubsidiary))));
    }

    public Object getConsolidatedExchangeRates(@NotNull RecordId period,
                                               @NotNull RecordId fromSubsidiary,
                                               RecordId toSubsidiary) throws Exception
    {
        Validate.notNull(period);
        Validate.notNull(fromSubsidiary);
        return getAuthenticatedPort().getConsolidatedExchangeRate(
            new GetConsolidatedExchangeRateRequest(new ConsolidatedExchangeRateFilter(period.createRef(),
                fromSubsidiary.createRef(), createRefNullSafe(toSubsidiary))));
    }

    public Object getCustomizationIds(@NotNull GetCustomizationType type, boolean includeInactives)
        throws Exception
    {
        Validate.notNull(type);
        return getAuthenticatedPort().getCustomizationId(
            new GetCustomizationIdRequest(new CustomizationType(type), includeInactives));
    }

    public Object getItemAvailabilities(@NotNull RecordReference recordReference, Date ifModifiedSince)
        throws Exception
    {
        Validate.notNull(recordReference);
        return getAuthenticatedPort().getItemAvailability(//
            new GetItemAvailabilityRequest(//
                new ItemAvailabilityFilter(singletonRecordRefList(recordReference),
                    xmlGregorianCalendarFactory.nullSafeToXmlCalendar(ifModifiedSince))));
    }

    public Object getSavedSearch(@NotNull RecordType type) throws Exception
    {
        Validate.notNull(type);
        return getAuthenticatedPort().getSavedSearch(
            new GetSavedSearchRequest(new GetSavedSearchRecord(SearchRecordType.fromValue(type.value()))));
    }

    public Object getServerTime() throws Exception
    {
        return getAuthenticatedPort().getServerTime(new GetServerTimeRequest());
    }

    public Object updateInviteeStatus(@NotNull RecordId eventId, @NotNull CalendarEventAttendeeResponse status)
        throws Exception
    {
        Validate.notNull(eventId);
        Validate.notNull(status);
        return getAuthenticatedPort().updateInviteeStatus(
            new UpdateInviteeStatusRequest(new UpdateInviteeStatusReference(eventId.createRef(), status)));
    }

    public AsyncStatusResult checkAsyncStatus(String jobId) throws Exception
    {
        Validate.notEmpty(jobId);
        return getAuthenticatedPort().checkAsyncStatus(new CheckAsyncStatusRequest(jobId))
            .getAsyncStatusResult();
    }

    public Iterable<Record> getAsyncFindResult(String jobId) throws Exception
    {
        Validate.notEmpty(jobId);
        return new AsyncRecordSearchIterable(this, jobId);
    }

    public Object initialize(InitializeType type, RecordReference recordReference) throws Exception
    {
        Validate.notNull(type);
        Validate.notNull(recordReference);
        return getAuthenticatedPort().initialize(
            new InitializeRequest(new InitializeRecord(type, recordReference.createInitializeRef(), null)));
    }

    public NetSuitePortType getAuthenticatedPort() throws Exception
    {
        return portProvider.getAuthenticatedPort();
    }

    private RecordRef createRefNullSafe(RecordId toSubsidiary)
    {
        return toSubsidiary != null ? toSubsidiary.createRef() : null;
    }

    private RecordRefList singletonRecordRefList(RecordReference recordReference)
    {
        return new RecordRefList(Collections.singletonList(recordReference.createRef()));
    }

}
