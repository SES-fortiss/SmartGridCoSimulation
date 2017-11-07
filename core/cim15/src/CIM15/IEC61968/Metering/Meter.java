/**
 */
package CIM15.IEC61968.Metering;

import CIM15.IEC61968.PaymentMetering.Transaction;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Metering.Meter#getMeterReplacementWorks <em>Meter Replacement Works</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.Meter#getMeterReadings <em>Meter Readings</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.Meter#getMeterServiceWorks <em>Meter Service Works</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.Meter#getKR <em>KR</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.Meter#getKH <em>KH</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.Meter#getFormNumber <em>Form Number</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.Meter#getVendingTransactions <em>Vending Transactions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Meter extends EndDevice {
	/**
	 * The cached value of the '{@link #getMeterReplacementWorks() <em>Meter Replacement Works</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterReplacementWorks()
	 * @generated
	 * @ordered
	 */
	protected EList<MeterServiceWork> meterReplacementWorks;

	/**
	 * The cached value of the '{@link #getMeterReadings() <em>Meter Readings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterReadings()
	 * @generated
	 * @ordered
	 */
	protected EList<MeterReading> meterReadings;

	/**
	 * The cached value of the '{@link #getMeterServiceWorks() <em>Meter Service Works</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterServiceWorks()
	 * @generated
	 * @ordered
	 */
	protected EList<MeterServiceWork> meterServiceWorks;

	/**
	 * The default value of the '{@link #getKR() <em>KR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKR()
	 * @generated
	 * @ordered
	 */
	protected static final float KR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getKR() <em>KR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKR()
	 * @generated
	 * @ordered
	 */
	protected float kR = KR_EDEFAULT;

	/**
	 * This is true if the KR attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kRESet;

	/**
	 * The default value of the '{@link #getKH() <em>KH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKH()
	 * @generated
	 * @ordered
	 */
	protected static final float KH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getKH() <em>KH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKH()
	 * @generated
	 * @ordered
	 */
	protected float kH = KH_EDEFAULT;

	/**
	 * This is true if the KH attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kHESet;

	/**
	 * The default value of the '{@link #getFormNumber() <em>Form Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String FORM_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormNumber() <em>Form Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormNumber()
	 * @generated
	 * @ordered
	 */
	protected String formNumber = FORM_NUMBER_EDEFAULT;

	/**
	 * This is true if the Form Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean formNumberESet;

	/**
	 * The cached value of the '{@link #getVendingTransactions() <em>Vending Transactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendingTransactions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transaction> vendingTransactions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Meter() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.METER;
	}

	/**
	 * Returns the value of the '<em><b>Meter Replacement Works</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.MeterServiceWork}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.MeterServiceWork#getOldMeter <em>Old Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Replacement Works</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Replacement Works</em>' reference list.
	 * @see CIM15.IEC61968.Metering.MeterServiceWork#getOldMeter
	 * @generated
	 */
	public EList<MeterServiceWork> getMeterReplacementWorks() {
		if (meterReplacementWorks == null) {
			meterReplacementWorks = new BasicInternalEList<MeterServiceWork>(MeterServiceWork.class);
		}
		return meterReplacementWorks;
	}

	/**
	 * Returns the value of the '<em><b>Meter Readings</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.MeterReading}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.MeterReading#getMeter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Readings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Readings</em>' reference list.
	 * @see CIM15.IEC61968.Metering.MeterReading#getMeter
	 * @generated
	 */
	public EList<MeterReading> getMeterReadings() {
		if (meterReadings == null) {
			meterReadings = new BasicInternalEList<MeterReading>(MeterReading.class);
		}
		return meterReadings;
	}

	/**
	 * Returns the value of the '<em><b>Meter Service Works</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.MeterServiceWork}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.MeterServiceWork#getMeter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Service Works</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Service Works</em>' reference list.
	 * @see CIM15.IEC61968.Metering.MeterServiceWork#getMeter
	 * @generated
	 */
	public EList<MeterServiceWork> getMeterServiceWorks() {
		if (meterServiceWorks == null) {
			meterServiceWorks = new BasicInternalEList<MeterServiceWork>(MeterServiceWork.class);
		}
		return meterServiceWorks;
	}

	/**
	 * Returns the value of the '<em><b>KR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>KR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KR</em>' attribute.
	 * @see #isSetKR()
	 * @see #unsetKR()
	 * @see #setKR(float)
	 * @generated
	 */
	public float getKR() {
		return kR;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.Meter#getKR <em>KR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KR</em>' attribute.
	 * @see #isSetKR()
	 * @see #unsetKR()
	 * @see #getKR()
	 * @generated
	 */
	public void setKR(float newKR) {
		kR = newKR;
		kRESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.Meter#getKR <em>KR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKR()
	 * @see #getKR()
	 * @see #setKR(float)
	 * @generated
	 */
	public void unsetKR() {
		kR = KR_EDEFAULT;
		kRESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.Meter#getKR <em>KR</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>KR</em>' attribute is set.
	 * @see #unsetKR()
	 * @see #getKR()
	 * @see #setKR(float)
	 * @generated
	 */
	public boolean isSetKR() {
		return kRESet;
	}

	/**
	 * Returns the value of the '<em><b>KH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>KH</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KH</em>' attribute.
	 * @see #isSetKH()
	 * @see #unsetKH()
	 * @see #setKH(float)
	 * @generated
	 */
	public float getKH() {
		return kH;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.Meter#getKH <em>KH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KH</em>' attribute.
	 * @see #isSetKH()
	 * @see #unsetKH()
	 * @see #getKH()
	 * @generated
	 */
	public void setKH(float newKH) {
		kH = newKH;
		kHESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.Meter#getKH <em>KH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKH()
	 * @see #getKH()
	 * @see #setKH(float)
	 * @generated
	 */
	public void unsetKH() {
		kH = KH_EDEFAULT;
		kHESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.Meter#getKH <em>KH</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>KH</em>' attribute is set.
	 * @see #unsetKH()
	 * @see #getKH()
	 * @see #setKH(float)
	 * @generated
	 */
	public boolean isSetKH() {
		return kHESet;
	}

	/**
	 * Returns the value of the '<em><b>Form Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Number</em>' attribute.
	 * @see #isSetFormNumber()
	 * @see #unsetFormNumber()
	 * @see #setFormNumber(String)
	 * @generated
	 */
	public String getFormNumber() {
		return formNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.Meter#getFormNumber <em>Form Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Number</em>' attribute.
	 * @see #isSetFormNumber()
	 * @see #unsetFormNumber()
	 * @see #getFormNumber()
	 * @generated
	 */
	public void setFormNumber(String newFormNumber) {
		formNumber = newFormNumber;
		formNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.Meter#getFormNumber <em>Form Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFormNumber()
	 * @see #getFormNumber()
	 * @see #setFormNumber(String)
	 * @generated
	 */
	public void unsetFormNumber() {
		formNumber = FORM_NUMBER_EDEFAULT;
		formNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.Meter#getFormNumber <em>Form Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Form Number</em>' attribute is set.
	 * @see #unsetFormNumber()
	 * @see #getFormNumber()
	 * @see #setFormNumber(String)
	 * @generated
	 */
	public boolean isSetFormNumber() {
		return formNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>Vending Transactions</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.Transaction}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Transaction#getMeter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vending Transactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vending Transactions</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.Transaction#getMeter
	 * @generated
	 */
	public EList<Transaction> getVendingTransactions() {
		if (vendingTransactions == null) {
			vendingTransactions = new BasicInternalEList<Transaction>(Transaction.class);
		}
		return vendingTransactions;
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
			case MeteringPackage.METER__METER_REPLACEMENT_WORKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeterReplacementWorks()).basicAdd(otherEnd, msgs);
			case MeteringPackage.METER__METER_READINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeterReadings()).basicAdd(otherEnd, msgs);
			case MeteringPackage.METER__METER_SERVICE_WORKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeterServiceWorks()).basicAdd(otherEnd, msgs);
			case MeteringPackage.METER__VENDING_TRANSACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVendingTransactions()).basicAdd(otherEnd, msgs);
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
			case MeteringPackage.METER__METER_REPLACEMENT_WORKS:
				return ((InternalEList<?>)getMeterReplacementWorks()).basicRemove(otherEnd, msgs);
			case MeteringPackage.METER__METER_READINGS:
				return ((InternalEList<?>)getMeterReadings()).basicRemove(otherEnd, msgs);
			case MeteringPackage.METER__METER_SERVICE_WORKS:
				return ((InternalEList<?>)getMeterServiceWorks()).basicRemove(otherEnd, msgs);
			case MeteringPackage.METER__VENDING_TRANSACTIONS:
				return ((InternalEList<?>)getVendingTransactions()).basicRemove(otherEnd, msgs);
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
			case MeteringPackage.METER__METER_REPLACEMENT_WORKS:
				return getMeterReplacementWorks();
			case MeteringPackage.METER__METER_READINGS:
				return getMeterReadings();
			case MeteringPackage.METER__METER_SERVICE_WORKS:
				return getMeterServiceWorks();
			case MeteringPackage.METER__KR:
				return getKR();
			case MeteringPackage.METER__KH:
				return getKH();
			case MeteringPackage.METER__FORM_NUMBER:
				return getFormNumber();
			case MeteringPackage.METER__VENDING_TRANSACTIONS:
				return getVendingTransactions();
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
			case MeteringPackage.METER__METER_REPLACEMENT_WORKS:
				getMeterReplacementWorks().clear();
				getMeterReplacementWorks().addAll((Collection<? extends MeterServiceWork>)newValue);
				return;
			case MeteringPackage.METER__METER_READINGS:
				getMeterReadings().clear();
				getMeterReadings().addAll((Collection<? extends MeterReading>)newValue);
				return;
			case MeteringPackage.METER__METER_SERVICE_WORKS:
				getMeterServiceWorks().clear();
				getMeterServiceWorks().addAll((Collection<? extends MeterServiceWork>)newValue);
				return;
			case MeteringPackage.METER__KR:
				setKR((Float)newValue);
				return;
			case MeteringPackage.METER__KH:
				setKH((Float)newValue);
				return;
			case MeteringPackage.METER__FORM_NUMBER:
				setFormNumber((String)newValue);
				return;
			case MeteringPackage.METER__VENDING_TRANSACTIONS:
				getVendingTransactions().clear();
				getVendingTransactions().addAll((Collection<? extends Transaction>)newValue);
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
			case MeteringPackage.METER__METER_REPLACEMENT_WORKS:
				getMeterReplacementWorks().clear();
				return;
			case MeteringPackage.METER__METER_READINGS:
				getMeterReadings().clear();
				return;
			case MeteringPackage.METER__METER_SERVICE_WORKS:
				getMeterServiceWorks().clear();
				return;
			case MeteringPackage.METER__KR:
				unsetKR();
				return;
			case MeteringPackage.METER__KH:
				unsetKH();
				return;
			case MeteringPackage.METER__FORM_NUMBER:
				unsetFormNumber();
				return;
			case MeteringPackage.METER__VENDING_TRANSACTIONS:
				getVendingTransactions().clear();
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
			case MeteringPackage.METER__METER_REPLACEMENT_WORKS:
				return meterReplacementWorks != null && !meterReplacementWorks.isEmpty();
			case MeteringPackage.METER__METER_READINGS:
				return meterReadings != null && !meterReadings.isEmpty();
			case MeteringPackage.METER__METER_SERVICE_WORKS:
				return meterServiceWorks != null && !meterServiceWorks.isEmpty();
			case MeteringPackage.METER__KR:
				return isSetKR();
			case MeteringPackage.METER__KH:
				return isSetKH();
			case MeteringPackage.METER__FORM_NUMBER:
				return isSetFormNumber();
			case MeteringPackage.METER__VENDING_TRANSACTIONS:
				return vendingTransactions != null && !vendingTransactions.isEmpty();
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
		result.append(" (kR: ");
		if (kRESet) result.append(kR); else result.append("<unset>");
		result.append(", kH: ");
		if (kHESet) result.append(kH); else result.append("<unset>");
		result.append(", formNumber: ");
		if (formNumberESet) result.append(formNumber); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Meter
