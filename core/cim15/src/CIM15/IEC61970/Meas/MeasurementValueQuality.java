/**
 */
package CIM15.IEC61970.Meas;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Value Quality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Meas.MeasurementValueQuality#getMeasurementValue <em>Measurement Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasurementValueQuality extends Quality61850 {
	/**
	 * The cached value of the '{@link #getMeasurementValue() <em>Measurement Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementValue()
	 * @generated
	 * @ordered
	 */
	protected MeasurementValue measurementValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementValueQuality() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.MEASUREMENT_VALUE_QUALITY;
	}

	/**
	 * Returns the value of the '<em><b>Measurement Value</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.MeasurementValue#getMeasurementValueQuality <em>Measurement Value Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Value</em>' reference.
	 * @see #setMeasurementValue(MeasurementValue)
	 * @see CIM15.IEC61970.Meas.MeasurementValue#getMeasurementValueQuality
	 * @generated
	 */
	public MeasurementValue getMeasurementValue() {
		if (measurementValue != null && measurementValue.eIsProxy()) {
			InternalEObject oldMeasurementValue = (InternalEObject)measurementValue;
			measurementValue = (MeasurementValue)eResolveProxy(oldMeasurementValue);
			if (measurementValue != oldMeasurementValue) {
			}
		}
		return measurementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValue basicGetMeasurementValue() {
		return measurementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementValue(MeasurementValue newMeasurementValue, NotificationChain msgs) {
		MeasurementValue oldMeasurementValue = measurementValue;
		measurementValue = newMeasurementValue;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.MeasurementValueQuality#getMeasurementValue <em>Measurement Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Value</em>' reference.
	 * @see #getMeasurementValue()
	 * @generated
	 */
	public void setMeasurementValue(MeasurementValue newMeasurementValue) {
		if (newMeasurementValue != measurementValue) {
			NotificationChain msgs = null;
			if (measurementValue != null)
				msgs = ((InternalEObject)measurementValue).eInverseRemove(this, MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY, MeasurementValue.class, msgs);
			if (newMeasurementValue != null)
				msgs = ((InternalEObject)newMeasurementValue).eInverseAdd(this, MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY, MeasurementValue.class, msgs);
			msgs = basicSetMeasurementValue(newMeasurementValue, msgs);
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
			case MeasPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE:
				if (measurementValue != null)
					msgs = ((InternalEObject)measurementValue).eInverseRemove(this, MeasPackage.MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY, MeasurementValue.class, msgs);
				return basicSetMeasurementValue((MeasurementValue)otherEnd, msgs);
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
			case MeasPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE:
				return basicSetMeasurementValue(null, msgs);
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
			case MeasPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE:
				if (resolve) return getMeasurementValue();
				return basicGetMeasurementValue();
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
			case MeasPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE:
				setMeasurementValue((MeasurementValue)newValue);
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
			case MeasPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE:
				setMeasurementValue((MeasurementValue)null);
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
			case MeasPackage.MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE:
				return measurementValue != null;
		}
		return super.eIsSet(featureID);
	}

} // MeasurementValueQuality
