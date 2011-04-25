/**
 * GiftCertRedemptionList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class GiftCertRedemptionList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.GiftCertRedemption[] giftCertRedemption;

    private boolean replaceAll;  // attribute

    public GiftCertRedemptionList() {
    }

    public GiftCertRedemptionList(
           org.mule.module.netsuite.api.internal.GiftCertRedemption[] giftCertRedemption,
           boolean replaceAll) {
           this.giftCertRedemption = giftCertRedemption;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the giftCertRedemption value for this GiftCertRedemptionList.
     * 
     * @return giftCertRedemption
     */
    public org.mule.module.netsuite.api.internal.GiftCertRedemption[] getGiftCertRedemption() {
        return giftCertRedemption;
    }


    /**
     * Sets the giftCertRedemption value for this GiftCertRedemptionList.
     * 
     * @param giftCertRedemption
     */
    public void setGiftCertRedemption(org.mule.module.netsuite.api.internal.GiftCertRedemption[] giftCertRedemption) {
        this.giftCertRedemption = giftCertRedemption;
    }

    public org.mule.module.netsuite.api.internal.GiftCertRedemption getGiftCertRedemption(int i) {
        return this.giftCertRedemption[i];
    }

    public void setGiftCertRedemption(int i, org.mule.module.netsuite.api.internal.GiftCertRedemption _value) {
        this.giftCertRedemption[i] = _value;
    }


    /**
     * Gets the replaceAll value for this GiftCertRedemptionList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this GiftCertRedemptionList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GiftCertRedemptionList)) return false;
        GiftCertRedemptionList other = (GiftCertRedemptionList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.giftCertRedemption==null && other.getGiftCertRedemption()==null) || 
             (this.giftCertRedemption!=null &&
              java.util.Arrays.equals(this.giftCertRedemption, other.getGiftCertRedemption()))) &&
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
        if (getGiftCertRedemption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGiftCertRedemption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGiftCertRedemption(), i);
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
        new org.apache.axis.description.TypeDesc(GiftCertRedemptionList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "GiftCertRedemptionList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertRedemption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "giftCertRedemption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "GiftCertRedemption"));
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
