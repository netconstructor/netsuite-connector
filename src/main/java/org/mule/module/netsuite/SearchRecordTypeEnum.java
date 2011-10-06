/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite;

import com.netsuite.webservices.activities.scheduling_2010_2.CalendarEventSearch;
import com.netsuite.webservices.activities.scheduling_2010_2.CalendarEventSearchAdvanced;
import com.netsuite.webservices.activities.scheduling_2010_2.PhoneCallSearch;
import com.netsuite.webservices.activities.scheduling_2010_2.PhoneCallSearchAdvanced;
import com.netsuite.webservices.activities.scheduling_2010_2.ProjectTaskSearch;
import com.netsuite.webservices.activities.scheduling_2010_2.ProjectTaskSearchAdvanced;
import com.netsuite.webservices.activities.scheduling_2010_2.TaskSearch;
import com.netsuite.webservices.activities.scheduling_2010_2.TaskSearchAdvanced;
import com.netsuite.webservices.documents.filecabinet_2010_2.FileSearch;
import com.netsuite.webservices.documents.filecabinet_2010_2.FileSearchAdvanced;
import com.netsuite.webservices.documents.filecabinet_2010_2.FolderSearch;
import com.netsuite.webservices.documents.filecabinet_2010_2.FolderSearchAdvanced;
import com.netsuite.webservices.general.communication_2010_2.MessageSearch;
import com.netsuite.webservices.general.communication_2010_2.MessageSearchAdvanced;
import com.netsuite.webservices.general.communication_2010_2.NoteSearch;
import com.netsuite.webservices.general.communication_2010_2.NoteSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.AccountSearch;
import com.netsuite.webservices.lists.accounting_2010_2.AccountSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.AccountingPeriodSearch;
import com.netsuite.webservices.lists.accounting_2010_2.AccountingPeriodSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.BinSearch;
import com.netsuite.webservices.lists.accounting_2010_2.BinSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.ClassificationSearch;
import com.netsuite.webservices.lists.accounting_2010_2.ClassificationSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.DepartmentSearch;
import com.netsuite.webservices.lists.accounting_2010_2.DepartmentSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.GiftCertificateSearch;
import com.netsuite.webservices.lists.accounting_2010_2.GiftCertificateSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.ItemSearch;
import com.netsuite.webservices.lists.accounting_2010_2.ItemSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.LocationSearch;
import com.netsuite.webservices.lists.accounting_2010_2.LocationSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.PriceLevelSearch;
import com.netsuite.webservices.lists.accounting_2010_2.PriceLevelSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.SalesRoleSearch;
import com.netsuite.webservices.lists.accounting_2010_2.SalesRoleSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.SubsidiarySearch;
import com.netsuite.webservices.lists.accounting_2010_2.SubsidiarySearchAdvanced;
import com.netsuite.webservices.lists.employees_2010_2.EmployeeSearch;
import com.netsuite.webservices.lists.employees_2010_2.EmployeeSearchAdvanced;
import com.netsuite.webservices.lists.marketing_2010_2.CampaignSearch;
import com.netsuite.webservices.lists.marketing_2010_2.CampaignSearchAdvanced;
import com.netsuite.webservices.lists.marketing_2010_2.PromotionCodeSearch;
import com.netsuite.webservices.lists.marketing_2010_2.PromotionCodeSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2010_2.ContactSearch;
import com.netsuite.webservices.lists.relationships_2010_2.ContactSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2010_2.CustomerSearch;
import com.netsuite.webservices.lists.relationships_2010_2.CustomerSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2010_2.EntityGroupSearch;
import com.netsuite.webservices.lists.relationships_2010_2.EntityGroupSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2010_2.JobSearch;
import com.netsuite.webservices.lists.relationships_2010_2.JobSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2010_2.PartnerSearch;
import com.netsuite.webservices.lists.relationships_2010_2.PartnerSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2010_2.VendorSearch;
import com.netsuite.webservices.lists.relationships_2010_2.VendorSearchAdvanced;
import com.netsuite.webservices.lists.support_2010_2.IssueSearch;
import com.netsuite.webservices.lists.support_2010_2.IssueSearchAdvanced;
import com.netsuite.webservices.lists.support_2010_2.SolutionSearch;
import com.netsuite.webservices.lists.support_2010_2.SolutionSearchAdvanced;
import com.netsuite.webservices.lists.support_2010_2.SupportCaseSearch;
import com.netsuite.webservices.lists.support_2010_2.SupportCaseSearchAdvanced;
import com.netsuite.webservices.lists.support_2010_2.TopicSearch;
import com.netsuite.webservices.lists.support_2010_2.TopicSearchAdvanced;
import com.netsuite.webservices.lists.website_2010_2.SiteCategorySearch;
import com.netsuite.webservices.lists.website_2010_2.SiteCategorySearchAdvanced;
import com.netsuite.webservices.platform.common_2010_2.GroupMemberSearchBasic;
import com.netsuite.webservices.platform.core_2010_2.types.SearchRecordType;
import com.netsuite.webservices.setup.customization_2010_2.CustomRecordSearch;
import com.netsuite.webservices.setup.customization_2010_2.CustomRecordSearchAdvanced;
import com.netsuite.webservices.transactions.employees_2010_2.TimeBillSearch;
import com.netsuite.webservices.transactions.employees_2010_2.TimeBillSearchAdvanced;
import com.netsuite.webservices.transactions.financial_2010_2.BudgetSearch;
import com.netsuite.webservices.transactions.financial_2010_2.BudgetSearchAdvanced;
import com.netsuite.webservices.transactions.sales_2010_2.OpportunitySearch;
import com.netsuite.webservices.transactions.sales_2010_2.OpportunitySearchAdvanced;
import com.netsuite.webservices.transactions.sales_2010_2.TransactionSearch;
import com.netsuite.webservices.transactions.sales_2010_2.TransactionSearchAdvanced;

import javax.xml.bind.annotation.XmlEnumValue;

/**
 * 
 * SearchRecordType
 * @author flbulgarelli
 */
public enum SearchRecordTypeEnum
{
    ACCOUNT(SearchRecordType.ACCOUNT),
    ACCOUNTING_PERIOD(SearchRecordType.ACCOUNTING_PERIOD),
    BIN(SearchRecordType.BIN),
    BUDGET(SearchRecordType.BUDGET),
    CALENDAR_EVENT(SearchRecordType.CALENDAR_EVENT),
    CAMPAIGN(SearchRecordType.CAMPAIGN),
    CLASSIFICATION(SearchRecordType.CLASSIFICATION),
    CONTACT(SearchRecordType.CONTACT),
    CUSTOMER(SearchRecordType.CUSTOMER),
    CUSTOM_RECORD(SearchRecordType.CUSTOM_RECORD),
    DEPARTMENT(SearchRecordType.DEPARTMENT),
    EMPLOYEE(SearchRecordType.EMPLOYEE),
    ENTITY_GROUP(SearchRecordType.ENTITY_GROUP),
    FILE(SearchRecordType.FILE),
    FOLDER(SearchRecordType.FOLDER),
    GIFT_CERTIFICATE(SearchRecordType.GIFT_CERTIFICATE),
    GROUP_MEMBER(SearchRecordType.GROUP_MEMBER),
    ITEM(SearchRecordType.ITEM),
    ISSUE(SearchRecordType.ISSUE),
    JOB(SearchRecordType.JOB),
    LOCATION(SearchRecordType.LOCATION),
    MESSAGE(SearchRecordType.MESSAGE),
    NOTE(SearchRecordType.NOTE),
    OPPORTUNITY(SearchRecordType.OPPORTUNITY),
    PARTNER(SearchRecordType.PARTNER),
    PHONE_CALL(SearchRecordType.PHONE_CALL),
    PRICE_LEVEL(SearchRecordType.PRICE_LEVEL),
    PROJECT_TASK(SearchRecordType.PROJECT_TASK),
    PROMOTION_CODE(SearchRecordType.PROMOTION_CODE),
    SALES_ROLE(SearchRecordType.SALES_ROLE),
    SOLUTION(SearchRecordType.SOLUTION),
    SITE_CATEGORY(SearchRecordType.SITE_CATEGORY),
    SUBSIDIARY(SearchRecordType.SUBSIDIARY),
    SUPPORT_CASE(SearchRecordType.SUPPORT_CASE),
    TASK(SearchRecordType.TASK),
    TIME_BILL(SearchRecordType.TIME_BILL),
    TOPIC(SearchRecordType.TOPIC),
    TRANSACTION(SearchRecordType.TRANSACTION),
    VENDOR(SearchRecordType.VENDOR);
        
    private SearchRecordType value;
        

    private SearchRecordTypeEnum(SearchRecordType value)
    {
        this.value = value;
    }


    public SearchRecordType toSearchRecordType()
    {
        return value;
    }
}


