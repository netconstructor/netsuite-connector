/**
 * SiteCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SiteCategory  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef website;

    private org.mule.module.netsuite.api.internal.RecordRef category;

    private java.lang.Boolean isDefault;

    private java.lang.String categoryDescription;

    public SiteCategory() {
    }

    public SiteCategory(
           org.mule.module.netsuite.api.internal.RecordRef website,
           org.mule.module.netsuite.api.internal.RecordRef category,
           java.lang.Boolean isDefault,
           java.lang.String categoryDescription) {
           this.website = website;
           this.category = category;
           this.isDefault = isDefault;
           this.categoryDescription = categoryDescription;
    }


    /**
     * Gets the website value for this SiteCategory.
     * 
     * @return website
     */
    public org.mule.module.netsuite.api.internal.RecordRef getWebsite() {
        return website;
    }


    /**
     * Sets the website value for this SiteCategory.
     * 
     * @param website
     */
    public void setWebsite(org.mule.module.netsuite.api.internal.RecordRef website) {
        this.website = website;
    }


    /**
     * Gets the category value for this SiteCategory.
     * 
     * @return category
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCategory() {
        return category;
    }


    /**
     * Sets the category value for this SiteCategory.
     * 
     * @param category
     */
    public void setCategory(org.mule.module.netsuite.api.internal.RecordRef category) {
        this.category = category;
    }


    /**
     * Gets the isDefault value for this SiteCategory.
     * 
     * @return isDefault
     */
    public java.lang.Boolean getIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this SiteCategory.
     * 
     * @param isDefault
     */
    public void setIsDefault(java.lang.Boolean isDefault) {
        this.isDefault = isDefault;
    }


    /**
     * Gets the categoryDescription value for this SiteCategory.
     * 
     * @return categoryDescription
     */
    public java.lang.String getCategoryDescription() {
        return categoryDescription;
    }


    /**
     * Sets the categoryDescription value for this SiteCategory.
     * 
     * @param categoryDescription
     */
    public void setCategoryDescription(java.lang.String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteCategory)) return false;
        SiteCategory other = (SiteCategory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.website==null && other.getWebsite()==null) || 
             (this.website!=null &&
              this.website.equals(other.getWebsite()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.isDefault==null && other.getIsDefault()==null) || 
             (this.isDefault!=null &&
              this.isDefault.equals(other.getIsDefault()))) &&
            ((this.categoryDescription==null && other.getCategoryDescription()==null) || 
             (this.categoryDescription!=null &&
              this.categoryDescription.equals(other.getCategoryDescription())));
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
        if (getWebsite() != null) {
            _hashCode += getWebsite().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getIsDefault() != null) {
            _hashCode += getIsDefault().hashCode();
        }
        if (getCategoryDescription() != null) {
            _hashCode += getCategoryDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SiteCategory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SiteCategory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("website");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "website"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "categoryDescription"));
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
