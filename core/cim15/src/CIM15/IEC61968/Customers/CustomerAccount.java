/**
 */
package CIM15.IEC61968.Customers;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61968.PaymentMetering.Transaction;

import CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo;
import CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo;

import CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Customers.CustomerAccount#getWorkBillingInfos <em>Work Billing Infos</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.CustomerAccount#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.CustomerAccount#getErpInvoicees <em>Erp Invoicees</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.CustomerAccount#getPaymentTransactions <em>Payment Transactions</em>}</li>
 *   <li>{@link CIM15.IEC61968.Customers.CustomerAccount#getCustomerBillingInfos <em>Customer Billing Infos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerAccount extends Document {
	/**
	 * The cached value of the '{@link #getWorkBillingInfos() <em>Work Billing Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkBillingInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkBillingInfo> workBillingInfos;

	/**
	 * The cached value of the '{@link #getCustomerAgreements() <em>Customer Agreements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAgreements()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomerAgreement> customerAgreements;

	/**
	 * The cached value of the '{@link #getErpInvoicees() <em>Erp Invoicees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpInvoicees()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpInvoice> erpInvoicees;

	/**
	 * The cached value of the '{@link #getPaymentTransactions() <em>Payment Transactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentTransactions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transaction> paymentTransactions;

	/**
	 * The cached value of the '{@link #getCustomerBillingInfos() <em>Customer Billing Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerBillingInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomerBillingInfo> customerBillingInfos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerAccount() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomersPackage.Literals.CUSTOMER_ACCOUNT;
	}

	/**
	 * Returns the value of the '<em><b>Work Billing Infos</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getCustomerAccount <em>Customer Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Billing Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Billing Infos</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getCustomerAccount
	 * @generated
	 */
	public EList<WorkBillingInfo> getWorkBillingInfos() {
		if (workBillingInfos == null) {
			workBillingInfos = new BasicInternalEList<WorkBillingInfo>(WorkBillingInfo.class);
		}
		return workBillingInfos;
	}

	/**
	 * Returns the value of the '<em><b>Customer Agreements</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Customers.CustomerAgreement}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.CustomerAgreement#getCustomerAccount <em>Customer Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Agreements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Agreements</em>' reference list.
	 * @see CIM15.IEC61968.Customers.CustomerAgreement#getCustomerAccount
	 * @generated
	 */
	public EList<CustomerAgreement> getCustomerAgreements() {
		if (customerAgreements == null) {
			customerAgreements = new BasicInternalEList<CustomerAgreement>(CustomerAgreement.class);
		}
		return customerAgreements;
	}

	/**
	 * Returns the value of the '<em><b>Erp Invoicees</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getCustomerAccount <em>Customer Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Invoicees</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Invoicees</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getCustomerAccount
	 * @generated
	 */
	public EList<ErpInvoice> getErpInvoicees() {
		if (erpInvoicees == null) {
			erpInvoicees = new BasicInternalEList<ErpInvoice>(ErpInvoice.class);
		}
		return erpInvoicees;
	}

	/**
	 * Returns the value of the '<em><b>Payment Transactions</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.Transaction}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Transaction#getCustomerAccount <em>Customer Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Transactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Transactions</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.Transaction#getCustomerAccount
	 * @generated
	 */
	public EList<Transaction> getPaymentTransactions() {
		if (paymentTransactions == null) {
			paymentTransactions = new BasicInternalEList<Transaction>(Transaction.class);
		}
		return paymentTransactions;
	}

	/**
	 * Returns the value of the '<em><b>Customer Billing Infos</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getCustomerAccount <em>Customer Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Billing Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Billing Infos</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getCustomerAccount
	 * @generated
	 */
	public EList<CustomerBillingInfo> getCustomerBillingInfos() {
		if (customerBillingInfos == null) {
			customerBillingInfos = new BasicInternalEList<CustomerBillingInfo>(CustomerBillingInfo.class);
		}
		return customerBillingInfos;
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
			case CustomersPackage.CUSTOMER_ACCOUNT__WORK_BILLING_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkBillingInfos()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomerAgreements()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_ACCOUNT__ERP_INVOICEES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpInvoicees()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPaymentTransactions()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_BILLING_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomerBillingInfos()).basicAdd(otherEnd, msgs);
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
			case CustomersPackage.CUSTOMER_ACCOUNT__WORK_BILLING_INFOS:
				return ((InternalEList<?>)getWorkBillingInfos()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS:
				return ((InternalEList<?>)getCustomerAgreements()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_ACCOUNT__ERP_INVOICEES:
				return ((InternalEList<?>)getErpInvoicees()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS:
				return ((InternalEList<?>)getPaymentTransactions()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_BILLING_INFOS:
				return ((InternalEList<?>)getCustomerBillingInfos()).basicRemove(otherEnd, msgs);
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
			case CustomersPackage.CUSTOMER_ACCOUNT__WORK_BILLING_INFOS:
				return getWorkBillingInfos();
			case CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS:
				return getCustomerAgreements();
			case CustomersPackage.CUSTOMER_ACCOUNT__ERP_INVOICEES:
				return getErpInvoicees();
			case CustomersPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS:
				return getPaymentTransactions();
			case CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_BILLING_INFOS:
				return getCustomerBillingInfos();
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
			case CustomersPackage.CUSTOMER_ACCOUNT__WORK_BILLING_INFOS:
				getWorkBillingInfos().clear();
				getWorkBillingInfos().addAll((Collection<? extends WorkBillingInfo>)newValue);
				return;
			case CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				getCustomerAgreements().addAll((Collection<? extends CustomerAgreement>)newValue);
				return;
			case CustomersPackage.CUSTOMER_ACCOUNT__ERP_INVOICEES:
				getErpInvoicees().clear();
				getErpInvoicees().addAll((Collection<? extends ErpInvoice>)newValue);
				return;
			case CustomersPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS:
				getPaymentTransactions().clear();
				getPaymentTransactions().addAll((Collection<? extends Transaction>)newValue);
				return;
			case CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_BILLING_INFOS:
				getCustomerBillingInfos().clear();
				getCustomerBillingInfos().addAll((Collection<? extends CustomerBillingInfo>)newValue);
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
			case CustomersPackage.CUSTOMER_ACCOUNT__WORK_BILLING_INFOS:
				getWorkBillingInfos().clear();
				return;
			case CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				return;
			case CustomersPackage.CUSTOMER_ACCOUNT__ERP_INVOICEES:
				getErpInvoicees().clear();
				return;
			case CustomersPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS:
				getPaymentTransactions().clear();
				return;
			case CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_BILLING_INFOS:
				getCustomerBillingInfos().clear();
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
			case CustomersPackage.CUSTOMER_ACCOUNT__WORK_BILLING_INFOS:
				return workBillingInfos != null && !workBillingInfos.isEmpty();
			case CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_AGREEMENTS:
				return customerAgreements != null && !customerAgreements.isEmpty();
			case CustomersPackage.CUSTOMER_ACCOUNT__ERP_INVOICEES:
				return erpInvoicees != null && !erpInvoicees.isEmpty();
			case CustomersPackage.CUSTOMER_ACCOUNT__PAYMENT_TRANSACTIONS:
				return paymentTransactions != null && !paymentTransactions.isEmpty();
			case CustomersPackage.CUSTOMER_ACCOUNT__CUSTOMER_BILLING_INFOS:
				return customerBillingInfos != null && !customerBillingInfos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // CustomerAccount
