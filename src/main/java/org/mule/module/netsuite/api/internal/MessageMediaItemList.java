/**
 * MessageMediaItemList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class MessageMediaItemList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.File[] mediaItem;

    private boolean replaceAll;  // attribute

    public MessageMediaItemList() {
    }

    public MessageMediaItemList(
           org.mule.module.netsuite.api.internal.File[] mediaItem,
           boolean replaceAll) {
           this.mediaItem = mediaItem;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the mediaItem value for this MessageMediaItemList.
     * 
     * @return mediaItem
     */
    public org.mule.module.netsuite.api.internal.File[] getMediaItem() {
        return mediaItem;
    }


    /**
     * Sets the mediaItem value for this MessageMediaItemList.
     * 
     * @param mediaItem
     */
    public void setMediaItem(org.mule.module.netsuite.api.internal.File[] mediaItem) {
        this.mediaItem = mediaItem;
    }

    public org.mule.module.netsuite.api.internal.File getMediaItem(int i) {
        return this.mediaItem[i];
    }

    public void setMediaItem(int i, org.mule.module.netsuite.api.internal.File _value) {
        this.mediaItem[i] = _value;
    }


    /**
     * Gets the replaceAll value for this MessageMediaItemList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this MessageMediaItemList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MessageMediaItemList)) return false;
        MessageMediaItemList other = (MessageMediaItemList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mediaItem==null && other.getMediaItem()==null) || 
             (this.mediaItem!=null &&
              java.util.Arrays.equals(this.mediaItem, other.getMediaItem()))) &&
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
        if (getMediaItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMediaItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMediaItem(), i);
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
        new org.apache.axis.description.TypeDesc(MessageMediaItemList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "MessageMediaItemList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "mediaItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "File"));
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
