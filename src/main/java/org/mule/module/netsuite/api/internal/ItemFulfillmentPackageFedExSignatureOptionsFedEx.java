/**
 * ItemFulfillmentPackageFedExSignatureOptionsFedEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ItemFulfillmentPackageFedExSignatureOptionsFedEx implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemFulfillmentPackageFedExSignatureOptionsFedEx(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __adult = "_adult";
    public static final java.lang.String __direct = "_direct";
    public static final java.lang.String __indirect = "_indirect";
    public static final ItemFulfillmentPackageFedExSignatureOptionsFedEx _adult = new ItemFulfillmentPackageFedExSignatureOptionsFedEx(__adult);
    public static final ItemFulfillmentPackageFedExSignatureOptionsFedEx _direct = new ItemFulfillmentPackageFedExSignatureOptionsFedEx(__direct);
    public static final ItemFulfillmentPackageFedExSignatureOptionsFedEx _indirect = new ItemFulfillmentPackageFedExSignatureOptionsFedEx(__indirect);
    public java.lang.String getValue() { return _value_;}
    public static ItemFulfillmentPackageFedExSignatureOptionsFedEx fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemFulfillmentPackageFedExSignatureOptionsFedEx enumeration = (ItemFulfillmentPackageFedExSignatureOptionsFedEx)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemFulfillmentPackageFedExSignatureOptionsFedEx fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ItemFulfillmentPackageFedExSignatureOptionsFedEx.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExSignatureOptionsFedEx"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
