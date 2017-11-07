/**
 */
package CIM15.IEC61970.Protection;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Wires.ProtectedSwitch;
import CIM15.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reclose Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Protection.RecloseSequence#getRecloseStep <em>Reclose Step</em>}</li>
 *   <li>{@link CIM15.IEC61970.Protection.RecloseSequence#getProtectedSwitch <em>Protected Switch</em>}</li>
 *   <li>{@link CIM15.IEC61970.Protection.RecloseSequence#getRecloseDelay <em>Reclose Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecloseSequence extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getRecloseStep() <em>Reclose Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecloseStep()
	 * @generated
	 * @ordered
	 */
	protected static final int RECLOSE_STEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRecloseStep() <em>Reclose Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecloseStep()
	 * @generated
	 * @ordered
	 */
	protected int recloseStep = RECLOSE_STEP_EDEFAULT;

	/**
	 * This is true if the Reclose Step attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean recloseStepESet;

	/**
	 * The cached value of the '{@link #getProtectedSwitch() <em>Protected Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectedSwitch()
	 * @generated
	 * @ordered
	 */
	protected ProtectedSwitch protectedSwitch;

	/**
	 * The default value of the '{@link #getRecloseDelay() <em>Reclose Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecloseDelay()
	 * @generated
	 * @ordered
	 */
	protected static final float RECLOSE_DELAY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRecloseDelay() <em>Reclose Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecloseDelay()
	 * @generated
	 * @ordered
	 */
	protected float recloseDelay = RECLOSE_DELAY_EDEFAULT;

	/**
	 * This is true if the Reclose Delay attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean recloseDelayESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecloseSequence() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtectionPackage.Literals.RECLOSE_SEQUENCE;
	}

	/**
	 * Returns the value of the '<em><b>Reclose Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reclose Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reclose Step</em>' attribute.
	 * @see #isSetRecloseStep()
	 * @see #unsetRecloseStep()
	 * @see #setRecloseStep(int)
	 * @generated
	 */
	public int getRecloseStep() {
		return recloseStep;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Protection.RecloseSequence#getRecloseStep <em>Reclose Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reclose Step</em>' attribute.
	 * @see #isSetRecloseStep()
	 * @see #unsetRecloseStep()
	 * @see #getRecloseStep()
	 * @generated
	 */
	public void setRecloseStep(int newRecloseStep) {
		recloseStep = newRecloseStep;
		recloseStepESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Protection.RecloseSequence#getRecloseStep <em>Reclose Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRecloseStep()
	 * @see #getRecloseStep()
	 * @see #setRecloseStep(int)
	 * @generated
	 */
	public void unsetRecloseStep() {
		recloseStep = RECLOSE_STEP_EDEFAULT;
		recloseStepESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Protection.RecloseSequence#getRecloseStep <em>Reclose Step</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reclose Step</em>' attribute is set.
	 * @see #unsetRecloseStep()
	 * @see #getRecloseStep()
	 * @see #setRecloseStep(int)
	 * @generated
	 */
	public boolean isSetRecloseStep() {
		return recloseStepESet;
	}

	/**
	 * Returns the value of the '<em><b>Protected Switch</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.ProtectedSwitch#getRecloseSequences <em>Reclose Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protected Switch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protected Switch</em>' reference.
	 * @see #setProtectedSwitch(ProtectedSwitch)
	 * @see CIM15.IEC61970.Wires.ProtectedSwitch#getRecloseSequences
	 * @generated
	 */
	public ProtectedSwitch getProtectedSwitch() {
		if (protectedSwitch != null && protectedSwitch.eIsProxy()) {
			InternalEObject oldProtectedSwitch = (InternalEObject)protectedSwitch;
			protectedSwitch = (ProtectedSwitch)eResolveProxy(oldProtectedSwitch);
			if (protectedSwitch != oldProtectedSwitch) {
			}
		}
		return protectedSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectedSwitch basicGetProtectedSwitch() {
		return protectedSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtectedSwitch(ProtectedSwitch newProtectedSwitch, NotificationChain msgs) {
		ProtectedSwitch oldProtectedSwitch = protectedSwitch;
		protectedSwitch = newProtectedSwitch;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Protection.RecloseSequence#getProtectedSwitch <em>Protected Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protected Switch</em>' reference.
	 * @see #getProtectedSwitch()
	 * @generated
	 */
	public void setProtectedSwitch(ProtectedSwitch newProtectedSwitch) {
		if (newProtectedSwitch != protectedSwitch) {
			NotificationChain msgs = null;
			if (protectedSwitch != null)
				msgs = ((InternalEObject)protectedSwitch).eInverseRemove(this, WiresPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES, ProtectedSwitch.class, msgs);
			if (newProtectedSwitch != null)
				msgs = ((InternalEObject)newProtectedSwitch).eInverseAdd(this, WiresPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES, ProtectedSwitch.class, msgs);
			msgs = basicSetProtectedSwitch(newProtectedSwitch, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Reclose Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reclose Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reclose Delay</em>' attribute.
	 * @see #isSetRecloseDelay()
	 * @see #unsetRecloseDelay()
	 * @see #setRecloseDelay(float)
	 * @generated
	 */
	public float getRecloseDelay() {
		return recloseDelay;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Protection.RecloseSequence#getRecloseDelay <em>Reclose Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reclose Delay</em>' attribute.
	 * @see #isSetRecloseDelay()
	 * @see #unsetRecloseDelay()
	 * @see #getRecloseDelay()
	 * @generated
	 */
	public void setRecloseDelay(float newRecloseDelay) {
		recloseDelay = newRecloseDelay;
		recloseDelayESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Protection.RecloseSequence#getRecloseDelay <em>Reclose Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRecloseDelay()
	 * @see #getRecloseDelay()
	 * @see #setRecloseDelay(float)
	 * @generated
	 */
	public void unsetRecloseDelay() {
		recloseDelay = RECLOSE_DELAY_EDEFAULT;
		recloseDelayESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Protection.RecloseSequence#getRecloseDelay <em>Reclose Delay</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reclose Delay</em>' attribute is set.
	 * @see #unsetRecloseDelay()
	 * @see #getRecloseDelay()
	 * @see #setRecloseDelay(float)
	 * @generated
	 */
	public boolean isSetRecloseDelay() {
		return recloseDelayESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProtectionPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH:
				if (protectedSwitch != null)
					msgs = ((InternalEObject)protectedSwitch).eInverseRemove(this, WiresPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES, ProtectedSwitch.class, msgs);
				return basicSetProtectedSwitch((ProtectedSwitch)otherEnd, msgs);
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
			case ProtectionPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH:
				return basicSetProtectedSwitch(null, msgs);
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
			case ProtectionPackage.RECLOSE_SEQUENCE__RECLOSE_STEP:
				return getRecloseStep();
			case ProtectionPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH:
				if (resolve) return getProtectedSwitch();
				return basicGetProtectedSwitch();
			case ProtectionPackage.RECLOSE_SEQUENCE__RECLOSE_DELAY:
				return getRecloseDelay();
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
			case ProtectionPackage.RECLOSE_SEQUENCE__RECLOSE_STEP:
				setRecloseStep((Integer)newValue);
				return;
			case ProtectionPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH:
				setProtectedSwitch((ProtectedSwitch)newValue);
				return;
			case ProtectionPackage.RECLOSE_SEQUENCE__RECLOSE_DELAY:
				setRecloseDelay((Float)newValue);
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
			case ProtectionPackage.RECLOSE_SEQUENCE__RECLOSE_STEP:
				unsetRecloseStep();
				return;
			case ProtectionPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH:
				setProtectedSwitch((ProtectedSwitch)null);
				return;
			case ProtectionPackage.RECLOSE_SEQUENCE__RECLOSE_DELAY:
				unsetRecloseDelay();
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
			case ProtectionPackage.RECLOSE_SEQUENCE__RECLOSE_STEP:
				return isSetRecloseStep();
			case ProtectionPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH:
				return protectedSwitch != null;
			case ProtectionPackage.RECLOSE_SEQUENCE__RECLOSE_DELAY:
				return isSetRecloseDelay();
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
		result.append(" (recloseStep: ");
		if (recloseStepESet) result.append(recloseStep); else result.append("<unset>");
		result.append(", recloseDelay: ");
		if (recloseDelayESet) result.append(recloseDelay); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // RecloseSequence
