/**
 */
package CIM15.IEC61970.Informative.InfERPSupport;

import CIM15.IEC61968.Common.Status;
import CIM15.IEC61968.Common.UserAttribute;

import CIM15.IEC61970.Core.IdentifiedObject;

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
 * A representation of the model object '<em><b>Erp Ledger Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getTransactionDateTime <em>Transaction Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAccountKind <em>Account Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpLedger <em>Erp Ledger</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpLedgerEntry <em>Erp Ledger Entry</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getUserAttributes <em>User Attributes</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAmount <em>Amount</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpJounalEntry <em>Erp Jounal Entry</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getPostedDateTime <em>Posted Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAccountID <em>Account ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErpLedgerEntry extends IdentifiedObject {
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
	 * The default value of the '{@link #getAccountKind() <em>Account Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountKind()
	 * @generated
	 * @ordered
	 */
	protected static final ErpAccountKind ACCOUNT_KIND_EDEFAULT = ErpAccountKind.NORMAL;

	/**
	 * The cached value of the '{@link #getAccountKind() <em>Account Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountKind()
	 * @generated
	 * @ordered
	 */
	protected ErpAccountKind accountKind = ACCOUNT_KIND_EDEFAULT;

	/**
	 * This is true if the Account Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accountKindESet;

	/**
	 * The cached value of the '{@link #getErpLedger() <em>Erp Ledger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpLedger()
	 * @generated
	 * @ordered
	 */
	protected ErpLedger erpLedger;

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
	 * The cached value of the '{@link #getErpLedgerEntry() <em>Erp Ledger Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpLedgerEntry()
	 * @generated
	 * @ordered
	 */
	protected ErpLedBudLineItem erpLedgerEntry;

	/**
	 * The cached value of the '{@link #getUserAttributes() <em>User Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttribute> userAttributes;

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
	 * The cached value of the '{@link #getErpJounalEntry() <em>Erp Jounal Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpJounalEntry()
	 * @generated
	 * @ordered
	 */
	protected ErpJournalEntry erpJounalEntry;

	/**
	 * The default value of the '{@link #getPostedDateTime() <em>Posted Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostedDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date POSTED_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostedDateTime() <em>Posted Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostedDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date postedDateTime = POSTED_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Posted Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean postedDateTimeESet;

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
	protected ErpLedgerEntry() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_LEDGER_ENTRY;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getTransactionDateTime <em>Transaction Date Time</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getTransactionDateTime <em>Transaction Date Time</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getTransactionDateTime <em>Transaction Date Time</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Account Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfERPSupport.ErpAccountKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpAccountKind
	 * @see #isSetAccountKind()
	 * @see #unsetAccountKind()
	 * @see #setAccountKind(ErpAccountKind)
	 * @generated
	 */
	public ErpAccountKind getAccountKind() {
		return accountKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAccountKind <em>Account Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpAccountKind
	 * @see #isSetAccountKind()
	 * @see #unsetAccountKind()
	 * @see #getAccountKind()
	 * @generated
	 */
	public void setAccountKind(ErpAccountKind newAccountKind) {
		accountKind = newAccountKind == null ? ACCOUNT_KIND_EDEFAULT : newAccountKind;
		accountKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAccountKind <em>Account Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccountKind()
	 * @see #getAccountKind()
	 * @see #setAccountKind(ErpAccountKind)
	 * @generated
	 */
	public void unsetAccountKind() {
		accountKind = ACCOUNT_KIND_EDEFAULT;
		accountKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAccountKind <em>Account Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Account Kind</em>' attribute is set.
	 * @see #unsetAccountKind()
	 * @see #getAccountKind()
	 * @see #setAccountKind(ErpAccountKind)
	 * @generated
	 */
	public boolean isSetAccountKind() {
		return accountKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Erp Ledger</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedger#getErpLedgerEntries <em>Erp Ledger Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Ledger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Ledger</em>' reference.
	 * @see #setErpLedger(ErpLedger)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedger#getErpLedgerEntries
	 * @generated
	 */
	public ErpLedger getErpLedger() {
		if (erpLedger != null && erpLedger.eIsProxy()) {
			InternalEObject oldErpLedger = (InternalEObject)erpLedger;
			erpLedger = (ErpLedger)eResolveProxy(oldErpLedger);
			if (erpLedger != oldErpLedger) {
			}
		}
		return erpLedger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpLedger basicGetErpLedger() {
		return erpLedger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpLedger(ErpLedger newErpLedger, NotificationChain msgs) {
		ErpLedger oldErpLedger = erpLedger;
		erpLedger = newErpLedger;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpLedger <em>Erp Ledger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Ledger</em>' reference.
	 * @see #getErpLedger()
	 * @generated
	 */
	public void setErpLedger(ErpLedger newErpLedger) {
		if (newErpLedger != erpLedger) {
			NotificationChain msgs = null;
			if (erpLedger != null)
				msgs = ((InternalEObject)erpLedger).eInverseRemove(this, InfERPSupportPackage.ERP_LEDGER__ERP_LEDGER_ENTRIES, ErpLedger.class, msgs);
			if (newErpLedger != null)
				msgs = ((InternalEObject)newErpLedger).eInverseAdd(this, InfERPSupportPackage.ERP_LEDGER__ERP_LEDGER_ENTRIES, ErpLedger.class, msgs);
			msgs = basicSetErpLedger(newErpLedger, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_LEDGER_ENTRY__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_LEDGER_ENTRY__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Erp Ledger Entry</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getErpLedBudLineItem <em>Erp Led Bud Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Ledger Entry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Ledger Entry</em>' reference.
	 * @see #setErpLedgerEntry(ErpLedBudLineItem)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getErpLedBudLineItem
	 * @generated
	 */
	public ErpLedBudLineItem getErpLedgerEntry() {
		if (erpLedgerEntry != null && erpLedgerEntry.eIsProxy()) {
			InternalEObject oldErpLedgerEntry = (InternalEObject)erpLedgerEntry;
			erpLedgerEntry = (ErpLedBudLineItem)eResolveProxy(oldErpLedgerEntry);
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
	public ErpLedBudLineItem basicGetErpLedgerEntry() {
		return erpLedgerEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpLedgerEntry(ErpLedBudLineItem newErpLedgerEntry, NotificationChain msgs) {
		ErpLedBudLineItem oldErpLedgerEntry = erpLedgerEntry;
		erpLedgerEntry = newErpLedgerEntry;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpLedgerEntry <em>Erp Ledger Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Ledger Entry</em>' reference.
	 * @see #getErpLedgerEntry()
	 * @generated
	 */
	public void setErpLedgerEntry(ErpLedBudLineItem newErpLedgerEntry) {
		if (newErpLedgerEntry != erpLedgerEntry) {
			NotificationChain msgs = null;
			if (erpLedgerEntry != null)
				msgs = ((InternalEObject)erpLedgerEntry).eInverseRemove(this, InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM, ErpLedBudLineItem.class, msgs);
			if (newErpLedgerEntry != null)
				msgs = ((InternalEObject)newErpLedgerEntry).eInverseAdd(this, InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM, ErpLedBudLineItem.class, msgs);
			msgs = basicSetErpLedgerEntry(newErpLedgerEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>User Attributes</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Common.UserAttribute}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.UserAttribute#getErpLedgerEntries <em>Erp Ledger Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Attributes</em>' reference list.
	 * @see CIM15.IEC61968.Common.UserAttribute#getErpLedgerEntries
	 * @generated
	 */
	public EList<UserAttribute> getUserAttributes() {
		if (userAttributes == null) {
			userAttributes = new BasicInternalEList<UserAttribute>(UserAttribute.class);
		}
		return userAttributes;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAmount <em>Amount</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAmount <em>Amount</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAmount <em>Amount</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Erp Jounal Entry</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpLedgerEntry <em>Erp Ledger Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Jounal Entry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Jounal Entry</em>' reference.
	 * @see #setErpJounalEntry(ErpJournalEntry)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpLedgerEntry
	 * @generated
	 */
	public ErpJournalEntry getErpJounalEntry() {
		if (erpJounalEntry != null && erpJounalEntry.eIsProxy()) {
			InternalEObject oldErpJounalEntry = (InternalEObject)erpJounalEntry;
			erpJounalEntry = (ErpJournalEntry)eResolveProxy(oldErpJounalEntry);
			if (erpJounalEntry != oldErpJounalEntry) {
			}
		}
		return erpJounalEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpJournalEntry basicGetErpJounalEntry() {
		return erpJounalEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpJounalEntry(ErpJournalEntry newErpJounalEntry, NotificationChain msgs) {
		ErpJournalEntry oldErpJounalEntry = erpJounalEntry;
		erpJounalEntry = newErpJounalEntry;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpJounalEntry <em>Erp Jounal Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Jounal Entry</em>' reference.
	 * @see #getErpJounalEntry()
	 * @generated
	 */
	public void setErpJounalEntry(ErpJournalEntry newErpJounalEntry) {
		if (newErpJounalEntry != erpJounalEntry) {
			NotificationChain msgs = null;
			if (erpJounalEntry != null)
				msgs = ((InternalEObject)erpJounalEntry).eInverseRemove(this, InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY, ErpJournalEntry.class, msgs);
			if (newErpJounalEntry != null)
				msgs = ((InternalEObject)newErpJounalEntry).eInverseAdd(this, InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY, ErpJournalEntry.class, msgs);
			msgs = basicSetErpJounalEntry(newErpJounalEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Posted Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posted Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posted Date Time</em>' attribute.
	 * @see #isSetPostedDateTime()
	 * @see #unsetPostedDateTime()
	 * @see #setPostedDateTime(Date)
	 * @generated
	 */
	public Date getPostedDateTime() {
		return postedDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getPostedDateTime <em>Posted Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posted Date Time</em>' attribute.
	 * @see #isSetPostedDateTime()
	 * @see #unsetPostedDateTime()
	 * @see #getPostedDateTime()
	 * @generated
	 */
	public void setPostedDateTime(Date newPostedDateTime) {
		postedDateTime = newPostedDateTime;
		postedDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getPostedDateTime <em>Posted Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPostedDateTime()
	 * @see #getPostedDateTime()
	 * @see #setPostedDateTime(Date)
	 * @generated
	 */
	public void unsetPostedDateTime() {
		postedDateTime = POSTED_DATE_TIME_EDEFAULT;
		postedDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getPostedDateTime <em>Posted Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Posted Date Time</em>' attribute is set.
	 * @see #unsetPostedDateTime()
	 * @see #getPostedDateTime()
	 * @see #setPostedDateTime(Date)
	 * @generated
	 */
	public boolean isSetPostedDateTime() {
		return postedDateTimeESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAccountID <em>Account ID</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAccountID <em>Account ID</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getAccountID <em>Account ID</em>}' attribute is set.
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
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER:
				if (erpLedger != null)
					msgs = ((InternalEObject)erpLedger).eInverseRemove(this, InfERPSupportPackage.ERP_LEDGER__ERP_LEDGER_ENTRIES, ErpLedger.class, msgs);
				return basicSetErpLedger((ErpLedger)otherEnd, msgs);
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY:
				if (erpLedgerEntry != null)
					msgs = ((InternalEObject)erpLedgerEntry).eInverseRemove(this, InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM, ErpLedBudLineItem.class, msgs);
				return basicSetErpLedgerEntry((ErpLedBudLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__USER_ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserAttributes()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY:
				if (erpJounalEntry != null)
					msgs = ((InternalEObject)erpJounalEntry).eInverseRemove(this, InfERPSupportPackage.ERP_JOURNAL_ENTRY__ERP_LEDGER_ENTRY, ErpJournalEntry.class, msgs);
				return basicSetErpJounalEntry((ErpJournalEntry)otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER:
				return basicSetErpLedger(null, msgs);
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__STATUS:
				return basicSetStatus(null, msgs);
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY:
				return basicSetErpLedgerEntry(null, msgs);
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__USER_ATTRIBUTES:
				return ((InternalEList<?>)getUserAttributes()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY:
				return basicSetErpJounalEntry(null, msgs);
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
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__TRANSACTION_DATE_TIME:
				return getTransactionDateTime();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ACCOUNT_KIND:
				return getAccountKind();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER:
				if (resolve) return getErpLedger();
				return basicGetErpLedger();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__STATUS:
				return getStatus();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY:
				if (resolve) return getErpLedgerEntry();
				return basicGetErpLedgerEntry();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__USER_ATTRIBUTES:
				return getUserAttributes();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__AMOUNT:
				return getAmount();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY:
				if (resolve) return getErpJounalEntry();
				return basicGetErpJounalEntry();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__POSTED_DATE_TIME:
				return getPostedDateTime();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ACCOUNT_ID:
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
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__TRANSACTION_DATE_TIME:
				setTransactionDateTime((Date)newValue);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ACCOUNT_KIND:
				setAccountKind((ErpAccountKind)newValue);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER:
				setErpLedger((ErpLedger)newValue);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__STATUS:
				setStatus((Status)newValue);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY:
				setErpLedgerEntry((ErpLedBudLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__USER_ATTRIBUTES:
				getUserAttributes().clear();
				getUserAttributes().addAll((Collection<? extends UserAttribute>)newValue);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__AMOUNT:
				setAmount((Float)newValue);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY:
				setErpJounalEntry((ErpJournalEntry)newValue);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__POSTED_DATE_TIME:
				setPostedDateTime((Date)newValue);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ACCOUNT_ID:
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
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__TRANSACTION_DATE_TIME:
				unsetTransactionDateTime();
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ACCOUNT_KIND:
				unsetAccountKind();
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER:
				setErpLedger((ErpLedger)null);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__STATUS:
				setStatus((Status)null);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY:
				setErpLedgerEntry((ErpLedBudLineItem)null);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__USER_ATTRIBUTES:
				getUserAttributes().clear();
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__AMOUNT:
				unsetAmount();
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY:
				setErpJounalEntry((ErpJournalEntry)null);
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__POSTED_DATE_TIME:
				unsetPostedDateTime();
				return;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ACCOUNT_ID:
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
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__TRANSACTION_DATE_TIME:
				return isSetTransactionDateTime();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ACCOUNT_KIND:
				return isSetAccountKind();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER:
				return erpLedger != null;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__STATUS:
				return status != null;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY:
				return erpLedgerEntry != null;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__USER_ATTRIBUTES:
				return userAttributes != null && !userAttributes.isEmpty();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__AMOUNT:
				return isSetAmount();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_JOUNAL_ENTRY:
				return erpJounalEntry != null;
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__POSTED_DATE_TIME:
				return isSetPostedDateTime();
			case InfERPSupportPackage.ERP_LEDGER_ENTRY__ACCOUNT_ID:
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
		result.append(", accountKind: ");
		if (accountKindESet) result.append(accountKind); else result.append("<unset>");
		result.append(", amount: ");
		if (amountESet) result.append(amount); else result.append("<unset>");
		result.append(", postedDateTime: ");
		if (postedDateTimeESet) result.append(postedDateTime); else result.append("<unset>");
		result.append(", accountID: ");
		if (accountIDESet) result.append(accountID); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ErpLedgerEntry
