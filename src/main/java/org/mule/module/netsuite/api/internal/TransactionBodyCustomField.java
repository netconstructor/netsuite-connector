/**
 * TransactionBodyCustomField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class TransactionBodyCustomField  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private java.lang.String label;

    private org.mule.module.netsuite.api.internal.RecordRef owner;

    private org.mule.module.netsuite.api.internal.CustomizationFieldType fieldType;

    private java.lang.String description;

    private org.mule.module.netsuite.api.internal.RecordRef selectRecordType;

    private java.lang.Boolean storeValue;

    private java.lang.Boolean showInList;

    private java.lang.Boolean globalSearch;

    private java.lang.Boolean isParent;

    private org.mule.module.netsuite.api.internal.RecordRef insertBefore;

    private org.mule.module.netsuite.api.internal.RecordRef subtab;

    private java.lang.Boolean availableToSso;

    private org.mule.module.netsuite.api.internal.CustomizationDisplayType displayType;

    private java.lang.Long displayWidth;

    private java.lang.Long displayHeight;

    private java.lang.String help;

    private org.mule.module.netsuite.api.internal.RecordRef parentSubtab;

    private java.lang.String linkText;

    private java.lang.Boolean isMandatory;

    private java.lang.Boolean checkSpelling;

    private java.lang.Long maxLength;

    private java.lang.Double minValue;

    private java.lang.Double maxValue;

    private java.lang.Boolean defaultChecked;

    private java.lang.String defaultValue;

    private java.lang.Boolean isFormula;

    private org.mule.module.netsuite.api.internal.RecordRef defaultSelection;

    private org.mule.module.netsuite.api.internal.CustomizationDynamicDefault dynamicDefault;

    private org.mule.module.netsuite.api.internal.RecordRef sourceList;

    private org.mule.module.netsuite.api.internal.RecordRef sourceFrom;

    private org.mule.module.netsuite.api.internal.RecordRef sourceFilterBy;

    private java.lang.Boolean bodyPurchase;

    private java.lang.Boolean bodySale;

    private java.lang.Boolean bodyOpportunity;

    private java.lang.Boolean bodyJournal;

    private java.lang.Boolean bodyExpenseReport;

    private java.lang.Boolean bodyStore;

    private java.lang.Boolean bodyTransferOrder;

    private java.lang.Boolean bodyItemReceipt;

    private java.lang.Boolean bodyItemReceiptOrder;

    private java.lang.Boolean bodyItemFulfillment;

    private java.lang.Boolean bodyItemFulfillmentOrder;

    private java.lang.Boolean bodyInventoryAdjustment;

    private java.lang.Boolean bodyBTegata;

    private java.lang.Boolean bodyAssemblyBuild;

    private java.lang.Boolean bodyPrintFlag;

    private java.lang.Boolean bodyPickingTicket;

    private java.lang.Boolean bodyPrintPackingSlip;

    private java.lang.Boolean bodyCustomerPayment;

    private java.lang.Boolean bodyVendorPayment;

    private java.lang.Boolean bodyDeposit;

    private java.lang.Boolean bodyBom;

    private java.lang.Boolean bodyPrintStatement;

    private org.mule.module.netsuite.api.internal.TransactionBodyCustomFieldFilterList filterList;

    private org.mule.module.netsuite.api.internal.CustomizationAccessLevel accessLevel;

    private org.mule.module.netsuite.api.internal.CustomizationSearchLevel searchLevel;

    private org.mule.module.netsuite.api.internal.CustomFieldRoleAccessList roleAccessList;

    private org.mule.module.netsuite.api.internal.CustomFieldDepartmentAccessList deptAccessList;

    private org.mule.module.netsuite.api.internal.CustomFieldSubAccessList subAccessList;

    private org.mule.module.netsuite.api.internal.CustomFieldTranslationsList translationsList;

    private java.lang.String internalId;  // attribute

    public TransactionBodyCustomField() {
    }

    public TransactionBodyCustomField(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String label,
           org.mule.module.netsuite.api.internal.RecordRef owner,
           org.mule.module.netsuite.api.internal.CustomizationFieldType fieldType,
           java.lang.String description,
           org.mule.module.netsuite.api.internal.RecordRef selectRecordType,
           java.lang.Boolean storeValue,
           java.lang.Boolean showInList,
           java.lang.Boolean globalSearch,
           java.lang.Boolean isParent,
           org.mule.module.netsuite.api.internal.RecordRef insertBefore,
           org.mule.module.netsuite.api.internal.RecordRef subtab,
           java.lang.Boolean availableToSso,
           org.mule.module.netsuite.api.internal.CustomizationDisplayType displayType,
           java.lang.Long displayWidth,
           java.lang.Long displayHeight,
           java.lang.String help,
           org.mule.module.netsuite.api.internal.RecordRef parentSubtab,
           java.lang.String linkText,
           java.lang.Boolean isMandatory,
           java.lang.Boolean checkSpelling,
           java.lang.Long maxLength,
           java.lang.Double minValue,
           java.lang.Double maxValue,
           java.lang.Boolean defaultChecked,
           java.lang.String defaultValue,
           java.lang.Boolean isFormula,
           org.mule.module.netsuite.api.internal.RecordRef defaultSelection,
           org.mule.module.netsuite.api.internal.CustomizationDynamicDefault dynamicDefault,
           org.mule.module.netsuite.api.internal.RecordRef sourceList,
           org.mule.module.netsuite.api.internal.RecordRef sourceFrom,
           org.mule.module.netsuite.api.internal.RecordRef sourceFilterBy,
           java.lang.Boolean bodyPurchase,
           java.lang.Boolean bodySale,
           java.lang.Boolean bodyOpportunity,
           java.lang.Boolean bodyJournal,
           java.lang.Boolean bodyExpenseReport,
           java.lang.Boolean bodyStore,
           java.lang.Boolean bodyTransferOrder,
           java.lang.Boolean bodyItemReceipt,
           java.lang.Boolean bodyItemReceiptOrder,
           java.lang.Boolean bodyItemFulfillment,
           java.lang.Boolean bodyItemFulfillmentOrder,
           java.lang.Boolean bodyInventoryAdjustment,
           java.lang.Boolean bodyBTegata,
           java.lang.Boolean bodyAssemblyBuild,
           java.lang.Boolean bodyPrintFlag,
           java.lang.Boolean bodyPickingTicket,
           java.lang.Boolean bodyPrintPackingSlip,
           java.lang.Boolean bodyCustomerPayment,
           java.lang.Boolean bodyVendorPayment,
           java.lang.Boolean bodyDeposit,
           java.lang.Boolean bodyBom,
           java.lang.Boolean bodyPrintStatement,
           org.mule.module.netsuite.api.internal.TransactionBodyCustomFieldFilterList filterList,
           org.mule.module.netsuite.api.internal.CustomizationAccessLevel accessLevel,
           org.mule.module.netsuite.api.internal.CustomizationSearchLevel searchLevel,
           org.mule.module.netsuite.api.internal.CustomFieldRoleAccessList roleAccessList,
           org.mule.module.netsuite.api.internal.CustomFieldDepartmentAccessList deptAccessList,
           org.mule.module.netsuite.api.internal.CustomFieldSubAccessList subAccessList,
           org.mule.module.netsuite.api.internal.CustomFieldTranslationsList translationsList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.label = label;
        this.owner = owner;
        this.fieldType = fieldType;
        this.description = description;
        this.selectRecordType = selectRecordType;
        this.storeValue = storeValue;
        this.showInList = showInList;
        this.globalSearch = globalSearch;
        this.isParent = isParent;
        this.insertBefore = insertBefore;
        this.subtab = subtab;
        this.availableToSso = availableToSso;
        this.displayType = displayType;
        this.displayWidth = displayWidth;
        this.displayHeight = displayHeight;
        this.help = help;
        this.parentSubtab = parentSubtab;
        this.linkText = linkText;
        this.isMandatory = isMandatory;
        this.checkSpelling = checkSpelling;
        this.maxLength = maxLength;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.defaultChecked = defaultChecked;
        this.defaultValue = defaultValue;
        this.isFormula = isFormula;
        this.defaultSelection = defaultSelection;
        this.dynamicDefault = dynamicDefault;
        this.sourceList = sourceList;
        this.sourceFrom = sourceFrom;
        this.sourceFilterBy = sourceFilterBy;
        this.bodyPurchase = bodyPurchase;
        this.bodySale = bodySale;
        this.bodyOpportunity = bodyOpportunity;
        this.bodyJournal = bodyJournal;
        this.bodyExpenseReport = bodyExpenseReport;
        this.bodyStore = bodyStore;
        this.bodyTransferOrder = bodyTransferOrder;
        this.bodyItemReceipt = bodyItemReceipt;
        this.bodyItemReceiptOrder = bodyItemReceiptOrder;
        this.bodyItemFulfillment = bodyItemFulfillment;
        this.bodyItemFulfillmentOrder = bodyItemFulfillmentOrder;
        this.bodyInventoryAdjustment = bodyInventoryAdjustment;
        this.bodyBTegata = bodyBTegata;
        this.bodyAssemblyBuild = bodyAssemblyBuild;
        this.bodyPrintFlag = bodyPrintFlag;
        this.bodyPickingTicket = bodyPickingTicket;
        this.bodyPrintPackingSlip = bodyPrintPackingSlip;
        this.bodyCustomerPayment = bodyCustomerPayment;
        this.bodyVendorPayment = bodyVendorPayment;
        this.bodyDeposit = bodyDeposit;
        this.bodyBom = bodyBom;
        this.bodyPrintStatement = bodyPrintStatement;
        this.filterList = filterList;
        this.accessLevel = accessLevel;
        this.searchLevel = searchLevel;
        this.roleAccessList = roleAccessList;
        this.deptAccessList = deptAccessList;
        this.subAccessList = subAccessList;
        this.translationsList = translationsList;
    }


    /**
     * Gets the label value for this TransactionBodyCustomField.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this TransactionBodyCustomField.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the owner value for this TransactionBodyCustomField.
     * 
     * @return owner
     */
    public org.mule.module.netsuite.api.internal.RecordRef getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this TransactionBodyCustomField.
     * 
     * @param owner
     */
    public void setOwner(org.mule.module.netsuite.api.internal.RecordRef owner) {
        this.owner = owner;
    }


    /**
     * Gets the fieldType value for this TransactionBodyCustomField.
     * 
     * @return fieldType
     */
    public org.mule.module.netsuite.api.internal.CustomizationFieldType getFieldType() {
        return fieldType;
    }


    /**
     * Sets the fieldType value for this TransactionBodyCustomField.
     * 
     * @param fieldType
     */
    public void setFieldType(org.mule.module.netsuite.api.internal.CustomizationFieldType fieldType) {
        this.fieldType = fieldType;
    }


    /**
     * Gets the description value for this TransactionBodyCustomField.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TransactionBodyCustomField.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the selectRecordType value for this TransactionBodyCustomField.
     * 
     * @return selectRecordType
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSelectRecordType() {
        return selectRecordType;
    }


    /**
     * Sets the selectRecordType value for this TransactionBodyCustomField.
     * 
     * @param selectRecordType
     */
    public void setSelectRecordType(org.mule.module.netsuite.api.internal.RecordRef selectRecordType) {
        this.selectRecordType = selectRecordType;
    }


    /**
     * Gets the storeValue value for this TransactionBodyCustomField.
     * 
     * @return storeValue
     */
    public java.lang.Boolean getStoreValue() {
        return storeValue;
    }


    /**
     * Sets the storeValue value for this TransactionBodyCustomField.
     * 
     * @param storeValue
     */
    public void setStoreValue(java.lang.Boolean storeValue) {
        this.storeValue = storeValue;
    }


    /**
     * Gets the showInList value for this TransactionBodyCustomField.
     * 
     * @return showInList
     */
    public java.lang.Boolean getShowInList() {
        return showInList;
    }


    /**
     * Sets the showInList value for this TransactionBodyCustomField.
     * 
     * @param showInList
     */
    public void setShowInList(java.lang.Boolean showInList) {
        this.showInList = showInList;
    }


    /**
     * Gets the globalSearch value for this TransactionBodyCustomField.
     * 
     * @return globalSearch
     */
    public java.lang.Boolean getGlobalSearch() {
        return globalSearch;
    }


    /**
     * Sets the globalSearch value for this TransactionBodyCustomField.
     * 
     * @param globalSearch
     */
    public void setGlobalSearch(java.lang.Boolean globalSearch) {
        this.globalSearch = globalSearch;
    }


    /**
     * Gets the isParent value for this TransactionBodyCustomField.
     * 
     * @return isParent
     */
    public java.lang.Boolean getIsParent() {
        return isParent;
    }


    /**
     * Sets the isParent value for this TransactionBodyCustomField.
     * 
     * @param isParent
     */
    public void setIsParent(java.lang.Boolean isParent) {
        this.isParent = isParent;
    }


    /**
     * Gets the insertBefore value for this TransactionBodyCustomField.
     * 
     * @return insertBefore
     */
    public org.mule.module.netsuite.api.internal.RecordRef getInsertBefore() {
        return insertBefore;
    }


    /**
     * Sets the insertBefore value for this TransactionBodyCustomField.
     * 
     * @param insertBefore
     */
    public void setInsertBefore(org.mule.module.netsuite.api.internal.RecordRef insertBefore) {
        this.insertBefore = insertBefore;
    }


    /**
     * Gets the subtab value for this TransactionBodyCustomField.
     * 
     * @return subtab
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSubtab() {
        return subtab;
    }


    /**
     * Sets the subtab value for this TransactionBodyCustomField.
     * 
     * @param subtab
     */
    public void setSubtab(org.mule.module.netsuite.api.internal.RecordRef subtab) {
        this.subtab = subtab;
    }


    /**
     * Gets the availableToSso value for this TransactionBodyCustomField.
     * 
     * @return availableToSso
     */
    public java.lang.Boolean getAvailableToSso() {
        return availableToSso;
    }


    /**
     * Sets the availableToSso value for this TransactionBodyCustomField.
     * 
     * @param availableToSso
     */
    public void setAvailableToSso(java.lang.Boolean availableToSso) {
        this.availableToSso = availableToSso;
    }


    /**
     * Gets the displayType value for this TransactionBodyCustomField.
     * 
     * @return displayType
     */
    public org.mule.module.netsuite.api.internal.CustomizationDisplayType getDisplayType() {
        return displayType;
    }


    /**
     * Sets the displayType value for this TransactionBodyCustomField.
     * 
     * @param displayType
     */
    public void setDisplayType(org.mule.module.netsuite.api.internal.CustomizationDisplayType displayType) {
        this.displayType = displayType;
    }


    /**
     * Gets the displayWidth value for this TransactionBodyCustomField.
     * 
     * @return displayWidth
     */
    public java.lang.Long getDisplayWidth() {
        return displayWidth;
    }


    /**
     * Sets the displayWidth value for this TransactionBodyCustomField.
     * 
     * @param displayWidth
     */
    public void setDisplayWidth(java.lang.Long displayWidth) {
        this.displayWidth = displayWidth;
    }


    /**
     * Gets the displayHeight value for this TransactionBodyCustomField.
     * 
     * @return displayHeight
     */
    public java.lang.Long getDisplayHeight() {
        return displayHeight;
    }


    /**
     * Sets the displayHeight value for this TransactionBodyCustomField.
     * 
     * @param displayHeight
     */
    public void setDisplayHeight(java.lang.Long displayHeight) {
        this.displayHeight = displayHeight;
    }


    /**
     * Gets the help value for this TransactionBodyCustomField.
     * 
     * @return help
     */
    public java.lang.String getHelp() {
        return help;
    }


    /**
     * Sets the help value for this TransactionBodyCustomField.
     * 
     * @param help
     */
    public void setHelp(java.lang.String help) {
        this.help = help;
    }


    /**
     * Gets the parentSubtab value for this TransactionBodyCustomField.
     * 
     * @return parentSubtab
     */
    public org.mule.module.netsuite.api.internal.RecordRef getParentSubtab() {
        return parentSubtab;
    }


    /**
     * Sets the parentSubtab value for this TransactionBodyCustomField.
     * 
     * @param parentSubtab
     */
    public void setParentSubtab(org.mule.module.netsuite.api.internal.RecordRef parentSubtab) {
        this.parentSubtab = parentSubtab;
    }


    /**
     * Gets the linkText value for this TransactionBodyCustomField.
     * 
     * @return linkText
     */
    public java.lang.String getLinkText() {
        return linkText;
    }


    /**
     * Sets the linkText value for this TransactionBodyCustomField.
     * 
     * @param linkText
     */
    public void setLinkText(java.lang.String linkText) {
        this.linkText = linkText;
    }


    /**
     * Gets the isMandatory value for this TransactionBodyCustomField.
     * 
     * @return isMandatory
     */
    public java.lang.Boolean getIsMandatory() {
        return isMandatory;
    }


    /**
     * Sets the isMandatory value for this TransactionBodyCustomField.
     * 
     * @param isMandatory
     */
    public void setIsMandatory(java.lang.Boolean isMandatory) {
        this.isMandatory = isMandatory;
    }


    /**
     * Gets the checkSpelling value for this TransactionBodyCustomField.
     * 
     * @return checkSpelling
     */
    public java.lang.Boolean getCheckSpelling() {
        return checkSpelling;
    }


    /**
     * Sets the checkSpelling value for this TransactionBodyCustomField.
     * 
     * @param checkSpelling
     */
    public void setCheckSpelling(java.lang.Boolean checkSpelling) {
        this.checkSpelling = checkSpelling;
    }


    /**
     * Gets the maxLength value for this TransactionBodyCustomField.
     * 
     * @return maxLength
     */
    public java.lang.Long getMaxLength() {
        return maxLength;
    }


    /**
     * Sets the maxLength value for this TransactionBodyCustomField.
     * 
     * @param maxLength
     */
    public void setMaxLength(java.lang.Long maxLength) {
        this.maxLength = maxLength;
    }


    /**
     * Gets the minValue value for this TransactionBodyCustomField.
     * 
     * @return minValue
     */
    public java.lang.Double getMinValue() {
        return minValue;
    }


    /**
     * Sets the minValue value for this TransactionBodyCustomField.
     * 
     * @param minValue
     */
    public void setMinValue(java.lang.Double minValue) {
        this.minValue = minValue;
    }


    /**
     * Gets the maxValue value for this TransactionBodyCustomField.
     * 
     * @return maxValue
     */
    public java.lang.Double getMaxValue() {
        return maxValue;
    }


    /**
     * Sets the maxValue value for this TransactionBodyCustomField.
     * 
     * @param maxValue
     */
    public void setMaxValue(java.lang.Double maxValue) {
        this.maxValue = maxValue;
    }


    /**
     * Gets the defaultChecked value for this TransactionBodyCustomField.
     * 
     * @return defaultChecked
     */
    public java.lang.Boolean getDefaultChecked() {
        return defaultChecked;
    }


    /**
     * Sets the defaultChecked value for this TransactionBodyCustomField.
     * 
     * @param defaultChecked
     */
    public void setDefaultChecked(java.lang.Boolean defaultChecked) {
        this.defaultChecked = defaultChecked;
    }


    /**
     * Gets the defaultValue value for this TransactionBodyCustomField.
     * 
     * @return defaultValue
     */
    public java.lang.String getDefaultValue() {
        return defaultValue;
    }


    /**
     * Sets the defaultValue value for this TransactionBodyCustomField.
     * 
     * @param defaultValue
     */
    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }


    /**
     * Gets the isFormula value for this TransactionBodyCustomField.
     * 
     * @return isFormula
     */
    public java.lang.Boolean getIsFormula() {
        return isFormula;
    }


    /**
     * Sets the isFormula value for this TransactionBodyCustomField.
     * 
     * @param isFormula
     */
    public void setIsFormula(java.lang.Boolean isFormula) {
        this.isFormula = isFormula;
    }


    /**
     * Gets the defaultSelection value for this TransactionBodyCustomField.
     * 
     * @return defaultSelection
     */
    public org.mule.module.netsuite.api.internal.RecordRef getDefaultSelection() {
        return defaultSelection;
    }


    /**
     * Sets the defaultSelection value for this TransactionBodyCustomField.
     * 
     * @param defaultSelection
     */
    public void setDefaultSelection(org.mule.module.netsuite.api.internal.RecordRef defaultSelection) {
        this.defaultSelection = defaultSelection;
    }


    /**
     * Gets the dynamicDefault value for this TransactionBodyCustomField.
     * 
     * @return dynamicDefault
     */
    public org.mule.module.netsuite.api.internal.CustomizationDynamicDefault getDynamicDefault() {
        return dynamicDefault;
    }


    /**
     * Sets the dynamicDefault value for this TransactionBodyCustomField.
     * 
     * @param dynamicDefault
     */
    public void setDynamicDefault(org.mule.module.netsuite.api.internal.CustomizationDynamicDefault dynamicDefault) {
        this.dynamicDefault = dynamicDefault;
    }


    /**
     * Gets the sourceList value for this TransactionBodyCustomField.
     * 
     * @return sourceList
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSourceList() {
        return sourceList;
    }


    /**
     * Sets the sourceList value for this TransactionBodyCustomField.
     * 
     * @param sourceList
     */
    public void setSourceList(org.mule.module.netsuite.api.internal.RecordRef sourceList) {
        this.sourceList = sourceList;
    }


    /**
     * Gets the sourceFrom value for this TransactionBodyCustomField.
     * 
     * @return sourceFrom
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSourceFrom() {
        return sourceFrom;
    }


    /**
     * Sets the sourceFrom value for this TransactionBodyCustomField.
     * 
     * @param sourceFrom
     */
    public void setSourceFrom(org.mule.module.netsuite.api.internal.RecordRef sourceFrom) {
        this.sourceFrom = sourceFrom;
    }


    /**
     * Gets the sourceFilterBy value for this TransactionBodyCustomField.
     * 
     * @return sourceFilterBy
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSourceFilterBy() {
        return sourceFilterBy;
    }


    /**
     * Sets the sourceFilterBy value for this TransactionBodyCustomField.
     * 
     * @param sourceFilterBy
     */
    public void setSourceFilterBy(org.mule.module.netsuite.api.internal.RecordRef sourceFilterBy) {
        this.sourceFilterBy = sourceFilterBy;
    }


    /**
     * Gets the bodyPurchase value for this TransactionBodyCustomField.
     * 
     * @return bodyPurchase
     */
    public java.lang.Boolean getBodyPurchase() {
        return bodyPurchase;
    }


    /**
     * Sets the bodyPurchase value for this TransactionBodyCustomField.
     * 
     * @param bodyPurchase
     */
    public void setBodyPurchase(java.lang.Boolean bodyPurchase) {
        this.bodyPurchase = bodyPurchase;
    }


    /**
     * Gets the bodySale value for this TransactionBodyCustomField.
     * 
     * @return bodySale
     */
    public java.lang.Boolean getBodySale() {
        return bodySale;
    }


    /**
     * Sets the bodySale value for this TransactionBodyCustomField.
     * 
     * @param bodySale
     */
    public void setBodySale(java.lang.Boolean bodySale) {
        this.bodySale = bodySale;
    }


    /**
     * Gets the bodyOpportunity value for this TransactionBodyCustomField.
     * 
     * @return bodyOpportunity
     */
    public java.lang.Boolean getBodyOpportunity() {
        return bodyOpportunity;
    }


    /**
     * Sets the bodyOpportunity value for this TransactionBodyCustomField.
     * 
     * @param bodyOpportunity
     */
    public void setBodyOpportunity(java.lang.Boolean bodyOpportunity) {
        this.bodyOpportunity = bodyOpportunity;
    }


    /**
     * Gets the bodyJournal value for this TransactionBodyCustomField.
     * 
     * @return bodyJournal
     */
    public java.lang.Boolean getBodyJournal() {
        return bodyJournal;
    }


    /**
     * Sets the bodyJournal value for this TransactionBodyCustomField.
     * 
     * @param bodyJournal
     */
    public void setBodyJournal(java.lang.Boolean bodyJournal) {
        this.bodyJournal = bodyJournal;
    }


    /**
     * Gets the bodyExpenseReport value for this TransactionBodyCustomField.
     * 
     * @return bodyExpenseReport
     */
    public java.lang.Boolean getBodyExpenseReport() {
        return bodyExpenseReport;
    }


    /**
     * Sets the bodyExpenseReport value for this TransactionBodyCustomField.
     * 
     * @param bodyExpenseReport
     */
    public void setBodyExpenseReport(java.lang.Boolean bodyExpenseReport) {
        this.bodyExpenseReport = bodyExpenseReport;
    }


    /**
     * Gets the bodyStore value for this TransactionBodyCustomField.
     * 
     * @return bodyStore
     */
    public java.lang.Boolean getBodyStore() {
        return bodyStore;
    }


    /**
     * Sets the bodyStore value for this TransactionBodyCustomField.
     * 
     * @param bodyStore
     */
    public void setBodyStore(java.lang.Boolean bodyStore) {
        this.bodyStore = bodyStore;
    }


    /**
     * Gets the bodyTransferOrder value for this TransactionBodyCustomField.
     * 
     * @return bodyTransferOrder
     */
    public java.lang.Boolean getBodyTransferOrder() {
        return bodyTransferOrder;
    }


    /**
     * Sets the bodyTransferOrder value for this TransactionBodyCustomField.
     * 
     * @param bodyTransferOrder
     */
    public void setBodyTransferOrder(java.lang.Boolean bodyTransferOrder) {
        this.bodyTransferOrder = bodyTransferOrder;
    }


    /**
     * Gets the bodyItemReceipt value for this TransactionBodyCustomField.
     * 
     * @return bodyItemReceipt
     */
    public java.lang.Boolean getBodyItemReceipt() {
        return bodyItemReceipt;
    }


    /**
     * Sets the bodyItemReceipt value for this TransactionBodyCustomField.
     * 
     * @param bodyItemReceipt
     */
    public void setBodyItemReceipt(java.lang.Boolean bodyItemReceipt) {
        this.bodyItemReceipt = bodyItemReceipt;
    }


    /**
     * Gets the bodyItemReceiptOrder value for this TransactionBodyCustomField.
     * 
     * @return bodyItemReceiptOrder
     */
    public java.lang.Boolean getBodyItemReceiptOrder() {
        return bodyItemReceiptOrder;
    }


    /**
     * Sets the bodyItemReceiptOrder value for this TransactionBodyCustomField.
     * 
     * @param bodyItemReceiptOrder
     */
    public void setBodyItemReceiptOrder(java.lang.Boolean bodyItemReceiptOrder) {
        this.bodyItemReceiptOrder = bodyItemReceiptOrder;
    }


    /**
     * Gets the bodyItemFulfillment value for this TransactionBodyCustomField.
     * 
     * @return bodyItemFulfillment
     */
    public java.lang.Boolean getBodyItemFulfillment() {
        return bodyItemFulfillment;
    }


    /**
     * Sets the bodyItemFulfillment value for this TransactionBodyCustomField.
     * 
     * @param bodyItemFulfillment
     */
    public void setBodyItemFulfillment(java.lang.Boolean bodyItemFulfillment) {
        this.bodyItemFulfillment = bodyItemFulfillment;
    }


    /**
     * Gets the bodyItemFulfillmentOrder value for this TransactionBodyCustomField.
     * 
     * @return bodyItemFulfillmentOrder
     */
    public java.lang.Boolean getBodyItemFulfillmentOrder() {
        return bodyItemFulfillmentOrder;
    }


    /**
     * Sets the bodyItemFulfillmentOrder value for this TransactionBodyCustomField.
     * 
     * @param bodyItemFulfillmentOrder
     */
    public void setBodyItemFulfillmentOrder(java.lang.Boolean bodyItemFulfillmentOrder) {
        this.bodyItemFulfillmentOrder = bodyItemFulfillmentOrder;
    }


    /**
     * Gets the bodyInventoryAdjustment value for this TransactionBodyCustomField.
     * 
     * @return bodyInventoryAdjustment
     */
    public java.lang.Boolean getBodyInventoryAdjustment() {
        return bodyInventoryAdjustment;
    }


    /**
     * Sets the bodyInventoryAdjustment value for this TransactionBodyCustomField.
     * 
     * @param bodyInventoryAdjustment
     */
    public void setBodyInventoryAdjustment(java.lang.Boolean bodyInventoryAdjustment) {
        this.bodyInventoryAdjustment = bodyInventoryAdjustment;
    }


    /**
     * Gets the bodyBTegata value for this TransactionBodyCustomField.
     * 
     * @return bodyBTegata
     */
    public java.lang.Boolean getBodyBTegata() {
        return bodyBTegata;
    }


    /**
     * Sets the bodyBTegata value for this TransactionBodyCustomField.
     * 
     * @param bodyBTegata
     */
    public void setBodyBTegata(java.lang.Boolean bodyBTegata) {
        this.bodyBTegata = bodyBTegata;
    }


    /**
     * Gets the bodyAssemblyBuild value for this TransactionBodyCustomField.
     * 
     * @return bodyAssemblyBuild
     */
    public java.lang.Boolean getBodyAssemblyBuild() {
        return bodyAssemblyBuild;
    }


    /**
     * Sets the bodyAssemblyBuild value for this TransactionBodyCustomField.
     * 
     * @param bodyAssemblyBuild
     */
    public void setBodyAssemblyBuild(java.lang.Boolean bodyAssemblyBuild) {
        this.bodyAssemblyBuild = bodyAssemblyBuild;
    }


    /**
     * Gets the bodyPrintFlag value for this TransactionBodyCustomField.
     * 
     * @return bodyPrintFlag
     */
    public java.lang.Boolean getBodyPrintFlag() {
        return bodyPrintFlag;
    }


    /**
     * Sets the bodyPrintFlag value for this TransactionBodyCustomField.
     * 
     * @param bodyPrintFlag
     */
    public void setBodyPrintFlag(java.lang.Boolean bodyPrintFlag) {
        this.bodyPrintFlag = bodyPrintFlag;
    }


    /**
     * Gets the bodyPickingTicket value for this TransactionBodyCustomField.
     * 
     * @return bodyPickingTicket
     */
    public java.lang.Boolean getBodyPickingTicket() {
        return bodyPickingTicket;
    }


    /**
     * Sets the bodyPickingTicket value for this TransactionBodyCustomField.
     * 
     * @param bodyPickingTicket
     */
    public void setBodyPickingTicket(java.lang.Boolean bodyPickingTicket) {
        this.bodyPickingTicket = bodyPickingTicket;
    }


    /**
     * Gets the bodyPrintPackingSlip value for this TransactionBodyCustomField.
     * 
     * @return bodyPrintPackingSlip
     */
    public java.lang.Boolean getBodyPrintPackingSlip() {
        return bodyPrintPackingSlip;
    }


    /**
     * Sets the bodyPrintPackingSlip value for this TransactionBodyCustomField.
     * 
     * @param bodyPrintPackingSlip
     */
    public void setBodyPrintPackingSlip(java.lang.Boolean bodyPrintPackingSlip) {
        this.bodyPrintPackingSlip = bodyPrintPackingSlip;
    }


    /**
     * Gets the bodyCustomerPayment value for this TransactionBodyCustomField.
     * 
     * @return bodyCustomerPayment
     */
    public java.lang.Boolean getBodyCustomerPayment() {
        return bodyCustomerPayment;
    }


    /**
     * Sets the bodyCustomerPayment value for this TransactionBodyCustomField.
     * 
     * @param bodyCustomerPayment
     */
    public void setBodyCustomerPayment(java.lang.Boolean bodyCustomerPayment) {
        this.bodyCustomerPayment = bodyCustomerPayment;
    }


    /**
     * Gets the bodyVendorPayment value for this TransactionBodyCustomField.
     * 
     * @return bodyVendorPayment
     */
    public java.lang.Boolean getBodyVendorPayment() {
        return bodyVendorPayment;
    }


    /**
     * Sets the bodyVendorPayment value for this TransactionBodyCustomField.
     * 
     * @param bodyVendorPayment
     */
    public void setBodyVendorPayment(java.lang.Boolean bodyVendorPayment) {
        this.bodyVendorPayment = bodyVendorPayment;
    }


    /**
     * Gets the bodyDeposit value for this TransactionBodyCustomField.
     * 
     * @return bodyDeposit
     */
    public java.lang.Boolean getBodyDeposit() {
        return bodyDeposit;
    }


    /**
     * Sets the bodyDeposit value for this TransactionBodyCustomField.
     * 
     * @param bodyDeposit
     */
    public void setBodyDeposit(java.lang.Boolean bodyDeposit) {
        this.bodyDeposit = bodyDeposit;
    }


    /**
     * Gets the bodyBom value for this TransactionBodyCustomField.
     * 
     * @return bodyBom
     */
    public java.lang.Boolean getBodyBom() {
        return bodyBom;
    }


    /**
     * Sets the bodyBom value for this TransactionBodyCustomField.
     * 
     * @param bodyBom
     */
    public void setBodyBom(java.lang.Boolean bodyBom) {
        this.bodyBom = bodyBom;
    }


    /**
     * Gets the bodyPrintStatement value for this TransactionBodyCustomField.
     * 
     * @return bodyPrintStatement
     */
    public java.lang.Boolean getBodyPrintStatement() {
        return bodyPrintStatement;
    }


    /**
     * Sets the bodyPrintStatement value for this TransactionBodyCustomField.
     * 
     * @param bodyPrintStatement
     */
    public void setBodyPrintStatement(java.lang.Boolean bodyPrintStatement) {
        this.bodyPrintStatement = bodyPrintStatement;
    }


    /**
     * Gets the filterList value for this TransactionBodyCustomField.
     * 
     * @return filterList
     */
    public org.mule.module.netsuite.api.internal.TransactionBodyCustomFieldFilterList getFilterList() {
        return filterList;
    }


    /**
     * Sets the filterList value for this TransactionBodyCustomField.
     * 
     * @param filterList
     */
    public void setFilterList(org.mule.module.netsuite.api.internal.TransactionBodyCustomFieldFilterList filterList) {
        this.filterList = filterList;
    }


    /**
     * Gets the accessLevel value for this TransactionBodyCustomField.
     * 
     * @return accessLevel
     */
    public org.mule.module.netsuite.api.internal.CustomizationAccessLevel getAccessLevel() {
        return accessLevel;
    }


    /**
     * Sets the accessLevel value for this TransactionBodyCustomField.
     * 
     * @param accessLevel
     */
    public void setAccessLevel(org.mule.module.netsuite.api.internal.CustomizationAccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }


    /**
     * Gets the searchLevel value for this TransactionBodyCustomField.
     * 
     * @return searchLevel
     */
    public org.mule.module.netsuite.api.internal.CustomizationSearchLevel getSearchLevel() {
        return searchLevel;
    }


    /**
     * Sets the searchLevel value for this TransactionBodyCustomField.
     * 
     * @param searchLevel
     */
    public void setSearchLevel(org.mule.module.netsuite.api.internal.CustomizationSearchLevel searchLevel) {
        this.searchLevel = searchLevel;
    }


    /**
     * Gets the roleAccessList value for this TransactionBodyCustomField.
     * 
     * @return roleAccessList
     */
    public org.mule.module.netsuite.api.internal.CustomFieldRoleAccessList getRoleAccessList() {
        return roleAccessList;
    }


    /**
     * Sets the roleAccessList value for this TransactionBodyCustomField.
     * 
     * @param roleAccessList
     */
    public void setRoleAccessList(org.mule.module.netsuite.api.internal.CustomFieldRoleAccessList roleAccessList) {
        this.roleAccessList = roleAccessList;
    }


    /**
     * Gets the deptAccessList value for this TransactionBodyCustomField.
     * 
     * @return deptAccessList
     */
    public org.mule.module.netsuite.api.internal.CustomFieldDepartmentAccessList getDeptAccessList() {
        return deptAccessList;
    }


    /**
     * Sets the deptAccessList value for this TransactionBodyCustomField.
     * 
     * @param deptAccessList
     */
    public void setDeptAccessList(org.mule.module.netsuite.api.internal.CustomFieldDepartmentAccessList deptAccessList) {
        this.deptAccessList = deptAccessList;
    }


    /**
     * Gets the subAccessList value for this TransactionBodyCustomField.
     * 
     * @return subAccessList
     */
    public org.mule.module.netsuite.api.internal.CustomFieldSubAccessList getSubAccessList() {
        return subAccessList;
    }


    /**
     * Sets the subAccessList value for this TransactionBodyCustomField.
     * 
     * @param subAccessList
     */
    public void setSubAccessList(org.mule.module.netsuite.api.internal.CustomFieldSubAccessList subAccessList) {
        this.subAccessList = subAccessList;
    }


    /**
     * Gets the translationsList value for this TransactionBodyCustomField.
     * 
     * @return translationsList
     */
    public org.mule.module.netsuite.api.internal.CustomFieldTranslationsList getTranslationsList() {
        return translationsList;
    }


    /**
     * Sets the translationsList value for this TransactionBodyCustomField.
     * 
     * @param translationsList
     */
    public void setTranslationsList(org.mule.module.netsuite.api.internal.CustomFieldTranslationsList translationsList) {
        this.translationsList = translationsList;
    }


    /**
     * Gets the internalId value for this TransactionBodyCustomField.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TransactionBodyCustomField.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionBodyCustomField)) return false;
        TransactionBodyCustomField other = (TransactionBodyCustomField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.fieldType==null && other.getFieldType()==null) || 
             (this.fieldType!=null &&
              this.fieldType.equals(other.getFieldType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.selectRecordType==null && other.getSelectRecordType()==null) || 
             (this.selectRecordType!=null &&
              this.selectRecordType.equals(other.getSelectRecordType()))) &&
            ((this.storeValue==null && other.getStoreValue()==null) || 
             (this.storeValue!=null &&
              this.storeValue.equals(other.getStoreValue()))) &&
            ((this.showInList==null && other.getShowInList()==null) || 
             (this.showInList!=null &&
              this.showInList.equals(other.getShowInList()))) &&
            ((this.globalSearch==null && other.getGlobalSearch()==null) || 
             (this.globalSearch!=null &&
              this.globalSearch.equals(other.getGlobalSearch()))) &&
            ((this.isParent==null && other.getIsParent()==null) || 
             (this.isParent!=null &&
              this.isParent.equals(other.getIsParent()))) &&
            ((this.insertBefore==null && other.getInsertBefore()==null) || 
             (this.insertBefore!=null &&
              this.insertBefore.equals(other.getInsertBefore()))) &&
            ((this.subtab==null && other.getSubtab()==null) || 
             (this.subtab!=null &&
              this.subtab.equals(other.getSubtab()))) &&
            ((this.availableToSso==null && other.getAvailableToSso()==null) || 
             (this.availableToSso!=null &&
              this.availableToSso.equals(other.getAvailableToSso()))) &&
            ((this.displayType==null && other.getDisplayType()==null) || 
             (this.displayType!=null &&
              this.displayType.equals(other.getDisplayType()))) &&
            ((this.displayWidth==null && other.getDisplayWidth()==null) || 
             (this.displayWidth!=null &&
              this.displayWidth.equals(other.getDisplayWidth()))) &&
            ((this.displayHeight==null && other.getDisplayHeight()==null) || 
             (this.displayHeight!=null &&
              this.displayHeight.equals(other.getDisplayHeight()))) &&
            ((this.help==null && other.getHelp()==null) || 
             (this.help!=null &&
              this.help.equals(other.getHelp()))) &&
            ((this.parentSubtab==null && other.getParentSubtab()==null) || 
             (this.parentSubtab!=null &&
              this.parentSubtab.equals(other.getParentSubtab()))) &&
            ((this.linkText==null && other.getLinkText()==null) || 
             (this.linkText!=null &&
              this.linkText.equals(other.getLinkText()))) &&
            ((this.isMandatory==null && other.getIsMandatory()==null) || 
             (this.isMandatory!=null &&
              this.isMandatory.equals(other.getIsMandatory()))) &&
            ((this.checkSpelling==null && other.getCheckSpelling()==null) || 
             (this.checkSpelling!=null &&
              this.checkSpelling.equals(other.getCheckSpelling()))) &&
            ((this.maxLength==null && other.getMaxLength()==null) || 
             (this.maxLength!=null &&
              this.maxLength.equals(other.getMaxLength()))) &&
            ((this.minValue==null && other.getMinValue()==null) || 
             (this.minValue!=null &&
              this.minValue.equals(other.getMinValue()))) &&
            ((this.maxValue==null && other.getMaxValue()==null) || 
             (this.maxValue!=null &&
              this.maxValue.equals(other.getMaxValue()))) &&
            ((this.defaultChecked==null && other.getDefaultChecked()==null) || 
             (this.defaultChecked!=null &&
              this.defaultChecked.equals(other.getDefaultChecked()))) &&
            ((this.defaultValue==null && other.getDefaultValue()==null) || 
             (this.defaultValue!=null &&
              this.defaultValue.equals(other.getDefaultValue()))) &&
            ((this.isFormula==null && other.getIsFormula()==null) || 
             (this.isFormula!=null &&
              this.isFormula.equals(other.getIsFormula()))) &&
            ((this.defaultSelection==null && other.getDefaultSelection()==null) || 
             (this.defaultSelection!=null &&
              this.defaultSelection.equals(other.getDefaultSelection()))) &&
            ((this.dynamicDefault==null && other.getDynamicDefault()==null) || 
             (this.dynamicDefault!=null &&
              this.dynamicDefault.equals(other.getDynamicDefault()))) &&
            ((this.sourceList==null && other.getSourceList()==null) || 
             (this.sourceList!=null &&
              this.sourceList.equals(other.getSourceList()))) &&
            ((this.sourceFrom==null && other.getSourceFrom()==null) || 
             (this.sourceFrom!=null &&
              this.sourceFrom.equals(other.getSourceFrom()))) &&
            ((this.sourceFilterBy==null && other.getSourceFilterBy()==null) || 
             (this.sourceFilterBy!=null &&
              this.sourceFilterBy.equals(other.getSourceFilterBy()))) &&
            ((this.bodyPurchase==null && other.getBodyPurchase()==null) || 
             (this.bodyPurchase!=null &&
              this.bodyPurchase.equals(other.getBodyPurchase()))) &&
            ((this.bodySale==null && other.getBodySale()==null) || 
             (this.bodySale!=null &&
              this.bodySale.equals(other.getBodySale()))) &&
            ((this.bodyOpportunity==null && other.getBodyOpportunity()==null) || 
             (this.bodyOpportunity!=null &&
              this.bodyOpportunity.equals(other.getBodyOpportunity()))) &&
            ((this.bodyJournal==null && other.getBodyJournal()==null) || 
             (this.bodyJournal!=null &&
              this.bodyJournal.equals(other.getBodyJournal()))) &&
            ((this.bodyExpenseReport==null && other.getBodyExpenseReport()==null) || 
             (this.bodyExpenseReport!=null &&
              this.bodyExpenseReport.equals(other.getBodyExpenseReport()))) &&
            ((this.bodyStore==null && other.getBodyStore()==null) || 
             (this.bodyStore!=null &&
              this.bodyStore.equals(other.getBodyStore()))) &&
            ((this.bodyTransferOrder==null && other.getBodyTransferOrder()==null) || 
             (this.bodyTransferOrder!=null &&
              this.bodyTransferOrder.equals(other.getBodyTransferOrder()))) &&
            ((this.bodyItemReceipt==null && other.getBodyItemReceipt()==null) || 
             (this.bodyItemReceipt!=null &&
              this.bodyItemReceipt.equals(other.getBodyItemReceipt()))) &&
            ((this.bodyItemReceiptOrder==null && other.getBodyItemReceiptOrder()==null) || 
             (this.bodyItemReceiptOrder!=null &&
              this.bodyItemReceiptOrder.equals(other.getBodyItemReceiptOrder()))) &&
            ((this.bodyItemFulfillment==null && other.getBodyItemFulfillment()==null) || 
             (this.bodyItemFulfillment!=null &&
              this.bodyItemFulfillment.equals(other.getBodyItemFulfillment()))) &&
            ((this.bodyItemFulfillmentOrder==null && other.getBodyItemFulfillmentOrder()==null) || 
             (this.bodyItemFulfillmentOrder!=null &&
              this.bodyItemFulfillmentOrder.equals(other.getBodyItemFulfillmentOrder()))) &&
            ((this.bodyInventoryAdjustment==null && other.getBodyInventoryAdjustment()==null) || 
             (this.bodyInventoryAdjustment!=null &&
              this.bodyInventoryAdjustment.equals(other.getBodyInventoryAdjustment()))) &&
            ((this.bodyBTegata==null && other.getBodyBTegata()==null) || 
             (this.bodyBTegata!=null &&
              this.bodyBTegata.equals(other.getBodyBTegata()))) &&
            ((this.bodyAssemblyBuild==null && other.getBodyAssemblyBuild()==null) || 
             (this.bodyAssemblyBuild!=null &&
              this.bodyAssemblyBuild.equals(other.getBodyAssemblyBuild()))) &&
            ((this.bodyPrintFlag==null && other.getBodyPrintFlag()==null) || 
             (this.bodyPrintFlag!=null &&
              this.bodyPrintFlag.equals(other.getBodyPrintFlag()))) &&
            ((this.bodyPickingTicket==null && other.getBodyPickingTicket()==null) || 
             (this.bodyPickingTicket!=null &&
              this.bodyPickingTicket.equals(other.getBodyPickingTicket()))) &&
            ((this.bodyPrintPackingSlip==null && other.getBodyPrintPackingSlip()==null) || 
             (this.bodyPrintPackingSlip!=null &&
              this.bodyPrintPackingSlip.equals(other.getBodyPrintPackingSlip()))) &&
            ((this.bodyCustomerPayment==null && other.getBodyCustomerPayment()==null) || 
             (this.bodyCustomerPayment!=null &&
              this.bodyCustomerPayment.equals(other.getBodyCustomerPayment()))) &&
            ((this.bodyVendorPayment==null && other.getBodyVendorPayment()==null) || 
             (this.bodyVendorPayment!=null &&
              this.bodyVendorPayment.equals(other.getBodyVendorPayment()))) &&
            ((this.bodyDeposit==null && other.getBodyDeposit()==null) || 
             (this.bodyDeposit!=null &&
              this.bodyDeposit.equals(other.getBodyDeposit()))) &&
            ((this.bodyBom==null && other.getBodyBom()==null) || 
             (this.bodyBom!=null &&
              this.bodyBom.equals(other.getBodyBom()))) &&
            ((this.bodyPrintStatement==null && other.getBodyPrintStatement()==null) || 
             (this.bodyPrintStatement!=null &&
              this.bodyPrintStatement.equals(other.getBodyPrintStatement()))) &&
            ((this.filterList==null && other.getFilterList()==null) || 
             (this.filterList!=null &&
              this.filterList.equals(other.getFilterList()))) &&
            ((this.accessLevel==null && other.getAccessLevel()==null) || 
             (this.accessLevel!=null &&
              this.accessLevel.equals(other.getAccessLevel()))) &&
            ((this.searchLevel==null && other.getSearchLevel()==null) || 
             (this.searchLevel!=null &&
              this.searchLevel.equals(other.getSearchLevel()))) &&
            ((this.roleAccessList==null && other.getRoleAccessList()==null) || 
             (this.roleAccessList!=null &&
              this.roleAccessList.equals(other.getRoleAccessList()))) &&
            ((this.deptAccessList==null && other.getDeptAccessList()==null) || 
             (this.deptAccessList!=null &&
              this.deptAccessList.equals(other.getDeptAccessList()))) &&
            ((this.subAccessList==null && other.getSubAccessList()==null) || 
             (this.subAccessList!=null &&
              this.subAccessList.equals(other.getSubAccessList()))) &&
            ((this.translationsList==null && other.getTranslationsList()==null) || 
             (this.translationsList!=null &&
              this.translationsList.equals(other.getTranslationsList()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId())));
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
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getFieldType() != null) {
            _hashCode += getFieldType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSelectRecordType() != null) {
            _hashCode += getSelectRecordType().hashCode();
        }
        if (getStoreValue() != null) {
            _hashCode += getStoreValue().hashCode();
        }
        if (getShowInList() != null) {
            _hashCode += getShowInList().hashCode();
        }
        if (getGlobalSearch() != null) {
            _hashCode += getGlobalSearch().hashCode();
        }
        if (getIsParent() != null) {
            _hashCode += getIsParent().hashCode();
        }
        if (getInsertBefore() != null) {
            _hashCode += getInsertBefore().hashCode();
        }
        if (getSubtab() != null) {
            _hashCode += getSubtab().hashCode();
        }
        if (getAvailableToSso() != null) {
            _hashCode += getAvailableToSso().hashCode();
        }
        if (getDisplayType() != null) {
            _hashCode += getDisplayType().hashCode();
        }
        if (getDisplayWidth() != null) {
            _hashCode += getDisplayWidth().hashCode();
        }
        if (getDisplayHeight() != null) {
            _hashCode += getDisplayHeight().hashCode();
        }
        if (getHelp() != null) {
            _hashCode += getHelp().hashCode();
        }
        if (getParentSubtab() != null) {
            _hashCode += getParentSubtab().hashCode();
        }
        if (getLinkText() != null) {
            _hashCode += getLinkText().hashCode();
        }
        if (getIsMandatory() != null) {
            _hashCode += getIsMandatory().hashCode();
        }
        if (getCheckSpelling() != null) {
            _hashCode += getCheckSpelling().hashCode();
        }
        if (getMaxLength() != null) {
            _hashCode += getMaxLength().hashCode();
        }
        if (getMinValue() != null) {
            _hashCode += getMinValue().hashCode();
        }
        if (getMaxValue() != null) {
            _hashCode += getMaxValue().hashCode();
        }
        if (getDefaultChecked() != null) {
            _hashCode += getDefaultChecked().hashCode();
        }
        if (getDefaultValue() != null) {
            _hashCode += getDefaultValue().hashCode();
        }
        if (getIsFormula() != null) {
            _hashCode += getIsFormula().hashCode();
        }
        if (getDefaultSelection() != null) {
            _hashCode += getDefaultSelection().hashCode();
        }
        if (getDynamicDefault() != null) {
            _hashCode += getDynamicDefault().hashCode();
        }
        if (getSourceList() != null) {
            _hashCode += getSourceList().hashCode();
        }
        if (getSourceFrom() != null) {
            _hashCode += getSourceFrom().hashCode();
        }
        if (getSourceFilterBy() != null) {
            _hashCode += getSourceFilterBy().hashCode();
        }
        if (getBodyPurchase() != null) {
            _hashCode += getBodyPurchase().hashCode();
        }
        if (getBodySale() != null) {
            _hashCode += getBodySale().hashCode();
        }
        if (getBodyOpportunity() != null) {
            _hashCode += getBodyOpportunity().hashCode();
        }
        if (getBodyJournal() != null) {
            _hashCode += getBodyJournal().hashCode();
        }
        if (getBodyExpenseReport() != null) {
            _hashCode += getBodyExpenseReport().hashCode();
        }
        if (getBodyStore() != null) {
            _hashCode += getBodyStore().hashCode();
        }
        if (getBodyTransferOrder() != null) {
            _hashCode += getBodyTransferOrder().hashCode();
        }
        if (getBodyItemReceipt() != null) {
            _hashCode += getBodyItemReceipt().hashCode();
        }
        if (getBodyItemReceiptOrder() != null) {
            _hashCode += getBodyItemReceiptOrder().hashCode();
        }
        if (getBodyItemFulfillment() != null) {
            _hashCode += getBodyItemFulfillment().hashCode();
        }
        if (getBodyItemFulfillmentOrder() != null) {
            _hashCode += getBodyItemFulfillmentOrder().hashCode();
        }
        if (getBodyInventoryAdjustment() != null) {
            _hashCode += getBodyInventoryAdjustment().hashCode();
        }
        if (getBodyBTegata() != null) {
            _hashCode += getBodyBTegata().hashCode();
        }
        if (getBodyAssemblyBuild() != null) {
            _hashCode += getBodyAssemblyBuild().hashCode();
        }
        if (getBodyPrintFlag() != null) {
            _hashCode += getBodyPrintFlag().hashCode();
        }
        if (getBodyPickingTicket() != null) {
            _hashCode += getBodyPickingTicket().hashCode();
        }
        if (getBodyPrintPackingSlip() != null) {
            _hashCode += getBodyPrintPackingSlip().hashCode();
        }
        if (getBodyCustomerPayment() != null) {
            _hashCode += getBodyCustomerPayment().hashCode();
        }
        if (getBodyVendorPayment() != null) {
            _hashCode += getBodyVendorPayment().hashCode();
        }
        if (getBodyDeposit() != null) {
            _hashCode += getBodyDeposit().hashCode();
        }
        if (getBodyBom() != null) {
            _hashCode += getBodyBom().hashCode();
        }
        if (getBodyPrintStatement() != null) {
            _hashCode += getBodyPrintStatement().hashCode();
        }
        if (getFilterList() != null) {
            _hashCode += getFilterList().hashCode();
        }
        if (getAccessLevel() != null) {
            _hashCode += getAccessLevel().hashCode();
        }
        if (getSearchLevel() != null) {
            _hashCode += getSearchLevel().hashCode();
        }
        if (getRoleAccessList() != null) {
            _hashCode += getRoleAccessList().hashCode();
        }
        if (getDeptAccessList() != null) {
            _hashCode += getDeptAccessList().hashCode();
        }
        if (getSubAccessList() != null) {
            _hashCode += getSubAccessList().hashCode();
        }
        if (getTranslationsList() != null) {
            _hashCode += getTranslationsList().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionBodyCustomField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "TransactionBodyCustomField"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "fieldType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2010_2.setup.webservices.netsuite.com", "CustomizationFieldType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectRecordType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "selectRecordType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "storeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showInList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "showInList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "globalSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isParent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "isParent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertBefore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "insertBefore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtab");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "subtab"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableToSso");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "availableToSso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "displayType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2010_2.setup.webservices.netsuite.com", "CustomizationDisplayType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "displayWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "displayHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("help");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "help"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentSubtab");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "parentSubtab"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "linkText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMandatory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "isMandatory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkSpelling");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "checkSpelling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxLength");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "maxLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "minValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "maxValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultChecked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "defaultChecked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "defaultValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFormula");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "isFormula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultSelection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "defaultSelection"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "dynamicDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2010_2.setup.webservices.netsuite.com", "CustomizationDynamicDefault"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "sourceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "sourceFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceFilterBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "sourceFilterBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyPurchase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "bodyPurchase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodySale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "bodySale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyOpportunity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "bodyOpportunity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyJournal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "bodyJournal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyExpenseReport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "bodyExpenseReport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyStore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "bodyStore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyTransferOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "bodyTransferOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyItemReceipt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "bodyItemReceipt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyItemReceiptOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "bodyItemReceiptOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyItemFulfillment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "bodyItemFulfillment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyItemFulfillmentOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "bodyItemFulfillmentOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyInventoryAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "bodyInventoryAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyBTegata");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "bodyBTegata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyAssemblyBuild");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "bodyAssemblyBuild"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyPrintFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "bodyPrintFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyPickingTicket");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "bodyPickingTicket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyPrintPackingSlip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "bodyPrintPackingSlip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyCustomerPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "bodyCustomerPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyVendorPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "bodyVendorPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyDeposit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "bodyDeposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyBom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "bodyBom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyPrintStatement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "bodyPrintStatement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "filterList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "TransactionBodyCustomFieldFilterList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "accessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2010_2.setup.webservices.netsuite.com", "CustomizationAccessLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "searchLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2010_2.setup.webservices.netsuite.com", "CustomizationSearchLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleAccessList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "roleAccessList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomFieldRoleAccessList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deptAccessList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "deptAccessList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomFieldDepartmentAccessList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subAccessList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "subAccessList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomFieldSubAccessList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translationsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "translationsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomFieldTranslationsList"));
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
