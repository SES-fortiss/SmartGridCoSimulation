/**
 */
package CIM15.IEC61970.Informative.InfERPSupport.util;

import CIM15.Element;

import CIM15.IEC61968.Common.Document;
import CIM15.IEC61968.Common.Organisation;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfCommon.BankAccount;
import CIM15.IEC61970.Informative.InfCommon.Role;

import CIM15.IEC61970.Informative.InfERPSupport.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage
 * @generated
 */
public class InfERPSupportSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfERPSupportPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfERPSupportSwitch() {
		if (modelPackage == null) {
			modelPackage = InfERPSupportPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM: {
				ErpRecDelvLineItem erpRecDelvLineItem = (ErpRecDelvLineItem)theEObject;
				T result = caseErpRecDelvLineItem(erpRecDelvLineItem);
				if (result == null) result = caseIdentifiedObject(erpRecDelvLineItem);
				if (result == null) result = caseElement(erpRecDelvLineItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_LEDGER_BUDGET: {
				ErpLedgerBudget erpLedgerBudget = (ErpLedgerBudget)theEObject;
				T result = caseErpLedgerBudget(erpLedgerBudget);
				if (result == null) result = caseDocument(erpLedgerBudget);
				if (result == null) result = caseIdentifiedObject(erpLedgerBudget);
				if (result == null) result = caseElement(erpLedgerBudget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_TIME_ENTRY: {
				ErpTimeEntry erpTimeEntry = (ErpTimeEntry)theEObject;
				T result = caseErpTimeEntry(erpTimeEntry);
				if (result == null) result = caseIdentifiedObject(erpTimeEntry);
				if (result == null) result = caseElement(erpTimeEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_COMPETENCY: {
				ErpCompetency erpCompetency = (ErpCompetency)theEObject;
				T result = caseErpCompetency(erpCompetency);
				if (result == null) result = caseIdentifiedObject(erpCompetency);
				if (result == null) result = caseElement(erpCompetency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_PURCHASE_ORDER: {
				ErpPurchaseOrder erpPurchaseOrder = (ErpPurchaseOrder)theEObject;
				T result = caseErpPurchaseOrder(erpPurchaseOrder);
				if (result == null) result = caseDocument(erpPurchaseOrder);
				if (result == null) result = caseIdentifiedObject(erpPurchaseOrder);
				if (result == null) result = caseElement(erpPurchaseOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_ENG_CHANGE_ORDER: {
				ErpEngChangeOrder erpEngChangeOrder = (ErpEngChangeOrder)theEObject;
				T result = caseErpEngChangeOrder(erpEngChangeOrder);
				if (result == null) result = caseDocument(erpEngChangeOrder);
				if (result == null) result = caseIdentifiedObject(erpEngChangeOrder);
				if (result == null) result = caseElement(erpEngChangeOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING: {
				ErpProjectAccounting erpProjectAccounting = (ErpProjectAccounting)theEObject;
				T result = caseErpProjectAccounting(erpProjectAccounting);
				if (result == null) result = caseDocument(erpProjectAccounting);
				if (result == null) result = caseIdentifiedObject(erpProjectAccounting);
				if (result == null) result = caseElement(erpProjectAccounting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_REC_LINE_ITEM: {
				ErpRecLineItem erpRecLineItem = (ErpRecLineItem)theEObject;
				T result = caseErpRecLineItem(erpRecLineItem);
				if (result == null) result = caseIdentifiedObject(erpRecLineItem);
				if (result == null) result = caseElement(erpRecLineItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_PAYABLE_LINE_ITEM: {
				ErpPayableLineItem erpPayableLineItem = (ErpPayableLineItem)theEObject;
				T result = caseErpPayableLineItem(erpPayableLineItem);
				if (result == null) result = caseIdentifiedObject(erpPayableLineItem);
				if (result == null) result = caseElement(erpPayableLineItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM: {
				ErpLedBudLineItem erpLedBudLineItem = (ErpLedBudLineItem)theEObject;
				T result = caseErpLedBudLineItem(erpLedBudLineItem);
				if (result == null) result = caseIdentifiedObject(erpLedBudLineItem);
				if (result == null) result = caseElement(erpLedBudLineItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_REQUISITION: {
				ErpRequisition erpRequisition = (ErpRequisition)theEObject;
				T result = caseErpRequisition(erpRequisition);
				if (result == null) result = caseDocument(erpRequisition);
				if (result == null) result = caseIdentifiedObject(erpRequisition);
				if (result == null) result = caseElement(erpRequisition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_ORGANISATION: {
				ErpOrganisation erpOrganisation = (ErpOrganisation)theEObject;
				T result = caseErpOrganisation(erpOrganisation);
				if (result == null) result = caseOrganisation(erpOrganisation);
				if (result == null) result = caseIdentifiedObject(erpOrganisation);
				if (result == null) result = caseElement(erpOrganisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_INVOICE: {
				ErpInvoice erpInvoice = (ErpInvoice)theEObject;
				T result = caseErpInvoice(erpInvoice);
				if (result == null) result = caseDocument(erpInvoice);
				if (result == null) result = caseIdentifiedObject(erpInvoice);
				if (result == null) result = caseElement(erpInvoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.DOC_ERP_PERSON_ROLE: {
				DocErpPersonRole docErpPersonRole = (DocErpPersonRole)theEObject;
				T result = caseDocErpPersonRole(docErpPersonRole);
				if (result == null) result = caseRole(docErpPersonRole);
				if (result == null) result = caseIdentifiedObject(docErpPersonRole);
				if (result == null) result = caseElement(docErpPersonRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_BANK_ACCOUNT: {
				ErpBankAccount erpBankAccount = (ErpBankAccount)theEObject;
				T result = caseErpBankAccount(erpBankAccount);
				if (result == null) result = caseBankAccount(erpBankAccount);
				if (result == null) result = caseDocument(erpBankAccount);
				if (result == null) result = caseIdentifiedObject(erpBankAccount);
				if (result == null) result = caseElement(erpBankAccount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_QUOTE: {
				ErpQuote erpQuote = (ErpQuote)theEObject;
				T result = caseErpQuote(erpQuote);
				if (result == null) result = caseDocument(erpQuote);
				if (result == null) result = caseIdentifiedObject(erpQuote);
				if (result == null) result = caseElement(erpQuote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_PERSON: {
				ErpPerson erpPerson = (ErpPerson)theEObject;
				T result = caseErpPerson(erpPerson);
				if (result == null) result = caseIdentifiedObject(erpPerson);
				if (result == null) result = caseElement(erpPerson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_ITEM_MASTER: {
				ErpItemMaster erpItemMaster = (ErpItemMaster)theEObject;
				T result = caseErpItemMaster(erpItemMaster);
				if (result == null) result = caseIdentifiedObject(erpItemMaster);
				if (result == null) result = caseElement(erpItemMaster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_BOM: {
				ErpBOM erpBOM = (ErpBOM)theEObject;
				T result = caseErpBOM(erpBOM);
				if (result == null) result = caseDocument(erpBOM);
				if (result == null) result = caseIdentifiedObject(erpBOM);
				if (result == null) result = caseElement(erpBOM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_INVENTORY_COUNT: {
				ErpInventoryCount erpInventoryCount = (ErpInventoryCount)theEObject;
				T result = caseErpInventoryCount(erpInventoryCount);
				if (result == null) result = caseIdentifiedObject(erpInventoryCount);
				if (result == null) result = caseElement(erpInventoryCount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_ISSUE_INVENTORY: {
				ErpIssueInventory erpIssueInventory = (ErpIssueInventory)theEObject;
				T result = caseErpIssueInventory(erpIssueInventory);
				if (result == null) result = caseIdentifiedObject(erpIssueInventory);
				if (result == null) result = caseElement(erpIssueInventory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_PAYABLE: {
				ErpPayable erpPayable = (ErpPayable)theEObject;
				T result = caseErpPayable(erpPayable);
				if (result == null) result = caseDocument(erpPayable);
				if (result == null) result = caseIdentifiedObject(erpPayable);
				if (result == null) result = caseElement(erpPayable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_LEDGER: {
				ErpLedger erpLedger = (ErpLedger)theEObject;
				T result = caseErpLedger(erpLedger);
				if (result == null) result = caseDocument(erpLedger);
				if (result == null) result = caseIdentifiedObject(erpLedger);
				if (result == null) result = caseElement(erpLedger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_PO_LINE_ITEM: {
				ErpPOLineItem erpPOLineItem = (ErpPOLineItem)theEObject;
				T result = caseErpPOLineItem(erpPOLineItem);
				if (result == null) result = caseDocument(erpPOLineItem);
				if (result == null) result = caseIdentifiedObject(erpPOLineItem);
				if (result == null) result = caseElement(erpPOLineItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_LEDGER_ENTRY: {
				ErpLedgerEntry erpLedgerEntry = (ErpLedgerEntry)theEObject;
				T result = caseErpLedgerEntry(erpLedgerEntry);
				if (result == null) result = caseIdentifiedObject(erpLedgerEntry);
				if (result == null) result = caseElement(erpLedgerEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_PAYMENT: {
				ErpPayment erpPayment = (ErpPayment)theEObject;
				T result = caseErpPayment(erpPayment);
				if (result == null) result = caseDocument(erpPayment);
				if (result == null) result = caseIdentifiedObject(erpPayment);
				if (result == null) result = caseElement(erpPayment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_RECEIVABLE: {
				ErpReceivable erpReceivable = (ErpReceivable)theEObject;
				T result = caseErpReceivable(erpReceivable);
				if (result == null) result = caseDocument(erpReceivable);
				if (result == null) result = caseIdentifiedObject(erpReceivable);
				if (result == null) result = caseElement(erpReceivable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.DOC_ORG_ROLE: {
				DocOrgRole docOrgRole = (DocOrgRole)theEObject;
				T result = caseDocOrgRole(docOrgRole);
				if (result == null) result = caseRole(docOrgRole);
				if (result == null) result = caseIdentifiedObject(docOrgRole);
				if (result == null) result = caseElement(docOrgRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM: {
				ErpReqLineItem erpReqLineItem = (ErpReqLineItem)theEObject;
				T result = caseErpReqLineItem(erpReqLineItem);
				if (result == null) result = caseIdentifiedObject(erpReqLineItem);
				if (result == null) result = caseElement(erpReqLineItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_TIME_SHEET: {
				ErpTimeSheet erpTimeSheet = (ErpTimeSheet)theEObject;
				T result = caseErpTimeSheet(erpTimeSheet);
				if (result == null) result = caseDocument(erpTimeSheet);
				if (result == null) result = caseIdentifiedObject(erpTimeSheet);
				if (result == null) result = caseElement(erpTimeSheet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_INVENTORY: {
				ErpInventory erpInventory = (ErpInventory)theEObject;
				T result = caseErpInventory(erpInventory);
				if (result == null) result = caseIdentifiedObject(erpInventory);
				if (result == null) result = caseElement(erpInventory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_CHART_OF_ACCOUNTS: {
				ErpChartOfAccounts erpChartOfAccounts = (ErpChartOfAccounts)theEObject;
				T result = caseErpChartOfAccounts(erpChartOfAccounts);
				if (result == null) result = caseDocument(erpChartOfAccounts);
				if (result == null) result = caseIdentifiedObject(erpChartOfAccounts);
				if (result == null) result = caseElement(erpChartOfAccounts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_SITE_LEVEL_DATA: {
				ErpSiteLevelData erpSiteLevelData = (ErpSiteLevelData)theEObject;
				T result = caseErpSiteLevelData(erpSiteLevelData);
				if (result == null) result = caseIdentifiedObject(erpSiteLevelData);
				if (result == null) result = caseElement(erpSiteLevelData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE: {
				OrgErpPersonRole orgErpPersonRole = (OrgErpPersonRole)theEObject;
				T result = caseOrgErpPersonRole(orgErpPersonRole);
				if (result == null) result = caseRole(orgErpPersonRole);
				if (result == null) result = caseIdentifiedObject(orgErpPersonRole);
				if (result == null) result = caseElement(orgErpPersonRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_RECEIVE_DELIVERY: {
				ErpReceiveDelivery erpReceiveDelivery = (ErpReceiveDelivery)theEObject;
				T result = caseErpReceiveDelivery(erpReceiveDelivery);
				if (result == null) result = caseDocument(erpReceiveDelivery);
				if (result == null) result = caseIdentifiedObject(erpReceiveDelivery);
				if (result == null) result = caseElement(erpReceiveDelivery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_SALES_ORDER: {
				ErpSalesOrder erpSalesOrder = (ErpSalesOrder)theEObject;
				T result = caseErpSalesOrder(erpSalesOrder);
				if (result == null) result = caseDocument(erpSalesOrder);
				if (result == null) result = caseIdentifiedObject(erpSalesOrder);
				if (result == null) result = caseElement(erpSalesOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY: {
				ErpJournalEntry erpJournalEntry = (ErpJournalEntry)theEObject;
				T result = caseErpJournalEntry(erpJournalEntry);
				if (result == null) result = caseIdentifiedObject(erpJournalEntry);
				if (result == null) result = caseElement(erpJournalEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM: {
				ErpInvoiceLineItem erpInvoiceLineItem = (ErpInvoiceLineItem)theEObject;
				T result = caseErpInvoiceLineItem(erpInvoiceLineItem);
				if (result == null) result = caseDocument(erpInvoiceLineItem);
				if (result == null) result = caseIdentifiedObject(erpInvoiceLineItem);
				if (result == null) result = caseElement(erpInvoiceLineItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ORG_ORG_ROLE: {
				OrgOrgRole orgOrgRole = (OrgOrgRole)theEObject;
				T result = caseOrgOrgRole(orgOrgRole);
				if (result == null) result = caseRole(orgOrgRole);
				if (result == null) result = caseIdentifiedObject(orgOrgRole);
				if (result == null) result = caseElement(orgOrgRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_JOURNAL: {
				ErpJournal erpJournal = (ErpJournal)theEObject;
				T result = caseErpJournal(erpJournal);
				if (result == null) result = caseDocument(erpJournal);
				if (result == null) result = caseIdentifiedObject(erpJournal);
				if (result == null) result = caseElement(erpJournal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_PERSONNEL: {
				ErpPersonnel erpPersonnel = (ErpPersonnel)theEObject;
				T result = caseErpPersonnel(erpPersonnel);
				if (result == null) result = caseIdentifiedObject(erpPersonnel);
				if (result == null) result = caseElement(erpPersonnel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM: {
				ErpQuoteLineItem erpQuoteLineItem = (ErpQuoteLineItem)theEObject;
				T result = caseErpQuoteLineItem(erpQuoteLineItem);
				if (result == null) result = caseIdentifiedObject(erpQuoteLineItem);
				if (result == null) result = caseElement(erpQuoteLineItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA: {
				ErpBomItemData erpBomItemData = (ErpBomItemData)theEObject;
				T result = caseErpBomItemData(erpBomItemData);
				if (result == null) result = caseIdentifiedObject(erpBomItemData);
				if (result == null) result = caseElement(erpBomItemData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Rec Delv Line Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Rec Delv Line Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpRecDelvLineItem(ErpRecDelvLineItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Ledger Budget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Ledger Budget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpLedgerBudget(ErpLedgerBudget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Time Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Time Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpTimeEntry(ErpTimeEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Competency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Competency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpCompetency(ErpCompetency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Purchase Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Purchase Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpPurchaseOrder(ErpPurchaseOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Eng Change Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Eng Change Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpEngChangeOrder(ErpEngChangeOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Project Accounting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Project Accounting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpProjectAccounting(ErpProjectAccounting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Rec Line Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Rec Line Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpRecLineItem(ErpRecLineItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Payable Line Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Payable Line Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpPayableLineItem(ErpPayableLineItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Led Bud Line Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Led Bud Line Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpLedBudLineItem(ErpLedBudLineItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Requisition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Requisition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpRequisition(ErpRequisition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Organisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Organisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpOrganisation(ErpOrganisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Invoice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Invoice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpInvoice(ErpInvoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doc Erp Person Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doc Erp Person Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocErpPersonRole(DocErpPersonRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Bank Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Bank Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpBankAccount(ErpBankAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Quote</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Quote</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpQuote(ErpQuote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpPerson(ErpPerson object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Item Master</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Item Master</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpItemMaster(ErpItemMaster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp BOM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp BOM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpBOM(ErpBOM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Inventory Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Inventory Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpInventoryCount(ErpInventoryCount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Issue Inventory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Issue Inventory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpIssueInventory(ErpIssueInventory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Payable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Payable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpPayable(ErpPayable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Ledger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Ledger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpLedger(ErpLedger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp PO Line Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp PO Line Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpPOLineItem(ErpPOLineItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Ledger Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Ledger Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpLedgerEntry(ErpLedgerEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Payment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Payment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpPayment(ErpPayment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Receivable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Receivable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpReceivable(ErpReceivable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doc Org Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doc Org Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocOrgRole(DocOrgRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Req Line Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Req Line Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpReqLineItem(ErpReqLineItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Time Sheet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Time Sheet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpTimeSheet(ErpTimeSheet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Inventory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Inventory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpInventory(ErpInventory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Chart Of Accounts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Chart Of Accounts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpChartOfAccounts(ErpChartOfAccounts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Site Level Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Site Level Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpSiteLevelData(ErpSiteLevelData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Org Erp Person Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Org Erp Person Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrgErpPersonRole(OrgErpPersonRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Receive Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Receive Delivery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpReceiveDelivery(ErpReceiveDelivery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Sales Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Sales Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpSalesOrder(ErpSalesOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Journal Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Journal Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpJournalEntry(ErpJournalEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Invoice Line Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Invoice Line Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpInvoiceLineItem(ErpInvoiceLineItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Org Org Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Org Org Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrgOrgRole(OrgOrgRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Journal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Journal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpJournal(ErpJournal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Personnel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Personnel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpPersonnel(ErpPersonnel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Quote Line Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Quote Line Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpQuoteLineItem(ErpQuoteLineItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erp Bom Item Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erp Bom Item Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErpBomItemData(ErpBomItemData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedObject(IdentifiedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganisation(Organisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bank Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bank Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBankAccount(BankAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //InfERPSupportSwitch
