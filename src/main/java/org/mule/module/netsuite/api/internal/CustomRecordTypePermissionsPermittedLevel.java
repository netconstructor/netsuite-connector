/**
 * CustomRecordTypePermissionsPermittedLevel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomRecordTypePermissionsPermittedLevel implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomRecordTypePermissionsPermittedLevel(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __create = "_create";
    public static final java.lang.String __edit = "_edit";
    public static final java.lang.String __full = "_full";
    public static final java.lang.String __none = "_none";
    public static final java.lang.String __view = "_view";
    public static final CustomRecordTypePermissionsPermittedLevel _create = new CustomRecordTypePermissionsPermittedLevel(__create);
    public static final CustomRecordTypePermissionsPermittedLevel _edit = new CustomRecordTypePermissionsPermittedLevel(__edit);
    public static final CustomRecordTypePermissionsPermittedLevel _full = new CustomRecordTypePermissionsPermittedLevel(__full);
    public static final CustomRecordTypePermissionsPermittedLevel _none = new CustomRecordTypePermissionsPermittedLevel(__none);
    public static final CustomRecordTypePermissionsPermittedLevel _view = new CustomRecordTypePermissionsPermittedLevel(__view);
    public java.lang.String getValue() { return _value_;}
    public static CustomRecordTypePermissionsPermittedLevel fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomRecordTypePermissionsPermittedLevel enumeration = (CustomRecordTypePermissionsPermittedLevel)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomRecordTypePermissionsPermittedLevel fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CustomRecordTypePermissionsPermittedLevel.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypePermissionsPermittedLevel"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
