/**
 * SsoPassport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SsoPassport  implements java.io.Serializable {
    private java.lang.String authenticationToken;

    private java.lang.String partnerId;

    private java.lang.String partnerAccount;

    public SsoPassport() {
    }

    public SsoPassport(
           java.lang.String authenticationToken,
           java.lang.String partnerId,
           java.lang.String partnerAccount) {
           this.authenticationToken = authenticationToken;
           this.partnerId = partnerId;
           this.partnerAccount = partnerAccount;
    }


    /**
     * Gets the authenticationToken value for this SsoPassport.
     * 
     * @return authenticationToken
     */
    public java.lang.String getAuthenticationToken() {
        return authenticationToken;
    }


    /**
     * Sets the authenticationToken value for this SsoPassport.
     * 
     * @param authenticationToken
     */
    public void setAuthenticationToken(java.lang.String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }


    /**
     * Gets the partnerId value for this SsoPassport.
     * 
     * @return partnerId
     */
    public java.lang.String getPartnerId() {
        return partnerId;
    }


    /**
     * Sets the partnerId value for this SsoPassport.
     * 
     * @param partnerId
     */
    public void setPartnerId(java.lang.String partnerId) {
        this.partnerId = partnerId;
    }


    /**
     * Gets the partnerAccount value for this SsoPassport.
     * 
     * @return partnerAccount
     */
    public java.lang.String getPartnerAccount() {
        return partnerAccount;
    }


    /**
     * Sets the partnerAccount value for this SsoPassport.
     * 
     * @param partnerAccount
     */
    public void setPartnerAccount(java.lang.String partnerAccount) {
        this.partnerAccount = partnerAccount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SsoPassport)) return false;
        SsoPassport other = (SsoPassport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authenticationToken==null && other.getAuthenticationToken()==null) || 
             (this.authenticationToken!=null &&
              this.authenticationToken.equals(other.getAuthenticationToken()))) &&
            ((this.partnerId==null && other.getPartnerId()==null) || 
             (this.partnerId!=null &&
              this.partnerId.equals(other.getPartnerId()))) &&
            ((this.partnerAccount==null && other.getPartnerAccount()==null) || 
             (this.partnerAccount!=null &&
              this.partnerAccount.equals(other.getPartnerAccount())));
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
        if (getAuthenticationToken() != null) {
            _hashCode += getAuthenticationToken().hashCode();
        }
        if (getPartnerId() != null) {
            _hashCode += getPartnerId().hashCode();
        }
        if (getPartnerAccount() != null) {
            _hashCode += getPartnerAccount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SsoPassport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SsoPassport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationToken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "authenticationToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "partnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "partnerAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
