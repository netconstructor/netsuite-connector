/**
 * ServiceItemTaskTemplatesList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ServiceItemTaskTemplatesList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.ServiceItemTaskTemplates[] taskTemplates;

    private boolean replaceAll;  // attribute

    public ServiceItemTaskTemplatesList() {
    }

    public ServiceItemTaskTemplatesList(
           org.mule.module.netsuite.api.internal.ServiceItemTaskTemplates[] taskTemplates,
           boolean replaceAll) {
           this.taskTemplates = taskTemplates;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the taskTemplates value for this ServiceItemTaskTemplatesList.
     * 
     * @return taskTemplates
     */
    public org.mule.module.netsuite.api.internal.ServiceItemTaskTemplates[] getTaskTemplates() {
        return taskTemplates;
    }


    /**
     * Sets the taskTemplates value for this ServiceItemTaskTemplatesList.
     * 
     * @param taskTemplates
     */
    public void setTaskTemplates(org.mule.module.netsuite.api.internal.ServiceItemTaskTemplates[] taskTemplates) {
        this.taskTemplates = taskTemplates;
    }

    public org.mule.module.netsuite.api.internal.ServiceItemTaskTemplates getTaskTemplates(int i) {
        return this.taskTemplates[i];
    }

    public void setTaskTemplates(int i, org.mule.module.netsuite.api.internal.ServiceItemTaskTemplates _value) {
        this.taskTemplates[i] = _value;
    }


    /**
     * Gets the replaceAll value for this ServiceItemTaskTemplatesList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this ServiceItemTaskTemplatesList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceItemTaskTemplatesList)) return false;
        ServiceItemTaskTemplatesList other = (ServiceItemTaskTemplatesList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taskTemplates==null && other.getTaskTemplates()==null) || 
             (this.taskTemplates!=null &&
              java.util.Arrays.equals(this.taskTemplates, other.getTaskTemplates()))) &&
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
        if (getTaskTemplates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaskTemplates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaskTemplates(), i);
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
        new org.apache.axis.description.TypeDesc(ServiceItemTaskTemplatesList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ServiceItemTaskTemplatesList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskTemplates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "taskTemplates"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ServiceItemTaskTemplates"));
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
