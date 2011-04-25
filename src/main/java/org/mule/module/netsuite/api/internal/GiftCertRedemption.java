/**
 * GiftCertRedemption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class GiftCertRedemption  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef authCode;

    private java.lang.Double authCodeApplied;

    private java.lang.Double authCodeAmtRemaining;

    private java.lang.Double giftCertAvailable;

    public GiftCertRedemption() {
    }

    public GiftCertRedemption(
           org.mule.module.netsuite.api.internal.RecordRef authCode,
           java.lang.Double authCodeApplied,
           java.lang.Double authCodeAmtRemaining,
           java.lang.Double giftCertAvailable) {
           this.authCode = authCode;
           this.authCodeApplied = authCodeApplied;
           this.authCodeAmtRemaining = authCodeAmtRemaining;
           this.giftCertAvailable = giftCertAvailable;
    }


    /**
     * Gets the authCode value for this GiftCertRedemption.
     * 
     * @return authCode
     */
    public org.mule.module.netsuite.api.internal.RecordRef getAuthCode() {
        return authCode;
    }


    /**
     * Sets the authCode value for this GiftCertRedemption.
     * 
     * @param authCode
     */
    public void setAuthCode(org.mule.module.netsuite.api.internal.RecordRef authCode) {
        this.authCode = authCode;
    }


    /**
     * Gets the authCodeApplied value for this GiftCertRedemption.
     * 
     * @return authCodeApplied
     */
    public java.lang.Double getAuthCodeApplied() {
        return authCodeApplied;
    }


    /**
     * Sets the authCodeApplied value for this GiftCertRedemption.
     * 
     * @param authCodeApplied
     */
    public void setAuthCodeApplied(java.lang.Double authCodeApplied) {
        this.authCodeApplied = authCodeApplied;
    }


    /**
     * Gets the authCodeAmtRemaining value for this GiftCertRedemption.
     * 
     * @return authCodeAmtRemaining
     */
    public java.lang.Double getAuthCodeAmtRemaining() {
        return authCodeAmtRemaining;
    }


    /**
     * Sets the authCodeAmtRemaining value for this GiftCertRedemption.
     * 
     * @param authCodeAmtRemaining
     */
    public void setAuthCodeAmtRemaining(java.lang.Double authCodeAmtRemaining) {
        this.authCodeAmtRemaining = authCodeAmtRemaining;
    }


    /**
     * Gets the giftCertAvailable value for this GiftCertRedemption.
     * 
     * @return giftCertAvailable
     */
    public java.lang.Double getGiftCertAvailable() {
        return giftCertAvailable;
    }


    /**
     * Sets the giftCertAvailable value for this GiftCertRedemption.
     * 
     * @param giftCertAvailable
     */
    public void setGiftCertAvailable(java.lang.Double giftCertAvailable) {
        this.giftCertAvailable = giftCertAvailable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GiftCertRedemption)) return false;
        GiftCertRedemption other = (GiftCertRedemption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authCode==null && other.getAuthCode()==null) || 
             (this.authCode!=null &&
              this.authCode.equals(other.getAuthCode()))) &&
            ((this.authCodeApplied==null && other.getAuthCodeApplied()==null) || 
             (this.authCodeApplied!=null &&
              this.authCodeApplied.equals(other.getAuthCodeApplied()))) &&
            ((this.authCodeAmtRemaining==null && other.getAuthCodeAmtRemaining()==null) || 
             (this.authCodeAmtRemaining!=null &&
              this.authCodeAmtRemaining.equals(other.getAuthCodeAmtRemaining()))) &&
            ((this.giftCertAvailable==null && other.getGiftCertAvailable()==null) || 
             (this.giftCertAvailable!=null &&
              this.giftCertAvailable.equals(other.getGiftCertAvailable())));
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
        if (getAuthCode() != null) {
            _hashCode += getAuthCode().hashCode();
        }
        if (getAuthCodeApplied() != null) {
            _hashCode += getAuthCodeApplied().hashCode();
        }
        if (getAuthCodeAmtRemaining() != null) {
            _hashCode += getAuthCodeAmtRemaining().hashCode();
        }
        if (getGiftCertAvailable() != null) {
            _hashCode += getGiftCertAvailable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GiftCertRedemption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "GiftCertRedemption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "authCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authCodeApplied");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "authCodeApplied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authCodeAmtRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "authCodeAmtRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "giftCertAvailable"));
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
