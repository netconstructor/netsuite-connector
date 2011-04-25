/**
 * UnitsTypeUom.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class UnitsTypeUom  implements java.io.Serializable {
    private java.lang.String internalId;

    private java.lang.String unitName;

    private java.lang.String pluralName;

    private java.lang.String abbreviation;

    private java.lang.String pluralAbbreviation;

    private java.lang.Double conversionRate;

    private java.lang.Boolean baseUnit;

    public UnitsTypeUom() {
    }

    public UnitsTypeUom(
           java.lang.String internalId,
           java.lang.String unitName,
           java.lang.String pluralName,
           java.lang.String abbreviation,
           java.lang.String pluralAbbreviation,
           java.lang.Double conversionRate,
           java.lang.Boolean baseUnit) {
           this.internalId = internalId;
           this.unitName = unitName;
           this.pluralName = pluralName;
           this.abbreviation = abbreviation;
           this.pluralAbbreviation = pluralAbbreviation;
           this.conversionRate = conversionRate;
           this.baseUnit = baseUnit;
    }


    /**
     * Gets the internalId value for this UnitsTypeUom.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this UnitsTypeUom.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the unitName value for this UnitsTypeUom.
     * 
     * @return unitName
     */
    public java.lang.String getUnitName() {
        return unitName;
    }


    /**
     * Sets the unitName value for this UnitsTypeUom.
     * 
     * @param unitName
     */
    public void setUnitName(java.lang.String unitName) {
        this.unitName = unitName;
    }


    /**
     * Gets the pluralName value for this UnitsTypeUom.
     * 
     * @return pluralName
     */
    public java.lang.String getPluralName() {
        return pluralName;
    }


    /**
     * Sets the pluralName value for this UnitsTypeUom.
     * 
     * @param pluralName
     */
    public void setPluralName(java.lang.String pluralName) {
        this.pluralName = pluralName;
    }


    /**
     * Gets the abbreviation value for this UnitsTypeUom.
     * 
     * @return abbreviation
     */
    public java.lang.String getAbbreviation() {
        return abbreviation;
    }


    /**
     * Sets the abbreviation value for this UnitsTypeUom.
     * 
     * @param abbreviation
     */
    public void setAbbreviation(java.lang.String abbreviation) {
        this.abbreviation = abbreviation;
    }


    /**
     * Gets the pluralAbbreviation value for this UnitsTypeUom.
     * 
     * @return pluralAbbreviation
     */
    public java.lang.String getPluralAbbreviation() {
        return pluralAbbreviation;
    }


    /**
     * Sets the pluralAbbreviation value for this UnitsTypeUom.
     * 
     * @param pluralAbbreviation
     */
    public void setPluralAbbreviation(java.lang.String pluralAbbreviation) {
        this.pluralAbbreviation = pluralAbbreviation;
    }


    /**
     * Gets the conversionRate value for this UnitsTypeUom.
     * 
     * @return conversionRate
     */
    public java.lang.Double getConversionRate() {
        return conversionRate;
    }


    /**
     * Sets the conversionRate value for this UnitsTypeUom.
     * 
     * @param conversionRate
     */
    public void setConversionRate(java.lang.Double conversionRate) {
        this.conversionRate = conversionRate;
    }


    /**
     * Gets the baseUnit value for this UnitsTypeUom.
     * 
     * @return baseUnit
     */
    public java.lang.Boolean getBaseUnit() {
        return baseUnit;
    }


    /**
     * Sets the baseUnit value for this UnitsTypeUom.
     * 
     * @param baseUnit
     */
    public void setBaseUnit(java.lang.Boolean baseUnit) {
        this.baseUnit = baseUnit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnitsTypeUom)) return false;
        UnitsTypeUom other = (UnitsTypeUom) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.unitName==null && other.getUnitName()==null) || 
             (this.unitName!=null &&
              this.unitName.equals(other.getUnitName()))) &&
            ((this.pluralName==null && other.getPluralName()==null) || 
             (this.pluralName!=null &&
              this.pluralName.equals(other.getPluralName()))) &&
            ((this.abbreviation==null && other.getAbbreviation()==null) || 
             (this.abbreviation!=null &&
              this.abbreviation.equals(other.getAbbreviation()))) &&
            ((this.pluralAbbreviation==null && other.getPluralAbbreviation()==null) || 
             (this.pluralAbbreviation!=null &&
              this.pluralAbbreviation.equals(other.getPluralAbbreviation()))) &&
            ((this.conversionRate==null && other.getConversionRate()==null) || 
             (this.conversionRate!=null &&
              this.conversionRate.equals(other.getConversionRate()))) &&
            ((this.baseUnit==null && other.getBaseUnit()==null) || 
             (this.baseUnit!=null &&
              this.baseUnit.equals(other.getBaseUnit())));
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
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getUnitName() != null) {
            _hashCode += getUnitName().hashCode();
        }
        if (getPluralName() != null) {
            _hashCode += getPluralName().hashCode();
        }
        if (getAbbreviation() != null) {
            _hashCode += getAbbreviation().hashCode();
        }
        if (getPluralAbbreviation() != null) {
            _hashCode += getPluralAbbreviation().hashCode();
        }
        if (getConversionRate() != null) {
            _hashCode += getConversionRate().hashCode();
        }
        if (getBaseUnit() != null) {
            _hashCode += getBaseUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnitsTypeUom.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "UnitsTypeUom"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "unitName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pluralName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "pluralName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abbreviation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "abbreviation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pluralAbbreviation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "pluralAbbreviation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "conversionRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "baseUnit"));
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
