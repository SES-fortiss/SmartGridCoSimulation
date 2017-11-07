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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage
 * @generated
 */
public class InfERPSupportAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfERPSupportPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfERPSupportAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InfERPSupportPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfERPSupportSwitch<Adapter> modelSwitch =
		new InfERPSupportSwitch<Adapter>() {
			@Override
			public Adapter caseErpRecDelvLineItem(ErpRecDelvLineItem object) {
				return createErpRecDelvLineItemAdapter();
			}
			@Override
			public Adapter caseErpLedgerBudget(ErpLedgerBudget object) {
				return createErpLedgerBudgetAdapter();
			}
			@Override
			public Adapter caseErpTimeEntry(ErpTimeEntry object) {
				return createErpTimeEntryAdapter();
			}
			@Override
			public Adapter caseErpCompetency(ErpCompetency object) {
				return createErpCompetencyAdapter();
			}
			@Override
			public Adapter caseErpPurchaseOrder(ErpPurchaseOrder object) {
				return createErpPurchaseOrderAdapter();
			}
			@Override
			public Adapter caseErpEngChangeOrder(ErpEngChangeOrder object) {
				return createErpEngChangeOrderAdapter();
			}
			@Override
			public Adapter caseErpProjectAccounting(ErpProjectAccounting object) {
				return createErpProjectAccountingAdapter();
			}
			@Override
			public Adapter caseErpRecLineItem(ErpRecLineItem object) {
				return createErpRecLineItemAdapter();
			}
			@Override
			public Adapter caseErpPayableLineItem(ErpPayableLineItem object) {
				return createErpPayableLineItemAdapter();
			}
			@Override
			public Adapter caseErpLedBudLineItem(ErpLedBudLineItem object) {
				return createErpLedBudLineItemAdapter();
			}
			@Override
			public Adapter caseErpRequisition(ErpRequisition object) {
				return createErpRequisitionAdapter();
			}
			@Override
			public Adapter caseErpOrganisation(ErpOrganisation object) {
				return createErpOrganisationAdapter();
			}
			@Override
			public Adapter caseErpInvoice(ErpInvoice object) {
				return createErpInvoiceAdapter();
			}
			@Override
			public Adapter caseDocErpPersonRole(DocErpPersonRole object) {
				return createDocErpPersonRoleAdapter();
			}
			@Override
			public Adapter caseErpBankAccount(ErpBankAccount object) {
				return createErpBankAccountAdapter();
			}
			@Override
			public Adapter caseErpQuote(ErpQuote object) {
				return createErpQuoteAdapter();
			}
			@Override
			public Adapter caseErpPerson(ErpPerson object) {
				return createErpPersonAdapter();
			}
			@Override
			public Adapter caseErpItemMaster(ErpItemMaster object) {
				return createErpItemMasterAdapter();
			}
			@Override
			public Adapter caseErpBOM(ErpBOM object) {
				return createErpBOMAdapter();
			}
			@Override
			public Adapter caseErpInventoryCount(ErpInventoryCount object) {
				return createErpInventoryCountAdapter();
			}
			@Override
			public Adapter caseErpIssueInventory(ErpIssueInventory object) {
				return createErpIssueInventoryAdapter();
			}
			@Override
			public Adapter caseErpPayable(ErpPayable object) {
				return createErpPayableAdapter();
			}
			@Override
			public Adapter caseErpLedger(ErpLedger object) {
				return createErpLedgerAdapter();
			}
			@Override
			public Adapter caseErpPOLineItem(ErpPOLineItem object) {
				return createErpPOLineItemAdapter();
			}
			@Override
			public Adapter caseErpLedgerEntry(ErpLedgerEntry object) {
				return createErpLedgerEntryAdapter();
			}
			@Override
			public Adapter caseErpPayment(ErpPayment object) {
				return createErpPaymentAdapter();
			}
			@Override
			public Adapter caseErpReceivable(ErpReceivable object) {
				return createErpReceivableAdapter();
			}
			@Override
			public Adapter caseDocOrgRole(DocOrgRole object) {
				return createDocOrgRoleAdapter();
			}
			@Override
			public Adapter caseErpReqLineItem(ErpReqLineItem object) {
				return createErpReqLineItemAdapter();
			}
			@Override
			public Adapter caseErpTimeSheet(ErpTimeSheet object) {
				return createErpTimeSheetAdapter();
			}
			@Override
			public Adapter caseErpInventory(ErpInventory object) {
				return createErpInventoryAdapter();
			}
			@Override
			public Adapter caseErpChartOfAccounts(ErpChartOfAccounts object) {
				return createErpChartOfAccountsAdapter();
			}
			@Override
			public Adapter caseErpSiteLevelData(ErpSiteLevelData object) {
				return createErpSiteLevelDataAdapter();
			}
			@Override
			public Adapter caseOrgErpPersonRole(OrgErpPersonRole object) {
				return createOrgErpPersonRoleAdapter();
			}
			@Override
			public Adapter caseErpReceiveDelivery(ErpReceiveDelivery object) {
				return createErpReceiveDeliveryAdapter();
			}
			@Override
			public Adapter caseErpSalesOrder(ErpSalesOrder object) {
				return createErpSalesOrderAdapter();
			}
			@Override
			public Adapter caseErpJournalEntry(ErpJournalEntry object) {
				return createErpJournalEntryAdapter();
			}
			@Override
			public Adapter caseErpInvoiceLineItem(ErpInvoiceLineItem object) {
				return createErpInvoiceLineItemAdapter();
			}
			@Override
			public Adapter caseOrgOrgRole(OrgOrgRole object) {
				return createOrgOrgRoleAdapter();
			}
			@Override
			public Adapter caseErpJournal(ErpJournal object) {
				return createErpJournalAdapter();
			}
			@Override
			public Adapter caseErpPersonnel(ErpPersonnel object) {
				return createErpPersonnelAdapter();
			}
			@Override
			public Adapter caseErpQuoteLineItem(ErpQuoteLineItem object) {
				return createErpQuoteLineItemAdapter();
			}
			@Override
			public Adapter caseErpBomItemData(ErpBomItemData object) {
				return createErpBomItemDataAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseIdentifiedObject(IdentifiedObject object) {
				return createIdentifiedObjectAdapter();
			}
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
			}
			@Override
			public Adapter caseOrganisation(Organisation object) {
				return createOrganisationAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseBankAccount(BankAccount object) {
				return createBankAccountAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem <em>Erp Rec Delv Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem
	 * @generated
	 */
	public Adapter createErpRecDelvLineItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerBudget <em>Erp Ledger Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerBudget
	 * @generated
	 */
	public Adapter createErpLedgerBudgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpTimeEntry <em>Erp Time Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpTimeEntry
	 * @generated
	 */
	public Adapter createErpTimeEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpCompetency <em>Erp Competency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpCompetency
	 * @generated
	 */
	public Adapter createErpCompetencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPurchaseOrder <em>Erp Purchase Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPurchaseOrder
	 * @generated
	 */
	public Adapter createErpPurchaseOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpEngChangeOrder <em>Erp Eng Change Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpEngChangeOrder
	 * @generated
	 */
	public Adapter createErpEngChangeOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting <em>Erp Project Accounting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting
	 * @generated
	 */
	public Adapter createErpProjectAccountingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem <em>Erp Rec Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem
	 * @generated
	 */
	public Adapter createErpRecLineItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem <em>Erp Payable Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem
	 * @generated
	 */
	public Adapter createErpPayableLineItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem <em>Erp Led Bud Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem
	 * @generated
	 */
	public Adapter createErpLedBudLineItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRequisition <em>Erp Requisition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRequisition
	 * @generated
	 */
	public Adapter createErpRequisitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation <em>Erp Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation
	 * @generated
	 */
	public Adapter createErpOrganisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice <em>Erp Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice
	 * @generated
	 */
	public Adapter createErpInvoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.DocErpPersonRole <em>Doc Erp Person Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.DocErpPersonRole
	 * @generated
	 */
	public Adapter createDocErpPersonRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBankAccount <em>Erp Bank Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpBankAccount
	 * @generated
	 */
	public Adapter createErpBankAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuote <em>Erp Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpQuote
	 * @generated
	 */
	public Adapter createErpQuoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson
	 * @generated
	 */
	public Adapter createErpPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpItemMaster <em>Erp Item Master</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpItemMaster
	 * @generated
	 */
	public Adapter createErpItemMasterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBOM <em>Erp BOM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpBOM
	 * @generated
	 */
	public Adapter createErpBOMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount <em>Erp Inventory Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInventoryCount
	 * @generated
	 */
	public Adapter createErpInventoryCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory <em>Erp Issue Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpIssueInventory
	 * @generated
	 */
	public Adapter createErpIssueInventoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayable <em>Erp Payable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayable
	 * @generated
	 */
	public Adapter createErpPayableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedger <em>Erp Ledger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedger
	 * @generated
	 */
	public Adapter createErpLedgerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem <em>Erp PO Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPOLineItem
	 * @generated
	 */
	public Adapter createErpPOLineItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry <em>Erp Ledger Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry
	 * @generated
	 */
	public Adapter createErpLedgerEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayment <em>Erp Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayment
	 * @generated
	 */
	public Adapter createErpPaymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReceivable <em>Erp Receivable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReceivable
	 * @generated
	 */
	public Adapter createErpReceivableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.DocOrgRole <em>Doc Org Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.DocOrgRole
	 * @generated
	 */
	public Adapter createDocOrgRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem <em>Erp Req Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReqLineItem
	 * @generated
	 */
	public Adapter createErpReqLineItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpTimeSheet <em>Erp Time Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpTimeSheet
	 * @generated
	 */
	public Adapter createErpTimeSheetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInventory <em>Erp Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInventory
	 * @generated
	 */
	public Adapter createErpInventoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpChartOfAccounts <em>Erp Chart Of Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpChartOfAccounts
	 * @generated
	 */
	public Adapter createErpChartOfAccountsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpSiteLevelData <em>Erp Site Level Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpSiteLevelData
	 * @generated
	 */
	public Adapter createErpSiteLevelDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole <em>Org Erp Person Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.OrgErpPersonRole
	 * @generated
	 */
	public Adapter createOrgErpPersonRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpReceiveDelivery <em>Erp Receive Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpReceiveDelivery
	 * @generated
	 */
	public Adapter createErpReceiveDeliveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpSalesOrder <em>Erp Sales Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpSalesOrder
	 * @generated
	 */
	public Adapter createErpSalesOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry <em>Erp Journal Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry
	 * @generated
	 */
	public Adapter createErpJournalEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem <em>Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem
	 * @generated
	 */
	public Adapter createErpInvoiceLineItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole <em>Org Org Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.OrgOrgRole
	 * @generated
	 */
	public Adapter createOrgOrgRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournal <em>Erp Journal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournal
	 * @generated
	 */
	public Adapter createErpJournalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPersonnel <em>Erp Personnel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPersonnel
	 * @generated
	 */
	public Adapter createErpPersonnelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem <em>Erp Quote Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem
	 * @generated
	 */
	public Adapter createErpQuoteLineItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData <em>Erp Bom Item Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData
	 * @generated
	 */
	public Adapter createErpBomItemDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Core.IdentifiedObject <em>Identified Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Core.IdentifiedObject
	 * @generated
	 */
	public Adapter createIdentifiedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.Common.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.Common.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61968.Common.Organisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61968.Common.Organisation
	 * @generated
	 */
	public Adapter createOrganisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfCommon.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfCommon.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CIM15.IEC61970.Informative.InfCommon.BankAccount <em>Bank Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CIM15.IEC61970.Informative.InfCommon.BankAccount
	 * @generated
	 */
	public Adapter createBankAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //InfERPSupportAdapterFactory
