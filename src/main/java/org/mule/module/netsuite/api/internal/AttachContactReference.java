/**
 * AttachContactReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class AttachContactReference  extends org.mule.module.netsuite.api.internal.AttachReference  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef contact;

    private org.mule.module.netsuite.api.internal.RecordRef contactRole;

    public AttachContactReference() {
    }

    public AttachContactReference(
           org.mule.module.netsuite.api.internal.BaseRef attachTo,
           org.mule.module.netsuite.api.internal.RecordRef contact,
           org.mule.module.netsuite.api.internal.RecordRef contactRole) {
        super(
            attachTo);
        this.contact = contact;
        this.contactRole = contactRole;
    }


    /**
     * Gets the contact value for this AttachContactReference.
     * 
     * @return contact
     */
    public org.mule.module.netsuite.api.internal.RecordRef getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this AttachContactReference.
     * 
     * @param contact
     */
    public void setContact(org.mule.module.netsuite.api.internal.RecordRef contact) {
        this.contact = contact;
    }


    /**
     * Gets the contactRole value for this AttachContactReference.
     * 
     * @return contactRole
     */
    public org.mule.module.netsuite.api.internal.RecordRef getContactRole() {
        return contactRole;
    }


    /**
     * Sets the contactRole value for this AttachContactReference.
     * 
     * @param contactRole
     */
    public void setContactRole(org.mule.module.netsuite.api.internal.RecordRef contactRole) {
        this.contactRole = contactRole;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttachContactReference)) return false;
        AttachContactReference other = (AttachContactReference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.contactRole==null && other.getContactRole()==null) || 
             (this.contactRole!=null &&
              this.contactRole.equals(other.getContactRole())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getContactRole() != null) {
            _hashCode += getContactRole().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttachContactReference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "AttachContactReference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "contactRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
