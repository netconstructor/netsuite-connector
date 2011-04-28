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
 * <p>Java class for CustomizationFieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomizationFieldType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_checkBox"/>
 *     &lt;enumeration value="_currency"/>
 *     &lt;enumeration value="_date"/>
 *     &lt;enumeration value="_decimalNumber"/>
 *     &lt;enumeration value="_document"/>
 *     &lt;enumeration value="_eMailAddress"/>
 *     &lt;enumeration value="_freeFormText"/>
 *     &lt;enumeration value="_help"/>
 *     &lt;enumeration value="_hyperlink"/>
 *     &lt;enumeration value="_image"/>
 *     &lt;enumeration value="_inlineHTML"/>
 *     &lt;enumeration value="_integerNumber"/>
 *     &lt;enumeration value="_listRecord"/>
 *     &lt;enumeration value="_longText"/>
 *     &lt;enumeration value="_multipleSelect"/>
 *     &lt;enumeration value="_password"/>
 *     &lt;enumeration value="_percent"/>
 *     &lt;enumeration value="_phoneNumber"/>
 *     &lt;enumeration value="_richText"/>
 *     &lt;enumeration value="_textArea"/>
 *     &lt;enumeration value="_timeOfDay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomizationFieldType", namespace = "urn:types.customization_2010_2.setup.webservices.netsuite.com")
@XmlEnum
public enum CustomizationFieldType {

    @XmlEnumValue("_checkBox")
    CHECK_BOX("_checkBox"),
    @XmlEnumValue("_currency")
    CURRENCY("_currency"),
    @XmlEnumValue("_date")
    DATE("_date"),
    @XmlEnumValue("_decimalNumber")
    DECIMAL_NUMBER("_decimalNumber"),
    @XmlEnumValue("_document")
    DOCUMENT("_document"),
    @XmlEnumValue("_eMailAddress")
    E_MAIL_ADDRESS("_eMailAddress"),
    @XmlEnumValue("_freeFormText")
    FREE_FORM_TEXT("_freeFormText"),
    @XmlEnumValue("_help")
    HELP("_help"),
    @XmlEnumValue("_hyperlink")
    HYPERLINK("_hyperlink"),
    @XmlEnumValue("_image")
    IMAGE("_image"),
    @XmlEnumValue("_inlineHTML")
    INLINE_HTML("_inlineHTML"),
    @XmlEnumValue("_integerNumber")
    INTEGER_NUMBER("_integerNumber"),
    @XmlEnumValue("_listRecord")
    LIST_RECORD("_listRecord"),
    @XmlEnumValue("_longText")
    LONG_TEXT("_longText"),
    @XmlEnumValue("_multipleSelect")
    MULTIPLE_SELECT("_multipleSelect"),
    @XmlEnumValue("_password")
    PASSWORD("_password"),
    @XmlEnumValue("_percent")
    PERCENT("_percent"),
    @XmlEnumValue("_phoneNumber")
    PHONE_NUMBER("_phoneNumber"),
    @XmlEnumValue("_richText")
    RICH_TEXT("_richText"),
    @XmlEnumValue("_textArea")
    TEXT_AREA("_textArea"),
    @XmlEnumValue("_timeOfDay")
    TIME_OF_DAY("_timeOfDay");
    private final String value;

    CustomizationFieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomizationFieldType fromValue(String v) {
        for (CustomizationFieldType c: CustomizationFieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
