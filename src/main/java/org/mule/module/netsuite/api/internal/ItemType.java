/**
 * ItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ItemType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __assembly = "_assembly";
    public static final java.lang.String __description = "_description";
    public static final java.lang.String __discount = "_discount";
    public static final java.lang.String __downloadItem = "_downloadItem";
    public static final java.lang.String __giftCertificateItem = "_giftCertificateItem";
    public static final java.lang.String __inventoryItem = "_inventoryItem";
    public static final java.lang.String __itemGroup = "_itemGroup";
    public static final java.lang.String __kit = "_kit";
    public static final java.lang.String __markup = "_markup";
    public static final java.lang.String __nonInventoryItem = "_nonInventoryItem";
    public static final java.lang.String __otherCharge = "_otherCharge";
    public static final java.lang.String __payment = "_payment";
    public static final java.lang.String __service = "_service";
    public static final java.lang.String __subtotal = "_subtotal";
    public static final ItemType _assembly = new ItemType(__assembly);
    public static final ItemType _description = new ItemType(__description);
    public static final ItemType _discount = new ItemType(__discount);
    public static final ItemType _downloadItem = new ItemType(__downloadItem);
    public static final ItemType _giftCertificateItem = new ItemType(__giftCertificateItem);
    public static final ItemType _inventoryItem = new ItemType(__inventoryItem);
    public static final ItemType _itemGroup = new ItemType(__itemGroup);
    public static final ItemType _kit = new ItemType(__kit);
    public static final ItemType _markup = new ItemType(__markup);
    public static final ItemType _nonInventoryItem = new ItemType(__nonInventoryItem);
    public static final ItemType _otherCharge = new ItemType(__otherCharge);
    public static final ItemType _payment = new ItemType(__payment);
    public static final ItemType _service = new ItemType(__service);
    public static final ItemType _subtotal = new ItemType(__subtotal);
    public java.lang.String getValue() { return _value_;}
    public static ItemType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemType enumeration = (ItemType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ItemType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ItemType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
