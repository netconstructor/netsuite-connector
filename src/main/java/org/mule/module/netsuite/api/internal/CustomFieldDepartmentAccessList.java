/**
 * CustomFieldDepartmentAccessList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomFieldDepartmentAccessList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.CustomFieldDepartmentAccess[] deptAccess;

    private boolean replaceAll;  // attribute

    public CustomFieldDepartmentAccessList() {
    }

    public CustomFieldDepartmentAccessList(
           org.mule.module.netsuite.api.internal.CustomFieldDepartmentAccess[] deptAccess,
           boolean replaceAll) {
           this.deptAccess = deptAccess;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the deptAccess value for this CustomFieldDepartmentAccessList.
     * 
     * @return deptAccess
     */
    public org.mule.module.netsuite.api.internal.CustomFieldDepartmentAccess[] getDeptAccess() {
        return deptAccess;
    }


    /**
     * Sets the deptAccess value for this CustomFieldDepartmentAccessList.
     * 
     * @param deptAccess
     */
    public void setDeptAccess(org.mule.module.netsuite.api.internal.CustomFieldDepartmentAccess[] deptAccess) {
        this.deptAccess = deptAccess;
    }

    public org.mule.module.netsuite.api.internal.CustomFieldDepartmentAccess getDeptAccess(int i) {
        return this.deptAccess[i];
    }

    public void setDeptAccess(int i, org.mule.module.netsuite.api.internal.CustomFieldDepartmentAccess _value) {
        this.deptAccess[i] = _value;
    }


    /**
     * Gets the replaceAll value for this CustomFieldDepartmentAccessList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this CustomFieldDepartmentAccessList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomFieldDepartmentAccessList)) return false;
        CustomFieldDepartmentAccessList other = (CustomFieldDepartmentAccessList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deptAccess==null && other.getDeptAccess()==null) || 
             (this.deptAccess!=null &&
              java.util.Arrays.equals(this.deptAccess, other.getDeptAccess()))) &&
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
        if (getDeptAccess() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeptAccess());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeptAccess(), i);
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
        new org.apache.axis.description.TypeDesc(CustomFieldDepartmentAccessList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomFieldDepartmentAccessList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deptAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "deptAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomFieldDepartmentAccess"));
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
