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
 * A representation of the model object '<em><b>Voltage Limit Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.VoltageLimitSet#getVoltageLimits <em>Voltage Limits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VoltageLimitSet extends OperationalLimitSet {
	/**
	 * The cached value of the '{@link #getVoltageLimits() <em>Voltage Limits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageLimits()
	 * @generated
	 * @ordered
	 */
	protected EList<VoltageLimit> voltageLimits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoltageLimitSet() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalLimitsPackage.Literals.VOLTAGE_LIMIT_SET;
	}

	/**
	 * Returns the value of the '<em><b>Voltage Limits</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.OperationalLimits.VoltageLimit}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.OperationalLimits.VoltageLimit#getVoltageLimitSet <em>Voltage Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Limits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Limits</em>' reference list.
	 * @see CIM15.IEC61970.OperationalLimits.VoltageLimit#getVoltageLimitSet
	 * @generated
	 */
	public EList<VoltageLimit> getVoltageLimits() {
		if (voltageLimits == null) {
			voltageLimits = new BasicInternalEList<VoltageLimit>(VoltageLimit.class);
		}
		return voltageLimits;
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
			case OperationalLimitsPackage.VOLTAGE_LIMIT_SET__VOLTAGE_LIMITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVoltageLimits()).basicAdd(otherEnd, msgs);
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
			case OperationalLimitsPackage.VOLTAGE_LIMIT_SET__VOLTAGE_LIMITS:
				return ((InternalEList<?>)getVoltageLimits()).basicRemove(otherEnd, msgs);
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
			case OperationalLimitsPackage.VOLTAGE_LIMIT_SET__VOLTAGE_LIMITS:
				return getVoltageLimits();
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
			case OperationalLimitsPackage.VOLTAGE_LIMIT_SET__VOLTAGE_LIMITS:
				getVoltageLimits().clear();
				getVoltageLimits().addAll((Collection<? extends VoltageLimit>)newValue);
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
			case OperationalLimitsPackage.VOLTAGE_LIMIT_SET__VOLTAGE_LIMITS:
				getVoltageLimits().clear();
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
			case OperationalLimitsPackage.VOLTAGE_LIMIT_SET__VOLTAGE_LIMITS:
				return voltageLimits != null && !voltageLimits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // VoltageLimitSet
