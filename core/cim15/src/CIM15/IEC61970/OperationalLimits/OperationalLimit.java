/**
 */
package CIM15.IEC61970.OperationalLimits;

import CIM15.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.OperationalLimit#getOperationalLimitType <em>Operational Limit Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.OperationalLimit#getOperationalLimitSet <em>Operational Limit Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationalLimit extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getOperationalLimitType() <em>Operational Limit Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalLimitType()
	 * @generated
	 * @ordered
	 */
	protected OperationalLimitType operationalLimitType;

	/**
	 * The cached value of the '{@link #getOperationalLimitSet() <em>Operational Limit Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalLimitSet()
	 * @generated
	 * @ordered
	 */
	protected OperationalLimitSet operationalLimitSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalLimit() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalLimitsPackage.Literals.OPERATIONAL_LIMIT;
	}

	/**
	 * Returns the value of the '<em><b>Operational Limit Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.OperationalLimits.OperationalLimitType#getOperationalLimit <em>Operational Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Limit Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Limit Type</em>' reference.
	 * @see #setOperationalLimitType(OperationalLimitType)
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitType#getOperationalLimit
	 * @generated
	 */
	public OperationalLimitType getOperationalLimitType() {
		if (operationalLimitType != null && operationalLimitType.eIsProxy()) {
			InternalEObject oldOperationalLimitType = (InternalEObject)operationalLimitType;
			operationalLimitType = (OperationalLimitType)eResolveProxy(oldOperationalLimitType);
			if (operationalLimitType != oldOperationalLimitType) {
			}
		}
		return operationalLimitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitType basicGetOperationalLimitType() {
		return operationalLimitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationalLimitType(OperationalLimitType newOperationalLimitType, NotificationChain msgs) {
		OperationalLimitType oldOperationalLimitType = operationalLimitType;
		operationalLimitType = newOperationalLimitType;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.OperationalLimits.OperationalLimit#getOperationalLimitType <em>Operational Limit Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational Limit Type</em>' reference.
	 * @see #getOperationalLimitType()
	 * @generated
	 */
	public void setOperationalLimitType(OperationalLimitType newOperationalLimitType) {
		if (newOperationalLimitType != operationalLimitType) {
			NotificationChain msgs = null;
			if (operationalLimitType != null)
				msgs = ((InternalEObject)operationalLimitType).eInverseRemove(this, OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT, OperationalLimitType.class, msgs);
			if (newOperationalLimitType != null)
				msgs = ((InternalEObject)newOperationalLimitType).eInverseAdd(this, OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT, OperationalLimitType.class, msgs);
			msgs = basicSetOperationalLimitType(newOperationalLimitType, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Operational Limit Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.OperationalLimits.OperationalLimitSet#getOperationalLimitValue <em>Operational Limit Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Limit Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Limit Set</em>' reference.
	 * @see #setOperationalLimitSet(OperationalLimitSet)
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitSet#getOperationalLimitValue
	 * @generated
	 */
	public OperationalLimitSet getOperationalLimitSet() {
		if (operationalLimitSet != null && operationalLimitSet.eIsProxy()) {
			InternalEObject oldOperationalLimitSet = (InternalEObject)operationalLimitSet;
			operationalLimitSet = (OperationalLimitSet)eResolveProxy(oldOperationalLimitSet);
			if (operationalLimitSet != oldOperationalLimitSet) {
			}
		}
		return operationalLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitSet basicGetOperationalLimitSet() {
		return operationalLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationalLimitSet(OperationalLimitSet newOperationalLimitSet, NotificationChain msgs) {
		OperationalLimitSet oldOperationalLimitSet = operationalLimitSet;
		operationalLimitSet = newOperationalLimitSet;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.OperationalLimits.OperationalLimit#getOperationalLimitSet <em>Operational Limit Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational Limit Set</em>' reference.
	 * @see #getOperationalLimitSet()
	 * @generated
	 */
	public void setOperationalLimitSet(OperationalLimitSet newOperationalLimitSet) {
		if (newOperationalLimitSet != operationalLimitSet) {
			NotificationChain msgs = null;
			if (operationalLimitSet != null)
				msgs = ((InternalEObject)operationalLimitSet).eInverseRemove(this, OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE, OperationalLimitSet.class, msgs);
			if (newOperationalLimitSet != null)
				msgs = ((InternalEObject)newOperationalLimitSet).eInverseAdd(this, OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE, OperationalLimitSet.class, msgs);
			msgs = basicSetOperationalLimitSet(newOperationalLimitSet, msgs);
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE:
				if (operationalLimitType != null)
					msgs = ((InternalEObject)operationalLimitType).eInverseRemove(this, OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT, OperationalLimitType.class, msgs);
				return basicSetOperationalLimitType((OperationalLimitType)otherEnd, msgs);
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET:
				if (operationalLimitSet != null)
					msgs = ((InternalEObject)operationalLimitSet).eInverseRemove(this, OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE, OperationalLimitSet.class, msgs);
				return basicSetOperationalLimitSet((OperationalLimitSet)otherEnd, msgs);
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE:
				return basicSetOperationalLimitType(null, msgs);
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET:
				return basicSetOperationalLimitSet(null, msgs);
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE:
				if (resolve) return getOperationalLimitType();
				return basicGetOperationalLimitType();
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET:
				if (resolve) return getOperationalLimitSet();
				return basicGetOperationalLimitSet();
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE:
				setOperationalLimitType((OperationalLimitType)newValue);
				return;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET:
				setOperationalLimitSet((OperationalLimitSet)newValue);
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE:
				setOperationalLimitType((OperationalLimitType)null);
				return;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET:
				setOperationalLimitSet((OperationalLimitSet)null);
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE:
				return operationalLimitType != null;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET:
				return operationalLimitSet != null;
		}
		return super.eIsSet(featureID);
	}

} // OperationalLimit
