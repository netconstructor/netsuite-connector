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
 * <p>Java class for TransactionPaymentEventHoldReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionPaymentEventHoldReason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_authorizationDecline"/>
 *     &lt;enumeration value="_decisionManagerRejection"/>
 *     &lt;enumeration value="_decisionManagerReview"/>
 *     &lt;enumeration value="_gatewayError"/>
 *     &lt;enumeration value="_overridenBy"/>
 *     &lt;enumeration value="_systemError"/>
 *     &lt;enumeration value="_unexpectedResponse"/>
 *     &lt;enumeration value="_verificationRejection"/>
 *     &lt;enumeration value="_verificationRequired"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionPaymentEventHoldReason", namespace = "urn:types.sales_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TransactionPaymentEventHoldReason {

    @XmlEnumValue("_authorizationDecline")
    AUTHORIZATION_DECLINE("_authorizationDecline"),
    @XmlEnumValue("_decisionManagerRejection")
    DECISION_MANAGER_REJECTION("_decisionManagerRejection"),
    @XmlEnumValue("_decisionManagerReview")
    DECISION_MANAGER_REVIEW("_decisionManagerReview"),
    @XmlEnumValue("_gatewayError")
    GATEWAY_ERROR("_gatewayError"),
    @XmlEnumValue("_overridenBy")
    OVERRIDEN_BY("_overridenBy"),
    @XmlEnumValue("_systemError")
    SYSTEM_ERROR("_systemError"),
    @XmlEnumValue("_unexpectedResponse")
    UNEXPECTED_RESPONSE("_unexpectedResponse"),
    @XmlEnumValue("_verificationRejection")
    VERIFICATION_REJECTION("_verificationRejection"),
    @XmlEnumValue("_verificationRequired")
    VERIFICATION_REQUIRED("_verificationRequired");
    private final String value;

    TransactionPaymentEventHoldReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionPaymentEventHoldReason fromValue(String v) {
        for (TransactionPaymentEventHoldReason c: TransactionPaymentEventHoldReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
