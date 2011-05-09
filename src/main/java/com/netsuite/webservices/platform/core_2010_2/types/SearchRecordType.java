/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.platform.core_2010_2.types;

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
import com.netsuite.webservices.platform.core_2010_2.SearchRecord;
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

import java.nio.channels.UnsupportedAddressTypeException;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.UnhandledException;


/**
 * <p>Java class for SearchRecordType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchRecordType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="account"/>
 *     &lt;enumeration value="accountingPeriod"/>
 *     &lt;enumeration value="bin"/>
 *     &lt;enumeration value="budget"/>
 *     &lt;enumeration value="calendarEvent"/>
 *     &lt;enumeration value="campaign"/>
 *     &lt;enumeration value="classification"/>
 *     &lt;enumeration value="contact"/>
 *     &lt;enumeration value="customer"/>
 *     &lt;enumeration value="customRecord"/>
 *     &lt;enumeration value="department"/>
 *     &lt;enumeration value="employee"/>
 *     &lt;enumeration value="entityGroup"/>
 *     &lt;enumeration value="file"/>
 *     &lt;enumeration value="folder"/>
 *     &lt;enumeration value="giftCertificate"/>
 *     &lt;enumeration value="groupMember"/>
 *     &lt;enumeration value="item"/>
 *     &lt;enumeration value="issue"/>
 *     &lt;enumeration value="job"/>
 *     &lt;enumeration value="location"/>
 *     &lt;enumeration value="message"/>
 *     &lt;enumeration value="note"/>
 *     &lt;enumeration value="opportunity"/>
 *     &lt;enumeration value="partner"/>
 *     &lt;enumeration value="phoneCall"/>
 *     &lt;enumeration value="priceLevel"/>
 *     &lt;enumeration value="projectTask"/>
 *     &lt;enumeration value="promotionCode"/>
 *     &lt;enumeration value="salesRole"/>
 *     &lt;enumeration value="solution"/>
 *     &lt;enumeration value="siteCategory"/>
 *     &lt;enumeration value="subsidiary"/>
 *     &lt;enumeration value="supportCase"/>
 *     &lt;enumeration value="task"/>
 *     &lt;enumeration value="timeBill"/>
 *     &lt;enumeration value="topic"/>
 *     &lt;enumeration value="transaction"/>
 *     &lt;enumeration value="vendor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchRecordType", namespace = "urn:types.core_2010_2.platform.webservices.netsuite.com")
@XmlEnum
public enum SearchRecordType {



    @XmlEnumValue("account")
    ACCOUNT("account", AccountSearch.class, AccountSearchAdvanced.class),
    @XmlEnumValue("accountingPeriod")
    ACCOUNTING_PERIOD("accountingPeriod", AccountingPeriodSearch.class, AccountingPeriodSearchAdvanced.class),
    @XmlEnumValue("bin")
    BIN("bin", BinSearch.class, BinSearchAdvanced.class),
    @XmlEnumValue("budget")
    BUDGET("budget", BudgetSearch.class, BudgetSearchAdvanced.class),
    @XmlEnumValue("calendarEvent")
    CALENDAR_EVENT("calendarEvent", CalendarEventSearch.class, CalendarEventSearchAdvanced.class),
    @XmlEnumValue("campaign")
    CAMPAIGN("campaign", CampaignSearch.class, CampaignSearchAdvanced.class),
    @XmlEnumValue("classification")
    CLASSIFICATION("classification", ClassificationSearch.class, ClassificationSearchAdvanced.class),
    @XmlEnumValue("contact")
    CONTACT("contact", ContactSearch.class, ContactSearchAdvanced.class),
    @XmlEnumValue("customer")
    CUSTOMER("customer", CustomerSearch.class, CustomerSearchAdvanced.class),
    @XmlEnumValue("customRecord")
    CUSTOM_RECORD("customRecord", CustomRecordSearch.class, CustomRecordSearchAdvanced.class),
    @XmlEnumValue("department")
    DEPARTMENT("department", DepartmentSearch.class, DepartmentSearchAdvanced.class),
    @XmlEnumValue("employee")
    EMPLOYEE("employee", EmployeeSearch.class, EmployeeSearchAdvanced.class),
    @XmlEnumValue("entityGroup")
    ENTITY_GROUP("entityGroup", EntityGroupSearch.class, EntityGroupSearchAdvanced.class),
    @XmlEnumValue("file")
    FILE("file", FileSearch.class, FileSearchAdvanced.class),
    @XmlEnumValue("folder")
    FOLDER("folder", FolderSearch.class, FolderSearchAdvanced.class),
    @XmlEnumValue("giftCertificate")
    GIFT_CERTIFICATE("giftCertificate", GiftCertificateSearch.class, GiftCertificateSearchAdvanced.class),
    @XmlEnumValue("groupMember")
    GROUP_MEMBER("groupMember", GroupMemberSearchBasic.class, null),
    @XmlEnumValue("item")
    ITEM("item", ItemSearch.class, ItemSearchAdvanced.class),
    @XmlEnumValue("issue")
    ISSUE("issue", IssueSearch.class, IssueSearchAdvanced.class),
    @XmlEnumValue("job")
    JOB("job", JobSearch.class, JobSearchAdvanced.class),
    @XmlEnumValue("location")
    LOCATION("location", LocationSearch.class, LocationSearchAdvanced.class),
    @XmlEnumValue("message")
    MESSAGE("message", MessageSearch.class, MessageSearchAdvanced.class),
    @XmlEnumValue("note")
    NOTE("note", NoteSearch.class, NoteSearchAdvanced.class),
    @XmlEnumValue("opportunity")
    OPPORTUNITY("opportunity", OpportunitySearch.class, OpportunitySearchAdvanced.class),
    @XmlEnumValue("partner")
    PARTNER("partner", PartnerSearch.class, PartnerSearchAdvanced.class),
    @XmlEnumValue("phoneCall")
    PHONE_CALL("phoneCall", PhoneCallSearch.class, PhoneCallSearchAdvanced.class),
    @XmlEnumValue("priceLevel")
    PRICE_LEVEL("priceLevel", PriceLevelSearch.class, PriceLevelSearchAdvanced.class),
    @XmlEnumValue("projectTask")
    PROJECT_TASK("projectTask", ProjectTaskSearch.class, ProjectTaskSearchAdvanced.class),
    @XmlEnumValue("promotionCode")
    PROMOTION_CODE("promotionCode", PromotionCodeSearch.class, PromotionCodeSearchAdvanced.class),
    @XmlEnumValue("salesRole")
    SALES_ROLE("salesRole", SalesRoleSearch.class, SalesRoleSearchAdvanced.class),
    @XmlEnumValue("solution")
    SOLUTION("solution", SolutionSearch.class, SolutionSearchAdvanced.class),
    @XmlEnumValue("siteCategory")
    SITE_CATEGORY("siteCategory", SiteCategorySearch.class, SiteCategorySearchAdvanced.class),
    @XmlEnumValue("subsidiary")
    SUBSIDIARY("subsidiary", SubsidiarySearch.class, SubsidiarySearchAdvanced.class),
    @XmlEnumValue("supportCase")
    SUPPORT_CASE("supportCase", SupportCaseSearch.class, SupportCaseSearchAdvanced.class),
    @XmlEnumValue("task")
    TASK("task", TaskSearch.class, TaskSearchAdvanced.class),
    @XmlEnumValue("timeBill")
    TIME_BILL("timeBill", TimeBillSearch.class, TimeBillSearchAdvanced.class),
    @XmlEnumValue("topic")
    TOPIC("topic", TopicSearch.class, TopicSearchAdvanced.class),
    @XmlEnumValue("transaction")
    TRANSACTION("transaction", TransactionSearch.class, TransactionSearchAdvanced.class),
    @XmlEnumValue("vendor")
    VENDOR("vendor", VendorSearch.class, VendorSearchAdvanced.class);
    private final String value;
    private final Class<? extends SearchRecord> searchClass;
    private final Class<? extends SearchRecord> advancedSearchClass;

    SearchRecordType(String v, Class<? extends SearchRecord> searchClass, Class<? extends SearchRecord> advancedSearchClass) {
        value = v;
        this.searchClass = searchClass;
        this.advancedSearchClass = advancedSearchClass;
    }

    public String value() {
        return value;
    }

    public static SearchRecordType fromValue(String v)
    {
        for (SearchRecordType c : SearchRecordType.values())
        {
            if (c.value.equals(v))
            {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public SearchRecord newSearchInstance()
    {
        try
        {
            return searchClass.newInstance();
        }
        catch (Exception e)
        {
            throw new UnhandledException(e);
        }
    }

    public SearchRecord newAdvancedSearchInstance()
    {
        if (advancedSearchClass == null)
        {
            throw new UnsupportedOperationException();
        }
        try
        {
            return advancedSearchClass.newInstance();
        }
        catch (Exception e)
        {
            throw new UnhandledException(e);
        }
    }

}
