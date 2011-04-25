/**
 * EmployeeSearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class EmployeeSearchRow  extends org.mule.module.netsuite.api.internal.SearchRow  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic basic;

    private org.mule.module.netsuite.api.internal.CampaignSearchRowBasic campaignResponseJoin;

    private org.mule.module.netsuite.api.internal.TimeBillSearchRowBasic employeeJoin;

    private org.mule.module.netsuite.api.internal.FileSearchRowBasic fileJoin;

    private org.mule.module.netsuite.api.internal.MessageSearchRowBasic messagesJoin;

    private org.mule.module.netsuite.api.internal.MessageSearchRowBasic messagesFromJoin;

    private org.mule.module.netsuite.api.internal.MessageSearchRowBasic messagesToJoin;

    private org.mule.module.netsuite.api.internal.TransactionSearchRowBasic transactionJoin;

    private org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic userJoin;

    private org.mule.module.netsuite.api.internal.NoteSearchRowBasic userNotesJoin;

    public EmployeeSearchRow() {
    }

    public EmployeeSearchRow(
           org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic basic,
           org.mule.module.netsuite.api.internal.CampaignSearchRowBasic campaignResponseJoin,
           org.mule.module.netsuite.api.internal.TimeBillSearchRowBasic employeeJoin,
           org.mule.module.netsuite.api.internal.FileSearchRowBasic fileJoin,
           org.mule.module.netsuite.api.internal.MessageSearchRowBasic messagesJoin,
           org.mule.module.netsuite.api.internal.MessageSearchRowBasic messagesFromJoin,
           org.mule.module.netsuite.api.internal.MessageSearchRowBasic messagesToJoin,
           org.mule.module.netsuite.api.internal.TransactionSearchRowBasic transactionJoin,
           org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic userJoin,
           org.mule.module.netsuite.api.internal.NoteSearchRowBasic userNotesJoin) {
        this.basic = basic;
        this.campaignResponseJoin = campaignResponseJoin;
        this.employeeJoin = employeeJoin;
        this.fileJoin = fileJoin;
        this.messagesJoin = messagesJoin;
        this.messagesFromJoin = messagesFromJoin;
        this.messagesToJoin = messagesToJoin;
        this.transactionJoin = transactionJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
    }


    /**
     * Gets the basic value for this EmployeeSearchRow.
     * 
     * @return basic
     */
    public org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this EmployeeSearchRow.
     * 
     * @param basic
     */
    public void setBasic(org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the campaignResponseJoin value for this EmployeeSearchRow.
     * 
     * @return campaignResponseJoin
     */
    public org.mule.module.netsuite.api.internal.CampaignSearchRowBasic getCampaignResponseJoin() {
        return campaignResponseJoin;
    }


    /**
     * Sets the campaignResponseJoin value for this EmployeeSearchRow.
     * 
     * @param campaignResponseJoin
     */
    public void setCampaignResponseJoin(org.mule.module.netsuite.api.internal.CampaignSearchRowBasic campaignResponseJoin) {
        this.campaignResponseJoin = campaignResponseJoin;
    }


    /**
     * Gets the employeeJoin value for this EmployeeSearchRow.
     * 
     * @return employeeJoin
     */
    public org.mule.module.netsuite.api.internal.TimeBillSearchRowBasic getEmployeeJoin() {
        return employeeJoin;
    }


    /**
     * Sets the employeeJoin value for this EmployeeSearchRow.
     * 
     * @param employeeJoin
     */
    public void setEmployeeJoin(org.mule.module.netsuite.api.internal.TimeBillSearchRowBasic employeeJoin) {
        this.employeeJoin = employeeJoin;
    }


    /**
     * Gets the fileJoin value for this EmployeeSearchRow.
     * 
     * @return fileJoin
     */
    public org.mule.module.netsuite.api.internal.FileSearchRowBasic getFileJoin() {
        return fileJoin;
    }


    /**
     * Sets the fileJoin value for this EmployeeSearchRow.
     * 
     * @param fileJoin
     */
    public void setFileJoin(org.mule.module.netsuite.api.internal.FileSearchRowBasic fileJoin) {
        this.fileJoin = fileJoin;
    }


    /**
     * Gets the messagesJoin value for this EmployeeSearchRow.
     * 
     * @return messagesJoin
     */
    public org.mule.module.netsuite.api.internal.MessageSearchRowBasic getMessagesJoin() {
        return messagesJoin;
    }


    /**
     * Sets the messagesJoin value for this EmployeeSearchRow.
     * 
     * @param messagesJoin
     */
    public void setMessagesJoin(org.mule.module.netsuite.api.internal.MessageSearchRowBasic messagesJoin) {
        this.messagesJoin = messagesJoin;
    }


    /**
     * Gets the messagesFromJoin value for this EmployeeSearchRow.
     * 
     * @return messagesFromJoin
     */
    public org.mule.module.netsuite.api.internal.MessageSearchRowBasic getMessagesFromJoin() {
        return messagesFromJoin;
    }


    /**
     * Sets the messagesFromJoin value for this EmployeeSearchRow.
     * 
     * @param messagesFromJoin
     */
    public void setMessagesFromJoin(org.mule.module.netsuite.api.internal.MessageSearchRowBasic messagesFromJoin) {
        this.messagesFromJoin = messagesFromJoin;
    }


    /**
     * Gets the messagesToJoin value for this EmployeeSearchRow.
     * 
     * @return messagesToJoin
     */
    public org.mule.module.netsuite.api.internal.MessageSearchRowBasic getMessagesToJoin() {
        return messagesToJoin;
    }


    /**
     * Sets the messagesToJoin value for this EmployeeSearchRow.
     * 
     * @param messagesToJoin
     */
    public void setMessagesToJoin(org.mule.module.netsuite.api.internal.MessageSearchRowBasic messagesToJoin) {
        this.messagesToJoin = messagesToJoin;
    }


    /**
     * Gets the transactionJoin value for this EmployeeSearchRow.
     * 
     * @return transactionJoin
     */
    public org.mule.module.netsuite.api.internal.TransactionSearchRowBasic getTransactionJoin() {
        return transactionJoin;
    }


    /**
     * Sets the transactionJoin value for this EmployeeSearchRow.
     * 
     * @param transactionJoin
     */
    public void setTransactionJoin(org.mule.module.netsuite.api.internal.TransactionSearchRowBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }


    /**
     * Gets the userJoin value for this EmployeeSearchRow.
     * 
     * @return userJoin
     */
    public org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this EmployeeSearchRow.
     * 
     * @param userJoin
     */
    public void setUserJoin(org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the userNotesJoin value for this EmployeeSearchRow.
     * 
     * @return userNotesJoin
     */
    public org.mule.module.netsuite.api.internal.NoteSearchRowBasic getUserNotesJoin() {
        return userNotesJoin;
    }


    /**
     * Sets the userNotesJoin value for this EmployeeSearchRow.
     * 
     * @param userNotesJoin
     */
    public void setUserNotesJoin(org.mule.module.netsuite.api.internal.NoteSearchRowBasic userNotesJoin) {
        this.userNotesJoin = userNotesJoin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeSearchRow)) return false;
        EmployeeSearchRow other = (EmployeeSearchRow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.basic==null && other.getBasic()==null) || 
             (this.basic!=null &&
              this.basic.equals(other.getBasic()))) &&
            ((this.campaignResponseJoin==null && other.getCampaignResponseJoin()==null) || 
             (this.campaignResponseJoin!=null &&
              this.campaignResponseJoin.equals(other.getCampaignResponseJoin()))) &&
            ((this.employeeJoin==null && other.getEmployeeJoin()==null) || 
             (this.employeeJoin!=null &&
              this.employeeJoin.equals(other.getEmployeeJoin()))) &&
            ((this.fileJoin==null && other.getFileJoin()==null) || 
             (this.fileJoin!=null &&
              this.fileJoin.equals(other.getFileJoin()))) &&
            ((this.messagesJoin==null && other.getMessagesJoin()==null) || 
             (this.messagesJoin!=null &&
              this.messagesJoin.equals(other.getMessagesJoin()))) &&
            ((this.messagesFromJoin==null && other.getMessagesFromJoin()==null) || 
             (this.messagesFromJoin!=null &&
              this.messagesFromJoin.equals(other.getMessagesFromJoin()))) &&
            ((this.messagesToJoin==null && other.getMessagesToJoin()==null) || 
             (this.messagesToJoin!=null &&
              this.messagesToJoin.equals(other.getMessagesToJoin()))) &&
            ((this.transactionJoin==null && other.getTransactionJoin()==null) || 
             (this.transactionJoin!=null &&
              this.transactionJoin.equals(other.getTransactionJoin()))) &&
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin()))) &&
            ((this.userNotesJoin==null && other.getUserNotesJoin()==null) || 
             (this.userNotesJoin!=null &&
              this.userNotesJoin.equals(other.getUserNotesJoin())));
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
        if (getBasic() != null) {
            _hashCode += getBasic().hashCode();
        }
        if (getCampaignResponseJoin() != null) {
            _hashCode += getCampaignResponseJoin().hashCode();
        }
        if (getEmployeeJoin() != null) {
            _hashCode += getEmployeeJoin().hashCode();
        }
        if (getFileJoin() != null) {
            _hashCode += getFileJoin().hashCode();
        }
        if (getMessagesJoin() != null) {
            _hashCode += getMessagesJoin().hashCode();
        }
        if (getMessagesFromJoin() != null) {
            _hashCode += getMessagesFromJoin().hashCode();
        }
        if (getMessagesToJoin() != null) {
            _hashCode += getMessagesToJoin().hashCode();
        }
        if (getTransactionJoin() != null) {
            _hashCode += getTransactionJoin().hashCode();
        }
        if (getUserJoin() != null) {
            _hashCode += getUserJoin().hashCode();
        }
        if (getUserNotesJoin() != null) {
            _hashCode += getUserNotesJoin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmployeeSearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "EmployeeSearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignResponseJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "campaignResponseJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CampaignSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "employeeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TimeBillSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "fileJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "FileSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messagesJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "messagesJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "MessageSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messagesFromJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "messagesFromJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "MessageSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messagesToJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "messagesToJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "MessageSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "NoteSearchRowBasic"));
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
