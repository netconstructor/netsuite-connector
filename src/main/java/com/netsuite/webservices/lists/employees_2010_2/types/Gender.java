
package com.netsuite.webservices.lists.employees_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Gender.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Gender">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_omitted"/>
 *     &lt;enumeration value="_female"/>
 *     &lt;enumeration value="_male"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Gender", namespace = "urn:types.employees_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum Gender {

    @XmlEnumValue("_omitted")
    OMITTED("_omitted"),
    @XmlEnumValue("_female")
    FEMALE("_female"),
    @XmlEnumValue("_male")
    MALE("_male");
    private final String value;

    Gender(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Gender fromValue(String v) {
        for (Gender c: Gender.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
