/**
 * SubsidiaryNexus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SubsidiaryNexus  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef nexusId;

    private java.lang.String country;

    public SubsidiaryNexus() {
    }

    public SubsidiaryNexus(
           org.mule.module.netsuite.api.internal.RecordRef nexusId,
           java.lang.String country) {
           this.nexusId = nexusId;
           this.country = country;
    }


    /**
     * Gets the nexusId value for this SubsidiaryNexus.
     * 
     * @return nexusId
     */
    public org.mule.module.netsuite.api.internal.RecordRef getNexusId() {
        return nexusId;
    }


    /**
     * Sets the nexusId value for this SubsidiaryNexus.
     * 
     * @param nexusId
     */
    public void setNexusId(org.mule.module.netsuite.api.internal.RecordRef nexusId) {
        this.nexusId = nexusId;
    }


    /**
     * Gets the country value for this SubsidiaryNexus.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this SubsidiaryNexus.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubsidiaryNexus)) return false;
        SubsidiaryNexus other = (SubsidiaryNexus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nexusId==null && other.getNexusId()==null) || 
             (this.nexusId!=null &&
              this.nexusId.equals(other.getNexusId()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry())));
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
        if (getNexusId() != null) {
            _hashCode += getNexusId().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubsidiaryNexus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SubsidiaryNexus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexusId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "nexusId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
