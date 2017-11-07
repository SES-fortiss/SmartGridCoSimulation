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
 * A representation of the model object '<em><b>Current Limit Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.CurrentLimitSet#getCurrentLimits <em>Current Limits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CurrentLimitSet extends OperationalLimitSet {
	/**
	 * The cached value of the '{@link #getCurrentLimits() <em>Current Limits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLimits()
	 * @generated
	 * @ordered
	 */
	protected EList<CurrentLimit> currentLimits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentLimitSet() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalLimitsPackage.Literals.CURRENT_LIMIT_SET;
	}

	/**
	 * Returns the value of the '<em><b>Current Limits</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.OperationalLimits.CurrentLimit}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.OperationalLimits.CurrentLimit#getCurrentLimitSet <em>Current Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Limits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Limits</em>' reference list.
	 * @see CIM15.IEC61970.OperationalLimits.CurrentLimit#getCurrentLimitSet
	 * @generated
	 */
	public EList<CurrentLimit> getCurrentLimits() {
		if (currentLimits == null) {
			currentLimits = new BasicInternalEList<CurrentLimit>(CurrentLimit.class);
		}
		return currentLimits;
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
			case OperationalLimitsPackage.CURRENT_LIMIT_SET__CURRENT_LIMITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCurrentLimits()).basicAdd(otherEnd, msgs);
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
			case OperationalLimitsPackage.CURRENT_LIMIT_SET__CURRENT_LIMITS:
				return ((InternalEList<?>)getCurrentLimits()).basicRemove(otherEnd, msgs);
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
			case OperationalLimitsPackage.CURRENT_LIMIT_SET__CURRENT_LIMITS:
				return getCurrentLimits();
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
			case OperationalLimitsPackage.CURRENT_LIMIT_SET__CURRENT_LIMITS:
				getCurrentLimits().clear();
				getCurrentLimits().addAll((Collection<? extends CurrentLimit>)newValue);
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
			case OperationalLimitsPackage.CURRENT_LIMIT_SET__CURRENT_LIMITS:
				getCurrentLimits().clear();
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
			case OperationalLimitsPackage.CURRENT_LIMIT_SET__CURRENT_LIMITS:
				return currentLimits != null && !currentLimits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // CurrentLimitSet
