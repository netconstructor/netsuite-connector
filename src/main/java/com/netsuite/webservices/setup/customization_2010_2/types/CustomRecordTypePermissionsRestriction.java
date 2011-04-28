/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.setup.customization_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomRecordTypePermissionsRestriction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomRecordTypePermissionsRestriction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_editingOnly"/>
 *     &lt;enumeration value="_viewingAndEditing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomRecordTypePermissionsRestriction", namespace = "urn:types.customization_2010_2.setup.webservices.netsuite.com")
@XmlEnum
public enum CustomRecordTypePermissionsRestriction {

    @XmlEnumValue("_editingOnly")
    EDITING_ONLY("_editingOnly"),
    @XmlEnumValue("_viewingAndEditing")
    VIEWING_AND_EDITING("_viewingAndEditing");
    private final String value;

    CustomRecordTypePermissionsRestriction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomRecordTypePermissionsRestriction fromValue(String v) {
        for (CustomRecordTypePermissionsRestriction c: CustomRecordTypePermissionsRestriction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
