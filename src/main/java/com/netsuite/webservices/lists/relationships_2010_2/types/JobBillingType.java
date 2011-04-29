
package com.netsuite.webservices.lists.relationships_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobBillingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JobBillingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_none"/>
 *     &lt;enumeration value="_fixedBidInterval"/>
 *     &lt;enumeration value="_fixedBidMilestone"/>
 *     &lt;enumeration value="_timeAndMaterials"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JobBillingType", namespace = "urn:types.relationships_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum JobBillingType {

    @XmlEnumValue("_none")
    NONE("_none"),
    @XmlEnumValue("_fixedBidInterval")
    FIXED_BID_INTERVAL("_fixedBidInterval"),
    @XmlEnumValue("_fixedBidMilestone")
    FIXED_BID_MILESTONE("_fixedBidMilestone"),
    @XmlEnumValue("_timeAndMaterials")
    TIME_AND_MATERIALS("_timeAndMaterials");
    private final String value;

    JobBillingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobBillingType fromValue(String v) {
        for (JobBillingType c: JobBillingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
