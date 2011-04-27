
package com.netsuite.webservices.platform.common_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RevenueStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RevenueStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_pending"/>
 *     &lt;enumeration value="_inProgress"/>
 *     &lt;enumeration value="_completed"/>
 *     &lt;enumeration value="_onRevCommitment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RevenueStatus", namespace = "urn:types.common_2010_2.platform.webservices.netsuite.com")
@XmlEnum
public enum RevenueStatus {

    @XmlEnumValue("_pending")
    PENDING("_pending"),
    @XmlEnumValue("_inProgress")
    IN_PROGRESS("_inProgress"),
    @XmlEnumValue("_completed")
    COMPLETED("_completed"),
    @XmlEnumValue("_onRevCommitment")
    ON_REV_COMMITMENT("_onRevCommitment");
    private final String value;

    RevenueStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RevenueStatus fromValue(String v) {
        for (RevenueStatus c: RevenueStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
