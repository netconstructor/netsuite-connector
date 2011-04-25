/**
 * CampaignEventList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CampaignEventList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.CampaignEvent[] campaignEvent;

    private boolean replaceAll;  // attribute

    public CampaignEventList() {
    }

    public CampaignEventList(
           org.mule.module.netsuite.api.internal.CampaignEvent[] campaignEvent,
           boolean replaceAll) {
           this.campaignEvent = campaignEvent;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the campaignEvent value for this CampaignEventList.
     * 
     * @return campaignEvent
     */
    public org.mule.module.netsuite.api.internal.CampaignEvent[] getCampaignEvent() {
        return campaignEvent;
    }


    /**
     * Sets the campaignEvent value for this CampaignEventList.
     * 
     * @param campaignEvent
     */
    public void setCampaignEvent(org.mule.module.netsuite.api.internal.CampaignEvent[] campaignEvent) {
        this.campaignEvent = campaignEvent;
    }

    public org.mule.module.netsuite.api.internal.CampaignEvent getCampaignEvent(int i) {
        return this.campaignEvent[i];
    }

    public void setCampaignEvent(int i, org.mule.module.netsuite.api.internal.CampaignEvent _value) {
        this.campaignEvent[i] = _value;
    }


    /**
     * Gets the replaceAll value for this CampaignEventList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this CampaignEventList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignEventList)) return false;
        CampaignEventList other = (CampaignEventList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campaignEvent==null && other.getCampaignEvent()==null) || 
             (this.campaignEvent!=null &&
              java.util.Arrays.equals(this.campaignEvent, other.getCampaignEvent()))) &&
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
        if (getCampaignEvent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCampaignEvent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignEvent(), i);
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
        new org.apache.axis.description.TypeDesc(CampaignEventList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignEventList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "campaignEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignEvent"));
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
