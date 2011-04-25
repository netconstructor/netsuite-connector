/**
 * EstimateShipGroupList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class EstimateShipGroupList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.TransactionShipGroup[] shipGroup;

    private boolean replaceAll;  // attribute

    public EstimateShipGroupList() {
    }

    public EstimateShipGroupList(
           org.mule.module.netsuite.api.internal.TransactionShipGroup[] shipGroup,
           boolean replaceAll) {
           this.shipGroup = shipGroup;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the shipGroup value for this EstimateShipGroupList.
     * 
     * @return shipGroup
     */
    public org.mule.module.netsuite.api.internal.TransactionShipGroup[] getShipGroup() {
        return shipGroup;
    }


    /**
     * Sets the shipGroup value for this EstimateShipGroupList.
     * 
     * @param shipGroup
     */
    public void setShipGroup(org.mule.module.netsuite.api.internal.TransactionShipGroup[] shipGroup) {
        this.shipGroup = shipGroup;
    }

    public org.mule.module.netsuite.api.internal.TransactionShipGroup getShipGroup(int i) {
        return this.shipGroup[i];
    }

    public void setShipGroup(int i, org.mule.module.netsuite.api.internal.TransactionShipGroup _value) {
        this.shipGroup[i] = _value;
    }


    /**
     * Gets the replaceAll value for this EstimateShipGroupList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this EstimateShipGroupList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EstimateShipGroupList)) return false;
        EstimateShipGroupList other = (EstimateShipGroupList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shipGroup==null && other.getShipGroup()==null) || 
             (this.shipGroup!=null &&
              java.util.Arrays.equals(this.shipGroup, other.getShipGroup()))) &&
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
        if (getShipGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipGroup(), i);
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
        new org.apache.axis.description.TypeDesc(EstimateShipGroupList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "EstimateShipGroupList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shipGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "TransactionShipGroup"));
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
