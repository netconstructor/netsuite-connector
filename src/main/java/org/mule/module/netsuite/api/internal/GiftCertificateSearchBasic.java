/**
 * GiftCertificateSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class GiftCertificateSearchBasic  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchDoubleField amountAvailableBilled;

    private org.mule.module.netsuite.api.internal.SearchDoubleField amountRemaining;

    private org.mule.module.netsuite.api.internal.SearchDateField createdDate;

    private org.mule.module.netsuite.api.internal.SearchStringField email;

    private org.mule.module.netsuite.api.internal.SearchDateField expirationDate;

    private org.mule.module.netsuite.api.internal.SearchStringField giftCertCode;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField incomeAccount;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId;

    private org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isActive;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField item;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField liabilityAccount;

    private org.mule.module.netsuite.api.internal.SearchStringField message;

    private org.mule.module.netsuite.api.internal.SearchStringField name;

    private org.mule.module.netsuite.api.internal.SearchDoubleField originalAmount;

    private org.mule.module.netsuite.api.internal.SearchDateField purchaseDate;

    private org.mule.module.netsuite.api.internal.SearchStringField sender;

    private org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList;

    public GiftCertificateSearchBasic() {
    }

    public GiftCertificateSearchBasic(
           org.mule.module.netsuite.api.internal.SearchDoubleField amountAvailableBilled,
           org.mule.module.netsuite.api.internal.SearchDoubleField amountRemaining,
           org.mule.module.netsuite.api.internal.SearchDateField createdDate,
           org.mule.module.netsuite.api.internal.SearchStringField email,
           org.mule.module.netsuite.api.internal.SearchDateField expirationDate,
           org.mule.module.netsuite.api.internal.SearchStringField giftCertCode,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField incomeAccount,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId,
           org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber,
           org.mule.module.netsuite.api.internal.SearchBooleanField isActive,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField item,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField liabilityAccount,
           org.mule.module.netsuite.api.internal.SearchStringField message,
           org.mule.module.netsuite.api.internal.SearchStringField name,
           org.mule.module.netsuite.api.internal.SearchDoubleField originalAmount,
           org.mule.module.netsuite.api.internal.SearchDateField purchaseDate,
           org.mule.module.netsuite.api.internal.SearchStringField sender,
           org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.amountAvailableBilled = amountAvailableBilled;
        this.amountRemaining = amountRemaining;
        this.createdDate = createdDate;
        this.email = email;
        this.expirationDate = expirationDate;
        this.giftCertCode = giftCertCode;
        this.incomeAccount = incomeAccount;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isActive = isActive;
        this.item = item;
        this.liabilityAccount = liabilityAccount;
        this.message = message;
        this.name = name;
        this.originalAmount = originalAmount;
        this.purchaseDate = purchaseDate;
        this.sender = sender;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the amountAvailableBilled value for this GiftCertificateSearchBasic.
     * 
     * @return amountAvailableBilled
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getAmountAvailableBilled() {
        return amountAvailableBilled;
    }


    /**
     * Sets the amountAvailableBilled value for this GiftCertificateSearchBasic.
     * 
     * @param amountAvailableBilled
     */
    public void setAmountAvailableBilled(org.mule.module.netsuite.api.internal.SearchDoubleField amountAvailableBilled) {
        this.amountAvailableBilled = amountAvailableBilled;
    }


    /**
     * Gets the amountRemaining value for this GiftCertificateSearchBasic.
     * 
     * @return amountRemaining
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getAmountRemaining() {
        return amountRemaining;
    }


    /**
     * Sets the amountRemaining value for this GiftCertificateSearchBasic.
     * 
     * @param amountRemaining
     */
    public void setAmountRemaining(org.mule.module.netsuite.api.internal.SearchDoubleField amountRemaining) {
        this.amountRemaining = amountRemaining;
    }


    /**
     * Gets the createdDate value for this GiftCertificateSearchBasic.
     * 
     * @return createdDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this GiftCertificateSearchBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(org.mule.module.netsuite.api.internal.SearchDateField createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the email value for this GiftCertificateSearchBasic.
     * 
     * @return email
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getEmail() {
        return email;
    }


    /**
     * Sets the email value for this GiftCertificateSearchBasic.
     * 
     * @param email
     */
    public void setEmail(org.mule.module.netsuite.api.internal.SearchStringField email) {
        this.email = email;
    }


    /**
     * Gets the expirationDate value for this GiftCertificateSearchBasic.
     * 
     * @return expirationDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this GiftCertificateSearchBasic.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(org.mule.module.netsuite.api.internal.SearchDateField expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the giftCertCode value for this GiftCertificateSearchBasic.
     * 
     * @return giftCertCode
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getGiftCertCode() {
        return giftCertCode;
    }


    /**
     * Sets the giftCertCode value for this GiftCertificateSearchBasic.
     * 
     * @param giftCertCode
     */
    public void setGiftCertCode(org.mule.module.netsuite.api.internal.SearchStringField giftCertCode) {
        this.giftCertCode = giftCertCode;
    }


    /**
     * Gets the incomeAccount value for this GiftCertificateSearchBasic.
     * 
     * @return incomeAccount
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getIncomeAccount() {
        return incomeAccount;
    }


    /**
     * Sets the incomeAccount value for this GiftCertificateSearchBasic.
     * 
     * @param incomeAccount
     */
    public void setIncomeAccount(org.mule.module.netsuite.api.internal.SearchMultiSelectField incomeAccount) {
        this.incomeAccount = incomeAccount;
    }


    /**
     * Gets the internalId value for this GiftCertificateSearchBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this GiftCertificateSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this GiftCertificateSearchBasic.
     * 
     * @return internalIdNumber
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this GiftCertificateSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isActive value for this GiftCertificateSearchBasic.
     * 
     * @return isActive
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this GiftCertificateSearchBasic.
     * 
     * @param isActive
     */
    public void setIsActive(org.mule.module.netsuite.api.internal.SearchBooleanField isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the item value for this GiftCertificateSearchBasic.
     * 
     * @return item
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getItem() {
        return item;
    }


    /**
     * Sets the item value for this GiftCertificateSearchBasic.
     * 
     * @param item
     */
    public void setItem(org.mule.module.netsuite.api.internal.SearchMultiSelectField item) {
        this.item = item;
    }


    /**
     * Gets the liabilityAccount value for this GiftCertificateSearchBasic.
     * 
     * @return liabilityAccount
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getLiabilityAccount() {
        return liabilityAccount;
    }


    /**
     * Sets the liabilityAccount value for this GiftCertificateSearchBasic.
     * 
     * @param liabilityAccount
     */
    public void setLiabilityAccount(org.mule.module.netsuite.api.internal.SearchMultiSelectField liabilityAccount) {
        this.liabilityAccount = liabilityAccount;
    }


    /**
     * Gets the message value for this GiftCertificateSearchBasic.
     * 
     * @return message
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GiftCertificateSearchBasic.
     * 
     * @param message
     */
    public void setMessage(org.mule.module.netsuite.api.internal.SearchStringField message) {
        this.message = message;
    }


    /**
     * Gets the name value for this GiftCertificateSearchBasic.
     * 
     * @return name
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getName() {
        return name;
    }


    /**
     * Sets the name value for this GiftCertificateSearchBasic.
     * 
     * @param name
     */
    public void setName(org.mule.module.netsuite.api.internal.SearchStringField name) {
        this.name = name;
    }


    /**
     * Gets the originalAmount value for this GiftCertificateSearchBasic.
     * 
     * @return originalAmount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getOriginalAmount() {
        return originalAmount;
    }


    /**
     * Sets the originalAmount value for this GiftCertificateSearchBasic.
     * 
     * @param originalAmount
     */
    public void setOriginalAmount(org.mule.module.netsuite.api.internal.SearchDoubleField originalAmount) {
        this.originalAmount = originalAmount;
    }


    /**
     * Gets the purchaseDate value for this GiftCertificateSearchBasic.
     * 
     * @return purchaseDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getPurchaseDate() {
        return purchaseDate;
    }


    /**
     * Sets the purchaseDate value for this GiftCertificateSearchBasic.
     * 
     * @param purchaseDate
     */
    public void setPurchaseDate(org.mule.module.netsuite.api.internal.SearchDateField purchaseDate) {
        this.purchaseDate = purchaseDate;
    }


    /**
     * Gets the sender value for this GiftCertificateSearchBasic.
     * 
     * @return sender
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getSender() {
        return sender;
    }


    /**
     * Sets the sender value for this GiftCertificateSearchBasic.
     * 
     * @param sender
     */
    public void setSender(org.mule.module.netsuite.api.internal.SearchStringField sender) {
        this.sender = sender;
    }


    /**
     * Gets the customFieldList value for this GiftCertificateSearchBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this GiftCertificateSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GiftCertificateSearchBasic)) return false;
        GiftCertificateSearchBasic other = (GiftCertificateSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.amountAvailableBilled==null && other.getAmountAvailableBilled()==null) || 
             (this.amountAvailableBilled!=null &&
              this.amountAvailableBilled.equals(other.getAmountAvailableBilled()))) &&
            ((this.amountRemaining==null && other.getAmountRemaining()==null) || 
             (this.amountRemaining!=null &&
              this.amountRemaining.equals(other.getAmountRemaining()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.giftCertCode==null && other.getGiftCertCode()==null) || 
             (this.giftCertCode!=null &&
              this.giftCertCode.equals(other.getGiftCertCode()))) &&
            ((this.incomeAccount==null && other.getIncomeAccount()==null) || 
             (this.incomeAccount!=null &&
              this.incomeAccount.equals(other.getIncomeAccount()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.liabilityAccount==null && other.getLiabilityAccount()==null) || 
             (this.liabilityAccount!=null &&
              this.liabilityAccount.equals(other.getLiabilityAccount()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.originalAmount==null && other.getOriginalAmount()==null) || 
             (this.originalAmount!=null &&
              this.originalAmount.equals(other.getOriginalAmount()))) &&
            ((this.purchaseDate==null && other.getPurchaseDate()==null) || 
             (this.purchaseDate!=null &&
              this.purchaseDate.equals(other.getPurchaseDate()))) &&
            ((this.sender==null && other.getSender()==null) || 
             (this.sender!=null &&
              this.sender.equals(other.getSender()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList())));
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
        if (getAmountAvailableBilled() != null) {
            _hashCode += getAmountAvailableBilled().hashCode();
        }
        if (getAmountRemaining() != null) {
            _hashCode += getAmountRemaining().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getGiftCertCode() != null) {
            _hashCode += getGiftCertCode().hashCode();
        }
        if (getIncomeAccount() != null) {
            _hashCode += getIncomeAccount().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getLiabilityAccount() != null) {
            _hashCode += getLiabilityAccount().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOriginalAmount() != null) {
            _hashCode += getOriginalAmount().hashCode();
        }
        if (getPurchaseDate() != null) {
            _hashCode += getPurchaseDate().hashCode();
        }
        if (getSender() != null) {
            _hashCode += getSender().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GiftCertificateSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "GiftCertificateSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountAvailableBilled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "amountAvailableBilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "amountRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "giftCertCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incomeAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "incomeAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liabilityAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "liabilityAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "originalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "purchaseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sender");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "sender"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchCustomFieldList"));
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
