/**
 */
package CIM15.IEC61970.OperationalLimits;

import CIM15.IEC61970.Core.IdentifiedObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Limit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.OperationalLimitType#getDirection <em>Direction</em>}</li>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.OperationalLimitType#getOperationalLimit <em>Operational Limit</em>}</li>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.OperationalLimitType#getAcceptableDuration <em>Acceptable Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationalLimitType extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final OperationalLimitDirectionKind DIRECTION_EDEFAULT = OperationalLimitDirectionKind.LOW;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected OperationalLimitDirectionKind direction = DIRECTION_EDEFAULT;

	/**
	 * This is true if the Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean directionESet;

	/**
	 * The cached value of the '{@link #getOperationalLimit() <em>Operational Limit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalLimit()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalLimit> operationalLimit;

	/**
	 * The default value of the '{@link #getAcceptableDuration() <em>Acceptable Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptableDuration()
	 * @generated
	 * @ordered
	 */
	protected static final float ACCEPTABLE_DURATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAcceptableDuration() <em>Acceptable Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptableDuration()
	 * @generated
	 * @ordered
	 */
	protected float acceptableDuration = ACCEPTABLE_DURATION_EDEFAULT;

	/**
	 * This is true if the Acceptable Duration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean acceptableDurationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalLimitType() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalLimitsPackage.Literals.OPERATIONAL_LIMIT_TYPE;
	}

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.OperationalLimits.OperationalLimitDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitDirectionKind
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(OperationalLimitDirectionKind)
	 * @generated
	 */
	public OperationalLimitDirectionKind getDirection() {
		return direction;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.OperationalLimits.OperationalLimitType#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitDirectionKind
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	public void setDirection(OperationalLimitDirectionKind newDirection) {
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		directionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.OperationalLimits.OperationalLimitType#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(OperationalLimitDirectionKind)
	 * @generated
	 */
	public void unsetDirection() {
		direction = DIRECTION_EDEFAULT;
		directionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.OperationalLimits.OperationalLimitType#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(OperationalLimitDirectionKind)
	 * @generated
	 */
	public boolean isSetDirection() {
		return directionESet;
	}

	/**
	 * Returns the value of the '<em><b>Operational Limit</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.OperationalLimits.OperationalLimit}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.OperationalLimits.OperationalLimit#getOperationalLimitType <em>Operational Limit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Limit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Limit</em>' reference list.
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimit#getOperationalLimitType
	 * @generated
	 */
	public EList<OperationalLimit> getOperationalLimit() {
		if (operationalLimit == null) {
			operationalLimit = new BasicInternalEList<OperationalLimit>(OperationalLimit.class);
		}
		return operationalLimit;
	}

	/**
	 * Returns the value of the '<em><b>Acceptable Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acceptable Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceptable Duration</em>' attribute.
	 * @see #isSetAcceptableDuration()
	 * @see #unsetAcceptableDuration()
	 * @see #setAcceptableDuration(float)
	 * @generated
	 */
	public float getAcceptableDuration() {
		return acceptableDuration;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.OperationalLimits.OperationalLimitType#getAcceptableDuration <em>Acceptable Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceptable Duration</em>' attribute.
	 * @see #isSetAcceptableDuration()
	 * @see #unsetAcceptableDuration()
	 * @see #getAcceptableDuration()
	 * @generated
	 */
	public void setAcceptableDuration(float newAcceptableDuration) {
		acceptableDuration = newAcceptableDuration;
		acceptableDurationESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.OperationalLimits.OperationalLimitType#getAcceptableDuration <em>Acceptable Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAcceptableDuration()
	 * @see #getAcceptableDuration()
	 * @see #setAcceptableDuration(float)
	 * @generated
	 */
	public void unsetAcceptableDuration() {
		acceptableDuration = ACCEPTABLE_DURATION_EDEFAULT;
		acceptableDurationESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.OperationalLimits.OperationalLimitType#getAcceptableDuration <em>Acceptable Duration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Acceptable Duration</em>' attribute is set.
	 * @see #unsetAcceptableDuration()
	 * @see #getAcceptableDuration()
	 * @see #setAcceptableDuration(float)
	 * @generated
	 */
	public boolean isSetAcceptableDuration() {
		return acceptableDurationESet;
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperationalLimit()).basicAdd(otherEnd, msgs);
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT:
				return ((InternalEList<?>)getOperationalLimit()).basicRemove(otherEnd, msgs);
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__DIRECTION:
				return getDirection();
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT:
				return getOperationalLimit();
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__ACCEPTABLE_DURATION:
				return getAcceptableDuration();
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__DIRECTION:
				setDirection((OperationalLimitDirectionKind)newValue);
				return;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT:
				getOperationalLimit().clear();
				getOperationalLimit().addAll((Collection<? extends OperationalLimit>)newValue);
				return;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__ACCEPTABLE_DURATION:
				setAcceptableDuration((Float)newValue);
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__DIRECTION:
				unsetDirection();
				return;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT:
				getOperationalLimit().clear();
				return;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__ACCEPTABLE_DURATION:
				unsetAcceptableDuration();
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__DIRECTION:
				return isSetDirection();
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT:
				return operationalLimit != null && !operationalLimit.isEmpty();
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__ACCEPTABLE_DURATION:
				return isSetAcceptableDuration();
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
		result.append(" (direction: ");
		if (directionESet) result.append(direction); else result.append("<unset>");
		result.append(", acceptableDuration: ");
		if (acceptableDurationESet) result.append(acceptableDuration); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // OperationalLimitType
