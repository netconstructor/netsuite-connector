/**
 * EmployeeSubscriptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class EmployeeSubscriptions  implements java.io.Serializable {
    private java.lang.String subscribed;

    private java.lang.String subscription;

    private java.util.Calendar lastModifiedDate;

    public EmployeeSubscriptions() {
    }

    public EmployeeSubscriptions(
           java.lang.String subscribed,
           java.lang.String subscription,
           java.util.Calendar lastModifiedDate) {
           this.subscribed = subscribed;
           this.subscription = subscription;
           this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the subscribed value for this EmployeeSubscriptions.
     * 
     * @return subscribed
     */
    public java.lang.String getSubscribed() {
        return subscribed;
    }


    /**
     * Sets the subscribed value for this EmployeeSubscriptions.
     * 
     * @param subscribed
     */
    public void setSubscribed(java.lang.String subscribed) {
        this.subscribed = subscribed;
    }


    /**
     * Gets the subscription value for this EmployeeSubscriptions.
     * 
     * @return subscription
     */
    public java.lang.String getSubscription() {
        return subscription;
    }


    /**
     * Sets the subscription value for this EmployeeSubscriptions.
     * 
     * @param subscription
     */
    public void setSubscription(java.lang.String subscription) {
        this.subscription = subscription;
    }


    /**
     * Gets the lastModifiedDate value for this EmployeeSubscriptions.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this EmployeeSubscriptions.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeSubscriptions)) return false;
        EmployeeSubscriptions other = (EmployeeSubscriptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscribed==null && other.getSubscribed()==null) || 
             (this.subscribed!=null &&
              this.subscribed.equals(other.getSubscribed()))) &&
            ((this.subscription==null && other.getSubscription()==null) || 
             (this.subscription!=null &&
              this.subscription.equals(other.getSubscription()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate())));
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
        if (getSubscribed() != null) {
            _hashCode += getSubscribed().hashCode();
        }
        if (getSubscription() != null) {
            _hashCode += getSubscription().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmployeeSubscriptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "EmployeeSubscriptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscribed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "subscribed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "subscription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "lastModifiedDate"));
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
