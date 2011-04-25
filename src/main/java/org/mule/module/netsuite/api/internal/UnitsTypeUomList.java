/**
 * UnitsTypeUomList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class UnitsTypeUomList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.UnitsTypeUom[] uom;

    private boolean replaceAll;  // attribute

    public UnitsTypeUomList() {
    }

    public UnitsTypeUomList(
           org.mule.module.netsuite.api.internal.UnitsTypeUom[] uom,
           boolean replaceAll) {
           this.uom = uom;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the uom value for this UnitsTypeUomList.
     * 
     * @return uom
     */
    public org.mule.module.netsuite.api.internal.UnitsTypeUom[] getUom() {
        return uom;
    }


    /**
     * Sets the uom value for this UnitsTypeUomList.
     * 
     * @param uom
     */
    public void setUom(org.mule.module.netsuite.api.internal.UnitsTypeUom[] uom) {
        this.uom = uom;
    }

    public org.mule.module.netsuite.api.internal.UnitsTypeUom getUom(int i) {
        return this.uom[i];
    }

    public void setUom(int i, org.mule.module.netsuite.api.internal.UnitsTypeUom _value) {
        this.uom[i] = _value;
    }


    /**
     * Gets the replaceAll value for this UnitsTypeUomList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this UnitsTypeUomList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnitsTypeUomList)) return false;
        UnitsTypeUomList other = (UnitsTypeUomList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uom==null && other.getUom()==null) || 
             (this.uom!=null &&
              java.util.Arrays.equals(this.uom, other.getUom()))) &&
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
        if (getUom() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUom());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUom(), i);
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
        new org.apache.axis.description.TypeDesc(UnitsTypeUomList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "UnitsTypeUomList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "uom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "UnitsTypeUom"));
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
