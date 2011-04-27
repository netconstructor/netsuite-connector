
package com.netsuite.webservices.platform.core_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchEnumMultiSelectFieldOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchEnumMultiSelectFieldOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="anyOf"/>
 *     &lt;enumeration value="noneOf"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchEnumMultiSelectFieldOperator", namespace = "urn:types.core_2010_2.platform.webservices.netsuite.com")
@XmlEnum
public enum SearchEnumMultiSelectFieldOperator {

    @XmlEnumValue("anyOf")
    ANY_OF("anyOf"),
    @XmlEnumValue("noneOf")
    NONE_OF("noneOf");
    private final String value;

    SearchEnumMultiSelectFieldOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchEnumMultiSelectFieldOperator fromValue(String v) {
        for (SearchEnumMultiSelectFieldOperator c: SearchEnumMultiSelectFieldOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
