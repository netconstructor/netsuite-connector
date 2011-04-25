/**
 * SearchTextNumberField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SearchTextNumberField  implements java.io.Serializable {
    private java.lang.String searchValue;

    private java.lang.String searchValue2;

    private org.mule.module.netsuite.api.internal.SearchTextNumberFieldOperator operator;  // attribute

    public SearchTextNumberField() {
    }

    public SearchTextNumberField(
           java.lang.String searchValue,
           java.lang.String searchValue2,
           org.mule.module.netsuite.api.internal.SearchTextNumberFieldOperator operator) {
           this.searchValue = searchValue;
           this.searchValue2 = searchValue2;
           this.operator = operator;
    }


    /**
     * Gets the searchValue value for this SearchTextNumberField.
     * 
     * @return searchValue
     */
    public java.lang.String getSearchValue() {
        return searchValue;
    }


    /**
     * Sets the searchValue value for this SearchTextNumberField.
     * 
     * @param searchValue
     */
    public void setSearchValue(java.lang.String searchValue) {
        this.searchValue = searchValue;
    }


    /**
     * Gets the searchValue2 value for this SearchTextNumberField.
     * 
     * @return searchValue2
     */
    public java.lang.String getSearchValue2() {
        return searchValue2;
    }


    /**
     * Sets the searchValue2 value for this SearchTextNumberField.
     * 
     * @param searchValue2
     */
    public void setSearchValue2(java.lang.String searchValue2) {
        this.searchValue2 = searchValue2;
    }


    /**
     * Gets the operator value for this SearchTextNumberField.
     * 
     * @return operator
     */
    public org.mule.module.netsuite.api.internal.SearchTextNumberFieldOperator getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this SearchTextNumberField.
     * 
     * @param operator
     */
    public void setOperator(org.mule.module.netsuite.api.internal.SearchTextNumberFieldOperator operator) {
        this.operator = operator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchTextNumberField)) return false;
        SearchTextNumberField other = (SearchTextNumberField) obj;
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
              this.searchValue.equals(other.getSearchValue()))) &&
            ((this.searchValue2==null && other.getSearchValue2()==null) || 
             (this.searchValue2!=null &&
              this.searchValue2.equals(other.getSearchValue2()))) &&
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
            _hashCode += getSearchValue().hashCode();
        }
        if (getSearchValue2() != null) {
            _hashCode += getSearchValue2().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchTextNumberField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchTextNumberField"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("operator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "SearchTextNumberFieldOperator"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "searchValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchValue2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "searchValue2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
