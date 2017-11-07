/**
 */
package CIM15.IEC61970.Wires;

import CIM15.Element;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phase Tap Changer Tabular Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint#getX <em>X</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint#getStep <em>Step</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint#getPhaseTapChangerTabular <em>Phase Tap Changer Tabular</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint#getAngle <em>Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhaseTapChangerTabularPoint extends Element {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final float X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected float x = X_EDEFAULT;

	/**
	 * This is true if the X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xESet;

	/**
	 * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected static final int STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected int step = STEP_EDEFAULT;

	/**
	 * This is true if the Step attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stepESet;

	/**
	 * The cached value of the '{@link #getPhaseTapChangerTabular() <em>Phase Tap Changer Tabular</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseTapChangerTabular()
	 * @generated
	 * @ordered
	 */
	protected PhaseTapChangerTabular phaseTapChangerTabular;

	/**
	 * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected static final float ANGLE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected float angle = ANGLE_EDEFAULT;

	/**
	 * This is true if the Angle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean angleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhaseTapChangerTabularPoint() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.PHASE_TAP_CHANGER_TABULAR_POINT;
	}

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #setX(float)
	 * @generated
	 */
	public float getX() {
		return x;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #getX()
	 * @generated
	 */
	public void setX(float newX) {
		x = newX;
		xESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX()
	 * @see #getX()
	 * @see #setX(float)
	 * @generated
	 */
	public void unsetX() {
		x = X_EDEFAULT;
		xESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint#getX <em>X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X</em>' attribute is set.
	 * @see #unsetX()
	 * @see #getX()
	 * @see #setX(float)
	 * @generated
	 */
	public boolean isSetX() {
		return xESet;
	}

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #isSetStep()
	 * @see #unsetStep()
	 * @see #setStep(int)
	 * @generated
	 */
	public int getStep() {
		return step;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #isSetStep()
	 * @see #unsetStep()
	 * @see #getStep()
	 * @generated
	 */
	public void setStep(int newStep) {
		step = newStep;
		stepESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStep()
	 * @see #getStep()
	 * @see #setStep(int)
	 * @generated
	 */
	public void unsetStep() {
		step = STEP_EDEFAULT;
		stepESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint#getStep <em>Step</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Step</em>' attribute is set.
	 * @see #unsetStep()
	 * @see #getStep()
	 * @see #setStep(int)
	 * @generated
	 */
	public boolean isSetStep() {
		return stepESet;
	}

	/**
	 * Returns the value of the '<em><b>Phase Tap Changer Tabular</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabular#getPhaseTapChangerTabularPoint <em>Phase Tap Changer Tabular Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Tap Changer Tabular</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Tap Changer Tabular</em>' reference.
	 * @see #setPhaseTapChangerTabular(PhaseTapChangerTabular)
	 * @see CIM15.IEC61970.Wires.PhaseTapChangerTabular#getPhaseTapChangerTabularPoint
	 * @generated
	 */
	public PhaseTapChangerTabular getPhaseTapChangerTabular() {
		if (phaseTapChangerTabular != null && phaseTapChangerTabular.eIsProxy()) {
			InternalEObject oldPhaseTapChangerTabular = (InternalEObject)phaseTapChangerTabular;
			phaseTapChangerTabular = (PhaseTapChangerTabular)eResolveProxy(oldPhaseTapChangerTabular);
			if (phaseTapChangerTabular != oldPhaseTapChangerTabular) {
			}
		}
		return phaseTapChangerTabular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseTapChangerTabular basicGetPhaseTapChangerTabular() {
		return phaseTapChangerTabular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhaseTapChangerTabular(PhaseTapChangerTabular newPhaseTapChangerTabular, NotificationChain msgs) {
		PhaseTapChangerTabular oldPhaseTapChangerTabular = phaseTapChangerTabular;
		phaseTapChangerTabular = newPhaseTapChangerTabular;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint#getPhaseTapChangerTabular <em>Phase Tap Changer Tabular</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Tap Changer Tabular</em>' reference.
	 * @see #getPhaseTapChangerTabular()
	 * @generated
	 */
	public void setPhaseTapChangerTabular(PhaseTapChangerTabular newPhaseTapChangerTabular) {
		if (newPhaseTapChangerTabular != phaseTapChangerTabular) {
			NotificationChain msgs = null;
			if (phaseTapChangerTabular != null)
				msgs = ((InternalEObject)phaseTapChangerTabular).eInverseRemove(this, WiresPackage.PHASE_TAP_CHANGER_TABULAR__PHASE_TAP_CHANGER_TABULAR_POINT, PhaseTapChangerTabular.class, msgs);
			if (newPhaseTapChangerTabular != null)
				msgs = ((InternalEObject)newPhaseTapChangerTabular).eInverseAdd(this, WiresPackage.PHASE_TAP_CHANGER_TABULAR__PHASE_TAP_CHANGER_TABULAR_POINT, PhaseTapChangerTabular.class, msgs);
			msgs = basicSetPhaseTapChangerTabular(newPhaseTapChangerTabular, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #isSetAngle()
	 * @see #unsetAngle()
	 * @see #setAngle(float)
	 * @generated
	 */
	public float getAngle() {
		return angle;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #isSetAngle()
	 * @see #unsetAngle()
	 * @see #getAngle()
	 * @generated
	 */
	public void setAngle(float newAngle) {
		angle = newAngle;
		angleESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAngle()
	 * @see #getAngle()
	 * @see #setAngle(float)
	 * @generated
	 */
	public void unsetAngle() {
		angle = ANGLE_EDEFAULT;
		angleESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PhaseTapChangerTabularPoint#getAngle <em>Angle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Angle</em>' attribute is set.
	 * @see #unsetAngle()
	 * @see #getAngle()
	 * @see #setAngle(float)
	 * @generated
	 */
	public boolean isSetAngle() {
		return angleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR_POINT__PHASE_TAP_CHANGER_TABULAR:
				if (phaseTapChangerTabular != null)
					msgs = ((InternalEObject)phaseTapChangerTabular).eInverseRemove(this, WiresPackage.PHASE_TAP_CHANGER_TABULAR__PHASE_TAP_CHANGER_TABULAR_POINT, PhaseTapChangerTabular.class, msgs);
				return basicSetPhaseTapChangerTabular((PhaseTapChangerTabular)otherEnd, msgs);
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
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR_POINT__PHASE_TAP_CHANGER_TABULAR:
				return basicSetPhaseTapChangerTabular(null, msgs);
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
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR_POINT__X:
				return getX();
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR_POINT__STEP:
				return getStep();
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR_POINT__PHASE_TAP_CHANGER_TABULAR:
				if (resolve) return getPhaseTapChangerTabular();
				return basicGetPhaseTapChangerTabular();
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR_POINT__ANGLE:
				return getAngle();
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
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR_POINT__X:
				setX((Float)newValue);
				return;
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR_POINT__STEP:
				setStep((Integer)newValue);
				return;
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR_POINT__PHASE_TAP_CHANGER_TABULAR:
				setPhaseTapChangerTabular((PhaseTapChangerTabular)newValue);
				return;
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR_POINT__ANGLE:
				setAngle((Float)newValue);
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
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR_POINT__X:
				unsetX();
				return;
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR_POINT__STEP:
				unsetStep();
				return;
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR_POINT__PHASE_TAP_CHANGER_TABULAR:
				setPhaseTapChangerTabular((PhaseTapChangerTabular)null);
				return;
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR_POINT__ANGLE:
				unsetAngle();
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
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR_POINT__X:
				return isSetX();
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR_POINT__STEP:
				return isSetStep();
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR_POINT__PHASE_TAP_CHANGER_TABULAR:
				return phaseTapChangerTabular != null;
			case WiresPackage.PHASE_TAP_CHANGER_TABULAR_POINT__ANGLE:
				return isSetAngle();
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
		result.append(" (x: ");
		if (xESet) result.append(x); else result.append("<unset>");
		result.append(", step: ");
		if (stepESet) result.append(step); else result.append("<unset>");
		result.append(", angle: ");
		if (angleESet) result.append(angle); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // PhaseTapChangerTabularPoint
