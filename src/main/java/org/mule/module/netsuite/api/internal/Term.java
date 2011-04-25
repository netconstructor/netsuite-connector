/**
 * Term.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class Term  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.Boolean dateDriven;

    private java.lang.Long daysUntilNetDue;

    private java.lang.Double discountPercent;

    private java.lang.Long daysUntilExpiry;

    private java.lang.Long dayOfMonthNetDue;

    private java.lang.Long dueNextMonthIfWithinDays;

    private java.lang.Double discountPercentDateDriven;

    private java.lang.Long dayDiscountExpires;

    private java.lang.Boolean preferred;

    private java.lang.Boolean isInactive;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Term() {
    }

    public Term(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.lang.String name,
           java.lang.Boolean dateDriven,
           java.lang.Long daysUntilNetDue,
           java.lang.Double discountPercent,
           java.lang.Long daysUntilExpiry,
           java.lang.Long dayOfMonthNetDue,
           java.lang.Long dueNextMonthIfWithinDays,
           java.lang.Double discountPercentDateDriven,
           java.lang.Long dayDiscountExpires,
           java.lang.Boolean preferred,
           java.lang.Boolean isInactive) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.name = name;
        this.dateDriven = dateDriven;
        this.daysUntilNetDue = daysUntilNetDue;
        this.discountPercent = discountPercent;
        this.daysUntilExpiry = daysUntilExpiry;
        this.dayOfMonthNetDue = dayOfMonthNetDue;
        this.dueNextMonthIfWithinDays = dueNextMonthIfWithinDays;
        this.discountPercentDateDriven = discountPercentDateDriven;
        this.dayDiscountExpires = dayDiscountExpires;
        this.preferred = preferred;
        this.isInactive = isInactive;
    }


    /**
     * Gets the name value for this Term.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Term.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the dateDriven value for this Term.
     * 
     * @return dateDriven
     */
    public java.lang.Boolean getDateDriven() {
        return dateDriven;
    }


    /**
     * Sets the dateDriven value for this Term.
     * 
     * @param dateDriven
     */
    public void setDateDriven(java.lang.Boolean dateDriven) {
        this.dateDriven = dateDriven;
    }


    /**
     * Gets the daysUntilNetDue value for this Term.
     * 
     * @return daysUntilNetDue
     */
    public java.lang.Long getDaysUntilNetDue() {
        return daysUntilNetDue;
    }


    /**
     * Sets the daysUntilNetDue value for this Term.
     * 
     * @param daysUntilNetDue
     */
    public void setDaysUntilNetDue(java.lang.Long daysUntilNetDue) {
        this.daysUntilNetDue = daysUntilNetDue;
    }


    /**
     * Gets the discountPercent value for this Term.
     * 
     * @return discountPercent
     */
    public java.lang.Double getDiscountPercent() {
        return discountPercent;
    }


    /**
     * Sets the discountPercent value for this Term.
     * 
     * @param discountPercent
     */
    public void setDiscountPercent(java.lang.Double discountPercent) {
        this.discountPercent = discountPercent;
    }


    /**
     * Gets the daysUntilExpiry value for this Term.
     * 
     * @return daysUntilExpiry
     */
    public java.lang.Long getDaysUntilExpiry() {
        return daysUntilExpiry;
    }


    /**
     * Sets the daysUntilExpiry value for this Term.
     * 
     * @param daysUntilExpiry
     */
    public void setDaysUntilExpiry(java.lang.Long daysUntilExpiry) {
        this.daysUntilExpiry = daysUntilExpiry;
    }


    /**
     * Gets the dayOfMonthNetDue value for this Term.
     * 
     * @return dayOfMonthNetDue
     */
    public java.lang.Long getDayOfMonthNetDue() {
        return dayOfMonthNetDue;
    }


    /**
     * Sets the dayOfMonthNetDue value for this Term.
     * 
     * @param dayOfMonthNetDue
     */
    public void setDayOfMonthNetDue(java.lang.Long dayOfMonthNetDue) {
        this.dayOfMonthNetDue = dayOfMonthNetDue;
    }


    /**
     * Gets the dueNextMonthIfWithinDays value for this Term.
     * 
     * @return dueNextMonthIfWithinDays
     */
    public java.lang.Long getDueNextMonthIfWithinDays() {
        return dueNextMonthIfWithinDays;
    }


    /**
     * Sets the dueNextMonthIfWithinDays value for this Term.
     * 
     * @param dueNextMonthIfWithinDays
     */
    public void setDueNextMonthIfWithinDays(java.lang.Long dueNextMonthIfWithinDays) {
        this.dueNextMonthIfWithinDays = dueNextMonthIfWithinDays;
    }


    /**
     * Gets the discountPercentDateDriven value for this Term.
     * 
     * @return discountPercentDateDriven
     */
    public java.lang.Double getDiscountPercentDateDriven() {
        return discountPercentDateDriven;
    }


    /**
     * Sets the discountPercentDateDriven value for this Term.
     * 
     * @param discountPercentDateDriven
     */
    public void setDiscountPercentDateDriven(java.lang.Double discountPercentDateDriven) {
        this.discountPercentDateDriven = discountPercentDateDriven;
    }


    /**
     * Gets the dayDiscountExpires value for this Term.
     * 
     * @return dayDiscountExpires
     */
    public java.lang.Long getDayDiscountExpires() {
        return dayDiscountExpires;
    }


    /**
     * Sets the dayDiscountExpires value for this Term.
     * 
     * @param dayDiscountExpires
     */
    public void setDayDiscountExpires(java.lang.Long dayDiscountExpires) {
        this.dayDiscountExpires = dayDiscountExpires;
    }


    /**
     * Gets the preferred value for this Term.
     * 
     * @return preferred
     */
    public java.lang.Boolean getPreferred() {
        return preferred;
    }


    /**
     * Sets the preferred value for this Term.
     * 
     * @param preferred
     */
    public void setPreferred(java.lang.Boolean preferred) {
        this.preferred = preferred;
    }


    /**
     * Gets the isInactive value for this Term.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this Term.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the internalId value for this Term.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Term.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Term.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Term.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Term)) return false;
        Term other = (Term) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.dateDriven==null && other.getDateDriven()==null) || 
             (this.dateDriven!=null &&
              this.dateDriven.equals(other.getDateDriven()))) &&
            ((this.daysUntilNetDue==null && other.getDaysUntilNetDue()==null) || 
             (this.daysUntilNetDue!=null &&
              this.daysUntilNetDue.equals(other.getDaysUntilNetDue()))) &&
            ((this.discountPercent==null && other.getDiscountPercent()==null) || 
             (this.discountPercent!=null &&
              this.discountPercent.equals(other.getDiscountPercent()))) &&
            ((this.daysUntilExpiry==null && other.getDaysUntilExpiry()==null) || 
             (this.daysUntilExpiry!=null &&
              this.daysUntilExpiry.equals(other.getDaysUntilExpiry()))) &&
            ((this.dayOfMonthNetDue==null && other.getDayOfMonthNetDue()==null) || 
             (this.dayOfMonthNetDue!=null &&
              this.dayOfMonthNetDue.equals(other.getDayOfMonthNetDue()))) &&
            ((this.dueNextMonthIfWithinDays==null && other.getDueNextMonthIfWithinDays()==null) || 
             (this.dueNextMonthIfWithinDays!=null &&
              this.dueNextMonthIfWithinDays.equals(other.getDueNextMonthIfWithinDays()))) &&
            ((this.discountPercentDateDriven==null && other.getDiscountPercentDateDriven()==null) || 
             (this.discountPercentDateDriven!=null &&
              this.discountPercentDateDriven.equals(other.getDiscountPercentDateDriven()))) &&
            ((this.dayDiscountExpires==null && other.getDayDiscountExpires()==null) || 
             (this.dayDiscountExpires!=null &&
              this.dayDiscountExpires.equals(other.getDayDiscountExpires()))) &&
            ((this.preferred==null && other.getPreferred()==null) || 
             (this.preferred!=null &&
              this.preferred.equals(other.getPreferred()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDateDriven() != null) {
            _hashCode += getDateDriven().hashCode();
        }
        if (getDaysUntilNetDue() != null) {
            _hashCode += getDaysUntilNetDue().hashCode();
        }
        if (getDiscountPercent() != null) {
            _hashCode += getDiscountPercent().hashCode();
        }
        if (getDaysUntilExpiry() != null) {
            _hashCode += getDaysUntilExpiry().hashCode();
        }
        if (getDayOfMonthNetDue() != null) {
            _hashCode += getDayOfMonthNetDue().hashCode();
        }
        if (getDueNextMonthIfWithinDays() != null) {
            _hashCode += getDueNextMonthIfWithinDays().hashCode();
        }
        if (getDiscountPercentDateDriven() != null) {
            _hashCode += getDiscountPercentDateDriven().hashCode();
        }
        if (getDayDiscountExpires() != null) {
            _hashCode += getDayDiscountExpires().hashCode();
        }
        if (getPreferred() != null) {
            _hashCode += getPreferred().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Term.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "Term"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "externalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateDriven");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "dateDriven"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysUntilNetDue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "daysUntilNetDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "discountPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysUntilExpiry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "daysUntilExpiry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfMonthNetDue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "dayOfMonthNetDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueNextMonthIfWithinDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "dueNextMonthIfWithinDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountPercentDateDriven");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "discountPercentDateDriven"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayDiscountExpires");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "dayDiscountExpires"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferred");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "preferred"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isInactive"));
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
