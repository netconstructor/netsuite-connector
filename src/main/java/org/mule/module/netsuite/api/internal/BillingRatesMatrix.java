/**
 * BillingRatesMatrix.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class BillingRatesMatrix  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.BillingRates[] billingRates;

    private boolean replaceAll;  // attribute

    public BillingRatesMatrix() {
    }

    public BillingRatesMatrix(
           org.mule.module.netsuite.api.internal.BillingRates[] billingRates,
           boolean replaceAll) {
           this.billingRates = billingRates;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the billingRates value for this BillingRatesMatrix.
     * 
     * @return billingRates
     */
    public org.mule.module.netsuite.api.internal.BillingRates[] getBillingRates() {
        return billingRates;
    }


    /**
     * Sets the billingRates value for this BillingRatesMatrix.
     * 
     * @param billingRates
     */
    public void setBillingRates(org.mule.module.netsuite.api.internal.BillingRates[] billingRates) {
        this.billingRates = billingRates;
    }

    public org.mule.module.netsuite.api.internal.BillingRates getBillingRates(int i) {
        return this.billingRates[i];
    }

    public void setBillingRates(int i, org.mule.module.netsuite.api.internal.BillingRates _value) {
        this.billingRates[i] = _value;
    }


    /**
     * Gets the replaceAll value for this BillingRatesMatrix.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this BillingRatesMatrix.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingRatesMatrix)) return false;
        BillingRatesMatrix other = (BillingRatesMatrix) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billingRates==null && other.getBillingRates()==null) || 
             (this.billingRates!=null &&
              java.util.Arrays.equals(this.billingRates, other.getBillingRates()))) &&
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
        if (getBillingRates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillingRates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillingRates(), i);
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
        new org.apache.axis.description.TypeDesc(BillingRatesMatrix.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "BillingRatesMatrix"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingRates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "billingRates"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "BillingRates"));
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
