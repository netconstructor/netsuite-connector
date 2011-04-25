/**
 * SolutionSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SolutionSearchBasic  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchStringField _abstract;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField assigned;

    private org.mule.module.netsuite.api.internal.SearchLongField caseCount;

    private org.mule.module.netsuite.api.internal.SearchStringField code;

    private org.mule.module.netsuite.api.internal.SearchDateField createdDate;

    private org.mule.module.netsuite.api.internal.SearchStringField description;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId;

    private org.mule.module.netsuite.api.internal.SearchStringField externalIdString;

    private org.mule.module.netsuite.api.internal.SearchStringField find;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId;

    private org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isInactive;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isOnline;

    private org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate;

    private org.mule.module.netsuite.api.internal.SearchLongField number;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField status;

    private org.mule.module.netsuite.api.internal.SearchStringField title;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField topic;

    private org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList;

    public SolutionSearchBasic() {
    }

    public SolutionSearchBasic(
           org.mule.module.netsuite.api.internal.SearchStringField _abstract,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField assigned,
           org.mule.module.netsuite.api.internal.SearchLongField caseCount,
           org.mule.module.netsuite.api.internal.SearchStringField code,
           org.mule.module.netsuite.api.internal.SearchDateField createdDate,
           org.mule.module.netsuite.api.internal.SearchStringField description,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId,
           org.mule.module.netsuite.api.internal.SearchStringField externalIdString,
           org.mule.module.netsuite.api.internal.SearchStringField find,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId,
           org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber,
           org.mule.module.netsuite.api.internal.SearchBooleanField isInactive,
           org.mule.module.netsuite.api.internal.SearchBooleanField isOnline,
           org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate,
           org.mule.module.netsuite.api.internal.SearchLongField number,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField status,
           org.mule.module.netsuite.api.internal.SearchStringField title,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField topic,
           org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this._abstract = _abstract;
        this.assigned = assigned;
        this.caseCount = caseCount;
        this.code = code;
        this.createdDate = createdDate;
        this.description = description;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.find = find;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.isOnline = isOnline;
        this.lastModifiedDate = lastModifiedDate;
        this.number = number;
        this.status = status;
        this.title = title;
        this.topic = topic;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the _abstract value for this SolutionSearchBasic.
     * 
     * @return _abstract
     */
    public org.mule.module.netsuite.api.internal.SearchStringField get_abstract() {
        return _abstract;
    }


    /**
     * Sets the _abstract value for this SolutionSearchBasic.
     * 
     * @param _abstract
     */
    public void set_abstract(org.mule.module.netsuite.api.internal.SearchStringField _abstract) {
        this._abstract = _abstract;
    }


    /**
     * Gets the assigned value for this SolutionSearchBasic.
     * 
     * @return assigned
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this SolutionSearchBasic.
     * 
     * @param assigned
     */
    public void setAssigned(org.mule.module.netsuite.api.internal.SearchMultiSelectField assigned) {
        this.assigned = assigned;
    }


    /**
     * Gets the caseCount value for this SolutionSearchBasic.
     * 
     * @return caseCount
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getCaseCount() {
        return caseCount;
    }


    /**
     * Sets the caseCount value for this SolutionSearchBasic.
     * 
     * @param caseCount
     */
    public void setCaseCount(org.mule.module.netsuite.api.internal.SearchLongField caseCount) {
        this.caseCount = caseCount;
    }


    /**
     * Gets the code value for this SolutionSearchBasic.
     * 
     * @return code
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getCode() {
        return code;
    }


    /**
     * Sets the code value for this SolutionSearchBasic.
     * 
     * @param code
     */
    public void setCode(org.mule.module.netsuite.api.internal.SearchStringField code) {
        this.code = code;
    }


    /**
     * Gets the createdDate value for this SolutionSearchBasic.
     * 
     * @return createdDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this SolutionSearchBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(org.mule.module.netsuite.api.internal.SearchDateField createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the description value for this SolutionSearchBasic.
     * 
     * @return description
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SolutionSearchBasic.
     * 
     * @param description
     */
    public void setDescription(org.mule.module.netsuite.api.internal.SearchStringField description) {
        this.description = description;
    }


    /**
     * Gets the externalId value for this SolutionSearchBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this SolutionSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this SolutionSearchBasic.
     * 
     * @return externalIdString
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this SolutionSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(org.mule.module.netsuite.api.internal.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the find value for this SolutionSearchBasic.
     * 
     * @return find
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getFind() {
        return find;
    }


    /**
     * Sets the find value for this SolutionSearchBasic.
     * 
     * @param find
     */
    public void setFind(org.mule.module.netsuite.api.internal.SearchStringField find) {
        this.find = find;
    }


    /**
     * Gets the internalId value for this SolutionSearchBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this SolutionSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this SolutionSearchBasic.
     * 
     * @return internalIdNumber
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this SolutionSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isInactive value for this SolutionSearchBasic.
     * 
     * @return isInactive
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this SolutionSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(org.mule.module.netsuite.api.internal.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the isOnline value for this SolutionSearchBasic.
     * 
     * @return isOnline
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsOnline() {
        return isOnline;
    }


    /**
     * Sets the isOnline value for this SolutionSearchBasic.
     * 
     * @param isOnline
     */
    public void setIsOnline(org.mule.module.netsuite.api.internal.SearchBooleanField isOnline) {
        this.isOnline = isOnline;
    }


    /**
     * Gets the lastModifiedDate value for this SolutionSearchBasic.
     * 
     * @return lastModifiedDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this SolutionSearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the number value for this SolutionSearchBasic.
     * 
     * @return number
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getNumber() {
        return number;
    }


    /**
     * Sets the number value for this SolutionSearchBasic.
     * 
     * @param number
     */
    public void setNumber(org.mule.module.netsuite.api.internal.SearchLongField number) {
        this.number = number;
    }


    /**
     * Gets the status value for this SolutionSearchBasic.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SolutionSearchBasic.
     * 
     * @param status
     */
    public void setStatus(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField status) {
        this.status = status;
    }


    /**
     * Gets the title value for this SolutionSearchBasic.
     * 
     * @return title
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getTitle() {
        return title;
    }


    /**
     * Sets the title value for this SolutionSearchBasic.
     * 
     * @param title
     */
    public void setTitle(org.mule.module.netsuite.api.internal.SearchStringField title) {
        this.title = title;
    }


    /**
     * Gets the topic value for this SolutionSearchBasic.
     * 
     * @return topic
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getTopic() {
        return topic;
    }


    /**
     * Sets the topic value for this SolutionSearchBasic.
     * 
     * @param topic
     */
    public void setTopic(org.mule.module.netsuite.api.internal.SearchMultiSelectField topic) {
        this.topic = topic;
    }


    /**
     * Gets the customFieldList value for this SolutionSearchBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this SolutionSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SolutionSearchBasic)) return false;
        SolutionSearchBasic other = (SolutionSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this._abstract==null && other.get_abstract()==null) || 
             (this._abstract!=null &&
              this._abstract.equals(other.get_abstract()))) &&
            ((this.assigned==null && other.getAssigned()==null) || 
             (this.assigned!=null &&
              this.assigned.equals(other.getAssigned()))) &&
            ((this.caseCount==null && other.getCaseCount()==null) || 
             (this.caseCount!=null &&
              this.caseCount.equals(other.getCaseCount()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.find==null && other.getFind()==null) || 
             (this.find!=null &&
              this.find.equals(other.getFind()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.isOnline==null && other.getIsOnline()==null) || 
             (this.isOnline!=null &&
              this.isOnline.equals(other.getIsOnline()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.topic==null && other.getTopic()==null) || 
             (this.topic!=null &&
              this.topic.equals(other.getTopic()))) &&
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
        if (get_abstract() != null) {
            _hashCode += get_abstract().hashCode();
        }
        if (getAssigned() != null) {
            _hashCode += getAssigned().hashCode();
        }
        if (getCaseCount() != null) {
            _hashCode += getCaseCount().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getFind() != null) {
            _hashCode += getFind().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getIsOnline() != null) {
            _hashCode += getIsOnline().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getTopic() != null) {
            _hashCode += getTopic().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SolutionSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "SolutionSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_abstract");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "abstract"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("caseCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "caseCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("find");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "find"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOnline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isOnline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
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
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "topic"));
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
