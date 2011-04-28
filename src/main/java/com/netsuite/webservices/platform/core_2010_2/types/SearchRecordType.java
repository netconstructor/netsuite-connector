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
    ACCOUNT("account"),
    @XmlEnumValue("accountingPeriod")
    ACCOUNTING_PERIOD("accountingPeriod"),
    @XmlEnumValue("bin")
    BIN("bin"),
    @XmlEnumValue("budget")
    BUDGET("budget"),
    @XmlEnumValue("calendarEvent")
    CALENDAR_EVENT("calendarEvent"),
    @XmlEnumValue("campaign")
    CAMPAIGN("campaign"),
    @XmlEnumValue("classification")
    CLASSIFICATION("classification"),
    @XmlEnumValue("contact")
    CONTACT("contact"),
    @XmlEnumValue("customer")
    CUSTOMER("customer"),
    @XmlEnumValue("customRecord")
    CUSTOM_RECORD("customRecord"),
    @XmlEnumValue("department")
    DEPARTMENT("department"),
    @XmlEnumValue("employee")
    EMPLOYEE("employee"),
    @XmlEnumValue("entityGroup")
    ENTITY_GROUP("entityGroup"),
    @XmlEnumValue("file")
    FILE("file"),
    @XmlEnumValue("folder")
    FOLDER("folder"),
    @XmlEnumValue("giftCertificate")
    GIFT_CERTIFICATE("giftCertificate"),
    @XmlEnumValue("groupMember")
    GROUP_MEMBER("groupMember"),
    @XmlEnumValue("item")
    ITEM("item"),
    @XmlEnumValue("issue")
    ISSUE("issue"),
    @XmlEnumValue("job")
    JOB("job"),
    @XmlEnumValue("location")
    LOCATION("location"),
    @XmlEnumValue("message")
    MESSAGE("message"),
    @XmlEnumValue("note")
    NOTE("note"),
    @XmlEnumValue("opportunity")
    OPPORTUNITY("opportunity"),
    @XmlEnumValue("partner")
    PARTNER("partner"),
    @XmlEnumValue("phoneCall")
    PHONE_CALL("phoneCall"),
    @XmlEnumValue("priceLevel")
    PRICE_LEVEL("priceLevel"),
    @XmlEnumValue("projectTask")
    PROJECT_TASK("projectTask"),
    @XmlEnumValue("promotionCode")
    PROMOTION_CODE("promotionCode"),
    @XmlEnumValue("salesRole")
    SALES_ROLE("salesRole"),
    @XmlEnumValue("solution")
    SOLUTION("solution"),
    @XmlEnumValue("siteCategory")
    SITE_CATEGORY("siteCategory"),
    @XmlEnumValue("subsidiary")
    SUBSIDIARY("subsidiary"),
    @XmlEnumValue("supportCase")
    SUPPORT_CASE("supportCase"),
    @XmlEnumValue("task")
    TASK("task"),
    @XmlEnumValue("timeBill")
    TIME_BILL("timeBill"),
    @XmlEnumValue("topic")
    TOPIC("topic"),
    @XmlEnumValue("transaction")
    TRANSACTION("transaction"),
    @XmlEnumValue("vendor")
    VENDOR("vendor");
    private final String value;

    SearchRecordType(String v) {
        value = v;
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

}
