/**
 * InventoryAdjustmentInventoryList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class InventoryAdjustmentInventoryList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.InventoryAdjustmentInventory[] inventory;

    private boolean replaceAll;  // attribute

    public InventoryAdjustmentInventoryList() {
    }

    public InventoryAdjustmentInventoryList(
           org.mule.module.netsuite.api.internal.InventoryAdjustmentInventory[] inventory,
           boolean replaceAll) {
           this.inventory = inventory;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the inventory value for this InventoryAdjustmentInventoryList.
     * 
     * @return inventory
     */
    public org.mule.module.netsuite.api.internal.InventoryAdjustmentInventory[] getInventory() {
        return inventory;
    }


    /**
     * Sets the inventory value for this InventoryAdjustmentInventoryList.
     * 
     * @param inventory
     */
    public void setInventory(org.mule.module.netsuite.api.internal.InventoryAdjustmentInventory[] inventory) {
        this.inventory = inventory;
    }

    public org.mule.module.netsuite.api.internal.InventoryAdjustmentInventory getInventory(int i) {
        return this.inventory[i];
    }

    public void setInventory(int i, org.mule.module.netsuite.api.internal.InventoryAdjustmentInventory _value) {
        this.inventory[i] = _value;
    }


    /**
     * Gets the replaceAll value for this InventoryAdjustmentInventoryList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this InventoryAdjustmentInventoryList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InventoryAdjustmentInventoryList)) return false;
        InventoryAdjustmentInventoryList other = (InventoryAdjustmentInventoryList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inventory==null && other.getInventory()==null) || 
             (this.inventory!=null &&
              java.util.Arrays.equals(this.inventory, other.getInventory()))) &&
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
        if (getInventory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInventory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInventory(), i);
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
        new org.apache.axis.description.TypeDesc(InventoryAdjustmentInventoryList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "InventoryAdjustmentInventoryList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "inventory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "InventoryAdjustmentInventory"));
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
