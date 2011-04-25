/**
 * GetSelectValueResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class GetSelectValueResult  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.Status status;

    private java.lang.Integer totalRecords;

    private java.lang.Integer totalPages;

    private org.mule.module.netsuite.api.internal.BaseRefList baseRefList;

    public GetSelectValueResult() {
    }

    public GetSelectValueResult(
           org.mule.module.netsuite.api.internal.Status status,
           java.lang.Integer totalRecords,
           java.lang.Integer totalPages,
           org.mule.module.netsuite.api.internal.BaseRefList baseRefList) {
           this.status = status;
           this.totalRecords = totalRecords;
           this.totalPages = totalPages;
           this.baseRefList = baseRefList;
    }


    /**
     * Gets the status value for this GetSelectValueResult.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetSelectValueResult.
     * 
     * @param status
     */
    public void setStatus(org.mule.module.netsuite.api.internal.Status status) {
        this.status = status;
    }


    /**
     * Gets the totalRecords value for this GetSelectValueResult.
     * 
     * @return totalRecords
     */
    public java.lang.Integer getTotalRecords() {
        return totalRecords;
    }


    /**
     * Sets the totalRecords value for this GetSelectValueResult.
     * 
     * @param totalRecords
     */
    public void setTotalRecords(java.lang.Integer totalRecords) {
        this.totalRecords = totalRecords;
    }


    /**
     * Gets the totalPages value for this GetSelectValueResult.
     * 
     * @return totalPages
     */
    public java.lang.Integer getTotalPages() {
        return totalPages;
    }


    /**
     * Sets the totalPages value for this GetSelectValueResult.
     * 
     * @param totalPages
     */
    public void setTotalPages(java.lang.Integer totalPages) {
        this.totalPages = totalPages;
    }


    /**
     * Gets the baseRefList value for this GetSelectValueResult.
     * 
     * @return baseRefList
     */
    public org.mule.module.netsuite.api.internal.BaseRefList getBaseRefList() {
        return baseRefList;
    }


    /**
     * Sets the baseRefList value for this GetSelectValueResult.
     * 
     * @param baseRefList
     */
    public void setBaseRefList(org.mule.module.netsuite.api.internal.BaseRefList baseRefList) {
        this.baseRefList = baseRefList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSelectValueResult)) return false;
        GetSelectValueResult other = (GetSelectValueResult) obj;
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
            ((this.totalPages==null && other.getTotalPages()==null) || 
             (this.totalPages!=null &&
              this.totalPages.equals(other.getTotalPages()))) &&
            ((this.baseRefList==null && other.getBaseRefList()==null) || 
             (this.baseRefList!=null &&
              this.baseRefList.equals(other.getBaseRefList())));
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
        if (getTotalPages() != null) {
            _hashCode += getTotalPages().hashCode();
        }
        if (getBaseRefList() != null) {
            _hashCode += getBaseRefList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSelectValueResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetSelectValueResult"));
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
        elemField.setFieldName("totalPages");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "totalPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseRefList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "baseRefList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "BaseRefList"));
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
