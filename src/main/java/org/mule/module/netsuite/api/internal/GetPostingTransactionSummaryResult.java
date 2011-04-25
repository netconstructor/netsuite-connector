/**
 * GetPostingTransactionSummaryResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class GetPostingTransactionSummaryResult  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.Status status;

    private java.lang.Integer totalRecords;

    private java.lang.Integer pageSize;

    private java.lang.Integer totalPages;

    private java.lang.Integer pageIndex;

    private org.mule.module.netsuite.api.internal.PostingTransactionSummaryList postingTransactionSummaryList;

    public GetPostingTransactionSummaryResult() {
    }

    public GetPostingTransactionSummaryResult(
           org.mule.module.netsuite.api.internal.Status status,
           java.lang.Integer totalRecords,
           java.lang.Integer pageSize,
           java.lang.Integer totalPages,
           java.lang.Integer pageIndex,
           org.mule.module.netsuite.api.internal.PostingTransactionSummaryList postingTransactionSummaryList) {
           this.status = status;
           this.totalRecords = totalRecords;
           this.pageSize = pageSize;
           this.totalPages = totalPages;
           this.pageIndex = pageIndex;
           this.postingTransactionSummaryList = postingTransactionSummaryList;
    }


    /**
     * Gets the status value for this GetPostingTransactionSummaryResult.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetPostingTransactionSummaryResult.
     * 
     * @param status
     */
    public void setStatus(org.mule.module.netsuite.api.internal.Status status) {
        this.status = status;
    }


    /**
     * Gets the totalRecords value for this GetPostingTransactionSummaryResult.
     * 
     * @return totalRecords
     */
    public java.lang.Integer getTotalRecords() {
        return totalRecords;
    }


    /**
     * Sets the totalRecords value for this GetPostingTransactionSummaryResult.
     * 
     * @param totalRecords
     */
    public void setTotalRecords(java.lang.Integer totalRecords) {
        this.totalRecords = totalRecords;
    }


    /**
     * Gets the pageSize value for this GetPostingTransactionSummaryResult.
     * 
     * @return pageSize
     */
    public java.lang.Integer getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this GetPostingTransactionSummaryResult.
     * 
     * @param pageSize
     */
    public void setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the totalPages value for this GetPostingTransactionSummaryResult.
     * 
     * @return totalPages
     */
    public java.lang.Integer getTotalPages() {
        return totalPages;
    }


    /**
     * Sets the totalPages value for this GetPostingTransactionSummaryResult.
     * 
     * @param totalPages
     */
    public void setTotalPages(java.lang.Integer totalPages) {
        this.totalPages = totalPages;
    }


    /**
     * Gets the pageIndex value for this GetPostingTransactionSummaryResult.
     * 
     * @return pageIndex
     */
    public java.lang.Integer getPageIndex() {
        return pageIndex;
    }


    /**
     * Sets the pageIndex value for this GetPostingTransactionSummaryResult.
     * 
     * @param pageIndex
     */
    public void setPageIndex(java.lang.Integer pageIndex) {
        this.pageIndex = pageIndex;
    }


    /**
     * Gets the postingTransactionSummaryList value for this GetPostingTransactionSummaryResult.
     * 
     * @return postingTransactionSummaryList
     */
    public org.mule.module.netsuite.api.internal.PostingTransactionSummaryList getPostingTransactionSummaryList() {
        return postingTransactionSummaryList;
    }


    /**
     * Sets the postingTransactionSummaryList value for this GetPostingTransactionSummaryResult.
     * 
     * @param postingTransactionSummaryList
     */
    public void setPostingTransactionSummaryList(org.mule.module.netsuite.api.internal.PostingTransactionSummaryList postingTransactionSummaryList) {
        this.postingTransactionSummaryList = postingTransactionSummaryList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPostingTransactionSummaryResult)) return false;
        GetPostingTransactionSummaryResult other = (GetPostingTransactionSummaryResult) obj;
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
            ((this.pageSize==null && other.getPageSize()==null) || 
             (this.pageSize!=null &&
              this.pageSize.equals(other.getPageSize()))) &&
            ((this.totalPages==null && other.getTotalPages()==null) || 
             (this.totalPages!=null &&
              this.totalPages.equals(other.getTotalPages()))) &&
            ((this.pageIndex==null && other.getPageIndex()==null) || 
             (this.pageIndex!=null &&
              this.pageIndex.equals(other.getPageIndex()))) &&
            ((this.postingTransactionSummaryList==null && other.getPostingTransactionSummaryList()==null) || 
             (this.postingTransactionSummaryList!=null &&
              this.postingTransactionSummaryList.equals(other.getPostingTransactionSummaryList())));
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
        if (getPageSize() != null) {
            _hashCode += getPageSize().hashCode();
        }
        if (getTotalPages() != null) {
            _hashCode += getTotalPages().hashCode();
        }
        if (getPageIndex() != null) {
            _hashCode += getPageIndex().hashCode();
        }
        if (getPostingTransactionSummaryList() != null) {
            _hashCode += getPostingTransactionSummaryList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPostingTransactionSummaryResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetPostingTransactionSummaryResult"));
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
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "pageSize"));
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
        elemField.setFieldName("pageIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "pageIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postingTransactionSummaryList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "postingTransactionSummaryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "PostingTransactionSummaryList"));
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
