/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.lists.relationships_2010_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2010_2.ContactSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.CustomerSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.JobSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.ProjectTaskSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.TaskSearchRowBasic;
import com.netsuite.webservices.platform.core_2010_2.SearchRow;


/**
 * <p>Java class for JobSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2010_2.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2010_2.platform.webservices.netsuite.com}JobSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="contactPrimaryJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}ContactSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="customerJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}CustomerSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="projectTaskJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}ProjectTaskSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="taskJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TaskSearchRowBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobSearchRow", propOrder = {
    "basic",
    "contactPrimaryJoin",
    "customerJoin",
    "projectTaskJoin",
    "taskJoin"
})
public class JobSearchRow
    extends SearchRow
{

    protected JobSearchRowBasic basic;
    protected ContactSearchRowBasic contactPrimaryJoin;
    protected CustomerSearchRowBasic customerJoin;
    protected ProjectTaskSearchRowBasic projectTaskJoin;
    protected TaskSearchRowBasic taskJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link JobSearchRowBasic }
     *     
     */
    public JobSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchRowBasic }
     *     
     */
    public void setBasic(JobSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the contactPrimaryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public ContactSearchRowBasic getContactPrimaryJoin() {
        return contactPrimaryJoin;
    }

    /**
     * Sets the value of the contactPrimaryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public void setContactPrimaryJoin(ContactSearchRowBasic value) {
        this.contactPrimaryJoin = value;
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

}
