/**
 * IssueSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class IssueSearchBasic  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchLongField ageInMonths;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField assigned;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField buildBroken;

    private org.mule.module.netsuite.api.internal.SearchStringField buildBrokenName;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField buildFixed;

    private org.mule.module.netsuite.api.internal.SearchStringField buildFixedName;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField buildTarget;

    private org.mule.module.netsuite.api.internal.SearchStringField buildTargetName;

    private org.mule.module.netsuite.api.internal.SearchLongField caseCount;

    private org.mule.module.netsuite.api.internal.SearchStringField caseNumber;

    private org.mule.module.netsuite.api.internal.SearchDateField closedDate;

    private org.mule.module.netsuite.api.internal.SearchDateField createdDate;

    private org.mule.module.netsuite.api.internal.SearchDateField dateReleased;

    private org.mule.module.netsuite.api.internal.SearchStringField details;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField duplicateOf;

    private org.mule.module.netsuite.api.internal.SearchBooleanField eFix;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField employeeOrTeam;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField eventStatus;

    private org.mule.module.netsuite.api.internal.SearchStringField externalAbstract;

    private org.mule.module.netsuite.api.internal.SearchStringField externalDetails;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField externalFixedIn;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField externalStatus;

    private org.mule.module.netsuite.api.internal.SearchDateField fixed;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField fixedBy;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId;

    private org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isOwner;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isReviewed;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isShowStopper;

    private org.mule.module.netsuite.api.internal.SearchStringField issueAbstract;

    private org.mule.module.netsuite.api.internal.SearchStringField issueNumber;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField item;

    private org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField module;

    private org.mule.module.netsuite.api.internal.SearchLongField number;

    private org.mule.module.netsuite.api.internal.SearchStringField originalFixedIn;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField priority;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField product;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField productTeam;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField reportedBy;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField reproduce;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField reviewer;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField severity;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField source;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField status;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField tags;

    private org.mule.module.netsuite.api.internal.SearchBooleanField tracking;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField type;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField userType;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField versionBroken;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField versionFixed;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField versionTarget;

    private org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList;

    public IssueSearchBasic() {
    }

    public IssueSearchBasic(
           org.mule.module.netsuite.api.internal.SearchLongField ageInMonths,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField assigned,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField buildBroken,
           org.mule.module.netsuite.api.internal.SearchStringField buildBrokenName,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField buildFixed,
           org.mule.module.netsuite.api.internal.SearchStringField buildFixedName,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField buildTarget,
           org.mule.module.netsuite.api.internal.SearchStringField buildTargetName,
           org.mule.module.netsuite.api.internal.SearchLongField caseCount,
           org.mule.module.netsuite.api.internal.SearchStringField caseNumber,
           org.mule.module.netsuite.api.internal.SearchDateField closedDate,
           org.mule.module.netsuite.api.internal.SearchDateField createdDate,
           org.mule.module.netsuite.api.internal.SearchDateField dateReleased,
           org.mule.module.netsuite.api.internal.SearchStringField details,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField duplicateOf,
           org.mule.module.netsuite.api.internal.SearchBooleanField eFix,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField employeeOrTeam,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField eventStatus,
           org.mule.module.netsuite.api.internal.SearchStringField externalAbstract,
           org.mule.module.netsuite.api.internal.SearchStringField externalDetails,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField externalFixedIn,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField externalStatus,
           org.mule.module.netsuite.api.internal.SearchDateField fixed,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField fixedBy,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId,
           org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber,
           org.mule.module.netsuite.api.internal.SearchBooleanField isOwner,
           org.mule.module.netsuite.api.internal.SearchBooleanField isReviewed,
           org.mule.module.netsuite.api.internal.SearchBooleanField isShowStopper,
           org.mule.module.netsuite.api.internal.SearchStringField issueAbstract,
           org.mule.module.netsuite.api.internal.SearchStringField issueNumber,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField item,
           org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField module,
           org.mule.module.netsuite.api.internal.SearchLongField number,
           org.mule.module.netsuite.api.internal.SearchStringField originalFixedIn,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField priority,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField product,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField productTeam,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField reportedBy,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField reproduce,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField reviewer,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField severity,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField source,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField status,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField tags,
           org.mule.module.netsuite.api.internal.SearchBooleanField tracking,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField type,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField userType,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField versionBroken,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField versionFixed,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField versionTarget,
           org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.ageInMonths = ageInMonths;
        this.assigned = assigned;
        this.buildBroken = buildBroken;
        this.buildBrokenName = buildBrokenName;
        this.buildFixed = buildFixed;
        this.buildFixedName = buildFixedName;
        this.buildTarget = buildTarget;
        this.buildTargetName = buildTargetName;
        this.caseCount = caseCount;
        this.caseNumber = caseNumber;
        this.closedDate = closedDate;
        this.createdDate = createdDate;
        this.dateReleased = dateReleased;
        this.details = details;
        this.duplicateOf = duplicateOf;
        this.eFix = eFix;
        this.employeeOrTeam = employeeOrTeam;
        this.eventStatus = eventStatus;
        this.externalAbstract = externalAbstract;
        this.externalDetails = externalDetails;
        this.externalFixedIn = externalFixedIn;
        this.externalStatus = externalStatus;
        this.fixed = fixed;
        this.fixedBy = fixedBy;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isOwner = isOwner;
        this.isReviewed = isReviewed;
        this.isShowStopper = isShowStopper;
        this.issueAbstract = issueAbstract;
        this.issueNumber = issueNumber;
        this.item = item;
        this.lastModifiedDate = lastModifiedDate;
        this.module = module;
        this.number = number;
        this.originalFixedIn = originalFixedIn;
        this.priority = priority;
        this.product = product;
        this.productTeam = productTeam;
        this.reportedBy = reportedBy;
        this.reproduce = reproduce;
        this.reviewer = reviewer;
        this.severity = severity;
        this.source = source;
        this.status = status;
        this.tags = tags;
        this.tracking = tracking;
        this.type = type;
        this.userType = userType;
        this.versionBroken = versionBroken;
        this.versionFixed = versionFixed;
        this.versionTarget = versionTarget;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the ageInMonths value for this IssueSearchBasic.
     * 
     * @return ageInMonths
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getAgeInMonths() {
        return ageInMonths;
    }


    /**
     * Sets the ageInMonths value for this IssueSearchBasic.
     * 
     * @param ageInMonths
     */
    public void setAgeInMonths(org.mule.module.netsuite.api.internal.SearchLongField ageInMonths) {
        this.ageInMonths = ageInMonths;
    }


    /**
     * Gets the assigned value for this IssueSearchBasic.
     * 
     * @return assigned
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this IssueSearchBasic.
     * 
     * @param assigned
     */
    public void setAssigned(org.mule.module.netsuite.api.internal.SearchMultiSelectField assigned) {
        this.assigned = assigned;
    }


    /**
     * Gets the buildBroken value for this IssueSearchBasic.
     * 
     * @return buildBroken
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getBuildBroken() {
        return buildBroken;
    }


    /**
     * Sets the buildBroken value for this IssueSearchBasic.
     * 
     * @param buildBroken
     */
    public void setBuildBroken(org.mule.module.netsuite.api.internal.SearchMultiSelectField buildBroken) {
        this.buildBroken = buildBroken;
    }


    /**
     * Gets the buildBrokenName value for this IssueSearchBasic.
     * 
     * @return buildBrokenName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getBuildBrokenName() {
        return buildBrokenName;
    }


    /**
     * Sets the buildBrokenName value for this IssueSearchBasic.
     * 
     * @param buildBrokenName
     */
    public void setBuildBrokenName(org.mule.module.netsuite.api.internal.SearchStringField buildBrokenName) {
        this.buildBrokenName = buildBrokenName;
    }


    /**
     * Gets the buildFixed value for this IssueSearchBasic.
     * 
     * @return buildFixed
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getBuildFixed() {
        return buildFixed;
    }


    /**
     * Sets the buildFixed value for this IssueSearchBasic.
     * 
     * @param buildFixed
     */
    public void setBuildFixed(org.mule.module.netsuite.api.internal.SearchMultiSelectField buildFixed) {
        this.buildFixed = buildFixed;
    }


    /**
     * Gets the buildFixedName value for this IssueSearchBasic.
     * 
     * @return buildFixedName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getBuildFixedName() {
        return buildFixedName;
    }


    /**
     * Sets the buildFixedName value for this IssueSearchBasic.
     * 
     * @param buildFixedName
     */
    public void setBuildFixedName(org.mule.module.netsuite.api.internal.SearchStringField buildFixedName) {
        this.buildFixedName = buildFixedName;
    }


    /**
     * Gets the buildTarget value for this IssueSearchBasic.
     * 
     * @return buildTarget
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getBuildTarget() {
        return buildTarget;
    }


    /**
     * Sets the buildTarget value for this IssueSearchBasic.
     * 
     * @param buildTarget
     */
    public void setBuildTarget(org.mule.module.netsuite.api.internal.SearchMultiSelectField buildTarget) {
        this.buildTarget = buildTarget;
    }


    /**
     * Gets the buildTargetName value for this IssueSearchBasic.
     * 
     * @return buildTargetName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getBuildTargetName() {
        return buildTargetName;
    }


    /**
     * Sets the buildTargetName value for this IssueSearchBasic.
     * 
     * @param buildTargetName
     */
    public void setBuildTargetName(org.mule.module.netsuite.api.internal.SearchStringField buildTargetName) {
        this.buildTargetName = buildTargetName;
    }


    /**
     * Gets the caseCount value for this IssueSearchBasic.
     * 
     * @return caseCount
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getCaseCount() {
        return caseCount;
    }


    /**
     * Sets the caseCount value for this IssueSearchBasic.
     * 
     * @param caseCount
     */
    public void setCaseCount(org.mule.module.netsuite.api.internal.SearchLongField caseCount) {
        this.caseCount = caseCount;
    }


    /**
     * Gets the caseNumber value for this IssueSearchBasic.
     * 
     * @return caseNumber
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getCaseNumber() {
        return caseNumber;
    }


    /**
     * Sets the caseNumber value for this IssueSearchBasic.
     * 
     * @param caseNumber
     */
    public void setCaseNumber(org.mule.module.netsuite.api.internal.SearchStringField caseNumber) {
        this.caseNumber = caseNumber;
    }


    /**
     * Gets the closedDate value for this IssueSearchBasic.
     * 
     * @return closedDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getClosedDate() {
        return closedDate;
    }


    /**
     * Sets the closedDate value for this IssueSearchBasic.
     * 
     * @param closedDate
     */
    public void setClosedDate(org.mule.module.netsuite.api.internal.SearchDateField closedDate) {
        this.closedDate = closedDate;
    }


    /**
     * Gets the createdDate value for this IssueSearchBasic.
     * 
     * @return createdDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this IssueSearchBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(org.mule.module.netsuite.api.internal.SearchDateField createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the dateReleased value for this IssueSearchBasic.
     * 
     * @return dateReleased
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getDateReleased() {
        return dateReleased;
    }


    /**
     * Sets the dateReleased value for this IssueSearchBasic.
     * 
     * @param dateReleased
     */
    public void setDateReleased(org.mule.module.netsuite.api.internal.SearchDateField dateReleased) {
        this.dateReleased = dateReleased;
    }


    /**
     * Gets the details value for this IssueSearchBasic.
     * 
     * @return details
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getDetails() {
        return details;
    }


    /**
     * Sets the details value for this IssueSearchBasic.
     * 
     * @param details
     */
    public void setDetails(org.mule.module.netsuite.api.internal.SearchStringField details) {
        this.details = details;
    }


    /**
     * Gets the duplicateOf value for this IssueSearchBasic.
     * 
     * @return duplicateOf
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getDuplicateOf() {
        return duplicateOf;
    }


    /**
     * Sets the duplicateOf value for this IssueSearchBasic.
     * 
     * @param duplicateOf
     */
    public void setDuplicateOf(org.mule.module.netsuite.api.internal.SearchMultiSelectField duplicateOf) {
        this.duplicateOf = duplicateOf;
    }


    /**
     * Gets the eFix value for this IssueSearchBasic.
     * 
     * @return eFix
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getEFix() {
        return eFix;
    }


    /**
     * Sets the eFix value for this IssueSearchBasic.
     * 
     * @param eFix
     */
    public void setEFix(org.mule.module.netsuite.api.internal.SearchBooleanField eFix) {
        this.eFix = eFix;
    }


    /**
     * Gets the employeeOrTeam value for this IssueSearchBasic.
     * 
     * @return employeeOrTeam
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getEmployeeOrTeam() {
        return employeeOrTeam;
    }


    /**
     * Sets the employeeOrTeam value for this IssueSearchBasic.
     * 
     * @param employeeOrTeam
     */
    public void setEmployeeOrTeam(org.mule.module.netsuite.api.internal.SearchMultiSelectField employeeOrTeam) {
        this.employeeOrTeam = employeeOrTeam;
    }


    /**
     * Gets the eventStatus value for this IssueSearchBasic.
     * 
     * @return eventStatus
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getEventStatus() {
        return eventStatus;
    }


    /**
     * Sets the eventStatus value for this IssueSearchBasic.
     * 
     * @param eventStatus
     */
    public void setEventStatus(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField eventStatus) {
        this.eventStatus = eventStatus;
    }


    /**
     * Gets the externalAbstract value for this IssueSearchBasic.
     * 
     * @return externalAbstract
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getExternalAbstract() {
        return externalAbstract;
    }


    /**
     * Sets the externalAbstract value for this IssueSearchBasic.
     * 
     * @param externalAbstract
     */
    public void setExternalAbstract(org.mule.module.netsuite.api.internal.SearchStringField externalAbstract) {
        this.externalAbstract = externalAbstract;
    }


    /**
     * Gets the externalDetails value for this IssueSearchBasic.
     * 
     * @return externalDetails
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getExternalDetails() {
        return externalDetails;
    }


    /**
     * Sets the externalDetails value for this IssueSearchBasic.
     * 
     * @param externalDetails
     */
    public void setExternalDetails(org.mule.module.netsuite.api.internal.SearchStringField externalDetails) {
        this.externalDetails = externalDetails;
    }


    /**
     * Gets the externalFixedIn value for this IssueSearchBasic.
     * 
     * @return externalFixedIn
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getExternalFixedIn() {
        return externalFixedIn;
    }


    /**
     * Sets the externalFixedIn value for this IssueSearchBasic.
     * 
     * @param externalFixedIn
     */
    public void setExternalFixedIn(org.mule.module.netsuite.api.internal.SearchMultiSelectField externalFixedIn) {
        this.externalFixedIn = externalFixedIn;
    }


    /**
     * Gets the externalStatus value for this IssueSearchBasic.
     * 
     * @return externalStatus
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getExternalStatus() {
        return externalStatus;
    }


    /**
     * Sets the externalStatus value for this IssueSearchBasic.
     * 
     * @param externalStatus
     */
    public void setExternalStatus(org.mule.module.netsuite.api.internal.SearchMultiSelectField externalStatus) {
        this.externalStatus = externalStatus;
    }


    /**
     * Gets the fixed value for this IssueSearchBasic.
     * 
     * @return fixed
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getFixed() {
        return fixed;
    }


    /**
     * Sets the fixed value for this IssueSearchBasic.
     * 
     * @param fixed
     */
    public void setFixed(org.mule.module.netsuite.api.internal.SearchDateField fixed) {
        this.fixed = fixed;
    }


    /**
     * Gets the fixedBy value for this IssueSearchBasic.
     * 
     * @return fixedBy
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getFixedBy() {
        return fixedBy;
    }


    /**
     * Sets the fixedBy value for this IssueSearchBasic.
     * 
     * @param fixedBy
     */
    public void setFixedBy(org.mule.module.netsuite.api.internal.SearchMultiSelectField fixedBy) {
        this.fixedBy = fixedBy;
    }


    /**
     * Gets the internalId value for this IssueSearchBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this IssueSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this IssueSearchBasic.
     * 
     * @return internalIdNumber
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this IssueSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isOwner value for this IssueSearchBasic.
     * 
     * @return isOwner
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsOwner() {
        return isOwner;
    }


    /**
     * Sets the isOwner value for this IssueSearchBasic.
     * 
     * @param isOwner
     */
    public void setIsOwner(org.mule.module.netsuite.api.internal.SearchBooleanField isOwner) {
        this.isOwner = isOwner;
    }


    /**
     * Gets the isReviewed value for this IssueSearchBasic.
     * 
     * @return isReviewed
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsReviewed() {
        return isReviewed;
    }


    /**
     * Sets the isReviewed value for this IssueSearchBasic.
     * 
     * @param isReviewed
     */
    public void setIsReviewed(org.mule.module.netsuite.api.internal.SearchBooleanField isReviewed) {
        this.isReviewed = isReviewed;
    }


    /**
     * Gets the isShowStopper value for this IssueSearchBasic.
     * 
     * @return isShowStopper
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsShowStopper() {
        return isShowStopper;
    }


    /**
     * Sets the isShowStopper value for this IssueSearchBasic.
     * 
     * @param isShowStopper
     */
    public void setIsShowStopper(org.mule.module.netsuite.api.internal.SearchBooleanField isShowStopper) {
        this.isShowStopper = isShowStopper;
    }


    /**
     * Gets the issueAbstract value for this IssueSearchBasic.
     * 
     * @return issueAbstract
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getIssueAbstract() {
        return issueAbstract;
    }


    /**
     * Sets the issueAbstract value for this IssueSearchBasic.
     * 
     * @param issueAbstract
     */
    public void setIssueAbstract(org.mule.module.netsuite.api.internal.SearchStringField issueAbstract) {
        this.issueAbstract = issueAbstract;
    }


    /**
     * Gets the issueNumber value for this IssueSearchBasic.
     * 
     * @return issueNumber
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getIssueNumber() {
        return issueNumber;
    }


    /**
     * Sets the issueNumber value for this IssueSearchBasic.
     * 
     * @param issueNumber
     */
    public void setIssueNumber(org.mule.module.netsuite.api.internal.SearchStringField issueNumber) {
        this.issueNumber = issueNumber;
    }


    /**
     * Gets the item value for this IssueSearchBasic.
     * 
     * @return item
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getItem() {
        return item;
    }


    /**
     * Sets the item value for this IssueSearchBasic.
     * 
     * @param item
     */
    public void setItem(org.mule.module.netsuite.api.internal.SearchMultiSelectField item) {
        this.item = item;
    }


    /**
     * Gets the lastModifiedDate value for this IssueSearchBasic.
     * 
     * @return lastModifiedDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this IssueSearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the module value for this IssueSearchBasic.
     * 
     * @return module
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getModule() {
        return module;
    }


    /**
     * Sets the module value for this IssueSearchBasic.
     * 
     * @param module
     */
    public void setModule(org.mule.module.netsuite.api.internal.SearchMultiSelectField module) {
        this.module = module;
    }


    /**
     * Gets the number value for this IssueSearchBasic.
     * 
     * @return number
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getNumber() {
        return number;
    }


    /**
     * Sets the number value for this IssueSearchBasic.
     * 
     * @param number
     */
    public void setNumber(org.mule.module.netsuite.api.internal.SearchLongField number) {
        this.number = number;
    }


    /**
     * Gets the originalFixedIn value for this IssueSearchBasic.
     * 
     * @return originalFixedIn
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getOriginalFixedIn() {
        return originalFixedIn;
    }


    /**
     * Sets the originalFixedIn value for this IssueSearchBasic.
     * 
     * @param originalFixedIn
     */
    public void setOriginalFixedIn(org.mule.module.netsuite.api.internal.SearchStringField originalFixedIn) {
        this.originalFixedIn = originalFixedIn;
    }


    /**
     * Gets the priority value for this IssueSearchBasic.
     * 
     * @return priority
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this IssueSearchBasic.
     * 
     * @param priority
     */
    public void setPriority(org.mule.module.netsuite.api.internal.SearchMultiSelectField priority) {
        this.priority = priority;
    }


    /**
     * Gets the product value for this IssueSearchBasic.
     * 
     * @return product
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getProduct() {
        return product;
    }


    /**
     * Sets the product value for this IssueSearchBasic.
     * 
     * @param product
     */
    public void setProduct(org.mule.module.netsuite.api.internal.SearchMultiSelectField product) {
        this.product = product;
    }


    /**
     * Gets the productTeam value for this IssueSearchBasic.
     * 
     * @return productTeam
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getProductTeam() {
        return productTeam;
    }


    /**
     * Sets the productTeam value for this IssueSearchBasic.
     * 
     * @param productTeam
     */
    public void setProductTeam(org.mule.module.netsuite.api.internal.SearchMultiSelectField productTeam) {
        this.productTeam = productTeam;
    }


    /**
     * Gets the reportedBy value for this IssueSearchBasic.
     * 
     * @return reportedBy
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getReportedBy() {
        return reportedBy;
    }


    /**
     * Sets the reportedBy value for this IssueSearchBasic.
     * 
     * @param reportedBy
     */
    public void setReportedBy(org.mule.module.netsuite.api.internal.SearchMultiSelectField reportedBy) {
        this.reportedBy = reportedBy;
    }


    /**
     * Gets the reproduce value for this IssueSearchBasic.
     * 
     * @return reproduce
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getReproduce() {
        return reproduce;
    }


    /**
     * Sets the reproduce value for this IssueSearchBasic.
     * 
     * @param reproduce
     */
    public void setReproduce(org.mule.module.netsuite.api.internal.SearchMultiSelectField reproduce) {
        this.reproduce = reproduce;
    }


    /**
     * Gets the reviewer value for this IssueSearchBasic.
     * 
     * @return reviewer
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getReviewer() {
        return reviewer;
    }


    /**
     * Sets the reviewer value for this IssueSearchBasic.
     * 
     * @param reviewer
     */
    public void setReviewer(org.mule.module.netsuite.api.internal.SearchMultiSelectField reviewer) {
        this.reviewer = reviewer;
    }


    /**
     * Gets the severity value for this IssueSearchBasic.
     * 
     * @return severity
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this IssueSearchBasic.
     * 
     * @param severity
     */
    public void setSeverity(org.mule.module.netsuite.api.internal.SearchMultiSelectField severity) {
        this.severity = severity;
    }


    /**
     * Gets the source value for this IssueSearchBasic.
     * 
     * @return source
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getSource() {
        return source;
    }


    /**
     * Sets the source value for this IssueSearchBasic.
     * 
     * @param source
     */
    public void setSource(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField source) {
        this.source = source;
    }


    /**
     * Gets the status value for this IssueSearchBasic.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getStatus() {
        return status;
    }


    /**
     * Sets the status value for this IssueSearchBasic.
     * 
     * @param status
     */
    public void setStatus(org.mule.module.netsuite.api.internal.SearchMultiSelectField status) {
        this.status = status;
    }


    /**
     * Gets the tags value for this IssueSearchBasic.
     * 
     * @return tags
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getTags() {
        return tags;
    }


    /**
     * Sets the tags value for this IssueSearchBasic.
     * 
     * @param tags
     */
    public void setTags(org.mule.module.netsuite.api.internal.SearchMultiSelectField tags) {
        this.tags = tags;
    }


    /**
     * Gets the tracking value for this IssueSearchBasic.
     * 
     * @return tracking
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getTracking() {
        return tracking;
    }


    /**
     * Sets the tracking value for this IssueSearchBasic.
     * 
     * @param tracking
     */
    public void setTracking(org.mule.module.netsuite.api.internal.SearchBooleanField tracking) {
        this.tracking = tracking;
    }


    /**
     * Gets the type value for this IssueSearchBasic.
     * 
     * @return type
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getType() {
        return type;
    }


    /**
     * Sets the type value for this IssueSearchBasic.
     * 
     * @param type
     */
    public void setType(org.mule.module.netsuite.api.internal.SearchMultiSelectField type) {
        this.type = type;
    }


    /**
     * Gets the userType value for this IssueSearchBasic.
     * 
     * @return userType
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this IssueSearchBasic.
     * 
     * @param userType
     */
    public void setUserType(org.mule.module.netsuite.api.internal.SearchMultiSelectField userType) {
        this.userType = userType;
    }


    /**
     * Gets the versionBroken value for this IssueSearchBasic.
     * 
     * @return versionBroken
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getVersionBroken() {
        return versionBroken;
    }


    /**
     * Sets the versionBroken value for this IssueSearchBasic.
     * 
     * @param versionBroken
     */
    public void setVersionBroken(org.mule.module.netsuite.api.internal.SearchMultiSelectField versionBroken) {
        this.versionBroken = versionBroken;
    }


    /**
     * Gets the versionFixed value for this IssueSearchBasic.
     * 
     * @return versionFixed
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getVersionFixed() {
        return versionFixed;
    }


    /**
     * Sets the versionFixed value for this IssueSearchBasic.
     * 
     * @param versionFixed
     */
    public void setVersionFixed(org.mule.module.netsuite.api.internal.SearchMultiSelectField versionFixed) {
        this.versionFixed = versionFixed;
    }


    /**
     * Gets the versionTarget value for this IssueSearchBasic.
     * 
     * @return versionTarget
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getVersionTarget() {
        return versionTarget;
    }


    /**
     * Sets the versionTarget value for this IssueSearchBasic.
     * 
     * @param versionTarget
     */
    public void setVersionTarget(org.mule.module.netsuite.api.internal.SearchMultiSelectField versionTarget) {
        this.versionTarget = versionTarget;
    }


    /**
     * Gets the customFieldList value for this IssueSearchBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this IssueSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IssueSearchBasic)) return false;
        IssueSearchBasic other = (IssueSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ageInMonths==null && other.getAgeInMonths()==null) || 
             (this.ageInMonths!=null &&
              this.ageInMonths.equals(other.getAgeInMonths()))) &&
            ((this.assigned==null && other.getAssigned()==null) || 
             (this.assigned!=null &&
              this.assigned.equals(other.getAssigned()))) &&
            ((this.buildBroken==null && other.getBuildBroken()==null) || 
             (this.buildBroken!=null &&
              this.buildBroken.equals(other.getBuildBroken()))) &&
            ((this.buildBrokenName==null && other.getBuildBrokenName()==null) || 
             (this.buildBrokenName!=null &&
              this.buildBrokenName.equals(other.getBuildBrokenName()))) &&
            ((this.buildFixed==null && other.getBuildFixed()==null) || 
             (this.buildFixed!=null &&
              this.buildFixed.equals(other.getBuildFixed()))) &&
            ((this.buildFixedName==null && other.getBuildFixedName()==null) || 
             (this.buildFixedName!=null &&
              this.buildFixedName.equals(other.getBuildFixedName()))) &&
            ((this.buildTarget==null && other.getBuildTarget()==null) || 
             (this.buildTarget!=null &&
              this.buildTarget.equals(other.getBuildTarget()))) &&
            ((this.buildTargetName==null && other.getBuildTargetName()==null) || 
             (this.buildTargetName!=null &&
              this.buildTargetName.equals(other.getBuildTargetName()))) &&
            ((this.caseCount==null && other.getCaseCount()==null) || 
             (this.caseCount!=null &&
              this.caseCount.equals(other.getCaseCount()))) &&
            ((this.caseNumber==null && other.getCaseNumber()==null) || 
             (this.caseNumber!=null &&
              this.caseNumber.equals(other.getCaseNumber()))) &&
            ((this.closedDate==null && other.getClosedDate()==null) || 
             (this.closedDate!=null &&
              this.closedDate.equals(other.getClosedDate()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.dateReleased==null && other.getDateReleased()==null) || 
             (this.dateReleased!=null &&
              this.dateReleased.equals(other.getDateReleased()))) &&
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              this.details.equals(other.getDetails()))) &&
            ((this.duplicateOf==null && other.getDuplicateOf()==null) || 
             (this.duplicateOf!=null &&
              this.duplicateOf.equals(other.getDuplicateOf()))) &&
            ((this.eFix==null && other.getEFix()==null) || 
             (this.eFix!=null &&
              this.eFix.equals(other.getEFix()))) &&
            ((this.employeeOrTeam==null && other.getEmployeeOrTeam()==null) || 
             (this.employeeOrTeam!=null &&
              this.employeeOrTeam.equals(other.getEmployeeOrTeam()))) &&
            ((this.eventStatus==null && other.getEventStatus()==null) || 
             (this.eventStatus!=null &&
              this.eventStatus.equals(other.getEventStatus()))) &&
            ((this.externalAbstract==null && other.getExternalAbstract()==null) || 
             (this.externalAbstract!=null &&
              this.externalAbstract.equals(other.getExternalAbstract()))) &&
            ((this.externalDetails==null && other.getExternalDetails()==null) || 
             (this.externalDetails!=null &&
              this.externalDetails.equals(other.getExternalDetails()))) &&
            ((this.externalFixedIn==null && other.getExternalFixedIn()==null) || 
             (this.externalFixedIn!=null &&
              this.externalFixedIn.equals(other.getExternalFixedIn()))) &&
            ((this.externalStatus==null && other.getExternalStatus()==null) || 
             (this.externalStatus!=null &&
              this.externalStatus.equals(other.getExternalStatus()))) &&
            ((this.fixed==null && other.getFixed()==null) || 
             (this.fixed!=null &&
              this.fixed.equals(other.getFixed()))) &&
            ((this.fixedBy==null && other.getFixedBy()==null) || 
             (this.fixedBy!=null &&
              this.fixedBy.equals(other.getFixedBy()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isOwner==null && other.getIsOwner()==null) || 
             (this.isOwner!=null &&
              this.isOwner.equals(other.getIsOwner()))) &&
            ((this.isReviewed==null && other.getIsReviewed()==null) || 
             (this.isReviewed!=null &&
              this.isReviewed.equals(other.getIsReviewed()))) &&
            ((this.isShowStopper==null && other.getIsShowStopper()==null) || 
             (this.isShowStopper!=null &&
              this.isShowStopper.equals(other.getIsShowStopper()))) &&
            ((this.issueAbstract==null && other.getIssueAbstract()==null) || 
             (this.issueAbstract!=null &&
              this.issueAbstract.equals(other.getIssueAbstract()))) &&
            ((this.issueNumber==null && other.getIssueNumber()==null) || 
             (this.issueNumber!=null &&
              this.issueNumber.equals(other.getIssueNumber()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.module==null && other.getModule()==null) || 
             (this.module!=null &&
              this.module.equals(other.getModule()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.originalFixedIn==null && other.getOriginalFixedIn()==null) || 
             (this.originalFixedIn!=null &&
              this.originalFixedIn.equals(other.getOriginalFixedIn()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.productTeam==null && other.getProductTeam()==null) || 
             (this.productTeam!=null &&
              this.productTeam.equals(other.getProductTeam()))) &&
            ((this.reportedBy==null && other.getReportedBy()==null) || 
             (this.reportedBy!=null &&
              this.reportedBy.equals(other.getReportedBy()))) &&
            ((this.reproduce==null && other.getReproduce()==null) || 
             (this.reproduce!=null &&
              this.reproduce.equals(other.getReproduce()))) &&
            ((this.reviewer==null && other.getReviewer()==null) || 
             (this.reviewer!=null &&
              this.reviewer.equals(other.getReviewer()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.tags==null && other.getTags()==null) || 
             (this.tags!=null &&
              this.tags.equals(other.getTags()))) &&
            ((this.tracking==null && other.getTracking()==null) || 
             (this.tracking!=null &&
              this.tracking.equals(other.getTracking()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              this.userType.equals(other.getUserType()))) &&
            ((this.versionBroken==null && other.getVersionBroken()==null) || 
             (this.versionBroken!=null &&
              this.versionBroken.equals(other.getVersionBroken()))) &&
            ((this.versionFixed==null && other.getVersionFixed()==null) || 
             (this.versionFixed!=null &&
              this.versionFixed.equals(other.getVersionFixed()))) &&
            ((this.versionTarget==null && other.getVersionTarget()==null) || 
             (this.versionTarget!=null &&
              this.versionTarget.equals(other.getVersionTarget()))) &&
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
        if (getAgeInMonths() != null) {
            _hashCode += getAgeInMonths().hashCode();
        }
        if (getAssigned() != null) {
            _hashCode += getAssigned().hashCode();
        }
        if (getBuildBroken() != null) {
            _hashCode += getBuildBroken().hashCode();
        }
        if (getBuildBrokenName() != null) {
            _hashCode += getBuildBrokenName().hashCode();
        }
        if (getBuildFixed() != null) {
            _hashCode += getBuildFixed().hashCode();
        }
        if (getBuildFixedName() != null) {
            _hashCode += getBuildFixedName().hashCode();
        }
        if (getBuildTarget() != null) {
            _hashCode += getBuildTarget().hashCode();
        }
        if (getBuildTargetName() != null) {
            _hashCode += getBuildTargetName().hashCode();
        }
        if (getCaseCount() != null) {
            _hashCode += getCaseCount().hashCode();
        }
        if (getCaseNumber() != null) {
            _hashCode += getCaseNumber().hashCode();
        }
        if (getClosedDate() != null) {
            _hashCode += getClosedDate().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDateReleased() != null) {
            _hashCode += getDateReleased().hashCode();
        }
        if (getDetails() != null) {
            _hashCode += getDetails().hashCode();
        }
        if (getDuplicateOf() != null) {
            _hashCode += getDuplicateOf().hashCode();
        }
        if (getEFix() != null) {
            _hashCode += getEFix().hashCode();
        }
        if (getEmployeeOrTeam() != null) {
            _hashCode += getEmployeeOrTeam().hashCode();
        }
        if (getEventStatus() != null) {
            _hashCode += getEventStatus().hashCode();
        }
        if (getExternalAbstract() != null) {
            _hashCode += getExternalAbstract().hashCode();
        }
        if (getExternalDetails() != null) {
            _hashCode += getExternalDetails().hashCode();
        }
        if (getExternalFixedIn() != null) {
            _hashCode += getExternalFixedIn().hashCode();
        }
        if (getExternalStatus() != null) {
            _hashCode += getExternalStatus().hashCode();
        }
        if (getFixed() != null) {
            _hashCode += getFixed().hashCode();
        }
        if (getFixedBy() != null) {
            _hashCode += getFixedBy().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsOwner() != null) {
            _hashCode += getIsOwner().hashCode();
        }
        if (getIsReviewed() != null) {
            _hashCode += getIsReviewed().hashCode();
        }
        if (getIsShowStopper() != null) {
            _hashCode += getIsShowStopper().hashCode();
        }
        if (getIssueAbstract() != null) {
            _hashCode += getIssueAbstract().hashCode();
        }
        if (getIssueNumber() != null) {
            _hashCode += getIssueNumber().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getModule() != null) {
            _hashCode += getModule().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getOriginalFixedIn() != null) {
            _hashCode += getOriginalFixedIn().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getProductTeam() != null) {
            _hashCode += getProductTeam().hashCode();
        }
        if (getReportedBy() != null) {
            _hashCode += getReportedBy().hashCode();
        }
        if (getReproduce() != null) {
            _hashCode += getReproduce().hashCode();
        }
        if (getReviewer() != null) {
            _hashCode += getReviewer().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTags() != null) {
            _hashCode += getTags().hashCode();
        }
        if (getTracking() != null) {
            _hashCode += getTracking().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUserType() != null) {
            _hashCode += getUserType().hashCode();
        }
        if (getVersionBroken() != null) {
            _hashCode += getVersionBroken().hashCode();
        }
        if (getVersionFixed() != null) {
            _hashCode += getVersionFixed().hashCode();
        }
        if (getVersionTarget() != null) {
            _hashCode += getVersionTarget().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IssueSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "IssueSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ageInMonths");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ageInMonths"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "assigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildBroken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buildBroken"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildBrokenName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buildBrokenName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildFixed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buildFixed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildFixedName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buildFixedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buildTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildTargetName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buildTargetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "caseCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "caseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "closedDate"));
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
        elemField.setFieldName("dateReleased");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "dateReleased"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "details"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicateOf");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "duplicateOf"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EFix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "eFix"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeOrTeam");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "employeeOrTeam"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "eventStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "externalAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "externalDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalFixedIn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "externalFixedIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "externalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fixed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fixedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("isOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isReviewed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isShowStopper");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isShowStopper"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "issueAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "issueNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("module");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "module"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalFixedIn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "originalFixedIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTeam");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "productTeam"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "reportedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reproduce");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "reproduce"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "reviewer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tags");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tags"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tracking");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tracking"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "userType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionBroken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "versionBroken"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionFixed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "versionFixed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "versionTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
