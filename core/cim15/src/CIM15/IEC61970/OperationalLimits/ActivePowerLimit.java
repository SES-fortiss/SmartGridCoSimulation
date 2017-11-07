/**
 */
package CIM15.IEC61970.OperationalLimits;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Active Power Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.ActivePowerLimit#getActivePowerLimitSet <em>Active Power Limit Set</em>}</li>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.ActivePowerLimit#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivePowerLimit extends OperationalLimit {
	/**
	 * The cached value of the '{@link #getActivePowerLimitSet() <em>Active Power Limit Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerLimitSet()
	 * @generated
	 * @ordered
	 */
	protected ActivePowerLimitSet activePowerLimitSet;

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
	protected ActivePowerLimit() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalLimitsPackage.Literals.ACTIVE_POWER_LIMIT;
	}

	/**
	 * Returns the value of the '<em><b>Active Power Limit Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.OperationalLimits.ActivePowerLimitSet#getActivePowerLimits <em>Active Power Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Power Limit Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Power Limit Set</em>' reference.
	 * @see #setActivePowerLimitSet(ActivePowerLimitSet)
	 * @see CIM15.IEC61970.OperationalLimits.ActivePowerLimitSet#getActivePowerLimits
	 * @generated
	 */
	public ActivePowerLimitSet getActivePowerLimitSet() {
		if (activePowerLimitSet != null && activePowerLimitSet.eIsProxy()) {
			InternalEObject oldActivePowerLimitSet = (InternalEObject)activePowerLimitSet;
			activePowerLimitSet = (ActivePowerLimitSet)eResolveProxy(oldActivePowerLimitSet);
			if (activePowerLimitSet != oldActivePowerLimitSet) {
			}
		}
		return activePowerLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivePowerLimitSet basicGetActivePowerLimitSet() {
		return activePowerLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivePowerLimitSet(ActivePowerLimitSet newActivePowerLimitSet, NotificationChain msgs) {
		ActivePowerLimitSet oldActivePowerLimitSet = activePowerLimitSet;
		activePowerLimitSet = newActivePowerLimitSet;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.OperationalLimits.ActivePowerLimit#getActivePowerLimitSet <em>Active Power Limit Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Power Limit Set</em>' reference.
	 * @see #getActivePowerLimitSet()
	 * @generated
	 */
	public void setActivePowerLimitSet(ActivePowerLimitSet newActivePowerLimitSet) {
		if (newActivePowerLimitSet != activePowerLimitSet) {
			NotificationChain msgs = null;
			if (activePowerLimitSet != null)
				msgs = ((InternalEObject)activePowerLimitSet).eInverseRemove(this, OperationalLimitsPackage.ACTIVE_POWER_LIMIT_SET__ACTIVE_POWER_LIMITS, ActivePowerLimitSet.class, msgs);
			if (newActivePowerLimitSet != null)
				msgs = ((InternalEObject)newActivePowerLimitSet).eInverseAdd(this, OperationalLimitsPackage.ACTIVE_POWER_LIMIT_SET__ACTIVE_POWER_LIMITS, ActivePowerLimitSet.class, msgs);
			msgs = basicSetActivePowerLimitSet(newActivePowerLimitSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
	 * Sets the value of the '{@link CIM15.IEC61970.OperationalLimits.ActivePowerLimit#getValue <em>Value</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.OperationalLimits.ActivePowerLimit#getValue <em>Value</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.OperationalLimits.ActivePowerLimit#getValue <em>Value</em>}' attribute is set.
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
			case OperationalLimitsPackage.ACTIVE_POWER_LIMIT__ACTIVE_POWER_LIMIT_SET:
				if (activePowerLimitSet != null)
					msgs = ((InternalEObject)activePowerLimitSet).eInverseRemove(this, OperationalLimitsPackage.ACTIVE_POWER_LIMIT_SET__ACTIVE_POWER_LIMITS, ActivePowerLimitSet.class, msgs);
				return basicSetActivePowerLimitSet((ActivePowerLimitSet)otherEnd, msgs);
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
			case OperationalLimitsPackage.ACTIVE_POWER_LIMIT__ACTIVE_POWER_LIMIT_SET:
				return basicSetActivePowerLimitSet(null, msgs);
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
			case OperationalLimitsPackage.ACTIVE_POWER_LIMIT__ACTIVE_POWER_LIMIT_SET:
				if (resolve) return getActivePowerLimitSet();
				return basicGetActivePowerLimitSet();
			case OperationalLimitsPackage.ACTIVE_POWER_LIMIT__VALUE:
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
			case OperationalLimitsPackage.ACTIVE_POWER_LIMIT__ACTIVE_POWER_LIMIT_SET:
				setActivePowerLimitSet((ActivePowerLimitSet)newValue);
				return;
			case OperationalLimitsPackage.ACTIVE_POWER_LIMIT__VALUE:
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
			case OperationalLimitsPackage.ACTIVE_POWER_LIMIT__ACTIVE_POWER_LIMIT_SET:
				setActivePowerLimitSet((ActivePowerLimitSet)null);
				return;
			case OperationalLimitsPackage.ACTIVE_POWER_LIMIT__VALUE:
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
			case OperationalLimitsPackage.ACTIVE_POWER_LIMIT__ACTIVE_POWER_LIMIT_SET:
				return activePowerLimitSet != null;
			case OperationalLimitsPackage.ACTIVE_POWER_LIMIT__VALUE:
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
		result.append(" (value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ActivePowerLimit
