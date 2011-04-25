/**
 * SitemapPriority.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SitemapPriority implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SitemapPriority(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __00 = "_00";
    public static final java.lang.String __01 = "_01";
    public static final java.lang.String __02 = "_02";
    public static final java.lang.String __03 = "_03";
    public static final java.lang.String __04 = "_04";
    public static final java.lang.String __05 = "_05";
    public static final java.lang.String __06 = "_06";
    public static final java.lang.String __07 = "_07";
    public static final java.lang.String __08 = "_08";
    public static final java.lang.String __09 = "_09";
    public static final java.lang.String __10 = "_10";
    public static final java.lang.String __auto = "_auto";
    public static final SitemapPriority _00 = new SitemapPriority(__00);
    public static final SitemapPriority _01 = new SitemapPriority(__01);
    public static final SitemapPriority _02 = new SitemapPriority(__02);
    public static final SitemapPriority _03 = new SitemapPriority(__03);
    public static final SitemapPriority _04 = new SitemapPriority(__04);
    public static final SitemapPriority _05 = new SitemapPriority(__05);
    public static final SitemapPriority _06 = new SitemapPriority(__06);
    public static final SitemapPriority _07 = new SitemapPriority(__07);
    public static final SitemapPriority _08 = new SitemapPriority(__08);
    public static final SitemapPriority _09 = new SitemapPriority(__09);
    public static final SitemapPriority _10 = new SitemapPriority(__10);
    public static final SitemapPriority _auto = new SitemapPriority(__auto);
    public java.lang.String getValue() { return _value_;}
    public static SitemapPriority fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SitemapPriority enumeration = (SitemapPriority)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SitemapPriority fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SitemapPriority.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "SitemapPriority"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
