/**
 * CampaignDirectMail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CampaignDirectMail  implements java.io.Serializable {
    private java.lang.String internalId;

    private org.mule.module.netsuite.api.internal.RecordRef campaignGroup;

    private org.mule.module.netsuite.api.internal.RecordRef template;

    private java.lang.String description;

    private org.mule.module.netsuite.api.internal.RecordRef subscription;

    private org.mule.module.netsuite.api.internal.RecordRef channel;

    private java.lang.Double cost;

    private org.mule.module.netsuite.api.internal.CampaignCampaignDirectMailStatus status;

    private java.util.Calendar dateScheduled;

    private org.mule.module.netsuite.api.internal.RecordRef promoCode;

    private org.mule.module.netsuite.api.internal.CustomFieldList customFieldList;

    public CampaignDirectMail() {
    }

    public CampaignDirectMail(
           java.lang.String internalId,
           org.mule.module.netsuite.api.internal.RecordRef campaignGroup,
           org.mule.module.netsuite.api.internal.RecordRef template,
           java.lang.String description,
           org.mule.module.netsuite.api.internal.RecordRef subscription,
           org.mule.module.netsuite.api.internal.RecordRef channel,
           java.lang.Double cost,
           org.mule.module.netsuite.api.internal.CampaignCampaignDirectMailStatus status,
           java.util.Calendar dateScheduled,
           org.mule.module.netsuite.api.internal.RecordRef promoCode,
           org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
           this.internalId = internalId;
           this.campaignGroup = campaignGroup;
           this.template = template;
           this.description = description;
           this.subscription = subscription;
           this.channel = channel;
           this.cost = cost;
           this.status = status;
           this.dateScheduled = dateScheduled;
           this.promoCode = promoCode;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this CampaignDirectMail.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CampaignDirectMail.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the campaignGroup value for this CampaignDirectMail.
     * 
     * @return campaignGroup
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCampaignGroup() {
        return campaignGroup;
    }


    /**
     * Sets the campaignGroup value for this CampaignDirectMail.
     * 
     * @param campaignGroup
     */
    public void setCampaignGroup(org.mule.module.netsuite.api.internal.RecordRef campaignGroup) {
        this.campaignGroup = campaignGroup;
    }


    /**
     * Gets the template value for this CampaignDirectMail.
     * 
     * @return template
     */
    public org.mule.module.netsuite.api.internal.RecordRef getTemplate() {
        return template;
    }


    /**
     * Sets the template value for this CampaignDirectMail.
     * 
     * @param template
     */
    public void setTemplate(org.mule.module.netsuite.api.internal.RecordRef template) {
        this.template = template;
    }


    /**
     * Gets the description value for this CampaignDirectMail.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CampaignDirectMail.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the subscription value for this CampaignDirectMail.
     * 
     * @return subscription
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSubscription() {
        return subscription;
    }


    /**
     * Sets the subscription value for this CampaignDirectMail.
     * 
     * @param subscription
     */
    public void setSubscription(org.mule.module.netsuite.api.internal.RecordRef subscription) {
        this.subscription = subscription;
    }


    /**
     * Gets the channel value for this CampaignDirectMail.
     * 
     * @return channel
     */
    public org.mule.module.netsuite.api.internal.RecordRef getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this CampaignDirectMail.
     * 
     * @param channel
     */
    public void setChannel(org.mule.module.netsuite.api.internal.RecordRef channel) {
        this.channel = channel;
    }


    /**
     * Gets the cost value for this CampaignDirectMail.
     * 
     * @return cost
     */
    public java.lang.Double getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this CampaignDirectMail.
     * 
     * @param cost
     */
    public void setCost(java.lang.Double cost) {
        this.cost = cost;
    }


    /**
     * Gets the status value for this CampaignDirectMail.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.CampaignCampaignDirectMailStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CampaignDirectMail.
     * 
     * @param status
     */
    public void setStatus(org.mule.module.netsuite.api.internal.CampaignCampaignDirectMailStatus status) {
        this.status = status;
    }


    /**
     * Gets the dateScheduled value for this CampaignDirectMail.
     * 
     * @return dateScheduled
     */
    public java.util.Calendar getDateScheduled() {
        return dateScheduled;
    }


    /**
     * Sets the dateScheduled value for this CampaignDirectMail.
     * 
     * @param dateScheduled
     */
    public void setDateScheduled(java.util.Calendar dateScheduled) {
        this.dateScheduled = dateScheduled;
    }


    /**
     * Gets the promoCode value for this CampaignDirectMail.
     * 
     * @return promoCode
     */
    public org.mule.module.netsuite.api.internal.RecordRef getPromoCode() {
        return promoCode;
    }


    /**
     * Sets the promoCode value for this CampaignDirectMail.
     * 
     * @param promoCode
     */
    public void setPromoCode(org.mule.module.netsuite.api.internal.RecordRef promoCode) {
        this.promoCode = promoCode;
    }


    /**
     * Gets the customFieldList value for this CampaignDirectMail.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CampaignDirectMail.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignDirectMail)) return false;
        CampaignDirectMail other = (CampaignDirectMail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.campaignGroup==null && other.getCampaignGroup()==null) || 
             (this.campaignGroup!=null &&
              this.campaignGroup.equals(other.getCampaignGroup()))) &&
            ((this.template==null && other.getTemplate()==null) || 
             (this.template!=null &&
              this.template.equals(other.getTemplate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.subscription==null && other.getSubscription()==null) || 
             (this.subscription!=null &&
              this.subscription.equals(other.getSubscription()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.dateScheduled==null && other.getDateScheduled()==null) || 
             (this.dateScheduled!=null &&
              this.dateScheduled.equals(other.getDateScheduled()))) &&
            ((this.promoCode==null && other.getPromoCode()==null) || 
             (this.promoCode!=null &&
              this.promoCode.equals(other.getPromoCode()))) &&
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
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getCampaignGroup() != null) {
            _hashCode += getCampaignGroup().hashCode();
        }
        if (getTemplate() != null) {
            _hashCode += getTemplate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSubscription() != null) {
            _hashCode += getSubscription().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getDateScheduled() != null) {
            _hashCode += getDateScheduled().hashCode();
        }
        if (getPromoCode() != null) {
            _hashCode += getPromoCode().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignDirectMail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignDirectMail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "campaignGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("template");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "template"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "subscription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.marketing_2010_2.lists.webservices.netsuite.com", "CampaignCampaignDirectMailStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateScheduled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "dateScheduled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "promoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "CustomFieldList"));
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
