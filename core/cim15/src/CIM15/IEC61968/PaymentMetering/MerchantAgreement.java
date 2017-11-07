/**
 */
package CIM15.IEC61968.PaymentMetering;

import CIM15.IEC61968.Common.Agreement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merchant Agreement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.MerchantAgreement#getMerchantAccounts <em>Merchant Accounts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MerchantAgreement extends Agreement {
	/**
	 * The cached value of the '{@link #getMerchantAccounts() <em>Merchant Accounts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerchantAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<MerchantAccount> merchantAccounts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MerchantAgreement() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.MERCHANT_AGREEMENT;
	}

	/**
	 * Returns the value of the '<em><b>Merchant Accounts</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.MerchantAccount}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.MerchantAccount#getMerchantAgreement <em>Merchant Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merchant Accounts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merchant Accounts</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.MerchantAccount#getMerchantAgreement
	 * @generated
	 */
	public EList<MerchantAccount> getMerchantAccounts() {
		if (merchantAccounts == null) {
			merchantAccounts = new BasicInternalEList<MerchantAccount>(MerchantAccount.class);
		}
		return merchantAccounts;
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
			case PaymentMeteringPackage.MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMerchantAccounts()).basicAdd(otherEnd, msgs);
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
			case PaymentMeteringPackage.MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS:
				return ((InternalEList<?>)getMerchantAccounts()).basicRemove(otherEnd, msgs);
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
			case PaymentMeteringPackage.MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS:
				return getMerchantAccounts();
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
			case PaymentMeteringPackage.MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS:
				getMerchantAccounts().clear();
				getMerchantAccounts().addAll((Collection<? extends MerchantAccount>)newValue);
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
			case PaymentMeteringPackage.MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS:
				getMerchantAccounts().clear();
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
			case PaymentMeteringPackage.MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS:
				return merchantAccounts != null && !merchantAccounts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // MerchantAgreement
