/**
 * ExclusionDateList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ExclusionDateList  implements java.io.Serializable {
    private java.util.Calendar[] exclusionDate;

    public ExclusionDateList() {
    }

    public ExclusionDateList(
           java.util.Calendar[] exclusionDate) {
           this.exclusionDate = exclusionDate;
    }


    /**
     * Gets the exclusionDate value for this ExclusionDateList.
     * 
     * @return exclusionDate
     */
    public java.util.Calendar[] getExclusionDate() {
        return exclusionDate;
    }


    /**
     * Sets the exclusionDate value for this ExclusionDateList.
     * 
     * @param exclusionDate
     */
    public void setExclusionDate(java.util.Calendar[] exclusionDate) {
        this.exclusionDate = exclusionDate;
    }

    public java.util.Calendar getExclusionDate(int i) {
        return this.exclusionDate[i];
    }

    public void setExclusionDate(int i, java.util.Calendar _value) {
        this.exclusionDate[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExclusionDateList)) return false;
        ExclusionDateList other = (ExclusionDateList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exclusionDate==null && other.getExclusionDate()==null) || 
             (this.exclusionDate!=null &&
              java.util.Arrays.equals(this.exclusionDate, other.getExclusionDate())));
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
        if (getExclusionDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExclusionDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExclusionDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExclusionDateList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "ExclusionDateList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exclusionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "exclusionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
