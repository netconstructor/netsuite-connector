
package com.netsuite.webservices.transactions.inventory_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferOrderOrderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferOrderOrderStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_pendingApproval"/>
 *     &lt;enumeration value="_pendingFulfillment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransferOrderOrderStatus", namespace = "urn:types.inventory_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TransferOrderOrderStatus {

    @XmlEnumValue("_pendingApproval")
    PENDING_APPROVAL("_pendingApproval"),
    @XmlEnumValue("_pendingFulfillment")
    PENDING_FULFILLMENT("_pendingFulfillment");
    private final String value;

    TransferOrderOrderStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransferOrderOrderStatus fromValue(String v) {
        for (TransferOrderOrderStatus c: TransferOrderOrderStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}