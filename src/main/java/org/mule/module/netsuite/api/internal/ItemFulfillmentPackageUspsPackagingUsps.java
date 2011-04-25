/**
 * ItemFulfillmentPackageUspsPackagingUsps.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ItemFulfillmentPackageUspsPackagingUsps implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemFulfillmentPackageUspsPackagingUsps(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __parcel = "_parcel";
    public static final java.lang.String __flatRateBox = "_flatRateBox";
    public static final java.lang.String __flatRateEnvelope = "_flatRateEnvelope";
    public static final java.lang.String __smallFlatRateBox = "_smallFlatRateBox";
    public static final java.lang.String __mediumFlatRateBox = "_mediumFlatRateBox";
    public static final java.lang.String __largeFlatRateBox = "_largeFlatRateBox";
    public static final java.lang.String __irregularPackage = "_irregularPackage";
    public static final java.lang.String __largePackage = "_largePackage";
    public static final java.lang.String __oversizedPackage = "_oversizedPackage";
    public static final ItemFulfillmentPackageUspsPackagingUsps _parcel = new ItemFulfillmentPackageUspsPackagingUsps(__parcel);
    public static final ItemFulfillmentPackageUspsPackagingUsps _flatRateBox = new ItemFulfillmentPackageUspsPackagingUsps(__flatRateBox);
    public static final ItemFulfillmentPackageUspsPackagingUsps _flatRateEnvelope = new ItemFulfillmentPackageUspsPackagingUsps(__flatRateEnvelope);
    public static final ItemFulfillmentPackageUspsPackagingUsps _smallFlatRateBox = new ItemFulfillmentPackageUspsPackagingUsps(__smallFlatRateBox);
    public static final ItemFulfillmentPackageUspsPackagingUsps _mediumFlatRateBox = new ItemFulfillmentPackageUspsPackagingUsps(__mediumFlatRateBox);
    public static final ItemFulfillmentPackageUspsPackagingUsps _largeFlatRateBox = new ItemFulfillmentPackageUspsPackagingUsps(__largeFlatRateBox);
    public static final ItemFulfillmentPackageUspsPackagingUsps _irregularPackage = new ItemFulfillmentPackageUspsPackagingUsps(__irregularPackage);
    public static final ItemFulfillmentPackageUspsPackagingUsps _largePackage = new ItemFulfillmentPackageUspsPackagingUsps(__largePackage);
    public static final ItemFulfillmentPackageUspsPackagingUsps _oversizedPackage = new ItemFulfillmentPackageUspsPackagingUsps(__oversizedPackage);
    public java.lang.String getValue() { return _value_;}
    public static ItemFulfillmentPackageUspsPackagingUsps fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemFulfillmentPackageUspsPackagingUsps enumeration = (ItemFulfillmentPackageUspsPackagingUsps)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemFulfillmentPackageUspsPackagingUsps fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ItemFulfillmentPackageUspsPackagingUsps.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUspsPackagingUsps"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
