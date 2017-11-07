/**
 */
package CIM15.IEC61970.Outage;

import CIM15.IEC61970.Core.CorePackage;
import CIM15.IEC61970.Core.IrregularIntervalSchedule;
import CIM15.IEC61970.Core.PowerSystemResource;

import CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage;
import CIM15.IEC61970.Informative.InfOperations.PlannedOutage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Outage.OutageSchedule#getPlannedOutage <em>Planned Outage</em>}</li>
 *   <li>{@link CIM15.IEC61970.Outage.OutageSchedule#getSwitchingOperations <em>Switching Operations</em>}</li>
 *   <li>{@link CIM15.IEC61970.Outage.OutageSchedule#getPowerSystemResource <em>Power System Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutageSchedule extends IrregularIntervalSchedule {
	/**
	 * The cached value of the '{@link #getPlannedOutage() <em>Planned Outage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedOutage()
	 * @generated
	 * @ordered
	 */
	protected PlannedOutage plannedOutage;

	/**
	 * The cached value of the '{@link #getSwitchingOperations() <em>Switching Operations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchingOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchingOperation> switchingOperations;

	/**
	 * The cached value of the '{@link #getPowerSystemResource() <em>Power System Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSystemResource()
	 * @generated
	 * @ordered
	 */
	protected PowerSystemResource powerSystemResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutageSchedule() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePackage.Literals.OUTAGE_SCHEDULE;
	}

	/**
	 * Returns the value of the '<em><b>Planned Outage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.PlannedOutage#getOutageSchedules <em>Outage Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planned Outage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned Outage</em>' reference.
	 * @see #setPlannedOutage(PlannedOutage)
	 * @see CIM15.IEC61970.Informative.InfOperations.PlannedOutage#getOutageSchedules
	 * @generated
	 */
	public PlannedOutage getPlannedOutage() {
		if (plannedOutage != null && plannedOutage.eIsProxy()) {
			InternalEObject oldPlannedOutage = (InternalEObject)plannedOutage;
			plannedOutage = (PlannedOutage)eResolveProxy(oldPlannedOutage);
			if (plannedOutage != oldPlannedOutage) {
			}
		}
		return plannedOutage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedOutage basicGetPlannedOutage() {
		return plannedOutage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlannedOutage(PlannedOutage newPlannedOutage, NotificationChain msgs) {
		PlannedOutage oldPlannedOutage = plannedOutage;
		plannedOutage = newPlannedOutage;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Outage.OutageSchedule#getPlannedOutage <em>Planned Outage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned Outage</em>' reference.
	 * @see #getPlannedOutage()
	 * @generated
	 */
	public void setPlannedOutage(PlannedOutage newPlannedOutage) {
		if (newPlannedOutage != plannedOutage) {
			NotificationChain msgs = null;
			if (plannedOutage != null)
				msgs = ((InternalEObject)plannedOutage).eInverseRemove(this, InfOperationsPackage.PLANNED_OUTAGE__OUTAGE_SCHEDULES, PlannedOutage.class, msgs);
			if (newPlannedOutage != null)
				msgs = ((InternalEObject)newPlannedOutage).eInverseAdd(this, InfOperationsPackage.PLANNED_OUTAGE__OUTAGE_SCHEDULES, PlannedOutage.class, msgs);
			msgs = basicSetPlannedOutage(newPlannedOutage, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Switching Operations</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Outage.SwitchingOperation}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Outage.SwitchingOperation#getOutageSchedule <em>Outage Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switching Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switching Operations</em>' reference list.
	 * @see CIM15.IEC61970.Outage.SwitchingOperation#getOutageSchedule
	 * @generated
	 */
	public EList<SwitchingOperation> getSwitchingOperations() {
		if (switchingOperations == null) {
			switchingOperations = new BasicInternalEList<SwitchingOperation>(SwitchingOperation.class);
		}
		return switchingOperations;
	}

	/**
	 * Returns the value of the '<em><b>Power System Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.PowerSystemResource#getOutageSchedule <em>Outage Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resource</em>' reference.
	 * @see #setPowerSystemResource(PowerSystemResource)
	 * @see CIM15.IEC61970.Core.PowerSystemResource#getOutageSchedule
	 * @generated
	 */
	public PowerSystemResource getPowerSystemResource() {
		if (powerSystemResource != null && powerSystemResource.eIsProxy()) {
			InternalEObject oldPowerSystemResource = (InternalEObject)powerSystemResource;
			powerSystemResource = (PowerSystemResource)eResolveProxy(oldPowerSystemResource);
			if (powerSystemResource != oldPowerSystemResource) {
			}
		}
		return powerSystemResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSystemResource basicGetPowerSystemResource() {
		return powerSystemResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerSystemResource(PowerSystemResource newPowerSystemResource, NotificationChain msgs) {
		PowerSystemResource oldPowerSystemResource = powerSystemResource;
		powerSystemResource = newPowerSystemResource;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Outage.OutageSchedule#getPowerSystemResource <em>Power System Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power System Resource</em>' reference.
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	public void setPowerSystemResource(PowerSystemResource newPowerSystemResource) {
		if (newPowerSystemResource != powerSystemResource) {
			NotificationChain msgs = null;
			if (powerSystemResource != null)
				msgs = ((InternalEObject)powerSystemResource).eInverseRemove(this, CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE, PowerSystemResource.class, msgs);
			if (newPowerSystemResource != null)
				msgs = ((InternalEObject)newPowerSystemResource).eInverseAdd(this, CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE, PowerSystemResource.class, msgs);
			msgs = basicSetPowerSystemResource(newPowerSystemResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
			case OutagePackage.OUTAGE_SCHEDULE__PLANNED_OUTAGE:
				if (plannedOutage != null)
					msgs = ((InternalEObject)plannedOutage).eInverseRemove(this, InfOperationsPackage.PLANNED_OUTAGE__OUTAGE_SCHEDULES, PlannedOutage.class, msgs);
				return basicSetPlannedOutage((PlannedOutage)otherEnd, msgs);
			case OutagePackage.OUTAGE_SCHEDULE__SWITCHING_OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSwitchingOperations()).basicAdd(otherEnd, msgs);
			case OutagePackage.OUTAGE_SCHEDULE__POWER_SYSTEM_RESOURCE:
				if (powerSystemResource != null)
					msgs = ((InternalEObject)powerSystemResource).eInverseRemove(this, CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE, PowerSystemResource.class, msgs);
				return basicSetPowerSystemResource((PowerSystemResource)otherEnd, msgs);
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
			case OutagePackage.OUTAGE_SCHEDULE__PLANNED_OUTAGE:
				return basicSetPlannedOutage(null, msgs);
			case OutagePackage.OUTAGE_SCHEDULE__SWITCHING_OPERATIONS:
				return ((InternalEList<?>)getSwitchingOperations()).basicRemove(otherEnd, msgs);
			case OutagePackage.OUTAGE_SCHEDULE__POWER_SYSTEM_RESOURCE:
				return basicSetPowerSystemResource(null, msgs);
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
			case OutagePackage.OUTAGE_SCHEDULE__PLANNED_OUTAGE:
				if (resolve) return getPlannedOutage();
				return basicGetPlannedOutage();
			case OutagePackage.OUTAGE_SCHEDULE__SWITCHING_OPERATIONS:
				return getSwitchingOperations();
			case OutagePackage.OUTAGE_SCHEDULE__POWER_SYSTEM_RESOURCE:
				if (resolve) return getPowerSystemResource();
				return basicGetPowerSystemResource();
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
			case OutagePackage.OUTAGE_SCHEDULE__PLANNED_OUTAGE:
				setPlannedOutage((PlannedOutage)newValue);
				return;
			case OutagePackage.OUTAGE_SCHEDULE__SWITCHING_OPERATIONS:
				getSwitchingOperations().clear();
				getSwitchingOperations().addAll((Collection<? extends SwitchingOperation>)newValue);
				return;
			case OutagePackage.OUTAGE_SCHEDULE__POWER_SYSTEM_RESOURCE:
				setPowerSystemResource((PowerSystemResource)newValue);
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
			case OutagePackage.OUTAGE_SCHEDULE__PLANNED_OUTAGE:
				setPlannedOutage((PlannedOutage)null);
				return;
			case OutagePackage.OUTAGE_SCHEDULE__SWITCHING_OPERATIONS:
				getSwitchingOperations().clear();
				return;
			case OutagePackage.OUTAGE_SCHEDULE__POWER_SYSTEM_RESOURCE:
				setPowerSystemResource((PowerSystemResource)null);
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
			case OutagePackage.OUTAGE_SCHEDULE__PLANNED_OUTAGE:
				return plannedOutage != null;
			case OutagePackage.OUTAGE_SCHEDULE__SWITCHING_OPERATIONS:
				return switchingOperations != null && !switchingOperations.isEmpty();
			case OutagePackage.OUTAGE_SCHEDULE__POWER_SYSTEM_RESOURCE:
				return powerSystemResource != null;
		}
		return super.eIsSet(featureID);
	}

} // OutageSchedule
