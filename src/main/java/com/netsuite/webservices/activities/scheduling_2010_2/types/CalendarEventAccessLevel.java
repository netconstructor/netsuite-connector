
package com.netsuite.webservices.activities.scheduling_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalendarEventAccessLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalendarEventAccessLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_private"/>
 *     &lt;enumeration value="_public"/>
 *     &lt;enumeration value="_showAsBusy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CalendarEventAccessLevel", namespace = "urn:types.scheduling_2010_2.activities.webservices.netsuite.com")
@XmlEnum
public enum CalendarEventAccessLevel {

    @XmlEnumValue("_private")
    PRIVATE("_private"),
    @XmlEnumValue("_public")
    PUBLIC("_public"),
    @XmlEnumValue("_showAsBusy")
    SHOW_AS_BUSY("_showAsBusy");
    private final String value;

    CalendarEventAccessLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalendarEventAccessLevel fromValue(String v) {
        for (CalendarEventAccessLevel c: CalendarEventAccessLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
