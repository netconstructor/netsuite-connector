/**
 * CustomRecordTypeTabsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomRecordTypeTabsList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.CustomRecordTypeTabs[] tabs;

    private boolean replaceAll;  // attribute

    public CustomRecordTypeTabsList() {
    }

    public CustomRecordTypeTabsList(
           org.mule.module.netsuite.api.internal.CustomRecordTypeTabs[] tabs,
           boolean replaceAll) {
           this.tabs = tabs;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the tabs value for this CustomRecordTypeTabsList.
     * 
     * @return tabs
     */
    public org.mule.module.netsuite.api.internal.CustomRecordTypeTabs[] getTabs() {
        return tabs;
    }


    /**
     * Sets the tabs value for this CustomRecordTypeTabsList.
     * 
     * @param tabs
     */
    public void setTabs(org.mule.module.netsuite.api.internal.CustomRecordTypeTabs[] tabs) {
        this.tabs = tabs;
    }

    public org.mule.module.netsuite.api.internal.CustomRecordTypeTabs getTabs(int i) {
        return this.tabs[i];
    }

    public void setTabs(int i, org.mule.module.netsuite.api.internal.CustomRecordTypeTabs _value) {
        this.tabs[i] = _value;
    }


    /**
     * Gets the replaceAll value for this CustomRecordTypeTabsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this CustomRecordTypeTabsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomRecordTypeTabsList)) return false;
        CustomRecordTypeTabsList other = (CustomRecordTypeTabsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tabs==null && other.getTabs()==null) || 
             (this.tabs!=null &&
              java.util.Arrays.equals(this.tabs, other.getTabs()))) &&
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
        if (getTabs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTabs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTabs(), i);
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
        new org.apache.axis.description.TypeDesc(CustomRecordTypeTabsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeTabsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tabs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "tabs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeTabs"));
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
