/**
 * SalesTaxItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SalesTaxItem  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private java.lang.String itemId;

    private java.lang.String displayName;

    private java.lang.String description;

    private java.lang.String rate;

    private org.mule.module.netsuite.api.internal.RecordRef taxType;

    private org.mule.module.netsuite.api.internal.RecordRef taxAgency;

    private org.mule.module.netsuite.api.internal.RecordRef purchaseAccount;

    private org.mule.module.netsuite.api.internal.RecordRef saleAccount;

    private java.lang.Boolean isInactive;

    private java.util.Calendar effectiveFrom;

    private java.util.Calendar validUntil;

    private java.lang.Boolean eccode;

    private java.lang.Boolean reverseCharge;

    private org.mule.module.netsuite.api.internal.RecordRef parent;

    private java.lang.Boolean exempt;

    private java.lang.Boolean isDefault;

    private java.lang.Boolean excludeFromTaxReports;

    private org.mule.module.netsuite.api.internal.SalesTaxItemAvailable available;

    private java.lang.Boolean export;

    private org.mule.module.netsuite.api.internal.RecordRef taxAccount;

    private java.lang.String county;

    private java.lang.String city;

    private java.lang.String state;

    private java.lang.String zip;

    private org.mule.module.netsuite.api.internal.RecordRef nexusCountry;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public SalesTaxItem() {
    }

    public SalesTaxItem(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.lang.String itemId,
           java.lang.String displayName,
           java.lang.String description,
           java.lang.String rate,
           org.mule.module.netsuite.api.internal.RecordRef taxType,
           org.mule.module.netsuite.api.internal.RecordRef taxAgency,
           org.mule.module.netsuite.api.internal.RecordRef purchaseAccount,
           org.mule.module.netsuite.api.internal.RecordRef saleAccount,
           java.lang.Boolean isInactive,
           java.util.Calendar effectiveFrom,
           java.util.Calendar validUntil,
           java.lang.Boolean eccode,
           java.lang.Boolean reverseCharge,
           org.mule.module.netsuite.api.internal.RecordRef parent,
           java.lang.Boolean exempt,
           java.lang.Boolean isDefault,
           java.lang.Boolean excludeFromTaxReports,
           org.mule.module.netsuite.api.internal.SalesTaxItemAvailable available,
           java.lang.Boolean export,
           org.mule.module.netsuite.api.internal.RecordRef taxAccount,
           java.lang.String county,
           java.lang.String city,
           java.lang.String state,
           java.lang.String zip,
           org.mule.module.netsuite.api.internal.RecordRef nexusCountry) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.itemId = itemId;
        this.displayName = displayName;
        this.description = description;
        this.rate = rate;
        this.taxType = taxType;
        this.taxAgency = taxAgency;
        this.purchaseAccount = purchaseAccount;
        this.saleAccount = saleAccount;
        this.isInactive = isInactive;
        this.effectiveFrom = effectiveFrom;
        this.validUntil = validUntil;
        this.eccode = eccode;
        this.reverseCharge = reverseCharge;
        this.parent = parent;
        this.exempt = exempt;
        this.isDefault = isDefault;
        this.excludeFromTaxReports = excludeFromTaxReports;
        this.available = available;
        this.export = export;
        this.taxAccount = taxAccount;
        this.county = county;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.nexusCountry = nexusCountry;
    }


    /**
     * Gets the itemId value for this SalesTaxItem.
     * 
     * @return itemId
     */
    public java.lang.String getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this SalesTaxItem.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.String itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the displayName value for this SalesTaxItem.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this SalesTaxItem.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the description value for this SalesTaxItem.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SalesTaxItem.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the rate value for this SalesTaxItem.
     * 
     * @return rate
     */
    public java.lang.String getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this SalesTaxItem.
     * 
     * @param rate
     */
    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }


    /**
     * Gets the taxType value for this SalesTaxItem.
     * 
     * @return taxType
     */
    public org.mule.module.netsuite.api.internal.RecordRef getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this SalesTaxItem.
     * 
     * @param taxType
     */
    public void setTaxType(org.mule.module.netsuite.api.internal.RecordRef taxType) {
        this.taxType = taxType;
    }


    /**
     * Gets the taxAgency value for this SalesTaxItem.
     * 
     * @return taxAgency
     */
    public org.mule.module.netsuite.api.internal.RecordRef getTaxAgency() {
        return taxAgency;
    }


    /**
     * Sets the taxAgency value for this SalesTaxItem.
     * 
     * @param taxAgency
     */
    public void setTaxAgency(org.mule.module.netsuite.api.internal.RecordRef taxAgency) {
        this.taxAgency = taxAgency;
    }


    /**
     * Gets the purchaseAccount value for this SalesTaxItem.
     * 
     * @return purchaseAccount
     */
    public org.mule.module.netsuite.api.internal.RecordRef getPurchaseAccount() {
        return purchaseAccount;
    }


    /**
     * Sets the purchaseAccount value for this SalesTaxItem.
     * 
     * @param purchaseAccount
     */
    public void setPurchaseAccount(org.mule.module.netsuite.api.internal.RecordRef purchaseAccount) {
        this.purchaseAccount = purchaseAccount;
    }


    /**
     * Gets the saleAccount value for this SalesTaxItem.
     * 
     * @return saleAccount
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSaleAccount() {
        return saleAccount;
    }


    /**
     * Sets the saleAccount value for this SalesTaxItem.
     * 
     * @param saleAccount
     */
    public void setSaleAccount(org.mule.module.netsuite.api.internal.RecordRef saleAccount) {
        this.saleAccount = saleAccount;
    }


    /**
     * Gets the isInactive value for this SalesTaxItem.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this SalesTaxItem.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the effectiveFrom value for this SalesTaxItem.
     * 
     * @return effectiveFrom
     */
    public java.util.Calendar getEffectiveFrom() {
        return effectiveFrom;
    }


    /**
     * Sets the effectiveFrom value for this SalesTaxItem.
     * 
     * @param effectiveFrom
     */
    public void setEffectiveFrom(java.util.Calendar effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
    }


    /**
     * Gets the validUntil value for this SalesTaxItem.
     * 
     * @return validUntil
     */
    public java.util.Calendar getValidUntil() {
        return validUntil;
    }


    /**
     * Sets the validUntil value for this SalesTaxItem.
     * 
     * @param validUntil
     */
    public void setValidUntil(java.util.Calendar validUntil) {
        this.validUntil = validUntil;
    }


    /**
     * Gets the eccode value for this SalesTaxItem.
     * 
     * @return eccode
     */
    public java.lang.Boolean getEccode() {
        return eccode;
    }


    /**
     * Sets the eccode value for this SalesTaxItem.
     * 
     * @param eccode
     */
    public void setEccode(java.lang.Boolean eccode) {
        this.eccode = eccode;
    }


    /**
     * Gets the reverseCharge value for this SalesTaxItem.
     * 
     * @return reverseCharge
     */
    public java.lang.Boolean getReverseCharge() {
        return reverseCharge;
    }


    /**
     * Sets the reverseCharge value for this SalesTaxItem.
     * 
     * @param reverseCharge
     */
    public void setReverseCharge(java.lang.Boolean reverseCharge) {
        this.reverseCharge = reverseCharge;
    }


    /**
     * Gets the parent value for this SalesTaxItem.
     * 
     * @return parent
     */
    public org.mule.module.netsuite.api.internal.RecordRef getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this SalesTaxItem.
     * 
     * @param parent
     */
    public void setParent(org.mule.module.netsuite.api.internal.RecordRef parent) {
        this.parent = parent;
    }


    /**
     * Gets the exempt value for this SalesTaxItem.
     * 
     * @return exempt
     */
    public java.lang.Boolean getExempt() {
        return exempt;
    }


    /**
     * Sets the exempt value for this SalesTaxItem.
     * 
     * @param exempt
     */
    public void setExempt(java.lang.Boolean exempt) {
        this.exempt = exempt;
    }


    /**
     * Gets the isDefault value for this SalesTaxItem.
     * 
     * @return isDefault
     */
    public java.lang.Boolean getIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this SalesTaxItem.
     * 
     * @param isDefault
     */
    public void setIsDefault(java.lang.Boolean isDefault) {
        this.isDefault = isDefault;
    }


    /**
     * Gets the excludeFromTaxReports value for this SalesTaxItem.
     * 
     * @return excludeFromTaxReports
     */
    public java.lang.Boolean getExcludeFromTaxReports() {
        return excludeFromTaxReports;
    }


    /**
     * Sets the excludeFromTaxReports value for this SalesTaxItem.
     * 
     * @param excludeFromTaxReports
     */
    public void setExcludeFromTaxReports(java.lang.Boolean excludeFromTaxReports) {
        this.excludeFromTaxReports = excludeFromTaxReports;
    }


    /**
     * Gets the available value for this SalesTaxItem.
     * 
     * @return available
     */
    public org.mule.module.netsuite.api.internal.SalesTaxItemAvailable getAvailable() {
        return available;
    }


    /**
     * Sets the available value for this SalesTaxItem.
     * 
     * @param available
     */
    public void setAvailable(org.mule.module.netsuite.api.internal.SalesTaxItemAvailable available) {
        this.available = available;
    }


    /**
     * Gets the export value for this SalesTaxItem.
     * 
     * @return export
     */
    public java.lang.Boolean getExport() {
        return export;
    }


    /**
     * Sets the export value for this SalesTaxItem.
     * 
     * @param export
     */
    public void setExport(java.lang.Boolean export) {
        this.export = export;
    }


    /**
     * Gets the taxAccount value for this SalesTaxItem.
     * 
     * @return taxAccount
     */
    public org.mule.module.netsuite.api.internal.RecordRef getTaxAccount() {
        return taxAccount;
    }


    /**
     * Sets the taxAccount value for this SalesTaxItem.
     * 
     * @param taxAccount
     */
    public void setTaxAccount(org.mule.module.netsuite.api.internal.RecordRef taxAccount) {
        this.taxAccount = taxAccount;
    }


    /**
     * Gets the county value for this SalesTaxItem.
     * 
     * @return county
     */
    public java.lang.String getCounty() {
        return county;
    }


    /**
     * Sets the county value for this SalesTaxItem.
     * 
     * @param county
     */
    public void setCounty(java.lang.String county) {
        this.county = county;
    }


    /**
     * Gets the city value for this SalesTaxItem.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this SalesTaxItem.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this SalesTaxItem.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this SalesTaxItem.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the zip value for this SalesTaxItem.
     * 
     * @return zip
     */
    public java.lang.String getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this SalesTaxItem.
     * 
     * @param zip
     */
    public void setZip(java.lang.String zip) {
        this.zip = zip;
    }


    /**
     * Gets the nexusCountry value for this SalesTaxItem.
     * 
     * @return nexusCountry
     */
    public org.mule.module.netsuite.api.internal.RecordRef getNexusCountry() {
        return nexusCountry;
    }


    /**
     * Sets the nexusCountry value for this SalesTaxItem.
     * 
     * @param nexusCountry
     */
    public void setNexusCountry(org.mule.module.netsuite.api.internal.RecordRef nexusCountry) {
        this.nexusCountry = nexusCountry;
    }


    /**
     * Gets the internalId value for this SalesTaxItem.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this SalesTaxItem.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this SalesTaxItem.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this SalesTaxItem.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalesTaxItem)) return false;
        SalesTaxItem other = (SalesTaxItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.taxType==null && other.getTaxType()==null) || 
             (this.taxType!=null &&
              this.taxType.equals(other.getTaxType()))) &&
            ((this.taxAgency==null && other.getTaxAgency()==null) || 
             (this.taxAgency!=null &&
              this.taxAgency.equals(other.getTaxAgency()))) &&
            ((this.purchaseAccount==null && other.getPurchaseAccount()==null) || 
             (this.purchaseAccount!=null &&
              this.purchaseAccount.equals(other.getPurchaseAccount()))) &&
            ((this.saleAccount==null && other.getSaleAccount()==null) || 
             (this.saleAccount!=null &&
              this.saleAccount.equals(other.getSaleAccount()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.effectiveFrom==null && other.getEffectiveFrom()==null) || 
             (this.effectiveFrom!=null &&
              this.effectiveFrom.equals(other.getEffectiveFrom()))) &&
            ((this.validUntil==null && other.getValidUntil()==null) || 
             (this.validUntil!=null &&
              this.validUntil.equals(other.getValidUntil()))) &&
            ((this.eccode==null && other.getEccode()==null) || 
             (this.eccode!=null &&
              this.eccode.equals(other.getEccode()))) &&
            ((this.reverseCharge==null && other.getReverseCharge()==null) || 
             (this.reverseCharge!=null &&
              this.reverseCharge.equals(other.getReverseCharge()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.exempt==null && other.getExempt()==null) || 
             (this.exempt!=null &&
              this.exempt.equals(other.getExempt()))) &&
            ((this.isDefault==null && other.getIsDefault()==null) || 
             (this.isDefault!=null &&
              this.isDefault.equals(other.getIsDefault()))) &&
            ((this.excludeFromTaxReports==null && other.getExcludeFromTaxReports()==null) || 
             (this.excludeFromTaxReports!=null &&
              this.excludeFromTaxReports.equals(other.getExcludeFromTaxReports()))) &&
            ((this.available==null && other.getAvailable()==null) || 
             (this.available!=null &&
              this.available.equals(other.getAvailable()))) &&
            ((this.export==null && other.getExport()==null) || 
             (this.export!=null &&
              this.export.equals(other.getExport()))) &&
            ((this.taxAccount==null && other.getTaxAccount()==null) || 
             (this.taxAccount!=null &&
              this.taxAccount.equals(other.getTaxAccount()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              this.zip.equals(other.getZip()))) &&
            ((this.nexusCountry==null && other.getNexusCountry()==null) || 
             (this.nexusCountry!=null &&
              this.nexusCountry.equals(other.getNexusCountry()))) &&
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
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getTaxType() != null) {
            _hashCode += getTaxType().hashCode();
        }
        if (getTaxAgency() != null) {
            _hashCode += getTaxAgency().hashCode();
        }
        if (getPurchaseAccount() != null) {
            _hashCode += getPurchaseAccount().hashCode();
        }
        if (getSaleAccount() != null) {
            _hashCode += getSaleAccount().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getEffectiveFrom() != null) {
            _hashCode += getEffectiveFrom().hashCode();
        }
        if (getValidUntil() != null) {
            _hashCode += getValidUntil().hashCode();
        }
        if (getEccode() != null) {
            _hashCode += getEccode().hashCode();
        }
        if (getReverseCharge() != null) {
            _hashCode += getReverseCharge().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getExempt() != null) {
            _hashCode += getExempt().hashCode();
        }
        if (getIsDefault() != null) {
            _hashCode += getIsDefault().hashCode();
        }
        if (getExcludeFromTaxReports() != null) {
            _hashCode += getExcludeFromTaxReports().hashCode();
        }
        if (getAvailable() != null) {
            _hashCode += getAvailable().hashCode();
        }
        if (getExport() != null) {
            _hashCode += getExport().hashCode();
        }
        if (getTaxAccount() != null) {
            _hashCode += getTaxAccount().hashCode();
        }
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        if (getNexusCountry() != null) {
            _hashCode += getNexusCountry().hashCode();
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
        new org.apache.axis.description.TypeDesc(SalesTaxItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SalesTaxItem"));
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
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "taxType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAgency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "taxAgency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "purchaseAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saleAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "saleAccount"));
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
        elemField.setFieldName("effectiveFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "effectiveFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validUntil");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "validUntil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eccode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "eccode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reverseCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "reverseCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exempt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "exempt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeFromTaxReports");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "excludeFromTaxReports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("available");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "available"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "SalesTaxItemAvailable"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("export");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "export"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "taxAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "county"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexusCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "nexusCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
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
