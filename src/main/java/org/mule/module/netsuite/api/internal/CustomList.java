/**
 * CustomList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomList  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private java.lang.String name;

    private org.mule.module.netsuite.api.internal.RecordRef owner;

    private java.lang.Boolean isOrdered;

    private java.lang.String description;

    private java.lang.Boolean isMatrixOption;

    private java.lang.String scriptId;

    private java.lang.Boolean convertToCustomRecord;

    private java.lang.Boolean isInactive;

    private org.mule.module.netsuite.api.internal.CustomListCustomValueList customValueList;

    private org.mule.module.netsuite.api.internal.CustomListTranslationsList translationsList;

    private java.lang.String internalId;  // attribute

    public CustomList() {
    }

    public CustomList(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String name,
           org.mule.module.netsuite.api.internal.RecordRef owner,
           java.lang.Boolean isOrdered,
           java.lang.String description,
           java.lang.Boolean isMatrixOption,
           java.lang.String scriptId,
           java.lang.Boolean convertToCustomRecord,
           java.lang.Boolean isInactive,
           org.mule.module.netsuite.api.internal.CustomListCustomValueList customValueList,
           org.mule.module.netsuite.api.internal.CustomListTranslationsList translationsList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.name = name;
        this.owner = owner;
        this.isOrdered = isOrdered;
        this.description = description;
        this.isMatrixOption = isMatrixOption;
        this.scriptId = scriptId;
        this.convertToCustomRecord = convertToCustomRecord;
        this.isInactive = isInactive;
        this.customValueList = customValueList;
        this.translationsList = translationsList;
    }


    /**
     * Gets the name value for this CustomList.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CustomList.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the owner value for this CustomList.
     * 
     * @return owner
     */
    public org.mule.module.netsuite.api.internal.RecordRef getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CustomList.
     * 
     * @param owner
     */
    public void setOwner(org.mule.module.netsuite.api.internal.RecordRef owner) {
        this.owner = owner;
    }


    /**
     * Gets the isOrdered value for this CustomList.
     * 
     * @return isOrdered
     */
    public java.lang.Boolean getIsOrdered() {
        return isOrdered;
    }


    /**
     * Sets the isOrdered value for this CustomList.
     * 
     * @param isOrdered
     */
    public void setIsOrdered(java.lang.Boolean isOrdered) {
        this.isOrdered = isOrdered;
    }


    /**
     * Gets the description value for this CustomList.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CustomList.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the isMatrixOption value for this CustomList.
     * 
     * @return isMatrixOption
     */
    public java.lang.Boolean getIsMatrixOption() {
        return isMatrixOption;
    }


    /**
     * Sets the isMatrixOption value for this CustomList.
     * 
     * @param isMatrixOption
     */
    public void setIsMatrixOption(java.lang.Boolean isMatrixOption) {
        this.isMatrixOption = isMatrixOption;
    }


    /**
     * Gets the scriptId value for this CustomList.
     * 
     * @return scriptId
     */
    public java.lang.String getScriptId() {
        return scriptId;
    }


    /**
     * Sets the scriptId value for this CustomList.
     * 
     * @param scriptId
     */
    public void setScriptId(java.lang.String scriptId) {
        this.scriptId = scriptId;
    }


    /**
     * Gets the convertToCustomRecord value for this CustomList.
     * 
     * @return convertToCustomRecord
     */
    public java.lang.Boolean getConvertToCustomRecord() {
        return convertToCustomRecord;
    }


    /**
     * Sets the convertToCustomRecord value for this CustomList.
     * 
     * @param convertToCustomRecord
     */
    public void setConvertToCustomRecord(java.lang.Boolean convertToCustomRecord) {
        this.convertToCustomRecord = convertToCustomRecord;
    }


    /**
     * Gets the isInactive value for this CustomList.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this CustomList.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the customValueList value for this CustomList.
     * 
     * @return customValueList
     */
    public org.mule.module.netsuite.api.internal.CustomListCustomValueList getCustomValueList() {
        return customValueList;
    }


    /**
     * Sets the customValueList value for this CustomList.
     * 
     * @param customValueList
     */
    public void setCustomValueList(org.mule.module.netsuite.api.internal.CustomListCustomValueList customValueList) {
        this.customValueList = customValueList;
    }


    /**
     * Gets the translationsList value for this CustomList.
     * 
     * @return translationsList
     */
    public org.mule.module.netsuite.api.internal.CustomListTranslationsList getTranslationsList() {
        return translationsList;
    }


    /**
     * Sets the translationsList value for this CustomList.
     * 
     * @param translationsList
     */
    public void setTranslationsList(org.mule.module.netsuite.api.internal.CustomListTranslationsList translationsList) {
        this.translationsList = translationsList;
    }


    /**
     * Gets the internalId value for this CustomList.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CustomList.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomList)) return false;
        CustomList other = (CustomList) obj;
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
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.isOrdered==null && other.getIsOrdered()==null) || 
             (this.isOrdered!=null &&
              this.isOrdered.equals(other.getIsOrdered()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.isMatrixOption==null && other.getIsMatrixOption()==null) || 
             (this.isMatrixOption!=null &&
              this.isMatrixOption.equals(other.getIsMatrixOption()))) &&
            ((this.scriptId==null && other.getScriptId()==null) || 
             (this.scriptId!=null &&
              this.scriptId.equals(other.getScriptId()))) &&
            ((this.convertToCustomRecord==null && other.getConvertToCustomRecord()==null) || 
             (this.convertToCustomRecord!=null &&
              this.convertToCustomRecord.equals(other.getConvertToCustomRecord()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.customValueList==null && other.getCustomValueList()==null) || 
             (this.customValueList!=null &&
              this.customValueList.equals(other.getCustomValueList()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getIsOrdered() != null) {
            _hashCode += getIsOrdered().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getIsMatrixOption() != null) {
            _hashCode += getIsMatrixOption().hashCode();
        }
        if (getScriptId() != null) {
            _hashCode += getScriptId().hashCode();
        }
        if (getConvertToCustomRecord() != null) {
            _hashCode += getConvertToCustomRecord().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getCustomValueList() != null) {
            _hashCode += getCustomValueList().hashCode();
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
        new org.apache.axis.description.TypeDesc(CustomList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("isOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "isOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("isMatrixOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "isMatrixOption"));
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
        elemField.setFieldName("convertToCustomRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "convertToCustomRecord"));
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
        elemField.setFieldName("customValueList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "customValueList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomListCustomValueList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translationsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "translationsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomListTranslationsList"));
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
