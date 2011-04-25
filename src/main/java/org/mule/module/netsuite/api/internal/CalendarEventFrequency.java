/**
 * CalendarEventFrequency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CalendarEventFrequency implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CalendarEventFrequency(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __none = "_none";
    public static final java.lang.String __day = "_day";
    public static final java.lang.String __week = "_week";
    public static final java.lang.String __month = "_month";
    public static final java.lang.String __year = "_year";
    public static final CalendarEventFrequency _none = new CalendarEventFrequency(__none);
    public static final CalendarEventFrequency _day = new CalendarEventFrequency(__day);
    public static final CalendarEventFrequency _week = new CalendarEventFrequency(__week);
    public static final CalendarEventFrequency _month = new CalendarEventFrequency(__month);
    public static final CalendarEventFrequency _year = new CalendarEventFrequency(__year);
    public java.lang.String getValue() { return _value_;}
    public static CalendarEventFrequency fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CalendarEventFrequency enumeration = (CalendarEventFrequency)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CalendarEventFrequency fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalendarEventFrequency.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "CalendarEventFrequency"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
