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

import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.Module;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;
import org.mule.module.netsuite.api.CxfNetSuiteClient;
import org.mule.module.netsuite.api.DefaultCxfPortProvider;
import org.mule.module.netsuite.api.NetSuiteClient;
import org.mule.module.netsuite.api.NetSuiteClientAdaptor;
import org.mule.module.netsuite.api.model.expression.date.SimpleDateExpression;
import org.mule.module.netsuite.api.model.expression.date.StringDateExpression;

import com.netsuite.webservices.platform.core_2010_2.AsyncStatusResult;
import com.netsuite.webservices.platform.core_2010_2.Record;
import com.netsuite.webservices.platform.core_2010_2.RecordRef;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/**
 * The NetSuite cloud connector facade, based on a {@link NetSuiteClient}
 * 
 * @author flbulgarelli
 */
@Module(name = "netsuite",        
        namespace = "http://repository.mulesoft.org/releases/org/mule/modules/mule-module-netsuite",
        schemaLocation = "http://repository.mulesoft.org/releases/org/mule/modules/mule-module-zuora/2.0/mule-netsuite.xsd")
public class NetSuiteCloudConnector
{
    private static final String SUITETALK_ADDRESS = "https://webservices.netsuite.com/services/NetSuitePort_2010_2";
    
    /**
     * The Netsuite client to use. Mainly for mocking purposes 
     */
    @Optional    
    private NetSuiteClient<List<Object>, RuntimeException, Void> client;
    
    /**
     * The login email of both NetSuite UI and SuiteTalk
     */
    @Configurable
    private String email;
    /**
     * The login password of both the NetSuite UI and SuiteTalk
     */
    @Configurable
    private String password;
    /**
     * SuiteTalk -NetSuite WebService - account id. It looks like TSTDRVXXXXXX
     */
    @Configurable
    private String account;
    /**
     * The id of the role used to login in SuiteTalk, which determines the Processor privileges
     */
    @Configurable
    private String roleId;
    
    /**
     * Attaches a source record - that is, the attachment - to another destination one, 
     * optionally specifying a contact for the
     * attachment. Not all record type are supported as source, destination or
     * contact. Please consult NetSuite documentation.
     * Example:
     * 
     * {@sample.xml ../../../doc/mule-module-netsuite.xml.sample netsuite:attach-record}
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
    @Processor
    public void attachRecord( RecordTypeEnum sourceRecordType,
                              String sourceId,
                             @Optional @Default("INTERNAL") RecordIdType sourceIdType,
                              RecordTypeEnum destinationRecordType,
                              String destinationId,
                             @Optional @Default("INTERNAL") RecordIdType destinationIdType,
                             @Optional RecordTypeEnum contanctRecordType,
                             @Optional String contanctId,
                             @Optional @Default("INTERNAL") RecordIdType contanctIdType)
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
     * {@sample.xml ../../../doc/mule-module-netsuite.xml.sample netsuite:delete-record}
     *   
     * @param recordType the type of the record to delete
     * @param id the id of the record to delete
     * @param idType the type of id of the record to delete
     */
    @Processor
    public void deleteRecord(RecordTypeEnum recordType,
                             String id,
                             @Optional @Default("INTERNAL") RecordIdType idType)
    {
        client.deleteRecord(from(recordType, id, idType));
    }

    /**
     * Detaches a source record - that is, the attachment - from a destination record.
     * Example:
     * 
     * {@sample.xml ../../../doc/mule-module-netsuite.xml.sample netsuite:detach-record}      
      
     * @param sourceRecordType the type of the target record to be detached
     * @param sourceId the id of the target record to be detached
     * @param sourceIdType the id type of the record to be detached
     * @param destinationRecordType the type of the record to be detached to
     * @param destinationId the id of the record to be detached to
     * @param destinationIdType the id type of the record to be detached to
     */
    @Processor
    public void detachRecord(RecordTypeEnum sourceRecordType,
                             String sourceId,
                             @Optional @Default("INTERNAL") RecordIdType sourceIdType,
                             RecordTypeEnum destinationRecordType,
                             String destinationId,
                             @Optional @Default("INTERNAL") RecordIdType destinationIdType)
    {
        client.detachRecord(//
            from(sourceRecordType, sourceId, sourceIdType), // 
            from(destinationRecordType, destinationId, destinationIdType));
    }

    /**
     * Answers the list of budget exchange rates
     * Example:
     * 
     * {@sample.xml ../../../doc/mule-module-netsuite.xml.sample netsuite:get-budget-exchange-rate} 
     * 
     * @param periodId the id of the period 
     * @param periodIdType the period id type
     * @param fromSubsidiaryId the id of the staring  subsidiary 
     * @param fromSubsidiaryIdType the starting subsidiary id type
     * @param toSubsidiaryId the  the id of the optional ending subsidiary  
     * @param toSubsidiaryIdType the id type of the optional ending subsidiary
     * @return a list of BudgetExchangeRate's
     */
    @Processor
    public List<Object> getBudgetExchangeRates(String periodId,
                                               @Optional @Default("INTERNAL") RecordIdType periodIdType,
                                               String fromSubsidiaryId,
                                               @Optional @Default("INTERNAL") RecordIdType fromSubsidiaryIdType,
                                               @Optional String toSubsidiaryId,
                                               @Optional @Default("INTERNAL") RecordIdType toSubsidiaryIdType)
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
     * {@sample.xml ../../../doc/mule-module-netsuite.xml.sample netsuite:get-consolidated-exchange-rate}
     * 
     * 
     * @param periodId the id of the period 
     * @param periodIdType the period id type
     * @param fromSubsidiaryId the id of the staring  subsidiary 
     * @param fromSubsidiaryIdType the starting subsidiary id type
     * @param toSubsidiaryId the  the id of the optional ending subsidiary  
     * @param toSubsidiaryIdType the id type of the optional ending subsidiary
     * @return a list of ConsolidatedExchangeRate's
     */
    @Processor
    public List<Object> getConsolidatedExchangeRates(String periodId,
                                                     @Optional @Default("INTERNAL") RecordIdType periodIdType,
                                                     String fromSubsidiaryId,
                                                     @Optional @Default("INTERNAL") RecordIdType fromSubsidiaryIdType,
                                                     @Optional String toSubsidiaryId,
                                                     @Optional @Default("INTERNAL") RecordIdType toSubsidiaryIdType)
    {
        return client.getConsolidatedExchangeRates(//
            RecordIds.from(periodId, periodIdType), // 
            RecordIds.from(fromSubsidiaryId, fromSubsidiaryIdType), //
            RecordIds.nullSafeFrom(toSubsidiaryId, toSubsidiaryIdType));
    }

    /**
     * Answers the ids of available customizations for a given record type.
     * 
     * Example:
     * 
     * {@sample.xml ../../../doc/mule-module-netsuite.xml.sample netsuite:get-customization-ids}
     * 
     * @param type the target record type
     * @param includeInactives if inactive customizations should also be returned
     * @return a list of CustomizationRef's
     */
    @Processor
    public List<Object> getCustomizationIds(GetCustomizationTypeEnum type,
                                            @Optional @Default("false") boolean includeInactives)
    {
        return client.getCustomizationIds(type.toGetGetGetCustomizationType(), includeInactives);
    }

    /**
     * Answers a list of deleted records of a given record type that match a given date expression.
     * This Processors accepts two different date expression passing styles: string oriented, 
     * and object oriented. If whenExpression is specified, it is parsed and used as date expression. 
     * Otherwise, a date expression is build from date1, date2 and operator parameters. 
     * 
     * The first style is more appropriate when the date expression can be harcdoded, while the second style 
     * is better when client code already has date objects. However, predefined search values like 
     * thisWeek, tomorrow or today can only be used with the first, string oriented, style.
     * 
     * String oriented date expressions are in the form Processor( searchValue, arguments...), where Processor is any of the NetSuite 
     * supported date Processors, arguments are one or two operands for the given operator, and
     * searchValue is some of the supported predefined search value as defined by NetSuite or any 
     * of the following expressions:
     * isoDate( anIsoDate ), isoDateRante( anIsoDate, anotherIsoDate ) , 
     * dateTime( aQuotedDateTime, aQuoatedJavaDateFormat ), 
     * dateTimeRange( aQuotedDateTime, anotherQuotedDateTime, aQuoatedJavaDateFormat ).       
     * Supported predefined search values are: today, thisWeek, thisBusinessWeek, thisMonth,thisYear, yesterday, 
     * twoDaysAgo, lastWeek, lastMonth, threeMonthAgo,tomorrow, nextMonth , nextWeek    
     * 
     * Examples using both string and object oriented styles:
     * {@sample.xml ../../../doc/mule-module-netsuite.xml.sample netsuite:get-deleted-records}
     * 
     * @param type the type of the target deleted record to retrieve 
     * @param date1 the first date to use
     * @param date2 the second date to use
     * @param operator the date operator
     * @param whenExpression a predicate-style date filtering expression
     * @return the list of DeletedRecord's that match the given date filtering expression
     */
    @Processor
    public List<Object> getDeletedRecords(RecordTypeEnum type,
                                          @Optional String whenExpression,
                                          @Optional Date date1,
                                          @Optional Date date2,
                                          @Optional SearchDateFieldOperatorEnum operator)
    {
        
        return client.getDeletedRecords(type.toRecordType(), 
            whenExpression != null ? new StringDateExpression( whenExpression) : new SimpleDateExpression(date1, date2, operator.toSearchDateFieldOperator()));
    }

    /**
     * Answers all the record of a given type
     * Example:
     * 
     * {@sample.xml ../../../doc/mule-module-netsuite.xml.sample netsuite:get-records}
     * @param type the target record type  
     * @return the list of Record's
     */
    @Processor
    public List<Object> getRecords(RecordTypeEnum type)
    {
        return client.getRecords(type.toRecordType());
    }

    /**
     * Answers a record given its id
     * Example:
     * {@sample.xml ../../../doc/mule-module-netsuite.xml.sample netsuite:get-record"}
     *
     * @param recordType the target record type
     * @param id the target record id
     * @param idType the id type of the given record id
     * @return a Record
     */
    @Processor
    public Object getRecord(RecordTypeEnum recordType,
                             String id,
                            @Optional @Default("INTERNAL") RecordIdType idType)
    {
        return client.getRecord(from(recordType, id, idType));
    }

    /**
     * Answers the availability for a given record reference.
     * If the Multi-Location Inventory feature is enabled, this Processor returns results for all locations. 
     * For locations that do not have any items available, only location IDs and names are listed in results. 
     * Example:
     * 
     * {@sample.xml ../../../doc/mule-module-netsuite.xml.sample netsuite:get-item-availability}
     *
     * @param recordType the target record type
     * @param id the target record id
     * @param idType the id type of the given record id
     * @param ifModifiedSince an optional modified since date. 
     *         If set, only items with quantity available changes recorded as of the specified date are returned.
     * @return A list of ItemAvailability's
     */
    @Processor
    public List<Object> getItemAvailabilities(RecordTypeEnum recordType,
                                               String id,
                                              @Optional @Default("INTERNAL") RecordIdType idType,
                                              @Optional Date ifModifiedSince)
    {
        return client.getItemAvailabilities(from(recordType, id, idType), ifModifiedSince);
    }

    /**
     * Retrieves a list of existing saved searches for the given record type.
     * Example:
     * 
     * {@sample.xml ../../../doc/mule-module-netsuite.xml.sample netsuite:get-saved-search}
     *
     * @param type the target record type
     * @return the list of RecordRedf's 
     */
    @Processor
    public List<Object> getSavedSearch(RecordTypeEnum type)
    {
        return client.getSavedSearch(type.toRecordType());
    }

    /**
     * Answers the server time, resulting in more accurate and reliable sync'ing of data than using
     * using local client time. Example:
     * 
     * {@sample.xml ../../../doc/mule-module-netsuite.xml.sample netsuite:get-server-time}
     *
     * @return the server time, as a Date
     */
    @Processor
    public Date GetServerTime()
    {
        return ((XMLGregorianCalendar) client.getServerTime()).toGregorianCalendar().getTime();
    }

    /**
     * Sets a new invitation status for a given event. Example:
     * Example:
     * 
     * {@sample.xml ../../../doc/mule-module-netsuite.xml.sample netsuite:update-invitee-status}
     *
     * @param eventId the target event id
     * @param eventIdType the id type of the given eventId
     * @param status the new status to set
     */
    @Processor
    public void updateInviteeStatus( String eventId,
                                    @Optional @Default("INTERNAL") RecordIdType eventIdType,
                                    CalendarEventAttendeeResponseEnum status)
    {
        client.updateInviteeStatus(RecordIds.from(eventId, eventIdType), status.toCalendarEventAttendeeResponse());
    }
    
    /**
     * Creates a new record. Example:
     * 
     * {@sample.xml ../../../doc/mule-module-netsuite.xml.sample netsuite:add-record}
     *   
     * @param recordType  the type of record to add
     * @param attributes the record attributes, as a string-object map
     * @return the RecordRef of the new record
     */
    @Processor
    public RecordRef addRecord(RecordTypeEnum recordType,
                               Map<String, Object> attributes)
    {
        return ((RecordRef) client.addRecord(recordType.toRecordType(), attributes));
    }

    /**
     * Creates a new file record. This Processor is similar to addRecord, but is
     * customized for simplifying local content passing.
     * 
     * {@sample.xml ../../../doc/mule-module-netsuite.xml.sample netsuite:add-file}
     *
     * 
     * @param attributes the additional file attributes
     * @param content the content of the file record to add. It can be of type
     *            String, byte array, File or InputStream. If it is an input stream,
     *            this Processors also closes it.
     * @param fileName the name of the remote file
     * @param folderId  the id of the folder record where to add this file
     * @param folderIdType the id type of the folder record
     * @return the RecordRef of the new record 
     */
    @Processor
    @SuppressWarnings("serial")
    public RecordRef addFile(@Optional Map<String, Object> attributes,
                             final Object content,
                             final String fileName,
                             final String folderId,
                             @Optional @Default("INTERNAL") final RecordIdType folderIdType) throws IOException
    {
        return addRecord(RecordTypeEnum.FILE, new HashMap<String, Object>(
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
     * {@sample.xml ../../../doc/mule-module-netsuite.xml.sample netsuite:upadte-record}
     * 
     * @param recordType the target record type to update
     * @param id the target record id
     * @param idType the id type of the given record id
     * @param attributes the record attributes, as a string-object map
     */
    @Processor
    public void updateRecord(RecordTypeEnum recordType,
                                String id,
                               @Optional @Default("INTERNAL") RecordIdType idType,
                               Map<String, Object> attributes) throws Exception
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
     * {@sample.xml ../../../doc/mule-module-netsuite.xml.sample netsuite:get-budget-exchange-rate}
     * 
     * @param jobId the id of the job whose status to check
     * @return the AsyncStatusResult for the given job
     */
    @Processor 
    public AsyncStatusResult checkAsyncStatus(String jobId)
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
     * {@sample.xml ../../../doc/mule-module-netsuite.xml.sample netsuite:find-records}
     *  
     * Examples:
     * 
     * @param recordType the type of record to search
     * @param expression the filtering expression
     *          Multiple filters can be combined using multiple predicates separated by commas.    
     * @return a list of Record's
     */
    @Processor
    public Iterable<Record> findRecords(SearchRecordTypeEnum recordType,
                                        @Optional String expression)
    {
        return client.findRecords(recordType.toSearchRecordType(), expression);
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
     * 
     * {@sample.xml ../../../doc/mule-module-netsuite.xml.sample netsuite:find-first-record}
     * 
     * @param recordType the type of record to search
     * @param expression the filtering expression
     *          Multiple filters can be combined using multiple predicates separated by commas.    
     * @return the first record that match the given filtering expression
     */
    @Processor 
    public Record findFirstRecord(SearchRecordTypeEnum recordType,
                                  @Optional String expression)
    {
        return client.findRecords(recordType.toSearchRecordType(), expression).iterator().next();
    }
     //TODO rename
    /**
     * Answers all records of a given type for a saved search, given its search id.
     * 
     * Examples:
     * {@sample.xml ../../../doc/mule-module-netsuite.xml.sample netsuite:find-saved-records}
     * 
     * @param recordType the type of record to search
     * @param searchId the id of the save search    
     * @return a list of Record's
     */
    @Processor
    public Iterable<Record> savedFindRecords(SearchRecordTypeEnum recordType,
                                             String searchId)
    {
        return client.savedFindRecords(recordType.toSearchRecordType(), searchId);
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
     * {@sample.xml ../../../doc/mule-module-netsuite.xml.sample netsuite:async-find-records}
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
    @Processor
    public AsyncStatusResult asyncFindRecords(SearchRecordTypeEnum recordType,
                                              @Optional String expression) throws Exception
    {
        return client.asyncFindRecord(recordType.toSearchRecordType(), expression);
    }

    /**
     * Answers the results of an asynchronous web services submission. This Processor
     * can be executed Processor up to 20 times within a 30 day time period to
     * retrieve the results of an asynchronous job.
     * Example:
     * {@sample.xml ../../../doc/mule-module-netsuite.xml.sample netsuite:get-async-find-result}
     * 
     * @param jobId the id of the job
     * @param pageIndex the page number the the async result
     * @return the Record's list
     */
    @Processor
    public Iterable<Record> getAsyncFindResult(String jobId)
    {
        return client.getAsyncFindResult(jobId);
    }
    

    /**
     * Answers the the first result of an asynchronous asyncFind.
     * Throws a NoSuchElement exception if there are no results.
     * This Processor can be executed Processor up to 20 times within a 30 day time period to
     * retrieve the results of an asynchronous job.
     * 
     * Example:
     * {@sample.xml ../../../doc/mule-module-netsuite.xml.sample netsuite:get-async-find-first-result}
     * 
     * @param jobId the id of the job
     * @param pageIndex the page number the the async result
     * @return the first Record
     */
    @Processor
    public Record getAsyncFindFirstResult(String jobId)
    {
        return client.getAsyncFindResult(jobId).iterator().next();
    }
    
    /**
     * Populates fields on transaction line items with values from a related record,
     * in a similar way empty text boxes are prepopulated within the Netsuite UI
     * Example:
     * 
     * {@sample.xml ../../../doc/mule-module-netsuite.xml.sample netsuite:initialize}
     * 
     * @param type the type of record whose defaults values are used to populate the
     *            target record
     * @param recordType the target record type
     * @param id the target record id
     * @param idType the id type of the given record id
     * @return the initialized Record
     */
    @Processor
    public Record initialize(InitializeTypeEnum type,
                             RecordTypeEnum recordType,
                             String id,
                             @Optional @Default("INTERNAL") RecordIdType idType)
    {
        return (Record) client.initialize(type.toInitializeType(), from(recordType, id, idType));
    }

    @PostConstruct
    public void init()
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
