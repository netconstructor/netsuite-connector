/**
 * SearchDate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SearchDate implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SearchDate(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _fiscalHalfBeforeLast = "fiscalHalfBeforeLast";
    public static final java.lang.String _fiscalHalfBeforeLastToDate = "fiscalHalfBeforeLastToDate";
    public static final java.lang.String _fiscalQuarterBeforeLast = "fiscalQuarterBeforeLast";
    public static final java.lang.String _fiscalQuarterBeforeLastToDate = "fiscalQuarterBeforeLastToDate";
    public static final java.lang.String _fiscalYearBeforeLast = "fiscalYearBeforeLast";
    public static final java.lang.String _fiscalYearBeforeLastToDate = "fiscalYearBeforeLastToDate";
    public static final java.lang.String _lastBusinessWeek = "lastBusinessWeek";
    public static final java.lang.String _lastFiscalHalf = "lastFiscalHalf";
    public static final java.lang.String _lastFiscalHalfOneYearAgo = "lastFiscalHalfOneYearAgo";
    public static final java.lang.String _lastFiscalHalfToDate = "lastFiscalHalfToDate";
    public static final java.lang.String _lastFiscalQuarter = "lastFiscalQuarter";
    public static final java.lang.String _lastFiscalQuarterOneYearAgo = "lastFiscalQuarterOneYearAgo";
    public static final java.lang.String _lastFiscalQuarterToDate = "lastFiscalQuarterToDate";
    public static final java.lang.String _lastFiscalYear = "lastFiscalYear";
    public static final java.lang.String _lastFiscalYearToDate = "lastFiscalYearToDate";
    public static final java.lang.String _lastMonth = "lastMonth";
    public static final java.lang.String _lastMonthOneQuarterAgo = "lastMonthOneQuarterAgo";
    public static final java.lang.String _lastMonthOneYearAgo = "lastMonthOneYearAgo";
    public static final java.lang.String _lastMonthToDate = "lastMonthToDate";
    public static final java.lang.String _lastMonthTwoQuartersAgo = "lastMonthTwoQuartersAgo";
    public static final java.lang.String _lastMonthTwoYearsAgo = "lastMonthTwoYearsAgo";
    public static final java.lang.String _lastQuarterTwoYearsAgo = "lastQuarterTwoYearsAgo";
    public static final java.lang.String _lastRollingHalf = "lastRollingHalf";
    public static final java.lang.String _lastRollingQuarter = "lastRollingQuarter";
    public static final java.lang.String _lastRollingYear = "lastRollingYear";
    public static final java.lang.String _lastWeek = "lastWeek";
    public static final java.lang.String _lastWeekToDate = "lastWeekToDate";
    public static final java.lang.String _monthBeforeLast = "monthBeforeLast";
    public static final java.lang.String _monthBeforeLastToDate = "monthBeforeLastToDate";
    public static final java.lang.String _nextBusinessWeek = "nextBusinessWeek";
    public static final java.lang.String _nextFiscalHalf = "nextFiscalHalf";
    public static final java.lang.String _nextFiscalQuarter = "nextFiscalQuarter";
    public static final java.lang.String _nextFiscalYear = "nextFiscalYear";
    public static final java.lang.String _nextFourWeeks = "nextFourWeeks";
    public static final java.lang.String _nextMonth = "nextMonth";
    public static final java.lang.String _nextOneHalf = "nextOneHalf";
    public static final java.lang.String _nextOneMonth = "nextOneMonth";
    public static final java.lang.String _nextOneQuarter = "nextOneQuarter";
    public static final java.lang.String _nextOneWeek = "nextOneWeek";
    public static final java.lang.String _nextOneYear = "nextOneYear";
    public static final java.lang.String _nextWeek = "nextWeek";
    public static final java.lang.String _oneYearBeforeLast = "oneYearBeforeLast";
    public static final java.lang.String _previousMonthsLastFiscalHalf = "previousMonthsLastFiscalHalf";
    public static final java.lang.String _previousMonthsLastFiscalQuarter = "previousMonthsLastFiscalQuarter";
    public static final java.lang.String _previousMonthsLastFiscalYear = "previousMonthsLastFiscalYear";
    public static final java.lang.String _previousMonthsSameFiscalHalfLastYear = "previousMonthsSameFiscalHalfLastYear";
    public static final java.lang.String _previousMonthsSameFiscalQuartherLastFiscalYear = "previousMonthsSameFiscalQuartherLastFiscalYear";
    public static final java.lang.String _previousMonthsThisFiscalHalf = "previousMonthsThisFiscalHalf";
    public static final java.lang.String _previousMonthsThisFiscalQuarter = "previousMonthsThisFiscalQuarter";
    public static final java.lang.String _previousMonthsThisFiscalYear = "previousMonthsThisFiscalYear";
    public static final java.lang.String _previousOneDay = "previousOneDay";
    public static final java.lang.String _previousOneHalf = "previousOneHalf";
    public static final java.lang.String _previousOneMonth = "previousOneMonth";
    public static final java.lang.String _previousOneQuarter = "previousOneQuarter";
    public static final java.lang.String _previousOneWeek = "previousOneWeek";
    public static final java.lang.String _previousOneYear = "previousOneYear";
    public static final java.lang.String _previousQuartersLastFiscalYear = "previousQuartersLastFiscalYear";
    public static final java.lang.String _previousQuartersThisFiscalYear = "previousQuartersThisFiscalYear";
    public static final java.lang.String _previousRollingHalf = "previousRollingHalf";
    public static final java.lang.String _previousRollingQuarter = "previousRollingQuarter";
    public static final java.lang.String _previousRollingYear = "previousRollingYear";
    public static final java.lang.String _sameDayFiscalQuarterBeforeLast = "sameDayFiscalQuarterBeforeLast";
    public static final java.lang.String _sameDayFiscalYearBeforeLast = "sameDayFiscalYearBeforeLast";
    public static final java.lang.String _sameDayLastFiscalQuarter = "sameDayLastFiscalQuarter";
    public static final java.lang.String _sameDayLastFiscalYear = "sameDayLastFiscalYear";
    public static final java.lang.String _sameDayLastMonth = "sameDayLastMonth";
    public static final java.lang.String _sameDayLastWeek = "sameDayLastWeek";
    public static final java.lang.String _sameDayMonthBeforeLast = "sameDayMonthBeforeLast";
    public static final java.lang.String _sameDayWeekBeforeLast = "sameDayWeekBeforeLast";
    public static final java.lang.String _sameFiscalQuarterFiscalYearBeforeLast = "sameFiscalQuarterFiscalYearBeforeLast";
    public static final java.lang.String _sameHalfLastFiscalYearToDate = "sameHalfLastFiscalYearToDate";
    public static final java.lang.String _sameMonthFiscalQuarterBeforeLast = "sameMonthFiscalQuarterBeforeLast";
    public static final java.lang.String _sameMonthFiscalYearBeforeLast = "sameMonthFiscalYearBeforeLast";
    public static final java.lang.String _sameMonthLastFiscalQuarter = "sameMonthLastFiscalQuarter";
    public static final java.lang.String _sameMonthLastFiscalQuarterToDate = "sameMonthLastFiscalQuarterToDate";
    public static final java.lang.String _sameMonthLastFiscalYear = "sameMonthLastFiscalYear";
    public static final java.lang.String _sameMonthLastFiscalYearToDate = "sameMonthLastFiscalYearToDate";
    public static final java.lang.String _sameQuarterLastFiscalYear = "sameQuarterLastFiscalYear";
    public static final java.lang.String _sameQuarterLastFiscalYearToDate = "sameQuarterLastFiscalYearToDate";
    public static final java.lang.String _sameWeekFiscalYearBeforeLast = "sameWeekFiscalYearBeforeLast";
    public static final java.lang.String _sameWeekLastFiscalYear = "sameWeekLastFiscalYear";
    public static final java.lang.String _startOfLastBusinessWeek = "startOfLastBusinessWeek";
    public static final java.lang.String _startOfLastFiscalHalf = "startOfLastFiscalHalf";
    public static final java.lang.String _startOfLastFiscalQuarter = "startOfLastFiscalQuarter";
    public static final java.lang.String _startOfLastFiscalYear = "startOfLastFiscalYear";
    public static final java.lang.String _startOfLastHalfOneYearAgo = "startOfLastHalfOneYearAgo";
    public static final java.lang.String _startOfLastMonth = "startOfLastMonth";
    public static final java.lang.String _startOfLastMonthOneQuarterAgo = "startOfLastMonthOneQuarterAgo";
    public static final java.lang.String _startOfLastMonthOneYearAgo = "startOfLastMonthOneYearAgo";
    public static final java.lang.String _startOfLastQuarterOneYearAgo = "startOfLastQuarterOneYearAgo";
    public static final java.lang.String _startOfLastRollingHalf = "startOfLastRollingHalf";
    public static final java.lang.String _startOfLastRollingQuarter = "startOfLastRollingQuarter";
    public static final java.lang.String _startOfLastRollingYear = "startOfLastRollingYear";
    public static final java.lang.String _startOfLastWeek = "startOfLastWeek";
    public static final java.lang.String _startOfNextBusinessWeek = "startOfNextBusinessWeek";
    public static final java.lang.String _startOfNextFiscalHalf = "startOfNextFiscalHalf";
    public static final java.lang.String _startOfNextFiscalQuarter = "startOfNextFiscalQuarter";
    public static final java.lang.String _startOfNextMonth = "startOfNextMonth";
    public static final java.lang.String _startOfNextWeek = "startOfNextWeek";
    public static final java.lang.String _startOfNextYear = "startOfNextYear";
    public static final java.lang.String _startOfPreviousRollingHalf = "startOfPreviousRollingHalf";
    public static final java.lang.String _startOfPreviousRollingQuarter = "startOfPreviousRollingQuarter";
    public static final java.lang.String _startOfPreviousRollingYear = "startOfPreviousRollingYear";
    public static final java.lang.String _startOfSameHalfLastFiscalYear = "startOfSameHalfLastFiscalYear";
    public static final java.lang.String _startOfSameMonthLastFiscalQuarter = "startOfSameMonthLastFiscalQuarter";
    public static final java.lang.String _startOfSameMonthLastFiscalYear = "startOfSameMonthLastFiscalYear";
    public static final java.lang.String _startOfSameQuarterLastFiscalYear = "startOfSameQuarterLastFiscalYear";
    public static final java.lang.String _startOfTheHalfBeforeLast = "startOfTheHalfBeforeLast";
    public static final java.lang.String _startOfTheMonthBeforeLast = "startOfTheMonthBeforeLast";
    public static final java.lang.String _startOfTheQuarterBeforeLast = "startOfTheQuarterBeforeLast";
    public static final java.lang.String _startOfTheWeekBeforeLast = "startOfTheWeekBeforeLast";
    public static final java.lang.String _startOfTheYearBeforeLast = "startOfTheYearBeforeLast";
    public static final java.lang.String _startOfThisBusinessWeek = "startOfThisBusinessWeek";
    public static final java.lang.String _startOfThisFiscalHalf = "startOfThisFiscalHalf";
    public static final java.lang.String _startOfThisFiscalQuarter = "startOfThisFiscalQuarter";
    public static final java.lang.String _startOfThisFiscalYear = "startOfThisFiscalYear";
    public static final java.lang.String _startOfThisMonth = "startOfThisMonth";
    public static final java.lang.String _startOfThisWeek = "startOfThisWeek";
    public static final java.lang.String _startOfThisYear = "startOfThisYear";
    public static final java.lang.String _thisBusinessWeek = "thisBusinessWeek";
    public static final java.lang.String _thisFiscalHalf = "thisFiscalHalf";
    public static final java.lang.String _thisFiscalHalfToDate = "thisFiscalHalfToDate";
    public static final java.lang.String _thisFiscalQuarter = "thisFiscalQuarter";
    public static final java.lang.String _thisFiscalQuarterToDate = "thisFiscalQuarterToDate";
    public static final java.lang.String _thisFiscalYear = "thisFiscalYear";
    public static final java.lang.String _thisFiscalYearToDate = "thisFiscalYearToDate";
    public static final java.lang.String _thisMonth = "thisMonth";
    public static final java.lang.String _thisMonthToDate = "thisMonthToDate";
    public static final java.lang.String _thisRollingHalf = "thisRollingHalf";
    public static final java.lang.String _thisRollingQuarter = "thisRollingQuarter";
    public static final java.lang.String _thisRollingYear = "thisRollingYear";
    public static final java.lang.String _thisWeek = "thisWeek";
    public static final java.lang.String _thisWeekToDate = "thisWeekToDate";
    public static final java.lang.String _thisYear = "thisYear";
    public static final java.lang.String _threeMonthAgo = "threeMonthAgo";
    public static final java.lang.String _threeQuartersAgo = "threeQuartersAgo";
    public static final java.lang.String _threeYearsAgo = "threeYearsAgo";
    public static final java.lang.String _today = "today";
    public static final java.lang.String _tomorrow = "tomorrow";
    public static final java.lang.String _twoDaysAgo = "twoDaysAgo";
    public static final java.lang.String _weekBeforeLast = "weekBeforeLast";
    public static final java.lang.String _weekBeforeLastToDate = "weekBeforeLastToDate";
    public static final java.lang.String _yesterday = "yesterday";
    public static final SearchDate fiscalHalfBeforeLast = new SearchDate(_fiscalHalfBeforeLast);
    public static final SearchDate fiscalHalfBeforeLastToDate = new SearchDate(_fiscalHalfBeforeLastToDate);
    public static final SearchDate fiscalQuarterBeforeLast = new SearchDate(_fiscalQuarterBeforeLast);
    public static final SearchDate fiscalQuarterBeforeLastToDate = new SearchDate(_fiscalQuarterBeforeLastToDate);
    public static final SearchDate fiscalYearBeforeLast = new SearchDate(_fiscalYearBeforeLast);
    public static final SearchDate fiscalYearBeforeLastToDate = new SearchDate(_fiscalYearBeforeLastToDate);
    public static final SearchDate lastBusinessWeek = new SearchDate(_lastBusinessWeek);
    public static final SearchDate lastFiscalHalf = new SearchDate(_lastFiscalHalf);
    public static final SearchDate lastFiscalHalfOneYearAgo = new SearchDate(_lastFiscalHalfOneYearAgo);
    public static final SearchDate lastFiscalHalfToDate = new SearchDate(_lastFiscalHalfToDate);
    public static final SearchDate lastFiscalQuarter = new SearchDate(_lastFiscalQuarter);
    public static final SearchDate lastFiscalQuarterOneYearAgo = new SearchDate(_lastFiscalQuarterOneYearAgo);
    public static final SearchDate lastFiscalQuarterToDate = new SearchDate(_lastFiscalQuarterToDate);
    public static final SearchDate lastFiscalYear = new SearchDate(_lastFiscalYear);
    public static final SearchDate lastFiscalYearToDate = new SearchDate(_lastFiscalYearToDate);
    public static final SearchDate lastMonth = new SearchDate(_lastMonth);
    public static final SearchDate lastMonthOneQuarterAgo = new SearchDate(_lastMonthOneQuarterAgo);
    public static final SearchDate lastMonthOneYearAgo = new SearchDate(_lastMonthOneYearAgo);
    public static final SearchDate lastMonthToDate = new SearchDate(_lastMonthToDate);
    public static final SearchDate lastMonthTwoQuartersAgo = new SearchDate(_lastMonthTwoQuartersAgo);
    public static final SearchDate lastMonthTwoYearsAgo = new SearchDate(_lastMonthTwoYearsAgo);
    public static final SearchDate lastQuarterTwoYearsAgo = new SearchDate(_lastQuarterTwoYearsAgo);
    public static final SearchDate lastRollingHalf = new SearchDate(_lastRollingHalf);
    public static final SearchDate lastRollingQuarter = new SearchDate(_lastRollingQuarter);
    public static final SearchDate lastRollingYear = new SearchDate(_lastRollingYear);
    public static final SearchDate lastWeek = new SearchDate(_lastWeek);
    public static final SearchDate lastWeekToDate = new SearchDate(_lastWeekToDate);
    public static final SearchDate monthBeforeLast = new SearchDate(_monthBeforeLast);
    public static final SearchDate monthBeforeLastToDate = new SearchDate(_monthBeforeLastToDate);
    public static final SearchDate nextBusinessWeek = new SearchDate(_nextBusinessWeek);
    public static final SearchDate nextFiscalHalf = new SearchDate(_nextFiscalHalf);
    public static final SearchDate nextFiscalQuarter = new SearchDate(_nextFiscalQuarter);
    public static final SearchDate nextFiscalYear = new SearchDate(_nextFiscalYear);
    public static final SearchDate nextFourWeeks = new SearchDate(_nextFourWeeks);
    public static final SearchDate nextMonth = new SearchDate(_nextMonth);
    public static final SearchDate nextOneHalf = new SearchDate(_nextOneHalf);
    public static final SearchDate nextOneMonth = new SearchDate(_nextOneMonth);
    public static final SearchDate nextOneQuarter = new SearchDate(_nextOneQuarter);
    public static final SearchDate nextOneWeek = new SearchDate(_nextOneWeek);
    public static final SearchDate nextOneYear = new SearchDate(_nextOneYear);
    public static final SearchDate nextWeek = new SearchDate(_nextWeek);
    public static final SearchDate oneYearBeforeLast = new SearchDate(_oneYearBeforeLast);
    public static final SearchDate previousMonthsLastFiscalHalf = new SearchDate(_previousMonthsLastFiscalHalf);
    public static final SearchDate previousMonthsLastFiscalQuarter = new SearchDate(_previousMonthsLastFiscalQuarter);
    public static final SearchDate previousMonthsLastFiscalYear = new SearchDate(_previousMonthsLastFiscalYear);
    public static final SearchDate previousMonthsSameFiscalHalfLastYear = new SearchDate(_previousMonthsSameFiscalHalfLastYear);
    public static final SearchDate previousMonthsSameFiscalQuartherLastFiscalYear = new SearchDate(_previousMonthsSameFiscalQuartherLastFiscalYear);
    public static final SearchDate previousMonthsThisFiscalHalf = new SearchDate(_previousMonthsThisFiscalHalf);
    public static final SearchDate previousMonthsThisFiscalQuarter = new SearchDate(_previousMonthsThisFiscalQuarter);
    public static final SearchDate previousMonthsThisFiscalYear = new SearchDate(_previousMonthsThisFiscalYear);
    public static final SearchDate previousOneDay = new SearchDate(_previousOneDay);
    public static final SearchDate previousOneHalf = new SearchDate(_previousOneHalf);
    public static final SearchDate previousOneMonth = new SearchDate(_previousOneMonth);
    public static final SearchDate previousOneQuarter = new SearchDate(_previousOneQuarter);
    public static final SearchDate previousOneWeek = new SearchDate(_previousOneWeek);
    public static final SearchDate previousOneYear = new SearchDate(_previousOneYear);
    public static final SearchDate previousQuartersLastFiscalYear = new SearchDate(_previousQuartersLastFiscalYear);
    public static final SearchDate previousQuartersThisFiscalYear = new SearchDate(_previousQuartersThisFiscalYear);
    public static final SearchDate previousRollingHalf = new SearchDate(_previousRollingHalf);
    public static final SearchDate previousRollingQuarter = new SearchDate(_previousRollingQuarter);
    public static final SearchDate previousRollingYear = new SearchDate(_previousRollingYear);
    public static final SearchDate sameDayFiscalQuarterBeforeLast = new SearchDate(_sameDayFiscalQuarterBeforeLast);
    public static final SearchDate sameDayFiscalYearBeforeLast = new SearchDate(_sameDayFiscalYearBeforeLast);
    public static final SearchDate sameDayLastFiscalQuarter = new SearchDate(_sameDayLastFiscalQuarter);
    public static final SearchDate sameDayLastFiscalYear = new SearchDate(_sameDayLastFiscalYear);
    public static final SearchDate sameDayLastMonth = new SearchDate(_sameDayLastMonth);
    public static final SearchDate sameDayLastWeek = new SearchDate(_sameDayLastWeek);
    public static final SearchDate sameDayMonthBeforeLast = new SearchDate(_sameDayMonthBeforeLast);
    public static final SearchDate sameDayWeekBeforeLast = new SearchDate(_sameDayWeekBeforeLast);
    public static final SearchDate sameFiscalQuarterFiscalYearBeforeLast = new SearchDate(_sameFiscalQuarterFiscalYearBeforeLast);
    public static final SearchDate sameHalfLastFiscalYearToDate = new SearchDate(_sameHalfLastFiscalYearToDate);
    public static final SearchDate sameMonthFiscalQuarterBeforeLast = new SearchDate(_sameMonthFiscalQuarterBeforeLast);
    public static final SearchDate sameMonthFiscalYearBeforeLast = new SearchDate(_sameMonthFiscalYearBeforeLast);
    public static final SearchDate sameMonthLastFiscalQuarter = new SearchDate(_sameMonthLastFiscalQuarter);
    public static final SearchDate sameMonthLastFiscalQuarterToDate = new SearchDate(_sameMonthLastFiscalQuarterToDate);
    public static final SearchDate sameMonthLastFiscalYear = new SearchDate(_sameMonthLastFiscalYear);
    public static final SearchDate sameMonthLastFiscalYearToDate = new SearchDate(_sameMonthLastFiscalYearToDate);
    public static final SearchDate sameQuarterLastFiscalYear = new SearchDate(_sameQuarterLastFiscalYear);
    public static final SearchDate sameQuarterLastFiscalYearToDate = new SearchDate(_sameQuarterLastFiscalYearToDate);
    public static final SearchDate sameWeekFiscalYearBeforeLast = new SearchDate(_sameWeekFiscalYearBeforeLast);
    public static final SearchDate sameWeekLastFiscalYear = new SearchDate(_sameWeekLastFiscalYear);
    public static final SearchDate startOfLastBusinessWeek = new SearchDate(_startOfLastBusinessWeek);
    public static final SearchDate startOfLastFiscalHalf = new SearchDate(_startOfLastFiscalHalf);
    public static final SearchDate startOfLastFiscalQuarter = new SearchDate(_startOfLastFiscalQuarter);
    public static final SearchDate startOfLastFiscalYear = new SearchDate(_startOfLastFiscalYear);
    public static final SearchDate startOfLastHalfOneYearAgo = new SearchDate(_startOfLastHalfOneYearAgo);
    public static final SearchDate startOfLastMonth = new SearchDate(_startOfLastMonth);
    public static final SearchDate startOfLastMonthOneQuarterAgo = new SearchDate(_startOfLastMonthOneQuarterAgo);
    public static final SearchDate startOfLastMonthOneYearAgo = new SearchDate(_startOfLastMonthOneYearAgo);
    public static final SearchDate startOfLastQuarterOneYearAgo = new SearchDate(_startOfLastQuarterOneYearAgo);
    public static final SearchDate startOfLastRollingHalf = new SearchDate(_startOfLastRollingHalf);
    public static final SearchDate startOfLastRollingQuarter = new SearchDate(_startOfLastRollingQuarter);
    public static final SearchDate startOfLastRollingYear = new SearchDate(_startOfLastRollingYear);
    public static final SearchDate startOfLastWeek = new SearchDate(_startOfLastWeek);
    public static final SearchDate startOfNextBusinessWeek = new SearchDate(_startOfNextBusinessWeek);
    public static final SearchDate startOfNextFiscalHalf = new SearchDate(_startOfNextFiscalHalf);
    public static final SearchDate startOfNextFiscalQuarter = new SearchDate(_startOfNextFiscalQuarter);
    public static final SearchDate startOfNextMonth = new SearchDate(_startOfNextMonth);
    public static final SearchDate startOfNextWeek = new SearchDate(_startOfNextWeek);
    public static final SearchDate startOfNextYear = new SearchDate(_startOfNextYear);
    public static final SearchDate startOfPreviousRollingHalf = new SearchDate(_startOfPreviousRollingHalf);
    public static final SearchDate startOfPreviousRollingQuarter = new SearchDate(_startOfPreviousRollingQuarter);
    public static final SearchDate startOfPreviousRollingYear = new SearchDate(_startOfPreviousRollingYear);
    public static final SearchDate startOfSameHalfLastFiscalYear = new SearchDate(_startOfSameHalfLastFiscalYear);
    public static final SearchDate startOfSameMonthLastFiscalQuarter = new SearchDate(_startOfSameMonthLastFiscalQuarter);
    public static final SearchDate startOfSameMonthLastFiscalYear = new SearchDate(_startOfSameMonthLastFiscalYear);
    public static final SearchDate startOfSameQuarterLastFiscalYear = new SearchDate(_startOfSameQuarterLastFiscalYear);
    public static final SearchDate startOfTheHalfBeforeLast = new SearchDate(_startOfTheHalfBeforeLast);
    public static final SearchDate startOfTheMonthBeforeLast = new SearchDate(_startOfTheMonthBeforeLast);
    public static final SearchDate startOfTheQuarterBeforeLast = new SearchDate(_startOfTheQuarterBeforeLast);
    public static final SearchDate startOfTheWeekBeforeLast = new SearchDate(_startOfTheWeekBeforeLast);
    public static final SearchDate startOfTheYearBeforeLast = new SearchDate(_startOfTheYearBeforeLast);
    public static final SearchDate startOfThisBusinessWeek = new SearchDate(_startOfThisBusinessWeek);
    public static final SearchDate startOfThisFiscalHalf = new SearchDate(_startOfThisFiscalHalf);
    public static final SearchDate startOfThisFiscalQuarter = new SearchDate(_startOfThisFiscalQuarter);
    public static final SearchDate startOfThisFiscalYear = new SearchDate(_startOfThisFiscalYear);
    public static final SearchDate startOfThisMonth = new SearchDate(_startOfThisMonth);
    public static final SearchDate startOfThisWeek = new SearchDate(_startOfThisWeek);
    public static final SearchDate startOfThisYear = new SearchDate(_startOfThisYear);
    public static final SearchDate thisBusinessWeek = new SearchDate(_thisBusinessWeek);
    public static final SearchDate thisFiscalHalf = new SearchDate(_thisFiscalHalf);
    public static final SearchDate thisFiscalHalfToDate = new SearchDate(_thisFiscalHalfToDate);
    public static final SearchDate thisFiscalQuarter = new SearchDate(_thisFiscalQuarter);
    public static final SearchDate thisFiscalQuarterToDate = new SearchDate(_thisFiscalQuarterToDate);
    public static final SearchDate thisFiscalYear = new SearchDate(_thisFiscalYear);
    public static final SearchDate thisFiscalYearToDate = new SearchDate(_thisFiscalYearToDate);
    public static final SearchDate thisMonth = new SearchDate(_thisMonth);
    public static final SearchDate thisMonthToDate = new SearchDate(_thisMonthToDate);
    public static final SearchDate thisRollingHalf = new SearchDate(_thisRollingHalf);
    public static final SearchDate thisRollingQuarter = new SearchDate(_thisRollingQuarter);
    public static final SearchDate thisRollingYear = new SearchDate(_thisRollingYear);
    public static final SearchDate thisWeek = new SearchDate(_thisWeek);
    public static final SearchDate thisWeekToDate = new SearchDate(_thisWeekToDate);
    public static final SearchDate thisYear = new SearchDate(_thisYear);
    public static final SearchDate threeMonthAgo = new SearchDate(_threeMonthAgo);
    public static final SearchDate threeQuartersAgo = new SearchDate(_threeQuartersAgo);
    public static final SearchDate threeYearsAgo = new SearchDate(_threeYearsAgo);
    public static final SearchDate today = new SearchDate(_today);
    public static final SearchDate tomorrow = new SearchDate(_tomorrow);
    public static final SearchDate twoDaysAgo = new SearchDate(_twoDaysAgo);
    public static final SearchDate weekBeforeLast = new SearchDate(_weekBeforeLast);
    public static final SearchDate weekBeforeLastToDate = new SearchDate(_weekBeforeLastToDate);
    public static final SearchDate yesterday = new SearchDate(_yesterday);
    public java.lang.String getValue() { return _value_;}
    public static SearchDate fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SearchDate enumeration = (SearchDate)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SearchDate fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchDate.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "SearchDate"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
