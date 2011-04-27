
package com.netsuite.webservices.platform.messages_2010_2;

import com.netsuite.webservices.platform.core_2010_2.BudgetExchangeRateFilter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBudgetExchangeRateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBudgetExchangeRateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="budgetExchangeRateFilter" type="{urn:core_2010_2.platform.webservices.netsuite.com}BudgetExchangeRateFilter"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBudgetExchangeRateRequest", propOrder = {
    "budgetExchangeRateFilter"
})
public class GetBudgetExchangeRateRequest {

    @XmlElement(required = true)
    protected BudgetExchangeRateFilter budgetExchangeRateFilter;
    
    public GetBudgetExchangeRateRequest()
    {
    }

    public GetBudgetExchangeRateRequest(BudgetExchangeRateFilter budgetExchangeRateFilter)
    {
        this.budgetExchangeRateFilter = budgetExchangeRateFilter;
    }

    /**
     * Gets the value of the budgetExchangeRateFilter property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetExchangeRateFilter }
     *     
     */
    public BudgetExchangeRateFilter getBudgetExchangeRateFilter() {
        return budgetExchangeRateFilter;
    }

    /**
     * Sets the value of the budgetExchangeRateFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetExchangeRateFilter }
     *     
     */
    public void setBudgetExchangeRateFilter(BudgetExchangeRateFilter value) {
        this.budgetExchangeRateFilter = value;
    }

}
