/**
 */
package CIM15.IEC61970.Wires;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phase Tap Changer Asymetrical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.PhaseTapChangerAsymetrical#getWindingConnectionAngle <em>Winding Connection Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhaseTapChangerAsymetrical extends PhaseTapChangerNonLinear {
	/**
	 * The default value of the '{@link #getWindingConnectionAngle() <em>Winding Connection Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindingConnectionAngle()
	 * @generated
	 * @ordered
	 */
	protected static final float WINDING_CONNECTION_ANGLE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWindingConnectionAngle() <em>Winding Connection Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindingConnectionAngle()
	 * @generated
	 * @ordered
	 */
	protected float windingConnectionAngle = WINDING_CONNECTION_ANGLE_EDEFAULT;

	/**
	 * This is true if the Winding Connection Angle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean windingConnectionAngleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhaseTapChangerAsymetrical() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.PHASE_TAP_CHANGER_ASYMETRICAL;
	}

	/**
	 * Returns the value of the '<em><b>Winding Connection Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Winding Connection Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winding Connection Angle</em>' attribute.
	 * @see #isSetWindingConnectionAngle()
	 * @see #unsetWindingConnectionAngle()
	 * @see #setWindingConnectionAngle(float)
	 * @generated
	 */
	public float getWindingConnectionAngle() {
		return windingConnectionAngle;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerAsymetrical#getWindingConnectionAngle <em>Winding Connection Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winding Connection Angle</em>' attribute.
	 * @see #isSetWindingConnectionAngle()
	 * @see #unsetWindingConnectionAngle()
	 * @see #getWindingConnectionAngle()
	 * @generated
	 */
	public void setWindingConnectionAngle(float newWindingConnectionAngle) {
		windingConnectionAngle = newWindingConnectionAngle;
		windingConnectionAngleESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerAsymetrical#getWindingConnectionAngle <em>Winding Connection Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWindingConnectionAngle()
	 * @see #getWindingConnectionAngle()
	 * @see #setWindingConnectionAngle(float)
	 * @generated
	 */
	public void unsetWindingConnectionAngle() {
		windingConnectionAngle = WINDING_CONNECTION_ANGLE_EDEFAULT;
		windingConnectionAngleESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerAsymetrical#getWindingConnectionAngle <em>Winding Connection Angle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Winding Connection Angle</em>' attribute is set.
	 * @see #unsetWindingConnectionAngle()
	 * @see #getWindingConnectionAngle()
	 * @see #setWindingConnectionAngle(float)
	 * @generated
	 */
	public boolean isSetWindingConnectionAngle() {
		return windingConnectionAngleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WiresPackage.PHASE_TAP_CHANGER_ASYMETRICAL__WINDING_CONNECTION_ANGLE:
				return getWindingConnectionAngle();
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
			case WiresPackage.PHASE_TAP_CHANGER_ASYMETRICAL__WINDING_CONNECTION_ANGLE:
				setWindingConnectionAngle((Float)newValue);
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
			case WiresPackage.PHASE_TAP_CHANGER_ASYMETRICAL__WINDING_CONNECTION_ANGLE:
				unsetWindingConnectionAngle();
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
			case WiresPackage.PHASE_TAP_CHANGER_ASYMETRICAL__WINDING_CONNECTION_ANGLE:
				return isSetWindingConnectionAngle();
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
		result.append(" (windingConnectionAngle: ");
		if (windingConnectionAngleESet) result.append(windingConnectionAngle); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // PhaseTapChangerAsymetrical
