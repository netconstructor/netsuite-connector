
package com.netsuite.webservices.transactions.sales_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFulfillmentTermsOfSaleFedEx.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentTermsOfSaleFedEx">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_fob"/>
 *     &lt;enumeration value="_cf"/>
 *     &lt;enumeration value="_cif"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentTermsOfSaleFedEx", namespace = "urn:types.sales_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentTermsOfSaleFedEx {

    @XmlEnumValue("_fob")
    FOB("_fob"),
    @XmlEnumValue("_cf")
    CF("_cf"),
    @XmlEnumValue("_cif")
    CIF("_cif");
    private final String value;

    ItemFulfillmentTermsOfSaleFedEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentTermsOfSaleFedEx fromValue(String v) {
        for (ItemFulfillmentTermsOfSaleFedEx c: ItemFulfillmentTermsOfSaleFedEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}