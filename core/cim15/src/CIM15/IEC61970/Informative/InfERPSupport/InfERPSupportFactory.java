/**
 */
package CIM15.IEC61970.Informative.InfERPSupport;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfERPSupportFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfERPSupportFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfERPSupportFactory INSTANCE = CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfERPSupportFactory init() {
		try {
			InfERPSupportFactory theInfERPSupportFactory = (InfERPSupportFactory)EPackage.Registry.INSTANCE.getEFactory(InfERPSupportPackage.eNS_URI);
			if (theInfERPSupportFactory != null) {
				return theInfERPSupportFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfERPSupportFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfERPSupportFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM: return createErpRecDelvLineItem();
			case InfERPSupportPackage.ERP_LEDGER_BUDGET: return createErpLedgerBudget();
			case InfERPSupportPackage.ERP_TIME_ENTRY: return createErpTimeEntry();
			case InfERPSupportPackage.ERP_COMPETENCY: return createErpCompetency();
			case InfERPSupportPackage.ERP_PURCHASE_ORDER: return createErpPurchaseOrder();
			case InfERPSupportPackage.ERP_ENG_CHANGE_ORDER: return createErpEngChangeOrder();
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING: return createErpProjectAccounting();
			case InfERPSupportPackage.ERP_REC_LINE_ITEM: return createErpRecLineItem();
			case InfERPSupportPackage.ERP_PAYABLE_LINE_ITEM: return createErpPayableLineItem();
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM: return createErpLedBudLineItem();
			case InfERPSupportPackage.ERP_REQUISITION: return createErpRequisition();
			case InfERPSupportPackage.ERP_ORGANISATION: return createErpOrganisation();
			case InfERPSupportPackage.ERP_INVOICE: return createErpInvoice();
			case InfERPSupportPackage.DOC_ERP_PERSON_ROLE: return createDocErpPersonRole();
			case InfERPSupportPackage.ERP_BANK_ACCOUNT: return createErpBankAccount();
			case InfERPSupportPackage.ERP_QUOTE: return createErpQuote();
			case InfERPSupportPackage.ERP_PERSON: return createErpPerson();
			case InfERPSupportPackage.ERP_ITEM_MASTER: return createErpItemMaster();
			case InfERPSupportPackage.ERP_BOM: return createErpBOM();
			case InfERPSupportPackage.ERP_INVENTORY_COUNT: return createErpInventoryCount();
			case InfERPSupportPackage.ERP_ISSUE_INVENTORY: return createErpIssueInventory();
			case InfERPSupportPackage.ERP_PAYABLE: return createErpPayable();
			case InfERPSupportPackage.ERP_LEDGER: return createErpLedger();
			case InfERPSupportPackage.ERP_PO_LINE_ITEM: return createErpPOLineItem();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY: return createErpLedgerEntry();
			case InfERPSupportPackage.ERP_PAYMENT: return createErpPayment();
			case InfERPSupportPackage.ERP_RECEIVABLE: return createErpReceivable();
			case InfERPSupportPackage.DOC_ORG_ROLE: return createDocOrgRole();
			case InfERPSupportPackage.ERP_REQ_LINE_ITEM: return createErpReqLineItem();
			case InfERPSupportPackage.ERP_TIME_SHEET: return createErpTimeSheet();
			case InfERPSupportPackage.ERP_INVENTORY: return createErpInventory();
			case InfERPSupportPackage.ERP_CHART_OF_ACCOUNTS: return createErpChartOfAccounts();
			case InfERPSupportPackage.ERP_SITE_LEVEL_DATA: return createErpSiteLevelData();
			case InfERPSupportPackage.ORG_ERP_PERSON_ROLE: return createOrgErpPersonRole();
			case InfERPSupportPackage.ERP_RECEIVE_DELIVERY: return createErpReceiveDelivery();
			case InfERPSupportPackage.ERP_SALES_ORDER: return createErpSalesOrder();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY: return createErpJournalEntry();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM: return createErpInvoiceLineItem();
			case InfERPSupportPackage.ORG_ORG_ROLE: return createOrgOrgRole();
			case InfERPSupportPackage.ERP_JOURNAL: return createErpJournal();
			case InfERPSupportPackage.ERP_PERSONNEL: return createErpPersonnel();
			case InfERPSupportPackage.ERP_QUOTE_LINE_ITEM: return createErpQuoteLineItem();
			case InfERPSupportPackage.ERP_BOM_ITEM_DATA: return createErpBomItemData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM_KIND:
				return createErpInvoiceLineItemKindFromString(eDataType, initialValue);
			case InfERPSupportPackage.ERP_INVOICE_KIND:
				return createErpInvoiceKindFromString(eDataType, initialValue);
			case InfERPSupportPackage.ERP_ACCOUNT_KIND:
				return createErpAccountKindFromString(eDataType, initialValue);
			case InfERPSupportPackage.BILL_MEDIA_KIND:
				return createBillMediaKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM_KIND:
				return convertErpInvoiceLineItemKindToString(eDataType, instanceValue);
			case InfERPSupportPackage.ERP_INVOICE_KIND:
				return convertErpInvoiceKindToString(eDataType, instanceValue);
			case InfERPSupportPackage.ERP_ACCOUNT_KIND:
				return convertErpAccountKindToString(eDataType, instanceValue);
			case InfERPSupportPackage.BILL_MEDIA_KIND:
				return convertBillMediaKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpRecDelvLineItem createErpRecDelvLineItem() {
		ErpRecDelvLineItem erpRecDelvLineItem = new ErpRecDelvLineItem();
		return erpRecDelvLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpLedgerBudget createErpLedgerBudget() {
		ErpLedgerBudget erpLedgerBudget = new ErpLedgerBudget();
		return erpLedgerBudget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpTimeEntry createErpTimeEntry() {
		ErpTimeEntry erpTimeEntry = new ErpTimeEntry();
		return erpTimeEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpCompetency createErpCompetency() {
		ErpCompetency erpCompetency = new ErpCompetency();
		return erpCompetency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPurchaseOrder createErpPurchaseOrder() {
		ErpPurchaseOrder erpPurchaseOrder = new ErpPurchaseOrder();
		return erpPurchaseOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpEngChangeOrder createErpEngChangeOrder() {
		ErpEngChangeOrder erpEngChangeOrder = new ErpEngChangeOrder();
		return erpEngChangeOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpProjectAccounting createErpProjectAccounting() {
		ErpProjectAccounting erpProjectAccounting = new ErpProjectAccounting();
		return erpProjectAccounting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpRecLineItem createErpRecLineItem() {
		ErpRecLineItem erpRecLineItem = new ErpRecLineItem();
		return erpRecLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPayableLineItem createErpPayableLineItem() {
		ErpPayableLineItem erpPayableLineItem = new ErpPayableLineItem();
		return erpPayableLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpLedBudLineItem createErpLedBudLineItem() {
		ErpLedBudLineItem erpLedBudLineItem = new ErpLedBudLineItem();
		return erpLedBudLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpRequisition createErpRequisition() {
		ErpRequisition erpRequisition = new ErpRequisition();
		return erpRequisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpOrganisation createErpOrganisation() {
		ErpOrganisation erpOrganisation = new ErpOrganisation();
		return erpOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInvoice createErpInvoice() {
		ErpInvoice erpInvoice = new ErpInvoice();
		return erpInvoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocErpPersonRole createDocErpPersonRole() {
		DocErpPersonRole docErpPersonRole = new DocErpPersonRole();
		return docErpPersonRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpBankAccount createErpBankAccount() {
		ErpBankAccount erpBankAccount = new ErpBankAccount();
		return erpBankAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpQuote createErpQuote() {
		ErpQuote erpQuote = new ErpQuote();
		return erpQuote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPerson createErpPerson() {
		ErpPerson erpPerson = new ErpPerson();
		return erpPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpItemMaster createErpItemMaster() {
		ErpItemMaster erpItemMaster = new ErpItemMaster();
		return erpItemMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpBOM createErpBOM() {
		ErpBOM erpBOM = new ErpBOM();
		return erpBOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInventoryCount createErpInventoryCount() {
		ErpInventoryCount erpInventoryCount = new ErpInventoryCount();
		return erpInventoryCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpIssueInventory createErpIssueInventory() {
		ErpIssueInventory erpIssueInventory = new ErpIssueInventory();
		return erpIssueInventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPayable createErpPayable() {
		ErpPayable erpPayable = new ErpPayable();
		return erpPayable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpLedger createErpLedger() {
		ErpLedger erpLedger = new ErpLedger();
		return erpLedger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPOLineItem createErpPOLineItem() {
		ErpPOLineItem erpPOLineItem = new ErpPOLineItem();
		return erpPOLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpLedgerEntry createErpLedgerEntry() {
		ErpLedgerEntry erpLedgerEntry = new ErpLedgerEntry();
		return erpLedgerEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPayment createErpPayment() {
		ErpPayment erpPayment = new ErpPayment();
		return erpPayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpReceivable createErpReceivable() {
		ErpReceivable erpReceivable = new ErpReceivable();
		return erpReceivable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocOrgRole createDocOrgRole() {
		DocOrgRole docOrgRole = new DocOrgRole();
		return docOrgRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpReqLineItem createErpReqLineItem() {
		ErpReqLineItem erpReqLineItem = new ErpReqLineItem();
		return erpReqLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpTimeSheet createErpTimeSheet() {
		ErpTimeSheet erpTimeSheet = new ErpTimeSheet();
		return erpTimeSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInventory createErpInventory() {
		ErpInventory erpInventory = new ErpInventory();
		return erpInventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpChartOfAccounts createErpChartOfAccounts() {
		ErpChartOfAccounts erpChartOfAccounts = new ErpChartOfAccounts();
		return erpChartOfAccounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpSiteLevelData createErpSiteLevelData() {
		ErpSiteLevelData erpSiteLevelData = new ErpSiteLevelData();
		return erpSiteLevelData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgErpPersonRole createOrgErpPersonRole() {
		OrgErpPersonRole orgErpPersonRole = new OrgErpPersonRole();
		return orgErpPersonRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpReceiveDelivery createErpReceiveDelivery() {
		ErpReceiveDelivery erpReceiveDelivery = new ErpReceiveDelivery();
		return erpReceiveDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpSalesOrder createErpSalesOrder() {
		ErpSalesOrder erpSalesOrder = new ErpSalesOrder();
		return erpSalesOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpJournalEntry createErpJournalEntry() {
		ErpJournalEntry erpJournalEntry = new ErpJournalEntry();
		return erpJournalEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInvoiceLineItem createErpInvoiceLineItem() {
		ErpInvoiceLineItem erpInvoiceLineItem = new ErpInvoiceLineItem();
		return erpInvoiceLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrgOrgRole createOrgOrgRole() {
		OrgOrgRole orgOrgRole = new OrgOrgRole();
		return orgOrgRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpJournal createErpJournal() {
		ErpJournal erpJournal = new ErpJournal();
		return erpJournal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPersonnel createErpPersonnel() {
		ErpPersonnel erpPersonnel = new ErpPersonnel();
		return erpPersonnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpQuoteLineItem createErpQuoteLineItem() {
		ErpQuoteLineItem erpQuoteLineItem = new ErpQuoteLineItem();
		return erpQuoteLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpBomItemData createErpBomItemData() {
		ErpBomItemData erpBomItemData = new ErpBomItemData();
		return erpBomItemData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInvoiceLineItemKind createErpInvoiceLineItemKindFromString(EDataType eDataType, String initialValue) {
		ErpInvoiceLineItemKind result = ErpInvoiceLineItemKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertErpInvoiceLineItemKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInvoiceKind createErpInvoiceKindFromString(EDataType eDataType, String initialValue) {
		ErpInvoiceKind result = ErpInvoiceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertErpInvoiceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpAccountKind createErpAccountKindFromString(EDataType eDataType, String initialValue) {
		ErpAccountKind result = ErpAccountKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertErpAccountKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillMediaKind createBillMediaKindFromString(EDataType eDataType, String initialValue) {
		BillMediaKind result = BillMediaKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBillMediaKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfERPSupportPackage getInfERPSupportPackage() {
		return (InfERPSupportPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfERPSupportPackage getPackage() {
		return InfERPSupportPackage.eINSTANCE;
	}

} //InfERPSupportFactory
