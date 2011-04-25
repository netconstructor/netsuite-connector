/**
 * PresentationItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class PresentationItem  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef item;

    private org.mule.module.netsuite.api.internal.PresentationItemType itemType;

    private java.lang.String description;

    private java.lang.Double onlinePrice;

    private java.lang.Double basePrice;

    public PresentationItem() {
    }

    public PresentationItem(
           org.mule.module.netsuite.api.internal.RecordRef item,
           org.mule.module.netsuite.api.internal.PresentationItemType itemType,
           java.lang.String description,
           java.lang.Double onlinePrice,
           java.lang.Double basePrice) {
           this.item = item;
           this.itemType = itemType;
           this.description = description;
           this.onlinePrice = onlinePrice;
           this.basePrice = basePrice;
    }


    /**
     * Gets the item value for this PresentationItem.
     * 
     * @return item
     */
    public org.mule.module.netsuite.api.internal.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this PresentationItem.
     * 
     * @param item
     */
    public void setItem(org.mule.module.netsuite.api.internal.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the itemType value for this PresentationItem.
     * 
     * @return itemType
     */
    public org.mule.module.netsuite.api.internal.PresentationItemType getItemType() {
        return itemType;
    }


    /**
     * Sets the itemType value for this PresentationItem.
     * 
     * @param itemType
     */
    public void setItemType(org.mule.module.netsuite.api.internal.PresentationItemType itemType) {
        this.itemType = itemType;
    }


    /**
     * Gets the description value for this PresentationItem.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PresentationItem.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the onlinePrice value for this PresentationItem.
     * 
     * @return onlinePrice
     */
    public java.lang.Double getOnlinePrice() {
        return onlinePrice;
    }


    /**
     * Sets the onlinePrice value for this PresentationItem.
     * 
     * @param onlinePrice
     */
    public void setOnlinePrice(java.lang.Double onlinePrice) {
        this.onlinePrice = onlinePrice;
    }


    /**
     * Gets the basePrice value for this PresentationItem.
     * 
     * @return basePrice
     */
    public java.lang.Double getBasePrice() {
        return basePrice;
    }


    /**
     * Sets the basePrice value for this PresentationItem.
     * 
     * @param basePrice
     */
    public void setBasePrice(java.lang.Double basePrice) {
        this.basePrice = basePrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PresentationItem)) return false;
        PresentationItem other = (PresentationItem) obj;
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
            ((this.itemType==null && other.getItemType()==null) || 
             (this.itemType!=null &&
              this.itemType.equals(other.getItemType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.onlinePrice==null && other.getOnlinePrice()==null) || 
             (this.onlinePrice!=null &&
              this.onlinePrice.equals(other.getOnlinePrice()))) &&
            ((this.basePrice==null && other.getBasePrice()==null) || 
             (this.basePrice!=null &&
              this.basePrice.equals(other.getBasePrice())));
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
        if (getItemType() != null) {
            _hashCode += getItemType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getOnlinePrice() != null) {
            _hashCode += getOnlinePrice().hashCode();
        }
        if (getBasePrice() != null) {
            _hashCode += getBasePrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PresentationItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "PresentationItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "itemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "PresentationItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlinePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "onlinePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "basePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
