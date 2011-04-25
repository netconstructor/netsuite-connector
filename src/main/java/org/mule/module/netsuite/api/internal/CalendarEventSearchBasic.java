/**
 * CalendarEventSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CalendarEventSearchBasic  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchMultiSelectField attendee;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField calendar;

    private org.mule.module.netsuite.api.internal.SearchDateField completedDate;

    private org.mule.module.netsuite.api.internal.SearchDateField createdDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId;

    private org.mule.module.netsuite.api.internal.SearchStringField externalIdString;

    private org.mule.module.netsuite.api.internal.SearchDateField instanceStart;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId;

    private org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isUpcomingEvent;

    private org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate;

    private org.mule.module.netsuite.api.internal.SearchStringField location;

    private org.mule.module.netsuite.api.internal.SearchStringField message;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField organizer;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField owner;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField resource;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField response;

    private org.mule.module.netsuite.api.internal.SearchDateField startDate;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField status;

    private org.mule.module.netsuite.api.internal.SearchStringField title;

    private org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList;

    public CalendarEventSearchBasic() {
    }

    public CalendarEventSearchBasic(
           org.mule.module.netsuite.api.internal.SearchMultiSelectField attendee,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField calendar,
           org.mule.module.netsuite.api.internal.SearchDateField completedDate,
           org.mule.module.netsuite.api.internal.SearchDateField createdDate,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId,
           org.mule.module.netsuite.api.internal.SearchStringField externalIdString,
           org.mule.module.netsuite.api.internal.SearchDateField instanceStart,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId,
           org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber,
           org.mule.module.netsuite.api.internal.SearchBooleanField isUpcomingEvent,
           org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate,
           org.mule.module.netsuite.api.internal.SearchStringField location,
           org.mule.module.netsuite.api.internal.SearchStringField message,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField organizer,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField owner,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField resource,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField response,
           org.mule.module.netsuite.api.internal.SearchDateField startDate,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField status,
           org.mule.module.netsuite.api.internal.SearchStringField title,
           org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.attendee = attendee;
        this.calendar = calendar;
        this.completedDate = completedDate;
        this.createdDate = createdDate;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.instanceStart = instanceStart;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isUpcomingEvent = isUpcomingEvent;
        this.lastModifiedDate = lastModifiedDate;
        this.location = location;
        this.message = message;
        this.organizer = organizer;
        this.owner = owner;
        this.resource = resource;
        this.response = response;
        this.startDate = startDate;
        this.status = status;
        this.title = title;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the attendee value for this CalendarEventSearchBasic.
     * 
     * @return attendee
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getAttendee() {
        return attendee;
    }


    /**
     * Sets the attendee value for this CalendarEventSearchBasic.
     * 
     * @param attendee
     */
    public void setAttendee(org.mule.module.netsuite.api.internal.SearchMultiSelectField attendee) {
        this.attendee = attendee;
    }


    /**
     * Gets the calendar value for this CalendarEventSearchBasic.
     * 
     * @return calendar
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCalendar() {
        return calendar;
    }


    /**
     * Sets the calendar value for this CalendarEventSearchBasic.
     * 
     * @param calendar
     */
    public void setCalendar(org.mule.module.netsuite.api.internal.SearchMultiSelectField calendar) {
        this.calendar = calendar;
    }


    /**
     * Gets the completedDate value for this CalendarEventSearchBasic.
     * 
     * @return completedDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getCompletedDate() {
        return completedDate;
    }


    /**
     * Sets the completedDate value for this CalendarEventSearchBasic.
     * 
     * @param completedDate
     */
    public void setCompletedDate(org.mule.module.netsuite.api.internal.SearchDateField completedDate) {
        this.completedDate = completedDate;
    }


    /**
     * Gets the createdDate value for this CalendarEventSearchBasic.
     * 
     * @return createdDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CalendarEventSearchBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(org.mule.module.netsuite.api.internal.SearchDateField createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the externalId value for this CalendarEventSearchBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this CalendarEventSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this CalendarEventSearchBasic.
     * 
     * @return externalIdString
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this CalendarEventSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(org.mule.module.netsuite.api.internal.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the instanceStart value for this CalendarEventSearchBasic.
     * 
     * @return instanceStart
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getInstanceStart() {
        return instanceStart;
    }


    /**
     * Sets the instanceStart value for this CalendarEventSearchBasic.
     * 
     * @param instanceStart
     */
    public void setInstanceStart(org.mule.module.netsuite.api.internal.SearchDateField instanceStart) {
        this.instanceStart = instanceStart;
    }


    /**
     * Gets the internalId value for this CalendarEventSearchBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CalendarEventSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this CalendarEventSearchBasic.
     * 
     * @return internalIdNumber
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this CalendarEventSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isUpcomingEvent value for this CalendarEventSearchBasic.
     * 
     * @return isUpcomingEvent
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsUpcomingEvent() {
        return isUpcomingEvent;
    }


    /**
     * Sets the isUpcomingEvent value for this CalendarEventSearchBasic.
     * 
     * @param isUpcomingEvent
     */
    public void setIsUpcomingEvent(org.mule.module.netsuite.api.internal.SearchBooleanField isUpcomingEvent) {
        this.isUpcomingEvent = isUpcomingEvent;
    }


    /**
     * Gets the lastModifiedDate value for this CalendarEventSearchBasic.
     * 
     * @return lastModifiedDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CalendarEventSearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the location value for this CalendarEventSearchBasic.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getLocation() {
        return location;
    }


    /**
     * Sets the location value for this CalendarEventSearchBasic.
     * 
     * @param location
     */
    public void setLocation(org.mule.module.netsuite.api.internal.SearchStringField location) {
        this.location = location;
    }


    /**
     * Gets the message value for this CalendarEventSearchBasic.
     * 
     * @return message
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getMessage() {
        return message;
    }


    /**
     * Sets the message value for this CalendarEventSearchBasic.
     * 
     * @param message
     */
    public void setMessage(org.mule.module.netsuite.api.internal.SearchStringField message) {
        this.message = message;
    }


    /**
     * Gets the organizer value for this CalendarEventSearchBasic.
     * 
     * @return organizer
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getOrganizer() {
        return organizer;
    }


    /**
     * Sets the organizer value for this CalendarEventSearchBasic.
     * 
     * @param organizer
     */
    public void setOrganizer(org.mule.module.netsuite.api.internal.SearchMultiSelectField organizer) {
        this.organizer = organizer;
    }


    /**
     * Gets the owner value for this CalendarEventSearchBasic.
     * 
     * @return owner
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CalendarEventSearchBasic.
     * 
     * @param owner
     */
    public void setOwner(org.mule.module.netsuite.api.internal.SearchMultiSelectField owner) {
        this.owner = owner;
    }


    /**
     * Gets the resource value for this CalendarEventSearchBasic.
     * 
     * @return resource
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getResource() {
        return resource;
    }


    /**
     * Sets the resource value for this CalendarEventSearchBasic.
     * 
     * @param resource
     */
    public void setResource(org.mule.module.netsuite.api.internal.SearchMultiSelectField resource) {
        this.resource = resource;
    }


    /**
     * Gets the response value for this CalendarEventSearchBasic.
     * 
     * @return response
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getResponse() {
        return response;
    }


    /**
     * Sets the response value for this CalendarEventSearchBasic.
     * 
     * @param response
     */
    public void setResponse(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField response) {
        this.response = response;
    }


    /**
     * Gets the startDate value for this CalendarEventSearchBasic.
     * 
     * @return startDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CalendarEventSearchBasic.
     * 
     * @param startDate
     */
    public void setStartDate(org.mule.module.netsuite.api.internal.SearchDateField startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the status value for this CalendarEventSearchBasic.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CalendarEventSearchBasic.
     * 
     * @param status
     */
    public void setStatus(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField status) {
        this.status = status;
    }


    /**
     * Gets the title value for this CalendarEventSearchBasic.
     * 
     * @return title
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getTitle() {
        return title;
    }


    /**
     * Sets the title value for this CalendarEventSearchBasic.
     * 
     * @param title
     */
    public void setTitle(org.mule.module.netsuite.api.internal.SearchStringField title) {
        this.title = title;
    }


    /**
     * Gets the customFieldList value for this CalendarEventSearchBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CalendarEventSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalendarEventSearchBasic)) return false;
        CalendarEventSearchBasic other = (CalendarEventSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.attendee==null && other.getAttendee()==null) || 
             (this.attendee!=null &&
              this.attendee.equals(other.getAttendee()))) &&
            ((this.calendar==null && other.getCalendar()==null) || 
             (this.calendar!=null &&
              this.calendar.equals(other.getCalendar()))) &&
            ((this.completedDate==null && other.getCompletedDate()==null) || 
             (this.completedDate!=null &&
              this.completedDate.equals(other.getCompletedDate()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.instanceStart==null && other.getInstanceStart()==null) || 
             (this.instanceStart!=null &&
              this.instanceStart.equals(other.getInstanceStart()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isUpcomingEvent==null && other.getIsUpcomingEvent()==null) || 
             (this.isUpcomingEvent!=null &&
              this.isUpcomingEvent.equals(other.getIsUpcomingEvent()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.organizer==null && other.getOrganizer()==null) || 
             (this.organizer!=null &&
              this.organizer.equals(other.getOrganizer()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.resource==null && other.getResource()==null) || 
             (this.resource!=null &&
              this.resource.equals(other.getResource()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAttendee() != null) {
            _hashCode += getAttendee().hashCode();
        }
        if (getCalendar() != null) {
            _hashCode += getCalendar().hashCode();
        }
        if (getCompletedDate() != null) {
            _hashCode += getCompletedDate().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getInstanceStart() != null) {
            _hashCode += getInstanceStart().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsUpcomingEvent() != null) {
            _hashCode += getIsUpcomingEvent().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getOrganizer() != null) {
            _hashCode += getOrganizer().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getResource() != null) {
            _hashCode += getResource().hashCode();
        }
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalendarEventSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CalendarEventSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attendee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "attendee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calendar");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "calendar"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "completedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanceStart");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "instanceStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUpcomingEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isUpcomingEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "organizer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "resource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchCustomFieldList"));
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
