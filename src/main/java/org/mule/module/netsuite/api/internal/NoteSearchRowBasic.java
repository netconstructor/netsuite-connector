/**
 * NoteSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class NoteSearchRowBasic  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] author;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] direction;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] note;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] noteDate;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] noteType;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] title;

    public NoteSearchRowBasic() {
    }

    public NoteSearchRowBasic(
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] author,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] direction,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] note,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] noteDate,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] noteType,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] title) {
           this.author = author;
           this.direction = direction;
           this.externalId = externalId;
           this.internalId = internalId;
           this.note = note;
           this.noteDate = noteDate;
           this.noteType = noteType;
           this.title = title;
    }


    /**
     * Gets the author value for this NoteSearchRowBasic.
     * 
     * @return author
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this NoteSearchRowBasic.
     * 
     * @param author
     */
    public void setAuthor(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] author) {
        this.author = author;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getAuthor(int i) {
        return this.author[i];
    }

    public void setAuthor(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.author[i] = _value;
    }


    /**
     * Gets the direction value for this NoteSearchRowBasic.
     * 
     * @return direction
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this NoteSearchRowBasic.
     * 
     * @param direction
     */
    public void setDirection(org.mule.module.netsuite.api.internal.SearchColumnStringField[] direction) {
        this.direction = direction;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getDirection(int i) {
        return this.direction[i];
    }

    public void setDirection(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.direction[i] = _value;
    }


    /**
     * Gets the externalId value for this NoteSearchRowBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this NoteSearchRowBasic.
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
     * Gets the internalId value for this NoteSearchRowBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this NoteSearchRowBasic.
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
     * Gets the note value for this NoteSearchRowBasic.
     * 
     * @return note
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getNote() {
        return note;
    }


    /**
     * Sets the note value for this NoteSearchRowBasic.
     * 
     * @param note
     */
    public void setNote(org.mule.module.netsuite.api.internal.SearchColumnStringField[] note) {
        this.note = note;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getNote(int i) {
        return this.note[i];
    }

    public void setNote(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.note[i] = _value;
    }


    /**
     * Gets the noteDate value for this NoteSearchRowBasic.
     * 
     * @return noteDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getNoteDate() {
        return noteDate;
    }


    /**
     * Sets the noteDate value for this NoteSearchRowBasic.
     * 
     * @param noteDate
     */
    public void setNoteDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] noteDate) {
        this.noteDate = noteDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getNoteDate(int i) {
        return this.noteDate[i];
    }

    public void setNoteDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.noteDate[i] = _value;
    }


    /**
     * Gets the noteType value for this NoteSearchRowBasic.
     * 
     * @return noteType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getNoteType() {
        return noteType;
    }


    /**
     * Sets the noteType value for this NoteSearchRowBasic.
     * 
     * @param noteType
     */
    public void setNoteType(org.mule.module.netsuite.api.internal.SearchColumnStringField[] noteType) {
        this.noteType = noteType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getNoteType(int i) {
        return this.noteType[i];
    }

    public void setNoteType(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.noteType[i] = _value;
    }


    /**
     * Gets the title value for this NoteSearchRowBasic.
     * 
     * @return title
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getTitle() {
        return title;
    }


    /**
     * Sets the title value for this NoteSearchRowBasic.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NoteSearchRowBasic)) return false;
        NoteSearchRowBasic other = (NoteSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              java.util.Arrays.equals(this.author, other.getAuthor()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              java.util.Arrays.equals(this.direction, other.getDirection()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              java.util.Arrays.equals(this.note, other.getNote()))) &&
            ((this.noteDate==null && other.getNoteDate()==null) || 
             (this.noteDate!=null &&
              java.util.Arrays.equals(this.noteDate, other.getNoteDate()))) &&
            ((this.noteType==null && other.getNoteType()==null) || 
             (this.noteType!=null &&
              java.util.Arrays.equals(this.noteType, other.getNoteType()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              java.util.Arrays.equals(this.title, other.getTitle())));
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
        if (getAuthor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDirection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDirection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDirection(), i);
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
        if (getNote() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNote());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNote(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNoteDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNoteDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNoteDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNoteType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNoteType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNoteType(), i);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NoteSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "NoteSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "author"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "note"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "noteDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "noteType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
