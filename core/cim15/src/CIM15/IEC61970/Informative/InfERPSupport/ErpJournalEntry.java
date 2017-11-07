/**
 */
package CIM15.IEC61970.Informative.InfERPSupport;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfWork.CostType;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Journal Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getTransactionDateTime <em>Transaction Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpPayableLineItems <em>Erp Payable Line Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpRecLineItems <em>Erp Rec Line Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpLedgerEntry <em>Erp Ledger Entry</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getCostTypes <em>Cost Types</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getPostingDateTime <em>Posting Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getAmount <em>Amount</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpJournal <em>Erp Journal</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getAccountID <em>Account ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErpJournalEntry extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getTransactionDateTime() <em>Transaction Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TRANSACTION_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionDateTime() <em>Transaction Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date transactionDateTime = TRANSACTION_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Transaction Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transactionDateTimeESet;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The cached value of the '{@link #getErpPayableLineItems() <em>Erp Payable Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPayableLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpPayableLineItem> erpPayableLineItems;

	/**
	 * The cached value of the '{@link #getErpInvoiceLineItem() <em>Erp Invoice Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpInvoiceLineItem erpInvoiceLineItem;

	/**
	 * The cached value of the '{@link #getErpRecLineItems() <em>Erp Rec Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpRecLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpRecLineItem> erpRecLineItems;

	/**
	 * The default value of the '{@link #getSourceID() <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceID() <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceID()
	 * @generated
	 * @ordered
	 */
	protected String sourceID = SOURCE_ID_EDEFAULT;

	/**
	 * This is true if the Source ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sourceIDESet;

	/**
	 * The cached value of the '{@link #getErpLedgerEntry() <em>Erp Ledger Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpLedgerEntry()
	 * @generated
	 * @ordered
	 */
	protected ErpLedgerEntry erpLedgerEntry;

	/**
	 * The cached value of the '{@link #getCostTypes() <em>Cost Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CostType> costTypes;

	/**
	 * The default value of the '{@link #getPostingDateTime() <em>Posting Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostingDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date POSTING_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostingDateTime() <em>Posting Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostingDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date postingDateTime = POSTING_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Posting Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean postingDateTimeESet;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected float amount = AMOUNT_EDEFAULT;

	/**
	 * This is true if the Amount attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean amountESet;

	/**
	 * The cached value of the '{@link #getErpJournal() <em>Erp Journal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpJournal()
	 * @generated
	 * @ordered
	 */
	protected ErpJournal erpJournal;

	/**
	 * The default value of the '{@link #getAccountID() <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountID()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountID() <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountID()
	 * @generated
	 * @ordered
	 */
	protected String accountID = ACCOUNT_ID_EDEFAULT;

	/**
	 * This is true if the Account ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accountIDESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpJournalEntry() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_JOURNAL_ENTRY;
	}

	/**
	 * Returns the value of the '<em><b>Transaction Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Date Time</em>' attribute.
	 * @see #isSetTransactionDateTime()
	 * @see #unsetTransactionDateTime()
	 * @see #setTransactionDateTime(Date)
	 * @generated
	 */
	public Date getTransactionDateTime() {
		return transactionDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getTransactionDateTime <em>Transaction Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Date Time</em>' attribute.
	 * @see #isSetTransactionDateTime()
	 * @see #unsetTransactionDateTime()
	 * @see #getTransactionDateTime()
	 * @generated
	 */
	public void setTransactionDateTime(Date newTransactionDateTime) {
		transactionDateTime = newTransactionDateTime;
		transactionDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getTransactionDateTime <em>Transaction Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransactionDateTime()
	 * @see #getTransactionDateTime()
	 * @see #setTransactionDateTime(Date)
	 * @generated
	 */
	public void unsetTransactionDateTime() {
		transactionDateTime = TRANSACTION_DATE_TIME_EDEFAULT;
		transactionDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getTransactionDateTime <em>Transaction Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transaction Date Time</em>' attribute is set.
	 * @see #unsetTransactionDateTime()
	 * @see #getTransactionDateTime()
	 * @see #setTransactionDateTime(Date)
	 * @generated
	 */
	public boolean isSetTransactionDateTime() {
		return transactionDateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Status)
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Status newStatus, NotificationChain msgs) {
		Status oldStatus = status;
		status = newStatus;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_JOURNAL_ENTRY__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_JOURNAL_ENTRY__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Erp Payable Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpJournalEntries <em>Erp Journal Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Payable Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Payable Line Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpJournalEntries
	 * @generated
	 */
	public EList<ErpPayableLineItem> getErpPayableLineItems() {
		if (erpPayableLineItems == null) {
			erpPayableLineItems = new BasicInternalEList<ErpPayableLineItem>(ErpPayableLineItem.class);
		}
		return erpPayableLineItems;
	}

	/**
	 * Returns the value of the '<em><b>Erp Invoice Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpJournalEntries <em>Erp Journal Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Invoice Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Invoice Line Item</em>' reference.
	 * @see #setErpInvoiceLineItem(ErpInvoiceLineItem)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpJournalEntries
	 * @generated
	 */
	public ErpInvoiceLineItem getErpInvoiceLineItem() {
		if (erpInvoiceLineItem != null && erpInvoiceLineItem.eIsProxy()) {
			InternalEObject oldErpInvoiceLineItem = (InternalEObject)erpInvoiceLineItem;
			erpInvoiceLineItem = (ErpInvoiceLineItem)eResolveProxy(oldErpInvoiceLineItem);
			if (erpInvoiceLineItem != oldErpInvoiceLineItem) {
			}
		}
		return erpInvoiceLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInvoiceLineItem basicGetErpInvoiceLineItem() {
		return erpInvoiceLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpInvoiceLineItem(ErpInvoiceLineItem newErpInvoiceLineItem, NotificationChain msgs) {
		ErpInvoiceLineItem oldErpInvoiceLineItem = erpInvoiceLineItem;
		erpInvoiceLineItem = newErpInvoiceLineItem;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Invoice Line Item</em>' reference.
	 * @see #getErpInvoiceLineItem()
	 * @generated
	 */
	public void setErpInvoiceLineItem(ErpInvoiceLineItem newErpInvoiceLineItem) {
		if (newErpInvoiceLineItem != erpInvoiceLineItem) {
			NotificationChain msgs = null;
			if (erpInvoiceLineItem != null)
				msgs = ((InternalEObject)erpInvoiceLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_JOURNAL_ENTRIES, ErpInvoiceLineItem.class, msgs);
			if (newErpInvoiceLineItem != null)
				msgs = ((InternalEObject)newErpInvoiceLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_JOURNAL_ENTRIES, ErpInvoiceLineItem.class, msgs);
			msgs = basicSetErpInvoiceLineItem(newErpInvoiceLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Erp Rec Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpJournalEntries <em>Erp Journal Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Rec Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Rec Line Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpJournalEntries
	 * @generated
	 */
	public EList<ErpRecLineItem> getErpRecLineItems() {
		if (erpRecLineItems == null) {
			erpRecLineItems = new BasicInternalEList<ErpRecLineItem>(ErpRecLineItem.class);
		}
		return erpRecLineItems;
	}

	/**
	 * Returns the value of the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source ID</em>' attribute.
	 * @see #isSetSourceID()
	 * @see #unsetSourceID()
	 * @see #setSourceID(String)
	 * @generated
	 */
	public String getSourceID() {
		return sourceID;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getSourceID <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source ID</em>' attribute.
	 * @see #isSetSourceID()
	 * @see #unsetSourceID()
	 * @see #getSourceID()
	 * @generated
	 */
	public void setSourceID(String newSourceID) {
		sourceID = newSourceID;
		sourceIDESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getSourceID <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSourceID()
	 * @see #getSourceID()
	 * @see #setSourceID(String)
	 * @generated
	 */
	public void unsetSourceID() {
		sourceID = SOURCE_ID_EDEFAULT;
		sourceIDESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getSourceID <em>Source ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source ID</em>' attribute is set.
	 * @see #unsetSourceID()
	 * @see #getSourceID()
	 * @see #setSourceID(String)
	 * @generated
	 */
	public boolean isSetSourceID() {
		return sourceIDESet;
	}

	/**
	 * Returns the value of the '<em><b>Erp Ledger Entry</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpJounalEntry <em>Erp Jounal Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Ledger Entry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Ledger Entry</em>' reference.
	 * @see #setErpLedgerEntry(ErpLedgerEntry)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpJounalEntry
	 * @generated
	 */
	public ErpLedgerEntry getErpLedgerEntry() {
		if (erpLedgerEntry != null && erpLedgerEntry.eIsProxy()) {
			InternalEObject oldErpLedgerEntry = (InternalEObject)erpLedgerEntry;
			erpLedgerEntry = (ErpLedgerEntry)eResolveProxy(oldErpLedgerEntry);
			if (erpLedgerEntry != oldErpLedgerEntry) {
			}
		}
		return erpLedgerEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpLedgerEntry basicGetErpLedgerEntry() {
		return erpLedgerEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpLedgerEntry(ErpLedgerEntry newErpLedgerEntry, NotificationChain msgs) {
		ErpLedgerEntry oldErpLedgerEntry = erpLedgerEntry;
		erpLedgerEntry = newErpLedgerEntry;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpLedgerEntry <em>Erp Ledger Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Ledger Entry</em>' reference.
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	public void setErpLedgerEntry(ErpLedgerEntry newErpLedgerEntry) {
		if (newErpLedgerEntry != erpLedgerEntry) {
			NotificationChain msgs = null;
			if (erpLedgerEntry != null)
				msgs = ((InternalEObject)erpLedgerEntry).eInverseRemove(this, InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY, ErpLedgerEntry.class, msgs);
			if (newErpLedgerEntry != null)
				msgs = ((InternalEObject)newErpLedgerEntry).eInverseAdd(this, InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY, ErpLedgerEntry.class, msgs);
			msgs = basicSetErpLedgerEntry(newErpLedgerEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Cost Types</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.CostType}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CostType#getErpJournalEntries <em>Erp Journal Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Types</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.CostType#getErpJournalEntries
	 * @generated
	 */
	public EList<CostType> getCostTypes() {
		if (costTypes == null) {
			costTypes = new BasicInternalEList<CostType>(CostType.class);
		}
		return costTypes;
	}

	/**
	 * Returns the value of the '<em><b>Posting Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posting Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posting Date Time</em>' attribute.
	 * @see #isSetPostingDateTime()
	 * @see #unsetPostingDateTime()
	 * @see #setPostingDateTime(Date)
	 * @generated
	 */
	public Date getPostingDateTime() {
		return postingDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getPostingDateTime <em>Posting Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posting Date Time</em>' attribute.
	 * @see #isSetPostingDateTime()
	 * @see #unsetPostingDateTime()
	 * @see #getPostingDateTime()
	 * @generated
	 */
	public void setPostingDateTime(Date newPostingDateTime) {
		postingDateTime = newPostingDateTime;
		postingDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getPostingDateTime <em>Posting Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPostingDateTime()
	 * @see #getPostingDateTime()
	 * @see #setPostingDateTime(Date)
	 * @generated
	 */
	public void unsetPostingDateTime() {
		postingDateTime = POSTING_DATE_TIME_EDEFAULT;
		postingDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getPostingDateTime <em>Posting Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Posting Date Time</em>' attribute is set.
	 * @see #unsetPostingDateTime()
	 * @see #getPostingDateTime()
	 * @see #setPostingDateTime(Date)
	 * @generated
	 */
	public boolean isSetPostingDateTime() {
		return postingDateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #isSetAmount()
	 * @see #unsetAmount()
	 * @see #setAmount(float)
	 * @generated
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #isSetAmount()
	 * @see #unsetAmount()
	 * @see #getAmount()
	 * @generated
	 */
	public void setAmount(float newAmount) {
		amount = newAmount;
		amountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAmount()
	 * @see #getAmount()
	 * @see #setAmount(float)
	 * @generated
	 */
	public void unsetAmount() {
		amount = AMOUNT_EDEFAULT;
		amountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getAmount <em>Amount</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Amount</em>' attribute is set.
	 * @see #unsetAmount()
	 * @see #getAmount()
	 * @see #setAmount(float)
	 * @generated
	 */
	public boolean isSetAmount() {
		return amountESet;
	}

	/**
	 * Returns the value of the '<em><b>Erp Journal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournal#getErpJournalEntries <em>Erp Journal Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Journal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Journal</em>' reference.
	 * @see #setErpJournal(ErpJournal)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournal#getErpJournalEntries
	 * @generated
	 */
	public ErpJournal getErpJournal() {
		if (erpJournal != null && erpJournal.eIsProxy()) {
			InternalEObject oldErpJournal = (InternalEObject)erpJournal;
			erpJournal = (ErpJournal)eResolveProxy(oldErpJournal);
			if (erpJournal != oldErpJournal) {
			}
		}
		return erpJournal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpJournal basicGetErpJournal() {
		return erpJournal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpJournal(ErpJournal newErpJournal, NotificationChain msgs) {
		ErpJournal oldErpJournal = erpJournal;
		erpJournal = newErpJournal;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpJournal <em>Erp Journal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Journal</em>' reference.
	 * @see #getErpJournal()
	 * @generated
	 */
	public void setErpJournal(ErpJournal newErpJournal) {
		if (newErpJournal != erpJournal) {
			NotificationChain msgs = null;
			if (erpJournal != null)
				msgs = ((InternalEObject)erpJournal).eInverseRemove(this, InfERPSupportPackage.ERP_JOURNAL__ERP_JOURNAL_ENTRIES, ErpJournal.class, msgs);
			if (newErpJournal != null)
				msgs = ((InternalEObject)newErpJournal).eInverseAdd(this, InfERPSupportPackage.ERP_JOURNAL__ERP_JOURNAL_ENTRIES, ErpJournal.class, msgs);
			msgs = basicSetErpJournal(newErpJournal, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account ID</em>' attribute.
	 * @see #isSetAccountID()
	 * @see #unsetAccountID()
	 * @see #setAccountID(String)
	 * @generated
	 */
	public String getAccountID() {
		return accountID;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getAccountID <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account ID</em>' attribute.
	 * @see #isSetAccountID()
	 * @see #unsetAccountID()
	 * @see #getAccountID()
	 * @generated
	 */
	public void setAccountID(String newAccountID) {
		accountID = newAccountID;
		accountIDESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getAccountID <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccountID()
	 * @see #getAccountID()
	 * @see #setAccountID(String)
	 * @generated
	 */
	public void unsetAccountID() {
		accountID = ACCOUNT_ID_EDEFAULT;
		accountIDESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getAccountID <em>Account ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Account ID</em>' attribute is set.
	 * @see #unsetAccountID()
	 * @see #getAccountID()
	 * @see #setAccountID(String)
	 * @generated
	 */
	public boolean isSetAccountID() {
		return accountIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_PAYABLE_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPayableLineItems()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_INVOICE_LINE_ITEM:
				if (erpInvoiceLineItem != null)
					msgs = ((InternalEObject)erpInvoiceLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_JOURNAL_ENTRIES, ErpInvoiceLineItem.class, msgs);
				return basicSetErpInvoiceLineItem((ErpInvoiceLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_REC_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpRecLineItems()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY:
				if (erpLedgerEntry != null)
					msgs = ((InternalEObject)erpLedgerEntry).eInverseRemove(this, InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY, ErpLedgerEntry.class, msgs);
				return basicSetErpLedgerEntry((ErpLedgerEntry)otherEnd, msgs);
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__COST_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCostTypes()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_JOURNAL:
				if (erpJournal != null)
					msgs = ((InternalEObject)erpJournal).eInverseRemove(this, InfERPSupportPackage.ERP_JOURNAL__ERP_JOURNAL_ENTRIES, ErpJournal.class, msgs);
				return basicSetErpJournal((ErpJournal)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__STATUS:
				return basicSetStatus(null, msgs);
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_PAYABLE_LINE_ITEMS:
				return ((InternalEList<?>)getErpPayableLineItems()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_INVOICE_LINE_ITEM:
				return basicSetErpInvoiceLineItem(null, msgs);
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_REC_LINE_ITEMS:
				return ((InternalEList<?>)getErpRecLineItems()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY:
				return basicSetErpLedgerEntry(null, msgs);
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__COST_TYPES:
				return ((InternalEList<?>)getCostTypes()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_JOURNAL:
				return basicSetErpJournal(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__TRANSACTION_DATE_TIME:
				return getTransactionDateTime();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__STATUS:
				return getStatus();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_PAYABLE_LINE_ITEMS:
				return getErpPayableLineItems();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_INVOICE_LINE_ITEM:
				if (resolve) return getErpInvoiceLineItem();
				return basicGetErpInvoiceLineItem();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_REC_LINE_ITEMS:
				return getErpRecLineItems();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__SOURCE_ID:
				return getSourceID();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY:
				if (resolve) return getErpLedgerEntry();
				return basicGetErpLedgerEntry();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__COST_TYPES:
				return getCostTypes();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__POSTING_DATE_TIME:
				return getPostingDateTime();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__AMOUNT:
				return getAmount();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_JOURNAL:
				if (resolve) return getErpJournal();
				return basicGetErpJournal();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ACCOUNT_ID:
				return getAccountID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__TRANSACTION_DATE_TIME:
				setTransactionDateTime((Date)newValue);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__STATUS:
				setStatus((Status)newValue);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_PAYABLE_LINE_ITEMS:
				getErpPayableLineItems().clear();
				getErpPayableLineItems().addAll((Collection<? extends ErpPayableLineItem>)newValue);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_INVOICE_LINE_ITEM:
				setErpInvoiceLineItem((ErpInvoiceLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_REC_LINE_ITEMS:
				getErpRecLineItems().clear();
				getErpRecLineItems().addAll((Collection<? extends ErpRecLineItem>)newValue);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__SOURCE_ID:
				setSourceID((String)newValue);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY:
				setErpLedgerEntry((ErpLedgerEntry)newValue);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__COST_TYPES:
				getCostTypes().clear();
				getCostTypes().addAll((Collection<? extends CostType>)newValue);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__POSTING_DATE_TIME:
				setPostingDateTime((Date)newValue);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__AMOUNT:
				setAmount((Float)newValue);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_JOURNAL:
				setErpJournal((ErpJournal)newValue);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ACCOUNT_ID:
				setAccountID((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__TRANSACTION_DATE_TIME:
				unsetTransactionDateTime();
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__STATUS:
				setStatus((Status)null);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_PAYABLE_LINE_ITEMS:
				getErpPayableLineItems().clear();
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_INVOICE_LINE_ITEM:
				setErpInvoiceLineItem((ErpInvoiceLineItem)null);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_REC_LINE_ITEMS:
				getErpRecLineItems().clear();
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__SOURCE_ID:
				unsetSourceID();
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY:
				setErpLedgerEntry((ErpLedgerEntry)null);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__COST_TYPES:
				getCostTypes().clear();
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__POSTING_DATE_TIME:
				unsetPostingDateTime();
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__AMOUNT:
				unsetAmount();
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_JOURNAL:
				setErpJournal((ErpJournal)null);
				return;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ACCOUNT_ID:
				unsetAccountID();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__TRANSACTION_DATE_TIME:
				return isSetTransactionDateTime();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__STATUS:
				return status != null;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_PAYABLE_LINE_ITEMS:
				return erpPayableLineItems != null && !erpPayableLineItems.isEmpty();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_INVOICE_LINE_ITEM:
				return erpInvoiceLineItem != null;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_REC_LINE_ITEMS:
				return erpRecLineItems != null && !erpRecLineItems.isEmpty();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__SOURCE_ID:
				return isSetSourceID();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY:
				return erpLedgerEntry != null;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__COST_TYPES:
				return costTypes != null && !costTypes.isEmpty();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__POSTING_DATE_TIME:
				return isSetPostingDateTime();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__AMOUNT:
				return isSetAmount();
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_JOURNAL:
				return erpJournal != null;
			case InfERPSupportPackage.ERP_JOURNAL_ENTRY__ACCOUNT_ID:
				return isSetAccountID();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (transactionDateTime: ");
		if (transactionDateTimeESet) result.append(transactionDateTime); else result.append("<unset>");
		result.append(", sourceID: ");
		if (sourceIDESet) result.append(sourceID); else result.append("<unset>");
		result.append(", postingDateTime: ");
		if (postingDateTimeESet) result.append(postingDateTime); else result.append("<unset>");
		result.append(", amount: ");
		if (amountESet) result.append(amount); else result.append("<unset>");
		result.append(", accountID: ");
		if (accountIDESet) result.append(accountID); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ErpJournalEntry
