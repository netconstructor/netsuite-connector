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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.UnhandledException;

import com.netsuite.webservices.platform.common_2010_2.AccountSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.AccountingPeriodSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.BinSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.BudgetSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.CalendarEventSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.CampaignSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.ClassificationSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.ContactSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.CustomRecordSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.CustomerSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.DepartmentSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.EntityGroupSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.FileSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.FolderSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.GiftCertificateSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.GroupMemberSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.IssueSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.ItemSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.JobSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.LocationSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.MessageSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.NoteSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.OpportunitySearchBasic;
import com.netsuite.webservices.platform.common_2010_2.PartnerSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.PhoneCallSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.PriceLevelSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.ProjectTaskSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.PromotionCodeSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.SalesRoleSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.SiteCategorySearchBasic;
import com.netsuite.webservices.platform.common_2010_2.SolutionSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.SubsidiarySearchBasic;
import com.netsuite.webservices.platform.common_2010_2.SupportCaseSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.TaskSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.TimeBillSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.TopicSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.TransactionSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.VendorSearchBasic;
import com.netsuite.webservices.platform.core_2010_2.SearchRecord;


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
    ACCOUNT("account", AccountSearchBasic.class),
    @XmlEnumValue("accountingPeriod")
    ACCOUNTING_PERIOD("accountingPeriod", AccountingPeriodSearchBasic.class),
    @XmlEnumValue("bin")
    BIN("bin", BinSearchBasic.class),
    @XmlEnumValue("budget")
    BUDGET("budget", BudgetSearchBasic.class),
    @XmlEnumValue("calendarEvent")
    CALENDAR_EVENT("calendarEvent", CalendarEventSearchBasic.class),
    @XmlEnumValue("campaign")
    CAMPAIGN("campaign", CampaignSearchBasic.class),
    @XmlEnumValue("classification")
    CLASSIFICATION("classification", ClassificationSearchBasic.class),
    @XmlEnumValue("contact")
    CONTACT("contact", ContactSearchBasic.class),
    @XmlEnumValue("customer")
    CUSTOMER("customer", CustomerSearchBasic.class),
    @XmlEnumValue("customRecord")
    CUSTOM_RECORD("customRecord", CustomRecordSearchBasic.class),
    @XmlEnumValue("department")
    DEPARTMENT("department", DepartmentSearchBasic.class),
    @XmlEnumValue("employee")
    EMPLOYEE("employee", EmployeeSearchBasic.class),
    @XmlEnumValue("entityGroup")
    ENTITY_GROUP("entityGroup", EntityGroupSearchBasic.class),
    @XmlEnumValue("file")
    FILE("file", FileSearchBasic.class),
    @XmlEnumValue("folder")
    FOLDER("folder", FolderSearchBasic.class),
    @XmlEnumValue("giftCertificate")
    GIFT_CERTIFICATE("giftCertificate", GiftCertificateSearchBasic.class),
    @XmlEnumValue("groupMember")
    GROUP_MEMBER("groupMember", GroupMemberSearchBasic.class),
    @XmlEnumValue("item")
    ITEM("item", ItemSearchBasic.class),
    @XmlEnumValue("issue")
    ISSUE("issue", IssueSearchBasic.class),
    @XmlEnumValue("job")
    JOB("job", JobSearchBasic.class),
    @XmlEnumValue("location")
    LOCATION("location", LocationSearchBasic.class),
    @XmlEnumValue("message")
    MESSAGE("message", MessageSearchBasic.class),
    @XmlEnumValue("note")
    NOTE("note", NoteSearchBasic.class),
    @XmlEnumValue("opportunity")
    OPPORTUNITY("opportunity", OpportunitySearchBasic.class),
    @XmlEnumValue("partner")
    PARTNER("partner", PartnerSearchBasic.class),
    @XmlEnumValue("phoneCall")
    PHONE_CALL("phoneCall", PhoneCallSearchBasic.class),
    @XmlEnumValue("priceLevel")
    PRICE_LEVEL("priceLevel", PriceLevelSearchBasic.class),
    @XmlEnumValue("projectTask")
    PROJECT_TASK("projectTask", ProjectTaskSearchBasic.class),
    @XmlEnumValue("promotionCode")
    PROMOTION_CODE("promotionCode", PromotionCodeSearchBasic.class),
    @XmlEnumValue("salesRole")
    SALES_ROLE("salesRole", SalesRoleSearchBasic.class),
    @XmlEnumValue("solution")
    SOLUTION("solution", SolutionSearchBasic.class),
    @XmlEnumValue("siteCategory")
    SITE_CATEGORY("siteCategory", SiteCategorySearchBasic.class),
    @XmlEnumValue("subsidiary")
    SUBSIDIARY("subsidiary", SubsidiarySearchBasic.class),
    @XmlEnumValue("supportCase")
    SUPPORT_CASE("supportCase", SupportCaseSearchBasic.class),
    @XmlEnumValue("task")
    TASK("task", TaskSearchBasic.class),
    @XmlEnumValue("timeBill")
    TIME_BILL("timeBill", TimeBillSearchBasic.class),
    @XmlEnumValue("topic")
    TOPIC("topic", TopicSearchBasic.class),
    @XmlEnumValue("transaction")
    TRANSACTION("transaction", TransactionSearchBasic.class),
    @XmlEnumValue("vendor")
    VENDOR("vendor", VendorSearchBasic.class);
    private final String value;
    private final Class<? extends SearchRecord> clazz;

    SearchRecordType(String v, Class<? extends SearchRecord> clazz) {
        value = v;
        this.clazz = clazz;
    }

    public String value() {
        return value;
    }

    public static SearchRecordType fromValue(String v) {
        for (SearchRecordType c: SearchRecordType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public SearchRecord newInstance()
    {
        try
        {
            return clazz.newInstance();
        } catch (Exception e)
        {
            throw new UnhandledException(e);
        }
    }

}
