/**
 * AsyncStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class AsyncStatusType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AsyncStatusType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _failed = "failed";
    public static final java.lang.String _finishedWithErrors = "finishedWithErrors";
    public static final java.lang.String _pending = "pending";
    public static final java.lang.String _processing = "processing";
    public static final java.lang.String _finished = "finished";
    public static final AsyncStatusType failed = new AsyncStatusType(_failed);
    public static final AsyncStatusType finishedWithErrors = new AsyncStatusType(_finishedWithErrors);
    public static final AsyncStatusType pending = new AsyncStatusType(_pending);
    public static final AsyncStatusType processing = new AsyncStatusType(_processing);
    public static final AsyncStatusType finished = new AsyncStatusType(_finished);
    public java.lang.String getValue() { return _value_;}
    public static AsyncStatusType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AsyncStatusType enumeration = (AsyncStatusType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AsyncStatusType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AsyncStatusType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "AsyncStatusType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
