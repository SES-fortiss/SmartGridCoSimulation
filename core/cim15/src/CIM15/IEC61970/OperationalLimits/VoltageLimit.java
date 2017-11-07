/**
 */
package CIM15.IEC61970.OperationalLimits;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voltage Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.VoltageLimit#getValue <em>Value</em>}</li>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.VoltageLimit#getVoltageLimitSet <em>Voltage Limit Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VoltageLimit extends OperationalLimit {
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
	 * The cached value of the '{@link #getVoltageLimitSet() <em>Voltage Limit Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageLimitSet()
	 * @generated
	 * @ordered
	 */
	protected VoltageLimitSet voltageLimitSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoltageLimit() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalLimitsPackage.Literals.VOLTAGE_LIMIT;
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
	 * Sets the value of the '{@link CIM15.IEC61970.OperationalLimits.VoltageLimit#getValue <em>Value</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.OperationalLimits.VoltageLimit#getValue <em>Value</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.OperationalLimits.VoltageLimit#getValue <em>Value</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Voltage Limit Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.OperationalLimits.VoltageLimitSet#getVoltageLimits <em>Voltage Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Limit Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Limit Set</em>' reference.
	 * @see #setVoltageLimitSet(VoltageLimitSet)
	 * @see CIM15.IEC61970.OperationalLimits.VoltageLimitSet#getVoltageLimits
	 * @generated
	 */
	public VoltageLimitSet getVoltageLimitSet() {
		if (voltageLimitSet != null && voltageLimitSet.eIsProxy()) {
			InternalEObject oldVoltageLimitSet = (InternalEObject)voltageLimitSet;
			voltageLimitSet = (VoltageLimitSet)eResolveProxy(oldVoltageLimitSet);
			if (voltageLimitSet != oldVoltageLimitSet) {
			}
		}
		return voltageLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageLimitSet basicGetVoltageLimitSet() {
		return voltageLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVoltageLimitSet(VoltageLimitSet newVoltageLimitSet, NotificationChain msgs) {
		VoltageLimitSet oldVoltageLimitSet = voltageLimitSet;
		voltageLimitSet = newVoltageLimitSet;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.OperationalLimits.VoltageLimit#getVoltageLimitSet <em>Voltage Limit Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Limit Set</em>' reference.
	 * @see #getVoltageLimitSet()
	 * @generated
	 */
	public void setVoltageLimitSet(VoltageLimitSet newVoltageLimitSet) {
		if (newVoltageLimitSet != voltageLimitSet) {
			NotificationChain msgs = null;
			if (voltageLimitSet != null)
				msgs = ((InternalEObject)voltageLimitSet).eInverseRemove(this, OperationalLimitsPackage.VOLTAGE_LIMIT_SET__VOLTAGE_LIMITS, VoltageLimitSet.class, msgs);
			if (newVoltageLimitSet != null)
				msgs = ((InternalEObject)newVoltageLimitSet).eInverseAdd(this, OperationalLimitsPackage.VOLTAGE_LIMIT_SET__VOLTAGE_LIMITS, VoltageLimitSet.class, msgs);
			msgs = basicSetVoltageLimitSet(newVoltageLimitSet, msgs);
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
			case OperationalLimitsPackage.VOLTAGE_LIMIT__VOLTAGE_LIMIT_SET:
				if (voltageLimitSet != null)
					msgs = ((InternalEObject)voltageLimitSet).eInverseRemove(this, OperationalLimitsPackage.VOLTAGE_LIMIT_SET__VOLTAGE_LIMITS, VoltageLimitSet.class, msgs);
				return basicSetVoltageLimitSet((VoltageLimitSet)otherEnd, msgs);
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
			case OperationalLimitsPackage.VOLTAGE_LIMIT__VOLTAGE_LIMIT_SET:
				return basicSetVoltageLimitSet(null, msgs);
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
			case OperationalLimitsPackage.VOLTAGE_LIMIT__VALUE:
				return getValue();
			case OperationalLimitsPackage.VOLTAGE_LIMIT__VOLTAGE_LIMIT_SET:
				if (resolve) return getVoltageLimitSet();
				return basicGetVoltageLimitSet();
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
			case OperationalLimitsPackage.VOLTAGE_LIMIT__VALUE:
				setValue((Float)newValue);
				return;
			case OperationalLimitsPackage.VOLTAGE_LIMIT__VOLTAGE_LIMIT_SET:
				setVoltageLimitSet((VoltageLimitSet)newValue);
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
			case OperationalLimitsPackage.VOLTAGE_LIMIT__VALUE:
				unsetValue();
				return;
			case OperationalLimitsPackage.VOLTAGE_LIMIT__VOLTAGE_LIMIT_SET:
				setVoltageLimitSet((VoltageLimitSet)null);
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
			case OperationalLimitsPackage.VOLTAGE_LIMIT__VALUE:
				return isSetValue();
			case OperationalLimitsPackage.VOLTAGE_LIMIT__VOLTAGE_LIMIT_SET:
				return voltageLimitSet != null;
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

} // VoltageLimit
