/**
 * GetCustomizationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class GetCustomizationType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GetCustomizationType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _crmCustomField = "crmCustomField";
    public static final java.lang.String _customList = "customList";
    public static final java.lang.String _customRecordType = "customRecordType";
    public static final java.lang.String _entityCustomField = "entityCustomField";
    public static final java.lang.String _itemCustomField = "itemCustomField";
    public static final java.lang.String _itemNumberCustomField = "itemNumberCustomField";
    public static final java.lang.String _itemOptionCustomField = "itemOptionCustomField";
    public static final java.lang.String _otherCustomField = "otherCustomField";
    public static final java.lang.String _transactionBodyCustomField = "transactionBodyCustomField";
    public static final java.lang.String _transactionColumnCustomField = "transactionColumnCustomField";
    public static final GetCustomizationType crmCustomField = new GetCustomizationType(_crmCustomField);
    public static final GetCustomizationType customList = new GetCustomizationType(_customList);
    public static final GetCustomizationType customRecordType = new GetCustomizationType(_customRecordType);
    public static final GetCustomizationType entityCustomField = new GetCustomizationType(_entityCustomField);
    public static final GetCustomizationType itemCustomField = new GetCustomizationType(_itemCustomField);
    public static final GetCustomizationType itemNumberCustomField = new GetCustomizationType(_itemNumberCustomField);
    public static final GetCustomizationType itemOptionCustomField = new GetCustomizationType(_itemOptionCustomField);
    public static final GetCustomizationType otherCustomField = new GetCustomizationType(_otherCustomField);
    public static final GetCustomizationType transactionBodyCustomField = new GetCustomizationType(_transactionBodyCustomField);
    public static final GetCustomizationType transactionColumnCustomField = new GetCustomizationType(_transactionColumnCustomField);
    public java.lang.String getValue() { return _value_;}
    public static GetCustomizationType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GetCustomizationType enumeration = (GetCustomizationType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GetCustomizationType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GetCustomizationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "GetCustomizationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
