/**
 * CustomRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomRecord  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private java.lang.String customRecordId;

    private org.mule.module.netsuite.api.internal.RecordRef customForm;

    private java.lang.Boolean isInactive;

    private java.lang.String disclaimer;

    private java.util.Calendar created;

    private java.util.Calendar lastModified;

    private java.lang.String name;

    private org.mule.module.netsuite.api.internal.RecordRef owner;

    private org.mule.module.netsuite.api.internal.RecordRef recType;

    private java.lang.Boolean enableNumbering;

    private java.lang.String numberingPrefix;

    private java.lang.String numberingSuffix;

    private java.lang.Long numberingMinDigits;

    private java.lang.String description;

    private java.lang.Long numberingInit;

    private java.lang.Long numberingCurrentNumber;

    private java.lang.Boolean allowNumberingOverride;

    private java.lang.Boolean isNumberingUpdateable;

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

    private java.lang.Boolean enablEmailMerge;

    private java.lang.Boolean isOrdered;

    private java.lang.Boolean allowInlineEditing;

    private java.lang.Boolean isAvailableOffline;

    private java.lang.Boolean allowQuickSearch;

    private java.lang.String recordName;

    private java.lang.String scriptId;

    private org.mule.module.netsuite.api.internal.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public CustomRecord() {
    }

    public CustomRecord(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.lang.String customRecordId,
           org.mule.module.netsuite.api.internal.RecordRef customForm,
           java.lang.Boolean isInactive,
           java.lang.String disclaimer,
           java.util.Calendar created,
           java.util.Calendar lastModified,
           java.lang.String name,
           org.mule.module.netsuite.api.internal.RecordRef owner,
           org.mule.module.netsuite.api.internal.RecordRef recType,
           java.lang.Boolean enableNumbering,
           java.lang.String numberingPrefix,
           java.lang.String numberingSuffix,
           java.lang.Long numberingMinDigits,
           java.lang.String description,
           java.lang.Long numberingInit,
           java.lang.Long numberingCurrentNumber,
           java.lang.Boolean allowNumberingOverride,
           java.lang.Boolean isNumberingUpdateable,
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
           java.lang.Boolean enablEmailMerge,
           java.lang.Boolean isOrdered,
           java.lang.Boolean allowInlineEditing,
           java.lang.Boolean isAvailableOffline,
           java.lang.Boolean allowQuickSearch,
           java.lang.String recordName,
           java.lang.String scriptId,
           org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customRecordId = customRecordId;
        this.customForm = customForm;
        this.isInactive = isInactive;
        this.disclaimer = disclaimer;
        this.created = created;
        this.lastModified = lastModified;
        this.name = name;
        this.owner = owner;
        this.recType = recType;
        this.enableNumbering = enableNumbering;
        this.numberingPrefix = numberingPrefix;
        this.numberingSuffix = numberingSuffix;
        this.numberingMinDigits = numberingMinDigits;
        this.description = description;
        this.numberingInit = numberingInit;
        this.numberingCurrentNumber = numberingCurrentNumber;
        this.allowNumberingOverride = allowNumberingOverride;
        this.isNumberingUpdateable = isNumberingUpdateable;
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
        this.enablEmailMerge = enablEmailMerge;
        this.isOrdered = isOrdered;
        this.allowInlineEditing = allowInlineEditing;
        this.isAvailableOffline = isAvailableOffline;
        this.allowQuickSearch = allowQuickSearch;
        this.recordName = recordName;
        this.scriptId = scriptId;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the customRecordId value for this CustomRecord.
     * 
     * @return customRecordId
     */
    public java.lang.String getCustomRecordId() {
        return customRecordId;
    }


    /**
     * Sets the customRecordId value for this CustomRecord.
     * 
     * @param customRecordId
     */
    public void setCustomRecordId(java.lang.String customRecordId) {
        this.customRecordId = customRecordId;
    }


    /**
     * Gets the customForm value for this CustomRecord.
     * 
     * @return customForm
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this CustomRecord.
     * 
     * @param customForm
     */
    public void setCustomForm(org.mule.module.netsuite.api.internal.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the isInactive value for this CustomRecord.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this CustomRecord.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the disclaimer value for this CustomRecord.
     * 
     * @return disclaimer
     */
    public java.lang.String getDisclaimer() {
        return disclaimer;
    }


    /**
     * Sets the disclaimer value for this CustomRecord.
     * 
     * @param disclaimer
     */
    public void setDisclaimer(java.lang.String disclaimer) {
        this.disclaimer = disclaimer;
    }


    /**
     * Gets the created value for this CustomRecord.
     * 
     * @return created
     */
    public java.util.Calendar getCreated() {
        return created;
    }


    /**
     * Sets the created value for this CustomRecord.
     * 
     * @param created
     */
    public void setCreated(java.util.Calendar created) {
        this.created = created;
    }


    /**
     * Gets the lastModified value for this CustomRecord.
     * 
     * @return lastModified
     */
    public java.util.Calendar getLastModified() {
        return lastModified;
    }


    /**
     * Sets the lastModified value for this CustomRecord.
     * 
     * @param lastModified
     */
    public void setLastModified(java.util.Calendar lastModified) {
        this.lastModified = lastModified;
    }


    /**
     * Gets the name value for this CustomRecord.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CustomRecord.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the owner value for this CustomRecord.
     * 
     * @return owner
     */
    public org.mule.module.netsuite.api.internal.RecordRef getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CustomRecord.
     * 
     * @param owner
     */
    public void setOwner(org.mule.module.netsuite.api.internal.RecordRef owner) {
        this.owner = owner;
    }


    /**
     * Gets the recType value for this CustomRecord.
     * 
     * @return recType
     */
    public org.mule.module.netsuite.api.internal.RecordRef getRecType() {
        return recType;
    }


    /**
     * Sets the recType value for this CustomRecord.
     * 
     * @param recType
     */
    public void setRecType(org.mule.module.netsuite.api.internal.RecordRef recType) {
        this.recType = recType;
    }


    /**
     * Gets the enableNumbering value for this CustomRecord.
     * 
     * @return enableNumbering
     */
    public java.lang.Boolean getEnableNumbering() {
        return enableNumbering;
    }


    /**
     * Sets the enableNumbering value for this CustomRecord.
     * 
     * @param enableNumbering
     */
    public void setEnableNumbering(java.lang.Boolean enableNumbering) {
        this.enableNumbering = enableNumbering;
    }


    /**
     * Gets the numberingPrefix value for this CustomRecord.
     * 
     * @return numberingPrefix
     */
    public java.lang.String getNumberingPrefix() {
        return numberingPrefix;
    }


    /**
     * Sets the numberingPrefix value for this CustomRecord.
     * 
     * @param numberingPrefix
     */
    public void setNumberingPrefix(java.lang.String numberingPrefix) {
        this.numberingPrefix = numberingPrefix;
    }


    /**
     * Gets the numberingSuffix value for this CustomRecord.
     * 
     * @return numberingSuffix
     */
    public java.lang.String getNumberingSuffix() {
        return numberingSuffix;
    }


    /**
     * Sets the numberingSuffix value for this CustomRecord.
     * 
     * @param numberingSuffix
     */
    public void setNumberingSuffix(java.lang.String numberingSuffix) {
        this.numberingSuffix = numberingSuffix;
    }


    /**
     * Gets the numberingMinDigits value for this CustomRecord.
     * 
     * @return numberingMinDigits
     */
    public java.lang.Long getNumberingMinDigits() {
        return numberingMinDigits;
    }


    /**
     * Sets the numberingMinDigits value for this CustomRecord.
     * 
     * @param numberingMinDigits
     */
    public void setNumberingMinDigits(java.lang.Long numberingMinDigits) {
        this.numberingMinDigits = numberingMinDigits;
    }


    /**
     * Gets the description value for this CustomRecord.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CustomRecord.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the numberingInit value for this CustomRecord.
     * 
     * @return numberingInit
     */
    public java.lang.Long getNumberingInit() {
        return numberingInit;
    }


    /**
     * Sets the numberingInit value for this CustomRecord.
     * 
     * @param numberingInit
     */
    public void setNumberingInit(java.lang.Long numberingInit) {
        this.numberingInit = numberingInit;
    }


    /**
     * Gets the numberingCurrentNumber value for this CustomRecord.
     * 
     * @return numberingCurrentNumber
     */
    public java.lang.Long getNumberingCurrentNumber() {
        return numberingCurrentNumber;
    }


    /**
     * Sets the numberingCurrentNumber value for this CustomRecord.
     * 
     * @param numberingCurrentNumber
     */
    public void setNumberingCurrentNumber(java.lang.Long numberingCurrentNumber) {
        this.numberingCurrentNumber = numberingCurrentNumber;
    }


    /**
     * Gets the allowNumberingOverride value for this CustomRecord.
     * 
     * @return allowNumberingOverride
     */
    public java.lang.Boolean getAllowNumberingOverride() {
        return allowNumberingOverride;
    }


    /**
     * Sets the allowNumberingOverride value for this CustomRecord.
     * 
     * @param allowNumberingOverride
     */
    public void setAllowNumberingOverride(java.lang.Boolean allowNumberingOverride) {
        this.allowNumberingOverride = allowNumberingOverride;
    }


    /**
     * Gets the isNumberingUpdateable value for this CustomRecord.
     * 
     * @return isNumberingUpdateable
     */
    public java.lang.Boolean getIsNumberingUpdateable() {
        return isNumberingUpdateable;
    }


    /**
     * Sets the isNumberingUpdateable value for this CustomRecord.
     * 
     * @param isNumberingUpdateable
     */
    public void setIsNumberingUpdateable(java.lang.Boolean isNumberingUpdateable) {
        this.isNumberingUpdateable = isNumberingUpdateable;
    }


    /**
     * Gets the includeName value for this CustomRecord.
     * 
     * @return includeName
     */
    public java.lang.Boolean getIncludeName() {
        return includeName;
    }


    /**
     * Sets the includeName value for this CustomRecord.
     * 
     * @param includeName
     */
    public void setIncludeName(java.lang.Boolean includeName) {
        this.includeName = includeName;
    }


    /**
     * Gets the showId value for this CustomRecord.
     * 
     * @return showId
     */
    public java.lang.Boolean getShowId() {
        return showId;
    }


    /**
     * Sets the showId value for this CustomRecord.
     * 
     * @param showId
     */
    public void setShowId(java.lang.Boolean showId) {
        this.showId = showId;
    }


    /**
     * Gets the showCreationDate value for this CustomRecord.
     * 
     * @return showCreationDate
     */
    public java.lang.Boolean getShowCreationDate() {
        return showCreationDate;
    }


    /**
     * Sets the showCreationDate value for this CustomRecord.
     * 
     * @param showCreationDate
     */
    public void setShowCreationDate(java.lang.Boolean showCreationDate) {
        this.showCreationDate = showCreationDate;
    }


    /**
     * Gets the showCreationDateOnList value for this CustomRecord.
     * 
     * @return showCreationDateOnList
     */
    public java.lang.Boolean getShowCreationDateOnList() {
        return showCreationDateOnList;
    }


    /**
     * Sets the showCreationDateOnList value for this CustomRecord.
     * 
     * @param showCreationDateOnList
     */
    public void setShowCreationDateOnList(java.lang.Boolean showCreationDateOnList) {
        this.showCreationDateOnList = showCreationDateOnList;
    }


    /**
     * Gets the showLastModified value for this CustomRecord.
     * 
     * @return showLastModified
     */
    public java.lang.Boolean getShowLastModified() {
        return showLastModified;
    }


    /**
     * Sets the showLastModified value for this CustomRecord.
     * 
     * @param showLastModified
     */
    public void setShowLastModified(java.lang.Boolean showLastModified) {
        this.showLastModified = showLastModified;
    }


    /**
     * Gets the showLastModifiedOnList value for this CustomRecord.
     * 
     * @return showLastModifiedOnList
     */
    public java.lang.Boolean getShowLastModifiedOnList() {
        return showLastModifiedOnList;
    }


    /**
     * Sets the showLastModifiedOnList value for this CustomRecord.
     * 
     * @param showLastModifiedOnList
     */
    public void setShowLastModifiedOnList(java.lang.Boolean showLastModifiedOnList) {
        this.showLastModifiedOnList = showLastModifiedOnList;
    }


    /**
     * Gets the showOwner value for this CustomRecord.
     * 
     * @return showOwner
     */
    public java.lang.Boolean getShowOwner() {
        return showOwner;
    }


    /**
     * Sets the showOwner value for this CustomRecord.
     * 
     * @param showOwner
     */
    public void setShowOwner(java.lang.Boolean showOwner) {
        this.showOwner = showOwner;
    }


    /**
     * Gets the showOwnerOnList value for this CustomRecord.
     * 
     * @return showOwnerOnList
     */
    public java.lang.Boolean getShowOwnerOnList() {
        return showOwnerOnList;
    }


    /**
     * Sets the showOwnerOnList value for this CustomRecord.
     * 
     * @param showOwnerOnList
     */
    public void setShowOwnerOnList(java.lang.Boolean showOwnerOnList) {
        this.showOwnerOnList = showOwnerOnList;
    }


    /**
     * Gets the showOwnerAllowChange value for this CustomRecord.
     * 
     * @return showOwnerAllowChange
     */
    public java.lang.Boolean getShowOwnerAllowChange() {
        return showOwnerAllowChange;
    }


    /**
     * Sets the showOwnerAllowChange value for this CustomRecord.
     * 
     * @param showOwnerAllowChange
     */
    public void setShowOwnerAllowChange(java.lang.Boolean showOwnerAllowChange) {
        this.showOwnerAllowChange = showOwnerAllowChange;
    }


    /**
     * Gets the usePermissions value for this CustomRecord.
     * 
     * @return usePermissions
     */
    public java.lang.Boolean getUsePermissions() {
        return usePermissions;
    }


    /**
     * Sets the usePermissions value for this CustomRecord.
     * 
     * @param usePermissions
     */
    public void setUsePermissions(java.lang.Boolean usePermissions) {
        this.usePermissions = usePermissions;
    }


    /**
     * Gets the allowAttachments value for this CustomRecord.
     * 
     * @return allowAttachments
     */
    public java.lang.Boolean getAllowAttachments() {
        return allowAttachments;
    }


    /**
     * Sets the allowAttachments value for this CustomRecord.
     * 
     * @param allowAttachments
     */
    public void setAllowAttachments(java.lang.Boolean allowAttachments) {
        this.allowAttachments = allowAttachments;
    }


    /**
     * Gets the showNotes value for this CustomRecord.
     * 
     * @return showNotes
     */
    public java.lang.Boolean getShowNotes() {
        return showNotes;
    }


    /**
     * Sets the showNotes value for this CustomRecord.
     * 
     * @param showNotes
     */
    public void setShowNotes(java.lang.Boolean showNotes) {
        this.showNotes = showNotes;
    }


    /**
     * Gets the enablEmailMerge value for this CustomRecord.
     * 
     * @return enablEmailMerge
     */
    public java.lang.Boolean getEnablEmailMerge() {
        return enablEmailMerge;
    }


    /**
     * Sets the enablEmailMerge value for this CustomRecord.
     * 
     * @param enablEmailMerge
     */
    public void setEnablEmailMerge(java.lang.Boolean enablEmailMerge) {
        this.enablEmailMerge = enablEmailMerge;
    }


    /**
     * Gets the isOrdered value for this CustomRecord.
     * 
     * @return isOrdered
     */
    public java.lang.Boolean getIsOrdered() {
        return isOrdered;
    }


    /**
     * Sets the isOrdered value for this CustomRecord.
     * 
     * @param isOrdered
     */
    public void setIsOrdered(java.lang.Boolean isOrdered) {
        this.isOrdered = isOrdered;
    }


    /**
     * Gets the allowInlineEditing value for this CustomRecord.
     * 
     * @return allowInlineEditing
     */
    public java.lang.Boolean getAllowInlineEditing() {
        return allowInlineEditing;
    }


    /**
     * Sets the allowInlineEditing value for this CustomRecord.
     * 
     * @param allowInlineEditing
     */
    public void setAllowInlineEditing(java.lang.Boolean allowInlineEditing) {
        this.allowInlineEditing = allowInlineEditing;
    }


    /**
     * Gets the isAvailableOffline value for this CustomRecord.
     * 
     * @return isAvailableOffline
     */
    public java.lang.Boolean getIsAvailableOffline() {
        return isAvailableOffline;
    }


    /**
     * Sets the isAvailableOffline value for this CustomRecord.
     * 
     * @param isAvailableOffline
     */
    public void setIsAvailableOffline(java.lang.Boolean isAvailableOffline) {
        this.isAvailableOffline = isAvailableOffline;
    }


    /**
     * Gets the allowQuickSearch value for this CustomRecord.
     * 
     * @return allowQuickSearch
     */
    public java.lang.Boolean getAllowQuickSearch() {
        return allowQuickSearch;
    }


    /**
     * Sets the allowQuickSearch value for this CustomRecord.
     * 
     * @param allowQuickSearch
     */
    public void setAllowQuickSearch(java.lang.Boolean allowQuickSearch) {
        this.allowQuickSearch = allowQuickSearch;
    }


    /**
     * Gets the recordName value for this CustomRecord.
     * 
     * @return recordName
     */
    public java.lang.String getRecordName() {
        return recordName;
    }


    /**
     * Sets the recordName value for this CustomRecord.
     * 
     * @param recordName
     */
    public void setRecordName(java.lang.String recordName) {
        this.recordName = recordName;
    }


    /**
     * Gets the scriptId value for this CustomRecord.
     * 
     * @return scriptId
     */
    public java.lang.String getScriptId() {
        return scriptId;
    }


    /**
     * Sets the scriptId value for this CustomRecord.
     * 
     * @param scriptId
     */
    public void setScriptId(java.lang.String scriptId) {
        this.scriptId = scriptId;
    }


    /**
     * Gets the customFieldList value for this CustomRecord.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CustomRecord.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this CustomRecord.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CustomRecord.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this CustomRecord.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this CustomRecord.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomRecord)) return false;
        CustomRecord other = (CustomRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customRecordId==null && other.getCustomRecordId()==null) || 
             (this.customRecordId!=null &&
              this.customRecordId.equals(other.getCustomRecordId()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.disclaimer==null && other.getDisclaimer()==null) || 
             (this.disclaimer!=null &&
              this.disclaimer.equals(other.getDisclaimer()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.lastModified==null && other.getLastModified()==null) || 
             (this.lastModified!=null &&
              this.lastModified.equals(other.getLastModified()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.recType==null && other.getRecType()==null) || 
             (this.recType!=null &&
              this.recType.equals(other.getRecType()))) &&
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
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
            ((this.enablEmailMerge==null && other.getEnablEmailMerge()==null) || 
             (this.enablEmailMerge!=null &&
              this.enablEmailMerge.equals(other.getEnablEmailMerge()))) &&
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
            ((this.recordName==null && other.getRecordName()==null) || 
             (this.recordName!=null &&
              this.recordName.equals(other.getRecordName()))) &&
            ((this.scriptId==null && other.getScriptId()==null) || 
             (this.scriptId!=null &&
              this.scriptId.equals(other.getScriptId()))) &&
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
        if (getCustomRecordId() != null) {
            _hashCode += getCustomRecordId().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getDisclaimer() != null) {
            _hashCode += getDisclaimer().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getLastModified() != null) {
            _hashCode += getLastModified().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getRecType() != null) {
            _hashCode += getRecType().hashCode();
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
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
        if (getEnablEmailMerge() != null) {
            _hashCode += getEnablEmailMerge().hashCode();
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
        if (getRecordName() != null) {
            _hashCode += getRecordName().hashCode();
        }
        if (getScriptId() != null) {
            _hashCode += getScriptId().hashCode();
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
        new org.apache.axis.description.TypeDesc(CustomRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecord"));
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
        elemField.setFieldName("customRecordId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "customRecordId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "lastModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "name"));
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
        elemField.setFieldName("recType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "recType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("enablEmailMerge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "enablEmailMerge"));
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
        elemField.setFieldName("recordName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "recordName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "customFieldList"));
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
