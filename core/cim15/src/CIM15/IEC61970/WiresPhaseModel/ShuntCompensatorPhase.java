/**
 */
package CIM15.IEC61970.WiresPhaseModel;

import CIM15.IEC61970.Core.PowerSystemResource;

import CIM15.IEC61970.Wires.ShuntCompensator;
import CIM15.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shunt Compensator Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.WiresPhaseModel.ShuntCompensatorPhase#getShuntCompensator <em>Shunt Compensator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShuntCompensatorPhase extends PowerSystemResource {
	/**
	 * The cached value of the '{@link #getShuntCompensator() <em>Shunt Compensator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShuntCompensator()
	 * @generated
	 * @ordered
	 */
	protected ShuntCompensator shuntCompensator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShuntCompensatorPhase() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPhaseModelPackage.Literals.SHUNT_COMPENSATOR_PHASE;
	}

	/**
	 * Returns the value of the '<em><b>Shunt Compensator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.ShuntCompensator#getShuntCompensatorPhases <em>Shunt Compensator Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shunt Compensator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shunt Compensator</em>' reference.
	 * @see #setShuntCompensator(ShuntCompensator)
	 * @see CIM15.IEC61970.Wires.ShuntCompensator#getShuntCompensatorPhases
	 * @generated
	 */
	public ShuntCompensator getShuntCompensator() {
		if (shuntCompensator != null && shuntCompensator.eIsProxy()) {
			InternalEObject oldShuntCompensator = (InternalEObject)shuntCompensator;
			shuntCompensator = (ShuntCompensator)eResolveProxy(oldShuntCompensator);
			if (shuntCompensator != oldShuntCompensator) {
			}
		}
		return shuntCompensator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShuntCompensator basicGetShuntCompensator() {
		return shuntCompensator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShuntCompensator(ShuntCompensator newShuntCompensator, NotificationChain msgs) {
		ShuntCompensator oldShuntCompensator = shuntCompensator;
		shuntCompensator = newShuntCompensator;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.WiresPhaseModel.ShuntCompensatorPhase#getShuntCompensator <em>Shunt Compensator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shunt Compensator</em>' reference.
	 * @see #getShuntCompensator()
	 * @generated
	 */
	public void setShuntCompensator(ShuntCompensator newShuntCompensator) {
		if (newShuntCompensator != shuntCompensator) {
			NotificationChain msgs = null;
			if (shuntCompensator != null)
				msgs = ((InternalEObject)shuntCompensator).eInverseRemove(this, WiresPackage.SHUNT_COMPENSATOR__SHUNT_COMPENSATOR_PHASES, ShuntCompensator.class, msgs);
			if (newShuntCompensator != null)
				msgs = ((InternalEObject)newShuntCompensator).eInverseAdd(this, WiresPackage.SHUNT_COMPENSATOR__SHUNT_COMPENSATOR_PHASES, ShuntCompensator.class, msgs);
			msgs = basicSetShuntCompensator(newShuntCompensator, msgs);
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
			case WiresPhaseModelPackage.SHUNT_COMPENSATOR_PHASE__SHUNT_COMPENSATOR:
				if (shuntCompensator != null)
					msgs = ((InternalEObject)shuntCompensator).eInverseRemove(this, WiresPackage.SHUNT_COMPENSATOR__SHUNT_COMPENSATOR_PHASES, ShuntCompensator.class, msgs);
				return basicSetShuntCompensator((ShuntCompensator)otherEnd, msgs);
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
			case WiresPhaseModelPackage.SHUNT_COMPENSATOR_PHASE__SHUNT_COMPENSATOR:
				return basicSetShuntCompensator(null, msgs);
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
			case WiresPhaseModelPackage.SHUNT_COMPENSATOR_PHASE__SHUNT_COMPENSATOR:
				if (resolve) return getShuntCompensator();
				return basicGetShuntCompensator();
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
			case WiresPhaseModelPackage.SHUNT_COMPENSATOR_PHASE__SHUNT_COMPENSATOR:
				setShuntCompensator((ShuntCompensator)newValue);
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
			case WiresPhaseModelPackage.SHUNT_COMPENSATOR_PHASE__SHUNT_COMPENSATOR:
				setShuntCompensator((ShuntCompensator)null);
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
			case WiresPhaseModelPackage.SHUNT_COMPENSATOR_PHASE__SHUNT_COMPENSATOR:
				return shuntCompensator != null;
		}
		return super.eIsSet(featureID);
	}

} // ShuntCompensatorPhase
