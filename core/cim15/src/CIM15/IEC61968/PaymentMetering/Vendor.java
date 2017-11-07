/**
 */
package CIM15.IEC61968.PaymentMetering;

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
 * A representation of the model object '<em><b>Vendor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.Vendor#getVendorShifts <em>Vendor Shifts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Vendor extends IdentifiedObject {
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
	protected Vendor() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.VENDOR;
	}

	/**
	 * Returns the value of the '<em><b>Vendor Shifts</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.VendorShift}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.VendorShift#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor Shifts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Shifts</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.VendorShift#getVendor
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
			case PaymentMeteringPackage.VENDOR__VENDOR_SHIFTS:
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
			case PaymentMeteringPackage.VENDOR__VENDOR_SHIFTS:
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
			case PaymentMeteringPackage.VENDOR__VENDOR_SHIFTS:
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
			case PaymentMeteringPackage.VENDOR__VENDOR_SHIFTS:
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
			case PaymentMeteringPackage.VENDOR__VENDOR_SHIFTS:
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
			case PaymentMeteringPackage.VENDOR__VENDOR_SHIFTS:
				return vendorShifts != null && !vendorShifts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Vendor
