/**
 * PostingTransactionSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class PostingTransactionSummary  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef period;

    private org.mule.module.netsuite.api.internal.RecordRef account;

    private org.mule.module.netsuite.api.internal.RecordRef parentItem;

    private org.mule.module.netsuite.api.internal.RecordRef item;

    private org.mule.module.netsuite.api.internal.RecordRef customer;

    private org.mule.module.netsuite.api.internal.RecordRef department;

    private org.mule.module.netsuite.api.internal.RecordRef _class;

    private org.mule.module.netsuite.api.internal.RecordRef location;

    private org.mule.module.netsuite.api.internal.RecordRef subsidiary;

    private double amount;

    public PostingTransactionSummary() {
    }

    public PostingTransactionSummary(
           org.mule.module.netsuite.api.internal.RecordRef period,
           org.mule.module.netsuite.api.internal.RecordRef account,
           org.mule.module.netsuite.api.internal.RecordRef parentItem,
           org.mule.module.netsuite.api.internal.RecordRef item,
           org.mule.module.netsuite.api.internal.RecordRef customer,
           org.mule.module.netsuite.api.internal.RecordRef department,
           org.mule.module.netsuite.api.internal.RecordRef _class,
           org.mule.module.netsuite.api.internal.RecordRef location,
           org.mule.module.netsuite.api.internal.RecordRef subsidiary,
           double amount) {
           this.period = period;
           this.account = account;
           this.parentItem = parentItem;
           this.item = item;
           this.customer = customer;
           this.department = department;
           this._class = _class;
           this.location = location;
           this.subsidiary = subsidiary;
           this.amount = amount;
    }


    /**
     * Gets the period value for this PostingTransactionSummary.
     * 
     * @return period
     */
    public org.mule.module.netsuite.api.internal.RecordRef getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this PostingTransactionSummary.
     * 
     * @param period
     */
    public void setPeriod(org.mule.module.netsuite.api.internal.RecordRef period) {
        this.period = period;
    }


    /**
     * Gets the account value for this PostingTransactionSummary.
     * 
     * @return account
     */
    public org.mule.module.netsuite.api.internal.RecordRef getAccount() {
        return account;
    }


    /**
     * Sets the account value for this PostingTransactionSummary.
     * 
     * @param account
     */
    public void setAccount(org.mule.module.netsuite.api.internal.RecordRef account) {
        this.account = account;
    }


    /**
     * Gets the parentItem value for this PostingTransactionSummary.
     * 
     * @return parentItem
     */
    public org.mule.module.netsuite.api.internal.RecordRef getParentItem() {
        return parentItem;
    }


    /**
     * Sets the parentItem value for this PostingTransactionSummary.
     * 
     * @param parentItem
     */
    public void setParentItem(org.mule.module.netsuite.api.internal.RecordRef parentItem) {
        this.parentItem = parentItem;
    }


    /**
     * Gets the item value for this PostingTransactionSummary.
     * 
     * @return item
     */
    public org.mule.module.netsuite.api.internal.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this PostingTransactionSummary.
     * 
     * @param item
     */
    public void setItem(org.mule.module.netsuite.api.internal.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the customer value for this PostingTransactionSummary.
     * 
     * @return customer
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this PostingTransactionSummary.
     * 
     * @param customer
     */
    public void setCustomer(org.mule.module.netsuite.api.internal.RecordRef customer) {
        this.customer = customer;
    }


    /**
     * Gets the department value for this PostingTransactionSummary.
     * 
     * @return department
     */
    public org.mule.module.netsuite.api.internal.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this PostingTransactionSummary.
     * 
     * @param department
     */
    public void setDepartment(org.mule.module.netsuite.api.internal.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this PostingTransactionSummary.
     * 
     * @return _class
     */
    public org.mule.module.netsuite.api.internal.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this PostingTransactionSummary.
     * 
     * @param _class
     */
    public void set_class(org.mule.module.netsuite.api.internal.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this PostingTransactionSummary.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this PostingTransactionSummary.
     * 
     * @param location
     */
    public void setLocation(org.mule.module.netsuite.api.internal.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the subsidiary value for this PostingTransactionSummary.
     * 
     * @return subsidiary
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this PostingTransactionSummary.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(org.mule.module.netsuite.api.internal.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the amount value for this PostingTransactionSummary.
     * 
     * @return amount
     */
    public double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PostingTransactionSummary.
     * 
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostingTransactionSummary)) return false;
        PostingTransactionSummary other = (PostingTransactionSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.parentItem==null && other.getParentItem()==null) || 
             (this.parentItem!=null &&
              this.parentItem.equals(other.getParentItem()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            this.amount == other.getAmount();
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
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getParentItem() != null) {
            _hashCode += getParentItem().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        _hashCode += new Double(getAmount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostingTransactionSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "PostingTransactionSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "parentItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
