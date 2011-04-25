/**
 * CalendarEventAttendee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CalendarEventAttendee  implements java.io.Serializable {
    private java.lang.Boolean sendEmail;

    private org.mule.module.netsuite.api.internal.RecordRef attendee;

    private org.mule.module.netsuite.api.internal.CalendarEventAttendeeResponse response;

    private org.mule.module.netsuite.api.internal.CalendarEventAttendeeAttendance attendance;

    public CalendarEventAttendee() {
    }

    public CalendarEventAttendee(
           java.lang.Boolean sendEmail,
           org.mule.module.netsuite.api.internal.RecordRef attendee,
           org.mule.module.netsuite.api.internal.CalendarEventAttendeeResponse response,
           org.mule.module.netsuite.api.internal.CalendarEventAttendeeAttendance attendance) {
           this.sendEmail = sendEmail;
           this.attendee = attendee;
           this.response = response;
           this.attendance = attendance;
    }


    /**
     * Gets the sendEmail value for this CalendarEventAttendee.
     * 
     * @return sendEmail
     */
    public java.lang.Boolean getSendEmail() {
        return sendEmail;
    }


    /**
     * Sets the sendEmail value for this CalendarEventAttendee.
     * 
     * @param sendEmail
     */
    public void setSendEmail(java.lang.Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }


    /**
     * Gets the attendee value for this CalendarEventAttendee.
     * 
     * @return attendee
     */
    public org.mule.module.netsuite.api.internal.RecordRef getAttendee() {
        return attendee;
    }


    /**
     * Sets the attendee value for this CalendarEventAttendee.
     * 
     * @param attendee
     */
    public void setAttendee(org.mule.module.netsuite.api.internal.RecordRef attendee) {
        this.attendee = attendee;
    }


    /**
     * Gets the response value for this CalendarEventAttendee.
     * 
     * @return response
     */
    public org.mule.module.netsuite.api.internal.CalendarEventAttendeeResponse getResponse() {
        return response;
    }


    /**
     * Sets the response value for this CalendarEventAttendee.
     * 
     * @param response
     */
    public void setResponse(org.mule.module.netsuite.api.internal.CalendarEventAttendeeResponse response) {
        this.response = response;
    }


    /**
     * Gets the attendance value for this CalendarEventAttendee.
     * 
     * @return attendance
     */
    public org.mule.module.netsuite.api.internal.CalendarEventAttendeeAttendance getAttendance() {
        return attendance;
    }


    /**
     * Sets the attendance value for this CalendarEventAttendee.
     * 
     * @param attendance
     */
    public void setAttendance(org.mule.module.netsuite.api.internal.CalendarEventAttendeeAttendance attendance) {
        this.attendance = attendance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalendarEventAttendee)) return false;
        CalendarEventAttendee other = (CalendarEventAttendee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sendEmail==null && other.getSendEmail()==null) || 
             (this.sendEmail!=null &&
              this.sendEmail.equals(other.getSendEmail()))) &&
            ((this.attendee==null && other.getAttendee()==null) || 
             (this.attendee!=null &&
              this.attendee.equals(other.getAttendee()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse()))) &&
            ((this.attendance==null && other.getAttendance()==null) || 
             (this.attendance!=null &&
              this.attendance.equals(other.getAttendance())));
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
        if (getSendEmail() != null) {
            _hashCode += getSendEmail().hashCode();
        }
        if (getAttendee() != null) {
            _hashCode += getAttendee().hashCode();
        }
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        if (getAttendance() != null) {
            _hashCode += getAttendance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalendarEventAttendee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "CalendarEventAttendee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "sendEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attendee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "attendee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "CalendarEventAttendeeResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attendance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "attendance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "CalendarEventAttendeeAttendance"));
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
