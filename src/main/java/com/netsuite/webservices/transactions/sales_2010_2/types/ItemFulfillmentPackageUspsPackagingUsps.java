
package com.netsuite.webservices.transactions.sales_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFulfillmentPackageUspsPackagingUsps.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentPackageUspsPackagingUsps">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_parcel"/>
 *     &lt;enumeration value="_flatRateBox"/>
 *     &lt;enumeration value="_flatRateEnvelope"/>
 *     &lt;enumeration value="_smallFlatRateBox"/>
 *     &lt;enumeration value="_mediumFlatRateBox"/>
 *     &lt;enumeration value="_largeFlatRateBox"/>
 *     &lt;enumeration value="_irregularPackage"/>
 *     &lt;enumeration value="_largePackage"/>
 *     &lt;enumeration value="_oversizedPackage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentPackageUspsPackagingUsps", namespace = "urn:types.sales_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentPackageUspsPackagingUsps {

    @XmlEnumValue("_parcel")
    PARCEL("_parcel"),
    @XmlEnumValue("_flatRateBox")
    FLAT_RATE_BOX("_flatRateBox"),
    @XmlEnumValue("_flatRateEnvelope")
    FLAT_RATE_ENVELOPE("_flatRateEnvelope"),
    @XmlEnumValue("_smallFlatRateBox")
    SMALL_FLAT_RATE_BOX("_smallFlatRateBox"),
    @XmlEnumValue("_mediumFlatRateBox")
    MEDIUM_FLAT_RATE_BOX("_mediumFlatRateBox"),
    @XmlEnumValue("_largeFlatRateBox")
    LARGE_FLAT_RATE_BOX("_largeFlatRateBox"),
    @XmlEnumValue("_irregularPackage")
    IRREGULAR_PACKAGE("_irregularPackage"),
    @XmlEnumValue("_largePackage")
    LARGE_PACKAGE("_largePackage"),
    @XmlEnumValue("_oversizedPackage")
    OVERSIZED_PACKAGE("_oversizedPackage");
    private final String value;

    ItemFulfillmentPackageUspsPackagingUsps(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentPackageUspsPackagingUsps fromValue(String v) {
        for (ItemFulfillmentPackageUspsPackagingUsps c: ItemFulfillmentPackageUspsPackagingUsps.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
