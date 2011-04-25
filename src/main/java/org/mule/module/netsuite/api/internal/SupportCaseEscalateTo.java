/**
 * SupportCaseEscalateTo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SupportCaseEscalateTo  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef escalatee;

    private java.lang.String email;

    private java.lang.String phone;

    public SupportCaseEscalateTo() {
    }

    public SupportCaseEscalateTo(
           org.mule.module.netsuite.api.internal.RecordRef escalatee,
           java.lang.String email,
           java.lang.String phone) {
           this.escalatee = escalatee;
           this.email = email;
           this.phone = phone;
    }


    /**
     * Gets the escalatee value for this SupportCaseEscalateTo.
     * 
     * @return escalatee
     */
    public org.mule.module.netsuite.api.internal.RecordRef getEscalatee() {
        return escalatee;
    }


    /**
     * Sets the escalatee value for this SupportCaseEscalateTo.
     * 
     * @param escalatee
     */
    public void setEscalatee(org.mule.module.netsuite.api.internal.RecordRef escalatee) {
        this.escalatee = escalatee;
    }


    /**
     * Gets the email value for this SupportCaseEscalateTo.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this SupportCaseEscalateTo.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the phone value for this SupportCaseEscalateTo.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this SupportCaseEscalateTo.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupportCaseEscalateTo)) return false;
        SupportCaseEscalateTo other = (SupportCaseEscalateTo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.escalatee==null && other.getEscalatee()==null) || 
             (this.escalatee!=null &&
              this.escalatee.equals(other.getEscalatee()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getEscalatee() != null) {
            _hashCode += getEscalatee().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SupportCaseEscalateTo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SupportCaseEscalateTo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalatee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "escalatee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
