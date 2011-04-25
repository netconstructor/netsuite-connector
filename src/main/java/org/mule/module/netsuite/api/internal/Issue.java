/**
 * Issue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class Issue  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef customForm;

    private java.lang.String issueNumber;

    private java.util.Calendar createdDate;

    private org.mule.module.netsuite.api.internal.RecordRef issueType;

    private org.mule.module.netsuite.api.internal.RecordRef product;

    private org.mule.module.netsuite.api.internal.RecordRef module;

    private org.mule.module.netsuite.api.internal.RecordRef item;

    private org.mule.module.netsuite.api.internal.RecordRef productTeam;

    private org.mule.module.netsuite.api.internal.RecordRef source;

    private org.mule.module.netsuite.api.internal.RecordRef reportedBy;

    private org.mule.module.netsuite.api.internal.RecordRef reproduce;

    private org.mule.module.netsuite.api.internal.RecordRef duplicateOf;

    private org.mule.module.netsuite.api.internal.RecordRef severity;

    private org.mule.module.netsuite.api.internal.RecordRef priority;

    private java.lang.Boolean isShowStopper;

    private org.mule.module.netsuite.api.internal.RecordRef assigned;

    private org.mule.module.netsuite.api.internal.RecordRef reviewer;

    private java.lang.Boolean isReviewed;

    private org.mule.module.netsuite.api.internal.RecordRef issueStatus;

    private java.util.Calendar lastModifiedDate;

    private org.mule.module.netsuite.api.internal.RecordRefList issueTagsList;

    private java.lang.String issueAbstract;

    private java.lang.String newDetails;

    private java.lang.Boolean isOwner;

    private org.mule.module.netsuite.api.internal.IssueTrackCode trackCode;

    private java.lang.Boolean emailAssignee;

    private org.mule.module.netsuite.api.internal.EmailEmployeesList emailEmployeesList;

    private org.mule.module.netsuite.api.internal.RecordRefList emailCellsList;

    private java.lang.String externalAbstract;

    private java.lang.String externalDetails;

    private org.mule.module.netsuite.api.internal.IssueVersionList brokenInVersionList;

    private org.mule.module.netsuite.api.internal.IssueVersionList targetVersionList;

    private org.mule.module.netsuite.api.internal.IssueVersionList fixedInVersionList;

    private org.mule.module.netsuite.api.internal.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Issue() {
    }

    public Issue(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           org.mule.module.netsuite.api.internal.RecordRef customForm,
           java.lang.String issueNumber,
           java.util.Calendar createdDate,
           org.mule.module.netsuite.api.internal.RecordRef issueType,
           org.mule.module.netsuite.api.internal.RecordRef product,
           org.mule.module.netsuite.api.internal.RecordRef module,
           org.mule.module.netsuite.api.internal.RecordRef item,
           org.mule.module.netsuite.api.internal.RecordRef productTeam,
           org.mule.module.netsuite.api.internal.RecordRef source,
           org.mule.module.netsuite.api.internal.RecordRef reportedBy,
           org.mule.module.netsuite.api.internal.RecordRef reproduce,
           org.mule.module.netsuite.api.internal.RecordRef duplicateOf,
           org.mule.module.netsuite.api.internal.RecordRef severity,
           org.mule.module.netsuite.api.internal.RecordRef priority,
           java.lang.Boolean isShowStopper,
           org.mule.module.netsuite.api.internal.RecordRef assigned,
           org.mule.module.netsuite.api.internal.RecordRef reviewer,
           java.lang.Boolean isReviewed,
           org.mule.module.netsuite.api.internal.RecordRef issueStatus,
           java.util.Calendar lastModifiedDate,
           org.mule.module.netsuite.api.internal.RecordRefList issueTagsList,
           java.lang.String issueAbstract,
           java.lang.String newDetails,
           java.lang.Boolean isOwner,
           org.mule.module.netsuite.api.internal.IssueTrackCode trackCode,
           java.lang.Boolean emailAssignee,
           org.mule.module.netsuite.api.internal.EmailEmployeesList emailEmployeesList,
           org.mule.module.netsuite.api.internal.RecordRefList emailCellsList,
           java.lang.String externalAbstract,
           java.lang.String externalDetails,
           org.mule.module.netsuite.api.internal.IssueVersionList brokenInVersionList,
           org.mule.module.netsuite.api.internal.IssueVersionList targetVersionList,
           org.mule.module.netsuite.api.internal.IssueVersionList fixedInVersionList,
           org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.issueNumber = issueNumber;
        this.createdDate = createdDate;
        this.issueType = issueType;
        this.product = product;
        this.module = module;
        this.item = item;
        this.productTeam = productTeam;
        this.source = source;
        this.reportedBy = reportedBy;
        this.reproduce = reproduce;
        this.duplicateOf = duplicateOf;
        this.severity = severity;
        this.priority = priority;
        this.isShowStopper = isShowStopper;
        this.assigned = assigned;
        this.reviewer = reviewer;
        this.isReviewed = isReviewed;
        this.issueStatus = issueStatus;
        this.lastModifiedDate = lastModifiedDate;
        this.issueTagsList = issueTagsList;
        this.issueAbstract = issueAbstract;
        this.newDetails = newDetails;
        this.isOwner = isOwner;
        this.trackCode = trackCode;
        this.emailAssignee = emailAssignee;
        this.emailEmployeesList = emailEmployeesList;
        this.emailCellsList = emailCellsList;
        this.externalAbstract = externalAbstract;
        this.externalDetails = externalDetails;
        this.brokenInVersionList = brokenInVersionList;
        this.targetVersionList = targetVersionList;
        this.fixedInVersionList = fixedInVersionList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the customForm value for this Issue.
     * 
     * @return customForm
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this Issue.
     * 
     * @param customForm
     */
    public void setCustomForm(org.mule.module.netsuite.api.internal.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the issueNumber value for this Issue.
     * 
     * @return issueNumber
     */
    public java.lang.String getIssueNumber() {
        return issueNumber;
    }


    /**
     * Sets the issueNumber value for this Issue.
     * 
     * @param issueNumber
     */
    public void setIssueNumber(java.lang.String issueNumber) {
        this.issueNumber = issueNumber;
    }


    /**
     * Gets the createdDate value for this Issue.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Issue.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the issueType value for this Issue.
     * 
     * @return issueType
     */
    public org.mule.module.netsuite.api.internal.RecordRef getIssueType() {
        return issueType;
    }


    /**
     * Sets the issueType value for this Issue.
     * 
     * @param issueType
     */
    public void setIssueType(org.mule.module.netsuite.api.internal.RecordRef issueType) {
        this.issueType = issueType;
    }


    /**
     * Gets the product value for this Issue.
     * 
     * @return product
     */
    public org.mule.module.netsuite.api.internal.RecordRef getProduct() {
        return product;
    }


    /**
     * Sets the product value for this Issue.
     * 
     * @param product
     */
    public void setProduct(org.mule.module.netsuite.api.internal.RecordRef product) {
        this.product = product;
    }


    /**
     * Gets the module value for this Issue.
     * 
     * @return module
     */
    public org.mule.module.netsuite.api.internal.RecordRef getModule() {
        return module;
    }


    /**
     * Sets the module value for this Issue.
     * 
     * @param module
     */
    public void setModule(org.mule.module.netsuite.api.internal.RecordRef module) {
        this.module = module;
    }


    /**
     * Gets the item value for this Issue.
     * 
     * @return item
     */
    public org.mule.module.netsuite.api.internal.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this Issue.
     * 
     * @param item
     */
    public void setItem(org.mule.module.netsuite.api.internal.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the productTeam value for this Issue.
     * 
     * @return productTeam
     */
    public org.mule.module.netsuite.api.internal.RecordRef getProductTeam() {
        return productTeam;
    }


    /**
     * Sets the productTeam value for this Issue.
     * 
     * @param productTeam
     */
    public void setProductTeam(org.mule.module.netsuite.api.internal.RecordRef productTeam) {
        this.productTeam = productTeam;
    }


    /**
     * Gets the source value for this Issue.
     * 
     * @return source
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSource() {
        return source;
    }


    /**
     * Sets the source value for this Issue.
     * 
     * @param source
     */
    public void setSource(org.mule.module.netsuite.api.internal.RecordRef source) {
        this.source = source;
    }


    /**
     * Gets the reportedBy value for this Issue.
     * 
     * @return reportedBy
     */
    public org.mule.module.netsuite.api.internal.RecordRef getReportedBy() {
        return reportedBy;
    }


    /**
     * Sets the reportedBy value for this Issue.
     * 
     * @param reportedBy
     */
    public void setReportedBy(org.mule.module.netsuite.api.internal.RecordRef reportedBy) {
        this.reportedBy = reportedBy;
    }


    /**
     * Gets the reproduce value for this Issue.
     * 
     * @return reproduce
     */
    public org.mule.module.netsuite.api.internal.RecordRef getReproduce() {
        return reproduce;
    }


    /**
     * Sets the reproduce value for this Issue.
     * 
     * @param reproduce
     */
    public void setReproduce(org.mule.module.netsuite.api.internal.RecordRef reproduce) {
        this.reproduce = reproduce;
    }


    /**
     * Gets the duplicateOf value for this Issue.
     * 
     * @return duplicateOf
     */
    public org.mule.module.netsuite.api.internal.RecordRef getDuplicateOf() {
        return duplicateOf;
    }


    /**
     * Sets the duplicateOf value for this Issue.
     * 
     * @param duplicateOf
     */
    public void setDuplicateOf(org.mule.module.netsuite.api.internal.RecordRef duplicateOf) {
        this.duplicateOf = duplicateOf;
    }


    /**
     * Gets the severity value for this Issue.
     * 
     * @return severity
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this Issue.
     * 
     * @param severity
     */
    public void setSeverity(org.mule.module.netsuite.api.internal.RecordRef severity) {
        this.severity = severity;
    }


    /**
     * Gets the priority value for this Issue.
     * 
     * @return priority
     */
    public org.mule.module.netsuite.api.internal.RecordRef getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Issue.
     * 
     * @param priority
     */
    public void setPriority(org.mule.module.netsuite.api.internal.RecordRef priority) {
        this.priority = priority;
    }


    /**
     * Gets the isShowStopper value for this Issue.
     * 
     * @return isShowStopper
     */
    public java.lang.Boolean getIsShowStopper() {
        return isShowStopper;
    }


    /**
     * Sets the isShowStopper value for this Issue.
     * 
     * @param isShowStopper
     */
    public void setIsShowStopper(java.lang.Boolean isShowStopper) {
        this.isShowStopper = isShowStopper;
    }


    /**
     * Gets the assigned value for this Issue.
     * 
     * @return assigned
     */
    public org.mule.module.netsuite.api.internal.RecordRef getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this Issue.
     * 
     * @param assigned
     */
    public void setAssigned(org.mule.module.netsuite.api.internal.RecordRef assigned) {
        this.assigned = assigned;
    }


    /**
     * Gets the reviewer value for this Issue.
     * 
     * @return reviewer
     */
    public org.mule.module.netsuite.api.internal.RecordRef getReviewer() {
        return reviewer;
    }


    /**
     * Sets the reviewer value for this Issue.
     * 
     * @param reviewer
     */
    public void setReviewer(org.mule.module.netsuite.api.internal.RecordRef reviewer) {
        this.reviewer = reviewer;
    }


    /**
     * Gets the isReviewed value for this Issue.
     * 
     * @return isReviewed
     */
    public java.lang.Boolean getIsReviewed() {
        return isReviewed;
    }


    /**
     * Sets the isReviewed value for this Issue.
     * 
     * @param isReviewed
     */
    public void setIsReviewed(java.lang.Boolean isReviewed) {
        this.isReviewed = isReviewed;
    }


    /**
     * Gets the issueStatus value for this Issue.
     * 
     * @return issueStatus
     */
    public org.mule.module.netsuite.api.internal.RecordRef getIssueStatus() {
        return issueStatus;
    }


    /**
     * Sets the issueStatus value for this Issue.
     * 
     * @param issueStatus
     */
    public void setIssueStatus(org.mule.module.netsuite.api.internal.RecordRef issueStatus) {
        this.issueStatus = issueStatus;
    }


    /**
     * Gets the lastModifiedDate value for this Issue.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Issue.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the issueTagsList value for this Issue.
     * 
     * @return issueTagsList
     */
    public org.mule.module.netsuite.api.internal.RecordRefList getIssueTagsList() {
        return issueTagsList;
    }


    /**
     * Sets the issueTagsList value for this Issue.
     * 
     * @param issueTagsList
     */
    public void setIssueTagsList(org.mule.module.netsuite.api.internal.RecordRefList issueTagsList) {
        this.issueTagsList = issueTagsList;
    }


    /**
     * Gets the issueAbstract value for this Issue.
     * 
     * @return issueAbstract
     */
    public java.lang.String getIssueAbstract() {
        return issueAbstract;
    }


    /**
     * Sets the issueAbstract value for this Issue.
     * 
     * @param issueAbstract
     */
    public void setIssueAbstract(java.lang.String issueAbstract) {
        this.issueAbstract = issueAbstract;
    }


    /**
     * Gets the newDetails value for this Issue.
     * 
     * @return newDetails
     */
    public java.lang.String getNewDetails() {
        return newDetails;
    }


    /**
     * Sets the newDetails value for this Issue.
     * 
     * @param newDetails
     */
    public void setNewDetails(java.lang.String newDetails) {
        this.newDetails = newDetails;
    }


    /**
     * Gets the isOwner value for this Issue.
     * 
     * @return isOwner
     */
    public java.lang.Boolean getIsOwner() {
        return isOwner;
    }


    /**
     * Sets the isOwner value for this Issue.
     * 
     * @param isOwner
     */
    public void setIsOwner(java.lang.Boolean isOwner) {
        this.isOwner = isOwner;
    }


    /**
     * Gets the trackCode value for this Issue.
     * 
     * @return trackCode
     */
    public org.mule.module.netsuite.api.internal.IssueTrackCode getTrackCode() {
        return trackCode;
    }


    /**
     * Sets the trackCode value for this Issue.
     * 
     * @param trackCode
     */
    public void setTrackCode(org.mule.module.netsuite.api.internal.IssueTrackCode trackCode) {
        this.trackCode = trackCode;
    }


    /**
     * Gets the emailAssignee value for this Issue.
     * 
     * @return emailAssignee
     */
    public java.lang.Boolean getEmailAssignee() {
        return emailAssignee;
    }


    /**
     * Sets the emailAssignee value for this Issue.
     * 
     * @param emailAssignee
     */
    public void setEmailAssignee(java.lang.Boolean emailAssignee) {
        this.emailAssignee = emailAssignee;
    }


    /**
     * Gets the emailEmployeesList value for this Issue.
     * 
     * @return emailEmployeesList
     */
    public org.mule.module.netsuite.api.internal.EmailEmployeesList getEmailEmployeesList() {
        return emailEmployeesList;
    }


    /**
     * Sets the emailEmployeesList value for this Issue.
     * 
     * @param emailEmployeesList
     */
    public void setEmailEmployeesList(org.mule.module.netsuite.api.internal.EmailEmployeesList emailEmployeesList) {
        this.emailEmployeesList = emailEmployeesList;
    }


    /**
     * Gets the emailCellsList value for this Issue.
     * 
     * @return emailCellsList
     */
    public org.mule.module.netsuite.api.internal.RecordRefList getEmailCellsList() {
        return emailCellsList;
    }


    /**
     * Sets the emailCellsList value for this Issue.
     * 
     * @param emailCellsList
     */
    public void setEmailCellsList(org.mule.module.netsuite.api.internal.RecordRefList emailCellsList) {
        this.emailCellsList = emailCellsList;
    }


    /**
     * Gets the externalAbstract value for this Issue.
     * 
     * @return externalAbstract
     */
    public java.lang.String getExternalAbstract() {
        return externalAbstract;
    }


    /**
     * Sets the externalAbstract value for this Issue.
     * 
     * @param externalAbstract
     */
    public void setExternalAbstract(java.lang.String externalAbstract) {
        this.externalAbstract = externalAbstract;
    }


    /**
     * Gets the externalDetails value for this Issue.
     * 
     * @return externalDetails
     */
    public java.lang.String getExternalDetails() {
        return externalDetails;
    }


    /**
     * Sets the externalDetails value for this Issue.
     * 
     * @param externalDetails
     */
    public void setExternalDetails(java.lang.String externalDetails) {
        this.externalDetails = externalDetails;
    }


    /**
     * Gets the brokenInVersionList value for this Issue.
     * 
     * @return brokenInVersionList
     */
    public org.mule.module.netsuite.api.internal.IssueVersionList getBrokenInVersionList() {
        return brokenInVersionList;
    }


    /**
     * Sets the brokenInVersionList value for this Issue.
     * 
     * @param brokenInVersionList
     */
    public void setBrokenInVersionList(org.mule.module.netsuite.api.internal.IssueVersionList brokenInVersionList) {
        this.brokenInVersionList = brokenInVersionList;
    }


    /**
     * Gets the targetVersionList value for this Issue.
     * 
     * @return targetVersionList
     */
    public org.mule.module.netsuite.api.internal.IssueVersionList getTargetVersionList() {
        return targetVersionList;
    }


    /**
     * Sets the targetVersionList value for this Issue.
     * 
     * @param targetVersionList
     */
    public void setTargetVersionList(org.mule.module.netsuite.api.internal.IssueVersionList targetVersionList) {
        this.targetVersionList = targetVersionList;
    }


    /**
     * Gets the fixedInVersionList value for this Issue.
     * 
     * @return fixedInVersionList
     */
    public org.mule.module.netsuite.api.internal.IssueVersionList getFixedInVersionList() {
        return fixedInVersionList;
    }


    /**
     * Sets the fixedInVersionList value for this Issue.
     * 
     * @param fixedInVersionList
     */
    public void setFixedInVersionList(org.mule.module.netsuite.api.internal.IssueVersionList fixedInVersionList) {
        this.fixedInVersionList = fixedInVersionList;
    }


    /**
     * Gets the customFieldList value for this Issue.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this Issue.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this Issue.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Issue.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Issue.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Issue.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Issue)) return false;
        Issue other = (Issue) obj;
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
            ((this.issueNumber==null && other.getIssueNumber()==null) || 
             (this.issueNumber!=null &&
              this.issueNumber.equals(other.getIssueNumber()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.issueType==null && other.getIssueType()==null) || 
             (this.issueType!=null &&
              this.issueType.equals(other.getIssueType()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.module==null && other.getModule()==null) || 
             (this.module!=null &&
              this.module.equals(other.getModule()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.productTeam==null && other.getProductTeam()==null) || 
             (this.productTeam!=null &&
              this.productTeam.equals(other.getProductTeam()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.reportedBy==null && other.getReportedBy()==null) || 
             (this.reportedBy!=null &&
              this.reportedBy.equals(other.getReportedBy()))) &&
            ((this.reproduce==null && other.getReproduce()==null) || 
             (this.reproduce!=null &&
              this.reproduce.equals(other.getReproduce()))) &&
            ((this.duplicateOf==null && other.getDuplicateOf()==null) || 
             (this.duplicateOf!=null &&
              this.duplicateOf.equals(other.getDuplicateOf()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.isShowStopper==null && other.getIsShowStopper()==null) || 
             (this.isShowStopper!=null &&
              this.isShowStopper.equals(other.getIsShowStopper()))) &&
            ((this.assigned==null && other.getAssigned()==null) || 
             (this.assigned!=null &&
              this.assigned.equals(other.getAssigned()))) &&
            ((this.reviewer==null && other.getReviewer()==null) || 
             (this.reviewer!=null &&
              this.reviewer.equals(other.getReviewer()))) &&
            ((this.isReviewed==null && other.getIsReviewed()==null) || 
             (this.isReviewed!=null &&
              this.isReviewed.equals(other.getIsReviewed()))) &&
            ((this.issueStatus==null && other.getIssueStatus()==null) || 
             (this.issueStatus!=null &&
              this.issueStatus.equals(other.getIssueStatus()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.issueTagsList==null && other.getIssueTagsList()==null) || 
             (this.issueTagsList!=null &&
              this.issueTagsList.equals(other.getIssueTagsList()))) &&
            ((this.issueAbstract==null && other.getIssueAbstract()==null) || 
             (this.issueAbstract!=null &&
              this.issueAbstract.equals(other.getIssueAbstract()))) &&
            ((this.newDetails==null && other.getNewDetails()==null) || 
             (this.newDetails!=null &&
              this.newDetails.equals(other.getNewDetails()))) &&
            ((this.isOwner==null && other.getIsOwner()==null) || 
             (this.isOwner!=null &&
              this.isOwner.equals(other.getIsOwner()))) &&
            ((this.trackCode==null && other.getTrackCode()==null) || 
             (this.trackCode!=null &&
              this.trackCode.equals(other.getTrackCode()))) &&
            ((this.emailAssignee==null && other.getEmailAssignee()==null) || 
             (this.emailAssignee!=null &&
              this.emailAssignee.equals(other.getEmailAssignee()))) &&
            ((this.emailEmployeesList==null && other.getEmailEmployeesList()==null) || 
             (this.emailEmployeesList!=null &&
              this.emailEmployeesList.equals(other.getEmailEmployeesList()))) &&
            ((this.emailCellsList==null && other.getEmailCellsList()==null) || 
             (this.emailCellsList!=null &&
              this.emailCellsList.equals(other.getEmailCellsList()))) &&
            ((this.externalAbstract==null && other.getExternalAbstract()==null) || 
             (this.externalAbstract!=null &&
              this.externalAbstract.equals(other.getExternalAbstract()))) &&
            ((this.externalDetails==null && other.getExternalDetails()==null) || 
             (this.externalDetails!=null &&
              this.externalDetails.equals(other.getExternalDetails()))) &&
            ((this.brokenInVersionList==null && other.getBrokenInVersionList()==null) || 
             (this.brokenInVersionList!=null &&
              this.brokenInVersionList.equals(other.getBrokenInVersionList()))) &&
            ((this.targetVersionList==null && other.getTargetVersionList()==null) || 
             (this.targetVersionList!=null &&
              this.targetVersionList.equals(other.getTargetVersionList()))) &&
            ((this.fixedInVersionList==null && other.getFixedInVersionList()==null) || 
             (this.fixedInVersionList!=null &&
              this.fixedInVersionList.equals(other.getFixedInVersionList()))) &&
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
        if (getIssueNumber() != null) {
            _hashCode += getIssueNumber().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getIssueType() != null) {
            _hashCode += getIssueType().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getModule() != null) {
            _hashCode += getModule().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getProductTeam() != null) {
            _hashCode += getProductTeam().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getReportedBy() != null) {
            _hashCode += getReportedBy().hashCode();
        }
        if (getReproduce() != null) {
            _hashCode += getReproduce().hashCode();
        }
        if (getDuplicateOf() != null) {
            _hashCode += getDuplicateOf().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getIsShowStopper() != null) {
            _hashCode += getIsShowStopper().hashCode();
        }
        if (getAssigned() != null) {
            _hashCode += getAssigned().hashCode();
        }
        if (getReviewer() != null) {
            _hashCode += getReviewer().hashCode();
        }
        if (getIsReviewed() != null) {
            _hashCode += getIsReviewed().hashCode();
        }
        if (getIssueStatus() != null) {
            _hashCode += getIssueStatus().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getIssueTagsList() != null) {
            _hashCode += getIssueTagsList().hashCode();
        }
        if (getIssueAbstract() != null) {
            _hashCode += getIssueAbstract().hashCode();
        }
        if (getNewDetails() != null) {
            _hashCode += getNewDetails().hashCode();
        }
        if (getIsOwner() != null) {
            _hashCode += getIsOwner().hashCode();
        }
        if (getTrackCode() != null) {
            _hashCode += getTrackCode().hashCode();
        }
        if (getEmailAssignee() != null) {
            _hashCode += getEmailAssignee().hashCode();
        }
        if (getEmailEmployeesList() != null) {
            _hashCode += getEmailEmployeesList().hashCode();
        }
        if (getEmailCellsList() != null) {
            _hashCode += getEmailCellsList().hashCode();
        }
        if (getExternalAbstract() != null) {
            _hashCode += getExternalAbstract().hashCode();
        }
        if (getExternalDetails() != null) {
            _hashCode += getExternalDetails().hashCode();
        }
        if (getBrokenInVersionList() != null) {
            _hashCode += getBrokenInVersionList().hashCode();
        }
        if (getTargetVersionList() != null) {
            _hashCode += getTargetVersionList().hashCode();
        }
        if (getFixedInVersionList() != null) {
            _hashCode += getFixedInVersionList().hashCode();
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
        new org.apache.axis.description.TypeDesc(Issue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "Issue"));
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
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "issueNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "issueType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("module");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "module"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTeam");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "productTeam"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "reportedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reproduce");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "reproduce"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicateOf");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "duplicateOf"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isShowStopper");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "isShowStopper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "assigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "reviewer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "isReviewed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "issueStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueTagsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "issueTagsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "issueAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "newDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "isOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "trackCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.support_2010_2.lists.webservices.netsuite.com", "IssueTrackCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAssignee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "emailAssignee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailEmployeesList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "emailEmployeesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "EmailEmployeesList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailCellsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "emailCellsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "externalAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "externalDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brokenInVersionList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "brokenInVersionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "IssueVersionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetVersionList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "targetVersionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "IssueVersionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixedInVersionList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "fixedInVersionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "IssueVersionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "customFieldList"));
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
