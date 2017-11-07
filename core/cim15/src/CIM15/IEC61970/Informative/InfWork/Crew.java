/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Location;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfAssets.Tool;
import CIM15.IEC61970.Informative.InfAssets.Vehicle;
import CIM15.IEC61970.Informative.InfAssets.WorkEquipment;

import CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation;
import CIM15.IEC61970.Informative.InfERPSupport.ErpPerson;

import CIM15.IEC61970.Informative.InfLocations.InfLocationsPackage;
import CIM15.IEC61970.Informative.InfLocations.Route;

import CIM15.IEC61970.Informative.InfOperations.OutageStep;
import CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crew</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Crew#getTools <em>Tools</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Crew#getSwitchingSchedules <em>Switching Schedules</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Crew#getRoute <em>Route</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Crew#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Crew#getCrewMembers <em>Crew Members</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Crew#getOutageSteps <em>Outage Steps</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Crew#getWorkEquipmentAssets <em>Work Equipment Assets</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Crew#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Crew#getCategory <em>Category</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Crew#getLocations <em>Locations</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Crew#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Crew#getOrganisations <em>Organisations</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Crew#getShiftPatterns <em>Shift Patterns</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Crew#getVehicles <em>Vehicles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Crew extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getTools() <em>Tools</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTools()
	 * @generated
	 * @ordered
	 */
	protected EList<Tool> tools;

	/**
	 * The cached value of the '{@link #getSwitchingSchedules() <em>Switching Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchingSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchingSchedule> switchingSchedules;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected Route route;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> capabilities;

	/**
	 * The cached value of the '{@link #getCrewMembers() <em>Crew Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrewMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpPerson> crewMembers;

	/**
	 * The cached value of the '{@link #getOutageSteps() <em>Outage Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<OutageStep> outageSteps;

	/**
	 * The cached value of the '{@link #getWorkEquipmentAssets() <em>Work Equipment Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEquipmentAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkEquipment> workEquipmentAssets;

	/**
	 * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<Assignment> assignments;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * This is true if the Category attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categoryESet;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The cached value of the '{@link #getWorkTasks() <em>Work Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkTask> workTasks;

	/**
	 * The cached value of the '{@link #getOrganisations() <em>Organisations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisations()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpOrganisation> organisations;

	/**
	 * The cached value of the '{@link #getShiftPatterns() <em>Shift Patterns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShiftPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<ShiftPattern> shiftPatterns;

	/**
	 * The cached value of the '{@link #getVehicles() <em>Vehicles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicles()
	 * @generated
	 * @ordered
	 */
	protected EList<Vehicle> vehicles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Crew() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.CREW;
	}

	/**
	 * Returns the value of the '<em><b>Tools</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.Tool}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.Tool#getCrew <em>Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tools</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.Tool#getCrew
	 * @generated
	 */
	public EList<Tool> getTools() {
		if (tools == null) {
			tools = new BasicInternalEList<Tool>(Tool.class);
		}
		return tools;
	}

	/**
	 * Returns the value of the '<em><b>Switching Schedules</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switching Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switching Schedules</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getCrews
	 * @generated
	 */
	public EList<SwitchingSchedule> getSwitchingSchedules() {
		if (switchingSchedules == null) {
			switchingSchedules = new BasicInternalEList<SwitchingSchedule>(SwitchingSchedule.class);
		}
		return switchingSchedules;
	}

	/**
	 * Returns the value of the '<em><b>Route</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfLocations.Route#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' reference.
	 * @see #setRoute(Route)
	 * @see CIM15.IEC61970.Informative.InfLocations.Route#getCrews
	 * @generated
	 */
	public Route getRoute() {
		if (route != null && route.eIsProxy()) {
			InternalEObject oldRoute = (InternalEObject)route;
			route = (Route)eResolveProxy(oldRoute);
			if (route != oldRoute) {
			}
		}
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route basicGetRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoute(Route newRoute, NotificationChain msgs) {
		Route oldRoute = route;
		route = newRoute;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Crew#getRoute <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' reference.
	 * @see #getRoute()
	 * @generated
	 */
	public void setRoute(Route newRoute) {
		if (newRoute != route) {
			NotificationChain msgs = null;
			if (route != null)
				msgs = ((InternalEObject)route).eInverseRemove(this, InfLocationsPackage.ROUTE__CREWS, Route.class, msgs);
			if (newRoute != null)
				msgs = ((InternalEObject)newRoute).eInverseAdd(this, InfLocationsPackage.ROUTE__CREWS, Route.class, msgs);
			msgs = basicSetRoute(newRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.Capability}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Capability#getCrew <em>Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.Capability#getCrew
	 * @generated
	 */
	public EList<Capability> getCapabilities() {
		if (capabilities == null) {
			capabilities = new BasicInternalEList<Capability>(Capability.class);
		}
		return capabilities;
	}

	/**
	 * Returns the value of the '<em><b>Crew Members</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crew Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crew Members</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCrews
	 * @generated
	 */
	public EList<ErpPerson> getCrewMembers() {
		if (crewMembers == null) {
			crewMembers = new BasicInternalEList<ErpPerson>(ErpPerson.class);
		}
		return crewMembers;
	}

	/**
	 * Returns the value of the '<em><b>Outage Steps</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.OutageStep}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Steps</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep#getCrews
	 * @generated
	 */
	public EList<OutageStep> getOutageSteps() {
		if (outageSteps == null) {
			outageSteps = new BasicInternalEList<OutageStep>(OutageStep.class);
		}
		return outageSteps;
	}

	/**
	 * Returns the value of the '<em><b>Work Equipment Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.WorkEquipment}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.WorkEquipment#getCrew <em>Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Equipment Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Equipment Assets</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.WorkEquipment#getCrew
	 * @generated
	 */
	public EList<WorkEquipment> getWorkEquipmentAssets() {
		if (workEquipmentAssets == null) {
			workEquipmentAssets = new BasicInternalEList<WorkEquipment>(WorkEquipment.class);
		}
		return workEquipmentAssets;
	}

	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.Assignment}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Assignment#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignments</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.Assignment#getCrews
	 * @generated
	 */
	public EList<Assignment> getAssignments() {
		if (assignments == null) {
			assignments = new BasicInternalEList<Assignment>(Assignment.class);
		}
		return assignments;
	}

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #setCategory(String)
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Crew#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @generated
	 */
	public void setCategory(String newCategory) {
		category = newCategory;
		categoryESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Crew#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategory()
	 * @see #getCategory()
	 * @see #setCategory(String)
	 * @generated
	 */
	public void unsetCategory() {
		category = CATEGORY_EDEFAULT;
		categoryESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.Crew#getCategory <em>Category</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Category</em>' attribute is set.
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @see #setCategory(String)
	 * @generated
	 */
	public boolean isSetCategory() {
		return categoryESet;
	}

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Common.Location}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.Location#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see CIM15.IEC61968.Common.Location#getCrews
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new BasicInternalEList<Location>(Location.class);
		}
		return locations;
	}

	/**
	 * Returns the value of the '<em><b>Work Tasks</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.WorkTask}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Tasks</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getCrews
	 * @generated
	 */
	public EList<WorkTask> getWorkTasks() {
		if (workTasks == null) {
			workTasks = new BasicInternalEList<WorkTask>(WorkTask.class);
		}
		return workTasks;
	}

	/**
	 * Returns the value of the '<em><b>Organisations</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisations</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getCrews
	 * @generated
	 */
	public EList<ErpOrganisation> getOrganisations() {
		if (organisations == null) {
			organisations = new BasicInternalEList<ErpOrganisation>(ErpOrganisation.class);
		}
		return organisations;
	}

	/**
	 * Returns the value of the '<em><b>Shift Patterns</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.ShiftPattern}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.ShiftPattern#getCrews <em>Crews</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shift Patterns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift Patterns</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.ShiftPattern#getCrews
	 * @generated
	 */
	public EList<ShiftPattern> getShiftPatterns() {
		if (shiftPatterns == null) {
			shiftPatterns = new BasicInternalEList<ShiftPattern>(ShiftPattern.class);
		}
		return shiftPatterns;
	}

	/**
	 * Returns the value of the '<em><b>Vehicles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.Vehicle}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.Vehicle#getCrew <em>Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vehicles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.Vehicle#getCrew
	 * @generated
	 */
	public EList<Vehicle> getVehicles() {
		if (vehicles == null) {
			vehicles = new BasicInternalEList<Vehicle>(Vehicle.class);
		}
		return vehicles;
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
			case InfWorkPackage.CREW__TOOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTools()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CREW__SWITCHING_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSwitchingSchedules()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CREW__ROUTE:
				if (route != null)
					msgs = ((InternalEObject)route).eInverseRemove(this, InfLocationsPackage.ROUTE__CREWS, Route.class, msgs);
				return basicSetRoute((Route)otherEnd, msgs);
			case InfWorkPackage.CREW__CAPABILITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCapabilities()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CREW__CREW_MEMBERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrewMembers()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CREW__OUTAGE_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutageSteps()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CREW__WORK_EQUIPMENT_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkEquipmentAssets()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CREW__ASSIGNMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignments()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CREW__LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocations()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CREW__WORK_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkTasks()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CREW__ORGANISATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrganisations()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CREW__SHIFT_PATTERNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getShiftPatterns()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CREW__VEHICLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVehicles()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.CREW__TOOLS:
				return ((InternalEList<?>)getTools()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CREW__SWITCHING_SCHEDULES:
				return ((InternalEList<?>)getSwitchingSchedules()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CREW__ROUTE:
				return basicSetRoute(null, msgs);
			case InfWorkPackage.CREW__CAPABILITIES:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CREW__CREW_MEMBERS:
				return ((InternalEList<?>)getCrewMembers()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CREW__OUTAGE_STEPS:
				return ((InternalEList<?>)getOutageSteps()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CREW__WORK_EQUIPMENT_ASSETS:
				return ((InternalEList<?>)getWorkEquipmentAssets()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CREW__ASSIGNMENTS:
				return ((InternalEList<?>)getAssignments()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CREW__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CREW__WORK_TASKS:
				return ((InternalEList<?>)getWorkTasks()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CREW__ORGANISATIONS:
				return ((InternalEList<?>)getOrganisations()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CREW__SHIFT_PATTERNS:
				return ((InternalEList<?>)getShiftPatterns()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CREW__VEHICLES:
				return ((InternalEList<?>)getVehicles()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.CREW__TOOLS:
				return getTools();
			case InfWorkPackage.CREW__SWITCHING_SCHEDULES:
				return getSwitchingSchedules();
			case InfWorkPackage.CREW__ROUTE:
				if (resolve) return getRoute();
				return basicGetRoute();
			case InfWorkPackage.CREW__CAPABILITIES:
				return getCapabilities();
			case InfWorkPackage.CREW__CREW_MEMBERS:
				return getCrewMembers();
			case InfWorkPackage.CREW__OUTAGE_STEPS:
				return getOutageSteps();
			case InfWorkPackage.CREW__WORK_EQUIPMENT_ASSETS:
				return getWorkEquipmentAssets();
			case InfWorkPackage.CREW__ASSIGNMENTS:
				return getAssignments();
			case InfWorkPackage.CREW__CATEGORY:
				return getCategory();
			case InfWorkPackage.CREW__LOCATIONS:
				return getLocations();
			case InfWorkPackage.CREW__WORK_TASKS:
				return getWorkTasks();
			case InfWorkPackage.CREW__ORGANISATIONS:
				return getOrganisations();
			case InfWorkPackage.CREW__SHIFT_PATTERNS:
				return getShiftPatterns();
			case InfWorkPackage.CREW__VEHICLES:
				return getVehicles();
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
			case InfWorkPackage.CREW__TOOLS:
				getTools().clear();
				getTools().addAll((Collection<? extends Tool>)newValue);
				return;
			case InfWorkPackage.CREW__SWITCHING_SCHEDULES:
				getSwitchingSchedules().clear();
				getSwitchingSchedules().addAll((Collection<? extends SwitchingSchedule>)newValue);
				return;
			case InfWorkPackage.CREW__ROUTE:
				setRoute((Route)newValue);
				return;
			case InfWorkPackage.CREW__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case InfWorkPackage.CREW__CREW_MEMBERS:
				getCrewMembers().clear();
				getCrewMembers().addAll((Collection<? extends ErpPerson>)newValue);
				return;
			case InfWorkPackage.CREW__OUTAGE_STEPS:
				getOutageSteps().clear();
				getOutageSteps().addAll((Collection<? extends OutageStep>)newValue);
				return;
			case InfWorkPackage.CREW__WORK_EQUIPMENT_ASSETS:
				getWorkEquipmentAssets().clear();
				getWorkEquipmentAssets().addAll((Collection<? extends WorkEquipment>)newValue);
				return;
			case InfWorkPackage.CREW__ASSIGNMENTS:
				getAssignments().clear();
				getAssignments().addAll((Collection<? extends Assignment>)newValue);
				return;
			case InfWorkPackage.CREW__CATEGORY:
				setCategory((String)newValue);
				return;
			case InfWorkPackage.CREW__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case InfWorkPackage.CREW__WORK_TASKS:
				getWorkTasks().clear();
				getWorkTasks().addAll((Collection<? extends WorkTask>)newValue);
				return;
			case InfWorkPackage.CREW__ORGANISATIONS:
				getOrganisations().clear();
				getOrganisations().addAll((Collection<? extends ErpOrganisation>)newValue);
				return;
			case InfWorkPackage.CREW__SHIFT_PATTERNS:
				getShiftPatterns().clear();
				getShiftPatterns().addAll((Collection<? extends ShiftPattern>)newValue);
				return;
			case InfWorkPackage.CREW__VEHICLES:
				getVehicles().clear();
				getVehicles().addAll((Collection<? extends Vehicle>)newValue);
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
			case InfWorkPackage.CREW__TOOLS:
				getTools().clear();
				return;
			case InfWorkPackage.CREW__SWITCHING_SCHEDULES:
				getSwitchingSchedules().clear();
				return;
			case InfWorkPackage.CREW__ROUTE:
				setRoute((Route)null);
				return;
			case InfWorkPackage.CREW__CAPABILITIES:
				getCapabilities().clear();
				return;
			case InfWorkPackage.CREW__CREW_MEMBERS:
				getCrewMembers().clear();
				return;
			case InfWorkPackage.CREW__OUTAGE_STEPS:
				getOutageSteps().clear();
				return;
			case InfWorkPackage.CREW__WORK_EQUIPMENT_ASSETS:
				getWorkEquipmentAssets().clear();
				return;
			case InfWorkPackage.CREW__ASSIGNMENTS:
				getAssignments().clear();
				return;
			case InfWorkPackage.CREW__CATEGORY:
				unsetCategory();
				return;
			case InfWorkPackage.CREW__LOCATIONS:
				getLocations().clear();
				return;
			case InfWorkPackage.CREW__WORK_TASKS:
				getWorkTasks().clear();
				return;
			case InfWorkPackage.CREW__ORGANISATIONS:
				getOrganisations().clear();
				return;
			case InfWorkPackage.CREW__SHIFT_PATTERNS:
				getShiftPatterns().clear();
				return;
			case InfWorkPackage.CREW__VEHICLES:
				getVehicles().clear();
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
			case InfWorkPackage.CREW__TOOLS:
				return tools != null && !tools.isEmpty();
			case InfWorkPackage.CREW__SWITCHING_SCHEDULES:
				return switchingSchedules != null && !switchingSchedules.isEmpty();
			case InfWorkPackage.CREW__ROUTE:
				return route != null;
			case InfWorkPackage.CREW__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case InfWorkPackage.CREW__CREW_MEMBERS:
				return crewMembers != null && !crewMembers.isEmpty();
			case InfWorkPackage.CREW__OUTAGE_STEPS:
				return outageSteps != null && !outageSteps.isEmpty();
			case InfWorkPackage.CREW__WORK_EQUIPMENT_ASSETS:
				return workEquipmentAssets != null && !workEquipmentAssets.isEmpty();
			case InfWorkPackage.CREW__ASSIGNMENTS:
				return assignments != null && !assignments.isEmpty();
			case InfWorkPackage.CREW__CATEGORY:
				return isSetCategory();
			case InfWorkPackage.CREW__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case InfWorkPackage.CREW__WORK_TASKS:
				return workTasks != null && !workTasks.isEmpty();
			case InfWorkPackage.CREW__ORGANISATIONS:
				return organisations != null && !organisations.isEmpty();
			case InfWorkPackage.CREW__SHIFT_PATTERNS:
				return shiftPatterns != null && !shiftPatterns.isEmpty();
			case InfWorkPackage.CREW__VEHICLES:
				return vehicles != null && !vehicles.isEmpty();
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
		result.append(" (category: ");
		if (categoryESet) result.append(category); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Crew
