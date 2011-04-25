/**
 * LandedCostSource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class LandedCostSource implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LandedCostSource(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __manual = "_manual";
    public static final java.lang.String __otherTransaction = "_otherTransaction";
    public static final java.lang.String __otherTransactionExcludeTax = "_otherTransactionExcludeTax";
    public static final java.lang.String __thisTransaction = "_thisTransaction";
    public static final LandedCostSource _manual = new LandedCostSource(__manual);
    public static final LandedCostSource _otherTransaction = new LandedCostSource(__otherTransaction);
    public static final LandedCostSource _otherTransactionExcludeTax = new LandedCostSource(__otherTransactionExcludeTax);
    public static final LandedCostSource _thisTransaction = new LandedCostSource(__thisTransaction);
    public java.lang.String getValue() { return _value_;}
    public static LandedCostSource fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LandedCostSource enumeration = (LandedCostSource)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LandedCostSource fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LandedCostSource.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "LandedCostSource"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
