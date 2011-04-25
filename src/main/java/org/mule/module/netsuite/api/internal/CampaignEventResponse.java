/**
 * CampaignEventResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CampaignEventResponse  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String type;

    private java.util.Calendar dateSent;

    private java.lang.Double sent;

    private java.lang.Double opened;

    private java.lang.Double openedRatio;

    private java.lang.Double clickedThru;

    private java.lang.Double clickedThruRatio;

    private java.lang.Long responded;

    private java.lang.Double respondedRatio;

    private java.lang.Long unsubscribed;

    private java.lang.Double unsubscribedRatio;

    private java.lang.Long bounced;

    private java.lang.Double bouncedRatio;

    public CampaignEventResponse() {
    }

    public CampaignEventResponse(
           java.lang.String name,
           java.lang.String type,
           java.util.Calendar dateSent,
           java.lang.Double sent,
           java.lang.Double opened,
           java.lang.Double openedRatio,
           java.lang.Double clickedThru,
           java.lang.Double clickedThruRatio,
           java.lang.Long responded,
           java.lang.Double respondedRatio,
           java.lang.Long unsubscribed,
           java.lang.Double unsubscribedRatio,
           java.lang.Long bounced,
           java.lang.Double bouncedRatio) {
           this.name = name;
           this.type = type;
           this.dateSent = dateSent;
           this.sent = sent;
           this.opened = opened;
           this.openedRatio = openedRatio;
           this.clickedThru = clickedThru;
           this.clickedThruRatio = clickedThruRatio;
           this.responded = responded;
           this.respondedRatio = respondedRatio;
           this.unsubscribed = unsubscribed;
           this.unsubscribedRatio = unsubscribedRatio;
           this.bounced = bounced;
           this.bouncedRatio = bouncedRatio;
    }


    /**
     * Gets the name value for this CampaignEventResponse.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CampaignEventResponse.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this CampaignEventResponse.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this CampaignEventResponse.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the dateSent value for this CampaignEventResponse.
     * 
     * @return dateSent
     */
    public java.util.Calendar getDateSent() {
        return dateSent;
    }


    /**
     * Sets the dateSent value for this CampaignEventResponse.
     * 
     * @param dateSent
     */
    public void setDateSent(java.util.Calendar dateSent) {
        this.dateSent = dateSent;
    }


    /**
     * Gets the sent value for this CampaignEventResponse.
     * 
     * @return sent
     */
    public java.lang.Double getSent() {
        return sent;
    }


    /**
     * Sets the sent value for this CampaignEventResponse.
     * 
     * @param sent
     */
    public void setSent(java.lang.Double sent) {
        this.sent = sent;
    }


    /**
     * Gets the opened value for this CampaignEventResponse.
     * 
     * @return opened
     */
    public java.lang.Double getOpened() {
        return opened;
    }


    /**
     * Sets the opened value for this CampaignEventResponse.
     * 
     * @param opened
     */
    public void setOpened(java.lang.Double opened) {
        this.opened = opened;
    }


    /**
     * Gets the openedRatio value for this CampaignEventResponse.
     * 
     * @return openedRatio
     */
    public java.lang.Double getOpenedRatio() {
        return openedRatio;
    }


    /**
     * Sets the openedRatio value for this CampaignEventResponse.
     * 
     * @param openedRatio
     */
    public void setOpenedRatio(java.lang.Double openedRatio) {
        this.openedRatio = openedRatio;
    }


    /**
     * Gets the clickedThru value for this CampaignEventResponse.
     * 
     * @return clickedThru
     */
    public java.lang.Double getClickedThru() {
        return clickedThru;
    }


    /**
     * Sets the clickedThru value for this CampaignEventResponse.
     * 
     * @param clickedThru
     */
    public void setClickedThru(java.lang.Double clickedThru) {
        this.clickedThru = clickedThru;
    }


    /**
     * Gets the clickedThruRatio value for this CampaignEventResponse.
     * 
     * @return clickedThruRatio
     */
    public java.lang.Double getClickedThruRatio() {
        return clickedThruRatio;
    }


    /**
     * Sets the clickedThruRatio value for this CampaignEventResponse.
     * 
     * @param clickedThruRatio
     */
    public void setClickedThruRatio(java.lang.Double clickedThruRatio) {
        this.clickedThruRatio = clickedThruRatio;
    }


    /**
     * Gets the responded value for this CampaignEventResponse.
     * 
     * @return responded
     */
    public java.lang.Long getResponded() {
        return responded;
    }


    /**
     * Sets the responded value for this CampaignEventResponse.
     * 
     * @param responded
     */
    public void setResponded(java.lang.Long responded) {
        this.responded = responded;
    }


    /**
     * Gets the respondedRatio value for this CampaignEventResponse.
     * 
     * @return respondedRatio
     */
    public java.lang.Double getRespondedRatio() {
        return respondedRatio;
    }


    /**
     * Sets the respondedRatio value for this CampaignEventResponse.
     * 
     * @param respondedRatio
     */
    public void setRespondedRatio(java.lang.Double respondedRatio) {
        this.respondedRatio = respondedRatio;
    }


    /**
     * Gets the unsubscribed value for this CampaignEventResponse.
     * 
     * @return unsubscribed
     */
    public java.lang.Long getUnsubscribed() {
        return unsubscribed;
    }


    /**
     * Sets the unsubscribed value for this CampaignEventResponse.
     * 
     * @param unsubscribed
     */
    public void setUnsubscribed(java.lang.Long unsubscribed) {
        this.unsubscribed = unsubscribed;
    }


    /**
     * Gets the unsubscribedRatio value for this CampaignEventResponse.
     * 
     * @return unsubscribedRatio
     */
    public java.lang.Double getUnsubscribedRatio() {
        return unsubscribedRatio;
    }


    /**
     * Sets the unsubscribedRatio value for this CampaignEventResponse.
     * 
     * @param unsubscribedRatio
     */
    public void setUnsubscribedRatio(java.lang.Double unsubscribedRatio) {
        this.unsubscribedRatio = unsubscribedRatio;
    }


    /**
     * Gets the bounced value for this CampaignEventResponse.
     * 
     * @return bounced
     */
    public java.lang.Long getBounced() {
        return bounced;
    }


    /**
     * Sets the bounced value for this CampaignEventResponse.
     * 
     * @param bounced
     */
    public void setBounced(java.lang.Long bounced) {
        this.bounced = bounced;
    }


    /**
     * Gets the bouncedRatio value for this CampaignEventResponse.
     * 
     * @return bouncedRatio
     */
    public java.lang.Double getBouncedRatio() {
        return bouncedRatio;
    }


    /**
     * Sets the bouncedRatio value for this CampaignEventResponse.
     * 
     * @param bouncedRatio
     */
    public void setBouncedRatio(java.lang.Double bouncedRatio) {
        this.bouncedRatio = bouncedRatio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignEventResponse)) return false;
        CampaignEventResponse other = (CampaignEventResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.dateSent==null && other.getDateSent()==null) || 
             (this.dateSent!=null &&
              this.dateSent.equals(other.getDateSent()))) &&
            ((this.sent==null && other.getSent()==null) || 
             (this.sent!=null &&
              this.sent.equals(other.getSent()))) &&
            ((this.opened==null && other.getOpened()==null) || 
             (this.opened!=null &&
              this.opened.equals(other.getOpened()))) &&
            ((this.openedRatio==null && other.getOpenedRatio()==null) || 
             (this.openedRatio!=null &&
              this.openedRatio.equals(other.getOpenedRatio()))) &&
            ((this.clickedThru==null && other.getClickedThru()==null) || 
             (this.clickedThru!=null &&
              this.clickedThru.equals(other.getClickedThru()))) &&
            ((this.clickedThruRatio==null && other.getClickedThruRatio()==null) || 
             (this.clickedThruRatio!=null &&
              this.clickedThruRatio.equals(other.getClickedThruRatio()))) &&
            ((this.responded==null && other.getResponded()==null) || 
             (this.responded!=null &&
              this.responded.equals(other.getResponded()))) &&
            ((this.respondedRatio==null && other.getRespondedRatio()==null) || 
             (this.respondedRatio!=null &&
              this.respondedRatio.equals(other.getRespondedRatio()))) &&
            ((this.unsubscribed==null && other.getUnsubscribed()==null) || 
             (this.unsubscribed!=null &&
              this.unsubscribed.equals(other.getUnsubscribed()))) &&
            ((this.unsubscribedRatio==null && other.getUnsubscribedRatio()==null) || 
             (this.unsubscribedRatio!=null &&
              this.unsubscribedRatio.equals(other.getUnsubscribedRatio()))) &&
            ((this.bounced==null && other.getBounced()==null) || 
             (this.bounced!=null &&
              this.bounced.equals(other.getBounced()))) &&
            ((this.bouncedRatio==null && other.getBouncedRatio()==null) || 
             (this.bouncedRatio!=null &&
              this.bouncedRatio.equals(other.getBouncedRatio())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getDateSent() != null) {
            _hashCode += getDateSent().hashCode();
        }
        if (getSent() != null) {
            _hashCode += getSent().hashCode();
        }
        if (getOpened() != null) {
            _hashCode += getOpened().hashCode();
        }
        if (getOpenedRatio() != null) {
            _hashCode += getOpenedRatio().hashCode();
        }
        if (getClickedThru() != null) {
            _hashCode += getClickedThru().hashCode();
        }
        if (getClickedThruRatio() != null) {
            _hashCode += getClickedThruRatio().hashCode();
        }
        if (getResponded() != null) {
            _hashCode += getResponded().hashCode();
        }
        if (getRespondedRatio() != null) {
            _hashCode += getRespondedRatio().hashCode();
        }
        if (getUnsubscribed() != null) {
            _hashCode += getUnsubscribed().hashCode();
        }
        if (getUnsubscribedRatio() != null) {
            _hashCode += getUnsubscribedRatio().hashCode();
        }
        if (getBounced() != null) {
            _hashCode += getBounced().hashCode();
        }
        if (getBouncedRatio() != null) {
            _hashCode += getBouncedRatio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignEventResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignEventResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateSent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "dateSent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "sent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opened");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "opened"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openedRatio");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "openedRatio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickedThru");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "clickedThru"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickedThruRatio");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "clickedThruRatio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responded");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "responded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respondedRatio");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "respondedRatio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unsubscribed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "unsubscribed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unsubscribedRatio");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "unsubscribedRatio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bounced");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "bounced"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bouncedRatio");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "bouncedRatio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
