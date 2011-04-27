
package com.netsuite.webservices.platform.core_2010_2;

import com.netsuite.webservices.activities.scheduling_2010_2.CalendarEventSearchRow;
import com.netsuite.webservices.activities.scheduling_2010_2.PhoneCallSearchRow;
import com.netsuite.webservices.activities.scheduling_2010_2.ProjectTaskSearchRow;
import com.netsuite.webservices.activities.scheduling_2010_2.TaskSearchRow;
import com.netsuite.webservices.documents.filecabinet_2010_2.FileSearchRow;
import com.netsuite.webservices.documents.filecabinet_2010_2.FolderSearchRow;
import com.netsuite.webservices.general.communication_2010_2.MessageSearchRow;
import com.netsuite.webservices.general.communication_2010_2.NoteSearchRow;
import com.netsuite.webservices.lists.accounting_2010_2.AccountSearchRow;
import com.netsuite.webservices.lists.accounting_2010_2.AccountingPeriodSearchRow;
import com.netsuite.webservices.lists.accounting_2010_2.BinSearchRow;
import com.netsuite.webservices.lists.accounting_2010_2.ClassificationSearchRow;
import com.netsuite.webservices.lists.accounting_2010_2.ContactCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2010_2.ContactRoleSearchRow;
import com.netsuite.webservices.lists.accounting_2010_2.CustomerCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2010_2.DepartmentSearchRow;
import com.netsuite.webservices.lists.accounting_2010_2.ExpenseCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2010_2.GiftCertificateSearchRow;
import com.netsuite.webservices.lists.accounting_2010_2.ItemSearchRow;
import com.netsuite.webservices.lists.accounting_2010_2.LocationSearchRow;
import com.netsuite.webservices.lists.accounting_2010_2.NoteTypeSearchRow;
import com.netsuite.webservices.lists.accounting_2010_2.PartnerCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2010_2.PaymentMethodSearchRow;
import com.netsuite.webservices.lists.accounting_2010_2.PriceLevelSearchRow;
import com.netsuite.webservices.lists.accounting_2010_2.SalesRoleSearchRow;
import com.netsuite.webservices.lists.accounting_2010_2.SubsidiarySearchRow;
import com.netsuite.webservices.lists.accounting_2010_2.TermSearchRow;
import com.netsuite.webservices.lists.accounting_2010_2.UnitsTypeSearchRow;
import com.netsuite.webservices.lists.accounting_2010_2.VendorCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2010_2.WinLossReasonSearchRow;
import com.netsuite.webservices.lists.employees_2010_2.EmployeeSearchRow;
import com.netsuite.webservices.lists.marketing_2010_2.CampaignSearchRow;
import com.netsuite.webservices.lists.marketing_2010_2.PromotionCodeSearchRow;
import com.netsuite.webservices.lists.support_2010_2.IssueSearchRow;
import com.netsuite.webservices.lists.support_2010_2.SolutionSearchRow;
import com.netsuite.webservices.lists.support_2010_2.SupportCaseSearchRow;
import com.netsuite.webservices.lists.support_2010_2.TopicSearchRow;
import com.netsuite.webservices.setup.customization_2010_2.CustomListSearchRow;
import com.netsuite.webservices.setup.customization_2010_2.CustomRecordSearchRow;
import com.netsuite.webservices.transactions.employees_2010_2.TimeBillSearchRow;
import com.netsuite.webservices.transactions.financial_2010_2.BudgetSearchRow;
import com.netsuite.webservices.transactions.sales_2010_2.OpportunitySearchRow;
import com.netsuite.webservices.transactions.sales_2010_2.TransactionSearchRow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRow")
@XmlSeeAlso({
    IssueSearchRow.class,
    SolutionSearchRow.class,
    SupportCaseSearchRow.class,
    TopicSearchRow.class,
    CampaignSearchRow.class,
    PromotionCodeSearchRow.class,
    FolderSearchRow.class,
    FileSearchRow.class,
    SalesRoleSearchRow.class,
    AccountSearchRow.class,
    PaymentMethodSearchRow.class,
    ItemSearchRow.class,
    BinSearchRow.class,
    TermSearchRow.class,
    LocationSearchRow.class,
    WinLossReasonSearchRow.class,
    VendorCategorySearchRow.class,
    PriceLevelSearchRow.class,
    ContactCategorySearchRow.class,
    UnitsTypeSearchRow.class,
    NoteTypeSearchRow.class,
    ContactRoleSearchRow.class,
    GiftCertificateSearchRow.class,
    DepartmentSearchRow.class,
    PartnerCategorySearchRow.class,
    SubsidiarySearchRow.class,
    AccountingPeriodSearchRow.class,
    ClassificationSearchRow.class,
    ExpenseCategorySearchRow.class,
    CustomerCategorySearchRow.class,
    TimeBillSearchRow.class,
    EmployeeSearchRow.class,
    MessageSearchRow.class,
    NoteSearchRow.class,
    TransactionSearchRow.class,
    OpportunitySearchRow.class,
    ProjectTaskSearchRow.class,
    CalendarEventSearchRow.class,
    TaskSearchRow.class,
    PhoneCallSearchRow.class,
    BudgetSearchRow.class,
    CustomRecordSearchRow.class,
    CustomListSearchRow.class
})
public abstract class SearchRow {


}
