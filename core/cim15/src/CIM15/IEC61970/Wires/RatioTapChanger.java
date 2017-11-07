/**
 */
package CIM15.IEC61970.Wires;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ratio Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.RatioTapChanger#getStepVoltageIncrement <em>Step Voltage Increment</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RatioTapChanger#getRatioTapChangerTabular <em>Ratio Tap Changer Tabular</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RatioTapChanger#getTculControlMode <em>Tcul Control Mode</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RatioTapChanger#getTransformerEnd <em>Transformer End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RatioTapChanger extends TapChanger {
	/**
	 * The default value of the '{@link #getStepVoltageIncrement() <em>Step Voltage Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepVoltageIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final float STEP_VOLTAGE_INCREMENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStepVoltageIncrement() <em>Step Voltage Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepVoltageIncrement()
	 * @generated
	 * @ordered
	 */
	protected float stepVoltageIncrement = STEP_VOLTAGE_INCREMENT_EDEFAULT;

	/**
	 * This is true if the Step Voltage Increment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stepVoltageIncrementESet;

	/**
	 * The cached value of the '{@link #getRatioTapChangerTabular() <em>Ratio Tap Changer Tabular</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatioTapChangerTabular()
	 * @generated
	 * @ordered
	 */
	protected RatioTapChangerTabular ratioTapChangerTabular;

	/**
	 * The default value of the '{@link #getTculControlMode() <em>Tcul Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTculControlMode()
	 * @generated
	 * @ordered
	 */
	protected static final TransformerControlMode TCUL_CONTROL_MODE_EDEFAULT = TransformerControlMode.REACTIVE;

	/**
	 * The cached value of the '{@link #getTculControlMode() <em>Tcul Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTculControlMode()
	 * @generated
	 * @ordered
	 */
	protected TransformerControlMode tculControlMode = TCUL_CONTROL_MODE_EDEFAULT;

	/**
	 * This is true if the Tcul Control Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tculControlModeESet;

	/**
	 * The cached value of the '{@link #getTransformerEnd() <em>Transformer End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerEnd()
	 * @generated
	 * @ordered
	 */
	protected TransformerEnd transformerEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RatioTapChanger() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.RATIO_TAP_CHANGER;
	}

	/**
	 * Returns the value of the '<em><b>Step Voltage Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Voltage Increment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Voltage Increment</em>' attribute.
	 * @see #isSetStepVoltageIncrement()
	 * @see #unsetStepVoltageIncrement()
	 * @see #setStepVoltageIncrement(float)
	 * @generated
	 */
	public float getStepVoltageIncrement() {
		return stepVoltageIncrement;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RatioTapChanger#getStepVoltageIncrement <em>Step Voltage Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Voltage Increment</em>' attribute.
	 * @see #isSetStepVoltageIncrement()
	 * @see #unsetStepVoltageIncrement()
	 * @see #getStepVoltageIncrement()
	 * @generated
	 */
	public void setStepVoltageIncrement(float newStepVoltageIncrement) {
		stepVoltageIncrement = newStepVoltageIncrement;
		stepVoltageIncrementESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.RatioTapChanger#getStepVoltageIncrement <em>Step Voltage Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStepVoltageIncrement()
	 * @see #getStepVoltageIncrement()
	 * @see #setStepVoltageIncrement(float)
	 * @generated
	 */
	public void unsetStepVoltageIncrement() {
		stepVoltageIncrement = STEP_VOLTAGE_INCREMENT_EDEFAULT;
		stepVoltageIncrementESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.RatioTapChanger#getStepVoltageIncrement <em>Step Voltage Increment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Step Voltage Increment</em>' attribute is set.
	 * @see #unsetStepVoltageIncrement()
	 * @see #getStepVoltageIncrement()
	 * @see #setStepVoltageIncrement(float)
	 * @generated
	 */
	public boolean isSetStepVoltageIncrement() {
		return stepVoltageIncrementESet;
	}

	/**
	 * Returns the value of the '<em><b>Ratio Tap Changer Tabular</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.RatioTapChangerTabular#getRatioTapChanger <em>Ratio Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratio Tap Changer Tabular</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratio Tap Changer Tabular</em>' reference.
	 * @see #setRatioTapChangerTabular(RatioTapChangerTabular)
	 * @see CIM15.IEC61970.Wires.RatioTapChangerTabular#getRatioTapChanger
	 * @generated
	 */
	public RatioTapChangerTabular getRatioTapChangerTabular() {
		if (ratioTapChangerTabular != null && ratioTapChangerTabular.eIsProxy()) {
			InternalEObject oldRatioTapChangerTabular = (InternalEObject)ratioTapChangerTabular;
			ratioTapChangerTabular = (RatioTapChangerTabular)eResolveProxy(oldRatioTapChangerTabular);
			if (ratioTapChangerTabular != oldRatioTapChangerTabular) {
			}
		}
		return ratioTapChangerTabular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RatioTapChangerTabular basicGetRatioTapChangerTabular() {
		return ratioTapChangerTabular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRatioTapChangerTabular(RatioTapChangerTabular newRatioTapChangerTabular, NotificationChain msgs) {
		RatioTapChangerTabular oldRatioTapChangerTabular = ratioTapChangerTabular;
		ratioTapChangerTabular = newRatioTapChangerTabular;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RatioTapChanger#getRatioTapChangerTabular <em>Ratio Tap Changer Tabular</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratio Tap Changer Tabular</em>' reference.
	 * @see #getRatioTapChangerTabular()
	 * @generated
	 */
	public void setRatioTapChangerTabular(RatioTapChangerTabular newRatioTapChangerTabular) {
		if (newRatioTapChangerTabular != ratioTapChangerTabular) {
			NotificationChain msgs = null;
			if (ratioTapChangerTabular != null)
				msgs = ((InternalEObject)ratioTapChangerTabular).eInverseRemove(this, WiresPackage.RATIO_TAP_CHANGER_TABULAR__RATIO_TAP_CHANGER, RatioTapChangerTabular.class, msgs);
			if (newRatioTapChangerTabular != null)
				msgs = ((InternalEObject)newRatioTapChangerTabular).eInverseAdd(this, WiresPackage.RATIO_TAP_CHANGER_TABULAR__RATIO_TAP_CHANGER, RatioTapChangerTabular.class, msgs);
			msgs = basicSetRatioTapChangerTabular(newRatioTapChangerTabular, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Tcul Control Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Wires.TransformerControlMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tcul Control Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tcul Control Mode</em>' attribute.
	 * @see CIM15.IEC61970.Wires.TransformerControlMode
	 * @see #isSetTculControlMode()
	 * @see #unsetTculControlMode()
	 * @see #setTculControlMode(TransformerControlMode)
	 * @generated
	 */
	public TransformerControlMode getTculControlMode() {
		return tculControlMode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RatioTapChanger#getTculControlMode <em>Tcul Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tcul Control Mode</em>' attribute.
	 * @see CIM15.IEC61970.Wires.TransformerControlMode
	 * @see #isSetTculControlMode()
	 * @see #unsetTculControlMode()
	 * @see #getTculControlMode()
	 * @generated
	 */
	public void setTculControlMode(TransformerControlMode newTculControlMode) {
		tculControlMode = newTculControlMode == null ? TCUL_CONTROL_MODE_EDEFAULT : newTculControlMode;
		tculControlModeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.RatioTapChanger#getTculControlMode <em>Tcul Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTculControlMode()
	 * @see #getTculControlMode()
	 * @see #setTculControlMode(TransformerControlMode)
	 * @generated
	 */
	public void unsetTculControlMode() {
		tculControlMode = TCUL_CONTROL_MODE_EDEFAULT;
		tculControlModeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.RatioTapChanger#getTculControlMode <em>Tcul Control Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tcul Control Mode</em>' attribute is set.
	 * @see #unsetTculControlMode()
	 * @see #getTculControlMode()
	 * @see #setTculControlMode(TransformerControlMode)
	 * @generated
	 */
	public boolean isSetTculControlMode() {
		return tculControlModeESet;
	}

	/**
	 * Returns the value of the '<em><b>Transformer End</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TransformerEnd#getRatioTapChanger <em>Ratio Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer End</em>' reference.
	 * @see #setTransformerEnd(TransformerEnd)
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getRatioTapChanger
	 * @generated
	 */
	public TransformerEnd getTransformerEnd() {
		if (transformerEnd != null && transformerEnd.eIsProxy()) {
			InternalEObject oldTransformerEnd = (InternalEObject)transformerEnd;
			transformerEnd = (TransformerEnd)eResolveProxy(oldTransformerEnd);
			if (transformerEnd != oldTransformerEnd) {
			}
		}
		return transformerEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerEnd basicGetTransformerEnd() {
		return transformerEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerEnd(TransformerEnd newTransformerEnd, NotificationChain msgs) {
		TransformerEnd oldTransformerEnd = transformerEnd;
		transformerEnd = newTransformerEnd;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RatioTapChanger#getTransformerEnd <em>Transformer End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer End</em>' reference.
	 * @see #getTransformerEnd()
	 * @generated
	 */
	public void setTransformerEnd(TransformerEnd newTransformerEnd) {
		if (newTransformerEnd != transformerEnd) {
			NotificationChain msgs = null;
			if (transformerEnd != null)
				msgs = ((InternalEObject)transformerEnd).eInverseRemove(this, WiresPackage.TRANSFORMER_END__RATIO_TAP_CHANGER, TransformerEnd.class, msgs);
			if (newTransformerEnd != null)
				msgs = ((InternalEObject)newTransformerEnd).eInverseAdd(this, WiresPackage.TRANSFORMER_END__RATIO_TAP_CHANGER, TransformerEnd.class, msgs);
			msgs = basicSetTransformerEnd(newTransformerEnd, msgs);
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
			case WiresPackage.RATIO_TAP_CHANGER__RATIO_TAP_CHANGER_TABULAR:
				if (ratioTapChangerTabular != null)
					msgs = ((InternalEObject)ratioTapChangerTabular).eInverseRemove(this, WiresPackage.RATIO_TAP_CHANGER_TABULAR__RATIO_TAP_CHANGER, RatioTapChangerTabular.class, msgs);
				return basicSetRatioTapChangerTabular((RatioTapChangerTabular)otherEnd, msgs);
			case WiresPackage.RATIO_TAP_CHANGER__TRANSFORMER_END:
				if (transformerEnd != null)
					msgs = ((InternalEObject)transformerEnd).eInverseRemove(this, WiresPackage.TRANSFORMER_END__RATIO_TAP_CHANGER, TransformerEnd.class, msgs);
				return basicSetTransformerEnd((TransformerEnd)otherEnd, msgs);
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
			case WiresPackage.RATIO_TAP_CHANGER__RATIO_TAP_CHANGER_TABULAR:
				return basicSetRatioTapChangerTabular(null, msgs);
			case WiresPackage.RATIO_TAP_CHANGER__TRANSFORMER_END:
				return basicSetTransformerEnd(null, msgs);
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
			case WiresPackage.RATIO_TAP_CHANGER__STEP_VOLTAGE_INCREMENT:
				return getStepVoltageIncrement();
			case WiresPackage.RATIO_TAP_CHANGER__RATIO_TAP_CHANGER_TABULAR:
				if (resolve) return getRatioTapChangerTabular();
				return basicGetRatioTapChangerTabular();
			case WiresPackage.RATIO_TAP_CHANGER__TCUL_CONTROL_MODE:
				return getTculControlMode();
			case WiresPackage.RATIO_TAP_CHANGER__TRANSFORMER_END:
				if (resolve) return getTransformerEnd();
				return basicGetTransformerEnd();
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
			case WiresPackage.RATIO_TAP_CHANGER__STEP_VOLTAGE_INCREMENT:
				setStepVoltageIncrement((Float)newValue);
				return;
			case WiresPackage.RATIO_TAP_CHANGER__RATIO_TAP_CHANGER_TABULAR:
				setRatioTapChangerTabular((RatioTapChangerTabular)newValue);
				return;
			case WiresPackage.RATIO_TAP_CHANGER__TCUL_CONTROL_MODE:
				setTculControlMode((TransformerControlMode)newValue);
				return;
			case WiresPackage.RATIO_TAP_CHANGER__TRANSFORMER_END:
				setTransformerEnd((TransformerEnd)newValue);
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
			case WiresPackage.RATIO_TAP_CHANGER__STEP_VOLTAGE_INCREMENT:
				unsetStepVoltageIncrement();
				return;
			case WiresPackage.RATIO_TAP_CHANGER__RATIO_TAP_CHANGER_TABULAR:
				setRatioTapChangerTabular((RatioTapChangerTabular)null);
				return;
			case WiresPackage.RATIO_TAP_CHANGER__TCUL_CONTROL_MODE:
				unsetTculControlMode();
				return;
			case WiresPackage.RATIO_TAP_CHANGER__TRANSFORMER_END:
				setTransformerEnd((TransformerEnd)null);
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
			case WiresPackage.RATIO_TAP_CHANGER__STEP_VOLTAGE_INCREMENT:
				return isSetStepVoltageIncrement();
			case WiresPackage.RATIO_TAP_CHANGER__RATIO_TAP_CHANGER_TABULAR:
				return ratioTapChangerTabular != null;
			case WiresPackage.RATIO_TAP_CHANGER__TCUL_CONTROL_MODE:
				return isSetTculControlMode();
			case WiresPackage.RATIO_TAP_CHANGER__TRANSFORMER_END:
				return transformerEnd != null;
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
		result.append(" (stepVoltageIncrement: ");
		if (stepVoltageIncrementESet) result.append(stepVoltageIncrement); else result.append("<unset>");
		result.append(", tculControlMode: ");
		if (tculControlModeESet) result.append(tculControlMode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // RatioTapChanger
