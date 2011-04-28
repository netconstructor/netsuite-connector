/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.transactions.purchases_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseOrderOrderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PurchaseOrderOrderStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_closed"/>
 *     &lt;enumeration value="_fullyBilled"/>
 *     &lt;enumeration value="_partiallyReceived"/>
 *     &lt;enumeration value="_pendingBillingPartiallyReceived"/>
 *     &lt;enumeration value="_pendingBilling"/>
 *     &lt;enumeration value="_pendingReceipt"/>
 *     &lt;enumeration value="_pendingSupervisorApproval"/>
 *     &lt;enumeration value="_rejectedBySupervisor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PurchaseOrderOrderStatus", namespace = "urn:types.purchases_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum PurchaseOrderOrderStatus {

    @XmlEnumValue("_closed")
    CLOSED("_closed"),
    @XmlEnumValue("_fullyBilled")
    FULLY_BILLED("_fullyBilled"),
    @XmlEnumValue("_partiallyReceived")
    PARTIALLY_RECEIVED("_partiallyReceived"),
    @XmlEnumValue("_pendingBillingPartiallyReceived")
    PENDING_BILLING_PARTIALLY_RECEIVED("_pendingBillingPartiallyReceived"),
    @XmlEnumValue("_pendingBilling")
    PENDING_BILLING("_pendingBilling"),
    @XmlEnumValue("_pendingReceipt")
    PENDING_RECEIPT("_pendingReceipt"),
    @XmlEnumValue("_pendingSupervisorApproval")
    PENDING_SUPERVISOR_APPROVAL("_pendingSupervisorApproval"),
    @XmlEnumValue("_rejectedBySupervisor")
    REJECTED_BY_SUPERVISOR("_rejectedBySupervisor");
    private final String value;

    PurchaseOrderOrderStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurchaseOrderOrderStatus fromValue(String v) {
        for (PurchaseOrderOrderStatus c: PurchaseOrderOrderStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
