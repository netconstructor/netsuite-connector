/**
 * CustomerDepositApplyList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomerDepositApplyList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.CustomerDepositApply[] customerDepositApply;

    private boolean replaceAll;  // attribute

    public CustomerDepositApplyList() {
    }

    public CustomerDepositApplyList(
           org.mule.module.netsuite.api.internal.CustomerDepositApply[] customerDepositApply,
           boolean replaceAll) {
           this.customerDepositApply = customerDepositApply;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the customerDepositApply value for this CustomerDepositApplyList.
     * 
     * @return customerDepositApply
     */
    public org.mule.module.netsuite.api.internal.CustomerDepositApply[] getCustomerDepositApply() {
        return customerDepositApply;
    }


    /**
     * Sets the customerDepositApply value for this CustomerDepositApplyList.
     * 
     * @param customerDepositApply
     */
    public void setCustomerDepositApply(org.mule.module.netsuite.api.internal.CustomerDepositApply[] customerDepositApply) {
        this.customerDepositApply = customerDepositApply;
    }

    public org.mule.module.netsuite.api.internal.CustomerDepositApply getCustomerDepositApply(int i) {
        return this.customerDepositApply[i];
    }

    public void setCustomerDepositApply(int i, org.mule.module.netsuite.api.internal.CustomerDepositApply _value) {
        this.customerDepositApply[i] = _value;
    }


    /**
     * Gets the replaceAll value for this CustomerDepositApplyList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this CustomerDepositApplyList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerDepositApplyList)) return false;
        CustomerDepositApplyList other = (CustomerDepositApplyList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerDepositApply==null && other.getCustomerDepositApply()==null) || 
             (this.customerDepositApply!=null &&
              java.util.Arrays.equals(this.customerDepositApply, other.getCustomerDepositApply()))) &&
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
        if (getCustomerDepositApply() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerDepositApply());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerDepositApply(), i);
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
        new org.apache.axis.description.TypeDesc(CustomerDepositApplyList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CustomerDepositApplyList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerDepositApply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "customerDepositApply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CustomerDepositApply"));
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
