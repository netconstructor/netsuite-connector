/**
 * PaymentMethodSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class PaymentMethodSearchRowBasic  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] account;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] creditCard;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isDebitCard;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] name;

    public PaymentMethodSearchRowBasic() {
    }

    public PaymentMethodSearchRowBasic(
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] account,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] creditCard,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isDebitCard,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] name) {
           this.account = account;
           this.creditCard = creditCard;
           this.internalId = internalId;
           this.isDebitCard = isDebitCard;
           this.isInactive = isInactive;
           this.name = name;
    }


    /**
     * Gets the account value for this PaymentMethodSearchRowBasic.
     * 
     * @return account
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getAccount() {
        return account;
    }


    /**
     * Sets the account value for this PaymentMethodSearchRowBasic.
     * 
     * @param account
     */
    public void setAccount(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] account) {
        this.account = account;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getAccount(int i) {
        return this.account[i];
    }

    public void setAccount(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.account[i] = _value;
    }


    /**
     * Gets the creditCard value for this PaymentMethodSearchRowBasic.
     * 
     * @return creditCard
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getCreditCard() {
        return creditCard;
    }


    /**
     * Sets the creditCard value for this PaymentMethodSearchRowBasic.
     * 
     * @param creditCard
     */
    public void setCreditCard(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] creditCard) {
        this.creditCard = creditCard;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getCreditCard(int i) {
        return this.creditCard[i];
    }

    public void setCreditCard(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.creditCard[i] = _value;
    }


    /**
     * Gets the internalId value for this PaymentMethodSearchRowBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this PaymentMethodSearchRowBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }


    /**
     * Gets the isDebitCard value for this PaymentMethodSearchRowBasic.
     * 
     * @return isDebitCard
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsDebitCard() {
        return isDebitCard;
    }


    /**
     * Sets the isDebitCard value for this PaymentMethodSearchRowBasic.
     * 
     * @param isDebitCard
     */
    public void setIsDebitCard(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isDebitCard) {
        this.isDebitCard = isDebitCard;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsDebitCard(int i) {
        return this.isDebitCard[i];
    }

    public void setIsDebitCard(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isDebitCard[i] = _value;
    }


    /**
     * Gets the isInactive value for this PaymentMethodSearchRowBasic.
     * 
     * @return isInactive
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this PaymentMethodSearchRowBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive) {
        this.isInactive = isInactive;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isInactive[i] = _value;
    }


    /**
     * Gets the name value for this PaymentMethodSearchRowBasic.
     * 
     * @return name
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this PaymentMethodSearchRowBasic.
     * 
     * @param name
     */
    public void setName(org.mule.module.netsuite.api.internal.SearchColumnStringField[] name) {
        this.name = name;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.name[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentMethodSearchRowBasic)) return false;
        PaymentMethodSearchRowBasic other = (PaymentMethodSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              java.util.Arrays.equals(this.account, other.getAccount()))) &&
            ((this.creditCard==null && other.getCreditCard()==null) || 
             (this.creditCard!=null &&
              java.util.Arrays.equals(this.creditCard, other.getCreditCard()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isDebitCard==null && other.getIsDebitCard()==null) || 
             (this.isDebitCard!=null &&
              java.util.Arrays.equals(this.isDebitCard, other.getIsDebitCard()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName())));
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
        if (getAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreditCard() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreditCard());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreditCard(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsDebitCard() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsDebitCard());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsDebitCard(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsInactive() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsInactive());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsInactive(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
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
        new org.apache.axis.description.TypeDesc(PaymentMethodSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "PaymentMethodSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCard");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "creditCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDebitCard");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isDebitCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
