/**
 * ItemOptionsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ItemOptionsList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef[] itemOptions;

    public ItemOptionsList() {
    }

    public ItemOptionsList(
           org.mule.module.netsuite.api.internal.RecordRef[] itemOptions) {
           this.itemOptions = itemOptions;
    }


    /**
     * Gets the itemOptions value for this ItemOptionsList.
     * 
     * @return itemOptions
     */
    public org.mule.module.netsuite.api.internal.RecordRef[] getItemOptions() {
        return itemOptions;
    }


    /**
     * Sets the itemOptions value for this ItemOptionsList.
     * 
     * @param itemOptions
     */
    public void setItemOptions(org.mule.module.netsuite.api.internal.RecordRef[] itemOptions) {
        this.itemOptions = itemOptions;
    }

    public org.mule.module.netsuite.api.internal.RecordRef getItemOptions(int i) {
        return this.itemOptions[i];
    }

    public void setItemOptions(int i, org.mule.module.netsuite.api.internal.RecordRef _value) {
        this.itemOptions[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemOptionsList)) return false;
        ItemOptionsList other = (ItemOptionsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemOptions==null && other.getItemOptions()==null) || 
             (this.itemOptions!=null &&
              java.util.Arrays.equals(this.itemOptions, other.getItemOptions())));
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
        if (getItemOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemOptionsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ItemOptionsList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "itemOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
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
