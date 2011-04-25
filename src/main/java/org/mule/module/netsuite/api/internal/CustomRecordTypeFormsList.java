/**
 * CustomRecordTypeFormsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomRecordTypeFormsList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.CustomRecordTypeForms[] forms;

    private boolean replaceAll;  // attribute

    public CustomRecordTypeFormsList() {
    }

    public CustomRecordTypeFormsList(
           org.mule.module.netsuite.api.internal.CustomRecordTypeForms[] forms,
           boolean replaceAll) {
           this.forms = forms;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the forms value for this CustomRecordTypeFormsList.
     * 
     * @return forms
     */
    public org.mule.module.netsuite.api.internal.CustomRecordTypeForms[] getForms() {
        return forms;
    }


    /**
     * Sets the forms value for this CustomRecordTypeFormsList.
     * 
     * @param forms
     */
    public void setForms(org.mule.module.netsuite.api.internal.CustomRecordTypeForms[] forms) {
        this.forms = forms;
    }

    public org.mule.module.netsuite.api.internal.CustomRecordTypeForms getForms(int i) {
        return this.forms[i];
    }

    public void setForms(int i, org.mule.module.netsuite.api.internal.CustomRecordTypeForms _value) {
        this.forms[i] = _value;
    }


    /**
     * Gets the replaceAll value for this CustomRecordTypeFormsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this CustomRecordTypeFormsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomRecordTypeFormsList)) return false;
        CustomRecordTypeFormsList other = (CustomRecordTypeFormsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.forms==null && other.getForms()==null) || 
             (this.forms!=null &&
              java.util.Arrays.equals(this.forms, other.getForms()))) &&
            this.replaceAll == other.isReplaceAll();
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
        if (getForms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForms(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isReplaceAll() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomRecordTypeFormsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeFormsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "forms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeForms"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
