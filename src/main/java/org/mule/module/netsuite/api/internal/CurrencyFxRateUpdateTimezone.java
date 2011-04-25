/**
 * CurrencyFxRateUpdateTimezone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CurrencyFxRateUpdateTimezone implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CurrencyFxRateUpdateTimezone(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __americaNewYork = "_americaNewYork";
    public static final java.lang.String __asiaMagadan = "_asiaMagadan";
    public static final java.lang.String __asiaTokyo = "_asiaTokyo";
    public static final java.lang.String __europeParis = "_europeParis";
    public static final CurrencyFxRateUpdateTimezone _americaNewYork = new CurrencyFxRateUpdateTimezone(__americaNewYork);
    public static final CurrencyFxRateUpdateTimezone _asiaMagadan = new CurrencyFxRateUpdateTimezone(__asiaMagadan);
    public static final CurrencyFxRateUpdateTimezone _asiaTokyo = new CurrencyFxRateUpdateTimezone(__asiaTokyo);
    public static final CurrencyFxRateUpdateTimezone _europeParis = new CurrencyFxRateUpdateTimezone(__europeParis);
    public java.lang.String getValue() { return _value_;}
    public static CurrencyFxRateUpdateTimezone fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CurrencyFxRateUpdateTimezone enumeration = (CurrencyFxRateUpdateTimezone)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CurrencyFxRateUpdateTimezone fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CurrencyFxRateUpdateTimezone.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "CurrencyFxRateUpdateTimezone"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
