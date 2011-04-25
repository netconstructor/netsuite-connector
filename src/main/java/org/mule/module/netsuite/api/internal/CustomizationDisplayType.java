/**
 * CustomizationDisplayType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomizationDisplayType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomizationDisplayType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __disabled = "_disabled";
    public static final java.lang.String __hidden = "_hidden";
    public static final java.lang.String __inlineText = "_inlineText";
    public static final java.lang.String __normal = "_normal";
    public static final java.lang.String __showAsList = "_showAsList";
    public static final CustomizationDisplayType _disabled = new CustomizationDisplayType(__disabled);
    public static final CustomizationDisplayType _hidden = new CustomizationDisplayType(__hidden);
    public static final CustomizationDisplayType _inlineText = new CustomizationDisplayType(__inlineText);
    public static final CustomizationDisplayType _normal = new CustomizationDisplayType(__normal);
    public static final CustomizationDisplayType _showAsList = new CustomizationDisplayType(__showAsList);
    public java.lang.String getValue() { return _value_;}
    public static CustomizationDisplayType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomizationDisplayType enumeration = (CustomizationDisplayType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomizationDisplayType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CustomizationDisplayType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2010_2.setup.webservices.netsuite.com", "CustomizationDisplayType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
