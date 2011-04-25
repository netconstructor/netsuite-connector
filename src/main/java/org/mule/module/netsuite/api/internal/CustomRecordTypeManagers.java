/**
 * CustomRecordTypeManagers.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomRecordTypeManagers  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef managerEmp;

    public CustomRecordTypeManagers() {
    }

    public CustomRecordTypeManagers(
           org.mule.module.netsuite.api.internal.RecordRef managerEmp) {
           this.managerEmp = managerEmp;
    }


    /**
     * Gets the managerEmp value for this CustomRecordTypeManagers.
     * 
     * @return managerEmp
     */
    public org.mule.module.netsuite.api.internal.RecordRef getManagerEmp() {
        return managerEmp;
    }


    /**
     * Sets the managerEmp value for this CustomRecordTypeManagers.
     * 
     * @param managerEmp
     */
    public void setManagerEmp(org.mule.module.netsuite.api.internal.RecordRef managerEmp) {
        this.managerEmp = managerEmp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomRecordTypeManagers)) return false;
        CustomRecordTypeManagers other = (CustomRecordTypeManagers) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.managerEmp==null && other.getManagerEmp()==null) || 
             (this.managerEmp!=null &&
              this.managerEmp.equals(other.getManagerEmp())));
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
        if (getManagerEmp() != null) {
            _hashCode += getManagerEmp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomRecordTypeManagers.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeManagers"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerEmp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "managerEmp"));
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
