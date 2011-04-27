
package com.netsuite.webservices.platform.core_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchDate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchDate">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="fiscalHalfBeforeLast"/>
 *     &lt;enumeration value="fiscalHalfBeforeLastToDate"/>
 *     &lt;enumeration value="fiscalQuarterBeforeLast"/>
 *     &lt;enumeration value="fiscalQuarterBeforeLastToDate"/>
 *     &lt;enumeration value="fiscalYearBeforeLast"/>
 *     &lt;enumeration value="fiscalYearBeforeLastToDate"/>
 *     &lt;enumeration value="lastBusinessWeek"/>
 *     &lt;enumeration value="lastFiscalHalf"/>
 *     &lt;enumeration value="lastFiscalHalfOneYearAgo"/>
 *     &lt;enumeration value="lastFiscalHalfToDate"/>
 *     &lt;enumeration value="lastFiscalQuarter"/>
 *     &lt;enumeration value="lastFiscalQuarterOneYearAgo"/>
 *     &lt;enumeration value="lastFiscalQuarterToDate"/>
 *     &lt;enumeration value="lastFiscalYear"/>
 *     &lt;enumeration value="lastFiscalYearToDate"/>
 *     &lt;enumeration value="lastMonth"/>
 *     &lt;enumeration value="lastMonthOneQuarterAgo"/>
 *     &lt;enumeration value="lastMonthOneYearAgo"/>
 *     &lt;enumeration value="lastMonthToDate"/>
 *     &lt;enumeration value="lastMonthTwoQuartersAgo"/>
 *     &lt;enumeration value="lastMonthTwoYearsAgo"/>
 *     &lt;enumeration value="lastQuarterTwoYearsAgo"/>
 *     &lt;enumeration value="lastRollingHalf"/>
 *     &lt;enumeration value="lastRollingQuarter"/>
 *     &lt;enumeration value="lastRollingYear"/>
 *     &lt;enumeration value="lastWeek"/>
 *     &lt;enumeration value="lastWeekToDate"/>
 *     &lt;enumeration value="monthBeforeLast"/>
 *     &lt;enumeration value="monthBeforeLastToDate"/>
 *     &lt;enumeration value="nextBusinessWeek"/>
 *     &lt;enumeration value="nextFiscalHalf"/>
 *     &lt;enumeration value="nextFiscalQuarter"/>
 *     &lt;enumeration value="nextFiscalYear"/>
 *     &lt;enumeration value="nextFourWeeks"/>
 *     &lt;enumeration value="nextMonth"/>
 *     &lt;enumeration value="nextOneHalf"/>
 *     &lt;enumeration value="nextOneMonth"/>
 *     &lt;enumeration value="nextOneQuarter"/>
 *     &lt;enumeration value="nextOneWeek"/>
 *     &lt;enumeration value="nextOneYear"/>
 *     &lt;enumeration value="nextWeek"/>
 *     &lt;enumeration value="oneYearBeforeLast"/>
 *     &lt;enumeration value="previousMonthsLastFiscalHalf"/>
 *     &lt;enumeration value="previousMonthsLastFiscalQuarter"/>
 *     &lt;enumeration value="previousMonthsLastFiscalYear"/>
 *     &lt;enumeration value="previousMonthsSameFiscalHalfLastYear"/>
 *     &lt;enumeration value="previousMonthsSameFiscalQuartherLastFiscalYear"/>
 *     &lt;enumeration value="previousMonthsThisFiscalHalf"/>
 *     &lt;enumeration value="previousMonthsThisFiscalQuarter"/>
 *     &lt;enumeration value="previousMonthsThisFiscalYear"/>
 *     &lt;enumeration value="previousOneDay"/>
 *     &lt;enumeration value="previousOneHalf"/>
 *     &lt;enumeration value="previousOneMonth"/>
 *     &lt;enumeration value="previousOneQuarter"/>
 *     &lt;enumeration value="previousOneWeek"/>
 *     &lt;enumeration value="previousOneYear"/>
 *     &lt;enumeration value="previousQuartersLastFiscalYear"/>
 *     &lt;enumeration value="previousQuartersThisFiscalYear"/>
 *     &lt;enumeration value="previousRollingHalf"/>
 *     &lt;enumeration value="previousRollingQuarter"/>
 *     &lt;enumeration value="previousRollingYear"/>
 *     &lt;enumeration value="sameDayFiscalQuarterBeforeLast"/>
 *     &lt;enumeration value="sameDayFiscalYearBeforeLast"/>
 *     &lt;enumeration value="sameDayLastFiscalQuarter"/>
 *     &lt;enumeration value="sameDayLastFiscalYear"/>
 *     &lt;enumeration value="sameDayLastMonth"/>
 *     &lt;enumeration value="sameDayLastWeek"/>
 *     &lt;enumeration value="sameDayMonthBeforeLast"/>
 *     &lt;enumeration value="sameDayWeekBeforeLast"/>
 *     &lt;enumeration value="sameFiscalQuarterFiscalYearBeforeLast"/>
 *     &lt;enumeration value="sameHalfLastFiscalYearToDate"/>
 *     &lt;enumeration value="sameMonthFiscalQuarterBeforeLast"/>
 *     &lt;enumeration value="sameMonthFiscalYearBeforeLast"/>
 *     &lt;enumeration value="sameMonthLastFiscalQuarter"/>
 *     &lt;enumeration value="sameMonthLastFiscalQuarterToDate"/>
 *     &lt;enumeration value="sameMonthLastFiscalYear"/>
 *     &lt;enumeration value="sameMonthLastFiscalYearToDate"/>
 *     &lt;enumeration value="sameQuarterLastFiscalYear"/>
 *     &lt;enumeration value="sameQuarterLastFiscalYearToDate"/>
 *     &lt;enumeration value="sameWeekFiscalYearBeforeLast"/>
 *     &lt;enumeration value="sameWeekLastFiscalYear"/>
 *     &lt;enumeration value="startOfLastBusinessWeek"/>
 *     &lt;enumeration value="startOfLastFiscalHalf"/>
 *     &lt;enumeration value="startOfLastFiscalQuarter"/>
 *     &lt;enumeration value="startOfLastFiscalYear"/>
 *     &lt;enumeration value="startOfLastHalfOneYearAgo"/>
 *     &lt;enumeration value="startOfLastMonth"/>
 *     &lt;enumeration value="startOfLastMonthOneQuarterAgo"/>
 *     &lt;enumeration value="startOfLastMonthOneYearAgo"/>
 *     &lt;enumeration value="startOfLastQuarterOneYearAgo"/>
 *     &lt;enumeration value="startOfLastRollingHalf"/>
 *     &lt;enumeration value="startOfLastRollingQuarter"/>
 *     &lt;enumeration value="startOfLastRollingYear"/>
 *     &lt;enumeration value="startOfLastWeek"/>
 *     &lt;enumeration value="startOfNextBusinessWeek"/>
 *     &lt;enumeration value="startOfNextFiscalHalf"/>
 *     &lt;enumeration value="startOfNextFiscalQuarter"/>
 *     &lt;enumeration value="startOfNextMonth"/>
 *     &lt;enumeration value="startOfNextWeek"/>
 *     &lt;enumeration value="startOfNextYear"/>
 *     &lt;enumeration value="startOfPreviousRollingHalf"/>
 *     &lt;enumeration value="startOfPreviousRollingQuarter"/>
 *     &lt;enumeration value="startOfPreviousRollingYear"/>
 *     &lt;enumeration value="startOfSameHalfLastFiscalYear"/>
 *     &lt;enumeration value="startOfSameMonthLastFiscalQuarter"/>
 *     &lt;enumeration value="startOfSameMonthLastFiscalYear"/>
 *     &lt;enumeration value="startOfSameQuarterLastFiscalYear"/>
 *     &lt;enumeration value="startOfTheHalfBeforeLast"/>
 *     &lt;enumeration value="startOfTheMonthBeforeLast"/>
 *     &lt;enumeration value="startOfTheQuarterBeforeLast"/>
 *     &lt;enumeration value="startOfTheWeekBeforeLast"/>
 *     &lt;enumeration value="startOfTheYearBeforeLast"/>
 *     &lt;enumeration value="startOfThisBusinessWeek"/>
 *     &lt;enumeration value="startOfThisFiscalHalf"/>
 *     &lt;enumeration value="startOfThisFiscalQuarter"/>
 *     &lt;enumeration value="startOfThisFiscalYear"/>
 *     &lt;enumeration value="startOfThisMonth"/>
 *     &lt;enumeration value="startOfThisWeek"/>
 *     &lt;enumeration value="startOfThisYear"/>
 *     &lt;enumeration value="thisBusinessWeek"/>
 *     &lt;enumeration value="thisFiscalHalf"/>
 *     &lt;enumeration value="thisFiscalHalfToDate"/>
 *     &lt;enumeration value="thisFiscalQuarter"/>
 *     &lt;enumeration value="thisFiscalQuarterToDate"/>
 *     &lt;enumeration value="thisFiscalYear"/>
 *     &lt;enumeration value="thisFiscalYearToDate"/>
 *     &lt;enumeration value="thisMonth"/>
 *     &lt;enumeration value="thisMonthToDate"/>
 *     &lt;enumeration value="thisRollingHalf"/>
 *     &lt;enumeration value="thisRollingQuarter"/>
 *     &lt;enumeration value="thisRollingYear"/>
 *     &lt;enumeration value="thisWeek"/>
 *     &lt;enumeration value="thisWeekToDate"/>
 *     &lt;enumeration value="thisYear"/>
 *     &lt;enumeration value="threeMonthAgo"/>
 *     &lt;enumeration value="threeQuartersAgo"/>
 *     &lt;enumeration value="threeYearsAgo"/>
 *     &lt;enumeration value="today"/>
 *     &lt;enumeration value="tomorrow"/>
 *     &lt;enumeration value="twoDaysAgo"/>
 *     &lt;enumeration value="weekBeforeLast"/>
 *     &lt;enumeration value="weekBeforeLastToDate"/>
 *     &lt;enumeration value="yesterday"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchDate", namespace = "urn:types.core_2010_2.platform.webservices.netsuite.com")
@XmlEnum
public enum SearchDate {

    @XmlEnumValue("fiscalHalfBeforeLast")
    FISCAL_HALF_BEFORE_LAST("fiscalHalfBeforeLast"),
    @XmlEnumValue("fiscalHalfBeforeLastToDate")
    FISCAL_HALF_BEFORE_LAST_TO_DATE("fiscalHalfBeforeLastToDate"),
    @XmlEnumValue("fiscalQuarterBeforeLast")
    FISCAL_QUARTER_BEFORE_LAST("fiscalQuarterBeforeLast"),
    @XmlEnumValue("fiscalQuarterBeforeLastToDate")
    FISCAL_QUARTER_BEFORE_LAST_TO_DATE("fiscalQuarterBeforeLastToDate"),
    @XmlEnumValue("fiscalYearBeforeLast")
    FISCAL_YEAR_BEFORE_LAST("fiscalYearBeforeLast"),
    @XmlEnumValue("fiscalYearBeforeLastToDate")
    FISCAL_YEAR_BEFORE_LAST_TO_DATE("fiscalYearBeforeLastToDate"),
    @XmlEnumValue("lastBusinessWeek")
    LAST_BUSINESS_WEEK("lastBusinessWeek"),
    @XmlEnumValue("lastFiscalHalf")
    LAST_FISCAL_HALF("lastFiscalHalf"),
    @XmlEnumValue("lastFiscalHalfOneYearAgo")
    LAST_FISCAL_HALF_ONE_YEAR_AGO("lastFiscalHalfOneYearAgo"),
    @XmlEnumValue("lastFiscalHalfToDate")
    LAST_FISCAL_HALF_TO_DATE("lastFiscalHalfToDate"),
    @XmlEnumValue("lastFiscalQuarter")
    LAST_FISCAL_QUARTER("lastFiscalQuarter"),
    @XmlEnumValue("lastFiscalQuarterOneYearAgo")
    LAST_FISCAL_QUARTER_ONE_YEAR_AGO("lastFiscalQuarterOneYearAgo"),
    @XmlEnumValue("lastFiscalQuarterToDate")
    LAST_FISCAL_QUARTER_TO_DATE("lastFiscalQuarterToDate"),
    @XmlEnumValue("lastFiscalYear")
    LAST_FISCAL_YEAR("lastFiscalYear"),
    @XmlEnumValue("lastFiscalYearToDate")
    LAST_FISCAL_YEAR_TO_DATE("lastFiscalYearToDate"),
    @XmlEnumValue("lastMonth")
    LAST_MONTH("lastMonth"),
    @XmlEnumValue("lastMonthOneQuarterAgo")
    LAST_MONTH_ONE_QUARTER_AGO("lastMonthOneQuarterAgo"),
    @XmlEnumValue("lastMonthOneYearAgo")
    LAST_MONTH_ONE_YEAR_AGO("lastMonthOneYearAgo"),
    @XmlEnumValue("lastMonthToDate")
    LAST_MONTH_TO_DATE("lastMonthToDate"),
    @XmlEnumValue("lastMonthTwoQuartersAgo")
    LAST_MONTH_TWO_QUARTERS_AGO("lastMonthTwoQuartersAgo"),
    @XmlEnumValue("lastMonthTwoYearsAgo")
    LAST_MONTH_TWO_YEARS_AGO("lastMonthTwoYearsAgo"),
    @XmlEnumValue("lastQuarterTwoYearsAgo")
    LAST_QUARTER_TWO_YEARS_AGO("lastQuarterTwoYearsAgo"),
    @XmlEnumValue("lastRollingHalf")
    LAST_ROLLING_HALF("lastRollingHalf"),
    @XmlEnumValue("lastRollingQuarter")
    LAST_ROLLING_QUARTER("lastRollingQuarter"),
    @XmlEnumValue("lastRollingYear")
    LAST_ROLLING_YEAR("lastRollingYear"),
    @XmlEnumValue("lastWeek")
    LAST_WEEK("lastWeek"),
    @XmlEnumValue("lastWeekToDate")
    LAST_WEEK_TO_DATE("lastWeekToDate"),
    @XmlEnumValue("monthBeforeLast")
    MONTH_BEFORE_LAST("monthBeforeLast"),
    @XmlEnumValue("monthBeforeLastToDate")
    MONTH_BEFORE_LAST_TO_DATE("monthBeforeLastToDate"),
    @XmlEnumValue("nextBusinessWeek")
    NEXT_BUSINESS_WEEK("nextBusinessWeek"),
    @XmlEnumValue("nextFiscalHalf")
    NEXT_FISCAL_HALF("nextFiscalHalf"),
    @XmlEnumValue("nextFiscalQuarter")
    NEXT_FISCAL_QUARTER("nextFiscalQuarter"),
    @XmlEnumValue("nextFiscalYear")
    NEXT_FISCAL_YEAR("nextFiscalYear"),
    @XmlEnumValue("nextFourWeeks")
    NEXT_FOUR_WEEKS("nextFourWeeks"),
    @XmlEnumValue("nextMonth")
    NEXT_MONTH("nextMonth"),
    @XmlEnumValue("nextOneHalf")
    NEXT_ONE_HALF("nextOneHalf"),
    @XmlEnumValue("nextOneMonth")
    NEXT_ONE_MONTH("nextOneMonth"),
    @XmlEnumValue("nextOneQuarter")
    NEXT_ONE_QUARTER("nextOneQuarter"),
    @XmlEnumValue("nextOneWeek")
    NEXT_ONE_WEEK("nextOneWeek"),
    @XmlEnumValue("nextOneYear")
    NEXT_ONE_YEAR("nextOneYear"),
    @XmlEnumValue("nextWeek")
    NEXT_WEEK("nextWeek"),
    @XmlEnumValue("oneYearBeforeLast")
    ONE_YEAR_BEFORE_LAST("oneYearBeforeLast"),
    @XmlEnumValue("previousMonthsLastFiscalHalf")
    PREVIOUS_MONTHS_LAST_FISCAL_HALF("previousMonthsLastFiscalHalf"),
    @XmlEnumValue("previousMonthsLastFiscalQuarter")
    PREVIOUS_MONTHS_LAST_FISCAL_QUARTER("previousMonthsLastFiscalQuarter"),
    @XmlEnumValue("previousMonthsLastFiscalYear")
    PREVIOUS_MONTHS_LAST_FISCAL_YEAR("previousMonthsLastFiscalYear"),
    @XmlEnumValue("previousMonthsSameFiscalHalfLastYear")
    PREVIOUS_MONTHS_SAME_FISCAL_HALF_LAST_YEAR("previousMonthsSameFiscalHalfLastYear"),
    @XmlEnumValue("previousMonthsSameFiscalQuartherLastFiscalYear")
    PREVIOUS_MONTHS_SAME_FISCAL_QUARTHER_LAST_FISCAL_YEAR("previousMonthsSameFiscalQuartherLastFiscalYear"),
    @XmlEnumValue("previousMonthsThisFiscalHalf")
    PREVIOUS_MONTHS_THIS_FISCAL_HALF("previousMonthsThisFiscalHalf"),
    @XmlEnumValue("previousMonthsThisFiscalQuarter")
    PREVIOUS_MONTHS_THIS_FISCAL_QUARTER("previousMonthsThisFiscalQuarter"),
    @XmlEnumValue("previousMonthsThisFiscalYear")
    PREVIOUS_MONTHS_THIS_FISCAL_YEAR("previousMonthsThisFiscalYear"),
    @XmlEnumValue("previousOneDay")
    PREVIOUS_ONE_DAY("previousOneDay"),
    @XmlEnumValue("previousOneHalf")
    PREVIOUS_ONE_HALF("previousOneHalf"),
    @XmlEnumValue("previousOneMonth")
    PREVIOUS_ONE_MONTH("previousOneMonth"),
    @XmlEnumValue("previousOneQuarter")
    PREVIOUS_ONE_QUARTER("previousOneQuarter"),
    @XmlEnumValue("previousOneWeek")
    PREVIOUS_ONE_WEEK("previousOneWeek"),
    @XmlEnumValue("previousOneYear")
    PREVIOUS_ONE_YEAR("previousOneYear"),
    @XmlEnumValue("previousQuartersLastFiscalYear")
    PREVIOUS_QUARTERS_LAST_FISCAL_YEAR("previousQuartersLastFiscalYear"),
    @XmlEnumValue("previousQuartersThisFiscalYear")
    PREVIOUS_QUARTERS_THIS_FISCAL_YEAR("previousQuartersThisFiscalYear"),
    @XmlEnumValue("previousRollingHalf")
    PREVIOUS_ROLLING_HALF("previousRollingHalf"),
    @XmlEnumValue("previousRollingQuarter")
    PREVIOUS_ROLLING_QUARTER("previousRollingQuarter"),
    @XmlEnumValue("previousRollingYear")
    PREVIOUS_ROLLING_YEAR("previousRollingYear"),
    @XmlEnumValue("sameDayFiscalQuarterBeforeLast")
    SAME_DAY_FISCAL_QUARTER_BEFORE_LAST("sameDayFiscalQuarterBeforeLast"),
    @XmlEnumValue("sameDayFiscalYearBeforeLast")
    SAME_DAY_FISCAL_YEAR_BEFORE_LAST("sameDayFiscalYearBeforeLast"),
    @XmlEnumValue("sameDayLastFiscalQuarter")
    SAME_DAY_LAST_FISCAL_QUARTER("sameDayLastFiscalQuarter"),
    @XmlEnumValue("sameDayLastFiscalYear")
    SAME_DAY_LAST_FISCAL_YEAR("sameDayLastFiscalYear"),
    @XmlEnumValue("sameDayLastMonth")
    SAME_DAY_LAST_MONTH("sameDayLastMonth"),
    @XmlEnumValue("sameDayLastWeek")
    SAME_DAY_LAST_WEEK("sameDayLastWeek"),
    @XmlEnumValue("sameDayMonthBeforeLast")
    SAME_DAY_MONTH_BEFORE_LAST("sameDayMonthBeforeLast"),
    @XmlEnumValue("sameDayWeekBeforeLast")
    SAME_DAY_WEEK_BEFORE_LAST("sameDayWeekBeforeLast"),
    @XmlEnumValue("sameFiscalQuarterFiscalYearBeforeLast")
    SAME_FISCAL_QUARTER_FISCAL_YEAR_BEFORE_LAST("sameFiscalQuarterFiscalYearBeforeLast"),
    @XmlEnumValue("sameHalfLastFiscalYearToDate")
    SAME_HALF_LAST_FISCAL_YEAR_TO_DATE("sameHalfLastFiscalYearToDate"),
    @XmlEnumValue("sameMonthFiscalQuarterBeforeLast")
    SAME_MONTH_FISCAL_QUARTER_BEFORE_LAST("sameMonthFiscalQuarterBeforeLast"),
    @XmlEnumValue("sameMonthFiscalYearBeforeLast")
    SAME_MONTH_FISCAL_YEAR_BEFORE_LAST("sameMonthFiscalYearBeforeLast"),
    @XmlEnumValue("sameMonthLastFiscalQuarter")
    SAME_MONTH_LAST_FISCAL_QUARTER("sameMonthLastFiscalQuarter"),
    @XmlEnumValue("sameMonthLastFiscalQuarterToDate")
    SAME_MONTH_LAST_FISCAL_QUARTER_TO_DATE("sameMonthLastFiscalQuarterToDate"),
    @XmlEnumValue("sameMonthLastFiscalYear")
    SAME_MONTH_LAST_FISCAL_YEAR("sameMonthLastFiscalYear"),
    @XmlEnumValue("sameMonthLastFiscalYearToDate")
    SAME_MONTH_LAST_FISCAL_YEAR_TO_DATE("sameMonthLastFiscalYearToDate"),
    @XmlEnumValue("sameQuarterLastFiscalYear")
    SAME_QUARTER_LAST_FISCAL_YEAR("sameQuarterLastFiscalYear"),
    @XmlEnumValue("sameQuarterLastFiscalYearToDate")
    SAME_QUARTER_LAST_FISCAL_YEAR_TO_DATE("sameQuarterLastFiscalYearToDate"),
    @XmlEnumValue("sameWeekFiscalYearBeforeLast")
    SAME_WEEK_FISCAL_YEAR_BEFORE_LAST("sameWeekFiscalYearBeforeLast"),
    @XmlEnumValue("sameWeekLastFiscalYear")
    SAME_WEEK_LAST_FISCAL_YEAR("sameWeekLastFiscalYear"),
    @XmlEnumValue("startOfLastBusinessWeek")
    START_OF_LAST_BUSINESS_WEEK("startOfLastBusinessWeek"),
    @XmlEnumValue("startOfLastFiscalHalf")
    START_OF_LAST_FISCAL_HALF("startOfLastFiscalHalf"),
    @XmlEnumValue("startOfLastFiscalQuarter")
    START_OF_LAST_FISCAL_QUARTER("startOfLastFiscalQuarter"),
    @XmlEnumValue("startOfLastFiscalYear")
    START_OF_LAST_FISCAL_YEAR("startOfLastFiscalYear"),
    @XmlEnumValue("startOfLastHalfOneYearAgo")
    START_OF_LAST_HALF_ONE_YEAR_AGO("startOfLastHalfOneYearAgo"),
    @XmlEnumValue("startOfLastMonth")
    START_OF_LAST_MONTH("startOfLastMonth"),
    @XmlEnumValue("startOfLastMonthOneQuarterAgo")
    START_OF_LAST_MONTH_ONE_QUARTER_AGO("startOfLastMonthOneQuarterAgo"),
    @XmlEnumValue("startOfLastMonthOneYearAgo")
    START_OF_LAST_MONTH_ONE_YEAR_AGO("startOfLastMonthOneYearAgo"),
    @XmlEnumValue("startOfLastQuarterOneYearAgo")
    START_OF_LAST_QUARTER_ONE_YEAR_AGO("startOfLastQuarterOneYearAgo"),
    @XmlEnumValue("startOfLastRollingHalf")
    START_OF_LAST_ROLLING_HALF("startOfLastRollingHalf"),
    @XmlEnumValue("startOfLastRollingQuarter")
    START_OF_LAST_ROLLING_QUARTER("startOfLastRollingQuarter"),
    @XmlEnumValue("startOfLastRollingYear")
    START_OF_LAST_ROLLING_YEAR("startOfLastRollingYear"),
    @XmlEnumValue("startOfLastWeek")
    START_OF_LAST_WEEK("startOfLastWeek"),
    @XmlEnumValue("startOfNextBusinessWeek")
    START_OF_NEXT_BUSINESS_WEEK("startOfNextBusinessWeek"),
    @XmlEnumValue("startOfNextFiscalHalf")
    START_OF_NEXT_FISCAL_HALF("startOfNextFiscalHalf"),
    @XmlEnumValue("startOfNextFiscalQuarter")
    START_OF_NEXT_FISCAL_QUARTER("startOfNextFiscalQuarter"),
    @XmlEnumValue("startOfNextMonth")
    START_OF_NEXT_MONTH("startOfNextMonth"),
    @XmlEnumValue("startOfNextWeek")
    START_OF_NEXT_WEEK("startOfNextWeek"),
    @XmlEnumValue("startOfNextYear")
    START_OF_NEXT_YEAR("startOfNextYear"),
    @XmlEnumValue("startOfPreviousRollingHalf")
    START_OF_PREVIOUS_ROLLING_HALF("startOfPreviousRollingHalf"),
    @XmlEnumValue("startOfPreviousRollingQuarter")
    START_OF_PREVIOUS_ROLLING_QUARTER("startOfPreviousRollingQuarter"),
    @XmlEnumValue("startOfPreviousRollingYear")
    START_OF_PREVIOUS_ROLLING_YEAR("startOfPreviousRollingYear"),
    @XmlEnumValue("startOfSameHalfLastFiscalYear")
    START_OF_SAME_HALF_LAST_FISCAL_YEAR("startOfSameHalfLastFiscalYear"),
    @XmlEnumValue("startOfSameMonthLastFiscalQuarter")
    START_OF_SAME_MONTH_LAST_FISCAL_QUARTER("startOfSameMonthLastFiscalQuarter"),
    @XmlEnumValue("startOfSameMonthLastFiscalYear")
    START_OF_SAME_MONTH_LAST_FISCAL_YEAR("startOfSameMonthLastFiscalYear"),
    @XmlEnumValue("startOfSameQuarterLastFiscalYear")
    START_OF_SAME_QUARTER_LAST_FISCAL_YEAR("startOfSameQuarterLastFiscalYear"),
    @XmlEnumValue("startOfTheHalfBeforeLast")
    START_OF_THE_HALF_BEFORE_LAST("startOfTheHalfBeforeLast"),
    @XmlEnumValue("startOfTheMonthBeforeLast")
    START_OF_THE_MONTH_BEFORE_LAST("startOfTheMonthBeforeLast"),
    @XmlEnumValue("startOfTheQuarterBeforeLast")
    START_OF_THE_QUARTER_BEFORE_LAST("startOfTheQuarterBeforeLast"),
    @XmlEnumValue("startOfTheWeekBeforeLast")
    START_OF_THE_WEEK_BEFORE_LAST("startOfTheWeekBeforeLast"),
    @XmlEnumValue("startOfTheYearBeforeLast")
    START_OF_THE_YEAR_BEFORE_LAST("startOfTheYearBeforeLast"),
    @XmlEnumValue("startOfThisBusinessWeek")
    START_OF_THIS_BUSINESS_WEEK("startOfThisBusinessWeek"),
    @XmlEnumValue("startOfThisFiscalHalf")
    START_OF_THIS_FISCAL_HALF("startOfThisFiscalHalf"),
    @XmlEnumValue("startOfThisFiscalQuarter")
    START_OF_THIS_FISCAL_QUARTER("startOfThisFiscalQuarter"),
    @XmlEnumValue("startOfThisFiscalYear")
    START_OF_THIS_FISCAL_YEAR("startOfThisFiscalYear"),
    @XmlEnumValue("startOfThisMonth")
    START_OF_THIS_MONTH("startOfThisMonth"),
    @XmlEnumValue("startOfThisWeek")
    START_OF_THIS_WEEK("startOfThisWeek"),
    @XmlEnumValue("startOfThisYear")
    START_OF_THIS_YEAR("startOfThisYear"),
    @XmlEnumValue("thisBusinessWeek")
    THIS_BUSINESS_WEEK("thisBusinessWeek"),
    @XmlEnumValue("thisFiscalHalf")
    THIS_FISCAL_HALF("thisFiscalHalf"),
    @XmlEnumValue("thisFiscalHalfToDate")
    THIS_FISCAL_HALF_TO_DATE("thisFiscalHalfToDate"),
    @XmlEnumValue("thisFiscalQuarter")
    THIS_FISCAL_QUARTER("thisFiscalQuarter"),
    @XmlEnumValue("thisFiscalQuarterToDate")
    THIS_FISCAL_QUARTER_TO_DATE("thisFiscalQuarterToDate"),
    @XmlEnumValue("thisFiscalYear")
    THIS_FISCAL_YEAR("thisFiscalYear"),
    @XmlEnumValue("thisFiscalYearToDate")
    THIS_FISCAL_YEAR_TO_DATE("thisFiscalYearToDate"),
    @XmlEnumValue("thisMonth")
    THIS_MONTH("thisMonth"),
    @XmlEnumValue("thisMonthToDate")
    THIS_MONTH_TO_DATE("thisMonthToDate"),
    @XmlEnumValue("thisRollingHalf")
    THIS_ROLLING_HALF("thisRollingHalf"),
    @XmlEnumValue("thisRollingQuarter")
    THIS_ROLLING_QUARTER("thisRollingQuarter"),
    @XmlEnumValue("thisRollingYear")
    THIS_ROLLING_YEAR("thisRollingYear"),
    @XmlEnumValue("thisWeek")
    THIS_WEEK("thisWeek"),
    @XmlEnumValue("thisWeekToDate")
    THIS_WEEK_TO_DATE("thisWeekToDate"),
    @XmlEnumValue("thisYear")
    THIS_YEAR("thisYear"),
    @XmlEnumValue("threeMonthAgo")
    THREE_MONTH_AGO("threeMonthAgo"),
    @XmlEnumValue("threeQuartersAgo")
    THREE_QUARTERS_AGO("threeQuartersAgo"),
    @XmlEnumValue("threeYearsAgo")
    THREE_YEARS_AGO("threeYearsAgo"),
    @XmlEnumValue("today")
    TODAY("today"),
    @XmlEnumValue("tomorrow")
    TOMORROW("tomorrow"),
    @XmlEnumValue("twoDaysAgo")
    TWO_DAYS_AGO("twoDaysAgo"),
    @XmlEnumValue("weekBeforeLast")
    WEEK_BEFORE_LAST("weekBeforeLast"),
    @XmlEnumValue("weekBeforeLastToDate")
    WEEK_BEFORE_LAST_TO_DATE("weekBeforeLastToDate"),
    @XmlEnumValue("yesterday")
    YESTERDAY("yesterday");
    private final String value;

    SearchDate(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchDate fromValue(String v) {
        for (SearchDate c: SearchDate.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
