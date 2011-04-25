/**
 * CalendarEventAttendeeList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CalendarEventAttendeeList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.CalendarEventAttendee[] attendee;

    private boolean replaceAll;  // attribute

    public CalendarEventAttendeeList() {
    }

    public CalendarEventAttendeeList(
           org.mule.module.netsuite.api.internal.CalendarEventAttendee[] attendee,
           boolean replaceAll) {
           this.attendee = attendee;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the attendee value for this CalendarEventAttendeeList.
     * 
     * @return attendee
     */
    public org.mule.module.netsuite.api.internal.CalendarEventAttendee[] getAttendee() {
        return attendee;
    }


    /**
     * Sets the attendee value for this CalendarEventAttendeeList.
     * 
     * @param attendee
     */
    public void setAttendee(org.mule.module.netsuite.api.internal.CalendarEventAttendee[] attendee) {
        this.attendee = attendee;
    }

    public org.mule.module.netsuite.api.internal.CalendarEventAttendee getAttendee(int i) {
        return this.attendee[i];
    }

    public void setAttendee(int i, org.mule.module.netsuite.api.internal.CalendarEventAttendee _value) {
        this.attendee[i] = _value;
    }


    /**
     * Gets the replaceAll value for this CalendarEventAttendeeList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this CalendarEventAttendeeList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalendarEventAttendeeList)) return false;
        CalendarEventAttendeeList other = (CalendarEventAttendeeList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attendee==null && other.getAttendee()==null) || 
             (this.attendee!=null &&
              java.util.Arrays.equals(this.attendee, other.getAttendee()))) &&
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
        if (getAttendee() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttendee());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttendee(), i);
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
        new org.apache.axis.description.TypeDesc(CalendarEventAttendeeList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "CalendarEventAttendeeList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attendee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "attendee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "CalendarEventAttendee"));
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
