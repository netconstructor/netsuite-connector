/**
 * Message.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class Message  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef author;

    private org.mule.module.netsuite.api.internal.RecordRef recipient;

    private java.lang.String cc;

    private java.lang.String bcc;

    private java.util.Calendar messageDate;

    private java.lang.String recordName;

    private java.lang.String recordTypeName;

    private java.lang.String subject;

    private java.lang.String message;

    private java.lang.Boolean emailed;

    private org.mule.module.netsuite.api.internal.RecordRef activity;

    private java.lang.Boolean compressAttachments;

    private java.lang.Boolean incoming;

    private java.util.Calendar lastModifiedDate;

    private org.mule.module.netsuite.api.internal.RecordRef transaction;

    private org.mule.module.netsuite.api.internal.MessageMediaItemList mediaItemList;

    private java.lang.String dateTime;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Message() {
    }

    public Message(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           org.mule.module.netsuite.api.internal.RecordRef author,
           org.mule.module.netsuite.api.internal.RecordRef recipient,
           java.lang.String cc,
           java.lang.String bcc,
           java.util.Calendar messageDate,
           java.lang.String recordName,
           java.lang.String recordTypeName,
           java.lang.String subject,
           java.lang.String message,
           java.lang.Boolean emailed,
           org.mule.module.netsuite.api.internal.RecordRef activity,
           java.lang.Boolean compressAttachments,
           java.lang.Boolean incoming,
           java.util.Calendar lastModifiedDate,
           org.mule.module.netsuite.api.internal.RecordRef transaction,
           org.mule.module.netsuite.api.internal.MessageMediaItemList mediaItemList,
           java.lang.String dateTime) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.author = author;
        this.recipient = recipient;
        this.cc = cc;
        this.bcc = bcc;
        this.messageDate = messageDate;
        this.recordName = recordName;
        this.recordTypeName = recordTypeName;
        this.subject = subject;
        this.message = message;
        this.emailed = emailed;
        this.activity = activity;
        this.compressAttachments = compressAttachments;
        this.incoming = incoming;
        this.lastModifiedDate = lastModifiedDate;
        this.transaction = transaction;
        this.mediaItemList = mediaItemList;
        this.dateTime = dateTime;
    }


    /**
     * Gets the author value for this Message.
     * 
     * @return author
     */
    public org.mule.module.netsuite.api.internal.RecordRef getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this Message.
     * 
     * @param author
     */
    public void setAuthor(org.mule.module.netsuite.api.internal.RecordRef author) {
        this.author = author;
    }


    /**
     * Gets the recipient value for this Message.
     * 
     * @return recipient
     */
    public org.mule.module.netsuite.api.internal.RecordRef getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this Message.
     * 
     * @param recipient
     */
    public void setRecipient(org.mule.module.netsuite.api.internal.RecordRef recipient) {
        this.recipient = recipient;
    }


    /**
     * Gets the cc value for this Message.
     * 
     * @return cc
     */
    public java.lang.String getCc() {
        return cc;
    }


    /**
     * Sets the cc value for this Message.
     * 
     * @param cc
     */
    public void setCc(java.lang.String cc) {
        this.cc = cc;
    }


    /**
     * Gets the bcc value for this Message.
     * 
     * @return bcc
     */
    public java.lang.String getBcc() {
        return bcc;
    }


    /**
     * Sets the bcc value for this Message.
     * 
     * @param bcc
     */
    public void setBcc(java.lang.String bcc) {
        this.bcc = bcc;
    }


    /**
     * Gets the messageDate value for this Message.
     * 
     * @return messageDate
     */
    public java.util.Calendar getMessageDate() {
        return messageDate;
    }


    /**
     * Sets the messageDate value for this Message.
     * 
     * @param messageDate
     */
    public void setMessageDate(java.util.Calendar messageDate) {
        this.messageDate = messageDate;
    }


    /**
     * Gets the recordName value for this Message.
     * 
     * @return recordName
     */
    public java.lang.String getRecordName() {
        return recordName;
    }


    /**
     * Sets the recordName value for this Message.
     * 
     * @param recordName
     */
    public void setRecordName(java.lang.String recordName) {
        this.recordName = recordName;
    }


    /**
     * Gets the recordTypeName value for this Message.
     * 
     * @return recordTypeName
     */
    public java.lang.String getRecordTypeName() {
        return recordTypeName;
    }


    /**
     * Sets the recordTypeName value for this Message.
     * 
     * @param recordTypeName
     */
    public void setRecordTypeName(java.lang.String recordTypeName) {
        this.recordTypeName = recordTypeName;
    }


    /**
     * Gets the subject value for this Message.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this Message.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the message value for this Message.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this Message.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the emailed value for this Message.
     * 
     * @return emailed
     */
    public java.lang.Boolean getEmailed() {
        return emailed;
    }


    /**
     * Sets the emailed value for this Message.
     * 
     * @param emailed
     */
    public void setEmailed(java.lang.Boolean emailed) {
        this.emailed = emailed;
    }


    /**
     * Gets the activity value for this Message.
     * 
     * @return activity
     */
    public org.mule.module.netsuite.api.internal.RecordRef getActivity() {
        return activity;
    }


    /**
     * Sets the activity value for this Message.
     * 
     * @param activity
     */
    public void setActivity(org.mule.module.netsuite.api.internal.RecordRef activity) {
        this.activity = activity;
    }


    /**
     * Gets the compressAttachments value for this Message.
     * 
     * @return compressAttachments
     */
    public java.lang.Boolean getCompressAttachments() {
        return compressAttachments;
    }


    /**
     * Sets the compressAttachments value for this Message.
     * 
     * @param compressAttachments
     */
    public void setCompressAttachments(java.lang.Boolean compressAttachments) {
        this.compressAttachments = compressAttachments;
    }


    /**
     * Gets the incoming value for this Message.
     * 
     * @return incoming
     */
    public java.lang.Boolean getIncoming() {
        return incoming;
    }


    /**
     * Sets the incoming value for this Message.
     * 
     * @param incoming
     */
    public void setIncoming(java.lang.Boolean incoming) {
        this.incoming = incoming;
    }


    /**
     * Gets the lastModifiedDate value for this Message.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Message.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the transaction value for this Message.
     * 
     * @return transaction
     */
    public org.mule.module.netsuite.api.internal.RecordRef getTransaction() {
        return transaction;
    }


    /**
     * Sets the transaction value for this Message.
     * 
     * @param transaction
     */
    public void setTransaction(org.mule.module.netsuite.api.internal.RecordRef transaction) {
        this.transaction = transaction;
    }


    /**
     * Gets the mediaItemList value for this Message.
     * 
     * @return mediaItemList
     */
    public org.mule.module.netsuite.api.internal.MessageMediaItemList getMediaItemList() {
        return mediaItemList;
    }


    /**
     * Sets the mediaItemList value for this Message.
     * 
     * @param mediaItemList
     */
    public void setMediaItemList(org.mule.module.netsuite.api.internal.MessageMediaItemList mediaItemList) {
        this.mediaItemList = mediaItemList;
    }


    /**
     * Gets the dateTime value for this Message.
     * 
     * @return dateTime
     */
    public java.lang.String getDateTime() {
        return dateTime;
    }


    /**
     * Sets the dateTime value for this Message.
     * 
     * @param dateTime
     */
    public void setDateTime(java.lang.String dateTime) {
        this.dateTime = dateTime;
    }


    /**
     * Gets the internalId value for this Message.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Message.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Message.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Message.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Message)) return false;
        Message other = (Message) obj;
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
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              this.recipient.equals(other.getRecipient()))) &&
            ((this.cc==null && other.getCc()==null) || 
             (this.cc!=null &&
              this.cc.equals(other.getCc()))) &&
            ((this.bcc==null && other.getBcc()==null) || 
             (this.bcc!=null &&
              this.bcc.equals(other.getBcc()))) &&
            ((this.messageDate==null && other.getMessageDate()==null) || 
             (this.messageDate!=null &&
              this.messageDate.equals(other.getMessageDate()))) &&
            ((this.recordName==null && other.getRecordName()==null) || 
             (this.recordName!=null &&
              this.recordName.equals(other.getRecordName()))) &&
            ((this.recordTypeName==null && other.getRecordTypeName()==null) || 
             (this.recordTypeName!=null &&
              this.recordTypeName.equals(other.getRecordTypeName()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.emailed==null && other.getEmailed()==null) || 
             (this.emailed!=null &&
              this.emailed.equals(other.getEmailed()))) &&
            ((this.activity==null && other.getActivity()==null) || 
             (this.activity!=null &&
              this.activity.equals(other.getActivity()))) &&
            ((this.compressAttachments==null && other.getCompressAttachments()==null) || 
             (this.compressAttachments!=null &&
              this.compressAttachments.equals(other.getCompressAttachments()))) &&
            ((this.incoming==null && other.getIncoming()==null) || 
             (this.incoming!=null &&
              this.incoming.equals(other.getIncoming()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.transaction==null && other.getTransaction()==null) || 
             (this.transaction!=null &&
              this.transaction.equals(other.getTransaction()))) &&
            ((this.mediaItemList==null && other.getMediaItemList()==null) || 
             (this.mediaItemList!=null &&
              this.mediaItemList.equals(other.getMediaItemList()))) &&
            ((this.dateTime==null && other.getDateTime()==null) || 
             (this.dateTime!=null &&
              this.dateTime.equals(other.getDateTime()))) &&
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
        if (getAuthor() != null) {
            _hashCode += getAuthor().hashCode();
        }
        if (getRecipient() != null) {
            _hashCode += getRecipient().hashCode();
        }
        if (getCc() != null) {
            _hashCode += getCc().hashCode();
        }
        if (getBcc() != null) {
            _hashCode += getBcc().hashCode();
        }
        if (getMessageDate() != null) {
            _hashCode += getMessageDate().hashCode();
        }
        if (getRecordName() != null) {
            _hashCode += getRecordName().hashCode();
        }
        if (getRecordTypeName() != null) {
            _hashCode += getRecordTypeName().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getEmailed() != null) {
            _hashCode += getEmailed().hashCode();
        }
        if (getActivity() != null) {
            _hashCode += getActivity().hashCode();
        }
        if (getCompressAttachments() != null) {
            _hashCode += getCompressAttachments().hashCode();
        }
        if (getIncoming() != null) {
            _hashCode += getIncoming().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getTransaction() != null) {
            _hashCode += getTransaction().hashCode();
        }
        if (getMediaItemList() != null) {
            _hashCode += getMediaItemList().hashCode();
        }
        if (getDateTime() != null) {
            _hashCode += getDateTime().hashCode();
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
        new org.apache.axis.description.TypeDesc(Message.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "Message"));
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
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "author"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "cc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bcc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "bcc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "messageDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "recordName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "recordTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "emailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "activity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compressAttachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "compressAttachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incoming");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "incoming"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "transaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "mediaItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "MessageMediaItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "dateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
