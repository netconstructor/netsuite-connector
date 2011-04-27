
package com.netsuite.webservices.activities.scheduling_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectTaskConstraintType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProjectTaskConstraintType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_asSoonAsPossible"/>
 *     &lt;enumeration value="_fixedStart"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProjectTaskConstraintType", namespace = "urn:types.scheduling_2010_2.activities.webservices.netsuite.com")
@XmlEnum
public enum ProjectTaskConstraintType {

    @XmlEnumValue("_asSoonAsPossible")
    AS_SOON_AS_POSSIBLE("_asSoonAsPossible"),
    @XmlEnumValue("_fixedStart")
    FIXED_START("_fixedStart");
    private final String value;

    ProjectTaskConstraintType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProjectTaskConstraintType fromValue(String v) {
        for (ProjectTaskConstraintType c: ProjectTaskConstraintType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
