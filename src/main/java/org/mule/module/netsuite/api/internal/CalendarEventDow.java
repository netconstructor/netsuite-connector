/**
 * CalendarEventDow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CalendarEventDow implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CalendarEventDow(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __sunday = "_sunday";
    public static final java.lang.String __monday = "_monday";
    public static final java.lang.String __tuesday = "_tuesday";
    public static final java.lang.String __wednesday = "_wednesday";
    public static final java.lang.String __thursday = "_thursday";
    public static final java.lang.String __friday = "_friday";
    public static final java.lang.String __saturday = "_saturday";
    public static final CalendarEventDow _sunday = new CalendarEventDow(__sunday);
    public static final CalendarEventDow _monday = new CalendarEventDow(__monday);
    public static final CalendarEventDow _tuesday = new CalendarEventDow(__tuesday);
    public static final CalendarEventDow _wednesday = new CalendarEventDow(__wednesday);
    public static final CalendarEventDow _thursday = new CalendarEventDow(__thursday);
    public static final CalendarEventDow _friday = new CalendarEventDow(__friday);
    public static final CalendarEventDow _saturday = new CalendarEventDow(__saturday);
    public java.lang.String getValue() { return _value_;}
    public static CalendarEventDow fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CalendarEventDow enumeration = (CalendarEventDow)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CalendarEventDow fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CalendarEventDow.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "CalendarEventDow"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
