/**
 * SupportCaseSolutionsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SupportCaseSolutionsList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SupportCaseSolutions[] solutions;

    private boolean replaceAll;  // attribute

    public SupportCaseSolutionsList() {
    }

    public SupportCaseSolutionsList(
           org.mule.module.netsuite.api.internal.SupportCaseSolutions[] solutions,
           boolean replaceAll) {
           this.solutions = solutions;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the solutions value for this SupportCaseSolutionsList.
     * 
     * @return solutions
     */
    public org.mule.module.netsuite.api.internal.SupportCaseSolutions[] getSolutions() {
        return solutions;
    }


    /**
     * Sets the solutions value for this SupportCaseSolutionsList.
     * 
     * @param solutions
     */
    public void setSolutions(org.mule.module.netsuite.api.internal.SupportCaseSolutions[] solutions) {
        this.solutions = solutions;
    }

    public org.mule.module.netsuite.api.internal.SupportCaseSolutions getSolutions(int i) {
        return this.solutions[i];
    }

    public void setSolutions(int i, org.mule.module.netsuite.api.internal.SupportCaseSolutions _value) {
        this.solutions[i] = _value;
    }


    /**
     * Gets the replaceAll value for this SupportCaseSolutionsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this SupportCaseSolutionsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupportCaseSolutionsList)) return false;
        SupportCaseSolutionsList other = (SupportCaseSolutionsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.solutions==null && other.getSolutions()==null) || 
             (this.solutions!=null &&
              java.util.Arrays.equals(this.solutions, other.getSolutions()))) &&
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
        if (getSolutions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSolutions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSolutions(), i);
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
        new org.apache.axis.description.TypeDesc(SupportCaseSolutionsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SupportCaseSolutionsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solutions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "solutions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SupportCaseSolutions"));
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
