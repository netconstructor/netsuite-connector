/**
 * SearchMultiSelectField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SearchMultiSelectField  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef[] searchValue;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectFieldOperator operator;  // attribute

    public SearchMultiSelectField() {
    }

    public SearchMultiSelectField(
           org.mule.module.netsuite.api.internal.RecordRef[] searchValue,
           org.mule.module.netsuite.api.internal.SearchMultiSelectFieldOperator operator) {
           this.searchValue = searchValue;
           this.operator = operator;
    }


    /**
     * Gets the searchValue value for this SearchMultiSelectField.
     * 
     * @return searchValue
     */
    public org.mule.module.netsuite.api.internal.RecordRef[] getSearchValue() {
        return searchValue;
    }


    /**
     * Sets the searchValue value for this SearchMultiSelectField.
     * 
     * @param searchValue
     */
    public void setSearchValue(org.mule.module.netsuite.api.internal.RecordRef[] searchValue) {
        this.searchValue = searchValue;
    }

    public org.mule.module.netsuite.api.internal.RecordRef getSearchValue(int i) {
        return this.searchValue[i];
    }

    public void setSearchValue(int i, org.mule.module.netsuite.api.internal.RecordRef _value) {
        this.searchValue[i] = _value;
    }


    /**
     * Gets the operator value for this SearchMultiSelectField.
     * 
     * @return operator
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectFieldOperator getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this SearchMultiSelectField.
     * 
     * @param operator
     */
    public void setOperator(org.mule.module.netsuite.api.internal.SearchMultiSelectFieldOperator operator) {
        this.operator = operator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchMultiSelectField)) return false;
        SearchMultiSelectField other = (SearchMultiSelectField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchValue==null && other.getSearchValue()==null) || 
             (this.searchValue!=null &&
              java.util.Arrays.equals(this.searchValue, other.getSearchValue()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator())));
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
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchMultiSelectField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("operator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectFieldOperator"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "searchValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
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
