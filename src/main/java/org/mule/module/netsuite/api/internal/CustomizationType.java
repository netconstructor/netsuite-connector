/**
 * CustomizationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomizationType  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.GetCustomizationType getCustomizationType;  // attribute

    public CustomizationType() {
    }

    public CustomizationType(
           org.mule.module.netsuite.api.internal.GetCustomizationType getCustomizationType) {
           this.getCustomizationType = getCustomizationType;
    }


    /**
     * Gets the getCustomizationType value for this CustomizationType.
     * 
     * @return getCustomizationType
     */
    public org.mule.module.netsuite.api.internal.GetCustomizationType getGetCustomizationType() {
        return getCustomizationType;
    }


    /**
     * Sets the getCustomizationType value for this CustomizationType.
     * 
     * @param getCustomizationType
     */
    public void setGetCustomizationType(org.mule.module.netsuite.api.internal.GetCustomizationType getCustomizationType) {
        this.getCustomizationType = getCustomizationType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomizationType)) return false;
        CustomizationType other = (CustomizationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCustomizationType==null && other.getGetCustomizationType()==null) || 
             (this.getCustomizationType!=null &&
              this.getCustomizationType.equals(other.getGetCustomizationType())));
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
        if (getGetCustomizationType() != null) {
            _hashCode += getGetCustomizationType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomizationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "CustomizationType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("getCustomizationType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "getCustomizationType"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "GetCustomizationType"));
        typeDesc.addFieldDesc(attrField);
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
