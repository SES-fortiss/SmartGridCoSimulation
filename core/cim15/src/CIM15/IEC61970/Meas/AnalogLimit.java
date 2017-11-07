/**
 */
package CIM15.IEC61970.Meas;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analog Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Meas.AnalogLimit#getValue <em>Value</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.AnalogLimit#getLimitSet <em>Limit Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnalogLimit extends Limit {
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
	 * The cached value of the '{@link #getLimitSet() <em>Limit Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitSet()
	 * @generated
	 * @ordered
	 */
	protected AnalogLimitSet limitSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalogLimit() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.ANALOG_LIMIT;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.AnalogLimit#getValue <em>Value</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.AnalogLimit#getValue <em>Value</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.AnalogLimit#getValue <em>Value</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Limit Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.AnalogLimitSet#getLimits <em>Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Set</em>' reference.
	 * @see #setLimitSet(AnalogLimitSet)
	 * @see CIM15.IEC61970.Meas.AnalogLimitSet#getLimits
	 * @generated
	 */
	public AnalogLimitSet getLimitSet() {
		if (limitSet != null && limitSet.eIsProxy()) {
			InternalEObject oldLimitSet = (InternalEObject)limitSet;
			limitSet = (AnalogLimitSet)eResolveProxy(oldLimitSet);
			if (limitSet != oldLimitSet) {
			}
		}
		return limitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogLimitSet basicGetLimitSet() {
		return limitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLimitSet(AnalogLimitSet newLimitSet, NotificationChain msgs) {
		AnalogLimitSet oldLimitSet = limitSet;
		limitSet = newLimitSet;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.AnalogLimit#getLimitSet <em>Limit Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit Set</em>' reference.
	 * @see #getLimitSet()
	 * @generated
	 */
	public void setLimitSet(AnalogLimitSet newLimitSet) {
		if (newLimitSet != limitSet) {
			NotificationChain msgs = null;
			if (limitSet != null)
				msgs = ((InternalEObject)limitSet).eInverseRemove(this, MeasPackage.ANALOG_LIMIT_SET__LIMITS, AnalogLimitSet.class, msgs);
			if (newLimitSet != null)
				msgs = ((InternalEObject)newLimitSet).eInverseAdd(this, MeasPackage.ANALOG_LIMIT_SET__LIMITS, AnalogLimitSet.class, msgs);
			msgs = basicSetLimitSet(newLimitSet, msgs);
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
			case MeasPackage.ANALOG_LIMIT__LIMIT_SET:
				if (limitSet != null)
					msgs = ((InternalEObject)limitSet).eInverseRemove(this, MeasPackage.ANALOG_LIMIT_SET__LIMITS, AnalogLimitSet.class, msgs);
				return basicSetLimitSet((AnalogLimitSet)otherEnd, msgs);
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
			case MeasPackage.ANALOG_LIMIT__LIMIT_SET:
				return basicSetLimitSet(null, msgs);
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
			case MeasPackage.ANALOG_LIMIT__VALUE:
				return getValue();
			case MeasPackage.ANALOG_LIMIT__LIMIT_SET:
				if (resolve) return getLimitSet();
				return basicGetLimitSet();
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
			case MeasPackage.ANALOG_LIMIT__VALUE:
				setValue((Float)newValue);
				return;
			case MeasPackage.ANALOG_LIMIT__LIMIT_SET:
				setLimitSet((AnalogLimitSet)newValue);
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
			case MeasPackage.ANALOG_LIMIT__VALUE:
				unsetValue();
				return;
			case MeasPackage.ANALOG_LIMIT__LIMIT_SET:
				setLimitSet((AnalogLimitSet)null);
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
			case MeasPackage.ANALOG_LIMIT__VALUE:
				return isSetValue();
			case MeasPackage.ANALOG_LIMIT__LIMIT_SET:
				return limitSet != null;
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

} // AnalogLimit
