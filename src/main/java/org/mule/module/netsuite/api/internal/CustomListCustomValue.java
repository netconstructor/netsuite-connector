/**
 * CustomListCustomValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomListCustomValue  implements java.io.Serializable {
    private java.lang.String value;

    private java.lang.String abbreviation;

    private java.lang.Boolean isInactive;

    private java.lang.Long valueId;

    private org.mule.module.netsuite.api.internal.LanguageValueList valueLanguageValueList;

    public CustomListCustomValue() {
    }

    public CustomListCustomValue(
           java.lang.String value,
           java.lang.String abbreviation,
           java.lang.Boolean isInactive,
           java.lang.Long valueId,
           org.mule.module.netsuite.api.internal.LanguageValueList valueLanguageValueList) {
           this.value = value;
           this.abbreviation = abbreviation;
           this.isInactive = isInactive;
           this.valueId = valueId;
           this.valueLanguageValueList = valueLanguageValueList;
    }


    /**
     * Gets the value value for this CustomListCustomValue.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this CustomListCustomValue.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the abbreviation value for this CustomListCustomValue.
     * 
     * @return abbreviation
     */
    public java.lang.String getAbbreviation() {
        return abbreviation;
    }


    /**
     * Sets the abbreviation value for this CustomListCustomValue.
     * 
     * @param abbreviation
     */
    public void setAbbreviation(java.lang.String abbreviation) {
        this.abbreviation = abbreviation;
    }


    /**
     * Gets the isInactive value for this CustomListCustomValue.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this CustomListCustomValue.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the valueId value for this CustomListCustomValue.
     * 
     * @return valueId
     */
    public java.lang.Long getValueId() {
        return valueId;
    }


    /**
     * Sets the valueId value for this CustomListCustomValue.
     * 
     * @param valueId
     */
    public void setValueId(java.lang.Long valueId) {
        this.valueId = valueId;
    }


    /**
     * Gets the valueLanguageValueList value for this CustomListCustomValue.
     * 
     * @return valueLanguageValueList
     */
    public org.mule.module.netsuite.api.internal.LanguageValueList getValueLanguageValueList() {
        return valueLanguageValueList;
    }


    /**
     * Sets the valueLanguageValueList value for this CustomListCustomValue.
     * 
     * @param valueLanguageValueList
     */
    public void setValueLanguageValueList(org.mule.module.netsuite.api.internal.LanguageValueList valueLanguageValueList) {
        this.valueLanguageValueList = valueLanguageValueList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomListCustomValue)) return false;
        CustomListCustomValue other = (CustomListCustomValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.abbreviation==null && other.getAbbreviation()==null) || 
             (this.abbreviation!=null &&
              this.abbreviation.equals(other.getAbbreviation()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.valueId==null && other.getValueId()==null) || 
             (this.valueId!=null &&
              this.valueId.equals(other.getValueId()))) &&
            ((this.valueLanguageValueList==null && other.getValueLanguageValueList()==null) || 
             (this.valueLanguageValueList!=null &&
              this.valueLanguageValueList.equals(other.getValueLanguageValueList())));
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getAbbreviation() != null) {
            _hashCode += getAbbreviation().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getValueId() != null) {
            _hashCode += getValueId().hashCode();
        }
        if (getValueLanguageValueList() != null) {
            _hashCode += getValueLanguageValueList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomListCustomValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomListCustomValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abbreviation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "abbreviation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "valueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueLanguageValueList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "valueLanguageValueList"));
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
