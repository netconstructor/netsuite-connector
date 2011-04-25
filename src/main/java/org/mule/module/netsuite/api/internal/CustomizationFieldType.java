/**
 * CustomizationFieldType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomizationFieldType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomizationFieldType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __checkBox = "_checkBox";
    public static final java.lang.String __currency = "_currency";
    public static final java.lang.String __date = "_date";
    public static final java.lang.String __decimalNumber = "_decimalNumber";
    public static final java.lang.String __document = "_document";
    public static final java.lang.String __eMailAddress = "_eMailAddress";
    public static final java.lang.String __freeFormText = "_freeFormText";
    public static final java.lang.String __help = "_help";
    public static final java.lang.String __hyperlink = "_hyperlink";
    public static final java.lang.String __image = "_image";
    public static final java.lang.String __inlineHTML = "_inlineHTML";
    public static final java.lang.String __integerNumber = "_integerNumber";
    public static final java.lang.String __listRecord = "_listRecord";
    public static final java.lang.String __longText = "_longText";
    public static final java.lang.String __multipleSelect = "_multipleSelect";
    public static final java.lang.String __password = "_password";
    public static final java.lang.String __percent = "_percent";
    public static final java.lang.String __phoneNumber = "_phoneNumber";
    public static final java.lang.String __richText = "_richText";
    public static final java.lang.String __textArea = "_textArea";
    public static final java.lang.String __timeOfDay = "_timeOfDay";
    public static final CustomizationFieldType _checkBox = new CustomizationFieldType(__checkBox);
    public static final CustomizationFieldType _currency = new CustomizationFieldType(__currency);
    public static final CustomizationFieldType _date = new CustomizationFieldType(__date);
    public static final CustomizationFieldType _decimalNumber = new CustomizationFieldType(__decimalNumber);
    public static final CustomizationFieldType _document = new CustomizationFieldType(__document);
    public static final CustomizationFieldType _eMailAddress = new CustomizationFieldType(__eMailAddress);
    public static final CustomizationFieldType _freeFormText = new CustomizationFieldType(__freeFormText);
    public static final CustomizationFieldType _help = new CustomizationFieldType(__help);
    public static final CustomizationFieldType _hyperlink = new CustomizationFieldType(__hyperlink);
    public static final CustomizationFieldType _image = new CustomizationFieldType(__image);
    public static final CustomizationFieldType _inlineHTML = new CustomizationFieldType(__inlineHTML);
    public static final CustomizationFieldType _integerNumber = new CustomizationFieldType(__integerNumber);
    public static final CustomizationFieldType _listRecord = new CustomizationFieldType(__listRecord);
    public static final CustomizationFieldType _longText = new CustomizationFieldType(__longText);
    public static final CustomizationFieldType _multipleSelect = new CustomizationFieldType(__multipleSelect);
    public static final CustomizationFieldType _password = new CustomizationFieldType(__password);
    public static final CustomizationFieldType _percent = new CustomizationFieldType(__percent);
    public static final CustomizationFieldType _phoneNumber = new CustomizationFieldType(__phoneNumber);
    public static final CustomizationFieldType _richText = new CustomizationFieldType(__richText);
    public static final CustomizationFieldType _textArea = new CustomizationFieldType(__textArea);
    public static final CustomizationFieldType _timeOfDay = new CustomizationFieldType(__timeOfDay);
    public java.lang.String getValue() { return _value_;}
    public static CustomizationFieldType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomizationFieldType enumeration = (CustomizationFieldType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomizationFieldType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CustomizationFieldType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2010_2.setup.webservices.netsuite.com", "CustomizationFieldType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
