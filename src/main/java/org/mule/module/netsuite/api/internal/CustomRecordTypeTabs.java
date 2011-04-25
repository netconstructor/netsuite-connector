/**
 * CustomRecordTypeTabs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomRecordTypeTabs  implements java.io.Serializable {
    private java.lang.String tabTitle;

    private org.mule.module.netsuite.api.internal.RecordRef tabParent;

    private org.mule.module.netsuite.api.internal.LanguageValueList tabTitleLanguageValueList;

    public CustomRecordTypeTabs() {
    }

    public CustomRecordTypeTabs(
           java.lang.String tabTitle,
           org.mule.module.netsuite.api.internal.RecordRef tabParent,
           org.mule.module.netsuite.api.internal.LanguageValueList tabTitleLanguageValueList) {
           this.tabTitle = tabTitle;
           this.tabParent = tabParent;
           this.tabTitleLanguageValueList = tabTitleLanguageValueList;
    }


    /**
     * Gets the tabTitle value for this CustomRecordTypeTabs.
     * 
     * @return tabTitle
     */
    public java.lang.String getTabTitle() {
        return tabTitle;
    }


    /**
     * Sets the tabTitle value for this CustomRecordTypeTabs.
     * 
     * @param tabTitle
     */
    public void setTabTitle(java.lang.String tabTitle) {
        this.tabTitle = tabTitle;
    }


    /**
     * Gets the tabParent value for this CustomRecordTypeTabs.
     * 
     * @return tabParent
     */
    public org.mule.module.netsuite.api.internal.RecordRef getTabParent() {
        return tabParent;
    }


    /**
     * Sets the tabParent value for this CustomRecordTypeTabs.
     * 
     * @param tabParent
     */
    public void setTabParent(org.mule.module.netsuite.api.internal.RecordRef tabParent) {
        this.tabParent = tabParent;
    }


    /**
     * Gets the tabTitleLanguageValueList value for this CustomRecordTypeTabs.
     * 
     * @return tabTitleLanguageValueList
     */
    public org.mule.module.netsuite.api.internal.LanguageValueList getTabTitleLanguageValueList() {
        return tabTitleLanguageValueList;
    }


    /**
     * Sets the tabTitleLanguageValueList value for this CustomRecordTypeTabs.
     * 
     * @param tabTitleLanguageValueList
     */
    public void setTabTitleLanguageValueList(org.mule.module.netsuite.api.internal.LanguageValueList tabTitleLanguageValueList) {
        this.tabTitleLanguageValueList = tabTitleLanguageValueList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomRecordTypeTabs)) return false;
        CustomRecordTypeTabs other = (CustomRecordTypeTabs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tabTitle==null && other.getTabTitle()==null) || 
             (this.tabTitle!=null &&
              this.tabTitle.equals(other.getTabTitle()))) &&
            ((this.tabParent==null && other.getTabParent()==null) || 
             (this.tabParent!=null &&
              this.tabParent.equals(other.getTabParent()))) &&
            ((this.tabTitleLanguageValueList==null && other.getTabTitleLanguageValueList()==null) || 
             (this.tabTitleLanguageValueList!=null &&
              this.tabTitleLanguageValueList.equals(other.getTabTitleLanguageValueList())));
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
        if (getTabTitle() != null) {
            _hashCode += getTabTitle().hashCode();
        }
        if (getTabParent() != null) {
            _hashCode += getTabParent().hashCode();
        }
        if (getTabTitleLanguageValueList() != null) {
            _hashCode += getTabTitleLanguageValueList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomRecordTypeTabs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeTabs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tabTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "tabTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tabParent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "tabParent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tabTitleLanguageValueList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "tabTitleLanguageValueList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "LanguageValueList"));
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
