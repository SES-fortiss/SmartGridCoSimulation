/**
 */
package CIM15.IEC61970.Meas;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Measurement Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Meas.StringMeasurementValue#getValue <em>Value</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.StringMeasurementValue#getStringMeasurement <em>String Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringMeasurementValue extends MeasurementValue {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The cached value of the '{@link #getStringMeasurement() <em>String Measurement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringMeasurement()
	 * @generated
	 * @ordered
	 */
	protected StringMeasurement stringMeasurement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringMeasurementValue() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.STRING_MEASUREMENT_VALUE;
	}

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(String)
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.StringMeasurementValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	public void setValue(String newValue) {
		value = newValue;
		valueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.StringMeasurementValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(String)
	 * @generated
	 */
	public void unsetValue() {
		value = VALUE_EDEFAULT;
		valueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.StringMeasurementValue#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(String)
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * Returns the value of the '<em><b>String Measurement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.StringMeasurement#getStringMeasurementValues <em>String Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Measurement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Measurement</em>' reference.
	 * @see #setStringMeasurement(StringMeasurement)
	 * @see CIM15.IEC61970.Meas.StringMeasurement#getStringMeasurementValues
	 * @generated
	 */
	public StringMeasurement getStringMeasurement() {
		if (stringMeasurement != null && stringMeasurement.eIsProxy()) {
			InternalEObject oldStringMeasurement = (InternalEObject)stringMeasurement;
			stringMeasurement = (StringMeasurement)eResolveProxy(oldStringMeasurement);
			if (stringMeasurement != oldStringMeasurement) {
			}
		}
		return stringMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringMeasurement basicGetStringMeasurement() {
		return stringMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringMeasurement(StringMeasurement newStringMeasurement, NotificationChain msgs) {
		StringMeasurement oldStringMeasurement = stringMeasurement;
		stringMeasurement = newStringMeasurement;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.StringMeasurementValue#getStringMeasurement <em>String Measurement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Measurement</em>' reference.
	 * @see #getStringMeasurement()
	 * @generated
	 */
	public void setStringMeasurement(StringMeasurement newStringMeasurement) {
		if (newStringMeasurement != stringMeasurement) {
			NotificationChain msgs = null;
			if (stringMeasurement != null)
				msgs = ((InternalEObject)stringMeasurement).eInverseRemove(this, MeasPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES, StringMeasurement.class, msgs);
			if (newStringMeasurement != null)
				msgs = ((InternalEObject)newStringMeasurement).eInverseAdd(this, MeasPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES, StringMeasurement.class, msgs);
			msgs = basicSetStringMeasurement(newStringMeasurement, msgs);
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
			case MeasPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT:
				if (stringMeasurement != null)
					msgs = ((InternalEObject)stringMeasurement).eInverseRemove(this, MeasPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES, StringMeasurement.class, msgs);
				return basicSetStringMeasurement((StringMeasurement)otherEnd, msgs);
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
			case MeasPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT:
				return basicSetStringMeasurement(null, msgs);
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
			case MeasPackage.STRING_MEASUREMENT_VALUE__VALUE:
				return getValue();
			case MeasPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT:
				if (resolve) return getStringMeasurement();
				return basicGetStringMeasurement();
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
			case MeasPackage.STRING_MEASUREMENT_VALUE__VALUE:
				setValue((String)newValue);
				return;
			case MeasPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT:
				setStringMeasurement((StringMeasurement)newValue);
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
			case MeasPackage.STRING_MEASUREMENT_VALUE__VALUE:
				unsetValue();
				return;
			case MeasPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT:
				setStringMeasurement((StringMeasurement)null);
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
			case MeasPackage.STRING_MEASUREMENT_VALUE__VALUE:
				return isSetValue();
			case MeasPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT:
				return stringMeasurement != null;
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
		result.append(" (value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // StringMeasurementValue
