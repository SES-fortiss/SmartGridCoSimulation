/**
 */
package CIM15.IEC61970.Wires;

import CIM15.IEC61970.Core.PowerSystemResource;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voltage Control Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.VoltageControlZone#getRegulationSchedule <em>Regulation Schedule</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.VoltageControlZone#getBusbarSection <em>Busbar Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VoltageControlZone extends PowerSystemResource {
	/**
	 * The cached value of the '{@link #getRegulationSchedule() <em>Regulation Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulationSchedule()
	 * @generated
	 * @ordered
	 */
	protected RegulationSchedule regulationSchedule;

	/**
	 * The cached value of the '{@link #getBusbarSection() <em>Busbar Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusbarSection()
	 * @generated
	 * @ordered
	 */
	protected BusbarSection busbarSection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoltageControlZone() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.VOLTAGE_CONTROL_ZONE;
	}

	/**
	 * Returns the value of the '<em><b>Regulation Schedule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.RegulationSchedule#getVoltageControlZones <em>Voltage Control Zones</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulation Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulation Schedule</em>' reference.
	 * @see #setRegulationSchedule(RegulationSchedule)
	 * @see CIM15.IEC61970.Wires.RegulationSchedule#getVoltageControlZones
	 * @generated
	 */
	public RegulationSchedule getRegulationSchedule() {
		if (regulationSchedule != null && regulationSchedule.eIsProxy()) {
			InternalEObject oldRegulationSchedule = (InternalEObject)regulationSchedule;
			regulationSchedule = (RegulationSchedule)eResolveProxy(oldRegulationSchedule);
			if (regulationSchedule != oldRegulationSchedule) {
			}
		}
		return regulationSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulationSchedule basicGetRegulationSchedule() {
		return regulationSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegulationSchedule(RegulationSchedule newRegulationSchedule, NotificationChain msgs) {
		RegulationSchedule oldRegulationSchedule = regulationSchedule;
		regulationSchedule = newRegulationSchedule;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.VoltageControlZone#getRegulationSchedule <em>Regulation Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulation Schedule</em>' reference.
	 * @see #getRegulationSchedule()
	 * @generated
	 */
	public void setRegulationSchedule(RegulationSchedule newRegulationSchedule) {
		if (newRegulationSchedule != regulationSchedule) {
			NotificationChain msgs = null;
			if (regulationSchedule != null)
				msgs = ((InternalEObject)regulationSchedule).eInverseRemove(this, WiresPackage.REGULATION_SCHEDULE__VOLTAGE_CONTROL_ZONES, RegulationSchedule.class, msgs);
			if (newRegulationSchedule != null)
				msgs = ((InternalEObject)newRegulationSchedule).eInverseAdd(this, WiresPackage.REGULATION_SCHEDULE__VOLTAGE_CONTROL_ZONES, RegulationSchedule.class, msgs);
			msgs = basicSetRegulationSchedule(newRegulationSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Busbar Section</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.BusbarSection#getVoltageControlZone <em>Voltage Control Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Busbar Section</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Busbar Section</em>' reference.
	 * @see #setBusbarSection(BusbarSection)
	 * @see CIM15.IEC61970.Wires.BusbarSection#getVoltageControlZone
	 * @generated
	 */
	public BusbarSection getBusbarSection() {
		if (busbarSection != null && busbarSection.eIsProxy()) {
			InternalEObject oldBusbarSection = (InternalEObject)busbarSection;
			busbarSection = (BusbarSection)eResolveProxy(oldBusbarSection);
			if (busbarSection != oldBusbarSection) {
			}
		}
		return busbarSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusbarSection basicGetBusbarSection() {
		return busbarSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusbarSection(BusbarSection newBusbarSection, NotificationChain msgs) {
		BusbarSection oldBusbarSection = busbarSection;
		busbarSection = newBusbarSection;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.VoltageControlZone#getBusbarSection <em>Busbar Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Busbar Section</em>' reference.
	 * @see #getBusbarSection()
	 * @generated
	 */
	public void setBusbarSection(BusbarSection newBusbarSection) {
		if (newBusbarSection != busbarSection) {
			NotificationChain msgs = null;
			if (busbarSection != null)
				msgs = ((InternalEObject)busbarSection).eInverseRemove(this, WiresPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE, BusbarSection.class, msgs);
			if (newBusbarSection != null)
				msgs = ((InternalEObject)newBusbarSection).eInverseAdd(this, WiresPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE, BusbarSection.class, msgs);
			msgs = basicSetBusbarSection(newBusbarSection, msgs);
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
			case WiresPackage.VOLTAGE_CONTROL_ZONE__REGULATION_SCHEDULE:
				if (regulationSchedule != null)
					msgs = ((InternalEObject)regulationSchedule).eInverseRemove(this, WiresPackage.REGULATION_SCHEDULE__VOLTAGE_CONTROL_ZONES, RegulationSchedule.class, msgs);
				return basicSetRegulationSchedule((RegulationSchedule)otherEnd, msgs);
			case WiresPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION:
				if (busbarSection != null)
					msgs = ((InternalEObject)busbarSection).eInverseRemove(this, WiresPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE, BusbarSection.class, msgs);
				return basicSetBusbarSection((BusbarSection)otherEnd, msgs);
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
			case WiresPackage.VOLTAGE_CONTROL_ZONE__REGULATION_SCHEDULE:
				return basicSetRegulationSchedule(null, msgs);
			case WiresPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION:
				return basicSetBusbarSection(null, msgs);
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
			case WiresPackage.VOLTAGE_CONTROL_ZONE__REGULATION_SCHEDULE:
				if (resolve) return getRegulationSchedule();
				return basicGetRegulationSchedule();
			case WiresPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION:
				if (resolve) return getBusbarSection();
				return basicGetBusbarSection();
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
			case WiresPackage.VOLTAGE_CONTROL_ZONE__REGULATION_SCHEDULE:
				setRegulationSchedule((RegulationSchedule)newValue);
				return;
			case WiresPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION:
				setBusbarSection((BusbarSection)newValue);
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
			case WiresPackage.VOLTAGE_CONTROL_ZONE__REGULATION_SCHEDULE:
				setRegulationSchedule((RegulationSchedule)null);
				return;
			case WiresPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION:
				setBusbarSection((BusbarSection)null);
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
			case WiresPackage.VOLTAGE_CONTROL_ZONE__REGULATION_SCHEDULE:
				return regulationSchedule != null;
			case WiresPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION:
				return busbarSection != null;
		}
		return super.eIsSet(featureID);
	}

} // VoltageControlZone
