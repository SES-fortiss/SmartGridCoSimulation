/**
 */
package CIM15.IEC61970.Wires;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phase Tap Changer Linear</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.PhaseTapChangerLinear#getStepPhaseShiftIncrement <em>Step Phase Shift Increment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhaseTapChangerLinear extends PhaseTapChanger {
	/**
	 * The default value of the '{@link #getStepPhaseShiftIncrement() <em>Step Phase Shift Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepPhaseShiftIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final float STEP_PHASE_SHIFT_INCREMENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStepPhaseShiftIncrement() <em>Step Phase Shift Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepPhaseShiftIncrement()
	 * @generated
	 * @ordered
	 */
	protected float stepPhaseShiftIncrement = STEP_PHASE_SHIFT_INCREMENT_EDEFAULT;

	/**
	 * This is true if the Step Phase Shift Increment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stepPhaseShiftIncrementESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhaseTapChangerLinear() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.PHASE_TAP_CHANGER_LINEAR;
	}

	/**
	 * Returns the value of the '<em><b>Step Phase Shift Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Phase Shift Increment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Phase Shift Increment</em>' attribute.
	 * @see #isSetStepPhaseShiftIncrement()
	 * @see #unsetStepPhaseShiftIncrement()
	 * @see #setStepPhaseShiftIncrement(float)
	 * @generated
	 */
	public float getStepPhaseShiftIncrement() {
		return stepPhaseShiftIncrement;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerLinear#getStepPhaseShiftIncrement <em>Step Phase Shift Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Phase Shift Increment</em>' attribute.
	 * @see #isSetStepPhaseShiftIncrement()
	 * @see #unsetStepPhaseShiftIncrement()
	 * @see #getStepPhaseShiftIncrement()
	 * @generated
	 */
	public void setStepPhaseShiftIncrement(float newStepPhaseShiftIncrement) {
		stepPhaseShiftIncrement = newStepPhaseShiftIncrement;
		stepPhaseShiftIncrementESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerLinear#getStepPhaseShiftIncrement <em>Step Phase Shift Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStepPhaseShiftIncrement()
	 * @see #getStepPhaseShiftIncrement()
	 * @see #setStepPhaseShiftIncrement(float)
	 * @generated
	 */
	public void unsetStepPhaseShiftIncrement() {
		stepPhaseShiftIncrement = STEP_PHASE_SHIFT_INCREMENT_EDEFAULT;
		stepPhaseShiftIncrementESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerLinear#getStepPhaseShiftIncrement <em>Step Phase Shift Increment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Step Phase Shift Increment</em>' attribute is set.
	 * @see #unsetStepPhaseShiftIncrement()
	 * @see #getStepPhaseShiftIncrement()
	 * @see #setStepPhaseShiftIncrement(float)
	 * @generated
	 */
	public boolean isSetStepPhaseShiftIncrement() {
		return stepPhaseShiftIncrementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WiresPackage.PHASE_TAP_CHANGER_LINEAR__STEP_PHASE_SHIFT_INCREMENT:
				return getStepPhaseShiftIncrement();
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
			case WiresPackage.PHASE_TAP_CHANGER_LINEAR__STEP_PHASE_SHIFT_INCREMENT:
				setStepPhaseShiftIncrement((Float)newValue);
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
			case WiresPackage.PHASE_TAP_CHANGER_LINEAR__STEP_PHASE_SHIFT_INCREMENT:
				unsetStepPhaseShiftIncrement();
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
			case WiresPackage.PHASE_TAP_CHANGER_LINEAR__STEP_PHASE_SHIFT_INCREMENT:
				return isSetStepPhaseShiftIncrement();
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
		result.append(" (stepPhaseShiftIncrement: ");
		if (stepPhaseShiftIncrementESet) result.append(stepPhaseShiftIncrement); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // PhaseTapChangerLinear
