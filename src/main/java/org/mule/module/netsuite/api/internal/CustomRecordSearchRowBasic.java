/**
 * CustomRecordSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomRecordSearchRowBasic  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef recType;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] altName;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] availableOffline;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] created;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] id;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModified;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] lastModifiedBy;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] name;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] owner;

    private org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList;

    public CustomRecordSearchRowBasic() {
    }

    public CustomRecordSearchRowBasic(
           org.mule.module.netsuite.api.internal.RecordRef recType,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] altName,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] availableOffline,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] created,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId,
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] id,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModified,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] lastModifiedBy,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] name,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] owner,
           org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
           this.recType = recType;
           this.altName = altName;
           this.availableOffline = availableOffline;
           this.created = created;
           this.externalId = externalId;
           this.id = id;
           this.internalId = internalId;
           this.isInactive = isInactive;
           this.lastModified = lastModified;
           this.lastModifiedBy = lastModifiedBy;
           this.name = name;
           this.owner = owner;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the recType value for this CustomRecordSearchRowBasic.
     * 
     * @return recType
     */
    public org.mule.module.netsuite.api.internal.RecordRef getRecType() {
        return recType;
    }


    /**
     * Sets the recType value for this CustomRecordSearchRowBasic.
     * 
     * @param recType
     */
    public void setRecType(org.mule.module.netsuite.api.internal.RecordRef recType) {
        this.recType = recType;
    }


    /**
     * Gets the altName value for this CustomRecordSearchRowBasic.
     * 
     * @return altName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAltName() {
        return altName;
    }


    /**
     * Sets the altName value for this CustomRecordSearchRowBasic.
     * 
     * @param altName
     */
    public void setAltName(org.mule.module.netsuite.api.internal.SearchColumnStringField[] altName) {
        this.altName = altName;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getAltName(int i) {
        return this.altName[i];
    }

    public void setAltName(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.altName[i] = _value;
    }


    /**
     * Gets the availableOffline value for this CustomRecordSearchRowBasic.
     * 
     * @return availableOffline
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getAvailableOffline() {
        return availableOffline;
    }


    /**
     * Sets the availableOffline value for this CustomRecordSearchRowBasic.
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
     * Gets the created value for this CustomRecordSearchRowBasic.
     * 
     * @return created
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getCreated() {
        return created;
    }


    /**
     * Sets the created value for this CustomRecordSearchRowBasic.
     * 
     * @param created
     */
    public void setCreated(org.mule.module.netsuite.api.internal.SearchColumnDateField[] created) {
        this.created = created;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getCreated(int i) {
        return this.created[i];
    }

    public void setCreated(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.created[i] = _value;
    }


    /**
     * Gets the externalId value for this CustomRecordSearchRowBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this CustomRecordSearchRowBasic.
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
     * Gets the id value for this CustomRecordSearchRowBasic.
     * 
     * @return id
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getId() {
        return id;
    }


    /**
     * Sets the id value for this CustomRecordSearchRowBasic.
     * 
     * @param id
     */
    public void setId(org.mule.module.netsuite.api.internal.SearchColumnLongField[] id) {
        this.id = id;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getId(int i) {
        return this.id[i];
    }

    public void setId(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.id[i] = _value;
    }


    /**
     * Gets the internalId value for this CustomRecordSearchRowBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CustomRecordSearchRowBasic.
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
     * Gets the isInactive value for this CustomRecordSearchRowBasic.
     * 
     * @return isInactive
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this CustomRecordSearchRowBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive) {
        this.isInactive = isInactive;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isInactive[i] = _value;
    }


    /**
     * Gets the lastModified value for this CustomRecordSearchRowBasic.
     * 
     * @return lastModified
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getLastModified() {
        return lastModified;
    }


    /**
     * Sets the lastModified value for this CustomRecordSearchRowBasic.
     * 
     * @param lastModified
     */
    public void setLastModified(org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModified) {
        this.lastModified = lastModified;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getLastModified(int i) {
        return this.lastModified[i];
    }

    public void setLastModified(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.lastModified[i] = _value;
    }


    /**
     * Gets the lastModifiedBy value for this CustomRecordSearchRowBasic.
     * 
     * @return lastModifiedBy
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this CustomRecordSearchRowBasic.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getLastModifiedBy(int i) {
        return this.lastModifiedBy[i];
    }

    public void setLastModifiedBy(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.lastModifiedBy[i] = _value;
    }


    /**
     * Gets the name value for this CustomRecordSearchRowBasic.
     * 
     * @return name
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this CustomRecordSearchRowBasic.
     * 
     * @param name
     */
    public void setName(org.mule.module.netsuite.api.internal.SearchColumnStringField[] name) {
        this.name = name;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.name[i] = _value;
    }


    /**
     * Gets the owner value for this CustomRecordSearchRowBasic.
     * 
     * @return owner
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CustomRecordSearchRowBasic.
     * 
     * @param owner
     */
    public void setOwner(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] owner) {
        this.owner = owner;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getOwner(int i) {
        return this.owner[i];
    }

    public void setOwner(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.owner[i] = _value;
    }


    /**
     * Gets the customFieldList value for this CustomRecordSearchRowBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CustomRecordSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomRecordSearchRowBasic)) return false;
        CustomRecordSearchRowBasic other = (CustomRecordSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.recType==null && other.getRecType()==null) || 
             (this.recType!=null &&
              this.recType.equals(other.getRecType()))) &&
            ((this.altName==null && other.getAltName()==null) || 
             (this.altName!=null &&
              java.util.Arrays.equals(this.altName, other.getAltName()))) &&
            ((this.availableOffline==null && other.getAvailableOffline()==null) || 
             (this.availableOffline!=null &&
              java.util.Arrays.equals(this.availableOffline, other.getAvailableOffline()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              java.util.Arrays.equals(this.created, other.getCreated()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              java.util.Arrays.equals(this.id, other.getId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.lastModified==null && other.getLastModified()==null) || 
             (this.lastModified!=null &&
              java.util.Arrays.equals(this.lastModified, other.getLastModified()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              java.util.Arrays.equals(this.lastModifiedBy, other.getLastModifiedBy()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              java.util.Arrays.equals(this.owner, other.getOwner()))) &&
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
        if (getRecType() != null) {
            _hashCode += getRecType().hashCode();
        }
        if (getAltName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAltName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAltName(), i);
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
        if (getCreated() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreated());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreated(), i);
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
        if (getId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getId(), i);
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
        if (getIsInactive() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsInactive());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsInactive(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastModified() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastModified());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastModified(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastModifiedBy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastModifiedBy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastModifiedBy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOwner() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOwner());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOwner(), i);
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
        new org.apache.axis.description.TypeDesc(CustomRecordSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CustomRecordSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "recType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "altName"));
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
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "created"));
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
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastModifiedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "owner"));
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
