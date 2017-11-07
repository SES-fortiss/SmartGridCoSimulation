/**
 */
package CIM15.IEC61970.Generation.Production;

import CIM15.IEC61970.Core.PowerSystemResource;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hydro Power Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getPenstockType <em>Penstock Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getPumpRatedP <em>Pump Rated P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getHydroPlantType <em>Hydro Plant Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getSurgeTankCrestLevel <em>Surge Tank Crest Level</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getHydroGeneratingUnits <em>Hydro Generating Units</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getGenSourcePumpDischargeReservoir <em>Gen Source Pump Discharge Reservoir</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getDischargeTravelDelay <em>Discharge Travel Delay</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getReservoir <em>Reservoir</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getPlantDischargeCapacity <em>Plant Discharge Capacity</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getHydroPumps <em>Hydro Pumps</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getPlantRatedHead <em>Plant Rated Head</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getGenRatedP <em>Gen Rated P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getSurgeTankCode <em>Surge Tank Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HydroPowerPlant extends PowerSystemResource {
	/**
	 * The default value of the '{@link #getPenstockType() <em>Penstock Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenstockType()
	 * @generated
	 * @ordered
	 */
	protected static final PenstockType PENSTOCK_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPenstockType() <em>Penstock Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenstockType()
	 * @generated
	 * @ordered
	 */
	protected PenstockType penstockType = PENSTOCK_TYPE_EDEFAULT;

	/**
	 * This is true if the Penstock Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean penstockTypeESet;

	/**
	 * The default value of the '{@link #getPumpRatedP() <em>Pump Rated P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPumpRatedP()
	 * @generated
	 * @ordered
	 */
	protected static final float PUMP_RATED_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPumpRatedP() <em>Pump Rated P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPumpRatedP()
	 * @generated
	 * @ordered
	 */
	protected float pumpRatedP = PUMP_RATED_P_EDEFAULT;

	/**
	 * This is true if the Pump Rated P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pumpRatedPESet;

	/**
	 * The default value of the '{@link #getHydroPlantType() <em>Hydro Plant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroPlantType()
	 * @generated
	 * @ordered
	 */
	protected static final HydroPlantType HYDRO_PLANT_TYPE_EDEFAULT = HydroPlantType.PUMPED_STORAGE;

	/**
	 * The cached value of the '{@link #getHydroPlantType() <em>Hydro Plant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroPlantType()
	 * @generated
	 * @ordered
	 */
	protected HydroPlantType hydroPlantType = HYDRO_PLANT_TYPE_EDEFAULT;

	/**
	 * This is true if the Hydro Plant Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hydroPlantTypeESet;

	/**
	 * The default value of the '{@link #getSurgeTankCrestLevel() <em>Surge Tank Crest Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgeTankCrestLevel()
	 * @generated
	 * @ordered
	 */
	protected static final float SURGE_TANK_CREST_LEVEL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSurgeTankCrestLevel() <em>Surge Tank Crest Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgeTankCrestLevel()
	 * @generated
	 * @ordered
	 */
	protected float surgeTankCrestLevel = SURGE_TANK_CREST_LEVEL_EDEFAULT;

	/**
	 * This is true if the Surge Tank Crest Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean surgeTankCrestLevelESet;

	/**
	 * The cached value of the '{@link #getHydroGeneratingUnits() <em>Hydro Generating Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroGeneratingUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<HydroGeneratingUnit> hydroGeneratingUnits;

	/**
	 * The cached value of the '{@link #getGenSourcePumpDischargeReservoir() <em>Gen Source Pump Discharge Reservoir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenSourcePumpDischargeReservoir()
	 * @generated
	 * @ordered
	 */
	protected Reservoir genSourcePumpDischargeReservoir;

	/**
	 * The default value of the '{@link #getDischargeTravelDelay() <em>Discharge Travel Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeTravelDelay()
	 * @generated
	 * @ordered
	 */
	protected static final float DISCHARGE_TRAVEL_DELAY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDischargeTravelDelay() <em>Discharge Travel Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeTravelDelay()
	 * @generated
	 * @ordered
	 */
	protected float dischargeTravelDelay = DISCHARGE_TRAVEL_DELAY_EDEFAULT;

	/**
	 * This is true if the Discharge Travel Delay attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dischargeTravelDelayESet;

	/**
	 * The cached value of the '{@link #getReservoir() <em>Reservoir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservoir()
	 * @generated
	 * @ordered
	 */
	protected Reservoir reservoir;

	/**
	 * The default value of the '{@link #getPlantDischargeCapacity() <em>Plant Discharge Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantDischargeCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final float PLANT_DISCHARGE_CAPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPlantDischargeCapacity() <em>Plant Discharge Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantDischargeCapacity()
	 * @generated
	 * @ordered
	 */
	protected float plantDischargeCapacity = PLANT_DISCHARGE_CAPACITY_EDEFAULT;

	/**
	 * This is true if the Plant Discharge Capacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean plantDischargeCapacityESet;

	/**
	 * The cached value of the '{@link #getHydroPumps() <em>Hydro Pumps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroPumps()
	 * @generated
	 * @ordered
	 */
	protected EList<HydroPump> hydroPumps;

	/**
	 * The default value of the '{@link #getPlantRatedHead() <em>Plant Rated Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantRatedHead()
	 * @generated
	 * @ordered
	 */
	protected static final float PLANT_RATED_HEAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPlantRatedHead() <em>Plant Rated Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantRatedHead()
	 * @generated
	 * @ordered
	 */
	protected float plantRatedHead = PLANT_RATED_HEAD_EDEFAULT;

	/**
	 * This is true if the Plant Rated Head attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean plantRatedHeadESet;

	/**
	 * The default value of the '{@link #getGenRatedP() <em>Gen Rated P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenRatedP()
	 * @generated
	 * @ordered
	 */
	protected static final float GEN_RATED_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGenRatedP() <em>Gen Rated P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenRatedP()
	 * @generated
	 * @ordered
	 */
	protected float genRatedP = GEN_RATED_P_EDEFAULT;

	/**
	 * This is true if the Gen Rated P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean genRatedPESet;

	/**
	 * The default value of the '{@link #getSurgeTankCode() <em>Surge Tank Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgeTankCode()
	 * @generated
	 * @ordered
	 */
	protected static final SurgeTankCode SURGE_TANK_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurgeTankCode() <em>Surge Tank Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgeTankCode()
	 * @generated
	 * @ordered
	 */
	protected SurgeTankCode surgeTankCode = SURGE_TANK_CODE_EDEFAULT;

	/**
	 * This is true if the Surge Tank Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean surgeTankCodeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HydroPowerPlant() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.HYDRO_POWER_PLANT;
	}

	/**
	 * Returns the value of the '<em><b>Penstock Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Generation.Production.PenstockType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Penstock Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Penstock Type</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.PenstockType
	 * @see #isSetPenstockType()
	 * @see #unsetPenstockType()
	 * @see #setPenstockType(PenstockType)
	 * @generated
	 */
	public PenstockType getPenstockType() {
		return penstockType;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getPenstockType <em>Penstock Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penstock Type</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.PenstockType
	 * @see #isSetPenstockType()
	 * @see #unsetPenstockType()
	 * @see #getPenstockType()
	 * @generated
	 */
	public void setPenstockType(PenstockType newPenstockType) {
		penstockType = newPenstockType == null ? PENSTOCK_TYPE_EDEFAULT : newPenstockType;
		penstockTypeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getPenstockType <em>Penstock Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPenstockType()
	 * @see #getPenstockType()
	 * @see #setPenstockType(PenstockType)
	 * @generated
	 */
	public void unsetPenstockType() {
		penstockType = PENSTOCK_TYPE_EDEFAULT;
		penstockTypeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getPenstockType <em>Penstock Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Penstock Type</em>' attribute is set.
	 * @see #unsetPenstockType()
	 * @see #getPenstockType()
	 * @see #setPenstockType(PenstockType)
	 * @generated
	 */
	public boolean isSetPenstockType() {
		return penstockTypeESet;
	}

	/**
	 * Returns the value of the '<em><b>Pump Rated P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pump Rated P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pump Rated P</em>' attribute.
	 * @see #isSetPumpRatedP()
	 * @see #unsetPumpRatedP()
	 * @see #setPumpRatedP(float)
	 * @generated
	 */
	public float getPumpRatedP() {
		return pumpRatedP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getPumpRatedP <em>Pump Rated P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pump Rated P</em>' attribute.
	 * @see #isSetPumpRatedP()
	 * @see #unsetPumpRatedP()
	 * @see #getPumpRatedP()
	 * @generated
	 */
	public void setPumpRatedP(float newPumpRatedP) {
		pumpRatedP = newPumpRatedP;
		pumpRatedPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getPumpRatedP <em>Pump Rated P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPumpRatedP()
	 * @see #getPumpRatedP()
	 * @see #setPumpRatedP(float)
	 * @generated
	 */
	public void unsetPumpRatedP() {
		pumpRatedP = PUMP_RATED_P_EDEFAULT;
		pumpRatedPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getPumpRatedP <em>Pump Rated P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pump Rated P</em>' attribute is set.
	 * @see #unsetPumpRatedP()
	 * @see #getPumpRatedP()
	 * @see #setPumpRatedP(float)
	 * @generated
	 */
	public boolean isSetPumpRatedP() {
		return pumpRatedPESet;
	}

	/**
	 * Returns the value of the '<em><b>Hydro Plant Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Generation.Production.HydroPlantType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Plant Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Plant Type</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.HydroPlantType
	 * @see #isSetHydroPlantType()
	 * @see #unsetHydroPlantType()
	 * @see #setHydroPlantType(HydroPlantType)
	 * @generated
	 */
	public HydroPlantType getHydroPlantType() {
		return hydroPlantType;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getHydroPlantType <em>Hydro Plant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hydro Plant Type</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.HydroPlantType
	 * @see #isSetHydroPlantType()
	 * @see #unsetHydroPlantType()
	 * @see #getHydroPlantType()
	 * @generated
	 */
	public void setHydroPlantType(HydroPlantType newHydroPlantType) {
		hydroPlantType = newHydroPlantType == null ? HYDRO_PLANT_TYPE_EDEFAULT : newHydroPlantType;
		hydroPlantTypeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getHydroPlantType <em>Hydro Plant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHydroPlantType()
	 * @see #getHydroPlantType()
	 * @see #setHydroPlantType(HydroPlantType)
	 * @generated
	 */
	public void unsetHydroPlantType() {
		hydroPlantType = HYDRO_PLANT_TYPE_EDEFAULT;
		hydroPlantTypeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getHydroPlantType <em>Hydro Plant Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hydro Plant Type</em>' attribute is set.
	 * @see #unsetHydroPlantType()
	 * @see #getHydroPlantType()
	 * @see #setHydroPlantType(HydroPlantType)
	 * @generated
	 */
	public boolean isSetHydroPlantType() {
		return hydroPlantTypeESet;
	}

	/**
	 * Returns the value of the '<em><b>Surge Tank Crest Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surge Tank Crest Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surge Tank Crest Level</em>' attribute.
	 * @see #isSetSurgeTankCrestLevel()
	 * @see #unsetSurgeTankCrestLevel()
	 * @see #setSurgeTankCrestLevel(float)
	 * @generated
	 */
	public float getSurgeTankCrestLevel() {
		return surgeTankCrestLevel;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getSurgeTankCrestLevel <em>Surge Tank Crest Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surge Tank Crest Level</em>' attribute.
	 * @see #isSetSurgeTankCrestLevel()
	 * @see #unsetSurgeTankCrestLevel()
	 * @see #getSurgeTankCrestLevel()
	 * @generated
	 */
	public void setSurgeTankCrestLevel(float newSurgeTankCrestLevel) {
		surgeTankCrestLevel = newSurgeTankCrestLevel;
		surgeTankCrestLevelESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getSurgeTankCrestLevel <em>Surge Tank Crest Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSurgeTankCrestLevel()
	 * @see #getSurgeTankCrestLevel()
	 * @see #setSurgeTankCrestLevel(float)
	 * @generated
	 */
	public void unsetSurgeTankCrestLevel() {
		surgeTankCrestLevel = SURGE_TANK_CREST_LEVEL_EDEFAULT;
		surgeTankCrestLevelESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getSurgeTankCrestLevel <em>Surge Tank Crest Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Surge Tank Crest Level</em>' attribute is set.
	 * @see #unsetSurgeTankCrestLevel()
	 * @see #getSurgeTankCrestLevel()
	 * @see #setSurgeTankCrestLevel(float)
	 * @generated
	 */
	public boolean isSetSurgeTankCrestLevel() {
		return surgeTankCrestLevelESet;
	}

	/**
	 * Returns the value of the '<em><b>Hydro Generating Units</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroPowerPlant <em>Hydro Power Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Generating Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Generating Units</em>' reference list.
	 * @see CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroPowerPlant
	 * @generated
	 */
	public EList<HydroGeneratingUnit> getHydroGeneratingUnits() {
		if (hydroGeneratingUnits == null) {
			hydroGeneratingUnits = new BasicInternalEList<HydroGeneratingUnit>(HydroGeneratingUnit.class);
		}
		return hydroGeneratingUnits;
	}

	/**
	 * Returns the value of the '<em><b>Gen Source Pump Discharge Reservoir</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.Reservoir#getUpstreamFromHydroPowerPlants <em>Upstream From Hydro Power Plants</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Source Pump Discharge Reservoir</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Source Pump Discharge Reservoir</em>' reference.
	 * @see #setGenSourcePumpDischargeReservoir(Reservoir)
	 * @see CIM15.IEC61970.Generation.Production.Reservoir#getUpstreamFromHydroPowerPlants
	 * @generated
	 */
	public Reservoir getGenSourcePumpDischargeReservoir() {
		if (genSourcePumpDischargeReservoir != null && genSourcePumpDischargeReservoir.eIsProxy()) {
			InternalEObject oldGenSourcePumpDischargeReservoir = (InternalEObject)genSourcePumpDischargeReservoir;
			genSourcePumpDischargeReservoir = (Reservoir)eResolveProxy(oldGenSourcePumpDischargeReservoir);
			if (genSourcePumpDischargeReservoir != oldGenSourcePumpDischargeReservoir) {
			}
		}
		return genSourcePumpDischargeReservoir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservoir basicGetGenSourcePumpDischargeReservoir() {
		return genSourcePumpDischargeReservoir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenSourcePumpDischargeReservoir(Reservoir newGenSourcePumpDischargeReservoir, NotificationChain msgs) {
		Reservoir oldGenSourcePumpDischargeReservoir = genSourcePumpDischargeReservoir;
		genSourcePumpDischargeReservoir = newGenSourcePumpDischargeReservoir;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getGenSourcePumpDischargeReservoir <em>Gen Source Pump Discharge Reservoir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Source Pump Discharge Reservoir</em>' reference.
	 * @see #getGenSourcePumpDischargeReservoir()
	 * @generated
	 */
	public void setGenSourcePumpDischargeReservoir(Reservoir newGenSourcePumpDischargeReservoir) {
		if (newGenSourcePumpDischargeReservoir != genSourcePumpDischargeReservoir) {
			NotificationChain msgs = null;
			if (genSourcePumpDischargeReservoir != null)
				msgs = ((InternalEObject)genSourcePumpDischargeReservoir).eInverseRemove(this, ProductionPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS, Reservoir.class, msgs);
			if (newGenSourcePumpDischargeReservoir != null)
				msgs = ((InternalEObject)newGenSourcePumpDischargeReservoir).eInverseAdd(this, ProductionPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS, Reservoir.class, msgs);
			msgs = basicSetGenSourcePumpDischargeReservoir(newGenSourcePumpDischargeReservoir, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Discharge Travel Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discharge Travel Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discharge Travel Delay</em>' attribute.
	 * @see #isSetDischargeTravelDelay()
	 * @see #unsetDischargeTravelDelay()
	 * @see #setDischargeTravelDelay(float)
	 * @generated
	 */
	public float getDischargeTravelDelay() {
		return dischargeTravelDelay;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getDischargeTravelDelay <em>Discharge Travel Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discharge Travel Delay</em>' attribute.
	 * @see #isSetDischargeTravelDelay()
	 * @see #unsetDischargeTravelDelay()
	 * @see #getDischargeTravelDelay()
	 * @generated
	 */
	public void setDischargeTravelDelay(float newDischargeTravelDelay) {
		dischargeTravelDelay = newDischargeTravelDelay;
		dischargeTravelDelayESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getDischargeTravelDelay <em>Discharge Travel Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDischargeTravelDelay()
	 * @see #getDischargeTravelDelay()
	 * @see #setDischargeTravelDelay(float)
	 * @generated
	 */
	public void unsetDischargeTravelDelay() {
		dischargeTravelDelay = DISCHARGE_TRAVEL_DELAY_EDEFAULT;
		dischargeTravelDelayESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getDischargeTravelDelay <em>Discharge Travel Delay</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Discharge Travel Delay</em>' attribute is set.
	 * @see #unsetDischargeTravelDelay()
	 * @see #getDischargeTravelDelay()
	 * @see #setDischargeTravelDelay(float)
	 * @generated
	 */
	public boolean isSetDischargeTravelDelay() {
		return dischargeTravelDelayESet;
	}

	/**
	 * Returns the value of the '<em><b>Reservoir</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.Reservoir#getHydroPowerPlants <em>Hydro Power Plants</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservoir</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservoir</em>' reference.
	 * @see #setReservoir(Reservoir)
	 * @see CIM15.IEC61970.Generation.Production.Reservoir#getHydroPowerPlants
	 * @generated
	 */
	public Reservoir getReservoir() {
		if (reservoir != null && reservoir.eIsProxy()) {
			InternalEObject oldReservoir = (InternalEObject)reservoir;
			reservoir = (Reservoir)eResolveProxy(oldReservoir);
			if (reservoir != oldReservoir) {
			}
		}
		return reservoir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservoir basicGetReservoir() {
		return reservoir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReservoir(Reservoir newReservoir, NotificationChain msgs) {
		Reservoir oldReservoir = reservoir;
		reservoir = newReservoir;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getReservoir <em>Reservoir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservoir</em>' reference.
	 * @see #getReservoir()
	 * @generated
	 */
	public void setReservoir(Reservoir newReservoir) {
		if (newReservoir != reservoir) {
			NotificationChain msgs = null;
			if (reservoir != null)
				msgs = ((InternalEObject)reservoir).eInverseRemove(this, ProductionPackage.RESERVOIR__HYDRO_POWER_PLANTS, Reservoir.class, msgs);
			if (newReservoir != null)
				msgs = ((InternalEObject)newReservoir).eInverseAdd(this, ProductionPackage.RESERVOIR__HYDRO_POWER_PLANTS, Reservoir.class, msgs);
			msgs = basicSetReservoir(newReservoir, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Plant Discharge Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plant Discharge Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant Discharge Capacity</em>' attribute.
	 * @see #isSetPlantDischargeCapacity()
	 * @see #unsetPlantDischargeCapacity()
	 * @see #setPlantDischargeCapacity(float)
	 * @generated
	 */
	public float getPlantDischargeCapacity() {
		return plantDischargeCapacity;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getPlantDischargeCapacity <em>Plant Discharge Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant Discharge Capacity</em>' attribute.
	 * @see #isSetPlantDischargeCapacity()
	 * @see #unsetPlantDischargeCapacity()
	 * @see #getPlantDischargeCapacity()
	 * @generated
	 */
	public void setPlantDischargeCapacity(float newPlantDischargeCapacity) {
		plantDischargeCapacity = newPlantDischargeCapacity;
		plantDischargeCapacityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getPlantDischargeCapacity <em>Plant Discharge Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlantDischargeCapacity()
	 * @see #getPlantDischargeCapacity()
	 * @see #setPlantDischargeCapacity(float)
	 * @generated
	 */
	public void unsetPlantDischargeCapacity() {
		plantDischargeCapacity = PLANT_DISCHARGE_CAPACITY_EDEFAULT;
		plantDischargeCapacityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getPlantDischargeCapacity <em>Plant Discharge Capacity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Plant Discharge Capacity</em>' attribute is set.
	 * @see #unsetPlantDischargeCapacity()
	 * @see #getPlantDischargeCapacity()
	 * @see #setPlantDischargeCapacity(float)
	 * @generated
	 */
	public boolean isSetPlantDischargeCapacity() {
		return plantDischargeCapacityESet;
	}

	/**
	 * Returns the value of the '<em><b>Hydro Pumps</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Generation.Production.HydroPump}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.HydroPump#getHydroPowerPlant <em>Hydro Power Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Pumps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Pumps</em>' reference list.
	 * @see CIM15.IEC61970.Generation.Production.HydroPump#getHydroPowerPlant
	 * @generated
	 */
	public EList<HydroPump> getHydroPumps() {
		if (hydroPumps == null) {
			hydroPumps = new BasicInternalEList<HydroPump>(HydroPump.class);
		}
		return hydroPumps;
	}

	/**
	 * Returns the value of the '<em><b>Plant Rated Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plant Rated Head</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant Rated Head</em>' attribute.
	 * @see #isSetPlantRatedHead()
	 * @see #unsetPlantRatedHead()
	 * @see #setPlantRatedHead(float)
	 * @generated
	 */
	public float getPlantRatedHead() {
		return plantRatedHead;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getPlantRatedHead <em>Plant Rated Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant Rated Head</em>' attribute.
	 * @see #isSetPlantRatedHead()
	 * @see #unsetPlantRatedHead()
	 * @see #getPlantRatedHead()
	 * @generated
	 */
	public void setPlantRatedHead(float newPlantRatedHead) {
		plantRatedHead = newPlantRatedHead;
		plantRatedHeadESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getPlantRatedHead <em>Plant Rated Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlantRatedHead()
	 * @see #getPlantRatedHead()
	 * @see #setPlantRatedHead(float)
	 * @generated
	 */
	public void unsetPlantRatedHead() {
		plantRatedHead = PLANT_RATED_HEAD_EDEFAULT;
		plantRatedHeadESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getPlantRatedHead <em>Plant Rated Head</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Plant Rated Head</em>' attribute is set.
	 * @see #unsetPlantRatedHead()
	 * @see #getPlantRatedHead()
	 * @see #setPlantRatedHead(float)
	 * @generated
	 */
	public boolean isSetPlantRatedHead() {
		return plantRatedHeadESet;
	}

	/**
	 * Returns the value of the '<em><b>Gen Rated P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Rated P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Rated P</em>' attribute.
	 * @see #isSetGenRatedP()
	 * @see #unsetGenRatedP()
	 * @see #setGenRatedP(float)
	 * @generated
	 */
	public float getGenRatedP() {
		return genRatedP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getGenRatedP <em>Gen Rated P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Rated P</em>' attribute.
	 * @see #isSetGenRatedP()
	 * @see #unsetGenRatedP()
	 * @see #getGenRatedP()
	 * @generated
	 */
	public void setGenRatedP(float newGenRatedP) {
		genRatedP = newGenRatedP;
		genRatedPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getGenRatedP <em>Gen Rated P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGenRatedP()
	 * @see #getGenRatedP()
	 * @see #setGenRatedP(float)
	 * @generated
	 */
	public void unsetGenRatedP() {
		genRatedP = GEN_RATED_P_EDEFAULT;
		genRatedPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getGenRatedP <em>Gen Rated P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gen Rated P</em>' attribute is set.
	 * @see #unsetGenRatedP()
	 * @see #getGenRatedP()
	 * @see #setGenRatedP(float)
	 * @generated
	 */
	public boolean isSetGenRatedP() {
		return genRatedPESet;
	}

	/**
	 * Returns the value of the '<em><b>Surge Tank Code</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Generation.Production.SurgeTankCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surge Tank Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surge Tank Code</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.SurgeTankCode
	 * @see #isSetSurgeTankCode()
	 * @see #unsetSurgeTankCode()
	 * @see #setSurgeTankCode(SurgeTankCode)
	 * @generated
	 */
	public SurgeTankCode getSurgeTankCode() {
		return surgeTankCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getSurgeTankCode <em>Surge Tank Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surge Tank Code</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.SurgeTankCode
	 * @see #isSetSurgeTankCode()
	 * @see #unsetSurgeTankCode()
	 * @see #getSurgeTankCode()
	 * @generated
	 */
	public void setSurgeTankCode(SurgeTankCode newSurgeTankCode) {
		surgeTankCode = newSurgeTankCode == null ? SURGE_TANK_CODE_EDEFAULT : newSurgeTankCode;
		surgeTankCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getSurgeTankCode <em>Surge Tank Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSurgeTankCode()
	 * @see #getSurgeTankCode()
	 * @see #setSurgeTankCode(SurgeTankCode)
	 * @generated
	 */
	public void unsetSurgeTankCode() {
		surgeTankCode = SURGE_TANK_CODE_EDEFAULT;
		surgeTankCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getSurgeTankCode <em>Surge Tank Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Surge Tank Code</em>' attribute is set.
	 * @see #unsetSurgeTankCode()
	 * @see #getSurgeTankCode()
	 * @see #setSurgeTankCode(SurgeTankCode)
	 * @generated
	 */
	public boolean isSetSurgeTankCode() {
		return surgeTankCodeESet;
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
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHydroGeneratingUnits()).basicAdd(otherEnd, msgs);
			case ProductionPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR:
				if (genSourcePumpDischargeReservoir != null)
					msgs = ((InternalEObject)genSourcePumpDischargeReservoir).eInverseRemove(this, ProductionPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS, Reservoir.class, msgs);
				return basicSetGenSourcePumpDischargeReservoir((Reservoir)otherEnd, msgs);
			case ProductionPackage.HYDRO_POWER_PLANT__RESERVOIR:
				if (reservoir != null)
					msgs = ((InternalEObject)reservoir).eInverseRemove(this, ProductionPackage.RESERVOIR__HYDRO_POWER_PLANTS, Reservoir.class, msgs);
				return basicSetReservoir((Reservoir)otherEnd, msgs);
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHydroPumps()).basicAdd(otherEnd, msgs);
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
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS:
				return ((InternalEList<?>)getHydroGeneratingUnits()).basicRemove(otherEnd, msgs);
			case ProductionPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR:
				return basicSetGenSourcePumpDischargeReservoir(null, msgs);
			case ProductionPackage.HYDRO_POWER_PLANT__RESERVOIR:
				return basicSetReservoir(null, msgs);
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS:
				return ((InternalEList<?>)getHydroPumps()).basicRemove(otherEnd, msgs);
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
			case ProductionPackage.HYDRO_POWER_PLANT__PENSTOCK_TYPE:
				return getPenstockType();
			case ProductionPackage.HYDRO_POWER_PLANT__PUMP_RATED_P:
				return getPumpRatedP();
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PLANT_TYPE:
				return getHydroPlantType();
			case ProductionPackage.HYDRO_POWER_PLANT__SURGE_TANK_CREST_LEVEL:
				return getSurgeTankCrestLevel();
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS:
				return getHydroGeneratingUnits();
			case ProductionPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR:
				if (resolve) return getGenSourcePumpDischargeReservoir();
				return basicGetGenSourcePumpDischargeReservoir();
			case ProductionPackage.HYDRO_POWER_PLANT__DISCHARGE_TRAVEL_DELAY:
				return getDischargeTravelDelay();
			case ProductionPackage.HYDRO_POWER_PLANT__RESERVOIR:
				if (resolve) return getReservoir();
				return basicGetReservoir();
			case ProductionPackage.HYDRO_POWER_PLANT__PLANT_DISCHARGE_CAPACITY:
				return getPlantDischargeCapacity();
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS:
				return getHydroPumps();
			case ProductionPackage.HYDRO_POWER_PLANT__PLANT_RATED_HEAD:
				return getPlantRatedHead();
			case ProductionPackage.HYDRO_POWER_PLANT__GEN_RATED_P:
				return getGenRatedP();
			case ProductionPackage.HYDRO_POWER_PLANT__SURGE_TANK_CODE:
				return getSurgeTankCode();
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
			case ProductionPackage.HYDRO_POWER_PLANT__PENSTOCK_TYPE:
				setPenstockType((PenstockType)newValue);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__PUMP_RATED_P:
				setPumpRatedP((Float)newValue);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PLANT_TYPE:
				setHydroPlantType((HydroPlantType)newValue);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__SURGE_TANK_CREST_LEVEL:
				setSurgeTankCrestLevel((Float)newValue);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS:
				getHydroGeneratingUnits().clear();
				getHydroGeneratingUnits().addAll((Collection<? extends HydroGeneratingUnit>)newValue);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR:
				setGenSourcePumpDischargeReservoir((Reservoir)newValue);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__DISCHARGE_TRAVEL_DELAY:
				setDischargeTravelDelay((Float)newValue);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__RESERVOIR:
				setReservoir((Reservoir)newValue);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__PLANT_DISCHARGE_CAPACITY:
				setPlantDischargeCapacity((Float)newValue);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS:
				getHydroPumps().clear();
				getHydroPumps().addAll((Collection<? extends HydroPump>)newValue);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__PLANT_RATED_HEAD:
				setPlantRatedHead((Float)newValue);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__GEN_RATED_P:
				setGenRatedP((Float)newValue);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__SURGE_TANK_CODE:
				setSurgeTankCode((SurgeTankCode)newValue);
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
			case ProductionPackage.HYDRO_POWER_PLANT__PENSTOCK_TYPE:
				unsetPenstockType();
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__PUMP_RATED_P:
				unsetPumpRatedP();
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PLANT_TYPE:
				unsetHydroPlantType();
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__SURGE_TANK_CREST_LEVEL:
				unsetSurgeTankCrestLevel();
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS:
				getHydroGeneratingUnits().clear();
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR:
				setGenSourcePumpDischargeReservoir((Reservoir)null);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__DISCHARGE_TRAVEL_DELAY:
				unsetDischargeTravelDelay();
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__RESERVOIR:
				setReservoir((Reservoir)null);
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__PLANT_DISCHARGE_CAPACITY:
				unsetPlantDischargeCapacity();
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS:
				getHydroPumps().clear();
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__PLANT_RATED_HEAD:
				unsetPlantRatedHead();
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__GEN_RATED_P:
				unsetGenRatedP();
				return;
			case ProductionPackage.HYDRO_POWER_PLANT__SURGE_TANK_CODE:
				unsetSurgeTankCode();
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
			case ProductionPackage.HYDRO_POWER_PLANT__PENSTOCK_TYPE:
				return isSetPenstockType();
			case ProductionPackage.HYDRO_POWER_PLANT__PUMP_RATED_P:
				return isSetPumpRatedP();
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PLANT_TYPE:
				return isSetHydroPlantType();
			case ProductionPackage.HYDRO_POWER_PLANT__SURGE_TANK_CREST_LEVEL:
				return isSetSurgeTankCrestLevel();
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS:
				return hydroGeneratingUnits != null && !hydroGeneratingUnits.isEmpty();
			case ProductionPackage.HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR:
				return genSourcePumpDischargeReservoir != null;
			case ProductionPackage.HYDRO_POWER_PLANT__DISCHARGE_TRAVEL_DELAY:
				return isSetDischargeTravelDelay();
			case ProductionPackage.HYDRO_POWER_PLANT__RESERVOIR:
				return reservoir != null;
			case ProductionPackage.HYDRO_POWER_PLANT__PLANT_DISCHARGE_CAPACITY:
				return isSetPlantDischargeCapacity();
			case ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS:
				return hydroPumps != null && !hydroPumps.isEmpty();
			case ProductionPackage.HYDRO_POWER_PLANT__PLANT_RATED_HEAD:
				return isSetPlantRatedHead();
			case ProductionPackage.HYDRO_POWER_PLANT__GEN_RATED_P:
				return isSetGenRatedP();
			case ProductionPackage.HYDRO_POWER_PLANT__SURGE_TANK_CODE:
				return isSetSurgeTankCode();
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
		result.append(" (penstockType: ");
		if (penstockTypeESet) result.append(penstockType); else result.append("<unset>");
		result.append(", pumpRatedP: ");
		if (pumpRatedPESet) result.append(pumpRatedP); else result.append("<unset>");
		result.append(", hydroPlantType: ");
		if (hydroPlantTypeESet) result.append(hydroPlantType); else result.append("<unset>");
		result.append(", surgeTankCrestLevel: ");
		if (surgeTankCrestLevelESet) result.append(surgeTankCrestLevel); else result.append("<unset>");
		result.append(", dischargeTravelDelay: ");
		if (dischargeTravelDelayESet) result.append(dischargeTravelDelay); else result.append("<unset>");
		result.append(", plantDischargeCapacity: ");
		if (plantDischargeCapacityESet) result.append(plantDischargeCapacity); else result.append("<unset>");
		result.append(", plantRatedHead: ");
		if (plantRatedHeadESet) result.append(plantRatedHead); else result.append("<unset>");
		result.append(", genRatedP: ");
		if (genRatedPESet) result.append(genRatedP); else result.append("<unset>");
		result.append(", surgeTankCode: ");
		if (surgeTankCodeESet) result.append(surgeTankCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // HydroPowerPlant
