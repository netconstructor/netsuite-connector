/**
 * CustomerPaymentDepositList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomerPaymentDepositList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.CustomerPaymentDeposit[] deposit;

    private boolean replaceAll;  // attribute

    public CustomerPaymentDepositList() {
    }

    public CustomerPaymentDepositList(
           org.mule.module.netsuite.api.internal.CustomerPaymentDeposit[] deposit,
           boolean replaceAll) {
           this.deposit = deposit;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the deposit value for this CustomerPaymentDepositList.
     * 
     * @return deposit
     */
    public org.mule.module.netsuite.api.internal.CustomerPaymentDeposit[] getDeposit() {
        return deposit;
    }


    /**
     * Sets the deposit value for this CustomerPaymentDepositList.
     * 
     * @param deposit
     */
    public void setDeposit(org.mule.module.netsuite.api.internal.CustomerPaymentDeposit[] deposit) {
        this.deposit = deposit;
    }

    public org.mule.module.netsuite.api.internal.CustomerPaymentDeposit getDeposit(int i) {
        return this.deposit[i];
    }

    public void setDeposit(int i, org.mule.module.netsuite.api.internal.CustomerPaymentDeposit _value) {
        this.deposit[i] = _value;
    }


    /**
     * Gets the replaceAll value for this CustomerPaymentDepositList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this CustomerPaymentDepositList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerPaymentDepositList)) return false;
        CustomerPaymentDepositList other = (CustomerPaymentDepositList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deposit==null && other.getDeposit()==null) || 
             (this.deposit!=null &&
              java.util.Arrays.equals(this.deposit, other.getDeposit()))) &&
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
        if (getDeposit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeposit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeposit(), i);
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
        new org.apache.axis.description.TypeDesc(CustomerPaymentDepositList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CustomerPaymentDepositList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deposit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "deposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CustomerPaymentDeposit"));
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
