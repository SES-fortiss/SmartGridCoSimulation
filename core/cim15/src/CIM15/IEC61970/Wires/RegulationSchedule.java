/**
 */
package CIM15.IEC61970.Wires;

import CIM15.IEC61970.LoadModel.SeasonDayTypeSchedule;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regulation Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.RegulationSchedule#getRegulatingControl <em>Regulating Control</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.RegulationSchedule#getVoltageControlZones <em>Voltage Control Zones</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegulationSchedule extends SeasonDayTypeSchedule {
	/**
	 * The cached value of the '{@link #getRegulatingControl() <em>Regulating Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatingControl()
	 * @generated
	 * @ordered
	 */
	protected RegulatingControl regulatingControl;

	/**
	 * The cached value of the '{@link #getVoltageControlZones() <em>Voltage Control Zones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageControlZones()
	 * @generated
	 * @ordered
	 */
	protected EList<VoltageControlZone> voltageControlZones;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegulationSchedule() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.REGULATION_SCHEDULE;
	}

	/**
	 * Returns the value of the '<em><b>Regulating Control</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.RegulatingControl#getRegulationSchedule <em>Regulation Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulating Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulating Control</em>' reference.
	 * @see #setRegulatingControl(RegulatingControl)
	 * @see CIM15.IEC61970.Wires.RegulatingControl#getRegulationSchedule
	 * @generated
	 */
	public RegulatingControl getRegulatingControl() {
		if (regulatingControl != null && regulatingControl.eIsProxy()) {
			InternalEObject oldRegulatingControl = (InternalEObject)regulatingControl;
			regulatingControl = (RegulatingControl)eResolveProxy(oldRegulatingControl);
			if (regulatingControl != oldRegulatingControl) {
			}
		}
		return regulatingControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatingControl basicGetRegulatingControl() {
		return regulatingControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegulatingControl(RegulatingControl newRegulatingControl, NotificationChain msgs) {
		RegulatingControl oldRegulatingControl = regulatingControl;
		regulatingControl = newRegulatingControl;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.RegulationSchedule#getRegulatingControl <em>Regulating Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulating Control</em>' reference.
	 * @see #getRegulatingControl()
	 * @generated
	 */
	public void setRegulatingControl(RegulatingControl newRegulatingControl) {
		if (newRegulatingControl != regulatingControl) {
			NotificationChain msgs = null;
			if (regulatingControl != null)
				msgs = ((InternalEObject)regulatingControl).eInverseRemove(this, WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE, RegulatingControl.class, msgs);
			if (newRegulatingControl != null)
				msgs = ((InternalEObject)newRegulatingControl).eInverseAdd(this, WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE, RegulatingControl.class, msgs);
			msgs = basicSetRegulatingControl(newRegulatingControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Voltage Control Zones</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.VoltageControlZone}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.VoltageControlZone#getRegulationSchedule <em>Regulation Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Control Zones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Control Zones</em>' reference list.
	 * @see CIM15.IEC61970.Wires.VoltageControlZone#getRegulationSchedule
	 * @generated
	 */
	public EList<VoltageControlZone> getVoltageControlZones() {
		if (voltageControlZones == null) {
			voltageControlZones = new BasicInternalEList<VoltageControlZone>(VoltageControlZone.class);
		}
		return voltageControlZones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.REGULATION_SCHEDULE__REGULATING_CONTROL:
				if (regulatingControl != null)
					msgs = ((InternalEObject)regulatingControl).eInverseRemove(this, WiresPackage.REGULATING_CONTROL__REGULATION_SCHEDULE, RegulatingControl.class, msgs);
				return basicSetRegulatingControl((RegulatingControl)otherEnd, msgs);
			case WiresPackage.REGULATION_SCHEDULE__VOLTAGE_CONTROL_ZONES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVoltageControlZones()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.REGULATION_SCHEDULE__REGULATING_CONTROL:
				return basicSetRegulatingControl(null, msgs);
			case WiresPackage.REGULATION_SCHEDULE__VOLTAGE_CONTROL_ZONES:
				return ((InternalEList<?>)getVoltageControlZones()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.REGULATION_SCHEDULE__REGULATING_CONTROL:
				if (resolve) return getRegulatingControl();
				return basicGetRegulatingControl();
			case WiresPackage.REGULATION_SCHEDULE__VOLTAGE_CONTROL_ZONES:
				return getVoltageControlZones();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WiresPackage.REGULATION_SCHEDULE__REGULATING_CONTROL:
				setRegulatingControl((RegulatingControl)newValue);
				return;
			case WiresPackage.REGULATION_SCHEDULE__VOLTAGE_CONTROL_ZONES:
				getVoltageControlZones().clear();
				getVoltageControlZones().addAll((Collection<? extends VoltageControlZone>)newValue);
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
			case WiresPackage.REGULATION_SCHEDULE__REGULATING_CONTROL:
				setRegulatingControl((RegulatingControl)null);
				return;
			case WiresPackage.REGULATION_SCHEDULE__VOLTAGE_CONTROL_ZONES:
				getVoltageControlZones().clear();
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
			case WiresPackage.REGULATION_SCHEDULE__REGULATING_CONTROL:
				return regulatingControl != null;
			case WiresPackage.REGULATION_SCHEDULE__VOLTAGE_CONTROL_ZONES:
				return voltageControlZones != null && !voltageControlZones.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // RegulationSchedule
