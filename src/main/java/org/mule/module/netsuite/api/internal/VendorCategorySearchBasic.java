/**
 * VendorCategorySearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class VendorCategorySearchBasic  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId;

    private org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isInactive;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isTaxAgency;

    private org.mule.module.netsuite.api.internal.SearchStringField name;

    public VendorCategorySearchBasic() {
    }

    public VendorCategorySearchBasic(
           org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId,
           org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber,
           org.mule.module.netsuite.api.internal.SearchBooleanField isInactive,
           org.mule.module.netsuite.api.internal.SearchBooleanField isTaxAgency,
           org.mule.module.netsuite.api.internal.SearchStringField name) {
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.isTaxAgency = isTaxAgency;
        this.name = name;
    }


    /**
     * Gets the internalId value for this VendorCategorySearchBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this VendorCategorySearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this VendorCategorySearchBasic.
     * 
     * @return internalIdNumber
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this VendorCategorySearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isInactive value for this VendorCategorySearchBasic.
     * 
     * @return isInactive
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this VendorCategorySearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(org.mule.module.netsuite.api.internal.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the isTaxAgency value for this VendorCategorySearchBasic.
     * 
     * @return isTaxAgency
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsTaxAgency() {
        return isTaxAgency;
    }


    /**
     * Sets the isTaxAgency value for this VendorCategorySearchBasic.
     * 
     * @param isTaxAgency
     */
    public void setIsTaxAgency(org.mule.module.netsuite.api.internal.SearchBooleanField isTaxAgency) {
        this.isTaxAgency = isTaxAgency;
    }


    /**
     * Gets the name value for this VendorCategorySearchBasic.
     * 
     * @return name
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getName() {
        return name;
    }


    /**
     * Sets the name value for this VendorCategorySearchBasic.
     * 
     * @param name
     */
    public void setName(org.mule.module.netsuite.api.internal.SearchStringField name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VendorCategorySearchBasic)) return false;
        VendorCategorySearchBasic other = (VendorCategorySearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.isTaxAgency==null && other.getIsTaxAgency()==null) || 
             (this.isTaxAgency!=null &&
              this.isTaxAgency.equals(other.getIsTaxAgency()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getIsTaxAgency() != null) {
            _hashCode += getIsTaxAgency().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VendorCategorySearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "VendorCategorySearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTaxAgency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isTaxAgency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
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
