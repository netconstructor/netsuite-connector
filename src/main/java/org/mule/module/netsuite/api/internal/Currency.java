/**
 * Currency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class Currency  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String symbol;

    private java.lang.Boolean isBaseCurrency;

    private java.lang.Boolean isInactive;

    private org.mule.module.netsuite.api.internal.CurrencyLocale locale;

    private java.lang.String formatSample;

    private java.lang.Double exchangeRate;

    private org.mule.module.netsuite.api.internal.CurrencyFxRateUpdateTimezone fxRateUpdateTimezone;

    private java.lang.Boolean inclInFxRateUpdates;

    private org.mule.module.netsuite.api.internal.CurrencyCurrencyPrecision currencyPrecision;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Currency() {
    }

    public Currency(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.lang.String name,
           java.lang.String symbol,
           java.lang.Boolean isBaseCurrency,
           java.lang.Boolean isInactive,
           org.mule.module.netsuite.api.internal.CurrencyLocale locale,
           java.lang.String formatSample,
           java.lang.Double exchangeRate,
           org.mule.module.netsuite.api.internal.CurrencyFxRateUpdateTimezone fxRateUpdateTimezone,
           java.lang.Boolean inclInFxRateUpdates,
           org.mule.module.netsuite.api.internal.CurrencyCurrencyPrecision currencyPrecision) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.name = name;
        this.symbol = symbol;
        this.isBaseCurrency = isBaseCurrency;
        this.isInactive = isInactive;
        this.locale = locale;
        this.formatSample = formatSample;
        this.exchangeRate = exchangeRate;
        this.fxRateUpdateTimezone = fxRateUpdateTimezone;
        this.inclInFxRateUpdates = inclInFxRateUpdates;
        this.currencyPrecision = currencyPrecision;
    }


    /**
     * Gets the name value for this Currency.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Currency.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the symbol value for this Currency.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this Currency.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the isBaseCurrency value for this Currency.
     * 
     * @return isBaseCurrency
     */
    public java.lang.Boolean getIsBaseCurrency() {
        return isBaseCurrency;
    }


    /**
     * Sets the isBaseCurrency value for this Currency.
     * 
     * @param isBaseCurrency
     */
    public void setIsBaseCurrency(java.lang.Boolean isBaseCurrency) {
        this.isBaseCurrency = isBaseCurrency;
    }


    /**
     * Gets the isInactive value for this Currency.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this Currency.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the locale value for this Currency.
     * 
     * @return locale
     */
    public org.mule.module.netsuite.api.internal.CurrencyLocale getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this Currency.
     * 
     * @param locale
     */
    public void setLocale(org.mule.module.netsuite.api.internal.CurrencyLocale locale) {
        this.locale = locale;
    }


    /**
     * Gets the formatSample value for this Currency.
     * 
     * @return formatSample
     */
    public java.lang.String getFormatSample() {
        return formatSample;
    }


    /**
     * Sets the formatSample value for this Currency.
     * 
     * @param formatSample
     */
    public void setFormatSample(java.lang.String formatSample) {
        this.formatSample = formatSample;
    }


    /**
     * Gets the exchangeRate value for this Currency.
     * 
     * @return exchangeRate
     */
    public java.lang.Double getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this Currency.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.lang.Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the fxRateUpdateTimezone value for this Currency.
     * 
     * @return fxRateUpdateTimezone
     */
    public org.mule.module.netsuite.api.internal.CurrencyFxRateUpdateTimezone getFxRateUpdateTimezone() {
        return fxRateUpdateTimezone;
    }


    /**
     * Sets the fxRateUpdateTimezone value for this Currency.
     * 
     * @param fxRateUpdateTimezone
     */
    public void setFxRateUpdateTimezone(org.mule.module.netsuite.api.internal.CurrencyFxRateUpdateTimezone fxRateUpdateTimezone) {
        this.fxRateUpdateTimezone = fxRateUpdateTimezone;
    }


    /**
     * Gets the inclInFxRateUpdates value for this Currency.
     * 
     * @return inclInFxRateUpdates
     */
    public java.lang.Boolean getInclInFxRateUpdates() {
        return inclInFxRateUpdates;
    }


    /**
     * Sets the inclInFxRateUpdates value for this Currency.
     * 
     * @param inclInFxRateUpdates
     */
    public void setInclInFxRateUpdates(java.lang.Boolean inclInFxRateUpdates) {
        this.inclInFxRateUpdates = inclInFxRateUpdates;
    }


    /**
     * Gets the currencyPrecision value for this Currency.
     * 
     * @return currencyPrecision
     */
    public org.mule.module.netsuite.api.internal.CurrencyCurrencyPrecision getCurrencyPrecision() {
        return currencyPrecision;
    }


    /**
     * Sets the currencyPrecision value for this Currency.
     * 
     * @param currencyPrecision
     */
    public void setCurrencyPrecision(org.mule.module.netsuite.api.internal.CurrencyCurrencyPrecision currencyPrecision) {
        this.currencyPrecision = currencyPrecision;
    }


    /**
     * Gets the internalId value for this Currency.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Currency.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Currency.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Currency.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Currency)) return false;
        Currency other = (Currency) obj;
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
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol()))) &&
            ((this.isBaseCurrency==null && other.getIsBaseCurrency()==null) || 
             (this.isBaseCurrency!=null &&
              this.isBaseCurrency.equals(other.getIsBaseCurrency()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            ((this.formatSample==null && other.getFormatSample()==null) || 
             (this.formatSample!=null &&
              this.formatSample.equals(other.getFormatSample()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.fxRateUpdateTimezone==null && other.getFxRateUpdateTimezone()==null) || 
             (this.fxRateUpdateTimezone!=null &&
              this.fxRateUpdateTimezone.equals(other.getFxRateUpdateTimezone()))) &&
            ((this.inclInFxRateUpdates==null && other.getInclInFxRateUpdates()==null) || 
             (this.inclInFxRateUpdates!=null &&
              this.inclInFxRateUpdates.equals(other.getInclInFxRateUpdates()))) &&
            ((this.currencyPrecision==null && other.getCurrencyPrecision()==null) || 
             (this.currencyPrecision!=null &&
              this.currencyPrecision.equals(other.getCurrencyPrecision()))) &&
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
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        if (getIsBaseCurrency() != null) {
            _hashCode += getIsBaseCurrency().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        if (getFormatSample() != null) {
            _hashCode += getFormatSample().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getFxRateUpdateTimezone() != null) {
            _hashCode += getFxRateUpdateTimezone().hashCode();
        }
        if (getInclInFxRateUpdates() != null) {
            _hashCode += getInclInFxRateUpdates().hashCode();
        }
        if (getCurrencyPrecision() != null) {
            _hashCode += getCurrencyPrecision().hashCode();
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
        new org.apache.axis.description.TypeDesc(Currency.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "Currency"));
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
        elemField.setFieldName("symbol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "symbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBaseCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isBaseCurrency"));
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
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "CurrencyLocale"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatSample");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "formatSample"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxRateUpdateTimezone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "fxRateUpdateTimezone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "CurrencyFxRateUpdateTimezone"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inclInFxRateUpdates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "inclInFxRateUpdates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyPrecision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "currencyPrecision"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "CurrencyCurrencyPrecision"));
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
