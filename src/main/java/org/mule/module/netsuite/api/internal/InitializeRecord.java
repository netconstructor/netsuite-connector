/**
 * InitializeRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class InitializeRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.InitializeType type;

    private org.mule.module.netsuite.api.internal.InitializeRef reference;

    private org.mule.module.netsuite.api.internal.InitializeAuxRef auxReference;

    public InitializeRecord() {
    }

    public InitializeRecord(
           org.mule.module.netsuite.api.internal.InitializeType type,
           org.mule.module.netsuite.api.internal.InitializeRef reference,
           org.mule.module.netsuite.api.internal.InitializeAuxRef auxReference) {
           this.type = type;
           this.reference = reference;
           this.auxReference = auxReference;
    }


    /**
     * Gets the type value for this InitializeRecord.
     * 
     * @return type
     */
    public org.mule.module.netsuite.api.internal.InitializeType getType() {
        return type;
    }


    /**
     * Sets the type value for this InitializeRecord.
     * 
     * @param type
     */
    public void setType(org.mule.module.netsuite.api.internal.InitializeType type) {
        this.type = type;
    }


    /**
     * Gets the reference value for this InitializeRecord.
     * 
     * @return reference
     */
    public org.mule.module.netsuite.api.internal.InitializeRef getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this InitializeRecord.
     * 
     * @param reference
     */
    public void setReference(org.mule.module.netsuite.api.internal.InitializeRef reference) {
        this.reference = reference;
    }


    /**
     * Gets the auxReference value for this InitializeRecord.
     * 
     * @return auxReference
     */
    public org.mule.module.netsuite.api.internal.InitializeAuxRef getAuxReference() {
        return auxReference;
    }


    /**
     * Sets the auxReference value for this InitializeRecord.
     * 
     * @param auxReference
     */
    public void setAuxReference(org.mule.module.netsuite.api.internal.InitializeAuxRef auxReference) {
        this.auxReference = auxReference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InitializeRecord)) return false;
        InitializeRecord other = (InitializeRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference()))) &&
            ((this.auxReference==null && other.getAuxReference()==null) || 
             (this.auxReference!=null &&
              this.auxReference.equals(other.getAuxReference())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        if (getAuxReference() != null) {
            _hashCode += getAuxReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InitializeRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "InitializeRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "InitializeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "InitializeRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auxReference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "auxReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "InitializeAuxRef"));
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
