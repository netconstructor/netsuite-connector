/**
 * MessageSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class MessageSearch  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.MessageSearchBasic basic;

    private org.mule.module.netsuite.api.internal.FileSearchBasic attachmentsJoin;

    private org.mule.module.netsuite.api.internal.EntitySearchBasic authorJoin;

    private org.mule.module.netsuite.api.internal.CampaignSearchBasic campaignJoin;

    private org.mule.module.netsuite.api.internal.SupportCaseSearchBasic caseJoin;

    private org.mule.module.netsuite.api.internal.ContactSearchBasic contactJoin;

    private org.mule.module.netsuite.api.internal.CustomerSearchBasic customerJoin;

    private org.mule.module.netsuite.api.internal.EmployeeSearchBasic employeeJoin;

    private org.mule.module.netsuite.api.internal.EntitySearchBasic entityJoin;

    private org.mule.module.netsuite.api.internal.OpportunitySearchBasic opportunityJoin;

    private org.mule.module.netsuite.api.internal.OriginatingLeadSearchBasic originatingLeadJoin;

    private org.mule.module.netsuite.api.internal.PartnerSearchBasic partnerJoin;

    private org.mule.module.netsuite.api.internal.EntitySearchBasic recipientJoin;

    private org.mule.module.netsuite.api.internal.TransactionSearchBasic transactionJoin;

    private org.mule.module.netsuite.api.internal.EmployeeSearchBasic userJoin;

    private org.mule.module.netsuite.api.internal.VendorSearchBasic vendorJoin;

    public MessageSearch() {
    }

    public MessageSearch(
           org.mule.module.netsuite.api.internal.MessageSearchBasic basic,
           org.mule.module.netsuite.api.internal.FileSearchBasic attachmentsJoin,
           org.mule.module.netsuite.api.internal.EntitySearchBasic authorJoin,
           org.mule.module.netsuite.api.internal.CampaignSearchBasic campaignJoin,
           org.mule.module.netsuite.api.internal.SupportCaseSearchBasic caseJoin,
           org.mule.module.netsuite.api.internal.ContactSearchBasic contactJoin,
           org.mule.module.netsuite.api.internal.CustomerSearchBasic customerJoin,
           org.mule.module.netsuite.api.internal.EmployeeSearchBasic employeeJoin,
           org.mule.module.netsuite.api.internal.EntitySearchBasic entityJoin,
           org.mule.module.netsuite.api.internal.OpportunitySearchBasic opportunityJoin,
           org.mule.module.netsuite.api.internal.OriginatingLeadSearchBasic originatingLeadJoin,
           org.mule.module.netsuite.api.internal.PartnerSearchBasic partnerJoin,
           org.mule.module.netsuite.api.internal.EntitySearchBasic recipientJoin,
           org.mule.module.netsuite.api.internal.TransactionSearchBasic transactionJoin,
           org.mule.module.netsuite.api.internal.EmployeeSearchBasic userJoin,
           org.mule.module.netsuite.api.internal.VendorSearchBasic vendorJoin) {
        this.basic = basic;
        this.attachmentsJoin = attachmentsJoin;
        this.authorJoin = authorJoin;
        this.campaignJoin = campaignJoin;
        this.caseJoin = caseJoin;
        this.contactJoin = contactJoin;
        this.customerJoin = customerJoin;
        this.employeeJoin = employeeJoin;
        this.entityJoin = entityJoin;
        this.opportunityJoin = opportunityJoin;
        this.originatingLeadJoin = originatingLeadJoin;
        this.partnerJoin = partnerJoin;
        this.recipientJoin = recipientJoin;
        this.transactionJoin = transactionJoin;
        this.userJoin = userJoin;
        this.vendorJoin = vendorJoin;
    }


    /**
     * Gets the basic value for this MessageSearch.
     * 
     * @return basic
     */
    public org.mule.module.netsuite.api.internal.MessageSearchBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this MessageSearch.
     * 
     * @param basic
     */
    public void setBasic(org.mule.module.netsuite.api.internal.MessageSearchBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the attachmentsJoin value for this MessageSearch.
     * 
     * @return attachmentsJoin
     */
    public org.mule.module.netsuite.api.internal.FileSearchBasic getAttachmentsJoin() {
        return attachmentsJoin;
    }


    /**
     * Sets the attachmentsJoin value for this MessageSearch.
     * 
     * @param attachmentsJoin
     */
    public void setAttachmentsJoin(org.mule.module.netsuite.api.internal.FileSearchBasic attachmentsJoin) {
        this.attachmentsJoin = attachmentsJoin;
    }


    /**
     * Gets the authorJoin value for this MessageSearch.
     * 
     * @return authorJoin
     */
    public org.mule.module.netsuite.api.internal.EntitySearchBasic getAuthorJoin() {
        return authorJoin;
    }


    /**
     * Sets the authorJoin value for this MessageSearch.
     * 
     * @param authorJoin
     */
    public void setAuthorJoin(org.mule.module.netsuite.api.internal.EntitySearchBasic authorJoin) {
        this.authorJoin = authorJoin;
    }


    /**
     * Gets the campaignJoin value for this MessageSearch.
     * 
     * @return campaignJoin
     */
    public org.mule.module.netsuite.api.internal.CampaignSearchBasic getCampaignJoin() {
        return campaignJoin;
    }


    /**
     * Sets the campaignJoin value for this MessageSearch.
     * 
     * @param campaignJoin
     */
    public void setCampaignJoin(org.mule.module.netsuite.api.internal.CampaignSearchBasic campaignJoin) {
        this.campaignJoin = campaignJoin;
    }


    /**
     * Gets the caseJoin value for this MessageSearch.
     * 
     * @return caseJoin
     */
    public org.mule.module.netsuite.api.internal.SupportCaseSearchBasic getCaseJoin() {
        return caseJoin;
    }


    /**
     * Sets the caseJoin value for this MessageSearch.
     * 
     * @param caseJoin
     */
    public void setCaseJoin(org.mule.module.netsuite.api.internal.SupportCaseSearchBasic caseJoin) {
        this.caseJoin = caseJoin;
    }


    /**
     * Gets the contactJoin value for this MessageSearch.
     * 
     * @return contactJoin
     */
    public org.mule.module.netsuite.api.internal.ContactSearchBasic getContactJoin() {
        return contactJoin;
    }


    /**
     * Sets the contactJoin value for this MessageSearch.
     * 
     * @param contactJoin
     */
    public void setContactJoin(org.mule.module.netsuite.api.internal.ContactSearchBasic contactJoin) {
        this.contactJoin = contactJoin;
    }


    /**
     * Gets the customerJoin value for this MessageSearch.
     * 
     * @return customerJoin
     */
    public org.mule.module.netsuite.api.internal.CustomerSearchBasic getCustomerJoin() {
        return customerJoin;
    }


    /**
     * Sets the customerJoin value for this MessageSearch.
     * 
     * @param customerJoin
     */
    public void setCustomerJoin(org.mule.module.netsuite.api.internal.CustomerSearchBasic customerJoin) {
        this.customerJoin = customerJoin;
    }


    /**
     * Gets the employeeJoin value for this MessageSearch.
     * 
     * @return employeeJoin
     */
    public org.mule.module.netsuite.api.internal.EmployeeSearchBasic getEmployeeJoin() {
        return employeeJoin;
    }


    /**
     * Sets the employeeJoin value for this MessageSearch.
     * 
     * @param employeeJoin
     */
    public void setEmployeeJoin(org.mule.module.netsuite.api.internal.EmployeeSearchBasic employeeJoin) {
        this.employeeJoin = employeeJoin;
    }


    /**
     * Gets the entityJoin value for this MessageSearch.
     * 
     * @return entityJoin
     */
    public org.mule.module.netsuite.api.internal.EntitySearchBasic getEntityJoin() {
        return entityJoin;
    }


    /**
     * Sets the entityJoin value for this MessageSearch.
     * 
     * @param entityJoin
     */
    public void setEntityJoin(org.mule.module.netsuite.api.internal.EntitySearchBasic entityJoin) {
        this.entityJoin = entityJoin;
    }


    /**
     * Gets the opportunityJoin value for this MessageSearch.
     * 
     * @return opportunityJoin
     */
    public org.mule.module.netsuite.api.internal.OpportunitySearchBasic getOpportunityJoin() {
        return opportunityJoin;
    }


    /**
     * Sets the opportunityJoin value for this MessageSearch.
     * 
     * @param opportunityJoin
     */
    public void setOpportunityJoin(org.mule.module.netsuite.api.internal.OpportunitySearchBasic opportunityJoin) {
        this.opportunityJoin = opportunityJoin;
    }


    /**
     * Gets the originatingLeadJoin value for this MessageSearch.
     * 
     * @return originatingLeadJoin
     */
    public org.mule.module.netsuite.api.internal.OriginatingLeadSearchBasic getOriginatingLeadJoin() {
        return originatingLeadJoin;
    }


    /**
     * Sets the originatingLeadJoin value for this MessageSearch.
     * 
     * @param originatingLeadJoin
     */
    public void setOriginatingLeadJoin(org.mule.module.netsuite.api.internal.OriginatingLeadSearchBasic originatingLeadJoin) {
        this.originatingLeadJoin = originatingLeadJoin;
    }


    /**
     * Gets the partnerJoin value for this MessageSearch.
     * 
     * @return partnerJoin
     */
    public org.mule.module.netsuite.api.internal.PartnerSearchBasic getPartnerJoin() {
        return partnerJoin;
    }


    /**
     * Sets the partnerJoin value for this MessageSearch.
     * 
     * @param partnerJoin
     */
    public void setPartnerJoin(org.mule.module.netsuite.api.internal.PartnerSearchBasic partnerJoin) {
        this.partnerJoin = partnerJoin;
    }


    /**
     * Gets the recipientJoin value for this MessageSearch.
     * 
     * @return recipientJoin
     */
    public org.mule.module.netsuite.api.internal.EntitySearchBasic getRecipientJoin() {
        return recipientJoin;
    }


    /**
     * Sets the recipientJoin value for this MessageSearch.
     * 
     * @param recipientJoin
     */
    public void setRecipientJoin(org.mule.module.netsuite.api.internal.EntitySearchBasic recipientJoin) {
        this.recipientJoin = recipientJoin;
    }


    /**
     * Gets the transactionJoin value for this MessageSearch.
     * 
     * @return transactionJoin
     */
    public org.mule.module.netsuite.api.internal.TransactionSearchBasic getTransactionJoin() {
        return transactionJoin;
    }


    /**
     * Sets the transactionJoin value for this MessageSearch.
     * 
     * @param transactionJoin
     */
    public void setTransactionJoin(org.mule.module.netsuite.api.internal.TransactionSearchBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }


    /**
     * Gets the userJoin value for this MessageSearch.
     * 
     * @return userJoin
     */
    public org.mule.module.netsuite.api.internal.EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this MessageSearch.
     * 
     * @param userJoin
     */
    public void setUserJoin(org.mule.module.netsuite.api.internal.EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the vendorJoin value for this MessageSearch.
     * 
     * @return vendorJoin
     */
    public org.mule.module.netsuite.api.internal.VendorSearchBasic getVendorJoin() {
        return vendorJoin;
    }


    /**
     * Sets the vendorJoin value for this MessageSearch.
     * 
     * @param vendorJoin
     */
    public void setVendorJoin(org.mule.module.netsuite.api.internal.VendorSearchBasic vendorJoin) {
        this.vendorJoin = vendorJoin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MessageSearch)) return false;
        MessageSearch other = (MessageSearch) obj;
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
            ((this.attachmentsJoin==null && other.getAttachmentsJoin()==null) || 
             (this.attachmentsJoin!=null &&
              this.attachmentsJoin.equals(other.getAttachmentsJoin()))) &&
            ((this.authorJoin==null && other.getAuthorJoin()==null) || 
             (this.authorJoin!=null &&
              this.authorJoin.equals(other.getAuthorJoin()))) &&
            ((this.campaignJoin==null && other.getCampaignJoin()==null) || 
             (this.campaignJoin!=null &&
              this.campaignJoin.equals(other.getCampaignJoin()))) &&
            ((this.caseJoin==null && other.getCaseJoin()==null) || 
             (this.caseJoin!=null &&
              this.caseJoin.equals(other.getCaseJoin()))) &&
            ((this.contactJoin==null && other.getContactJoin()==null) || 
             (this.contactJoin!=null &&
              this.contactJoin.equals(other.getContactJoin()))) &&
            ((this.customerJoin==null && other.getCustomerJoin()==null) || 
             (this.customerJoin!=null &&
              this.customerJoin.equals(other.getCustomerJoin()))) &&
            ((this.employeeJoin==null && other.getEmployeeJoin()==null) || 
             (this.employeeJoin!=null &&
              this.employeeJoin.equals(other.getEmployeeJoin()))) &&
            ((this.entityJoin==null && other.getEntityJoin()==null) || 
             (this.entityJoin!=null &&
              this.entityJoin.equals(other.getEntityJoin()))) &&
            ((this.opportunityJoin==null && other.getOpportunityJoin()==null) || 
             (this.opportunityJoin!=null &&
              this.opportunityJoin.equals(other.getOpportunityJoin()))) &&
            ((this.originatingLeadJoin==null && other.getOriginatingLeadJoin()==null) || 
             (this.originatingLeadJoin!=null &&
              this.originatingLeadJoin.equals(other.getOriginatingLeadJoin()))) &&
            ((this.partnerJoin==null && other.getPartnerJoin()==null) || 
             (this.partnerJoin!=null &&
              this.partnerJoin.equals(other.getPartnerJoin()))) &&
            ((this.recipientJoin==null && other.getRecipientJoin()==null) || 
             (this.recipientJoin!=null &&
              this.recipientJoin.equals(other.getRecipientJoin()))) &&
            ((this.transactionJoin==null && other.getTransactionJoin()==null) || 
             (this.transactionJoin!=null &&
              this.transactionJoin.equals(other.getTransactionJoin()))) &&
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin()))) &&
            ((this.vendorJoin==null && other.getVendorJoin()==null) || 
             (this.vendorJoin!=null &&
              this.vendorJoin.equals(other.getVendorJoin())));
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
        if (getAttachmentsJoin() != null) {
            _hashCode += getAttachmentsJoin().hashCode();
        }
        if (getAuthorJoin() != null) {
            _hashCode += getAuthorJoin().hashCode();
        }
        if (getCampaignJoin() != null) {
            _hashCode += getCampaignJoin().hashCode();
        }
        if (getCaseJoin() != null) {
            _hashCode += getCaseJoin().hashCode();
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
        if (getEntityJoin() != null) {
            _hashCode += getEntityJoin().hashCode();
        }
        if (getOpportunityJoin() != null) {
            _hashCode += getOpportunityJoin().hashCode();
        }
        if (getOriginatingLeadJoin() != null) {
            _hashCode += getOriginatingLeadJoin().hashCode();
        }
        if (getPartnerJoin() != null) {
            _hashCode += getPartnerJoin().hashCode();
        }
        if (getRecipientJoin() != null) {
            _hashCode += getRecipientJoin().hashCode();
        }
        if (getTransactionJoin() != null) {
            _hashCode += getTransactionJoin().hashCode();
        }
        if (getUserJoin() != null) {
            _hashCode += getUserJoin().hashCode();
        }
        if (getVendorJoin() != null) {
            _hashCode += getVendorJoin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MessageSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "MessageSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "MessageSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentsJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "attachmentsJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "FileSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "authorJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EntitySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "campaignJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CampaignSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "caseJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "SupportCaseSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "contactJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ContactSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "customerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CustomerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "employeeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "entityJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EntitySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "opportunityJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "OpportunitySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originatingLeadJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "originatingLeadJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "OriginatingLeadSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "partnerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "PartnerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "recipientJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EntitySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:communication_2010_2.general.webservices.netsuite.com", "vendorJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "VendorSearchBasic"));
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
