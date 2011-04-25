/**
 * ItemAvailabilityList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ItemAvailabilityList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.ItemAvailability[] itemAvailability;

    public ItemAvailabilityList() {
    }

    public ItemAvailabilityList(
           org.mule.module.netsuite.api.internal.ItemAvailability[] itemAvailability) {
           this.itemAvailability = itemAvailability;
    }


    /**
     * Gets the itemAvailability value for this ItemAvailabilityList.
     * 
     * @return itemAvailability
     */
    public org.mule.module.netsuite.api.internal.ItemAvailability[] getItemAvailability() {
        return itemAvailability;
    }


    /**
     * Sets the itemAvailability value for this ItemAvailabilityList.
     * 
     * @param itemAvailability
     */
    public void setItemAvailability(org.mule.module.netsuite.api.internal.ItemAvailability[] itemAvailability) {
        this.itemAvailability = itemAvailability;
    }

    public org.mule.module.netsuite.api.internal.ItemAvailability getItemAvailability(int i) {
        return this.itemAvailability[i];
    }

    public void setItemAvailability(int i, org.mule.module.netsuite.api.internal.ItemAvailability _value) {
        this.itemAvailability[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemAvailabilityList)) return false;
        ItemAvailabilityList other = (ItemAvailabilityList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemAvailability==null && other.getItemAvailability()==null) || 
             (this.itemAvailability!=null &&
              java.util.Arrays.equals(this.itemAvailability, other.getItemAvailability())));
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
        if (getItemAvailability() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemAvailability());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemAvailability(), i);
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
        new org.apache.axis.description.TypeDesc(ItemAvailabilityList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "ItemAvailabilityList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemAvailability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "itemAvailability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "ItemAvailability"));
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
