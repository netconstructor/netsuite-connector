/**
 * IssueSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class IssueSearchRowBasic  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] ageInMonths;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] assigned;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] buildBroken;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] buildFixed;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] buildTarget;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] caseCount;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] caseNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] closedDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] createdDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] dateReleased;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] duplicateOf;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] employeeOrTeam;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] eventStatus;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] externalAbstract;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] externalDetails;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] externalFixedIn;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalStatus;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] fixed;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] fixedBy;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isOwner;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isReviewed;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isShowStopper;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] issueAbstract;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] issueStatus;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] item;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModifiedDate;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] module;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] number;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] originalFixedIn;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] priority;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] product;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] productTeam;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] reportedBy;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] reproduce;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] reviewer;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] severity;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] source;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] tags;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] type;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] userType;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] versionBroken;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] versionFixed;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] versionTarget;

    private org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList;

    public IssueSearchRowBasic() {
    }

    public IssueSearchRowBasic(
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] ageInMonths,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] assigned,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] buildBroken,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] buildFixed,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] buildTarget,
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] caseCount,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] caseNumber,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] closedDate,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] createdDate,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] dateReleased,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] duplicateOf,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] employeeOrTeam,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] eventStatus,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] externalAbstract,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] externalDetails,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] externalFixedIn,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalStatus,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] fixed,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] fixedBy,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isOwner,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isReviewed,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isShowStopper,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] issueAbstract,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] issueStatus,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] item,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModifiedDate,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] module,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] number,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] originalFixedIn,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] priority,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] product,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] productTeam,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] reportedBy,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] reproduce,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] reviewer,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] severity,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] source,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] tags,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] type,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] userType,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] versionBroken,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] versionFixed,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] versionTarget,
           org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
           this.ageInMonths = ageInMonths;
           this.assigned = assigned;
           this.buildBroken = buildBroken;
           this.buildFixed = buildFixed;
           this.buildTarget = buildTarget;
           this.caseCount = caseCount;
           this.caseNumber = caseNumber;
           this.closedDate = closedDate;
           this.createdDate = createdDate;
           this.dateReleased = dateReleased;
           this.duplicateOf = duplicateOf;
           this.employeeOrTeam = employeeOrTeam;
           this.eventStatus = eventStatus;
           this.externalAbstract = externalAbstract;
           this.externalDetails = externalDetails;
           this.externalFixedIn = externalFixedIn;
           this.externalStatus = externalStatus;
           this.fixed = fixed;
           this.fixedBy = fixedBy;
           this.internalId = internalId;
           this.isOwner = isOwner;
           this.isReviewed = isReviewed;
           this.isShowStopper = isShowStopper;
           this.issueAbstract = issueAbstract;
           this.issueStatus = issueStatus;
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
           this.tags = tags;
           this.type = type;
           this.userType = userType;
           this.versionBroken = versionBroken;
           this.versionFixed = versionFixed;
           this.versionTarget = versionTarget;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the ageInMonths value for this IssueSearchRowBasic.
     * 
     * @return ageInMonths
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getAgeInMonths() {
        return ageInMonths;
    }


    /**
     * Sets the ageInMonths value for this IssueSearchRowBasic.
     * 
     * @param ageInMonths
     */
    public void setAgeInMonths(org.mule.module.netsuite.api.internal.SearchColumnLongField[] ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getAgeInMonths(int i) {
        return this.ageInMonths[i];
    }

    public void setAgeInMonths(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.ageInMonths[i] = _value;
    }


    /**
     * Gets the assigned value for this IssueSearchRowBasic.
     * 
     * @return assigned
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this IssueSearchRowBasic.
     * 
     * @param assigned
     */
    public void setAssigned(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] assigned) {
        this.assigned = assigned;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getAssigned(int i) {
        return this.assigned[i];
    }

    public void setAssigned(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.assigned[i] = _value;
    }


    /**
     * Gets the buildBroken value for this IssueSearchRowBasic.
     * 
     * @return buildBroken
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getBuildBroken() {
        return buildBroken;
    }


    /**
     * Sets the buildBroken value for this IssueSearchRowBasic.
     * 
     * @param buildBroken
     */
    public void setBuildBroken(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] buildBroken) {
        this.buildBroken = buildBroken;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getBuildBroken(int i) {
        return this.buildBroken[i];
    }

    public void setBuildBroken(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.buildBroken[i] = _value;
    }


    /**
     * Gets the buildFixed value for this IssueSearchRowBasic.
     * 
     * @return buildFixed
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getBuildFixed() {
        return buildFixed;
    }


    /**
     * Sets the buildFixed value for this IssueSearchRowBasic.
     * 
     * @param buildFixed
     */
    public void setBuildFixed(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] buildFixed) {
        this.buildFixed = buildFixed;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getBuildFixed(int i) {
        return this.buildFixed[i];
    }

    public void setBuildFixed(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.buildFixed[i] = _value;
    }


    /**
     * Gets the buildTarget value for this IssueSearchRowBasic.
     * 
     * @return buildTarget
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getBuildTarget() {
        return buildTarget;
    }


    /**
     * Sets the buildTarget value for this IssueSearchRowBasic.
     * 
     * @param buildTarget
     */
    public void setBuildTarget(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] buildTarget) {
        this.buildTarget = buildTarget;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getBuildTarget(int i) {
        return this.buildTarget[i];
    }

    public void setBuildTarget(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.buildTarget[i] = _value;
    }


    /**
     * Gets the caseCount value for this IssueSearchRowBasic.
     * 
     * @return caseCount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getCaseCount() {
        return caseCount;
    }


    /**
     * Sets the caseCount value for this IssueSearchRowBasic.
     * 
     * @param caseCount
     */
    public void setCaseCount(org.mule.module.netsuite.api.internal.SearchColumnLongField[] caseCount) {
        this.caseCount = caseCount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getCaseCount(int i) {
        return this.caseCount[i];
    }

    public void setCaseCount(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.caseCount[i] = _value;
    }


    /**
     * Gets the caseNumber value for this IssueSearchRowBasic.
     * 
     * @return caseNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getCaseNumber() {
        return caseNumber;
    }


    /**
     * Sets the caseNumber value for this IssueSearchRowBasic.
     * 
     * @param caseNumber
     */
    public void setCaseNumber(org.mule.module.netsuite.api.internal.SearchColumnStringField[] caseNumber) {
        this.caseNumber = caseNumber;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getCaseNumber(int i) {
        return this.caseNumber[i];
    }

    public void setCaseNumber(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.caseNumber[i] = _value;
    }


    /**
     * Gets the closedDate value for this IssueSearchRowBasic.
     * 
     * @return closedDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getClosedDate() {
        return closedDate;
    }


    /**
     * Sets the closedDate value for this IssueSearchRowBasic.
     * 
     * @param closedDate
     */
    public void setClosedDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] closedDate) {
        this.closedDate = closedDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getClosedDate(int i) {
        return this.closedDate[i];
    }

    public void setClosedDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.closedDate[i] = _value;
    }


    /**
     * Gets the createdDate value for this IssueSearchRowBasic.
     * 
     * @return createdDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this IssueSearchRowBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] createdDate) {
        this.createdDate = createdDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getCreatedDate(int i) {
        return this.createdDate[i];
    }

    public void setCreatedDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.createdDate[i] = _value;
    }


    /**
     * Gets the dateReleased value for this IssueSearchRowBasic.
     * 
     * @return dateReleased
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getDateReleased() {
        return dateReleased;
    }


    /**
     * Sets the dateReleased value for this IssueSearchRowBasic.
     * 
     * @param dateReleased
     */
    public void setDateReleased(org.mule.module.netsuite.api.internal.SearchColumnDateField[] dateReleased) {
        this.dateReleased = dateReleased;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getDateReleased(int i) {
        return this.dateReleased[i];
    }

    public void setDateReleased(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.dateReleased[i] = _value;
    }


    /**
     * Gets the duplicateOf value for this IssueSearchRowBasic.
     * 
     * @return duplicateOf
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getDuplicateOf() {
        return duplicateOf;
    }


    /**
     * Sets the duplicateOf value for this IssueSearchRowBasic.
     * 
     * @param duplicateOf
     */
    public void setDuplicateOf(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] duplicateOf) {
        this.duplicateOf = duplicateOf;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getDuplicateOf(int i) {
        return this.duplicateOf[i];
    }

    public void setDuplicateOf(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.duplicateOf[i] = _value;
    }


    /**
     * Gets the employeeOrTeam value for this IssueSearchRowBasic.
     * 
     * @return employeeOrTeam
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getEmployeeOrTeam() {
        return employeeOrTeam;
    }


    /**
     * Sets the employeeOrTeam value for this IssueSearchRowBasic.
     * 
     * @param employeeOrTeam
     */
    public void setEmployeeOrTeam(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] employeeOrTeam) {
        this.employeeOrTeam = employeeOrTeam;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getEmployeeOrTeam(int i) {
        return this.employeeOrTeam[i];
    }

    public void setEmployeeOrTeam(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.employeeOrTeam[i] = _value;
    }


    /**
     * Gets the eventStatus value for this IssueSearchRowBasic.
     * 
     * @return eventStatus
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getEventStatus() {
        return eventStatus;
    }


    /**
     * Sets the eventStatus value for this IssueSearchRowBasic.
     * 
     * @param eventStatus
     */
    public void setEventStatus(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] eventStatus) {
        this.eventStatus = eventStatus;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getEventStatus(int i) {
        return this.eventStatus[i];
    }

    public void setEventStatus(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.eventStatus[i] = _value;
    }


    /**
     * Gets the externalAbstract value for this IssueSearchRowBasic.
     * 
     * @return externalAbstract
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getExternalAbstract() {
        return externalAbstract;
    }


    /**
     * Sets the externalAbstract value for this IssueSearchRowBasic.
     * 
     * @param externalAbstract
     */
    public void setExternalAbstract(org.mule.module.netsuite.api.internal.SearchColumnStringField[] externalAbstract) {
        this.externalAbstract = externalAbstract;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getExternalAbstract(int i) {
        return this.externalAbstract[i];
    }

    public void setExternalAbstract(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.externalAbstract[i] = _value;
    }


    /**
     * Gets the externalDetails value for this IssueSearchRowBasic.
     * 
     * @return externalDetails
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getExternalDetails() {
        return externalDetails;
    }


    /**
     * Sets the externalDetails value for this IssueSearchRowBasic.
     * 
     * @param externalDetails
     */
    public void setExternalDetails(org.mule.module.netsuite.api.internal.SearchColumnStringField[] externalDetails) {
        this.externalDetails = externalDetails;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getExternalDetails(int i) {
        return this.externalDetails[i];
    }

    public void setExternalDetails(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.externalDetails[i] = _value;
    }


    /**
     * Gets the externalFixedIn value for this IssueSearchRowBasic.
     * 
     * @return externalFixedIn
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getExternalFixedIn() {
        return externalFixedIn;
    }


    /**
     * Sets the externalFixedIn value for this IssueSearchRowBasic.
     * 
     * @param externalFixedIn
     */
    public void setExternalFixedIn(org.mule.module.netsuite.api.internal.SearchColumnStringField[] externalFixedIn) {
        this.externalFixedIn = externalFixedIn;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getExternalFixedIn(int i) {
        return this.externalFixedIn[i];
    }

    public void setExternalFixedIn(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.externalFixedIn[i] = _value;
    }


    /**
     * Gets the externalStatus value for this IssueSearchRowBasic.
     * 
     * @return externalStatus
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getExternalStatus() {
        return externalStatus;
    }


    /**
     * Sets the externalStatus value for this IssueSearchRowBasic.
     * 
     * @param externalStatus
     */
    public void setExternalStatus(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalStatus) {
        this.externalStatus = externalStatus;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getExternalStatus(int i) {
        return this.externalStatus[i];
    }

    public void setExternalStatus(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.externalStatus[i] = _value;
    }


    /**
     * Gets the fixed value for this IssueSearchRowBasic.
     * 
     * @return fixed
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getFixed() {
        return fixed;
    }


    /**
     * Sets the fixed value for this IssueSearchRowBasic.
     * 
     * @param fixed
     */
    public void setFixed(org.mule.module.netsuite.api.internal.SearchColumnDateField[] fixed) {
        this.fixed = fixed;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getFixed(int i) {
        return this.fixed[i];
    }

    public void setFixed(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.fixed[i] = _value;
    }


    /**
     * Gets the fixedBy value for this IssueSearchRowBasic.
     * 
     * @return fixedBy
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getFixedBy() {
        return fixedBy;
    }


    /**
     * Sets the fixedBy value for this IssueSearchRowBasic.
     * 
     * @param fixedBy
     */
    public void setFixedBy(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] fixedBy) {
        this.fixedBy = fixedBy;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getFixedBy(int i) {
        return this.fixedBy[i];
    }

    public void setFixedBy(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.fixedBy[i] = _value;
    }


    /**
     * Gets the internalId value for this IssueSearchRowBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this IssueSearchRowBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }


    /**
     * Gets the isOwner value for this IssueSearchRowBasic.
     * 
     * @return isOwner
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsOwner() {
        return isOwner;
    }


    /**
     * Sets the isOwner value for this IssueSearchRowBasic.
     * 
     * @param isOwner
     */
    public void setIsOwner(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isOwner) {
        this.isOwner = isOwner;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsOwner(int i) {
        return this.isOwner[i];
    }

    public void setIsOwner(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isOwner[i] = _value;
    }


    /**
     * Gets the isReviewed value for this IssueSearchRowBasic.
     * 
     * @return isReviewed
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsReviewed() {
        return isReviewed;
    }


    /**
     * Sets the isReviewed value for this IssueSearchRowBasic.
     * 
     * @param isReviewed
     */
    public void setIsReviewed(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isReviewed) {
        this.isReviewed = isReviewed;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsReviewed(int i) {
        return this.isReviewed[i];
    }

    public void setIsReviewed(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isReviewed[i] = _value;
    }


    /**
     * Gets the isShowStopper value for this IssueSearchRowBasic.
     * 
     * @return isShowStopper
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsShowStopper() {
        return isShowStopper;
    }


    /**
     * Sets the isShowStopper value for this IssueSearchRowBasic.
     * 
     * @param isShowStopper
     */
    public void setIsShowStopper(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isShowStopper) {
        this.isShowStopper = isShowStopper;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsShowStopper(int i) {
        return this.isShowStopper[i];
    }

    public void setIsShowStopper(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isShowStopper[i] = _value;
    }


    /**
     * Gets the issueAbstract value for this IssueSearchRowBasic.
     * 
     * @return issueAbstract
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getIssueAbstract() {
        return issueAbstract;
    }


    /**
     * Sets the issueAbstract value for this IssueSearchRowBasic.
     * 
     * @param issueAbstract
     */
    public void setIssueAbstract(org.mule.module.netsuite.api.internal.SearchColumnStringField[] issueAbstract) {
        this.issueAbstract = issueAbstract;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getIssueAbstract(int i) {
        return this.issueAbstract[i];
    }

    public void setIssueAbstract(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.issueAbstract[i] = _value;
    }


    /**
     * Gets the issueStatus value for this IssueSearchRowBasic.
     * 
     * @return issueStatus
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getIssueStatus() {
        return issueStatus;
    }


    /**
     * Sets the issueStatus value for this IssueSearchRowBasic.
     * 
     * @param issueStatus
     */
    public void setIssueStatus(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] issueStatus) {
        this.issueStatus = issueStatus;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getIssueStatus(int i) {
        return this.issueStatus[i];
    }

    public void setIssueStatus(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.issueStatus[i] = _value;
    }


    /**
     * Gets the item value for this IssueSearchRowBasic.
     * 
     * @return item
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this IssueSearchRowBasic.
     * 
     * @param item
     */
    public void setItem(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] item) {
        this.item = item;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.item[i] = _value;
    }


    /**
     * Gets the lastModifiedDate value for this IssueSearchRowBasic.
     * 
     * @return lastModifiedDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this IssueSearchRowBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getLastModifiedDate(int i) {
        return this.lastModifiedDate[i];
    }

    public void setLastModifiedDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.lastModifiedDate[i] = _value;
    }


    /**
     * Gets the module value for this IssueSearchRowBasic.
     * 
     * @return module
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getModule() {
        return module;
    }


    /**
     * Sets the module value for this IssueSearchRowBasic.
     * 
     * @param module
     */
    public void setModule(org.mule.module.netsuite.api.internal.SearchColumnStringField[] module) {
        this.module = module;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getModule(int i) {
        return this.module[i];
    }

    public void setModule(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.module[i] = _value;
    }


    /**
     * Gets the number value for this IssueSearchRowBasic.
     * 
     * @return number
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getNumber() {
        return number;
    }


    /**
     * Sets the number value for this IssueSearchRowBasic.
     * 
     * @param number
     */
    public void setNumber(org.mule.module.netsuite.api.internal.SearchColumnStringField[] number) {
        this.number = number;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getNumber(int i) {
        return this.number[i];
    }

    public void setNumber(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.number[i] = _value;
    }


    /**
     * Gets the originalFixedIn value for this IssueSearchRowBasic.
     * 
     * @return originalFixedIn
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getOriginalFixedIn() {
        return originalFixedIn;
    }


    /**
     * Sets the originalFixedIn value for this IssueSearchRowBasic.
     * 
     * @param originalFixedIn
     */
    public void setOriginalFixedIn(org.mule.module.netsuite.api.internal.SearchColumnStringField[] originalFixedIn) {
        this.originalFixedIn = originalFixedIn;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getOriginalFixedIn(int i) {
        return this.originalFixedIn[i];
    }

    public void setOriginalFixedIn(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.originalFixedIn[i] = _value;
    }


    /**
     * Gets the priority value for this IssueSearchRowBasic.
     * 
     * @return priority
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this IssueSearchRowBasic.
     * 
     * @param priority
     */
    public void setPriority(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] priority) {
        this.priority = priority;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getPriority(int i) {
        return this.priority[i];
    }

    public void setPriority(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.priority[i] = _value;
    }


    /**
     * Gets the product value for this IssueSearchRowBasic.
     * 
     * @return product
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getProduct() {
        return product;
    }


    /**
     * Sets the product value for this IssueSearchRowBasic.
     * 
     * @param product
     */
    public void setProduct(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] product) {
        this.product = product;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getProduct(int i) {
        return this.product[i];
    }

    public void setProduct(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.product[i] = _value;
    }


    /**
     * Gets the productTeam value for this IssueSearchRowBasic.
     * 
     * @return productTeam
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getProductTeam() {
        return productTeam;
    }


    /**
     * Sets the productTeam value for this IssueSearchRowBasic.
     * 
     * @param productTeam
     */
    public void setProductTeam(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] productTeam) {
        this.productTeam = productTeam;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getProductTeam(int i) {
        return this.productTeam[i];
    }

    public void setProductTeam(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.productTeam[i] = _value;
    }


    /**
     * Gets the reportedBy value for this IssueSearchRowBasic.
     * 
     * @return reportedBy
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getReportedBy() {
        return reportedBy;
    }


    /**
     * Sets the reportedBy value for this IssueSearchRowBasic.
     * 
     * @param reportedBy
     */
    public void setReportedBy(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] reportedBy) {
        this.reportedBy = reportedBy;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getReportedBy(int i) {
        return this.reportedBy[i];
    }

    public void setReportedBy(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.reportedBy[i] = _value;
    }


    /**
     * Gets the reproduce value for this IssueSearchRowBasic.
     * 
     * @return reproduce
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getReproduce() {
        return reproduce;
    }


    /**
     * Sets the reproduce value for this IssueSearchRowBasic.
     * 
     * @param reproduce
     */
    public void setReproduce(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] reproduce) {
        this.reproduce = reproduce;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getReproduce(int i) {
        return this.reproduce[i];
    }

    public void setReproduce(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.reproduce[i] = _value;
    }


    /**
     * Gets the reviewer value for this IssueSearchRowBasic.
     * 
     * @return reviewer
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getReviewer() {
        return reviewer;
    }


    /**
     * Sets the reviewer value for this IssueSearchRowBasic.
     * 
     * @param reviewer
     */
    public void setReviewer(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] reviewer) {
        this.reviewer = reviewer;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getReviewer(int i) {
        return this.reviewer[i];
    }

    public void setReviewer(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.reviewer[i] = _value;
    }


    /**
     * Gets the severity value for this IssueSearchRowBasic.
     * 
     * @return severity
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this IssueSearchRowBasic.
     * 
     * @param severity
     */
    public void setSeverity(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] severity) {
        this.severity = severity;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getSeverity(int i) {
        return this.severity[i];
    }

    public void setSeverity(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.severity[i] = _value;
    }


    /**
     * Gets the source value for this IssueSearchRowBasic.
     * 
     * @return source
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getSource() {
        return source;
    }


    /**
     * Sets the source value for this IssueSearchRowBasic.
     * 
     * @param source
     */
    public void setSource(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] source) {
        this.source = source;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getSource(int i) {
        return this.source[i];
    }

    public void setSource(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.source[i] = _value;
    }


    /**
     * Gets the tags value for this IssueSearchRowBasic.
     * 
     * @return tags
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getTags() {
        return tags;
    }


    /**
     * Sets the tags value for this IssueSearchRowBasic.
     * 
     * @param tags
     */
    public void setTags(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] tags) {
        this.tags = tags;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getTags(int i) {
        return this.tags[i];
    }

    public void setTags(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.tags[i] = _value;
    }


    /**
     * Gets the type value for this IssueSearchRowBasic.
     * 
     * @return type
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getType() {
        return type;
    }


    /**
     * Sets the type value for this IssueSearchRowBasic.
     * 
     * @param type
     */
    public void setType(org.mule.module.netsuite.api.internal.SearchColumnStringField[] type) {
        this.type = type;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getType(int i) {
        return this.type[i];
    }

    public void setType(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.type[i] = _value;
    }


    /**
     * Gets the userType value for this IssueSearchRowBasic.
     * 
     * @return userType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this IssueSearchRowBasic.
     * 
     * @param userType
     */
    public void setUserType(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] userType) {
        this.userType = userType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getUserType(int i) {
        return this.userType[i];
    }

    public void setUserType(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.userType[i] = _value;
    }


    /**
     * Gets the versionBroken value for this IssueSearchRowBasic.
     * 
     * @return versionBroken
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getVersionBroken() {
        return versionBroken;
    }


    /**
     * Sets the versionBroken value for this IssueSearchRowBasic.
     * 
     * @param versionBroken
     */
    public void setVersionBroken(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] versionBroken) {
        this.versionBroken = versionBroken;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getVersionBroken(int i) {
        return this.versionBroken[i];
    }

    public void setVersionBroken(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.versionBroken[i] = _value;
    }


    /**
     * Gets the versionFixed value for this IssueSearchRowBasic.
     * 
     * @return versionFixed
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getVersionFixed() {
        return versionFixed;
    }


    /**
     * Sets the versionFixed value for this IssueSearchRowBasic.
     * 
     * @param versionFixed
     */
    public void setVersionFixed(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] versionFixed) {
        this.versionFixed = versionFixed;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getVersionFixed(int i) {
        return this.versionFixed[i];
    }

    public void setVersionFixed(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.versionFixed[i] = _value;
    }


    /**
     * Gets the versionTarget value for this IssueSearchRowBasic.
     * 
     * @return versionTarget
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getVersionTarget() {
        return versionTarget;
    }


    /**
     * Sets the versionTarget value for this IssueSearchRowBasic.
     * 
     * @param versionTarget
     */
    public void setVersionTarget(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] versionTarget) {
        this.versionTarget = versionTarget;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getVersionTarget(int i) {
        return this.versionTarget[i];
    }

    public void setVersionTarget(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.versionTarget[i] = _value;
    }


    /**
     * Gets the customFieldList value for this IssueSearchRowBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this IssueSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IssueSearchRowBasic)) return false;
        IssueSearchRowBasic other = (IssueSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ageInMonths==null && other.getAgeInMonths()==null) || 
             (this.ageInMonths!=null &&
              java.util.Arrays.equals(this.ageInMonths, other.getAgeInMonths()))) &&
            ((this.assigned==null && other.getAssigned()==null) || 
             (this.assigned!=null &&
              java.util.Arrays.equals(this.assigned, other.getAssigned()))) &&
            ((this.buildBroken==null && other.getBuildBroken()==null) || 
             (this.buildBroken!=null &&
              java.util.Arrays.equals(this.buildBroken, other.getBuildBroken()))) &&
            ((this.buildFixed==null && other.getBuildFixed()==null) || 
             (this.buildFixed!=null &&
              java.util.Arrays.equals(this.buildFixed, other.getBuildFixed()))) &&
            ((this.buildTarget==null && other.getBuildTarget()==null) || 
             (this.buildTarget!=null &&
              java.util.Arrays.equals(this.buildTarget, other.getBuildTarget()))) &&
            ((this.caseCount==null && other.getCaseCount()==null) || 
             (this.caseCount!=null &&
              java.util.Arrays.equals(this.caseCount, other.getCaseCount()))) &&
            ((this.caseNumber==null && other.getCaseNumber()==null) || 
             (this.caseNumber!=null &&
              java.util.Arrays.equals(this.caseNumber, other.getCaseNumber()))) &&
            ((this.closedDate==null && other.getClosedDate()==null) || 
             (this.closedDate!=null &&
              java.util.Arrays.equals(this.closedDate, other.getClosedDate()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              java.util.Arrays.equals(this.createdDate, other.getCreatedDate()))) &&
            ((this.dateReleased==null && other.getDateReleased()==null) || 
             (this.dateReleased!=null &&
              java.util.Arrays.equals(this.dateReleased, other.getDateReleased()))) &&
            ((this.duplicateOf==null && other.getDuplicateOf()==null) || 
             (this.duplicateOf!=null &&
              java.util.Arrays.equals(this.duplicateOf, other.getDuplicateOf()))) &&
            ((this.employeeOrTeam==null && other.getEmployeeOrTeam()==null) || 
             (this.employeeOrTeam!=null &&
              java.util.Arrays.equals(this.employeeOrTeam, other.getEmployeeOrTeam()))) &&
            ((this.eventStatus==null && other.getEventStatus()==null) || 
             (this.eventStatus!=null &&
              java.util.Arrays.equals(this.eventStatus, other.getEventStatus()))) &&
            ((this.externalAbstract==null && other.getExternalAbstract()==null) || 
             (this.externalAbstract!=null &&
              java.util.Arrays.equals(this.externalAbstract, other.getExternalAbstract()))) &&
            ((this.externalDetails==null && other.getExternalDetails()==null) || 
             (this.externalDetails!=null &&
              java.util.Arrays.equals(this.externalDetails, other.getExternalDetails()))) &&
            ((this.externalFixedIn==null && other.getExternalFixedIn()==null) || 
             (this.externalFixedIn!=null &&
              java.util.Arrays.equals(this.externalFixedIn, other.getExternalFixedIn()))) &&
            ((this.externalStatus==null && other.getExternalStatus()==null) || 
             (this.externalStatus!=null &&
              java.util.Arrays.equals(this.externalStatus, other.getExternalStatus()))) &&
            ((this.fixed==null && other.getFixed()==null) || 
             (this.fixed!=null &&
              java.util.Arrays.equals(this.fixed, other.getFixed()))) &&
            ((this.fixedBy==null && other.getFixedBy()==null) || 
             (this.fixedBy!=null &&
              java.util.Arrays.equals(this.fixedBy, other.getFixedBy()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isOwner==null && other.getIsOwner()==null) || 
             (this.isOwner!=null &&
              java.util.Arrays.equals(this.isOwner, other.getIsOwner()))) &&
            ((this.isReviewed==null && other.getIsReviewed()==null) || 
             (this.isReviewed!=null &&
              java.util.Arrays.equals(this.isReviewed, other.getIsReviewed()))) &&
            ((this.isShowStopper==null && other.getIsShowStopper()==null) || 
             (this.isShowStopper!=null &&
              java.util.Arrays.equals(this.isShowStopper, other.getIsShowStopper()))) &&
            ((this.issueAbstract==null && other.getIssueAbstract()==null) || 
             (this.issueAbstract!=null &&
              java.util.Arrays.equals(this.issueAbstract, other.getIssueAbstract()))) &&
            ((this.issueStatus==null && other.getIssueStatus()==null) || 
             (this.issueStatus!=null &&
              java.util.Arrays.equals(this.issueStatus, other.getIssueStatus()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              java.util.Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate()))) &&
            ((this.module==null && other.getModule()==null) || 
             (this.module!=null &&
              java.util.Arrays.equals(this.module, other.getModule()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              java.util.Arrays.equals(this.number, other.getNumber()))) &&
            ((this.originalFixedIn==null && other.getOriginalFixedIn()==null) || 
             (this.originalFixedIn!=null &&
              java.util.Arrays.equals(this.originalFixedIn, other.getOriginalFixedIn()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              java.util.Arrays.equals(this.priority, other.getPriority()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              java.util.Arrays.equals(this.product, other.getProduct()))) &&
            ((this.productTeam==null && other.getProductTeam()==null) || 
             (this.productTeam!=null &&
              java.util.Arrays.equals(this.productTeam, other.getProductTeam()))) &&
            ((this.reportedBy==null && other.getReportedBy()==null) || 
             (this.reportedBy!=null &&
              java.util.Arrays.equals(this.reportedBy, other.getReportedBy()))) &&
            ((this.reproduce==null && other.getReproduce()==null) || 
             (this.reproduce!=null &&
              java.util.Arrays.equals(this.reproduce, other.getReproduce()))) &&
            ((this.reviewer==null && other.getReviewer()==null) || 
             (this.reviewer!=null &&
              java.util.Arrays.equals(this.reviewer, other.getReviewer()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              java.util.Arrays.equals(this.severity, other.getSeverity()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              java.util.Arrays.equals(this.source, other.getSource()))) &&
            ((this.tags==null && other.getTags()==null) || 
             (this.tags!=null &&
              java.util.Arrays.equals(this.tags, other.getTags()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType()))) &&
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              java.util.Arrays.equals(this.userType, other.getUserType()))) &&
            ((this.versionBroken==null && other.getVersionBroken()==null) || 
             (this.versionBroken!=null &&
              java.util.Arrays.equals(this.versionBroken, other.getVersionBroken()))) &&
            ((this.versionFixed==null && other.getVersionFixed()==null) || 
             (this.versionFixed!=null &&
              java.util.Arrays.equals(this.versionFixed, other.getVersionFixed()))) &&
            ((this.versionTarget==null && other.getVersionTarget()==null) || 
             (this.versionTarget!=null &&
              java.util.Arrays.equals(this.versionTarget, other.getVersionTarget()))) &&
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
        int _hashCode = 1;
        if (getAgeInMonths() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAgeInMonths());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAgeInMonths(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssigned() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssigned());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssigned(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuildBroken() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuildBroken());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuildBroken(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuildFixed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuildFixed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuildFixed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuildTarget() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuildTarget());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuildTarget(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCaseCount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaseCount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaseCount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCaseNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaseNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaseNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClosedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClosedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClosedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateReleased() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDateReleased());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDateReleased(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDuplicateOf() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDuplicateOf());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDuplicateOf(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmployeeOrTeam() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployeeOrTeam());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployeeOrTeam(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEventStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalAbstract() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalAbstract());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalAbstract(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalFixedIn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalFixedIn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalFixedIn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFixed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFixed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFixed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFixedBy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFixedBy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFixedBy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsOwner() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsOwner());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsOwner(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsReviewed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsReviewed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsReviewed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsShowStopper() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsShowStopper());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsShowStopper(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIssueAbstract() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIssueAbstract());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIssueAbstract(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIssueStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIssueStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIssueStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastModifiedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastModifiedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastModifiedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getModule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOriginalFixedIn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOriginalFixedIn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOriginalFixedIn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProduct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProduct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProduct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductTeam() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductTeam());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductTeam(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReportedBy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReportedBy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReportedBy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReproduce() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReproduce());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReproduce(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReviewer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReviewer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReviewer(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSeverity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeverity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeverity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTags(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVersionBroken() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVersionBroken());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVersionBroken(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVersionFixed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVersionFixed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVersionFixed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVersionTarget() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVersionTarget());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVersionTarget(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IssueSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "IssueSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ageInMonths");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ageInMonths"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "assigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildBroken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buildBroken"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildFixed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buildFixed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buildTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "caseCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "caseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "closedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateReleased");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "dateReleased"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicateOf");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "duplicateOf"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeOrTeam");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "employeeOrTeam"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "eventStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "externalAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "externalDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalFixedIn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "externalFixedIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "externalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fixed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fixedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isReviewed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isShowStopper");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isShowStopper"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueAbstract");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "issueAbstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "issueStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("module");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "module"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalFixedIn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "originalFixedIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTeam");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "productTeam"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "reportedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reproduce");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "reproduce"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "reviewer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tags");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tags"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "userType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionBroken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "versionBroken"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionFixed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "versionFixed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "versionTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnCustomFieldList"));
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
