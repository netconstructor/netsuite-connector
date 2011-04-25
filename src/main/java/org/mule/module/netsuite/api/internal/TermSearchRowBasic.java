/**
 * TermSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class TermSearchRowBasic  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] dateDriven;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] dayDiscountExpires;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] dayOfMonthNetDue;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] daysUntilExpiry;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] daysUntilNetDue;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] discountPercent;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] discountPercentDateDriven;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] dueNextMonthIfWithinDays;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] name;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] preferred;

    public TermSearchRowBasic() {
    }

    public TermSearchRowBasic(
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] dateDriven,
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] dayDiscountExpires,
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] dayOfMonthNetDue,
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] daysUntilExpiry,
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] daysUntilNetDue,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] discountPercent,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] discountPercentDateDriven,
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] dueNextMonthIfWithinDays,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] name,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] preferred) {
           this.dateDriven = dateDriven;
           this.dayDiscountExpires = dayDiscountExpires;
           this.dayOfMonthNetDue = dayOfMonthNetDue;
           this.daysUntilExpiry = daysUntilExpiry;
           this.daysUntilNetDue = daysUntilNetDue;
           this.discountPercent = discountPercent;
           this.discountPercentDateDriven = discountPercentDateDriven;
           this.dueNextMonthIfWithinDays = dueNextMonthIfWithinDays;
           this.internalId = internalId;
           this.isInactive = isInactive;
           this.name = name;
           this.preferred = preferred;
    }


    /**
     * Gets the dateDriven value for this TermSearchRowBasic.
     * 
     * @return dateDriven
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getDateDriven() {
        return dateDriven;
    }


    /**
     * Sets the dateDriven value for this TermSearchRowBasic.
     * 
     * @param dateDriven
     */
    public void setDateDriven(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] dateDriven) {
        this.dateDriven = dateDriven;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getDateDriven(int i) {
        return this.dateDriven[i];
    }

    public void setDateDriven(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.dateDriven[i] = _value;
    }


    /**
     * Gets the dayDiscountExpires value for this TermSearchRowBasic.
     * 
     * @return dayDiscountExpires
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getDayDiscountExpires() {
        return dayDiscountExpires;
    }


    /**
     * Sets the dayDiscountExpires value for this TermSearchRowBasic.
     * 
     * @param dayDiscountExpires
     */
    public void setDayDiscountExpires(org.mule.module.netsuite.api.internal.SearchColumnLongField[] dayDiscountExpires) {
        this.dayDiscountExpires = dayDiscountExpires;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getDayDiscountExpires(int i) {
        return this.dayDiscountExpires[i];
    }

    public void setDayDiscountExpires(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.dayDiscountExpires[i] = _value;
    }


    /**
     * Gets the dayOfMonthNetDue value for this TermSearchRowBasic.
     * 
     * @return dayOfMonthNetDue
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getDayOfMonthNetDue() {
        return dayOfMonthNetDue;
    }


    /**
     * Sets the dayOfMonthNetDue value for this TermSearchRowBasic.
     * 
     * @param dayOfMonthNetDue
     */
    public void setDayOfMonthNetDue(org.mule.module.netsuite.api.internal.SearchColumnLongField[] dayOfMonthNetDue) {
        this.dayOfMonthNetDue = dayOfMonthNetDue;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getDayOfMonthNetDue(int i) {
        return this.dayOfMonthNetDue[i];
    }

    public void setDayOfMonthNetDue(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.dayOfMonthNetDue[i] = _value;
    }


    /**
     * Gets the daysUntilExpiry value for this TermSearchRowBasic.
     * 
     * @return daysUntilExpiry
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getDaysUntilExpiry() {
        return daysUntilExpiry;
    }


    /**
     * Sets the daysUntilExpiry value for this TermSearchRowBasic.
     * 
     * @param daysUntilExpiry
     */
    public void setDaysUntilExpiry(org.mule.module.netsuite.api.internal.SearchColumnLongField[] daysUntilExpiry) {
        this.daysUntilExpiry = daysUntilExpiry;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getDaysUntilExpiry(int i) {
        return this.daysUntilExpiry[i];
    }

    public void setDaysUntilExpiry(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.daysUntilExpiry[i] = _value;
    }


    /**
     * Gets the daysUntilNetDue value for this TermSearchRowBasic.
     * 
     * @return daysUntilNetDue
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getDaysUntilNetDue() {
        return daysUntilNetDue;
    }


    /**
     * Sets the daysUntilNetDue value for this TermSearchRowBasic.
     * 
     * @param daysUntilNetDue
     */
    public void setDaysUntilNetDue(org.mule.module.netsuite.api.internal.SearchColumnLongField[] daysUntilNetDue) {
        this.daysUntilNetDue = daysUntilNetDue;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getDaysUntilNetDue(int i) {
        return this.daysUntilNetDue[i];
    }

    public void setDaysUntilNetDue(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.daysUntilNetDue[i] = _value;
    }


    /**
     * Gets the discountPercent value for this TermSearchRowBasic.
     * 
     * @return discountPercent
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getDiscountPercent() {
        return discountPercent;
    }


    /**
     * Sets the discountPercent value for this TermSearchRowBasic.
     * 
     * @param discountPercent
     */
    public void setDiscountPercent(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] discountPercent) {
        this.discountPercent = discountPercent;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getDiscountPercent(int i) {
        return this.discountPercent[i];
    }

    public void setDiscountPercent(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.discountPercent[i] = _value;
    }


    /**
     * Gets the discountPercentDateDriven value for this TermSearchRowBasic.
     * 
     * @return discountPercentDateDriven
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getDiscountPercentDateDriven() {
        return discountPercentDateDriven;
    }


    /**
     * Sets the discountPercentDateDriven value for this TermSearchRowBasic.
     * 
     * @param discountPercentDateDriven
     */
    public void setDiscountPercentDateDriven(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] discountPercentDateDriven) {
        this.discountPercentDateDriven = discountPercentDateDriven;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getDiscountPercentDateDriven(int i) {
        return this.discountPercentDateDriven[i];
    }

    public void setDiscountPercentDateDriven(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.discountPercentDateDriven[i] = _value;
    }


    /**
     * Gets the dueNextMonthIfWithinDays value for this TermSearchRowBasic.
     * 
     * @return dueNextMonthIfWithinDays
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getDueNextMonthIfWithinDays() {
        return dueNextMonthIfWithinDays;
    }


    /**
     * Sets the dueNextMonthIfWithinDays value for this TermSearchRowBasic.
     * 
     * @param dueNextMonthIfWithinDays
     */
    public void setDueNextMonthIfWithinDays(org.mule.module.netsuite.api.internal.SearchColumnLongField[] dueNextMonthIfWithinDays) {
        this.dueNextMonthIfWithinDays = dueNextMonthIfWithinDays;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getDueNextMonthIfWithinDays(int i) {
        return this.dueNextMonthIfWithinDays[i];
    }

    public void setDueNextMonthIfWithinDays(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.dueNextMonthIfWithinDays[i] = _value;
    }


    /**
     * Gets the internalId value for this TermSearchRowBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TermSearchRowBasic.
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
     * Gets the isInactive value for this TermSearchRowBasic.
     * 
     * @return isInactive
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this TermSearchRowBasic.
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
     * Gets the name value for this TermSearchRowBasic.
     * 
     * @return name
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this TermSearchRowBasic.
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
     * Gets the preferred value for this TermSearchRowBasic.
     * 
     * @return preferred
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getPreferred() {
        return preferred;
    }


    /**
     * Sets the preferred value for this TermSearchRowBasic.
     * 
     * @param preferred
     */
    public void setPreferred(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] preferred) {
        this.preferred = preferred;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getPreferred(int i) {
        return this.preferred[i];
    }

    public void setPreferred(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.preferred[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TermSearchRowBasic)) return false;
        TermSearchRowBasic other = (TermSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateDriven==null && other.getDateDriven()==null) || 
             (this.dateDriven!=null &&
              java.util.Arrays.equals(this.dateDriven, other.getDateDriven()))) &&
            ((this.dayDiscountExpires==null && other.getDayDiscountExpires()==null) || 
             (this.dayDiscountExpires!=null &&
              java.util.Arrays.equals(this.dayDiscountExpires, other.getDayDiscountExpires()))) &&
            ((this.dayOfMonthNetDue==null && other.getDayOfMonthNetDue()==null) || 
             (this.dayOfMonthNetDue!=null &&
              java.util.Arrays.equals(this.dayOfMonthNetDue, other.getDayOfMonthNetDue()))) &&
            ((this.daysUntilExpiry==null && other.getDaysUntilExpiry()==null) || 
             (this.daysUntilExpiry!=null &&
              java.util.Arrays.equals(this.daysUntilExpiry, other.getDaysUntilExpiry()))) &&
            ((this.daysUntilNetDue==null && other.getDaysUntilNetDue()==null) || 
             (this.daysUntilNetDue!=null &&
              java.util.Arrays.equals(this.daysUntilNetDue, other.getDaysUntilNetDue()))) &&
            ((this.discountPercent==null && other.getDiscountPercent()==null) || 
             (this.discountPercent!=null &&
              java.util.Arrays.equals(this.discountPercent, other.getDiscountPercent()))) &&
            ((this.discountPercentDateDriven==null && other.getDiscountPercentDateDriven()==null) || 
             (this.discountPercentDateDriven!=null &&
              java.util.Arrays.equals(this.discountPercentDateDriven, other.getDiscountPercentDateDriven()))) &&
            ((this.dueNextMonthIfWithinDays==null && other.getDueNextMonthIfWithinDays()==null) || 
             (this.dueNextMonthIfWithinDays!=null &&
              java.util.Arrays.equals(this.dueNextMonthIfWithinDays, other.getDueNextMonthIfWithinDays()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.preferred==null && other.getPreferred()==null) || 
             (this.preferred!=null &&
              java.util.Arrays.equals(this.preferred, other.getPreferred())));
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
        if (getDateDriven() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDateDriven());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDateDriven(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDayDiscountExpires() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDayDiscountExpires());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDayDiscountExpires(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDayOfMonthNetDue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDayOfMonthNetDue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDayOfMonthNetDue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDaysUntilExpiry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDaysUntilExpiry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDaysUntilExpiry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDaysUntilNetDue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDaysUntilNetDue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDaysUntilNetDue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiscountPercent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiscountPercent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiscountPercent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiscountPercentDateDriven() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiscountPercentDateDriven());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiscountPercentDateDriven(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDueNextMonthIfWithinDays() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDueNextMonthIfWithinDays());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDueNextMonthIfWithinDays(), i);
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
        if (getPreferred() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreferred());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreferred(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TermSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TermSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateDriven");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "dateDriven"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayDiscountExpires");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "dayDiscountExpires"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfMonthNetDue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "dayOfMonthNetDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysUntilExpiry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "daysUntilExpiry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysUntilNetDue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "daysUntilNetDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "discountPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountPercentDateDriven");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "discountPercentDateDriven"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueNextMonthIfWithinDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "dueNextMonthIfWithinDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("preferred");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "preferred"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
