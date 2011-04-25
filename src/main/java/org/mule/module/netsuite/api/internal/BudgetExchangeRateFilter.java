/**
 * BudgetExchangeRateFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class BudgetExchangeRateFilter  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef period;

    private org.mule.module.netsuite.api.internal.RecordRef fromSubsidiary;

    private org.mule.module.netsuite.api.internal.RecordRef toSubsidiary;

    public BudgetExchangeRateFilter() {
    }

    public BudgetExchangeRateFilter(
           org.mule.module.netsuite.api.internal.RecordRef period,
           org.mule.module.netsuite.api.internal.RecordRef fromSubsidiary,
           org.mule.module.netsuite.api.internal.RecordRef toSubsidiary) {
           this.period = period;
           this.fromSubsidiary = fromSubsidiary;
           this.toSubsidiary = toSubsidiary;
    }


    /**
     * Gets the period value for this BudgetExchangeRateFilter.
     * 
     * @return period
     */
    public org.mule.module.netsuite.api.internal.RecordRef getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this BudgetExchangeRateFilter.
     * 
     * @param period
     */
    public void setPeriod(org.mule.module.netsuite.api.internal.RecordRef period) {
        this.period = period;
    }


    /**
     * Gets the fromSubsidiary value for this BudgetExchangeRateFilter.
     * 
     * @return fromSubsidiary
     */
    public org.mule.module.netsuite.api.internal.RecordRef getFromSubsidiary() {
        return fromSubsidiary;
    }


    /**
     * Sets the fromSubsidiary value for this BudgetExchangeRateFilter.
     * 
     * @param fromSubsidiary
     */
    public void setFromSubsidiary(org.mule.module.netsuite.api.internal.RecordRef fromSubsidiary) {
        this.fromSubsidiary = fromSubsidiary;
    }


    /**
     * Gets the toSubsidiary value for this BudgetExchangeRateFilter.
     * 
     * @return toSubsidiary
     */
    public org.mule.module.netsuite.api.internal.RecordRef getToSubsidiary() {
        return toSubsidiary;
    }


    /**
     * Sets the toSubsidiary value for this BudgetExchangeRateFilter.
     * 
     * @param toSubsidiary
     */
    public void setToSubsidiary(org.mule.module.netsuite.api.internal.RecordRef toSubsidiary) {
        this.toSubsidiary = toSubsidiary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BudgetExchangeRateFilter)) return false;
        BudgetExchangeRateFilter other = (BudgetExchangeRateFilter) obj;
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
              this.toSubsidiary.equals(other.getToSubsidiary())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BudgetExchangeRateFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "BudgetExchangeRateFilter"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toSubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "toSubsidiary"));
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
