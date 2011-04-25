/**
 * TermSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class TermSearchBasic  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchBooleanField dateDriven;

    private org.mule.module.netsuite.api.internal.SearchLongField dayDiscountExpires;

    private org.mule.module.netsuite.api.internal.SearchLongField dayOfMonthNetDue;

    private org.mule.module.netsuite.api.internal.SearchLongField daysUntilExpiry;

    private org.mule.module.netsuite.api.internal.SearchLongField daysUntilNetDue;

    private org.mule.module.netsuite.api.internal.SearchDoubleField discountPercent;

    private org.mule.module.netsuite.api.internal.SearchDoubleField discountPercentDateDriven;

    private org.mule.module.netsuite.api.internal.SearchLongField dueNextMonthIfWithinDays;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId;

    private org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isInactive;

    private org.mule.module.netsuite.api.internal.SearchStringField name;

    private org.mule.module.netsuite.api.internal.SearchBooleanField preferred;

    public TermSearchBasic() {
    }

    public TermSearchBasic(
           org.mule.module.netsuite.api.internal.SearchBooleanField dateDriven,
           org.mule.module.netsuite.api.internal.SearchLongField dayDiscountExpires,
           org.mule.module.netsuite.api.internal.SearchLongField dayOfMonthNetDue,
           org.mule.module.netsuite.api.internal.SearchLongField daysUntilExpiry,
           org.mule.module.netsuite.api.internal.SearchLongField daysUntilNetDue,
           org.mule.module.netsuite.api.internal.SearchDoubleField discountPercent,
           org.mule.module.netsuite.api.internal.SearchDoubleField discountPercentDateDriven,
           org.mule.module.netsuite.api.internal.SearchLongField dueNextMonthIfWithinDays,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId,
           org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber,
           org.mule.module.netsuite.api.internal.SearchBooleanField isInactive,
           org.mule.module.netsuite.api.internal.SearchStringField name,
           org.mule.module.netsuite.api.internal.SearchBooleanField preferred) {
        this.dateDriven = dateDriven;
        this.dayDiscountExpires = dayDiscountExpires;
        this.dayOfMonthNetDue = dayOfMonthNetDue;
        this.daysUntilExpiry = daysUntilExpiry;
        this.daysUntilNetDue = daysUntilNetDue;
        this.discountPercent = discountPercent;
        this.discountPercentDateDriven = discountPercentDateDriven;
        this.dueNextMonthIfWithinDays = dueNextMonthIfWithinDays;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.name = name;
        this.preferred = preferred;
    }


    /**
     * Gets the dateDriven value for this TermSearchBasic.
     * 
     * @return dateDriven
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getDateDriven() {
        return dateDriven;
    }


    /**
     * Sets the dateDriven value for this TermSearchBasic.
     * 
     * @param dateDriven
     */
    public void setDateDriven(org.mule.module.netsuite.api.internal.SearchBooleanField dateDriven) {
        this.dateDriven = dateDriven;
    }


    /**
     * Gets the dayDiscountExpires value for this TermSearchBasic.
     * 
     * @return dayDiscountExpires
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getDayDiscountExpires() {
        return dayDiscountExpires;
    }


    /**
     * Sets the dayDiscountExpires value for this TermSearchBasic.
     * 
     * @param dayDiscountExpires
     */
    public void setDayDiscountExpires(org.mule.module.netsuite.api.internal.SearchLongField dayDiscountExpires) {
        this.dayDiscountExpires = dayDiscountExpires;
    }


    /**
     * Gets the dayOfMonthNetDue value for this TermSearchBasic.
     * 
     * @return dayOfMonthNetDue
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getDayOfMonthNetDue() {
        return dayOfMonthNetDue;
    }


    /**
     * Sets the dayOfMonthNetDue value for this TermSearchBasic.
     * 
     * @param dayOfMonthNetDue
     */
    public void setDayOfMonthNetDue(org.mule.module.netsuite.api.internal.SearchLongField dayOfMonthNetDue) {
        this.dayOfMonthNetDue = dayOfMonthNetDue;
    }


    /**
     * Gets the daysUntilExpiry value for this TermSearchBasic.
     * 
     * @return daysUntilExpiry
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getDaysUntilExpiry() {
        return daysUntilExpiry;
    }


    /**
     * Sets the daysUntilExpiry value for this TermSearchBasic.
     * 
     * @param daysUntilExpiry
     */
    public void setDaysUntilExpiry(org.mule.module.netsuite.api.internal.SearchLongField daysUntilExpiry) {
        this.daysUntilExpiry = daysUntilExpiry;
    }


    /**
     * Gets the daysUntilNetDue value for this TermSearchBasic.
     * 
     * @return daysUntilNetDue
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getDaysUntilNetDue() {
        return daysUntilNetDue;
    }


    /**
     * Sets the daysUntilNetDue value for this TermSearchBasic.
     * 
     * @param daysUntilNetDue
     */
    public void setDaysUntilNetDue(org.mule.module.netsuite.api.internal.SearchLongField daysUntilNetDue) {
        this.daysUntilNetDue = daysUntilNetDue;
    }


    /**
     * Gets the discountPercent value for this TermSearchBasic.
     * 
     * @return discountPercent
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getDiscountPercent() {
        return discountPercent;
    }


    /**
     * Sets the discountPercent value for this TermSearchBasic.
     * 
     * @param discountPercent
     */
    public void setDiscountPercent(org.mule.module.netsuite.api.internal.SearchDoubleField discountPercent) {
        this.discountPercent = discountPercent;
    }


    /**
     * Gets the discountPercentDateDriven value for this TermSearchBasic.
     * 
     * @return discountPercentDateDriven
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getDiscountPercentDateDriven() {
        return discountPercentDateDriven;
    }


    /**
     * Sets the discountPercentDateDriven value for this TermSearchBasic.
     * 
     * @param discountPercentDateDriven
     */
    public void setDiscountPercentDateDriven(org.mule.module.netsuite.api.internal.SearchDoubleField discountPercentDateDriven) {
        this.discountPercentDateDriven = discountPercentDateDriven;
    }


    /**
     * Gets the dueNextMonthIfWithinDays value for this TermSearchBasic.
     * 
     * @return dueNextMonthIfWithinDays
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getDueNextMonthIfWithinDays() {
        return dueNextMonthIfWithinDays;
    }


    /**
     * Sets the dueNextMonthIfWithinDays value for this TermSearchBasic.
     * 
     * @param dueNextMonthIfWithinDays
     */
    public void setDueNextMonthIfWithinDays(org.mule.module.netsuite.api.internal.SearchLongField dueNextMonthIfWithinDays) {
        this.dueNextMonthIfWithinDays = dueNextMonthIfWithinDays;
    }


    /**
     * Gets the internalId value for this TermSearchBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TermSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this TermSearchBasic.
     * 
     * @return internalIdNumber
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this TermSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isInactive value for this TermSearchBasic.
     * 
     * @return isInactive
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this TermSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(org.mule.module.netsuite.api.internal.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the name value for this TermSearchBasic.
     * 
     * @return name
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getName() {
        return name;
    }


    /**
     * Sets the name value for this TermSearchBasic.
     * 
     * @param name
     */
    public void setName(org.mule.module.netsuite.api.internal.SearchStringField name) {
        this.name = name;
    }


    /**
     * Gets the preferred value for this TermSearchBasic.
     * 
     * @return preferred
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getPreferred() {
        return preferred;
    }


    /**
     * Sets the preferred value for this TermSearchBasic.
     * 
     * @param preferred
     */
    public void setPreferred(org.mule.module.netsuite.api.internal.SearchBooleanField preferred) {
        this.preferred = preferred;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TermSearchBasic)) return false;
        TermSearchBasic other = (TermSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dateDriven==null && other.getDateDriven()==null) || 
             (this.dateDriven!=null &&
              this.dateDriven.equals(other.getDateDriven()))) &&
            ((this.dayDiscountExpires==null && other.getDayDiscountExpires()==null) || 
             (this.dayDiscountExpires!=null &&
              this.dayDiscountExpires.equals(other.getDayDiscountExpires()))) &&
            ((this.dayOfMonthNetDue==null && other.getDayOfMonthNetDue()==null) || 
             (this.dayOfMonthNetDue!=null &&
              this.dayOfMonthNetDue.equals(other.getDayOfMonthNetDue()))) &&
            ((this.daysUntilExpiry==null && other.getDaysUntilExpiry()==null) || 
             (this.daysUntilExpiry!=null &&
              this.daysUntilExpiry.equals(other.getDaysUntilExpiry()))) &&
            ((this.daysUntilNetDue==null && other.getDaysUntilNetDue()==null) || 
             (this.daysUntilNetDue!=null &&
              this.daysUntilNetDue.equals(other.getDaysUntilNetDue()))) &&
            ((this.discountPercent==null && other.getDiscountPercent()==null) || 
             (this.discountPercent!=null &&
              this.discountPercent.equals(other.getDiscountPercent()))) &&
            ((this.discountPercentDateDriven==null && other.getDiscountPercentDateDriven()==null) || 
             (this.discountPercentDateDriven!=null &&
              this.discountPercentDateDriven.equals(other.getDiscountPercentDateDriven()))) &&
            ((this.dueNextMonthIfWithinDays==null && other.getDueNextMonthIfWithinDays()==null) || 
             (this.dueNextMonthIfWithinDays!=null &&
              this.dueNextMonthIfWithinDays.equals(other.getDueNextMonthIfWithinDays()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.preferred==null && other.getPreferred()==null) || 
             (this.preferred!=null &&
              this.preferred.equals(other.getPreferred())));
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
        if (getDateDriven() != null) {
            _hashCode += getDateDriven().hashCode();
        }
        if (getDayDiscountExpires() != null) {
            _hashCode += getDayDiscountExpires().hashCode();
        }
        if (getDayOfMonthNetDue() != null) {
            _hashCode += getDayOfMonthNetDue().hashCode();
        }
        if (getDaysUntilExpiry() != null) {
            _hashCode += getDaysUntilExpiry().hashCode();
        }
        if (getDaysUntilNetDue() != null) {
            _hashCode += getDaysUntilNetDue().hashCode();
        }
        if (getDiscountPercent() != null) {
            _hashCode += getDiscountPercent().hashCode();
        }
        if (getDiscountPercentDateDriven() != null) {
            _hashCode += getDiscountPercentDateDriven().hashCode();
        }
        if (getDueNextMonthIfWithinDays() != null) {
            _hashCode += getDueNextMonthIfWithinDays().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPreferred() != null) {
            _hashCode += getPreferred().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TermSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TermSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateDriven");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "dateDriven"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayDiscountExpires");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "dayDiscountExpires"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfMonthNetDue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "dayOfMonthNetDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysUntilExpiry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "daysUntilExpiry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysUntilNetDue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "daysUntilNetDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "discountPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountPercentDateDriven");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "discountPercentDateDriven"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueNextMonthIfWithinDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "dueNextMonthIfWithinDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferred");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "preferred"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
