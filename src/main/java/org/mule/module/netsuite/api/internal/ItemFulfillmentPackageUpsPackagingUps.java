/**
 * ItemFulfillmentPackageUpsPackagingUps.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ItemFulfillmentPackageUpsPackagingUps implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemFulfillmentPackageUpsPackagingUps(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __upsExpressBox = "_upsExpressBox";
    public static final java.lang.String __upsLetter = "_upsLetter";
    public static final java.lang.String __upsPak = "_upsPak";
    public static final java.lang.String __upsTube = "_upsTube";
    public static final java.lang.String __yourPackaging = "_yourPackaging";
    public static final ItemFulfillmentPackageUpsPackagingUps _upsExpressBox = new ItemFulfillmentPackageUpsPackagingUps(__upsExpressBox);
    public static final ItemFulfillmentPackageUpsPackagingUps _upsLetter = new ItemFulfillmentPackageUpsPackagingUps(__upsLetter);
    public static final ItemFulfillmentPackageUpsPackagingUps _upsPak = new ItemFulfillmentPackageUpsPackagingUps(__upsPak);
    public static final ItemFulfillmentPackageUpsPackagingUps _upsTube = new ItemFulfillmentPackageUpsPackagingUps(__upsTube);
    public static final ItemFulfillmentPackageUpsPackagingUps _yourPackaging = new ItemFulfillmentPackageUpsPackagingUps(__yourPackaging);
    public java.lang.String getValue() { return _value_;}
    public static ItemFulfillmentPackageUpsPackagingUps fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemFulfillmentPackageUpsPackagingUps enumeration = (ItemFulfillmentPackageUpsPackagingUps)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemFulfillmentPackageUpsPackagingUps fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ItemFulfillmentPackageUpsPackagingUps.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUpsPackagingUps"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
