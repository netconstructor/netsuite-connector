/**
 * CustomRecordTypeForms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomRecordTypeForms  implements java.io.Serializable {
    private java.lang.String formEdit;

    private java.lang.String formName;

    private java.lang.Boolean formPref;

    public CustomRecordTypeForms() {
    }

    public CustomRecordTypeForms(
           java.lang.String formEdit,
           java.lang.String formName,
           java.lang.Boolean formPref) {
           this.formEdit = formEdit;
           this.formName = formName;
           this.formPref = formPref;
    }


    /**
     * Gets the formEdit value for this CustomRecordTypeForms.
     * 
     * @return formEdit
     */
    public java.lang.String getFormEdit() {
        return formEdit;
    }


    /**
     * Sets the formEdit value for this CustomRecordTypeForms.
     * 
     * @param formEdit
     */
    public void setFormEdit(java.lang.String formEdit) {
        this.formEdit = formEdit;
    }


    /**
     * Gets the formName value for this CustomRecordTypeForms.
     * 
     * @return formName
     */
    public java.lang.String getFormName() {
        return formName;
    }


    /**
     * Sets the formName value for this CustomRecordTypeForms.
     * 
     * @param formName
     */
    public void setFormName(java.lang.String formName) {
        this.formName = formName;
    }


    /**
     * Gets the formPref value for this CustomRecordTypeForms.
     * 
     * @return formPref
     */
    public java.lang.Boolean getFormPref() {
        return formPref;
    }


    /**
     * Sets the formPref value for this CustomRecordTypeForms.
     * 
     * @param formPref
     */
    public void setFormPref(java.lang.Boolean formPref) {
        this.formPref = formPref;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomRecordTypeForms)) return false;
        CustomRecordTypeForms other = (CustomRecordTypeForms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.formEdit==null && other.getFormEdit()==null) || 
             (this.formEdit!=null &&
              this.formEdit.equals(other.getFormEdit()))) &&
            ((this.formName==null && other.getFormName()==null) || 
             (this.formName!=null &&
              this.formName.equals(other.getFormName()))) &&
            ((this.formPref==null && other.getFormPref()==null) || 
             (this.formPref!=null &&
              this.formPref.equals(other.getFormPref())));
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
        if (getFormEdit() != null) {
            _hashCode += getFormEdit().hashCode();
        }
        if (getFormName() != null) {
            _hashCode += getFormName().hashCode();
        }
        if (getFormPref() != null) {
            _hashCode += getFormPref().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomRecordTypeForms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeForms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formEdit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "formEdit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "formName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formPref");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "formPref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
