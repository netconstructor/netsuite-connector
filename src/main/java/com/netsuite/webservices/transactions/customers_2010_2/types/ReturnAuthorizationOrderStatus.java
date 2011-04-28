/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.transactions.customers_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnAuthorizationOrderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReturnAuthorizationOrderStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_pendingApproval"/>
 *     &lt;enumeration value="_pendingReceipt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReturnAuthorizationOrderStatus", namespace = "urn:types.customers_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ReturnAuthorizationOrderStatus {

    @XmlEnumValue("_pendingApproval")
    PENDING_APPROVAL("_pendingApproval"),
    @XmlEnumValue("_pendingReceipt")
    PENDING_RECEIPT("_pendingReceipt");
    private final String value;

    ReturnAuthorizationOrderStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReturnAuthorizationOrderStatus fromValue(String v) {
        for (ReturnAuthorizationOrderStatus c: ReturnAuthorizationOrderStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
