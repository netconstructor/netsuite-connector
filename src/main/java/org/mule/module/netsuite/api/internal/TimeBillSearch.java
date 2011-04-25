/**
 * TimeBillSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class TimeBillSearch  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.TimeBillSearchBasic basic;

    private org.mule.module.netsuite.api.internal.PhoneCallSearchBasic callJoin;

    private org.mule.module.netsuite.api.internal.SupportCaseSearchBasic caseJoin;

    private org.mule.module.netsuite.api.internal.CustomerSearchBasic customerJoin;

    private org.mule.module.netsuite.api.internal.EmployeeSearchBasic employeeJoin;

    private org.mule.module.netsuite.api.internal.CalendarEventSearchBasic eventJoin;

    private org.mule.module.netsuite.api.internal.ItemSearchBasic itemJoin;

    private org.mule.module.netsuite.api.internal.JobSearchBasic jobJoin;

    private org.mule.module.netsuite.api.internal.ProjectTaskSearchBasic projectTaskJoin;

    private org.mule.module.netsuite.api.internal.TaskSearchBasic taskJoin;

    private org.mule.module.netsuite.api.internal.EmployeeSearchBasic userJoin;

    public TimeBillSearch() {
    }

    public TimeBillSearch(
           org.mule.module.netsuite.api.internal.TimeBillSearchBasic basic,
           org.mule.module.netsuite.api.internal.PhoneCallSearchBasic callJoin,
           org.mule.module.netsuite.api.internal.SupportCaseSearchBasic caseJoin,
           org.mule.module.netsuite.api.internal.CustomerSearchBasic customerJoin,
           org.mule.module.netsuite.api.internal.EmployeeSearchBasic employeeJoin,
           org.mule.module.netsuite.api.internal.CalendarEventSearchBasic eventJoin,
           org.mule.module.netsuite.api.internal.ItemSearchBasic itemJoin,
           org.mule.module.netsuite.api.internal.JobSearchBasic jobJoin,
           org.mule.module.netsuite.api.internal.ProjectTaskSearchBasic projectTaskJoin,
           org.mule.module.netsuite.api.internal.TaskSearchBasic taskJoin,
           org.mule.module.netsuite.api.internal.EmployeeSearchBasic userJoin) {
        this.basic = basic;
        this.callJoin = callJoin;
        this.caseJoin = caseJoin;
        this.customerJoin = customerJoin;
        this.employeeJoin = employeeJoin;
        this.eventJoin = eventJoin;
        this.itemJoin = itemJoin;
        this.jobJoin = jobJoin;
        this.projectTaskJoin = projectTaskJoin;
        this.taskJoin = taskJoin;
        this.userJoin = userJoin;
    }


    /**
     * Gets the basic value for this TimeBillSearch.
     * 
     * @return basic
     */
    public org.mule.module.netsuite.api.internal.TimeBillSearchBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this TimeBillSearch.
     * 
     * @param basic
     */
    public void setBasic(org.mule.module.netsuite.api.internal.TimeBillSearchBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the callJoin value for this TimeBillSearch.
     * 
     * @return callJoin
     */
    public org.mule.module.netsuite.api.internal.PhoneCallSearchBasic getCallJoin() {
        return callJoin;
    }


    /**
     * Sets the callJoin value for this TimeBillSearch.
     * 
     * @param callJoin
     */
    public void setCallJoin(org.mule.module.netsuite.api.internal.PhoneCallSearchBasic callJoin) {
        this.callJoin = callJoin;
    }


    /**
     * Gets the caseJoin value for this TimeBillSearch.
     * 
     * @return caseJoin
     */
    public org.mule.module.netsuite.api.internal.SupportCaseSearchBasic getCaseJoin() {
        return caseJoin;
    }


    /**
     * Sets the caseJoin value for this TimeBillSearch.
     * 
     * @param caseJoin
     */
    public void setCaseJoin(org.mule.module.netsuite.api.internal.SupportCaseSearchBasic caseJoin) {
        this.caseJoin = caseJoin;
    }


    /**
     * Gets the customerJoin value for this TimeBillSearch.
     * 
     * @return customerJoin
     */
    public org.mule.module.netsuite.api.internal.CustomerSearchBasic getCustomerJoin() {
        return customerJoin;
    }


    /**
     * Sets the customerJoin value for this TimeBillSearch.
     * 
     * @param customerJoin
     */
    public void setCustomerJoin(org.mule.module.netsuite.api.internal.CustomerSearchBasic customerJoin) {
        this.customerJoin = customerJoin;
    }


    /**
     * Gets the employeeJoin value for this TimeBillSearch.
     * 
     * @return employeeJoin
     */
    public org.mule.module.netsuite.api.internal.EmployeeSearchBasic getEmployeeJoin() {
        return employeeJoin;
    }


    /**
     * Sets the employeeJoin value for this TimeBillSearch.
     * 
     * @param employeeJoin
     */
    public void setEmployeeJoin(org.mule.module.netsuite.api.internal.EmployeeSearchBasic employeeJoin) {
        this.employeeJoin = employeeJoin;
    }


    /**
     * Gets the eventJoin value for this TimeBillSearch.
     * 
     * @return eventJoin
     */
    public org.mule.module.netsuite.api.internal.CalendarEventSearchBasic getEventJoin() {
        return eventJoin;
    }


    /**
     * Sets the eventJoin value for this TimeBillSearch.
     * 
     * @param eventJoin
     */
    public void setEventJoin(org.mule.module.netsuite.api.internal.CalendarEventSearchBasic eventJoin) {
        this.eventJoin = eventJoin;
    }


    /**
     * Gets the itemJoin value for this TimeBillSearch.
     * 
     * @return itemJoin
     */
    public org.mule.module.netsuite.api.internal.ItemSearchBasic getItemJoin() {
        return itemJoin;
    }


    /**
     * Sets the itemJoin value for this TimeBillSearch.
     * 
     * @param itemJoin
     */
    public void setItemJoin(org.mule.module.netsuite.api.internal.ItemSearchBasic itemJoin) {
        this.itemJoin = itemJoin;
    }


    /**
     * Gets the jobJoin value for this TimeBillSearch.
     * 
     * @return jobJoin
     */
    public org.mule.module.netsuite.api.internal.JobSearchBasic getJobJoin() {
        return jobJoin;
    }


    /**
     * Sets the jobJoin value for this TimeBillSearch.
     * 
     * @param jobJoin
     */
    public void setJobJoin(org.mule.module.netsuite.api.internal.JobSearchBasic jobJoin) {
        this.jobJoin = jobJoin;
    }


    /**
     * Gets the projectTaskJoin value for this TimeBillSearch.
     * 
     * @return projectTaskJoin
     */
    public org.mule.module.netsuite.api.internal.ProjectTaskSearchBasic getProjectTaskJoin() {
        return projectTaskJoin;
    }


    /**
     * Sets the projectTaskJoin value for this TimeBillSearch.
     * 
     * @param projectTaskJoin
     */
    public void setProjectTaskJoin(org.mule.module.netsuite.api.internal.ProjectTaskSearchBasic projectTaskJoin) {
        this.projectTaskJoin = projectTaskJoin;
    }


    /**
     * Gets the taskJoin value for this TimeBillSearch.
     * 
     * @return taskJoin
     */
    public org.mule.module.netsuite.api.internal.TaskSearchBasic getTaskJoin() {
        return taskJoin;
    }


    /**
     * Sets the taskJoin value for this TimeBillSearch.
     * 
     * @param taskJoin
     */
    public void setTaskJoin(org.mule.module.netsuite.api.internal.TaskSearchBasic taskJoin) {
        this.taskJoin = taskJoin;
    }


    /**
     * Gets the userJoin value for this TimeBillSearch.
     * 
     * @return userJoin
     */
    public org.mule.module.netsuite.api.internal.EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this TimeBillSearch.
     * 
     * @param userJoin
     */
    public void setUserJoin(org.mule.module.netsuite.api.internal.EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeBillSearch)) return false;
        TimeBillSearch other = (TimeBillSearch) obj;
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
            ((this.callJoin==null && other.getCallJoin()==null) || 
             (this.callJoin!=null &&
              this.callJoin.equals(other.getCallJoin()))) &&
            ((this.caseJoin==null && other.getCaseJoin()==null) || 
             (this.caseJoin!=null &&
              this.caseJoin.equals(other.getCaseJoin()))) &&
            ((this.customerJoin==null && other.getCustomerJoin()==null) || 
             (this.customerJoin!=null &&
              this.customerJoin.equals(other.getCustomerJoin()))) &&
            ((this.employeeJoin==null && other.getEmployeeJoin()==null) || 
             (this.employeeJoin!=null &&
              this.employeeJoin.equals(other.getEmployeeJoin()))) &&
            ((this.eventJoin==null && other.getEventJoin()==null) || 
             (this.eventJoin!=null &&
              this.eventJoin.equals(other.getEventJoin()))) &&
            ((this.itemJoin==null && other.getItemJoin()==null) || 
             (this.itemJoin!=null &&
              this.itemJoin.equals(other.getItemJoin()))) &&
            ((this.jobJoin==null && other.getJobJoin()==null) || 
             (this.jobJoin!=null &&
              this.jobJoin.equals(other.getJobJoin()))) &&
            ((this.projectTaskJoin==null && other.getProjectTaskJoin()==null) || 
             (this.projectTaskJoin!=null &&
              this.projectTaskJoin.equals(other.getProjectTaskJoin()))) &&
            ((this.taskJoin==null && other.getTaskJoin()==null) || 
             (this.taskJoin!=null &&
              this.taskJoin.equals(other.getTaskJoin()))) &&
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin())));
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
        if (getCallJoin() != null) {
            _hashCode += getCallJoin().hashCode();
        }
        if (getCaseJoin() != null) {
            _hashCode += getCaseJoin().hashCode();
        }
        if (getCustomerJoin() != null) {
            _hashCode += getCustomerJoin().hashCode();
        }
        if (getEmployeeJoin() != null) {
            _hashCode += getEmployeeJoin().hashCode();
        }
        if (getEventJoin() != null) {
            _hashCode += getEventJoin().hashCode();
        }
        if (getItemJoin() != null) {
            _hashCode += getItemJoin().hashCode();
        }
        if (getJobJoin() != null) {
            _hashCode += getJobJoin().hashCode();
        }
        if (getProjectTaskJoin() != null) {
            _hashCode += getProjectTaskJoin().hashCode();
        }
        if (getTaskJoin() != null) {
            _hashCode += getTaskJoin().hashCode();
        }
        if (getUserJoin() != null) {
            _hashCode += getUserJoin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeBillSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2010_2.transactions.webservices.netsuite.com", "TimeBillSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.transactions.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TimeBillSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.transactions.webservices.netsuite.com", "callJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "PhoneCallSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.transactions.webservices.netsuite.com", "caseJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "SupportCaseSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.transactions.webservices.netsuite.com", "customerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CustomerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.transactions.webservices.netsuite.com", "employeeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.transactions.webservices.netsuite.com", "eventJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CalendarEventSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.transactions.webservices.netsuite.com", "itemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ItemSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.transactions.webservices.netsuite.com", "jobJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "JobSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectTaskJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.transactions.webservices.netsuite.com", "projectTaskJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ProjectTaskSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.transactions.webservices.netsuite.com", "taskJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TaskSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.transactions.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
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
