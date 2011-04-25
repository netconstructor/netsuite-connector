/**
 * CustomRecordTypeOnlineForms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomRecordTypeOnlineForms  implements java.io.Serializable {
    private java.lang.String onlineFormName;

    private java.lang.String isOnline;

    private java.lang.String templateName;

    public CustomRecordTypeOnlineForms() {
    }

    public CustomRecordTypeOnlineForms(
           java.lang.String onlineFormName,
           java.lang.String isOnline,
           java.lang.String templateName) {
           this.onlineFormName = onlineFormName;
           this.isOnline = isOnline;
           this.templateName = templateName;
    }


    /**
     * Gets the onlineFormName value for this CustomRecordTypeOnlineForms.
     * 
     * @return onlineFormName
     */
    public java.lang.String getOnlineFormName() {
        return onlineFormName;
    }


    /**
     * Sets the onlineFormName value for this CustomRecordTypeOnlineForms.
     * 
     * @param onlineFormName
     */
    public void setOnlineFormName(java.lang.String onlineFormName) {
        this.onlineFormName = onlineFormName;
    }


    /**
     * Gets the isOnline value for this CustomRecordTypeOnlineForms.
     * 
     * @return isOnline
     */
    public java.lang.String getIsOnline() {
        return isOnline;
    }


    /**
     * Sets the isOnline value for this CustomRecordTypeOnlineForms.
     * 
     * @param isOnline
     */
    public void setIsOnline(java.lang.String isOnline) {
        this.isOnline = isOnline;
    }


    /**
     * Gets the templateName value for this CustomRecordTypeOnlineForms.
     * 
     * @return templateName
     */
    public java.lang.String getTemplateName() {
        return templateName;
    }


    /**
     * Sets the templateName value for this CustomRecordTypeOnlineForms.
     * 
     * @param templateName
     */
    public void setTemplateName(java.lang.String templateName) {
        this.templateName = templateName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomRecordTypeOnlineForms)) return false;
        CustomRecordTypeOnlineForms other = (CustomRecordTypeOnlineForms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.onlineFormName==null && other.getOnlineFormName()==null) || 
             (this.onlineFormName!=null &&
              this.onlineFormName.equals(other.getOnlineFormName()))) &&
            ((this.isOnline==null && other.getIsOnline()==null) || 
             (this.isOnline!=null &&
              this.isOnline.equals(other.getIsOnline()))) &&
            ((this.templateName==null && other.getTemplateName()==null) || 
             (this.templateName!=null &&
              this.templateName.equals(other.getTemplateName())));
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
        if (getOnlineFormName() != null) {
            _hashCode += getOnlineFormName().hashCode();
        }
        if (getIsOnline() != null) {
            _hashCode += getIsOnline().hashCode();
        }
        if (getTemplateName() != null) {
            _hashCode += getTemplateName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomRecordTypeOnlineForms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeOnlineForms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlineFormName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "onlineFormName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOnline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "isOnline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "templateName"));
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
