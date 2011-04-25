/**
 * NoteSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class NoteSearchBasic  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchMultiSelectField author;

    private org.mule.module.netsuite.api.internal.SearchBooleanField direction;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId;

    private org.mule.module.netsuite.api.internal.SearchStringField externalIdString;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId;

    private org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber;

    private org.mule.module.netsuite.api.internal.SearchStringField note;

    private org.mule.module.netsuite.api.internal.SearchDateField noteDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField noteType;

    private org.mule.module.netsuite.api.internal.SearchStringField title;

    public NoteSearchBasic() {
    }

    public NoteSearchBasic(
           org.mule.module.netsuite.api.internal.SearchMultiSelectField author,
           org.mule.module.netsuite.api.internal.SearchBooleanField direction,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId,
           org.mule.module.netsuite.api.internal.SearchStringField externalIdString,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId,
           org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber,
           org.mule.module.netsuite.api.internal.SearchStringField note,
           org.mule.module.netsuite.api.internal.SearchDateField noteDate,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField noteType,
           org.mule.module.netsuite.api.internal.SearchStringField title) {
        this.author = author;
        this.direction = direction;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.note = note;
        this.noteDate = noteDate;
        this.noteType = noteType;
        this.title = title;
    }


    /**
     * Gets the author value for this NoteSearchBasic.
     * 
     * @return author
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this NoteSearchBasic.
     * 
     * @param author
     */
    public void setAuthor(org.mule.module.netsuite.api.internal.SearchMultiSelectField author) {
        this.author = author;
    }


    /**
     * Gets the direction value for this NoteSearchBasic.
     * 
     * @return direction
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this NoteSearchBasic.
     * 
     * @param direction
     */
    public void setDirection(org.mule.module.netsuite.api.internal.SearchBooleanField direction) {
        this.direction = direction;
    }


    /**
     * Gets the externalId value for this NoteSearchBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this NoteSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this NoteSearchBasic.
     * 
     * @return externalIdString
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this NoteSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(org.mule.module.netsuite.api.internal.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the internalId value for this NoteSearchBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this NoteSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this NoteSearchBasic.
     * 
     * @return internalIdNumber
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this NoteSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the note value for this NoteSearchBasic.
     * 
     * @return note
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getNote() {
        return note;
    }


    /**
     * Sets the note value for this NoteSearchBasic.
     * 
     * @param note
     */
    public void setNote(org.mule.module.netsuite.api.internal.SearchStringField note) {
        this.note = note;
    }


    /**
     * Gets the noteDate value for this NoteSearchBasic.
     * 
     * @return noteDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getNoteDate() {
        return noteDate;
    }


    /**
     * Sets the noteDate value for this NoteSearchBasic.
     * 
     * @param noteDate
     */
    public void setNoteDate(org.mule.module.netsuite.api.internal.SearchDateField noteDate) {
        this.noteDate = noteDate;
    }


    /**
     * Gets the noteType value for this NoteSearchBasic.
     * 
     * @return noteType
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getNoteType() {
        return noteType;
    }


    /**
     * Sets the noteType value for this NoteSearchBasic.
     * 
     * @param noteType
     */
    public void setNoteType(org.mule.module.netsuite.api.internal.SearchMultiSelectField noteType) {
        this.noteType = noteType;
    }


    /**
     * Gets the title value for this NoteSearchBasic.
     * 
     * @return title
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getTitle() {
        return title;
    }


    /**
     * Sets the title value for this NoteSearchBasic.
     * 
     * @param title
     */
    public void setTitle(org.mule.module.netsuite.api.internal.SearchStringField title) {
        this.title = title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NoteSearchBasic)) return false;
        NoteSearchBasic other = (NoteSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              this.author.equals(other.getAuthor()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.noteDate==null && other.getNoteDate()==null) || 
             (this.noteDate!=null &&
              this.noteDate.equals(other.getNoteDate()))) &&
            ((this.noteType==null && other.getNoteType()==null) || 
             (this.noteType!=null &&
              this.noteType.equals(other.getNoteType()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle())));
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
        if (getAuthor() != null) {
            _hashCode += getAuthor().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getNoteDate() != null) {
            _hashCode += getNoteDate().hashCode();
        }
        if (getNoteType() != null) {
            _hashCode += getNoteType().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NoteSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "NoteSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "author"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "note"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "noteDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "noteType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
