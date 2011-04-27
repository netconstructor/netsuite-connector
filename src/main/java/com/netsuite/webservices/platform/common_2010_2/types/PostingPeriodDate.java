
package com.netsuite.webservices.platform.common_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingPeriodDate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PostingPeriodDate">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_firstQtrOfLastFy"/>
 *     &lt;enumeration value="_firstQtrOfThisFy"/>
 *     &lt;enumeration value="_fiscalYearBeforeLast"/>
 *     &lt;enumeration value="_fourthQtrOfLastFy"/>
 *     &lt;enumeration value="_fourthQtrOfThisFy"/>
 *     &lt;enumeration value="_lastFiscalYear"/>
 *     &lt;enumeration value="_lastPeriod"/>
 *     &lt;enumeration value="_lastPeriodOneQtrAgo"/>
 *     &lt;enumeration value="_lastPeriodOneYearAgo"/>
 *     &lt;enumeration value="_lastQtrOfOneYearAgo"/>
 *     &lt;enumeration value="_lastQuarter"/>
 *     &lt;enumeration value="_periodBeforeLast"/>
 *     &lt;enumeration value="_quarterBeforeLast"/>
 *     &lt;enumeration value="_samePeriodOfLastFy"/>
 *     &lt;enumeration value="_samePeriodOfLastQtr"/>
 *     &lt;enumeration value="_sameQtrOfLastFy"/>
 *     &lt;enumeration value="_secondQtrOfLastFy"/>
 *     &lt;enumeration value="_secondQtrOfThisFy"/>
 *     &lt;enumeration value="_thirdQtrOfLastFy"/>
 *     &lt;enumeration value="_thirdQtrOfThisFy"/>
 *     &lt;enumeration value="_thisFiscalYear"/>
 *     &lt;enumeration value="_thisPeriod"/>
 *     &lt;enumeration value="_thisQuarter"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PostingPeriodDate", namespace = "urn:types.common_2010_2.platform.webservices.netsuite.com")
@XmlEnum
public enum PostingPeriodDate {

    @XmlEnumValue("_firstQtrOfLastFy")
    FIRST_QTR_OF_LAST_FY("_firstQtrOfLastFy"),
    @XmlEnumValue("_firstQtrOfThisFy")
    FIRST_QTR_OF_THIS_FY("_firstQtrOfThisFy"),
    @XmlEnumValue("_fiscalYearBeforeLast")
    FISCAL_YEAR_BEFORE_LAST("_fiscalYearBeforeLast"),
    @XmlEnumValue("_fourthQtrOfLastFy")
    FOURTH_QTR_OF_LAST_FY("_fourthQtrOfLastFy"),
    @XmlEnumValue("_fourthQtrOfThisFy")
    FOURTH_QTR_OF_THIS_FY("_fourthQtrOfThisFy"),
    @XmlEnumValue("_lastFiscalYear")
    LAST_FISCAL_YEAR("_lastFiscalYear"),
    @XmlEnumValue("_lastPeriod")
    LAST_PERIOD("_lastPeriod"),
    @XmlEnumValue("_lastPeriodOneQtrAgo")
    LAST_PERIOD_ONE_QTR_AGO("_lastPeriodOneQtrAgo"),
    @XmlEnumValue("_lastPeriodOneYearAgo")
    LAST_PERIOD_ONE_YEAR_AGO("_lastPeriodOneYearAgo"),
    @XmlEnumValue("_lastQtrOfOneYearAgo")
    LAST_QTR_OF_ONE_YEAR_AGO("_lastQtrOfOneYearAgo"),
    @XmlEnumValue("_lastQuarter")
    LAST_QUARTER("_lastQuarter"),
    @XmlEnumValue("_periodBeforeLast")
    PERIOD_BEFORE_LAST("_periodBeforeLast"),
    @XmlEnumValue("_quarterBeforeLast")
    QUARTER_BEFORE_LAST("_quarterBeforeLast"),
    @XmlEnumValue("_samePeriodOfLastFy")
    SAME_PERIOD_OF_LAST_FY("_samePeriodOfLastFy"),
    @XmlEnumValue("_samePeriodOfLastQtr")
    SAME_PERIOD_OF_LAST_QTR("_samePeriodOfLastQtr"),
    @XmlEnumValue("_sameQtrOfLastFy")
    SAME_QTR_OF_LAST_FY("_sameQtrOfLastFy"),
    @XmlEnumValue("_secondQtrOfLastFy")
    SECOND_QTR_OF_LAST_FY("_secondQtrOfLastFy"),
    @XmlEnumValue("_secondQtrOfThisFy")
    SECOND_QTR_OF_THIS_FY("_secondQtrOfThisFy"),
    @XmlEnumValue("_thirdQtrOfLastFy")
    THIRD_QTR_OF_LAST_FY("_thirdQtrOfLastFy"),
    @XmlEnumValue("_thirdQtrOfThisFy")
    THIRD_QTR_OF_THIS_FY("_thirdQtrOfThisFy"),
    @XmlEnumValue("_thisFiscalYear")
    THIS_FISCAL_YEAR("_thisFiscalYear"),
    @XmlEnumValue("_thisPeriod")
    THIS_PERIOD("_thisPeriod"),
    @XmlEnumValue("_thisQuarter")
    THIS_QUARTER("_thisQuarter");
    private final String value;

    PostingPeriodDate(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PostingPeriodDate fromValue(String v) {
        for (PostingPeriodDate c: PostingPeriodDate.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
