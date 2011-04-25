/**
 * GetDeletedResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class GetDeletedResult  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.Status status;

    private org.mule.module.netsuite.api.internal.DeletedRecordList deletedRecordList;

    public GetDeletedResult() {
    }

    public GetDeletedResult(
           org.mule.module.netsuite.api.internal.Status status,
           org.mule.module.netsuite.api.internal.DeletedRecordList deletedRecordList) {
           this.status = status;
           this.deletedRecordList = deletedRecordList;
    }


    /**
     * Gets the status value for this GetDeletedResult.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetDeletedResult.
     * 
     * @param status
     */
    public void setStatus(org.mule.module.netsuite.api.internal.Status status) {
        this.status = status;
    }


    /**
     * Gets the deletedRecordList value for this GetDeletedResult.
     * 
     * @return deletedRecordList
     */
    public org.mule.module.netsuite.api.internal.DeletedRecordList getDeletedRecordList() {
        return deletedRecordList;
    }


    /**
     * Sets the deletedRecordList value for this GetDeletedResult.
     * 
     * @param deletedRecordList
     */
    public void setDeletedRecordList(org.mule.module.netsuite.api.internal.DeletedRecordList deletedRecordList) {
        this.deletedRecordList = deletedRecordList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDeletedResult)) return false;
        GetDeletedResult other = (GetDeletedResult) obj;
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
            ((this.deletedRecordList==null && other.getDeletedRecordList()==null) || 
             (this.deletedRecordList!=null &&
              this.deletedRecordList.equals(other.getDeletedRecordList())));
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
        if (getDeletedRecordList() != null) {
            _hashCode += getDeletedRecordList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDeletedResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetDeletedResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "Status"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletedRecordList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "deletedRecordList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "DeletedRecordList"));
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
