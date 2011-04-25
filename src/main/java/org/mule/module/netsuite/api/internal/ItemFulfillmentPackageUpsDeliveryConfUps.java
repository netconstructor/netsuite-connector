/**
 * ItemFulfillmentPackageUpsDeliveryConfUps.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ItemFulfillmentPackageUpsDeliveryConfUps implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemFulfillmentPackageUpsDeliveryConfUps(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __noneSelected = "_noneSelected";
    public static final java.lang.String __adultSignatureRequired = "_adultSignatureRequired";
    public static final java.lang.String __deliveryConfirmation = "_deliveryConfirmation";
    public static final java.lang.String __signatureRequired = "_signatureRequired";
    public static final ItemFulfillmentPackageUpsDeliveryConfUps _noneSelected = new ItemFulfillmentPackageUpsDeliveryConfUps(__noneSelected);
    public static final ItemFulfillmentPackageUpsDeliveryConfUps _adultSignatureRequired = new ItemFulfillmentPackageUpsDeliveryConfUps(__adultSignatureRequired);
    public static final ItemFulfillmentPackageUpsDeliveryConfUps _deliveryConfirmation = new ItemFulfillmentPackageUpsDeliveryConfUps(__deliveryConfirmation);
    public static final ItemFulfillmentPackageUpsDeliveryConfUps _signatureRequired = new ItemFulfillmentPackageUpsDeliveryConfUps(__signatureRequired);
    public java.lang.String getValue() { return _value_;}
    public static ItemFulfillmentPackageUpsDeliveryConfUps fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemFulfillmentPackageUpsDeliveryConfUps enumeration = (ItemFulfillmentPackageUpsDeliveryConfUps)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemFulfillmentPackageUpsDeliveryConfUps fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ItemFulfillmentPackageUpsDeliveryConfUps.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUpsDeliveryConfUps"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
