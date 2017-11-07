/**
 */
package CIM15.IEC61970.Wires;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phase Tap Changer Non Linear</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.PhaseTapChangerNonLinear#getXMedian <em>XMedian</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PhaseTapChangerNonLinear#getVoltageStepIncrement <em>Voltage Step Increment</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PhaseTapChangerNonLinear#getXMax <em>XMax</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhaseTapChangerNonLinear extends PhaseTapChanger {
	/**
	 * The default value of the '{@link #getXMedian() <em>XMedian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMedian()
	 * @generated
	 * @ordered
	 */
	protected static final float XMEDIAN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXMedian() <em>XMedian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMedian()
	 * @generated
	 * @ordered
	 */
	protected float xMedian = XMEDIAN_EDEFAULT;

	/**
	 * This is true if the XMedian attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xMedianESet;

	/**
	 * The default value of the '{@link #getVoltageStepIncrement() <em>Voltage Step Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageStepIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final float VOLTAGE_STEP_INCREMENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVoltageStepIncrement() <em>Voltage Step Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageStepIncrement()
	 * @generated
	 * @ordered
	 */
	protected float voltageStepIncrement = VOLTAGE_STEP_INCREMENT_EDEFAULT;

	/**
	 * This is true if the Voltage Step Increment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean voltageStepIncrementESet;

	/**
	 * The default value of the '{@link #getXMax() <em>XMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMax()
	 * @generated
	 * @ordered
	 */
	protected static final float XMAX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXMax() <em>XMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMax()
	 * @generated
	 * @ordered
	 */
	protected float xMax = XMAX_EDEFAULT;

	/**
	 * This is true if the XMax attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xMaxESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhaseTapChangerNonLinear() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.PHASE_TAP_CHANGER_NON_LINEAR;
	}

	/**
	 * Returns the value of the '<em><b>XMedian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMedian</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMedian</em>' attribute.
	 * @see #isSetXMedian()
	 * @see #unsetXMedian()
	 * @see #setXMedian(float)
	 * @generated
	 */
	public float getXMedian() {
		return xMedian;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerNonLinear#getXMedian <em>XMedian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XMedian</em>' attribute.
	 * @see #isSetXMedian()
	 * @see #unsetXMedian()
	 * @see #getXMedian()
	 * @generated
	 */
	public void setXMedian(float newXMedian) {
		xMedian = newXMedian;
		xMedianESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerNonLinear#getXMedian <em>XMedian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXMedian()
	 * @see #getXMedian()
	 * @see #setXMedian(float)
	 * @generated
	 */
	public void unsetXMedian() {
		xMedian = XMEDIAN_EDEFAULT;
		xMedianESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerNonLinear#getXMedian <em>XMedian</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>XMedian</em>' attribute is set.
	 * @see #unsetXMedian()
	 * @see #getXMedian()
	 * @see #setXMedian(float)
	 * @generated
	 */
	public boolean isSetXMedian() {
		return xMedianESet;
	}

	/**
	 * Returns the value of the '<em><b>Voltage Step Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Step Increment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Step Increment</em>' attribute.
	 * @see #isSetVoltageStepIncrement()
	 * @see #unsetVoltageStepIncrement()
	 * @see #setVoltageStepIncrement(float)
	 * @generated
	 */
	public float getVoltageStepIncrement() {
		return voltageStepIncrement;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerNonLinear#getVoltageStepIncrement <em>Voltage Step Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Step Increment</em>' attribute.
	 * @see #isSetVoltageStepIncrement()
	 * @see #unsetVoltageStepIncrement()
	 * @see #getVoltageStepIncrement()
	 * @generated
	 */
	public void setVoltageStepIncrement(float newVoltageStepIncrement) {
		voltageStepIncrement = newVoltageStepIncrement;
		voltageStepIncrementESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerNonLinear#getVoltageStepIncrement <em>Voltage Step Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVoltageStepIncrement()
	 * @see #getVoltageStepIncrement()
	 * @see #setVoltageStepIncrement(float)
	 * @generated
	 */
	public void unsetVoltageStepIncrement() {
		voltageStepIncrement = VOLTAGE_STEP_INCREMENT_EDEFAULT;
		voltageStepIncrementESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerNonLinear#getVoltageStepIncrement <em>Voltage Step Increment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Voltage Step Increment</em>' attribute is set.
	 * @see #unsetVoltageStepIncrement()
	 * @see #getVoltageStepIncrement()
	 * @see #setVoltageStepIncrement(float)
	 * @generated
	 */
	public boolean isSetVoltageStepIncrement() {
		return voltageStepIncrementESet;
	}

	/**
	 * Returns the value of the '<em><b>XMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMax</em>' attribute.
	 * @see #isSetXMax()
	 * @see #unsetXMax()
	 * @see #setXMax(float)
	 * @generated
	 */
	public float getXMax() {
		return xMax;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerNonLinear#getXMax <em>XMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XMax</em>' attribute.
	 * @see #isSetXMax()
	 * @see #unsetXMax()
	 * @see #getXMax()
	 * @generated
	 */
	public void setXMax(float newXMax) {
		xMax = newXMax;
		xMaxESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerNonLinear#getXMax <em>XMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXMax()
	 * @see #getXMax()
	 * @see #setXMax(float)
	 * @generated
	 */
	public void unsetXMax() {
		xMax = XMAX_EDEFAULT;
		xMaxESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerNonLinear#getXMax <em>XMax</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>XMax</em>' attribute is set.
	 * @see #unsetXMax()
	 * @see #getXMax()
	 * @see #setXMax(float)
	 * @generated
	 */
	public boolean isSetXMax() {
		return xMaxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WiresPackage.PHASE_TAP_CHANGER_NON_LINEAR__XMEDIAN:
				return getXMedian();
			case WiresPackage.PHASE_TAP_CHANGER_NON_LINEAR__VOLTAGE_STEP_INCREMENT:
				return getVoltageStepIncrement();
			case WiresPackage.PHASE_TAP_CHANGER_NON_LINEAR__XMAX:
				return getXMax();
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
			case WiresPackage.PHASE_TAP_CHANGER_NON_LINEAR__XMEDIAN:
				setXMedian((Float)newValue);
				return;
			case WiresPackage.PHASE_TAP_CHANGER_NON_LINEAR__VOLTAGE_STEP_INCREMENT:
				setVoltageStepIncrement((Float)newValue);
				return;
			case WiresPackage.PHASE_TAP_CHANGER_NON_LINEAR__XMAX:
				setXMax((Float)newValue);
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
			case WiresPackage.PHASE_TAP_CHANGER_NON_LINEAR__XMEDIAN:
				unsetXMedian();
				return;
			case WiresPackage.PHASE_TAP_CHANGER_NON_LINEAR__VOLTAGE_STEP_INCREMENT:
				unsetVoltageStepIncrement();
				return;
			case WiresPackage.PHASE_TAP_CHANGER_NON_LINEAR__XMAX:
				unsetXMax();
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
			case WiresPackage.PHASE_TAP_CHANGER_NON_LINEAR__XMEDIAN:
				return isSetXMedian();
			case WiresPackage.PHASE_TAP_CHANGER_NON_LINEAR__VOLTAGE_STEP_INCREMENT:
				return isSetVoltageStepIncrement();
			case WiresPackage.PHASE_TAP_CHANGER_NON_LINEAR__XMAX:
				return isSetXMax();
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
		result.append(" (xMedian: ");
		if (xMedianESet) result.append(xMedian); else result.append("<unset>");
		result.append(", voltageStepIncrement: ");
		if (voltageStepIncrementESet) result.append(voltageStepIncrement); else result.append("<unset>");
		result.append(", xMax: ");
		if (xMaxESet) result.append(xMax); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // PhaseTapChangerNonLinear
