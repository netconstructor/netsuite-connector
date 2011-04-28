/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.transactions.sales_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFulfillmentPackageFedExAdmPackageTypeFedEx.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentPackageFedExAdmPackageTypeFedEx">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_bag"/>
 *     &lt;enumeration value="_barrel"/>
 *     &lt;enumeration value="_basketOrHamper"/>
 *     &lt;enumeration value="_box"/>
 *     &lt;enumeration value="_bucket"/>
 *     &lt;enumeration value="_bundle"/>
 *     &lt;enumeration value="_cage"/>
 *     &lt;enumeration value="_carton"/>
 *     &lt;enumeration value="_case"/>
 *     &lt;enumeration value="_chest"/>
 *     &lt;enumeration value="_container"/>
 *     &lt;enumeration value="_crate"/>
 *     &lt;enumeration value="_cylinder"/>
 *     &lt;enumeration value="_drum"/>
 *     &lt;enumeration value="_envelope"/>
 *     &lt;enumeration value="_package"/>
 *     &lt;enumeration value="_pail"/>
 *     &lt;enumeration value="_pallet"/>
 *     &lt;enumeration value="_parcel"/>
 *     &lt;enumeration value="_pieces"/>
 *     &lt;enumeration value="_reel"/>
 *     &lt;enumeration value="_roll"/>
 *     &lt;enumeration value="_sack"/>
 *     &lt;enumeration value="_shrinkWrapped"/>
 *     &lt;enumeration value="_skid"/>
 *     &lt;enumeration value="_tank"/>
 *     &lt;enumeration value="_toteBin"/>
 *     &lt;enumeration value="_tube"/>
 *     &lt;enumeration value="_unit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentPackageFedExAdmPackageTypeFedEx", namespace = "urn:types.sales_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentPackageFedExAdmPackageTypeFedEx {

    @XmlEnumValue("_bag")
    BAG("_bag"),
    @XmlEnumValue("_barrel")
    BARREL("_barrel"),
    @XmlEnumValue("_basketOrHamper")
    BASKET_OR_HAMPER("_basketOrHamper"),
    @XmlEnumValue("_box")
    BOX("_box"),
    @XmlEnumValue("_bucket")
    BUCKET("_bucket"),
    @XmlEnumValue("_bundle")
    BUNDLE("_bundle"),
    @XmlEnumValue("_cage")
    CAGE("_cage"),
    @XmlEnumValue("_carton")
    CARTON("_carton"),
    @XmlEnumValue("_case")
    CASE("_case"),
    @XmlEnumValue("_chest")
    CHEST("_chest"),
    @XmlEnumValue("_container")
    CONTAINER("_container"),
    @XmlEnumValue("_crate")
    CRATE("_crate"),
    @XmlEnumValue("_cylinder")
    CYLINDER("_cylinder"),
    @XmlEnumValue("_drum")
    DRUM("_drum"),
    @XmlEnumValue("_envelope")
    ENVELOPE("_envelope"),
    @XmlEnumValue("_package")
    PACKAGE("_package"),
    @XmlEnumValue("_pail")
    PAIL("_pail"),
    @XmlEnumValue("_pallet")
    PALLET("_pallet"),
    @XmlEnumValue("_parcel")
    PARCEL("_parcel"),
    @XmlEnumValue("_pieces")
    PIECES("_pieces"),
    @XmlEnumValue("_reel")
    REEL("_reel"),
    @XmlEnumValue("_roll")
    ROLL("_roll"),
    @XmlEnumValue("_sack")
    SACK("_sack"),
    @XmlEnumValue("_shrinkWrapped")
    SHRINK_WRAPPED("_shrinkWrapped"),
    @XmlEnumValue("_skid")
    SKID("_skid"),
    @XmlEnumValue("_tank")
    TANK("_tank"),
    @XmlEnumValue("_toteBin")
    TOTE_BIN("_toteBin"),
    @XmlEnumValue("_tube")
    TUBE("_tube"),
    @XmlEnumValue("_unit")
    UNIT("_unit");
    private final String value;

    ItemFulfillmentPackageFedExAdmPackageTypeFedEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentPackageFedExAdmPackageTypeFedEx fromValue(String v) {
        for (ItemFulfillmentPackageFedExAdmPackageTypeFedEx c: ItemFulfillmentPackageFedExAdmPackageTypeFedEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
