/**
 * ItemFulfillmentExportTypeUps.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ItemFulfillmentExportTypeUps implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemFulfillmentExportTypeUps(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __domesticExports = "_domesticExports";
    public static final java.lang.String __foreignExports = "_foreignExports";
    public static final java.lang.String __foreignMilitarySales = "_foreignMilitarySales";
    public static final ItemFulfillmentExportTypeUps _domesticExports = new ItemFulfillmentExportTypeUps(__domesticExports);
    public static final ItemFulfillmentExportTypeUps _foreignExports = new ItemFulfillmentExportTypeUps(__foreignExports);
    public static final ItemFulfillmentExportTypeUps _foreignMilitarySales = new ItemFulfillmentExportTypeUps(__foreignMilitarySales);
    public java.lang.String getValue() { return _value_;}
    public static ItemFulfillmentExportTypeUps fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemFulfillmentExportTypeUps enumeration = (ItemFulfillmentExportTypeUps)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemFulfillmentExportTypeUps fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ItemFulfillmentExportTypeUps.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentExportTypeUps"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
