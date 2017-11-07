/**
 */
package CIM15.IEC61970.Meas;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Meas.StringMeasurement#getStringMeasurementValues <em>String Measurement Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringMeasurement extends Measurement {
	/**
	 * The cached value of the '{@link #getStringMeasurementValues() <em>String Measurement Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringMeasurementValues()
	 * @generated
	 * @ordered
	 */
	protected EList<StringMeasurementValue> stringMeasurementValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringMeasurement() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.STRING_MEASUREMENT;
	}

	/**
	 * Returns the value of the '<em><b>String Measurement Values</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Meas.StringMeasurementValue}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.StringMeasurementValue#getStringMeasurement <em>String Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Measurement Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Measurement Values</em>' reference list.
	 * @see CIM15.IEC61970.Meas.StringMeasurementValue#getStringMeasurement
	 * @generated
	 */
	public EList<StringMeasurementValue> getStringMeasurementValues() {
		if (stringMeasurementValues == null) {
			stringMeasurementValues = new BasicInternalEList<StringMeasurementValue>(StringMeasurementValue.class);
		}
		return stringMeasurementValues;
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
			case MeasPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStringMeasurementValues()).basicAdd(otherEnd, msgs);
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
			case MeasPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES:
				return ((InternalEList<?>)getStringMeasurementValues()).basicRemove(otherEnd, msgs);
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
			case MeasPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES:
				return getStringMeasurementValues();
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
			case MeasPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES:
				getStringMeasurementValues().clear();
				getStringMeasurementValues().addAll((Collection<? extends StringMeasurementValue>)newValue);
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
			case MeasPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES:
				getStringMeasurementValues().clear();
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
			case MeasPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES:
				return stringMeasurementValues != null && !stringMeasurementValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StringMeasurement
