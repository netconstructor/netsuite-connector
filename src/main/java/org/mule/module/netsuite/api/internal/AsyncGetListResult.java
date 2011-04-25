/**
 * AsyncGetListResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class AsyncGetListResult  extends org.mule.module.netsuite.api.internal.AsyncResult  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.ReadResponseList readResponseList;

    public AsyncGetListResult() {
    }

    public AsyncGetListResult(
           org.mule.module.netsuite.api.internal.ReadResponseList readResponseList) {
        this.readResponseList = readResponseList;
    }


    /**
     * Gets the readResponseList value for this AsyncGetListResult.
     * 
     * @return readResponseList
     */
    public org.mule.module.netsuite.api.internal.ReadResponseList getReadResponseList() {
        return readResponseList;
    }


    /**
     * Sets the readResponseList value for this AsyncGetListResult.
     * 
     * @param readResponseList
     */
    public void setReadResponseList(org.mule.module.netsuite.api.internal.ReadResponseList readResponseList) {
        this.readResponseList = readResponseList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AsyncGetListResult)) return false;
        AsyncGetListResult other = (AsyncGetListResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.readResponseList==null && other.getReadResponseList()==null) || 
             (this.readResponseList!=null &&
              this.readResponseList.equals(other.getReadResponseList())));
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
        if (getReadResponseList() != null) {
            _hashCode += getReadResponseList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AsyncGetListResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "AsyncGetListResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readResponseList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "readResponseList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:messages_2010_2.platform.webservices.netsuite.com", "ReadResponseList"));
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
