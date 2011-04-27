
package com.netsuite.webservices.setup.customization_2010_2;

import com.netsuite.webservices.platform.core_2010_2.RecordRef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomRecordTypeTabs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomRecordTypeTabs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tabTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tabParent" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="tabTitleLanguageValueList" type="{urn:customization_2010_2.setup.webservices.netsuite.com}LanguageValueList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomRecordTypeTabs", propOrder = {
    "tabTitle",
    "tabParent",
    "tabTitleLanguageValueList"
})
public class CustomRecordTypeTabs {

    protected String tabTitle;
    protected RecordRef tabParent;
    protected LanguageValueList tabTitleLanguageValueList;

    /**
     * Gets the value of the tabTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTabTitle() {
        return tabTitle;
    }

    /**
     * Sets the value of the tabTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTabTitle(String value) {
        this.tabTitle = value;
    }

    /**
     * Gets the value of the tabParent property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTabParent() {
        return tabParent;
    }

    /**
     * Sets the value of the tabParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTabParent(RecordRef value) {
        this.tabParent = value;
    }

    /**
     * Gets the value of the tabTitleLanguageValueList property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageValueList }
     *     
     */
    public LanguageValueList getTabTitleLanguageValueList() {
        return tabTitleLanguageValueList;
    }

    /**
     * Sets the value of the tabTitleLanguageValueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageValueList }
     *     
     */
    public void setTabTitleLanguageValueList(LanguageValueList value) {
        this.tabTitleLanguageValueList = value;
    }

}
