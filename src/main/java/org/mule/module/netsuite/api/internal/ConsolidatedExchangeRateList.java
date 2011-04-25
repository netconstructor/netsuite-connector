/**
 * ConsolidatedExchangeRateList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ConsolidatedExchangeRateList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.ConsolidatedExchangeRate[] consolidatedExchangeRate;

    public ConsolidatedExchangeRateList() {
    }

    public ConsolidatedExchangeRateList(
           org.mule.module.netsuite.api.internal.ConsolidatedExchangeRate[] consolidatedExchangeRate) {
           this.consolidatedExchangeRate = consolidatedExchangeRate;
    }


    /**
     * Gets the consolidatedExchangeRate value for this ConsolidatedExchangeRateList.
     * 
     * @return consolidatedExchangeRate
     */
    public org.mule.module.netsuite.api.internal.ConsolidatedExchangeRate[] getConsolidatedExchangeRate() {
        return consolidatedExchangeRate;
    }


    /**
     * Sets the consolidatedExchangeRate value for this ConsolidatedExchangeRateList.
     * 
     * @param consolidatedExchangeRate
     */
    public void setConsolidatedExchangeRate(org.mule.module.netsuite.api.internal.ConsolidatedExchangeRate[] consolidatedExchangeRate) {
        this.consolidatedExchangeRate = consolidatedExchangeRate;
    }

    public org.mule.module.netsuite.api.internal.ConsolidatedExchangeRate getConsolidatedExchangeRate(int i) {
        return this.consolidatedExchangeRate[i];
    }

    public void setConsolidatedExchangeRate(int i, org.mule.module.netsuite.api.internal.ConsolidatedExchangeRate _value) {
        this.consolidatedExchangeRate[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsolidatedExchangeRateList)) return false;
        ConsolidatedExchangeRateList other = (ConsolidatedExchangeRateList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.consolidatedExchangeRate==null && other.getConsolidatedExchangeRate()==null) || 
             (this.consolidatedExchangeRate!=null &&
              java.util.Arrays.equals(this.consolidatedExchangeRate, other.getConsolidatedExchangeRate())));
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
        if (getConsolidatedExchangeRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConsolidatedExchangeRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConsolidatedExchangeRate(), i);
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
        new org.apache.axis.description.TypeDesc(ConsolidatedExchangeRateList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "ConsolidatedExchangeRateList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidatedExchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "consolidatedExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "ConsolidatedExchangeRate"));
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
