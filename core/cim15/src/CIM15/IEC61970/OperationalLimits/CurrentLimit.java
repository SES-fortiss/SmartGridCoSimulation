/**
 */
package CIM15.IEC61970.OperationalLimits;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.CurrentLimit#getValue <em>Value</em>}</li>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.CurrentLimit#getCurrentLimitSet <em>Current Limit Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CurrentLimit extends OperationalLimit {
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
	 * The cached value of the '{@link #getCurrentLimitSet() <em>Current Limit Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLimitSet()
	 * @generated
	 * @ordered
	 */
	protected CurrentLimitSet currentLimitSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentLimit() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalLimitsPackage.Literals.CURRENT_LIMIT;
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
	 * Sets the value of the '{@link CIM15.IEC61970.OperationalLimits.CurrentLimit#getValue <em>Value</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.OperationalLimits.CurrentLimit#getValue <em>Value</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.OperationalLimits.CurrentLimit#getValue <em>Value</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Current Limit Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.OperationalLimits.CurrentLimitSet#getCurrentLimits <em>Current Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Limit Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Limit Set</em>' reference.
	 * @see #setCurrentLimitSet(CurrentLimitSet)
	 * @see CIM15.IEC61970.OperationalLimits.CurrentLimitSet#getCurrentLimits
	 * @generated
	 */
	public CurrentLimitSet getCurrentLimitSet() {
		if (currentLimitSet != null && currentLimitSet.eIsProxy()) {
			InternalEObject oldCurrentLimitSet = (InternalEObject)currentLimitSet;
			currentLimitSet = (CurrentLimitSet)eResolveProxy(oldCurrentLimitSet);
			if (currentLimitSet != oldCurrentLimitSet) {
			}
		}
		return currentLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentLimitSet basicGetCurrentLimitSet() {
		return currentLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentLimitSet(CurrentLimitSet newCurrentLimitSet, NotificationChain msgs) {
		CurrentLimitSet oldCurrentLimitSet = currentLimitSet;
		currentLimitSet = newCurrentLimitSet;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.OperationalLimits.CurrentLimit#getCurrentLimitSet <em>Current Limit Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Limit Set</em>' reference.
	 * @see #getCurrentLimitSet()
	 * @generated
	 */
	public void setCurrentLimitSet(CurrentLimitSet newCurrentLimitSet) {
		if (newCurrentLimitSet != currentLimitSet) {
			NotificationChain msgs = null;
			if (currentLimitSet != null)
				msgs = ((InternalEObject)currentLimitSet).eInverseRemove(this, OperationalLimitsPackage.CURRENT_LIMIT_SET__CURRENT_LIMITS, CurrentLimitSet.class, msgs);
			if (newCurrentLimitSet != null)
				msgs = ((InternalEObject)newCurrentLimitSet).eInverseAdd(this, OperationalLimitsPackage.CURRENT_LIMIT_SET__CURRENT_LIMITS, CurrentLimitSet.class, msgs);
			msgs = basicSetCurrentLimitSet(newCurrentLimitSet, msgs);
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
			case OperationalLimitsPackage.CURRENT_LIMIT__CURRENT_LIMIT_SET:
				if (currentLimitSet != null)
					msgs = ((InternalEObject)currentLimitSet).eInverseRemove(this, OperationalLimitsPackage.CURRENT_LIMIT_SET__CURRENT_LIMITS, CurrentLimitSet.class, msgs);
				return basicSetCurrentLimitSet((CurrentLimitSet)otherEnd, msgs);
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
			case OperationalLimitsPackage.CURRENT_LIMIT__CURRENT_LIMIT_SET:
				return basicSetCurrentLimitSet(null, msgs);
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
			case OperationalLimitsPackage.CURRENT_LIMIT__VALUE:
				return getValue();
			case OperationalLimitsPackage.CURRENT_LIMIT__CURRENT_LIMIT_SET:
				if (resolve) return getCurrentLimitSet();
				return basicGetCurrentLimitSet();
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
			case OperationalLimitsPackage.CURRENT_LIMIT__VALUE:
				setValue((Float)newValue);
				return;
			case OperationalLimitsPackage.CURRENT_LIMIT__CURRENT_LIMIT_SET:
				setCurrentLimitSet((CurrentLimitSet)newValue);
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
			case OperationalLimitsPackage.CURRENT_LIMIT__VALUE:
				unsetValue();
				return;
			case OperationalLimitsPackage.CURRENT_LIMIT__CURRENT_LIMIT_SET:
				setCurrentLimitSet((CurrentLimitSet)null);
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
			case OperationalLimitsPackage.CURRENT_LIMIT__VALUE:
				return isSetValue();
			case OperationalLimitsPackage.CURRENT_LIMIT__CURRENT_LIMIT_SET:
				return currentLimitSet != null;
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

} // CurrentLimit
