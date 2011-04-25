/**
 * CustomRecordTypeParentsList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomRecordTypeParentsList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.CustomRecordTypeParents[] parents;

    private boolean replaceAll;  // attribute

    public CustomRecordTypeParentsList() {
    }

    public CustomRecordTypeParentsList(
           org.mule.module.netsuite.api.internal.CustomRecordTypeParents[] parents,
           boolean replaceAll) {
           this.parents = parents;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the parents value for this CustomRecordTypeParentsList.
     * 
     * @return parents
     */
    public org.mule.module.netsuite.api.internal.CustomRecordTypeParents[] getParents() {
        return parents;
    }


    /**
     * Sets the parents value for this CustomRecordTypeParentsList.
     * 
     * @param parents
     */
    public void setParents(org.mule.module.netsuite.api.internal.CustomRecordTypeParents[] parents) {
        this.parents = parents;
    }

    public org.mule.module.netsuite.api.internal.CustomRecordTypeParents getParents(int i) {
        return this.parents[i];
    }

    public void setParents(int i, org.mule.module.netsuite.api.internal.CustomRecordTypeParents _value) {
        this.parents[i] = _value;
    }


    /**
     * Gets the replaceAll value for this CustomRecordTypeParentsList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this CustomRecordTypeParentsList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomRecordTypeParentsList)) return false;
        CustomRecordTypeParentsList other = (CustomRecordTypeParentsList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parents==null && other.getParents()==null) || 
             (this.parents!=null &&
              java.util.Arrays.equals(this.parents, other.getParents()))) &&
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
        if (getParents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParents(), i);
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
        new org.apache.axis.description.TypeDesc(CustomRecordTypeParentsList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeParentsList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parents");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "parents"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeParents"));
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
