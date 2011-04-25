/**
 * ProjectTaskSearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ProjectTaskSearchRow  extends org.mule.module.netsuite.api.internal.SearchRow  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.ProjectTaskSearchRowBasic basic;

    private org.mule.module.netsuite.api.internal.JobSearchRowBasic jobJoin;

    private org.mule.module.netsuite.api.internal.ProjectTaskAssignmentSearchRowBasic projectTaskAssignmentJoin;

    private org.mule.module.netsuite.api.internal.TimeBillSearchRowBasic timeJoin;

    private org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic userJoin;

    private org.mule.module.netsuite.api.internal.NoteSearchRowBasic userNotesJoin;

    public ProjectTaskSearchRow() {
    }

    public ProjectTaskSearchRow(
           org.mule.module.netsuite.api.internal.ProjectTaskSearchRowBasic basic,
           org.mule.module.netsuite.api.internal.JobSearchRowBasic jobJoin,
           org.mule.module.netsuite.api.internal.ProjectTaskAssignmentSearchRowBasic projectTaskAssignmentJoin,
           org.mule.module.netsuite.api.internal.TimeBillSearchRowBasic timeJoin,
           org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic userJoin,
           org.mule.module.netsuite.api.internal.NoteSearchRowBasic userNotesJoin) {
        this.basic = basic;
        this.jobJoin = jobJoin;
        this.projectTaskAssignmentJoin = projectTaskAssignmentJoin;
        this.timeJoin = timeJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
    }


    /**
     * Gets the basic value for this ProjectTaskSearchRow.
     * 
     * @return basic
     */
    public org.mule.module.netsuite.api.internal.ProjectTaskSearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this ProjectTaskSearchRow.
     * 
     * @param basic
     */
    public void setBasic(org.mule.module.netsuite.api.internal.ProjectTaskSearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the jobJoin value for this ProjectTaskSearchRow.
     * 
     * @return jobJoin
     */
    public org.mule.module.netsuite.api.internal.JobSearchRowBasic getJobJoin() {
        return jobJoin;
    }


    /**
     * Sets the jobJoin value for this ProjectTaskSearchRow.
     * 
     * @param jobJoin
     */
    public void setJobJoin(org.mule.module.netsuite.api.internal.JobSearchRowBasic jobJoin) {
        this.jobJoin = jobJoin;
    }


    /**
     * Gets the projectTaskAssignmentJoin value for this ProjectTaskSearchRow.
     * 
     * @return projectTaskAssignmentJoin
     */
    public org.mule.module.netsuite.api.internal.ProjectTaskAssignmentSearchRowBasic getProjectTaskAssignmentJoin() {
        return projectTaskAssignmentJoin;
    }


    /**
     * Sets the projectTaskAssignmentJoin value for this ProjectTaskSearchRow.
     * 
     * @param projectTaskAssignmentJoin
     */
    public void setProjectTaskAssignmentJoin(org.mule.module.netsuite.api.internal.ProjectTaskAssignmentSearchRowBasic projectTaskAssignmentJoin) {
        this.projectTaskAssignmentJoin = projectTaskAssignmentJoin;
    }


    /**
     * Gets the timeJoin value for this ProjectTaskSearchRow.
     * 
     * @return timeJoin
     */
    public org.mule.module.netsuite.api.internal.TimeBillSearchRowBasic getTimeJoin() {
        return timeJoin;
    }


    /**
     * Sets the timeJoin value for this ProjectTaskSearchRow.
     * 
     * @param timeJoin
     */
    public void setTimeJoin(org.mule.module.netsuite.api.internal.TimeBillSearchRowBasic timeJoin) {
        this.timeJoin = timeJoin;
    }


    /**
     * Gets the userJoin value for this ProjectTaskSearchRow.
     * 
     * @return userJoin
     */
    public org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this ProjectTaskSearchRow.
     * 
     * @param userJoin
     */
    public void setUserJoin(org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the userNotesJoin value for this ProjectTaskSearchRow.
     * 
     * @return userNotesJoin
     */
    public org.mule.module.netsuite.api.internal.NoteSearchRowBasic getUserNotesJoin() {
        return userNotesJoin;
    }


    /**
     * Sets the userNotesJoin value for this ProjectTaskSearchRow.
     * 
     * @param userNotesJoin
     */
    public void setUserNotesJoin(org.mule.module.netsuite.api.internal.NoteSearchRowBasic userNotesJoin) {
        this.userNotesJoin = userNotesJoin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectTaskSearchRow)) return false;
        ProjectTaskSearchRow other = (ProjectTaskSearchRow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.basic==null && other.getBasic()==null) || 
             (this.basic!=null &&
              this.basic.equals(other.getBasic()))) &&
            ((this.jobJoin==null && other.getJobJoin()==null) || 
             (this.jobJoin!=null &&
              this.jobJoin.equals(other.getJobJoin()))) &&
            ((this.projectTaskAssignmentJoin==null && other.getProjectTaskAssignmentJoin()==null) || 
             (this.projectTaskAssignmentJoin!=null &&
              this.projectTaskAssignmentJoin.equals(other.getProjectTaskAssignmentJoin()))) &&
            ((this.timeJoin==null && other.getTimeJoin()==null) || 
             (this.timeJoin!=null &&
              this.timeJoin.equals(other.getTimeJoin()))) &&
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin()))) &&
            ((this.userNotesJoin==null && other.getUserNotesJoin()==null) || 
             (this.userNotesJoin!=null &&
              this.userNotesJoin.equals(other.getUserNotesJoin())));
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
        if (getBasic() != null) {
            _hashCode += getBasic().hashCode();
        }
        if (getJobJoin() != null) {
            _hashCode += getJobJoin().hashCode();
        }
        if (getProjectTaskAssignmentJoin() != null) {
            _hashCode += getProjectTaskAssignmentJoin().hashCode();
        }
        if (getTimeJoin() != null) {
            _hashCode += getTimeJoin().hashCode();
        }
        if (getUserJoin() != null) {
            _hashCode += getUserJoin().hashCode();
        }
        if (getUserNotesJoin() != null) {
            _hashCode += getUserNotesJoin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProjectTaskSearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "ProjectTaskSearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ProjectTaskSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "jobJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "JobSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectTaskAssignmentJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "projectTaskAssignmentJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ProjectTaskAssignmentSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "timeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TimeBillSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "NoteSearchRowBasic"));
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
