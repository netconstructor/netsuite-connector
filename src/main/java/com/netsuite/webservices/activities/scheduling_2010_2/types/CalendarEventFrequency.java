
package com.netsuite.webservices.activities.scheduling_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalendarEventFrequency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalendarEventFrequency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_none"/>
 *     &lt;enumeration value="_day"/>
 *     &lt;enumeration value="_week"/>
 *     &lt;enumeration value="_month"/>
 *     &lt;enumeration value="_year"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CalendarEventFrequency", namespace = "urn:types.scheduling_2010_2.activities.webservices.netsuite.com")
@XmlEnum
public enum CalendarEventFrequency {

    @XmlEnumValue("_none")
    NONE("_none"),
    @XmlEnumValue("_day")
    DAY("_day"),
    @XmlEnumValue("_week")
    WEEK("_week"),
    @XmlEnumValue("_month")
    MONTH("_month"),
    @XmlEnumValue("_year")
    YEAR("_year");
    private final String value;

    CalendarEventFrequency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalendarEventFrequency fromValue(String v) {
        for (CalendarEventFrequency c: CalendarEventFrequency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
