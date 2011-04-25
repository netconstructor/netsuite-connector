/**
 * CalendarEventAccessLevel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CalendarEventAccessLevel implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CalendarEventAccessLevel(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __private = "_private";
    public static final java.lang.String __public = "_public";
    public static final java.lang.String __showAsBusy = "_showAsBusy";
    public static final CalendarEventAccessLevel _private = new CalendarEventAccessLevel(__private);
    public static final CalendarEventAccessLevel _public = new CalendarEventAccessLevel(__public);
    public static final CalendarEventAccessLevel _showAsBusy = new CalendarEventAccessLevel(__showAsBusy);
    public java.lang.String getValue() { return _value_;}
    public static CalendarEventAccessLevel fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CalendarEventAccessLevel enumeration = (CalendarEventAccessLevel)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CalendarEventAccessLevel fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CalendarEventAccessLevel.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "CalendarEventAccessLevel"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
