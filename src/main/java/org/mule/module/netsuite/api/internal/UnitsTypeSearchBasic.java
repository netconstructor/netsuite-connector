/**
 * UnitsTypeSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class UnitsTypeSearchBasic  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchStringField abbreviation;

    private org.mule.module.netsuite.api.internal.SearchBooleanField baseUnit;

    private org.mule.module.netsuite.api.internal.SearchStringField conversionRate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId;

    private org.mule.module.netsuite.api.internal.SearchStringField externalIdString;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId;

    private org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isInActive;

    private org.mule.module.netsuite.api.internal.SearchStringField name;

    private org.mule.module.netsuite.api.internal.SearchStringField pluralAbbreviation;

    private org.mule.module.netsuite.api.internal.SearchStringField pluralName;

    private org.mule.module.netsuite.api.internal.SearchStringField unitName;

    public UnitsTypeSearchBasic() {
    }

    public UnitsTypeSearchBasic(
           org.mule.module.netsuite.api.internal.SearchStringField abbreviation,
           org.mule.module.netsuite.api.internal.SearchBooleanField baseUnit,
           org.mule.module.netsuite.api.internal.SearchStringField conversionRate,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId,
           org.mule.module.netsuite.api.internal.SearchStringField externalIdString,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId,
           org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber,
           org.mule.module.netsuite.api.internal.SearchBooleanField isInActive,
           org.mule.module.netsuite.api.internal.SearchStringField name,
           org.mule.module.netsuite.api.internal.SearchStringField pluralAbbreviation,
           org.mule.module.netsuite.api.internal.SearchStringField pluralName,
           org.mule.module.netsuite.api.internal.SearchStringField unitName) {
        this.abbreviation = abbreviation;
        this.baseUnit = baseUnit;
        this.conversionRate = conversionRate;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInActive = isInActive;
        this.name = name;
        this.pluralAbbreviation = pluralAbbreviation;
        this.pluralName = pluralName;
        this.unitName = unitName;
    }


    /**
     * Gets the abbreviation value for this UnitsTypeSearchBasic.
     * 
     * @return abbreviation
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAbbreviation() {
        return abbreviation;
    }


    /**
     * Sets the abbreviation value for this UnitsTypeSearchBasic.
     * 
     * @param abbreviation
     */
    public void setAbbreviation(org.mule.module.netsuite.api.internal.SearchStringField abbreviation) {
        this.abbreviation = abbreviation;
    }


    /**
     * Gets the baseUnit value for this UnitsTypeSearchBasic.
     * 
     * @return baseUnit
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getBaseUnit() {
        return baseUnit;
    }


    /**
     * Sets the baseUnit value for this UnitsTypeSearchBasic.
     * 
     * @param baseUnit
     */
    public void setBaseUnit(org.mule.module.netsuite.api.internal.SearchBooleanField baseUnit) {
        this.baseUnit = baseUnit;
    }


    /**
     * Gets the conversionRate value for this UnitsTypeSearchBasic.
     * 
     * @return conversionRate
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getConversionRate() {
        return conversionRate;
    }


    /**
     * Sets the conversionRate value for this UnitsTypeSearchBasic.
     * 
     * @param conversionRate
     */
    public void setConversionRate(org.mule.module.netsuite.api.internal.SearchStringField conversionRate) {
        this.conversionRate = conversionRate;
    }


    /**
     * Gets the externalId value for this UnitsTypeSearchBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this UnitsTypeSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this UnitsTypeSearchBasic.
     * 
     * @return externalIdString
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this UnitsTypeSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(org.mule.module.netsuite.api.internal.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the internalId value for this UnitsTypeSearchBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this UnitsTypeSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this UnitsTypeSearchBasic.
     * 
     * @return internalIdNumber
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this UnitsTypeSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isInActive value for this UnitsTypeSearchBasic.
     * 
     * @return isInActive
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsInActive() {
        return isInActive;
    }


    /**
     * Sets the isInActive value for this UnitsTypeSearchBasic.
     * 
     * @param isInActive
     */
    public void setIsInActive(org.mule.module.netsuite.api.internal.SearchBooleanField isInActive) {
        this.isInActive = isInActive;
    }


    /**
     * Gets the name value for this UnitsTypeSearchBasic.
     * 
     * @return name
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getName() {
        return name;
    }


    /**
     * Sets the name value for this UnitsTypeSearchBasic.
     * 
     * @param name
     */
    public void setName(org.mule.module.netsuite.api.internal.SearchStringField name) {
        this.name = name;
    }


    /**
     * Gets the pluralAbbreviation value for this UnitsTypeSearchBasic.
     * 
     * @return pluralAbbreviation
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getPluralAbbreviation() {
        return pluralAbbreviation;
    }


    /**
     * Sets the pluralAbbreviation value for this UnitsTypeSearchBasic.
     * 
     * @param pluralAbbreviation
     */
    public void setPluralAbbreviation(org.mule.module.netsuite.api.internal.SearchStringField pluralAbbreviation) {
        this.pluralAbbreviation = pluralAbbreviation;
    }


    /**
     * Gets the pluralName value for this UnitsTypeSearchBasic.
     * 
     * @return pluralName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getPluralName() {
        return pluralName;
    }


    /**
     * Sets the pluralName value for this UnitsTypeSearchBasic.
     * 
     * @param pluralName
     */
    public void setPluralName(org.mule.module.netsuite.api.internal.SearchStringField pluralName) {
        this.pluralName = pluralName;
    }


    /**
     * Gets the unitName value for this UnitsTypeSearchBasic.
     * 
     * @return unitName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getUnitName() {
        return unitName;
    }


    /**
     * Sets the unitName value for this UnitsTypeSearchBasic.
     * 
     * @param unitName
     */
    public void setUnitName(org.mule.module.netsuite.api.internal.SearchStringField unitName) {
        this.unitName = unitName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnitsTypeSearchBasic)) return false;
        UnitsTypeSearchBasic other = (UnitsTypeSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.abbreviation==null && other.getAbbreviation()==null) || 
             (this.abbreviation!=null &&
              this.abbreviation.equals(other.getAbbreviation()))) &&
            ((this.baseUnit==null && other.getBaseUnit()==null) || 
             (this.baseUnit!=null &&
              this.baseUnit.equals(other.getBaseUnit()))) &&
            ((this.conversionRate==null && other.getConversionRate()==null) || 
             (this.conversionRate!=null &&
              this.conversionRate.equals(other.getConversionRate()))) &&
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
            ((this.isInActive==null && other.getIsInActive()==null) || 
             (this.isInActive!=null &&
              this.isInActive.equals(other.getIsInActive()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.pluralAbbreviation==null && other.getPluralAbbreviation()==null) || 
             (this.pluralAbbreviation!=null &&
              this.pluralAbbreviation.equals(other.getPluralAbbreviation()))) &&
            ((this.pluralName==null && other.getPluralName()==null) || 
             (this.pluralName!=null &&
              this.pluralName.equals(other.getPluralName()))) &&
            ((this.unitName==null && other.getUnitName()==null) || 
             (this.unitName!=null &&
              this.unitName.equals(other.getUnitName())));
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
        if (getAbbreviation() != null) {
            _hashCode += getAbbreviation().hashCode();
        }
        if (getBaseUnit() != null) {
            _hashCode += getBaseUnit().hashCode();
        }
        if (getConversionRate() != null) {
            _hashCode += getConversionRate().hashCode();
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
        if (getIsInActive() != null) {
            _hashCode += getIsInActive().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPluralAbbreviation() != null) {
            _hashCode += getPluralAbbreviation().hashCode();
        }
        if (getPluralName() != null) {
            _hashCode += getPluralName().hashCode();
        }
        if (getUnitName() != null) {
            _hashCode += getUnitName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnitsTypeSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "UnitsTypeSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abbreviation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "abbreviation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "baseUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "conversionRate"));
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
        elemField.setFieldName("isInActive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isInActive"));
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
        elemField.setFieldName("pluralAbbreviation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "pluralAbbreviation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pluralName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "pluralName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "unitName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
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
