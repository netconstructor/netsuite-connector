/**
 * AttachBasicReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class AttachBasicReference  extends org.mule.module.netsuite.api.internal.AttachReference  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.BaseRef attachedRecord;

    public AttachBasicReference() {
    }

    public AttachBasicReference(
           org.mule.module.netsuite.api.internal.BaseRef attachTo,
           org.mule.module.netsuite.api.internal.BaseRef attachedRecord) {
        super(
            attachTo);
        this.attachedRecord = attachedRecord;
    }


    /**
     * Gets the attachedRecord value for this AttachBasicReference.
     * 
     * @return attachedRecord
     */
    public org.mule.module.netsuite.api.internal.BaseRef getAttachedRecord() {
        return attachedRecord;
    }


    /**
     * Sets the attachedRecord value for this AttachBasicReference.
     * 
     * @param attachedRecord
     */
    public void setAttachedRecord(org.mule.module.netsuite.api.internal.BaseRef attachedRecord) {
        this.attachedRecord = attachedRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttachBasicReference)) return false;
        AttachBasicReference other = (AttachBasicReference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.attachedRecord==null && other.getAttachedRecord()==null) || 
             (this.attachedRecord!=null &&
              this.attachedRecord.equals(other.getAttachedRecord())));
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
        if (getAttachedRecord() != null) {
            _hashCode += getAttachedRecord().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttachBasicReference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "AttachBasicReference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachedRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "attachedRecord"));
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
