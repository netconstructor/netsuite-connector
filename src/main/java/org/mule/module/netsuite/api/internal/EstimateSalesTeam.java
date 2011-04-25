/**
 * EstimateSalesTeam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class EstimateSalesTeam  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef employee;

    private org.mule.module.netsuite.api.internal.RecordRef salesRole;

    private java.lang.Boolean isPrimary;

    private java.lang.Double contribution;

    public EstimateSalesTeam() {
    }

    public EstimateSalesTeam(
           org.mule.module.netsuite.api.internal.RecordRef employee,
           org.mule.module.netsuite.api.internal.RecordRef salesRole,
           java.lang.Boolean isPrimary,
           java.lang.Double contribution) {
           this.employee = employee;
           this.salesRole = salesRole;
           this.isPrimary = isPrimary;
           this.contribution = contribution;
    }


    /**
     * Gets the employee value for this EstimateSalesTeam.
     * 
     * @return employee
     */
    public org.mule.module.netsuite.api.internal.RecordRef getEmployee() {
        return employee;
    }


    /**
     * Sets the employee value for this EstimateSalesTeam.
     * 
     * @param employee
     */
    public void setEmployee(org.mule.module.netsuite.api.internal.RecordRef employee) {
        this.employee = employee;
    }


    /**
     * Gets the salesRole value for this EstimateSalesTeam.
     * 
     * @return salesRole
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSalesRole() {
        return salesRole;
    }


    /**
     * Sets the salesRole value for this EstimateSalesTeam.
     * 
     * @param salesRole
     */
    public void setSalesRole(org.mule.module.netsuite.api.internal.RecordRef salesRole) {
        this.salesRole = salesRole;
    }


    /**
     * Gets the isPrimary value for this EstimateSalesTeam.
     * 
     * @return isPrimary
     */
    public java.lang.Boolean getIsPrimary() {
        return isPrimary;
    }


    /**
     * Sets the isPrimary value for this EstimateSalesTeam.
     * 
     * @param isPrimary
     */
    public void setIsPrimary(java.lang.Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }


    /**
     * Gets the contribution value for this EstimateSalesTeam.
     * 
     * @return contribution
     */
    public java.lang.Double getContribution() {
        return contribution;
    }


    /**
     * Sets the contribution value for this EstimateSalesTeam.
     * 
     * @param contribution
     */
    public void setContribution(java.lang.Double contribution) {
        this.contribution = contribution;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EstimateSalesTeam)) return false;
        EstimateSalesTeam other = (EstimateSalesTeam) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.employee==null && other.getEmployee()==null) || 
             (this.employee!=null &&
              this.employee.equals(other.getEmployee()))) &&
            ((this.salesRole==null && other.getSalesRole()==null) || 
             (this.salesRole!=null &&
              this.salesRole.equals(other.getSalesRole()))) &&
            ((this.isPrimary==null && other.getIsPrimary()==null) || 
             (this.isPrimary!=null &&
              this.isPrimary.equals(other.getIsPrimary()))) &&
            ((this.contribution==null && other.getContribution()==null) || 
             (this.contribution!=null &&
              this.contribution.equals(other.getContribution())));
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
        if (getEmployee() != null) {
            _hashCode += getEmployee().hashCode();
        }
        if (getSalesRole() != null) {
            _hashCode += getSalesRole().hashCode();
        }
        if (getIsPrimary() != null) {
            _hashCode += getIsPrimary().hashCode();
        }
        if (getContribution() != null) {
            _hashCode += getContribution().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EstimateSalesTeam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "EstimateSalesTeam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "employee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "salesRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPrimary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "isPrimary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contribution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "contribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
