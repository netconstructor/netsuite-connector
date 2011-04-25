/**
 * CustomFieldSubAccess.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomFieldSubAccess  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef sub;

    private org.mule.module.netsuite.api.internal.CustomizationAccessLevel accessLevel;

    private org.mule.module.netsuite.api.internal.CustomizationSearchLevel searchLevel;

    public CustomFieldSubAccess() {
    }

    public CustomFieldSubAccess(
           org.mule.module.netsuite.api.internal.RecordRef sub,
           org.mule.module.netsuite.api.internal.CustomizationAccessLevel accessLevel,
           org.mule.module.netsuite.api.internal.CustomizationSearchLevel searchLevel) {
           this.sub = sub;
           this.accessLevel = accessLevel;
           this.searchLevel = searchLevel;
    }


    /**
     * Gets the sub value for this CustomFieldSubAccess.
     * 
     * @return sub
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSub() {
        return sub;
    }


    /**
     * Sets the sub value for this CustomFieldSubAccess.
     * 
     * @param sub
     */
    public void setSub(org.mule.module.netsuite.api.internal.RecordRef sub) {
        this.sub = sub;
    }


    /**
     * Gets the accessLevel value for this CustomFieldSubAccess.
     * 
     * @return accessLevel
     */
    public org.mule.module.netsuite.api.internal.CustomizationAccessLevel getAccessLevel() {
        return accessLevel;
    }


    /**
     * Sets the accessLevel value for this CustomFieldSubAccess.
     * 
     * @param accessLevel
     */
    public void setAccessLevel(org.mule.module.netsuite.api.internal.CustomizationAccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }


    /**
     * Gets the searchLevel value for this CustomFieldSubAccess.
     * 
     * @return searchLevel
     */
    public org.mule.module.netsuite.api.internal.CustomizationSearchLevel getSearchLevel() {
        return searchLevel;
    }


    /**
     * Sets the searchLevel value for this CustomFieldSubAccess.
     * 
     * @param searchLevel
     */
    public void setSearchLevel(org.mule.module.netsuite.api.internal.CustomizationSearchLevel searchLevel) {
        this.searchLevel = searchLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomFieldSubAccess)) return false;
        CustomFieldSubAccess other = (CustomFieldSubAccess) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sub==null && other.getSub()==null) || 
             (this.sub!=null &&
              this.sub.equals(other.getSub()))) &&
            ((this.accessLevel==null && other.getAccessLevel()==null) || 
             (this.accessLevel!=null &&
              this.accessLevel.equals(other.getAccessLevel()))) &&
            ((this.searchLevel==null && other.getSearchLevel()==null) || 
             (this.searchLevel!=null &&
              this.searchLevel.equals(other.getSearchLevel())));
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
        if (getSub() != null) {
            _hashCode += getSub().hashCode();
        }
        if (getAccessLevel() != null) {
            _hashCode += getAccessLevel().hashCode();
        }
        if (getSearchLevel() != null) {
            _hashCode += getSearchLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomFieldSubAccess.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomFieldSubAccess"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sub");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "sub"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "accessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2010_2.setup.webservices.netsuite.com", "CustomizationAccessLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "searchLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2010_2.setup.webservices.netsuite.com", "CustomizationSearchLevel"));
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
