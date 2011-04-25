/**
 * ProjectTaskAssigneeList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ProjectTaskAssigneeList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.ProjectTaskAssignee[] projectTaskAssignee;

    private boolean replaceAll;  // attribute

    public ProjectTaskAssigneeList() {
    }

    public ProjectTaskAssigneeList(
           org.mule.module.netsuite.api.internal.ProjectTaskAssignee[] projectTaskAssignee,
           boolean replaceAll) {
           this.projectTaskAssignee = projectTaskAssignee;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the projectTaskAssignee value for this ProjectTaskAssigneeList.
     * 
     * @return projectTaskAssignee
     */
    public org.mule.module.netsuite.api.internal.ProjectTaskAssignee[] getProjectTaskAssignee() {
        return projectTaskAssignee;
    }


    /**
     * Sets the projectTaskAssignee value for this ProjectTaskAssigneeList.
     * 
     * @param projectTaskAssignee
     */
    public void setProjectTaskAssignee(org.mule.module.netsuite.api.internal.ProjectTaskAssignee[] projectTaskAssignee) {
        this.projectTaskAssignee = projectTaskAssignee;
    }

    public org.mule.module.netsuite.api.internal.ProjectTaskAssignee getProjectTaskAssignee(int i) {
        return this.projectTaskAssignee[i];
    }

    public void setProjectTaskAssignee(int i, org.mule.module.netsuite.api.internal.ProjectTaskAssignee _value) {
        this.projectTaskAssignee[i] = _value;
    }


    /**
     * Gets the replaceAll value for this ProjectTaskAssigneeList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this ProjectTaskAssigneeList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectTaskAssigneeList)) return false;
        ProjectTaskAssigneeList other = (ProjectTaskAssigneeList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.projectTaskAssignee==null && other.getProjectTaskAssignee()==null) || 
             (this.projectTaskAssignee!=null &&
              java.util.Arrays.equals(this.projectTaskAssignee, other.getProjectTaskAssignee()))) &&
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
        if (getProjectTaskAssignee() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjectTaskAssignee());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjectTaskAssignee(), i);
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
        new org.apache.axis.description.TypeDesc(ProjectTaskAssigneeList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "ProjectTaskAssigneeList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectTaskAssignee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "projectTaskAssignee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "ProjectTaskAssignee"));
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
