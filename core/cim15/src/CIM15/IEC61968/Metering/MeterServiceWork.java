/**
 */
package CIM15.IEC61968.Metering;

import CIM15.IEC61968.Work.Work;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meter Service Work</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Metering.MeterServiceWork#getOldMeter <em>Old Meter</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.MeterServiceWork#getMeter <em>Meter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeterServiceWork extends Work {
	/**
	 * The cached value of the '{@link #getOldMeter() <em>Old Meter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldMeter()
	 * @generated
	 * @ordered
	 */
	protected Meter oldMeter;

	/**
	 * The cached value of the '{@link #getMeter() <em>Meter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeter()
	 * @generated
	 * @ordered
	 */
	protected Meter meter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeterServiceWork() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.METER_SERVICE_WORK;
	}

	/**
	 * Returns the value of the '<em><b>Old Meter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.Meter#getMeterReplacementWorks <em>Meter Replacement Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Meter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Meter</em>' reference.
	 * @see #setOldMeter(Meter)
	 * @see CIM15.IEC61968.Metering.Meter#getMeterReplacementWorks
	 * @generated
	 */
	public Meter getOldMeter() {
		if (oldMeter != null && oldMeter.eIsProxy()) {
			InternalEObject oldOldMeter = (InternalEObject)oldMeter;
			oldMeter = (Meter)eResolveProxy(oldOldMeter);
			if (oldMeter != oldOldMeter) {
			}
		}
		return oldMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meter basicGetOldMeter() {
		return oldMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOldMeter(Meter newOldMeter, NotificationChain msgs) {
		Meter oldOldMeter = oldMeter;
		oldMeter = newOldMeter;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.MeterServiceWork#getOldMeter <em>Old Meter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Meter</em>' reference.
	 * @see #getOldMeter()
	 * @generated
	 */
	public void setOldMeter(Meter newOldMeter) {
		if (newOldMeter != oldMeter) {
			NotificationChain msgs = null;
			if (oldMeter != null)
				msgs = ((InternalEObject)oldMeter).eInverseRemove(this, MeteringPackage.METER__METER_REPLACEMENT_WORKS, Meter.class, msgs);
			if (newOldMeter != null)
				msgs = ((InternalEObject)newOldMeter).eInverseAdd(this, MeteringPackage.METER__METER_REPLACEMENT_WORKS, Meter.class, msgs);
			msgs = basicSetOldMeter(newOldMeter, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Meter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.Meter#getMeterServiceWorks <em>Meter Service Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter</em>' reference.
	 * @see #setMeter(Meter)
	 * @see CIM15.IEC61968.Metering.Meter#getMeterServiceWorks
	 * @generated
	 */
	public Meter getMeter() {
		if (meter != null && meter.eIsProxy()) {
			InternalEObject oldMeter = (InternalEObject)meter;
			meter = (Meter)eResolveProxy(oldMeter);
			if (meter != oldMeter) {
			}
		}
		return meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meter basicGetMeter() {
		return meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeter(Meter newMeter, NotificationChain msgs) {
		Meter oldMeter = meter;
		meter = newMeter;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.MeterServiceWork#getMeter <em>Meter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter</em>' reference.
	 * @see #getMeter()
	 * @generated
	 */
	public void setMeter(Meter newMeter) {
		if (newMeter != meter) {
			NotificationChain msgs = null;
			if (meter != null)
				msgs = ((InternalEObject)meter).eInverseRemove(this, MeteringPackage.METER__METER_SERVICE_WORKS, Meter.class, msgs);
			if (newMeter != null)
				msgs = ((InternalEObject)newMeter).eInverseAdd(this, MeteringPackage.METER__METER_SERVICE_WORKS, Meter.class, msgs);
			msgs = basicSetMeter(newMeter, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeteringPackage.METER_SERVICE_WORK__OLD_METER:
				if (oldMeter != null)
					msgs = ((InternalEObject)oldMeter).eInverseRemove(this, MeteringPackage.METER__METER_REPLACEMENT_WORKS, Meter.class, msgs);
				return basicSetOldMeter((Meter)otherEnd, msgs);
			case MeteringPackage.METER_SERVICE_WORK__METER:
				if (meter != null)
					msgs = ((InternalEObject)meter).eInverseRemove(this, MeteringPackage.METER__METER_SERVICE_WORKS, Meter.class, msgs);
				return basicSetMeter((Meter)otherEnd, msgs);
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
			case MeteringPackage.METER_SERVICE_WORK__OLD_METER:
				return basicSetOldMeter(null, msgs);
			case MeteringPackage.METER_SERVICE_WORK__METER:
				return basicSetMeter(null, msgs);
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
			case MeteringPackage.METER_SERVICE_WORK__OLD_METER:
				if (resolve) return getOldMeter();
				return basicGetOldMeter();
			case MeteringPackage.METER_SERVICE_WORK__METER:
				if (resolve) return getMeter();
				return basicGetMeter();
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
			case MeteringPackage.METER_SERVICE_WORK__OLD_METER:
				setOldMeter((Meter)newValue);
				return;
			case MeteringPackage.METER_SERVICE_WORK__METER:
				setMeter((Meter)newValue);
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
			case MeteringPackage.METER_SERVICE_WORK__OLD_METER:
				setOldMeter((Meter)null);
				return;
			case MeteringPackage.METER_SERVICE_WORK__METER:
				setMeter((Meter)null);
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
			case MeteringPackage.METER_SERVICE_WORK__OLD_METER:
				return oldMeter != null;
			case MeteringPackage.METER_SERVICE_WORK__METER:
				return meter != null;
		}
		return super.eIsSet(featureID);
	}

} // MeterServiceWork
