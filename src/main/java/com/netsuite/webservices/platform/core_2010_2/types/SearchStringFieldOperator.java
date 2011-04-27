
package com.netsuite.webservices.platform.core_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchStringFieldOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchStringFieldOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="contains"/>
 *     &lt;enumeration value="doesNotContain"/>
 *     &lt;enumeration value="doesNotStartWith"/>
 *     &lt;enumeration value="empty"/>
 *     &lt;enumeration value="hasKeywords"/>
 *     &lt;enumeration value="is"/>
 *     &lt;enumeration value="isNot"/>
 *     &lt;enumeration value="notEmpty"/>
 *     &lt;enumeration value="startsWith"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchStringFieldOperator", namespace = "urn:types.core_2010_2.platform.webservices.netsuite.com")
@XmlEnum
public enum SearchStringFieldOperator {

    @XmlEnumValue("contains")
    CONTAINS("contains"),
    @XmlEnumValue("doesNotContain")
    DOES_NOT_CONTAIN("doesNotContain"),
    @XmlEnumValue("doesNotStartWith")
    DOES_NOT_START_WITH("doesNotStartWith"),
    @XmlEnumValue("empty")
    EMPTY("empty"),
    @XmlEnumValue("hasKeywords")
    HAS_KEYWORDS("hasKeywords"),
    @XmlEnumValue("is")
    IS("is"),
    @XmlEnumValue("isNot")
    IS_NOT("isNot"),
    @XmlEnumValue("notEmpty")
    NOT_EMPTY("notEmpty"),
    @XmlEnumValue("startsWith")
    STARTS_WITH("startsWith");
    private final String value;

    SearchStringFieldOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchStringFieldOperator fromValue(String v) {
        for (SearchStringFieldOperator c: SearchStringFieldOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
