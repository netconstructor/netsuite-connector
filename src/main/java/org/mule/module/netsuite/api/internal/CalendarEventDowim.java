/**
 * CalendarEventDowim.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CalendarEventDowim implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CalendarEventDowim(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __first = "_first";
    public static final java.lang.String __second = "_second";
    public static final java.lang.String __third = "_third";
    public static final java.lang.String __fourth = "_fourth";
    public static final java.lang.String __last = "_last";
    public static final CalendarEventDowim _first = new CalendarEventDowim(__first);
    public static final CalendarEventDowim _second = new CalendarEventDowim(__second);
    public static final CalendarEventDowim _third = new CalendarEventDowim(__third);
    public static final CalendarEventDowim _fourth = new CalendarEventDowim(__fourth);
    public static final CalendarEventDowim _last = new CalendarEventDowim(__last);
    public java.lang.String getValue() { return _value_;}
    public static CalendarEventDowim fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CalendarEventDowim enumeration = (CalendarEventDowim)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CalendarEventDowim fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CalendarEventDowim.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "CalendarEventDowim"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
