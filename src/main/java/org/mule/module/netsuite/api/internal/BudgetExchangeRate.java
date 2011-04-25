/**
 * BudgetExchangeRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class BudgetExchangeRate  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef period;

    private org.mule.module.netsuite.api.internal.RecordRef fromSubsidiary;

    private org.mule.module.netsuite.api.internal.RecordRef toSubsidiary;

    private java.lang.Double currentRate;

    private java.lang.Double averageRate;

    private java.lang.Double historicalRate;

    public BudgetExchangeRate() {
    }

    public BudgetExchangeRate(
           org.mule.module.netsuite.api.internal.RecordRef period,
           org.mule.module.netsuite.api.internal.RecordRef fromSubsidiary,
           org.mule.module.netsuite.api.internal.RecordRef toSubsidiary,
           java.lang.Double currentRate,
           java.lang.Double averageRate,
           java.lang.Double historicalRate) {
           this.period = period;
           this.fromSubsidiary = fromSubsidiary;
           this.toSubsidiary = toSubsidiary;
           this.currentRate = currentRate;
           this.averageRate = averageRate;
           this.historicalRate = historicalRate;
    }


    /**
     * Gets the period value for this BudgetExchangeRate.
     * 
     * @return period
     */
    public org.mule.module.netsuite.api.internal.RecordRef getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this BudgetExchangeRate.
     * 
     * @param period
     */
    public void setPeriod(org.mule.module.netsuite.api.internal.RecordRef period) {
        this.period = period;
    }


    /**
     * Gets the fromSubsidiary value for this BudgetExchangeRate.
     * 
     * @return fromSubsidiary
     */
    public org.mule.module.netsuite.api.internal.RecordRef getFromSubsidiary() {
        return fromSubsidiary;
    }


    /**
     * Sets the fromSubsidiary value for this BudgetExchangeRate.
     * 
     * @param fromSubsidiary
     */
    public void setFromSubsidiary(org.mule.module.netsuite.api.internal.RecordRef fromSubsidiary) {
        this.fromSubsidiary = fromSubsidiary;
    }


    /**
     * Gets the toSubsidiary value for this BudgetExchangeRate.
     * 
     * @return toSubsidiary
     */
    public org.mule.module.netsuite.api.internal.RecordRef getToSubsidiary() {
        return toSubsidiary;
    }


    /**
     * Sets the toSubsidiary value for this BudgetExchangeRate.
     * 
     * @param toSubsidiary
     */
    public void setToSubsidiary(org.mule.module.netsuite.api.internal.RecordRef toSubsidiary) {
        this.toSubsidiary = toSubsidiary;
    }


    /**
     * Gets the currentRate value for this BudgetExchangeRate.
     * 
     * @return currentRate
     */
    public java.lang.Double getCurrentRate() {
        return currentRate;
    }


    /**
     * Sets the currentRate value for this BudgetExchangeRate.
     * 
     * @param currentRate
     */
    public void setCurrentRate(java.lang.Double currentRate) {
        this.currentRate = currentRate;
    }


    /**
     * Gets the averageRate value for this BudgetExchangeRate.
     * 
     * @return averageRate
     */
    public java.lang.Double getAverageRate() {
        return averageRate;
    }


    /**
     * Sets the averageRate value for this BudgetExchangeRate.
     * 
     * @param averageRate
     */
    public void setAverageRate(java.lang.Double averageRate) {
        this.averageRate = averageRate;
    }


    /**
     * Gets the historicalRate value for this BudgetExchangeRate.
     * 
     * @return historicalRate
     */
    public java.lang.Double getHistoricalRate() {
        return historicalRate;
    }


    /**
     * Sets the historicalRate value for this BudgetExchangeRate.
     * 
     * @param historicalRate
     */
    public void setHistoricalRate(java.lang.Double historicalRate) {
        this.historicalRate = historicalRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BudgetExchangeRate)) return false;
        BudgetExchangeRate other = (BudgetExchangeRate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod()))) &&
            ((this.fromSubsidiary==null && other.getFromSubsidiary()==null) || 
             (this.fromSubsidiary!=null &&
              this.fromSubsidiary.equals(other.getFromSubsidiary()))) &&
            ((this.toSubsidiary==null && other.getToSubsidiary()==null) || 
             (this.toSubsidiary!=null &&
              this.toSubsidiary.equals(other.getToSubsidiary()))) &&
            ((this.currentRate==null && other.getCurrentRate()==null) || 
             (this.currentRate!=null &&
              this.currentRate.equals(other.getCurrentRate()))) &&
            ((this.averageRate==null && other.getAverageRate()==null) || 
             (this.averageRate!=null &&
              this.averageRate.equals(other.getAverageRate()))) &&
            ((this.historicalRate==null && other.getHistoricalRate()==null) || 
             (this.historicalRate!=null &&
              this.historicalRate.equals(other.getHistoricalRate())));
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
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        if (getFromSubsidiary() != null) {
            _hashCode += getFromSubsidiary().hashCode();
        }
        if (getToSubsidiary() != null) {
            _hashCode += getToSubsidiary().hashCode();
        }
        if (getCurrentRate() != null) {
            _hashCode += getCurrentRate().hashCode();
        }
        if (getAverageRate() != null) {
            _hashCode += getAverageRate().hashCode();
        }
        if (getHistoricalRate() != null) {
            _hashCode += getHistoricalRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BudgetExchangeRate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "BudgetExchangeRate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromSubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "fromSubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toSubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "toSubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "currentRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "averageRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historicalRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "historicalRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
