/**
 */
package CIM15.IEC61970.Informative.InfERPSupport;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61968.Customers.CustomerAccount;
import CIM15.IEC61968.Customers.CustomersPackage;

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
 * A representation of the model object '<em><b>Erp Invoice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getMailedDate <em>Mailed Date</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getTransactionDateTime <em>Transaction Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getAmount <em>Amount</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getBillMediaKind <em>Bill Media Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getReferenceNumber <em>Reference Number</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getTransferType <em>Transfer Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#isProForma <em>Pro Forma</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getCustomerAccount <em>Customer Account</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErpInvoice extends Document {
	/**
	 * The cached value of the '{@link #getErpInvoiceLineItems() <em>Erp Invoice Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpInvoiceLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpInvoiceLineItem> erpInvoiceLineItems;

	/**
	 * The default value of the '{@link #getMailedDate() <em>Mailed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMailedDate()
	 * @generated
	 * @ordered
	 */
	protected static final String MAILED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMailedDate() <em>Mailed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMailedDate()
	 * @generated
	 * @ordered
	 */
	protected String mailedDate = MAILED_DATE_EDEFAULT;

	/**
	 * This is true if the Mailed Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mailedDateESet;

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
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected String dueDate = DUE_DATE_EDEFAULT;

	/**
	 * This is true if the Due Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dueDateESet;

	/**
	 * The default value of the '{@link #getBillMediaKind() <em>Bill Media Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillMediaKind()
	 * @generated
	 * @ordered
	 */
	protected static final BillMediaKind BILL_MEDIA_KIND_EDEFAULT = BillMediaKind.OTHER;

	/**
	 * The cached value of the '{@link #getBillMediaKind() <em>Bill Media Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillMediaKind()
	 * @generated
	 * @ordered
	 */
	protected BillMediaKind billMediaKind = BILL_MEDIA_KIND_EDEFAULT;

	/**
	 * This is true if the Bill Media Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean billMediaKindESet;

	/**
	 * The default value of the '{@link #getReferenceNumber() <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceNumber() <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected String referenceNumber = REFERENCE_NUMBER_EDEFAULT;

	/**
	 * This is true if the Reference Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean referenceNumberESet;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ErpInvoiceKind KIND_EDEFAULT = ErpInvoiceKind.SALES;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ErpInvoiceKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The default value of the '{@link #getTransferType() <em>Transfer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferType()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransferType() <em>Transfer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferType()
	 * @generated
	 * @ordered
	 */
	protected String transferType = TRANSFER_TYPE_EDEFAULT;

	/**
	 * This is true if the Transfer Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transferTypeESet;

	/**
	 * The default value of the '{@link #isProForma() <em>Pro Forma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProForma()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRO_FORMA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProForma() <em>Pro Forma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProForma()
	 * @generated
	 * @ordered
	 */
	protected boolean proForma = PRO_FORMA_EDEFAULT;

	/**
	 * This is true if the Pro Forma attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean proFormaESet;

	/**
	 * The cached value of the '{@link #getCustomerAccount() <em>Customer Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAccount()
	 * @generated
	 * @ordered
	 */
	protected CustomerAccount customerAccount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpInvoice() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_INVOICE;
	}

	/**
	 * Returns the value of the '<em><b>Erp Invoice Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpInvoice <em>Erp Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Invoice Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Invoice Line Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpInvoice
	 * @generated
	 */
	public EList<ErpInvoiceLineItem> getErpInvoiceLineItems() {
		if (erpInvoiceLineItems == null) {
			erpInvoiceLineItems = new BasicInternalEList<ErpInvoiceLineItem>(ErpInvoiceLineItem.class);
		}
		return erpInvoiceLineItems;
	}

	/**
	 * Returns the value of the '<em><b>Mailed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mailed Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mailed Date</em>' attribute.
	 * @see #isSetMailedDate()
	 * @see #unsetMailedDate()
	 * @see #setMailedDate(String)
	 * @generated
	 */
	public String getMailedDate() {
		return mailedDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getMailedDate <em>Mailed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mailed Date</em>' attribute.
	 * @see #isSetMailedDate()
	 * @see #unsetMailedDate()
	 * @see #getMailedDate()
	 * @generated
	 */
	public void setMailedDate(String newMailedDate) {
		mailedDate = newMailedDate;
		mailedDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getMailedDate <em>Mailed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMailedDate()
	 * @see #getMailedDate()
	 * @see #setMailedDate(String)
	 * @generated
	 */
	public void unsetMailedDate() {
		mailedDate = MAILED_DATE_EDEFAULT;
		mailedDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getMailedDate <em>Mailed Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mailed Date</em>' attribute is set.
	 * @see #unsetMailedDate()
	 * @see #getMailedDate()
	 * @see #setMailedDate(String)
	 * @generated
	 */
	public boolean isSetMailedDate() {
		return mailedDateESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getTransactionDateTime <em>Transaction Date Time</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getTransactionDateTime <em>Transaction Date Time</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getTransactionDateTime <em>Transaction Date Time</em>}' attribute is set.
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getAmount <em>Amount</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getAmount <em>Amount</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getAmount <em>Amount</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Due Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #isSetDueDate()
	 * @see #unsetDueDate()
	 * @see #setDueDate(String)
	 * @generated
	 */
	public String getDueDate() {
		return dueDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #isSetDueDate()
	 * @see #unsetDueDate()
	 * @see #getDueDate()
	 * @generated
	 */
	public void setDueDate(String newDueDate) {
		dueDate = newDueDate;
		dueDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDueDate()
	 * @see #getDueDate()
	 * @see #setDueDate(String)
	 * @generated
	 */
	public void unsetDueDate() {
		dueDate = DUE_DATE_EDEFAULT;
		dueDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getDueDate <em>Due Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Due Date</em>' attribute is set.
	 * @see #unsetDueDate()
	 * @see #getDueDate()
	 * @see #setDueDate(String)
	 * @generated
	 */
	public boolean isSetDueDate() {
		return dueDateESet;
	}

	/**
	 * Returns the value of the '<em><b>Bill Media Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfERPSupport.BillMediaKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill Media Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill Media Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.BillMediaKind
	 * @see #isSetBillMediaKind()
	 * @see #unsetBillMediaKind()
	 * @see #setBillMediaKind(BillMediaKind)
	 * @generated
	 */
	public BillMediaKind getBillMediaKind() {
		return billMediaKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getBillMediaKind <em>Bill Media Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill Media Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.BillMediaKind
	 * @see #isSetBillMediaKind()
	 * @see #unsetBillMediaKind()
	 * @see #getBillMediaKind()
	 * @generated
	 */
	public void setBillMediaKind(BillMediaKind newBillMediaKind) {
		billMediaKind = newBillMediaKind == null ? BILL_MEDIA_KIND_EDEFAULT : newBillMediaKind;
		billMediaKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getBillMediaKind <em>Bill Media Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBillMediaKind()
	 * @see #getBillMediaKind()
	 * @see #setBillMediaKind(BillMediaKind)
	 * @generated
	 */
	public void unsetBillMediaKind() {
		billMediaKind = BILL_MEDIA_KIND_EDEFAULT;
		billMediaKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getBillMediaKind <em>Bill Media Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bill Media Kind</em>' attribute is set.
	 * @see #unsetBillMediaKind()
	 * @see #getBillMediaKind()
	 * @see #setBillMediaKind(BillMediaKind)
	 * @generated
	 */
	public boolean isSetBillMediaKind() {
		return billMediaKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Number</em>' attribute.
	 * @see #isSetReferenceNumber()
	 * @see #unsetReferenceNumber()
	 * @see #setReferenceNumber(String)
	 * @generated
	 */
	public String getReferenceNumber() {
		return referenceNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getReferenceNumber <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Number</em>' attribute.
	 * @see #isSetReferenceNumber()
	 * @see #unsetReferenceNumber()
	 * @see #getReferenceNumber()
	 * @generated
	 */
	public void setReferenceNumber(String newReferenceNumber) {
		referenceNumber = newReferenceNumber;
		referenceNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getReferenceNumber <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferenceNumber()
	 * @see #getReferenceNumber()
	 * @see #setReferenceNumber(String)
	 * @generated
	 */
	public void unsetReferenceNumber() {
		referenceNumber = REFERENCE_NUMBER_EDEFAULT;
		referenceNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getReferenceNumber <em>Reference Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference Number</em>' attribute is set.
	 * @see #unsetReferenceNumber()
	 * @see #getReferenceNumber()
	 * @see #setReferenceNumber(String)
	 * @generated
	 */
	public boolean isSetReferenceNumber() {
		return referenceNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(ErpInvoiceKind)
	 * @generated
	 */
	public ErpInvoiceKind getKind() {
		return kind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	public void setKind(ErpInvoiceKind newKind) {
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		kindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(ErpInvoiceKind)
	 * @generated
	 */
	public void unsetKind() {
		kind = KIND_EDEFAULT;
		kindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(ErpInvoiceKind)
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * Returns the value of the '<em><b>Transfer Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transfer Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Type</em>' attribute.
	 * @see #isSetTransferType()
	 * @see #unsetTransferType()
	 * @see #setTransferType(String)
	 * @generated
	 */
	public String getTransferType() {
		return transferType;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getTransferType <em>Transfer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfer Type</em>' attribute.
	 * @see #isSetTransferType()
	 * @see #unsetTransferType()
	 * @see #getTransferType()
	 * @generated
	 */
	public void setTransferType(String newTransferType) {
		transferType = newTransferType;
		transferTypeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getTransferType <em>Transfer Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransferType()
	 * @see #getTransferType()
	 * @see #setTransferType(String)
	 * @generated
	 */
	public void unsetTransferType() {
		transferType = TRANSFER_TYPE_EDEFAULT;
		transferTypeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getTransferType <em>Transfer Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transfer Type</em>' attribute is set.
	 * @see #unsetTransferType()
	 * @see #getTransferType()
	 * @see #setTransferType(String)
	 * @generated
	 */
	public boolean isSetTransferType() {
		return transferTypeESet;
	}

	/**
	 * Returns the value of the '<em><b>Pro Forma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pro Forma</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pro Forma</em>' attribute.
	 * @see #isSetProForma()
	 * @see #unsetProForma()
	 * @see #setProForma(boolean)
	 * @generated
	 */
	public boolean isProForma() {
		return proForma;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#isProForma <em>Pro Forma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pro Forma</em>' attribute.
	 * @see #isSetProForma()
	 * @see #unsetProForma()
	 * @see #isProForma()
	 * @generated
	 */
	public void setProForma(boolean newProForma) {
		proForma = newProForma;
		proFormaESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#isProForma <em>Pro Forma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProForma()
	 * @see #isProForma()
	 * @see #setProForma(boolean)
	 * @generated
	 */
	public void unsetProForma() {
		proForma = PRO_FORMA_EDEFAULT;
		proFormaESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#isProForma <em>Pro Forma</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pro Forma</em>' attribute is set.
	 * @see #unsetProForma()
	 * @see #isProForma()
	 * @see #setProForma(boolean)
	 * @generated
	 */
	public boolean isSetProForma() {
		return proFormaESet;
	}

	/**
	 * Returns the value of the '<em><b>Customer Account</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.CustomerAccount#getErpInvoicees <em>Erp Invoicees</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Account</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Account</em>' reference.
	 * @see #setCustomerAccount(CustomerAccount)
	 * @see CIM15.IEC61968.Customers.CustomerAccount#getErpInvoicees
	 * @generated
	 */
	public CustomerAccount getCustomerAccount() {
		if (customerAccount != null && customerAccount.eIsProxy()) {
			InternalEObject oldCustomerAccount = (InternalEObject)customerAccount;
			customerAccount = (CustomerAccount)eResolveProxy(oldCustomerAccount);
			if (customerAccount != oldCustomerAccount) {
			}
		}
		return customerAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerAccount basicGetCustomerAccount() {
		return customerAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerAccount(CustomerAccount newCustomerAccount, NotificationChain msgs) {
		CustomerAccount oldCustomerAccount = customerAccount;
		customerAccount = newCustomerAccount;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getCustomerAccount <em>Customer Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Account</em>' reference.
	 * @see #getCustomerAccount()
	 * @generated
	 */
	public void setCustomerAccount(CustomerAccount newCustomerAccount) {
		if (newCustomerAccount != customerAccount) {
			NotificationChain msgs = null;
			if (customerAccount != null)
				msgs = ((InternalEObject)customerAccount).eInverseRemove(this, CustomersPackage.CUSTOMER_ACCOUNT__ERP_INVOICEES, CustomerAccount.class, msgs);
			if (newCustomerAccount != null)
				msgs = ((InternalEObject)newCustomerAccount).eInverseAdd(this, CustomersPackage.CUSTOMER_ACCOUNT__ERP_INVOICEES, CustomerAccount.class, msgs);
			msgs = basicSetCustomerAccount(newCustomerAccount, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
			case InfERPSupportPackage.ERP_INVOICE__ERP_INVOICE_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpInvoiceLineItems()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE__CUSTOMER_ACCOUNT:
				if (customerAccount != null)
					msgs = ((InternalEObject)customerAccount).eInverseRemove(this, CustomersPackage.CUSTOMER_ACCOUNT__ERP_INVOICEES, CustomerAccount.class, msgs);
				return basicSetCustomerAccount((CustomerAccount)otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_INVOICE__ERP_INVOICE_LINE_ITEMS:
				return ((InternalEList<?>)getErpInvoiceLineItems()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE__CUSTOMER_ACCOUNT:
				return basicSetCustomerAccount(null, msgs);
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
			case InfERPSupportPackage.ERP_INVOICE__ERP_INVOICE_LINE_ITEMS:
				return getErpInvoiceLineItems();
			case InfERPSupportPackage.ERP_INVOICE__MAILED_DATE:
				return getMailedDate();
			case InfERPSupportPackage.ERP_INVOICE__TRANSACTION_DATE_TIME:
				return getTransactionDateTime();
			case InfERPSupportPackage.ERP_INVOICE__AMOUNT:
				return getAmount();
			case InfERPSupportPackage.ERP_INVOICE__DUE_DATE:
				return getDueDate();
			case InfERPSupportPackage.ERP_INVOICE__BILL_MEDIA_KIND:
				return getBillMediaKind();
			case InfERPSupportPackage.ERP_INVOICE__REFERENCE_NUMBER:
				return getReferenceNumber();
			case InfERPSupportPackage.ERP_INVOICE__KIND:
				return getKind();
			case InfERPSupportPackage.ERP_INVOICE__TRANSFER_TYPE:
				return getTransferType();
			case InfERPSupportPackage.ERP_INVOICE__PRO_FORMA:
				return isProForma();
			case InfERPSupportPackage.ERP_INVOICE__CUSTOMER_ACCOUNT:
				if (resolve) return getCustomerAccount();
				return basicGetCustomerAccount();
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
			case InfERPSupportPackage.ERP_INVOICE__ERP_INVOICE_LINE_ITEMS:
				getErpInvoiceLineItems().clear();
				getErpInvoiceLineItems().addAll((Collection<? extends ErpInvoiceLineItem>)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE__MAILED_DATE:
				setMailedDate((String)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE__TRANSACTION_DATE_TIME:
				setTransactionDateTime((Date)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE__AMOUNT:
				setAmount((Float)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE__DUE_DATE:
				setDueDate((String)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE__BILL_MEDIA_KIND:
				setBillMediaKind((BillMediaKind)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE__REFERENCE_NUMBER:
				setReferenceNumber((String)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE__KIND:
				setKind((ErpInvoiceKind)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE__TRANSFER_TYPE:
				setTransferType((String)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE__PRO_FORMA:
				setProForma((Boolean)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE__CUSTOMER_ACCOUNT:
				setCustomerAccount((CustomerAccount)newValue);
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
			case InfERPSupportPackage.ERP_INVOICE__ERP_INVOICE_LINE_ITEMS:
				getErpInvoiceLineItems().clear();
				return;
			case InfERPSupportPackage.ERP_INVOICE__MAILED_DATE:
				unsetMailedDate();
				return;
			case InfERPSupportPackage.ERP_INVOICE__TRANSACTION_DATE_TIME:
				unsetTransactionDateTime();
				return;
			case InfERPSupportPackage.ERP_INVOICE__AMOUNT:
				unsetAmount();
				return;
			case InfERPSupportPackage.ERP_INVOICE__DUE_DATE:
				unsetDueDate();
				return;
			case InfERPSupportPackage.ERP_INVOICE__BILL_MEDIA_KIND:
				unsetBillMediaKind();
				return;
			case InfERPSupportPackage.ERP_INVOICE__REFERENCE_NUMBER:
				unsetReferenceNumber();
				return;
			case InfERPSupportPackage.ERP_INVOICE__KIND:
				unsetKind();
				return;
			case InfERPSupportPackage.ERP_INVOICE__TRANSFER_TYPE:
				unsetTransferType();
				return;
			case InfERPSupportPackage.ERP_INVOICE__PRO_FORMA:
				unsetProForma();
				return;
			case InfERPSupportPackage.ERP_INVOICE__CUSTOMER_ACCOUNT:
				setCustomerAccount((CustomerAccount)null);
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
			case InfERPSupportPackage.ERP_INVOICE__ERP_INVOICE_LINE_ITEMS:
				return erpInvoiceLineItems != null && !erpInvoiceLineItems.isEmpty();
			case InfERPSupportPackage.ERP_INVOICE__MAILED_DATE:
				return isSetMailedDate();
			case InfERPSupportPackage.ERP_INVOICE__TRANSACTION_DATE_TIME:
				return isSetTransactionDateTime();
			case InfERPSupportPackage.ERP_INVOICE__AMOUNT:
				return isSetAmount();
			case InfERPSupportPackage.ERP_INVOICE__DUE_DATE:
				return isSetDueDate();
			case InfERPSupportPackage.ERP_INVOICE__BILL_MEDIA_KIND:
				return isSetBillMediaKind();
			case InfERPSupportPackage.ERP_INVOICE__REFERENCE_NUMBER:
				return isSetReferenceNumber();
			case InfERPSupportPackage.ERP_INVOICE__KIND:
				return isSetKind();
			case InfERPSupportPackage.ERP_INVOICE__TRANSFER_TYPE:
				return isSetTransferType();
			case InfERPSupportPackage.ERP_INVOICE__PRO_FORMA:
				return isSetProForma();
			case InfERPSupportPackage.ERP_INVOICE__CUSTOMER_ACCOUNT:
				return customerAccount != null;
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
		result.append(" (mailedDate: ");
		if (mailedDateESet) result.append(mailedDate); else result.append("<unset>");
		result.append(", transactionDateTime: ");
		if (transactionDateTimeESet) result.append(transactionDateTime); else result.append("<unset>");
		result.append(", amount: ");
		if (amountESet) result.append(amount); else result.append("<unset>");
		result.append(", dueDate: ");
		if (dueDateESet) result.append(dueDate); else result.append("<unset>");
		result.append(", billMediaKind: ");
		if (billMediaKindESet) result.append(billMediaKind); else result.append("<unset>");
		result.append(", referenceNumber: ");
		if (referenceNumberESet) result.append(referenceNumber); else result.append("<unset>");
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(", transferType: ");
		if (transferTypeESet) result.append(transferType); else result.append("<unset>");
		result.append(", proForma: ");
		if (proFormaESet) result.append(proForma); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ErpInvoice
