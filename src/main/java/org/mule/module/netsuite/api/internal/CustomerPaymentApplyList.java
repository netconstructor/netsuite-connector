/**
 * CustomerPaymentApplyList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomerPaymentApplyList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.CustomerPaymentApply[] apply;

    private boolean replaceAll;  // attribute

    public CustomerPaymentApplyList() {
    }

    public CustomerPaymentApplyList(
           org.mule.module.netsuite.api.internal.CustomerPaymentApply[] apply,
           boolean replaceAll) {
           this.apply = apply;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the apply value for this CustomerPaymentApplyList.
     * 
     * @return apply
     */
    public org.mule.module.netsuite.api.internal.CustomerPaymentApply[] getApply() {
        return apply;
    }


    /**
     * Sets the apply value for this CustomerPaymentApplyList.
     * 
     * @param apply
     */
    public void setApply(org.mule.module.netsuite.api.internal.CustomerPaymentApply[] apply) {
        this.apply = apply;
    }

    public org.mule.module.netsuite.api.internal.CustomerPaymentApply getApply(int i) {
        return this.apply[i];
    }

    public void setApply(int i, org.mule.module.netsuite.api.internal.CustomerPaymentApply _value) {
        this.apply[i] = _value;
    }


    /**
     * Gets the replaceAll value for this CustomerPaymentApplyList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this CustomerPaymentApplyList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerPaymentApplyList)) return false;
        CustomerPaymentApplyList other = (CustomerPaymentApplyList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apply==null && other.getApply()==null) || 
             (this.apply!=null &&
              java.util.Arrays.equals(this.apply, other.getApply()))) &&
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
        if (getApply() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApply());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApply(), i);
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
        new org.apache.axis.description.TypeDesc(CustomerPaymentApplyList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CustomerPaymentApplyList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "apply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CustomerPaymentApply"));
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
