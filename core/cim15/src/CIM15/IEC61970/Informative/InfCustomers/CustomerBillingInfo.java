/**
 */
package CIM15.IEC61970.Informative.InfCustomers;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61968.Customers.CustomerAccount;
import CIM15.IEC61968.Customers.CustomersPackage;

import CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Billing Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getPymtPlanType <em>Pymt Plan Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getPymtPlanAmt <em>Pymt Plan Amt</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getLastPaymentAmt <em>Last Payment Amt</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getOutBalance <em>Out Balance</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getLastPaymentDate <em>Last Payment Date</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getBillingDate <em>Billing Date</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getCustomerAccount <em>Customer Account</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerBillingInfo extends Document {
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
	 * The default value of the '{@link #getPymtPlanType() <em>Pymt Plan Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPymtPlanType()
	 * @generated
	 * @ordered
	 */
	protected static final String PYMT_PLAN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPymtPlanType() <em>Pymt Plan Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPymtPlanType()
	 * @generated
	 * @ordered
	 */
	protected String pymtPlanType = PYMT_PLAN_TYPE_EDEFAULT;

	/**
	 * This is true if the Pymt Plan Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pymtPlanTypeESet;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final CustomerBillingKind KIND_EDEFAULT = CustomerBillingKind.CONSOLIDATED_UDC;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected CustomerBillingKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The default value of the '{@link #getPymtPlanAmt() <em>Pymt Plan Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPymtPlanAmt()
	 * @generated
	 * @ordered
	 */
	protected static final float PYMT_PLAN_AMT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPymtPlanAmt() <em>Pymt Plan Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPymtPlanAmt()
	 * @generated
	 * @ordered
	 */
	protected float pymtPlanAmt = PYMT_PLAN_AMT_EDEFAULT;

	/**
	 * This is true if the Pymt Plan Amt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pymtPlanAmtESet;

	/**
	 * The default value of the '{@link #getLastPaymentAmt() <em>Last Payment Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPaymentAmt()
	 * @generated
	 * @ordered
	 */
	protected static final float LAST_PAYMENT_AMT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLastPaymentAmt() <em>Last Payment Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPaymentAmt()
	 * @generated
	 * @ordered
	 */
	protected float lastPaymentAmt = LAST_PAYMENT_AMT_EDEFAULT;

	/**
	 * This is true if the Last Payment Amt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lastPaymentAmtESet;

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
	 * The default value of the '{@link #getOutBalance() <em>Out Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutBalance()
	 * @generated
	 * @ordered
	 */
	protected static final float OUT_BALANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOutBalance() <em>Out Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutBalance()
	 * @generated
	 * @ordered
	 */
	protected float outBalance = OUT_BALANCE_EDEFAULT;

	/**
	 * This is true if the Out Balance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean outBalanceESet;

	/**
	 * The default value of the '{@link #getLastPaymentDate() <em>Last Payment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPaymentDate()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_PAYMENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastPaymentDate() <em>Last Payment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPaymentDate()
	 * @generated
	 * @ordered
	 */
	protected String lastPaymentDate = LAST_PAYMENT_DATE_EDEFAULT;

	/**
	 * This is true if the Last Payment Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lastPaymentDateESet;

	/**
	 * The default value of the '{@link #getBillingDate() <em>Billing Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingDate()
	 * @generated
	 * @ordered
	 */
	protected static final String BILLING_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBillingDate() <em>Billing Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingDate()
	 * @generated
	 * @ordered
	 */
	protected String billingDate = BILLING_DATE_EDEFAULT;

	/**
	 * This is true if the Billing Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean billingDateESet;

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
	protected CustomerBillingInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCustomersPackage.Literals.CUSTOMER_BILLING_INFO;
	}

	/**
	 * Returns the value of the '<em><b>Erp Invoice Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getCustomerBillingInfos <em>Customer Billing Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Invoice Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Invoice Line Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getCustomerBillingInfos
	 * @generated
	 */
	public EList<ErpInvoiceLineItem> getErpInvoiceLineItems() {
		if (erpInvoiceLineItems == null) {
			erpInvoiceLineItems = new BasicInternalEList<ErpInvoiceLineItem>(ErpInvoiceLineItem.class);
		}
		return erpInvoiceLineItems;
	}

	/**
	 * Returns the value of the '<em><b>Pymt Plan Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pymt Plan Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pymt Plan Type</em>' attribute.
	 * @see #isSetPymtPlanType()
	 * @see #unsetPymtPlanType()
	 * @see #setPymtPlanType(String)
	 * @generated
	 */
	public String getPymtPlanType() {
		return pymtPlanType;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getPymtPlanType <em>Pymt Plan Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pymt Plan Type</em>' attribute.
	 * @see #isSetPymtPlanType()
	 * @see #unsetPymtPlanType()
	 * @see #getPymtPlanType()
	 * @generated
	 */
	public void setPymtPlanType(String newPymtPlanType) {
		pymtPlanType = newPymtPlanType;
		pymtPlanTypeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getPymtPlanType <em>Pymt Plan Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPymtPlanType()
	 * @see #getPymtPlanType()
	 * @see #setPymtPlanType(String)
	 * @generated
	 */
	public void unsetPymtPlanType() {
		pymtPlanType = PYMT_PLAN_TYPE_EDEFAULT;
		pymtPlanTypeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getPymtPlanType <em>Pymt Plan Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pymt Plan Type</em>' attribute is set.
	 * @see #unsetPymtPlanType()
	 * @see #getPymtPlanType()
	 * @see #setPymtPlanType(String)
	 * @generated
	 */
	public boolean isSetPymtPlanType() {
		return pymtPlanTypeESet;
	}

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfCustomers.CustomerBillingKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(CustomerBillingKind)
	 * @generated
	 */
	public CustomerBillingKind getKind() {
		return kind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfCustomers.CustomerBillingKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	public void setKind(CustomerBillingKind newKind) {
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		kindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(CustomerBillingKind)
	 * @generated
	 */
	public void unsetKind() {
		kind = KIND_EDEFAULT;
		kindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(CustomerBillingKind)
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * Returns the value of the '<em><b>Pymt Plan Amt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pymt Plan Amt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pymt Plan Amt</em>' attribute.
	 * @see #isSetPymtPlanAmt()
	 * @see #unsetPymtPlanAmt()
	 * @see #setPymtPlanAmt(float)
	 * @generated
	 */
	public float getPymtPlanAmt() {
		return pymtPlanAmt;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getPymtPlanAmt <em>Pymt Plan Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pymt Plan Amt</em>' attribute.
	 * @see #isSetPymtPlanAmt()
	 * @see #unsetPymtPlanAmt()
	 * @see #getPymtPlanAmt()
	 * @generated
	 */
	public void setPymtPlanAmt(float newPymtPlanAmt) {
		pymtPlanAmt = newPymtPlanAmt;
		pymtPlanAmtESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getPymtPlanAmt <em>Pymt Plan Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPymtPlanAmt()
	 * @see #getPymtPlanAmt()
	 * @see #setPymtPlanAmt(float)
	 * @generated
	 */
	public void unsetPymtPlanAmt() {
		pymtPlanAmt = PYMT_PLAN_AMT_EDEFAULT;
		pymtPlanAmtESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getPymtPlanAmt <em>Pymt Plan Amt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pymt Plan Amt</em>' attribute is set.
	 * @see #unsetPymtPlanAmt()
	 * @see #getPymtPlanAmt()
	 * @see #setPymtPlanAmt(float)
	 * @generated
	 */
	public boolean isSetPymtPlanAmt() {
		return pymtPlanAmtESet;
	}

	/**
	 * Returns the value of the '<em><b>Last Payment Amt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Payment Amt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Payment Amt</em>' attribute.
	 * @see #isSetLastPaymentAmt()
	 * @see #unsetLastPaymentAmt()
	 * @see #setLastPaymentAmt(float)
	 * @generated
	 */
	public float getLastPaymentAmt() {
		return lastPaymentAmt;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getLastPaymentAmt <em>Last Payment Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Payment Amt</em>' attribute.
	 * @see #isSetLastPaymentAmt()
	 * @see #unsetLastPaymentAmt()
	 * @see #getLastPaymentAmt()
	 * @generated
	 */
	public void setLastPaymentAmt(float newLastPaymentAmt) {
		lastPaymentAmt = newLastPaymentAmt;
		lastPaymentAmtESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getLastPaymentAmt <em>Last Payment Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastPaymentAmt()
	 * @see #getLastPaymentAmt()
	 * @see #setLastPaymentAmt(float)
	 * @generated
	 */
	public void unsetLastPaymentAmt() {
		lastPaymentAmt = LAST_PAYMENT_AMT_EDEFAULT;
		lastPaymentAmtESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getLastPaymentAmt <em>Last Payment Amt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Payment Amt</em>' attribute is set.
	 * @see #unsetLastPaymentAmt()
	 * @see #getLastPaymentAmt()
	 * @see #setLastPaymentAmt(float)
	 * @generated
	 */
	public boolean isSetLastPaymentAmt() {
		return lastPaymentAmtESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getDueDate <em>Due Date</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getDueDate <em>Due Date</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getDueDate <em>Due Date</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Out Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Balance</em>' attribute.
	 * @see #isSetOutBalance()
	 * @see #unsetOutBalance()
	 * @see #setOutBalance(float)
	 * @generated
	 */
	public float getOutBalance() {
		return outBalance;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getOutBalance <em>Out Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Balance</em>' attribute.
	 * @see #isSetOutBalance()
	 * @see #unsetOutBalance()
	 * @see #getOutBalance()
	 * @generated
	 */
	public void setOutBalance(float newOutBalance) {
		outBalance = newOutBalance;
		outBalanceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getOutBalance <em>Out Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOutBalance()
	 * @see #getOutBalance()
	 * @see #setOutBalance(float)
	 * @generated
	 */
	public void unsetOutBalance() {
		outBalance = OUT_BALANCE_EDEFAULT;
		outBalanceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getOutBalance <em>Out Balance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Out Balance</em>' attribute is set.
	 * @see #unsetOutBalance()
	 * @see #getOutBalance()
	 * @see #setOutBalance(float)
	 * @generated
	 */
	public boolean isSetOutBalance() {
		return outBalanceESet;
	}

	/**
	 * Returns the value of the '<em><b>Last Payment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Payment Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Payment Date</em>' attribute.
	 * @see #isSetLastPaymentDate()
	 * @see #unsetLastPaymentDate()
	 * @see #setLastPaymentDate(String)
	 * @generated
	 */
	public String getLastPaymentDate() {
		return lastPaymentDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getLastPaymentDate <em>Last Payment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Payment Date</em>' attribute.
	 * @see #isSetLastPaymentDate()
	 * @see #unsetLastPaymentDate()
	 * @see #getLastPaymentDate()
	 * @generated
	 */
	public void setLastPaymentDate(String newLastPaymentDate) {
		lastPaymentDate = newLastPaymentDate;
		lastPaymentDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getLastPaymentDate <em>Last Payment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastPaymentDate()
	 * @see #getLastPaymentDate()
	 * @see #setLastPaymentDate(String)
	 * @generated
	 */
	public void unsetLastPaymentDate() {
		lastPaymentDate = LAST_PAYMENT_DATE_EDEFAULT;
		lastPaymentDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getLastPaymentDate <em>Last Payment Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Payment Date</em>' attribute is set.
	 * @see #unsetLastPaymentDate()
	 * @see #getLastPaymentDate()
	 * @see #setLastPaymentDate(String)
	 * @generated
	 */
	public boolean isSetLastPaymentDate() {
		return lastPaymentDateESet;
	}

	/**
	 * Returns the value of the '<em><b>Billing Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Date</em>' attribute.
	 * @see #isSetBillingDate()
	 * @see #unsetBillingDate()
	 * @see #setBillingDate(String)
	 * @generated
	 */
	public String getBillingDate() {
		return billingDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getBillingDate <em>Billing Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Date</em>' attribute.
	 * @see #isSetBillingDate()
	 * @see #unsetBillingDate()
	 * @see #getBillingDate()
	 * @generated
	 */
	public void setBillingDate(String newBillingDate) {
		billingDate = newBillingDate;
		billingDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getBillingDate <em>Billing Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBillingDate()
	 * @see #getBillingDate()
	 * @see #setBillingDate(String)
	 * @generated
	 */
	public void unsetBillingDate() {
		billingDate = BILLING_DATE_EDEFAULT;
		billingDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getBillingDate <em>Billing Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Billing Date</em>' attribute is set.
	 * @see #unsetBillingDate()
	 * @see #getBillingDate()
	 * @see #setBillingDate(String)
	 * @generated
	 */
	public boolean isSetBillingDate() {
		return billingDateESet;
	}

	/**
	 * Returns the value of the '<em><b>Customer Account</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.CustomerAccount#getCustomerBillingInfos <em>Customer Billing Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Account</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Account</em>' reference.
	 * @see #setCustomerAccount(CustomerAccount)
	 * @see CIM15.IEC61968.Customers.CustomerAccount#getCustomerBillingInfos
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getCustomerAccount <em>Customer Account</em>}' reference.
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
				msgs = ((InternalEObject)customerAccount).eInverseRemove(this, CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_BILLING_INFOS, CustomerAccount.class, msgs);
			if (newCustomerAccount != null)
				msgs = ((InternalEObject)newCustomerAccount).eInverseAdd(this, CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_BILLING_INFOS, CustomerAccount.class, msgs);
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
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__ERP_INVOICE_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpInvoiceLineItems()).basicAdd(otherEnd, msgs);
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__CUSTOMER_ACCOUNT:
				if (customerAccount != null)
					msgs = ((InternalEObject)customerAccount).eInverseRemove(this, CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_BILLING_INFOS, CustomerAccount.class, msgs);
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
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__ERP_INVOICE_LINE_ITEMS:
				return ((InternalEList<?>)getErpInvoiceLineItems()).basicRemove(otherEnd, msgs);
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__CUSTOMER_ACCOUNT:
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
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__ERP_INVOICE_LINE_ITEMS:
				return getErpInvoiceLineItems();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__PYMT_PLAN_TYPE:
				return getPymtPlanType();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__KIND:
				return getKind();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__PYMT_PLAN_AMT:
				return getPymtPlanAmt();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__LAST_PAYMENT_AMT:
				return getLastPaymentAmt();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__DUE_DATE:
				return getDueDate();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__OUT_BALANCE:
				return getOutBalance();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__LAST_PAYMENT_DATE:
				return getLastPaymentDate();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__BILLING_DATE:
				return getBillingDate();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__CUSTOMER_ACCOUNT:
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
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__ERP_INVOICE_LINE_ITEMS:
				getErpInvoiceLineItems().clear();
				getErpInvoiceLineItems().addAll((Collection<? extends ErpInvoiceLineItem>)newValue);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__PYMT_PLAN_TYPE:
				setPymtPlanType((String)newValue);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__KIND:
				setKind((CustomerBillingKind)newValue);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__PYMT_PLAN_AMT:
				setPymtPlanAmt((Float)newValue);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__LAST_PAYMENT_AMT:
				setLastPaymentAmt((Float)newValue);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__DUE_DATE:
				setDueDate((String)newValue);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__OUT_BALANCE:
				setOutBalance((Float)newValue);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__LAST_PAYMENT_DATE:
				setLastPaymentDate((String)newValue);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__BILLING_DATE:
				setBillingDate((String)newValue);
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__CUSTOMER_ACCOUNT:
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
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__ERP_INVOICE_LINE_ITEMS:
				getErpInvoiceLineItems().clear();
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__PYMT_PLAN_TYPE:
				unsetPymtPlanType();
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__KIND:
				unsetKind();
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__PYMT_PLAN_AMT:
				unsetPymtPlanAmt();
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__LAST_PAYMENT_AMT:
				unsetLastPaymentAmt();
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__DUE_DATE:
				unsetDueDate();
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__OUT_BALANCE:
				unsetOutBalance();
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__LAST_PAYMENT_DATE:
				unsetLastPaymentDate();
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__BILLING_DATE:
				unsetBillingDate();
				return;
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__CUSTOMER_ACCOUNT:
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
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__ERP_INVOICE_LINE_ITEMS:
				return erpInvoiceLineItems != null && !erpInvoiceLineItems.isEmpty();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__PYMT_PLAN_TYPE:
				return isSetPymtPlanType();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__KIND:
				return isSetKind();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__PYMT_PLAN_AMT:
				return isSetPymtPlanAmt();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__LAST_PAYMENT_AMT:
				return isSetLastPaymentAmt();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__DUE_DATE:
				return isSetDueDate();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__OUT_BALANCE:
				return isSetOutBalance();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__LAST_PAYMENT_DATE:
				return isSetLastPaymentDate();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__BILLING_DATE:
				return isSetBillingDate();
			case InfCustomersPackage.CUSTOMER_BILLING_INFO__CUSTOMER_ACCOUNT:
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
		result.append(" (pymtPlanType: ");
		if (pymtPlanTypeESet) result.append(pymtPlanType); else result.append("<unset>");
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(", pymtPlanAmt: ");
		if (pymtPlanAmtESet) result.append(pymtPlanAmt); else result.append("<unset>");
		result.append(", lastPaymentAmt: ");
		if (lastPaymentAmtESet) result.append(lastPaymentAmt); else result.append("<unset>");
		result.append(", dueDate: ");
		if (dueDateESet) result.append(dueDate); else result.append("<unset>");
		result.append(", outBalance: ");
		if (outBalanceESet) result.append(outBalance); else result.append("<unset>");
		result.append(", lastPaymentDate: ");
		if (lastPaymentDateESet) result.append(lastPaymentDate); else result.append("<unset>");
		result.append(", billingDate: ");
		if (billingDateESet) result.append(billingDate); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // CustomerBillingInfo
