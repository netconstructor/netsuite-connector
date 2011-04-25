/**
 * EmployeeRoles.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class EmployeeRoles  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef selectedRole;

    public EmployeeRoles() {
    }

    public EmployeeRoles(
           org.mule.module.netsuite.api.internal.RecordRef selectedRole) {
           this.selectedRole = selectedRole;
    }


    /**
     * Gets the selectedRole value for this EmployeeRoles.
     * 
     * @return selectedRole
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSelectedRole() {
        return selectedRole;
    }


    /**
     * Sets the selectedRole value for this EmployeeRoles.
     * 
     * @param selectedRole
     */
    public void setSelectedRole(org.mule.module.netsuite.api.internal.RecordRef selectedRole) {
        this.selectedRole = selectedRole;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeRoles)) return false;
        EmployeeRoles other = (EmployeeRoles) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.selectedRole==null && other.getSelectedRole()==null) || 
             (this.selectedRole!=null &&
              this.selectedRole.equals(other.getSelectedRole())));
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
        if (getSelectedRole() != null) {
            _hashCode += getSelectedRole().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmployeeRoles.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "EmployeeRoles"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectedRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "selectedRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
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
