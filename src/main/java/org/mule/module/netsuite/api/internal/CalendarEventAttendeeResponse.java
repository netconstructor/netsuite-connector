/**
 * CalendarEventAttendeeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CalendarEventAttendeeResponse implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CalendarEventAttendeeResponse(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __accepted = "_accepted";
    public static final java.lang.String __declined = "_declined";
    public static final java.lang.String __noResponse = "_noResponse";
    public static final java.lang.String __tentative = "_tentative";
    public static final CalendarEventAttendeeResponse _accepted = new CalendarEventAttendeeResponse(__accepted);
    public static final CalendarEventAttendeeResponse _declined = new CalendarEventAttendeeResponse(__declined);
    public static final CalendarEventAttendeeResponse _noResponse = new CalendarEventAttendeeResponse(__noResponse);
    public static final CalendarEventAttendeeResponse _tentative = new CalendarEventAttendeeResponse(__tentative);
    public java.lang.String getValue() { return _value_;}
    public static CalendarEventAttendeeResponse fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CalendarEventAttendeeResponse enumeration = (CalendarEventAttendeeResponse)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CalendarEventAttendeeResponse fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CalendarEventAttendeeResponse.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "CalendarEventAttendeeResponse"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
