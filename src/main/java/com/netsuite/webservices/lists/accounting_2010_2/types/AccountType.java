/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.lists.accounting_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_accountsPayable"/>
 *     &lt;enumeration value="_accountsReceivable"/>
 *     &lt;enumeration value="_bank"/>
 *     &lt;enumeration value="_costOfGoodsSold"/>
 *     &lt;enumeration value="_creditCard"/>
 *     &lt;enumeration value="_deferredExpense"/>
 *     &lt;enumeration value="_deferredRevenue"/>
 *     &lt;enumeration value="_equity"/>
 *     &lt;enumeration value="_expense"/>
 *     &lt;enumeration value="_fixedAsset"/>
 *     &lt;enumeration value="_income"/>
 *     &lt;enumeration value="_longTermLiability"/>
 *     &lt;enumeration value="_nonPosting"/>
 *     &lt;enumeration value="_otherAsset"/>
 *     &lt;enumeration value="_otherCurrentAsset"/>
 *     &lt;enumeration value="_otherCurrentLiability"/>
 *     &lt;enumeration value="_otherExpense"/>
 *     &lt;enumeration value="_otherIncome"/>
 *     &lt;enumeration value="_unbilledReceivable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountType", namespace = "urn:types.accounting_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum AccountType {

    @XmlEnumValue("_accountsPayable")
    ACCOUNTS_PAYABLE("_accountsPayable"),
    @XmlEnumValue("_accountsReceivable")
    ACCOUNTS_RECEIVABLE("_accountsReceivable"),
    @XmlEnumValue("_bank")
    BANK("_bank"),
    @XmlEnumValue("_costOfGoodsSold")
    COST_OF_GOODS_SOLD("_costOfGoodsSold"),
    @XmlEnumValue("_creditCard")
    CREDIT_CARD("_creditCard"),
    @XmlEnumValue("_deferredExpense")
    DEFERRED_EXPENSE("_deferredExpense"),
    @XmlEnumValue("_deferredRevenue")
    DEFERRED_REVENUE("_deferredRevenue"),
    @XmlEnumValue("_equity")
    EQUITY("_equity"),
    @XmlEnumValue("_expense")
    EXPENSE("_expense"),
    @XmlEnumValue("_fixedAsset")
    FIXED_ASSET("_fixedAsset"),
    @XmlEnumValue("_income")
    INCOME("_income"),
    @XmlEnumValue("_longTermLiability")
    LONG_TERM_LIABILITY("_longTermLiability"),
    @XmlEnumValue("_nonPosting")
    NON_POSTING("_nonPosting"),
    @XmlEnumValue("_otherAsset")
    OTHER_ASSET("_otherAsset"),
    @XmlEnumValue("_otherCurrentAsset")
    OTHER_CURRENT_ASSET("_otherCurrentAsset"),
    @XmlEnumValue("_otherCurrentLiability")
    OTHER_CURRENT_LIABILITY("_otherCurrentLiability"),
    @XmlEnumValue("_otherExpense")
    OTHER_EXPENSE("_otherExpense"),
    @XmlEnumValue("_otherIncome")
    OTHER_INCOME("_otherIncome"),
    @XmlEnumValue("_unbilledReceivable")
    UNBILLED_RECEIVABLE("_unbilledReceivable");
    private final String value;

    AccountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountType fromValue(String v) {
        for (AccountType c: AccountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
