/**
 * Location.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class Location  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private java.lang.String name;

    private org.mule.module.netsuite.api.internal.RecordRef parent;

    private java.lang.Boolean includeChildren;

    private org.mule.module.netsuite.api.internal.RecordRefList subsidiaryList;

    private java.lang.Boolean isInactive;

    private java.lang.String tranPrefix;

    private java.lang.String attention;

    private java.lang.String addressee;

    private java.lang.String addrPhone;

    private java.lang.String addr1;

    private java.lang.String addr2;

    private java.lang.String addr3;

    private java.lang.String city;

    private java.lang.String state;

    private java.lang.String zip;

    private org.mule.module.netsuite.api.internal.Country country;

    private java.lang.String addrText;

    private java.lang.Boolean override;

    private org.mule.module.netsuite.api.internal.RecordRef logo;

    private java.lang.Boolean makeInventoryAvailable;

    private java.lang.Boolean makeInventoryAvailableStore;

    private org.mule.module.netsuite.api.internal.ClassTranslationList classTranslationList;

    private org.mule.module.netsuite.api.internal.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Location() {
    }

    public Location(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.lang.String name,
           org.mule.module.netsuite.api.internal.RecordRef parent,
           java.lang.Boolean includeChildren,
           org.mule.module.netsuite.api.internal.RecordRefList subsidiaryList,
           java.lang.Boolean isInactive,
           java.lang.String tranPrefix,
           java.lang.String attention,
           java.lang.String addressee,
           java.lang.String addrPhone,
           java.lang.String addr1,
           java.lang.String addr2,
           java.lang.String addr3,
           java.lang.String city,
           java.lang.String state,
           java.lang.String zip,
           org.mule.module.netsuite.api.internal.Country country,
           java.lang.String addrText,
           java.lang.Boolean override,
           org.mule.module.netsuite.api.internal.RecordRef logo,
           java.lang.Boolean makeInventoryAvailable,
           java.lang.Boolean makeInventoryAvailableStore,
           org.mule.module.netsuite.api.internal.ClassTranslationList classTranslationList,
           org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.name = name;
        this.parent = parent;
        this.includeChildren = includeChildren;
        this.subsidiaryList = subsidiaryList;
        this.isInactive = isInactive;
        this.tranPrefix = tranPrefix;
        this.attention = attention;
        this.addressee = addressee;
        this.addrPhone = addrPhone;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.addr3 = addr3;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.addrText = addrText;
        this.override = override;
        this.logo = logo;
        this.makeInventoryAvailable = makeInventoryAvailable;
        this.makeInventoryAvailableStore = makeInventoryAvailableStore;
        this.classTranslationList = classTranslationList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the name value for this Location.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Location.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the parent value for this Location.
     * 
     * @return parent
     */
    public org.mule.module.netsuite.api.internal.RecordRef getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this Location.
     * 
     * @param parent
     */
    public void setParent(org.mule.module.netsuite.api.internal.RecordRef parent) {
        this.parent = parent;
    }


    /**
     * Gets the includeChildren value for this Location.
     * 
     * @return includeChildren
     */
    public java.lang.Boolean getIncludeChildren() {
        return includeChildren;
    }


    /**
     * Sets the includeChildren value for this Location.
     * 
     * @param includeChildren
     */
    public void setIncludeChildren(java.lang.Boolean includeChildren) {
        this.includeChildren = includeChildren;
    }


    /**
     * Gets the subsidiaryList value for this Location.
     * 
     * @return subsidiaryList
     */
    public org.mule.module.netsuite.api.internal.RecordRefList getSubsidiaryList() {
        return subsidiaryList;
    }


    /**
     * Sets the subsidiaryList value for this Location.
     * 
     * @param subsidiaryList
     */
    public void setSubsidiaryList(org.mule.module.netsuite.api.internal.RecordRefList subsidiaryList) {
        this.subsidiaryList = subsidiaryList;
    }


    /**
     * Gets the isInactive value for this Location.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this Location.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the tranPrefix value for this Location.
     * 
     * @return tranPrefix
     */
    public java.lang.String getTranPrefix() {
        return tranPrefix;
    }


    /**
     * Sets the tranPrefix value for this Location.
     * 
     * @param tranPrefix
     */
    public void setTranPrefix(java.lang.String tranPrefix) {
        this.tranPrefix = tranPrefix;
    }


    /**
     * Gets the attention value for this Location.
     * 
     * @return attention
     */
    public java.lang.String getAttention() {
        return attention;
    }


    /**
     * Sets the attention value for this Location.
     * 
     * @param attention
     */
    public void setAttention(java.lang.String attention) {
        this.attention = attention;
    }


    /**
     * Gets the addressee value for this Location.
     * 
     * @return addressee
     */
    public java.lang.String getAddressee() {
        return addressee;
    }


    /**
     * Sets the addressee value for this Location.
     * 
     * @param addressee
     */
    public void setAddressee(java.lang.String addressee) {
        this.addressee = addressee;
    }


    /**
     * Gets the addrPhone value for this Location.
     * 
     * @return addrPhone
     */
    public java.lang.String getAddrPhone() {
        return addrPhone;
    }


    /**
     * Sets the addrPhone value for this Location.
     * 
     * @param addrPhone
     */
    public void setAddrPhone(java.lang.String addrPhone) {
        this.addrPhone = addrPhone;
    }


    /**
     * Gets the addr1 value for this Location.
     * 
     * @return addr1
     */
    public java.lang.String getAddr1() {
        return addr1;
    }


    /**
     * Sets the addr1 value for this Location.
     * 
     * @param addr1
     */
    public void setAddr1(java.lang.String addr1) {
        this.addr1 = addr1;
    }


    /**
     * Gets the addr2 value for this Location.
     * 
     * @return addr2
     */
    public java.lang.String getAddr2() {
        return addr2;
    }


    /**
     * Sets the addr2 value for this Location.
     * 
     * @param addr2
     */
    public void setAddr2(java.lang.String addr2) {
        this.addr2 = addr2;
    }


    /**
     * Gets the addr3 value for this Location.
     * 
     * @return addr3
     */
    public java.lang.String getAddr3() {
        return addr3;
    }


    /**
     * Sets the addr3 value for this Location.
     * 
     * @param addr3
     */
    public void setAddr3(java.lang.String addr3) {
        this.addr3 = addr3;
    }


    /**
     * Gets the city value for this Location.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Location.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this Location.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Location.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the zip value for this Location.
     * 
     * @return zip
     */
    public java.lang.String getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this Location.
     * 
     * @param zip
     */
    public void setZip(java.lang.String zip) {
        this.zip = zip;
    }


    /**
     * Gets the country value for this Location.
     * 
     * @return country
     */
    public org.mule.module.netsuite.api.internal.Country getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Location.
     * 
     * @param country
     */
    public void setCountry(org.mule.module.netsuite.api.internal.Country country) {
        this.country = country;
    }


    /**
     * Gets the addrText value for this Location.
     * 
     * @return addrText
     */
    public java.lang.String getAddrText() {
        return addrText;
    }


    /**
     * Sets the addrText value for this Location.
     * 
     * @param addrText
     */
    public void setAddrText(java.lang.String addrText) {
        this.addrText = addrText;
    }


    /**
     * Gets the override value for this Location.
     * 
     * @return override
     */
    public java.lang.Boolean getOverride() {
        return override;
    }


    /**
     * Sets the override value for this Location.
     * 
     * @param override
     */
    public void setOverride(java.lang.Boolean override) {
        this.override = override;
    }


    /**
     * Gets the logo value for this Location.
     * 
     * @return logo
     */
    public org.mule.module.netsuite.api.internal.RecordRef getLogo() {
        return logo;
    }


    /**
     * Sets the logo value for this Location.
     * 
     * @param logo
     */
    public void setLogo(org.mule.module.netsuite.api.internal.RecordRef logo) {
        this.logo = logo;
    }


    /**
     * Gets the makeInventoryAvailable value for this Location.
     * 
     * @return makeInventoryAvailable
     */
    public java.lang.Boolean getMakeInventoryAvailable() {
        return makeInventoryAvailable;
    }


    /**
     * Sets the makeInventoryAvailable value for this Location.
     * 
     * @param makeInventoryAvailable
     */
    public void setMakeInventoryAvailable(java.lang.Boolean makeInventoryAvailable) {
        this.makeInventoryAvailable = makeInventoryAvailable;
    }


    /**
     * Gets the makeInventoryAvailableStore value for this Location.
     * 
     * @return makeInventoryAvailableStore
     */
    public java.lang.Boolean getMakeInventoryAvailableStore() {
        return makeInventoryAvailableStore;
    }


    /**
     * Sets the makeInventoryAvailableStore value for this Location.
     * 
     * @param makeInventoryAvailableStore
     */
    public void setMakeInventoryAvailableStore(java.lang.Boolean makeInventoryAvailableStore) {
        this.makeInventoryAvailableStore = makeInventoryAvailableStore;
    }


    /**
     * Gets the classTranslationList value for this Location.
     * 
     * @return classTranslationList
     */
    public org.mule.module.netsuite.api.internal.ClassTranslationList getClassTranslationList() {
        return classTranslationList;
    }


    /**
     * Sets the classTranslationList value for this Location.
     * 
     * @param classTranslationList
     */
    public void setClassTranslationList(org.mule.module.netsuite.api.internal.ClassTranslationList classTranslationList) {
        this.classTranslationList = classTranslationList;
    }


    /**
     * Gets the customFieldList value for this Location.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this Location.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this Location.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Location.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Location.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Location.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Location)) return false;
        Location other = (Location) obj;
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
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.includeChildren==null && other.getIncludeChildren()==null) || 
             (this.includeChildren!=null &&
              this.includeChildren.equals(other.getIncludeChildren()))) &&
            ((this.subsidiaryList==null && other.getSubsidiaryList()==null) || 
             (this.subsidiaryList!=null &&
              this.subsidiaryList.equals(other.getSubsidiaryList()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.tranPrefix==null && other.getTranPrefix()==null) || 
             (this.tranPrefix!=null &&
              this.tranPrefix.equals(other.getTranPrefix()))) &&
            ((this.attention==null && other.getAttention()==null) || 
             (this.attention!=null &&
              this.attention.equals(other.getAttention()))) &&
            ((this.addressee==null && other.getAddressee()==null) || 
             (this.addressee!=null &&
              this.addressee.equals(other.getAddressee()))) &&
            ((this.addrPhone==null && other.getAddrPhone()==null) || 
             (this.addrPhone!=null &&
              this.addrPhone.equals(other.getAddrPhone()))) &&
            ((this.addr1==null && other.getAddr1()==null) || 
             (this.addr1!=null &&
              this.addr1.equals(other.getAddr1()))) &&
            ((this.addr2==null && other.getAddr2()==null) || 
             (this.addr2!=null &&
              this.addr2.equals(other.getAddr2()))) &&
            ((this.addr3==null && other.getAddr3()==null) || 
             (this.addr3!=null &&
              this.addr3.equals(other.getAddr3()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              this.zip.equals(other.getZip()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.addrText==null && other.getAddrText()==null) || 
             (this.addrText!=null &&
              this.addrText.equals(other.getAddrText()))) &&
            ((this.override==null && other.getOverride()==null) || 
             (this.override!=null &&
              this.override.equals(other.getOverride()))) &&
            ((this.logo==null && other.getLogo()==null) || 
             (this.logo!=null &&
              this.logo.equals(other.getLogo()))) &&
            ((this.makeInventoryAvailable==null && other.getMakeInventoryAvailable()==null) || 
             (this.makeInventoryAvailable!=null &&
              this.makeInventoryAvailable.equals(other.getMakeInventoryAvailable()))) &&
            ((this.makeInventoryAvailableStore==null && other.getMakeInventoryAvailableStore()==null) || 
             (this.makeInventoryAvailableStore!=null &&
              this.makeInventoryAvailableStore.equals(other.getMakeInventoryAvailableStore()))) &&
            ((this.classTranslationList==null && other.getClassTranslationList()==null) || 
             (this.classTranslationList!=null &&
              this.classTranslationList.equals(other.getClassTranslationList()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList()))) &&
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
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getIncludeChildren() != null) {
            _hashCode += getIncludeChildren().hashCode();
        }
        if (getSubsidiaryList() != null) {
            _hashCode += getSubsidiaryList().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getTranPrefix() != null) {
            _hashCode += getTranPrefix().hashCode();
        }
        if (getAttention() != null) {
            _hashCode += getAttention().hashCode();
        }
        if (getAddressee() != null) {
            _hashCode += getAddressee().hashCode();
        }
        if (getAddrPhone() != null) {
            _hashCode += getAddrPhone().hashCode();
        }
        if (getAddr1() != null) {
            _hashCode += getAddr1().hashCode();
        }
        if (getAddr2() != null) {
            _hashCode += getAddr2().hashCode();
        }
        if (getAddr3() != null) {
            _hashCode += getAddr3().hashCode();
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
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getAddrText() != null) {
            _hashCode += getAddrText().hashCode();
        }
        if (getOverride() != null) {
            _hashCode += getOverride().hashCode();
        }
        if (getLogo() != null) {
            _hashCode += getLogo().hashCode();
        }
        if (getMakeInventoryAvailable() != null) {
            _hashCode += getMakeInventoryAvailable().hashCode();
        }
        if (getMakeInventoryAvailableStore() != null) {
            _hashCode += getMakeInventoryAvailableStore().hashCode();
        }
        if (getClassTranslationList() != null) {
            _hashCode += getClassTranslationList().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
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
        new org.apache.axis.description.TypeDesc(Location.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "Location"));
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
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "parent"));
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
        elemField.setFieldName("subsidiaryList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "subsidiaryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRefList"));
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
        elemField.setFieldName("tranPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "tranPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attention");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "attention"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "addressee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addrPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "addrPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "addr1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "addr2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "addr3"));
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
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addrText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "addrText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("override");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "override"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "logo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makeInventoryAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "makeInventoryAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makeInventoryAvailableStore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "makeInventoryAvailableStore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classTranslationList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "classTranslationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ClassTranslationList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "CustomFieldList"));
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
