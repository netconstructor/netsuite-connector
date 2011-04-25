/**
 * VendorPaymentApply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class VendorPaymentApply  implements java.io.Serializable {
    private java.lang.Boolean apply;

    private java.lang.Long doc;

    private java.lang.String job;

    private java.util.Calendar applyDate;

    private java.lang.String type;

    private java.lang.String refNum;

    private java.lang.Double total;

    private java.lang.Double due;

    private java.lang.String currency;

    private java.util.Calendar discDate;

    private java.lang.Double discAmt;

    private java.lang.Double disc;

    private java.lang.Double amount;

    public VendorPaymentApply() {
    }

    public VendorPaymentApply(
           java.lang.Boolean apply,
           java.lang.Long doc,
           java.lang.String job,
           java.util.Calendar applyDate,
           java.lang.String type,
           java.lang.String refNum,
           java.lang.Double total,
           java.lang.Double due,
           java.lang.String currency,
           java.util.Calendar discDate,
           java.lang.Double discAmt,
           java.lang.Double disc,
           java.lang.Double amount) {
           this.apply = apply;
           this.doc = doc;
           this.job = job;
           this.applyDate = applyDate;
           this.type = type;
           this.refNum = refNum;
           this.total = total;
           this.due = due;
           this.currency = currency;
           this.discDate = discDate;
           this.discAmt = discAmt;
           this.disc = disc;
           this.amount = amount;
    }


    /**
     * Gets the apply value for this VendorPaymentApply.
     * 
     * @return apply
     */
    public java.lang.Boolean getApply() {
        return apply;
    }


    /**
     * Sets the apply value for this VendorPaymentApply.
     * 
     * @param apply
     */
    public void setApply(java.lang.Boolean apply) {
        this.apply = apply;
    }


    /**
     * Gets the doc value for this VendorPaymentApply.
     * 
     * @return doc
     */
    public java.lang.Long getDoc() {
        return doc;
    }


    /**
     * Sets the doc value for this VendorPaymentApply.
     * 
     * @param doc
     */
    public void setDoc(java.lang.Long doc) {
        this.doc = doc;
    }


    /**
     * Gets the job value for this VendorPaymentApply.
     * 
     * @return job
     */
    public java.lang.String getJob() {
        return job;
    }


    /**
     * Sets the job value for this VendorPaymentApply.
     * 
     * @param job
     */
    public void setJob(java.lang.String job) {
        this.job = job;
    }


    /**
     * Gets the applyDate value for this VendorPaymentApply.
     * 
     * @return applyDate
     */
    public java.util.Calendar getApplyDate() {
        return applyDate;
    }


    /**
     * Sets the applyDate value for this VendorPaymentApply.
     * 
     * @param applyDate
     */
    public void setApplyDate(java.util.Calendar applyDate) {
        this.applyDate = applyDate;
    }


    /**
     * Gets the type value for this VendorPaymentApply.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this VendorPaymentApply.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the refNum value for this VendorPaymentApply.
     * 
     * @return refNum
     */
    public java.lang.String getRefNum() {
        return refNum;
    }


    /**
     * Sets the refNum value for this VendorPaymentApply.
     * 
     * @param refNum
     */
    public void setRefNum(java.lang.String refNum) {
        this.refNum = refNum;
    }


    /**
     * Gets the total value for this VendorPaymentApply.
     * 
     * @return total
     */
    public java.lang.Double getTotal() {
        return total;
    }


    /**
     * Sets the total value for this VendorPaymentApply.
     * 
     * @param total
     */
    public void setTotal(java.lang.Double total) {
        this.total = total;
    }


    /**
     * Gets the due value for this VendorPaymentApply.
     * 
     * @return due
     */
    public java.lang.Double getDue() {
        return due;
    }


    /**
     * Sets the due value for this VendorPaymentApply.
     * 
     * @param due
     */
    public void setDue(java.lang.Double due) {
        this.due = due;
    }


    /**
     * Gets the currency value for this VendorPaymentApply.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this VendorPaymentApply.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the discDate value for this VendorPaymentApply.
     * 
     * @return discDate
     */
    public java.util.Calendar getDiscDate() {
        return discDate;
    }


    /**
     * Sets the discDate value for this VendorPaymentApply.
     * 
     * @param discDate
     */
    public void setDiscDate(java.util.Calendar discDate) {
        this.discDate = discDate;
    }


    /**
     * Gets the discAmt value for this VendorPaymentApply.
     * 
     * @return discAmt
     */
    public java.lang.Double getDiscAmt() {
        return discAmt;
    }


    /**
     * Sets the discAmt value for this VendorPaymentApply.
     * 
     * @param discAmt
     */
    public void setDiscAmt(java.lang.Double discAmt) {
        this.discAmt = discAmt;
    }


    /**
     * Gets the disc value for this VendorPaymentApply.
     * 
     * @return disc
     */
    public java.lang.Double getDisc() {
        return disc;
    }


    /**
     * Sets the disc value for this VendorPaymentApply.
     * 
     * @param disc
     */
    public void setDisc(java.lang.Double disc) {
        this.disc = disc;
    }


    /**
     * Gets the amount value for this VendorPaymentApply.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this VendorPaymentApply.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VendorPaymentApply)) return false;
        VendorPaymentApply other = (VendorPaymentApply) obj;
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
            ((this.job==null && other.getJob()==null) || 
             (this.job!=null &&
              this.job.equals(other.getJob()))) &&
            ((this.applyDate==null && other.getApplyDate()==null) || 
             (this.applyDate!=null &&
              this.applyDate.equals(other.getApplyDate()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.refNum==null && other.getRefNum()==null) || 
             (this.refNum!=null &&
              this.refNum.equals(other.getRefNum()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.due==null && other.getDue()==null) || 
             (this.due!=null &&
              this.due.equals(other.getDue()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.discDate==null && other.getDiscDate()==null) || 
             (this.discDate!=null &&
              this.discDate.equals(other.getDiscDate()))) &&
            ((this.discAmt==null && other.getDiscAmt()==null) || 
             (this.discAmt!=null &&
              this.discAmt.equals(other.getDiscAmt()))) &&
            ((this.disc==null && other.getDisc()==null) || 
             (this.disc!=null &&
              this.disc.equals(other.getDisc()))) &&
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
        if (getJob() != null) {
            _hashCode += getJob().hashCode();
        }
        if (getApplyDate() != null) {
            _hashCode += getApplyDate().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getRefNum() != null) {
            _hashCode += getRefNum().hashCode();
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
        if (getDiscDate() != null) {
            _hashCode += getDiscDate().hashCode();
        }
        if (getDiscAmt() != null) {
            _hashCode += getDiscAmt().hashCode();
        }
        if (getDisc() != null) {
            _hashCode += getDisc().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VendorPaymentApply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "VendorPaymentApply"));
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
        elemField.setFieldName("job");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "job"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "applyDate"));
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
        elemField.setFieldName("discDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "discDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "discAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "disc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
