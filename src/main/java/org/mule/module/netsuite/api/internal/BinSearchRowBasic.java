/**
 * BinSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class BinSearchRowBasic  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] binNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] inactive;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] location;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] memo;

    private org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList;

    public BinSearchRowBasic() {
    }

    public BinSearchRowBasic(
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] binNumber,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] inactive,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] location,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] memo,
           org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
           this.binNumber = binNumber;
           this.inactive = inactive;
           this.internalId = internalId;
           this.location = location;
           this.memo = memo;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the binNumber value for this BinSearchRowBasic.
     * 
     * @return binNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBinNumber() {
        return binNumber;
    }


    /**
     * Sets the binNumber value for this BinSearchRowBasic.
     * 
     * @param binNumber
     */
    public void setBinNumber(org.mule.module.netsuite.api.internal.SearchColumnStringField[] binNumber) {
        this.binNumber = binNumber;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getBinNumber(int i) {
        return this.binNumber[i];
    }

    public void setBinNumber(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.binNumber[i] = _value;
    }


    /**
     * Gets the inactive value for this BinSearchRowBasic.
     * 
     * @return inactive
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getInactive() {
        return inactive;
    }


    /**
     * Sets the inactive value for this BinSearchRowBasic.
     * 
     * @param inactive
     */
    public void setInactive(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] inactive) {
        this.inactive = inactive;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getInactive(int i) {
        return this.inactive[i];
    }

    public void setInactive(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.inactive[i] = _value;
    }


    /**
     * Gets the internalId value for this BinSearchRowBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this BinSearchRowBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }


    /**
     * Gets the location value for this BinSearchRowBasic.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this BinSearchRowBasic.
     * 
     * @param location
     */
    public void setLocation(org.mule.module.netsuite.api.internal.SearchColumnStringField[] location) {
        this.location = location;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getLocation(int i) {
        return this.location[i];
    }

    public void setLocation(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.location[i] = _value;
    }


    /**
     * Gets the memo value for this BinSearchRowBasic.
     * 
     * @return memo
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this BinSearchRowBasic.
     * 
     * @param memo
     */
    public void setMemo(org.mule.module.netsuite.api.internal.SearchColumnStringField[] memo) {
        this.memo = memo;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getMemo(int i) {
        return this.memo[i];
    }

    public void setMemo(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.memo[i] = _value;
    }


    /**
     * Gets the customFieldList value for this BinSearchRowBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this BinSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BinSearchRowBasic)) return false;
        BinSearchRowBasic other = (BinSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.binNumber==null && other.getBinNumber()==null) || 
             (this.binNumber!=null &&
              java.util.Arrays.equals(this.binNumber, other.getBinNumber()))) &&
            ((this.inactive==null && other.getInactive()==null) || 
             (this.inactive!=null &&
              java.util.Arrays.equals(this.inactive, other.getInactive()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              java.util.Arrays.equals(this.memo, other.getMemo()))) &&
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
        if (getBinNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBinNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBinNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInactive() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInactive());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInactive(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMemo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMemo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BinSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "BinSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "binNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "inactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnCustomFieldList"));
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
