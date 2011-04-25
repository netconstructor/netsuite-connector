/**
 * CampaignEmailList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CampaignEmailList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.CampaignEmail[] campaignEmail;

    private boolean replaceAll;  // attribute

    public CampaignEmailList() {
    }

    public CampaignEmailList(
           org.mule.module.netsuite.api.internal.CampaignEmail[] campaignEmail,
           boolean replaceAll) {
           this.campaignEmail = campaignEmail;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the campaignEmail value for this CampaignEmailList.
     * 
     * @return campaignEmail
     */
    public org.mule.module.netsuite.api.internal.CampaignEmail[] getCampaignEmail() {
        return campaignEmail;
    }


    /**
     * Sets the campaignEmail value for this CampaignEmailList.
     * 
     * @param campaignEmail
     */
    public void setCampaignEmail(org.mule.module.netsuite.api.internal.CampaignEmail[] campaignEmail) {
        this.campaignEmail = campaignEmail;
    }

    public org.mule.module.netsuite.api.internal.CampaignEmail getCampaignEmail(int i) {
        return this.campaignEmail[i];
    }

    public void setCampaignEmail(int i, org.mule.module.netsuite.api.internal.CampaignEmail _value) {
        this.campaignEmail[i] = _value;
    }


    /**
     * Gets the replaceAll value for this CampaignEmailList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this CampaignEmailList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignEmailList)) return false;
        CampaignEmailList other = (CampaignEmailList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campaignEmail==null && other.getCampaignEmail()==null) || 
             (this.campaignEmail!=null &&
              java.util.Arrays.equals(this.campaignEmail, other.getCampaignEmail()))) &&
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
        if (getCampaignEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCampaignEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignEmail(), i);
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
        new org.apache.axis.description.TypeDesc(CampaignEmailList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignEmailList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "campaignEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignEmail"));
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
