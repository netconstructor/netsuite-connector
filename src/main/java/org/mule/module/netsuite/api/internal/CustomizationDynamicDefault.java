/**
 * CustomizationDynamicDefault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomizationDynamicDefault implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomizationDynamicDefault(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __currentDateTime = "_currentDateTime";
    public static final java.lang.String __currentUser = "_currentUser";
    public static final java.lang.String __currentUsersDepartment = "_currentUsersDepartment";
    public static final java.lang.String __currentUsersLocation = "_currentUsersLocation";
    public static final java.lang.String __currentUsersSupervisor = "_currentUsersSupervisor";
    public static final java.lang.String __currentUsersSubsidiary = "_currentUsersSubsidiary";
    public static final CustomizationDynamicDefault _currentDateTime = new CustomizationDynamicDefault(__currentDateTime);
    public static final CustomizationDynamicDefault _currentUser = new CustomizationDynamicDefault(__currentUser);
    public static final CustomizationDynamicDefault _currentUsersDepartment = new CustomizationDynamicDefault(__currentUsersDepartment);
    public static final CustomizationDynamicDefault _currentUsersLocation = new CustomizationDynamicDefault(__currentUsersLocation);
    public static final CustomizationDynamicDefault _currentUsersSupervisor = new CustomizationDynamicDefault(__currentUsersSupervisor);
    public static final CustomizationDynamicDefault _currentUsersSubsidiary = new CustomizationDynamicDefault(__currentUsersSubsidiary);
    public java.lang.String getValue() { return _value_;}
    public static CustomizationDynamicDefault fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomizationDynamicDefault enumeration = (CustomizationDynamicDefault)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomizationDynamicDefault fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CustomizationDynamicDefault.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2010_2.setup.webservices.netsuite.com", "CustomizationDynamicDefault"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
