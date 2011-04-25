/**
 * File.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class File  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private java.lang.String name;

    private org.mule.module.netsuite.api.internal.FileAttachFrom attachFrom;

    private java.lang.String mediaTypeName;

    private org.mule.module.netsuite.api.internal.MediaType fileType;

    private byte[] content;

    private org.mule.module.netsuite.api.internal.RecordRef folder;

    private java.lang.Double fileSize;

    private java.lang.String url;

    private org.mule.module.netsuite.api.internal.RecordRef mediaFile;

    private org.mule.module.netsuite.api.internal.TextFileEncoding textFileEncoding;

    private java.lang.String description;

    private org.mule.module.netsuite.api.internal.FileEncoding encoding;

    private java.lang.String altTagCaption;

    private java.lang.Boolean isOnline;

    private java.lang.Boolean isInactive;

    private java.lang.String _class;

    private java.lang.Boolean bundleable;

    private java.lang.String department;

    private java.lang.Boolean hideInBundle;

    private java.lang.Boolean isPrivate;

    private org.mule.module.netsuite.api.internal.RecordRef owner;

    private java.lang.String caption;

    private org.mule.module.netsuite.api.internal.RecordRef storeDisplayThumbnail;

    private java.lang.String siteDescription;

    private java.lang.String featuredDescription;

    private java.util.Calendar lastModifiedDate;

    private java.util.Calendar createdDate;

    private org.mule.module.netsuite.api.internal.FileSiteCategoryList siteCategoryList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public File() {
    }

    public File(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.lang.String name,
           org.mule.module.netsuite.api.internal.FileAttachFrom attachFrom,
           java.lang.String mediaTypeName,
           org.mule.module.netsuite.api.internal.MediaType fileType,
           byte[] content,
           org.mule.module.netsuite.api.internal.RecordRef folder,
           java.lang.Double fileSize,
           java.lang.String url,
           org.mule.module.netsuite.api.internal.RecordRef mediaFile,
           org.mule.module.netsuite.api.internal.TextFileEncoding textFileEncoding,
           java.lang.String description,
           org.mule.module.netsuite.api.internal.FileEncoding encoding,
           java.lang.String altTagCaption,
           java.lang.Boolean isOnline,
           java.lang.Boolean isInactive,
           java.lang.String _class,
           java.lang.Boolean bundleable,
           java.lang.String department,
           java.lang.Boolean hideInBundle,
           java.lang.Boolean isPrivate,
           org.mule.module.netsuite.api.internal.RecordRef owner,
           java.lang.String caption,
           org.mule.module.netsuite.api.internal.RecordRef storeDisplayThumbnail,
           java.lang.String siteDescription,
           java.lang.String featuredDescription,
           java.util.Calendar lastModifiedDate,
           java.util.Calendar createdDate,
           org.mule.module.netsuite.api.internal.FileSiteCategoryList siteCategoryList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.name = name;
        this.attachFrom = attachFrom;
        this.mediaTypeName = mediaTypeName;
        this.fileType = fileType;
        this.content = content;
        this.folder = folder;
        this.fileSize = fileSize;
        this.url = url;
        this.mediaFile = mediaFile;
        this.textFileEncoding = textFileEncoding;
        this.description = description;
        this.encoding = encoding;
        this.altTagCaption = altTagCaption;
        this.isOnline = isOnline;
        this.isInactive = isInactive;
        this._class = _class;
        this.bundleable = bundleable;
        this.department = department;
        this.hideInBundle = hideInBundle;
        this.isPrivate = isPrivate;
        this.owner = owner;
        this.caption = caption;
        this.storeDisplayThumbnail = storeDisplayThumbnail;
        this.siteDescription = siteDescription;
        this.featuredDescription = featuredDescription;
        this.lastModifiedDate = lastModifiedDate;
        this.createdDate = createdDate;
        this.siteCategoryList = siteCategoryList;
    }


    /**
     * Gets the name value for this File.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this File.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the attachFrom value for this File.
     * 
     * @return attachFrom
     */
    public org.mule.module.netsuite.api.internal.FileAttachFrom getAttachFrom() {
        return attachFrom;
    }


    /**
     * Sets the attachFrom value for this File.
     * 
     * @param attachFrom
     */
    public void setAttachFrom(org.mule.module.netsuite.api.internal.FileAttachFrom attachFrom) {
        this.attachFrom = attachFrom;
    }


    /**
     * Gets the mediaTypeName value for this File.
     * 
     * @return mediaTypeName
     */
    public java.lang.String getMediaTypeName() {
        return mediaTypeName;
    }


    /**
     * Sets the mediaTypeName value for this File.
     * 
     * @param mediaTypeName
     */
    public void setMediaTypeName(java.lang.String mediaTypeName) {
        this.mediaTypeName = mediaTypeName;
    }


    /**
     * Gets the fileType value for this File.
     * 
     * @return fileType
     */
    public org.mule.module.netsuite.api.internal.MediaType getFileType() {
        return fileType;
    }


    /**
     * Sets the fileType value for this File.
     * 
     * @param fileType
     */
    public void setFileType(org.mule.module.netsuite.api.internal.MediaType fileType) {
        this.fileType = fileType;
    }


    /**
     * Gets the content value for this File.
     * 
     * @return content
     */
    public byte[] getContent() {
        return content;
    }


    /**
     * Sets the content value for this File.
     * 
     * @param content
     */
    public void setContent(byte[] content) {
        this.content = content;
    }


    /**
     * Gets the folder value for this File.
     * 
     * @return folder
     */
    public org.mule.module.netsuite.api.internal.RecordRef getFolder() {
        return folder;
    }


    /**
     * Sets the folder value for this File.
     * 
     * @param folder
     */
    public void setFolder(org.mule.module.netsuite.api.internal.RecordRef folder) {
        this.folder = folder;
    }


    /**
     * Gets the fileSize value for this File.
     * 
     * @return fileSize
     */
    public java.lang.Double getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this File.
     * 
     * @param fileSize
     */
    public void setFileSize(java.lang.Double fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * Gets the url value for this File.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this File.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the mediaFile value for this File.
     * 
     * @return mediaFile
     */
    public org.mule.module.netsuite.api.internal.RecordRef getMediaFile() {
        return mediaFile;
    }


    /**
     * Sets the mediaFile value for this File.
     * 
     * @param mediaFile
     */
    public void setMediaFile(org.mule.module.netsuite.api.internal.RecordRef mediaFile) {
        this.mediaFile = mediaFile;
    }


    /**
     * Gets the textFileEncoding value for this File.
     * 
     * @return textFileEncoding
     */
    public org.mule.module.netsuite.api.internal.TextFileEncoding getTextFileEncoding() {
        return textFileEncoding;
    }


    /**
     * Sets the textFileEncoding value for this File.
     * 
     * @param textFileEncoding
     */
    public void setTextFileEncoding(org.mule.module.netsuite.api.internal.TextFileEncoding textFileEncoding) {
        this.textFileEncoding = textFileEncoding;
    }


    /**
     * Gets the description value for this File.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this File.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the encoding value for this File.
     * 
     * @return encoding
     */
    public org.mule.module.netsuite.api.internal.FileEncoding getEncoding() {
        return encoding;
    }


    /**
     * Sets the encoding value for this File.
     * 
     * @param encoding
     */
    public void setEncoding(org.mule.module.netsuite.api.internal.FileEncoding encoding) {
        this.encoding = encoding;
    }


    /**
     * Gets the altTagCaption value for this File.
     * 
     * @return altTagCaption
     */
    public java.lang.String getAltTagCaption() {
        return altTagCaption;
    }


    /**
     * Sets the altTagCaption value for this File.
     * 
     * @param altTagCaption
     */
    public void setAltTagCaption(java.lang.String altTagCaption) {
        this.altTagCaption = altTagCaption;
    }


    /**
     * Gets the isOnline value for this File.
     * 
     * @return isOnline
     */
    public java.lang.Boolean getIsOnline() {
        return isOnline;
    }


    /**
     * Sets the isOnline value for this File.
     * 
     * @param isOnline
     */
    public void setIsOnline(java.lang.Boolean isOnline) {
        this.isOnline = isOnline;
    }


    /**
     * Gets the isInactive value for this File.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this File.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the _class value for this File.
     * 
     * @return _class
     */
    public java.lang.String get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this File.
     * 
     * @param _class
     */
    public void set_class(java.lang.String _class) {
        this._class = _class;
    }


    /**
     * Gets the bundleable value for this File.
     * 
     * @return bundleable
     */
    public java.lang.Boolean getBundleable() {
        return bundleable;
    }


    /**
     * Sets the bundleable value for this File.
     * 
     * @param bundleable
     */
    public void setBundleable(java.lang.Boolean bundleable) {
        this.bundleable = bundleable;
    }


    /**
     * Gets the department value for this File.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this File.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the hideInBundle value for this File.
     * 
     * @return hideInBundle
     */
    public java.lang.Boolean getHideInBundle() {
        return hideInBundle;
    }


    /**
     * Sets the hideInBundle value for this File.
     * 
     * @param hideInBundle
     */
    public void setHideInBundle(java.lang.Boolean hideInBundle) {
        this.hideInBundle = hideInBundle;
    }


    /**
     * Gets the isPrivate value for this File.
     * 
     * @return isPrivate
     */
    public java.lang.Boolean getIsPrivate() {
        return isPrivate;
    }


    /**
     * Sets the isPrivate value for this File.
     * 
     * @param isPrivate
     */
    public void setIsPrivate(java.lang.Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }


    /**
     * Gets the owner value for this File.
     * 
     * @return owner
     */
    public org.mule.module.netsuite.api.internal.RecordRef getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this File.
     * 
     * @param owner
     */
    public void setOwner(org.mule.module.netsuite.api.internal.RecordRef owner) {
        this.owner = owner;
    }


    /**
     * Gets the caption value for this File.
     * 
     * @return caption
     */
    public java.lang.String getCaption() {
        return caption;
    }


    /**
     * Sets the caption value for this File.
     * 
     * @param caption
     */
    public void setCaption(java.lang.String caption) {
        this.caption = caption;
    }


    /**
     * Gets the storeDisplayThumbnail value for this File.
     * 
     * @return storeDisplayThumbnail
     */
    public org.mule.module.netsuite.api.internal.RecordRef getStoreDisplayThumbnail() {
        return storeDisplayThumbnail;
    }


    /**
     * Sets the storeDisplayThumbnail value for this File.
     * 
     * @param storeDisplayThumbnail
     */
    public void setStoreDisplayThumbnail(org.mule.module.netsuite.api.internal.RecordRef storeDisplayThumbnail) {
        this.storeDisplayThumbnail = storeDisplayThumbnail;
    }


    /**
     * Gets the siteDescription value for this File.
     * 
     * @return siteDescription
     */
    public java.lang.String getSiteDescription() {
        return siteDescription;
    }


    /**
     * Sets the siteDescription value for this File.
     * 
     * @param siteDescription
     */
    public void setSiteDescription(java.lang.String siteDescription) {
        this.siteDescription = siteDescription;
    }


    /**
     * Gets the featuredDescription value for this File.
     * 
     * @return featuredDescription
     */
    public java.lang.String getFeaturedDescription() {
        return featuredDescription;
    }


    /**
     * Sets the featuredDescription value for this File.
     * 
     * @param featuredDescription
     */
    public void setFeaturedDescription(java.lang.String featuredDescription) {
        this.featuredDescription = featuredDescription;
    }


    /**
     * Gets the lastModifiedDate value for this File.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this File.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the createdDate value for this File.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this File.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the siteCategoryList value for this File.
     * 
     * @return siteCategoryList
     */
    public org.mule.module.netsuite.api.internal.FileSiteCategoryList getSiteCategoryList() {
        return siteCategoryList;
    }


    /**
     * Sets the siteCategoryList value for this File.
     * 
     * @param siteCategoryList
     */
    public void setSiteCategoryList(org.mule.module.netsuite.api.internal.FileSiteCategoryList siteCategoryList) {
        this.siteCategoryList = siteCategoryList;
    }


    /**
     * Gets the internalId value for this File.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this File.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this File.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this File.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof File)) return false;
        File other = (File) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.attachFrom==null && other.getAttachFrom()==null) || 
             (this.attachFrom!=null &&
              this.attachFrom.equals(other.getAttachFrom()))) &&
            ((this.mediaTypeName==null && other.getMediaTypeName()==null) || 
             (this.mediaTypeName!=null &&
              this.mediaTypeName.equals(other.getMediaTypeName()))) &&
            ((this.fileType==null && other.getFileType()==null) || 
             (this.fileType!=null &&
              this.fileType.equals(other.getFileType()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              java.util.Arrays.equals(this.content, other.getContent()))) &&
            ((this.folder==null && other.getFolder()==null) || 
             (this.folder!=null &&
              this.folder.equals(other.getFolder()))) &&
            ((this.fileSize==null && other.getFileSize()==null) || 
             (this.fileSize!=null &&
              this.fileSize.equals(other.getFileSize()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.mediaFile==null && other.getMediaFile()==null) || 
             (this.mediaFile!=null &&
              this.mediaFile.equals(other.getMediaFile()))) &&
            ((this.textFileEncoding==null && other.getTextFileEncoding()==null) || 
             (this.textFileEncoding!=null &&
              this.textFileEncoding.equals(other.getTextFileEncoding()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.encoding==null && other.getEncoding()==null) || 
             (this.encoding!=null &&
              this.encoding.equals(other.getEncoding()))) &&
            ((this.altTagCaption==null && other.getAltTagCaption()==null) || 
             (this.altTagCaption!=null &&
              this.altTagCaption.equals(other.getAltTagCaption()))) &&
            ((this.isOnline==null && other.getIsOnline()==null) || 
             (this.isOnline!=null &&
              this.isOnline.equals(other.getIsOnline()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.bundleable==null && other.getBundleable()==null) || 
             (this.bundleable!=null &&
              this.bundleable.equals(other.getBundleable()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.hideInBundle==null && other.getHideInBundle()==null) || 
             (this.hideInBundle!=null &&
              this.hideInBundle.equals(other.getHideInBundle()))) &&
            ((this.isPrivate==null && other.getIsPrivate()==null) || 
             (this.isPrivate!=null &&
              this.isPrivate.equals(other.getIsPrivate()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.caption==null && other.getCaption()==null) || 
             (this.caption!=null &&
              this.caption.equals(other.getCaption()))) &&
            ((this.storeDisplayThumbnail==null && other.getStoreDisplayThumbnail()==null) || 
             (this.storeDisplayThumbnail!=null &&
              this.storeDisplayThumbnail.equals(other.getStoreDisplayThumbnail()))) &&
            ((this.siteDescription==null && other.getSiteDescription()==null) || 
             (this.siteDescription!=null &&
              this.siteDescription.equals(other.getSiteDescription()))) &&
            ((this.featuredDescription==null && other.getFeaturedDescription()==null) || 
             (this.featuredDescription!=null &&
              this.featuredDescription.equals(other.getFeaturedDescription()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.siteCategoryList==null && other.getSiteCategoryList()==null) || 
             (this.siteCategoryList!=null &&
              this.siteCategoryList.equals(other.getSiteCategoryList()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAttachFrom() != null) {
            _hashCode += getAttachFrom().hashCode();
        }
        if (getMediaTypeName() != null) {
            _hashCode += getMediaTypeName().hashCode();
        }
        if (getFileType() != null) {
            _hashCode += getFileType().hashCode();
        }
        if (getContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFolder() != null) {
            _hashCode += getFolder().hashCode();
        }
        if (getFileSize() != null) {
            _hashCode += getFileSize().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getMediaFile() != null) {
            _hashCode += getMediaFile().hashCode();
        }
        if (getTextFileEncoding() != null) {
            _hashCode += getTextFileEncoding().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEncoding() != null) {
            _hashCode += getEncoding().hashCode();
        }
        if (getAltTagCaption() != null) {
            _hashCode += getAltTagCaption().hashCode();
        }
        if (getIsOnline() != null) {
            _hashCode += getIsOnline().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getBundleable() != null) {
            _hashCode += getBundleable().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getHideInBundle() != null) {
            _hashCode += getHideInBundle().hashCode();
        }
        if (getIsPrivate() != null) {
            _hashCode += getIsPrivate().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getCaption() != null) {
            _hashCode += getCaption().hashCode();
        }
        if (getStoreDisplayThumbnail() != null) {
            _hashCode += getStoreDisplayThumbnail().hashCode();
        }
        if (getSiteDescription() != null) {
            _hashCode += getSiteDescription().hashCode();
        }
        if (getFeaturedDescription() != null) {
            _hashCode += getFeaturedDescription().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getSiteCategoryList() != null) {
            _hashCode += getSiteCategoryList().hashCode();
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
        new org.apache.axis.description.TypeDesc(File.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "File"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "attachFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.filecabinet_2010_2.documents.webservices.netsuite.com", "FileAttachFrom"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "mediaTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "fileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.filecabinet_2010_2.documents.webservices.netsuite.com", "MediaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "folder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "fileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaFile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "mediaFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textFileEncoding");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "textFileEncoding"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.filecabinet_2010_2.documents.webservices.netsuite.com", "TextFileEncoding"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encoding");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "encoding"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.filecabinet_2010_2.documents.webservices.netsuite.com", "FileEncoding"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altTagCaption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "altTagCaption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOnline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "isOnline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundleable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "bundleable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hideInBundle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "hideInBundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPrivate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "isPrivate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "caption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDisplayThumbnail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "storeDisplayThumbnail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "siteDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featuredDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "featuredDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteCategoryList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "siteCategoryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "FileSiteCategoryList"));
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
