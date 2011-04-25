/**
 * Budget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class Budget  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef year;

    private org.mule.module.netsuite.api.internal.RecordRef customer;

    private org.mule.module.netsuite.api.internal.RecordRef item;

    private org.mule.module.netsuite.api.internal.RecordRef _class;

    private org.mule.module.netsuite.api.internal.RecordRef department;

    private org.mule.module.netsuite.api.internal.RecordRef location;

    private org.mule.module.netsuite.api.internal.RecordRef account;

    private org.mule.module.netsuite.api.internal.RecordRef subsidiary;

    private org.mule.module.netsuite.api.internal.RecordRef category;

    private org.mule.module.netsuite.api.internal.BudgetBudgetType budgetType;

    private org.mule.module.netsuite.api.internal.RecordRef currency;

    private java.lang.Double periodAmount1;

    private java.lang.Double periodAmount2;

    private java.lang.Double periodAmount3;

    private java.lang.Double periodAmount4;

    private java.lang.Double periodAmount5;

    private java.lang.Double periodAmount6;

    private java.lang.Double periodAmount7;

    private java.lang.Double periodAmount8;

    private java.lang.Double periodAmount9;

    private java.lang.Double periodAmount10;

    private java.lang.Double periodAmount11;

    private java.lang.Double periodAmount12;

    private java.lang.Double amount;

    private java.lang.String internalId;  // attribute

    public Budget() {
    }

    public Budget(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           org.mule.module.netsuite.api.internal.RecordRef year,
           org.mule.module.netsuite.api.internal.RecordRef customer,
           org.mule.module.netsuite.api.internal.RecordRef item,
           org.mule.module.netsuite.api.internal.RecordRef _class,
           org.mule.module.netsuite.api.internal.RecordRef department,
           org.mule.module.netsuite.api.internal.RecordRef location,
           org.mule.module.netsuite.api.internal.RecordRef account,
           org.mule.module.netsuite.api.internal.RecordRef subsidiary,
           org.mule.module.netsuite.api.internal.RecordRef category,
           org.mule.module.netsuite.api.internal.BudgetBudgetType budgetType,
           org.mule.module.netsuite.api.internal.RecordRef currency,
           java.lang.Double periodAmount1,
           java.lang.Double periodAmount2,
           java.lang.Double periodAmount3,
           java.lang.Double periodAmount4,
           java.lang.Double periodAmount5,
           java.lang.Double periodAmount6,
           java.lang.Double periodAmount7,
           java.lang.Double periodAmount8,
           java.lang.Double periodAmount9,
           java.lang.Double periodAmount10,
           java.lang.Double periodAmount11,
           java.lang.Double periodAmount12,
           java.lang.Double amount) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.year = year;
        this.customer = customer;
        this.item = item;
        this._class = _class;
        this.department = department;
        this.location = location;
        this.account = account;
        this.subsidiary = subsidiary;
        this.category = category;
        this.budgetType = budgetType;
        this.currency = currency;
        this.periodAmount1 = periodAmount1;
        this.periodAmount2 = periodAmount2;
        this.periodAmount3 = periodAmount3;
        this.periodAmount4 = periodAmount4;
        this.periodAmount5 = periodAmount5;
        this.periodAmount6 = periodAmount6;
        this.periodAmount7 = periodAmount7;
        this.periodAmount8 = periodAmount8;
        this.periodAmount9 = periodAmount9;
        this.periodAmount10 = periodAmount10;
        this.periodAmount11 = periodAmount11;
        this.periodAmount12 = periodAmount12;
        this.amount = amount;
    }


    /**
     * Gets the year value for this Budget.
     * 
     * @return year
     */
    public org.mule.module.netsuite.api.internal.RecordRef getYear() {
        return year;
    }


    /**
     * Sets the year value for this Budget.
     * 
     * @param year
     */
    public void setYear(org.mule.module.netsuite.api.internal.RecordRef year) {
        this.year = year;
    }


    /**
     * Gets the customer value for this Budget.
     * 
     * @return customer
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this Budget.
     * 
     * @param customer
     */
    public void setCustomer(org.mule.module.netsuite.api.internal.RecordRef customer) {
        this.customer = customer;
    }


    /**
     * Gets the item value for this Budget.
     * 
     * @return item
     */
    public org.mule.module.netsuite.api.internal.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this Budget.
     * 
     * @param item
     */
    public void setItem(org.mule.module.netsuite.api.internal.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the _class value for this Budget.
     * 
     * @return _class
     */
    public org.mule.module.netsuite.api.internal.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this Budget.
     * 
     * @param _class
     */
    public void set_class(org.mule.module.netsuite.api.internal.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the department value for this Budget.
     * 
     * @return department
     */
    public org.mule.module.netsuite.api.internal.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this Budget.
     * 
     * @param department
     */
    public void setDepartment(org.mule.module.netsuite.api.internal.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the location value for this Budget.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Budget.
     * 
     * @param location
     */
    public void setLocation(org.mule.module.netsuite.api.internal.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the account value for this Budget.
     * 
     * @return account
     */
    public org.mule.module.netsuite.api.internal.RecordRef getAccount() {
        return account;
    }


    /**
     * Sets the account value for this Budget.
     * 
     * @param account
     */
    public void setAccount(org.mule.module.netsuite.api.internal.RecordRef account) {
        this.account = account;
    }


    /**
     * Gets the subsidiary value for this Budget.
     * 
     * @return subsidiary
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this Budget.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(org.mule.module.netsuite.api.internal.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the category value for this Budget.
     * 
     * @return category
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCategory() {
        return category;
    }


    /**
     * Sets the category value for this Budget.
     * 
     * @param category
     */
    public void setCategory(org.mule.module.netsuite.api.internal.RecordRef category) {
        this.category = category;
    }


    /**
     * Gets the budgetType value for this Budget.
     * 
     * @return budgetType
     */
    public org.mule.module.netsuite.api.internal.BudgetBudgetType getBudgetType() {
        return budgetType;
    }


    /**
     * Sets the budgetType value for this Budget.
     * 
     * @param budgetType
     */
    public void setBudgetType(org.mule.module.netsuite.api.internal.BudgetBudgetType budgetType) {
        this.budgetType = budgetType;
    }


    /**
     * Gets the currency value for this Budget.
     * 
     * @return currency
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Budget.
     * 
     * @param currency
     */
    public void setCurrency(org.mule.module.netsuite.api.internal.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the periodAmount1 value for this Budget.
     * 
     * @return periodAmount1
     */
    public java.lang.Double getPeriodAmount1() {
        return periodAmount1;
    }


    /**
     * Sets the periodAmount1 value for this Budget.
     * 
     * @param periodAmount1
     */
    public void setPeriodAmount1(java.lang.Double periodAmount1) {
        this.periodAmount1 = periodAmount1;
    }


    /**
     * Gets the periodAmount2 value for this Budget.
     * 
     * @return periodAmount2
     */
    public java.lang.Double getPeriodAmount2() {
        return periodAmount2;
    }


    /**
     * Sets the periodAmount2 value for this Budget.
     * 
     * @param periodAmount2
     */
    public void setPeriodAmount2(java.lang.Double periodAmount2) {
        this.periodAmount2 = periodAmount2;
    }


    /**
     * Gets the periodAmount3 value for this Budget.
     * 
     * @return periodAmount3
     */
    public java.lang.Double getPeriodAmount3() {
        return periodAmount3;
    }


    /**
     * Sets the periodAmount3 value for this Budget.
     * 
     * @param periodAmount3
     */
    public void setPeriodAmount3(java.lang.Double periodAmount3) {
        this.periodAmount3 = periodAmount3;
    }


    /**
     * Gets the periodAmount4 value for this Budget.
     * 
     * @return periodAmount4
     */
    public java.lang.Double getPeriodAmount4() {
        return periodAmount4;
    }


    /**
     * Sets the periodAmount4 value for this Budget.
     * 
     * @param periodAmount4
     */
    public void setPeriodAmount4(java.lang.Double periodAmount4) {
        this.periodAmount4 = periodAmount4;
    }


    /**
     * Gets the periodAmount5 value for this Budget.
     * 
     * @return periodAmount5
     */
    public java.lang.Double getPeriodAmount5() {
        return periodAmount5;
    }


    /**
     * Sets the periodAmount5 value for this Budget.
     * 
     * @param periodAmount5
     */
    public void setPeriodAmount5(java.lang.Double periodAmount5) {
        this.periodAmount5 = periodAmount5;
    }


    /**
     * Gets the periodAmount6 value for this Budget.
     * 
     * @return periodAmount6
     */
    public java.lang.Double getPeriodAmount6() {
        return periodAmount6;
    }


    /**
     * Sets the periodAmount6 value for this Budget.
     * 
     * @param periodAmount6
     */
    public void setPeriodAmount6(java.lang.Double periodAmount6) {
        this.periodAmount6 = periodAmount6;
    }


    /**
     * Gets the periodAmount7 value for this Budget.
     * 
     * @return periodAmount7
     */
    public java.lang.Double getPeriodAmount7() {
        return periodAmount7;
    }


    /**
     * Sets the periodAmount7 value for this Budget.
     * 
     * @param periodAmount7
     */
    public void setPeriodAmount7(java.lang.Double periodAmount7) {
        this.periodAmount7 = periodAmount7;
    }


    /**
     * Gets the periodAmount8 value for this Budget.
     * 
     * @return periodAmount8
     */
    public java.lang.Double getPeriodAmount8() {
        return periodAmount8;
    }


    /**
     * Sets the periodAmount8 value for this Budget.
     * 
     * @param periodAmount8
     */
    public void setPeriodAmount8(java.lang.Double periodAmount8) {
        this.periodAmount8 = periodAmount8;
    }


    /**
     * Gets the periodAmount9 value for this Budget.
     * 
     * @return periodAmount9
     */
    public java.lang.Double getPeriodAmount9() {
        return periodAmount9;
    }


    /**
     * Sets the periodAmount9 value for this Budget.
     * 
     * @param periodAmount9
     */
    public void setPeriodAmount9(java.lang.Double periodAmount9) {
        this.periodAmount9 = periodAmount9;
    }


    /**
     * Gets the periodAmount10 value for this Budget.
     * 
     * @return periodAmount10
     */
    public java.lang.Double getPeriodAmount10() {
        return periodAmount10;
    }


    /**
     * Sets the periodAmount10 value for this Budget.
     * 
     * @param periodAmount10
     */
    public void setPeriodAmount10(java.lang.Double periodAmount10) {
        this.periodAmount10 = periodAmount10;
    }


    /**
     * Gets the periodAmount11 value for this Budget.
     * 
     * @return periodAmount11
     */
    public java.lang.Double getPeriodAmount11() {
        return periodAmount11;
    }


    /**
     * Sets the periodAmount11 value for this Budget.
     * 
     * @param periodAmount11
     */
    public void setPeriodAmount11(java.lang.Double periodAmount11) {
        this.periodAmount11 = periodAmount11;
    }


    /**
     * Gets the periodAmount12 value for this Budget.
     * 
     * @return periodAmount12
     */
    public java.lang.Double getPeriodAmount12() {
        return periodAmount12;
    }


    /**
     * Sets the periodAmount12 value for this Budget.
     * 
     * @param periodAmount12
     */
    public void setPeriodAmount12(java.lang.Double periodAmount12) {
        this.periodAmount12 = periodAmount12;
    }


    /**
     * Gets the amount value for this Budget.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Budget.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the internalId value for this Budget.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Budget.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Budget)) return false;
        Budget other = (Budget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.year==null && other.getYear()==null) || 
             (this.year!=null &&
              this.year.equals(other.getYear()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.budgetType==null && other.getBudgetType()==null) || 
             (this.budgetType!=null &&
              this.budgetType.equals(other.getBudgetType()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.periodAmount1==null && other.getPeriodAmount1()==null) || 
             (this.periodAmount1!=null &&
              this.periodAmount1.equals(other.getPeriodAmount1()))) &&
            ((this.periodAmount2==null && other.getPeriodAmount2()==null) || 
             (this.periodAmount2!=null &&
              this.periodAmount2.equals(other.getPeriodAmount2()))) &&
            ((this.periodAmount3==null && other.getPeriodAmount3()==null) || 
             (this.periodAmount3!=null &&
              this.periodAmount3.equals(other.getPeriodAmount3()))) &&
            ((this.periodAmount4==null && other.getPeriodAmount4()==null) || 
             (this.periodAmount4!=null &&
              this.periodAmount4.equals(other.getPeriodAmount4()))) &&
            ((this.periodAmount5==null && other.getPeriodAmount5()==null) || 
             (this.periodAmount5!=null &&
              this.periodAmount5.equals(other.getPeriodAmount5()))) &&
            ((this.periodAmount6==null && other.getPeriodAmount6()==null) || 
             (this.periodAmount6!=null &&
              this.periodAmount6.equals(other.getPeriodAmount6()))) &&
            ((this.periodAmount7==null && other.getPeriodAmount7()==null) || 
             (this.periodAmount7!=null &&
              this.periodAmount7.equals(other.getPeriodAmount7()))) &&
            ((this.periodAmount8==null && other.getPeriodAmount8()==null) || 
             (this.periodAmount8!=null &&
              this.periodAmount8.equals(other.getPeriodAmount8()))) &&
            ((this.periodAmount9==null && other.getPeriodAmount9()==null) || 
             (this.periodAmount9!=null &&
              this.periodAmount9.equals(other.getPeriodAmount9()))) &&
            ((this.periodAmount10==null && other.getPeriodAmount10()==null) || 
             (this.periodAmount10!=null &&
              this.periodAmount10.equals(other.getPeriodAmount10()))) &&
            ((this.periodAmount11==null && other.getPeriodAmount11()==null) || 
             (this.periodAmount11!=null &&
              this.periodAmount11.equals(other.getPeriodAmount11()))) &&
            ((this.periodAmount12==null && other.getPeriodAmount12()==null) || 
             (this.periodAmount12!=null &&
              this.periodAmount12.equals(other.getPeriodAmount12()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
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
        if (getYear() != null) {
            _hashCode += getYear().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getBudgetType() != null) {
            _hashCode += getBudgetType().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getPeriodAmount1() != null) {
            _hashCode += getPeriodAmount1().hashCode();
        }
        if (getPeriodAmount2() != null) {
            _hashCode += getPeriodAmount2().hashCode();
        }
        if (getPeriodAmount3() != null) {
            _hashCode += getPeriodAmount3().hashCode();
        }
        if (getPeriodAmount4() != null) {
            _hashCode += getPeriodAmount4().hashCode();
        }
        if (getPeriodAmount5() != null) {
            _hashCode += getPeriodAmount5().hashCode();
        }
        if (getPeriodAmount6() != null) {
            _hashCode += getPeriodAmount6().hashCode();
        }
        if (getPeriodAmount7() != null) {
            _hashCode += getPeriodAmount7().hashCode();
        }
        if (getPeriodAmount8() != null) {
            _hashCode += getPeriodAmount8().hashCode();
        }
        if (getPeriodAmount9() != null) {
            _hashCode += getPeriodAmount9().hashCode();
        }
        if (getPeriodAmount10() != null) {
            _hashCode += getPeriodAmount10().hashCode();
        }
        if (getPeriodAmount11() != null) {
            _hashCode += getPeriodAmount11().hashCode();
        }
        if (getPeriodAmount12() != null) {
            _hashCode += getPeriodAmount12().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Budget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "Budget"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "year"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "budgetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.financial_2010_2.transactions.webservices.netsuite.com", "BudgetBudgetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "periodAmount1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "periodAmount2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "periodAmount3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount4");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "periodAmount4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount5");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "periodAmount5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount6");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "periodAmount6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount7");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "periodAmount7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount8");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "periodAmount8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount9");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "periodAmount9"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount10");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "periodAmount10"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount11");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "periodAmount11"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodAmount12");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "periodAmount12"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:financial_2010_2.transactions.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
