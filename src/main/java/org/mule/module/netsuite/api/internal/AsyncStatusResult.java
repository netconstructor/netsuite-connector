/**
 * AsyncStatusResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class AsyncStatusResult  implements java.io.Serializable {
    private java.lang.String jobId;

    private org.mule.module.netsuite.api.internal.AsyncStatusType status;

    private double percentCompleted;

    private double estRemainingDuration;

    public AsyncStatusResult() {
    }

    public AsyncStatusResult(
           java.lang.String jobId,
           org.mule.module.netsuite.api.internal.AsyncStatusType status,
           double percentCompleted,
           double estRemainingDuration) {
           this.jobId = jobId;
           this.status = status;
           this.percentCompleted = percentCompleted;
           this.estRemainingDuration = estRemainingDuration;
    }


    /**
     * Gets the jobId value for this AsyncStatusResult.
     * 
     * @return jobId
     */
    public java.lang.String getJobId() {
        return jobId;
    }


    /**
     * Sets the jobId value for this AsyncStatusResult.
     * 
     * @param jobId
     */
    public void setJobId(java.lang.String jobId) {
        this.jobId = jobId;
    }


    /**
     * Gets the status value for this AsyncStatusResult.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.AsyncStatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AsyncStatusResult.
     * 
     * @param status
     */
    public void setStatus(org.mule.module.netsuite.api.internal.AsyncStatusType status) {
        this.status = status;
    }


    /**
     * Gets the percentCompleted value for this AsyncStatusResult.
     * 
     * @return percentCompleted
     */
    public double getPercentCompleted() {
        return percentCompleted;
    }


    /**
     * Sets the percentCompleted value for this AsyncStatusResult.
     * 
     * @param percentCompleted
     */
    public void setPercentCompleted(double percentCompleted) {
        this.percentCompleted = percentCompleted;
    }


    /**
     * Gets the estRemainingDuration value for this AsyncStatusResult.
     * 
     * @return estRemainingDuration
     */
    public double getEstRemainingDuration() {
        return estRemainingDuration;
    }


    /**
     * Sets the estRemainingDuration value for this AsyncStatusResult.
     * 
     * @param estRemainingDuration
     */
    public void setEstRemainingDuration(double estRemainingDuration) {
        this.estRemainingDuration = estRemainingDuration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AsyncStatusResult)) return false;
        AsyncStatusResult other = (AsyncStatusResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jobId==null && other.getJobId()==null) || 
             (this.jobId!=null &&
              this.jobId.equals(other.getJobId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.percentCompleted == other.getPercentCompleted() &&
            this.estRemainingDuration == other.getEstRemainingDuration();
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
        if (getJobId() != null) {
            _hashCode += getJobId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += new Double(getPercentCompleted()).hashCode();
        _hashCode += new Double(getEstRemainingDuration()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AsyncStatusResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "AsyncStatusResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "jobId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "AsyncStatusType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "percentCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estRemainingDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "estRemainingDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
