/**
 * GetSavedSearchRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class GetSavedSearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchRecordType searchType;  // attribute

    public GetSavedSearchRecord() {
    }

    public GetSavedSearchRecord(
           org.mule.module.netsuite.api.internal.SearchRecordType searchType) {
           this.searchType = searchType;
    }


    /**
     * Gets the searchType value for this GetSavedSearchRecord.
     * 
     * @return searchType
     */
    public org.mule.module.netsuite.api.internal.SearchRecordType getSearchType() {
        return searchType;
    }


    /**
     * Sets the searchType value for this GetSavedSearchRecord.
     * 
     * @param searchType
     */
    public void setSearchType(org.mule.module.netsuite.api.internal.SearchRecordType searchType) {
        this.searchType = searchType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSavedSearchRecord)) return false;
        GetSavedSearchRecord other = (GetSavedSearchRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchType==null && other.getSearchType()==null) || 
             (this.searchType!=null &&
              this.searchType.equals(other.getSearchType())));
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
        if (getSearchType() != null) {
            _hashCode += getSearchType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSavedSearchRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "GetSavedSearchRecord"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("searchType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "searchType"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "SearchRecordType"));
        typeDesc.addFieldDesc(attrField);
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
