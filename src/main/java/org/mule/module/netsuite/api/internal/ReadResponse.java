/**
 * ReadResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ReadResponse  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.Status status;

    private org.mule.module.netsuite.api.internal.Record record;

    public ReadResponse() {
    }

    public ReadResponse(
           org.mule.module.netsuite.api.internal.Status status,
           org.mule.module.netsuite.api.internal.Record record) {
           this.status = status;
           this.record = record;
    }


    /**
     * Gets the status value for this ReadResponse.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ReadResponse.
     * 
     * @param status
     */
    public void setStatus(org.mule.module.netsuite.api.internal.Status status) {
        this.status = status;
    }


    /**
     * Gets the record value for this ReadResponse.
     * 
     * @return record
     */
    public org.mule.module.netsuite.api.internal.Record getRecord() {
        return record;
    }


    /**
     * Sets the record value for this ReadResponse.
     * 
     * @param record
     */
    public void setRecord(org.mule.module.netsuite.api.internal.Record record) {
        this.record = record;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReadResponse)) return false;
        ReadResponse other = (ReadResponse) obj;
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
            ((this.record==null && other.getRecord()==null) || 
             (this.record!=null &&
              this.record.equals(other.getRecord())));
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
        if (getRecord() != null) {
            _hashCode += getRecord().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReadResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "ReadResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "Status"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("record");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "record"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "Record"));
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
