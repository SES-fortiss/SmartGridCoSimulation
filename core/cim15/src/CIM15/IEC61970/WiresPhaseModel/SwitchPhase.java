/**
 */
package CIM15.IEC61970.WiresPhaseModel;

import CIM15.IEC61970.Core.PowerSystemResource;

import CIM15.IEC61970.Wires.Switch;
import CIM15.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.WiresPhaseModel.SwitchPhase#getPhaseSide1 <em>Phase Side1</em>}</li>
 *   <li>{@link CIM15.IEC61970.WiresPhaseModel.SwitchPhase#getPhaseSide2 <em>Phase Side2</em>}</li>
 *   <li>{@link CIM15.IEC61970.WiresPhaseModel.SwitchPhase#isNormalOpen <em>Normal Open</em>}</li>
 *   <li>{@link CIM15.IEC61970.WiresPhaseModel.SwitchPhase#getSwitch <em>Switch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchPhase extends PowerSystemResource {
	/**
	 * The default value of the '{@link #getPhaseSide1() <em>Phase Side1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseSide1()
	 * @generated
	 * @ordered
	 */
	protected static final SinglePhaseKind PHASE_SIDE1_EDEFAULT = SinglePhaseKind.C;

	/**
	 * The cached value of the '{@link #getPhaseSide1() <em>Phase Side1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseSide1()
	 * @generated
	 * @ordered
	 */
	protected SinglePhaseKind phaseSide1 = PHASE_SIDE1_EDEFAULT;

	/**
	 * This is true if the Phase Side1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phaseSide1ESet;

	/**
	 * The default value of the '{@link #getPhaseSide2() <em>Phase Side2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseSide2()
	 * @generated
	 * @ordered
	 */
	protected static final SinglePhaseKind PHASE_SIDE2_EDEFAULT = SinglePhaseKind.C;

	/**
	 * The cached value of the '{@link #getPhaseSide2() <em>Phase Side2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseSide2()
	 * @generated
	 * @ordered
	 */
	protected SinglePhaseKind phaseSide2 = PHASE_SIDE2_EDEFAULT;

	/**
	 * This is true if the Phase Side2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phaseSide2ESet;

	/**
	 * The default value of the '{@link #isNormalOpen() <em>Normal Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNormalOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NORMAL_OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNormalOpen() <em>Normal Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNormalOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean normalOpen = NORMAL_OPEN_EDEFAULT;

	/**
	 * This is true if the Normal Open attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean normalOpenESet;

	/**
	 * The cached value of the '{@link #getSwitch() <em>Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitch()
	 * @generated
	 * @ordered
	 */
	protected Switch switch_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchPhase() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPhaseModelPackage.Literals.SWITCH_PHASE;
	}

	/**
	 * Returns the value of the '<em><b>Phase Side1</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.WiresPhaseModel.SinglePhaseKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Side1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Side1</em>' attribute.
	 * @see CIM15.IEC61970.WiresPhaseModel.SinglePhaseKind
	 * @see #isSetPhaseSide1()
	 * @see #unsetPhaseSide1()
	 * @see #setPhaseSide1(SinglePhaseKind)
	 * @generated
	 */
	public SinglePhaseKind getPhaseSide1() {
		return phaseSide1;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.WiresPhaseModel.SwitchPhase#getPhaseSide1 <em>Phase Side1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Side1</em>' attribute.
	 * @see CIM15.IEC61970.WiresPhaseModel.SinglePhaseKind
	 * @see #isSetPhaseSide1()
	 * @see #unsetPhaseSide1()
	 * @see #getPhaseSide1()
	 * @generated
	 */
	public void setPhaseSide1(SinglePhaseKind newPhaseSide1) {
		phaseSide1 = newPhaseSide1 == null ? PHASE_SIDE1_EDEFAULT : newPhaseSide1;
		phaseSide1ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.WiresPhaseModel.SwitchPhase#getPhaseSide1 <em>Phase Side1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhaseSide1()
	 * @see #getPhaseSide1()
	 * @see #setPhaseSide1(SinglePhaseKind)
	 * @generated
	 */
	public void unsetPhaseSide1() {
		phaseSide1 = PHASE_SIDE1_EDEFAULT;
		phaseSide1ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.WiresPhaseModel.SwitchPhase#getPhaseSide1 <em>Phase Side1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase Side1</em>' attribute is set.
	 * @see #unsetPhaseSide1()
	 * @see #getPhaseSide1()
	 * @see #setPhaseSide1(SinglePhaseKind)
	 * @generated
	 */
	public boolean isSetPhaseSide1() {
		return phaseSide1ESet;
	}

	/**
	 * Returns the value of the '<em><b>Phase Side2</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.WiresPhaseModel.SinglePhaseKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Side2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Side2</em>' attribute.
	 * @see CIM15.IEC61970.WiresPhaseModel.SinglePhaseKind
	 * @see #isSetPhaseSide2()
	 * @see #unsetPhaseSide2()
	 * @see #setPhaseSide2(SinglePhaseKind)
	 * @generated
	 */
	public SinglePhaseKind getPhaseSide2() {
		return phaseSide2;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.WiresPhaseModel.SwitchPhase#getPhaseSide2 <em>Phase Side2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Side2</em>' attribute.
	 * @see CIM15.IEC61970.WiresPhaseModel.SinglePhaseKind
	 * @see #isSetPhaseSide2()
	 * @see #unsetPhaseSide2()
	 * @see #getPhaseSide2()
	 * @generated
	 */
	public void setPhaseSide2(SinglePhaseKind newPhaseSide2) {
		phaseSide2 = newPhaseSide2 == null ? PHASE_SIDE2_EDEFAULT : newPhaseSide2;
		phaseSide2ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.WiresPhaseModel.SwitchPhase#getPhaseSide2 <em>Phase Side2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhaseSide2()
	 * @see #getPhaseSide2()
	 * @see #setPhaseSide2(SinglePhaseKind)
	 * @generated
	 */
	public void unsetPhaseSide2() {
		phaseSide2 = PHASE_SIDE2_EDEFAULT;
		phaseSide2ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.WiresPhaseModel.SwitchPhase#getPhaseSide2 <em>Phase Side2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase Side2</em>' attribute is set.
	 * @see #unsetPhaseSide2()
	 * @see #getPhaseSide2()
	 * @see #setPhaseSide2(SinglePhaseKind)
	 * @generated
	 */
	public boolean isSetPhaseSide2() {
		return phaseSide2ESet;
	}

	/**
	 * Returns the value of the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Open</em>' attribute.
	 * @see #isSetNormalOpen()
	 * @see #unsetNormalOpen()
	 * @see #setNormalOpen(boolean)
	 * @generated
	 */
	public boolean isNormalOpen() {
		return normalOpen;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.WiresPhaseModel.SwitchPhase#isNormalOpen <em>Normal Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Open</em>' attribute.
	 * @see #isSetNormalOpen()
	 * @see #unsetNormalOpen()
	 * @see #isNormalOpen()
	 * @generated
	 */
	public void setNormalOpen(boolean newNormalOpen) {
		normalOpen = newNormalOpen;
		normalOpenESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.WiresPhaseModel.SwitchPhase#isNormalOpen <em>Normal Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNormalOpen()
	 * @see #isNormalOpen()
	 * @see #setNormalOpen(boolean)
	 * @generated
	 */
	public void unsetNormalOpen() {
		normalOpen = NORMAL_OPEN_EDEFAULT;
		normalOpenESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.WiresPhaseModel.SwitchPhase#isNormalOpen <em>Normal Open</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Normal Open</em>' attribute is set.
	 * @see #unsetNormalOpen()
	 * @see #isNormalOpen()
	 * @see #setNormalOpen(boolean)
	 * @generated
	 */
	public boolean isSetNormalOpen() {
		return normalOpenESet;
	}

	/**
	 * Returns the value of the '<em><b>Switch</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.Switch#getSwitchPhases <em>Switch Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch</em>' reference.
	 * @see #setSwitch(Switch)
	 * @see CIM15.IEC61970.Wires.Switch#getSwitchPhases
	 * @generated
	 */
	public Switch getSwitch() {
		if (switch_ != null && switch_.eIsProxy()) {
			InternalEObject oldSwitch = (InternalEObject)switch_;
			switch_ = (Switch)eResolveProxy(oldSwitch);
			if (switch_ != oldSwitch) {
			}
		}
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch basicGetSwitch() {
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwitch(Switch newSwitch, NotificationChain msgs) {
		Switch oldSwitch = switch_;
		switch_ = newSwitch;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.WiresPhaseModel.SwitchPhase#getSwitch <em>Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch</em>' reference.
	 * @see #getSwitch()
	 * @generated
	 */
	public void setSwitch(Switch newSwitch) {
		if (newSwitch != switch_) {
			NotificationChain msgs = null;
			if (switch_ != null)
				msgs = ((InternalEObject)switch_).eInverseRemove(this, WiresPackage.SWITCH__SWITCH_PHASES, Switch.class, msgs);
			if (newSwitch != null)
				msgs = ((InternalEObject)newSwitch).eInverseAdd(this, WiresPackage.SWITCH__SWITCH_PHASES, Switch.class, msgs);
			msgs = basicSetSwitch(newSwitch, msgs);
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
			case WiresPhaseModelPackage.SWITCH_PHASE__SWITCH:
				if (switch_ != null)
					msgs = ((InternalEObject)switch_).eInverseRemove(this, WiresPackage.SWITCH__SWITCH_PHASES, Switch.class, msgs);
				return basicSetSwitch((Switch)otherEnd, msgs);
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
			case WiresPhaseModelPackage.SWITCH_PHASE__SWITCH:
				return basicSetSwitch(null, msgs);
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
			case WiresPhaseModelPackage.SWITCH_PHASE__PHASE_SIDE1:
				return getPhaseSide1();
			case WiresPhaseModelPackage.SWITCH_PHASE__PHASE_SIDE2:
				return getPhaseSide2();
			case WiresPhaseModelPackage.SWITCH_PHASE__NORMAL_OPEN:
				return isNormalOpen();
			case WiresPhaseModelPackage.SWITCH_PHASE__SWITCH:
				if (resolve) return getSwitch();
				return basicGetSwitch();
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
			case WiresPhaseModelPackage.SWITCH_PHASE__PHASE_SIDE1:
				setPhaseSide1((SinglePhaseKind)newValue);
				return;
			case WiresPhaseModelPackage.SWITCH_PHASE__PHASE_SIDE2:
				setPhaseSide2((SinglePhaseKind)newValue);
				return;
			case WiresPhaseModelPackage.SWITCH_PHASE__NORMAL_OPEN:
				setNormalOpen((Boolean)newValue);
				return;
			case WiresPhaseModelPackage.SWITCH_PHASE__SWITCH:
				setSwitch((Switch)newValue);
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
			case WiresPhaseModelPackage.SWITCH_PHASE__PHASE_SIDE1:
				unsetPhaseSide1();
				return;
			case WiresPhaseModelPackage.SWITCH_PHASE__PHASE_SIDE2:
				unsetPhaseSide2();
				return;
			case WiresPhaseModelPackage.SWITCH_PHASE__NORMAL_OPEN:
				unsetNormalOpen();
				return;
			case WiresPhaseModelPackage.SWITCH_PHASE__SWITCH:
				setSwitch((Switch)null);
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
			case WiresPhaseModelPackage.SWITCH_PHASE__PHASE_SIDE1:
				return isSetPhaseSide1();
			case WiresPhaseModelPackage.SWITCH_PHASE__PHASE_SIDE2:
				return isSetPhaseSide2();
			case WiresPhaseModelPackage.SWITCH_PHASE__NORMAL_OPEN:
				return isSetNormalOpen();
			case WiresPhaseModelPackage.SWITCH_PHASE__SWITCH:
				return switch_ != null;
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
		result.append(" (phaseSide1: ");
		if (phaseSide1ESet) result.append(phaseSide1); else result.append("<unset>");
		result.append(", phaseSide2: ");
		if (phaseSide2ESet) result.append(phaseSide2); else result.append("<unset>");
		result.append(", normalOpen: ");
		if (normalOpenESet) result.append(normalOpen); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // SwitchPhase
