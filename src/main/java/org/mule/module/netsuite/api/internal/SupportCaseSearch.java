/**
 * SupportCaseSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SupportCaseSearch  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SupportCaseSearchBasic basic;

    private org.mule.module.netsuite.api.internal.ContactSearchBasic contactJoin;

    private org.mule.module.netsuite.api.internal.CustomerSearchBasic customerJoin;

    private org.mule.module.netsuite.api.internal.EmployeeSearchBasic employeeJoin;

    private org.mule.module.netsuite.api.internal.FileSearchBasic fileJoin;

    private org.mule.module.netsuite.api.internal.IssueSearchBasic issueJoin;

    private org.mule.module.netsuite.api.internal.ItemSearchBasic itemJoin;

    private org.mule.module.netsuite.api.internal.MessageSearchBasic messagesJoin;

    private org.mule.module.netsuite.api.internal.TimeBillSearchBasic timeJoin;

    private org.mule.module.netsuite.api.internal.EmployeeSearchBasic userJoin;

    private org.mule.module.netsuite.api.internal.NoteSearchBasic userNotesJoin;

    public SupportCaseSearch() {
    }

    public SupportCaseSearch(
           org.mule.module.netsuite.api.internal.SupportCaseSearchBasic basic,
           org.mule.module.netsuite.api.internal.ContactSearchBasic contactJoin,
           org.mule.module.netsuite.api.internal.CustomerSearchBasic customerJoin,
           org.mule.module.netsuite.api.internal.EmployeeSearchBasic employeeJoin,
           org.mule.module.netsuite.api.internal.FileSearchBasic fileJoin,
           org.mule.module.netsuite.api.internal.IssueSearchBasic issueJoin,
           org.mule.module.netsuite.api.internal.ItemSearchBasic itemJoin,
           org.mule.module.netsuite.api.internal.MessageSearchBasic messagesJoin,
           org.mule.module.netsuite.api.internal.TimeBillSearchBasic timeJoin,
           org.mule.module.netsuite.api.internal.EmployeeSearchBasic userJoin,
           org.mule.module.netsuite.api.internal.NoteSearchBasic userNotesJoin) {
        this.basic = basic;
        this.contactJoin = contactJoin;
        this.customerJoin = customerJoin;
        this.employeeJoin = employeeJoin;
        this.fileJoin = fileJoin;
        this.issueJoin = issueJoin;
        this.itemJoin = itemJoin;
        this.messagesJoin = messagesJoin;
        this.timeJoin = timeJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
    }


    /**
     * Gets the basic value for this SupportCaseSearch.
     * 
     * @return basic
     */
    public org.mule.module.netsuite.api.internal.SupportCaseSearchBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this SupportCaseSearch.
     * 
     * @param basic
     */
    public void setBasic(org.mule.module.netsuite.api.internal.SupportCaseSearchBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the contactJoin value for this SupportCaseSearch.
     * 
     * @return contactJoin
     */
    public org.mule.module.netsuite.api.internal.ContactSearchBasic getContactJoin() {
        return contactJoin;
    }


    /**
     * Sets the contactJoin value for this SupportCaseSearch.
     * 
     * @param contactJoin
     */
    public void setContactJoin(org.mule.module.netsuite.api.internal.ContactSearchBasic contactJoin) {
        this.contactJoin = contactJoin;
    }


    /**
     * Gets the customerJoin value for this SupportCaseSearch.
     * 
     * @return customerJoin
     */
    public org.mule.module.netsuite.api.internal.CustomerSearchBasic getCustomerJoin() {
        return customerJoin;
    }


    /**
     * Sets the customerJoin value for this SupportCaseSearch.
     * 
     * @param customerJoin
     */
    public void setCustomerJoin(org.mule.module.netsuite.api.internal.CustomerSearchBasic customerJoin) {
        this.customerJoin = customerJoin;
    }


    /**
     * Gets the employeeJoin value for this SupportCaseSearch.
     * 
     * @return employeeJoin
     */
    public org.mule.module.netsuite.api.internal.EmployeeSearchBasic getEmployeeJoin() {
        return employeeJoin;
    }


    /**
     * Sets the employeeJoin value for this SupportCaseSearch.
     * 
     * @param employeeJoin
     */
    public void setEmployeeJoin(org.mule.module.netsuite.api.internal.EmployeeSearchBasic employeeJoin) {
        this.employeeJoin = employeeJoin;
    }


    /**
     * Gets the fileJoin value for this SupportCaseSearch.
     * 
     * @return fileJoin
     */
    public org.mule.module.netsuite.api.internal.FileSearchBasic getFileJoin() {
        return fileJoin;
    }


    /**
     * Sets the fileJoin value for this SupportCaseSearch.
     * 
     * @param fileJoin
     */
    public void setFileJoin(org.mule.module.netsuite.api.internal.FileSearchBasic fileJoin) {
        this.fileJoin = fileJoin;
    }


    /**
     * Gets the issueJoin value for this SupportCaseSearch.
     * 
     * @return issueJoin
     */
    public org.mule.module.netsuite.api.internal.IssueSearchBasic getIssueJoin() {
        return issueJoin;
    }


    /**
     * Sets the issueJoin value for this SupportCaseSearch.
     * 
     * @param issueJoin
     */
    public void setIssueJoin(org.mule.module.netsuite.api.internal.IssueSearchBasic issueJoin) {
        this.issueJoin = issueJoin;
    }


    /**
     * Gets the itemJoin value for this SupportCaseSearch.
     * 
     * @return itemJoin
     */
    public org.mule.module.netsuite.api.internal.ItemSearchBasic getItemJoin() {
        return itemJoin;
    }


    /**
     * Sets the itemJoin value for this SupportCaseSearch.
     * 
     * @param itemJoin
     */
    public void setItemJoin(org.mule.module.netsuite.api.internal.ItemSearchBasic itemJoin) {
        this.itemJoin = itemJoin;
    }


    /**
     * Gets the messagesJoin value for this SupportCaseSearch.
     * 
     * @return messagesJoin
     */
    public org.mule.module.netsuite.api.internal.MessageSearchBasic getMessagesJoin() {
        return messagesJoin;
    }


    /**
     * Sets the messagesJoin value for this SupportCaseSearch.
     * 
     * @param messagesJoin
     */
    public void setMessagesJoin(org.mule.module.netsuite.api.internal.MessageSearchBasic messagesJoin) {
        this.messagesJoin = messagesJoin;
    }


    /**
     * Gets the timeJoin value for this SupportCaseSearch.
     * 
     * @return timeJoin
     */
    public org.mule.module.netsuite.api.internal.TimeBillSearchBasic getTimeJoin() {
        return timeJoin;
    }


    /**
     * Sets the timeJoin value for this SupportCaseSearch.
     * 
     * @param timeJoin
     */
    public void setTimeJoin(org.mule.module.netsuite.api.internal.TimeBillSearchBasic timeJoin) {
        this.timeJoin = timeJoin;
    }


    /**
     * Gets the userJoin value for this SupportCaseSearch.
     * 
     * @return userJoin
     */
    public org.mule.module.netsuite.api.internal.EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this SupportCaseSearch.
     * 
     * @param userJoin
     */
    public void setUserJoin(org.mule.module.netsuite.api.internal.EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the userNotesJoin value for this SupportCaseSearch.
     * 
     * @return userNotesJoin
     */
    public org.mule.module.netsuite.api.internal.NoteSearchBasic getUserNotesJoin() {
        return userNotesJoin;
    }


    /**
     * Sets the userNotesJoin value for this SupportCaseSearch.
     * 
     * @param userNotesJoin
     */
    public void setUserNotesJoin(org.mule.module.netsuite.api.internal.NoteSearchBasic userNotesJoin) {
        this.userNotesJoin = userNotesJoin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupportCaseSearch)) return false;
        SupportCaseSearch other = (SupportCaseSearch) obj;
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
            ((this.contactJoin==null && other.getContactJoin()==null) || 
             (this.contactJoin!=null &&
              this.contactJoin.equals(other.getContactJoin()))) &&
            ((this.customerJoin==null && other.getCustomerJoin()==null) || 
             (this.customerJoin!=null &&
              this.customerJoin.equals(other.getCustomerJoin()))) &&
            ((this.employeeJoin==null && other.getEmployeeJoin()==null) || 
             (this.employeeJoin!=null &&
              this.employeeJoin.equals(other.getEmployeeJoin()))) &&
            ((this.fileJoin==null && other.getFileJoin()==null) || 
             (this.fileJoin!=null &&
              this.fileJoin.equals(other.getFileJoin()))) &&
            ((this.issueJoin==null && other.getIssueJoin()==null) || 
             (this.issueJoin!=null &&
              this.issueJoin.equals(other.getIssueJoin()))) &&
            ((this.itemJoin==null && other.getItemJoin()==null) || 
             (this.itemJoin!=null &&
              this.itemJoin.equals(other.getItemJoin()))) &&
            ((this.messagesJoin==null && other.getMessagesJoin()==null) || 
             (this.messagesJoin!=null &&
              this.messagesJoin.equals(other.getMessagesJoin()))) &&
            ((this.timeJoin==null && other.getTimeJoin()==null) || 
             (this.timeJoin!=null &&
              this.timeJoin.equals(other.getTimeJoin()))) &&
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
        if (getContactJoin() != null) {
            _hashCode += getContactJoin().hashCode();
        }
        if (getCustomerJoin() != null) {
            _hashCode += getCustomerJoin().hashCode();
        }
        if (getEmployeeJoin() != null) {
            _hashCode += getEmployeeJoin().hashCode();
        }
        if (getFileJoin() != null) {
            _hashCode += getFileJoin().hashCode();
        }
        if (getIssueJoin() != null) {
            _hashCode += getIssueJoin().hashCode();
        }
        if (getItemJoin() != null) {
            _hashCode += getItemJoin().hashCode();
        }
        if (getMessagesJoin() != null) {
            _hashCode += getMessagesJoin().hashCode();
        }
        if (getTimeJoin() != null) {
            _hashCode += getTimeJoin().hashCode();
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
        new org.apache.axis.description.TypeDesc(SupportCaseSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SupportCaseSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "SupportCaseSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "contactJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ContactSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "customerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CustomerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "employeeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "fileJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "FileSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "issueJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "IssueSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "itemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ItemSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messagesJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "messagesJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "MessageSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "timeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TimeBillSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "NoteSearchBasic"));
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
