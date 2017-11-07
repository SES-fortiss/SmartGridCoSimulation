/**
 */
package CIM15.IEC61970.OperationalLimits;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apparent Power Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.ApparentPowerLimit#getApparentPowerLimitSet <em>Apparent Power Limit Set</em>}</li>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.ApparentPowerLimit#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApparentPowerLimit extends OperationalLimit {
	/**
	 * The cached value of the '{@link #getApparentPowerLimitSet() <em>Apparent Power Limit Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApparentPowerLimitSet()
	 * @generated
	 * @ordered
	 */
	protected ApparentPowerLimitSet apparentPowerLimitSet;

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
	protected ApparentPowerLimit() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalLimitsPackage.Literals.APPARENT_POWER_LIMIT;
	}

	/**
	 * Returns the value of the '<em><b>Apparent Power Limit Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.OperationalLimits.ApparentPowerLimitSet#getApparentPowerLimits <em>Apparent Power Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apparent Power Limit Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apparent Power Limit Set</em>' reference.
	 * @see #setApparentPowerLimitSet(ApparentPowerLimitSet)
	 * @see CIM15.IEC61970.OperationalLimits.ApparentPowerLimitSet#getApparentPowerLimits
	 * @generated
	 */
	public ApparentPowerLimitSet getApparentPowerLimitSet() {
		if (apparentPowerLimitSet != null && apparentPowerLimitSet.eIsProxy()) {
			InternalEObject oldApparentPowerLimitSet = (InternalEObject)apparentPowerLimitSet;
			apparentPowerLimitSet = (ApparentPowerLimitSet)eResolveProxy(oldApparentPowerLimitSet);
			if (apparentPowerLimitSet != oldApparentPowerLimitSet) {
			}
		}
		return apparentPowerLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApparentPowerLimitSet basicGetApparentPowerLimitSet() {
		return apparentPowerLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApparentPowerLimitSet(ApparentPowerLimitSet newApparentPowerLimitSet, NotificationChain msgs) {
		ApparentPowerLimitSet oldApparentPowerLimitSet = apparentPowerLimitSet;
		apparentPowerLimitSet = newApparentPowerLimitSet;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.OperationalLimits.ApparentPowerLimit#getApparentPowerLimitSet <em>Apparent Power Limit Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apparent Power Limit Set</em>' reference.
	 * @see #getApparentPowerLimitSet()
	 * @generated
	 */
	public void setApparentPowerLimitSet(ApparentPowerLimitSet newApparentPowerLimitSet) {
		if (newApparentPowerLimitSet != apparentPowerLimitSet) {
			NotificationChain msgs = null;
			if (apparentPowerLimitSet != null)
				msgs = ((InternalEObject)apparentPowerLimitSet).eInverseRemove(this, OperationalLimitsPackage.APPARENT_POWER_LIMIT_SET__APPARENT_POWER_LIMITS, ApparentPowerLimitSet.class, msgs);
			if (newApparentPowerLimitSet != null)
				msgs = ((InternalEObject)newApparentPowerLimitSet).eInverseAdd(this, OperationalLimitsPackage.APPARENT_POWER_LIMIT_SET__APPARENT_POWER_LIMITS, ApparentPowerLimitSet.class, msgs);
			msgs = basicSetApparentPowerLimitSet(newApparentPowerLimitSet, msgs);
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
	 * Sets the value of the '{@link CIM15.IEC61970.OperationalLimits.ApparentPowerLimit#getValue <em>Value</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.OperationalLimits.ApparentPowerLimit#getValue <em>Value</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.OperationalLimits.ApparentPowerLimit#getValue <em>Value</em>}' attribute is set.
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
			case OperationalLimitsPackage.APPARENT_POWER_LIMIT__APPARENT_POWER_LIMIT_SET:
				if (apparentPowerLimitSet != null)
					msgs = ((InternalEObject)apparentPowerLimitSet).eInverseRemove(this, OperationalLimitsPackage.APPARENT_POWER_LIMIT_SET__APPARENT_POWER_LIMITS, ApparentPowerLimitSet.class, msgs);
				return basicSetApparentPowerLimitSet((ApparentPowerLimitSet)otherEnd, msgs);
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
			case OperationalLimitsPackage.APPARENT_POWER_LIMIT__APPARENT_POWER_LIMIT_SET:
				return basicSetApparentPowerLimitSet(null, msgs);
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
			case OperationalLimitsPackage.APPARENT_POWER_LIMIT__APPARENT_POWER_LIMIT_SET:
				if (resolve) return getApparentPowerLimitSet();
				return basicGetApparentPowerLimitSet();
			case OperationalLimitsPackage.APPARENT_POWER_LIMIT__VALUE:
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
			case OperationalLimitsPackage.APPARENT_POWER_LIMIT__APPARENT_POWER_LIMIT_SET:
				setApparentPowerLimitSet((ApparentPowerLimitSet)newValue);
				return;
			case OperationalLimitsPackage.APPARENT_POWER_LIMIT__VALUE:
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
			case OperationalLimitsPackage.APPARENT_POWER_LIMIT__APPARENT_POWER_LIMIT_SET:
				setApparentPowerLimitSet((ApparentPowerLimitSet)null);
				return;
			case OperationalLimitsPackage.APPARENT_POWER_LIMIT__VALUE:
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
			case OperationalLimitsPackage.APPARENT_POWER_LIMIT__APPARENT_POWER_LIMIT_SET:
				return apparentPowerLimitSet != null;
			case OperationalLimitsPackage.APPARENT_POWER_LIMIT__VALUE:
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

} // ApparentPowerLimit
