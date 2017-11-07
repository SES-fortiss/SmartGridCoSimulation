/**
 */
package CIM15.IEC61970.OperationalLimits;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Active Power Limit Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.ActivePowerLimitSet#getActivePowerLimits <em>Active Power Limits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivePowerLimitSet extends OperationalLimitSet {
	/**
	 * The cached value of the '{@link #getActivePowerLimits() <em>Active Power Limits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePowerLimits()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivePowerLimit> activePowerLimits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivePowerLimitSet() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalLimitsPackage.Literals.ACTIVE_POWER_LIMIT_SET;
	}

	/**
	 * Returns the value of the '<em><b>Active Power Limits</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.OperationalLimits.ActivePowerLimit}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.OperationalLimits.ActivePowerLimit#getActivePowerLimitSet <em>Active Power Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Power Limits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Power Limits</em>' reference list.
	 * @see CIM15.IEC61970.OperationalLimits.ActivePowerLimit#getActivePowerLimitSet
	 * @generated
	 */
	public EList<ActivePowerLimit> getActivePowerLimits() {
		if (activePowerLimits == null) {
			activePowerLimits = new BasicInternalEList<ActivePowerLimit>(ActivePowerLimit.class);
		}
		return activePowerLimits;
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
			case OperationalLimitsPackage.ACTIVE_POWER_LIMIT_SET__ACTIVE_POWER_LIMITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivePowerLimits()).basicAdd(otherEnd, msgs);
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
			case OperationalLimitsPackage.ACTIVE_POWER_LIMIT_SET__ACTIVE_POWER_LIMITS:
				return ((InternalEList<?>)getActivePowerLimits()).basicRemove(otherEnd, msgs);
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
			case OperationalLimitsPackage.ACTIVE_POWER_LIMIT_SET__ACTIVE_POWER_LIMITS:
				return getActivePowerLimits();
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
			case OperationalLimitsPackage.ACTIVE_POWER_LIMIT_SET__ACTIVE_POWER_LIMITS:
				getActivePowerLimits().clear();
				getActivePowerLimits().addAll((Collection<? extends ActivePowerLimit>)newValue);
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
			case OperationalLimitsPackage.ACTIVE_POWER_LIMIT_SET__ACTIVE_POWER_LIMITS:
				getActivePowerLimits().clear();
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
			case OperationalLimitsPackage.ACTIVE_POWER_LIMIT_SET__ACTIVE_POWER_LIMITS:
				return activePowerLimits != null && !activePowerLimits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ActivePowerLimitSet
