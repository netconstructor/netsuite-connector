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
 * <p>Java class for SalesOrderOrderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SalesOrderOrderStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_pendingApproval"/>
 *     &lt;enumeration value="_pendingFulfillment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SalesOrderOrderStatus", namespace = "urn:types.sales_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum SalesOrderOrderStatus {

    @XmlEnumValue("_pendingApproval")
    PENDING_APPROVAL("_pendingApproval"),
    @XmlEnumValue("_pendingFulfillment")
    PENDING_FULFILLMENT("_pendingFulfillment");
    private final String value;

    SalesOrderOrderStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SalesOrderOrderStatus fromValue(String v) {
        for (SalesOrderOrderStatus c: SalesOrderOrderStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
