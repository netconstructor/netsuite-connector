/**
 * ItemCostEstimateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ItemCostEstimateType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemCostEstimateType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __averageCost = "_averageCost";
    public static final java.lang.String __custom = "_custom";
    public static final java.lang.String __derivedFromMemberItems = "_derivedFromMemberItems";
    public static final java.lang.String __itemDefinedCost = "_itemDefinedCost";
    public static final java.lang.String __lastPurchasePrice = "_lastPurchasePrice";
    public static final java.lang.String __preferredVendorRate = "_preferredVendorRate";
    public static final java.lang.String __purchaseOrderRate = "_purchaseOrderRate";
    public static final java.lang.String __purchasePrice = "_purchasePrice";
    public static final ItemCostEstimateType _averageCost = new ItemCostEstimateType(__averageCost);
    public static final ItemCostEstimateType _custom = new ItemCostEstimateType(__custom);
    public static final ItemCostEstimateType _derivedFromMemberItems = new ItemCostEstimateType(__derivedFromMemberItems);
    public static final ItemCostEstimateType _itemDefinedCost = new ItemCostEstimateType(__itemDefinedCost);
    public static final ItemCostEstimateType _lastPurchasePrice = new ItemCostEstimateType(__lastPurchasePrice);
    public static final ItemCostEstimateType _preferredVendorRate = new ItemCostEstimateType(__preferredVendorRate);
    public static final ItemCostEstimateType _purchaseOrderRate = new ItemCostEstimateType(__purchaseOrderRate);
    public static final ItemCostEstimateType _purchasePrice = new ItemCostEstimateType(__purchasePrice);
    public java.lang.String getValue() { return _value_;}
    public static ItemCostEstimateType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemCostEstimateType enumeration = (ItemCostEstimateType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemCostEstimateType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ItemCostEstimateType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "ItemCostEstimateType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
