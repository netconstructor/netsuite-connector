/**
 * GetConsolidatedExchangeRateResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class GetConsolidatedExchangeRateResult  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.Status status;

    private org.mule.module.netsuite.api.internal.ConsolidatedExchangeRateList consolidatedExchangeRateList;

    public GetConsolidatedExchangeRateResult() {
    }

    public GetConsolidatedExchangeRateResult(
           org.mule.module.netsuite.api.internal.Status status,
           org.mule.module.netsuite.api.internal.ConsolidatedExchangeRateList consolidatedExchangeRateList) {
           this.status = status;
           this.consolidatedExchangeRateList = consolidatedExchangeRateList;
    }


    /**
     * Gets the status value for this GetConsolidatedExchangeRateResult.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetConsolidatedExchangeRateResult.
     * 
     * @param status
     */
    public void setStatus(org.mule.module.netsuite.api.internal.Status status) {
        this.status = status;
    }


    /**
     * Gets the consolidatedExchangeRateList value for this GetConsolidatedExchangeRateResult.
     * 
     * @return consolidatedExchangeRateList
     */
    public org.mule.module.netsuite.api.internal.ConsolidatedExchangeRateList getConsolidatedExchangeRateList() {
        return consolidatedExchangeRateList;
    }


    /**
     * Sets the consolidatedExchangeRateList value for this GetConsolidatedExchangeRateResult.
     * 
     * @param consolidatedExchangeRateList
     */
    public void setConsolidatedExchangeRateList(org.mule.module.netsuite.api.internal.ConsolidatedExchangeRateList consolidatedExchangeRateList) {
        this.consolidatedExchangeRateList = consolidatedExchangeRateList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetConsolidatedExchangeRateResult)) return false;
        GetConsolidatedExchangeRateResult other = (GetConsolidatedExchangeRateResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.consolidatedExchangeRateList==null && other.getConsolidatedExchangeRateList()==null) || 
             (this.consolidatedExchangeRateList!=null &&
              this.consolidatedExchangeRateList.equals(other.getConsolidatedExchangeRateList())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getConsolidatedExchangeRateList() != null) {
            _hashCode += getConsolidatedExchangeRateList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetConsolidatedExchangeRateResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetConsolidatedExchangeRateResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "Status"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidatedExchangeRateList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "consolidatedExchangeRateList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "ConsolidatedExchangeRateList"));
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
