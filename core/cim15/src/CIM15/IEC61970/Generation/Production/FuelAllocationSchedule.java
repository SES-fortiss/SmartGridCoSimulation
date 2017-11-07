/**
 */
package CIM15.IEC61970.Generation.Production;

import CIM15.IEC61970.Core.Curve;

import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuel Allocation Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getMinFuelAllocation <em>Min Fuel Allocation</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelAllocationEndDate <em>Fuel Allocation End Date</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getMaxFuelAllocation <em>Max Fuel Allocation</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelAllocationStartDate <em>Fuel Allocation Start Date</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getFossilFuel <em>Fossil Fuel</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelType <em>Fuel Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FuelAllocationSchedule extends Curve {
	/**
	 * The default value of the '{@link #getMinFuelAllocation() <em>Min Fuel Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinFuelAllocation()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_FUEL_ALLOCATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinFuelAllocation() <em>Min Fuel Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinFuelAllocation()
	 * @generated
	 * @ordered
	 */
	protected float minFuelAllocation = MIN_FUEL_ALLOCATION_EDEFAULT;

	/**
	 * This is true if the Min Fuel Allocation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minFuelAllocationESet;

	/**
	 * The default value of the '{@link #getFuelAllocationEndDate() <em>Fuel Allocation End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelAllocationEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FUEL_ALLOCATION_END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFuelAllocationEndDate() <em>Fuel Allocation End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelAllocationEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date fuelAllocationEndDate = FUEL_ALLOCATION_END_DATE_EDEFAULT;

	/**
	 * This is true if the Fuel Allocation End Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fuelAllocationEndDateESet;

	/**
	 * The default value of the '{@link #getMaxFuelAllocation() <em>Max Fuel Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFuelAllocation()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_FUEL_ALLOCATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxFuelAllocation() <em>Max Fuel Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFuelAllocation()
	 * @generated
	 * @ordered
	 */
	protected float maxFuelAllocation = MAX_FUEL_ALLOCATION_EDEFAULT;

	/**
	 * This is true if the Max Fuel Allocation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxFuelAllocationESet;

	/**
	 * The default value of the '{@link #getFuelAllocationStartDate() <em>Fuel Allocation Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelAllocationStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FUEL_ALLOCATION_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFuelAllocationStartDate() <em>Fuel Allocation Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelAllocationStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date fuelAllocationStartDate = FUEL_ALLOCATION_START_DATE_EDEFAULT;

	/**
	 * This is true if the Fuel Allocation Start Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fuelAllocationStartDateESet;

	/**
	 * The cached value of the '{@link #getFossilFuel() <em>Fossil Fuel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFossilFuel()
	 * @generated
	 * @ordered
	 */
	protected FossilFuel fossilFuel;

	/**
	 * The default value of the '{@link #getFuelType() <em>Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelType()
	 * @generated
	 * @ordered
	 */
	protected static final FuelType FUEL_TYPE_EDEFAULT = FuelType.OIL;

	/**
	 * The cached value of the '{@link #getFuelType() <em>Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelType()
	 * @generated
	 * @ordered
	 */
	protected FuelType fuelType = FUEL_TYPE_EDEFAULT;

	/**
	 * This is true if the Fuel Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fuelTypeESet;

	/**
	 * The cached value of the '{@link #getThermalGeneratingUnit() <em>Thermal Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected ThermalGeneratingUnit thermalGeneratingUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuelAllocationSchedule() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.FUEL_ALLOCATION_SCHEDULE;
	}

	/**
	 * Returns the value of the '<em><b>Min Fuel Allocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Fuel Allocation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Fuel Allocation</em>' attribute.
	 * @see #isSetMinFuelAllocation()
	 * @see #unsetMinFuelAllocation()
	 * @see #setMinFuelAllocation(float)
	 * @generated
	 */
	public float getMinFuelAllocation() {
		return minFuelAllocation;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getMinFuelAllocation <em>Min Fuel Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Fuel Allocation</em>' attribute.
	 * @see #isSetMinFuelAllocation()
	 * @see #unsetMinFuelAllocation()
	 * @see #getMinFuelAllocation()
	 * @generated
	 */
	public void setMinFuelAllocation(float newMinFuelAllocation) {
		minFuelAllocation = newMinFuelAllocation;
		minFuelAllocationESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getMinFuelAllocation <em>Min Fuel Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinFuelAllocation()
	 * @see #getMinFuelAllocation()
	 * @see #setMinFuelAllocation(float)
	 * @generated
	 */
	public void unsetMinFuelAllocation() {
		minFuelAllocation = MIN_FUEL_ALLOCATION_EDEFAULT;
		minFuelAllocationESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getMinFuelAllocation <em>Min Fuel Allocation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Fuel Allocation</em>' attribute is set.
	 * @see #unsetMinFuelAllocation()
	 * @see #getMinFuelAllocation()
	 * @see #setMinFuelAllocation(float)
	 * @generated
	 */
	public boolean isSetMinFuelAllocation() {
		return minFuelAllocationESet;
	}

	/**
	 * Returns the value of the '<em><b>Fuel Allocation End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Allocation End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Allocation End Date</em>' attribute.
	 * @see #isSetFuelAllocationEndDate()
	 * @see #unsetFuelAllocationEndDate()
	 * @see #setFuelAllocationEndDate(Date)
	 * @generated
	 */
	public Date getFuelAllocationEndDate() {
		return fuelAllocationEndDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelAllocationEndDate <em>Fuel Allocation End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Allocation End Date</em>' attribute.
	 * @see #isSetFuelAllocationEndDate()
	 * @see #unsetFuelAllocationEndDate()
	 * @see #getFuelAllocationEndDate()
	 * @generated
	 */
	public void setFuelAllocationEndDate(Date newFuelAllocationEndDate) {
		fuelAllocationEndDate = newFuelAllocationEndDate;
		fuelAllocationEndDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelAllocationEndDate <em>Fuel Allocation End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFuelAllocationEndDate()
	 * @see #getFuelAllocationEndDate()
	 * @see #setFuelAllocationEndDate(Date)
	 * @generated
	 */
	public void unsetFuelAllocationEndDate() {
		fuelAllocationEndDate = FUEL_ALLOCATION_END_DATE_EDEFAULT;
		fuelAllocationEndDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelAllocationEndDate <em>Fuel Allocation End Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fuel Allocation End Date</em>' attribute is set.
	 * @see #unsetFuelAllocationEndDate()
	 * @see #getFuelAllocationEndDate()
	 * @see #setFuelAllocationEndDate(Date)
	 * @generated
	 */
	public boolean isSetFuelAllocationEndDate() {
		return fuelAllocationEndDateESet;
	}

	/**
	 * Returns the value of the '<em><b>Max Fuel Allocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Fuel Allocation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Fuel Allocation</em>' attribute.
	 * @see #isSetMaxFuelAllocation()
	 * @see #unsetMaxFuelAllocation()
	 * @see #setMaxFuelAllocation(float)
	 * @generated
	 */
	public float getMaxFuelAllocation() {
		return maxFuelAllocation;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getMaxFuelAllocation <em>Max Fuel Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Fuel Allocation</em>' attribute.
	 * @see #isSetMaxFuelAllocation()
	 * @see #unsetMaxFuelAllocation()
	 * @see #getMaxFuelAllocation()
	 * @generated
	 */
	public void setMaxFuelAllocation(float newMaxFuelAllocation) {
		maxFuelAllocation = newMaxFuelAllocation;
		maxFuelAllocationESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getMaxFuelAllocation <em>Max Fuel Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxFuelAllocation()
	 * @see #getMaxFuelAllocation()
	 * @see #setMaxFuelAllocation(float)
	 * @generated
	 */
	public void unsetMaxFuelAllocation() {
		maxFuelAllocation = MAX_FUEL_ALLOCATION_EDEFAULT;
		maxFuelAllocationESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getMaxFuelAllocation <em>Max Fuel Allocation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Fuel Allocation</em>' attribute is set.
	 * @see #unsetMaxFuelAllocation()
	 * @see #getMaxFuelAllocation()
	 * @see #setMaxFuelAllocation(float)
	 * @generated
	 */
	public boolean isSetMaxFuelAllocation() {
		return maxFuelAllocationESet;
	}

	/**
	 * Returns the value of the '<em><b>Fuel Allocation Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Allocation Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Allocation Start Date</em>' attribute.
	 * @see #isSetFuelAllocationStartDate()
	 * @see #unsetFuelAllocationStartDate()
	 * @see #setFuelAllocationStartDate(Date)
	 * @generated
	 */
	public Date getFuelAllocationStartDate() {
		return fuelAllocationStartDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelAllocationStartDate <em>Fuel Allocation Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Allocation Start Date</em>' attribute.
	 * @see #isSetFuelAllocationStartDate()
	 * @see #unsetFuelAllocationStartDate()
	 * @see #getFuelAllocationStartDate()
	 * @generated
	 */
	public void setFuelAllocationStartDate(Date newFuelAllocationStartDate) {
		fuelAllocationStartDate = newFuelAllocationStartDate;
		fuelAllocationStartDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelAllocationStartDate <em>Fuel Allocation Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFuelAllocationStartDate()
	 * @see #getFuelAllocationStartDate()
	 * @see #setFuelAllocationStartDate(Date)
	 * @generated
	 */
	public void unsetFuelAllocationStartDate() {
		fuelAllocationStartDate = FUEL_ALLOCATION_START_DATE_EDEFAULT;
		fuelAllocationStartDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelAllocationStartDate <em>Fuel Allocation Start Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fuel Allocation Start Date</em>' attribute is set.
	 * @see #unsetFuelAllocationStartDate()
	 * @see #getFuelAllocationStartDate()
	 * @see #setFuelAllocationStartDate(Date)
	 * @generated
	 */
	public boolean isSetFuelAllocationStartDate() {
		return fuelAllocationStartDateESet;
	}

	/**
	 * Returns the value of the '<em><b>Fossil Fuel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelAllocationSchedules <em>Fuel Allocation Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fossil Fuel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fossil Fuel</em>' reference.
	 * @see #setFossilFuel(FossilFuel)
	 * @see CIM15.IEC61970.Generation.Production.FossilFuel#getFuelAllocationSchedules
	 * @generated
	 */
	public FossilFuel getFossilFuel() {
		if (fossilFuel != null && fossilFuel.eIsProxy()) {
			InternalEObject oldFossilFuel = (InternalEObject)fossilFuel;
			fossilFuel = (FossilFuel)eResolveProxy(oldFossilFuel);
			if (fossilFuel != oldFossilFuel) {
			}
		}
		return fossilFuel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FossilFuel basicGetFossilFuel() {
		return fossilFuel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFossilFuel(FossilFuel newFossilFuel, NotificationChain msgs) {
		FossilFuel oldFossilFuel = fossilFuel;
		fossilFuel = newFossilFuel;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getFossilFuel <em>Fossil Fuel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fossil Fuel</em>' reference.
	 * @see #getFossilFuel()
	 * @generated
	 */
	public void setFossilFuel(FossilFuel newFossilFuel) {
		if (newFossilFuel != fossilFuel) {
			NotificationChain msgs = null;
			if (fossilFuel != null)
				msgs = ((InternalEObject)fossilFuel).eInverseRemove(this, ProductionPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES, FossilFuel.class, msgs);
			if (newFossilFuel != null)
				msgs = ((InternalEObject)newFossilFuel).eInverseAdd(this, ProductionPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES, FossilFuel.class, msgs);
			msgs = basicSetFossilFuel(newFossilFuel, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Fuel Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Generation.Production.FuelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuel Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Type</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.FuelType
	 * @see #isSetFuelType()
	 * @see #unsetFuelType()
	 * @see #setFuelType(FuelType)
	 * @generated
	 */
	public FuelType getFuelType() {
		return fuelType;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelType <em>Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Type</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.FuelType
	 * @see #isSetFuelType()
	 * @see #unsetFuelType()
	 * @see #getFuelType()
	 * @generated
	 */
	public void setFuelType(FuelType newFuelType) {
		fuelType = newFuelType == null ? FUEL_TYPE_EDEFAULT : newFuelType;
		fuelTypeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelType <em>Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFuelType()
	 * @see #getFuelType()
	 * @see #setFuelType(FuelType)
	 * @generated
	 */
	public void unsetFuelType() {
		fuelType = FUEL_TYPE_EDEFAULT;
		fuelTypeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelType <em>Fuel Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fuel Type</em>' attribute is set.
	 * @see #unsetFuelType()
	 * @see #getFuelType()
	 * @see #setFuelType(FuelType)
	 * @generated
	 */
	public boolean isSetFuelType() {
		return fuelTypeESet;
	}

	/**
	 * Returns the value of the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getFuelAllocationSchedules <em>Fuel Allocation Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getFuelAllocationSchedules
	 * @generated
	 */
	public ThermalGeneratingUnit getThermalGeneratingUnit() {
		if (thermalGeneratingUnit != null && thermalGeneratingUnit.eIsProxy()) {
			InternalEObject oldThermalGeneratingUnit = (InternalEObject)thermalGeneratingUnit;
			thermalGeneratingUnit = (ThermalGeneratingUnit)eResolveProxy(oldThermalGeneratingUnit);
			if (thermalGeneratingUnit != oldThermalGeneratingUnit) {
			}
		}
		return thermalGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThermalGeneratingUnit basicGetThermalGeneratingUnit() {
		return thermalGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThermalGeneratingUnit(ThermalGeneratingUnit newThermalGeneratingUnit, NotificationChain msgs) {
		ThermalGeneratingUnit oldThermalGeneratingUnit = thermalGeneratingUnit;
		thermalGeneratingUnit = newThermalGeneratingUnit;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Generating Unit</em>' reference.
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	public void setThermalGeneratingUnit(ThermalGeneratingUnit newThermalGeneratingUnit) {
		if (newThermalGeneratingUnit != thermalGeneratingUnit) {
			NotificationChain msgs = null;
			if (thermalGeneratingUnit != null)
				msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES, ThermalGeneratingUnit.class, msgs);
			if (newThermalGeneratingUnit != null)
				msgs = ((InternalEObject)newThermalGeneratingUnit).eInverseAdd(this, ProductionPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES, ThermalGeneratingUnit.class, msgs);
			msgs = basicSetThermalGeneratingUnit(newThermalGeneratingUnit, msgs);
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
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__FOSSIL_FUEL:
				if (fossilFuel != null)
					msgs = ((InternalEObject)fossilFuel).eInverseRemove(this, ProductionPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES, FossilFuel.class, msgs);
				return basicSetFossilFuel((FossilFuel)otherEnd, msgs);
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__THERMAL_GENERATING_UNIT:
				if (thermalGeneratingUnit != null)
					msgs = ((InternalEObject)thermalGeneratingUnit).eInverseRemove(this, ProductionPackage.THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES, ThermalGeneratingUnit.class, msgs);
				return basicSetThermalGeneratingUnit((ThermalGeneratingUnit)otherEnd, msgs);
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
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__FOSSIL_FUEL:
				return basicSetFossilFuel(null, msgs);
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__THERMAL_GENERATING_UNIT:
				return basicSetThermalGeneratingUnit(null, msgs);
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
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__MIN_FUEL_ALLOCATION:
				return getMinFuelAllocation();
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_END_DATE:
				return getFuelAllocationEndDate();
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__MAX_FUEL_ALLOCATION:
				return getMaxFuelAllocation();
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_START_DATE:
				return getFuelAllocationStartDate();
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__FOSSIL_FUEL:
				if (resolve) return getFossilFuel();
				return basicGetFossilFuel();
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_TYPE:
				return getFuelType();
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__THERMAL_GENERATING_UNIT:
				if (resolve) return getThermalGeneratingUnit();
				return basicGetThermalGeneratingUnit();
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
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__MIN_FUEL_ALLOCATION:
				setMinFuelAllocation((Float)newValue);
				return;
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_END_DATE:
				setFuelAllocationEndDate((Date)newValue);
				return;
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__MAX_FUEL_ALLOCATION:
				setMaxFuelAllocation((Float)newValue);
				return;
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_START_DATE:
				setFuelAllocationStartDate((Date)newValue);
				return;
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__FOSSIL_FUEL:
				setFossilFuel((FossilFuel)newValue);
				return;
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_TYPE:
				setFuelType((FuelType)newValue);
				return;
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)newValue);
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
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__MIN_FUEL_ALLOCATION:
				unsetMinFuelAllocation();
				return;
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_END_DATE:
				unsetFuelAllocationEndDate();
				return;
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__MAX_FUEL_ALLOCATION:
				unsetMaxFuelAllocation();
				return;
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_START_DATE:
				unsetFuelAllocationStartDate();
				return;
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__FOSSIL_FUEL:
				setFossilFuel((FossilFuel)null);
				return;
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_TYPE:
				unsetFuelType();
				return;
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__THERMAL_GENERATING_UNIT:
				setThermalGeneratingUnit((ThermalGeneratingUnit)null);
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
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__MIN_FUEL_ALLOCATION:
				return isSetMinFuelAllocation();
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_END_DATE:
				return isSetFuelAllocationEndDate();
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__MAX_FUEL_ALLOCATION:
				return isSetMaxFuelAllocation();
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_START_DATE:
				return isSetFuelAllocationStartDate();
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__FOSSIL_FUEL:
				return fossilFuel != null;
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_TYPE:
				return isSetFuelType();
			case ProductionPackage.FUEL_ALLOCATION_SCHEDULE__THERMAL_GENERATING_UNIT:
				return thermalGeneratingUnit != null;
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
		result.append(" (minFuelAllocation: ");
		if (minFuelAllocationESet) result.append(minFuelAllocation); else result.append("<unset>");
		result.append(", fuelAllocationEndDate: ");
		if (fuelAllocationEndDateESet) result.append(fuelAllocationEndDate); else result.append("<unset>");
		result.append(", maxFuelAllocation: ");
		if (maxFuelAllocationESet) result.append(maxFuelAllocation); else result.append("<unset>");
		result.append(", fuelAllocationStartDate: ");
		if (fuelAllocationStartDateESet) result.append(fuelAllocationStartDate); else result.append("<unset>");
		result.append(", fuelType: ");
		if (fuelTypeESet) result.append(fuelType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // FuelAllocationSchedule
