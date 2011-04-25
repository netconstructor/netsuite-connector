/**
 * UnitsTypeSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class UnitsTypeSearchRowBasic  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] abbreviation;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] baseUnit;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] conversionRate;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] externalId;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInActive;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] name;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] pluralAbbreviation;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] pluralName;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] unitName;

    public UnitsTypeSearchRowBasic() {
    }

    public UnitsTypeSearchRowBasic(
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] abbreviation,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] baseUnit,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] conversionRate,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] externalId,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInActive,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] name,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] pluralAbbreviation,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] pluralName,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] unitName) {
           this.abbreviation = abbreviation;
           this.baseUnit = baseUnit;
           this.conversionRate = conversionRate;
           this.externalId = externalId;
           this.internalId = internalId;
           this.isInActive = isInActive;
           this.name = name;
           this.pluralAbbreviation = pluralAbbreviation;
           this.pluralName = pluralName;
           this.unitName = unitName;
    }


    /**
     * Gets the abbreviation value for this UnitsTypeSearchRowBasic.
     * 
     * @return abbreviation
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAbbreviation() {
        return abbreviation;
    }


    /**
     * Sets the abbreviation value for this UnitsTypeSearchRowBasic.
     * 
     * @param abbreviation
     */
    public void setAbbreviation(org.mule.module.netsuite.api.internal.SearchColumnStringField[] abbreviation) {
        this.abbreviation = abbreviation;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getAbbreviation(int i) {
        return this.abbreviation[i];
    }

    public void setAbbreviation(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.abbreviation[i] = _value;
    }


    /**
     * Gets the baseUnit value for this UnitsTypeSearchRowBasic.
     * 
     * @return baseUnit
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getBaseUnit() {
        return baseUnit;
    }


    /**
     * Sets the baseUnit value for this UnitsTypeSearchRowBasic.
     * 
     * @param baseUnit
     */
    public void setBaseUnit(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] baseUnit) {
        this.baseUnit = baseUnit;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getBaseUnit(int i) {
        return this.baseUnit[i];
    }

    public void setBaseUnit(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.baseUnit[i] = _value;
    }


    /**
     * Gets the conversionRate value for this UnitsTypeSearchRowBasic.
     * 
     * @return conversionRate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getConversionRate() {
        return conversionRate;
    }


    /**
     * Sets the conversionRate value for this UnitsTypeSearchRowBasic.
     * 
     * @param conversionRate
     */
    public void setConversionRate(org.mule.module.netsuite.api.internal.SearchColumnStringField[] conversionRate) {
        this.conversionRate = conversionRate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getConversionRate(int i) {
        return this.conversionRate[i];
    }

    public void setConversionRate(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.conversionRate[i] = _value;
    }


    /**
     * Gets the externalId value for this UnitsTypeSearchRowBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this UnitsTypeSearchRowBasic.
     * 
     * @param externalId
     */
    public void setExternalId(org.mule.module.netsuite.api.internal.SearchColumnStringField[] externalId) {
        this.externalId = externalId;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.externalId[i] = _value;
    }


    /**
     * Gets the internalId value for this UnitsTypeSearchRowBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this UnitsTypeSearchRowBasic.
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
     * Gets the isInActive value for this UnitsTypeSearchRowBasic.
     * 
     * @return isInActive
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsInActive() {
        return isInActive;
    }


    /**
     * Sets the isInActive value for this UnitsTypeSearchRowBasic.
     * 
     * @param isInActive
     */
    public void setIsInActive(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInActive) {
        this.isInActive = isInActive;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsInActive(int i) {
        return this.isInActive[i];
    }

    public void setIsInActive(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isInActive[i] = _value;
    }


    /**
     * Gets the name value for this UnitsTypeSearchRowBasic.
     * 
     * @return name
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this UnitsTypeSearchRowBasic.
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


    /**
     * Gets the pluralAbbreviation value for this UnitsTypeSearchRowBasic.
     * 
     * @return pluralAbbreviation
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPluralAbbreviation() {
        return pluralAbbreviation;
    }


    /**
     * Sets the pluralAbbreviation value for this UnitsTypeSearchRowBasic.
     * 
     * @param pluralAbbreviation
     */
    public void setPluralAbbreviation(org.mule.module.netsuite.api.internal.SearchColumnStringField[] pluralAbbreviation) {
        this.pluralAbbreviation = pluralAbbreviation;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPluralAbbreviation(int i) {
        return this.pluralAbbreviation[i];
    }

    public void setPluralAbbreviation(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.pluralAbbreviation[i] = _value;
    }


    /**
     * Gets the pluralName value for this UnitsTypeSearchRowBasic.
     * 
     * @return pluralName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPluralName() {
        return pluralName;
    }


    /**
     * Sets the pluralName value for this UnitsTypeSearchRowBasic.
     * 
     * @param pluralName
     */
    public void setPluralName(org.mule.module.netsuite.api.internal.SearchColumnStringField[] pluralName) {
        this.pluralName = pluralName;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPluralName(int i) {
        return this.pluralName[i];
    }

    public void setPluralName(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.pluralName[i] = _value;
    }


    /**
     * Gets the unitName value for this UnitsTypeSearchRowBasic.
     * 
     * @return unitName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getUnitName() {
        return unitName;
    }


    /**
     * Sets the unitName value for this UnitsTypeSearchRowBasic.
     * 
     * @param unitName
     */
    public void setUnitName(org.mule.module.netsuite.api.internal.SearchColumnStringField[] unitName) {
        this.unitName = unitName;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getUnitName(int i) {
        return this.unitName[i];
    }

    public void setUnitName(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.unitName[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnitsTypeSearchRowBasic)) return false;
        UnitsTypeSearchRowBasic other = (UnitsTypeSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.abbreviation==null && other.getAbbreviation()==null) || 
             (this.abbreviation!=null &&
              java.util.Arrays.equals(this.abbreviation, other.getAbbreviation()))) &&
            ((this.baseUnit==null && other.getBaseUnit()==null) || 
             (this.baseUnit!=null &&
              java.util.Arrays.equals(this.baseUnit, other.getBaseUnit()))) &&
            ((this.conversionRate==null && other.getConversionRate()==null) || 
             (this.conversionRate!=null &&
              java.util.Arrays.equals(this.conversionRate, other.getConversionRate()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isInActive==null && other.getIsInActive()==null) || 
             (this.isInActive!=null &&
              java.util.Arrays.equals(this.isInActive, other.getIsInActive()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.pluralAbbreviation==null && other.getPluralAbbreviation()==null) || 
             (this.pluralAbbreviation!=null &&
              java.util.Arrays.equals(this.pluralAbbreviation, other.getPluralAbbreviation()))) &&
            ((this.pluralName==null && other.getPluralName()==null) || 
             (this.pluralName!=null &&
              java.util.Arrays.equals(this.pluralName, other.getPluralName()))) &&
            ((this.unitName==null && other.getUnitName()==null) || 
             (this.unitName!=null &&
              java.util.Arrays.equals(this.unitName, other.getUnitName())));
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
        if (getAbbreviation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAbbreviation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAbbreviation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBaseUnit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBaseUnit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBaseUnit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConversionRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConversionRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConversionRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalId(), i);
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
        if (getIsInActive() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsInActive());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsInActive(), i);
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
        if (getPluralAbbreviation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPluralAbbreviation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPluralAbbreviation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPluralName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPluralName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPluralName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnitName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnitName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnitName(), i);
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
        new org.apache.axis.description.TypeDesc(UnitsTypeSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "UnitsTypeSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abbreviation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "abbreviation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "baseUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "conversionRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("isInActive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isInActive"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pluralAbbreviation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "pluralAbbreviation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pluralName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "pluralName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "unitName"));
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
