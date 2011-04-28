/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.transactions.sales_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionPaymentEventResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionPaymentEventResult">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_accept"/>
 *     &lt;enumeration value="_holdOverride"/>
 *     &lt;enumeration value="_paymentHold"/>
 *     &lt;enumeration value="_reject"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionPaymentEventResult", namespace = "urn:types.sales_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TransactionPaymentEventResult {

    @XmlEnumValue("_accept")
    ACCEPT("_accept"),
    @XmlEnumValue("_holdOverride")
    HOLD_OVERRIDE("_holdOverride"),
    @XmlEnumValue("_paymentHold")
    PAYMENT_HOLD("_paymentHold"),
    @XmlEnumValue("_reject")
    REJECT("_reject");
    private final String value;

    TransactionPaymentEventResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionPaymentEventResult fromValue(String v) {
        for (TransactionPaymentEventResult c: TransactionPaymentEventResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
