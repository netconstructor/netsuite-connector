/**
 * VendorPaymentCredit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class VendorPaymentCredit  implements java.io.Serializable {
    private java.lang.Boolean apply;

    private java.lang.Long doc;

    private java.util.Calendar creditDate;

    private java.lang.String type;

    private java.lang.String refNum;

    private java.lang.String appliedTo;

    private java.lang.Double total;

    private java.lang.Double due;

    private java.lang.String currency;

    private java.lang.Double amount;

    public VendorPaymentCredit() {
    }

    public VendorPaymentCredit(
           java.lang.Boolean apply,
           java.lang.Long doc,
           java.util.Calendar creditDate,
           java.lang.String type,
           java.lang.String refNum,
           java.lang.String appliedTo,
           java.lang.Double total,
           java.lang.Double due,
           java.lang.String currency,
           java.lang.Double amount) {
           this.apply = apply;
           this.doc = doc;
           this.creditDate = creditDate;
           this.type = type;
           this.refNum = refNum;
           this.appliedTo = appliedTo;
           this.total = total;
           this.due = due;
           this.currency = currency;
           this.amount = amount;
    }


    /**
     * Gets the apply value for this VendorPaymentCredit.
     * 
     * @return apply
     */
    public java.lang.Boolean getApply() {
        return apply;
    }


    /**
     * Sets the apply value for this VendorPaymentCredit.
     * 
     * @param apply
     */
    public void setApply(java.lang.Boolean apply) {
        this.apply = apply;
    }


    /**
     * Gets the doc value for this VendorPaymentCredit.
     * 
     * @return doc
     */
    public java.lang.Long getDoc() {
        return doc;
    }


    /**
     * Sets the doc value for this VendorPaymentCredit.
     * 
     * @param doc
     */
    public void setDoc(java.lang.Long doc) {
        this.doc = doc;
    }


    /**
     * Gets the creditDate value for this VendorPaymentCredit.
     * 
     * @return creditDate
     */
    public java.util.Calendar getCreditDate() {
        return creditDate;
    }


    /**
     * Sets the creditDate value for this VendorPaymentCredit.
     * 
     * @param creditDate
     */
    public void setCreditDate(java.util.Calendar creditDate) {
        this.creditDate = creditDate;
    }


    /**
     * Gets the type value for this VendorPaymentCredit.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this VendorPaymentCredit.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the refNum value for this VendorPaymentCredit.
     * 
     * @return refNum
     */
    public java.lang.String getRefNum() {
        return refNum;
    }


    /**
     * Sets the refNum value for this VendorPaymentCredit.
     * 
     * @param refNum
     */
    public void setRefNum(java.lang.String refNum) {
        this.refNum = refNum;
    }


    /**
     * Gets the appliedTo value for this VendorPaymentCredit.
     * 
     * @return appliedTo
     */
    public java.lang.String getAppliedTo() {
        return appliedTo;
    }


    /**
     * Sets the appliedTo value for this VendorPaymentCredit.
     * 
     * @param appliedTo
     */
    public void setAppliedTo(java.lang.String appliedTo) {
        this.appliedTo = appliedTo;
    }


    /**
     * Gets the total value for this VendorPaymentCredit.
     * 
     * @return total
     */
    public java.lang.Double getTotal() {
        return total;
    }


    /**
     * Sets the total value for this VendorPaymentCredit.
     * 
     * @param total
     */
    public void setTotal(java.lang.Double total) {
        this.total = total;
    }


    /**
     * Gets the due value for this VendorPaymentCredit.
     * 
     * @return due
     */
    public java.lang.Double getDue() {
        return due;
    }


    /**
     * Sets the due value for this VendorPaymentCredit.
     * 
     * @param due
     */
    public void setDue(java.lang.Double due) {
        this.due = due;
    }


    /**
     * Gets the currency value for this VendorPaymentCredit.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this VendorPaymentCredit.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the amount value for this VendorPaymentCredit.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this VendorPaymentCredit.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VendorPaymentCredit)) return false;
        VendorPaymentCredit other = (VendorPaymentCredit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apply==null && other.getApply()==null) || 
             (this.apply!=null &&
              this.apply.equals(other.getApply()))) &&
            ((this.doc==null && other.getDoc()==null) || 
             (this.doc!=null &&
              this.doc.equals(other.getDoc()))) &&
            ((this.creditDate==null && other.getCreditDate()==null) || 
             (this.creditDate!=null &&
              this.creditDate.equals(other.getCreditDate()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.refNum==null && other.getRefNum()==null) || 
             (this.refNum!=null &&
              this.refNum.equals(other.getRefNum()))) &&
            ((this.appliedTo==null && other.getAppliedTo()==null) || 
             (this.appliedTo!=null &&
              this.appliedTo.equals(other.getAppliedTo()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.due==null && other.getDue()==null) || 
             (this.due!=null &&
              this.due.equals(other.getDue()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount())));
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
        if (getApply() != null) {
            _hashCode += getApply().hashCode();
        }
        if (getDoc() != null) {
            _hashCode += getDoc().hashCode();
        }
        if (getCreditDate() != null) {
            _hashCode += getCreditDate().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getRefNum() != null) {
            _hashCode += getRefNum().hashCode();
        }
        if (getAppliedTo() != null) {
            _hashCode += getAppliedTo().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getDue() != null) {
            _hashCode += getDue().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VendorPaymentCredit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "VendorPaymentCredit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "apply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "doc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "creditDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "refNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "appliedTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("due");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "due"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "amount"));
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
