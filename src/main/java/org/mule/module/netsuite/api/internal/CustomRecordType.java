/**
 * CustomRecordType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomRecordType  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private java.lang.String recordName;

    private java.lang.Boolean includeName;

    private java.lang.Boolean showId;

    private java.lang.Boolean showCreationDate;

    private java.lang.Boolean showCreationDateOnList;

    private java.lang.Boolean showLastModified;

    private java.lang.Boolean showLastModifiedOnList;

    private java.lang.Boolean showOwner;

    private java.lang.Boolean showOwnerOnList;

    private java.lang.Boolean showOwnerAllowChange;

    private java.lang.Boolean usePermissions;

    private java.lang.Boolean allowAttachments;

    private java.lang.Boolean showNotes;

    private java.lang.Boolean enableMailMerge;

    private java.lang.Boolean isOrdered;

    private java.lang.Boolean allowInlineEditing;

    private java.lang.Boolean isAvailableOffline;

    private java.lang.Boolean allowQuickSearch;

    private java.lang.Boolean isInactive;

    private java.lang.String disclaimer;

    private java.lang.Boolean enableNumbering;

    private java.lang.String numberingPrefix;

    private java.lang.String numberingSuffix;

    private java.lang.Long numberingMinDigits;

    private java.lang.Long numberingInit;

    private java.lang.Long numberingCurrentNumber;

    private java.lang.Boolean allowNumberingOverride;

    private java.lang.Boolean isNumberingUpdateable;

    private java.lang.String scriptId;

    private org.mule.module.netsuite.api.internal.RecordRef owner;

    private java.lang.String description;

    private org.mule.module.netsuite.api.internal.CustomRecordTypeFieldList fieldList;

    private org.mule.module.netsuite.api.internal.CustomRecordTypeTabsList tabsList;

    private org.mule.module.netsuite.api.internal.CustomRecordTypeSublistsList sublistsList;

    private org.mule.module.netsuite.api.internal.CustomRecordTypeFormsList formsList;

    private org.mule.module.netsuite.api.internal.CustomRecordTypeOnlineFormsList onlineFormsList;

    private org.mule.module.netsuite.api.internal.CustomRecordTypePermissionsList permissionsList;

    private org.mule.module.netsuite.api.internal.CustomRecordTypeLinksList linksList;

    private org.mule.module.netsuite.api.internal.CustomRecordTypeManagersList managersList;

    private org.mule.module.netsuite.api.internal.CustomRecordTypeChildrenList childrenList;

    private org.mule.module.netsuite.api.internal.CustomRecordTypeParentsList parentsList;

    private org.mule.module.netsuite.api.internal.CustomRecordTypeTranslationsList translationsList;

    private java.lang.String internalId;  // attribute

    public CustomRecordType() {
    }

    public CustomRecordType(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String recordName,
           java.lang.Boolean includeName,
           java.lang.Boolean showId,
           java.lang.Boolean showCreationDate,
           java.lang.Boolean showCreationDateOnList,
           java.lang.Boolean showLastModified,
           java.lang.Boolean showLastModifiedOnList,
           java.lang.Boolean showOwner,
           java.lang.Boolean showOwnerOnList,
           java.lang.Boolean showOwnerAllowChange,
           java.lang.Boolean usePermissions,
           java.lang.Boolean allowAttachments,
           java.lang.Boolean showNotes,
           java.lang.Boolean enableMailMerge,
           java.lang.Boolean isOrdered,
           java.lang.Boolean allowInlineEditing,
           java.lang.Boolean isAvailableOffline,
           java.lang.Boolean allowQuickSearch,
           java.lang.Boolean isInactive,
           java.lang.String disclaimer,
           java.lang.Boolean enableNumbering,
           java.lang.String numberingPrefix,
           java.lang.String numberingSuffix,
           java.lang.Long numberingMinDigits,
           java.lang.Long numberingInit,
           java.lang.Long numberingCurrentNumber,
           java.lang.Boolean allowNumberingOverride,
           java.lang.Boolean isNumberingUpdateable,
           java.lang.String scriptId,
           org.mule.module.netsuite.api.internal.RecordRef owner,
           java.lang.String description,
           org.mule.module.netsuite.api.internal.CustomRecordTypeFieldList fieldList,
           org.mule.module.netsuite.api.internal.CustomRecordTypeTabsList tabsList,
           org.mule.module.netsuite.api.internal.CustomRecordTypeSublistsList sublistsList,
           org.mule.module.netsuite.api.internal.CustomRecordTypeFormsList formsList,
           org.mule.module.netsuite.api.internal.CustomRecordTypeOnlineFormsList onlineFormsList,
           org.mule.module.netsuite.api.internal.CustomRecordTypePermissionsList permissionsList,
           org.mule.module.netsuite.api.internal.CustomRecordTypeLinksList linksList,
           org.mule.module.netsuite.api.internal.CustomRecordTypeManagersList managersList,
           org.mule.module.netsuite.api.internal.CustomRecordTypeChildrenList childrenList,
           org.mule.module.netsuite.api.internal.CustomRecordTypeParentsList parentsList,
           org.mule.module.netsuite.api.internal.CustomRecordTypeTranslationsList translationsList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.recordName = recordName;
        this.includeName = includeName;
        this.showId = showId;
        this.showCreationDate = showCreationDate;
        this.showCreationDateOnList = showCreationDateOnList;
        this.showLastModified = showLastModified;
        this.showLastModifiedOnList = showLastModifiedOnList;
        this.showOwner = showOwner;
        this.showOwnerOnList = showOwnerOnList;
        this.showOwnerAllowChange = showOwnerAllowChange;
        this.usePermissions = usePermissions;
        this.allowAttachments = allowAttachments;
        this.showNotes = showNotes;
        this.enableMailMerge = enableMailMerge;
        this.isOrdered = isOrdered;
        this.allowInlineEditing = allowInlineEditing;
        this.isAvailableOffline = isAvailableOffline;
        this.allowQuickSearch = allowQuickSearch;
        this.isInactive = isInactive;
        this.disclaimer = disclaimer;
        this.enableNumbering = enableNumbering;
        this.numberingPrefix = numberingPrefix;
        this.numberingSuffix = numberingSuffix;
        this.numberingMinDigits = numberingMinDigits;
        this.numberingInit = numberingInit;
        this.numberingCurrentNumber = numberingCurrentNumber;
        this.allowNumberingOverride = allowNumberingOverride;
        this.isNumberingUpdateable = isNumberingUpdateable;
        this.scriptId = scriptId;
        this.owner = owner;
        this.description = description;
        this.fieldList = fieldList;
        this.tabsList = tabsList;
        this.sublistsList = sublistsList;
        this.formsList = formsList;
        this.onlineFormsList = onlineFormsList;
        this.permissionsList = permissionsList;
        this.linksList = linksList;
        this.managersList = managersList;
        this.childrenList = childrenList;
        this.parentsList = parentsList;
        this.translationsList = translationsList;
    }


    /**
     * Gets the recordName value for this CustomRecordType.
     * 
     * @return recordName
     */
    public java.lang.String getRecordName() {
        return recordName;
    }


    /**
     * Sets the recordName value for this CustomRecordType.
     * 
     * @param recordName
     */
    public void setRecordName(java.lang.String recordName) {
        this.recordName = recordName;
    }


    /**
     * Gets the includeName value for this CustomRecordType.
     * 
     * @return includeName
     */
    public java.lang.Boolean getIncludeName() {
        return includeName;
    }


    /**
     * Sets the includeName value for this CustomRecordType.
     * 
     * @param includeName
     */
    public void setIncludeName(java.lang.Boolean includeName) {
        this.includeName = includeName;
    }


    /**
     * Gets the showId value for this CustomRecordType.
     * 
     * @return showId
     */
    public java.lang.Boolean getShowId() {
        return showId;
    }


    /**
     * Sets the showId value for this CustomRecordType.
     * 
     * @param showId
     */
    public void setShowId(java.lang.Boolean showId) {
        this.showId = showId;
    }


    /**
     * Gets the showCreationDate value for this CustomRecordType.
     * 
     * @return showCreationDate
     */
    public java.lang.Boolean getShowCreationDate() {
        return showCreationDate;
    }


    /**
     * Sets the showCreationDate value for this CustomRecordType.
     * 
     * @param showCreationDate
     */
    public void setShowCreationDate(java.lang.Boolean showCreationDate) {
        this.showCreationDate = showCreationDate;
    }


    /**
     * Gets the showCreationDateOnList value for this CustomRecordType.
     * 
     * @return showCreationDateOnList
     */
    public java.lang.Boolean getShowCreationDateOnList() {
        return showCreationDateOnList;
    }


    /**
     * Sets the showCreationDateOnList value for this CustomRecordType.
     * 
     * @param showCreationDateOnList
     */
    public void setShowCreationDateOnList(java.lang.Boolean showCreationDateOnList) {
        this.showCreationDateOnList = showCreationDateOnList;
    }


    /**
     * Gets the showLastModified value for this CustomRecordType.
     * 
     * @return showLastModified
     */
    public java.lang.Boolean getShowLastModified() {
        return showLastModified;
    }


    /**
     * Sets the showLastModified value for this CustomRecordType.
     * 
     * @param showLastModified
     */
    public void setShowLastModified(java.lang.Boolean showLastModified) {
        this.showLastModified = showLastModified;
    }


    /**
     * Gets the showLastModifiedOnList value for this CustomRecordType.
     * 
     * @return showLastModifiedOnList
     */
    public java.lang.Boolean getShowLastModifiedOnList() {
        return showLastModifiedOnList;
    }


    /**
     * Sets the showLastModifiedOnList value for this CustomRecordType.
     * 
     * @param showLastModifiedOnList
     */
    public void setShowLastModifiedOnList(java.lang.Boolean showLastModifiedOnList) {
        this.showLastModifiedOnList = showLastModifiedOnList;
    }


    /**
     * Gets the showOwner value for this CustomRecordType.
     * 
     * @return showOwner
     */
    public java.lang.Boolean getShowOwner() {
        return showOwner;
    }


    /**
     * Sets the showOwner value for this CustomRecordType.
     * 
     * @param showOwner
     */
    public void setShowOwner(java.lang.Boolean showOwner) {
        this.showOwner = showOwner;
    }


    /**
     * Gets the showOwnerOnList value for this CustomRecordType.
     * 
     * @return showOwnerOnList
     */
    public java.lang.Boolean getShowOwnerOnList() {
        return showOwnerOnList;
    }


    /**
     * Sets the showOwnerOnList value for this CustomRecordType.
     * 
     * @param showOwnerOnList
     */
    public void setShowOwnerOnList(java.lang.Boolean showOwnerOnList) {
        this.showOwnerOnList = showOwnerOnList;
    }


    /**
     * Gets the showOwnerAllowChange value for this CustomRecordType.
     * 
     * @return showOwnerAllowChange
     */
    public java.lang.Boolean getShowOwnerAllowChange() {
        return showOwnerAllowChange;
    }


    /**
     * Sets the showOwnerAllowChange value for this CustomRecordType.
     * 
     * @param showOwnerAllowChange
     */
    public void setShowOwnerAllowChange(java.lang.Boolean showOwnerAllowChange) {
        this.showOwnerAllowChange = showOwnerAllowChange;
    }


    /**
     * Gets the usePermissions value for this CustomRecordType.
     * 
     * @return usePermissions
     */
    public java.lang.Boolean getUsePermissions() {
        return usePermissions;
    }


    /**
     * Sets the usePermissions value for this CustomRecordType.
     * 
     * @param usePermissions
     */
    public void setUsePermissions(java.lang.Boolean usePermissions) {
        this.usePermissions = usePermissions;
    }


    /**
     * Gets the allowAttachments value for this CustomRecordType.
     * 
     * @return allowAttachments
     */
    public java.lang.Boolean getAllowAttachments() {
        return allowAttachments;
    }


    /**
     * Sets the allowAttachments value for this CustomRecordType.
     * 
     * @param allowAttachments
     */
    public void setAllowAttachments(java.lang.Boolean allowAttachments) {
        this.allowAttachments = allowAttachments;
    }


    /**
     * Gets the showNotes value for this CustomRecordType.
     * 
     * @return showNotes
     */
    public java.lang.Boolean getShowNotes() {
        return showNotes;
    }


    /**
     * Sets the showNotes value for this CustomRecordType.
     * 
     * @param showNotes
     */
    public void setShowNotes(java.lang.Boolean showNotes) {
        this.showNotes = showNotes;
    }


    /**
     * Gets the enableMailMerge value for this CustomRecordType.
     * 
     * @return enableMailMerge
     */
    public java.lang.Boolean getEnableMailMerge() {
        return enableMailMerge;
    }


    /**
     * Sets the enableMailMerge value for this CustomRecordType.
     * 
     * @param enableMailMerge
     */
    public void setEnableMailMerge(java.lang.Boolean enableMailMerge) {
        this.enableMailMerge = enableMailMerge;
    }


    /**
     * Gets the isOrdered value for this CustomRecordType.
     * 
     * @return isOrdered
     */
    public java.lang.Boolean getIsOrdered() {
        return isOrdered;
    }


    /**
     * Sets the isOrdered value for this CustomRecordType.
     * 
     * @param isOrdered
     */
    public void setIsOrdered(java.lang.Boolean isOrdered) {
        this.isOrdered = isOrdered;
    }


    /**
     * Gets the allowInlineEditing value for this CustomRecordType.
     * 
     * @return allowInlineEditing
     */
    public java.lang.Boolean getAllowInlineEditing() {
        return allowInlineEditing;
    }


    /**
     * Sets the allowInlineEditing value for this CustomRecordType.
     * 
     * @param allowInlineEditing
     */
    public void setAllowInlineEditing(java.lang.Boolean allowInlineEditing) {
        this.allowInlineEditing = allowInlineEditing;
    }


    /**
     * Gets the isAvailableOffline value for this CustomRecordType.
     * 
     * @return isAvailableOffline
     */
    public java.lang.Boolean getIsAvailableOffline() {
        return isAvailableOffline;
    }


    /**
     * Sets the isAvailableOffline value for this CustomRecordType.
     * 
     * @param isAvailableOffline
     */
    public void setIsAvailableOffline(java.lang.Boolean isAvailableOffline) {
        this.isAvailableOffline = isAvailableOffline;
    }


    /**
     * Gets the allowQuickSearch value for this CustomRecordType.
     * 
     * @return allowQuickSearch
     */
    public java.lang.Boolean getAllowQuickSearch() {
        return allowQuickSearch;
    }


    /**
     * Sets the allowQuickSearch value for this CustomRecordType.
     * 
     * @param allowQuickSearch
     */
    public void setAllowQuickSearch(java.lang.Boolean allowQuickSearch) {
        this.allowQuickSearch = allowQuickSearch;
    }


    /**
     * Gets the isInactive value for this CustomRecordType.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this CustomRecordType.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the disclaimer value for this CustomRecordType.
     * 
     * @return disclaimer
     */
    public java.lang.String getDisclaimer() {
        return disclaimer;
    }


    /**
     * Sets the disclaimer value for this CustomRecordType.
     * 
     * @param disclaimer
     */
    public void setDisclaimer(java.lang.String disclaimer) {
        this.disclaimer = disclaimer;
    }


    /**
     * Gets the enableNumbering value for this CustomRecordType.
     * 
     * @return enableNumbering
     */
    public java.lang.Boolean getEnableNumbering() {
        return enableNumbering;
    }


    /**
     * Sets the enableNumbering value for this CustomRecordType.
     * 
     * @param enableNumbering
     */
    public void setEnableNumbering(java.lang.Boolean enableNumbering) {
        this.enableNumbering = enableNumbering;
    }


    /**
     * Gets the numberingPrefix value for this CustomRecordType.
     * 
     * @return numberingPrefix
     */
    public java.lang.String getNumberingPrefix() {
        return numberingPrefix;
    }


    /**
     * Sets the numberingPrefix value for this CustomRecordType.
     * 
     * @param numberingPrefix
     */
    public void setNumberingPrefix(java.lang.String numberingPrefix) {
        this.numberingPrefix = numberingPrefix;
    }


    /**
     * Gets the numberingSuffix value for this CustomRecordType.
     * 
     * @return numberingSuffix
     */
    public java.lang.String getNumberingSuffix() {
        return numberingSuffix;
    }


    /**
     * Sets the numberingSuffix value for this CustomRecordType.
     * 
     * @param numberingSuffix
     */
    public void setNumberingSuffix(java.lang.String numberingSuffix) {
        this.numberingSuffix = numberingSuffix;
    }


    /**
     * Gets the numberingMinDigits value for this CustomRecordType.
     * 
     * @return numberingMinDigits
     */
    public java.lang.Long getNumberingMinDigits() {
        return numberingMinDigits;
    }


    /**
     * Sets the numberingMinDigits value for this CustomRecordType.
     * 
     * @param numberingMinDigits
     */
    public void setNumberingMinDigits(java.lang.Long numberingMinDigits) {
        this.numberingMinDigits = numberingMinDigits;
    }


    /**
     * Gets the numberingInit value for this CustomRecordType.
     * 
     * @return numberingInit
     */
    public java.lang.Long getNumberingInit() {
        return numberingInit;
    }


    /**
     * Sets the numberingInit value for this CustomRecordType.
     * 
     * @param numberingInit
     */
    public void setNumberingInit(java.lang.Long numberingInit) {
        this.numberingInit = numberingInit;
    }


    /**
     * Gets the numberingCurrentNumber value for this CustomRecordType.
     * 
     * @return numberingCurrentNumber
     */
    public java.lang.Long getNumberingCurrentNumber() {
        return numberingCurrentNumber;
    }


    /**
     * Sets the numberingCurrentNumber value for this CustomRecordType.
     * 
     * @param numberingCurrentNumber
     */
    public void setNumberingCurrentNumber(java.lang.Long numberingCurrentNumber) {
        this.numberingCurrentNumber = numberingCurrentNumber;
    }


    /**
     * Gets the allowNumberingOverride value for this CustomRecordType.
     * 
     * @return allowNumberingOverride
     */
    public java.lang.Boolean getAllowNumberingOverride() {
        return allowNumberingOverride;
    }


    /**
     * Sets the allowNumberingOverride value for this CustomRecordType.
     * 
     * @param allowNumberingOverride
     */
    public void setAllowNumberingOverride(java.lang.Boolean allowNumberingOverride) {
        this.allowNumberingOverride = allowNumberingOverride;
    }


    /**
     * Gets the isNumberingUpdateable value for this CustomRecordType.
     * 
     * @return isNumberingUpdateable
     */
    public java.lang.Boolean getIsNumberingUpdateable() {
        return isNumberingUpdateable;
    }


    /**
     * Sets the isNumberingUpdateable value for this CustomRecordType.
     * 
     * @param isNumberingUpdateable
     */
    public void setIsNumberingUpdateable(java.lang.Boolean isNumberingUpdateable) {
        this.isNumberingUpdateable = isNumberingUpdateable;
    }


    /**
     * Gets the scriptId value for this CustomRecordType.
     * 
     * @return scriptId
     */
    public java.lang.String getScriptId() {
        return scriptId;
    }


    /**
     * Sets the scriptId value for this CustomRecordType.
     * 
     * @param scriptId
     */
    public void setScriptId(java.lang.String scriptId) {
        this.scriptId = scriptId;
    }


    /**
     * Gets the owner value for this CustomRecordType.
     * 
     * @return owner
     */
    public org.mule.module.netsuite.api.internal.RecordRef getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CustomRecordType.
     * 
     * @param owner
     */
    public void setOwner(org.mule.module.netsuite.api.internal.RecordRef owner) {
        this.owner = owner;
    }


    /**
     * Gets the description value for this CustomRecordType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CustomRecordType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the fieldList value for this CustomRecordType.
     * 
     * @return fieldList
     */
    public org.mule.module.netsuite.api.internal.CustomRecordTypeFieldList getFieldList() {
        return fieldList;
    }


    /**
     * Sets the fieldList value for this CustomRecordType.
     * 
     * @param fieldList
     */
    public void setFieldList(org.mule.module.netsuite.api.internal.CustomRecordTypeFieldList fieldList) {
        this.fieldList = fieldList;
    }


    /**
     * Gets the tabsList value for this CustomRecordType.
     * 
     * @return tabsList
     */
    public org.mule.module.netsuite.api.internal.CustomRecordTypeTabsList getTabsList() {
        return tabsList;
    }


    /**
     * Sets the tabsList value for this CustomRecordType.
     * 
     * @param tabsList
     */
    public void setTabsList(org.mule.module.netsuite.api.internal.CustomRecordTypeTabsList tabsList) {
        this.tabsList = tabsList;
    }


    /**
     * Gets the sublistsList value for this CustomRecordType.
     * 
     * @return sublistsList
     */
    public org.mule.module.netsuite.api.internal.CustomRecordTypeSublistsList getSublistsList() {
        return sublistsList;
    }


    /**
     * Sets the sublistsList value for this CustomRecordType.
     * 
     * @param sublistsList
     */
    public void setSublistsList(org.mule.module.netsuite.api.internal.CustomRecordTypeSublistsList sublistsList) {
        this.sublistsList = sublistsList;
    }


    /**
     * Gets the formsList value for this CustomRecordType.
     * 
     * @return formsList
     */
    public org.mule.module.netsuite.api.internal.CustomRecordTypeFormsList getFormsList() {
        return formsList;
    }


    /**
     * Sets the formsList value for this CustomRecordType.
     * 
     * @param formsList
     */
    public void setFormsList(org.mule.module.netsuite.api.internal.CustomRecordTypeFormsList formsList) {
        this.formsList = formsList;
    }


    /**
     * Gets the onlineFormsList value for this CustomRecordType.
     * 
     * @return onlineFormsList
     */
    public org.mule.module.netsuite.api.internal.CustomRecordTypeOnlineFormsList getOnlineFormsList() {
        return onlineFormsList;
    }


    /**
     * Sets the onlineFormsList value for this CustomRecordType.
     * 
     * @param onlineFormsList
     */
    public void setOnlineFormsList(org.mule.module.netsuite.api.internal.CustomRecordTypeOnlineFormsList onlineFormsList) {
        this.onlineFormsList = onlineFormsList;
    }


    /**
     * Gets the permissionsList value for this CustomRecordType.
     * 
     * @return permissionsList
     */
    public org.mule.module.netsuite.api.internal.CustomRecordTypePermissionsList getPermissionsList() {
        return permissionsList;
    }


    /**
     * Sets the permissionsList value for this CustomRecordType.
     * 
     * @param permissionsList
     */
    public void setPermissionsList(org.mule.module.netsuite.api.internal.CustomRecordTypePermissionsList permissionsList) {
        this.permissionsList = permissionsList;
    }


    /**
     * Gets the linksList value for this CustomRecordType.
     * 
     * @return linksList
     */
    public org.mule.module.netsuite.api.internal.CustomRecordTypeLinksList getLinksList() {
        return linksList;
    }


    /**
     * Sets the linksList value for this CustomRecordType.
     * 
     * @param linksList
     */
    public void setLinksList(org.mule.module.netsuite.api.internal.CustomRecordTypeLinksList linksList) {
        this.linksList = linksList;
    }


    /**
     * Gets the managersList value for this CustomRecordType.
     * 
     * @return managersList
     */
    public org.mule.module.netsuite.api.internal.CustomRecordTypeManagersList getManagersList() {
        return managersList;
    }


    /**
     * Sets the managersList value for this CustomRecordType.
     * 
     * @param managersList
     */
    public void setManagersList(org.mule.module.netsuite.api.internal.CustomRecordTypeManagersList managersList) {
        this.managersList = managersList;
    }


    /**
     * Gets the childrenList value for this CustomRecordType.
     * 
     * @return childrenList
     */
    public org.mule.module.netsuite.api.internal.CustomRecordTypeChildrenList getChildrenList() {
        return childrenList;
    }


    /**
     * Sets the childrenList value for this CustomRecordType.
     * 
     * @param childrenList
     */
    public void setChildrenList(org.mule.module.netsuite.api.internal.CustomRecordTypeChildrenList childrenList) {
        this.childrenList = childrenList;
    }


    /**
     * Gets the parentsList value for this CustomRecordType.
     * 
     * @return parentsList
     */
    public org.mule.module.netsuite.api.internal.CustomRecordTypeParentsList getParentsList() {
        return parentsList;
    }


    /**
     * Sets the parentsList value for this CustomRecordType.
     * 
     * @param parentsList
     */
    public void setParentsList(org.mule.module.netsuite.api.internal.CustomRecordTypeParentsList parentsList) {
        this.parentsList = parentsList;
    }


    /**
     * Gets the translationsList value for this CustomRecordType.
     * 
     * @return translationsList
     */
    public org.mule.module.netsuite.api.internal.CustomRecordTypeTranslationsList getTranslationsList() {
        return translationsList;
    }


    /**
     * Sets the translationsList value for this CustomRecordType.
     * 
     * @param translationsList
     */
    public void setTranslationsList(org.mule.module.netsuite.api.internal.CustomRecordTypeTranslationsList translationsList) {
        this.translationsList = translationsList;
    }


    /**
     * Gets the internalId value for this CustomRecordType.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CustomRecordType.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomRecordType)) return false;
        CustomRecordType other = (CustomRecordType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.recordName==null && other.getRecordName()==null) || 
             (this.recordName!=null &&
              this.recordName.equals(other.getRecordName()))) &&
            ((this.includeName==null && other.getIncludeName()==null) || 
             (this.includeName!=null &&
              this.includeName.equals(other.getIncludeName()))) &&
            ((this.showId==null && other.getShowId()==null) || 
             (this.showId!=null &&
              this.showId.equals(other.getShowId()))) &&
            ((this.showCreationDate==null && other.getShowCreationDate()==null) || 
             (this.showCreationDate!=null &&
              this.showCreationDate.equals(other.getShowCreationDate()))) &&
            ((this.showCreationDateOnList==null && other.getShowCreationDateOnList()==null) || 
             (this.showCreationDateOnList!=null &&
              this.showCreationDateOnList.equals(other.getShowCreationDateOnList()))) &&
            ((this.showLastModified==null && other.getShowLastModified()==null) || 
             (this.showLastModified!=null &&
              this.showLastModified.equals(other.getShowLastModified()))) &&
            ((this.showLastModifiedOnList==null && other.getShowLastModifiedOnList()==null) || 
             (this.showLastModifiedOnList!=null &&
              this.showLastModifiedOnList.equals(other.getShowLastModifiedOnList()))) &&
            ((this.showOwner==null && other.getShowOwner()==null) || 
             (this.showOwner!=null &&
              this.showOwner.equals(other.getShowOwner()))) &&
            ((this.showOwnerOnList==null && other.getShowOwnerOnList()==null) || 
             (this.showOwnerOnList!=null &&
              this.showOwnerOnList.equals(other.getShowOwnerOnList()))) &&
            ((this.showOwnerAllowChange==null && other.getShowOwnerAllowChange()==null) || 
             (this.showOwnerAllowChange!=null &&
              this.showOwnerAllowChange.equals(other.getShowOwnerAllowChange()))) &&
            ((this.usePermissions==null && other.getUsePermissions()==null) || 
             (this.usePermissions!=null &&
              this.usePermissions.equals(other.getUsePermissions()))) &&
            ((this.allowAttachments==null && other.getAllowAttachments()==null) || 
             (this.allowAttachments!=null &&
              this.allowAttachments.equals(other.getAllowAttachments()))) &&
            ((this.showNotes==null && other.getShowNotes()==null) || 
             (this.showNotes!=null &&
              this.showNotes.equals(other.getShowNotes()))) &&
            ((this.enableMailMerge==null && other.getEnableMailMerge()==null) || 
             (this.enableMailMerge!=null &&
              this.enableMailMerge.equals(other.getEnableMailMerge()))) &&
            ((this.isOrdered==null && other.getIsOrdered()==null) || 
             (this.isOrdered!=null &&
              this.isOrdered.equals(other.getIsOrdered()))) &&
            ((this.allowInlineEditing==null && other.getAllowInlineEditing()==null) || 
             (this.allowInlineEditing!=null &&
              this.allowInlineEditing.equals(other.getAllowInlineEditing()))) &&
            ((this.isAvailableOffline==null && other.getIsAvailableOffline()==null) || 
             (this.isAvailableOffline!=null &&
              this.isAvailableOffline.equals(other.getIsAvailableOffline()))) &&
            ((this.allowQuickSearch==null && other.getAllowQuickSearch()==null) || 
             (this.allowQuickSearch!=null &&
              this.allowQuickSearch.equals(other.getAllowQuickSearch()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.disclaimer==null && other.getDisclaimer()==null) || 
             (this.disclaimer!=null &&
              this.disclaimer.equals(other.getDisclaimer()))) &&
            ((this.enableNumbering==null && other.getEnableNumbering()==null) || 
             (this.enableNumbering!=null &&
              this.enableNumbering.equals(other.getEnableNumbering()))) &&
            ((this.numberingPrefix==null && other.getNumberingPrefix()==null) || 
             (this.numberingPrefix!=null &&
              this.numberingPrefix.equals(other.getNumberingPrefix()))) &&
            ((this.numberingSuffix==null && other.getNumberingSuffix()==null) || 
             (this.numberingSuffix!=null &&
              this.numberingSuffix.equals(other.getNumberingSuffix()))) &&
            ((this.numberingMinDigits==null && other.getNumberingMinDigits()==null) || 
             (this.numberingMinDigits!=null &&
              this.numberingMinDigits.equals(other.getNumberingMinDigits()))) &&
            ((this.numberingInit==null && other.getNumberingInit()==null) || 
             (this.numberingInit!=null &&
              this.numberingInit.equals(other.getNumberingInit()))) &&
            ((this.numberingCurrentNumber==null && other.getNumberingCurrentNumber()==null) || 
             (this.numberingCurrentNumber!=null &&
              this.numberingCurrentNumber.equals(other.getNumberingCurrentNumber()))) &&
            ((this.allowNumberingOverride==null && other.getAllowNumberingOverride()==null) || 
             (this.allowNumberingOverride!=null &&
              this.allowNumberingOverride.equals(other.getAllowNumberingOverride()))) &&
            ((this.isNumberingUpdateable==null && other.getIsNumberingUpdateable()==null) || 
             (this.isNumberingUpdateable!=null &&
              this.isNumberingUpdateable.equals(other.getIsNumberingUpdateable()))) &&
            ((this.scriptId==null && other.getScriptId()==null) || 
             (this.scriptId!=null &&
              this.scriptId.equals(other.getScriptId()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.fieldList==null && other.getFieldList()==null) || 
             (this.fieldList!=null &&
              this.fieldList.equals(other.getFieldList()))) &&
            ((this.tabsList==null && other.getTabsList()==null) || 
             (this.tabsList!=null &&
              this.tabsList.equals(other.getTabsList()))) &&
            ((this.sublistsList==null && other.getSublistsList()==null) || 
             (this.sublistsList!=null &&
              this.sublistsList.equals(other.getSublistsList()))) &&
            ((this.formsList==null && other.getFormsList()==null) || 
             (this.formsList!=null &&
              this.formsList.equals(other.getFormsList()))) &&
            ((this.onlineFormsList==null && other.getOnlineFormsList()==null) || 
             (this.onlineFormsList!=null &&
              this.onlineFormsList.equals(other.getOnlineFormsList()))) &&
            ((this.permissionsList==null && other.getPermissionsList()==null) || 
             (this.permissionsList!=null &&
              this.permissionsList.equals(other.getPermissionsList()))) &&
            ((this.linksList==null && other.getLinksList()==null) || 
             (this.linksList!=null &&
              this.linksList.equals(other.getLinksList()))) &&
            ((this.managersList==null && other.getManagersList()==null) || 
             (this.managersList!=null &&
              this.managersList.equals(other.getManagersList()))) &&
            ((this.childrenList==null && other.getChildrenList()==null) || 
             (this.childrenList!=null &&
              this.childrenList.equals(other.getChildrenList()))) &&
            ((this.parentsList==null && other.getParentsList()==null) || 
             (this.parentsList!=null &&
              this.parentsList.equals(other.getParentsList()))) &&
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
        if (getRecordName() != null) {
            _hashCode += getRecordName().hashCode();
        }
        if (getIncludeName() != null) {
            _hashCode += getIncludeName().hashCode();
        }
        if (getShowId() != null) {
            _hashCode += getShowId().hashCode();
        }
        if (getShowCreationDate() != null) {
            _hashCode += getShowCreationDate().hashCode();
        }
        if (getShowCreationDateOnList() != null) {
            _hashCode += getShowCreationDateOnList().hashCode();
        }
        if (getShowLastModified() != null) {
            _hashCode += getShowLastModified().hashCode();
        }
        if (getShowLastModifiedOnList() != null) {
            _hashCode += getShowLastModifiedOnList().hashCode();
        }
        if (getShowOwner() != null) {
            _hashCode += getShowOwner().hashCode();
        }
        if (getShowOwnerOnList() != null) {
            _hashCode += getShowOwnerOnList().hashCode();
        }
        if (getShowOwnerAllowChange() != null) {
            _hashCode += getShowOwnerAllowChange().hashCode();
        }
        if (getUsePermissions() != null) {
            _hashCode += getUsePermissions().hashCode();
        }
        if (getAllowAttachments() != null) {
            _hashCode += getAllowAttachments().hashCode();
        }
        if (getShowNotes() != null) {
            _hashCode += getShowNotes().hashCode();
        }
        if (getEnableMailMerge() != null) {
            _hashCode += getEnableMailMerge().hashCode();
        }
        if (getIsOrdered() != null) {
            _hashCode += getIsOrdered().hashCode();
        }
        if (getAllowInlineEditing() != null) {
            _hashCode += getAllowInlineEditing().hashCode();
        }
        if (getIsAvailableOffline() != null) {
            _hashCode += getIsAvailableOffline().hashCode();
        }
        if (getAllowQuickSearch() != null) {
            _hashCode += getAllowQuickSearch().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getDisclaimer() != null) {
            _hashCode += getDisclaimer().hashCode();
        }
        if (getEnableNumbering() != null) {
            _hashCode += getEnableNumbering().hashCode();
        }
        if (getNumberingPrefix() != null) {
            _hashCode += getNumberingPrefix().hashCode();
        }
        if (getNumberingSuffix() != null) {
            _hashCode += getNumberingSuffix().hashCode();
        }
        if (getNumberingMinDigits() != null) {
            _hashCode += getNumberingMinDigits().hashCode();
        }
        if (getNumberingInit() != null) {
            _hashCode += getNumberingInit().hashCode();
        }
        if (getNumberingCurrentNumber() != null) {
            _hashCode += getNumberingCurrentNumber().hashCode();
        }
        if (getAllowNumberingOverride() != null) {
            _hashCode += getAllowNumberingOverride().hashCode();
        }
        if (getIsNumberingUpdateable() != null) {
            _hashCode += getIsNumberingUpdateable().hashCode();
        }
        if (getScriptId() != null) {
            _hashCode += getScriptId().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFieldList() != null) {
            _hashCode += getFieldList().hashCode();
        }
        if (getTabsList() != null) {
            _hashCode += getTabsList().hashCode();
        }
        if (getSublistsList() != null) {
            _hashCode += getSublistsList().hashCode();
        }
        if (getFormsList() != null) {
            _hashCode += getFormsList().hashCode();
        }
        if (getOnlineFormsList() != null) {
            _hashCode += getOnlineFormsList().hashCode();
        }
        if (getPermissionsList() != null) {
            _hashCode += getPermissionsList().hashCode();
        }
        if (getLinksList() != null) {
            _hashCode += getLinksList().hashCode();
        }
        if (getManagersList() != null) {
            _hashCode += getManagersList().hashCode();
        }
        if (getChildrenList() != null) {
            _hashCode += getChildrenList().hashCode();
        }
        if (getParentsList() != null) {
            _hashCode += getParentsList().hashCode();
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
        new org.apache.axis.description.TypeDesc(CustomRecordType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "recordName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "includeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "showId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showCreationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "showCreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showCreationDateOnList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "showCreationDateOnList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showLastModified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "showLastModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showLastModifiedOnList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "showLastModifiedOnList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "showOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showOwnerOnList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "showOwnerOnList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showOwnerAllowChange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "showOwnerAllowChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usePermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "usePermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowAttachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "allowAttachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "showNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableMailMerge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "enableMailMerge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "isOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowInlineEditing");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "allowInlineEditing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAvailableOffline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "isAvailableOffline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowQuickSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "allowQuickSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disclaimer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "disclaimer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableNumbering");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "enableNumbering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberingPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "numberingPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberingSuffix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "numberingSuffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberingMinDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "numberingMinDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberingInit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "numberingInit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberingCurrentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "numberingCurrentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowNumberingOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "allowNumberingOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNumberingUpdateable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "isNumberingUpdateable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scriptId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "scriptId"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "fieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tabsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "tabsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeTabsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sublistsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "sublistsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeSublistsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "formsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeFormsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlineFormsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "onlineFormsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeOnlineFormsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "permissionsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypePermissionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linksList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "linksList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeLinksList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managersList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "managersList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeManagersList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childrenList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "childrenList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeChildrenList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "parentsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeParentsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translationsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "translationsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeTranslationsList"));
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
