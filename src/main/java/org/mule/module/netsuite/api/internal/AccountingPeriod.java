/**
 * AccountingPeriod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class AccountingPeriod  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private java.lang.String periodName;

    private org.mule.module.netsuite.api.internal.RecordRef parent;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private java.util.Calendar closedOnDate;

    private java.lang.Boolean isAdjust;

    private java.lang.Boolean isQuarter;

    private java.lang.Boolean isYear;

    private java.lang.Boolean closed;

    private java.lang.Boolean apLocked;

    private java.lang.Boolean arLocked;

    private java.lang.Boolean payrollLocked;

    private java.lang.Boolean allLocked;

    private java.lang.Boolean allowNonGLChanges;

    private java.lang.String internalId;  // attribute

    public AccountingPeriod() {
    }

    public AccountingPeriod(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String periodName,
           org.mule.module.netsuite.api.internal.RecordRef parent,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           java.util.Calendar closedOnDate,
           java.lang.Boolean isAdjust,
           java.lang.Boolean isQuarter,
           java.lang.Boolean isYear,
           java.lang.Boolean closed,
           java.lang.Boolean apLocked,
           java.lang.Boolean arLocked,
           java.lang.Boolean payrollLocked,
           java.lang.Boolean allLocked,
           java.lang.Boolean allowNonGLChanges) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.periodName = periodName;
        this.parent = parent;
        this.startDate = startDate;
        this.endDate = endDate;
        this.closedOnDate = closedOnDate;
        this.isAdjust = isAdjust;
        this.isQuarter = isQuarter;
        this.isYear = isYear;
        this.closed = closed;
        this.apLocked = apLocked;
        this.arLocked = arLocked;
        this.payrollLocked = payrollLocked;
        this.allLocked = allLocked;
        this.allowNonGLChanges = allowNonGLChanges;
    }


    /**
     * Gets the periodName value for this AccountingPeriod.
     * 
     * @return periodName
     */
    public java.lang.String getPeriodName() {
        return periodName;
    }


    /**
     * Sets the periodName value for this AccountingPeriod.
     * 
     * @param periodName
     */
    public void setPeriodName(java.lang.String periodName) {
        this.periodName = periodName;
    }


    /**
     * Gets the parent value for this AccountingPeriod.
     * 
     * @return parent
     */
    public org.mule.module.netsuite.api.internal.RecordRef getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this AccountingPeriod.
     * 
     * @param parent
     */
    public void setParent(org.mule.module.netsuite.api.internal.RecordRef parent) {
        this.parent = parent;
    }


    /**
     * Gets the startDate value for this AccountingPeriod.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this AccountingPeriod.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this AccountingPeriod.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this AccountingPeriod.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the closedOnDate value for this AccountingPeriod.
     * 
     * @return closedOnDate
     */
    public java.util.Calendar getClosedOnDate() {
        return closedOnDate;
    }


    /**
     * Sets the closedOnDate value for this AccountingPeriod.
     * 
     * @param closedOnDate
     */
    public void setClosedOnDate(java.util.Calendar closedOnDate) {
        this.closedOnDate = closedOnDate;
    }


    /**
     * Gets the isAdjust value for this AccountingPeriod.
     * 
     * @return isAdjust
     */
    public java.lang.Boolean getIsAdjust() {
        return isAdjust;
    }


    /**
     * Sets the isAdjust value for this AccountingPeriod.
     * 
     * @param isAdjust
     */
    public void setIsAdjust(java.lang.Boolean isAdjust) {
        this.isAdjust = isAdjust;
    }


    /**
     * Gets the isQuarter value for this AccountingPeriod.
     * 
     * @return isQuarter
     */
    public java.lang.Boolean getIsQuarter() {
        return isQuarter;
    }


    /**
     * Sets the isQuarter value for this AccountingPeriod.
     * 
     * @param isQuarter
     */
    public void setIsQuarter(java.lang.Boolean isQuarter) {
        this.isQuarter = isQuarter;
    }


    /**
     * Gets the isYear value for this AccountingPeriod.
     * 
     * @return isYear
     */
    public java.lang.Boolean getIsYear() {
        return isYear;
    }


    /**
     * Sets the isYear value for this AccountingPeriod.
     * 
     * @param isYear
     */
    public void setIsYear(java.lang.Boolean isYear) {
        this.isYear = isYear;
    }


    /**
     * Gets the closed value for this AccountingPeriod.
     * 
     * @return closed
     */
    public java.lang.Boolean getClosed() {
        return closed;
    }


    /**
     * Sets the closed value for this AccountingPeriod.
     * 
     * @param closed
     */
    public void setClosed(java.lang.Boolean closed) {
        this.closed = closed;
    }


    /**
     * Gets the apLocked value for this AccountingPeriod.
     * 
     * @return apLocked
     */
    public java.lang.Boolean getApLocked() {
        return apLocked;
    }


    /**
     * Sets the apLocked value for this AccountingPeriod.
     * 
     * @param apLocked
     */
    public void setApLocked(java.lang.Boolean apLocked) {
        this.apLocked = apLocked;
    }


    /**
     * Gets the arLocked value for this AccountingPeriod.
     * 
     * @return arLocked
     */
    public java.lang.Boolean getArLocked() {
        return arLocked;
    }


    /**
     * Sets the arLocked value for this AccountingPeriod.
     * 
     * @param arLocked
     */
    public void setArLocked(java.lang.Boolean arLocked) {
        this.arLocked = arLocked;
    }


    /**
     * Gets the payrollLocked value for this AccountingPeriod.
     * 
     * @return payrollLocked
     */
    public java.lang.Boolean getPayrollLocked() {
        return payrollLocked;
    }


    /**
     * Sets the payrollLocked value for this AccountingPeriod.
     * 
     * @param payrollLocked
     */
    public void setPayrollLocked(java.lang.Boolean payrollLocked) {
        this.payrollLocked = payrollLocked;
    }


    /**
     * Gets the allLocked value for this AccountingPeriod.
     * 
     * @return allLocked
     */
    public java.lang.Boolean getAllLocked() {
        return allLocked;
    }


    /**
     * Sets the allLocked value for this AccountingPeriod.
     * 
     * @param allLocked
     */
    public void setAllLocked(java.lang.Boolean allLocked) {
        this.allLocked = allLocked;
    }


    /**
     * Gets the allowNonGLChanges value for this AccountingPeriod.
     * 
     * @return allowNonGLChanges
     */
    public java.lang.Boolean getAllowNonGLChanges() {
        return allowNonGLChanges;
    }


    /**
     * Sets the allowNonGLChanges value for this AccountingPeriod.
     * 
     * @param allowNonGLChanges
     */
    public void setAllowNonGLChanges(java.lang.Boolean allowNonGLChanges) {
        this.allowNonGLChanges = allowNonGLChanges;
    }


    /**
     * Gets the internalId value for this AccountingPeriod.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this AccountingPeriod.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountingPeriod)) return false;
        AccountingPeriod other = (AccountingPeriod) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.periodName==null && other.getPeriodName()==null) || 
             (this.periodName!=null &&
              this.periodName.equals(other.getPeriodName()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.closedOnDate==null && other.getClosedOnDate()==null) || 
             (this.closedOnDate!=null &&
              this.closedOnDate.equals(other.getClosedOnDate()))) &&
            ((this.isAdjust==null && other.getIsAdjust()==null) || 
             (this.isAdjust!=null &&
              this.isAdjust.equals(other.getIsAdjust()))) &&
            ((this.isQuarter==null && other.getIsQuarter()==null) || 
             (this.isQuarter!=null &&
              this.isQuarter.equals(other.getIsQuarter()))) &&
            ((this.isYear==null && other.getIsYear()==null) || 
             (this.isYear!=null &&
              this.isYear.equals(other.getIsYear()))) &&
            ((this.closed==null && other.getClosed()==null) || 
             (this.closed!=null &&
              this.closed.equals(other.getClosed()))) &&
            ((this.apLocked==null && other.getApLocked()==null) || 
             (this.apLocked!=null &&
              this.apLocked.equals(other.getApLocked()))) &&
            ((this.arLocked==null && other.getArLocked()==null) || 
             (this.arLocked!=null &&
              this.arLocked.equals(other.getArLocked()))) &&
            ((this.payrollLocked==null && other.getPayrollLocked()==null) || 
             (this.payrollLocked!=null &&
              this.payrollLocked.equals(other.getPayrollLocked()))) &&
            ((this.allLocked==null && other.getAllLocked()==null) || 
             (this.allLocked!=null &&
              this.allLocked.equals(other.getAllLocked()))) &&
            ((this.allowNonGLChanges==null && other.getAllowNonGLChanges()==null) || 
             (this.allowNonGLChanges!=null &&
              this.allowNonGLChanges.equals(other.getAllowNonGLChanges()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId())));
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
        if (getPeriodName() != null) {
            _hashCode += getPeriodName().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getClosedOnDate() != null) {
            _hashCode += getClosedOnDate().hashCode();
        }
        if (getIsAdjust() != null) {
            _hashCode += getIsAdjust().hashCode();
        }
        if (getIsQuarter() != null) {
            _hashCode += getIsQuarter().hashCode();
        }
        if (getIsYear() != null) {
            _hashCode += getIsYear().hashCode();
        }
        if (getClosed() != null) {
            _hashCode += getClosed().hashCode();
        }
        if (getApLocked() != null) {
            _hashCode += getApLocked().hashCode();
        }
        if (getArLocked() != null) {
            _hashCode += getArLocked().hashCode();
        }
        if (getPayrollLocked() != null) {
            _hashCode += getPayrollLocked().hashCode();
        }
        if (getAllLocked() != null) {
            _hashCode += getAllLocked().hashCode();
        }
        if (getAllowNonGLChanges() != null) {
            _hashCode += getAllowNonGLChanges().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountingPeriod.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "AccountingPeriod"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "periodName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedOnDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "closedOnDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAdjust");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isAdjust"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isQuarter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isQuarter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isYear");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "closed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apLocked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "apLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arLocked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "arLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollLocked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "payrollLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allLocked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "allLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowNonGLChanges");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "allowNonGLChanges"));
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
