
package com.netsuite.webservices.platform.common_2010_2;

import com.netsuite.webservices.platform.core_2010_2.SearchColumnBooleanField;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnCustomFieldList;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnDateField;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnDoubleField;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnEnumSelectField;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnLongField;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnSelectField;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnStringField;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectTaskSearchRowBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectTaskSearchRowBasic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actualWork" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="company" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="constrainttype" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contact" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cost" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="costBase" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="costBaseBaseline" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="costBaseline" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="costBaseVariance" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="costVariance" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="costVariancePercent" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="endDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="endDateBaseline" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="endDateVariance" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="estimatedWork" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="estimatedWorkBaseline" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="estimatedWorkVariance" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="estimatedWorkVariancePercent" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="internalId" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isSummaryTask" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="message" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="owner" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parent" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="percentWorkComplete" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="predecessors" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="priority" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="remainingWork" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startDateBaseline" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startDateVariance" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="title" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customFieldList" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnCustomFieldList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectTaskSearchRowBasic", propOrder = {
    "actualWork",
    "company",
    "constrainttype",
    "contact",
    "cost",
    "costBase",
    "costBaseBaseline",
    "costBaseline",
    "costBaseVariance",
    "costVariance",
    "costVariancePercent",
    "createdDate",
    "endDate",
    "endDateBaseline",
    "endDateVariance",
    "estimatedWork",
    "estimatedWorkBaseline",
    "estimatedWorkVariance",
    "estimatedWorkVariancePercent",
    "id",
    "internalId",
    "isSummaryTask",
    "lastModifiedDate",
    "message",
    "owner",
    "parent",
    "percentWorkComplete",
    "predecessors",
    "priority",
    "remainingWork",
    "startDate",
    "startDateBaseline",
    "startDateVariance",
    "status",
    "title",
    "customFieldList"
})
public class ProjectTaskSearchRowBasic {

    protected List<SearchColumnDoubleField> actualWork;
    protected List<SearchColumnSelectField> company;
    protected List<SearchColumnSelectField> constrainttype;
    protected List<SearchColumnSelectField> contact;
    protected List<SearchColumnDoubleField> cost;
    protected List<SearchColumnDoubleField> costBase;
    protected List<SearchColumnDoubleField> costBaseBaseline;
    protected List<SearchColumnDoubleField> costBaseline;
    protected List<SearchColumnDoubleField> costBaseVariance;
    protected List<SearchColumnDoubleField> costVariance;
    protected List<SearchColumnDoubleField> costVariancePercent;
    protected List<SearchColumnDateField> createdDate;
    protected List<SearchColumnDateField> endDate;
    protected List<SearchColumnDateField> endDateBaseline;
    protected List<SearchColumnDoubleField> endDateVariance;
    protected List<SearchColumnDoubleField> estimatedWork;
    protected List<SearchColumnDoubleField> estimatedWorkBaseline;
    protected List<SearchColumnDoubleField> estimatedWorkVariance;
    protected List<SearchColumnDoubleField> estimatedWorkVariancePercent;
    protected List<SearchColumnLongField> id;
    protected List<SearchColumnSelectField> internalId;
    protected List<SearchColumnBooleanField> isSummaryTask;
    protected List<SearchColumnDateField> lastModifiedDate;
    protected List<SearchColumnStringField> message;
    protected List<SearchColumnSelectField> owner;
    protected List<SearchColumnSelectField> parent;
    protected List<SearchColumnDoubleField> percentWorkComplete;
    protected List<SearchColumnStringField> predecessors;
    protected List<SearchColumnEnumSelectField> priority;
    protected List<SearchColumnDoubleField> remainingWork;
    protected List<SearchColumnDateField> startDate;
    protected List<SearchColumnDateField> startDateBaseline;
    protected List<SearchColumnDoubleField> startDateVariance;
    protected List<SearchColumnEnumSelectField> status;
    protected List<SearchColumnStringField> title;
    protected SearchColumnCustomFieldList customFieldList;

    /**
     * Gets the value of the actualWork property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actualWork property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActualWork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getActualWork() {
        if (actualWork == null) {
            actualWork = new ArrayList<SearchColumnDoubleField>();
        }
        return this.actualWork;
    }

    /**
     * Gets the value of the company property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the company property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompany().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getCompany() {
        if (company == null) {
            company = new ArrayList<SearchColumnSelectField>();
        }
        return this.company;
    }

    /**
     * Gets the value of the constrainttype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constrainttype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstrainttype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getConstrainttype() {
        if (constrainttype == null) {
            constrainttype = new ArrayList<SearchColumnSelectField>();
        }
        return this.constrainttype;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getContact() {
        if (contact == null) {
            contact = new ArrayList<SearchColumnSelectField>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the cost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getCost() {
        if (cost == null) {
            cost = new ArrayList<SearchColumnDoubleField>();
        }
        return this.cost;
    }

    /**
     * Gets the value of the costBase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costBase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostBase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getCostBase() {
        if (costBase == null) {
            costBase = new ArrayList<SearchColumnDoubleField>();
        }
        return this.costBase;
    }

    /**
     * Gets the value of the costBaseBaseline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costBaseBaseline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostBaseBaseline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getCostBaseBaseline() {
        if (costBaseBaseline == null) {
            costBaseBaseline = new ArrayList<SearchColumnDoubleField>();
        }
        return this.costBaseBaseline;
    }

    /**
     * Gets the value of the costBaseline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costBaseline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostBaseline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getCostBaseline() {
        if (costBaseline == null) {
            costBaseline = new ArrayList<SearchColumnDoubleField>();
        }
        return this.costBaseline;
    }

    /**
     * Gets the value of the costBaseVariance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costBaseVariance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostBaseVariance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getCostBaseVariance() {
        if (costBaseVariance == null) {
            costBaseVariance = new ArrayList<SearchColumnDoubleField>();
        }
        return this.costBaseVariance;
    }

    /**
     * Gets the value of the costVariance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costVariance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostVariance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getCostVariance() {
        if (costVariance == null) {
            costVariance = new ArrayList<SearchColumnDoubleField>();
        }
        return this.costVariance;
    }

    /**
     * Gets the value of the costVariancePercent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costVariancePercent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostVariancePercent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getCostVariancePercent() {
        if (costVariancePercent == null) {
            costVariancePercent = new ArrayList<SearchColumnDoubleField>();
        }
        return this.costVariancePercent;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createdDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreatedDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getCreatedDate() {
        if (createdDate == null) {
            createdDate = new ArrayList<SearchColumnDateField>();
        }
        return this.createdDate;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getEndDate() {
        if (endDate == null) {
            endDate = new ArrayList<SearchColumnDateField>();
        }
        return this.endDate;
    }

    /**
     * Gets the value of the endDateBaseline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endDateBaseline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndDateBaseline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getEndDateBaseline() {
        if (endDateBaseline == null) {
            endDateBaseline = new ArrayList<SearchColumnDateField>();
        }
        return this.endDateBaseline;
    }

    /**
     * Gets the value of the endDateVariance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endDateVariance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndDateVariance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getEndDateVariance() {
        if (endDateVariance == null) {
            endDateVariance = new ArrayList<SearchColumnDoubleField>();
        }
        return this.endDateVariance;
    }

    /**
     * Gets the value of the estimatedWork property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estimatedWork property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstimatedWork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getEstimatedWork() {
        if (estimatedWork == null) {
            estimatedWork = new ArrayList<SearchColumnDoubleField>();
        }
        return this.estimatedWork;
    }

    /**
     * Gets the value of the estimatedWorkBaseline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estimatedWorkBaseline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstimatedWorkBaseline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getEstimatedWorkBaseline() {
        if (estimatedWorkBaseline == null) {
            estimatedWorkBaseline = new ArrayList<SearchColumnDoubleField>();
        }
        return this.estimatedWorkBaseline;
    }

    /**
     * Gets the value of the estimatedWorkVariance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estimatedWorkVariance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstimatedWorkVariance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getEstimatedWorkVariance() {
        if (estimatedWorkVariance == null) {
            estimatedWorkVariance = new ArrayList<SearchColumnDoubleField>();
        }
        return this.estimatedWorkVariance;
    }

    /**
     * Gets the value of the estimatedWorkVariancePercent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estimatedWorkVariancePercent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstimatedWorkVariancePercent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getEstimatedWorkVariancePercent() {
        if (estimatedWorkVariancePercent == null) {
            estimatedWorkVariancePercent = new ArrayList<SearchColumnDoubleField>();
        }
        return this.estimatedWorkVariancePercent;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getId() {
        if (id == null) {
            id = new ArrayList<SearchColumnLongField>();
        }
        return this.id;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getInternalId() {
        if (internalId == null) {
            internalId = new ArrayList<SearchColumnSelectField>();
        }
        return this.internalId;
    }

    /**
     * Gets the value of the isSummaryTask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isSummaryTask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsSummaryTask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsSummaryTask() {
        if (isSummaryTask == null) {
            isSummaryTask = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isSummaryTask;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastModifiedDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastModifiedDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getLastModifiedDate() {
        if (lastModifiedDate == null) {
            lastModifiedDate = new ArrayList<SearchColumnDateField>();
        }
        return this.lastModifiedDate;
    }

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getMessage() {
        if (message == null) {
            message = new ArrayList<SearchColumnStringField>();
        }
        return this.message;
    }

    /**
     * Gets the value of the owner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the owner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getOwner() {
        if (owner == null) {
            owner = new ArrayList<SearchColumnSelectField>();
        }
        return this.owner;
    }

    /**
     * Gets the value of the parent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getParent() {
        if (parent == null) {
            parent = new ArrayList<SearchColumnSelectField>();
        }
        return this.parent;
    }

    /**
     * Gets the value of the percentWorkComplete property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the percentWorkComplete property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPercentWorkComplete().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getPercentWorkComplete() {
        if (percentWorkComplete == null) {
            percentWorkComplete = new ArrayList<SearchColumnDoubleField>();
        }
        return this.percentWorkComplete;
    }

    /**
     * Gets the value of the predecessors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predecessors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredecessors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPredecessors() {
        if (predecessors == null) {
            predecessors = new ArrayList<SearchColumnStringField>();
        }
        return this.predecessors;
    }

    /**
     * Gets the value of the priority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getPriority() {
        if (priority == null) {
            priority = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.priority;
    }

    /**
     * Gets the value of the remainingWork property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remainingWork property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemainingWork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getRemainingWork() {
        if (remainingWork == null) {
            remainingWork = new ArrayList<SearchColumnDoubleField>();
        }
        return this.remainingWork;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getStartDate() {
        if (startDate == null) {
            startDate = new ArrayList<SearchColumnDateField>();
        }
        return this.startDate;
    }

    /**
     * Gets the value of the startDateBaseline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startDateBaseline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartDateBaseline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getStartDateBaseline() {
        if (startDateBaseline == null) {
            startDateBaseline = new ArrayList<SearchColumnDateField>();
        }
        return this.startDateBaseline;
    }

    /**
     * Gets the value of the startDateVariance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startDateVariance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartDateVariance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getStartDateVariance() {
        if (startDateVariance == null) {
            startDateVariance = new ArrayList<SearchColumnDoubleField>();
        }
        return this.startDateVariance;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getStatus() {
        if (status == null) {
            status = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.status;
    }

    /**
     * Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getTitle() {
        if (title == null) {
            title = new ArrayList<SearchColumnStringField>();
        }
        return this.title;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link SearchColumnCustomFieldList }
     *     
     */
    public SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchColumnCustomFieldList }
     *     
     */
    public void setCustomFieldList(SearchColumnCustomFieldList value) {
        this.customFieldList = value;
    }

}
