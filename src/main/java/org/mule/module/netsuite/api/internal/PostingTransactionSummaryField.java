/**
 * PostingTransactionSummaryField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class PostingTransactionSummaryField  implements java.io.Serializable {
    private java.lang.Boolean period;

    private java.lang.Boolean account;

    private java.lang.Boolean parentItem;

    private java.lang.Boolean item;

    private java.lang.Boolean customer;

    private java.lang.Boolean department;

    private java.lang.Boolean _class;

    private java.lang.Boolean location;

    private java.lang.Boolean subsidiary;

    public PostingTransactionSummaryField() {
    }

    public PostingTransactionSummaryField(
           java.lang.Boolean period,
           java.lang.Boolean account,
           java.lang.Boolean parentItem,
           java.lang.Boolean item,
           java.lang.Boolean customer,
           java.lang.Boolean department,
           java.lang.Boolean _class,
           java.lang.Boolean location,
           java.lang.Boolean subsidiary) {
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
     * Gets the period value for this PostingTransactionSummaryField.
     * 
     * @return period
     */
    public java.lang.Boolean getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this PostingTransactionSummaryField.
     * 
     * @param period
     */
    public void setPeriod(java.lang.Boolean period) {
        this.period = period;
    }


    /**
     * Gets the account value for this PostingTransactionSummaryField.
     * 
     * @return account
     */
    public java.lang.Boolean getAccount() {
        return account;
    }


    /**
     * Sets the account value for this PostingTransactionSummaryField.
     * 
     * @param account
     */
    public void setAccount(java.lang.Boolean account) {
        this.account = account;
    }


    /**
     * Gets the parentItem value for this PostingTransactionSummaryField.
     * 
     * @return parentItem
     */
    public java.lang.Boolean getParentItem() {
        return parentItem;
    }


    /**
     * Sets the parentItem value for this PostingTransactionSummaryField.
     * 
     * @param parentItem
     */
    public void setParentItem(java.lang.Boolean parentItem) {
        this.parentItem = parentItem;
    }


    /**
     * Gets the item value for this PostingTransactionSummaryField.
     * 
     * @return item
     */
    public java.lang.Boolean getItem() {
        return item;
    }


    /**
     * Sets the item value for this PostingTransactionSummaryField.
     * 
     * @param item
     */
    public void setItem(java.lang.Boolean item) {
        this.item = item;
    }


    /**
     * Gets the customer value for this PostingTransactionSummaryField.
     * 
     * @return customer
     */
    public java.lang.Boolean getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this PostingTransactionSummaryField.
     * 
     * @param customer
     */
    public void setCustomer(java.lang.Boolean customer) {
        this.customer = customer;
    }


    /**
     * Gets the department value for this PostingTransactionSummaryField.
     * 
     * @return department
     */
    public java.lang.Boolean getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this PostingTransactionSummaryField.
     * 
     * @param department
     */
    public void setDepartment(java.lang.Boolean department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this PostingTransactionSummaryField.
     * 
     * @return _class
     */
    public java.lang.Boolean get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this PostingTransactionSummaryField.
     * 
     * @param _class
     */
    public void set_class(java.lang.Boolean _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this PostingTransactionSummaryField.
     * 
     * @return location
     */
    public java.lang.Boolean getLocation() {
        return location;
    }


    /**
     * Sets the location value for this PostingTransactionSummaryField.
     * 
     * @param location
     */
    public void setLocation(java.lang.Boolean location) {
        this.location = location;
    }


    /**
     * Gets the subsidiary value for this PostingTransactionSummaryField.
     * 
     * @return subsidiary
     */
    public java.lang.Boolean getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this PostingTransactionSummaryField.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(java.lang.Boolean subsidiary) {
        this.subsidiary = subsidiary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostingTransactionSummaryField)) return false;
        PostingTransactionSummaryField other = (PostingTransactionSummaryField) obj;
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
        new org.apache.axis.description.TypeDesc(PostingTransactionSummaryField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "PostingTransactionSummaryField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "parentItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "subsidiary"));
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
