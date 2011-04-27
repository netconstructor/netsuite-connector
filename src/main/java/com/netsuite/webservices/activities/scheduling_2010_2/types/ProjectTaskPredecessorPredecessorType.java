
package com.netsuite.webservices.activities.scheduling_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectTaskPredecessorPredecessorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProjectTaskPredecessorPredecessorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_finishToStart"/>
 *     &lt;enumeration value="_startToStart"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProjectTaskPredecessorPredecessorType", namespace = "urn:types.scheduling_2010_2.activities.webservices.netsuite.com")
@XmlEnum
public enum ProjectTaskPredecessorPredecessorType {

    @XmlEnumValue("_finishToStart")
    FINISH_TO_START("_finishToStart"),
    @XmlEnumValue("_startToStart")
    START_TO_START("_startToStart");
    private final String value;

    ProjectTaskPredecessorPredecessorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProjectTaskPredecessorPredecessorType fromValue(String v) {
        for (ProjectTaskPredecessorPredecessorType c: ProjectTaskPredecessorPredecessorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
