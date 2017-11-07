/**
 */
package CIM15.IEC61970.StateVariables;

import CIM15.IEC61970.Wires.TapChanger;
import CIM15.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sv Tap Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.StateVariables.SvTapStep#getTapChanger <em>Tap Changer</em>}</li>
 *   <li>{@link CIM15.IEC61970.StateVariables.SvTapStep#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SvTapStep extends StateVariable {
	/**
	 * The cached value of the '{@link #getTapChanger() <em>Tap Changer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapChanger()
	 * @generated
	 * @ordered
	 */
	protected TapChanger tapChanger;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final float POSITION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected float position = POSITION_EDEFAULT;

	/**
	 * This is true if the Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean positionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SvTapStep() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateVariablesPackage.Literals.SV_TAP_STEP;
	}

	/**
	 * Returns the value of the '<em><b>Tap Changer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TapChanger#getSvTapStep <em>Sv Tap Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap Changer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap Changer</em>' reference.
	 * @see #setTapChanger(TapChanger)
	 * @see CIM15.IEC61970.Wires.TapChanger#getSvTapStep
	 * @generated
	 */
	public TapChanger getTapChanger() {
		if (tapChanger != null && tapChanger.eIsProxy()) {
			InternalEObject oldTapChanger = (InternalEObject)tapChanger;
			tapChanger = (TapChanger)eResolveProxy(oldTapChanger);
			if (tapChanger != oldTapChanger) {
			}
		}
		return tapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapChanger basicGetTapChanger() {
		return tapChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTapChanger(TapChanger newTapChanger, NotificationChain msgs) {
		TapChanger oldTapChanger = tapChanger;
		tapChanger = newTapChanger;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.StateVariables.SvTapStep#getTapChanger <em>Tap Changer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tap Changer</em>' reference.
	 * @see #getTapChanger()
	 * @generated
	 */
	public void setTapChanger(TapChanger newTapChanger) {
		if (newTapChanger != tapChanger) {
			NotificationChain msgs = null;
			if (tapChanger != null)
				msgs = ((InternalEObject)tapChanger).eInverseRemove(this, WiresPackage.TAP_CHANGER__SV_TAP_STEP, TapChanger.class, msgs);
			if (newTapChanger != null)
				msgs = ((InternalEObject)newTapChanger).eInverseAdd(this, WiresPackage.TAP_CHANGER__SV_TAP_STEP, TapChanger.class, msgs);
			msgs = basicSetTapChanger(newTapChanger, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #isSetPosition()
	 * @see #unsetPosition()
	 * @see #setPosition(float)
	 * @generated
	 */
	public float getPosition() {
		return position;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.StateVariables.SvTapStep#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #isSetPosition()
	 * @see #unsetPosition()
	 * @see #getPosition()
	 * @generated
	 */
	public void setPosition(float newPosition) {
		position = newPosition;
		positionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.StateVariables.SvTapStep#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPosition()
	 * @see #getPosition()
	 * @see #setPosition(float)
	 * @generated
	 */
	public void unsetPosition() {
		position = POSITION_EDEFAULT;
		positionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.StateVariables.SvTapStep#getPosition <em>Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Position</em>' attribute is set.
	 * @see #unsetPosition()
	 * @see #getPosition()
	 * @see #setPosition(float)
	 * @generated
	 */
	public boolean isSetPosition() {
		return positionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateVariablesPackage.SV_TAP_STEP__TAP_CHANGER:
				if (tapChanger != null)
					msgs = ((InternalEObject)tapChanger).eInverseRemove(this, WiresPackage.TAP_CHANGER__SV_TAP_STEP, TapChanger.class, msgs);
				return basicSetTapChanger((TapChanger)otherEnd, msgs);
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
			case StateVariablesPackage.SV_TAP_STEP__TAP_CHANGER:
				return basicSetTapChanger(null, msgs);
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
			case StateVariablesPackage.SV_TAP_STEP__TAP_CHANGER:
				if (resolve) return getTapChanger();
				return basicGetTapChanger();
			case StateVariablesPackage.SV_TAP_STEP__POSITION:
				return getPosition();
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
			case StateVariablesPackage.SV_TAP_STEP__TAP_CHANGER:
				setTapChanger((TapChanger)newValue);
				return;
			case StateVariablesPackage.SV_TAP_STEP__POSITION:
				setPosition((Float)newValue);
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
			case StateVariablesPackage.SV_TAP_STEP__TAP_CHANGER:
				setTapChanger((TapChanger)null);
				return;
			case StateVariablesPackage.SV_TAP_STEP__POSITION:
				unsetPosition();
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
			case StateVariablesPackage.SV_TAP_STEP__TAP_CHANGER:
				return tapChanger != null;
			case StateVariablesPackage.SV_TAP_STEP__POSITION:
				return isSetPosition();
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
		result.append(" (position: ");
		if (positionESet) result.append(position); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // SvTapStep
