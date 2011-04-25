/**
 * SupportCaseSolutions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SupportCaseSolutions  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef solution;

    private java.lang.String message;

    private java.util.Calendar dateApplied;

    public SupportCaseSolutions() {
    }

    public SupportCaseSolutions(
           org.mule.module.netsuite.api.internal.RecordRef solution,
           java.lang.String message,
           java.util.Calendar dateApplied) {
           this.solution = solution;
           this.message = message;
           this.dateApplied = dateApplied;
    }


    /**
     * Gets the solution value for this SupportCaseSolutions.
     * 
     * @return solution
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSolution() {
        return solution;
    }


    /**
     * Sets the solution value for this SupportCaseSolutions.
     * 
     * @param solution
     */
    public void setSolution(org.mule.module.netsuite.api.internal.RecordRef solution) {
        this.solution = solution;
    }


    /**
     * Gets the message value for this SupportCaseSolutions.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this SupportCaseSolutions.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the dateApplied value for this SupportCaseSolutions.
     * 
     * @return dateApplied
     */
    public java.util.Calendar getDateApplied() {
        return dateApplied;
    }


    /**
     * Sets the dateApplied value for this SupportCaseSolutions.
     * 
     * @param dateApplied
     */
    public void setDateApplied(java.util.Calendar dateApplied) {
        this.dateApplied = dateApplied;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupportCaseSolutions)) return false;
        SupportCaseSolutions other = (SupportCaseSolutions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.solution==null && other.getSolution()==null) || 
             (this.solution!=null &&
              this.solution.equals(other.getSolution()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.dateApplied==null && other.getDateApplied()==null) || 
             (this.dateApplied!=null &&
              this.dateApplied.equals(other.getDateApplied())));
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
        if (getSolution() != null) {
            _hashCode += getSolution().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getDateApplied() != null) {
            _hashCode += getDateApplied().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SupportCaseSolutions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SupportCaseSolutions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "solution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateApplied");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "dateApplied"));
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
