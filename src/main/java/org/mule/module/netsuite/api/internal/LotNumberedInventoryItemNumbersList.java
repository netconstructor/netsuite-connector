/**
 * LotNumberedInventoryItemNumbersList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class LotNumberedInventoryItemNumbersList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.LotNumberedInventoryItemNumbers[] numbers;

    private boolean replaceAll;  // attribute

    public LotNumberedInventoryItemNumbersList() {
    }

    public LotNumberedInventoryItemNumbersList(
           org.mule.module.netsuite.api.internal.LotNumberedInventoryItemNumbers[] numbers,
           boolean replaceAll) {
           this.numbers = numbers;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the numbers value for this LotNumberedInventoryItemNumbersList.
     * 
     * @return numbers
     */
    public org.mule.module.netsuite.api.internal.LotNumberedInventoryItemNumbers[] getNumbers() {
        return numbers;
    }


    /**
     * Sets the numbers value for this LotNumberedInventoryItemNumbersList.
     * 
     * @param numbers
     */
    public void setNumbers(org.mule.module.netsuite.api.internal.LotNumberedInventoryItemNumbers[] numbers) {
        this.numbers = numbers;
    }

    public org.mule.module.netsuite.api.internal.LotNumberedInventoryItemNumbers getNumbers(int i) {
        return this.numbers[i];
    }

    public void setNumbers(int i, org.mule.module.netsuite.api.internal.LotNumberedInventoryItemNumbers _value) {
        this.numbers[i] = _value;
    }


    /**
     * Gets the replaceAll value for this LotNumberedInventoryItemNumbersList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this LotNumberedInventoryItemNumbersList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LotNumberedInventoryItemNumbersList)) return false;
        LotNumberedInventoryItemNumbersList other = (LotNumberedInventoryItemNumbersList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numbers==null && other.getNumbers()==null) || 
             (this.numbers!=null &&
              java.util.Arrays.equals(this.numbers, other.getNumbers()))) &&
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
        if (getNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumbers(), i);
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
        new org.apache.axis.description.TypeDesc(LotNumberedInventoryItemNumbersList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "LotNumberedInventoryItemNumbersList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "numbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "LotNumberedInventoryItemNumbers"));
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
