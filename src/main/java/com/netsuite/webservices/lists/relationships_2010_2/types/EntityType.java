
package com.netsuite.webservices.lists.relationships_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_contact"/>
 *     &lt;enumeration value="_company"/>
 *     &lt;enumeration value="_customer"/>
 *     &lt;enumeration value="_employee"/>
 *     &lt;enumeration value="_group"/>
 *     &lt;enumeration value="_job"/>
 *     &lt;enumeration value="_otherName"/>
 *     &lt;enumeration value="_partner"/>
 *     &lt;enumeration value="_vendor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityType", namespace = "urn:types.relationships_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum EntityType {

    @XmlEnumValue("_contact")
    CONTACT("_contact"),
    @XmlEnumValue("_company")
    COMPANY("_company"),
    @XmlEnumValue("_customer")
    CUSTOMER("_customer"),
    @XmlEnumValue("_employee")
    EMPLOYEE("_employee"),
    @XmlEnumValue("_group")
    GROUP("_group"),
    @XmlEnumValue("_job")
    JOB("_job"),
    @XmlEnumValue("_otherName")
    OTHER_NAME("_otherName"),
    @XmlEnumValue("_partner")
    PARTNER("_partner"),
    @XmlEnumValue("_vendor")
    VENDOR("_vendor");
    private final String value;

    EntityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityType fromValue(String v) {
        for (EntityType c: EntityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
