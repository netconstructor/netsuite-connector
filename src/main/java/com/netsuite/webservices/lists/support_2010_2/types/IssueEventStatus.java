
package com.netsuite.webservices.lists.support_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssueEventStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IssueEventStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_closed"/>
 *     &lt;enumeration value="_onHold"/>
 *     &lt;enumeration value="_open"/>
 *     &lt;enumeration value="_resolved"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IssueEventStatus", namespace = "urn:types.support_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum IssueEventStatus {

    @XmlEnumValue("_closed")
    CLOSED("_closed"),
    @XmlEnumValue("_onHold")
    ON_HOLD("_onHold"),
    @XmlEnumValue("_open")
    OPEN("_open"),
    @XmlEnumValue("_resolved")
    RESOLVED("_resolved");
    private final String value;

    IssueEventStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IssueEventStatus fromValue(String v) {
        for (IssueEventStatus c: IssueEventStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
