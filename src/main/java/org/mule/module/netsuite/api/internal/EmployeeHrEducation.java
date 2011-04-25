/**
 * EmployeeHrEducation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class EmployeeHrEducation  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef education;

    private java.lang.String degree;

    private java.util.Calendar degreeDate;

    public EmployeeHrEducation() {
    }

    public EmployeeHrEducation(
           org.mule.module.netsuite.api.internal.RecordRef education,
           java.lang.String degree,
           java.util.Calendar degreeDate) {
           this.education = education;
           this.degree = degree;
           this.degreeDate = degreeDate;
    }


    /**
     * Gets the education value for this EmployeeHrEducation.
     * 
     * @return education
     */
    public org.mule.module.netsuite.api.internal.RecordRef getEducation() {
        return education;
    }


    /**
     * Sets the education value for this EmployeeHrEducation.
     * 
     * @param education
     */
    public void setEducation(org.mule.module.netsuite.api.internal.RecordRef education) {
        this.education = education;
    }


    /**
     * Gets the degree value for this EmployeeHrEducation.
     * 
     * @return degree
     */
    public java.lang.String getDegree() {
        return degree;
    }


    /**
     * Sets the degree value for this EmployeeHrEducation.
     * 
     * @param degree
     */
    public void setDegree(java.lang.String degree) {
        this.degree = degree;
    }


    /**
     * Gets the degreeDate value for this EmployeeHrEducation.
     * 
     * @return degreeDate
     */
    public java.util.Calendar getDegreeDate() {
        return degreeDate;
    }


    /**
     * Sets the degreeDate value for this EmployeeHrEducation.
     * 
     * @param degreeDate
     */
    public void setDegreeDate(java.util.Calendar degreeDate) {
        this.degreeDate = degreeDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeHrEducation)) return false;
        EmployeeHrEducation other = (EmployeeHrEducation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.education==null && other.getEducation()==null) || 
             (this.education!=null &&
              this.education.equals(other.getEducation()))) &&
            ((this.degree==null && other.getDegree()==null) || 
             (this.degree!=null &&
              this.degree.equals(other.getDegree()))) &&
            ((this.degreeDate==null && other.getDegreeDate()==null) || 
             (this.degreeDate!=null &&
              this.degreeDate.equals(other.getDegreeDate())));
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
        if (getEducation() != null) {
            _hashCode += getEducation().hashCode();
        }
        if (getDegree() != null) {
            _hashCode += getDegree().hashCode();
        }
        if (getDegreeDate() != null) {
            _hashCode += getDegreeDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmployeeHrEducation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "EmployeeHrEducation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("education");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "education"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("degree");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "degree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("degreeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "degreeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
