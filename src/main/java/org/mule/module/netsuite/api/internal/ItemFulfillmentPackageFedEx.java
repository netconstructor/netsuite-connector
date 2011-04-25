/**
 * ItemFulfillmentPackageFedEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ItemFulfillmentPackageFedEx  implements java.io.Serializable {
    private java.lang.Double packageWeightFedEx;

    private java.lang.String packageTrackingNumberFedEx;

    private org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExPackagingFedEx packagingFedEx;

    private org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExAdmPackageTypeFedEx admPackageTypeFedEx;

    private java.lang.Boolean isNonStandardContainerFedEx;

    private java.lang.Double insuredValueFedEx;

    private java.lang.Boolean useInsuredValueFedEx;

    private java.lang.String reference1FedEx;

    private java.lang.Long packageLengthFedEx;

    private java.lang.Long packageWidthFedEx;

    private java.lang.Long packageHeightFedEx;

    private java.lang.Boolean useCodFedEx;

    private java.lang.Double codAmountFedEx;

    private org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExCodMethodFedEx codMethodFedEx;

    private org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExCodFreightTypeFedEx codFreightTypeFedEx;

    private org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExDeliveryConfFedEx deliveryConfFedEx;

    private org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExSignatureOptionsFedEx signatureOptionsFedEx;

    private java.lang.String signatureReleaseFedEx;

    private java.lang.String authorizationNumberFedEx;

    public ItemFulfillmentPackageFedEx() {
    }

    public ItemFulfillmentPackageFedEx(
           java.lang.Double packageWeightFedEx,
           java.lang.String packageTrackingNumberFedEx,
           org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExPackagingFedEx packagingFedEx,
           org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExAdmPackageTypeFedEx admPackageTypeFedEx,
           java.lang.Boolean isNonStandardContainerFedEx,
           java.lang.Double insuredValueFedEx,
           java.lang.Boolean useInsuredValueFedEx,
           java.lang.String reference1FedEx,
           java.lang.Long packageLengthFedEx,
           java.lang.Long packageWidthFedEx,
           java.lang.Long packageHeightFedEx,
           java.lang.Boolean useCodFedEx,
           java.lang.Double codAmountFedEx,
           org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExCodMethodFedEx codMethodFedEx,
           org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExCodFreightTypeFedEx codFreightTypeFedEx,
           org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExDeliveryConfFedEx deliveryConfFedEx,
           org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExSignatureOptionsFedEx signatureOptionsFedEx,
           java.lang.String signatureReleaseFedEx,
           java.lang.String authorizationNumberFedEx) {
           this.packageWeightFedEx = packageWeightFedEx;
           this.packageTrackingNumberFedEx = packageTrackingNumberFedEx;
           this.packagingFedEx = packagingFedEx;
           this.admPackageTypeFedEx = admPackageTypeFedEx;
           this.isNonStandardContainerFedEx = isNonStandardContainerFedEx;
           this.insuredValueFedEx = insuredValueFedEx;
           this.useInsuredValueFedEx = useInsuredValueFedEx;
           this.reference1FedEx = reference1FedEx;
           this.packageLengthFedEx = packageLengthFedEx;
           this.packageWidthFedEx = packageWidthFedEx;
           this.packageHeightFedEx = packageHeightFedEx;
           this.useCodFedEx = useCodFedEx;
           this.codAmountFedEx = codAmountFedEx;
           this.codMethodFedEx = codMethodFedEx;
           this.codFreightTypeFedEx = codFreightTypeFedEx;
           this.deliveryConfFedEx = deliveryConfFedEx;
           this.signatureOptionsFedEx = signatureOptionsFedEx;
           this.signatureReleaseFedEx = signatureReleaseFedEx;
           this.authorizationNumberFedEx = authorizationNumberFedEx;
    }


    /**
     * Gets the packageWeightFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return packageWeightFedEx
     */
    public java.lang.Double getPackageWeightFedEx() {
        return packageWeightFedEx;
    }


    /**
     * Sets the packageWeightFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param packageWeightFedEx
     */
    public void setPackageWeightFedEx(java.lang.Double packageWeightFedEx) {
        this.packageWeightFedEx = packageWeightFedEx;
    }


    /**
     * Gets the packageTrackingNumberFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return packageTrackingNumberFedEx
     */
    public java.lang.String getPackageTrackingNumberFedEx() {
        return packageTrackingNumberFedEx;
    }


    /**
     * Sets the packageTrackingNumberFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param packageTrackingNumberFedEx
     */
    public void setPackageTrackingNumberFedEx(java.lang.String packageTrackingNumberFedEx) {
        this.packageTrackingNumberFedEx = packageTrackingNumberFedEx;
    }


    /**
     * Gets the packagingFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return packagingFedEx
     */
    public org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExPackagingFedEx getPackagingFedEx() {
        return packagingFedEx;
    }


    /**
     * Sets the packagingFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param packagingFedEx
     */
    public void setPackagingFedEx(org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExPackagingFedEx packagingFedEx) {
        this.packagingFedEx = packagingFedEx;
    }


    /**
     * Gets the admPackageTypeFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return admPackageTypeFedEx
     */
    public org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExAdmPackageTypeFedEx getAdmPackageTypeFedEx() {
        return admPackageTypeFedEx;
    }


    /**
     * Sets the admPackageTypeFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param admPackageTypeFedEx
     */
    public void setAdmPackageTypeFedEx(org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExAdmPackageTypeFedEx admPackageTypeFedEx) {
        this.admPackageTypeFedEx = admPackageTypeFedEx;
    }


    /**
     * Gets the isNonStandardContainerFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return isNonStandardContainerFedEx
     */
    public java.lang.Boolean getIsNonStandardContainerFedEx() {
        return isNonStandardContainerFedEx;
    }


    /**
     * Sets the isNonStandardContainerFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param isNonStandardContainerFedEx
     */
    public void setIsNonStandardContainerFedEx(java.lang.Boolean isNonStandardContainerFedEx) {
        this.isNonStandardContainerFedEx = isNonStandardContainerFedEx;
    }


    /**
     * Gets the insuredValueFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return insuredValueFedEx
     */
    public java.lang.Double getInsuredValueFedEx() {
        return insuredValueFedEx;
    }


    /**
     * Sets the insuredValueFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param insuredValueFedEx
     */
    public void setInsuredValueFedEx(java.lang.Double insuredValueFedEx) {
        this.insuredValueFedEx = insuredValueFedEx;
    }


    /**
     * Gets the useInsuredValueFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return useInsuredValueFedEx
     */
    public java.lang.Boolean getUseInsuredValueFedEx() {
        return useInsuredValueFedEx;
    }


    /**
     * Sets the useInsuredValueFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param useInsuredValueFedEx
     */
    public void setUseInsuredValueFedEx(java.lang.Boolean useInsuredValueFedEx) {
        this.useInsuredValueFedEx = useInsuredValueFedEx;
    }


    /**
     * Gets the reference1FedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return reference1FedEx
     */
    public java.lang.String getReference1FedEx() {
        return reference1FedEx;
    }


    /**
     * Sets the reference1FedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param reference1FedEx
     */
    public void setReference1FedEx(java.lang.String reference1FedEx) {
        this.reference1FedEx = reference1FedEx;
    }


    /**
     * Gets the packageLengthFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return packageLengthFedEx
     */
    public java.lang.Long getPackageLengthFedEx() {
        return packageLengthFedEx;
    }


    /**
     * Sets the packageLengthFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param packageLengthFedEx
     */
    public void setPackageLengthFedEx(java.lang.Long packageLengthFedEx) {
        this.packageLengthFedEx = packageLengthFedEx;
    }


    /**
     * Gets the packageWidthFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return packageWidthFedEx
     */
    public java.lang.Long getPackageWidthFedEx() {
        return packageWidthFedEx;
    }


    /**
     * Sets the packageWidthFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param packageWidthFedEx
     */
    public void setPackageWidthFedEx(java.lang.Long packageWidthFedEx) {
        this.packageWidthFedEx = packageWidthFedEx;
    }


    /**
     * Gets the packageHeightFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return packageHeightFedEx
     */
    public java.lang.Long getPackageHeightFedEx() {
        return packageHeightFedEx;
    }


    /**
     * Sets the packageHeightFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param packageHeightFedEx
     */
    public void setPackageHeightFedEx(java.lang.Long packageHeightFedEx) {
        this.packageHeightFedEx = packageHeightFedEx;
    }


    /**
     * Gets the useCodFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return useCodFedEx
     */
    public java.lang.Boolean getUseCodFedEx() {
        return useCodFedEx;
    }


    /**
     * Sets the useCodFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param useCodFedEx
     */
    public void setUseCodFedEx(java.lang.Boolean useCodFedEx) {
        this.useCodFedEx = useCodFedEx;
    }


    /**
     * Gets the codAmountFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return codAmountFedEx
     */
    public java.lang.Double getCodAmountFedEx() {
        return codAmountFedEx;
    }


    /**
     * Sets the codAmountFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param codAmountFedEx
     */
    public void setCodAmountFedEx(java.lang.Double codAmountFedEx) {
        this.codAmountFedEx = codAmountFedEx;
    }


    /**
     * Gets the codMethodFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return codMethodFedEx
     */
    public org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExCodMethodFedEx getCodMethodFedEx() {
        return codMethodFedEx;
    }


    /**
     * Sets the codMethodFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param codMethodFedEx
     */
    public void setCodMethodFedEx(org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExCodMethodFedEx codMethodFedEx) {
        this.codMethodFedEx = codMethodFedEx;
    }


    /**
     * Gets the codFreightTypeFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return codFreightTypeFedEx
     */
    public org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExCodFreightTypeFedEx getCodFreightTypeFedEx() {
        return codFreightTypeFedEx;
    }


    /**
     * Sets the codFreightTypeFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param codFreightTypeFedEx
     */
    public void setCodFreightTypeFedEx(org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExCodFreightTypeFedEx codFreightTypeFedEx) {
        this.codFreightTypeFedEx = codFreightTypeFedEx;
    }


    /**
     * Gets the deliveryConfFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return deliveryConfFedEx
     */
    public org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExDeliveryConfFedEx getDeliveryConfFedEx() {
        return deliveryConfFedEx;
    }


    /**
     * Sets the deliveryConfFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param deliveryConfFedEx
     */
    public void setDeliveryConfFedEx(org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExDeliveryConfFedEx deliveryConfFedEx) {
        this.deliveryConfFedEx = deliveryConfFedEx;
    }


    /**
     * Gets the signatureOptionsFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return signatureOptionsFedEx
     */
    public org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExSignatureOptionsFedEx getSignatureOptionsFedEx() {
        return signatureOptionsFedEx;
    }


    /**
     * Sets the signatureOptionsFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param signatureOptionsFedEx
     */
    public void setSignatureOptionsFedEx(org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExSignatureOptionsFedEx signatureOptionsFedEx) {
        this.signatureOptionsFedEx = signatureOptionsFedEx;
    }


    /**
     * Gets the signatureReleaseFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return signatureReleaseFedEx
     */
    public java.lang.String getSignatureReleaseFedEx() {
        return signatureReleaseFedEx;
    }


    /**
     * Sets the signatureReleaseFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param signatureReleaseFedEx
     */
    public void setSignatureReleaseFedEx(java.lang.String signatureReleaseFedEx) {
        this.signatureReleaseFedEx = signatureReleaseFedEx;
    }


    /**
     * Gets the authorizationNumberFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @return authorizationNumberFedEx
     */
    public java.lang.String getAuthorizationNumberFedEx() {
        return authorizationNumberFedEx;
    }


    /**
     * Sets the authorizationNumberFedEx value for this ItemFulfillmentPackageFedEx.
     * 
     * @param authorizationNumberFedEx
     */
    public void setAuthorizationNumberFedEx(java.lang.String authorizationNumberFedEx) {
        this.authorizationNumberFedEx = authorizationNumberFedEx;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemFulfillmentPackageFedEx)) return false;
        ItemFulfillmentPackageFedEx other = (ItemFulfillmentPackageFedEx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packageWeightFedEx==null && other.getPackageWeightFedEx()==null) || 
             (this.packageWeightFedEx!=null &&
              this.packageWeightFedEx.equals(other.getPackageWeightFedEx()))) &&
            ((this.packageTrackingNumberFedEx==null && other.getPackageTrackingNumberFedEx()==null) || 
             (this.packageTrackingNumberFedEx!=null &&
              this.packageTrackingNumberFedEx.equals(other.getPackageTrackingNumberFedEx()))) &&
            ((this.packagingFedEx==null && other.getPackagingFedEx()==null) || 
             (this.packagingFedEx!=null &&
              this.packagingFedEx.equals(other.getPackagingFedEx()))) &&
            ((this.admPackageTypeFedEx==null && other.getAdmPackageTypeFedEx()==null) || 
             (this.admPackageTypeFedEx!=null &&
              this.admPackageTypeFedEx.equals(other.getAdmPackageTypeFedEx()))) &&
            ((this.isNonStandardContainerFedEx==null && other.getIsNonStandardContainerFedEx()==null) || 
             (this.isNonStandardContainerFedEx!=null &&
              this.isNonStandardContainerFedEx.equals(other.getIsNonStandardContainerFedEx()))) &&
            ((this.insuredValueFedEx==null && other.getInsuredValueFedEx()==null) || 
             (this.insuredValueFedEx!=null &&
              this.insuredValueFedEx.equals(other.getInsuredValueFedEx()))) &&
            ((this.useInsuredValueFedEx==null && other.getUseInsuredValueFedEx()==null) || 
             (this.useInsuredValueFedEx!=null &&
              this.useInsuredValueFedEx.equals(other.getUseInsuredValueFedEx()))) &&
            ((this.reference1FedEx==null && other.getReference1FedEx()==null) || 
             (this.reference1FedEx!=null &&
              this.reference1FedEx.equals(other.getReference1FedEx()))) &&
            ((this.packageLengthFedEx==null && other.getPackageLengthFedEx()==null) || 
             (this.packageLengthFedEx!=null &&
              this.packageLengthFedEx.equals(other.getPackageLengthFedEx()))) &&
            ((this.packageWidthFedEx==null && other.getPackageWidthFedEx()==null) || 
             (this.packageWidthFedEx!=null &&
              this.packageWidthFedEx.equals(other.getPackageWidthFedEx()))) &&
            ((this.packageHeightFedEx==null && other.getPackageHeightFedEx()==null) || 
             (this.packageHeightFedEx!=null &&
              this.packageHeightFedEx.equals(other.getPackageHeightFedEx()))) &&
            ((this.useCodFedEx==null && other.getUseCodFedEx()==null) || 
             (this.useCodFedEx!=null &&
              this.useCodFedEx.equals(other.getUseCodFedEx()))) &&
            ((this.codAmountFedEx==null && other.getCodAmountFedEx()==null) || 
             (this.codAmountFedEx!=null &&
              this.codAmountFedEx.equals(other.getCodAmountFedEx()))) &&
            ((this.codMethodFedEx==null && other.getCodMethodFedEx()==null) || 
             (this.codMethodFedEx!=null &&
              this.codMethodFedEx.equals(other.getCodMethodFedEx()))) &&
            ((this.codFreightTypeFedEx==null && other.getCodFreightTypeFedEx()==null) || 
             (this.codFreightTypeFedEx!=null &&
              this.codFreightTypeFedEx.equals(other.getCodFreightTypeFedEx()))) &&
            ((this.deliveryConfFedEx==null && other.getDeliveryConfFedEx()==null) || 
             (this.deliveryConfFedEx!=null &&
              this.deliveryConfFedEx.equals(other.getDeliveryConfFedEx()))) &&
            ((this.signatureOptionsFedEx==null && other.getSignatureOptionsFedEx()==null) || 
             (this.signatureOptionsFedEx!=null &&
              this.signatureOptionsFedEx.equals(other.getSignatureOptionsFedEx()))) &&
            ((this.signatureReleaseFedEx==null && other.getSignatureReleaseFedEx()==null) || 
             (this.signatureReleaseFedEx!=null &&
              this.signatureReleaseFedEx.equals(other.getSignatureReleaseFedEx()))) &&
            ((this.authorizationNumberFedEx==null && other.getAuthorizationNumberFedEx()==null) || 
             (this.authorizationNumberFedEx!=null &&
              this.authorizationNumberFedEx.equals(other.getAuthorizationNumberFedEx())));
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
        if (getPackageWeightFedEx() != null) {
            _hashCode += getPackageWeightFedEx().hashCode();
        }
        if (getPackageTrackingNumberFedEx() != null) {
            _hashCode += getPackageTrackingNumberFedEx().hashCode();
        }
        if (getPackagingFedEx() != null) {
            _hashCode += getPackagingFedEx().hashCode();
        }
        if (getAdmPackageTypeFedEx() != null) {
            _hashCode += getAdmPackageTypeFedEx().hashCode();
        }
        if (getIsNonStandardContainerFedEx() != null) {
            _hashCode += getIsNonStandardContainerFedEx().hashCode();
        }
        if (getInsuredValueFedEx() != null) {
            _hashCode += getInsuredValueFedEx().hashCode();
        }
        if (getUseInsuredValueFedEx() != null) {
            _hashCode += getUseInsuredValueFedEx().hashCode();
        }
        if (getReference1FedEx() != null) {
            _hashCode += getReference1FedEx().hashCode();
        }
        if (getPackageLengthFedEx() != null) {
            _hashCode += getPackageLengthFedEx().hashCode();
        }
        if (getPackageWidthFedEx() != null) {
            _hashCode += getPackageWidthFedEx().hashCode();
        }
        if (getPackageHeightFedEx() != null) {
            _hashCode += getPackageHeightFedEx().hashCode();
        }
        if (getUseCodFedEx() != null) {
            _hashCode += getUseCodFedEx().hashCode();
        }
        if (getCodAmountFedEx() != null) {
            _hashCode += getCodAmountFedEx().hashCode();
        }
        if (getCodMethodFedEx() != null) {
            _hashCode += getCodMethodFedEx().hashCode();
        }
        if (getCodFreightTypeFedEx() != null) {
            _hashCode += getCodFreightTypeFedEx().hashCode();
        }
        if (getDeliveryConfFedEx() != null) {
            _hashCode += getDeliveryConfFedEx().hashCode();
        }
        if (getSignatureOptionsFedEx() != null) {
            _hashCode += getSignatureOptionsFedEx().hashCode();
        }
        if (getSignatureReleaseFedEx() != null) {
            _hashCode += getSignatureReleaseFedEx().hashCode();
        }
        if (getAuthorizationNumberFedEx() != null) {
            _hashCode += getAuthorizationNumberFedEx().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemFulfillmentPackageFedEx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedEx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageWeightFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "packageWeightFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageTrackingNumberFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "packageTrackingNumberFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packagingFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "packagingFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExPackagingFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admPackageTypeFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "admPackageTypeFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExAdmPackageTypeFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNonStandardContainerFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "isNonStandardContainerFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuredValueFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "insuredValueFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useInsuredValueFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "useInsuredValueFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference1FedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "reference1FedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageLengthFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "packageLengthFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageWidthFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "packageWidthFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageHeightFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "packageHeightFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useCodFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "useCodFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codAmountFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "codAmountFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codMethodFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "codMethodFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExCodMethodFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codFreightTypeFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "codFreightTypeFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExCodFreightTypeFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryConfFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "deliveryConfFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExDeliveryConfFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureOptionsFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "signatureOptionsFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExSignatureOptionsFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureReleaseFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "signatureReleaseFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationNumberFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "authorizationNumberFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
