/**
 * OpportunitySearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class OpportunitySearchBasic  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchDoubleField amount;

    private org.mule.module.netsuite.api.internal.SearchBooleanField availableOffline;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField buyingReason;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField buyingTimeFrame;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField _class;

    private org.mule.module.netsuite.api.internal.SearchDateField closeDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField competitor;

    private org.mule.module.netsuite.api.internal.SearchLongField contribution;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField currencyName;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField custType;

    private org.mule.module.netsuite.api.internal.SearchDateField dateCreated;

    private org.mule.module.netsuite.api.internal.SearchLongField daysOpen;

    private org.mule.module.netsuite.api.internal.SearchLongField daysToClose;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField department;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField entity;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField entityStatus;

    private org.mule.module.netsuite.api.internal.SearchDoubleField estimatedBudget;

    private org.mule.module.netsuite.api.internal.SearchDateField expectedCloseDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId;

    private org.mule.module.netsuite.api.internal.SearchStringField externalIdString;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField forecastType;

    private org.mule.module.netsuite.api.internal.SearchDoubleField fxTranCostEstimate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId;

    private org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isBudgetApproved;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField item;

    private org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField leadSource;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField location;

    private org.mule.module.netsuite.api.internal.SearchStringField memo;

    private org.mule.module.netsuite.api.internal.SearchLongField number;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField partner;

    private org.mule.module.netsuite.api.internal.SearchLongField partnerContribution;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField partnerRole;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField partnerTeamMember;

    private org.mule.module.netsuite.api.internal.RecordRef postingPeriod;

    private org.mule.module.netsuite.api.internal.PostingPeriodDate postingPeriodRelative;

    private org.mule.module.netsuite.api.internal.SearchLongField probability;

    private org.mule.module.netsuite.api.internal.SearchDoubleField projAltSalesAmt;

    private org.mule.module.netsuite.api.internal.SearchDoubleField projectedTotal;

    private org.mule.module.netsuite.api.internal.SearchDoubleField rangeHigh;

    private org.mule.module.netsuite.api.internal.SearchDoubleField rangeHighAlt;

    private org.mule.module.netsuite.api.internal.SearchDoubleField rangeLow;

    private org.mule.module.netsuite.api.internal.SearchDoubleField rangeLowAlt;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField salesReadiness;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField salesRep;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField salesTeamMember;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField salesTeamRole;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField status;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary;

    private org.mule.module.netsuite.api.internal.RecordRef taxPeriod;

    private org.mule.module.netsuite.api.internal.PostingPeriodDate taxPeriodRelative;

    private org.mule.module.netsuite.api.internal.SearchStringField title;

    private org.mule.module.netsuite.api.internal.SearchDoubleField tranCostEstimate;

    private org.mule.module.netsuite.api.internal.SearchDateField tranDate;

    private org.mule.module.netsuite.api.internal.SearchDoubleField tranEstGrossProfit;

    private org.mule.module.netsuite.api.internal.SearchDoubleField tranEstGrossProfitPct;

    private org.mule.module.netsuite.api.internal.SearchDoubleField tranFxEstGrossProfit;

    private org.mule.module.netsuite.api.internal.SearchStringField tranId;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField winLossReason;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField wonBy;

    private org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList;

    public OpportunitySearchBasic() {
    }

    public OpportunitySearchBasic(
           org.mule.module.netsuite.api.internal.SearchDoubleField amount,
           org.mule.module.netsuite.api.internal.SearchBooleanField availableOffline,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField buyingReason,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField buyingTimeFrame,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField _class,
           org.mule.module.netsuite.api.internal.SearchDateField closeDate,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField competitor,
           org.mule.module.netsuite.api.internal.SearchLongField contribution,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField currencyName,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField custType,
           org.mule.module.netsuite.api.internal.SearchDateField dateCreated,
           org.mule.module.netsuite.api.internal.SearchLongField daysOpen,
           org.mule.module.netsuite.api.internal.SearchLongField daysToClose,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField department,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField entity,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField entityStatus,
           org.mule.module.netsuite.api.internal.SearchDoubleField estimatedBudget,
           org.mule.module.netsuite.api.internal.SearchDateField expectedCloseDate,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId,
           org.mule.module.netsuite.api.internal.SearchStringField externalIdString,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField forecastType,
           org.mule.module.netsuite.api.internal.SearchDoubleField fxTranCostEstimate,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId,
           org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber,
           org.mule.module.netsuite.api.internal.SearchBooleanField isBudgetApproved,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField item,
           org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField leadSource,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField location,
           org.mule.module.netsuite.api.internal.SearchStringField memo,
           org.mule.module.netsuite.api.internal.SearchLongField number,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField partner,
           org.mule.module.netsuite.api.internal.SearchLongField partnerContribution,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField partnerRole,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField partnerTeamMember,
           org.mule.module.netsuite.api.internal.RecordRef postingPeriod,
           org.mule.module.netsuite.api.internal.PostingPeriodDate postingPeriodRelative,
           org.mule.module.netsuite.api.internal.SearchLongField probability,
           org.mule.module.netsuite.api.internal.SearchDoubleField projAltSalesAmt,
           org.mule.module.netsuite.api.internal.SearchDoubleField projectedTotal,
           org.mule.module.netsuite.api.internal.SearchDoubleField rangeHigh,
           org.mule.module.netsuite.api.internal.SearchDoubleField rangeHighAlt,
           org.mule.module.netsuite.api.internal.SearchDoubleField rangeLow,
           org.mule.module.netsuite.api.internal.SearchDoubleField rangeLowAlt,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField salesReadiness,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField salesRep,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField salesTeamMember,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField salesTeamRole,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField status,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary,
           org.mule.module.netsuite.api.internal.RecordRef taxPeriod,
           org.mule.module.netsuite.api.internal.PostingPeriodDate taxPeriodRelative,
           org.mule.module.netsuite.api.internal.SearchStringField title,
           org.mule.module.netsuite.api.internal.SearchDoubleField tranCostEstimate,
           org.mule.module.netsuite.api.internal.SearchDateField tranDate,
           org.mule.module.netsuite.api.internal.SearchDoubleField tranEstGrossProfit,
           org.mule.module.netsuite.api.internal.SearchDoubleField tranEstGrossProfitPct,
           org.mule.module.netsuite.api.internal.SearchDoubleField tranFxEstGrossProfit,
           org.mule.module.netsuite.api.internal.SearchStringField tranId,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField winLossReason,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField wonBy,
           org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.amount = amount;
        this.availableOffline = availableOffline;
        this.buyingReason = buyingReason;
        this.buyingTimeFrame = buyingTimeFrame;
        this._class = _class;
        this.closeDate = closeDate;
        this.competitor = competitor;
        this.contribution = contribution;
        this.currencyName = currencyName;
        this.custType = custType;
        this.dateCreated = dateCreated;
        this.daysOpen = daysOpen;
        this.daysToClose = daysToClose;
        this.department = department;
        this.entity = entity;
        this.entityStatus = entityStatus;
        this.estimatedBudget = estimatedBudget;
        this.expectedCloseDate = expectedCloseDate;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.forecastType = forecastType;
        this.fxTranCostEstimate = fxTranCostEstimate;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isBudgetApproved = isBudgetApproved;
        this.item = item;
        this.lastModifiedDate = lastModifiedDate;
        this.leadSource = leadSource;
        this.location = location;
        this.memo = memo;
        this.number = number;
        this.partner = partner;
        this.partnerContribution = partnerContribution;
        this.partnerRole = partnerRole;
        this.partnerTeamMember = partnerTeamMember;
        this.postingPeriod = postingPeriod;
        this.postingPeriodRelative = postingPeriodRelative;
        this.probability = probability;
        this.projAltSalesAmt = projAltSalesAmt;
        this.projectedTotal = projectedTotal;
        this.rangeHigh = rangeHigh;
        this.rangeHighAlt = rangeHighAlt;
        this.rangeLow = rangeLow;
        this.rangeLowAlt = rangeLowAlt;
        this.salesReadiness = salesReadiness;
        this.salesRep = salesRep;
        this.salesTeamMember = salesTeamMember;
        this.salesTeamRole = salesTeamRole;
        this.status = status;
        this.subsidiary = subsidiary;
        this.taxPeriod = taxPeriod;
        this.taxPeriodRelative = taxPeriodRelative;
        this.title = title;
        this.tranCostEstimate = tranCostEstimate;
        this.tranDate = tranDate;
        this.tranEstGrossProfit = tranEstGrossProfit;
        this.tranEstGrossProfitPct = tranEstGrossProfitPct;
        this.tranFxEstGrossProfit = tranFxEstGrossProfit;
        this.tranId = tranId;
        this.winLossReason = winLossReason;
        this.wonBy = wonBy;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the amount value for this OpportunitySearchBasic.
     * 
     * @return amount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this OpportunitySearchBasic.
     * 
     * @param amount
     */
    public void setAmount(org.mule.module.netsuite.api.internal.SearchDoubleField amount) {
        this.amount = amount;
    }


    /**
     * Gets the availableOffline value for this OpportunitySearchBasic.
     * 
     * @return availableOffline
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getAvailableOffline() {
        return availableOffline;
    }


    /**
     * Sets the availableOffline value for this OpportunitySearchBasic.
     * 
     * @param availableOffline
     */
    public void setAvailableOffline(org.mule.module.netsuite.api.internal.SearchBooleanField availableOffline) {
        this.availableOffline = availableOffline;
    }


    /**
     * Gets the buyingReason value for this OpportunitySearchBasic.
     * 
     * @return buyingReason
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getBuyingReason() {
        return buyingReason;
    }


    /**
     * Sets the buyingReason value for this OpportunitySearchBasic.
     * 
     * @param buyingReason
     */
    public void setBuyingReason(org.mule.module.netsuite.api.internal.SearchMultiSelectField buyingReason) {
        this.buyingReason = buyingReason;
    }


    /**
     * Gets the buyingTimeFrame value for this OpportunitySearchBasic.
     * 
     * @return buyingTimeFrame
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getBuyingTimeFrame() {
        return buyingTimeFrame;
    }


    /**
     * Sets the buyingTimeFrame value for this OpportunitySearchBasic.
     * 
     * @param buyingTimeFrame
     */
    public void setBuyingTimeFrame(org.mule.module.netsuite.api.internal.SearchMultiSelectField buyingTimeFrame) {
        this.buyingTimeFrame = buyingTimeFrame;
    }


    /**
     * Gets the _class value for this OpportunitySearchBasic.
     * 
     * @return _class
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this OpportunitySearchBasic.
     * 
     * @param _class
     */
    public void set_class(org.mule.module.netsuite.api.internal.SearchMultiSelectField _class) {
        this._class = _class;
    }


    /**
     * Gets the closeDate value for this OpportunitySearchBasic.
     * 
     * @return closeDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getCloseDate() {
        return closeDate;
    }


    /**
     * Sets the closeDate value for this OpportunitySearchBasic.
     * 
     * @param closeDate
     */
    public void setCloseDate(org.mule.module.netsuite.api.internal.SearchDateField closeDate) {
        this.closeDate = closeDate;
    }


    /**
     * Gets the competitor value for this OpportunitySearchBasic.
     * 
     * @return competitor
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCompetitor() {
        return competitor;
    }


    /**
     * Sets the competitor value for this OpportunitySearchBasic.
     * 
     * @param competitor
     */
    public void setCompetitor(org.mule.module.netsuite.api.internal.SearchMultiSelectField competitor) {
        this.competitor = competitor;
    }


    /**
     * Gets the contribution value for this OpportunitySearchBasic.
     * 
     * @return contribution
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getContribution() {
        return contribution;
    }


    /**
     * Sets the contribution value for this OpportunitySearchBasic.
     * 
     * @param contribution
     */
    public void setContribution(org.mule.module.netsuite.api.internal.SearchLongField contribution) {
        this.contribution = contribution;
    }


    /**
     * Gets the currencyName value for this OpportunitySearchBasic.
     * 
     * @return currencyName
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCurrencyName() {
        return currencyName;
    }


    /**
     * Sets the currencyName value for this OpportunitySearchBasic.
     * 
     * @param currencyName
     */
    public void setCurrencyName(org.mule.module.netsuite.api.internal.SearchMultiSelectField currencyName) {
        this.currencyName = currencyName;
    }


    /**
     * Gets the custType value for this OpportunitySearchBasic.
     * 
     * @return custType
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCustType() {
        return custType;
    }


    /**
     * Sets the custType value for this OpportunitySearchBasic.
     * 
     * @param custType
     */
    public void setCustType(org.mule.module.netsuite.api.internal.SearchMultiSelectField custType) {
        this.custType = custType;
    }


    /**
     * Gets the dateCreated value for this OpportunitySearchBasic.
     * 
     * @return dateCreated
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this OpportunitySearchBasic.
     * 
     * @param dateCreated
     */
    public void setDateCreated(org.mule.module.netsuite.api.internal.SearchDateField dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the daysOpen value for this OpportunitySearchBasic.
     * 
     * @return daysOpen
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getDaysOpen() {
        return daysOpen;
    }


    /**
     * Sets the daysOpen value for this OpportunitySearchBasic.
     * 
     * @param daysOpen
     */
    public void setDaysOpen(org.mule.module.netsuite.api.internal.SearchLongField daysOpen) {
        this.daysOpen = daysOpen;
    }


    /**
     * Gets the daysToClose value for this OpportunitySearchBasic.
     * 
     * @return daysToClose
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getDaysToClose() {
        return daysToClose;
    }


    /**
     * Sets the daysToClose value for this OpportunitySearchBasic.
     * 
     * @param daysToClose
     */
    public void setDaysToClose(org.mule.module.netsuite.api.internal.SearchLongField daysToClose) {
        this.daysToClose = daysToClose;
    }


    /**
     * Gets the department value for this OpportunitySearchBasic.
     * 
     * @return department
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this OpportunitySearchBasic.
     * 
     * @param department
     */
    public void setDepartment(org.mule.module.netsuite.api.internal.SearchMultiSelectField department) {
        this.department = department;
    }


    /**
     * Gets the entity value for this OpportunitySearchBasic.
     * 
     * @return entity
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this OpportunitySearchBasic.
     * 
     * @param entity
     */
    public void setEntity(org.mule.module.netsuite.api.internal.SearchMultiSelectField entity) {
        this.entity = entity;
    }


    /**
     * Gets the entityStatus value for this OpportunitySearchBasic.
     * 
     * @return entityStatus
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getEntityStatus() {
        return entityStatus;
    }


    /**
     * Sets the entityStatus value for this OpportunitySearchBasic.
     * 
     * @param entityStatus
     */
    public void setEntityStatus(org.mule.module.netsuite.api.internal.SearchMultiSelectField entityStatus) {
        this.entityStatus = entityStatus;
    }


    /**
     * Gets the estimatedBudget value for this OpportunitySearchBasic.
     * 
     * @return estimatedBudget
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getEstimatedBudget() {
        return estimatedBudget;
    }


    /**
     * Sets the estimatedBudget value for this OpportunitySearchBasic.
     * 
     * @param estimatedBudget
     */
    public void setEstimatedBudget(org.mule.module.netsuite.api.internal.SearchDoubleField estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }


    /**
     * Gets the expectedCloseDate value for this OpportunitySearchBasic.
     * 
     * @return expectedCloseDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getExpectedCloseDate() {
        return expectedCloseDate;
    }


    /**
     * Sets the expectedCloseDate value for this OpportunitySearchBasic.
     * 
     * @param expectedCloseDate
     */
    public void setExpectedCloseDate(org.mule.module.netsuite.api.internal.SearchDateField expectedCloseDate) {
        this.expectedCloseDate = expectedCloseDate;
    }


    /**
     * Gets the externalId value for this OpportunitySearchBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this OpportunitySearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this OpportunitySearchBasic.
     * 
     * @return externalIdString
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this OpportunitySearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(org.mule.module.netsuite.api.internal.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the forecastType value for this OpportunitySearchBasic.
     * 
     * @return forecastType
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getForecastType() {
        return forecastType;
    }


    /**
     * Sets the forecastType value for this OpportunitySearchBasic.
     * 
     * @param forecastType
     */
    public void setForecastType(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField forecastType) {
        this.forecastType = forecastType;
    }


    /**
     * Gets the fxTranCostEstimate value for this OpportunitySearchBasic.
     * 
     * @return fxTranCostEstimate
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getFxTranCostEstimate() {
        return fxTranCostEstimate;
    }


    /**
     * Sets the fxTranCostEstimate value for this OpportunitySearchBasic.
     * 
     * @param fxTranCostEstimate
     */
    public void setFxTranCostEstimate(org.mule.module.netsuite.api.internal.SearchDoubleField fxTranCostEstimate) {
        this.fxTranCostEstimate = fxTranCostEstimate;
    }


    /**
     * Gets the internalId value for this OpportunitySearchBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this OpportunitySearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this OpportunitySearchBasic.
     * 
     * @return internalIdNumber
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this OpportunitySearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isBudgetApproved value for this OpportunitySearchBasic.
     * 
     * @return isBudgetApproved
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsBudgetApproved() {
        return isBudgetApproved;
    }


    /**
     * Sets the isBudgetApproved value for this OpportunitySearchBasic.
     * 
     * @param isBudgetApproved
     */
    public void setIsBudgetApproved(org.mule.module.netsuite.api.internal.SearchBooleanField isBudgetApproved) {
        this.isBudgetApproved = isBudgetApproved;
    }


    /**
     * Gets the item value for this OpportunitySearchBasic.
     * 
     * @return item
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getItem() {
        return item;
    }


    /**
     * Sets the item value for this OpportunitySearchBasic.
     * 
     * @param item
     */
    public void setItem(org.mule.module.netsuite.api.internal.SearchMultiSelectField item) {
        this.item = item;
    }


    /**
     * Gets the lastModifiedDate value for this OpportunitySearchBasic.
     * 
     * @return lastModifiedDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this OpportunitySearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the leadSource value for this OpportunitySearchBasic.
     * 
     * @return leadSource
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this OpportunitySearchBasic.
     * 
     * @param leadSource
     */
    public void setLeadSource(org.mule.module.netsuite.api.internal.SearchMultiSelectField leadSource) {
        this.leadSource = leadSource;
    }


    /**
     * Gets the location value for this OpportunitySearchBasic.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getLocation() {
        return location;
    }


    /**
     * Sets the location value for this OpportunitySearchBasic.
     * 
     * @param location
     */
    public void setLocation(org.mule.module.netsuite.api.internal.SearchMultiSelectField location) {
        this.location = location;
    }


    /**
     * Gets the memo value for this OpportunitySearchBasic.
     * 
     * @return memo
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this OpportunitySearchBasic.
     * 
     * @param memo
     */
    public void setMemo(org.mule.module.netsuite.api.internal.SearchStringField memo) {
        this.memo = memo;
    }


    /**
     * Gets the number value for this OpportunitySearchBasic.
     * 
     * @return number
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getNumber() {
        return number;
    }


    /**
     * Sets the number value for this OpportunitySearchBasic.
     * 
     * @param number
     */
    public void setNumber(org.mule.module.netsuite.api.internal.SearchLongField number) {
        this.number = number;
    }


    /**
     * Gets the partner value for this OpportunitySearchBasic.
     * 
     * @return partner
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPartner() {
        return partner;
    }


    /**
     * Sets the partner value for this OpportunitySearchBasic.
     * 
     * @param partner
     */
    public void setPartner(org.mule.module.netsuite.api.internal.SearchMultiSelectField partner) {
        this.partner = partner;
    }


    /**
     * Gets the partnerContribution value for this OpportunitySearchBasic.
     * 
     * @return partnerContribution
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getPartnerContribution() {
        return partnerContribution;
    }


    /**
     * Sets the partnerContribution value for this OpportunitySearchBasic.
     * 
     * @param partnerContribution
     */
    public void setPartnerContribution(org.mule.module.netsuite.api.internal.SearchLongField partnerContribution) {
        this.partnerContribution = partnerContribution;
    }


    /**
     * Gets the partnerRole value for this OpportunitySearchBasic.
     * 
     * @return partnerRole
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPartnerRole() {
        return partnerRole;
    }


    /**
     * Sets the partnerRole value for this OpportunitySearchBasic.
     * 
     * @param partnerRole
     */
    public void setPartnerRole(org.mule.module.netsuite.api.internal.SearchMultiSelectField partnerRole) {
        this.partnerRole = partnerRole;
    }


    /**
     * Gets the partnerTeamMember value for this OpportunitySearchBasic.
     * 
     * @return partnerTeamMember
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPartnerTeamMember() {
        return partnerTeamMember;
    }


    /**
     * Sets the partnerTeamMember value for this OpportunitySearchBasic.
     * 
     * @param partnerTeamMember
     */
    public void setPartnerTeamMember(org.mule.module.netsuite.api.internal.SearchMultiSelectField partnerTeamMember) {
        this.partnerTeamMember = partnerTeamMember;
    }


    /**
     * Gets the postingPeriod value for this OpportunitySearchBasic.
     * 
     * @return postingPeriod
     */
    public org.mule.module.netsuite.api.internal.RecordRef getPostingPeriod() {
        return postingPeriod;
    }


    /**
     * Sets the postingPeriod value for this OpportunitySearchBasic.
     * 
     * @param postingPeriod
     */
    public void setPostingPeriod(org.mule.module.netsuite.api.internal.RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }


    /**
     * Gets the postingPeriodRelative value for this OpportunitySearchBasic.
     * 
     * @return postingPeriodRelative
     */
    public org.mule.module.netsuite.api.internal.PostingPeriodDate getPostingPeriodRelative() {
        return postingPeriodRelative;
    }


    /**
     * Sets the postingPeriodRelative value for this OpportunitySearchBasic.
     * 
     * @param postingPeriodRelative
     */
    public void setPostingPeriodRelative(org.mule.module.netsuite.api.internal.PostingPeriodDate postingPeriodRelative) {
        this.postingPeriodRelative = postingPeriodRelative;
    }


    /**
     * Gets the probability value for this OpportunitySearchBasic.
     * 
     * @return probability
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getProbability() {
        return probability;
    }


    /**
     * Sets the probability value for this OpportunitySearchBasic.
     * 
     * @param probability
     */
    public void setProbability(org.mule.module.netsuite.api.internal.SearchLongField probability) {
        this.probability = probability;
    }


    /**
     * Gets the projAltSalesAmt value for this OpportunitySearchBasic.
     * 
     * @return projAltSalesAmt
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getProjAltSalesAmt() {
        return projAltSalesAmt;
    }


    /**
     * Sets the projAltSalesAmt value for this OpportunitySearchBasic.
     * 
     * @param projAltSalesAmt
     */
    public void setProjAltSalesAmt(org.mule.module.netsuite.api.internal.SearchDoubleField projAltSalesAmt) {
        this.projAltSalesAmt = projAltSalesAmt;
    }


    /**
     * Gets the projectedTotal value for this OpportunitySearchBasic.
     * 
     * @return projectedTotal
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getProjectedTotal() {
        return projectedTotal;
    }


    /**
     * Sets the projectedTotal value for this OpportunitySearchBasic.
     * 
     * @param projectedTotal
     */
    public void setProjectedTotal(org.mule.module.netsuite.api.internal.SearchDoubleField projectedTotal) {
        this.projectedTotal = projectedTotal;
    }


    /**
     * Gets the rangeHigh value for this OpportunitySearchBasic.
     * 
     * @return rangeHigh
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getRangeHigh() {
        return rangeHigh;
    }


    /**
     * Sets the rangeHigh value for this OpportunitySearchBasic.
     * 
     * @param rangeHigh
     */
    public void setRangeHigh(org.mule.module.netsuite.api.internal.SearchDoubleField rangeHigh) {
        this.rangeHigh = rangeHigh;
    }


    /**
     * Gets the rangeHighAlt value for this OpportunitySearchBasic.
     * 
     * @return rangeHighAlt
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getRangeHighAlt() {
        return rangeHighAlt;
    }


    /**
     * Sets the rangeHighAlt value for this OpportunitySearchBasic.
     * 
     * @param rangeHighAlt
     */
    public void setRangeHighAlt(org.mule.module.netsuite.api.internal.SearchDoubleField rangeHighAlt) {
        this.rangeHighAlt = rangeHighAlt;
    }


    /**
     * Gets the rangeLow value for this OpportunitySearchBasic.
     * 
     * @return rangeLow
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getRangeLow() {
        return rangeLow;
    }


    /**
     * Sets the rangeLow value for this OpportunitySearchBasic.
     * 
     * @param rangeLow
     */
    public void setRangeLow(org.mule.module.netsuite.api.internal.SearchDoubleField rangeLow) {
        this.rangeLow = rangeLow;
    }


    /**
     * Gets the rangeLowAlt value for this OpportunitySearchBasic.
     * 
     * @return rangeLowAlt
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getRangeLowAlt() {
        return rangeLowAlt;
    }


    /**
     * Sets the rangeLowAlt value for this OpportunitySearchBasic.
     * 
     * @param rangeLowAlt
     */
    public void setRangeLowAlt(org.mule.module.netsuite.api.internal.SearchDoubleField rangeLowAlt) {
        this.rangeLowAlt = rangeLowAlt;
    }


    /**
     * Gets the salesReadiness value for this OpportunitySearchBasic.
     * 
     * @return salesReadiness
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSalesReadiness() {
        return salesReadiness;
    }


    /**
     * Sets the salesReadiness value for this OpportunitySearchBasic.
     * 
     * @param salesReadiness
     */
    public void setSalesReadiness(org.mule.module.netsuite.api.internal.SearchMultiSelectField salesReadiness) {
        this.salesReadiness = salesReadiness;
    }


    /**
     * Gets the salesRep value for this OpportunitySearchBasic.
     * 
     * @return salesRep
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSalesRep() {
        return salesRep;
    }


    /**
     * Sets the salesRep value for this OpportunitySearchBasic.
     * 
     * @param salesRep
     */
    public void setSalesRep(org.mule.module.netsuite.api.internal.SearchMultiSelectField salesRep) {
        this.salesRep = salesRep;
    }


    /**
     * Gets the salesTeamMember value for this OpportunitySearchBasic.
     * 
     * @return salesTeamMember
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSalesTeamMember() {
        return salesTeamMember;
    }


    /**
     * Sets the salesTeamMember value for this OpportunitySearchBasic.
     * 
     * @param salesTeamMember
     */
    public void setSalesTeamMember(org.mule.module.netsuite.api.internal.SearchMultiSelectField salesTeamMember) {
        this.salesTeamMember = salesTeamMember;
    }


    /**
     * Gets the salesTeamRole value for this OpportunitySearchBasic.
     * 
     * @return salesTeamRole
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSalesTeamRole() {
        return salesTeamRole;
    }


    /**
     * Sets the salesTeamRole value for this OpportunitySearchBasic.
     * 
     * @param salesTeamRole
     */
    public void setSalesTeamRole(org.mule.module.netsuite.api.internal.SearchMultiSelectField salesTeamRole) {
        this.salesTeamRole = salesTeamRole;
    }


    /**
     * Gets the status value for this OpportunitySearchBasic.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OpportunitySearchBasic.
     * 
     * @param status
     */
    public void setStatus(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField status) {
        this.status = status;
    }


    /**
     * Gets the subsidiary value for this OpportunitySearchBasic.
     * 
     * @return subsidiary
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this OpportunitySearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the taxPeriod value for this OpportunitySearchBasic.
     * 
     * @return taxPeriod
     */
    public org.mule.module.netsuite.api.internal.RecordRef getTaxPeriod() {
        return taxPeriod;
    }


    /**
     * Sets the taxPeriod value for this OpportunitySearchBasic.
     * 
     * @param taxPeriod
     */
    public void setTaxPeriod(org.mule.module.netsuite.api.internal.RecordRef taxPeriod) {
        this.taxPeriod = taxPeriod;
    }


    /**
     * Gets the taxPeriodRelative value for this OpportunitySearchBasic.
     * 
     * @return taxPeriodRelative
     */
    public org.mule.module.netsuite.api.internal.PostingPeriodDate getTaxPeriodRelative() {
        return taxPeriodRelative;
    }


    /**
     * Sets the taxPeriodRelative value for this OpportunitySearchBasic.
     * 
     * @param taxPeriodRelative
     */
    public void setTaxPeriodRelative(org.mule.module.netsuite.api.internal.PostingPeriodDate taxPeriodRelative) {
        this.taxPeriodRelative = taxPeriodRelative;
    }


    /**
     * Gets the title value for this OpportunitySearchBasic.
     * 
     * @return title
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getTitle() {
        return title;
    }


    /**
     * Sets the title value for this OpportunitySearchBasic.
     * 
     * @param title
     */
    public void setTitle(org.mule.module.netsuite.api.internal.SearchStringField title) {
        this.title = title;
    }


    /**
     * Gets the tranCostEstimate value for this OpportunitySearchBasic.
     * 
     * @return tranCostEstimate
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getTranCostEstimate() {
        return tranCostEstimate;
    }


    /**
     * Sets the tranCostEstimate value for this OpportunitySearchBasic.
     * 
     * @param tranCostEstimate
     */
    public void setTranCostEstimate(org.mule.module.netsuite.api.internal.SearchDoubleField tranCostEstimate) {
        this.tranCostEstimate = tranCostEstimate;
    }


    /**
     * Gets the tranDate value for this OpportunitySearchBasic.
     * 
     * @return tranDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this OpportunitySearchBasic.
     * 
     * @param tranDate
     */
    public void setTranDate(org.mule.module.netsuite.api.internal.SearchDateField tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the tranEstGrossProfit value for this OpportunitySearchBasic.
     * 
     * @return tranEstGrossProfit
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getTranEstGrossProfit() {
        return tranEstGrossProfit;
    }


    /**
     * Sets the tranEstGrossProfit value for this OpportunitySearchBasic.
     * 
     * @param tranEstGrossProfit
     */
    public void setTranEstGrossProfit(org.mule.module.netsuite.api.internal.SearchDoubleField tranEstGrossProfit) {
        this.tranEstGrossProfit = tranEstGrossProfit;
    }


    /**
     * Gets the tranEstGrossProfitPct value for this OpportunitySearchBasic.
     * 
     * @return tranEstGrossProfitPct
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getTranEstGrossProfitPct() {
        return tranEstGrossProfitPct;
    }


    /**
     * Sets the tranEstGrossProfitPct value for this OpportunitySearchBasic.
     * 
     * @param tranEstGrossProfitPct
     */
    public void setTranEstGrossProfitPct(org.mule.module.netsuite.api.internal.SearchDoubleField tranEstGrossProfitPct) {
        this.tranEstGrossProfitPct = tranEstGrossProfitPct;
    }


    /**
     * Gets the tranFxEstGrossProfit value for this OpportunitySearchBasic.
     * 
     * @return tranFxEstGrossProfit
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getTranFxEstGrossProfit() {
        return tranFxEstGrossProfit;
    }


    /**
     * Sets the tranFxEstGrossProfit value for this OpportunitySearchBasic.
     * 
     * @param tranFxEstGrossProfit
     */
    public void setTranFxEstGrossProfit(org.mule.module.netsuite.api.internal.SearchDoubleField tranFxEstGrossProfit) {
        this.tranFxEstGrossProfit = tranFxEstGrossProfit;
    }


    /**
     * Gets the tranId value for this OpportunitySearchBasic.
     * 
     * @return tranId
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this OpportunitySearchBasic.
     * 
     * @param tranId
     */
    public void setTranId(org.mule.module.netsuite.api.internal.SearchStringField tranId) {
        this.tranId = tranId;
    }


    /**
     * Gets the winLossReason value for this OpportunitySearchBasic.
     * 
     * @return winLossReason
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getWinLossReason() {
        return winLossReason;
    }


    /**
     * Sets the winLossReason value for this OpportunitySearchBasic.
     * 
     * @param winLossReason
     */
    public void setWinLossReason(org.mule.module.netsuite.api.internal.SearchMultiSelectField winLossReason) {
        this.winLossReason = winLossReason;
    }


    /**
     * Gets the wonBy value for this OpportunitySearchBasic.
     * 
     * @return wonBy
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getWonBy() {
        return wonBy;
    }


    /**
     * Sets the wonBy value for this OpportunitySearchBasic.
     * 
     * @param wonBy
     */
    public void setWonBy(org.mule.module.netsuite.api.internal.SearchMultiSelectField wonBy) {
        this.wonBy = wonBy;
    }


    /**
     * Gets the customFieldList value for this OpportunitySearchBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this OpportunitySearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OpportunitySearchBasic)) return false;
        OpportunitySearchBasic other = (OpportunitySearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.availableOffline==null && other.getAvailableOffline()==null) || 
             (this.availableOffline!=null &&
              this.availableOffline.equals(other.getAvailableOffline()))) &&
            ((this.buyingReason==null && other.getBuyingReason()==null) || 
             (this.buyingReason!=null &&
              this.buyingReason.equals(other.getBuyingReason()))) &&
            ((this.buyingTimeFrame==null && other.getBuyingTimeFrame()==null) || 
             (this.buyingTimeFrame!=null &&
              this.buyingTimeFrame.equals(other.getBuyingTimeFrame()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.closeDate==null && other.getCloseDate()==null) || 
             (this.closeDate!=null &&
              this.closeDate.equals(other.getCloseDate()))) &&
            ((this.competitor==null && other.getCompetitor()==null) || 
             (this.competitor!=null &&
              this.competitor.equals(other.getCompetitor()))) &&
            ((this.contribution==null && other.getContribution()==null) || 
             (this.contribution!=null &&
              this.contribution.equals(other.getContribution()))) &&
            ((this.currencyName==null && other.getCurrencyName()==null) || 
             (this.currencyName!=null &&
              this.currencyName.equals(other.getCurrencyName()))) &&
            ((this.custType==null && other.getCustType()==null) || 
             (this.custType!=null &&
              this.custType.equals(other.getCustType()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.daysOpen==null && other.getDaysOpen()==null) || 
             (this.daysOpen!=null &&
              this.daysOpen.equals(other.getDaysOpen()))) &&
            ((this.daysToClose==null && other.getDaysToClose()==null) || 
             (this.daysToClose!=null &&
              this.daysToClose.equals(other.getDaysToClose()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.entityStatus==null && other.getEntityStatus()==null) || 
             (this.entityStatus!=null &&
              this.entityStatus.equals(other.getEntityStatus()))) &&
            ((this.estimatedBudget==null && other.getEstimatedBudget()==null) || 
             (this.estimatedBudget!=null &&
              this.estimatedBudget.equals(other.getEstimatedBudget()))) &&
            ((this.expectedCloseDate==null && other.getExpectedCloseDate()==null) || 
             (this.expectedCloseDate!=null &&
              this.expectedCloseDate.equals(other.getExpectedCloseDate()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.forecastType==null && other.getForecastType()==null) || 
             (this.forecastType!=null &&
              this.forecastType.equals(other.getForecastType()))) &&
            ((this.fxTranCostEstimate==null && other.getFxTranCostEstimate()==null) || 
             (this.fxTranCostEstimate!=null &&
              this.fxTranCostEstimate.equals(other.getFxTranCostEstimate()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isBudgetApproved==null && other.getIsBudgetApproved()==null) || 
             (this.isBudgetApproved!=null &&
              this.isBudgetApproved.equals(other.getIsBudgetApproved()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              this.leadSource.equals(other.getLeadSource()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.partner==null && other.getPartner()==null) || 
             (this.partner!=null &&
              this.partner.equals(other.getPartner()))) &&
            ((this.partnerContribution==null && other.getPartnerContribution()==null) || 
             (this.partnerContribution!=null &&
              this.partnerContribution.equals(other.getPartnerContribution()))) &&
            ((this.partnerRole==null && other.getPartnerRole()==null) || 
             (this.partnerRole!=null &&
              this.partnerRole.equals(other.getPartnerRole()))) &&
            ((this.partnerTeamMember==null && other.getPartnerTeamMember()==null) || 
             (this.partnerTeamMember!=null &&
              this.partnerTeamMember.equals(other.getPartnerTeamMember()))) &&
            ((this.postingPeriod==null && other.getPostingPeriod()==null) || 
             (this.postingPeriod!=null &&
              this.postingPeriod.equals(other.getPostingPeriod()))) &&
            ((this.postingPeriodRelative==null && other.getPostingPeriodRelative()==null) || 
             (this.postingPeriodRelative!=null &&
              this.postingPeriodRelative.equals(other.getPostingPeriodRelative()))) &&
            ((this.probability==null && other.getProbability()==null) || 
             (this.probability!=null &&
              this.probability.equals(other.getProbability()))) &&
            ((this.projAltSalesAmt==null && other.getProjAltSalesAmt()==null) || 
             (this.projAltSalesAmt!=null &&
              this.projAltSalesAmt.equals(other.getProjAltSalesAmt()))) &&
            ((this.projectedTotal==null && other.getProjectedTotal()==null) || 
             (this.projectedTotal!=null &&
              this.projectedTotal.equals(other.getProjectedTotal()))) &&
            ((this.rangeHigh==null && other.getRangeHigh()==null) || 
             (this.rangeHigh!=null &&
              this.rangeHigh.equals(other.getRangeHigh()))) &&
            ((this.rangeHighAlt==null && other.getRangeHighAlt()==null) || 
             (this.rangeHighAlt!=null &&
              this.rangeHighAlt.equals(other.getRangeHighAlt()))) &&
            ((this.rangeLow==null && other.getRangeLow()==null) || 
             (this.rangeLow!=null &&
              this.rangeLow.equals(other.getRangeLow()))) &&
            ((this.rangeLowAlt==null && other.getRangeLowAlt()==null) || 
             (this.rangeLowAlt!=null &&
              this.rangeLowAlt.equals(other.getRangeLowAlt()))) &&
            ((this.salesReadiness==null && other.getSalesReadiness()==null) || 
             (this.salesReadiness!=null &&
              this.salesReadiness.equals(other.getSalesReadiness()))) &&
            ((this.salesRep==null && other.getSalesRep()==null) || 
             (this.salesRep!=null &&
              this.salesRep.equals(other.getSalesRep()))) &&
            ((this.salesTeamMember==null && other.getSalesTeamMember()==null) || 
             (this.salesTeamMember!=null &&
              this.salesTeamMember.equals(other.getSalesTeamMember()))) &&
            ((this.salesTeamRole==null && other.getSalesTeamRole()==null) || 
             (this.salesTeamRole!=null &&
              this.salesTeamRole.equals(other.getSalesTeamRole()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.taxPeriod==null && other.getTaxPeriod()==null) || 
             (this.taxPeriod!=null &&
              this.taxPeriod.equals(other.getTaxPeriod()))) &&
            ((this.taxPeriodRelative==null && other.getTaxPeriodRelative()==null) || 
             (this.taxPeriodRelative!=null &&
              this.taxPeriodRelative.equals(other.getTaxPeriodRelative()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.tranCostEstimate==null && other.getTranCostEstimate()==null) || 
             (this.tranCostEstimate!=null &&
              this.tranCostEstimate.equals(other.getTranCostEstimate()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.tranEstGrossProfit==null && other.getTranEstGrossProfit()==null) || 
             (this.tranEstGrossProfit!=null &&
              this.tranEstGrossProfit.equals(other.getTranEstGrossProfit()))) &&
            ((this.tranEstGrossProfitPct==null && other.getTranEstGrossProfitPct()==null) || 
             (this.tranEstGrossProfitPct!=null &&
              this.tranEstGrossProfitPct.equals(other.getTranEstGrossProfitPct()))) &&
            ((this.tranFxEstGrossProfit==null && other.getTranFxEstGrossProfit()==null) || 
             (this.tranFxEstGrossProfit!=null &&
              this.tranFxEstGrossProfit.equals(other.getTranFxEstGrossProfit()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              this.tranId.equals(other.getTranId()))) &&
            ((this.winLossReason==null && other.getWinLossReason()==null) || 
             (this.winLossReason!=null &&
              this.winLossReason.equals(other.getWinLossReason()))) &&
            ((this.wonBy==null && other.getWonBy()==null) || 
             (this.wonBy!=null &&
              this.wonBy.equals(other.getWonBy()))) &&
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAvailableOffline() != null) {
            _hashCode += getAvailableOffline().hashCode();
        }
        if (getBuyingReason() != null) {
            _hashCode += getBuyingReason().hashCode();
        }
        if (getBuyingTimeFrame() != null) {
            _hashCode += getBuyingTimeFrame().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getCloseDate() != null) {
            _hashCode += getCloseDate().hashCode();
        }
        if (getCompetitor() != null) {
            _hashCode += getCompetitor().hashCode();
        }
        if (getContribution() != null) {
            _hashCode += getContribution().hashCode();
        }
        if (getCurrencyName() != null) {
            _hashCode += getCurrencyName().hashCode();
        }
        if (getCustType() != null) {
            _hashCode += getCustType().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDaysOpen() != null) {
            _hashCode += getDaysOpen().hashCode();
        }
        if (getDaysToClose() != null) {
            _hashCode += getDaysToClose().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getEntityStatus() != null) {
            _hashCode += getEntityStatus().hashCode();
        }
        if (getEstimatedBudget() != null) {
            _hashCode += getEstimatedBudget().hashCode();
        }
        if (getExpectedCloseDate() != null) {
            _hashCode += getExpectedCloseDate().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getForecastType() != null) {
            _hashCode += getForecastType().hashCode();
        }
        if (getFxTranCostEstimate() != null) {
            _hashCode += getFxTranCostEstimate().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsBudgetApproved() != null) {
            _hashCode += getIsBudgetApproved().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLeadSource() != null) {
            _hashCode += getLeadSource().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getPartner() != null) {
            _hashCode += getPartner().hashCode();
        }
        if (getPartnerContribution() != null) {
            _hashCode += getPartnerContribution().hashCode();
        }
        if (getPartnerRole() != null) {
            _hashCode += getPartnerRole().hashCode();
        }
        if (getPartnerTeamMember() != null) {
            _hashCode += getPartnerTeamMember().hashCode();
        }
        if (getPostingPeriod() != null) {
            _hashCode += getPostingPeriod().hashCode();
        }
        if (getPostingPeriodRelative() != null) {
            _hashCode += getPostingPeriodRelative().hashCode();
        }
        if (getProbability() != null) {
            _hashCode += getProbability().hashCode();
        }
        if (getProjAltSalesAmt() != null) {
            _hashCode += getProjAltSalesAmt().hashCode();
        }
        if (getProjectedTotal() != null) {
            _hashCode += getProjectedTotal().hashCode();
        }
        if (getRangeHigh() != null) {
            _hashCode += getRangeHigh().hashCode();
        }
        if (getRangeHighAlt() != null) {
            _hashCode += getRangeHighAlt().hashCode();
        }
        if (getRangeLow() != null) {
            _hashCode += getRangeLow().hashCode();
        }
        if (getRangeLowAlt() != null) {
            _hashCode += getRangeLowAlt().hashCode();
        }
        if (getSalesReadiness() != null) {
            _hashCode += getSalesReadiness().hashCode();
        }
        if (getSalesRep() != null) {
            _hashCode += getSalesRep().hashCode();
        }
        if (getSalesTeamMember() != null) {
            _hashCode += getSalesTeamMember().hashCode();
        }
        if (getSalesTeamRole() != null) {
            _hashCode += getSalesTeamRole().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getTaxPeriod() != null) {
            _hashCode += getTaxPeriod().hashCode();
        }
        if (getTaxPeriodRelative() != null) {
            _hashCode += getTaxPeriodRelative().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getTranCostEstimate() != null) {
            _hashCode += getTranCostEstimate().hashCode();
        }
        if (getTranDate() != null) {
            _hashCode += getTranDate().hashCode();
        }
        if (getTranEstGrossProfit() != null) {
            _hashCode += getTranEstGrossProfit().hashCode();
        }
        if (getTranEstGrossProfitPct() != null) {
            _hashCode += getTranEstGrossProfitPct().hashCode();
        }
        if (getTranFxEstGrossProfit() != null) {
            _hashCode += getTranFxEstGrossProfit().hashCode();
        }
        if (getTranId() != null) {
            _hashCode += getTranId().hashCode();
        }
        if (getWinLossReason() != null) {
            _hashCode += getWinLossReason().hashCode();
        }
        if (getWonBy() != null) {
            _hashCode += getWonBy().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OpportunitySearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "OpportunitySearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableOffline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "availableOffline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyingReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buyingReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyingTimeFrame");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buyingTimeFrame"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "closeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("competitor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "competitor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contribution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "contribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "currencyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "custType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "daysOpen"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysToClose");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "daysToClose"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "entityStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedCloseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "expectedCloseDate"));
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
        elemField.setFieldName("forecastType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "forecastType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxTranCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fxTranCostEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("isBudgetApproved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isBudgetApproved"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("partner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerContribution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "partnerContribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "partnerRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerTeamMember");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "partnerTeamMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postingPeriodRelative");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "postingPeriodRelative"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "PostingPeriodDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "probability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projAltSalesAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "projAltSalesAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectedTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "projectedTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeHigh");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "rangeHigh"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeHighAlt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "rangeHighAlt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeLow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "rangeLow"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeLowAlt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "rangeLowAlt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesReadiness");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salesReadiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salesRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTeamMember");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salesTeamMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTeamRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salesTeamRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "taxPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxPeriodRelative");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "taxPeriodRelative"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "PostingPeriodDate"));
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
        elemField.setFieldName("tranCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranCostEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranEstGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranEstGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranEstGrossProfitPct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranEstGrossProfitPct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranFxEstGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranFxEstGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("winLossReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "winLossReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wonBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "wonBy"));
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
