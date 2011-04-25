/**
 * Status.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class Status  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.StatusDetail[] statusDetail;

    private boolean isSuccess;  // attribute

    public Status() {
    }

    public Status(
           org.mule.module.netsuite.api.internal.StatusDetail[] statusDetail,
           boolean isSuccess) {
           this.statusDetail = statusDetail;
           this.isSuccess = isSuccess;
    }


    /**
     * Gets the statusDetail value for this Status.
     * 
     * @return statusDetail
     */
    public org.mule.module.netsuite.api.internal.StatusDetail[] getStatusDetail() {
        return statusDetail;
    }


    /**
     * Sets the statusDetail value for this Status.
     * 
     * @param statusDetail
     */
    public void setStatusDetail(org.mule.module.netsuite.api.internal.StatusDetail[] statusDetail) {
        this.statusDetail = statusDetail;
    }

    public org.mule.module.netsuite.api.internal.StatusDetail getStatusDetail(int i) {
        return this.statusDetail[i];
    }

    public void setStatusDetail(int i, org.mule.module.netsuite.api.internal.StatusDetail _value) {
        this.statusDetail[i] = _value;
    }


    /**
     * Gets the isSuccess value for this Status.
     * 
     * @return isSuccess
     */
    public boolean isIsSuccess() {
        return isSuccess;
    }


    /**
     * Sets the isSuccess value for this Status.
     * 
     * @param isSuccess
     */
    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Status)) return false;
        Status other = (Status) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statusDetail==null && other.getStatusDetail()==null) || 
             (this.statusDetail!=null &&
              java.util.Arrays.equals(this.statusDetail, other.getStatusDetail()))) &&
            this.isSuccess == other.isIsSuccess();
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
        if (getStatusDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatusDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatusDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isIsSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Status.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "Status"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isSuccess");
        attrField.setXmlName(new javax.xml.namespace.QName("", "isSuccess"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "statusDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "StatusDetail"));
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
