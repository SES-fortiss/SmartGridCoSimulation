/**
 */
package CIM15.IEC61970.Informative.InfOperations;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61970.Domain.DateTimeInterval;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OperationalRestriction#getActivePeriod <em>Active Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationalRestriction extends Document {
	/**
	 * The cached value of the '{@link #getActivePeriod() <em>Active Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePeriod()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval activePeriod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalRestriction() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.OPERATIONAL_RESTRICTION;
	}

	/**
	 * Returns the value of the '<em><b>Active Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Period</em>' containment reference.
	 * @see #setActivePeriod(DateTimeInterval)
	 * @generated
	 */
	public DateTimeInterval getActivePeriod() {
		return activePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivePeriod(DateTimeInterval newActivePeriod, NotificationChain msgs) {
		DateTimeInterval oldActivePeriod = activePeriod;
		activePeriod = newActivePeriod;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OperationalRestriction#getActivePeriod <em>Active Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Period</em>' containment reference.
	 * @see #getActivePeriod()
	 * @generated
	 */
	public void setActivePeriod(DateTimeInterval newActivePeriod) {
		if (newActivePeriod != activePeriod) {
			NotificationChain msgs = null;
			if (activePeriod != null)
				msgs = ((InternalEObject)activePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfOperationsPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD, null, msgs);
			if (newActivePeriod != null)
				msgs = ((InternalEObject)newActivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfOperationsPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD, null, msgs);
			msgs = basicSetActivePeriod(newActivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfOperationsPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD:
				return basicSetActivePeriod(null, msgs);
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
			case InfOperationsPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD:
				return getActivePeriod();
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
			case InfOperationsPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD:
				setActivePeriod((DateTimeInterval)newValue);
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
			case InfOperationsPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD:
				setActivePeriod((DateTimeInterval)null);
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
			case InfOperationsPackage.OPERATIONAL_RESTRICTION__ACTIVE_PERIOD:
				return activePeriod != null;
		}
		return super.eIsSet(featureID);
	}

} // OperationalRestriction
