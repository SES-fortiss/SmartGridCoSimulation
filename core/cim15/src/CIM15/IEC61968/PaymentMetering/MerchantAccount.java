/**
 */
package CIM15.IEC61968.PaymentMetering;

import CIM15.IEC61968.Common.Document;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merchant Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.MerchantAccount#getMerchantAgreement <em>Merchant Agreement</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.MerchantAccount#getCurrentBalance <em>Current Balance</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.MerchantAccount#getProvisionalBalance <em>Provisional Balance</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.MerchantAccount#getTransactors <em>Transactors</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.MerchantAccount#getVendorShifts <em>Vendor Shifts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MerchantAccount extends Document {
	/**
	 * The cached value of the '{@link #getMerchantAgreement() <em>Merchant Agreement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerchantAgreement()
	 * @generated
	 * @ordered
	 */
	protected MerchantAgreement merchantAgreement;

	/**
	 * The default value of the '{@link #getCurrentBalance() <em>Current Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentBalance()
	 * @generated
	 * @ordered
	 */
	protected static final float CURRENT_BALANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCurrentBalance() <em>Current Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentBalance()
	 * @generated
	 * @ordered
	 */
	protected float currentBalance = CURRENT_BALANCE_EDEFAULT;

	/**
	 * This is true if the Current Balance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean currentBalanceESet;

	/**
	 * The default value of the '{@link #getProvisionalBalance() <em>Provisional Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvisionalBalance()
	 * @generated
	 * @ordered
	 */
	protected static final float PROVISIONAL_BALANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getProvisionalBalance() <em>Provisional Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvisionalBalance()
	 * @generated
	 * @ordered
	 */
	protected float provisionalBalance = PROVISIONAL_BALANCE_EDEFAULT;

	/**
	 * This is true if the Provisional Balance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean provisionalBalanceESet;

	/**
	 * The cached value of the '{@link #getTransactors() <em>Transactors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactors()
	 * @generated
	 * @ordered
	 */
	protected EList<Transactor> transactors;

	/**
	 * The cached value of the '{@link #getVendorShifts() <em>Vendor Shifts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorShifts()
	 * @generated
	 * @ordered
	 */
	protected EList<VendorShift> vendorShifts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MerchantAccount() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.MERCHANT_ACCOUNT;
	}

	/**
	 * Returns the value of the '<em><b>Merchant Agreement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.MerchantAgreement#getMerchantAccounts <em>Merchant Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merchant Agreement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merchant Agreement</em>' reference.
	 * @see #setMerchantAgreement(MerchantAgreement)
	 * @see CIM15.IEC61968.PaymentMetering.MerchantAgreement#getMerchantAccounts
	 * @generated
	 */
	public MerchantAgreement getMerchantAgreement() {
		if (merchantAgreement != null && merchantAgreement.eIsProxy()) {
			InternalEObject oldMerchantAgreement = (InternalEObject)merchantAgreement;
			merchantAgreement = (MerchantAgreement)eResolveProxy(oldMerchantAgreement);
			if (merchantAgreement != oldMerchantAgreement) {
			}
		}
		return merchantAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MerchantAgreement basicGetMerchantAgreement() {
		return merchantAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMerchantAgreement(MerchantAgreement newMerchantAgreement, NotificationChain msgs) {
		MerchantAgreement oldMerchantAgreement = merchantAgreement;
		merchantAgreement = newMerchantAgreement;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.MerchantAccount#getMerchantAgreement <em>Merchant Agreement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merchant Agreement</em>' reference.
	 * @see #getMerchantAgreement()
	 * @generated
	 */
	public void setMerchantAgreement(MerchantAgreement newMerchantAgreement) {
		if (newMerchantAgreement != merchantAgreement) {
			NotificationChain msgs = null;
			if (merchantAgreement != null)
				msgs = ((InternalEObject)merchantAgreement).eInverseRemove(this, PaymentMeteringPackage.MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS, MerchantAgreement.class, msgs);
			if (newMerchantAgreement != null)
				msgs = ((InternalEObject)newMerchantAgreement).eInverseAdd(this, PaymentMeteringPackage.MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS, MerchantAgreement.class, msgs);
			msgs = basicSetMerchantAgreement(newMerchantAgreement, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Current Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Balance</em>' attribute.
	 * @see #isSetCurrentBalance()
	 * @see #unsetCurrentBalance()
	 * @see #setCurrentBalance(float)
	 * @generated
	 */
	public float getCurrentBalance() {
		return currentBalance;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.MerchantAccount#getCurrentBalance <em>Current Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Balance</em>' attribute.
	 * @see #isSetCurrentBalance()
	 * @see #unsetCurrentBalance()
	 * @see #getCurrentBalance()
	 * @generated
	 */
	public void setCurrentBalance(float newCurrentBalance) {
		currentBalance = newCurrentBalance;
		currentBalanceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.MerchantAccount#getCurrentBalance <em>Current Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrentBalance()
	 * @see #getCurrentBalance()
	 * @see #setCurrentBalance(float)
	 * @generated
	 */
	public void unsetCurrentBalance() {
		currentBalance = CURRENT_BALANCE_EDEFAULT;
		currentBalanceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.MerchantAccount#getCurrentBalance <em>Current Balance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Current Balance</em>' attribute is set.
	 * @see #unsetCurrentBalance()
	 * @see #getCurrentBalance()
	 * @see #setCurrentBalance(float)
	 * @generated
	 */
	public boolean isSetCurrentBalance() {
		return currentBalanceESet;
	}

	/**
	 * Returns the value of the '<em><b>Provisional Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provisional Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provisional Balance</em>' attribute.
	 * @see #isSetProvisionalBalance()
	 * @see #unsetProvisionalBalance()
	 * @see #setProvisionalBalance(float)
	 * @generated
	 */
	public float getProvisionalBalance() {
		return provisionalBalance;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.MerchantAccount#getProvisionalBalance <em>Provisional Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provisional Balance</em>' attribute.
	 * @see #isSetProvisionalBalance()
	 * @see #unsetProvisionalBalance()
	 * @see #getProvisionalBalance()
	 * @generated
	 */
	public void setProvisionalBalance(float newProvisionalBalance) {
		provisionalBalance = newProvisionalBalance;
		provisionalBalanceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.MerchantAccount#getProvisionalBalance <em>Provisional Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProvisionalBalance()
	 * @see #getProvisionalBalance()
	 * @see #setProvisionalBalance(float)
	 * @generated
	 */
	public void unsetProvisionalBalance() {
		provisionalBalance = PROVISIONAL_BALANCE_EDEFAULT;
		provisionalBalanceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.MerchantAccount#getProvisionalBalance <em>Provisional Balance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Provisional Balance</em>' attribute is set.
	 * @see #unsetProvisionalBalance()
	 * @see #getProvisionalBalance()
	 * @see #setProvisionalBalance(float)
	 * @generated
	 */
	public boolean isSetProvisionalBalance() {
		return provisionalBalanceESet;
	}

	/**
	 * Returns the value of the '<em><b>Transactors</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.Transactor}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Transactor#getMerchantAccounts <em>Merchant Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transactors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactors</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.Transactor#getMerchantAccounts
	 * @generated
	 */
	public EList<Transactor> getTransactors() {
		if (transactors == null) {
			transactors = new BasicInternalEList<Transactor>(Transactor.class);
		}
		return transactors;
	}

	/**
	 * Returns the value of the '<em><b>Vendor Shifts</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.VendorShift}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.VendorShift#getMerchantAccount <em>Merchant Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor Shifts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Shifts</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.VendorShift#getMerchantAccount
	 * @generated
	 */
	public EList<VendorShift> getVendorShifts() {
		if (vendorShifts == null) {
			vendorShifts = new BasicInternalEList<VendorShift>(VendorShift.class);
		}
		return vendorShifts;
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
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT:
				if (merchantAgreement != null)
					msgs = ((InternalEObject)merchantAgreement).eInverseRemove(this, PaymentMeteringPackage.MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS, MerchantAgreement.class, msgs);
				return basicSetMerchantAgreement((MerchantAgreement)otherEnd, msgs);
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__TRANSACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransactors()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVendorShifts()).basicAdd(otherEnd, msgs);
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
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT:
				return basicSetMerchantAgreement(null, msgs);
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__TRANSACTORS:
				return ((InternalEList<?>)getTransactors()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS:
				return ((InternalEList<?>)getVendorShifts()).basicRemove(otherEnd, msgs);
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
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT:
				if (resolve) return getMerchantAgreement();
				return basicGetMerchantAgreement();
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__CURRENT_BALANCE:
				return getCurrentBalance();
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__PROVISIONAL_BALANCE:
				return getProvisionalBalance();
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__TRANSACTORS:
				return getTransactors();
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS:
				return getVendorShifts();
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
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT:
				setMerchantAgreement((MerchantAgreement)newValue);
				return;
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__CURRENT_BALANCE:
				setCurrentBalance((Float)newValue);
				return;
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__PROVISIONAL_BALANCE:
				setProvisionalBalance((Float)newValue);
				return;
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__TRANSACTORS:
				getTransactors().clear();
				getTransactors().addAll((Collection<? extends Transactor>)newValue);
				return;
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS:
				getVendorShifts().clear();
				getVendorShifts().addAll((Collection<? extends VendorShift>)newValue);
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
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT:
				setMerchantAgreement((MerchantAgreement)null);
				return;
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__CURRENT_BALANCE:
				unsetCurrentBalance();
				return;
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__PROVISIONAL_BALANCE:
				unsetProvisionalBalance();
				return;
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__TRANSACTORS:
				getTransactors().clear();
				return;
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS:
				getVendorShifts().clear();
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
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT:
				return merchantAgreement != null;
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__CURRENT_BALANCE:
				return isSetCurrentBalance();
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__PROVISIONAL_BALANCE:
				return isSetProvisionalBalance();
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__TRANSACTORS:
				return transactors != null && !transactors.isEmpty();
			case PaymentMeteringPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS:
				return vendorShifts != null && !vendorShifts.isEmpty();
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
		result.append(" (currentBalance: ");
		if (currentBalanceESet) result.append(currentBalance); else result.append("<unset>");
		result.append(", provisionalBalance: ");
		if (provisionalBalanceESet) result.append(provisionalBalance); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // MerchantAccount
