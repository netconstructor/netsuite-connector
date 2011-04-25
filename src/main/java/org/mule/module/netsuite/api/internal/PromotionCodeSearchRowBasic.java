/**
 * PromotionCodeSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class PromotionCodeSearchRowBasic  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] code;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] description;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] discount;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] discountAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] endDate;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isPublic;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDate;

    private org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList;

    public PromotionCodeSearchRowBasic() {
    }

    public PromotionCodeSearchRowBasic(
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] code,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] description,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] discount,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] discountAmount,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] endDate,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isPublic,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDate,
           org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
           this.code = code;
           this.description = description;
           this.discount = discount;
           this.discountAmount = discountAmount;
           this.endDate = endDate;
           this.internalId = internalId;
           this.isInactive = isInactive;
           this.isPublic = isPublic;
           this.startDate = startDate;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the code value for this PromotionCodeSearchRowBasic.
     * 
     * @return code
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getCode() {
        return code;
    }


    /**
     * Sets the code value for this PromotionCodeSearchRowBasic.
     * 
     * @param code
     */
    public void setCode(org.mule.module.netsuite.api.internal.SearchColumnStringField[] code) {
        this.code = code;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getCode(int i) {
        return this.code[i];
    }

    public void setCode(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.code[i] = _value;
    }


    /**
     * Gets the description value for this PromotionCodeSearchRowBasic.
     * 
     * @return description
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PromotionCodeSearchRowBasic.
     * 
     * @param description
     */
    public void setDescription(org.mule.module.netsuite.api.internal.SearchColumnStringField[] description) {
        this.description = description;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.description[i] = _value;
    }


    /**
     * Gets the discount value for this PromotionCodeSearchRowBasic.
     * 
     * @return discount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this PromotionCodeSearchRowBasic.
     * 
     * @param discount
     */
    public void setDiscount(org.mule.module.netsuite.api.internal.SearchColumnStringField[] discount) {
        this.discount = discount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getDiscount(int i) {
        return this.discount[i];
    }

    public void setDiscount(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.discount[i] = _value;
    }


    /**
     * Gets the discountAmount value for this PromotionCodeSearchRowBasic.
     * 
     * @return discountAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getDiscountAmount() {
        return discountAmount;
    }


    /**
     * Sets the discountAmount value for this PromotionCodeSearchRowBasic.
     * 
     * @param discountAmount
     */
    public void setDiscountAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] discountAmount) {
        this.discountAmount = discountAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getDiscountAmount(int i) {
        return this.discountAmount[i];
    }

    public void setDiscountAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.discountAmount[i] = _value;
    }


    /**
     * Gets the endDate value for this PromotionCodeSearchRowBasic.
     * 
     * @return endDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this PromotionCodeSearchRowBasic.
     * 
     * @param endDate
     */
    public void setEndDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] endDate) {
        this.endDate = endDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getEndDate(int i) {
        return this.endDate[i];
    }

    public void setEndDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.endDate[i] = _value;
    }


    /**
     * Gets the internalId value for this PromotionCodeSearchRowBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this PromotionCodeSearchRowBasic.
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
     * Gets the isInactive value for this PromotionCodeSearchRowBasic.
     * 
     * @return isInactive
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this PromotionCodeSearchRowBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive) {
        this.isInactive = isInactive;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isInactive[i] = _value;
    }


    /**
     * Gets the isPublic value for this PromotionCodeSearchRowBasic.
     * 
     * @return isPublic
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsPublic() {
        return isPublic;
    }


    /**
     * Sets the isPublic value for this PromotionCodeSearchRowBasic.
     * 
     * @param isPublic
     */
    public void setIsPublic(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isPublic) {
        this.isPublic = isPublic;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsPublic(int i) {
        return this.isPublic[i];
    }

    public void setIsPublic(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isPublic[i] = _value;
    }


    /**
     * Gets the startDate value for this PromotionCodeSearchRowBasic.
     * 
     * @return startDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this PromotionCodeSearchRowBasic.
     * 
     * @param startDate
     */
    public void setStartDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDate) {
        this.startDate = startDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getStartDate(int i) {
        return this.startDate[i];
    }

    public void setStartDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.startDate[i] = _value;
    }


    /**
     * Gets the customFieldList value for this PromotionCodeSearchRowBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this PromotionCodeSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PromotionCodeSearchRowBasic)) return false;
        PromotionCodeSearchRowBasic other = (PromotionCodeSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              java.util.Arrays.equals(this.code, other.getCode()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.discount==null && other.getDiscount()==null) || 
             (this.discount!=null &&
              java.util.Arrays.equals(this.discount, other.getDiscount()))) &&
            ((this.discountAmount==null && other.getDiscountAmount()==null) || 
             (this.discountAmount!=null &&
              java.util.Arrays.equals(this.discountAmount, other.getDiscountAmount()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              java.util.Arrays.equals(this.endDate, other.getEndDate()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.isPublic==null && other.getIsPublic()==null) || 
             (this.isPublic!=null &&
              java.util.Arrays.equals(this.isPublic, other.getIsPublic()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              java.util.Arrays.equals(this.startDate, other.getStartDate()))) &&
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
        if (getCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiscount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiscount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiscount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiscountAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiscountAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiscountAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEndDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEndDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEndDate(), i);
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
        if (getIsInactive() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsInactive());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsInactive(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsPublic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsPublic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsPublic(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStartDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStartDate(), i);
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
        new org.apache.axis.description.TypeDesc(PromotionCodeSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "PromotionCodeSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "discountAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPublic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isPublic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
