/**
 * PostingTransactionSummaryFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class PostingTransactionSummaryFilter  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRefList period;

    private org.mule.module.netsuite.api.internal.RecordRefList account;

    private org.mule.module.netsuite.api.internal.RecordRefList parentItem;

    private org.mule.module.netsuite.api.internal.RecordRefList item;

    private org.mule.module.netsuite.api.internal.RecordRefList customer;

    private org.mule.module.netsuite.api.internal.RecordRefList department;

    private org.mule.module.netsuite.api.internal.RecordRefList _class;

    private org.mule.module.netsuite.api.internal.RecordRefList location;

    private org.mule.module.netsuite.api.internal.RecordRefList subsidiary;

    public PostingTransactionSummaryFilter() {
    }

    public PostingTransactionSummaryFilter(
           org.mule.module.netsuite.api.internal.RecordRefList period,
           org.mule.module.netsuite.api.internal.RecordRefList account,
           org.mule.module.netsuite.api.internal.RecordRefList parentItem,
           org.mule.module.netsuite.api.internal.RecordRefList item,
           org.mule.module.netsuite.api.internal.RecordRefList customer,
           org.mule.module.netsuite.api.internal.RecordRefList department,
           org.mule.module.netsuite.api.internal.RecordRefList _class,
           org.mule.module.netsuite.api.internal.RecordRefList location,
           org.mule.module.netsuite.api.internal.RecordRefList subsidiary) {
           this.period = period;
           this.account = account;
           this.parentItem = parentItem;
           this.item = item;
           this.customer = customer;
           this.department = department;
           this._class = _class;
           this.location = location;
           this.subsidiary = subsidiary;
    }


    /**
     * Gets the period value for this PostingTransactionSummaryFilter.
     * 
     * @return period
     */
    public org.mule.module.netsuite.api.internal.RecordRefList getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this PostingTransactionSummaryFilter.
     * 
     * @param period
     */
    public void setPeriod(org.mule.module.netsuite.api.internal.RecordRefList period) {
        this.period = period;
    }


    /**
     * Gets the account value for this PostingTransactionSummaryFilter.
     * 
     * @return account
     */
    public org.mule.module.netsuite.api.internal.RecordRefList getAccount() {
        return account;
    }


    /**
     * Sets the account value for this PostingTransactionSummaryFilter.
     * 
     * @param account
     */
    public void setAccount(org.mule.module.netsuite.api.internal.RecordRefList account) {
        this.account = account;
    }


    /**
     * Gets the parentItem value for this PostingTransactionSummaryFilter.
     * 
     * @return parentItem
     */
    public org.mule.module.netsuite.api.internal.RecordRefList getParentItem() {
        return parentItem;
    }


    /**
     * Sets the parentItem value for this PostingTransactionSummaryFilter.
     * 
     * @param parentItem
     */
    public void setParentItem(org.mule.module.netsuite.api.internal.RecordRefList parentItem) {
        this.parentItem = parentItem;
    }


    /**
     * Gets the item value for this PostingTransactionSummaryFilter.
     * 
     * @return item
     */
    public org.mule.module.netsuite.api.internal.RecordRefList getItem() {
        return item;
    }


    /**
     * Sets the item value for this PostingTransactionSummaryFilter.
     * 
     * @param item
     */
    public void setItem(org.mule.module.netsuite.api.internal.RecordRefList item) {
        this.item = item;
    }


    /**
     * Gets the customer value for this PostingTransactionSummaryFilter.
     * 
     * @return customer
     */
    public org.mule.module.netsuite.api.internal.RecordRefList getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this PostingTransactionSummaryFilter.
     * 
     * @param customer
     */
    public void setCustomer(org.mule.module.netsuite.api.internal.RecordRefList customer) {
        this.customer = customer;
    }


    /**
     * Gets the department value for this PostingTransactionSummaryFilter.
     * 
     * @return department
     */
    public org.mule.module.netsuite.api.internal.RecordRefList getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this PostingTransactionSummaryFilter.
     * 
     * @param department
     */
    public void setDepartment(org.mule.module.netsuite.api.internal.RecordRefList department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this PostingTransactionSummaryFilter.
     * 
     * @return _class
     */
    public org.mule.module.netsuite.api.internal.RecordRefList get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this PostingTransactionSummaryFilter.
     * 
     * @param _class
     */
    public void set_class(org.mule.module.netsuite.api.internal.RecordRefList _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this PostingTransactionSummaryFilter.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.RecordRefList getLocation() {
        return location;
    }


    /**
     * Sets the location value for this PostingTransactionSummaryFilter.
     * 
     * @param location
     */
    public void setLocation(org.mule.module.netsuite.api.internal.RecordRefList location) {
        this.location = location;
    }


    /**
     * Gets the subsidiary value for this PostingTransactionSummaryFilter.
     * 
     * @return subsidiary
     */
    public org.mule.module.netsuite.api.internal.RecordRefList getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this PostingTransactionSummaryFilter.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(org.mule.module.netsuite.api.internal.RecordRefList subsidiary) {
        this.subsidiary = subsidiary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostingTransactionSummaryFilter)) return false;
        PostingTransactionSummaryFilter other = (PostingTransactionSummaryFilter) obj;
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
              this.subsidiary.equals(other.getSubsidiary())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostingTransactionSummaryFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "PostingTransactionSummaryFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "parentItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRefList"));
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
