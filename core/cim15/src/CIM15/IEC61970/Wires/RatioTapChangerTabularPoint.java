/**
 */
package CIM15.IEC61970.Wires;

import CIM15.Element;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ratio Tap Changer Tabular Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.RatioTapChangerTabularPoint#getX <em>X</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RatioTapChangerTabularPoint#getRatioTapChangerTabular <em>Ratio Tap Changer Tabular</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RatioTapChangerTabularPoint#getRatio <em>Ratio</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RatioTapChangerTabularPoint#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RatioTapChangerTabularPoint extends Element {
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
	 * The cached value of the '{@link #getRatioTapChangerTabular() <em>Ratio Tap Changer Tabular</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatioTapChangerTabular()
	 * @generated
	 * @ordered
	 */
	protected RatioTapChangerTabular ratioTapChangerTabular;

	/**
	 * The default value of the '{@link #getRatio() <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatio()
	 * @generated
	 * @ordered
	 */
	protected static final float RATIO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatio() <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatio()
	 * @generated
	 * @ordered
	 */
	protected float ratio = RATIO_EDEFAULT;

	/**
	 * This is true if the Ratio attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ratioESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RatioTapChangerTabularPoint() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.RATIO_TAP_CHANGER_TABULAR_POINT;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RatioTapChangerTabularPoint#getX <em>X</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.RatioTapChangerTabularPoint#getX <em>X</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.RatioTapChangerTabularPoint#getX <em>X</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Ratio Tap Changer Tabular</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.RatioTapChangerTabular#getRatioTapChangerTabularPoint <em>Ratio Tap Changer Tabular Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratio Tap Changer Tabular</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratio Tap Changer Tabular</em>' reference.
	 * @see #setRatioTapChangerTabular(RatioTapChangerTabular)
	 * @see CIM15.IEC61970.Wires.RatioTapChangerTabular#getRatioTapChangerTabularPoint
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RatioTapChangerTabularPoint#getRatioTapChangerTabular <em>Ratio Tap Changer Tabular</em>}' reference.
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
				msgs = ((InternalEObject)ratioTapChangerTabular).eInverseRemove(this, WiresPackage.RATIO_TAP_CHANGER_TABULAR__RATIO_TAP_CHANGER_TABULAR_POINT, RatioTapChangerTabular.class, msgs);
			if (newRatioTapChangerTabular != null)
				msgs = ((InternalEObject)newRatioTapChangerTabular).eInverseAdd(this, WiresPackage.RATIO_TAP_CHANGER_TABULAR__RATIO_TAP_CHANGER_TABULAR_POINT, RatioTapChangerTabular.class, msgs);
			msgs = basicSetRatioTapChangerTabular(newRatioTapChangerTabular, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratio</em>' attribute.
	 * @see #isSetRatio()
	 * @see #unsetRatio()
	 * @see #setRatio(float)
	 * @generated
	 */
	public float getRatio() {
		return ratio;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RatioTapChangerTabularPoint#getRatio <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratio</em>' attribute.
	 * @see #isSetRatio()
	 * @see #unsetRatio()
	 * @see #getRatio()
	 * @generated
	 */
	public void setRatio(float newRatio) {
		ratio = newRatio;
		ratioESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.RatioTapChangerTabularPoint#getRatio <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatio()
	 * @see #getRatio()
	 * @see #setRatio(float)
	 * @generated
	 */
	public void unsetRatio() {
		ratio = RATIO_EDEFAULT;
		ratioESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.RatioTapChangerTabularPoint#getRatio <em>Ratio</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ratio</em>' attribute is set.
	 * @see #unsetRatio()
	 * @see #getRatio()
	 * @see #setRatio(float)
	 * @generated
	 */
	public boolean isSetRatio() {
		return ratioESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RatioTapChangerTabularPoint#getStep <em>Step</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.RatioTapChangerTabularPoint#getStep <em>Step</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.RatioTapChangerTabularPoint#getStep <em>Step</em>}' attribute is set.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR_POINT__RATIO_TAP_CHANGER_TABULAR:
				if (ratioTapChangerTabular != null)
					msgs = ((InternalEObject)ratioTapChangerTabular).eInverseRemove(this, WiresPackage.RATIO_TAP_CHANGER_TABULAR__RATIO_TAP_CHANGER_TABULAR_POINT, RatioTapChangerTabular.class, msgs);
				return basicSetRatioTapChangerTabular((RatioTapChangerTabular)otherEnd, msgs);
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
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR_POINT__RATIO_TAP_CHANGER_TABULAR:
				return basicSetRatioTapChangerTabular(null, msgs);
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
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR_POINT__X:
				return getX();
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR_POINT__RATIO_TAP_CHANGER_TABULAR:
				if (resolve) return getRatioTapChangerTabular();
				return basicGetRatioTapChangerTabular();
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR_POINT__RATIO:
				return getRatio();
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR_POINT__STEP:
				return getStep();
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
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR_POINT__X:
				setX((Float)newValue);
				return;
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR_POINT__RATIO_TAP_CHANGER_TABULAR:
				setRatioTapChangerTabular((RatioTapChangerTabular)newValue);
				return;
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR_POINT__RATIO:
				setRatio((Float)newValue);
				return;
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR_POINT__STEP:
				setStep((Integer)newValue);
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
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR_POINT__X:
				unsetX();
				return;
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR_POINT__RATIO_TAP_CHANGER_TABULAR:
				setRatioTapChangerTabular((RatioTapChangerTabular)null);
				return;
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR_POINT__RATIO:
				unsetRatio();
				return;
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR_POINT__STEP:
				unsetStep();
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
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR_POINT__X:
				return isSetX();
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR_POINT__RATIO_TAP_CHANGER_TABULAR:
				return ratioTapChangerTabular != null;
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR_POINT__RATIO:
				return isSetRatio();
			case WiresPackage.RATIO_TAP_CHANGER_TABULAR_POINT__STEP:
				return isSetStep();
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
		result.append(", ratio: ");
		if (ratioESet) result.append(ratio); else result.append("<unset>");
		result.append(", step: ");
		if (stepESet) result.append(step); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // RatioTapChangerTabularPoint
