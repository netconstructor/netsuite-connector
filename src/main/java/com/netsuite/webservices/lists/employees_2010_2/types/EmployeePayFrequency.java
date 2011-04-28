/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.lists.employees_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeePayFrequency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmployeePayFrequency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_annually"/>
 *     &lt;enumeration value="_custom"/>
 *     &lt;enumeration value="_daily"/>
 *     &lt;enumeration value="_endOfPeriod"/>
 *     &lt;enumeration value="_everyFourWeeks"/>
 *     &lt;enumeration value="_everyThreeYears"/>
 *     &lt;enumeration value="_everyTwoMonths"/>
 *     &lt;enumeration value="_everyTwoWeeks"/>
 *     &lt;enumeration value="_everyTwoYears"/>
 *     &lt;enumeration value="_monthly"/>
 *     &lt;enumeration value="_never"/>
 *     &lt;enumeration value="_oneTime"/>
 *     &lt;enumeration value="_quarterly"/>
 *     &lt;enumeration value="_startOfPeriod"/>
 *     &lt;enumeration value="_twiceAMonth"/>
 *     &lt;enumeration value="_twiceAYear"/>
 *     &lt;enumeration value="_weekly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmployeePayFrequency", namespace = "urn:types.employees_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum EmployeePayFrequency {

    @XmlEnumValue("_annually")
    ANNUALLY("_annually"),
    @XmlEnumValue("_custom")
    CUSTOM("_custom"),
    @XmlEnumValue("_daily")
    DAILY("_daily"),
    @XmlEnumValue("_endOfPeriod")
    END_OF_PERIOD("_endOfPeriod"),
    @XmlEnumValue("_everyFourWeeks")
    EVERY_FOUR_WEEKS("_everyFourWeeks"),
    @XmlEnumValue("_everyThreeYears")
    EVERY_THREE_YEARS("_everyThreeYears"),
    @XmlEnumValue("_everyTwoMonths")
    EVERY_TWO_MONTHS("_everyTwoMonths"),
    @XmlEnumValue("_everyTwoWeeks")
    EVERY_TWO_WEEKS("_everyTwoWeeks"),
    @XmlEnumValue("_everyTwoYears")
    EVERY_TWO_YEARS("_everyTwoYears"),
    @XmlEnumValue("_monthly")
    MONTHLY("_monthly"),
    @XmlEnumValue("_never")
    NEVER("_never"),
    @XmlEnumValue("_oneTime")
    ONE_TIME("_oneTime"),
    @XmlEnumValue("_quarterly")
    QUARTERLY("_quarterly"),
    @XmlEnumValue("_startOfPeriod")
    START_OF_PERIOD("_startOfPeriod"),
    @XmlEnumValue("_twiceAMonth")
    TWICE_A_MONTH("_twiceAMonth"),
    @XmlEnumValue("_twiceAYear")
    TWICE_A_YEAR("_twiceAYear"),
    @XmlEnumValue("_weekly")
    WEEKLY("_weekly");
    private final String value;

    EmployeePayFrequency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmployeePayFrequency fromValue(String v) {
        for (EmployeePayFrequency c: EmployeePayFrequency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
