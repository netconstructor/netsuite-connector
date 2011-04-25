/**
 * LocationSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class LocationSearchBasic  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchStringField address;

    private org.mule.module.netsuite.api.internal.SearchStringField city;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField country;

    private org.mule.module.netsuite.api.internal.SearchStringField county;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId;

    private org.mule.module.netsuite.api.internal.SearchStringField externalIdString;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId;

    private org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isInactive;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isOffice;

    private org.mule.module.netsuite.api.internal.SearchBooleanField makeInventoryAvailable;

    private org.mule.module.netsuite.api.internal.SearchBooleanField makeInventoryAvailableStore;

    private org.mule.module.netsuite.api.internal.SearchStringField name;

    private org.mule.module.netsuite.api.internal.SearchStringField nameNoHierarchy;

    private org.mule.module.netsuite.api.internal.SearchStringField phone;

    private org.mule.module.netsuite.api.internal.SearchStringField state;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary;

    private org.mule.module.netsuite.api.internal.SearchStringField tranprefix;

    private org.mule.module.netsuite.api.internal.SearchStringField zip;

    private org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList;

    public LocationSearchBasic() {
    }

    public LocationSearchBasic(
           org.mule.module.netsuite.api.internal.SearchStringField address,
           org.mule.module.netsuite.api.internal.SearchStringField city,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField country,
           org.mule.module.netsuite.api.internal.SearchStringField county,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId,
           org.mule.module.netsuite.api.internal.SearchStringField externalIdString,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId,
           org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber,
           org.mule.module.netsuite.api.internal.SearchBooleanField isInactive,
           org.mule.module.netsuite.api.internal.SearchBooleanField isOffice,
           org.mule.module.netsuite.api.internal.SearchBooleanField makeInventoryAvailable,
           org.mule.module.netsuite.api.internal.SearchBooleanField makeInventoryAvailableStore,
           org.mule.module.netsuite.api.internal.SearchStringField name,
           org.mule.module.netsuite.api.internal.SearchStringField nameNoHierarchy,
           org.mule.module.netsuite.api.internal.SearchStringField phone,
           org.mule.module.netsuite.api.internal.SearchStringField state,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary,
           org.mule.module.netsuite.api.internal.SearchStringField tranprefix,
           org.mule.module.netsuite.api.internal.SearchStringField zip,
           org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.address = address;
        this.city = city;
        this.country = country;
        this.county = county;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.isOffice = isOffice;
        this.makeInventoryAvailable = makeInventoryAvailable;
        this.makeInventoryAvailableStore = makeInventoryAvailableStore;
        this.name = name;
        this.nameNoHierarchy = nameNoHierarchy;
        this.phone = phone;
        this.state = state;
        this.subsidiary = subsidiary;
        this.tranprefix = tranprefix;
        this.zip = zip;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the address value for this LocationSearchBasic.
     * 
     * @return address
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAddress() {
        return address;
    }


    /**
     * Sets the address value for this LocationSearchBasic.
     * 
     * @param address
     */
    public void setAddress(org.mule.module.netsuite.api.internal.SearchStringField address) {
        this.address = address;
    }


    /**
     * Gets the city value for this LocationSearchBasic.
     * 
     * @return city
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getCity() {
        return city;
    }


    /**
     * Sets the city value for this LocationSearchBasic.
     * 
     * @param city
     */
    public void setCity(org.mule.module.netsuite.api.internal.SearchStringField city) {
        this.city = city;
    }


    /**
     * Gets the country value for this LocationSearchBasic.
     * 
     * @return country
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getCountry() {
        return country;
    }


    /**
     * Sets the country value for this LocationSearchBasic.
     * 
     * @param country
     */
    public void setCountry(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField country) {
        this.country = country;
    }


    /**
     * Gets the county value for this LocationSearchBasic.
     * 
     * @return county
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getCounty() {
        return county;
    }


    /**
     * Sets the county value for this LocationSearchBasic.
     * 
     * @param county
     */
    public void setCounty(org.mule.module.netsuite.api.internal.SearchStringField county) {
        this.county = county;
    }


    /**
     * Gets the externalId value for this LocationSearchBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this LocationSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this LocationSearchBasic.
     * 
     * @return externalIdString
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this LocationSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(org.mule.module.netsuite.api.internal.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the internalId value for this LocationSearchBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this LocationSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this LocationSearchBasic.
     * 
     * @return internalIdNumber
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this LocationSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isInactive value for this LocationSearchBasic.
     * 
     * @return isInactive
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this LocationSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(org.mule.module.netsuite.api.internal.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the isOffice value for this LocationSearchBasic.
     * 
     * @return isOffice
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsOffice() {
        return isOffice;
    }


    /**
     * Sets the isOffice value for this LocationSearchBasic.
     * 
     * @param isOffice
     */
    public void setIsOffice(org.mule.module.netsuite.api.internal.SearchBooleanField isOffice) {
        this.isOffice = isOffice;
    }


    /**
     * Gets the makeInventoryAvailable value for this LocationSearchBasic.
     * 
     * @return makeInventoryAvailable
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getMakeInventoryAvailable() {
        return makeInventoryAvailable;
    }


    /**
     * Sets the makeInventoryAvailable value for this LocationSearchBasic.
     * 
     * @param makeInventoryAvailable
     */
    public void setMakeInventoryAvailable(org.mule.module.netsuite.api.internal.SearchBooleanField makeInventoryAvailable) {
        this.makeInventoryAvailable = makeInventoryAvailable;
    }


    /**
     * Gets the makeInventoryAvailableStore value for this LocationSearchBasic.
     * 
     * @return makeInventoryAvailableStore
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getMakeInventoryAvailableStore() {
        return makeInventoryAvailableStore;
    }


    /**
     * Sets the makeInventoryAvailableStore value for this LocationSearchBasic.
     * 
     * @param makeInventoryAvailableStore
     */
    public void setMakeInventoryAvailableStore(org.mule.module.netsuite.api.internal.SearchBooleanField makeInventoryAvailableStore) {
        this.makeInventoryAvailableStore = makeInventoryAvailableStore;
    }


    /**
     * Gets the name value for this LocationSearchBasic.
     * 
     * @return name
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getName() {
        return name;
    }


    /**
     * Sets the name value for this LocationSearchBasic.
     * 
     * @param name
     */
    public void setName(org.mule.module.netsuite.api.internal.SearchStringField name) {
        this.name = name;
    }


    /**
     * Gets the nameNoHierarchy value for this LocationSearchBasic.
     * 
     * @return nameNoHierarchy
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getNameNoHierarchy() {
        return nameNoHierarchy;
    }


    /**
     * Sets the nameNoHierarchy value for this LocationSearchBasic.
     * 
     * @param nameNoHierarchy
     */
    public void setNameNoHierarchy(org.mule.module.netsuite.api.internal.SearchStringField nameNoHierarchy) {
        this.nameNoHierarchy = nameNoHierarchy;
    }


    /**
     * Gets the phone value for this LocationSearchBasic.
     * 
     * @return phone
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this LocationSearchBasic.
     * 
     * @param phone
     */
    public void setPhone(org.mule.module.netsuite.api.internal.SearchStringField phone) {
        this.phone = phone;
    }


    /**
     * Gets the state value for this LocationSearchBasic.
     * 
     * @return state
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getState() {
        return state;
    }


    /**
     * Sets the state value for this LocationSearchBasic.
     * 
     * @param state
     */
    public void setState(org.mule.module.netsuite.api.internal.SearchStringField state) {
        this.state = state;
    }


    /**
     * Gets the subsidiary value for this LocationSearchBasic.
     * 
     * @return subsidiary
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this LocationSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the tranprefix value for this LocationSearchBasic.
     * 
     * @return tranprefix
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getTranprefix() {
        return tranprefix;
    }


    /**
     * Sets the tranprefix value for this LocationSearchBasic.
     * 
     * @param tranprefix
     */
    public void setTranprefix(org.mule.module.netsuite.api.internal.SearchStringField tranprefix) {
        this.tranprefix = tranprefix;
    }


    /**
     * Gets the zip value for this LocationSearchBasic.
     * 
     * @return zip
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this LocationSearchBasic.
     * 
     * @param zip
     */
    public void setZip(org.mule.module.netsuite.api.internal.SearchStringField zip) {
        this.zip = zip;
    }


    /**
     * Gets the customFieldList value for this LocationSearchBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this LocationSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationSearchBasic)) return false;
        LocationSearchBasic other = (LocationSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.isOffice==null && other.getIsOffice()==null) || 
             (this.isOffice!=null &&
              this.isOffice.equals(other.getIsOffice()))) &&
            ((this.makeInventoryAvailable==null && other.getMakeInventoryAvailable()==null) || 
             (this.makeInventoryAvailable!=null &&
              this.makeInventoryAvailable.equals(other.getMakeInventoryAvailable()))) &&
            ((this.makeInventoryAvailableStore==null && other.getMakeInventoryAvailableStore()==null) || 
             (this.makeInventoryAvailableStore!=null &&
              this.makeInventoryAvailableStore.equals(other.getMakeInventoryAvailableStore()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.nameNoHierarchy==null && other.getNameNoHierarchy()==null) || 
             (this.nameNoHierarchy!=null &&
              this.nameNoHierarchy.equals(other.getNameNoHierarchy()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.tranprefix==null && other.getTranprefix()==null) || 
             (this.tranprefix!=null &&
              this.tranprefix.equals(other.getTranprefix()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              this.zip.equals(other.getZip()))) &&
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getIsOffice() != null) {
            _hashCode += getIsOffice().hashCode();
        }
        if (getMakeInventoryAvailable() != null) {
            _hashCode += getMakeInventoryAvailable().hashCode();
        }
        if (getMakeInventoryAvailableStore() != null) {
            _hashCode += getMakeInventoryAvailableStore().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNameNoHierarchy() != null) {
            _hashCode += getNameNoHierarchy().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getTranprefix() != null) {
            _hashCode += getTranprefix().hashCode();
        }
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocationSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "LocationSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "county"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOffice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isOffice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makeInventoryAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "makeInventoryAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makeInventoryAvailableStore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "makeInventoryAvailableStore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("nameNoHierarchy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "nameNoHierarchy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranprefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranprefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "zip"));
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
