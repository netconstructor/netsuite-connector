/**
 * PromotionCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class PromotionCode  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef customForm;

    private java.lang.String code;

    private java.lang.String description;

    private java.lang.Boolean isInactive;

    private org.mule.module.netsuite.api.internal.RecordRef discount;

    private java.lang.String rate;

    private java.lang.Boolean discountType;

    private org.mule.module.netsuite.api.internal.PromotionCodeApplyDiscountTo applyDiscountTo;

    private org.mule.module.netsuite.api.internal.RecordRef freeShipMethod;

    private java.lang.Double minimumOrderAmount;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private java.lang.Boolean isPublic;

    private org.mule.module.netsuite.api.internal.PromotionCodeCurrencyList currencyList;

    private java.lang.Boolean excludeItems;

    private org.mule.module.netsuite.api.internal.PromotionCodeItemsList itemsList;

    private org.mule.module.netsuite.api.internal.PromotionCodePartnersList partnersList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public PromotionCode() {
    }

    public PromotionCode(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           org.mule.module.netsuite.api.internal.RecordRef customForm,
           java.lang.String code,
           java.lang.String description,
           java.lang.Boolean isInactive,
           org.mule.module.netsuite.api.internal.RecordRef discount,
           java.lang.String rate,
           java.lang.Boolean discountType,
           org.mule.module.netsuite.api.internal.PromotionCodeApplyDiscountTo applyDiscountTo,
           org.mule.module.netsuite.api.internal.RecordRef freeShipMethod,
           java.lang.Double minimumOrderAmount,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           java.lang.Boolean isPublic,
           org.mule.module.netsuite.api.internal.PromotionCodeCurrencyList currencyList,
           java.lang.Boolean excludeItems,
           org.mule.module.netsuite.api.internal.PromotionCodeItemsList itemsList,
           org.mule.module.netsuite.api.internal.PromotionCodePartnersList partnersList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.code = code;
        this.description = description;
        this.isInactive = isInactive;
        this.discount = discount;
        this.rate = rate;
        this.discountType = discountType;
        this.applyDiscountTo = applyDiscountTo;
        this.freeShipMethod = freeShipMethod;
        this.minimumOrderAmount = minimumOrderAmount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isPublic = isPublic;
        this.currencyList = currencyList;
        this.excludeItems = excludeItems;
        this.itemsList = itemsList;
        this.partnersList = partnersList;
    }


    /**
     * Gets the customForm value for this PromotionCode.
     * 
     * @return customForm
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this PromotionCode.
     * 
     * @param customForm
     */
    public void setCustomForm(org.mule.module.netsuite.api.internal.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the code value for this PromotionCode.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this PromotionCode.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the description value for this PromotionCode.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PromotionCode.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the isInactive value for this PromotionCode.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this PromotionCode.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the discount value for this PromotionCode.
     * 
     * @return discount
     */
    public org.mule.module.netsuite.api.internal.RecordRef getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this PromotionCode.
     * 
     * @param discount
     */
    public void setDiscount(org.mule.module.netsuite.api.internal.RecordRef discount) {
        this.discount = discount;
    }


    /**
     * Gets the rate value for this PromotionCode.
     * 
     * @return rate
     */
    public java.lang.String getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this PromotionCode.
     * 
     * @param rate
     */
    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }


    /**
     * Gets the discountType value for this PromotionCode.
     * 
     * @return discountType
     */
    public java.lang.Boolean getDiscountType() {
        return discountType;
    }


    /**
     * Sets the discountType value for this PromotionCode.
     * 
     * @param discountType
     */
    public void setDiscountType(java.lang.Boolean discountType) {
        this.discountType = discountType;
    }


    /**
     * Gets the applyDiscountTo value for this PromotionCode.
     * 
     * @return applyDiscountTo
     */
    public org.mule.module.netsuite.api.internal.PromotionCodeApplyDiscountTo getApplyDiscountTo() {
        return applyDiscountTo;
    }


    /**
     * Sets the applyDiscountTo value for this PromotionCode.
     * 
     * @param applyDiscountTo
     */
    public void setApplyDiscountTo(org.mule.module.netsuite.api.internal.PromotionCodeApplyDiscountTo applyDiscountTo) {
        this.applyDiscountTo = applyDiscountTo;
    }


    /**
     * Gets the freeShipMethod value for this PromotionCode.
     * 
     * @return freeShipMethod
     */
    public org.mule.module.netsuite.api.internal.RecordRef getFreeShipMethod() {
        return freeShipMethod;
    }


    /**
     * Sets the freeShipMethod value for this PromotionCode.
     * 
     * @param freeShipMethod
     */
    public void setFreeShipMethod(org.mule.module.netsuite.api.internal.RecordRef freeShipMethod) {
        this.freeShipMethod = freeShipMethod;
    }


    /**
     * Gets the minimumOrderAmount value for this PromotionCode.
     * 
     * @return minimumOrderAmount
     */
    public java.lang.Double getMinimumOrderAmount() {
        return minimumOrderAmount;
    }


    /**
     * Sets the minimumOrderAmount value for this PromotionCode.
     * 
     * @param minimumOrderAmount
     */
    public void setMinimumOrderAmount(java.lang.Double minimumOrderAmount) {
        this.minimumOrderAmount = minimumOrderAmount;
    }


    /**
     * Gets the startDate value for this PromotionCode.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this PromotionCode.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this PromotionCode.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this PromotionCode.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the isPublic value for this PromotionCode.
     * 
     * @return isPublic
     */
    public java.lang.Boolean getIsPublic() {
        return isPublic;
    }


    /**
     * Sets the isPublic value for this PromotionCode.
     * 
     * @param isPublic
     */
    public void setIsPublic(java.lang.Boolean isPublic) {
        this.isPublic = isPublic;
    }


    /**
     * Gets the currencyList value for this PromotionCode.
     * 
     * @return currencyList
     */
    public org.mule.module.netsuite.api.internal.PromotionCodeCurrencyList getCurrencyList() {
        return currencyList;
    }


    /**
     * Sets the currencyList value for this PromotionCode.
     * 
     * @param currencyList
     */
    public void setCurrencyList(org.mule.module.netsuite.api.internal.PromotionCodeCurrencyList currencyList) {
        this.currencyList = currencyList;
    }


    /**
     * Gets the excludeItems value for this PromotionCode.
     * 
     * @return excludeItems
     */
    public java.lang.Boolean getExcludeItems() {
        return excludeItems;
    }


    /**
     * Sets the excludeItems value for this PromotionCode.
     * 
     * @param excludeItems
     */
    public void setExcludeItems(java.lang.Boolean excludeItems) {
        this.excludeItems = excludeItems;
    }


    /**
     * Gets the itemsList value for this PromotionCode.
     * 
     * @return itemsList
     */
    public org.mule.module.netsuite.api.internal.PromotionCodeItemsList getItemsList() {
        return itemsList;
    }


    /**
     * Sets the itemsList value for this PromotionCode.
     * 
     * @param itemsList
     */
    public void setItemsList(org.mule.module.netsuite.api.internal.PromotionCodeItemsList itemsList) {
        this.itemsList = itemsList;
    }


    /**
     * Gets the partnersList value for this PromotionCode.
     * 
     * @return partnersList
     */
    public org.mule.module.netsuite.api.internal.PromotionCodePartnersList getPartnersList() {
        return partnersList;
    }


    /**
     * Sets the partnersList value for this PromotionCode.
     * 
     * @param partnersList
     */
    public void setPartnersList(org.mule.module.netsuite.api.internal.PromotionCodePartnersList partnersList) {
        this.partnersList = partnersList;
    }


    /**
     * Gets the internalId value for this PromotionCode.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this PromotionCode.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this PromotionCode.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this PromotionCode.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PromotionCode)) return false;
        PromotionCode other = (PromotionCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.discount==null && other.getDiscount()==null) || 
             (this.discount!=null &&
              this.discount.equals(other.getDiscount()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.discountType==null && other.getDiscountType()==null) || 
             (this.discountType!=null &&
              this.discountType.equals(other.getDiscountType()))) &&
            ((this.applyDiscountTo==null && other.getApplyDiscountTo()==null) || 
             (this.applyDiscountTo!=null &&
              this.applyDiscountTo.equals(other.getApplyDiscountTo()))) &&
            ((this.freeShipMethod==null && other.getFreeShipMethod()==null) || 
             (this.freeShipMethod!=null &&
              this.freeShipMethod.equals(other.getFreeShipMethod()))) &&
            ((this.minimumOrderAmount==null && other.getMinimumOrderAmount()==null) || 
             (this.minimumOrderAmount!=null &&
              this.minimumOrderAmount.equals(other.getMinimumOrderAmount()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.isPublic==null && other.getIsPublic()==null) || 
             (this.isPublic!=null &&
              this.isPublic.equals(other.getIsPublic()))) &&
            ((this.currencyList==null && other.getCurrencyList()==null) || 
             (this.currencyList!=null &&
              this.currencyList.equals(other.getCurrencyList()))) &&
            ((this.excludeItems==null && other.getExcludeItems()==null) || 
             (this.excludeItems!=null &&
              this.excludeItems.equals(other.getExcludeItems()))) &&
            ((this.itemsList==null && other.getItemsList()==null) || 
             (this.itemsList!=null &&
              this.itemsList.equals(other.getItemsList()))) &&
            ((this.partnersList==null && other.getPartnersList()==null) || 
             (this.partnersList!=null &&
              this.partnersList.equals(other.getPartnersList()))) &&
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
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getDiscount() != null) {
            _hashCode += getDiscount().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getDiscountType() != null) {
            _hashCode += getDiscountType().hashCode();
        }
        if (getApplyDiscountTo() != null) {
            _hashCode += getApplyDiscountTo().hashCode();
        }
        if (getFreeShipMethod() != null) {
            _hashCode += getFreeShipMethod().hashCode();
        }
        if (getMinimumOrderAmount() != null) {
            _hashCode += getMinimumOrderAmount().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getIsPublic() != null) {
            _hashCode += getIsPublic().hashCode();
        }
        if (getCurrencyList() != null) {
            _hashCode += getCurrencyList().hashCode();
        }
        if (getExcludeItems() != null) {
            _hashCode += getExcludeItems().hashCode();
        }
        if (getItemsList() != null) {
            _hashCode += getItemsList().hashCode();
        }
        if (getPartnersList() != null) {
            _hashCode += getPartnersList().hashCode();
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
        new org.apache.axis.description.TypeDesc(PromotionCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "PromotionCode"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "discountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyDiscountTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "applyDiscountTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.marketing_2010_2.lists.webservices.netsuite.com", "PromotionCodeApplyDiscountTo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeShipMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "freeShipMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumOrderAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "minimumOrderAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPublic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "isPublic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "currencyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "PromotionCodeCurrencyList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeItems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "excludeItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "itemsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "PromotionCodeItemsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnersList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "partnersList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "PromotionCodePartnersList"));
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
