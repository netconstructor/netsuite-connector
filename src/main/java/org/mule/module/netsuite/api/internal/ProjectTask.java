/**
 * ProjectTask.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ProjectTask  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef customForm;

    private org.mule.module.netsuite.api.internal.RecordRef eventId;

    private java.lang.Double percentTimeComplete;

    private java.lang.String title;

    private org.mule.module.netsuite.api.internal.RecordRef company;

    private org.mule.module.netsuite.api.internal.RecordRef contact;

    private org.mule.module.netsuite.api.internal.RecordRef order;

    private org.mule.module.netsuite.api.internal.RecordRef owner;

    private org.mule.module.netsuite.api.internal.RecordRef parent;

    private org.mule.module.netsuite.api.internal.RecordRef priority;

    private java.lang.Double estimatedWork;

    private java.lang.Double estimatedWorkBaseline;

    private org.mule.module.netsuite.api.internal.ProjectTaskConstraintType constraintType;

    private java.util.Calendar startDate;

    private java.util.Calendar startDateBaseline;

    private java.util.Calendar endDate;

    private java.util.Calendar endDateBaseline;

    private java.lang.Double actualWork;

    private java.lang.Double remainingWork;

    private java.lang.String message;

    private org.mule.module.netsuite.api.internal.ProjectTaskStatus status;

    private org.mule.module.netsuite.api.internal.ProjectTaskAssigneeList assigneeList;

    private org.mule.module.netsuite.api.internal.ProjectTaskPredecessorList predecessorList;

    private org.mule.module.netsuite.api.internal.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public ProjectTask() {
    }

    public ProjectTask(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           org.mule.module.netsuite.api.internal.RecordRef customForm,
           org.mule.module.netsuite.api.internal.RecordRef eventId,
           java.lang.Double percentTimeComplete,
           java.lang.String title,
           org.mule.module.netsuite.api.internal.RecordRef company,
           org.mule.module.netsuite.api.internal.RecordRef contact,
           org.mule.module.netsuite.api.internal.RecordRef order,
           org.mule.module.netsuite.api.internal.RecordRef owner,
           org.mule.module.netsuite.api.internal.RecordRef parent,
           org.mule.module.netsuite.api.internal.RecordRef priority,
           java.lang.Double estimatedWork,
           java.lang.Double estimatedWorkBaseline,
           org.mule.module.netsuite.api.internal.ProjectTaskConstraintType constraintType,
           java.util.Calendar startDate,
           java.util.Calendar startDateBaseline,
           java.util.Calendar endDate,
           java.util.Calendar endDateBaseline,
           java.lang.Double actualWork,
           java.lang.Double remainingWork,
           java.lang.String message,
           org.mule.module.netsuite.api.internal.ProjectTaskStatus status,
           org.mule.module.netsuite.api.internal.ProjectTaskAssigneeList assigneeList,
           org.mule.module.netsuite.api.internal.ProjectTaskPredecessorList predecessorList,
           org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.eventId = eventId;
        this.percentTimeComplete = percentTimeComplete;
        this.title = title;
        this.company = company;
        this.contact = contact;
        this.order = order;
        this.owner = owner;
        this.parent = parent;
        this.priority = priority;
        this.estimatedWork = estimatedWork;
        this.estimatedWorkBaseline = estimatedWorkBaseline;
        this.constraintType = constraintType;
        this.startDate = startDate;
        this.startDateBaseline = startDateBaseline;
        this.endDate = endDate;
        this.endDateBaseline = endDateBaseline;
        this.actualWork = actualWork;
        this.remainingWork = remainingWork;
        this.message = message;
        this.status = status;
        this.assigneeList = assigneeList;
        this.predecessorList = predecessorList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the customForm value for this ProjectTask.
     * 
     * @return customForm
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this ProjectTask.
     * 
     * @param customForm
     */
    public void setCustomForm(org.mule.module.netsuite.api.internal.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the eventId value for this ProjectTask.
     * 
     * @return eventId
     */
    public org.mule.module.netsuite.api.internal.RecordRef getEventId() {
        return eventId;
    }


    /**
     * Sets the eventId value for this ProjectTask.
     * 
     * @param eventId
     */
    public void setEventId(org.mule.module.netsuite.api.internal.RecordRef eventId) {
        this.eventId = eventId;
    }


    /**
     * Gets the percentTimeComplete value for this ProjectTask.
     * 
     * @return percentTimeComplete
     */
    public java.lang.Double getPercentTimeComplete() {
        return percentTimeComplete;
    }


    /**
     * Sets the percentTimeComplete value for this ProjectTask.
     * 
     * @param percentTimeComplete
     */
    public void setPercentTimeComplete(java.lang.Double percentTimeComplete) {
        this.percentTimeComplete = percentTimeComplete;
    }


    /**
     * Gets the title value for this ProjectTask.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ProjectTask.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the company value for this ProjectTask.
     * 
     * @return company
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCompany() {
        return company;
    }


    /**
     * Sets the company value for this ProjectTask.
     * 
     * @param company
     */
    public void setCompany(org.mule.module.netsuite.api.internal.RecordRef company) {
        this.company = company;
    }


    /**
     * Gets the contact value for this ProjectTask.
     * 
     * @return contact
     */
    public org.mule.module.netsuite.api.internal.RecordRef getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this ProjectTask.
     * 
     * @param contact
     */
    public void setContact(org.mule.module.netsuite.api.internal.RecordRef contact) {
        this.contact = contact;
    }


    /**
     * Gets the order value for this ProjectTask.
     * 
     * @return order
     */
    public org.mule.module.netsuite.api.internal.RecordRef getOrder() {
        return order;
    }


    /**
     * Sets the order value for this ProjectTask.
     * 
     * @param order
     */
    public void setOrder(org.mule.module.netsuite.api.internal.RecordRef order) {
        this.order = order;
    }


    /**
     * Gets the owner value for this ProjectTask.
     * 
     * @return owner
     */
    public org.mule.module.netsuite.api.internal.RecordRef getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this ProjectTask.
     * 
     * @param owner
     */
    public void setOwner(org.mule.module.netsuite.api.internal.RecordRef owner) {
        this.owner = owner;
    }


    /**
     * Gets the parent value for this ProjectTask.
     * 
     * @return parent
     */
    public org.mule.module.netsuite.api.internal.RecordRef getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this ProjectTask.
     * 
     * @param parent
     */
    public void setParent(org.mule.module.netsuite.api.internal.RecordRef parent) {
        this.parent = parent;
    }


    /**
     * Gets the priority value for this ProjectTask.
     * 
     * @return priority
     */
    public org.mule.module.netsuite.api.internal.RecordRef getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this ProjectTask.
     * 
     * @param priority
     */
    public void setPriority(org.mule.module.netsuite.api.internal.RecordRef priority) {
        this.priority = priority;
    }


    /**
     * Gets the estimatedWork value for this ProjectTask.
     * 
     * @return estimatedWork
     */
    public java.lang.Double getEstimatedWork() {
        return estimatedWork;
    }


    /**
     * Sets the estimatedWork value for this ProjectTask.
     * 
     * @param estimatedWork
     */
    public void setEstimatedWork(java.lang.Double estimatedWork) {
        this.estimatedWork = estimatedWork;
    }


    /**
     * Gets the estimatedWorkBaseline value for this ProjectTask.
     * 
     * @return estimatedWorkBaseline
     */
    public java.lang.Double getEstimatedWorkBaseline() {
        return estimatedWorkBaseline;
    }


    /**
     * Sets the estimatedWorkBaseline value for this ProjectTask.
     * 
     * @param estimatedWorkBaseline
     */
    public void setEstimatedWorkBaseline(java.lang.Double estimatedWorkBaseline) {
        this.estimatedWorkBaseline = estimatedWorkBaseline;
    }


    /**
     * Gets the constraintType value for this ProjectTask.
     * 
     * @return constraintType
     */
    public org.mule.module.netsuite.api.internal.ProjectTaskConstraintType getConstraintType() {
        return constraintType;
    }


    /**
     * Sets the constraintType value for this ProjectTask.
     * 
     * @param constraintType
     */
    public void setConstraintType(org.mule.module.netsuite.api.internal.ProjectTaskConstraintType constraintType) {
        this.constraintType = constraintType;
    }


    /**
     * Gets the startDate value for this ProjectTask.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ProjectTask.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the startDateBaseline value for this ProjectTask.
     * 
     * @return startDateBaseline
     */
    public java.util.Calendar getStartDateBaseline() {
        return startDateBaseline;
    }


    /**
     * Sets the startDateBaseline value for this ProjectTask.
     * 
     * @param startDateBaseline
     */
    public void setStartDateBaseline(java.util.Calendar startDateBaseline) {
        this.startDateBaseline = startDateBaseline;
    }


    /**
     * Gets the endDate value for this ProjectTask.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ProjectTask.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the endDateBaseline value for this ProjectTask.
     * 
     * @return endDateBaseline
     */
    public java.util.Calendar getEndDateBaseline() {
        return endDateBaseline;
    }


    /**
     * Sets the endDateBaseline value for this ProjectTask.
     * 
     * @param endDateBaseline
     */
    public void setEndDateBaseline(java.util.Calendar endDateBaseline) {
        this.endDateBaseline = endDateBaseline;
    }


    /**
     * Gets the actualWork value for this ProjectTask.
     * 
     * @return actualWork
     */
    public java.lang.Double getActualWork() {
        return actualWork;
    }


    /**
     * Sets the actualWork value for this ProjectTask.
     * 
     * @param actualWork
     */
    public void setActualWork(java.lang.Double actualWork) {
        this.actualWork = actualWork;
    }


    /**
     * Gets the remainingWork value for this ProjectTask.
     * 
     * @return remainingWork
     */
    public java.lang.Double getRemainingWork() {
        return remainingWork;
    }


    /**
     * Sets the remainingWork value for this ProjectTask.
     * 
     * @param remainingWork
     */
    public void setRemainingWork(java.lang.Double remainingWork) {
        this.remainingWork = remainingWork;
    }


    /**
     * Gets the message value for this ProjectTask.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ProjectTask.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the status value for this ProjectTask.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.ProjectTaskStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProjectTask.
     * 
     * @param status
     */
    public void setStatus(org.mule.module.netsuite.api.internal.ProjectTaskStatus status) {
        this.status = status;
    }


    /**
     * Gets the assigneeList value for this ProjectTask.
     * 
     * @return assigneeList
     */
    public org.mule.module.netsuite.api.internal.ProjectTaskAssigneeList getAssigneeList() {
        return assigneeList;
    }


    /**
     * Sets the assigneeList value for this ProjectTask.
     * 
     * @param assigneeList
     */
    public void setAssigneeList(org.mule.module.netsuite.api.internal.ProjectTaskAssigneeList assigneeList) {
        this.assigneeList = assigneeList;
    }


    /**
     * Gets the predecessorList value for this ProjectTask.
     * 
     * @return predecessorList
     */
    public org.mule.module.netsuite.api.internal.ProjectTaskPredecessorList getPredecessorList() {
        return predecessorList;
    }


    /**
     * Sets the predecessorList value for this ProjectTask.
     * 
     * @param predecessorList
     */
    public void setPredecessorList(org.mule.module.netsuite.api.internal.ProjectTaskPredecessorList predecessorList) {
        this.predecessorList = predecessorList;
    }


    /**
     * Gets the customFieldList value for this ProjectTask.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ProjectTask.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this ProjectTask.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ProjectTask.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this ProjectTask.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ProjectTask.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectTask)) return false;
        ProjectTask other = (ProjectTask) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.eventId==null && other.getEventId()==null) || 
             (this.eventId!=null &&
              this.eventId.equals(other.getEventId()))) &&
            ((this.percentTimeComplete==null && other.getPercentTimeComplete()==null) || 
             (this.percentTimeComplete!=null &&
              this.percentTimeComplete.equals(other.getPercentTimeComplete()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              this.order.equals(other.getOrder()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.estimatedWork==null && other.getEstimatedWork()==null) || 
             (this.estimatedWork!=null &&
              this.estimatedWork.equals(other.getEstimatedWork()))) &&
            ((this.estimatedWorkBaseline==null && other.getEstimatedWorkBaseline()==null) || 
             (this.estimatedWorkBaseline!=null &&
              this.estimatedWorkBaseline.equals(other.getEstimatedWorkBaseline()))) &&
            ((this.constraintType==null && other.getConstraintType()==null) || 
             (this.constraintType!=null &&
              this.constraintType.equals(other.getConstraintType()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.startDateBaseline==null && other.getStartDateBaseline()==null) || 
             (this.startDateBaseline!=null &&
              this.startDateBaseline.equals(other.getStartDateBaseline()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.endDateBaseline==null && other.getEndDateBaseline()==null) || 
             (this.endDateBaseline!=null &&
              this.endDateBaseline.equals(other.getEndDateBaseline()))) &&
            ((this.actualWork==null && other.getActualWork()==null) || 
             (this.actualWork!=null &&
              this.actualWork.equals(other.getActualWork()))) &&
            ((this.remainingWork==null && other.getRemainingWork()==null) || 
             (this.remainingWork!=null &&
              this.remainingWork.equals(other.getRemainingWork()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.assigneeList==null && other.getAssigneeList()==null) || 
             (this.assigneeList!=null &&
              this.assigneeList.equals(other.getAssigneeList()))) &&
            ((this.predecessorList==null && other.getPredecessorList()==null) || 
             (this.predecessorList!=null &&
              this.predecessorList.equals(other.getPredecessorList()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId())));
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
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getEventId() != null) {
            _hashCode += getEventId().hashCode();
        }
        if (getPercentTimeComplete() != null) {
            _hashCode += getPercentTimeComplete().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getOrder() != null) {
            _hashCode += getOrder().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getEstimatedWork() != null) {
            _hashCode += getEstimatedWork().hashCode();
        }
        if (getEstimatedWorkBaseline() != null) {
            _hashCode += getEstimatedWorkBaseline().hashCode();
        }
        if (getConstraintType() != null) {
            _hashCode += getConstraintType().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStartDateBaseline() != null) {
            _hashCode += getStartDateBaseline().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEndDateBaseline() != null) {
            _hashCode += getEndDateBaseline().hashCode();
        }
        if (getActualWork() != null) {
            _hashCode += getActualWork().hashCode();
        }
        if (getRemainingWork() != null) {
            _hashCode += getRemainingWork().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getAssigneeList() != null) {
            _hashCode += getAssigneeList().hashCode();
        }
        if (getPredecessorList() != null) {
            _hashCode += getPredecessorList().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProjectTask.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "ProjectTask"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "externalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "eventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentTimeComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "percentTimeComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "order"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "estimatedWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedWorkBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "estimatedWorkBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("constraintType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "constraintType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "ProjectTaskConstraintType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "startDateBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "endDateBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "actualWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "remainingWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "ProjectTaskStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigneeList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "assigneeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "ProjectTaskAssigneeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predecessorList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "predecessorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "ProjectTaskPredecessorList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "CustomFieldList"));
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
