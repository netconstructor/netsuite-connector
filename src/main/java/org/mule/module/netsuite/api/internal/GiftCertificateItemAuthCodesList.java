/**
 * GiftCertificateItemAuthCodesList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class GiftCertificateItemAuthCodesList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.GiftCertificateItemAuthCodes[] authCodes;

    private boolean replaceAll;  // attribute

    public GiftCertificateItemAuthCodesList() {
    }

    public GiftCertificateItemAuthCodesList(
           org.mule.module.netsuite.api.internal.GiftCertificateItemAuthCodes[] authCodes,
           boolean replaceAll) {
           this.authCodes = authCodes;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the authCodes value for this GiftCertificateItemAuthCodesList.
     * 
     * @return authCodes
     */
    public org.mule.module.netsuite.api.internal.GiftCertificateItemAuthCodes[] getAuthCodes() {
        return authCodes;
    }


    /**
     * Sets the authCodes value for this GiftCertificateItemAuthCodesList.
     * 
     * @param authCodes
     */
    public void setAuthCodes(org.mule.module.netsuite.api.internal.GiftCertificateItemAuthCodes[] authCodes) {
        this.authCodes = authCodes;
    }

    public org.mule.module.netsuite.api.internal.GiftCertificateItemAuthCodes getAuthCodes(int i) {
        return this.authCodes[i];
    }

    public void setAuthCodes(int i, org.mule.module.netsuite.api.internal.GiftCertificateItemAuthCodes _value) {
        this.authCodes[i] = _value;
    }


    /**
     * Gets the replaceAll value for this GiftCertificateItemAuthCodesList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this GiftCertificateItemAuthCodesList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GiftCertificateItemAuthCodesList)) return false;
        GiftCertificateItemAuthCodesList other = (GiftCertificateItemAuthCodesList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authCodes==null && other.getAuthCodes()==null) || 
             (this.authCodes!=null &&
              java.util.Arrays.equals(this.authCodes, other.getAuthCodes()))) &&
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
        if (getAuthCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthCodes(), i);
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
        new org.apache.axis.description.TypeDesc(GiftCertificateItemAuthCodesList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "GiftCertificateItemAuthCodesList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "authCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "GiftCertificateItemAuthCodes"));
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
