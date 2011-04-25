/**
 * PaymentMethod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class PaymentMethod  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.Boolean creditCard;

    private java.lang.Boolean undepFunds;

    private org.mule.module.netsuite.api.internal.RecordRef account;

    private java.lang.Boolean isInactive;

    private java.lang.Boolean isOnline;

    private java.lang.Boolean isDebitCard;

    private org.mule.module.netsuite.api.internal.RecordRefList merchantAccountsList;

    private java.lang.String payPalEmailAddress;

    private java.lang.String expressCheckoutArrangement;

    private java.lang.Boolean useExpressCheckout;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public PaymentMethod() {
    }

    public PaymentMethod(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.lang.String name,
           java.lang.Boolean creditCard,
           java.lang.Boolean undepFunds,
           org.mule.module.netsuite.api.internal.RecordRef account,
           java.lang.Boolean isInactive,
           java.lang.Boolean isOnline,
           java.lang.Boolean isDebitCard,
           org.mule.module.netsuite.api.internal.RecordRefList merchantAccountsList,
           java.lang.String payPalEmailAddress,
           java.lang.String expressCheckoutArrangement,
           java.lang.Boolean useExpressCheckout) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.name = name;
        this.creditCard = creditCard;
        this.undepFunds = undepFunds;
        this.account = account;
        this.isInactive = isInactive;
        this.isOnline = isOnline;
        this.isDebitCard = isDebitCard;
        this.merchantAccountsList = merchantAccountsList;
        this.payPalEmailAddress = payPalEmailAddress;
        this.expressCheckoutArrangement = expressCheckoutArrangement;
        this.useExpressCheckout = useExpressCheckout;
    }


    /**
     * Gets the name value for this PaymentMethod.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PaymentMethod.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the creditCard value for this PaymentMethod.
     * 
     * @return creditCard
     */
    public java.lang.Boolean getCreditCard() {
        return creditCard;
    }


    /**
     * Sets the creditCard value for this PaymentMethod.
     * 
     * @param creditCard
     */
    public void setCreditCard(java.lang.Boolean creditCard) {
        this.creditCard = creditCard;
    }


    /**
     * Gets the undepFunds value for this PaymentMethod.
     * 
     * @return undepFunds
     */
    public java.lang.Boolean getUndepFunds() {
        return undepFunds;
    }


    /**
     * Sets the undepFunds value for this PaymentMethod.
     * 
     * @param undepFunds
     */
    public void setUndepFunds(java.lang.Boolean undepFunds) {
        this.undepFunds = undepFunds;
    }


    /**
     * Gets the account value for this PaymentMethod.
     * 
     * @return account
     */
    public org.mule.module.netsuite.api.internal.RecordRef getAccount() {
        return account;
    }


    /**
     * Sets the account value for this PaymentMethod.
     * 
     * @param account
     */
    public void setAccount(org.mule.module.netsuite.api.internal.RecordRef account) {
        this.account = account;
    }


    /**
     * Gets the isInactive value for this PaymentMethod.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this PaymentMethod.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the isOnline value for this PaymentMethod.
     * 
     * @return isOnline
     */
    public java.lang.Boolean getIsOnline() {
        return isOnline;
    }


    /**
     * Sets the isOnline value for this PaymentMethod.
     * 
     * @param isOnline
     */
    public void setIsOnline(java.lang.Boolean isOnline) {
        this.isOnline = isOnline;
    }


    /**
     * Gets the isDebitCard value for this PaymentMethod.
     * 
     * @return isDebitCard
     */
    public java.lang.Boolean getIsDebitCard() {
        return isDebitCard;
    }


    /**
     * Sets the isDebitCard value for this PaymentMethod.
     * 
     * @param isDebitCard
     */
    public void setIsDebitCard(java.lang.Boolean isDebitCard) {
        this.isDebitCard = isDebitCard;
    }


    /**
     * Gets the merchantAccountsList value for this PaymentMethod.
     * 
     * @return merchantAccountsList
     */
    public org.mule.module.netsuite.api.internal.RecordRefList getMerchantAccountsList() {
        return merchantAccountsList;
    }


    /**
     * Sets the merchantAccountsList value for this PaymentMethod.
     * 
     * @param merchantAccountsList
     */
    public void setMerchantAccountsList(org.mule.module.netsuite.api.internal.RecordRefList merchantAccountsList) {
        this.merchantAccountsList = merchantAccountsList;
    }


    /**
     * Gets the payPalEmailAddress value for this PaymentMethod.
     * 
     * @return payPalEmailAddress
     */
    public java.lang.String getPayPalEmailAddress() {
        return payPalEmailAddress;
    }


    /**
     * Sets the payPalEmailAddress value for this PaymentMethod.
     * 
     * @param payPalEmailAddress
     */
    public void setPayPalEmailAddress(java.lang.String payPalEmailAddress) {
        this.payPalEmailAddress = payPalEmailAddress;
    }


    /**
     * Gets the expressCheckoutArrangement value for this PaymentMethod.
     * 
     * @return expressCheckoutArrangement
     */
    public java.lang.String getExpressCheckoutArrangement() {
        return expressCheckoutArrangement;
    }


    /**
     * Sets the expressCheckoutArrangement value for this PaymentMethod.
     * 
     * @param expressCheckoutArrangement
     */
    public void setExpressCheckoutArrangement(java.lang.String expressCheckoutArrangement) {
        this.expressCheckoutArrangement = expressCheckoutArrangement;
    }


    /**
     * Gets the useExpressCheckout value for this PaymentMethod.
     * 
     * @return useExpressCheckout
     */
    public java.lang.Boolean getUseExpressCheckout() {
        return useExpressCheckout;
    }


    /**
     * Sets the useExpressCheckout value for this PaymentMethod.
     * 
     * @param useExpressCheckout
     */
    public void setUseExpressCheckout(java.lang.Boolean useExpressCheckout) {
        this.useExpressCheckout = useExpressCheckout;
    }


    /**
     * Gets the internalId value for this PaymentMethod.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this PaymentMethod.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this PaymentMethod.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this PaymentMethod.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentMethod)) return false;
        PaymentMethod other = (PaymentMethod) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.creditCard==null && other.getCreditCard()==null) || 
             (this.creditCard!=null &&
              this.creditCard.equals(other.getCreditCard()))) &&
            ((this.undepFunds==null && other.getUndepFunds()==null) || 
             (this.undepFunds!=null &&
              this.undepFunds.equals(other.getUndepFunds()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.isOnline==null && other.getIsOnline()==null) || 
             (this.isOnline!=null &&
              this.isOnline.equals(other.getIsOnline()))) &&
            ((this.isDebitCard==null && other.getIsDebitCard()==null) || 
             (this.isDebitCard!=null &&
              this.isDebitCard.equals(other.getIsDebitCard()))) &&
            ((this.merchantAccountsList==null && other.getMerchantAccountsList()==null) || 
             (this.merchantAccountsList!=null &&
              this.merchantAccountsList.equals(other.getMerchantAccountsList()))) &&
            ((this.payPalEmailAddress==null && other.getPayPalEmailAddress()==null) || 
             (this.payPalEmailAddress!=null &&
              this.payPalEmailAddress.equals(other.getPayPalEmailAddress()))) &&
            ((this.expressCheckoutArrangement==null && other.getExpressCheckoutArrangement()==null) || 
             (this.expressCheckoutArrangement!=null &&
              this.expressCheckoutArrangement.equals(other.getExpressCheckoutArrangement()))) &&
            ((this.useExpressCheckout==null && other.getUseExpressCheckout()==null) || 
             (this.useExpressCheckout!=null &&
              this.useExpressCheckout.equals(other.getUseExpressCheckout()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCreditCard() != null) {
            _hashCode += getCreditCard().hashCode();
        }
        if (getUndepFunds() != null) {
            _hashCode += getUndepFunds().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getIsOnline() != null) {
            _hashCode += getIsOnline().hashCode();
        }
        if (getIsDebitCard() != null) {
            _hashCode += getIsDebitCard().hashCode();
        }
        if (getMerchantAccountsList() != null) {
            _hashCode += getMerchantAccountsList().hashCode();
        }
        if (getPayPalEmailAddress() != null) {
            _hashCode += getPayPalEmailAddress().hashCode();
        }
        if (getExpressCheckoutArrangement() != null) {
            _hashCode += getExpressCheckoutArrangement().hashCode();
        }
        if (getUseExpressCheckout() != null) {
            _hashCode += getUseExpressCheckout().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentMethod.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "PaymentMethod"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "externalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCard");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "creditCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undepFunds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "undepFunds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOnline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isOnline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDebitCard");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isDebitCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantAccountsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "merchantAccountsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalEmailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "payPalEmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expressCheckoutArrangement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "expressCheckoutArrangement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useExpressCheckout");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "useExpressCheckout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
