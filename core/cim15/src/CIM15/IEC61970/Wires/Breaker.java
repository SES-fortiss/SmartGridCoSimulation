/**
 */
package CIM15.IEC61970.Wires;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Breaker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.Breaker#getInTransitTime <em>In Transit Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Breaker extends ProtectedSwitch {
	/**
	 * The default value of the '{@link #getInTransitTime() <em>In Transit Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInTransitTime()
	 * @generated
	 * @ordered
	 */
	protected static final float IN_TRANSIT_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInTransitTime() <em>In Transit Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInTransitTime()
	 * @generated
	 * @ordered
	 */
	protected float inTransitTime = IN_TRANSIT_TIME_EDEFAULT;

	/**
	 * This is true if the In Transit Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inTransitTimeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Breaker() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.BREAKER;
	}

	/**
	 * Returns the value of the '<em><b>In Transit Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Transit Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Transit Time</em>' attribute.
	 * @see #isSetInTransitTime()
	 * @see #unsetInTransitTime()
	 * @see #setInTransitTime(float)
	 * @generated
	 */
	public float getInTransitTime() {
		return inTransitTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.Breaker#getInTransitTime <em>In Transit Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Transit Time</em>' attribute.
	 * @see #isSetInTransitTime()
	 * @see #unsetInTransitTime()
	 * @see #getInTransitTime()
	 * @generated
	 */
	public void setInTransitTime(float newInTransitTime) {
		inTransitTime = newInTransitTime;
		inTransitTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.Breaker#getInTransitTime <em>In Transit Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInTransitTime()
	 * @see #getInTransitTime()
	 * @see #setInTransitTime(float)
	 * @generated
	 */
	public void unsetInTransitTime() {
		inTransitTime = IN_TRANSIT_TIME_EDEFAULT;
		inTransitTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.Breaker#getInTransitTime <em>In Transit Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>In Transit Time</em>' attribute is set.
	 * @see #unsetInTransitTime()
	 * @see #getInTransitTime()
	 * @see #setInTransitTime(float)
	 * @generated
	 */
	public boolean isSetInTransitTime() {
		return inTransitTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WiresPackage.BREAKER__IN_TRANSIT_TIME:
				return getInTransitTime();
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
			case WiresPackage.BREAKER__IN_TRANSIT_TIME:
				setInTransitTime((Float)newValue);
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
			case WiresPackage.BREAKER__IN_TRANSIT_TIME:
				unsetInTransitTime();
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
			case WiresPackage.BREAKER__IN_TRANSIT_TIME:
				return isSetInTransitTime();
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
		result.append(" (inTransitTime: ");
		if (inTransitTimeESet) result.append(inTransitTime); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Breaker
