/**
 * TransactionColumnCustomFieldFilterList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class TransactionColumnCustomFieldFilterList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.TransactionColumnCustomFieldFilter[] filter;

    private boolean replaceAll;  // attribute

    public TransactionColumnCustomFieldFilterList() {
    }

    public TransactionColumnCustomFieldFilterList(
           org.mule.module.netsuite.api.internal.TransactionColumnCustomFieldFilter[] filter,
           boolean replaceAll) {
           this.filter = filter;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the filter value for this TransactionColumnCustomFieldFilterList.
     * 
     * @return filter
     */
    public org.mule.module.netsuite.api.internal.TransactionColumnCustomFieldFilter[] getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this TransactionColumnCustomFieldFilterList.
     * 
     * @param filter
     */
    public void setFilter(org.mule.module.netsuite.api.internal.TransactionColumnCustomFieldFilter[] filter) {
        this.filter = filter;
    }

    public org.mule.module.netsuite.api.internal.TransactionColumnCustomFieldFilter getFilter(int i) {
        return this.filter[i];
    }

    public void setFilter(int i, org.mule.module.netsuite.api.internal.TransactionColumnCustomFieldFilter _value) {
        this.filter[i] = _value;
    }


    /**
     * Gets the replaceAll value for this TransactionColumnCustomFieldFilterList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this TransactionColumnCustomFieldFilterList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionColumnCustomFieldFilterList)) return false;
        TransactionColumnCustomFieldFilterList other = (TransactionColumnCustomFieldFilterList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              java.util.Arrays.equals(this.filter, other.getFilter()))) &&
            this.replaceAll == other.isReplaceAll();
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
        if (getFilter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilter(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isReplaceAll() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionColumnCustomFieldFilterList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "TransactionColumnCustomFieldFilterList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "TransactionColumnCustomFieldFilter"));
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
