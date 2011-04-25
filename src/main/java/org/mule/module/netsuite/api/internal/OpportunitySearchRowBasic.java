/**
 * OpportunitySearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class OpportunitySearchRowBasic  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] actionItem;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] availableOffline;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] buyingReason;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] buyingTimeFrame;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] _class;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] closeDate;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] competitor;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] contribution;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] contributionPrimary;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] currency;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] custType;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] dateCreated;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] daysOpen;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] daysToClose;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] decisionMaker;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] department;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] entity;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] entityStatus;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedBudget;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] expectedCloseDate;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] forecastType;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] fxTranCostEstimate;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isBudgetApproved;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModifiedDate;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] leadSource;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] location;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] memo;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] partner;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] partnerContribution;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] partnerRole;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] partnerTeamMember;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] period;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] probability;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] projAltSalesAmt;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] projectedTotal;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] rangeHigh;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] rangeLow;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] salesReadiness;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesRep;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesTeamMember;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesTeamRole;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] status;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] subsidiary;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] taxPeriod;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] title;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] total;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] tranCostEstimate;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] tranDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] tranEstGrossProfit;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] tranEstGrossProfitPct;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] tranFxEstGrossProfit;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] tranId;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] weightedTotal;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] winLossReason;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] wonBy;

    private org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList;

    public OpportunitySearchRowBasic() {
    }

    public OpportunitySearchRowBasic(
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] actionItem,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] availableOffline,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] buyingReason,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] buyingTimeFrame,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] _class,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] closeDate,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] competitor,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] contribution,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] contributionPrimary,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] currency,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] custType,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] dateCreated,
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] daysOpen,
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] daysToClose,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] decisionMaker,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] department,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] entity,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] entityStatus,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedBudget,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] expectedCloseDate,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] forecastType,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] fxTranCostEstimate,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isBudgetApproved,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModifiedDate,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] leadSource,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] location,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] memo,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] partner,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] partnerContribution,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] partnerRole,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] partnerTeamMember,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] period,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] probability,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] projAltSalesAmt,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] projectedTotal,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] rangeHigh,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] rangeLow,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] salesReadiness,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesRep,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesTeamMember,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesTeamRole,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] status,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] subsidiary,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] taxPeriod,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] title,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] total,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] tranCostEstimate,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] tranDate,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] tranEstGrossProfit,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] tranEstGrossProfitPct,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] tranFxEstGrossProfit,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] tranId,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] weightedTotal,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] winLossReason,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] wonBy,
           org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
           this.actionItem = actionItem;
           this.availableOffline = availableOffline;
           this.buyingReason = buyingReason;
           this.buyingTimeFrame = buyingTimeFrame;
           this._class = _class;
           this.closeDate = closeDate;
           this.competitor = competitor;
           this.contribution = contribution;
           this.contributionPrimary = contributionPrimary;
           this.currency = currency;
           this.custType = custType;
           this.dateCreated = dateCreated;
           this.daysOpen = daysOpen;
           this.daysToClose = daysToClose;
           this.decisionMaker = decisionMaker;
           this.department = department;
           this.entity = entity;
           this.entityStatus = entityStatus;
           this.estimatedBudget = estimatedBudget;
           this.expectedCloseDate = expectedCloseDate;
           this.externalId = externalId;
           this.forecastType = forecastType;
           this.fxTranCostEstimate = fxTranCostEstimate;
           this.internalId = internalId;
           this.isBudgetApproved = isBudgetApproved;
           this.lastModifiedDate = lastModifiedDate;
           this.leadSource = leadSource;
           this.location = location;
           this.memo = memo;
           this.partner = partner;
           this.partnerContribution = partnerContribution;
           this.partnerRole = partnerRole;
           this.partnerTeamMember = partnerTeamMember;
           this.period = period;
           this.probability = probability;
           this.projAltSalesAmt = projAltSalesAmt;
           this.projectedTotal = projectedTotal;
           this.rangeHigh = rangeHigh;
           this.rangeLow = rangeLow;
           this.salesReadiness = salesReadiness;
           this.salesRep = salesRep;
           this.salesTeamMember = salesTeamMember;
           this.salesTeamRole = salesTeamRole;
           this.status = status;
           this.subsidiary = subsidiary;
           this.taxPeriod = taxPeriod;
           this.title = title;
           this.total = total;
           this.tranCostEstimate = tranCostEstimate;
           this.tranDate = tranDate;
           this.tranEstGrossProfit = tranEstGrossProfit;
           this.tranEstGrossProfitPct = tranEstGrossProfitPct;
           this.tranFxEstGrossProfit = tranFxEstGrossProfit;
           this.tranId = tranId;
           this.weightedTotal = weightedTotal;
           this.winLossReason = winLossReason;
           this.wonBy = wonBy;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the actionItem value for this OpportunitySearchRowBasic.
     * 
     * @return actionItem
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getActionItem() {
        return actionItem;
    }


    /**
     * Sets the actionItem value for this OpportunitySearchRowBasic.
     * 
     * @param actionItem
     */
    public void setActionItem(org.mule.module.netsuite.api.internal.SearchColumnStringField[] actionItem) {
        this.actionItem = actionItem;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getActionItem(int i) {
        return this.actionItem[i];
    }

    public void setActionItem(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.actionItem[i] = _value;
    }


    /**
     * Gets the availableOffline value for this OpportunitySearchRowBasic.
     * 
     * @return availableOffline
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getAvailableOffline() {
        return availableOffline;
    }


    /**
     * Sets the availableOffline value for this OpportunitySearchRowBasic.
     * 
     * @param availableOffline
     */
    public void setAvailableOffline(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] availableOffline) {
        this.availableOffline = availableOffline;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getAvailableOffline(int i) {
        return this.availableOffline[i];
    }

    public void setAvailableOffline(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.availableOffline[i] = _value;
    }


    /**
     * Gets the buyingReason value for this OpportunitySearchRowBasic.
     * 
     * @return buyingReason
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBuyingReason() {
        return buyingReason;
    }


    /**
     * Sets the buyingReason value for this OpportunitySearchRowBasic.
     * 
     * @param buyingReason
     */
    public void setBuyingReason(org.mule.module.netsuite.api.internal.SearchColumnStringField[] buyingReason) {
        this.buyingReason = buyingReason;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getBuyingReason(int i) {
        return this.buyingReason[i];
    }

    public void setBuyingReason(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.buyingReason[i] = _value;
    }


    /**
     * Gets the buyingTimeFrame value for this OpportunitySearchRowBasic.
     * 
     * @return buyingTimeFrame
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBuyingTimeFrame() {
        return buyingTimeFrame;
    }


    /**
     * Sets the buyingTimeFrame value for this OpportunitySearchRowBasic.
     * 
     * @param buyingTimeFrame
     */
    public void setBuyingTimeFrame(org.mule.module.netsuite.api.internal.SearchColumnStringField[] buyingTimeFrame) {
        this.buyingTimeFrame = buyingTimeFrame;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getBuyingTimeFrame(int i) {
        return this.buyingTimeFrame[i];
    }

    public void setBuyingTimeFrame(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.buyingTimeFrame[i] = _value;
    }


    /**
     * Gets the _class value for this OpportunitySearchRowBasic.
     * 
     * @return _class
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this OpportunitySearchRowBasic.
     * 
     * @param _class
     */
    public void set_class(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] _class) {
        this._class = _class;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField get_class(int i) {
        return this._class[i];
    }

    public void set_class(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this._class[i] = _value;
    }


    /**
     * Gets the closeDate value for this OpportunitySearchRowBasic.
     * 
     * @return closeDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getCloseDate() {
        return closeDate;
    }


    /**
     * Sets the closeDate value for this OpportunitySearchRowBasic.
     * 
     * @param closeDate
     */
    public void setCloseDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] closeDate) {
        this.closeDate = closeDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getCloseDate(int i) {
        return this.closeDate[i];
    }

    public void setCloseDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.closeDate[i] = _value;
    }


    /**
     * Gets the competitor value for this OpportunitySearchRowBasic.
     * 
     * @return competitor
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getCompetitor() {
        return competitor;
    }


    /**
     * Sets the competitor value for this OpportunitySearchRowBasic.
     * 
     * @param competitor
     */
    public void setCompetitor(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] competitor) {
        this.competitor = competitor;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getCompetitor(int i) {
        return this.competitor[i];
    }

    public void setCompetitor(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.competitor[i] = _value;
    }


    /**
     * Gets the contribution value for this OpportunitySearchRowBasic.
     * 
     * @return contribution
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getContribution() {
        return contribution;
    }


    /**
     * Sets the contribution value for this OpportunitySearchRowBasic.
     * 
     * @param contribution
     */
    public void setContribution(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] contribution) {
        this.contribution = contribution;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getContribution(int i) {
        return this.contribution[i];
    }

    public void setContribution(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.contribution[i] = _value;
    }


    /**
     * Gets the contributionPrimary value for this OpportunitySearchRowBasic.
     * 
     * @return contributionPrimary
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getContributionPrimary() {
        return contributionPrimary;
    }


    /**
     * Sets the contributionPrimary value for this OpportunitySearchRowBasic.
     * 
     * @param contributionPrimary
     */
    public void setContributionPrimary(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] contributionPrimary) {
        this.contributionPrimary = contributionPrimary;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getContributionPrimary(int i) {
        return this.contributionPrimary[i];
    }

    public void setContributionPrimary(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.contributionPrimary[i] = _value;
    }


    /**
     * Gets the currency value for this OpportunitySearchRowBasic.
     * 
     * @return currency
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this OpportunitySearchRowBasic.
     * 
     * @param currency
     */
    public void setCurrency(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] currency) {
        this.currency = currency;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getCurrency(int i) {
        return this.currency[i];
    }

    public void setCurrency(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.currency[i] = _value;
    }


    /**
     * Gets the custType value for this OpportunitySearchRowBasic.
     * 
     * @return custType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getCustType() {
        return custType;
    }


    /**
     * Sets the custType value for this OpportunitySearchRowBasic.
     * 
     * @param custType
     */
    public void setCustType(org.mule.module.netsuite.api.internal.SearchColumnStringField[] custType) {
        this.custType = custType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getCustType(int i) {
        return this.custType[i];
    }

    public void setCustType(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.custType[i] = _value;
    }


    /**
     * Gets the dateCreated value for this OpportunitySearchRowBasic.
     * 
     * @return dateCreated
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this OpportunitySearchRowBasic.
     * 
     * @param dateCreated
     */
    public void setDateCreated(org.mule.module.netsuite.api.internal.SearchColumnDateField[] dateCreated) {
        this.dateCreated = dateCreated;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getDateCreated(int i) {
        return this.dateCreated[i];
    }

    public void setDateCreated(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.dateCreated[i] = _value;
    }


    /**
     * Gets the daysOpen value for this OpportunitySearchRowBasic.
     * 
     * @return daysOpen
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getDaysOpen() {
        return daysOpen;
    }


    /**
     * Sets the daysOpen value for this OpportunitySearchRowBasic.
     * 
     * @param daysOpen
     */
    public void setDaysOpen(org.mule.module.netsuite.api.internal.SearchColumnLongField[] daysOpen) {
        this.daysOpen = daysOpen;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getDaysOpen(int i) {
        return this.daysOpen[i];
    }

    public void setDaysOpen(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.daysOpen[i] = _value;
    }


    /**
     * Gets the daysToClose value for this OpportunitySearchRowBasic.
     * 
     * @return daysToClose
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getDaysToClose() {
        return daysToClose;
    }


    /**
     * Sets the daysToClose value for this OpportunitySearchRowBasic.
     * 
     * @param daysToClose
     */
    public void setDaysToClose(org.mule.module.netsuite.api.internal.SearchColumnLongField[] daysToClose) {
        this.daysToClose = daysToClose;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getDaysToClose(int i) {
        return this.daysToClose[i];
    }

    public void setDaysToClose(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.daysToClose[i] = _value;
    }


    /**
     * Gets the decisionMaker value for this OpportunitySearchRowBasic.
     * 
     * @return decisionMaker
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getDecisionMaker() {
        return decisionMaker;
    }


    /**
     * Sets the decisionMaker value for this OpportunitySearchRowBasic.
     * 
     * @param decisionMaker
     */
    public void setDecisionMaker(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] decisionMaker) {
        this.decisionMaker = decisionMaker;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getDecisionMaker(int i) {
        return this.decisionMaker[i];
    }

    public void setDecisionMaker(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.decisionMaker[i] = _value;
    }


    /**
     * Gets the department value for this OpportunitySearchRowBasic.
     * 
     * @return department
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this OpportunitySearchRowBasic.
     * 
     * @param department
     */
    public void setDepartment(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] department) {
        this.department = department;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getDepartment(int i) {
        return this.department[i];
    }

    public void setDepartment(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.department[i] = _value;
    }


    /**
     * Gets the entity value for this OpportunitySearchRowBasic.
     * 
     * @return entity
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this OpportunitySearchRowBasic.
     * 
     * @param entity
     */
    public void setEntity(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] entity) {
        this.entity = entity;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getEntity(int i) {
        return this.entity[i];
    }

    public void setEntity(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.entity[i] = _value;
    }


    /**
     * Gets the entityStatus value for this OpportunitySearchRowBasic.
     * 
     * @return entityStatus
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getEntityStatus() {
        return entityStatus;
    }


    /**
     * Sets the entityStatus value for this OpportunitySearchRowBasic.
     * 
     * @param entityStatus
     */
    public void setEntityStatus(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] entityStatus) {
        this.entityStatus = entityStatus;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getEntityStatus(int i) {
        return this.entityStatus[i];
    }

    public void setEntityStatus(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.entityStatus[i] = _value;
    }


    /**
     * Gets the estimatedBudget value for this OpportunitySearchRowBasic.
     * 
     * @return estimatedBudget
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEstimatedBudget() {
        return estimatedBudget;
    }


    /**
     * Sets the estimatedBudget value for this OpportunitySearchRowBasic.
     * 
     * @param estimatedBudget
     */
    public void setEstimatedBudget(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getEstimatedBudget(int i) {
        return this.estimatedBudget[i];
    }

    public void setEstimatedBudget(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.estimatedBudget[i] = _value;
    }


    /**
     * Gets the expectedCloseDate value for this OpportunitySearchRowBasic.
     * 
     * @return expectedCloseDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getExpectedCloseDate() {
        return expectedCloseDate;
    }


    /**
     * Sets the expectedCloseDate value for this OpportunitySearchRowBasic.
     * 
     * @param expectedCloseDate
     */
    public void setExpectedCloseDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] expectedCloseDate) {
        this.expectedCloseDate = expectedCloseDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getExpectedCloseDate(int i) {
        return this.expectedCloseDate[i];
    }

    public void setExpectedCloseDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.expectedCloseDate[i] = _value;
    }


    /**
     * Gets the externalId value for this OpportunitySearchRowBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this OpportunitySearchRowBasic.
     * 
     * @param externalId
     */
    public void setExternalId(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }


    /**
     * Gets the forecastType value for this OpportunitySearchRowBasic.
     * 
     * @return forecastType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getForecastType() {
        return forecastType;
    }


    /**
     * Sets the forecastType value for this OpportunitySearchRowBasic.
     * 
     * @param forecastType
     */
    public void setForecastType(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] forecastType) {
        this.forecastType = forecastType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getForecastType(int i) {
        return this.forecastType[i];
    }

    public void setForecastType(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.forecastType[i] = _value;
    }


    /**
     * Gets the fxTranCostEstimate value for this OpportunitySearchRowBasic.
     * 
     * @return fxTranCostEstimate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getFxTranCostEstimate() {
        return fxTranCostEstimate;
    }


    /**
     * Sets the fxTranCostEstimate value for this OpportunitySearchRowBasic.
     * 
     * @param fxTranCostEstimate
     */
    public void setFxTranCostEstimate(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] fxTranCostEstimate) {
        this.fxTranCostEstimate = fxTranCostEstimate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getFxTranCostEstimate(int i) {
        return this.fxTranCostEstimate[i];
    }

    public void setFxTranCostEstimate(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.fxTranCostEstimate[i] = _value;
    }


    /**
     * Gets the internalId value for this OpportunitySearchRowBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this OpportunitySearchRowBasic.
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
     * Gets the isBudgetApproved value for this OpportunitySearchRowBasic.
     * 
     * @return isBudgetApproved
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsBudgetApproved() {
        return isBudgetApproved;
    }


    /**
     * Sets the isBudgetApproved value for this OpportunitySearchRowBasic.
     * 
     * @param isBudgetApproved
     */
    public void setIsBudgetApproved(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isBudgetApproved) {
        this.isBudgetApproved = isBudgetApproved;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsBudgetApproved(int i) {
        return this.isBudgetApproved[i];
    }

    public void setIsBudgetApproved(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isBudgetApproved[i] = _value;
    }


    /**
     * Gets the lastModifiedDate value for this OpportunitySearchRowBasic.
     * 
     * @return lastModifiedDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this OpportunitySearchRowBasic.
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
     * Gets the leadSource value for this OpportunitySearchRowBasic.
     * 
     * @return leadSource
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this OpportunitySearchRowBasic.
     * 
     * @param leadSource
     */
    public void setLeadSource(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] leadSource) {
        this.leadSource = leadSource;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getLeadSource(int i) {
        return this.leadSource[i];
    }

    public void setLeadSource(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.leadSource[i] = _value;
    }


    /**
     * Gets the location value for this OpportunitySearchRowBasic.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this OpportunitySearchRowBasic.
     * 
     * @param location
     */
    public void setLocation(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] location) {
        this.location = location;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getLocation(int i) {
        return this.location[i];
    }

    public void setLocation(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.location[i] = _value;
    }


    /**
     * Gets the memo value for this OpportunitySearchRowBasic.
     * 
     * @return memo
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this OpportunitySearchRowBasic.
     * 
     * @param memo
     */
    public void setMemo(org.mule.module.netsuite.api.internal.SearchColumnStringField[] memo) {
        this.memo = memo;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getMemo(int i) {
        return this.memo[i];
    }

    public void setMemo(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.memo[i] = _value;
    }


    /**
     * Gets the partner value for this OpportunitySearchRowBasic.
     * 
     * @return partner
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getPartner() {
        return partner;
    }


    /**
     * Sets the partner value for this OpportunitySearchRowBasic.
     * 
     * @param partner
     */
    public void setPartner(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] partner) {
        this.partner = partner;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getPartner(int i) {
        return this.partner[i];
    }

    public void setPartner(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.partner[i] = _value;
    }


    /**
     * Gets the partnerContribution value for this OpportunitySearchRowBasic.
     * 
     * @return partnerContribution
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getPartnerContribution() {
        return partnerContribution;
    }


    /**
     * Sets the partnerContribution value for this OpportunitySearchRowBasic.
     * 
     * @param partnerContribution
     */
    public void setPartnerContribution(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] partnerContribution) {
        this.partnerContribution = partnerContribution;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getPartnerContribution(int i) {
        return this.partnerContribution[i];
    }

    public void setPartnerContribution(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.partnerContribution[i] = _value;
    }


    /**
     * Gets the partnerRole value for this OpportunitySearchRowBasic.
     * 
     * @return partnerRole
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getPartnerRole() {
        return partnerRole;
    }


    /**
     * Sets the partnerRole value for this OpportunitySearchRowBasic.
     * 
     * @param partnerRole
     */
    public void setPartnerRole(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] partnerRole) {
        this.partnerRole = partnerRole;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getPartnerRole(int i) {
        return this.partnerRole[i];
    }

    public void setPartnerRole(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.partnerRole[i] = _value;
    }


    /**
     * Gets the partnerTeamMember value for this OpportunitySearchRowBasic.
     * 
     * @return partnerTeamMember
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getPartnerTeamMember() {
        return partnerTeamMember;
    }


    /**
     * Sets the partnerTeamMember value for this OpportunitySearchRowBasic.
     * 
     * @param partnerTeamMember
     */
    public void setPartnerTeamMember(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] partnerTeamMember) {
        this.partnerTeamMember = partnerTeamMember;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getPartnerTeamMember(int i) {
        return this.partnerTeamMember[i];
    }

    public void setPartnerTeamMember(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.partnerTeamMember[i] = _value;
    }


    /**
     * Gets the period value for this OpportunitySearchRowBasic.
     * 
     * @return period
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this OpportunitySearchRowBasic.
     * 
     * @param period
     */
    public void setPeriod(org.mule.module.netsuite.api.internal.SearchColumnStringField[] period) {
        this.period = period;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPeriod(int i) {
        return this.period[i];
    }

    public void setPeriod(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.period[i] = _value;
    }


    /**
     * Gets the probability value for this OpportunitySearchRowBasic.
     * 
     * @return probability
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getProbability() {
        return probability;
    }


    /**
     * Sets the probability value for this OpportunitySearchRowBasic.
     * 
     * @param probability
     */
    public void setProbability(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] probability) {
        this.probability = probability;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getProbability(int i) {
        return this.probability[i];
    }

    public void setProbability(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.probability[i] = _value;
    }


    /**
     * Gets the projAltSalesAmt value for this OpportunitySearchRowBasic.
     * 
     * @return projAltSalesAmt
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getProjAltSalesAmt() {
        return projAltSalesAmt;
    }


    /**
     * Sets the projAltSalesAmt value for this OpportunitySearchRowBasic.
     * 
     * @param projAltSalesAmt
     */
    public void setProjAltSalesAmt(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] projAltSalesAmt) {
        this.projAltSalesAmt = projAltSalesAmt;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getProjAltSalesAmt(int i) {
        return this.projAltSalesAmt[i];
    }

    public void setProjAltSalesAmt(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.projAltSalesAmt[i] = _value;
    }


    /**
     * Gets the projectedTotal value for this OpportunitySearchRowBasic.
     * 
     * @return projectedTotal
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getProjectedTotal() {
        return projectedTotal;
    }


    /**
     * Sets the projectedTotal value for this OpportunitySearchRowBasic.
     * 
     * @param projectedTotal
     */
    public void setProjectedTotal(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] projectedTotal) {
        this.projectedTotal = projectedTotal;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getProjectedTotal(int i) {
        return this.projectedTotal[i];
    }

    public void setProjectedTotal(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.projectedTotal[i] = _value;
    }


    /**
     * Gets the rangeHigh value for this OpportunitySearchRowBasic.
     * 
     * @return rangeHigh
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getRangeHigh() {
        return rangeHigh;
    }


    /**
     * Sets the rangeHigh value for this OpportunitySearchRowBasic.
     * 
     * @param rangeHigh
     */
    public void setRangeHigh(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] rangeHigh) {
        this.rangeHigh = rangeHigh;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getRangeHigh(int i) {
        return this.rangeHigh[i];
    }

    public void setRangeHigh(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.rangeHigh[i] = _value;
    }


    /**
     * Gets the rangeLow value for this OpportunitySearchRowBasic.
     * 
     * @return rangeLow
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getRangeLow() {
        return rangeLow;
    }


    /**
     * Sets the rangeLow value for this OpportunitySearchRowBasic.
     * 
     * @param rangeLow
     */
    public void setRangeLow(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] rangeLow) {
        this.rangeLow = rangeLow;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getRangeLow(int i) {
        return this.rangeLow[i];
    }

    public void setRangeLow(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.rangeLow[i] = _value;
    }


    /**
     * Gets the salesReadiness value for this OpportunitySearchRowBasic.
     * 
     * @return salesReadiness
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getSalesReadiness() {
        return salesReadiness;
    }


    /**
     * Sets the salesReadiness value for this OpportunitySearchRowBasic.
     * 
     * @param salesReadiness
     */
    public void setSalesReadiness(org.mule.module.netsuite.api.internal.SearchColumnStringField[] salesReadiness) {
        this.salesReadiness = salesReadiness;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getSalesReadiness(int i) {
        return this.salesReadiness[i];
    }

    public void setSalesReadiness(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.salesReadiness[i] = _value;
    }


    /**
     * Gets the salesRep value for this OpportunitySearchRowBasic.
     * 
     * @return salesRep
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSalesRep() {
        return salesRep;
    }


    /**
     * Sets the salesRep value for this OpportunitySearchRowBasic.
     * 
     * @param salesRep
     */
    public void setSalesRep(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesRep) {
        this.salesRep = salesRep;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getSalesRep(int i) {
        return this.salesRep[i];
    }

    public void setSalesRep(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.salesRep[i] = _value;
    }


    /**
     * Gets the salesTeamMember value for this OpportunitySearchRowBasic.
     * 
     * @return salesTeamMember
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSalesTeamMember() {
        return salesTeamMember;
    }


    /**
     * Sets the salesTeamMember value for this OpportunitySearchRowBasic.
     * 
     * @param salesTeamMember
     */
    public void setSalesTeamMember(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesTeamMember) {
        this.salesTeamMember = salesTeamMember;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getSalesTeamMember(int i) {
        return this.salesTeamMember[i];
    }

    public void setSalesTeamMember(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.salesTeamMember[i] = _value;
    }


    /**
     * Gets the salesTeamRole value for this OpportunitySearchRowBasic.
     * 
     * @return salesTeamRole
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSalesTeamRole() {
        return salesTeamRole;
    }


    /**
     * Sets the salesTeamRole value for this OpportunitySearchRowBasic.
     * 
     * @param salesTeamRole
     */
    public void setSalesTeamRole(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesTeamRole) {
        this.salesTeamRole = salesTeamRole;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getSalesTeamRole(int i) {
        return this.salesTeamRole[i];
    }

    public void setSalesTeamRole(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.salesTeamRole[i] = _value;
    }


    /**
     * Gets the status value for this OpportunitySearchRowBasic.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OpportunitySearchRowBasic.
     * 
     * @param status
     */
    public void setStatus(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] status) {
        this.status = status;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getStatus(int i) {
        return this.status[i];
    }

    public void setStatus(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.status[i] = _value;
    }


    /**
     * Gets the subsidiary value for this OpportunitySearchRowBasic.
     * 
     * @return subsidiary
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this OpportunitySearchRowBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] subsidiary) {
        this.subsidiary = subsidiary;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getSubsidiary(int i) {
        return this.subsidiary[i];
    }

    public void setSubsidiary(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.subsidiary[i] = _value;
    }


    /**
     * Gets the taxPeriod value for this OpportunitySearchRowBasic.
     * 
     * @return taxPeriod
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getTaxPeriod() {
        return taxPeriod;
    }


    /**
     * Sets the taxPeriod value for this OpportunitySearchRowBasic.
     * 
     * @param taxPeriod
     */
    public void setTaxPeriod(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] taxPeriod) {
        this.taxPeriod = taxPeriod;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getTaxPeriod(int i) {
        return this.taxPeriod[i];
    }

    public void setTaxPeriod(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.taxPeriod[i] = _value;
    }


    /**
     * Gets the title value for this OpportunitySearchRowBasic.
     * 
     * @return title
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getTitle() {
        return title;
    }


    /**
     * Sets the title value for this OpportunitySearchRowBasic.
     * 
     * @param title
     */
    public void setTitle(org.mule.module.netsuite.api.internal.SearchColumnStringField[] title) {
        this.title = title;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getTitle(int i) {
        return this.title[i];
    }

    public void setTitle(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.title[i] = _value;
    }


    /**
     * Gets the total value for this OpportunitySearchRowBasic.
     * 
     * @return total
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getTotal() {
        return total;
    }


    /**
     * Sets the total value for this OpportunitySearchRowBasic.
     * 
     * @param total
     */
    public void setTotal(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] total) {
        this.total = total;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getTotal(int i) {
        return this.total[i];
    }

    public void setTotal(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.total[i] = _value;
    }


    /**
     * Gets the tranCostEstimate value for this OpportunitySearchRowBasic.
     * 
     * @return tranCostEstimate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getTranCostEstimate() {
        return tranCostEstimate;
    }


    /**
     * Sets the tranCostEstimate value for this OpportunitySearchRowBasic.
     * 
     * @param tranCostEstimate
     */
    public void setTranCostEstimate(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] tranCostEstimate) {
        this.tranCostEstimate = tranCostEstimate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getTranCostEstimate(int i) {
        return this.tranCostEstimate[i];
    }

    public void setTranCostEstimate(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.tranCostEstimate[i] = _value;
    }


    /**
     * Gets the tranDate value for this OpportunitySearchRowBasic.
     * 
     * @return tranDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this OpportunitySearchRowBasic.
     * 
     * @param tranDate
     */
    public void setTranDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] tranDate) {
        this.tranDate = tranDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getTranDate(int i) {
        return this.tranDate[i];
    }

    public void setTranDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.tranDate[i] = _value;
    }


    /**
     * Gets the tranEstGrossProfit value for this OpportunitySearchRowBasic.
     * 
     * @return tranEstGrossProfit
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getTranEstGrossProfit() {
        return tranEstGrossProfit;
    }


    /**
     * Sets the tranEstGrossProfit value for this OpportunitySearchRowBasic.
     * 
     * @param tranEstGrossProfit
     */
    public void setTranEstGrossProfit(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] tranEstGrossProfit) {
        this.tranEstGrossProfit = tranEstGrossProfit;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getTranEstGrossProfit(int i) {
        return this.tranEstGrossProfit[i];
    }

    public void setTranEstGrossProfit(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.tranEstGrossProfit[i] = _value;
    }


    /**
     * Gets the tranEstGrossProfitPct value for this OpportunitySearchRowBasic.
     * 
     * @return tranEstGrossProfitPct
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getTranEstGrossProfitPct() {
        return tranEstGrossProfitPct;
    }


    /**
     * Sets the tranEstGrossProfitPct value for this OpportunitySearchRowBasic.
     * 
     * @param tranEstGrossProfitPct
     */
    public void setTranEstGrossProfitPct(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] tranEstGrossProfitPct) {
        this.tranEstGrossProfitPct = tranEstGrossProfitPct;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getTranEstGrossProfitPct(int i) {
        return this.tranEstGrossProfitPct[i];
    }

    public void setTranEstGrossProfitPct(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.tranEstGrossProfitPct[i] = _value;
    }


    /**
     * Gets the tranFxEstGrossProfit value for this OpportunitySearchRowBasic.
     * 
     * @return tranFxEstGrossProfit
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getTranFxEstGrossProfit() {
        return tranFxEstGrossProfit;
    }


    /**
     * Sets the tranFxEstGrossProfit value for this OpportunitySearchRowBasic.
     * 
     * @param tranFxEstGrossProfit
     */
    public void setTranFxEstGrossProfit(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] tranFxEstGrossProfit) {
        this.tranFxEstGrossProfit = tranFxEstGrossProfit;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getTranFxEstGrossProfit(int i) {
        return this.tranFxEstGrossProfit[i];
    }

    public void setTranFxEstGrossProfit(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.tranFxEstGrossProfit[i] = _value;
    }


    /**
     * Gets the tranId value for this OpportunitySearchRowBasic.
     * 
     * @return tranId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this OpportunitySearchRowBasic.
     * 
     * @param tranId
     */
    public void setTranId(org.mule.module.netsuite.api.internal.SearchColumnStringField[] tranId) {
        this.tranId = tranId;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getTranId(int i) {
        return this.tranId[i];
    }

    public void setTranId(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.tranId[i] = _value;
    }


    /**
     * Gets the weightedTotal value for this OpportunitySearchRowBasic.
     * 
     * @return weightedTotal
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getWeightedTotal() {
        return weightedTotal;
    }


    /**
     * Sets the weightedTotal value for this OpportunitySearchRowBasic.
     * 
     * @param weightedTotal
     */
    public void setWeightedTotal(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] weightedTotal) {
        this.weightedTotal = weightedTotal;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getWeightedTotal(int i) {
        return this.weightedTotal[i];
    }

    public void setWeightedTotal(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.weightedTotal[i] = _value;
    }


    /**
     * Gets the winLossReason value for this OpportunitySearchRowBasic.
     * 
     * @return winLossReason
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getWinLossReason() {
        return winLossReason;
    }


    /**
     * Sets the winLossReason value for this OpportunitySearchRowBasic.
     * 
     * @param winLossReason
     */
    public void setWinLossReason(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] winLossReason) {
        this.winLossReason = winLossReason;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getWinLossReason(int i) {
        return this.winLossReason[i];
    }

    public void setWinLossReason(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.winLossReason[i] = _value;
    }


    /**
     * Gets the wonBy value for this OpportunitySearchRowBasic.
     * 
     * @return wonBy
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getWonBy() {
        return wonBy;
    }


    /**
     * Sets the wonBy value for this OpportunitySearchRowBasic.
     * 
     * @param wonBy
     */
    public void setWonBy(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] wonBy) {
        this.wonBy = wonBy;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getWonBy(int i) {
        return this.wonBy[i];
    }

    public void setWonBy(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.wonBy[i] = _value;
    }


    /**
     * Gets the customFieldList value for this OpportunitySearchRowBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this OpportunitySearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OpportunitySearchRowBasic)) return false;
        OpportunitySearchRowBasic other = (OpportunitySearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionItem==null && other.getActionItem()==null) || 
             (this.actionItem!=null &&
              java.util.Arrays.equals(this.actionItem, other.getActionItem()))) &&
            ((this.availableOffline==null && other.getAvailableOffline()==null) || 
             (this.availableOffline!=null &&
              java.util.Arrays.equals(this.availableOffline, other.getAvailableOffline()))) &&
            ((this.buyingReason==null && other.getBuyingReason()==null) || 
             (this.buyingReason!=null &&
              java.util.Arrays.equals(this.buyingReason, other.getBuyingReason()))) &&
            ((this.buyingTimeFrame==null && other.getBuyingTimeFrame()==null) || 
             (this.buyingTimeFrame!=null &&
              java.util.Arrays.equals(this.buyingTimeFrame, other.getBuyingTimeFrame()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              java.util.Arrays.equals(this._class, other.get_class()))) &&
            ((this.closeDate==null && other.getCloseDate()==null) || 
             (this.closeDate!=null &&
              java.util.Arrays.equals(this.closeDate, other.getCloseDate()))) &&
            ((this.competitor==null && other.getCompetitor()==null) || 
             (this.competitor!=null &&
              java.util.Arrays.equals(this.competitor, other.getCompetitor()))) &&
            ((this.contribution==null && other.getContribution()==null) || 
             (this.contribution!=null &&
              java.util.Arrays.equals(this.contribution, other.getContribution()))) &&
            ((this.contributionPrimary==null && other.getContributionPrimary()==null) || 
             (this.contributionPrimary!=null &&
              java.util.Arrays.equals(this.contributionPrimary, other.getContributionPrimary()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              java.util.Arrays.equals(this.currency, other.getCurrency()))) &&
            ((this.custType==null && other.getCustType()==null) || 
             (this.custType!=null &&
              java.util.Arrays.equals(this.custType, other.getCustType()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              java.util.Arrays.equals(this.dateCreated, other.getDateCreated()))) &&
            ((this.daysOpen==null && other.getDaysOpen()==null) || 
             (this.daysOpen!=null &&
              java.util.Arrays.equals(this.daysOpen, other.getDaysOpen()))) &&
            ((this.daysToClose==null && other.getDaysToClose()==null) || 
             (this.daysToClose!=null &&
              java.util.Arrays.equals(this.daysToClose, other.getDaysToClose()))) &&
            ((this.decisionMaker==null && other.getDecisionMaker()==null) || 
             (this.decisionMaker!=null &&
              java.util.Arrays.equals(this.decisionMaker, other.getDecisionMaker()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              java.util.Arrays.equals(this.department, other.getDepartment()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              java.util.Arrays.equals(this.entity, other.getEntity()))) &&
            ((this.entityStatus==null && other.getEntityStatus()==null) || 
             (this.entityStatus!=null &&
              java.util.Arrays.equals(this.entityStatus, other.getEntityStatus()))) &&
            ((this.estimatedBudget==null && other.getEstimatedBudget()==null) || 
             (this.estimatedBudget!=null &&
              java.util.Arrays.equals(this.estimatedBudget, other.getEstimatedBudget()))) &&
            ((this.expectedCloseDate==null && other.getExpectedCloseDate()==null) || 
             (this.expectedCloseDate!=null &&
              java.util.Arrays.equals(this.expectedCloseDate, other.getExpectedCloseDate()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.forecastType==null && other.getForecastType()==null) || 
             (this.forecastType!=null &&
              java.util.Arrays.equals(this.forecastType, other.getForecastType()))) &&
            ((this.fxTranCostEstimate==null && other.getFxTranCostEstimate()==null) || 
             (this.fxTranCostEstimate!=null &&
              java.util.Arrays.equals(this.fxTranCostEstimate, other.getFxTranCostEstimate()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isBudgetApproved==null && other.getIsBudgetApproved()==null) || 
             (this.isBudgetApproved!=null &&
              java.util.Arrays.equals(this.isBudgetApproved, other.getIsBudgetApproved()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              java.util.Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate()))) &&
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              java.util.Arrays.equals(this.leadSource, other.getLeadSource()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              java.util.Arrays.equals(this.memo, other.getMemo()))) &&
            ((this.partner==null && other.getPartner()==null) || 
             (this.partner!=null &&
              java.util.Arrays.equals(this.partner, other.getPartner()))) &&
            ((this.partnerContribution==null && other.getPartnerContribution()==null) || 
             (this.partnerContribution!=null &&
              java.util.Arrays.equals(this.partnerContribution, other.getPartnerContribution()))) &&
            ((this.partnerRole==null && other.getPartnerRole()==null) || 
             (this.partnerRole!=null &&
              java.util.Arrays.equals(this.partnerRole, other.getPartnerRole()))) &&
            ((this.partnerTeamMember==null && other.getPartnerTeamMember()==null) || 
             (this.partnerTeamMember!=null &&
              java.util.Arrays.equals(this.partnerTeamMember, other.getPartnerTeamMember()))) &&
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              java.util.Arrays.equals(this.period, other.getPeriod()))) &&
            ((this.probability==null && other.getProbability()==null) || 
             (this.probability!=null &&
              java.util.Arrays.equals(this.probability, other.getProbability()))) &&
            ((this.projAltSalesAmt==null && other.getProjAltSalesAmt()==null) || 
             (this.projAltSalesAmt!=null &&
              java.util.Arrays.equals(this.projAltSalesAmt, other.getProjAltSalesAmt()))) &&
            ((this.projectedTotal==null && other.getProjectedTotal()==null) || 
             (this.projectedTotal!=null &&
              java.util.Arrays.equals(this.projectedTotal, other.getProjectedTotal()))) &&
            ((this.rangeHigh==null && other.getRangeHigh()==null) || 
             (this.rangeHigh!=null &&
              java.util.Arrays.equals(this.rangeHigh, other.getRangeHigh()))) &&
            ((this.rangeLow==null && other.getRangeLow()==null) || 
             (this.rangeLow!=null &&
              java.util.Arrays.equals(this.rangeLow, other.getRangeLow()))) &&
            ((this.salesReadiness==null && other.getSalesReadiness()==null) || 
             (this.salesReadiness!=null &&
              java.util.Arrays.equals(this.salesReadiness, other.getSalesReadiness()))) &&
            ((this.salesRep==null && other.getSalesRep()==null) || 
             (this.salesRep!=null &&
              java.util.Arrays.equals(this.salesRep, other.getSalesRep()))) &&
            ((this.salesTeamMember==null && other.getSalesTeamMember()==null) || 
             (this.salesTeamMember!=null &&
              java.util.Arrays.equals(this.salesTeamMember, other.getSalesTeamMember()))) &&
            ((this.salesTeamRole==null && other.getSalesTeamRole()==null) || 
             (this.salesTeamRole!=null &&
              java.util.Arrays.equals(this.salesTeamRole, other.getSalesTeamRole()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.taxPeriod==null && other.getTaxPeriod()==null) || 
             (this.taxPeriod!=null &&
              java.util.Arrays.equals(this.taxPeriod, other.getTaxPeriod()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              java.util.Arrays.equals(this.title, other.getTitle()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              java.util.Arrays.equals(this.total, other.getTotal()))) &&
            ((this.tranCostEstimate==null && other.getTranCostEstimate()==null) || 
             (this.tranCostEstimate!=null &&
              java.util.Arrays.equals(this.tranCostEstimate, other.getTranCostEstimate()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              java.util.Arrays.equals(this.tranDate, other.getTranDate()))) &&
            ((this.tranEstGrossProfit==null && other.getTranEstGrossProfit()==null) || 
             (this.tranEstGrossProfit!=null &&
              java.util.Arrays.equals(this.tranEstGrossProfit, other.getTranEstGrossProfit()))) &&
            ((this.tranEstGrossProfitPct==null && other.getTranEstGrossProfitPct()==null) || 
             (this.tranEstGrossProfitPct!=null &&
              java.util.Arrays.equals(this.tranEstGrossProfitPct, other.getTranEstGrossProfitPct()))) &&
            ((this.tranFxEstGrossProfit==null && other.getTranFxEstGrossProfit()==null) || 
             (this.tranFxEstGrossProfit!=null &&
              java.util.Arrays.equals(this.tranFxEstGrossProfit, other.getTranFxEstGrossProfit()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              java.util.Arrays.equals(this.tranId, other.getTranId()))) &&
            ((this.weightedTotal==null && other.getWeightedTotal()==null) || 
             (this.weightedTotal!=null &&
              java.util.Arrays.equals(this.weightedTotal, other.getWeightedTotal()))) &&
            ((this.winLossReason==null && other.getWinLossReason()==null) || 
             (this.winLossReason!=null &&
              java.util.Arrays.equals(this.winLossReason, other.getWinLossReason()))) &&
            ((this.wonBy==null && other.getWonBy()==null) || 
             (this.wonBy!=null &&
              java.util.Arrays.equals(this.wonBy, other.getWonBy()))) &&
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
        if (getActionItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActionItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActionItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvailableOffline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableOffline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableOffline(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuyingReason() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuyingReason());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuyingReason(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuyingTimeFrame() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuyingTimeFrame());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuyingTimeFrame(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (get_class() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_class());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_class(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCloseDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCloseDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCloseDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompetitor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompetitor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompetitor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContribution() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContribution());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContribution(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContributionPrimary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContributionPrimary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContributionPrimary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateCreated() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDateCreated());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDateCreated(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDaysOpen() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDaysOpen());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDaysOpen(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDaysToClose() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDaysToClose());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDaysToClose(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDecisionMaker() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDecisionMaker());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDecisionMaker(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDepartment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepartment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepartment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEntity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEntityStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntityStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntityStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstimatedBudget() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedBudget());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedBudget(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpectedCloseDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpectedCloseDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpectedCloseDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getForecastType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForecastType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForecastType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxTranCostEstimate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxTranCostEstimate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxTranCostEstimate(), i);
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
        if (getIsBudgetApproved() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsBudgetApproved());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsBudgetApproved(), i);
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
        if (getLeadSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLeadSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLeadSource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMemo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMemo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartner() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartner());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartner(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartnerContribution() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartnerContribution());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartnerContribution(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartnerRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartnerRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartnerRole(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartnerTeamMember() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartnerTeamMember());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartnerTeamMember(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPeriod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPeriod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPeriod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProbability() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProbability());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProbability(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProjAltSalesAmt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjAltSalesAmt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjAltSalesAmt(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProjectedTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjectedTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjectedTotal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRangeHigh() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRangeHigh());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRangeHigh(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRangeLow() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRangeLow());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRangeLow(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesReadiness() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesReadiness());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesReadiness(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesRep() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesRep());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesRep(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesTeamMember() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesTeamMember());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesTeamMember(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesTeamRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesTeamRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesTeamRole(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxPeriod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxPeriod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxPeriod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTitle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTotal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranCostEstimate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranCostEstimate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranCostEstimate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranEstGrossProfit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranEstGrossProfit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranEstGrossProfit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranEstGrossProfitPct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranEstGrossProfitPct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranEstGrossProfitPct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranFxEstGrossProfit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranFxEstGrossProfit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranFxEstGrossProfit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWeightedTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWeightedTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWeightedTotal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWinLossReason() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWinLossReason());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWinLossReason(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWonBy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWonBy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWonBy(), i);
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
        new org.apache.axis.description.TypeDesc(OpportunitySearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "OpportunitySearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "actionItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableOffline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "availableOffline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyingReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buyingReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyingTimeFrame");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buyingTimeFrame"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "closeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("competitor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "competitor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contribution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "contribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contributionPrimary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "contributionPrimary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "custType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "daysOpen"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysToClose");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "daysToClose"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decisionMaker");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "decisionMaker"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "entityStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedCloseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "expectedCloseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "forecastType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxTranCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fxTranCostEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("isBudgetApproved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isBudgetApproved"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerContribution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "partnerContribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "partnerRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerTeamMember");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "partnerTeamMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "probability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projAltSalesAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "projAltSalesAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectedTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "projectedTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeHigh");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "rangeHigh"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeLow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "rangeLow"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesReadiness");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salesReadiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salesRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTeamMember");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salesTeamMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTeamRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salesTeamRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "taxPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranCostEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranEstGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranEstGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranEstGrossProfitPct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranEstGrossProfitPct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranFxEstGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranFxEstGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weightedTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "weightedTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("winLossReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "winLossReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wonBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "wonBy"));
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
