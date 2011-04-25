/**
 * ItemFulfillmentLicenseExceptionUps.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ItemFulfillmentLicenseExceptionUps implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemFulfillmentLicenseExceptionUps(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __agr = "_agr";
    public static final java.lang.String __apr = "_apr";
    public static final java.lang.String __avs = "_avs";
    public static final java.lang.String __bag = "_bag";
    public static final java.lang.String __civ = "_civ";
    public static final java.lang.String __ctp = "_ctp";
    public static final java.lang.String __enc = "_enc";
    public static final java.lang.String __gbs = "_gbs";
    public static final java.lang.String __gft = "_gft";
    public static final java.lang.String __gov = "_gov";
    public static final java.lang.String __kmi = "_kmi";
    public static final java.lang.String __lvs = "_lvs";
    public static final java.lang.String __nlr = "_nlr";
    public static final java.lang.String __rpl = "_rpl";
    public static final java.lang.String __tmp = "_tmp";
    public static final java.lang.String __tspa = "_tspa";
    public static final java.lang.String __tsr = "_tsr";
    public static final java.lang.String __tsu = "_tsu";
    public static final ItemFulfillmentLicenseExceptionUps _agr = new ItemFulfillmentLicenseExceptionUps(__agr);
    public static final ItemFulfillmentLicenseExceptionUps _apr = new ItemFulfillmentLicenseExceptionUps(__apr);
    public static final ItemFulfillmentLicenseExceptionUps _avs = new ItemFulfillmentLicenseExceptionUps(__avs);
    public static final ItemFulfillmentLicenseExceptionUps _bag = new ItemFulfillmentLicenseExceptionUps(__bag);
    public static final ItemFulfillmentLicenseExceptionUps _civ = new ItemFulfillmentLicenseExceptionUps(__civ);
    public static final ItemFulfillmentLicenseExceptionUps _ctp = new ItemFulfillmentLicenseExceptionUps(__ctp);
    public static final ItemFulfillmentLicenseExceptionUps _enc = new ItemFulfillmentLicenseExceptionUps(__enc);
    public static final ItemFulfillmentLicenseExceptionUps _gbs = new ItemFulfillmentLicenseExceptionUps(__gbs);
    public static final ItemFulfillmentLicenseExceptionUps _gft = new ItemFulfillmentLicenseExceptionUps(__gft);
    public static final ItemFulfillmentLicenseExceptionUps _gov = new ItemFulfillmentLicenseExceptionUps(__gov);
    public static final ItemFulfillmentLicenseExceptionUps _kmi = new ItemFulfillmentLicenseExceptionUps(__kmi);
    public static final ItemFulfillmentLicenseExceptionUps _lvs = new ItemFulfillmentLicenseExceptionUps(__lvs);
    public static final ItemFulfillmentLicenseExceptionUps _nlr = new ItemFulfillmentLicenseExceptionUps(__nlr);
    public static final ItemFulfillmentLicenseExceptionUps _rpl = new ItemFulfillmentLicenseExceptionUps(__rpl);
    public static final ItemFulfillmentLicenseExceptionUps _tmp = new ItemFulfillmentLicenseExceptionUps(__tmp);
    public static final ItemFulfillmentLicenseExceptionUps _tspa = new ItemFulfillmentLicenseExceptionUps(__tspa);
    public static final ItemFulfillmentLicenseExceptionUps _tsr = new ItemFulfillmentLicenseExceptionUps(__tsr);
    public static final ItemFulfillmentLicenseExceptionUps _tsu = new ItemFulfillmentLicenseExceptionUps(__tsu);
    public java.lang.String getValue() { return _value_;}
    public static ItemFulfillmentLicenseExceptionUps fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemFulfillmentLicenseExceptionUps enumeration = (ItemFulfillmentLicenseExceptionUps)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemFulfillmentLicenseExceptionUps fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ItemFulfillmentLicenseExceptionUps.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentLicenseExceptionUps"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
