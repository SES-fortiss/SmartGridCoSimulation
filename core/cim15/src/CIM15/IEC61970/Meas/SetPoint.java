/**
 */
package CIM15.IEC61970.Meas;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Meas.SetPoint#getAnalog <em>Analog</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.SetPoint#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.SetPoint#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.SetPoint#getNormalValue <em>Normal Value</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.SetPoint#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetPoint extends Control {
	/**
	 * The cached value of the '{@link #getAnalog() <em>Analog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalog()
	 * @generated
	 * @ordered
	 */
	protected Analog analog;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected float maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * This is true if the Max Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxValueESet;

	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected float minValue = MIN_VALUE_EDEFAULT;

	/**
	 * This is true if the Min Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minValueESet;

	/**
	 * The default value of the '{@link #getNormalValue() <em>Normal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalValue()
	 * @generated
	 * @ordered
	 */
	protected static final float NORMAL_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNormalValue() <em>Normal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalValue()
	 * @generated
	 * @ordered
	 */
	protected float normalValue = NORMAL_VALUE_EDEFAULT;

	/**
	 * This is true if the Normal Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean normalValueESet;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected float value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetPoint() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.SET_POINT;
	}

	/**
	 * Returns the value of the '<em><b>Analog</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.Analog#getSetPoint <em>Set Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analog</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analog</em>' reference.
	 * @see #setAnalog(Analog)
	 * @see CIM15.IEC61970.Meas.Analog#getSetPoint
	 * @generated
	 */
	public Analog getAnalog() {
		if (analog != null && analog.eIsProxy()) {
			InternalEObject oldAnalog = (InternalEObject)analog;
			analog = (Analog)eResolveProxy(oldAnalog);
			if (analog != oldAnalog) {
			}
		}
		return analog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analog basicGetAnalog() {
		return analog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalog(Analog newAnalog, NotificationChain msgs) {
		Analog oldAnalog = analog;
		analog = newAnalog;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.SetPoint#getAnalog <em>Analog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analog</em>' reference.
	 * @see #getAnalog()
	 * @generated
	 */
	public void setAnalog(Analog newAnalog) {
		if (newAnalog != analog) {
			NotificationChain msgs = null;
			if (analog != null)
				msgs = ((InternalEObject)analog).eInverseRemove(this, MeasPackage.ANALOG__SET_POINT, Analog.class, msgs);
			if (newAnalog != null)
				msgs = ((InternalEObject)newAnalog).eInverseAdd(this, MeasPackage.ANALOG__SET_POINT, Analog.class, msgs);
			msgs = basicSetAnalog(newAnalog, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #isSetMaxValue()
	 * @see #unsetMaxValue()
	 * @see #setMaxValue(float)
	 * @generated
	 */
	public float getMaxValue() {
		return maxValue;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.SetPoint#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #isSetMaxValue()
	 * @see #unsetMaxValue()
	 * @see #getMaxValue()
	 * @generated
	 */
	public void setMaxValue(float newMaxValue) {
		maxValue = newMaxValue;
		maxValueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.SetPoint#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxValue()
	 * @see #getMaxValue()
	 * @see #setMaxValue(float)
	 * @generated
	 */
	public void unsetMaxValue() {
		maxValue = MAX_VALUE_EDEFAULT;
		maxValueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.SetPoint#getMaxValue <em>Max Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Value</em>' attribute is set.
	 * @see #unsetMaxValue()
	 * @see #getMaxValue()
	 * @see #setMaxValue(float)
	 * @generated
	 */
	public boolean isSetMaxValue() {
		return maxValueESet;
	}

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #isSetMinValue()
	 * @see #unsetMinValue()
	 * @see #setMinValue(float)
	 * @generated
	 */
	public float getMinValue() {
		return minValue;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.SetPoint#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #isSetMinValue()
	 * @see #unsetMinValue()
	 * @see #getMinValue()
	 * @generated
	 */
	public void setMinValue(float newMinValue) {
		minValue = newMinValue;
		minValueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.SetPoint#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinValue()
	 * @see #getMinValue()
	 * @see #setMinValue(float)
	 * @generated
	 */
	public void unsetMinValue() {
		minValue = MIN_VALUE_EDEFAULT;
		minValueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.SetPoint#getMinValue <em>Min Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Value</em>' attribute is set.
	 * @see #unsetMinValue()
	 * @see #getMinValue()
	 * @see #setMinValue(float)
	 * @generated
	 */
	public boolean isSetMinValue() {
		return minValueESet;
	}

	/**
	 * Returns the value of the '<em><b>Normal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Value</em>' attribute.
	 * @see #isSetNormalValue()
	 * @see #unsetNormalValue()
	 * @see #setNormalValue(float)
	 * @generated
	 */
	public float getNormalValue() {
		return normalValue;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.SetPoint#getNormalValue <em>Normal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Value</em>' attribute.
	 * @see #isSetNormalValue()
	 * @see #unsetNormalValue()
	 * @see #getNormalValue()
	 * @generated
	 */
	public void setNormalValue(float newNormalValue) {
		normalValue = newNormalValue;
		normalValueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.SetPoint#getNormalValue <em>Normal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNormalValue()
	 * @see #getNormalValue()
	 * @see #setNormalValue(float)
	 * @generated
	 */
	public void unsetNormalValue() {
		normalValue = NORMAL_VALUE_EDEFAULT;
		normalValueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.SetPoint#getNormalValue <em>Normal Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Normal Value</em>' attribute is set.
	 * @see #unsetNormalValue()
	 * @see #getNormalValue()
	 * @see #setNormalValue(float)
	 * @generated
	 */
	public boolean isSetNormalValue() {
		return normalValueESet;
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
	 * @see #setValue(float)
	 * @generated
	 */
	public float getValue() {
		return value;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.SetPoint#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	public void setValue(float newValue) {
		value = newValue;
		valueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.SetPoint#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(float)
	 * @generated
	 */
	public void unsetValue() {
		value = VALUE_EDEFAULT;
		valueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.SetPoint#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(float)
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeasPackage.SET_POINT__ANALOG:
				if (analog != null)
					msgs = ((InternalEObject)analog).eInverseRemove(this, MeasPackage.ANALOG__SET_POINT, Analog.class, msgs);
				return basicSetAnalog((Analog)otherEnd, msgs);
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
			case MeasPackage.SET_POINT__ANALOG:
				return basicSetAnalog(null, msgs);
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
			case MeasPackage.SET_POINT__ANALOG:
				if (resolve) return getAnalog();
				return basicGetAnalog();
			case MeasPackage.SET_POINT__MAX_VALUE:
				return getMaxValue();
			case MeasPackage.SET_POINT__MIN_VALUE:
				return getMinValue();
			case MeasPackage.SET_POINT__NORMAL_VALUE:
				return getNormalValue();
			case MeasPackage.SET_POINT__VALUE:
				return getValue();
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
			case MeasPackage.SET_POINT__ANALOG:
				setAnalog((Analog)newValue);
				return;
			case MeasPackage.SET_POINT__MAX_VALUE:
				setMaxValue((Float)newValue);
				return;
			case MeasPackage.SET_POINT__MIN_VALUE:
				setMinValue((Float)newValue);
				return;
			case MeasPackage.SET_POINT__NORMAL_VALUE:
				setNormalValue((Float)newValue);
				return;
			case MeasPackage.SET_POINT__VALUE:
				setValue((Float)newValue);
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
			case MeasPackage.SET_POINT__ANALOG:
				setAnalog((Analog)null);
				return;
			case MeasPackage.SET_POINT__MAX_VALUE:
				unsetMaxValue();
				return;
			case MeasPackage.SET_POINT__MIN_VALUE:
				unsetMinValue();
				return;
			case MeasPackage.SET_POINT__NORMAL_VALUE:
				unsetNormalValue();
				return;
			case MeasPackage.SET_POINT__VALUE:
				unsetValue();
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
			case MeasPackage.SET_POINT__ANALOG:
				return analog != null;
			case MeasPackage.SET_POINT__MAX_VALUE:
				return isSetMaxValue();
			case MeasPackage.SET_POINT__MIN_VALUE:
				return isSetMinValue();
			case MeasPackage.SET_POINT__NORMAL_VALUE:
				return isSetNormalValue();
			case MeasPackage.SET_POINT__VALUE:
				return isSetValue();
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
		result.append(" (maxValue: ");
		if (maxValueESet) result.append(maxValue); else result.append("<unset>");
		result.append(", minValue: ");
		if (minValueESet) result.append(minValue); else result.append("<unset>");
		result.append(", normalValue: ");
		if (normalValueESet) result.append(normalValue); else result.append("<unset>");
		result.append(", value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // SetPoint
