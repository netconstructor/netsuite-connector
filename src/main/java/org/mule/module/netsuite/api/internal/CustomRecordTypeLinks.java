/**
 * CustomRecordTypeLinks.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomRecordTypeLinks  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef linkCenter;

    private org.mule.module.netsuite.api.internal.RecordRef linkSection;

    private java.lang.String linkLabel;

    public CustomRecordTypeLinks() {
    }

    public CustomRecordTypeLinks(
           org.mule.module.netsuite.api.internal.RecordRef linkCenter,
           org.mule.module.netsuite.api.internal.RecordRef linkSection,
           java.lang.String linkLabel) {
           this.linkCenter = linkCenter;
           this.linkSection = linkSection;
           this.linkLabel = linkLabel;
    }


    /**
     * Gets the linkCenter value for this CustomRecordTypeLinks.
     * 
     * @return linkCenter
     */
    public org.mule.module.netsuite.api.internal.RecordRef getLinkCenter() {
        return linkCenter;
    }


    /**
     * Sets the linkCenter value for this CustomRecordTypeLinks.
     * 
     * @param linkCenter
     */
    public void setLinkCenter(org.mule.module.netsuite.api.internal.RecordRef linkCenter) {
        this.linkCenter = linkCenter;
    }


    /**
     * Gets the linkSection value for this CustomRecordTypeLinks.
     * 
     * @return linkSection
     */
    public org.mule.module.netsuite.api.internal.RecordRef getLinkSection() {
        return linkSection;
    }


    /**
     * Sets the linkSection value for this CustomRecordTypeLinks.
     * 
     * @param linkSection
     */
    public void setLinkSection(org.mule.module.netsuite.api.internal.RecordRef linkSection) {
        this.linkSection = linkSection;
    }


    /**
     * Gets the linkLabel value for this CustomRecordTypeLinks.
     * 
     * @return linkLabel
     */
    public java.lang.String getLinkLabel() {
        return linkLabel;
    }


    /**
     * Sets the linkLabel value for this CustomRecordTypeLinks.
     * 
     * @param linkLabel
     */
    public void setLinkLabel(java.lang.String linkLabel) {
        this.linkLabel = linkLabel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomRecordTypeLinks)) return false;
        CustomRecordTypeLinks other = (CustomRecordTypeLinks) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.linkCenter==null && other.getLinkCenter()==null) || 
             (this.linkCenter!=null &&
              this.linkCenter.equals(other.getLinkCenter()))) &&
            ((this.linkSection==null && other.getLinkSection()==null) || 
             (this.linkSection!=null &&
              this.linkSection.equals(other.getLinkSection()))) &&
            ((this.linkLabel==null && other.getLinkLabel()==null) || 
             (this.linkLabel!=null &&
              this.linkLabel.equals(other.getLinkLabel())));
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
        if (getLinkCenter() != null) {
            _hashCode += getLinkCenter().hashCode();
        }
        if (getLinkSection() != null) {
            _hashCode += getLinkSection().hashCode();
        }
        if (getLinkLabel() != null) {
            _hashCode += getLinkLabel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomRecordTypeLinks.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeLinks"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkCenter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "linkCenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkSection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "linkSection"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "linkLabel"));
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
