/**
 * SearchColumnMultiSelectCustomField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SearchColumnMultiSelectCustomField  extends org.mule.module.netsuite.api.internal.SearchColumnCustomField  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.ListOrRecordRef[] searchValue;

    private java.lang.String internalId;  // attribute

    public SearchColumnMultiSelectCustomField() {
    }

    public SearchColumnMultiSelectCustomField(
           java.lang.String customLabel,
           java.lang.String internalId,
           org.mule.module.netsuite.api.internal.ListOrRecordRef[] searchValue) {
        super(
            customLabel);
        this.internalId = internalId;
        this.searchValue = searchValue;
    }


    /**
     * Gets the searchValue value for this SearchColumnMultiSelectCustomField.
     * 
     * @return searchValue
     */
    public org.mule.module.netsuite.api.internal.ListOrRecordRef[] getSearchValue() {
        return searchValue;
    }


    /**
     * Sets the searchValue value for this SearchColumnMultiSelectCustomField.
     * 
     * @param searchValue
     */
    public void setSearchValue(org.mule.module.netsuite.api.internal.ListOrRecordRef[] searchValue) {
        this.searchValue = searchValue;
    }

    public org.mule.module.netsuite.api.internal.ListOrRecordRef getSearchValue(int i) {
        return this.searchValue[i];
    }

    public void setSearchValue(int i, org.mule.module.netsuite.api.internal.ListOrRecordRef _value) {
        this.searchValue[i] = _value;
    }


    /**
     * Gets the internalId value for this SearchColumnMultiSelectCustomField.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this SearchColumnMultiSelectCustomField.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchColumnMultiSelectCustomField)) return false;
        SearchColumnMultiSelectCustomField other = (SearchColumnMultiSelectCustomField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.searchValue==null && other.getSearchValue()==null) || 
             (this.searchValue!=null &&
              java.util.Arrays.equals(this.searchValue, other.getSearchValue()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId())));
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
        if (getSearchValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchColumnMultiSelectCustomField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnMultiSelectCustomField"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "searchValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "ListOrRecordRef"));
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
