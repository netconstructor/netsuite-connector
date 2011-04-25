/**
 * GetSavedSearchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class GetSavedSearchResult  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.Status status;

    private java.lang.Integer totalRecords;

    private org.mule.module.netsuite.api.internal.RecordRefList recordRefList;

    public GetSavedSearchResult() {
    }

    public GetSavedSearchResult(
           org.mule.module.netsuite.api.internal.Status status,
           java.lang.Integer totalRecords,
           org.mule.module.netsuite.api.internal.RecordRefList recordRefList) {
           this.status = status;
           this.totalRecords = totalRecords;
           this.recordRefList = recordRefList;
    }


    /**
     * Gets the status value for this GetSavedSearchResult.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetSavedSearchResult.
     * 
     * @param status
     */
    public void setStatus(org.mule.module.netsuite.api.internal.Status status) {
        this.status = status;
    }


    /**
     * Gets the totalRecords value for this GetSavedSearchResult.
     * 
     * @return totalRecords
     */
    public java.lang.Integer getTotalRecords() {
        return totalRecords;
    }


    /**
     * Sets the totalRecords value for this GetSavedSearchResult.
     * 
     * @param totalRecords
     */
    public void setTotalRecords(java.lang.Integer totalRecords) {
        this.totalRecords = totalRecords;
    }


    /**
     * Gets the recordRefList value for this GetSavedSearchResult.
     * 
     * @return recordRefList
     */
    public org.mule.module.netsuite.api.internal.RecordRefList getRecordRefList() {
        return recordRefList;
    }


    /**
     * Sets the recordRefList value for this GetSavedSearchResult.
     * 
     * @param recordRefList
     */
    public void setRecordRefList(org.mule.module.netsuite.api.internal.RecordRefList recordRefList) {
        this.recordRefList = recordRefList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSavedSearchResult)) return false;
        GetSavedSearchResult other = (GetSavedSearchResult) obj;
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
            ((this.totalRecords==null && other.getTotalRecords()==null) || 
             (this.totalRecords!=null &&
              this.totalRecords.equals(other.getTotalRecords()))) &&
            ((this.recordRefList==null && other.getRecordRefList()==null) || 
             (this.recordRefList!=null &&
              this.recordRefList.equals(other.getRecordRefList())));
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
        if (getTotalRecords() != null) {
            _hashCode += getTotalRecords().hashCode();
        }
        if (getRecordRefList() != null) {
            _hashCode += getRecordRefList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSavedSearchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetSavedSearchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "Status"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "totalRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordRefList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "recordRefList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRefList"));
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
