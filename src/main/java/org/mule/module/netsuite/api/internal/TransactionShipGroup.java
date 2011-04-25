/**
 * TransactionShipGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class TransactionShipGroup  implements java.io.Serializable {
    private java.lang.Long id;

    private java.lang.Boolean isFulfilled;

    private java.lang.Double weight;

    private org.mule.module.netsuite.api.internal.RecordRef sourceAddressRef;

    private java.lang.String sourceAddress;

    private org.mule.module.netsuite.api.internal.RecordRef destinationAddressRef;

    private java.lang.String destinationAddress;

    private org.mule.module.netsuite.api.internal.RecordRef shippingMethodRef;

    private java.lang.String shippingMethod;

    private java.lang.Boolean isHandlingTaxable;

    private org.mule.module.netsuite.api.internal.RecordRef handlingTaxCode;

    private java.lang.String handlingTaxRate;

    private java.lang.String handlingTax2Rate;

    private java.lang.Double handlingRate;

    private java.lang.Double handlingTaxAmt;

    private java.lang.Double handlingTax2Amt;

    private java.lang.Boolean isShippingTaxable;

    private org.mule.module.netsuite.api.internal.RecordRef shippingTaxCode;

    private java.lang.String shippingTaxRate;

    private java.lang.String shippingTax2Rate;

    private java.lang.Double shippingRate;

    private java.lang.Double shippingTaxAmt;

    private java.lang.Double shippingTax2Amt;

    public TransactionShipGroup() {
    }

    public TransactionShipGroup(
           java.lang.Long id,
           java.lang.Boolean isFulfilled,
           java.lang.Double weight,
           org.mule.module.netsuite.api.internal.RecordRef sourceAddressRef,
           java.lang.String sourceAddress,
           org.mule.module.netsuite.api.internal.RecordRef destinationAddressRef,
           java.lang.String destinationAddress,
           org.mule.module.netsuite.api.internal.RecordRef shippingMethodRef,
           java.lang.String shippingMethod,
           java.lang.Boolean isHandlingTaxable,
           org.mule.module.netsuite.api.internal.RecordRef handlingTaxCode,
           java.lang.String handlingTaxRate,
           java.lang.String handlingTax2Rate,
           java.lang.Double handlingRate,
           java.lang.Double handlingTaxAmt,
           java.lang.Double handlingTax2Amt,
           java.lang.Boolean isShippingTaxable,
           org.mule.module.netsuite.api.internal.RecordRef shippingTaxCode,
           java.lang.String shippingTaxRate,
           java.lang.String shippingTax2Rate,
           java.lang.Double shippingRate,
           java.lang.Double shippingTaxAmt,
           java.lang.Double shippingTax2Amt) {
           this.id = id;
           this.isFulfilled = isFulfilled;
           this.weight = weight;
           this.sourceAddressRef = sourceAddressRef;
           this.sourceAddress = sourceAddress;
           this.destinationAddressRef = destinationAddressRef;
           this.destinationAddress = destinationAddress;
           this.shippingMethodRef = shippingMethodRef;
           this.shippingMethod = shippingMethod;
           this.isHandlingTaxable = isHandlingTaxable;
           this.handlingTaxCode = handlingTaxCode;
           this.handlingTaxRate = handlingTaxRate;
           this.handlingTax2Rate = handlingTax2Rate;
           this.handlingRate = handlingRate;
           this.handlingTaxAmt = handlingTaxAmt;
           this.handlingTax2Amt = handlingTax2Amt;
           this.isShippingTaxable = isShippingTaxable;
           this.shippingTaxCode = shippingTaxCode;
           this.shippingTaxRate = shippingTaxRate;
           this.shippingTax2Rate = shippingTax2Rate;
           this.shippingRate = shippingRate;
           this.shippingTaxAmt = shippingTaxAmt;
           this.shippingTax2Amt = shippingTax2Amt;
    }


    /**
     * Gets the id value for this TransactionShipGroup.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this TransactionShipGroup.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the isFulfilled value for this TransactionShipGroup.
     * 
     * @return isFulfilled
     */
    public java.lang.Boolean getIsFulfilled() {
        return isFulfilled;
    }


    /**
     * Sets the isFulfilled value for this TransactionShipGroup.
     * 
     * @param isFulfilled
     */
    public void setIsFulfilled(java.lang.Boolean isFulfilled) {
        this.isFulfilled = isFulfilled;
    }


    /**
     * Gets the weight value for this TransactionShipGroup.
     * 
     * @return weight
     */
    public java.lang.Double getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this TransactionShipGroup.
     * 
     * @param weight
     */
    public void setWeight(java.lang.Double weight) {
        this.weight = weight;
    }


    /**
     * Gets the sourceAddressRef value for this TransactionShipGroup.
     * 
     * @return sourceAddressRef
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSourceAddressRef() {
        return sourceAddressRef;
    }


    /**
     * Sets the sourceAddressRef value for this TransactionShipGroup.
     * 
     * @param sourceAddressRef
     */
    public void setSourceAddressRef(org.mule.module.netsuite.api.internal.RecordRef sourceAddressRef) {
        this.sourceAddressRef = sourceAddressRef;
    }


    /**
     * Gets the sourceAddress value for this TransactionShipGroup.
     * 
     * @return sourceAddress
     */
    public java.lang.String getSourceAddress() {
        return sourceAddress;
    }


    /**
     * Sets the sourceAddress value for this TransactionShipGroup.
     * 
     * @param sourceAddress
     */
    public void setSourceAddress(java.lang.String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }


    /**
     * Gets the destinationAddressRef value for this TransactionShipGroup.
     * 
     * @return destinationAddressRef
     */
    public org.mule.module.netsuite.api.internal.RecordRef getDestinationAddressRef() {
        return destinationAddressRef;
    }


    /**
     * Sets the destinationAddressRef value for this TransactionShipGroup.
     * 
     * @param destinationAddressRef
     */
    public void setDestinationAddressRef(org.mule.module.netsuite.api.internal.RecordRef destinationAddressRef) {
        this.destinationAddressRef = destinationAddressRef;
    }


    /**
     * Gets the destinationAddress value for this TransactionShipGroup.
     * 
     * @return destinationAddress
     */
    public java.lang.String getDestinationAddress() {
        return destinationAddress;
    }


    /**
     * Sets the destinationAddress value for this TransactionShipGroup.
     * 
     * @param destinationAddress
     */
    public void setDestinationAddress(java.lang.String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }


    /**
     * Gets the shippingMethodRef value for this TransactionShipGroup.
     * 
     * @return shippingMethodRef
     */
    public org.mule.module.netsuite.api.internal.RecordRef getShippingMethodRef() {
        return shippingMethodRef;
    }


    /**
     * Sets the shippingMethodRef value for this TransactionShipGroup.
     * 
     * @param shippingMethodRef
     */
    public void setShippingMethodRef(org.mule.module.netsuite.api.internal.RecordRef shippingMethodRef) {
        this.shippingMethodRef = shippingMethodRef;
    }


    /**
     * Gets the shippingMethod value for this TransactionShipGroup.
     * 
     * @return shippingMethod
     */
    public java.lang.String getShippingMethod() {
        return shippingMethod;
    }


    /**
     * Sets the shippingMethod value for this TransactionShipGroup.
     * 
     * @param shippingMethod
     */
    public void setShippingMethod(java.lang.String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }


    /**
     * Gets the isHandlingTaxable value for this TransactionShipGroup.
     * 
     * @return isHandlingTaxable
     */
    public java.lang.Boolean getIsHandlingTaxable() {
        return isHandlingTaxable;
    }


    /**
     * Sets the isHandlingTaxable value for this TransactionShipGroup.
     * 
     * @param isHandlingTaxable
     */
    public void setIsHandlingTaxable(java.lang.Boolean isHandlingTaxable) {
        this.isHandlingTaxable = isHandlingTaxable;
    }


    /**
     * Gets the handlingTaxCode value for this TransactionShipGroup.
     * 
     * @return handlingTaxCode
     */
    public org.mule.module.netsuite.api.internal.RecordRef getHandlingTaxCode() {
        return handlingTaxCode;
    }


    /**
     * Sets the handlingTaxCode value for this TransactionShipGroup.
     * 
     * @param handlingTaxCode
     */
    public void setHandlingTaxCode(org.mule.module.netsuite.api.internal.RecordRef handlingTaxCode) {
        this.handlingTaxCode = handlingTaxCode;
    }


    /**
     * Gets the handlingTaxRate value for this TransactionShipGroup.
     * 
     * @return handlingTaxRate
     */
    public java.lang.String getHandlingTaxRate() {
        return handlingTaxRate;
    }


    /**
     * Sets the handlingTaxRate value for this TransactionShipGroup.
     * 
     * @param handlingTaxRate
     */
    public void setHandlingTaxRate(java.lang.String handlingTaxRate) {
        this.handlingTaxRate = handlingTaxRate;
    }


    /**
     * Gets the handlingTax2Rate value for this TransactionShipGroup.
     * 
     * @return handlingTax2Rate
     */
    public java.lang.String getHandlingTax2Rate() {
        return handlingTax2Rate;
    }


    /**
     * Sets the handlingTax2Rate value for this TransactionShipGroup.
     * 
     * @param handlingTax2Rate
     */
    public void setHandlingTax2Rate(java.lang.String handlingTax2Rate) {
        this.handlingTax2Rate = handlingTax2Rate;
    }


    /**
     * Gets the handlingRate value for this TransactionShipGroup.
     * 
     * @return handlingRate
     */
    public java.lang.Double getHandlingRate() {
        return handlingRate;
    }


    /**
     * Sets the handlingRate value for this TransactionShipGroup.
     * 
     * @param handlingRate
     */
    public void setHandlingRate(java.lang.Double handlingRate) {
        this.handlingRate = handlingRate;
    }


    /**
     * Gets the handlingTaxAmt value for this TransactionShipGroup.
     * 
     * @return handlingTaxAmt
     */
    public java.lang.Double getHandlingTaxAmt() {
        return handlingTaxAmt;
    }


    /**
     * Sets the handlingTaxAmt value for this TransactionShipGroup.
     * 
     * @param handlingTaxAmt
     */
    public void setHandlingTaxAmt(java.lang.Double handlingTaxAmt) {
        this.handlingTaxAmt = handlingTaxAmt;
    }


    /**
     * Gets the handlingTax2Amt value for this TransactionShipGroup.
     * 
     * @return handlingTax2Amt
     */
    public java.lang.Double getHandlingTax2Amt() {
        return handlingTax2Amt;
    }


    /**
     * Sets the handlingTax2Amt value for this TransactionShipGroup.
     * 
     * @param handlingTax2Amt
     */
    public void setHandlingTax2Amt(java.lang.Double handlingTax2Amt) {
        this.handlingTax2Amt = handlingTax2Amt;
    }


    /**
     * Gets the isShippingTaxable value for this TransactionShipGroup.
     * 
     * @return isShippingTaxable
     */
    public java.lang.Boolean getIsShippingTaxable() {
        return isShippingTaxable;
    }


    /**
     * Sets the isShippingTaxable value for this TransactionShipGroup.
     * 
     * @param isShippingTaxable
     */
    public void setIsShippingTaxable(java.lang.Boolean isShippingTaxable) {
        this.isShippingTaxable = isShippingTaxable;
    }


    /**
     * Gets the shippingTaxCode value for this TransactionShipGroup.
     * 
     * @return shippingTaxCode
     */
    public org.mule.module.netsuite.api.internal.RecordRef getShippingTaxCode() {
        return shippingTaxCode;
    }


    /**
     * Sets the shippingTaxCode value for this TransactionShipGroup.
     * 
     * @param shippingTaxCode
     */
    public void setShippingTaxCode(org.mule.module.netsuite.api.internal.RecordRef shippingTaxCode) {
        this.shippingTaxCode = shippingTaxCode;
    }


    /**
     * Gets the shippingTaxRate value for this TransactionShipGroup.
     * 
     * @return shippingTaxRate
     */
    public java.lang.String getShippingTaxRate() {
        return shippingTaxRate;
    }


    /**
     * Sets the shippingTaxRate value for this TransactionShipGroup.
     * 
     * @param shippingTaxRate
     */
    public void setShippingTaxRate(java.lang.String shippingTaxRate) {
        this.shippingTaxRate = shippingTaxRate;
    }


    /**
     * Gets the shippingTax2Rate value for this TransactionShipGroup.
     * 
     * @return shippingTax2Rate
     */
    public java.lang.String getShippingTax2Rate() {
        return shippingTax2Rate;
    }


    /**
     * Sets the shippingTax2Rate value for this TransactionShipGroup.
     * 
     * @param shippingTax2Rate
     */
    public void setShippingTax2Rate(java.lang.String shippingTax2Rate) {
        this.shippingTax2Rate = shippingTax2Rate;
    }


    /**
     * Gets the shippingRate value for this TransactionShipGroup.
     * 
     * @return shippingRate
     */
    public java.lang.Double getShippingRate() {
        return shippingRate;
    }


    /**
     * Sets the shippingRate value for this TransactionShipGroup.
     * 
     * @param shippingRate
     */
    public void setShippingRate(java.lang.Double shippingRate) {
        this.shippingRate = shippingRate;
    }


    /**
     * Gets the shippingTaxAmt value for this TransactionShipGroup.
     * 
     * @return shippingTaxAmt
     */
    public java.lang.Double getShippingTaxAmt() {
        return shippingTaxAmt;
    }


    /**
     * Sets the shippingTaxAmt value for this TransactionShipGroup.
     * 
     * @param shippingTaxAmt
     */
    public void setShippingTaxAmt(java.lang.Double shippingTaxAmt) {
        this.shippingTaxAmt = shippingTaxAmt;
    }


    /**
     * Gets the shippingTax2Amt value for this TransactionShipGroup.
     * 
     * @return shippingTax2Amt
     */
    public java.lang.Double getShippingTax2Amt() {
        return shippingTax2Amt;
    }


    /**
     * Sets the shippingTax2Amt value for this TransactionShipGroup.
     * 
     * @param shippingTax2Amt
     */
    public void setShippingTax2Amt(java.lang.Double shippingTax2Amt) {
        this.shippingTax2Amt = shippingTax2Amt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionShipGroup)) return false;
        TransactionShipGroup other = (TransactionShipGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.isFulfilled==null && other.getIsFulfilled()==null) || 
             (this.isFulfilled!=null &&
              this.isFulfilled.equals(other.getIsFulfilled()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.sourceAddressRef==null && other.getSourceAddressRef()==null) || 
             (this.sourceAddressRef!=null &&
              this.sourceAddressRef.equals(other.getSourceAddressRef()))) &&
            ((this.sourceAddress==null && other.getSourceAddress()==null) || 
             (this.sourceAddress!=null &&
              this.sourceAddress.equals(other.getSourceAddress()))) &&
            ((this.destinationAddressRef==null && other.getDestinationAddressRef()==null) || 
             (this.destinationAddressRef!=null &&
              this.destinationAddressRef.equals(other.getDestinationAddressRef()))) &&
            ((this.destinationAddress==null && other.getDestinationAddress()==null) || 
             (this.destinationAddress!=null &&
              this.destinationAddress.equals(other.getDestinationAddress()))) &&
            ((this.shippingMethodRef==null && other.getShippingMethodRef()==null) || 
             (this.shippingMethodRef!=null &&
              this.shippingMethodRef.equals(other.getShippingMethodRef()))) &&
            ((this.shippingMethod==null && other.getShippingMethod()==null) || 
             (this.shippingMethod!=null &&
              this.shippingMethod.equals(other.getShippingMethod()))) &&
            ((this.isHandlingTaxable==null && other.getIsHandlingTaxable()==null) || 
             (this.isHandlingTaxable!=null &&
              this.isHandlingTaxable.equals(other.getIsHandlingTaxable()))) &&
            ((this.handlingTaxCode==null && other.getHandlingTaxCode()==null) || 
             (this.handlingTaxCode!=null &&
              this.handlingTaxCode.equals(other.getHandlingTaxCode()))) &&
            ((this.handlingTaxRate==null && other.getHandlingTaxRate()==null) || 
             (this.handlingTaxRate!=null &&
              this.handlingTaxRate.equals(other.getHandlingTaxRate()))) &&
            ((this.handlingTax2Rate==null && other.getHandlingTax2Rate()==null) || 
             (this.handlingTax2Rate!=null &&
              this.handlingTax2Rate.equals(other.getHandlingTax2Rate()))) &&
            ((this.handlingRate==null && other.getHandlingRate()==null) || 
             (this.handlingRate!=null &&
              this.handlingRate.equals(other.getHandlingRate()))) &&
            ((this.handlingTaxAmt==null && other.getHandlingTaxAmt()==null) || 
             (this.handlingTaxAmt!=null &&
              this.handlingTaxAmt.equals(other.getHandlingTaxAmt()))) &&
            ((this.handlingTax2Amt==null && other.getHandlingTax2Amt()==null) || 
             (this.handlingTax2Amt!=null &&
              this.handlingTax2Amt.equals(other.getHandlingTax2Amt()))) &&
            ((this.isShippingTaxable==null && other.getIsShippingTaxable()==null) || 
             (this.isShippingTaxable!=null &&
              this.isShippingTaxable.equals(other.getIsShippingTaxable()))) &&
            ((this.shippingTaxCode==null && other.getShippingTaxCode()==null) || 
             (this.shippingTaxCode!=null &&
              this.shippingTaxCode.equals(other.getShippingTaxCode()))) &&
            ((this.shippingTaxRate==null && other.getShippingTaxRate()==null) || 
             (this.shippingTaxRate!=null &&
              this.shippingTaxRate.equals(other.getShippingTaxRate()))) &&
            ((this.shippingTax2Rate==null && other.getShippingTax2Rate()==null) || 
             (this.shippingTax2Rate!=null &&
              this.shippingTax2Rate.equals(other.getShippingTax2Rate()))) &&
            ((this.shippingRate==null && other.getShippingRate()==null) || 
             (this.shippingRate!=null &&
              this.shippingRate.equals(other.getShippingRate()))) &&
            ((this.shippingTaxAmt==null && other.getShippingTaxAmt()==null) || 
             (this.shippingTaxAmt!=null &&
              this.shippingTaxAmt.equals(other.getShippingTaxAmt()))) &&
            ((this.shippingTax2Amt==null && other.getShippingTax2Amt()==null) || 
             (this.shippingTax2Amt!=null &&
              this.shippingTax2Amt.equals(other.getShippingTax2Amt())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIsFulfilled() != null) {
            _hashCode += getIsFulfilled().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getSourceAddressRef() != null) {
            _hashCode += getSourceAddressRef().hashCode();
        }
        if (getSourceAddress() != null) {
            _hashCode += getSourceAddress().hashCode();
        }
        if (getDestinationAddressRef() != null) {
            _hashCode += getDestinationAddressRef().hashCode();
        }
        if (getDestinationAddress() != null) {
            _hashCode += getDestinationAddress().hashCode();
        }
        if (getShippingMethodRef() != null) {
            _hashCode += getShippingMethodRef().hashCode();
        }
        if (getShippingMethod() != null) {
            _hashCode += getShippingMethod().hashCode();
        }
        if (getIsHandlingTaxable() != null) {
            _hashCode += getIsHandlingTaxable().hashCode();
        }
        if (getHandlingTaxCode() != null) {
            _hashCode += getHandlingTaxCode().hashCode();
        }
        if (getHandlingTaxRate() != null) {
            _hashCode += getHandlingTaxRate().hashCode();
        }
        if (getHandlingTax2Rate() != null) {
            _hashCode += getHandlingTax2Rate().hashCode();
        }
        if (getHandlingRate() != null) {
            _hashCode += getHandlingRate().hashCode();
        }
        if (getHandlingTaxAmt() != null) {
            _hashCode += getHandlingTaxAmt().hashCode();
        }
        if (getHandlingTax2Amt() != null) {
            _hashCode += getHandlingTax2Amt().hashCode();
        }
        if (getIsShippingTaxable() != null) {
            _hashCode += getIsShippingTaxable().hashCode();
        }
        if (getShippingTaxCode() != null) {
            _hashCode += getShippingTaxCode().hashCode();
        }
        if (getShippingTaxRate() != null) {
            _hashCode += getShippingTaxRate().hashCode();
        }
        if (getShippingTax2Rate() != null) {
            _hashCode += getShippingTax2Rate().hashCode();
        }
        if (getShippingRate() != null) {
            _hashCode += getShippingRate().hashCode();
        }
        if (getShippingTaxAmt() != null) {
            _hashCode += getShippingTaxAmt().hashCode();
        }
        if (getShippingTax2Amt() != null) {
            _hashCode += getShippingTax2Amt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionShipGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "TransactionShipGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFulfilled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "isFulfilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceAddressRef");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "sourceAddressRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "sourceAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationAddressRef");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "destinationAddressRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "destinationAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingMethodRef");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shippingMethodRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shippingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isHandlingTaxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "isHandlingTaxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingTaxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "handlingTaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingTaxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "handlingTaxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingTax2Rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "handlingTax2Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "handlingRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingTaxAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "handlingTaxAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingTax2Amt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "handlingTax2Amt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isShippingTaxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "isShippingTaxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingTaxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shippingTaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingTaxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shippingTaxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingTax2Rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shippingTax2Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shippingRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingTaxAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shippingTaxAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingTax2Amt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shippingTax2Amt"));
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
