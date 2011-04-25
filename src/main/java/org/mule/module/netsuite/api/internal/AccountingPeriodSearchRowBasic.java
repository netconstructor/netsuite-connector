/**
 * AccountingPeriodSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class AccountingPeriodSearchRowBasic  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] allLocked;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] allowNonGlChanges;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] apLocked;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] arLocked;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] closed;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] closedOnDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] endDate;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isAdjust;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isQuarter;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isYear;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] parent;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] payrollLocked;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] periodName;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDate;

    public AccountingPeriodSearchRowBasic() {
    }

    public AccountingPeriodSearchRowBasic(
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] allLocked,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] allowNonGlChanges,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] apLocked,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] arLocked,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] closed,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] closedOnDate,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] endDate,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isAdjust,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isQuarter,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isYear,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] parent,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] payrollLocked,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] periodName,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDate) {
           this.allLocked = allLocked;
           this.allowNonGlChanges = allowNonGlChanges;
           this.apLocked = apLocked;
           this.arLocked = arLocked;
           this.closed = closed;
           this.closedOnDate = closedOnDate;
           this.endDate = endDate;
           this.internalId = internalId;
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
     * Gets the allLocked value for this AccountingPeriodSearchRowBasic.
     * 
     * @return allLocked
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getAllLocked() {
        return allLocked;
    }


    /**
     * Sets the allLocked value for this AccountingPeriodSearchRowBasic.
     * 
     * @param allLocked
     */
    public void setAllLocked(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] allLocked) {
        this.allLocked = allLocked;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getAllLocked(int i) {
        return this.allLocked[i];
    }

    public void setAllLocked(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.allLocked[i] = _value;
    }


    /**
     * Gets the allowNonGlChanges value for this AccountingPeriodSearchRowBasic.
     * 
     * @return allowNonGlChanges
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getAllowNonGlChanges() {
        return allowNonGlChanges;
    }


    /**
     * Sets the allowNonGlChanges value for this AccountingPeriodSearchRowBasic.
     * 
     * @param allowNonGlChanges
     */
    public void setAllowNonGlChanges(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] allowNonGlChanges) {
        this.allowNonGlChanges = allowNonGlChanges;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getAllowNonGlChanges(int i) {
        return this.allowNonGlChanges[i];
    }

    public void setAllowNonGlChanges(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.allowNonGlChanges[i] = _value;
    }


    /**
     * Gets the apLocked value for this AccountingPeriodSearchRowBasic.
     * 
     * @return apLocked
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getApLocked() {
        return apLocked;
    }


    /**
     * Sets the apLocked value for this AccountingPeriodSearchRowBasic.
     * 
     * @param apLocked
     */
    public void setApLocked(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] apLocked) {
        this.apLocked = apLocked;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getApLocked(int i) {
        return this.apLocked[i];
    }

    public void setApLocked(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.apLocked[i] = _value;
    }


    /**
     * Gets the arLocked value for this AccountingPeriodSearchRowBasic.
     * 
     * @return arLocked
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getArLocked() {
        return arLocked;
    }


    /**
     * Sets the arLocked value for this AccountingPeriodSearchRowBasic.
     * 
     * @param arLocked
     */
    public void setArLocked(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] arLocked) {
        this.arLocked = arLocked;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getArLocked(int i) {
        return this.arLocked[i];
    }

    public void setArLocked(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.arLocked[i] = _value;
    }


    /**
     * Gets the closed value for this AccountingPeriodSearchRowBasic.
     * 
     * @return closed
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getClosed() {
        return closed;
    }


    /**
     * Sets the closed value for this AccountingPeriodSearchRowBasic.
     * 
     * @param closed
     */
    public void setClosed(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] closed) {
        this.closed = closed;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getClosed(int i) {
        return this.closed[i];
    }

    public void setClosed(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.closed[i] = _value;
    }


    /**
     * Gets the closedOnDate value for this AccountingPeriodSearchRowBasic.
     * 
     * @return closedOnDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getClosedOnDate() {
        return closedOnDate;
    }


    /**
     * Sets the closedOnDate value for this AccountingPeriodSearchRowBasic.
     * 
     * @param closedOnDate
     */
    public void setClosedOnDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] closedOnDate) {
        this.closedOnDate = closedOnDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getClosedOnDate(int i) {
        return this.closedOnDate[i];
    }

    public void setClosedOnDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.closedOnDate[i] = _value;
    }


    /**
     * Gets the endDate value for this AccountingPeriodSearchRowBasic.
     * 
     * @return endDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this AccountingPeriodSearchRowBasic.
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
     * Gets the internalId value for this AccountingPeriodSearchRowBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this AccountingPeriodSearchRowBasic.
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
     * Gets the isAdjust value for this AccountingPeriodSearchRowBasic.
     * 
     * @return isAdjust
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsAdjust() {
        return isAdjust;
    }


    /**
     * Sets the isAdjust value for this AccountingPeriodSearchRowBasic.
     * 
     * @param isAdjust
     */
    public void setIsAdjust(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isAdjust) {
        this.isAdjust = isAdjust;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsAdjust(int i) {
        return this.isAdjust[i];
    }

    public void setIsAdjust(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isAdjust[i] = _value;
    }


    /**
     * Gets the isInactive value for this AccountingPeriodSearchRowBasic.
     * 
     * @return isInactive
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this AccountingPeriodSearchRowBasic.
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
     * Gets the isQuarter value for this AccountingPeriodSearchRowBasic.
     * 
     * @return isQuarter
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsQuarter() {
        return isQuarter;
    }


    /**
     * Sets the isQuarter value for this AccountingPeriodSearchRowBasic.
     * 
     * @param isQuarter
     */
    public void setIsQuarter(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isQuarter) {
        this.isQuarter = isQuarter;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsQuarter(int i) {
        return this.isQuarter[i];
    }

    public void setIsQuarter(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isQuarter[i] = _value;
    }


    /**
     * Gets the isYear value for this AccountingPeriodSearchRowBasic.
     * 
     * @return isYear
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsYear() {
        return isYear;
    }


    /**
     * Sets the isYear value for this AccountingPeriodSearchRowBasic.
     * 
     * @param isYear
     */
    public void setIsYear(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isYear) {
        this.isYear = isYear;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsYear(int i) {
        return this.isYear[i];
    }

    public void setIsYear(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isYear[i] = _value;
    }


    /**
     * Gets the parent value for this AccountingPeriodSearchRowBasic.
     * 
     * @return parent
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this AccountingPeriodSearchRowBasic.
     * 
     * @param parent
     */
    public void setParent(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] parent) {
        this.parent = parent;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getParent(int i) {
        return this.parent[i];
    }

    public void setParent(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.parent[i] = _value;
    }


    /**
     * Gets the payrollLocked value for this AccountingPeriodSearchRowBasic.
     * 
     * @return payrollLocked
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getPayrollLocked() {
        return payrollLocked;
    }


    /**
     * Sets the payrollLocked value for this AccountingPeriodSearchRowBasic.
     * 
     * @param payrollLocked
     */
    public void setPayrollLocked(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] payrollLocked) {
        this.payrollLocked = payrollLocked;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getPayrollLocked(int i) {
        return this.payrollLocked[i];
    }

    public void setPayrollLocked(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.payrollLocked[i] = _value;
    }


    /**
     * Gets the periodName value for this AccountingPeriodSearchRowBasic.
     * 
     * @return periodName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPeriodName() {
        return periodName;
    }


    /**
     * Sets the periodName value for this AccountingPeriodSearchRowBasic.
     * 
     * @param periodName
     */
    public void setPeriodName(org.mule.module.netsuite.api.internal.SearchColumnStringField[] periodName) {
        this.periodName = periodName;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPeriodName(int i) {
        return this.periodName[i];
    }

    public void setPeriodName(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.periodName[i] = _value;
    }


    /**
     * Gets the startDate value for this AccountingPeriodSearchRowBasic.
     * 
     * @return startDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this AccountingPeriodSearchRowBasic.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountingPeriodSearchRowBasic)) return false;
        AccountingPeriodSearchRowBasic other = (AccountingPeriodSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allLocked==null && other.getAllLocked()==null) || 
             (this.allLocked!=null &&
              java.util.Arrays.equals(this.allLocked, other.getAllLocked()))) &&
            ((this.allowNonGlChanges==null && other.getAllowNonGlChanges()==null) || 
             (this.allowNonGlChanges!=null &&
              java.util.Arrays.equals(this.allowNonGlChanges, other.getAllowNonGlChanges()))) &&
            ((this.apLocked==null && other.getApLocked()==null) || 
             (this.apLocked!=null &&
              java.util.Arrays.equals(this.apLocked, other.getApLocked()))) &&
            ((this.arLocked==null && other.getArLocked()==null) || 
             (this.arLocked!=null &&
              java.util.Arrays.equals(this.arLocked, other.getArLocked()))) &&
            ((this.closed==null && other.getClosed()==null) || 
             (this.closed!=null &&
              java.util.Arrays.equals(this.closed, other.getClosed()))) &&
            ((this.closedOnDate==null && other.getClosedOnDate()==null) || 
             (this.closedOnDate!=null &&
              java.util.Arrays.equals(this.closedOnDate, other.getClosedOnDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              java.util.Arrays.equals(this.endDate, other.getEndDate()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isAdjust==null && other.getIsAdjust()==null) || 
             (this.isAdjust!=null &&
              java.util.Arrays.equals(this.isAdjust, other.getIsAdjust()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.isQuarter==null && other.getIsQuarter()==null) || 
             (this.isQuarter!=null &&
              java.util.Arrays.equals(this.isQuarter, other.getIsQuarter()))) &&
            ((this.isYear==null && other.getIsYear()==null) || 
             (this.isYear!=null &&
              java.util.Arrays.equals(this.isYear, other.getIsYear()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              java.util.Arrays.equals(this.parent, other.getParent()))) &&
            ((this.payrollLocked==null && other.getPayrollLocked()==null) || 
             (this.payrollLocked!=null &&
              java.util.Arrays.equals(this.payrollLocked, other.getPayrollLocked()))) &&
            ((this.periodName==null && other.getPeriodName()==null) || 
             (this.periodName!=null &&
              java.util.Arrays.equals(this.periodName, other.getPeriodName()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              java.util.Arrays.equals(this.startDate, other.getStartDate())));
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
        if (getAllLocked() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllLocked());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllLocked(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllowNonGlChanges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowNonGlChanges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowNonGlChanges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApLocked() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApLocked());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApLocked(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArLocked() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArLocked());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArLocked(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClosed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClosed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClosed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClosedOnDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClosedOnDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClosedOnDate(), i);
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
        if (getIsAdjust() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsAdjust());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsAdjust(), i);
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
        if (getIsQuarter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsQuarter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsQuarter(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsYear() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsYear());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsYear(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayrollLocked() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayrollLocked());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayrollLocked(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPeriodName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPeriodName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPeriodName(), i);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountingPeriodSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "AccountingPeriodSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allLocked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "allLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowNonGlChanges");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "allowNonGlChanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apLocked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "apLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arLocked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "arLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "closed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedOnDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "closedOnDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("isAdjust");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isAdjust"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("isQuarter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isQuarter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isYear");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollLocked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "payrollLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "periodName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
