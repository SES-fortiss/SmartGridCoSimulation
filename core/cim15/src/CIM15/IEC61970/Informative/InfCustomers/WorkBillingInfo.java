/**
 */
package CIM15.IEC61970.Informative.InfCustomers;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61968.Customers.CustomerAccount;
import CIM15.IEC61968.Customers.CustomersPackage;

import CIM15.IEC61968.Work.Work;

import CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem;

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
 * A representation of the model object '<em><b>Work Billing Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getWorks <em>Works</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getIssueDateTime <em>Issue Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getDeposit <em>Deposit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getCustomerAccount <em>Customer Account</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getCostEstimate <em>Cost Estimate</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getErpLineItems <em>Erp Line Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getDiscount <em>Discount</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getDueDateTime <em>Due Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getReceivedDateTime <em>Received Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getWorkPrice <em>Work Price</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkBillingInfo extends Document {
	/**
	 * The cached value of the '{@link #getWorks() <em>Works</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorks()
	 * @generated
	 * @ordered
	 */
	protected EList<Work> works;

	/**
	 * The default value of the '{@link #getIssueDateTime() <em>Issue Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date ISSUE_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssueDateTime() <em>Issue Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date issueDateTime = ISSUE_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Issue Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean issueDateTimeESet;

	/**
	 * The default value of the '{@link #getDeposit() <em>Deposit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeposit()
	 * @generated
	 * @ordered
	 */
	protected static final float DEPOSIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDeposit() <em>Deposit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeposit()
	 * @generated
	 * @ordered
	 */
	protected float deposit = DEPOSIT_EDEFAULT;

	/**
	 * This is true if the Deposit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean depositESet;

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
	 * The default value of the '{@link #getCostEstimate() <em>Cost Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostEstimate()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_ESTIMATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCostEstimate() <em>Cost Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostEstimate()
	 * @generated
	 * @ordered
	 */
	protected float costEstimate = COST_ESTIMATE_EDEFAULT;

	/**
	 * This is true if the Cost Estimate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean costEstimateESet;

	/**
	 * The cached value of the '{@link #getErpLineItems() <em>Erp Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpInvoiceLineItem> erpLineItems;

	/**
	 * The default value of the '{@link #getDiscount() <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected static final float DISCOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDiscount() <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected float discount = DISCOUNT_EDEFAULT;

	/**
	 * This is true if the Discount attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean discountESet;

	/**
	 * The default value of the '{@link #getDueDateTime() <em>Due Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DUE_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDueDateTime() <em>Due Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date dueDateTime = DUE_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Due Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dueDateTimeESet;

	/**
	 * The default value of the '{@link #getReceivedDateTime() <em>Received Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date RECEIVED_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceivedDateTime() <em>Received Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date receivedDateTime = RECEIVED_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Received Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean receivedDateTimeESet;

	/**
	 * The default value of the '{@link #getWorkPrice() <em>Work Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float WORK_PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWorkPrice() <em>Work Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkPrice()
	 * @generated
	 * @ordered
	 */
	protected float workPrice = WORK_PRICE_EDEFAULT;

	/**
	 * This is true if the Work Price attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean workPriceESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkBillingInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCustomersPackage.Literals.WORK_BILLING_INFO;
	}

	/**
	 * Returns the value of the '<em><b>Works</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Work.Work}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Work.Work#getWorkBillingInfo <em>Work Billing Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Works</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Works</em>' reference list.
	 * @see CIM15.IEC61968.Work.Work#getWorkBillingInfo
	 * @generated
	 */
	public EList<Work> getWorks() {
		if (works == null) {
			works = new BasicInternalEList<Work>(Work.class);
		}
		return works;
	}

	/**
	 * Returns the value of the '<em><b>Issue Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Date Time</em>' attribute.
	 * @see #isSetIssueDateTime()
	 * @see #unsetIssueDateTime()
	 * @see #setIssueDateTime(Date)
	 * @generated
	 */
	public Date getIssueDateTime() {
		return issueDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getIssueDateTime <em>Issue Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Date Time</em>' attribute.
	 * @see #isSetIssueDateTime()
	 * @see #unsetIssueDateTime()
	 * @see #getIssueDateTime()
	 * @generated
	 */
	public void setIssueDateTime(Date newIssueDateTime) {
		issueDateTime = newIssueDateTime;
		issueDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getIssueDateTime <em>Issue Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIssueDateTime()
	 * @see #getIssueDateTime()
	 * @see #setIssueDateTime(Date)
	 * @generated
	 */
	public void unsetIssueDateTime() {
		issueDateTime = ISSUE_DATE_TIME_EDEFAULT;
		issueDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getIssueDateTime <em>Issue Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Issue Date Time</em>' attribute is set.
	 * @see #unsetIssueDateTime()
	 * @see #getIssueDateTime()
	 * @see #setIssueDateTime(Date)
	 * @generated
	 */
	public boolean isSetIssueDateTime() {
		return issueDateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Deposit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deposit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deposit</em>' attribute.
	 * @see #isSetDeposit()
	 * @see #unsetDeposit()
	 * @see #setDeposit(float)
	 * @generated
	 */
	public float getDeposit() {
		return deposit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getDeposit <em>Deposit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deposit</em>' attribute.
	 * @see #isSetDeposit()
	 * @see #unsetDeposit()
	 * @see #getDeposit()
	 * @generated
	 */
	public void setDeposit(float newDeposit) {
		deposit = newDeposit;
		depositESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getDeposit <em>Deposit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeposit()
	 * @see #getDeposit()
	 * @see #setDeposit(float)
	 * @generated
	 */
	public void unsetDeposit() {
		deposit = DEPOSIT_EDEFAULT;
		depositESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getDeposit <em>Deposit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Deposit</em>' attribute is set.
	 * @see #unsetDeposit()
	 * @see #getDeposit()
	 * @see #setDeposit(float)
	 * @generated
	 */
	public boolean isSetDeposit() {
		return depositESet;
	}

	/**
	 * Returns the value of the '<em><b>Customer Account</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.CustomerAccount#getWorkBillingInfos <em>Work Billing Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Account</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Account</em>' reference.
	 * @see #setCustomerAccount(CustomerAccount)
	 * @see CIM15.IEC61968.Customers.CustomerAccount#getWorkBillingInfos
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getCustomerAccount <em>Customer Account</em>}' reference.
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
				msgs = ((InternalEObject)customerAccount).eInverseRemove(this, CustomersPackage.CUSTOMER_ACCOUNT__WORK_BILLING_INFOS, CustomerAccount.class, msgs);
			if (newCustomerAccount != null)
				msgs = ((InternalEObject)newCustomerAccount).eInverseAdd(this, CustomersPackage.CUSTOMER_ACCOUNT__WORK_BILLING_INFOS, CustomerAccount.class, msgs);
			msgs = basicSetCustomerAccount(newCustomerAccount, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Cost Estimate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Estimate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Estimate</em>' attribute.
	 * @see #isSetCostEstimate()
	 * @see #unsetCostEstimate()
	 * @see #setCostEstimate(float)
	 * @generated
	 */
	public float getCostEstimate() {
		return costEstimate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getCostEstimate <em>Cost Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Estimate</em>' attribute.
	 * @see #isSetCostEstimate()
	 * @see #unsetCostEstimate()
	 * @see #getCostEstimate()
	 * @generated
	 */
	public void setCostEstimate(float newCostEstimate) {
		costEstimate = newCostEstimate;
		costEstimateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getCostEstimate <em>Cost Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCostEstimate()
	 * @see #getCostEstimate()
	 * @see #setCostEstimate(float)
	 * @generated
	 */
	public void unsetCostEstimate() {
		costEstimate = COST_ESTIMATE_EDEFAULT;
		costEstimateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getCostEstimate <em>Cost Estimate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cost Estimate</em>' attribute is set.
	 * @see #unsetCostEstimate()
	 * @see #getCostEstimate()
	 * @see #setCostEstimate(float)
	 * @generated
	 */
	public boolean isSetCostEstimate() {
		return costEstimateESet;
	}

	/**
	 * Returns the value of the '<em><b>Erp Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getWorkBillingInfos <em>Work Billing Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Line Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getWorkBillingInfos
	 * @generated
	 */
	public EList<ErpInvoiceLineItem> getErpLineItems() {
		if (erpLineItems == null) {
			erpLineItems = new BasicInternalEList<ErpInvoiceLineItem>(ErpInvoiceLineItem.class);
		}
		return erpLineItems;
	}

	/**
	 * Returns the value of the '<em><b>Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount</em>' attribute.
	 * @see #isSetDiscount()
	 * @see #unsetDiscount()
	 * @see #setDiscount(float)
	 * @generated
	 */
	public float getDiscount() {
		return discount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getDiscount <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount</em>' attribute.
	 * @see #isSetDiscount()
	 * @see #unsetDiscount()
	 * @see #getDiscount()
	 * @generated
	 */
	public void setDiscount(float newDiscount) {
		discount = newDiscount;
		discountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getDiscount <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiscount()
	 * @see #getDiscount()
	 * @see #setDiscount(float)
	 * @generated
	 */
	public void unsetDiscount() {
		discount = DISCOUNT_EDEFAULT;
		discountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getDiscount <em>Discount</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Discount</em>' attribute is set.
	 * @see #unsetDiscount()
	 * @see #getDiscount()
	 * @see #setDiscount(float)
	 * @generated
	 */
	public boolean isSetDiscount() {
		return discountESet;
	}

	/**
	 * Returns the value of the '<em><b>Due Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Due Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date Time</em>' attribute.
	 * @see #isSetDueDateTime()
	 * @see #unsetDueDateTime()
	 * @see #setDueDateTime(Date)
	 * @generated
	 */
	public Date getDueDateTime() {
		return dueDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getDueDateTime <em>Due Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date Time</em>' attribute.
	 * @see #isSetDueDateTime()
	 * @see #unsetDueDateTime()
	 * @see #getDueDateTime()
	 * @generated
	 */
	public void setDueDateTime(Date newDueDateTime) {
		dueDateTime = newDueDateTime;
		dueDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getDueDateTime <em>Due Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDueDateTime()
	 * @see #getDueDateTime()
	 * @see #setDueDateTime(Date)
	 * @generated
	 */
	public void unsetDueDateTime() {
		dueDateTime = DUE_DATE_TIME_EDEFAULT;
		dueDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getDueDateTime <em>Due Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Due Date Time</em>' attribute is set.
	 * @see #unsetDueDateTime()
	 * @see #getDueDateTime()
	 * @see #setDueDateTime(Date)
	 * @generated
	 */
	public boolean isSetDueDateTime() {
		return dueDateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Received Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received Date Time</em>' attribute.
	 * @see #isSetReceivedDateTime()
	 * @see #unsetReceivedDateTime()
	 * @see #setReceivedDateTime(Date)
	 * @generated
	 */
	public Date getReceivedDateTime() {
		return receivedDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getReceivedDateTime <em>Received Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received Date Time</em>' attribute.
	 * @see #isSetReceivedDateTime()
	 * @see #unsetReceivedDateTime()
	 * @see #getReceivedDateTime()
	 * @generated
	 */
	public void setReceivedDateTime(Date newReceivedDateTime) {
		receivedDateTime = newReceivedDateTime;
		receivedDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getReceivedDateTime <em>Received Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReceivedDateTime()
	 * @see #getReceivedDateTime()
	 * @see #setReceivedDateTime(Date)
	 * @generated
	 */
	public void unsetReceivedDateTime() {
		receivedDateTime = RECEIVED_DATE_TIME_EDEFAULT;
		receivedDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getReceivedDateTime <em>Received Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Received Date Time</em>' attribute is set.
	 * @see #unsetReceivedDateTime()
	 * @see #getReceivedDateTime()
	 * @see #setReceivedDateTime(Date)
	 * @generated
	 */
	public boolean isSetReceivedDateTime() {
		return receivedDateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Work Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Price</em>' attribute.
	 * @see #isSetWorkPrice()
	 * @see #unsetWorkPrice()
	 * @see #setWorkPrice(float)
	 * @generated
	 */
	public float getWorkPrice() {
		return workPrice;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getWorkPrice <em>Work Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Price</em>' attribute.
	 * @see #isSetWorkPrice()
	 * @see #unsetWorkPrice()
	 * @see #getWorkPrice()
	 * @generated
	 */
	public void setWorkPrice(float newWorkPrice) {
		workPrice = newWorkPrice;
		workPriceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getWorkPrice <em>Work Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorkPrice()
	 * @see #getWorkPrice()
	 * @see #setWorkPrice(float)
	 * @generated
	 */
	public void unsetWorkPrice() {
		workPrice = WORK_PRICE_EDEFAULT;
		workPriceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getWorkPrice <em>Work Price</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Work Price</em>' attribute is set.
	 * @see #unsetWorkPrice()
	 * @see #getWorkPrice()
	 * @see #setWorkPrice(float)
	 * @generated
	 */
	public boolean isSetWorkPrice() {
		return workPriceESet;
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
			case InfCustomersPackage.WORK_BILLING_INFO__WORKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorks()).basicAdd(otherEnd, msgs);
			case InfCustomersPackage.WORK_BILLING_INFO__CUSTOMER_ACCOUNT:
				if (customerAccount != null)
					msgs = ((InternalEObject)customerAccount).eInverseRemove(this, CustomersPackage.CUSTOMER_ACCOUNT__WORK_BILLING_INFOS, CustomerAccount.class, msgs);
				return basicSetCustomerAccount((CustomerAccount)otherEnd, msgs);
			case InfCustomersPackage.WORK_BILLING_INFO__ERP_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpLineItems()).basicAdd(otherEnd, msgs);
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
			case InfCustomersPackage.WORK_BILLING_INFO__WORKS:
				return ((InternalEList<?>)getWorks()).basicRemove(otherEnd, msgs);
			case InfCustomersPackage.WORK_BILLING_INFO__CUSTOMER_ACCOUNT:
				return basicSetCustomerAccount(null, msgs);
			case InfCustomersPackage.WORK_BILLING_INFO__ERP_LINE_ITEMS:
				return ((InternalEList<?>)getErpLineItems()).basicRemove(otherEnd, msgs);
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
			case InfCustomersPackage.WORK_BILLING_INFO__WORKS:
				return getWorks();
			case InfCustomersPackage.WORK_BILLING_INFO__ISSUE_DATE_TIME:
				return getIssueDateTime();
			case InfCustomersPackage.WORK_BILLING_INFO__DEPOSIT:
				return getDeposit();
			case InfCustomersPackage.WORK_BILLING_INFO__CUSTOMER_ACCOUNT:
				if (resolve) return getCustomerAccount();
				return basicGetCustomerAccount();
			case InfCustomersPackage.WORK_BILLING_INFO__COST_ESTIMATE:
				return getCostEstimate();
			case InfCustomersPackage.WORK_BILLING_INFO__ERP_LINE_ITEMS:
				return getErpLineItems();
			case InfCustomersPackage.WORK_BILLING_INFO__DISCOUNT:
				return getDiscount();
			case InfCustomersPackage.WORK_BILLING_INFO__DUE_DATE_TIME:
				return getDueDateTime();
			case InfCustomersPackage.WORK_BILLING_INFO__RECEIVED_DATE_TIME:
				return getReceivedDateTime();
			case InfCustomersPackage.WORK_BILLING_INFO__WORK_PRICE:
				return getWorkPrice();
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
			case InfCustomersPackage.WORK_BILLING_INFO__WORKS:
				getWorks().clear();
				getWorks().addAll((Collection<? extends Work>)newValue);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__ISSUE_DATE_TIME:
				setIssueDateTime((Date)newValue);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__DEPOSIT:
				setDeposit((Float)newValue);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__CUSTOMER_ACCOUNT:
				setCustomerAccount((CustomerAccount)newValue);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__COST_ESTIMATE:
				setCostEstimate((Float)newValue);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__ERP_LINE_ITEMS:
				getErpLineItems().clear();
				getErpLineItems().addAll((Collection<? extends ErpInvoiceLineItem>)newValue);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__DISCOUNT:
				setDiscount((Float)newValue);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__DUE_DATE_TIME:
				setDueDateTime((Date)newValue);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__RECEIVED_DATE_TIME:
				setReceivedDateTime((Date)newValue);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__WORK_PRICE:
				setWorkPrice((Float)newValue);
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
			case InfCustomersPackage.WORK_BILLING_INFO__WORKS:
				getWorks().clear();
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__ISSUE_DATE_TIME:
				unsetIssueDateTime();
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__DEPOSIT:
				unsetDeposit();
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__CUSTOMER_ACCOUNT:
				setCustomerAccount((CustomerAccount)null);
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__COST_ESTIMATE:
				unsetCostEstimate();
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__ERP_LINE_ITEMS:
				getErpLineItems().clear();
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__DISCOUNT:
				unsetDiscount();
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__DUE_DATE_TIME:
				unsetDueDateTime();
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__RECEIVED_DATE_TIME:
				unsetReceivedDateTime();
				return;
			case InfCustomersPackage.WORK_BILLING_INFO__WORK_PRICE:
				unsetWorkPrice();
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
			case InfCustomersPackage.WORK_BILLING_INFO__WORKS:
				return works != null && !works.isEmpty();
			case InfCustomersPackage.WORK_BILLING_INFO__ISSUE_DATE_TIME:
				return isSetIssueDateTime();
			case InfCustomersPackage.WORK_BILLING_INFO__DEPOSIT:
				return isSetDeposit();
			case InfCustomersPackage.WORK_BILLING_INFO__CUSTOMER_ACCOUNT:
				return customerAccount != null;
			case InfCustomersPackage.WORK_BILLING_INFO__COST_ESTIMATE:
				return isSetCostEstimate();
			case InfCustomersPackage.WORK_BILLING_INFO__ERP_LINE_ITEMS:
				return erpLineItems != null && !erpLineItems.isEmpty();
			case InfCustomersPackage.WORK_BILLING_INFO__DISCOUNT:
				return isSetDiscount();
			case InfCustomersPackage.WORK_BILLING_INFO__DUE_DATE_TIME:
				return isSetDueDateTime();
			case InfCustomersPackage.WORK_BILLING_INFO__RECEIVED_DATE_TIME:
				return isSetReceivedDateTime();
			case InfCustomersPackage.WORK_BILLING_INFO__WORK_PRICE:
				return isSetWorkPrice();
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
		result.append(" (issueDateTime: ");
		if (issueDateTimeESet) result.append(issueDateTime); else result.append("<unset>");
		result.append(", deposit: ");
		if (depositESet) result.append(deposit); else result.append("<unset>");
		result.append(", costEstimate: ");
		if (costEstimateESet) result.append(costEstimate); else result.append("<unset>");
		result.append(", discount: ");
		if (discountESet) result.append(discount); else result.append("<unset>");
		result.append(", dueDateTime: ");
		if (dueDateTimeESet) result.append(dueDateTime); else result.append("<unset>");
		result.append(", receivedDateTime: ");
		if (receivedDateTimeESet) result.append(receivedDateTime); else result.append("<unset>");
		result.append(", workPrice: ");
		if (workPriceESet) result.append(workPrice); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // WorkBillingInfo
