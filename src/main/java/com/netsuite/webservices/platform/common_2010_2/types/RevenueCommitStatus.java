
package com.netsuite.webservices.platform.common_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RevenueCommitStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RevenueCommitStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_committed"/>
 *     &lt;enumeration value="_partiallyCommitted"/>
 *     &lt;enumeration value="_pendingCommitment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RevenueCommitStatus", namespace = "urn:types.common_2010_2.platform.webservices.netsuite.com")
@XmlEnum
public enum RevenueCommitStatus {

    @XmlEnumValue("_committed")
    COMMITTED("_committed"),
    @XmlEnumValue("_partiallyCommitted")
    PARTIALLY_COMMITTED("_partiallyCommitted"),
    @XmlEnumValue("_pendingCommitment")
    PENDING_COMMITMENT("_pendingCommitment");
    private final String value;

    RevenueCommitStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RevenueCommitStatus fromValue(String v) {
        for (RevenueCommitStatus c: RevenueCommitStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
