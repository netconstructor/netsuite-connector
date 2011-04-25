/**
 * FileSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class FileSearchBasic  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchBooleanField availableWithoutLogin;

    private org.mule.module.netsuite.api.internal.SearchDateField created;

    private org.mule.module.netsuite.api.internal.SearchDateField dateViewed;

    private org.mule.module.netsuite.api.internal.SearchStringField description;

    private org.mule.module.netsuite.api.internal.SearchLongField documentSize;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId;

    private org.mule.module.netsuite.api.internal.SearchStringField externalIdString;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField fileType;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField folder;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId;

    private org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isAvailable;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isLink;

    private org.mule.module.netsuite.api.internal.SearchDateField modified;

    private org.mule.module.netsuite.api.internal.SearchStringField name;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField owner;

    private org.mule.module.netsuite.api.internal.SearchStringField url;

    public FileSearchBasic() {
    }

    public FileSearchBasic(
           org.mule.module.netsuite.api.internal.SearchBooleanField availableWithoutLogin,
           org.mule.module.netsuite.api.internal.SearchDateField created,
           org.mule.module.netsuite.api.internal.SearchDateField dateViewed,
           org.mule.module.netsuite.api.internal.SearchStringField description,
           org.mule.module.netsuite.api.internal.SearchLongField documentSize,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId,
           org.mule.module.netsuite.api.internal.SearchStringField externalIdString,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField fileType,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField folder,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId,
           org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber,
           org.mule.module.netsuite.api.internal.SearchBooleanField isAvailable,
           org.mule.module.netsuite.api.internal.SearchBooleanField isLink,
           org.mule.module.netsuite.api.internal.SearchDateField modified,
           org.mule.module.netsuite.api.internal.SearchStringField name,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField owner,
           org.mule.module.netsuite.api.internal.SearchStringField url) {
        this.availableWithoutLogin = availableWithoutLogin;
        this.created = created;
        this.dateViewed = dateViewed;
        this.description = description;
        this.documentSize = documentSize;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.fileType = fileType;
        this.folder = folder;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isAvailable = isAvailable;
        this.isLink = isLink;
        this.modified = modified;
        this.name = name;
        this.owner = owner;
        this.url = url;
    }


    /**
     * Gets the availableWithoutLogin value for this FileSearchBasic.
     * 
     * @return availableWithoutLogin
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getAvailableWithoutLogin() {
        return availableWithoutLogin;
    }


    /**
     * Sets the availableWithoutLogin value for this FileSearchBasic.
     * 
     * @param availableWithoutLogin
     */
    public void setAvailableWithoutLogin(org.mule.module.netsuite.api.internal.SearchBooleanField availableWithoutLogin) {
        this.availableWithoutLogin = availableWithoutLogin;
    }


    /**
     * Gets the created value for this FileSearchBasic.
     * 
     * @return created
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getCreated() {
        return created;
    }


    /**
     * Sets the created value for this FileSearchBasic.
     * 
     * @param created
     */
    public void setCreated(org.mule.module.netsuite.api.internal.SearchDateField created) {
        this.created = created;
    }


    /**
     * Gets the dateViewed value for this FileSearchBasic.
     * 
     * @return dateViewed
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getDateViewed() {
        return dateViewed;
    }


    /**
     * Sets the dateViewed value for this FileSearchBasic.
     * 
     * @param dateViewed
     */
    public void setDateViewed(org.mule.module.netsuite.api.internal.SearchDateField dateViewed) {
        this.dateViewed = dateViewed;
    }


    /**
     * Gets the description value for this FileSearchBasic.
     * 
     * @return description
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getDescription() {
        return description;
    }


    /**
     * Sets the description value for this FileSearchBasic.
     * 
     * @param description
     */
    public void setDescription(org.mule.module.netsuite.api.internal.SearchStringField description) {
        this.description = description;
    }


    /**
     * Gets the documentSize value for this FileSearchBasic.
     * 
     * @return documentSize
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getDocumentSize() {
        return documentSize;
    }


    /**
     * Sets the documentSize value for this FileSearchBasic.
     * 
     * @param documentSize
     */
    public void setDocumentSize(org.mule.module.netsuite.api.internal.SearchLongField documentSize) {
        this.documentSize = documentSize;
    }


    /**
     * Gets the externalId value for this FileSearchBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this FileSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this FileSearchBasic.
     * 
     * @return externalIdString
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this FileSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(org.mule.module.netsuite.api.internal.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the fileType value for this FileSearchBasic.
     * 
     * @return fileType
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getFileType() {
        return fileType;
    }


    /**
     * Sets the fileType value for this FileSearchBasic.
     * 
     * @param fileType
     */
    public void setFileType(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField fileType) {
        this.fileType = fileType;
    }


    /**
     * Gets the folder value for this FileSearchBasic.
     * 
     * @return folder
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getFolder() {
        return folder;
    }


    /**
     * Sets the folder value for this FileSearchBasic.
     * 
     * @param folder
     */
    public void setFolder(org.mule.module.netsuite.api.internal.SearchMultiSelectField folder) {
        this.folder = folder;
    }


    /**
     * Gets the internalId value for this FileSearchBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this FileSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this FileSearchBasic.
     * 
     * @return internalIdNumber
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this FileSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isAvailable value for this FileSearchBasic.
     * 
     * @return isAvailable
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsAvailable() {
        return isAvailable;
    }


    /**
     * Sets the isAvailable value for this FileSearchBasic.
     * 
     * @param isAvailable
     */
    public void setIsAvailable(org.mule.module.netsuite.api.internal.SearchBooleanField isAvailable) {
        this.isAvailable = isAvailable;
    }


    /**
     * Gets the isLink value for this FileSearchBasic.
     * 
     * @return isLink
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsLink() {
        return isLink;
    }


    /**
     * Sets the isLink value for this FileSearchBasic.
     * 
     * @param isLink
     */
    public void setIsLink(org.mule.module.netsuite.api.internal.SearchBooleanField isLink) {
        this.isLink = isLink;
    }


    /**
     * Gets the modified value for this FileSearchBasic.
     * 
     * @return modified
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getModified() {
        return modified;
    }


    /**
     * Sets the modified value for this FileSearchBasic.
     * 
     * @param modified
     */
    public void setModified(org.mule.module.netsuite.api.internal.SearchDateField modified) {
        this.modified = modified;
    }


    /**
     * Gets the name value for this FileSearchBasic.
     * 
     * @return name
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getName() {
        return name;
    }


    /**
     * Sets the name value for this FileSearchBasic.
     * 
     * @param name
     */
    public void setName(org.mule.module.netsuite.api.internal.SearchStringField name) {
        this.name = name;
    }


    /**
     * Gets the owner value for this FileSearchBasic.
     * 
     * @return owner
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this FileSearchBasic.
     * 
     * @param owner
     */
    public void setOwner(org.mule.module.netsuite.api.internal.SearchMultiSelectField owner) {
        this.owner = owner;
    }


    /**
     * Gets the url value for this FileSearchBasic.
     * 
     * @return url
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getUrl() {
        return url;
    }


    /**
     * Sets the url value for this FileSearchBasic.
     * 
     * @param url
     */
    public void setUrl(org.mule.module.netsuite.api.internal.SearchStringField url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileSearchBasic)) return false;
        FileSearchBasic other = (FileSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.availableWithoutLogin==null && other.getAvailableWithoutLogin()==null) || 
             (this.availableWithoutLogin!=null &&
              this.availableWithoutLogin.equals(other.getAvailableWithoutLogin()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.dateViewed==null && other.getDateViewed()==null) || 
             (this.dateViewed!=null &&
              this.dateViewed.equals(other.getDateViewed()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.documentSize==null && other.getDocumentSize()==null) || 
             (this.documentSize!=null &&
              this.documentSize.equals(other.getDocumentSize()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.fileType==null && other.getFileType()==null) || 
             (this.fileType!=null &&
              this.fileType.equals(other.getFileType()))) &&
            ((this.folder==null && other.getFolder()==null) || 
             (this.folder!=null &&
              this.folder.equals(other.getFolder()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isAvailable==null && other.getIsAvailable()==null) || 
             (this.isAvailable!=null &&
              this.isAvailable.equals(other.getIsAvailable()))) &&
            ((this.isLink==null && other.getIsLink()==null) || 
             (this.isLink!=null &&
              this.isLink.equals(other.getIsLink()))) &&
            ((this.modified==null && other.getModified()==null) || 
             (this.modified!=null &&
              this.modified.equals(other.getModified()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
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
        if (getAvailableWithoutLogin() != null) {
            _hashCode += getAvailableWithoutLogin().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getDateViewed() != null) {
            _hashCode += getDateViewed().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDocumentSize() != null) {
            _hashCode += getDocumentSize().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getFileType() != null) {
            _hashCode += getFileType().hashCode();
        }
        if (getFolder() != null) {
            _hashCode += getFolder().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsAvailable() != null) {
            _hashCode += getIsAvailable().hashCode();
        }
        if (getIsLink() != null) {
            _hashCode += getIsLink().hashCode();
        }
        if (getModified() != null) {
            _hashCode += getModified().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "FileSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableWithoutLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "availableWithoutLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateViewed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "dateViewed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "documentSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
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
        elemField.setFieldName("fileType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "folder"));
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
        elemField.setFieldName("isAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isLink");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "modified"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
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
