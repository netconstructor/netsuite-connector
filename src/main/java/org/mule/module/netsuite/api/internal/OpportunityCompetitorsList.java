/**
 * OpportunityCompetitorsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class OpportunityCompetitorsList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.OpportunityCompetitors[] competitors;

    private boolean replaceAll;  // attribute

    public OpportunityCompetitorsList() {
    }

    public OpportunityCompetitorsList(
           org.mule.module.netsuite.api.internal.OpportunityCompetitors[] competitors,
           boolean replaceAll) {
           this.competitors = competitors;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the competitors value for this OpportunityCompetitorsList.
     * 
     * @return competitors
     */
    public org.mule.module.netsuite.api.internal.OpportunityCompetitors[] getCompetitors() {
        return competitors;
    }


    /**
     * Sets the competitors value for this OpportunityCompetitorsList.
     * 
     * @param competitors
     */
    public void setCompetitors(org.mule.module.netsuite.api.internal.OpportunityCompetitors[] competitors) {
        this.competitors = competitors;
    }

    public org.mule.module.netsuite.api.internal.OpportunityCompetitors getCompetitors(int i) {
        return this.competitors[i];
    }

    public void setCompetitors(int i, org.mule.module.netsuite.api.internal.OpportunityCompetitors _value) {
        this.competitors[i] = _value;
    }


    /**
     * Gets the replaceAll value for this OpportunityCompetitorsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this OpportunityCompetitorsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OpportunityCompetitorsList)) return false;
        OpportunityCompetitorsList other = (OpportunityCompetitorsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.competitors==null && other.getCompetitors()==null) || 
             (this.competitors!=null &&
              java.util.Arrays.equals(this.competitors, other.getCompetitors()))) &&
            this.replaceAll == other.isReplaceAll();
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
        if (getCompetitors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompetitors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompetitors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isReplaceAll() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OpportunityCompetitorsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "OpportunityCompetitorsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("competitors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "competitors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "OpportunityCompetitors"));
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
