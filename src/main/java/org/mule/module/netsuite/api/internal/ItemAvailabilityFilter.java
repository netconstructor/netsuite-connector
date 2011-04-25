/**
 * ItemAvailabilityFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ItemAvailabilityFilter  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRefList item;

    private java.util.Calendar lastQtyAvailableChange;

    public ItemAvailabilityFilter() {
    }

    public ItemAvailabilityFilter(
           org.mule.module.netsuite.api.internal.RecordRefList item,
           java.util.Calendar lastQtyAvailableChange) {
           this.item = item;
           this.lastQtyAvailableChange = lastQtyAvailableChange;
    }


    /**
     * Gets the item value for this ItemAvailabilityFilter.
     * 
     * @return item
     */
    public org.mule.module.netsuite.api.internal.RecordRefList getItem() {
        return item;
    }


    /**
     * Sets the item value for this ItemAvailabilityFilter.
     * 
     * @param item
     */
    public void setItem(org.mule.module.netsuite.api.internal.RecordRefList item) {
        this.item = item;
    }


    /**
     * Gets the lastQtyAvailableChange value for this ItemAvailabilityFilter.
     * 
     * @return lastQtyAvailableChange
     */
    public java.util.Calendar getLastQtyAvailableChange() {
        return lastQtyAvailableChange;
    }


    /**
     * Sets the lastQtyAvailableChange value for this ItemAvailabilityFilter.
     * 
     * @param lastQtyAvailableChange
     */
    public void setLastQtyAvailableChange(java.util.Calendar lastQtyAvailableChange) {
        this.lastQtyAvailableChange = lastQtyAvailableChange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemAvailabilityFilter)) return false;
        ItemAvailabilityFilter other = (ItemAvailabilityFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.lastQtyAvailableChange==null && other.getLastQtyAvailableChange()==null) || 
             (this.lastQtyAvailableChange!=null &&
              this.lastQtyAvailableChange.equals(other.getLastQtyAvailableChange())));
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
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getLastQtyAvailableChange() != null) {
            _hashCode += getLastQtyAvailableChange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemAvailabilityFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "ItemAvailabilityFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastQtyAvailableChange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "lastQtyAvailableChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
