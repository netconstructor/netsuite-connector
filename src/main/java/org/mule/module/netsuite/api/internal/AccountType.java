/**
 * AccountType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class AccountType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AccountType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __accountsPayable = "_accountsPayable";
    public static final java.lang.String __accountsReceivable = "_accountsReceivable";
    public static final java.lang.String __bank = "_bank";
    public static final java.lang.String __costOfGoodsSold = "_costOfGoodsSold";
    public static final java.lang.String __creditCard = "_creditCard";
    public static final java.lang.String __deferredExpense = "_deferredExpense";
    public static final java.lang.String __deferredRevenue = "_deferredRevenue";
    public static final java.lang.String __equity = "_equity";
    public static final java.lang.String __expense = "_expense";
    public static final java.lang.String __fixedAsset = "_fixedAsset";
    public static final java.lang.String __income = "_income";
    public static final java.lang.String __longTermLiability = "_longTermLiability";
    public static final java.lang.String __nonPosting = "_nonPosting";
    public static final java.lang.String __otherAsset = "_otherAsset";
    public static final java.lang.String __otherCurrentAsset = "_otherCurrentAsset";
    public static final java.lang.String __otherCurrentLiability = "_otherCurrentLiability";
    public static final java.lang.String __otherExpense = "_otherExpense";
    public static final java.lang.String __otherIncome = "_otherIncome";
    public static final java.lang.String __unbilledReceivable = "_unbilledReceivable";
    public static final AccountType _accountsPayable = new AccountType(__accountsPayable);
    public static final AccountType _accountsReceivable = new AccountType(__accountsReceivable);
    public static final AccountType _bank = new AccountType(__bank);
    public static final AccountType _costOfGoodsSold = new AccountType(__costOfGoodsSold);
    public static final AccountType _creditCard = new AccountType(__creditCard);
    public static final AccountType _deferredExpense = new AccountType(__deferredExpense);
    public static final AccountType _deferredRevenue = new AccountType(__deferredRevenue);
    public static final AccountType _equity = new AccountType(__equity);
    public static final AccountType _expense = new AccountType(__expense);
    public static final AccountType _fixedAsset = new AccountType(__fixedAsset);
    public static final AccountType _income = new AccountType(__income);
    public static final AccountType _longTermLiability = new AccountType(__longTermLiability);
    public static final AccountType _nonPosting = new AccountType(__nonPosting);
    public static final AccountType _otherAsset = new AccountType(__otherAsset);
    public static final AccountType _otherCurrentAsset = new AccountType(__otherCurrentAsset);
    public static final AccountType _otherCurrentLiability = new AccountType(__otherCurrentLiability);
    public static final AccountType _otherExpense = new AccountType(__otherExpense);
    public static final AccountType _otherIncome = new AccountType(__otherIncome);
    public static final AccountType _unbilledReceivable = new AccountType(__unbilledReceivable);
    public java.lang.String getValue() { return _value_;}
    public static AccountType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AccountType enumeration = (AccountType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AccountType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "AccountType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
