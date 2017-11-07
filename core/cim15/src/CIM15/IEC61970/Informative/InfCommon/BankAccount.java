/**
 */
package CIM15.IEC61970.Informative.InfCommon;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage;
import CIM15.IEC61968.PaymentMetering.ServiceSupplier;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bank Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.BankAccount#getServiceSupplier <em>Service Supplier</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.BankAccount#getBank <em>Bank</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.BankAccount#getAccountNumber <em>Account Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BankAccount extends Document {
	/**
	 * The cached value of the '{@link #getServiceSupplier() <em>Service Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceSupplier()
	 * @generated
	 * @ordered
	 */
	protected ServiceSupplier serviceSupplier;

	/**
	 * The cached value of the '{@link #getBank() <em>Bank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBank()
	 * @generated
	 * @ordered
	 */
	protected Bank bank;

	/**
	 * The default value of the '{@link #getAccountNumber() <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountNumber() <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountNumber()
	 * @generated
	 * @ordered
	 */
	protected String accountNumber = ACCOUNT_NUMBER_EDEFAULT;

	/**
	 * This is true if the Account Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accountNumberESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankAccount() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCommonPackage.Literals.BANK_ACCOUNT;
	}

	/**
	 * Returns the value of the '<em><b>Service Supplier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.ServiceSupplier#getBankAccounts <em>Bank Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Supplier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Supplier</em>' reference.
	 * @see #setServiceSupplier(ServiceSupplier)
	 * @see CIM15.IEC61968.PaymentMetering.ServiceSupplier#getBankAccounts
	 * @generated
	 */
	public ServiceSupplier getServiceSupplier() {
		if (serviceSupplier != null && serviceSupplier.eIsProxy()) {
			InternalEObject oldServiceSupplier = (InternalEObject)serviceSupplier;
			serviceSupplier = (ServiceSupplier)eResolveProxy(oldServiceSupplier);
			if (serviceSupplier != oldServiceSupplier) {
			}
		}
		return serviceSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceSupplier basicGetServiceSupplier() {
		return serviceSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceSupplier(ServiceSupplier newServiceSupplier, NotificationChain msgs) {
		ServiceSupplier oldServiceSupplier = serviceSupplier;
		serviceSupplier = newServiceSupplier;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.BankAccount#getServiceSupplier <em>Service Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Supplier</em>' reference.
	 * @see #getServiceSupplier()
	 * @generated
	 */
	public void setServiceSupplier(ServiceSupplier newServiceSupplier) {
		if (newServiceSupplier != serviceSupplier) {
			NotificationChain msgs = null;
			if (serviceSupplier != null)
				msgs = ((InternalEObject)serviceSupplier).eInverseRemove(this, PaymentMeteringPackage.SERVICE_SUPPLIER__BANK_ACCOUNTS, ServiceSupplier.class, msgs);
			if (newServiceSupplier != null)
				msgs = ((InternalEObject)newServiceSupplier).eInverseAdd(this, PaymentMeteringPackage.SERVICE_SUPPLIER__BANK_ACCOUNTS, ServiceSupplier.class, msgs);
			msgs = basicSetServiceSupplier(newServiceSupplier, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Bank</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCommon.Bank#getBankAccounts <em>Bank Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank</em>' reference.
	 * @see #setBank(Bank)
	 * @see CIM15.IEC61970.Informative.InfCommon.Bank#getBankAccounts
	 * @generated
	 */
	public Bank getBank() {
		if (bank != null && bank.eIsProxy()) {
			InternalEObject oldBank = (InternalEObject)bank;
			bank = (Bank)eResolveProxy(oldBank);
			if (bank != oldBank) {
			}
		}
		return bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bank basicGetBank() {
		return bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBank(Bank newBank, NotificationChain msgs) {
		Bank oldBank = bank;
		bank = newBank;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.BankAccount#getBank <em>Bank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank</em>' reference.
	 * @see #getBank()
	 * @generated
	 */
	public void setBank(Bank newBank) {
		if (newBank != bank) {
			NotificationChain msgs = null;
			if (bank != null)
				msgs = ((InternalEObject)bank).eInverseRemove(this, InfCommonPackage.BANK__BANK_ACCOUNTS, Bank.class, msgs);
			if (newBank != null)
				msgs = ((InternalEObject)newBank).eInverseAdd(this, InfCommonPackage.BANK__BANK_ACCOUNTS, Bank.class, msgs);
			msgs = basicSetBank(newBank, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Number</em>' attribute.
	 * @see #isSetAccountNumber()
	 * @see #unsetAccountNumber()
	 * @see #setAccountNumber(String)
	 * @generated
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.BankAccount#getAccountNumber <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Number</em>' attribute.
	 * @see #isSetAccountNumber()
	 * @see #unsetAccountNumber()
	 * @see #getAccountNumber()
	 * @generated
	 */
	public void setAccountNumber(String newAccountNumber) {
		accountNumber = newAccountNumber;
		accountNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.BankAccount#getAccountNumber <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccountNumber()
	 * @see #getAccountNumber()
	 * @see #setAccountNumber(String)
	 * @generated
	 */
	public void unsetAccountNumber() {
		accountNumber = ACCOUNT_NUMBER_EDEFAULT;
		accountNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCommon.BankAccount#getAccountNumber <em>Account Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Account Number</em>' attribute is set.
	 * @see #unsetAccountNumber()
	 * @see #getAccountNumber()
	 * @see #setAccountNumber(String)
	 * @generated
	 */
	public boolean isSetAccountNumber() {
		return accountNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfCommonPackage.BANK_ACCOUNT__SERVICE_SUPPLIER:
				if (serviceSupplier != null)
					msgs = ((InternalEObject)serviceSupplier).eInverseRemove(this, PaymentMeteringPackage.SERVICE_SUPPLIER__BANK_ACCOUNTS, ServiceSupplier.class, msgs);
				return basicSetServiceSupplier((ServiceSupplier)otherEnd, msgs);
			case InfCommonPackage.BANK_ACCOUNT__BANK:
				if (bank != null)
					msgs = ((InternalEObject)bank).eInverseRemove(this, InfCommonPackage.BANK__BANK_ACCOUNTS, Bank.class, msgs);
				return basicSetBank((Bank)otherEnd, msgs);
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
			case InfCommonPackage.BANK_ACCOUNT__SERVICE_SUPPLIER:
				return basicSetServiceSupplier(null, msgs);
			case InfCommonPackage.BANK_ACCOUNT__BANK:
				return basicSetBank(null, msgs);
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
			case InfCommonPackage.BANK_ACCOUNT__SERVICE_SUPPLIER:
				if (resolve) return getServiceSupplier();
				return basicGetServiceSupplier();
			case InfCommonPackage.BANK_ACCOUNT__BANK:
				if (resolve) return getBank();
				return basicGetBank();
			case InfCommonPackage.BANK_ACCOUNT__ACCOUNT_NUMBER:
				return getAccountNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfCommonPackage.BANK_ACCOUNT__SERVICE_SUPPLIER:
				setServiceSupplier((ServiceSupplier)newValue);
				return;
			case InfCommonPackage.BANK_ACCOUNT__BANK:
				setBank((Bank)newValue);
				return;
			case InfCommonPackage.BANK_ACCOUNT__ACCOUNT_NUMBER:
				setAccountNumber((String)newValue);
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
			case InfCommonPackage.BANK_ACCOUNT__SERVICE_SUPPLIER:
				setServiceSupplier((ServiceSupplier)null);
				return;
			case InfCommonPackage.BANK_ACCOUNT__BANK:
				setBank((Bank)null);
				return;
			case InfCommonPackage.BANK_ACCOUNT__ACCOUNT_NUMBER:
				unsetAccountNumber();
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
			case InfCommonPackage.BANK_ACCOUNT__SERVICE_SUPPLIER:
				return serviceSupplier != null;
			case InfCommonPackage.BANK_ACCOUNT__BANK:
				return bank != null;
			case InfCommonPackage.BANK_ACCOUNT__ACCOUNT_NUMBER:
				return isSetAccountNumber();
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
		result.append(" (accountNumber: ");
		if (accountNumberESet) result.append(accountNumber); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // BankAccount
