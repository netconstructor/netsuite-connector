/**
 * ItemProductFeed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ItemProductFeed implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemProductFeed(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __googleBase = "_googleBase";
    public static final java.lang.String __nexTag = "_nexTag";
    public static final java.lang.String __shoppingCom = "_shoppingCom";
    public static final java.lang.String __shopzilla = "_shopzilla";
    public static final java.lang.String __yahooShopping = "_yahooShopping";
    public static final ItemProductFeed _googleBase = new ItemProductFeed(__googleBase);
    public static final ItemProductFeed _nexTag = new ItemProductFeed(__nexTag);
    public static final ItemProductFeed _shoppingCom = new ItemProductFeed(__shoppingCom);
    public static final ItemProductFeed _shopzilla = new ItemProductFeed(__shopzilla);
    public static final ItemProductFeed _yahooShopping = new ItemProductFeed(__yahooShopping);
    public java.lang.String getValue() { return _value_;}
    public static ItemProductFeed fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemProductFeed enumeration = (ItemProductFeed)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemProductFeed fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ItemProductFeed.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ItemProductFeed"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
