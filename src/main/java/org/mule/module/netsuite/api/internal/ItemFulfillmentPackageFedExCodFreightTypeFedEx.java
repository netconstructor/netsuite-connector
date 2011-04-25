/**
 * ItemFulfillmentPackageFedExCodFreightTypeFedEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ItemFulfillmentPackageFedExCodFreightTypeFedEx implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemFulfillmentPackageFedExCodFreightTypeFedEx(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __cODCharge = "_cODCharge";
    public static final java.lang.String __noneSelected = "_noneSelected";
    public static final java.lang.String __orderChargeNet = "_orderChargeNet";
    public static final java.lang.String __orderChargeTotal = "_orderChargeTotal";
    public static final java.lang.String __shippingCharge = "_shippingCharge";
    public static final java.lang.String __totalCharge = "_totalCharge";
    public static final ItemFulfillmentPackageFedExCodFreightTypeFedEx _cODCharge = new ItemFulfillmentPackageFedExCodFreightTypeFedEx(__cODCharge);
    public static final ItemFulfillmentPackageFedExCodFreightTypeFedEx _noneSelected = new ItemFulfillmentPackageFedExCodFreightTypeFedEx(__noneSelected);
    public static final ItemFulfillmentPackageFedExCodFreightTypeFedEx _orderChargeNet = new ItemFulfillmentPackageFedExCodFreightTypeFedEx(__orderChargeNet);
    public static final ItemFulfillmentPackageFedExCodFreightTypeFedEx _orderChargeTotal = new ItemFulfillmentPackageFedExCodFreightTypeFedEx(__orderChargeTotal);
    public static final ItemFulfillmentPackageFedExCodFreightTypeFedEx _shippingCharge = new ItemFulfillmentPackageFedExCodFreightTypeFedEx(__shippingCharge);
    public static final ItemFulfillmentPackageFedExCodFreightTypeFedEx _totalCharge = new ItemFulfillmentPackageFedExCodFreightTypeFedEx(__totalCharge);
    public java.lang.String getValue() { return _value_;}
    public static ItemFulfillmentPackageFedExCodFreightTypeFedEx fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemFulfillmentPackageFedExCodFreightTypeFedEx enumeration = (ItemFulfillmentPackageFedExCodFreightTypeFedEx)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemFulfillmentPackageFedExCodFreightTypeFedEx fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ItemFulfillmentPackageFedExCodFreightTypeFedEx.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExCodFreightTypeFedEx"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
