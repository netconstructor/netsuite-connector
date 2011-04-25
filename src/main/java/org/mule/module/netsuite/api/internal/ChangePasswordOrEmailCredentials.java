/**
 * ChangePasswordOrEmailCredentials.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ChangePasswordOrEmailCredentials  implements java.io.Serializable {
    private java.lang.String currentPassword;

    private java.lang.String newEmail;

    private java.lang.String newEmail2;

    private java.lang.String newPassword;

    private java.lang.String newPassword2;

    private java.lang.Boolean justThisAccount;

    public ChangePasswordOrEmailCredentials() {
    }

    public ChangePasswordOrEmailCredentials(
           java.lang.String currentPassword,
           java.lang.String newEmail,
           java.lang.String newEmail2,
           java.lang.String newPassword,
           java.lang.String newPassword2,
           java.lang.Boolean justThisAccount) {
           this.currentPassword = currentPassword;
           this.newEmail = newEmail;
           this.newEmail2 = newEmail2;
           this.newPassword = newPassword;
           this.newPassword2 = newPassword2;
           this.justThisAccount = justThisAccount;
    }


    /**
     * Gets the currentPassword value for this ChangePasswordOrEmailCredentials.
     * 
     * @return currentPassword
     */
    public java.lang.String getCurrentPassword() {
        return currentPassword;
    }


    /**
     * Sets the currentPassword value for this ChangePasswordOrEmailCredentials.
     * 
     * @param currentPassword
     */
    public void setCurrentPassword(java.lang.String currentPassword) {
        this.currentPassword = currentPassword;
    }


    /**
     * Gets the newEmail value for this ChangePasswordOrEmailCredentials.
     * 
     * @return newEmail
     */
    public java.lang.String getNewEmail() {
        return newEmail;
    }


    /**
     * Sets the newEmail value for this ChangePasswordOrEmailCredentials.
     * 
     * @param newEmail
     */
    public void setNewEmail(java.lang.String newEmail) {
        this.newEmail = newEmail;
    }


    /**
     * Gets the newEmail2 value for this ChangePasswordOrEmailCredentials.
     * 
     * @return newEmail2
     */
    public java.lang.String getNewEmail2() {
        return newEmail2;
    }


    /**
     * Sets the newEmail2 value for this ChangePasswordOrEmailCredentials.
     * 
     * @param newEmail2
     */
    public void setNewEmail2(java.lang.String newEmail2) {
        this.newEmail2 = newEmail2;
    }


    /**
     * Gets the newPassword value for this ChangePasswordOrEmailCredentials.
     * 
     * @return newPassword
     */
    public java.lang.String getNewPassword() {
        return newPassword;
    }


    /**
     * Sets the newPassword value for this ChangePasswordOrEmailCredentials.
     * 
     * @param newPassword
     */
    public void setNewPassword(java.lang.String newPassword) {
        this.newPassword = newPassword;
    }


    /**
     * Gets the newPassword2 value for this ChangePasswordOrEmailCredentials.
     * 
     * @return newPassword2
     */
    public java.lang.String getNewPassword2() {
        return newPassword2;
    }


    /**
     * Sets the newPassword2 value for this ChangePasswordOrEmailCredentials.
     * 
     * @param newPassword2
     */
    public void setNewPassword2(java.lang.String newPassword2) {
        this.newPassword2 = newPassword2;
    }


    /**
     * Gets the justThisAccount value for this ChangePasswordOrEmailCredentials.
     * 
     * @return justThisAccount
     */
    public java.lang.Boolean getJustThisAccount() {
        return justThisAccount;
    }


    /**
     * Sets the justThisAccount value for this ChangePasswordOrEmailCredentials.
     * 
     * @param justThisAccount
     */
    public void setJustThisAccount(java.lang.Boolean justThisAccount) {
        this.justThisAccount = justThisAccount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangePasswordOrEmailCredentials)) return false;
        ChangePasswordOrEmailCredentials other = (ChangePasswordOrEmailCredentials) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currentPassword==null && other.getCurrentPassword()==null) || 
             (this.currentPassword!=null &&
              this.currentPassword.equals(other.getCurrentPassword()))) &&
            ((this.newEmail==null && other.getNewEmail()==null) || 
             (this.newEmail!=null &&
              this.newEmail.equals(other.getNewEmail()))) &&
            ((this.newEmail2==null && other.getNewEmail2()==null) || 
             (this.newEmail2!=null &&
              this.newEmail2.equals(other.getNewEmail2()))) &&
            ((this.newPassword==null && other.getNewPassword()==null) || 
             (this.newPassword!=null &&
              this.newPassword.equals(other.getNewPassword()))) &&
            ((this.newPassword2==null && other.getNewPassword2()==null) || 
             (this.newPassword2!=null &&
              this.newPassword2.equals(other.getNewPassword2()))) &&
            ((this.justThisAccount==null && other.getJustThisAccount()==null) || 
             (this.justThisAccount!=null &&
              this.justThisAccount.equals(other.getJustThisAccount())));
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
        if (getCurrentPassword() != null) {
            _hashCode += getCurrentPassword().hashCode();
        }
        if (getNewEmail() != null) {
            _hashCode += getNewEmail().hashCode();
        }
        if (getNewEmail2() != null) {
            _hashCode += getNewEmail2().hashCode();
        }
        if (getNewPassword() != null) {
            _hashCode += getNewPassword().hashCode();
        }
        if (getNewPassword2() != null) {
            _hashCode += getNewPassword2().hashCode();
        }
        if (getJustThisAccount() != null) {
            _hashCode += getJustThisAccount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangePasswordOrEmailCredentials.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "ChangePasswordOrEmailCredentials"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "currentPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "newEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newEmail2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "newEmail2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "newPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPassword2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "newPassword2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("justThisAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "justThisAccount"));
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
