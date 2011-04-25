/**
 * DetachBasicReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class DetachBasicReference  extends org.mule.module.netsuite.api.internal.DetachReference  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.BaseRef detachedRecord;

    public DetachBasicReference() {
    }

    public DetachBasicReference(
           org.mule.module.netsuite.api.internal.BaseRef detachFrom,
           org.mule.module.netsuite.api.internal.BaseRef detachedRecord) {
        super(
            detachFrom);
        this.detachedRecord = detachedRecord;
    }


    /**
     * Gets the detachedRecord value for this DetachBasicReference.
     * 
     * @return detachedRecord
     */
    public org.mule.module.netsuite.api.internal.BaseRef getDetachedRecord() {
        return detachedRecord;
    }


    /**
     * Sets the detachedRecord value for this DetachBasicReference.
     * 
     * @param detachedRecord
     */
    public void setDetachedRecord(org.mule.module.netsuite.api.internal.BaseRef detachedRecord) {
        this.detachedRecord = detachedRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DetachBasicReference)) return false;
        DetachBasicReference other = (DetachBasicReference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.detachedRecord==null && other.getDetachedRecord()==null) || 
             (this.detachedRecord!=null &&
              this.detachedRecord.equals(other.getDetachedRecord())));
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
        if (getDetachedRecord() != null) {
            _hashCode += getDetachedRecord().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DetachBasicReference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "DetachBasicReference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detachedRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "detachedRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "BaseRef"));
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
