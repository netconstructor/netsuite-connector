/**
 * AccountingPeriodSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class AccountingPeriodSearchBasic  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchBooleanField allLocked;

    private org.mule.module.netsuite.api.internal.SearchBooleanField allowNonGlChanges;

    private org.mule.module.netsuite.api.internal.SearchBooleanField apLocked;

    private org.mule.module.netsuite.api.internal.SearchBooleanField arLocked;

    private org.mule.module.netsuite.api.internal.SearchBooleanField closed;

    private org.mule.module.netsuite.api.internal.SearchDateField closedOnDate;

    private org.mule.module.netsuite.api.internal.SearchDateField endDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId;

    private org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isAdjust;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isInactive;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isQuarter;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isYear;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField parent;

    private org.mule.module.netsuite.api.internal.SearchBooleanField payrollLocked;

    private org.mule.module.netsuite.api.internal.SearchStringField periodName;

    private org.mule.module.netsuite.api.internal.SearchDateField startDate;

    public AccountingPeriodSearchBasic() {
    }

    public AccountingPeriodSearchBasic(
           org.mule.module.netsuite.api.internal.SearchBooleanField allLocked,
           org.mule.module.netsuite.api.internal.SearchBooleanField allowNonGlChanges,
           org.mule.module.netsuite.api.internal.SearchBooleanField apLocked,
           org.mule.module.netsuite.api.internal.SearchBooleanField arLocked,
           org.mule.module.netsuite.api.internal.SearchBooleanField closed,
           org.mule.module.netsuite.api.internal.SearchDateField closedOnDate,
           org.mule.module.netsuite.api.internal.SearchDateField endDate,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId,
           org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber,
           org.mule.module.netsuite.api.internal.SearchBooleanField isAdjust,
           org.mule.module.netsuite.api.internal.SearchBooleanField isInactive,
           org.mule.module.netsuite.api.internal.SearchBooleanField isQuarter,
           org.mule.module.netsuite.api.internal.SearchBooleanField isYear,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField parent,
           org.mule.module.netsuite.api.internal.SearchBooleanField payrollLocked,
           org.mule.module.netsuite.api.internal.SearchStringField periodName,
           org.mule.module.netsuite.api.internal.SearchDateField startDate) {
        this.allLocked = allLocked;
        this.allowNonGlChanges = allowNonGlChanges;
        this.apLocked = apLocked;
        this.arLocked = arLocked;
        this.closed = closed;
        this.closedOnDate = closedOnDate;
        this.endDate = endDate;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isAdjust = isAdjust;
        this.isInactive = isInactive;
        this.isQuarter = isQuarter;
        this.isYear = isYear;
        this.parent = parent;
        this.payrollLocked = payrollLocked;
        this.periodName = periodName;
        this.startDate = startDate;
    }


    /**
     * Gets the allLocked value for this AccountingPeriodSearchBasic.
     * 
     * @return allLocked
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getAllLocked() {
        return allLocked;
    }


    /**
     * Sets the allLocked value for this AccountingPeriodSearchBasic.
     * 
     * @param allLocked
     */
    public void setAllLocked(org.mule.module.netsuite.api.internal.SearchBooleanField allLocked) {
        this.allLocked = allLocked;
    }


    /**
     * Gets the allowNonGlChanges value for this AccountingPeriodSearchBasic.
     * 
     * @return allowNonGlChanges
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getAllowNonGlChanges() {
        return allowNonGlChanges;
    }


    /**
     * Sets the allowNonGlChanges value for this AccountingPeriodSearchBasic.
     * 
     * @param allowNonGlChanges
     */
    public void setAllowNonGlChanges(org.mule.module.netsuite.api.internal.SearchBooleanField allowNonGlChanges) {
        this.allowNonGlChanges = allowNonGlChanges;
    }


    /**
     * Gets the apLocked value for this AccountingPeriodSearchBasic.
     * 
     * @return apLocked
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getApLocked() {
        return apLocked;
    }


    /**
     * Sets the apLocked value for this AccountingPeriodSearchBasic.
     * 
     * @param apLocked
     */
    public void setApLocked(org.mule.module.netsuite.api.internal.SearchBooleanField apLocked) {
        this.apLocked = apLocked;
    }


    /**
     * Gets the arLocked value for this AccountingPeriodSearchBasic.
     * 
     * @return arLocked
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getArLocked() {
        return arLocked;
    }


    /**
     * Sets the arLocked value for this AccountingPeriodSearchBasic.
     * 
     * @param arLocked
     */
    public void setArLocked(org.mule.module.netsuite.api.internal.SearchBooleanField arLocked) {
        this.arLocked = arLocked;
    }


    /**
     * Gets the closed value for this AccountingPeriodSearchBasic.
     * 
     * @return closed
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getClosed() {
        return closed;
    }


    /**
     * Sets the closed value for this AccountingPeriodSearchBasic.
     * 
     * @param closed
     */
    public void setClosed(org.mule.module.netsuite.api.internal.SearchBooleanField closed) {
        this.closed = closed;
    }


    /**
     * Gets the closedOnDate value for this AccountingPeriodSearchBasic.
     * 
     * @return closedOnDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getClosedOnDate() {
        return closedOnDate;
    }


    /**
     * Sets the closedOnDate value for this AccountingPeriodSearchBasic.
     * 
     * @param closedOnDate
     */
    public void setClosedOnDate(org.mule.module.netsuite.api.internal.SearchDateField closedOnDate) {
        this.closedOnDate = closedOnDate;
    }


    /**
     * Gets the endDate value for this AccountingPeriodSearchBasic.
     * 
     * @return endDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this AccountingPeriodSearchBasic.
     * 
     * @param endDate
     */
    public void setEndDate(org.mule.module.netsuite.api.internal.SearchDateField endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the internalId value for this AccountingPeriodSearchBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this AccountingPeriodSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this AccountingPeriodSearchBasic.
     * 
     * @return internalIdNumber
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this AccountingPeriodSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isAdjust value for this AccountingPeriodSearchBasic.
     * 
     * @return isAdjust
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsAdjust() {
        return isAdjust;
    }


    /**
     * Sets the isAdjust value for this AccountingPeriodSearchBasic.
     * 
     * @param isAdjust
     */
    public void setIsAdjust(org.mule.module.netsuite.api.internal.SearchBooleanField isAdjust) {
        this.isAdjust = isAdjust;
    }


    /**
     * Gets the isInactive value for this AccountingPeriodSearchBasic.
     * 
     * @return isInactive
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this AccountingPeriodSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(org.mule.module.netsuite.api.internal.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the isQuarter value for this AccountingPeriodSearchBasic.
     * 
     * @return isQuarter
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsQuarter() {
        return isQuarter;
    }


    /**
     * Sets the isQuarter value for this AccountingPeriodSearchBasic.
     * 
     * @param isQuarter
     */
    public void setIsQuarter(org.mule.module.netsuite.api.internal.SearchBooleanField isQuarter) {
        this.isQuarter = isQuarter;
    }


    /**
     * Gets the isYear value for this AccountingPeriodSearchBasic.
     * 
     * @return isYear
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsYear() {
        return isYear;
    }


    /**
     * Sets the isYear value for this AccountingPeriodSearchBasic.
     * 
     * @param isYear
     */
    public void setIsYear(org.mule.module.netsuite.api.internal.SearchBooleanField isYear) {
        this.isYear = isYear;
    }


    /**
     * Gets the parent value for this AccountingPeriodSearchBasic.
     * 
     * @return parent
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this AccountingPeriodSearchBasic.
     * 
     * @param parent
     */
    public void setParent(org.mule.module.netsuite.api.internal.SearchMultiSelectField parent) {
        this.parent = parent;
    }


    /**
     * Gets the payrollLocked value for this AccountingPeriodSearchBasic.
     * 
     * @return payrollLocked
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getPayrollLocked() {
        return payrollLocked;
    }


    /**
     * Sets the payrollLocked value for this AccountingPeriodSearchBasic.
     * 
     * @param payrollLocked
     */
    public void setPayrollLocked(org.mule.module.netsuite.api.internal.SearchBooleanField payrollLocked) {
        this.payrollLocked = payrollLocked;
    }


    /**
     * Gets the periodName value for this AccountingPeriodSearchBasic.
     * 
     * @return periodName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getPeriodName() {
        return periodName;
    }


    /**
     * Sets the periodName value for this AccountingPeriodSearchBasic.
     * 
     * @param periodName
     */
    public void setPeriodName(org.mule.module.netsuite.api.internal.SearchStringField periodName) {
        this.periodName = periodName;
    }


    /**
     * Gets the startDate value for this AccountingPeriodSearchBasic.
     * 
     * @return startDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this AccountingPeriodSearchBasic.
     * 
     * @param startDate
     */
    public void setStartDate(org.mule.module.netsuite.api.internal.SearchDateField startDate) {
        this.startDate = startDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountingPeriodSearchBasic)) return false;
        AccountingPeriodSearchBasic other = (AccountingPeriodSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.allLocked==null && other.getAllLocked()==null) || 
             (this.allLocked!=null &&
              this.allLocked.equals(other.getAllLocked()))) &&
            ((this.allowNonGlChanges==null && other.getAllowNonGlChanges()==null) || 
             (this.allowNonGlChanges!=null &&
              this.allowNonGlChanges.equals(other.getAllowNonGlChanges()))) &&
            ((this.apLocked==null && other.getApLocked()==null) || 
             (this.apLocked!=null &&
              this.apLocked.equals(other.getApLocked()))) &&
            ((this.arLocked==null && other.getArLocked()==null) || 
             (this.arLocked!=null &&
              this.arLocked.equals(other.getArLocked()))) &&
            ((this.closed==null && other.getClosed()==null) || 
             (this.closed!=null &&
              this.closed.equals(other.getClosed()))) &&
            ((this.closedOnDate==null && other.getClosedOnDate()==null) || 
             (this.closedOnDate!=null &&
              this.closedOnDate.equals(other.getClosedOnDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isAdjust==null && other.getIsAdjust()==null) || 
             (this.isAdjust!=null &&
              this.isAdjust.equals(other.getIsAdjust()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.isQuarter==null && other.getIsQuarter()==null) || 
             (this.isQuarter!=null &&
              this.isQuarter.equals(other.getIsQuarter()))) &&
            ((this.isYear==null && other.getIsYear()==null) || 
             (this.isYear!=null &&
              this.isYear.equals(other.getIsYear()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.payrollLocked==null && other.getPayrollLocked()==null) || 
             (this.payrollLocked!=null &&
              this.payrollLocked.equals(other.getPayrollLocked()))) &&
            ((this.periodName==null && other.getPeriodName()==null) || 
             (this.periodName!=null &&
              this.periodName.equals(other.getPeriodName()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate())));
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
        if (getAllLocked() != null) {
            _hashCode += getAllLocked().hashCode();
        }
        if (getAllowNonGlChanges() != null) {
            _hashCode += getAllowNonGlChanges().hashCode();
        }
        if (getApLocked() != null) {
            _hashCode += getApLocked().hashCode();
        }
        if (getArLocked() != null) {
            _hashCode += getArLocked().hashCode();
        }
        if (getClosed() != null) {
            _hashCode += getClosed().hashCode();
        }
        if (getClosedOnDate() != null) {
            _hashCode += getClosedOnDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsAdjust() != null) {
            _hashCode += getIsAdjust().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getIsQuarter() != null) {
            _hashCode += getIsQuarter().hashCode();
        }
        if (getIsYear() != null) {
            _hashCode += getIsYear().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getPayrollLocked() != null) {
            _hashCode += getPayrollLocked().hashCode();
        }
        if (getPeriodName() != null) {
            _hashCode += getPeriodName().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountingPeriodSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "AccountingPeriodSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allLocked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "allLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowNonGlChanges");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "allowNonGlChanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apLocked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "apLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arLocked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "arLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "closed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedOnDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "closedOnDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("isAdjust");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isAdjust"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("isQuarter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isQuarter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isYear");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollLocked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "payrollLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "periodName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
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
