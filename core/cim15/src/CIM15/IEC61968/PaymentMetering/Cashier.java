/**
 */
package CIM15.IEC61968.PaymentMetering;

import CIM15.IEC61968.Common.ElectronicAddress;

import CIM15.IEC61970.Core.IdentifiedObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cashier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Cashier#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Cashier#getCashierShifts <em>Cashier Shifts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Cashier extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getElectronicAddress() <em>Electronic Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectronicAddress()
	 * @generated
	 * @ordered
	 */
	protected ElectronicAddress electronicAddress;

	/**
	 * The cached value of the '{@link #getCashierShifts() <em>Cashier Shifts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCashierShifts()
	 * @generated
	 * @ordered
	 */
	protected EList<CashierShift> cashierShifts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Cashier() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.CASHIER;
	}

	/**
	 * Returns the value of the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electronic Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electronic Address</em>' containment reference.
	 * @see #setElectronicAddress(ElectronicAddress)
	 * @generated
	 */
	public ElectronicAddress getElectronicAddress() {
		return electronicAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElectronicAddress(ElectronicAddress newElectronicAddress, NotificationChain msgs) {
		ElectronicAddress oldElectronicAddress = electronicAddress;
		electronicAddress = newElectronicAddress;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.Cashier#getElectronicAddress <em>Electronic Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electronic Address</em>' containment reference.
	 * @see #getElectronicAddress()
	 * @generated
	 */
	public void setElectronicAddress(ElectronicAddress newElectronicAddress) {
		if (newElectronicAddress != electronicAddress) {
			NotificationChain msgs = null;
			if (electronicAddress != null)
				msgs = ((InternalEObject)electronicAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaymentMeteringPackage.CASHIER__ELECTRONIC_ADDRESS, null, msgs);
			if (newElectronicAddress != null)
				msgs = ((InternalEObject)newElectronicAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaymentMeteringPackage.CASHIER__ELECTRONIC_ADDRESS, null, msgs);
			msgs = basicSetElectronicAddress(newElectronicAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Cashier Shifts</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.CashierShift}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.CashierShift#getCashier <em>Cashier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cashier Shifts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cashier Shifts</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.CashierShift#getCashier
	 * @generated
	 */
	public EList<CashierShift> getCashierShifts() {
		if (cashierShifts == null) {
			cashierShifts = new BasicInternalEList<CashierShift>(CashierShift.class);
		}
		return cashierShifts;
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
			case PaymentMeteringPackage.CASHIER__CASHIER_SHIFTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCashierShifts()).basicAdd(otherEnd, msgs);
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
			case PaymentMeteringPackage.CASHIER__ELECTRONIC_ADDRESS:
				return basicSetElectronicAddress(null, msgs);
			case PaymentMeteringPackage.CASHIER__CASHIER_SHIFTS:
				return ((InternalEList<?>)getCashierShifts()).basicRemove(otherEnd, msgs);
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
			case PaymentMeteringPackage.CASHIER__ELECTRONIC_ADDRESS:
				return getElectronicAddress();
			case PaymentMeteringPackage.CASHIER__CASHIER_SHIFTS:
				return getCashierShifts();
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
			case PaymentMeteringPackage.CASHIER__ELECTRONIC_ADDRESS:
				setElectronicAddress((ElectronicAddress)newValue);
				return;
			case PaymentMeteringPackage.CASHIER__CASHIER_SHIFTS:
				getCashierShifts().clear();
				getCashierShifts().addAll((Collection<? extends CashierShift>)newValue);
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
			case PaymentMeteringPackage.CASHIER__ELECTRONIC_ADDRESS:
				setElectronicAddress((ElectronicAddress)null);
				return;
			case PaymentMeteringPackage.CASHIER__CASHIER_SHIFTS:
				getCashierShifts().clear();
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
			case PaymentMeteringPackage.CASHIER__ELECTRONIC_ADDRESS:
				return electronicAddress != null;
			case PaymentMeteringPackage.CASHIER__CASHIER_SHIFTS:
				return cashierShifts != null && !cashierShifts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Cashier
