
package com.netsuite.webservices.lists.support_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SolutionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SolutionStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_approved"/>
 *     &lt;enumeration value="_unapproved"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SolutionStatus", namespace = "urn:types.support_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum SolutionStatus {

    @XmlEnumValue("_approved")
    APPROVED("_approved"),
    @XmlEnumValue("_unapproved")
    UNAPPROVED("_unapproved");
    private final String value;

    SolutionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SolutionStatus fromValue(String v) {
        for (SolutionStatus c: SolutionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
