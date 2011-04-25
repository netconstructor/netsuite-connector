/**
 * PhoneCallSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class PhoneCallSearch  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.PhoneCallSearchBasic basic;

    private org.mule.module.netsuite.api.internal.SupportCaseSearchBasic caseJoin;

    private org.mule.module.netsuite.api.internal.CustomerSearchBasic companyCustomerJoin;

    private org.mule.module.netsuite.api.internal.ContactSearchBasic contactJoin;

    private org.mule.module.netsuite.api.internal.EmployeeSearchBasic employeeJoin;

    private org.mule.module.netsuite.api.internal.FileSearchBasic fileJoin;

    private org.mule.module.netsuite.api.internal.OpportunitySearchBasic opportunityJoin;

    private org.mule.module.netsuite.api.internal.OriginatingLeadSearchBasic originatingLeadJoin;

    private org.mule.module.netsuite.api.internal.TransactionSearchBasic transactionJoin;

    private org.mule.module.netsuite.api.internal.EmployeeSearchBasic userJoin;

    private org.mule.module.netsuite.api.internal.NoteSearchBasic userNotesJoin;

    public PhoneCallSearch() {
    }

    public PhoneCallSearch(
           org.mule.module.netsuite.api.internal.PhoneCallSearchBasic basic,
           org.mule.module.netsuite.api.internal.SupportCaseSearchBasic caseJoin,
           org.mule.module.netsuite.api.internal.CustomerSearchBasic companyCustomerJoin,
           org.mule.module.netsuite.api.internal.ContactSearchBasic contactJoin,
           org.mule.module.netsuite.api.internal.EmployeeSearchBasic employeeJoin,
           org.mule.module.netsuite.api.internal.FileSearchBasic fileJoin,
           org.mule.module.netsuite.api.internal.OpportunitySearchBasic opportunityJoin,
           org.mule.module.netsuite.api.internal.OriginatingLeadSearchBasic originatingLeadJoin,
           org.mule.module.netsuite.api.internal.TransactionSearchBasic transactionJoin,
           org.mule.module.netsuite.api.internal.EmployeeSearchBasic userJoin,
           org.mule.module.netsuite.api.internal.NoteSearchBasic userNotesJoin) {
        this.basic = basic;
        this.caseJoin = caseJoin;
        this.companyCustomerJoin = companyCustomerJoin;
        this.contactJoin = contactJoin;
        this.employeeJoin = employeeJoin;
        this.fileJoin = fileJoin;
        this.opportunityJoin = opportunityJoin;
        this.originatingLeadJoin = originatingLeadJoin;
        this.transactionJoin = transactionJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
    }


    /**
     * Gets the basic value for this PhoneCallSearch.
     * 
     * @return basic
     */
    public org.mule.module.netsuite.api.internal.PhoneCallSearchBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this PhoneCallSearch.
     * 
     * @param basic
     */
    public void setBasic(org.mule.module.netsuite.api.internal.PhoneCallSearchBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the caseJoin value for this PhoneCallSearch.
     * 
     * @return caseJoin
     */
    public org.mule.module.netsuite.api.internal.SupportCaseSearchBasic getCaseJoin() {
        return caseJoin;
    }


    /**
     * Sets the caseJoin value for this PhoneCallSearch.
     * 
     * @param caseJoin
     */
    public void setCaseJoin(org.mule.module.netsuite.api.internal.SupportCaseSearchBasic caseJoin) {
        this.caseJoin = caseJoin;
    }


    /**
     * Gets the companyCustomerJoin value for this PhoneCallSearch.
     * 
     * @return companyCustomerJoin
     */
    public org.mule.module.netsuite.api.internal.CustomerSearchBasic getCompanyCustomerJoin() {
        return companyCustomerJoin;
    }


    /**
     * Sets the companyCustomerJoin value for this PhoneCallSearch.
     * 
     * @param companyCustomerJoin
     */
    public void setCompanyCustomerJoin(org.mule.module.netsuite.api.internal.CustomerSearchBasic companyCustomerJoin) {
        this.companyCustomerJoin = companyCustomerJoin;
    }


    /**
     * Gets the contactJoin value for this PhoneCallSearch.
     * 
     * @return contactJoin
     */
    public org.mule.module.netsuite.api.internal.ContactSearchBasic getContactJoin() {
        return contactJoin;
    }


    /**
     * Sets the contactJoin value for this PhoneCallSearch.
     * 
     * @param contactJoin
     */
    public void setContactJoin(org.mule.module.netsuite.api.internal.ContactSearchBasic contactJoin) {
        this.contactJoin = contactJoin;
    }


    /**
     * Gets the employeeJoin value for this PhoneCallSearch.
     * 
     * @return employeeJoin
     */
    public org.mule.module.netsuite.api.internal.EmployeeSearchBasic getEmployeeJoin() {
        return employeeJoin;
    }


    /**
     * Sets the employeeJoin value for this PhoneCallSearch.
     * 
     * @param employeeJoin
     */
    public void setEmployeeJoin(org.mule.module.netsuite.api.internal.EmployeeSearchBasic employeeJoin) {
        this.employeeJoin = employeeJoin;
    }


    /**
     * Gets the fileJoin value for this PhoneCallSearch.
     * 
     * @return fileJoin
     */
    public org.mule.module.netsuite.api.internal.FileSearchBasic getFileJoin() {
        return fileJoin;
    }


    /**
     * Sets the fileJoin value for this PhoneCallSearch.
     * 
     * @param fileJoin
     */
    public void setFileJoin(org.mule.module.netsuite.api.internal.FileSearchBasic fileJoin) {
        this.fileJoin = fileJoin;
    }


    /**
     * Gets the opportunityJoin value for this PhoneCallSearch.
     * 
     * @return opportunityJoin
     */
    public org.mule.module.netsuite.api.internal.OpportunitySearchBasic getOpportunityJoin() {
        return opportunityJoin;
    }


    /**
     * Sets the opportunityJoin value for this PhoneCallSearch.
     * 
     * @param opportunityJoin
     */
    public void setOpportunityJoin(org.mule.module.netsuite.api.internal.OpportunitySearchBasic opportunityJoin) {
        this.opportunityJoin = opportunityJoin;
    }


    /**
     * Gets the originatingLeadJoin value for this PhoneCallSearch.
     * 
     * @return originatingLeadJoin
     */
    public org.mule.module.netsuite.api.internal.OriginatingLeadSearchBasic getOriginatingLeadJoin() {
        return originatingLeadJoin;
    }


    /**
     * Sets the originatingLeadJoin value for this PhoneCallSearch.
     * 
     * @param originatingLeadJoin
     */
    public void setOriginatingLeadJoin(org.mule.module.netsuite.api.internal.OriginatingLeadSearchBasic originatingLeadJoin) {
        this.originatingLeadJoin = originatingLeadJoin;
    }


    /**
     * Gets the transactionJoin value for this PhoneCallSearch.
     * 
     * @return transactionJoin
     */
    public org.mule.module.netsuite.api.internal.TransactionSearchBasic getTransactionJoin() {
        return transactionJoin;
    }


    /**
     * Sets the transactionJoin value for this PhoneCallSearch.
     * 
     * @param transactionJoin
     */
    public void setTransactionJoin(org.mule.module.netsuite.api.internal.TransactionSearchBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }


    /**
     * Gets the userJoin value for this PhoneCallSearch.
     * 
     * @return userJoin
     */
    public org.mule.module.netsuite.api.internal.EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this PhoneCallSearch.
     * 
     * @param userJoin
     */
    public void setUserJoin(org.mule.module.netsuite.api.internal.EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the userNotesJoin value for this PhoneCallSearch.
     * 
     * @return userNotesJoin
     */
    public org.mule.module.netsuite.api.internal.NoteSearchBasic getUserNotesJoin() {
        return userNotesJoin;
    }


    /**
     * Sets the userNotesJoin value for this PhoneCallSearch.
     * 
     * @param userNotesJoin
     */
    public void setUserNotesJoin(org.mule.module.netsuite.api.internal.NoteSearchBasic userNotesJoin) {
        this.userNotesJoin = userNotesJoin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PhoneCallSearch)) return false;
        PhoneCallSearch other = (PhoneCallSearch) obj;
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
            ((this.caseJoin==null && other.getCaseJoin()==null) || 
             (this.caseJoin!=null &&
              this.caseJoin.equals(other.getCaseJoin()))) &&
            ((this.companyCustomerJoin==null && other.getCompanyCustomerJoin()==null) || 
             (this.companyCustomerJoin!=null &&
              this.companyCustomerJoin.equals(other.getCompanyCustomerJoin()))) &&
            ((this.contactJoin==null && other.getContactJoin()==null) || 
             (this.contactJoin!=null &&
              this.contactJoin.equals(other.getContactJoin()))) &&
            ((this.employeeJoin==null && other.getEmployeeJoin()==null) || 
             (this.employeeJoin!=null &&
              this.employeeJoin.equals(other.getEmployeeJoin()))) &&
            ((this.fileJoin==null && other.getFileJoin()==null) || 
             (this.fileJoin!=null &&
              this.fileJoin.equals(other.getFileJoin()))) &&
            ((this.opportunityJoin==null && other.getOpportunityJoin()==null) || 
             (this.opportunityJoin!=null &&
              this.opportunityJoin.equals(other.getOpportunityJoin()))) &&
            ((this.originatingLeadJoin==null && other.getOriginatingLeadJoin()==null) || 
             (this.originatingLeadJoin!=null &&
              this.originatingLeadJoin.equals(other.getOriginatingLeadJoin()))) &&
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
        if (getCaseJoin() != null) {
            _hashCode += getCaseJoin().hashCode();
        }
        if (getCompanyCustomerJoin() != null) {
            _hashCode += getCompanyCustomerJoin().hashCode();
        }
        if (getContactJoin() != null) {
            _hashCode += getContactJoin().hashCode();
        }
        if (getEmployeeJoin() != null) {
            _hashCode += getEmployeeJoin().hashCode();
        }
        if (getFileJoin() != null) {
            _hashCode += getFileJoin().hashCode();
        }
        if (getOpportunityJoin() != null) {
            _hashCode += getOpportunityJoin().hashCode();
        }
        if (getOriginatingLeadJoin() != null) {
            _hashCode += getOriginatingLeadJoin().hashCode();
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
        new org.apache.axis.description.TypeDesc(PhoneCallSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "PhoneCallSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "PhoneCallSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "caseJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "SupportCaseSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyCustomerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "companyCustomerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CustomerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "contactJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ContactSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "employeeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "fileJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "FileSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "opportunityJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "OpportunitySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originatingLeadJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "originatingLeadJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "OriginatingLeadSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "userNotesJoin"));
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
