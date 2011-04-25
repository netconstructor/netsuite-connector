/**
 * ItemFulfillmentPackageFedExPackagingFedEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ItemFulfillmentPackageFedExPackagingFedEx implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemFulfillmentPackageFedExPackagingFedEx(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __fedExBox = "_fedExBox";
    public static final java.lang.String __fedEx10kgBox = "_fedEx10kgBox";
    public static final java.lang.String __fedEx25kgBox = "_fedEx25kgBox";
    public static final java.lang.String __fedExEnvelope = "_fedExEnvelope";
    public static final java.lang.String __fedExPak = "_fedExPak";
    public static final java.lang.String __fedExTube = "_fedExTube";
    public static final java.lang.String __yourPackaging = "_yourPackaging";
    public static final ItemFulfillmentPackageFedExPackagingFedEx _fedExBox = new ItemFulfillmentPackageFedExPackagingFedEx(__fedExBox);
    public static final ItemFulfillmentPackageFedExPackagingFedEx _fedEx10kgBox = new ItemFulfillmentPackageFedExPackagingFedEx(__fedEx10kgBox);
    public static final ItemFulfillmentPackageFedExPackagingFedEx _fedEx25kgBox = new ItemFulfillmentPackageFedExPackagingFedEx(__fedEx25kgBox);
    public static final ItemFulfillmentPackageFedExPackagingFedEx _fedExEnvelope = new ItemFulfillmentPackageFedExPackagingFedEx(__fedExEnvelope);
    public static final ItemFulfillmentPackageFedExPackagingFedEx _fedExPak = new ItemFulfillmentPackageFedExPackagingFedEx(__fedExPak);
    public static final ItemFulfillmentPackageFedExPackagingFedEx _fedExTube = new ItemFulfillmentPackageFedExPackagingFedEx(__fedExTube);
    public static final ItemFulfillmentPackageFedExPackagingFedEx _yourPackaging = new ItemFulfillmentPackageFedExPackagingFedEx(__yourPackaging);
    public java.lang.String getValue() { return _value_;}
    public static ItemFulfillmentPackageFedExPackagingFedEx fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemFulfillmentPackageFedExPackagingFedEx enumeration = (ItemFulfillmentPackageFedExPackagingFedEx)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemFulfillmentPackageFedExPackagingFedEx fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ItemFulfillmentPackageFedExPackagingFedEx.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExPackagingFedEx"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
