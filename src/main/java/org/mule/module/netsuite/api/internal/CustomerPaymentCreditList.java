/**
 * CustomerPaymentCreditList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomerPaymentCreditList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.CustomerPaymentCredit[] credit;

    private boolean replaceAll;  // attribute

    public CustomerPaymentCreditList() {
    }

    public CustomerPaymentCreditList(
           org.mule.module.netsuite.api.internal.CustomerPaymentCredit[] credit,
           boolean replaceAll) {
           this.credit = credit;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the credit value for this CustomerPaymentCreditList.
     * 
     * @return credit
     */
    public org.mule.module.netsuite.api.internal.CustomerPaymentCredit[] getCredit() {
        return credit;
    }


    /**
     * Sets the credit value for this CustomerPaymentCreditList.
     * 
     * @param credit
     */
    public void setCredit(org.mule.module.netsuite.api.internal.CustomerPaymentCredit[] credit) {
        this.credit = credit;
    }

    public org.mule.module.netsuite.api.internal.CustomerPaymentCredit getCredit(int i) {
        return this.credit[i];
    }

    public void setCredit(int i, org.mule.module.netsuite.api.internal.CustomerPaymentCredit _value) {
        this.credit[i] = _value;
    }


    /**
     * Gets the replaceAll value for this CustomerPaymentCreditList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this CustomerPaymentCreditList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerPaymentCreditList)) return false;
        CustomerPaymentCreditList other = (CustomerPaymentCreditList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.credit==null && other.getCredit()==null) || 
             (this.credit!=null &&
              java.util.Arrays.equals(this.credit, other.getCredit()))) &&
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
        if (getCredit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCredit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCredit(), i);
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
        new org.apache.axis.description.TypeDesc(CustomerPaymentCreditList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CustomerPaymentCreditList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "credit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CustomerPaymentCredit"));
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
