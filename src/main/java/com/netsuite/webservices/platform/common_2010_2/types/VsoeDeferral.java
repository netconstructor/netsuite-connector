
package com.netsuite.webservices.platform.common_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsoeDeferral.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VsoeDeferral">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_deferBundleUntilDelivered"/>
 *     &lt;enumeration value="_deferUntilItemDelivered"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VsoeDeferral", namespace = "urn:types.common_2010_2.platform.webservices.netsuite.com")
@XmlEnum
public enum VsoeDeferral {

    @XmlEnumValue("_deferBundleUntilDelivered")
    DEFER_BUNDLE_UNTIL_DELIVERED("_deferBundleUntilDelivered"),
    @XmlEnumValue("_deferUntilItemDelivered")
    DEFER_UNTIL_ITEM_DELIVERED("_deferUntilItemDelivered");
    private final String value;

    VsoeDeferral(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VsoeDeferral fromValue(String v) {
        for (VsoeDeferral c: VsoeDeferral.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
