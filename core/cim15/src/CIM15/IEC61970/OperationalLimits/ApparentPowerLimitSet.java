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
 * A representation of the model object '<em><b>Apparent Power Limit Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.ApparentPowerLimitSet#getApparentPowerLimits <em>Apparent Power Limits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApparentPowerLimitSet extends OperationalLimitSet {
	/**
	 * The cached value of the '{@link #getApparentPowerLimits() <em>Apparent Power Limits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApparentPowerLimits()
	 * @generated
	 * @ordered
	 */
	protected EList<ApparentPowerLimit> apparentPowerLimits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApparentPowerLimitSet() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalLimitsPackage.Literals.APPARENT_POWER_LIMIT_SET;
	}

	/**
	 * Returns the value of the '<em><b>Apparent Power Limits</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.OperationalLimits.ApparentPowerLimit}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.OperationalLimits.ApparentPowerLimit#getApparentPowerLimitSet <em>Apparent Power Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apparent Power Limits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apparent Power Limits</em>' reference list.
	 * @see CIM15.IEC61970.OperationalLimits.ApparentPowerLimit#getApparentPowerLimitSet
	 * @generated
	 */
	public EList<ApparentPowerLimit> getApparentPowerLimits() {
		if (apparentPowerLimits == null) {
			apparentPowerLimits = new BasicInternalEList<ApparentPowerLimit>(ApparentPowerLimit.class);
		}
		return apparentPowerLimits;
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
			case OperationalLimitsPackage.APPARENT_POWER_LIMIT_SET__APPARENT_POWER_LIMITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getApparentPowerLimits()).basicAdd(otherEnd, msgs);
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
			case OperationalLimitsPackage.APPARENT_POWER_LIMIT_SET__APPARENT_POWER_LIMITS:
				return ((InternalEList<?>)getApparentPowerLimits()).basicRemove(otherEnd, msgs);
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
			case OperationalLimitsPackage.APPARENT_POWER_LIMIT_SET__APPARENT_POWER_LIMITS:
				return getApparentPowerLimits();
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
			case OperationalLimitsPackage.APPARENT_POWER_LIMIT_SET__APPARENT_POWER_LIMITS:
				getApparentPowerLimits().clear();
				getApparentPowerLimits().addAll((Collection<? extends ApparentPowerLimit>)newValue);
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
			case OperationalLimitsPackage.APPARENT_POWER_LIMIT_SET__APPARENT_POWER_LIMITS:
				getApparentPowerLimits().clear();
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
			case OperationalLimitsPackage.APPARENT_POWER_LIMIT_SET__APPARENT_POWER_LIMITS:
				return apparentPowerLimits != null && !apparentPowerLimits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ApparentPowerLimitSet
