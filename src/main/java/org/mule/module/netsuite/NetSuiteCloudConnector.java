/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite;

import static org.mule.module.netsuite.RecordReferences.from;
import static org.mule.module.netsuite.RecordReferences.nulSafeFrom;

import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.module.netsuite.api.CxfNetSuiteClient;
import org.mule.module.netsuite.api.DefaultCxfPortProvider;
import org.mule.module.netsuite.api.NetSuiteClient;
import org.mule.module.netsuite.api.NetSuiteClientAdaptor;
import org.mule.module.netsuite.api.model.expression.date.SimpleDateExpression;
import org.mule.module.netsuite.api.model.expression.date.StringDateExpression;
import org.mule.tools.cloudconnect.annotations.Connector;
import org.mule.tools.cloudconnect.annotations.Operation;
import org.mule.tools.cloudconnect.annotations.Parameter;
import org.mule.tools.cloudconnect.annotations.Property;

import com.netsuite.webservices.platform.core_2010_2.AsyncStatusResult;
import com.netsuite.webservices.platform.core_2010_2.Record;
import com.netsuite.webservices.platform.core_2010_2.RecordRef;
import com.netsuite.webservices.platform.core_2010_2.types.CalendarEventAttendeeResponse;
import com.netsuite.webservices.platform.core_2010_2.types.GetCustomizationType;
import com.netsuite.webservices.platform.core_2010_2.types.InitializeType;
import com.netsuite.webservices.platform.core_2010_2.types.RecordType;
import com.netsuite.webservices.platform.core_2010_2.types.SearchDateFieldOperator;
import com.netsuite.webservices.platform.core_2010_2.types.SearchRecordType;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/**
 * The NetSuite cloud connector facade, based on a {@link NetSuiteClient}
 * 
 * @author flbulgarelli
 */
@Connector(namespacePrefix = "netsuite", namespaceUri = "http://www.mulesoft.org/schema/mule/netsuite")
public class NetSuiteCloudConnector implements Initialisable
{
    private static final String SUITETALK_ADDRESS = "https://webservices.netsuite.com/services/NetSuitePort_2010_2";
    
    @Property(name = "client-ref", optional = true)
    private NetSuiteClient<List<Object>, RuntimeException, Void> client;
    
    /**
     * The login email of both NetSuite UI and SuiteTalk
     */
    @Property
    private String email;
    /**
     * The login password of both the NetSuite UI and SuiteTalk
     */
    @Property
    private String password;
    /**
     * SuiteTalk -NetSuite WebService - account id. It looks like TSTDRVXXXXXX
     */
    @Property
    private String account;
    /**
     * The id of the role used to login in SuiteTalk, which determines the operation privileges
     */
    @Property
    private String roleId;
    
    /**
     * Attaches a source record - that is, the attachment - to another destination one, 
     * optionally specifying a contact for the
     * attachment. Not all record type are supported as source, destination or
     * contact. Please consult NetSuite documentation.
     * Example:
     * 
     * {@code <netsuite:attach-record  sourceRecordType="FILE" sourceId="16" destinationRecordType="EMPLOYEE" destinationId="96"  />}
     * 
     * @param sourceRecordType the type of the target record to be attached
     * @param sourceId the id of the target record to be attached
     * @param sourceIdType the id type of the record to be attached
     * @param destinationRecordType the type of the record to be attached to
     * @param destinationId the id of the record to be attached to
     * @param destinationIdType the id type of the record to be attached to
     * @param contanctRecordType the record type of the optional contact record
     * @param contanctId the id of the optional contact record
     * @param contanctIdType the id type of the optional contact record
     */
    @Operation
    public void attachRecord(@Parameter(optional = false) RecordType sourceRecordType,
                             @Parameter(optional = false) String sourceId,
                             @Parameter(optional = true, defaultValue = "INTERNAL") RecordIdType sourceIdType,
                             @Parameter(optional = false) RecordType destinationRecordType,
                             @Parameter(optional = false) String destinationId,
                             @Parameter(optional = true, defaultValue = "INTERNAL") RecordIdType destinationIdType,
                             @Parameter(optional = true) RecordType contanctRecordType,
                             @Parameter(optional = true) String contanctId,
                             @Parameter(optional = true, defaultValue = "INTERNAL") RecordIdType contanctIdType)
    {
        client.attachRecord( //
            from(sourceRecordType, sourceId, sourceIdType), //
            from(destinationRecordType, destinationId, destinationIdType), // 
            nulSafeFrom(contanctRecordType, contanctId, contanctIdType));
    }

    /**
     * Deletes a record. Not all records can be deleted. Please consult NetSuite documentation
     * 
     * Example:
     * 
     * {@code <netsuite:delete-record recordType="CONTACT" id="986" idType="EXTERNAL"/> }
     *  
     * @param recordType the type of the record to delete
     * @param id the id of the record to delete
     * @param idType the type of id of the record to delete
     */
    @Operation
    public void deleteRecord(@Parameter RecordType recordType,
                             @Parameter String id,
                             @Parameter(optional = true, defaultValue = "INTERNAL") RecordIdType idType)
    {
        client.deleteRecord(from(recordType, id, idType));
    }

    /**
     * Detaches a source record - that is, the attachment - from a destination record.
     * Example:
     * 
     * {@code <netsuite:detach-record sourceRecordType="FILE" sourceId="16" destinationRecordType="EMPLOYEE" destinationId="96" />}
      
     * @param sourceRecordType the type of the target record to be detached
     * @param sourceId the id of the target record to be detached
     * @param sourceIdType the id type of the record to be detached
     * @param destinationRecordType the type of the record to be detached to
     * @param destinationId the id of the record to be detached to
     * @param destinationIdType the id type of the record to be detached to
     */
    @Operation
    public void detachRecord(@Parameter RecordType sourceRecordType,
                             @Parameter String sourceId,
                             @Parameter(optional = true, defaultValue = "INTERNAL") RecordIdType sourceIdType,
                             @Parameter RecordType destinationRecordType,
                             @Parameter String destinationId,
                             @Parameter(optional = true, defaultValue = "INTERNAL") RecordIdType destinationIdType)
    {
        client.detachRecord(//
            from(sourceRecordType, sourceId, sourceIdType), // 
            from(destinationRecordType, destinationId, destinationIdType));
    }

    /**
     * Answers the list of budget exchange rates
     * Example:
     * 
     * {@code <netsuite:get-budget-exchange-rate periodId="986" fromSubsidiaryId="62" fromSubsidiaryIdType="EXTERNAL"/>}
     * 
     * @param periodId the id of the period 
     * @param periodIdType the period id type
     * @param fromSubsidiaryId the id of the staring  subsidiary 
     * @param fromSubsidiaryIdType the starting subsidiary id type
     * @param toSubsidiaryId the  the id of the optional ending subsidiary  
     * @param toSubsidiaryIdType the id type of the optional ending subsidiary
     * @return a list of BudgetExchangeRate's
     */
    @Operation
    public List<Object> getBudgetExchangeRates(@Parameter String periodId,
                                               @Parameter(optional = true, defaultValue = "INTERNAL") RecordIdType periodIdType,
                                               @Parameter String fromSubsidiaryId,
                                               @Parameter(optional = true, defaultValue = "INTERNAL") RecordIdType fromSubsidiaryIdType,
                                               @Parameter(optional = true) String toSubsidiaryId,
                                               @Parameter(optional = true, defaultValue = "INTERNAL") RecordIdType toSubsidiaryIdType)
    {
        return client.getBudgetExchangeRates(//
            RecordIds.from(periodId, periodIdType), // 
            RecordIds.from(fromSubsidiaryId, fromSubsidiaryIdType), //
            RecordIds.nullSafeFrom(toSubsidiaryId, toSubsidiaryIdType));
    }

    /**
     * Answers the list of consolidated exchange rates
     * Example:
     * 
     * {@code
     * <netsuite:get-consolidated-exchange-rate
     *       periodId="106" 
     *       periodIdType="EXTERNAL" 
     *       fromSubsidiaryId="5689"
     *       toSubsidiaryId="4898" />}
     * 
     * @param periodId the id of the period 
     * @param periodIdType the period id type
     * @param fromSubsidiaryId the id of the staring  subsidiary 
     * @param fromSubsidiaryIdType the starting subsidiary id type
     * @param toSubsidiaryId the  the id of the optional ending subsidiary  
     * @param toSubsidiaryIdType the id type of the optional ending subsidiary
     * @return a list of ConsolidatedExchangeRate's
     */
    @Operation
    public List<Object> getConsolidatedExchangeRates(@Parameter String periodId,
                                                     @Parameter(optional = true, defaultValue = "INTERNAL") RecordIdType periodIdType,
                                                     @Parameter String fromSubsidiaryId,
                                                     @Parameter(optional = true, defaultValue = "INTERNAL") RecordIdType fromSubsidiaryIdType,
                                                     @Parameter(optional = true) String toSubsidiaryId,
                                                     @Parameter(optional = true, defaultValue = "INTERNAL") RecordIdType toSubsidiaryIdType)
    {
        return client.getConsolidatedExchangeRates(//
            RecordIds.from(periodId, periodIdType), // 
            RecordIds.from(fromSubsidiaryId, fromSubsidiaryIdType), //
            RecordIds.nullSafeFrom(toSubsidiaryId, toSubsidiaryIdType));
    }

    /**
     * Answers the ids of available customizations for a given record type.
     * 
     *  Example: {@code <netsuite:get-customization-ids type="ACCOUNT"/>}
     * 
     * @param type the target record type
     * @param includeInactives if inactive customizations should also be returned
     * @return a list of CustomizationRef's
     */
    @Operation
    public List<Object> getCustomizationIds(@Parameter GetCustomizationType type,
                                            @Parameter(optional = true, defaultValue = "false") boolean includeInactives)
    {
        return client.getCustomizationIds(type, includeInactives);
    }

    /**
     * Answers a list of deleted records of a given record type that match a given date expression.
     * This operations accepts two different date expression passing styles: string oriented, 
     * and object oriented. If whenExpression is specified, it is parsed and used as date expression. 
     * Otherwise, a date expression is build from date1, date2 and operator parameters. 
     * 
     * The first style is more appropriate when the date expression can be harcdoded, while the second style 
     * is better when client code already has date objects. However, predefined search values like 
     * thisWeek, tomorrow or today can only be used with the first, string oriented, style.
     * 
     * String oriented date expressions are in the form operation( searchValue, arguments...), where operation is any of the NetSuite 
     * supported date operations, arguments are one or two operands for the given operator, and
     * searchValue is some of the supported predefined search value as defined by NetSuite or any 
     * of the following expressions:
     * isoDate( anIsoDate ), isoDateRante( anIsoDate, anotherIsoDate ) , 
     * dateTime( aQuotedDateTime, aQuoatedJavaDateFormat ), 
     * dateTimeRange( aQuotedDateTime, anotherQuotedDateTime, aQuoatedJavaDateFormat ).       
     * Supported predefined search values are: today, thisWeek, thisBusinessWeek, thisMonth,thisYear, yesterday, 
     * twoDaysAgo, lastWeek, lastMonth, threeMonthAgo,tomorrow, nextMonth , nextWeek    
     * 
     * Examples using both string and object oriented styles:
     * 
     * {@code 
     *        <netsuite:get-deleted-record type="CUSTOMER_PAYMENT" whenExpression="within(thisWeek)"/>
     *        <netsuite:get-deleted-record type="BIN" whenExpression="after(yesterday)"/>
     *        <netsuite:get-deleted-record type="EMPLOYEE" whenExpression="on(today)"/>
     *        <netsuite:get-deleted-record type="CUSTOMER" whenExpression="before(isoDate(2005-11-14))"/>
     *        <netsuite:get-deleted-record type="CUSTOMER" date1="#[payload]" operator="BEFORE"/>
     *        <netsuite:get-deleted-record type="TASK" whenExpression="notWithin(dateTimeRange('15:14:10', '19:14:10', 'HH:mm:ss'))" />
     *        <netsuite:get-deleted-record type="TASK" date1="#[map-payload:date1]" date2="#[map-payload:date2]" operator="WITHIN" />}
     * 
     * @param type the type of the target deleted record to retrieve 
     * @param whenExpression a predicate-style date filtering expression
     * @return the list of DeletedRecord's that match the given date filtering expression
     */
    @Operation
    public List<Object> getDeletedRecords(@Parameter RecordType type,
                                          @Parameter(optional = true) String whenExpression,
                                          @Parameter(optional = true) Date date1,
                                          @Parameter(optional = true) Date date2,
                                          @Parameter(optional = true) SearchDateFieldOperator operator)
    {
        
        return client.getDeletedRecords(type, 
            whenExpression != null ? new StringDateExpression( whenExpression) : new SimpleDateExpression(date1, date2, operator));
    }

    /**
     * Answers all the record of a given type
     * Example:
     * 
     * {@code <netsuite:get-records type="ENTITY_CUSTOM_FIELD"/>}
     * @param type the target record type  
     * @return the list of Record's
     */
    @Operation
    public List<Object> getRecords(@Parameter RecordType type)
    {
        return client.getRecords(type);
    }

    /**
     * Answers a record given its id
     * Example:
     * {@code <netsuite:get-record recordType="CREDIT_MEMO" id="982"/>}
     * @param recordType the target record type
     * @param id the target record id
     * @param idType the id type of the given record id
     * @return a Record
     */
    @Operation
    public Object getRecord(@Parameter RecordType recordType,
                            @Parameter(optional = false) String id,
                            @Parameter(optional = true, defaultValue = "INTERNAL") RecordIdType idType)
    {
        return client.getRecord(from(recordType, id, idType));
    }

    /**
     * Answers the availability for a given record reference.
     * If the Multi-Location Inventory feature is enabled, this operation returns results for all locations. 
     * For locations that do not have any items available, only location IDs and names are listed in results. 
     * Example:
     * 
     * {@code <netsuite:get-item-availability recordType="ACCOUNT" id="#[map-payload:recordId]"/>}
     * @param recordType the target record type
     * @param id the target record id
     * @param idType the id type of the given record id
     * @param ifModifiedSince an optional modified since date. 
     *         If set, only items with quantity available changes recorded as of the specified date are returned.
     * @return A list of ItemAvailability's
     */
    @Operation
    public List<Object> getItemAvailabilities(@Parameter RecordType recordType,
                                              @Parameter(optional = false) String id,
                                              @Parameter(optional = true, defaultValue = "INTERNAL") RecordIdType idType,
                                              @Parameter(optional = true) Date ifModifiedSince)
    {
        return client.getItemAvailabilities(from(recordType, id, idType), ifModifiedSince);
    }

    /**
     * Retrieves a list of existing saved searches for the given record type.
     * Example:
     * 
     * {@code <netsuite:get-saved-search type="ACCOUNT"/>}
     * @param type the target record type
     * @return the list of RecordRedf's 
     */
    @Operation
    public List<Object> getSavedSearch(@Parameter RecordType type)
    {
        return client.getSavedSearch(type);
    }

    /**
     * Answers the server time, resulting in more accurate and reliable sync'ing of data than using
     * using local client time. Example:
     * 
     * {@code <netsuite:get-server-time />}
     *
     * @return the server time, as a Date
     */
    @Operation
    public Date GetServerTime()
    {
        return ((XMLGregorianCalendar) client.getServerTime()).toGregorianCalendar().getTime();
    }

    /**
     * Sets a new invitation status for a given event. Example:
     * Example:
     * 
     * {@code <netsuite:update-invitee-status eventId="#[map-payload:eventId]" status="TENTATIVE"/>}
     * @param eventId the target event id
     * @param eventIdType the id type of the given eventId
     * @param status the new status to set
     */
    @Operation
    public void updateInviteeStatus(@Parameter(optional = false) String eventId,
                                    @Parameter(optional = true, defaultValue = "INTERNAL") RecordIdType eventIdType,
                                    @Parameter CalendarEventAttendeeResponse status)
    {
        client.updateInviteeStatus(RecordIds.from(eventId, eventIdType), status);
    }
    
    /**
     * Creates a new record. Example:
     * 
     * {@code 
     *  <netsuite:add-record recordType="EMPLOYEE">
     *       <netsuite:attributes>
     *           <netsuite:attribute key="firstName" value="#[variable:firstName]" />
     *           <netsuite:attribute key="lastName" value="#[variable:lastName]" />
     *           <netsuite:attribute key="email" value="#[variable:email]" />
     *       </netsuite:attributes>
     *   </netsuite:add-record>}
     *   
     * @param recordType  the type of record to add
     * @param attributes the record attributes, as a string-object map
     * @return the RecordRef of the new record
     */
    @Operation
    public RecordRef addRecord(@Parameter RecordType recordType,
                               @Parameter Map<String, Object> attributes)
    {
        return ((RecordRef) client.addRecord(recordType, attributes));
    }

    /**
     * Creates a new file record. This operation is similar to addRecord, but is
     * customized for simplifying local content passing.
     * 
     * {@code <netsuite:add-file  content="#[payload]" fileName="#[header:filename]" folderId="#[header:folderId]"  />}
     * 
     * @param attributes the additional file attributes
     * @param content the content of the file record to add. It can be of type
     *            String, byte array, File or InputStream. If it is an input stream,
     *            this operations also closes it.
     * @param fileName the name of the remote file
     * @param folderId  the id of the folder record where to add this file
     * @param folderIdType the id type of the folder record
     * @return the RecordRef of the new record 
     */
    @Operation
    @SuppressWarnings("serial")
    public RecordRef addFile(@Parameter(optional = true) Map<String, Object> attributes,
                             @Parameter final Object content,
                             @Parameter final String fileName,
                             @Parameter final String folderId,
                             @Parameter(optional = true, defaultValue = "INTERNAL") final RecordIdType folderIdType) throws IOException
    {
        return addRecord(RecordType.FILE, new HashMap<String, Object>(
            attributes != null ? attributes : Collections.<String, Object> emptyMap())
        {
            {
                put("content", createContent(content));
                put("name", fileName);
                put("folder", RecordIds.from(folderId, folderIdType).createRef());
            }
        });
    }

    private byte[] createContent(Object content) throws IOException
    {
        if (content instanceof String)
        {
            return ((String) content).getBytes();
        }
        if (content instanceof byte[])
        {
            return (byte[]) content;
        }
        if (content instanceof File)
        {
            return FileUtils.readFileToByteArray((File) content);
        }
        if (content instanceof InputStream)
        {
            return toByteArray((InputStream) content);
        }
        throw new IllegalArgumentException("Unsupported Content Type " + content);
    }

    private byte[] toByteArray(InputStream content) throws IOException
    {
        try
        {
            return IOUtils.toByteArray(content);
        }
        finally
        {
            content.close();
        }
    }

    
    /**
     * Updates an existing record.
     * Example:
     * 
     * {@code 
     *  <netsuite:update-record recordType="EMPLOYEE" id="#[map-payload:recordId]">
     *       <netsuite:attributes>
     *           <netsuite:attribute key="mobilePhone" value="#[map-payload:mobilePhone]" />
     *           <netsuite:attribute key="homePhone" value="#[map-payload:homePhone]" />
     *       </netsuite:attributes>
     *   </netsuite:update-record>}
     * 
     * @param recordType the target record type to update
     * @param id the target record id
     * @param idType the id type of the given record id
     * @param attributes the record attributes, as a string-object map
     */
    @Operation
    public void updateRecord(@Parameter RecordType recordType,
                               @Parameter(optional = false) String id,
                               @Parameter(optional = true, defaultValue = "INTERNAL") RecordIdType idType,
                               @Parameter Map<String, Object> attributes) throws Exception
    {
        client.updateRecord(from(recordType, id, idType), attributes);
    }

    /**
     * Answers the status of an asynchronous Web services submission. When a jobId is
     * submitted, the status, percent complete, and estimated remaining duration are
     * returned.
     * 
     * Example:
     * 
     * {@code <netsuite:get-budget-exchange-rate periodId="986" fromSubsidiaryId="62" fromSubsidiaryIdType="EXTERNAL"/>}
     * 
     * @param jobId
     * @return the AsyncStatusResult for the given job
     */
    @Operation 
    public AsyncStatusResult checkAsyncStatus(@Parameter String jobId)
    {
        return client.checkAsyncStatus(jobId);
    }

    /**
     * Answers all records that match the given filtering expression.
     * If no expression is specified, the empty expression is used, 
     * which retrieves all records of the given type. 
     * 
     * Filtering expressions support both basic and joined syntax, that is, using in the filters
     * attributes of both the target entity and the target entity associations. Advanced search is not supported.
     * 
     * Search expressions are  in the form operator(attribute, arguments...) for basic search, 
     * and operator(join.attribute, arguments...) for joined search, where operator is 
     * any of the string, long, double, and text operators supported by SuiteTalk - MultiSelect operators are not supported -
     * plus the isTrue/isFalse boolean operators, and arguments are zero up to three operands that depend on the operator used. 
     * 
     * 
     *  
     * Examples:
     * {@code 
     *  <netsuite:find-records recordType="BIN" />
     *  <netsuite:find-records recordType="EMPLOYEE" expression="is(email, '#[map-payload:email]')" />
     *  <netsuite:find-records recordType="EMPLOYEE" expression='is(email, "#[map-payload:email]")' />
     *  <netsuite:find-records recordType="EMPLOYEE" expression="is(email, '#[map-payload:email]'), contains(address, '#[map-payload:address]')" />
     *  <netsuite:find-records recordType="EMPLOYEE" expression="empty(title), isNot(file.url, '#[map-payload:fileUrl]')" /> 
     *  <netsuite:find-records recordType="EMPLOYEE" expression="anyOf(globalSubscriptionStatus, [_confirmedOptOut, _softOptIn])" />
     *  <netsuite:find-records recordType="FOLDER" expression="noneOf(group, [internal('#[header:internalId1]'), internal('#[header:internalId2]')])" />
     *  <netsuite:find-records recordType="EMPLOYEE" expression="greaterThanOrEqualTo(file.documentSize, #[map-payload:documentSize])" />}
     *  <netsuite:find-records recordType="BIN"" expression="isTrue(user.isInactive)" />
     * 
     * @param recordType the type of record to search
     * @param expression the filtering expression
     *          Multiple filters can be combined using multiple predicates separated by commas.    
     * @return a list of Record's
     */
    @Operation
    public Iterable<Record> findRecords(@Parameter SearchRecordType recordType,
                                        @Parameter(optional = true) String expression)
    {
        return client.findRecords(recordType, expression);
    }
    
    /**
     * Answers the first records that match the given filtering expression. 
     * If no expression is specified, the empty expression is used, 
     * which retrieves all records of the given type.  
     * Throws a NoSuchElementException if no record can be retrieved.
     * 
     * Filtering expressions support both basic and joined syntax, that is, using in the filters
     * attributes of both the target entity and the target entity associations. Advanced search is not supported.
     * 
     * Search expressions are  in the form operator(attribute, arguments...) for basic search, 
     * and operator(join.attribute, arguments...) for joined search, where operator is 
     * any of the string, long, double, and text operators supported by SuiteTalk - MultiSelect operators are not supported -
     * plus the isTrue/isFalse boolean operators, and arguments are zero up to three operands that depend on the operator used. 
     * 
     * Examples:
     * {@code 
     *  <netsuite:find-first-record recordType="BIN")" />
     *  <netsuite:find-first-record recordType="EMPLOYEE" expression="is(email, '#[map-payload:email]')" />
     *  <netsuite:find-first-record recordType="EMPLOYEE" expression='is(email, "#[map-payload:email]")' />
     *  <netsuite:find-first-record recordType="EMPLOYEE" expression="is(email, '#[map-payload:email]'), contains(address, '#[map-payload:address]')" />
     *  <netsuite:find-first-record recordType="EMPLOYEE" expression="empty(title), isNot(file.url, '#[map-payload:fileUrl]')" /> 
     *  <netsuite:find-first-record recordType="BIN"" expression="isTrue(user.isInactive)" />
     *  <netsuite:find-first-record recordType="EMPLOYEE" expression="anyOf(globalSubscriptionStatus, [_confirmedOptOut, _softOptIn])" />
     *  <netsuite:find-first-record recordType="FOLDER" expression="noneOf(group, [internal('#[header:internalId1]'), internal('#[header:internalId2]')])" />
     *  <netsuite:find-first-record recordType="EMPLOYEE" expression="greaterThanOrEqualTo(file.documentSize, #[map-payload:documentSize])" />}
     *  
     * 
     * @param recordType the type of record to search
     * @param expression the filtering expression
     *          Multiple filters can be combined using multiple predicates separated by commas.    
     * @return the first record that match the given filtering expression
     */
    @Operation 
    public Record findFirstRecord(@Parameter SearchRecordType recordType,
                                  @Parameter(optional = true) String expression)
    {
        return client.findRecords(recordType, expression).iterator().next();
    }
    
    /**
     * Answers all records of a given type for a saved search, given its search id.
     * 
     * Examples:
     * {@code  <netsuite:find-saved-records recordType="BIN" searchId="#[header:searchId]" /> }
     * 
     * @param recordType the type of record to search
     * @param searchId the id of the save search    
     * @return a list of Record's
     */
    @Operation
    public Iterable<Record> savedFindRecords(@Parameter SearchRecordType recordType,
                                             @Parameter String searchId)
    {
        return client.savedFindRecords(recordType, searchId);
    }
    
    /**
     * Searches for all records that match the given filtering expression, asynchronously.
     * If no expression is specified, all records of the given type are retrieved  
     * 
     * Filtering expressions support both basic and joined syntax, that is, using in the filters
     * attributes of both the target entity and the target entity associations. Advanced search is not supported.
     * 
     * Search expressions are  in the form operator(attribute, arguments...) for basic search, 
     * and operator(join.attribute, arguments...) for joined search, where operator is 
     * any of the string, long, double, and text operators supported by SuiteTalk - MultiSelect operators are not supported -
     * plus the isTrue/isFalse boolean operators, and arguments are zero up to three operands that depend on the operator used. 
     * 
     * Examples:
     * {@code 
     *  <netsuite:async-find-records recordType="BIN" />
     *  <netsuite:async-find-records recordType="EMPLOYEE" expression="is(email, '#[map-payload:email]')" />
     *  <netsuite:async-find-first-record recordType="EMPLOYEE" expression='is(email, "#[map-payload:email]")' />
     *  <netsuite:async-find-records recordType="EMPLOYEE" expression="is(email, '#[map-payload:email]'), contains(address, '#[map-payload:address]')" />
     *  <netsuite:async-find-records recordType="EMPLOYEE" expression="empty(title), isNot(file.url, '#[map-payload:fileUrl]')" /> 
     *  <netsuite:async-find-records recordType="BIN"" expression="isTrue(user.isInactive)" />
     *  <netsuite:async-find-records recordType="EMPLOYEE" expression="anyOf(globalSubscriptionStatus, [_confirmedOptOut, _softOptIn])" />
     *  <netsuite:async-find-records recordType="FOLDER" expression="noneOf(group, [internal('#[header:internalId1]'), internal('#[header:internalId2]')])" />
     *  <netsuite:async-find-records recordType="EMPLOYEE" expression="greaterThanOrEqualTo(file.documentSize, #[map-payload:documentSize])" />}
     * 
     * @param recordType the type of record to search
     * @param expression the filtering expression, in the 
     *          form operator(attribute, arguments...) for basic search, 
     *          and operator(join.attribute, arguments...) for joined search, where operator is 
     *          any of the string, long, double, and text operators supported by SuiteTalk - MultiSelect operators are not supported -
     *          plus the isTrue/isFalse boolean operators, and arguments are zero up to three operands that depend on the operator used. 
     *          Multiple filters can be combined using multiple predicates separated by commas.
     * @return the AsyncStatusResult of the query
     */
    @Operation
    public AsyncStatusResult asyncFindRecords(@Parameter SearchRecordType recordType,
                                              @Parameter(optional = true) String expression) throws Exception
    {
        return client.asyncFindRecord(recordType, expression);
    }

    /**
     * Answers the results of an asynchronous web services submission. This operation
     * can be executed operation up to 20 times within a 30 day time period to
     * retrieve the results of an asynchronous job.
     * Example:
     * {@code <netsuite:get-async-find-result jobId="#[map-payload:jobId]"  />}
     * 
     * @param jobId the id of the job
     * @param pageIndex the page number the the async result
     * @return the Record's list
     */
    @Operation
    public Iterable<Record> getAsyncFindResult(@Parameter String jobId)
    {
        return client.getAsyncFindResult(jobId);
    }
    

    /**
     * Answers the the first result of an asynchronous asyncFind.
     * Throws a NoSuchElement exception if there are no results.
     * This operation can be executed operation up to 20 times within a 30 day time period to
     * retrieve the results of an asynchronous job.
     * 
     * Example:
     * {@code <netsuite:get-async-find-first-result jobId="#[map-payload:jobId]"  />}
     * 
     * @param jobId the id of the job
     * @param pageIndex the page number the the async result
     * @return the first Record
     */
    @Operation
    public Record getAsyncFindFirstResult(@Parameter String jobId)
    {
        return client.getAsyncFindResult(jobId).iterator().next();
    }
    
    /**
     * Populates fields on transaction line items with values from a related record,
     * in a similar way empty text boxes are prepopulated within the Netsuite UI
     * Example:
     * 
     * {@code <netsuite:initialize type="INVOICE" id="#[map-payload:recordId]" recordType="SALES_ORDER" /> }
     * 
     * @param type the type of record whose defaults values are used to populate the
     *            target record
     * @param recordType the target record type
     * @param id the target record id
     * @param idType the id type of the given record id
     * @return the initialized Record
     */
    @Operation
    public Record initialize(@Parameter InitializeType type,
                             @Parameter RecordType recordType,
                             @Parameter(optional = false) String id,
                             @Parameter(optional = true, defaultValue = "INTERNAL") RecordIdType idType)
    {
        return (Record) client.initialize(type, from(recordType, id, idType));
    }

    public void initialise() throws InitialisationException
    {
        if (client == null)
        {
            setClient(new CxfNetSuiteClient(new DefaultCxfPortProvider(SUITETALK_ADDRESS, email, password, account,
                roleId)));
        }
    }

    public NetSuiteClient<List<Object>, RuntimeException, Void> getClient()
    {
        return client;
    }

    public void setClient(NetSuiteClient<?, ?, ?> client)
    {
        this.client = NetSuiteClientAdaptor.adapt(client);
    }


    public String getRoleId()
    {
        return roleId;
    }

    public void setRoleId(String roleId)
    {
        this.roleId = roleId;
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
