/**
 */
package CIM15.IEC61970.Wires;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Busbar Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.BusbarSection#getVoltageControlZone <em>Voltage Control Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusbarSection extends Connector {
	/**
	 * The cached value of the '{@link #getVoltageControlZone() <em>Voltage Control Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageControlZone()
	 * @generated
	 * @ordered
	 */
	protected VoltageControlZone voltageControlZone;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusbarSection() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.BUSBAR_SECTION;
	}

	/**
	 * Returns the value of the '<em><b>Voltage Control Zone</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.VoltageControlZone#getBusbarSection <em>Busbar Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Control Zone</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Control Zone</em>' reference.
	 * @see #setVoltageControlZone(VoltageControlZone)
	 * @see CIM15.IEC61970.Wires.VoltageControlZone#getBusbarSection
	 * @generated
	 */
	public VoltageControlZone getVoltageControlZone() {
		if (voltageControlZone != null && voltageControlZone.eIsProxy()) {
			InternalEObject oldVoltageControlZone = (InternalEObject)voltageControlZone;
			voltageControlZone = (VoltageControlZone)eResolveProxy(oldVoltageControlZone);
			if (voltageControlZone != oldVoltageControlZone) {
			}
		}
		return voltageControlZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageControlZone basicGetVoltageControlZone() {
		return voltageControlZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVoltageControlZone(VoltageControlZone newVoltageControlZone, NotificationChain msgs) {
		VoltageControlZone oldVoltageControlZone = voltageControlZone;
		voltageControlZone = newVoltageControlZone;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.BusbarSection#getVoltageControlZone <em>Voltage Control Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Control Zone</em>' reference.
	 * @see #getVoltageControlZone()
	 * @generated
	 */
	public void setVoltageControlZone(VoltageControlZone newVoltageControlZone) {
		if (newVoltageControlZone != voltageControlZone) {
			NotificationChain msgs = null;
			if (voltageControlZone != null)
				msgs = ((InternalEObject)voltageControlZone).eInverseRemove(this, WiresPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION, VoltageControlZone.class, msgs);
			if (newVoltageControlZone != null)
				msgs = ((InternalEObject)newVoltageControlZone).eInverseAdd(this, WiresPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION, VoltageControlZone.class, msgs);
			msgs = basicSetVoltageControlZone(newVoltageControlZone, msgs);
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
			case WiresPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE:
				if (voltageControlZone != null)
					msgs = ((InternalEObject)voltageControlZone).eInverseRemove(this, WiresPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION, VoltageControlZone.class, msgs);
				return basicSetVoltageControlZone((VoltageControlZone)otherEnd, msgs);
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
			case WiresPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE:
				return basicSetVoltageControlZone(null, msgs);
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
			case WiresPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE:
				if (resolve) return getVoltageControlZone();
				return basicGetVoltageControlZone();
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
			case WiresPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE:
				setVoltageControlZone((VoltageControlZone)newValue);
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
			case WiresPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE:
				setVoltageControlZone((VoltageControlZone)null);
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
			case WiresPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE:
				return voltageControlZone != null;
		}
		return super.eIsSet(featureID);
	}

} // BusbarSection
