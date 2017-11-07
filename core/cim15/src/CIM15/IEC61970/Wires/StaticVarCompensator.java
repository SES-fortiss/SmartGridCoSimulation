/**
 */
package CIM15.IEC61970.Wires;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Var Compensator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.StaticVarCompensator#getSlope <em>Slope</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.StaticVarCompensator#getSVCControlMode <em>SVC Control Mode</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.StaticVarCompensator#getCapacitiveRating <em>Capacitive Rating</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.StaticVarCompensator#getVoltageSetPoint <em>Voltage Set Point</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.StaticVarCompensator#getInductiveRating <em>Inductive Rating</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaticVarCompensator extends RegulatingCondEq {
	/**
	 * The default value of the '{@link #getSlope() <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlope()
	 * @generated
	 * @ordered
	 */
	protected static final float SLOPE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSlope() <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlope()
	 * @generated
	 * @ordered
	 */
	protected float slope = SLOPE_EDEFAULT;

	/**
	 * This is true if the Slope attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean slopeESet;

	/**
	 * The default value of the '{@link #getSVCControlMode() <em>SVC Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVCControlMode()
	 * @generated
	 * @ordered
	 */
	protected static final SVCControlMode SVC_CONTROL_MODE_EDEFAULT = SVCControlMode.OFF;

	/**
	 * The cached value of the '{@link #getSVCControlMode() <em>SVC Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVCControlMode()
	 * @generated
	 * @ordered
	 */
	protected SVCControlMode sVCControlMode = SVC_CONTROL_MODE_EDEFAULT;

	/**
	 * This is true if the SVC Control Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sVCControlModeESet;

	/**
	 * The default value of the '{@link #getCapacitiveRating() <em>Capacitive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacitiveRating()
	 * @generated
	 * @ordered
	 */
	protected static final float CAPACITIVE_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCapacitiveRating() <em>Capacitive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacitiveRating()
	 * @generated
	 * @ordered
	 */
	protected float capacitiveRating = CAPACITIVE_RATING_EDEFAULT;

	/**
	 * This is true if the Capacitive Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capacitiveRatingESet;

	/**
	 * The default value of the '{@link #getVoltageSetPoint() <em>Voltage Set Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageSetPoint()
	 * @generated
	 * @ordered
	 */
	protected static final float VOLTAGE_SET_POINT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVoltageSetPoint() <em>Voltage Set Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageSetPoint()
	 * @generated
	 * @ordered
	 */
	protected float voltageSetPoint = VOLTAGE_SET_POINT_EDEFAULT;

	/**
	 * This is true if the Voltage Set Point attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean voltageSetPointESet;

	/**
	 * The default value of the '{@link #getInductiveRating() <em>Inductive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInductiveRating()
	 * @generated
	 * @ordered
	 */
	protected static final float INDUCTIVE_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInductiveRating() <em>Inductive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInductiveRating()
	 * @generated
	 * @ordered
	 */
	protected float inductiveRating = INDUCTIVE_RATING_EDEFAULT;

	/**
	 * This is true if the Inductive Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inductiveRatingESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticVarCompensator() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.STATIC_VAR_COMPENSATOR;
	}

	/**
	 * Returns the value of the '<em><b>Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slope</em>' attribute.
	 * @see #isSetSlope()
	 * @see #unsetSlope()
	 * @see #setSlope(float)
	 * @generated
	 */
	public float getSlope() {
		return slope;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.StaticVarCompensator#getSlope <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slope</em>' attribute.
	 * @see #isSetSlope()
	 * @see #unsetSlope()
	 * @see #getSlope()
	 * @generated
	 */
	public void setSlope(float newSlope) {
		slope = newSlope;
		slopeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.StaticVarCompensator#getSlope <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSlope()
	 * @see #getSlope()
	 * @see #setSlope(float)
	 * @generated
	 */
	public void unsetSlope() {
		slope = SLOPE_EDEFAULT;
		slopeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.StaticVarCompensator#getSlope <em>Slope</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Slope</em>' attribute is set.
	 * @see #unsetSlope()
	 * @see #getSlope()
	 * @see #setSlope(float)
	 * @generated
	 */
	public boolean isSetSlope() {
		return slopeESet;
	}

	/**
	 * Returns the value of the '<em><b>SVC Control Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Wires.SVCControlMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SVC Control Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SVC Control Mode</em>' attribute.
	 * @see CIM15.IEC61970.Wires.SVCControlMode
	 * @see #isSetSVCControlMode()
	 * @see #unsetSVCControlMode()
	 * @see #setSVCControlMode(SVCControlMode)
	 * @generated
	 */
	public SVCControlMode getSVCControlMode() {
		return sVCControlMode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.StaticVarCompensator#getSVCControlMode <em>SVC Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SVC Control Mode</em>' attribute.
	 * @see CIM15.IEC61970.Wires.SVCControlMode
	 * @see #isSetSVCControlMode()
	 * @see #unsetSVCControlMode()
	 * @see #getSVCControlMode()
	 * @generated
	 */
	public void setSVCControlMode(SVCControlMode newSVCControlMode) {
		sVCControlMode = newSVCControlMode == null ? SVC_CONTROL_MODE_EDEFAULT : newSVCControlMode;
		sVCControlModeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.StaticVarCompensator#getSVCControlMode <em>SVC Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSVCControlMode()
	 * @see #getSVCControlMode()
	 * @see #setSVCControlMode(SVCControlMode)
	 * @generated
	 */
	public void unsetSVCControlMode() {
		sVCControlMode = SVC_CONTROL_MODE_EDEFAULT;
		sVCControlModeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.StaticVarCompensator#getSVCControlMode <em>SVC Control Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>SVC Control Mode</em>' attribute is set.
	 * @see #unsetSVCControlMode()
	 * @see #getSVCControlMode()
	 * @see #setSVCControlMode(SVCControlMode)
	 * @generated
	 */
	public boolean isSetSVCControlMode() {
		return sVCControlModeESet;
	}

	/**
	 * Returns the value of the '<em><b>Capacitive Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacitive Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacitive Rating</em>' attribute.
	 * @see #isSetCapacitiveRating()
	 * @see #unsetCapacitiveRating()
	 * @see #setCapacitiveRating(float)
	 * @generated
	 */
	public float getCapacitiveRating() {
		return capacitiveRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.StaticVarCompensator#getCapacitiveRating <em>Capacitive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacitive Rating</em>' attribute.
	 * @see #isSetCapacitiveRating()
	 * @see #unsetCapacitiveRating()
	 * @see #getCapacitiveRating()
	 * @generated
	 */
	public void setCapacitiveRating(float newCapacitiveRating) {
		capacitiveRating = newCapacitiveRating;
		capacitiveRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.StaticVarCompensator#getCapacitiveRating <em>Capacitive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapacitiveRating()
	 * @see #getCapacitiveRating()
	 * @see #setCapacitiveRating(float)
	 * @generated
	 */
	public void unsetCapacitiveRating() {
		capacitiveRating = CAPACITIVE_RATING_EDEFAULT;
		capacitiveRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.StaticVarCompensator#getCapacitiveRating <em>Capacitive Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacitive Rating</em>' attribute is set.
	 * @see #unsetCapacitiveRating()
	 * @see #getCapacitiveRating()
	 * @see #setCapacitiveRating(float)
	 * @generated
	 */
	public boolean isSetCapacitiveRating() {
		return capacitiveRatingESet;
	}

	/**
	 * Returns the value of the '<em><b>Voltage Set Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Set Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Set Point</em>' attribute.
	 * @see #isSetVoltageSetPoint()
	 * @see #unsetVoltageSetPoint()
	 * @see #setVoltageSetPoint(float)
	 * @generated
	 */
	public float getVoltageSetPoint() {
		return voltageSetPoint;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.StaticVarCompensator#getVoltageSetPoint <em>Voltage Set Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Set Point</em>' attribute.
	 * @see #isSetVoltageSetPoint()
	 * @see #unsetVoltageSetPoint()
	 * @see #getVoltageSetPoint()
	 * @generated
	 */
	public void setVoltageSetPoint(float newVoltageSetPoint) {
		voltageSetPoint = newVoltageSetPoint;
		voltageSetPointESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.StaticVarCompensator#getVoltageSetPoint <em>Voltage Set Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVoltageSetPoint()
	 * @see #getVoltageSetPoint()
	 * @see #setVoltageSetPoint(float)
	 * @generated
	 */
	public void unsetVoltageSetPoint() {
		voltageSetPoint = VOLTAGE_SET_POINT_EDEFAULT;
		voltageSetPointESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.StaticVarCompensator#getVoltageSetPoint <em>Voltage Set Point</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Voltage Set Point</em>' attribute is set.
	 * @see #unsetVoltageSetPoint()
	 * @see #getVoltageSetPoint()
	 * @see #setVoltageSetPoint(float)
	 * @generated
	 */
	public boolean isSetVoltageSetPoint() {
		return voltageSetPointESet;
	}

	/**
	 * Returns the value of the '<em><b>Inductive Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inductive Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inductive Rating</em>' attribute.
	 * @see #isSetInductiveRating()
	 * @see #unsetInductiveRating()
	 * @see #setInductiveRating(float)
	 * @generated
	 */
	public float getInductiveRating() {
		return inductiveRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.StaticVarCompensator#getInductiveRating <em>Inductive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inductive Rating</em>' attribute.
	 * @see #isSetInductiveRating()
	 * @see #unsetInductiveRating()
	 * @see #getInductiveRating()
	 * @generated
	 */
	public void setInductiveRating(float newInductiveRating) {
		inductiveRating = newInductiveRating;
		inductiveRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.StaticVarCompensator#getInductiveRating <em>Inductive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInductiveRating()
	 * @see #getInductiveRating()
	 * @see #setInductiveRating(float)
	 * @generated
	 */
	public void unsetInductiveRating() {
		inductiveRating = INDUCTIVE_RATING_EDEFAULT;
		inductiveRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.StaticVarCompensator#getInductiveRating <em>Inductive Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inductive Rating</em>' attribute is set.
	 * @see #unsetInductiveRating()
	 * @see #getInductiveRating()
	 * @see #setInductiveRating(float)
	 * @generated
	 */
	public boolean isSetInductiveRating() {
		return inductiveRatingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WiresPackage.STATIC_VAR_COMPENSATOR__SLOPE:
				return getSlope();
			case WiresPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE:
				return getSVCControlMode();
			case WiresPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING:
				return getCapacitiveRating();
			case WiresPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT:
				return getVoltageSetPoint();
			case WiresPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING:
				return getInductiveRating();
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
			case WiresPackage.STATIC_VAR_COMPENSATOR__SLOPE:
				setSlope((Float)newValue);
				return;
			case WiresPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE:
				setSVCControlMode((SVCControlMode)newValue);
				return;
			case WiresPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING:
				setCapacitiveRating((Float)newValue);
				return;
			case WiresPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT:
				setVoltageSetPoint((Float)newValue);
				return;
			case WiresPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING:
				setInductiveRating((Float)newValue);
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
			case WiresPackage.STATIC_VAR_COMPENSATOR__SLOPE:
				unsetSlope();
				return;
			case WiresPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE:
				unsetSVCControlMode();
				return;
			case WiresPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING:
				unsetCapacitiveRating();
				return;
			case WiresPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT:
				unsetVoltageSetPoint();
				return;
			case WiresPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING:
				unsetInductiveRating();
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
			case WiresPackage.STATIC_VAR_COMPENSATOR__SLOPE:
				return isSetSlope();
			case WiresPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE:
				return isSetSVCControlMode();
			case WiresPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING:
				return isSetCapacitiveRating();
			case WiresPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT:
				return isSetVoltageSetPoint();
			case WiresPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING:
				return isSetInductiveRating();
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
		result.append(" (slope: ");
		if (slopeESet) result.append(slope); else result.append("<unset>");
		result.append(", sVCControlMode: ");
		if (sVCControlModeESet) result.append(sVCControlMode); else result.append("<unset>");
		result.append(", capacitiveRating: ");
		if (capacitiveRatingESet) result.append(capacitiveRating); else result.append("<unset>");
		result.append(", voltageSetPoint: ");
		if (voltageSetPointESet) result.append(voltageSetPoint); else result.append("<unset>");
		result.append(", inductiveRating: ");
		if (inductiveRatingESet) result.append(inductiveRating); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // StaticVarCompensator
