/**
 * AccountSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class AccountSearchRowBasic  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] balance;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] cashFlowRateType;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] category1099Misc;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] description;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] generalRateType;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] name;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] number;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] subsidiary;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] type;

    private org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList;

    public AccountSearchRowBasic() {
    }

    public AccountSearchRowBasic(
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] balance,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] cashFlowRateType,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] category1099Misc,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] description,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] generalRateType,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] name,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] number,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] subsidiary,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] type,
           org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
           this.balance = balance;
           this.cashFlowRateType = cashFlowRateType;
           this.category1099Misc = category1099Misc;
           this.description = description;
           this.externalId = externalId;
           this.generalRateType = generalRateType;
           this.internalId = internalId;
           this.isInactive = isInactive;
           this.name = name;
           this.number = number;
           this.subsidiary = subsidiary;
           this.type = type;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the balance value for this AccountSearchRowBasic.
     * 
     * @return balance
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this AccountSearchRowBasic.
     * 
     * @param balance
     */
    public void setBalance(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] balance) {
        this.balance = balance;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getBalance(int i) {
        return this.balance[i];
    }

    public void setBalance(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.balance[i] = _value;
    }


    /**
     * Gets the cashFlowRateType value for this AccountSearchRowBasic.
     * 
     * @return cashFlowRateType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getCashFlowRateType() {
        return cashFlowRateType;
    }


    /**
     * Sets the cashFlowRateType value for this AccountSearchRowBasic.
     * 
     * @param cashFlowRateType
     */
    public void setCashFlowRateType(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] cashFlowRateType) {
        this.cashFlowRateType = cashFlowRateType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getCashFlowRateType(int i) {
        return this.cashFlowRateType[i];
    }

    public void setCashFlowRateType(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.cashFlowRateType[i] = _value;
    }


    /**
     * Gets the category1099Misc value for this AccountSearchRowBasic.
     * 
     * @return category1099Misc
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getCategory1099Misc() {
        return category1099Misc;
    }


    /**
     * Sets the category1099Misc value for this AccountSearchRowBasic.
     * 
     * @param category1099Misc
     */
    public void setCategory1099Misc(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] category1099Misc) {
        this.category1099Misc = category1099Misc;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getCategory1099Misc(int i) {
        return this.category1099Misc[i];
    }

    public void setCategory1099Misc(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.category1099Misc[i] = _value;
    }


    /**
     * Gets the description value for this AccountSearchRowBasic.
     * 
     * @return description
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AccountSearchRowBasic.
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
     * Gets the externalId value for this AccountSearchRowBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this AccountSearchRowBasic.
     * 
     * @param externalId
     */
    public void setExternalId(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }


    /**
     * Gets the generalRateType value for this AccountSearchRowBasic.
     * 
     * @return generalRateType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getGeneralRateType() {
        return generalRateType;
    }


    /**
     * Sets the generalRateType value for this AccountSearchRowBasic.
     * 
     * @param generalRateType
     */
    public void setGeneralRateType(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] generalRateType) {
        this.generalRateType = generalRateType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getGeneralRateType(int i) {
        return this.generalRateType[i];
    }

    public void setGeneralRateType(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.generalRateType[i] = _value;
    }


    /**
     * Gets the internalId value for this AccountSearchRowBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this AccountSearchRowBasic.
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
     * Gets the isInactive value for this AccountSearchRowBasic.
     * 
     * @return isInactive
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this AccountSearchRowBasic.
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
     * Gets the name value for this AccountSearchRowBasic.
     * 
     * @return name
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this AccountSearchRowBasic.
     * 
     * @param name
     */
    public void setName(org.mule.module.netsuite.api.internal.SearchColumnStringField[] name) {
        this.name = name;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.name[i] = _value;
    }


    /**
     * Gets the number value for this AccountSearchRowBasic.
     * 
     * @return number
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getNumber() {
        return number;
    }


    /**
     * Sets the number value for this AccountSearchRowBasic.
     * 
     * @param number
     */
    public void setNumber(org.mule.module.netsuite.api.internal.SearchColumnStringField[] number) {
        this.number = number;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getNumber(int i) {
        return this.number[i];
    }

    public void setNumber(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.number[i] = _value;
    }


    /**
     * Gets the subsidiary value for this AccountSearchRowBasic.
     * 
     * @return subsidiary
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this AccountSearchRowBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] subsidiary) {
        this.subsidiary = subsidiary;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getSubsidiary(int i) {
        return this.subsidiary[i];
    }

    public void setSubsidiary(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.subsidiary[i] = _value;
    }


    /**
     * Gets the type value for this AccountSearchRowBasic.
     * 
     * @return type
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getType() {
        return type;
    }


    /**
     * Sets the type value for this AccountSearchRowBasic.
     * 
     * @param type
     */
    public void setType(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] type) {
        this.type = type;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getType(int i) {
        return this.type[i];
    }

    public void setType(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.type[i] = _value;
    }


    /**
     * Gets the customFieldList value for this AccountSearchRowBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this AccountSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountSearchRowBasic)) return false;
        AccountSearchRowBasic other = (AccountSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              java.util.Arrays.equals(this.balance, other.getBalance()))) &&
            ((this.cashFlowRateType==null && other.getCashFlowRateType()==null) || 
             (this.cashFlowRateType!=null &&
              java.util.Arrays.equals(this.cashFlowRateType, other.getCashFlowRateType()))) &&
            ((this.category1099Misc==null && other.getCategory1099Misc()==null) || 
             (this.category1099Misc!=null &&
              java.util.Arrays.equals(this.category1099Misc, other.getCategory1099Misc()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.generalRateType==null && other.getGeneralRateType()==null) || 
             (this.generalRateType!=null &&
              java.util.Arrays.equals(this.generalRateType, other.getGeneralRateType()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              java.util.Arrays.equals(this.number, other.getNumber()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType()))) &&
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
        if (getBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBalance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCashFlowRateType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCashFlowRateType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCashFlowRateType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCategory1099Misc() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategory1099Misc());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategory1099Misc(), i);
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
        if (getExternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGeneralRateType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGeneralRateType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGeneralRateType(), i);
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
        if (getName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getType(), i);
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
        new org.apache.axis.description.TypeDesc(AccountSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "AccountSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashFlowRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "cashFlowRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category1099Misc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "category1099Misc"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generalRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "generalRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
