/**
 * TaxGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class TaxGroup  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private java.lang.String itemId;

    private java.lang.String description;

    private java.lang.String state;

    private org.mule.module.netsuite.api.internal.RecordRef taxitem1;

    private java.lang.String unitprice1;

    private org.mule.module.netsuite.api.internal.RecordRef taxitem2;

    private java.lang.String unitprice2;

    private java.lang.Boolean piggyback;

    private java.lang.Boolean isInactive;

    private java.lang.Double rate;

    private org.mule.module.netsuite.api.internal.RecordRef taxType;

    private java.lang.Boolean includeChildren;

    private java.lang.String county;

    private java.lang.String city;

    private java.lang.String zip;

    private org.mule.module.netsuite.api.internal.RecordRef nexusCountry;

    private java.lang.Boolean isDefault;

    private org.mule.module.netsuite.api.internal.TaxGroupTaxItemList taxItemList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public TaxGroup() {
    }

    public TaxGroup(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.lang.String itemId,
           java.lang.String description,
           java.lang.String state,
           org.mule.module.netsuite.api.internal.RecordRef taxitem1,
           java.lang.String unitprice1,
           org.mule.module.netsuite.api.internal.RecordRef taxitem2,
           java.lang.String unitprice2,
           java.lang.Boolean piggyback,
           java.lang.Boolean isInactive,
           java.lang.Double rate,
           org.mule.module.netsuite.api.internal.RecordRef taxType,
           java.lang.Boolean includeChildren,
           java.lang.String county,
           java.lang.String city,
           java.lang.String zip,
           org.mule.module.netsuite.api.internal.RecordRef nexusCountry,
           java.lang.Boolean isDefault,
           org.mule.module.netsuite.api.internal.TaxGroupTaxItemList taxItemList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.itemId = itemId;
        this.description = description;
        this.state = state;
        this.taxitem1 = taxitem1;
        this.unitprice1 = unitprice1;
        this.taxitem2 = taxitem2;
        this.unitprice2 = unitprice2;
        this.piggyback = piggyback;
        this.isInactive = isInactive;
        this.rate = rate;
        this.taxType = taxType;
        this.includeChildren = includeChildren;
        this.county = county;
        this.city = city;
        this.zip = zip;
        this.nexusCountry = nexusCountry;
        this.isDefault = isDefault;
        this.taxItemList = taxItemList;
    }


    /**
     * Gets the itemId value for this TaxGroup.
     * 
     * @return itemId
     */
    public java.lang.String getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this TaxGroup.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.String itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the description value for this TaxGroup.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TaxGroup.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the state value for this TaxGroup.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this TaxGroup.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the taxitem1 value for this TaxGroup.
     * 
     * @return taxitem1
     */
    public org.mule.module.netsuite.api.internal.RecordRef getTaxitem1() {
        return taxitem1;
    }


    /**
     * Sets the taxitem1 value for this TaxGroup.
     * 
     * @param taxitem1
     */
    public void setTaxitem1(org.mule.module.netsuite.api.internal.RecordRef taxitem1) {
        this.taxitem1 = taxitem1;
    }


    /**
     * Gets the unitprice1 value for this TaxGroup.
     * 
     * @return unitprice1
     */
    public java.lang.String getUnitprice1() {
        return unitprice1;
    }


    /**
     * Sets the unitprice1 value for this TaxGroup.
     * 
     * @param unitprice1
     */
    public void setUnitprice1(java.lang.String unitprice1) {
        this.unitprice1 = unitprice1;
    }


    /**
     * Gets the taxitem2 value for this TaxGroup.
     * 
     * @return taxitem2
     */
    public org.mule.module.netsuite.api.internal.RecordRef getTaxitem2() {
        return taxitem2;
    }


    /**
     * Sets the taxitem2 value for this TaxGroup.
     * 
     * @param taxitem2
     */
    public void setTaxitem2(org.mule.module.netsuite.api.internal.RecordRef taxitem2) {
        this.taxitem2 = taxitem2;
    }


    /**
     * Gets the unitprice2 value for this TaxGroup.
     * 
     * @return unitprice2
     */
    public java.lang.String getUnitprice2() {
        return unitprice2;
    }


    /**
     * Sets the unitprice2 value for this TaxGroup.
     * 
     * @param unitprice2
     */
    public void setUnitprice2(java.lang.String unitprice2) {
        this.unitprice2 = unitprice2;
    }


    /**
     * Gets the piggyback value for this TaxGroup.
     * 
     * @return piggyback
     */
    public java.lang.Boolean getPiggyback() {
        return piggyback;
    }


    /**
     * Sets the piggyback value for this TaxGroup.
     * 
     * @param piggyback
     */
    public void setPiggyback(java.lang.Boolean piggyback) {
        this.piggyback = piggyback;
    }


    /**
     * Gets the isInactive value for this TaxGroup.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this TaxGroup.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the rate value for this TaxGroup.
     * 
     * @return rate
     */
    public java.lang.Double getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this TaxGroup.
     * 
     * @param rate
     */
    public void setRate(java.lang.Double rate) {
        this.rate = rate;
    }


    /**
     * Gets the taxType value for this TaxGroup.
     * 
     * @return taxType
     */
    public org.mule.module.netsuite.api.internal.RecordRef getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this TaxGroup.
     * 
     * @param taxType
     */
    public void setTaxType(org.mule.module.netsuite.api.internal.RecordRef taxType) {
        this.taxType = taxType;
    }


    /**
     * Gets the includeChildren value for this TaxGroup.
     * 
     * @return includeChildren
     */
    public java.lang.Boolean getIncludeChildren() {
        return includeChildren;
    }


    /**
     * Sets the includeChildren value for this TaxGroup.
     * 
     * @param includeChildren
     */
    public void setIncludeChildren(java.lang.Boolean includeChildren) {
        this.includeChildren = includeChildren;
    }


    /**
     * Gets the county value for this TaxGroup.
     * 
     * @return county
     */
    public java.lang.String getCounty() {
        return county;
    }


    /**
     * Sets the county value for this TaxGroup.
     * 
     * @param county
     */
    public void setCounty(java.lang.String county) {
        this.county = county;
    }


    /**
     * Gets the city value for this TaxGroup.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this TaxGroup.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the zip value for this TaxGroup.
     * 
     * @return zip
     */
    public java.lang.String getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this TaxGroup.
     * 
     * @param zip
     */
    public void setZip(java.lang.String zip) {
        this.zip = zip;
    }


    /**
     * Gets the nexusCountry value for this TaxGroup.
     * 
     * @return nexusCountry
     */
    public org.mule.module.netsuite.api.internal.RecordRef getNexusCountry() {
        return nexusCountry;
    }


    /**
     * Sets the nexusCountry value for this TaxGroup.
     * 
     * @param nexusCountry
     */
    public void setNexusCountry(org.mule.module.netsuite.api.internal.RecordRef nexusCountry) {
        this.nexusCountry = nexusCountry;
    }


    /**
     * Gets the isDefault value for this TaxGroup.
     * 
     * @return isDefault
     */
    public java.lang.Boolean getIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this TaxGroup.
     * 
     * @param isDefault
     */
    public void setIsDefault(java.lang.Boolean isDefault) {
        this.isDefault = isDefault;
    }


    /**
     * Gets the taxItemList value for this TaxGroup.
     * 
     * @return taxItemList
     */
    public org.mule.module.netsuite.api.internal.TaxGroupTaxItemList getTaxItemList() {
        return taxItemList;
    }


    /**
     * Sets the taxItemList value for this TaxGroup.
     * 
     * @param taxItemList
     */
    public void setTaxItemList(org.mule.module.netsuite.api.internal.TaxGroupTaxItemList taxItemList) {
        this.taxItemList = taxItemList;
    }


    /**
     * Gets the internalId value for this TaxGroup.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TaxGroup.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this TaxGroup.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this TaxGroup.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxGroup)) return false;
        TaxGroup other = (TaxGroup) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.taxitem1==null && other.getTaxitem1()==null) || 
             (this.taxitem1!=null &&
              this.taxitem1.equals(other.getTaxitem1()))) &&
            ((this.unitprice1==null && other.getUnitprice1()==null) || 
             (this.unitprice1!=null &&
              this.unitprice1.equals(other.getUnitprice1()))) &&
            ((this.taxitem2==null && other.getTaxitem2()==null) || 
             (this.taxitem2!=null &&
              this.taxitem2.equals(other.getTaxitem2()))) &&
            ((this.unitprice2==null && other.getUnitprice2()==null) || 
             (this.unitprice2!=null &&
              this.unitprice2.equals(other.getUnitprice2()))) &&
            ((this.piggyback==null && other.getPiggyback()==null) || 
             (this.piggyback!=null &&
              this.piggyback.equals(other.getPiggyback()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.taxType==null && other.getTaxType()==null) || 
             (this.taxType!=null &&
              this.taxType.equals(other.getTaxType()))) &&
            ((this.includeChildren==null && other.getIncludeChildren()==null) || 
             (this.includeChildren!=null &&
              this.includeChildren.equals(other.getIncludeChildren()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              this.zip.equals(other.getZip()))) &&
            ((this.nexusCountry==null && other.getNexusCountry()==null) || 
             (this.nexusCountry!=null &&
              this.nexusCountry.equals(other.getNexusCountry()))) &&
            ((this.isDefault==null && other.getIsDefault()==null) || 
             (this.isDefault!=null &&
              this.isDefault.equals(other.getIsDefault()))) &&
            ((this.taxItemList==null && other.getTaxItemList()==null) || 
             (this.taxItemList!=null &&
              this.taxItemList.equals(other.getTaxItemList()))) &&
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getTaxitem1() != null) {
            _hashCode += getTaxitem1().hashCode();
        }
        if (getUnitprice1() != null) {
            _hashCode += getUnitprice1().hashCode();
        }
        if (getTaxitem2() != null) {
            _hashCode += getTaxitem2().hashCode();
        }
        if (getUnitprice2() != null) {
            _hashCode += getUnitprice2().hashCode();
        }
        if (getPiggyback() != null) {
            _hashCode += getPiggyback().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getTaxType() != null) {
            _hashCode += getTaxType().hashCode();
        }
        if (getIncludeChildren() != null) {
            _hashCode += getIncludeChildren().hashCode();
        }
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        if (getNexusCountry() != null) {
            _hashCode += getNexusCountry().hashCode();
        }
        if (getIsDefault() != null) {
            _hashCode += getIsDefault().hashCode();
        }
        if (getTaxItemList() != null) {
            _hashCode += getTaxItemList().hashCode();
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
        new org.apache.axis.description.TypeDesc(TaxGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "TaxGroup"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "description"));
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
        elemField.setFieldName("taxitem1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "taxitem1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitprice1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "unitprice1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxitem2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "taxitem2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitprice2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "unitprice2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("piggyback");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "piggyback"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "includeChildren"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "taxItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "TaxGroupTaxItemList"));
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
