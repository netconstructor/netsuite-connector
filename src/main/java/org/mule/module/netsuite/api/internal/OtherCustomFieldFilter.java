/**
 * OtherCustomFieldFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class OtherCustomFieldFilter  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef fldFilter;

    private java.lang.Boolean fldFilterChecked;

    private org.mule.module.netsuite.api.internal.CustomizationFilterCompareType fldFilterCompareType;

    private java.lang.String fldFilterVal;

    private org.mule.module.netsuite.api.internal.FldFilterSelList fldFilterSelList;

    private java.lang.Boolean fldFilterNotNull;

    public OtherCustomFieldFilter() {
    }

    public OtherCustomFieldFilter(
           org.mule.module.netsuite.api.internal.RecordRef fldFilter,
           java.lang.Boolean fldFilterChecked,
           org.mule.module.netsuite.api.internal.CustomizationFilterCompareType fldFilterCompareType,
           java.lang.String fldFilterVal,
           org.mule.module.netsuite.api.internal.FldFilterSelList fldFilterSelList,
           java.lang.Boolean fldFilterNotNull) {
           this.fldFilter = fldFilter;
           this.fldFilterChecked = fldFilterChecked;
           this.fldFilterCompareType = fldFilterCompareType;
           this.fldFilterVal = fldFilterVal;
           this.fldFilterSelList = fldFilterSelList;
           this.fldFilterNotNull = fldFilterNotNull;
    }


    /**
     * Gets the fldFilter value for this OtherCustomFieldFilter.
     * 
     * @return fldFilter
     */
    public org.mule.module.netsuite.api.internal.RecordRef getFldFilter() {
        return fldFilter;
    }


    /**
     * Sets the fldFilter value for this OtherCustomFieldFilter.
     * 
     * @param fldFilter
     */
    public void setFldFilter(org.mule.module.netsuite.api.internal.RecordRef fldFilter) {
        this.fldFilter = fldFilter;
    }


    /**
     * Gets the fldFilterChecked value for this OtherCustomFieldFilter.
     * 
     * @return fldFilterChecked
     */
    public java.lang.Boolean getFldFilterChecked() {
        return fldFilterChecked;
    }


    /**
     * Sets the fldFilterChecked value for this OtherCustomFieldFilter.
     * 
     * @param fldFilterChecked
     */
    public void setFldFilterChecked(java.lang.Boolean fldFilterChecked) {
        this.fldFilterChecked = fldFilterChecked;
    }


    /**
     * Gets the fldFilterCompareType value for this OtherCustomFieldFilter.
     * 
     * @return fldFilterCompareType
     */
    public org.mule.module.netsuite.api.internal.CustomizationFilterCompareType getFldFilterCompareType() {
        return fldFilterCompareType;
    }


    /**
     * Sets the fldFilterCompareType value for this OtherCustomFieldFilter.
     * 
     * @param fldFilterCompareType
     */
    public void setFldFilterCompareType(org.mule.module.netsuite.api.internal.CustomizationFilterCompareType fldFilterCompareType) {
        this.fldFilterCompareType = fldFilterCompareType;
    }


    /**
     * Gets the fldFilterVal value for this OtherCustomFieldFilter.
     * 
     * @return fldFilterVal
     */
    public java.lang.String getFldFilterVal() {
        return fldFilterVal;
    }


    /**
     * Sets the fldFilterVal value for this OtherCustomFieldFilter.
     * 
     * @param fldFilterVal
     */
    public void setFldFilterVal(java.lang.String fldFilterVal) {
        this.fldFilterVal = fldFilterVal;
    }


    /**
     * Gets the fldFilterSelList value for this OtherCustomFieldFilter.
     * 
     * @return fldFilterSelList
     */
    public org.mule.module.netsuite.api.internal.FldFilterSelList getFldFilterSelList() {
        return fldFilterSelList;
    }


    /**
     * Sets the fldFilterSelList value for this OtherCustomFieldFilter.
     * 
     * @param fldFilterSelList
     */
    public void setFldFilterSelList(org.mule.module.netsuite.api.internal.FldFilterSelList fldFilterSelList) {
        this.fldFilterSelList = fldFilterSelList;
    }


    /**
     * Gets the fldFilterNotNull value for this OtherCustomFieldFilter.
     * 
     * @return fldFilterNotNull
     */
    public java.lang.Boolean getFldFilterNotNull() {
        return fldFilterNotNull;
    }


    /**
     * Sets the fldFilterNotNull value for this OtherCustomFieldFilter.
     * 
     * @param fldFilterNotNull
     */
    public void setFldFilterNotNull(java.lang.Boolean fldFilterNotNull) {
        this.fldFilterNotNull = fldFilterNotNull;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OtherCustomFieldFilter)) return false;
        OtherCustomFieldFilter other = (OtherCustomFieldFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fldFilter==null && other.getFldFilter()==null) || 
             (this.fldFilter!=null &&
              this.fldFilter.equals(other.getFldFilter()))) &&
            ((this.fldFilterChecked==null && other.getFldFilterChecked()==null) || 
             (this.fldFilterChecked!=null &&
              this.fldFilterChecked.equals(other.getFldFilterChecked()))) &&
            ((this.fldFilterCompareType==null && other.getFldFilterCompareType()==null) || 
             (this.fldFilterCompareType!=null &&
              this.fldFilterCompareType.equals(other.getFldFilterCompareType()))) &&
            ((this.fldFilterVal==null && other.getFldFilterVal()==null) || 
             (this.fldFilterVal!=null &&
              this.fldFilterVal.equals(other.getFldFilterVal()))) &&
            ((this.fldFilterSelList==null && other.getFldFilterSelList()==null) || 
             (this.fldFilterSelList!=null &&
              this.fldFilterSelList.equals(other.getFldFilterSelList()))) &&
            ((this.fldFilterNotNull==null && other.getFldFilterNotNull()==null) || 
             (this.fldFilterNotNull!=null &&
              this.fldFilterNotNull.equals(other.getFldFilterNotNull())));
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
        if (getFldFilter() != null) {
            _hashCode += getFldFilter().hashCode();
        }
        if (getFldFilterChecked() != null) {
            _hashCode += getFldFilterChecked().hashCode();
        }
        if (getFldFilterCompareType() != null) {
            _hashCode += getFldFilterCompareType().hashCode();
        }
        if (getFldFilterVal() != null) {
            _hashCode += getFldFilterVal().hashCode();
        }
        if (getFldFilterSelList() != null) {
            _hashCode += getFldFilterSelList().hashCode();
        }
        if (getFldFilterNotNull() != null) {
            _hashCode += getFldFilterNotNull().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OtherCustomFieldFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "OtherCustomFieldFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fldFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "fldFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fldFilterChecked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "fldFilterChecked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fldFilterCompareType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "fldFilterCompareType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2010_2.setup.webservices.netsuite.com", "CustomizationFilterCompareType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fldFilterVal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "fldFilterVal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fldFilterSelList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "fldFilterSelList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "FldFilterSelList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fldFilterNotNull");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "fldFilterNotNull"));
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
