/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.transactions.employees_2010_2;

import com.netsuite.webservices.platform.common_2010_2.CalendarEventSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.CustomerSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.ItemSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.JobSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.PhoneCallSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.ProjectTaskSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.SupportCaseSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.TaskSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.TimeBillSearchRowBasic;
import com.netsuite.webservices.platform.core_2010_2.SearchRow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeBillSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeBillSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2010_2.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2010_2.platform.webservices.netsuite.com}TimeBillSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="callJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}PhoneCallSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="caseJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}SupportCaseSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="customerJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}CustomerSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="employeeJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="eventJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}CalendarEventSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="itemJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="jobJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}JobSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="projectTaskJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}ProjectTaskSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="taskJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TaskSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeBillSearchRow", propOrder = {
    "basic",
    "callJoin",
    "caseJoin",
    "customerJoin",
    "employeeJoin",
    "eventJoin",
    "itemJoin",
    "jobJoin",
    "projectTaskJoin",
    "taskJoin",
    "userJoin"
})
public class TimeBillSearchRow
    extends SearchRow
{

    protected TimeBillSearchRowBasic basic;
    protected PhoneCallSearchRowBasic callJoin;
    protected SupportCaseSearchRowBasic caseJoin;
    protected CustomerSearchRowBasic customerJoin;
    protected EmployeeSearchRowBasic employeeJoin;
    protected CalendarEventSearchRowBasic eventJoin;
    protected ItemSearchRowBasic itemJoin;
    protected JobSearchRowBasic jobJoin;
    protected ProjectTaskSearchRowBasic projectTaskJoin;
    protected TaskSearchRowBasic taskJoin;
    protected EmployeeSearchRowBasic userJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link TimeBillSearchRowBasic }
     *     
     */
    public TimeBillSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeBillSearchRowBasic }
     *     
     */
    public void setBasic(TimeBillSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the callJoin property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneCallSearchRowBasic }
     *     
     */
    public PhoneCallSearchRowBasic getCallJoin() {
        return callJoin;
    }

    /**
     * Sets the value of the callJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneCallSearchRowBasic }
     *     
     */
    public void setCallJoin(PhoneCallSearchRowBasic value) {
        this.callJoin = value;
    }

    /**
     * Gets the value of the caseJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SupportCaseSearchRowBasic }
     *     
     */
    public SupportCaseSearchRowBasic getCaseJoin() {
        return caseJoin;
    }

    /**
     * Sets the value of the caseJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportCaseSearchRowBasic }
     *     
     */
    public void setCaseJoin(SupportCaseSearchRowBasic value) {
        this.caseJoin = value;
    }

    /**
     * Gets the value of the customerJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public CustomerSearchRowBasic getCustomerJoin() {
        return customerJoin;
    }

    /**
     * Sets the value of the customerJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public void setCustomerJoin(CustomerSearchRowBasic value) {
        this.customerJoin = value;
    }

    /**
     * Gets the value of the employeeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getEmployeeJoin() {
        return employeeJoin;
    }

    /**
     * Sets the value of the employeeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setEmployeeJoin(EmployeeSearchRowBasic value) {
        this.employeeJoin = value;
    }

    /**
     * Gets the value of the eventJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventSearchRowBasic }
     *     
     */
    public CalendarEventSearchRowBasic getEventJoin() {
        return eventJoin;
    }

    /**
     * Sets the value of the eventJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventSearchRowBasic }
     *     
     */
    public void setEventJoin(CalendarEventSearchRowBasic value) {
        this.eventJoin = value;
    }

    /**
     * Gets the value of the itemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getItemJoin() {
        return itemJoin;
    }

    /**
     * Sets the value of the itemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setItemJoin(ItemSearchRowBasic value) {
        this.itemJoin = value;
    }

    /**
     * Gets the value of the jobJoin property.
     * 
     * @return
     *     possible object is
     *     {@link JobSearchRowBasic }
     *     
     */
    public JobSearchRowBasic getJobJoin() {
        return jobJoin;
    }

    /**
     * Sets the value of the jobJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchRowBasic }
     *     
     */
    public void setJobJoin(JobSearchRowBasic value) {
        this.jobJoin = value;
    }

    /**
     * Gets the value of the projectTaskJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskSearchRowBasic }
     *     
     */
    public ProjectTaskSearchRowBasic getProjectTaskJoin() {
        return projectTaskJoin;
    }

    /**
     * Sets the value of the projectTaskJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskSearchRowBasic }
     *     
     */
    public void setProjectTaskJoin(ProjectTaskSearchRowBasic value) {
        this.projectTaskJoin = value;
    }

    /**
     * Gets the value of the taskJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TaskSearchRowBasic }
     *     
     */
    public TaskSearchRowBasic getTaskJoin() {
        return taskJoin;
    }

    /**
     * Sets the value of the taskJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskSearchRowBasic }
     *     
     */
    public void setTaskJoin(TaskSearchRowBasic value) {
        this.taskJoin = value;
    }

    /**
     * Gets the value of the userJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }

    /**
     * Sets the value of the userJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchRowBasic value) {
        this.userJoin = value;
    }

}
