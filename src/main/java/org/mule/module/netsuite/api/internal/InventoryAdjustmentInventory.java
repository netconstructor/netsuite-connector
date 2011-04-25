/**
 * InventoryAdjustmentInventory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class InventoryAdjustmentInventory  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef item;

    private java.lang.String description;

    private org.mule.module.netsuite.api.internal.RecordRef location;

    private org.mule.module.netsuite.api.internal.RecordRef units;

    private java.lang.Double quantityOnHand;

    private java.lang.Double currentValue;

    private java.lang.Double adjustQtyBy;

    private java.lang.String binNumbers;

    private java.lang.String serialNumbers;

    private java.lang.Double newQuantity;

    private java.lang.Double unitCost;

    private java.lang.Double foreignCurrencyUnitCost;

    private java.lang.String memo;

    private java.lang.String currency;

    private java.util.Calendar expirationDate;

    private java.lang.Double exchangeRate;

    public InventoryAdjustmentInventory() {
    }

    public InventoryAdjustmentInventory(
           org.mule.module.netsuite.api.internal.RecordRef item,
           java.lang.String description,
           org.mule.module.netsuite.api.internal.RecordRef location,
           org.mule.module.netsuite.api.internal.RecordRef units,
           java.lang.Double quantityOnHand,
           java.lang.Double currentValue,
           java.lang.Double adjustQtyBy,
           java.lang.String binNumbers,
           java.lang.String serialNumbers,
           java.lang.Double newQuantity,
           java.lang.Double unitCost,
           java.lang.Double foreignCurrencyUnitCost,
           java.lang.String memo,
           java.lang.String currency,
           java.util.Calendar expirationDate,
           java.lang.Double exchangeRate) {
           this.item = item;
           this.description = description;
           this.location = location;
           this.units = units;
           this.quantityOnHand = quantityOnHand;
           this.currentValue = currentValue;
           this.adjustQtyBy = adjustQtyBy;
           this.binNumbers = binNumbers;
           this.serialNumbers = serialNumbers;
           this.newQuantity = newQuantity;
           this.unitCost = unitCost;
           this.foreignCurrencyUnitCost = foreignCurrencyUnitCost;
           this.memo = memo;
           this.currency = currency;
           this.expirationDate = expirationDate;
           this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the item value for this InventoryAdjustmentInventory.
     * 
     * @return item
     */
    public org.mule.module.netsuite.api.internal.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this InventoryAdjustmentInventory.
     * 
     * @param item
     */
    public void setItem(org.mule.module.netsuite.api.internal.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the description value for this InventoryAdjustmentInventory.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this InventoryAdjustmentInventory.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the location value for this InventoryAdjustmentInventory.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this InventoryAdjustmentInventory.
     * 
     * @param location
     */
    public void setLocation(org.mule.module.netsuite.api.internal.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the units value for this InventoryAdjustmentInventory.
     * 
     * @return units
     */
    public org.mule.module.netsuite.api.internal.RecordRef getUnits() {
        return units;
    }


    /**
     * Sets the units value for this InventoryAdjustmentInventory.
     * 
     * @param units
     */
    public void setUnits(org.mule.module.netsuite.api.internal.RecordRef units) {
        this.units = units;
    }


    /**
     * Gets the quantityOnHand value for this InventoryAdjustmentInventory.
     * 
     * @return quantityOnHand
     */
    public java.lang.Double getQuantityOnHand() {
        return quantityOnHand;
    }


    /**
     * Sets the quantityOnHand value for this InventoryAdjustmentInventory.
     * 
     * @param quantityOnHand
     */
    public void setQuantityOnHand(java.lang.Double quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }


    /**
     * Gets the currentValue value for this InventoryAdjustmentInventory.
     * 
     * @return currentValue
     */
    public java.lang.Double getCurrentValue() {
        return currentValue;
    }


    /**
     * Sets the currentValue value for this InventoryAdjustmentInventory.
     * 
     * @param currentValue
     */
    public void setCurrentValue(java.lang.Double currentValue) {
        this.currentValue = currentValue;
    }


    /**
     * Gets the adjustQtyBy value for this InventoryAdjustmentInventory.
     * 
     * @return adjustQtyBy
     */
    public java.lang.Double getAdjustQtyBy() {
        return adjustQtyBy;
    }


    /**
     * Sets the adjustQtyBy value for this InventoryAdjustmentInventory.
     * 
     * @param adjustQtyBy
     */
    public void setAdjustQtyBy(java.lang.Double adjustQtyBy) {
        this.adjustQtyBy = adjustQtyBy;
    }


    /**
     * Gets the binNumbers value for this InventoryAdjustmentInventory.
     * 
     * @return binNumbers
     */
    public java.lang.String getBinNumbers() {
        return binNumbers;
    }


    /**
     * Sets the binNumbers value for this InventoryAdjustmentInventory.
     * 
     * @param binNumbers
     */
    public void setBinNumbers(java.lang.String binNumbers) {
        this.binNumbers = binNumbers;
    }


    /**
     * Gets the serialNumbers value for this InventoryAdjustmentInventory.
     * 
     * @return serialNumbers
     */
    public java.lang.String getSerialNumbers() {
        return serialNumbers;
    }


    /**
     * Sets the serialNumbers value for this InventoryAdjustmentInventory.
     * 
     * @param serialNumbers
     */
    public void setSerialNumbers(java.lang.String serialNumbers) {
        this.serialNumbers = serialNumbers;
    }


    /**
     * Gets the newQuantity value for this InventoryAdjustmentInventory.
     * 
     * @return newQuantity
     */
    public java.lang.Double getNewQuantity() {
        return newQuantity;
    }


    /**
     * Sets the newQuantity value for this InventoryAdjustmentInventory.
     * 
     * @param newQuantity
     */
    public void setNewQuantity(java.lang.Double newQuantity) {
        this.newQuantity = newQuantity;
    }


    /**
     * Gets the unitCost value for this InventoryAdjustmentInventory.
     * 
     * @return unitCost
     */
    public java.lang.Double getUnitCost() {
        return unitCost;
    }


    /**
     * Sets the unitCost value for this InventoryAdjustmentInventory.
     * 
     * @param unitCost
     */
    public void setUnitCost(java.lang.Double unitCost) {
        this.unitCost = unitCost;
    }


    /**
     * Gets the foreignCurrencyUnitCost value for this InventoryAdjustmentInventory.
     * 
     * @return foreignCurrencyUnitCost
     */
    public java.lang.Double getForeignCurrencyUnitCost() {
        return foreignCurrencyUnitCost;
    }


    /**
     * Sets the foreignCurrencyUnitCost value for this InventoryAdjustmentInventory.
     * 
     * @param foreignCurrencyUnitCost
     */
    public void setForeignCurrencyUnitCost(java.lang.Double foreignCurrencyUnitCost) {
        this.foreignCurrencyUnitCost = foreignCurrencyUnitCost;
    }


    /**
     * Gets the memo value for this InventoryAdjustmentInventory.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this InventoryAdjustmentInventory.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the currency value for this InventoryAdjustmentInventory.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this InventoryAdjustmentInventory.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the expirationDate value for this InventoryAdjustmentInventory.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this InventoryAdjustmentInventory.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the exchangeRate value for this InventoryAdjustmentInventory.
     * 
     * @return exchangeRate
     */
    public java.lang.Double getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this InventoryAdjustmentInventory.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.lang.Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InventoryAdjustmentInventory)) return false;
        InventoryAdjustmentInventory other = (InventoryAdjustmentInventory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            ((this.quantityOnHand==null && other.getQuantityOnHand()==null) || 
             (this.quantityOnHand!=null &&
              this.quantityOnHand.equals(other.getQuantityOnHand()))) &&
            ((this.currentValue==null && other.getCurrentValue()==null) || 
             (this.currentValue!=null &&
              this.currentValue.equals(other.getCurrentValue()))) &&
            ((this.adjustQtyBy==null && other.getAdjustQtyBy()==null) || 
             (this.adjustQtyBy!=null &&
              this.adjustQtyBy.equals(other.getAdjustQtyBy()))) &&
            ((this.binNumbers==null && other.getBinNumbers()==null) || 
             (this.binNumbers!=null &&
              this.binNumbers.equals(other.getBinNumbers()))) &&
            ((this.serialNumbers==null && other.getSerialNumbers()==null) || 
             (this.serialNumbers!=null &&
              this.serialNumbers.equals(other.getSerialNumbers()))) &&
            ((this.newQuantity==null && other.getNewQuantity()==null) || 
             (this.newQuantity!=null &&
              this.newQuantity.equals(other.getNewQuantity()))) &&
            ((this.unitCost==null && other.getUnitCost()==null) || 
             (this.unitCost!=null &&
              this.unitCost.equals(other.getUnitCost()))) &&
            ((this.foreignCurrencyUnitCost==null && other.getForeignCurrencyUnitCost()==null) || 
             (this.foreignCurrencyUnitCost!=null &&
              this.foreignCurrencyUnitCost.equals(other.getForeignCurrencyUnitCost()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate())));
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
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        if (getQuantityOnHand() != null) {
            _hashCode += getQuantityOnHand().hashCode();
        }
        if (getCurrentValue() != null) {
            _hashCode += getCurrentValue().hashCode();
        }
        if (getAdjustQtyBy() != null) {
            _hashCode += getAdjustQtyBy().hashCode();
        }
        if (getBinNumbers() != null) {
            _hashCode += getBinNumbers().hashCode();
        }
        if (getSerialNumbers() != null) {
            _hashCode += getSerialNumbers().hashCode();
        }
        if (getNewQuantity() != null) {
            _hashCode += getNewQuantity().hashCode();
        }
        if (getUnitCost() != null) {
            _hashCode += getUnitCost().hashCode();
        }
        if (getForeignCurrencyUnitCost() != null) {
            _hashCode += getForeignCurrencyUnitCost().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InventoryAdjustmentInventory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "InventoryAdjustmentInventory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "currentValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustQtyBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "adjustQtyBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "binNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "serialNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "newQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "unitCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignCurrencyUnitCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "foreignCurrencyUnitCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "exchangeRate"));
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
