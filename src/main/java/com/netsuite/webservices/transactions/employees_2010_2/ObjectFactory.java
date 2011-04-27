
package com.netsuite.webservices.transactions.employees_2010_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.netsuite.webservices.transactions.employees_2010_2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TimeBillSearch_QNAME = new QName("urn:employees_2010_2.transactions.webservices.netsuite.com", "timeBillSearch");
    private final static QName _TimeBill_QNAME = new QName("urn:employees_2010_2.transactions.webservices.netsuite.com", "TimeBill");
    private final static QName _ExpenseReport_QNAME = new QName("urn:employees_2010_2.transactions.webservices.netsuite.com", "expenseReport");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.netsuite.webservices.transactions.employees_2010_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TimeBillSearchAdvanced }
     * 
     */
    public TimeBillSearchAdvanced createTimeBillSearchAdvanced() {
        return new TimeBillSearchAdvanced();
    }

    /**
     * Create an instance of {@link TimeBill }
     * 
     */
    public TimeBill createTimeBill() {
        return new TimeBill();
    }

    /**
     * Create an instance of {@link TimeBillSearch }
     * 
     */
    public TimeBillSearch createTimeBillSearch() {
        return new TimeBillSearch();
    }

    /**
     * Create an instance of {@link ExpenseReportExpense }
     * 
     */
    public ExpenseReportExpense createExpenseReportExpense() {
        return new ExpenseReportExpense();
    }

    /**
     * Create an instance of {@link ExpenseReportExpenseList }
     * 
     */
    public ExpenseReportExpenseList createExpenseReportExpenseList() {
        return new ExpenseReportExpenseList();
    }

    /**
     * Create an instance of {@link ExpenseReport }
     * 
     */
    public ExpenseReport createExpenseReport() {
        return new ExpenseReport();
    }

    /**
     * Create an instance of {@link TimeBillSearchRow }
     * 
     */
    public TimeBillSearchRow createTimeBillSearchRow() {
        return new TimeBillSearchRow();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeBillSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:employees_2010_2.transactions.webservices.netsuite.com", name = "timeBillSearch")
    public JAXBElement<TimeBillSearch> createTimeBillSearch(TimeBillSearch value) {
        return new JAXBElement<TimeBillSearch>(_TimeBillSearch_QNAME, TimeBillSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeBill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:employees_2010_2.transactions.webservices.netsuite.com", name = "TimeBill")
    public JAXBElement<TimeBill> createTimeBill(TimeBill value) {
        return new JAXBElement<TimeBill>(_TimeBill_QNAME, TimeBill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpenseReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:employees_2010_2.transactions.webservices.netsuite.com", name = "expenseReport")
    public JAXBElement<ExpenseReport> createExpenseReport(ExpenseReport value) {
        return new JAXBElement<ExpenseReport>(_ExpenseReport_QNAME, ExpenseReport.class, null, value);
    }

}
