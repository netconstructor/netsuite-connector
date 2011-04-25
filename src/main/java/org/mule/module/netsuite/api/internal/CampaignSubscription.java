/**
 * CampaignSubscription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CampaignSubscription  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String description;

    private java.lang.Boolean subscribedByDefault;

    private java.lang.Boolean unsubscribed;

    private java.lang.String externalName;

    private java.lang.String externalDescription;

    private java.lang.Boolean isInactive;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public CampaignSubscription() {
    }

    public CampaignSubscription(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.lang.String name,
           java.lang.String description,
           java.lang.Boolean subscribedByDefault,
           java.lang.Boolean unsubscribed,
           java.lang.String externalName,
           java.lang.String externalDescription,
           java.lang.Boolean isInactive) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.name = name;
        this.description = description;
        this.subscribedByDefault = subscribedByDefault;
        this.unsubscribed = unsubscribed;
        this.externalName = externalName;
        this.externalDescription = externalDescription;
        this.isInactive = isInactive;
    }


    /**
     * Gets the name value for this CampaignSubscription.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CampaignSubscription.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this CampaignSubscription.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CampaignSubscription.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the subscribedByDefault value for this CampaignSubscription.
     * 
     * @return subscribedByDefault
     */
    public java.lang.Boolean getSubscribedByDefault() {
        return subscribedByDefault;
    }


    /**
     * Sets the subscribedByDefault value for this CampaignSubscription.
     * 
     * @param subscribedByDefault
     */
    public void setSubscribedByDefault(java.lang.Boolean subscribedByDefault) {
        this.subscribedByDefault = subscribedByDefault;
    }


    /**
     * Gets the unsubscribed value for this CampaignSubscription.
     * 
     * @return unsubscribed
     */
    public java.lang.Boolean getUnsubscribed() {
        return unsubscribed;
    }


    /**
     * Sets the unsubscribed value for this CampaignSubscription.
     * 
     * @param unsubscribed
     */
    public void setUnsubscribed(java.lang.Boolean unsubscribed) {
        this.unsubscribed = unsubscribed;
    }


    /**
     * Gets the externalName value for this CampaignSubscription.
     * 
     * @return externalName
     */
    public java.lang.String getExternalName() {
        return externalName;
    }


    /**
     * Sets the externalName value for this CampaignSubscription.
     * 
     * @param externalName
     */
    public void setExternalName(java.lang.String externalName) {
        this.externalName = externalName;
    }


    /**
     * Gets the externalDescription value for this CampaignSubscription.
     * 
     * @return externalDescription
     */
    public java.lang.String getExternalDescription() {
        return externalDescription;
    }


    /**
     * Sets the externalDescription value for this CampaignSubscription.
     * 
     * @param externalDescription
     */
    public void setExternalDescription(java.lang.String externalDescription) {
        this.externalDescription = externalDescription;
    }


    /**
     * Gets the isInactive value for this CampaignSubscription.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this CampaignSubscription.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the internalId value for this CampaignSubscription.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CampaignSubscription.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this CampaignSubscription.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this CampaignSubscription.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignSubscription)) return false;
        CampaignSubscription other = (CampaignSubscription) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.subscribedByDefault==null && other.getSubscribedByDefault()==null) || 
             (this.subscribedByDefault!=null &&
              this.subscribedByDefault.equals(other.getSubscribedByDefault()))) &&
            ((this.unsubscribed==null && other.getUnsubscribed()==null) || 
             (this.unsubscribed!=null &&
              this.unsubscribed.equals(other.getUnsubscribed()))) &&
            ((this.externalName==null && other.getExternalName()==null) || 
             (this.externalName!=null &&
              this.externalName.equals(other.getExternalName()))) &&
            ((this.externalDescription==null && other.getExternalDescription()==null) || 
             (this.externalDescription!=null &&
              this.externalDescription.equals(other.getExternalDescription()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSubscribedByDefault() != null) {
            _hashCode += getSubscribedByDefault().hashCode();
        }
        if (getUnsubscribed() != null) {
            _hashCode += getUnsubscribed().hashCode();
        }
        if (getExternalName() != null) {
            _hashCode += getExternalName().hashCode();
        }
        if (getExternalDescription() != null) {
            _hashCode += getExternalDescription().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
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
        new org.apache.axis.description.TypeDesc(CampaignSubscription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignSubscription"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("subscribedByDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "subscribedByDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unsubscribed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "unsubscribed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "externalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "externalDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
