
package com.netsuite.webservices.platform.core_2010_2;

import com.netsuite.webservices.activities.scheduling_2010_2.CalendarEventSearch;
import com.netsuite.webservices.activities.scheduling_2010_2.CalendarEventSearchAdvanced;
import com.netsuite.webservices.activities.scheduling_2010_2.PhoneCallSearch;
import com.netsuite.webservices.activities.scheduling_2010_2.PhoneCallSearchAdvanced;
import com.netsuite.webservices.activities.scheduling_2010_2.ProjectTaskSearch;
import com.netsuite.webservices.activities.scheduling_2010_2.ProjectTaskSearchAdvanced;
import com.netsuite.webservices.activities.scheduling_2010_2.TaskSearch;
import com.netsuite.webservices.activities.scheduling_2010_2.TaskSearchAdvanced;
import com.netsuite.webservices.documents.filecabinet_2010_2.FileSearch;
import com.netsuite.webservices.documents.filecabinet_2010_2.FileSearchAdvanced;
import com.netsuite.webservices.documents.filecabinet_2010_2.FolderSearch;
import com.netsuite.webservices.documents.filecabinet_2010_2.FolderSearchAdvanced;
import com.netsuite.webservices.general.communication_2010_2.MessageSearch;
import com.netsuite.webservices.general.communication_2010_2.MessageSearchAdvanced;
import com.netsuite.webservices.general.communication_2010_2.NoteSearch;
import com.netsuite.webservices.general.communication_2010_2.NoteSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.AccountSearch;
import com.netsuite.webservices.lists.accounting_2010_2.AccountSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.AccountingPeriodSearch;
import com.netsuite.webservices.lists.accounting_2010_2.AccountingPeriodSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.BinSearch;
import com.netsuite.webservices.lists.accounting_2010_2.BinSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.ClassificationSearch;
import com.netsuite.webservices.lists.accounting_2010_2.ClassificationSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.ContactCategorySearch;
import com.netsuite.webservices.lists.accounting_2010_2.ContactCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.ContactRoleSearch;
import com.netsuite.webservices.lists.accounting_2010_2.ContactRoleSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.CustomerCategorySearch;
import com.netsuite.webservices.lists.accounting_2010_2.CustomerCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.DepartmentSearch;
import com.netsuite.webservices.lists.accounting_2010_2.DepartmentSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.ExpenseCategorySearch;
import com.netsuite.webservices.lists.accounting_2010_2.ExpenseCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.GiftCertificateSearch;
import com.netsuite.webservices.lists.accounting_2010_2.GiftCertificateSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.ItemSearch;
import com.netsuite.webservices.lists.accounting_2010_2.ItemSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.LocationSearch;
import com.netsuite.webservices.lists.accounting_2010_2.LocationSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.NoteTypeSearch;
import com.netsuite.webservices.lists.accounting_2010_2.NoteTypeSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.PartnerCategorySearch;
import com.netsuite.webservices.lists.accounting_2010_2.PartnerCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.PaymentMethodSearch;
import com.netsuite.webservices.lists.accounting_2010_2.PaymentMethodSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.PriceLevelSearch;
import com.netsuite.webservices.lists.accounting_2010_2.PriceLevelSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.SalesRoleSearch;
import com.netsuite.webservices.lists.accounting_2010_2.SalesRoleSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.SubsidiarySearch;
import com.netsuite.webservices.lists.accounting_2010_2.SubsidiarySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.TermSearch;
import com.netsuite.webservices.lists.accounting_2010_2.TermSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.UnitsTypeSearch;
import com.netsuite.webservices.lists.accounting_2010_2.UnitsTypeSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.VendorCategorySearch;
import com.netsuite.webservices.lists.accounting_2010_2.VendorCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2010_2.WinLossReasonSearch;
import com.netsuite.webservices.lists.accounting_2010_2.WinLossReasonSearchAdvanced;
import com.netsuite.webservices.lists.employees_2010_2.EmployeeSearch;
import com.netsuite.webservices.lists.employees_2010_2.EmployeeSearchAdvanced;
import com.netsuite.webservices.lists.marketing_2010_2.CampaignSearch;
import com.netsuite.webservices.lists.marketing_2010_2.CampaignSearchAdvanced;
import com.netsuite.webservices.lists.marketing_2010_2.PromotionCodeSearch;
import com.netsuite.webservices.lists.marketing_2010_2.PromotionCodeSearchAdvanced;
import com.netsuite.webservices.lists.support_2010_2.IssueSearch;
import com.netsuite.webservices.lists.support_2010_2.IssueSearchAdvanced;
import com.netsuite.webservices.lists.support_2010_2.SolutionSearch;
import com.netsuite.webservices.lists.support_2010_2.SolutionSearchAdvanced;
import com.netsuite.webservices.lists.support_2010_2.SupportCaseSearch;
import com.netsuite.webservices.lists.support_2010_2.SupportCaseSearchAdvanced;
import com.netsuite.webservices.lists.support_2010_2.TopicSearch;
import com.netsuite.webservices.lists.support_2010_2.TopicSearchAdvanced;
import com.netsuite.webservices.platform.common_2010_2.AccountSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.AccountingPeriodSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.BinSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.BudgetSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.CalendarEventSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.CampaignSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.ClassificationSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.ContactCategorySearchBasic;
import com.netsuite.webservices.platform.common_2010_2.ContactRoleSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.ContactSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.CustomListSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.CustomRecordSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.CustomerCategorySearchBasic;
import com.netsuite.webservices.platform.common_2010_2.CustomerSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.CustomerStatusSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.DepartmentSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.EntityGroupSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.EntitySearchBasic;
import com.netsuite.webservices.platform.common_2010_2.ExpenseCategorySearchBasic;
import com.netsuite.webservices.platform.common_2010_2.FileSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.FolderSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.GiftCertificateSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.GroupMemberSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.IssueSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.ItemSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.JobSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.JobStatusSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.JobTypeSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.LocationSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.MessageSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.NoteSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.NoteTypeSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.OpportunitySearchBasic;
import com.netsuite.webservices.platform.common_2010_2.OriginatingLeadSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.PartnerCategorySearchBasic;
import com.netsuite.webservices.platform.common_2010_2.PartnerSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.PaymentMethodSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.PhoneCallSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.PriceLevelSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.ProjectTaskAssignmentSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.ProjectTaskSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.PromotionCodeSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.SalesRoleSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.SiteCategorySearchBasic;
import com.netsuite.webservices.platform.common_2010_2.SolutionSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.SubsidiarySearchBasic;
import com.netsuite.webservices.platform.common_2010_2.SupportCaseSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.TaskSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.TermSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.TimeBillSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.TopicSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.TransactionSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.UnitsTypeSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.VendorCategorySearchBasic;
import com.netsuite.webservices.platform.common_2010_2.VendorSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.WinLossReasonSearchBasic;
import com.netsuite.webservices.setup.customization_2010_2.CustomListSearch;
import com.netsuite.webservices.setup.customization_2010_2.CustomRecordSearch;
import com.netsuite.webservices.setup.customization_2010_2.CustomRecordSearchAdvanced;
import com.netsuite.webservices.transactions.employees_2010_2.TimeBillSearch;
import com.netsuite.webservices.transactions.employees_2010_2.TimeBillSearchAdvanced;
import com.netsuite.webservices.transactions.financial_2010_2.BudgetSearch;
import com.netsuite.webservices.transactions.financial_2010_2.BudgetSearchAdvanced;
import com.netsuite.webservices.transactions.sales_2010_2.OpportunitySearch;
import com.netsuite.webservices.transactions.sales_2010_2.OpportunitySearchAdvanced;
import com.netsuite.webservices.transactions.sales_2010_2.TransactionSearch;
import com.netsuite.webservices.transactions.sales_2010_2.TransactionSearchAdvanced;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRecord">
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
@XmlType(name = "SearchRecord")
@XmlSeeAlso({
    TopicSearch.class,
    SolutionSearch.class,
    SupportCaseSearch.class,
    IssueSearch.class,
    TopicSearchAdvanced.class,
    SolutionSearchAdvanced.class,
    SupportCaseSearchAdvanced.class,
    IssueSearchAdvanced.class,
    CampaignSearch.class,
    PromotionCodeSearch.class,
    PromotionCodeSearchAdvanced.class,
    CampaignSearchAdvanced.class,
    FileSearch.class,
    FolderSearch.class,
    FileSearchAdvanced.class,
    FolderSearchAdvanced.class,
    BinSearch.class,
    PaymentMethodSearch.class,
    NoteTypeSearch.class,
    AccountingPeriodSearch.class,
    VendorCategorySearch.class,
    SubsidiarySearch.class,
    CustomerCategorySearch.class,
    ContactRoleSearch.class,
    PriceLevelSearch.class,
    ItemSearch.class,
    AccountSearch.class,
    UnitsTypeSearch.class,
    ClassificationSearch.class,
    WinLossReasonSearch.class,
    ExpenseCategorySearch.class,
    GiftCertificateSearch.class,
    LocationSearch.class,
    SalesRoleSearch.class,
    DepartmentSearch.class,
    TermSearch.class,
    ContactCategorySearch.class,
    PartnerCategorySearch.class,
    WinLossReasonSearchAdvanced.class,
    ContactCategorySearchAdvanced.class,
    GiftCertificateSearchAdvanced.class,
    ClassificationSearchAdvanced.class,
    LocationSearchAdvanced.class,
    AccountingPeriodSearchAdvanced.class,
    NoteTypeSearchAdvanced.class,
    PriceLevelSearchAdvanced.class,
    TermSearchAdvanced.class,
    DepartmentSearchAdvanced.class,
    CustomerCategorySearchAdvanced.class,
    VendorCategorySearchAdvanced.class,
    ExpenseCategorySearchAdvanced.class,
    ItemSearchAdvanced.class,
    AccountSearchAdvanced.class,
    PaymentMethodSearchAdvanced.class,
    BinSearchAdvanced.class,
    SubsidiarySearchAdvanced.class,
    PartnerCategorySearchAdvanced.class,
    ContactRoleSearchAdvanced.class,
    SalesRoleSearchAdvanced.class,
    UnitsTypeSearchAdvanced.class,
    TimeBillSearch.class,
    TimeBillSearchAdvanced.class,
    TransactionSearchBasic.class,
    BudgetSearchBasic.class,
    VendorSearchBasic.class,
    SubsidiarySearchBasic.class,
    IssueSearchBasic.class,
    ProjectTaskSearchBasic.class,
    TimeBillSearchBasic.class,
    ContactSearchBasic.class,
    VendorCategorySearchBasic.class,
    CustomRecordSearchBasic.class,
    DepartmentSearchBasic.class,
    ContactRoleSearchBasic.class,
    GiftCertificateSearchBasic.class,
    PaymentMethodSearchBasic.class,
    OpportunitySearchBasic.class,
    JobTypeSearchBasic.class,
    TopicSearchBasic.class,
    ContactCategorySearchBasic.class,
    PartnerSearchBasic.class,
    GroupMemberSearchBasic.class,
    CustomerStatusSearchBasic.class,
    AccountSearchBasic.class,
    PriceLevelSearchBasic.class,
    ClassificationSearchBasic.class,
    UnitsTypeSearchBasic.class,
    BinSearchBasic.class,
    EmployeeSearchBasic.class,
    EntitySearchBasic.class,
    SupportCaseSearchBasic.class,
    ExpenseCategorySearchBasic.class,
    CustomListSearchBasic.class,
    JobSearchBasic.class,
    PromotionCodeSearchBasic.class,
    SolutionSearchBasic.class,
    SiteCategorySearchBasic.class,
    PartnerCategorySearchBasic.class,
    MessageSearchBasic.class,
    EntityGroupSearchBasic.class,
    JobStatusSearchBasic.class,
    FileSearchBasic.class,
    CampaignSearchBasic.class,
    LocationSearchBasic.class,
    WinLossReasonSearchBasic.class,
    CustomerCategorySearchBasic.class,
    PhoneCallSearchBasic.class,
    OriginatingLeadSearchBasic.class,
    FolderSearchBasic.class,
    AccountingPeriodSearchBasic.class,
    TermSearchBasic.class,
    CalendarEventSearchBasic.class,
    ProjectTaskAssignmentSearchBasic.class,
    ItemSearchBasic.class,
    CustomerSearchBasic.class,
    SalesRoleSearchBasic.class,
    NoteTypeSearchBasic.class,
    NoteSearchBasic.class,
    TaskSearchBasic.class,
    EmployeeSearch.class,
    EmployeeSearchAdvanced.class,
    MessageSearch.class,
    NoteSearch.class,
    MessageSearchAdvanced.class,
    NoteSearchAdvanced.class,
    TransactionSearch.class,
    OpportunitySearch.class,
    TransactionSearchAdvanced.class,
    OpportunitySearchAdvanced.class,
    PhoneCallSearch.class,
    ProjectTaskSearch.class,
    CalendarEventSearch.class,
    TaskSearch.class,
    PhoneCallSearchAdvanced.class,
    TaskSearchAdvanced.class,
    ProjectTaskSearchAdvanced.class,
    CalendarEventSearchAdvanced.class,
    BudgetSearch.class,
    BudgetSearchAdvanced.class,
    CustomRecordSearch.class,
    CustomListSearch.class,
    CustomRecordSearchAdvanced.class
})
public abstract class SearchRecord {


}
