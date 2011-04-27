
package com.netsuite.webservices.transactions.sales_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFulfillmentPackageFedExPackagingFedEx.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentPackageFedExPackagingFedEx">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_fedExBox"/>
 *     &lt;enumeration value="_fedEx10kgBox"/>
 *     &lt;enumeration value="_fedEx25kgBox"/>
 *     &lt;enumeration value="_fedExEnvelope"/>
 *     &lt;enumeration value="_fedExPak"/>
 *     &lt;enumeration value="_fedExTube"/>
 *     &lt;enumeration value="_yourPackaging"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentPackageFedExPackagingFedEx", namespace = "urn:types.sales_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentPackageFedExPackagingFedEx {

    @XmlEnumValue("_fedExBox")
    FED_EX_BOX("_fedExBox"),
    @XmlEnumValue("_fedEx10kgBox")
    FED_EX_10_KG_BOX("_fedEx10kgBox"),
    @XmlEnumValue("_fedEx25kgBox")
    FED_EX_25_KG_BOX("_fedEx25kgBox"),
    @XmlEnumValue("_fedExEnvelope")
    FED_EX_ENVELOPE("_fedExEnvelope"),
    @XmlEnumValue("_fedExPak")
    FED_EX_PAK("_fedExPak"),
    @XmlEnumValue("_fedExTube")
    FED_EX_TUBE("_fedExTube"),
    @XmlEnumValue("_yourPackaging")
    YOUR_PACKAGING("_yourPackaging");
    private final String value;

    ItemFulfillmentPackageFedExPackagingFedEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentPackageFedExPackagingFedEx fromValue(String v) {
        for (ItemFulfillmentPackageFedExPackagingFedEx c: ItemFulfillmentPackageFedExPackagingFedEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
