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
 * A representation of the model object '<em><b>Reservoir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.Production.Reservoir#getLevelVsVolumeCurves <em>Level Vs Volume Curves</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillwayCapacity <em>Spillway Capacity</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.Reservoir#getEnergyStorageRating <em>Energy Storage Rating</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.Reservoir#getGrossCapacity <em>Gross Capacity</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.Reservoir#getTargetLevelSchedule <em>Target Level Schedule</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.Reservoir#getRiverOutletWorks <em>River Outlet Works</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillwayCrestLevel <em>Spillway Crest Level</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.Reservoir#getHydroPowerPlants <em>Hydro Power Plants</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.Reservoir#getNormalMinOperateLevel <em>Normal Min Operate Level</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.Reservoir#getUpstreamFromHydroPowerPlants <em>Upstream From Hydro Power Plants</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillwayCrestLength <em>Spillway Crest Length</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.Reservoir#getInflowForecasts <em>Inflow Forecasts</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillTravelDelay <em>Spill Travel Delay</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.Reservoir#getActiveStorageCapacity <em>Active Storage Capacity</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillsFromReservoir <em>Spills From Reservoir</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillWayGateType <em>Spill Way Gate Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillsIntoReservoirs <em>Spills Into Reservoirs</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.Reservoir#getFullSupplyLevel <em>Full Supply Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Reservoir extends PowerSystemResource {
	/**
	 * The cached value of the '{@link #getLevelVsVolumeCurves() <em>Level Vs Volume Curves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelVsVolumeCurves()
	 * @generated
	 * @ordered
	 */
	protected EList<LevelVsVolumeCurve> levelVsVolumeCurves;

	/**
	 * The default value of the '{@link #getSpillwayCapacity() <em>Spillway Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpillwayCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final float SPILLWAY_CAPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpillwayCapacity() <em>Spillway Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpillwayCapacity()
	 * @generated
	 * @ordered
	 */
	protected float spillwayCapacity = SPILLWAY_CAPACITY_EDEFAULT;

	/**
	 * This is true if the Spillway Capacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spillwayCapacityESet;

	/**
	 * The default value of the '{@link #getEnergyStorageRating() <em>Energy Storage Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyStorageRating()
	 * @generated
	 * @ordered
	 */
	protected static final float ENERGY_STORAGE_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEnergyStorageRating() <em>Energy Storage Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyStorageRating()
	 * @generated
	 * @ordered
	 */
	protected float energyStorageRating = ENERGY_STORAGE_RATING_EDEFAULT;

	/**
	 * This is true if the Energy Storage Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean energyStorageRatingESet;

	/**
	 * The default value of the '{@link #getGrossCapacity() <em>Gross Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrossCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final float GROSS_CAPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGrossCapacity() <em>Gross Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrossCapacity()
	 * @generated
	 * @ordered
	 */
	protected float grossCapacity = GROSS_CAPACITY_EDEFAULT;

	/**
	 * This is true if the Gross Capacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean grossCapacityESet;

	/**
	 * The cached value of the '{@link #getTargetLevelSchedule() <em>Target Level Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLevelSchedule()
	 * @generated
	 * @ordered
	 */
	protected TargetLevelSchedule targetLevelSchedule;

	/**
	 * The default value of the '{@link #getRiverOutletWorks() <em>River Outlet Works</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiverOutletWorks()
	 * @generated
	 * @ordered
	 */
	protected static final String RIVER_OUTLET_WORKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRiverOutletWorks() <em>River Outlet Works</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiverOutletWorks()
	 * @generated
	 * @ordered
	 */
	protected String riverOutletWorks = RIVER_OUTLET_WORKS_EDEFAULT;

	/**
	 * This is true if the River Outlet Works attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean riverOutletWorksESet;

	/**
	 * The default value of the '{@link #getSpillwayCrestLevel() <em>Spillway Crest Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpillwayCrestLevel()
	 * @generated
	 * @ordered
	 */
	protected static final float SPILLWAY_CREST_LEVEL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpillwayCrestLevel() <em>Spillway Crest Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpillwayCrestLevel()
	 * @generated
	 * @ordered
	 */
	protected float spillwayCrestLevel = SPILLWAY_CREST_LEVEL_EDEFAULT;

	/**
	 * This is true if the Spillway Crest Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spillwayCrestLevelESet;

	/**
	 * The cached value of the '{@link #getHydroPowerPlants() <em>Hydro Power Plants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroPowerPlants()
	 * @generated
	 * @ordered
	 */
	protected EList<HydroPowerPlant> hydroPowerPlants;

	/**
	 * The default value of the '{@link #getNormalMinOperateLevel() <em>Normal Min Operate Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalMinOperateLevel()
	 * @generated
	 * @ordered
	 */
	protected static final float NORMAL_MIN_OPERATE_LEVEL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNormalMinOperateLevel() <em>Normal Min Operate Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalMinOperateLevel()
	 * @generated
	 * @ordered
	 */
	protected float normalMinOperateLevel = NORMAL_MIN_OPERATE_LEVEL_EDEFAULT;

	/**
	 * This is true if the Normal Min Operate Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean normalMinOperateLevelESet;

	/**
	 * The cached value of the '{@link #getUpstreamFromHydroPowerPlants() <em>Upstream From Hydro Power Plants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpstreamFromHydroPowerPlants()
	 * @generated
	 * @ordered
	 */
	protected EList<HydroPowerPlant> upstreamFromHydroPowerPlants;

	/**
	 * The default value of the '{@link #getSpillwayCrestLength() <em>Spillway Crest Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpillwayCrestLength()
	 * @generated
	 * @ordered
	 */
	protected static final float SPILLWAY_CREST_LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpillwayCrestLength() <em>Spillway Crest Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpillwayCrestLength()
	 * @generated
	 * @ordered
	 */
	protected float spillwayCrestLength = SPILLWAY_CREST_LENGTH_EDEFAULT;

	/**
	 * This is true if the Spillway Crest Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spillwayCrestLengthESet;

	/**
	 * The cached value of the '{@link #getInflowForecasts() <em>Inflow Forecasts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInflowForecasts()
	 * @generated
	 * @ordered
	 */
	protected EList<InflowForecast> inflowForecasts;

	/**
	 * The default value of the '{@link #getSpillTravelDelay() <em>Spill Travel Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpillTravelDelay()
	 * @generated
	 * @ordered
	 */
	protected static final float SPILL_TRAVEL_DELAY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpillTravelDelay() <em>Spill Travel Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpillTravelDelay()
	 * @generated
	 * @ordered
	 */
	protected float spillTravelDelay = SPILL_TRAVEL_DELAY_EDEFAULT;

	/**
	 * This is true if the Spill Travel Delay attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spillTravelDelayESet;

	/**
	 * The default value of the '{@link #getActiveStorageCapacity() <em>Active Storage Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveStorageCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final float ACTIVE_STORAGE_CAPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getActiveStorageCapacity() <em>Active Storage Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveStorageCapacity()
	 * @generated
	 * @ordered
	 */
	protected float activeStorageCapacity = ACTIVE_STORAGE_CAPACITY_EDEFAULT;

	/**
	 * This is true if the Active Storage Capacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activeStorageCapacityESet;

	/**
	 * The cached value of the '{@link #getSpillsFromReservoir() <em>Spills From Reservoir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpillsFromReservoir()
	 * @generated
	 * @ordered
	 */
	protected Reservoir spillsFromReservoir;

	/**
	 * The default value of the '{@link #getSpillWayGateType() <em>Spill Way Gate Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpillWayGateType()
	 * @generated
	 * @ordered
	 */
	protected static final SpillwayGateType SPILL_WAY_GATE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpillWayGateType() <em>Spill Way Gate Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpillWayGateType()
	 * @generated
	 * @ordered
	 */
	protected SpillwayGateType spillWayGateType = SPILL_WAY_GATE_TYPE_EDEFAULT;

	/**
	 * This is true if the Spill Way Gate Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spillWayGateTypeESet;

	/**
	 * The cached value of the '{@link #getSpillsIntoReservoirs() <em>Spills Into Reservoirs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpillsIntoReservoirs()
	 * @generated
	 * @ordered
	 */
	protected EList<Reservoir> spillsIntoReservoirs;

	/**
	 * The default value of the '{@link #getFullSupplyLevel() <em>Full Supply Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullSupplyLevel()
	 * @generated
	 * @ordered
	 */
	protected static final float FULL_SUPPLY_LEVEL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFullSupplyLevel() <em>Full Supply Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullSupplyLevel()
	 * @generated
	 * @ordered
	 */
	protected float fullSupplyLevel = FULL_SUPPLY_LEVEL_EDEFAULT;

	/**
	 * This is true if the Full Supply Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fullSupplyLevelESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Reservoir() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.RESERVOIR;
	}

	/**
	 * Returns the value of the '<em><b>Level Vs Volume Curves</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Generation.Production.LevelVsVolumeCurve}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.LevelVsVolumeCurve#getReservoir <em>Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Vs Volume Curves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Vs Volume Curves</em>' reference list.
	 * @see CIM15.IEC61970.Generation.Production.LevelVsVolumeCurve#getReservoir
	 * @generated
	 */
	public EList<LevelVsVolumeCurve> getLevelVsVolumeCurves() {
		if (levelVsVolumeCurves == null) {
			levelVsVolumeCurves = new BasicInternalEList<LevelVsVolumeCurve>(LevelVsVolumeCurve.class);
		}
		return levelVsVolumeCurves;
	}

	/**
	 * Returns the value of the '<em><b>Spillway Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spillway Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spillway Capacity</em>' attribute.
	 * @see #isSetSpillwayCapacity()
	 * @see #unsetSpillwayCapacity()
	 * @see #setSpillwayCapacity(float)
	 * @generated
	 */
	public float getSpillwayCapacity() {
		return spillwayCapacity;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillwayCapacity <em>Spillway Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spillway Capacity</em>' attribute.
	 * @see #isSetSpillwayCapacity()
	 * @see #unsetSpillwayCapacity()
	 * @see #getSpillwayCapacity()
	 * @generated
	 */
	public void setSpillwayCapacity(float newSpillwayCapacity) {
		spillwayCapacity = newSpillwayCapacity;
		spillwayCapacityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillwayCapacity <em>Spillway Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpillwayCapacity()
	 * @see #getSpillwayCapacity()
	 * @see #setSpillwayCapacity(float)
	 * @generated
	 */
	public void unsetSpillwayCapacity() {
		spillwayCapacity = SPILLWAY_CAPACITY_EDEFAULT;
		spillwayCapacityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillwayCapacity <em>Spillway Capacity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Spillway Capacity</em>' attribute is set.
	 * @see #unsetSpillwayCapacity()
	 * @see #getSpillwayCapacity()
	 * @see #setSpillwayCapacity(float)
	 * @generated
	 */
	public boolean isSetSpillwayCapacity() {
		return spillwayCapacityESet;
	}

	/**
	 * Returns the value of the '<em><b>Energy Storage Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Storage Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Storage Rating</em>' attribute.
	 * @see #isSetEnergyStorageRating()
	 * @see #unsetEnergyStorageRating()
	 * @see #setEnergyStorageRating(float)
	 * @generated
	 */
	public float getEnergyStorageRating() {
		return energyStorageRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getEnergyStorageRating <em>Energy Storage Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Storage Rating</em>' attribute.
	 * @see #isSetEnergyStorageRating()
	 * @see #unsetEnergyStorageRating()
	 * @see #getEnergyStorageRating()
	 * @generated
	 */
	public void setEnergyStorageRating(float newEnergyStorageRating) {
		energyStorageRating = newEnergyStorageRating;
		energyStorageRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getEnergyStorageRating <em>Energy Storage Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnergyStorageRating()
	 * @see #getEnergyStorageRating()
	 * @see #setEnergyStorageRating(float)
	 * @generated
	 */
	public void unsetEnergyStorageRating() {
		energyStorageRating = ENERGY_STORAGE_RATING_EDEFAULT;
		energyStorageRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getEnergyStorageRating <em>Energy Storage Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Energy Storage Rating</em>' attribute is set.
	 * @see #unsetEnergyStorageRating()
	 * @see #getEnergyStorageRating()
	 * @see #setEnergyStorageRating(float)
	 * @generated
	 */
	public boolean isSetEnergyStorageRating() {
		return energyStorageRatingESet;
	}

	/**
	 * Returns the value of the '<em><b>Gross Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gross Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gross Capacity</em>' attribute.
	 * @see #isSetGrossCapacity()
	 * @see #unsetGrossCapacity()
	 * @see #setGrossCapacity(float)
	 * @generated
	 */
	public float getGrossCapacity() {
		return grossCapacity;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getGrossCapacity <em>Gross Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gross Capacity</em>' attribute.
	 * @see #isSetGrossCapacity()
	 * @see #unsetGrossCapacity()
	 * @see #getGrossCapacity()
	 * @generated
	 */
	public void setGrossCapacity(float newGrossCapacity) {
		grossCapacity = newGrossCapacity;
		grossCapacityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getGrossCapacity <em>Gross Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGrossCapacity()
	 * @see #getGrossCapacity()
	 * @see #setGrossCapacity(float)
	 * @generated
	 */
	public void unsetGrossCapacity() {
		grossCapacity = GROSS_CAPACITY_EDEFAULT;
		grossCapacityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getGrossCapacity <em>Gross Capacity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gross Capacity</em>' attribute is set.
	 * @see #unsetGrossCapacity()
	 * @see #getGrossCapacity()
	 * @see #setGrossCapacity(float)
	 * @generated
	 */
	public boolean isSetGrossCapacity() {
		return grossCapacityESet;
	}

	/**
	 * Returns the value of the '<em><b>Target Level Schedule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.TargetLevelSchedule#getReservoir <em>Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Level Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Level Schedule</em>' reference.
	 * @see #setTargetLevelSchedule(TargetLevelSchedule)
	 * @see CIM15.IEC61970.Generation.Production.TargetLevelSchedule#getReservoir
	 * @generated
	 */
	public TargetLevelSchedule getTargetLevelSchedule() {
		if (targetLevelSchedule != null && targetLevelSchedule.eIsProxy()) {
			InternalEObject oldTargetLevelSchedule = (InternalEObject)targetLevelSchedule;
			targetLevelSchedule = (TargetLevelSchedule)eResolveProxy(oldTargetLevelSchedule);
			if (targetLevelSchedule != oldTargetLevelSchedule) {
			}
		}
		return targetLevelSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetLevelSchedule basicGetTargetLevelSchedule() {
		return targetLevelSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetLevelSchedule(TargetLevelSchedule newTargetLevelSchedule, NotificationChain msgs) {
		TargetLevelSchedule oldTargetLevelSchedule = targetLevelSchedule;
		targetLevelSchedule = newTargetLevelSchedule;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getTargetLevelSchedule <em>Target Level Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Level Schedule</em>' reference.
	 * @see #getTargetLevelSchedule()
	 * @generated
	 */
	public void setTargetLevelSchedule(TargetLevelSchedule newTargetLevelSchedule) {
		if (newTargetLevelSchedule != targetLevelSchedule) {
			NotificationChain msgs = null;
			if (targetLevelSchedule != null)
				msgs = ((InternalEObject)targetLevelSchedule).eInverseRemove(this, ProductionPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR, TargetLevelSchedule.class, msgs);
			if (newTargetLevelSchedule != null)
				msgs = ((InternalEObject)newTargetLevelSchedule).eInverseAdd(this, ProductionPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR, TargetLevelSchedule.class, msgs);
			msgs = basicSetTargetLevelSchedule(newTargetLevelSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>River Outlet Works</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>River Outlet Works</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>River Outlet Works</em>' attribute.
	 * @see #isSetRiverOutletWorks()
	 * @see #unsetRiverOutletWorks()
	 * @see #setRiverOutletWorks(String)
	 * @generated
	 */
	public String getRiverOutletWorks() {
		return riverOutletWorks;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getRiverOutletWorks <em>River Outlet Works</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>River Outlet Works</em>' attribute.
	 * @see #isSetRiverOutletWorks()
	 * @see #unsetRiverOutletWorks()
	 * @see #getRiverOutletWorks()
	 * @generated
	 */
	public void setRiverOutletWorks(String newRiverOutletWorks) {
		riverOutletWorks = newRiverOutletWorks;
		riverOutletWorksESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getRiverOutletWorks <em>River Outlet Works</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRiverOutletWorks()
	 * @see #getRiverOutletWorks()
	 * @see #setRiverOutletWorks(String)
	 * @generated
	 */
	public void unsetRiverOutletWorks() {
		riverOutletWorks = RIVER_OUTLET_WORKS_EDEFAULT;
		riverOutletWorksESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getRiverOutletWorks <em>River Outlet Works</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>River Outlet Works</em>' attribute is set.
	 * @see #unsetRiverOutletWorks()
	 * @see #getRiverOutletWorks()
	 * @see #setRiverOutletWorks(String)
	 * @generated
	 */
	public boolean isSetRiverOutletWorks() {
		return riverOutletWorksESet;
	}

	/**
	 * Returns the value of the '<em><b>Spillway Crest Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spillway Crest Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spillway Crest Level</em>' attribute.
	 * @see #isSetSpillwayCrestLevel()
	 * @see #unsetSpillwayCrestLevel()
	 * @see #setSpillwayCrestLevel(float)
	 * @generated
	 */
	public float getSpillwayCrestLevel() {
		return spillwayCrestLevel;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillwayCrestLevel <em>Spillway Crest Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spillway Crest Level</em>' attribute.
	 * @see #isSetSpillwayCrestLevel()
	 * @see #unsetSpillwayCrestLevel()
	 * @see #getSpillwayCrestLevel()
	 * @generated
	 */
	public void setSpillwayCrestLevel(float newSpillwayCrestLevel) {
		spillwayCrestLevel = newSpillwayCrestLevel;
		spillwayCrestLevelESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillwayCrestLevel <em>Spillway Crest Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpillwayCrestLevel()
	 * @see #getSpillwayCrestLevel()
	 * @see #setSpillwayCrestLevel(float)
	 * @generated
	 */
	public void unsetSpillwayCrestLevel() {
		spillwayCrestLevel = SPILLWAY_CREST_LEVEL_EDEFAULT;
		spillwayCrestLevelESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillwayCrestLevel <em>Spillway Crest Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Spillway Crest Level</em>' attribute is set.
	 * @see #unsetSpillwayCrestLevel()
	 * @see #getSpillwayCrestLevel()
	 * @see #setSpillwayCrestLevel(float)
	 * @generated
	 */
	public boolean isSetSpillwayCrestLevel() {
		return spillwayCrestLevelESet;
	}

	/**
	 * Returns the value of the '<em><b>Hydro Power Plants</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Generation.Production.HydroPowerPlant}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getReservoir <em>Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Power Plants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Power Plants</em>' reference list.
	 * @see CIM15.IEC61970.Generation.Production.HydroPowerPlant#getReservoir
	 * @generated
	 */
	public EList<HydroPowerPlant> getHydroPowerPlants() {
		if (hydroPowerPlants == null) {
			hydroPowerPlants = new BasicInternalEList<HydroPowerPlant>(HydroPowerPlant.class);
		}
		return hydroPowerPlants;
	}

	/**
	 * Returns the value of the '<em><b>Normal Min Operate Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Min Operate Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Min Operate Level</em>' attribute.
	 * @see #isSetNormalMinOperateLevel()
	 * @see #unsetNormalMinOperateLevel()
	 * @see #setNormalMinOperateLevel(float)
	 * @generated
	 */
	public float getNormalMinOperateLevel() {
		return normalMinOperateLevel;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getNormalMinOperateLevel <em>Normal Min Operate Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Min Operate Level</em>' attribute.
	 * @see #isSetNormalMinOperateLevel()
	 * @see #unsetNormalMinOperateLevel()
	 * @see #getNormalMinOperateLevel()
	 * @generated
	 */
	public void setNormalMinOperateLevel(float newNormalMinOperateLevel) {
		normalMinOperateLevel = newNormalMinOperateLevel;
		normalMinOperateLevelESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getNormalMinOperateLevel <em>Normal Min Operate Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNormalMinOperateLevel()
	 * @see #getNormalMinOperateLevel()
	 * @see #setNormalMinOperateLevel(float)
	 * @generated
	 */
	public void unsetNormalMinOperateLevel() {
		normalMinOperateLevel = NORMAL_MIN_OPERATE_LEVEL_EDEFAULT;
		normalMinOperateLevelESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getNormalMinOperateLevel <em>Normal Min Operate Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Normal Min Operate Level</em>' attribute is set.
	 * @see #unsetNormalMinOperateLevel()
	 * @see #getNormalMinOperateLevel()
	 * @see #setNormalMinOperateLevel(float)
	 * @generated
	 */
	public boolean isSetNormalMinOperateLevel() {
		return normalMinOperateLevelESet;
	}

	/**
	 * Returns the value of the '<em><b>Upstream From Hydro Power Plants</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Generation.Production.HydroPowerPlant}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getGenSourcePumpDischargeReservoir <em>Gen Source Pump Discharge Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upstream From Hydro Power Plants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upstream From Hydro Power Plants</em>' reference list.
	 * @see CIM15.IEC61970.Generation.Production.HydroPowerPlant#getGenSourcePumpDischargeReservoir
	 * @generated
	 */
	public EList<HydroPowerPlant> getUpstreamFromHydroPowerPlants() {
		if (upstreamFromHydroPowerPlants == null) {
			upstreamFromHydroPowerPlants = new BasicInternalEList<HydroPowerPlant>(HydroPowerPlant.class);
		}
		return upstreamFromHydroPowerPlants;
	}

	/**
	 * Returns the value of the '<em><b>Spillway Crest Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spillway Crest Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spillway Crest Length</em>' attribute.
	 * @see #isSetSpillwayCrestLength()
	 * @see #unsetSpillwayCrestLength()
	 * @see #setSpillwayCrestLength(float)
	 * @generated
	 */
	public float getSpillwayCrestLength() {
		return spillwayCrestLength;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillwayCrestLength <em>Spillway Crest Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spillway Crest Length</em>' attribute.
	 * @see #isSetSpillwayCrestLength()
	 * @see #unsetSpillwayCrestLength()
	 * @see #getSpillwayCrestLength()
	 * @generated
	 */
	public void setSpillwayCrestLength(float newSpillwayCrestLength) {
		spillwayCrestLength = newSpillwayCrestLength;
		spillwayCrestLengthESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillwayCrestLength <em>Spillway Crest Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpillwayCrestLength()
	 * @see #getSpillwayCrestLength()
	 * @see #setSpillwayCrestLength(float)
	 * @generated
	 */
	public void unsetSpillwayCrestLength() {
		spillwayCrestLength = SPILLWAY_CREST_LENGTH_EDEFAULT;
		spillwayCrestLengthESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillwayCrestLength <em>Spillway Crest Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Spillway Crest Length</em>' attribute is set.
	 * @see #unsetSpillwayCrestLength()
	 * @see #getSpillwayCrestLength()
	 * @see #setSpillwayCrestLength(float)
	 * @generated
	 */
	public boolean isSetSpillwayCrestLength() {
		return spillwayCrestLengthESet;
	}

	/**
	 * Returns the value of the '<em><b>Inflow Forecasts</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Generation.Production.InflowForecast}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.InflowForecast#getReservoir <em>Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inflow Forecasts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inflow Forecasts</em>' reference list.
	 * @see CIM15.IEC61970.Generation.Production.InflowForecast#getReservoir
	 * @generated
	 */
	public EList<InflowForecast> getInflowForecasts() {
		if (inflowForecasts == null) {
			inflowForecasts = new BasicInternalEList<InflowForecast>(InflowForecast.class);
		}
		return inflowForecasts;
	}

	/**
	 * Returns the value of the '<em><b>Spill Travel Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spill Travel Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spill Travel Delay</em>' attribute.
	 * @see #isSetSpillTravelDelay()
	 * @see #unsetSpillTravelDelay()
	 * @see #setSpillTravelDelay(float)
	 * @generated
	 */
	public float getSpillTravelDelay() {
		return spillTravelDelay;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillTravelDelay <em>Spill Travel Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spill Travel Delay</em>' attribute.
	 * @see #isSetSpillTravelDelay()
	 * @see #unsetSpillTravelDelay()
	 * @see #getSpillTravelDelay()
	 * @generated
	 */
	public void setSpillTravelDelay(float newSpillTravelDelay) {
		spillTravelDelay = newSpillTravelDelay;
		spillTravelDelayESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillTravelDelay <em>Spill Travel Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpillTravelDelay()
	 * @see #getSpillTravelDelay()
	 * @see #setSpillTravelDelay(float)
	 * @generated
	 */
	public void unsetSpillTravelDelay() {
		spillTravelDelay = SPILL_TRAVEL_DELAY_EDEFAULT;
		spillTravelDelayESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillTravelDelay <em>Spill Travel Delay</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Spill Travel Delay</em>' attribute is set.
	 * @see #unsetSpillTravelDelay()
	 * @see #getSpillTravelDelay()
	 * @see #setSpillTravelDelay(float)
	 * @generated
	 */
	public boolean isSetSpillTravelDelay() {
		return spillTravelDelayESet;
	}

	/**
	 * Returns the value of the '<em><b>Active Storage Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Storage Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Storage Capacity</em>' attribute.
	 * @see #isSetActiveStorageCapacity()
	 * @see #unsetActiveStorageCapacity()
	 * @see #setActiveStorageCapacity(float)
	 * @generated
	 */
	public float getActiveStorageCapacity() {
		return activeStorageCapacity;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getActiveStorageCapacity <em>Active Storage Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Storage Capacity</em>' attribute.
	 * @see #isSetActiveStorageCapacity()
	 * @see #unsetActiveStorageCapacity()
	 * @see #getActiveStorageCapacity()
	 * @generated
	 */
	public void setActiveStorageCapacity(float newActiveStorageCapacity) {
		activeStorageCapacity = newActiveStorageCapacity;
		activeStorageCapacityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getActiveStorageCapacity <em>Active Storage Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActiveStorageCapacity()
	 * @see #getActiveStorageCapacity()
	 * @see #setActiveStorageCapacity(float)
	 * @generated
	 */
	public void unsetActiveStorageCapacity() {
		activeStorageCapacity = ACTIVE_STORAGE_CAPACITY_EDEFAULT;
		activeStorageCapacityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getActiveStorageCapacity <em>Active Storage Capacity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Active Storage Capacity</em>' attribute is set.
	 * @see #unsetActiveStorageCapacity()
	 * @see #getActiveStorageCapacity()
	 * @see #setActiveStorageCapacity(float)
	 * @generated
	 */
	public boolean isSetActiveStorageCapacity() {
		return activeStorageCapacityESet;
	}

	/**
	 * Returns the value of the '<em><b>Spills From Reservoir</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillsIntoReservoirs <em>Spills Into Reservoirs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spills From Reservoir</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spills From Reservoir</em>' reference.
	 * @see #setSpillsFromReservoir(Reservoir)
	 * @see CIM15.IEC61970.Generation.Production.Reservoir#getSpillsIntoReservoirs
	 * @generated
	 */
	public Reservoir getSpillsFromReservoir() {
		if (spillsFromReservoir != null && spillsFromReservoir.eIsProxy()) {
			InternalEObject oldSpillsFromReservoir = (InternalEObject)spillsFromReservoir;
			spillsFromReservoir = (Reservoir)eResolveProxy(oldSpillsFromReservoir);
			if (spillsFromReservoir != oldSpillsFromReservoir) {
			}
		}
		return spillsFromReservoir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservoir basicGetSpillsFromReservoir() {
		return spillsFromReservoir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpillsFromReservoir(Reservoir newSpillsFromReservoir, NotificationChain msgs) {
		Reservoir oldSpillsFromReservoir = spillsFromReservoir;
		spillsFromReservoir = newSpillsFromReservoir;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillsFromReservoir <em>Spills From Reservoir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spills From Reservoir</em>' reference.
	 * @see #getSpillsFromReservoir()
	 * @generated
	 */
	public void setSpillsFromReservoir(Reservoir newSpillsFromReservoir) {
		if (newSpillsFromReservoir != spillsFromReservoir) {
			NotificationChain msgs = null;
			if (spillsFromReservoir != null)
				msgs = ((InternalEObject)spillsFromReservoir).eInverseRemove(this, ProductionPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS, Reservoir.class, msgs);
			if (newSpillsFromReservoir != null)
				msgs = ((InternalEObject)newSpillsFromReservoir).eInverseAdd(this, ProductionPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS, Reservoir.class, msgs);
			msgs = basicSetSpillsFromReservoir(newSpillsFromReservoir, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Spill Way Gate Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Generation.Production.SpillwayGateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spill Way Gate Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spill Way Gate Type</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.SpillwayGateType
	 * @see #isSetSpillWayGateType()
	 * @see #unsetSpillWayGateType()
	 * @see #setSpillWayGateType(SpillwayGateType)
	 * @generated
	 */
	public SpillwayGateType getSpillWayGateType() {
		return spillWayGateType;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillWayGateType <em>Spill Way Gate Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spill Way Gate Type</em>' attribute.
	 * @see CIM15.IEC61970.Generation.Production.SpillwayGateType
	 * @see #isSetSpillWayGateType()
	 * @see #unsetSpillWayGateType()
	 * @see #getSpillWayGateType()
	 * @generated
	 */
	public void setSpillWayGateType(SpillwayGateType newSpillWayGateType) {
		spillWayGateType = newSpillWayGateType == null ? SPILL_WAY_GATE_TYPE_EDEFAULT : newSpillWayGateType;
		spillWayGateTypeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillWayGateType <em>Spill Way Gate Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpillWayGateType()
	 * @see #getSpillWayGateType()
	 * @see #setSpillWayGateType(SpillwayGateType)
	 * @generated
	 */
	public void unsetSpillWayGateType() {
		spillWayGateType = SPILL_WAY_GATE_TYPE_EDEFAULT;
		spillWayGateTypeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillWayGateType <em>Spill Way Gate Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Spill Way Gate Type</em>' attribute is set.
	 * @see #unsetSpillWayGateType()
	 * @see #getSpillWayGateType()
	 * @see #setSpillWayGateType(SpillwayGateType)
	 * @generated
	 */
	public boolean isSetSpillWayGateType() {
		return spillWayGateTypeESet;
	}

	/**
	 * Returns the value of the '<em><b>Spills Into Reservoirs</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Generation.Production.Reservoir}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillsFromReservoir <em>Spills From Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spills Into Reservoirs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spills Into Reservoirs</em>' reference list.
	 * @see CIM15.IEC61970.Generation.Production.Reservoir#getSpillsFromReservoir
	 * @generated
	 */
	public EList<Reservoir> getSpillsIntoReservoirs() {
		if (spillsIntoReservoirs == null) {
			spillsIntoReservoirs = new BasicInternalEList<Reservoir>(Reservoir.class);
		}
		return spillsIntoReservoirs;
	}

	/**
	 * Returns the value of the '<em><b>Full Supply Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Supply Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Supply Level</em>' attribute.
	 * @see #isSetFullSupplyLevel()
	 * @see #unsetFullSupplyLevel()
	 * @see #setFullSupplyLevel(float)
	 * @generated
	 */
	public float getFullSupplyLevel() {
		return fullSupplyLevel;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getFullSupplyLevel <em>Full Supply Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Supply Level</em>' attribute.
	 * @see #isSetFullSupplyLevel()
	 * @see #unsetFullSupplyLevel()
	 * @see #getFullSupplyLevel()
	 * @generated
	 */
	public void setFullSupplyLevel(float newFullSupplyLevel) {
		fullSupplyLevel = newFullSupplyLevel;
		fullSupplyLevelESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getFullSupplyLevel <em>Full Supply Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFullSupplyLevel()
	 * @see #getFullSupplyLevel()
	 * @see #setFullSupplyLevel(float)
	 * @generated
	 */
	public void unsetFullSupplyLevel() {
		fullSupplyLevel = FULL_SUPPLY_LEVEL_EDEFAULT;
		fullSupplyLevelESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.Reservoir#getFullSupplyLevel <em>Full Supply Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Full Supply Level</em>' attribute is set.
	 * @see #unsetFullSupplyLevel()
	 * @see #getFullSupplyLevel()
	 * @see #setFullSupplyLevel(float)
	 * @generated
	 */
	public boolean isSetFullSupplyLevel() {
		return fullSupplyLevelESet;
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
			case ProductionPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLevelVsVolumeCurves()).basicAdd(otherEnd, msgs);
			case ProductionPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE:
				if (targetLevelSchedule != null)
					msgs = ((InternalEObject)targetLevelSchedule).eInverseRemove(this, ProductionPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR, TargetLevelSchedule.class, msgs);
				return basicSetTargetLevelSchedule((TargetLevelSchedule)otherEnd, msgs);
			case ProductionPackage.RESERVOIR__HYDRO_POWER_PLANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHydroPowerPlants()).basicAdd(otherEnd, msgs);
			case ProductionPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUpstreamFromHydroPowerPlants()).basicAdd(otherEnd, msgs);
			case ProductionPackage.RESERVOIR__INFLOW_FORECASTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInflowForecasts()).basicAdd(otherEnd, msgs);
			case ProductionPackage.RESERVOIR__SPILLS_FROM_RESERVOIR:
				if (spillsFromReservoir != null)
					msgs = ((InternalEObject)spillsFromReservoir).eInverseRemove(this, ProductionPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS, Reservoir.class, msgs);
				return basicSetSpillsFromReservoir((Reservoir)otherEnd, msgs);
			case ProductionPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpillsIntoReservoirs()).basicAdd(otherEnd, msgs);
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
			case ProductionPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES:
				return ((InternalEList<?>)getLevelVsVolumeCurves()).basicRemove(otherEnd, msgs);
			case ProductionPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE:
				return basicSetTargetLevelSchedule(null, msgs);
			case ProductionPackage.RESERVOIR__HYDRO_POWER_PLANTS:
				return ((InternalEList<?>)getHydroPowerPlants()).basicRemove(otherEnd, msgs);
			case ProductionPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS:
				return ((InternalEList<?>)getUpstreamFromHydroPowerPlants()).basicRemove(otherEnd, msgs);
			case ProductionPackage.RESERVOIR__INFLOW_FORECASTS:
				return ((InternalEList<?>)getInflowForecasts()).basicRemove(otherEnd, msgs);
			case ProductionPackage.RESERVOIR__SPILLS_FROM_RESERVOIR:
				return basicSetSpillsFromReservoir(null, msgs);
			case ProductionPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS:
				return ((InternalEList<?>)getSpillsIntoReservoirs()).basicRemove(otherEnd, msgs);
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
			case ProductionPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES:
				return getLevelVsVolumeCurves();
			case ProductionPackage.RESERVOIR__SPILLWAY_CAPACITY:
				return getSpillwayCapacity();
			case ProductionPackage.RESERVOIR__ENERGY_STORAGE_RATING:
				return getEnergyStorageRating();
			case ProductionPackage.RESERVOIR__GROSS_CAPACITY:
				return getGrossCapacity();
			case ProductionPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE:
				if (resolve) return getTargetLevelSchedule();
				return basicGetTargetLevelSchedule();
			case ProductionPackage.RESERVOIR__RIVER_OUTLET_WORKS:
				return getRiverOutletWorks();
			case ProductionPackage.RESERVOIR__SPILLWAY_CREST_LEVEL:
				return getSpillwayCrestLevel();
			case ProductionPackage.RESERVOIR__HYDRO_POWER_PLANTS:
				return getHydroPowerPlants();
			case ProductionPackage.RESERVOIR__NORMAL_MIN_OPERATE_LEVEL:
				return getNormalMinOperateLevel();
			case ProductionPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS:
				return getUpstreamFromHydroPowerPlants();
			case ProductionPackage.RESERVOIR__SPILLWAY_CREST_LENGTH:
				return getSpillwayCrestLength();
			case ProductionPackage.RESERVOIR__INFLOW_FORECASTS:
				return getInflowForecasts();
			case ProductionPackage.RESERVOIR__SPILL_TRAVEL_DELAY:
				return getSpillTravelDelay();
			case ProductionPackage.RESERVOIR__ACTIVE_STORAGE_CAPACITY:
				return getActiveStorageCapacity();
			case ProductionPackage.RESERVOIR__SPILLS_FROM_RESERVOIR:
				if (resolve) return getSpillsFromReservoir();
				return basicGetSpillsFromReservoir();
			case ProductionPackage.RESERVOIR__SPILL_WAY_GATE_TYPE:
				return getSpillWayGateType();
			case ProductionPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS:
				return getSpillsIntoReservoirs();
			case ProductionPackage.RESERVOIR__FULL_SUPPLY_LEVEL:
				return getFullSupplyLevel();
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
			case ProductionPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES:
				getLevelVsVolumeCurves().clear();
				getLevelVsVolumeCurves().addAll((Collection<? extends LevelVsVolumeCurve>)newValue);
				return;
			case ProductionPackage.RESERVOIR__SPILLWAY_CAPACITY:
				setSpillwayCapacity((Float)newValue);
				return;
			case ProductionPackage.RESERVOIR__ENERGY_STORAGE_RATING:
				setEnergyStorageRating((Float)newValue);
				return;
			case ProductionPackage.RESERVOIR__GROSS_CAPACITY:
				setGrossCapacity((Float)newValue);
				return;
			case ProductionPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE:
				setTargetLevelSchedule((TargetLevelSchedule)newValue);
				return;
			case ProductionPackage.RESERVOIR__RIVER_OUTLET_WORKS:
				setRiverOutletWorks((String)newValue);
				return;
			case ProductionPackage.RESERVOIR__SPILLWAY_CREST_LEVEL:
				setSpillwayCrestLevel((Float)newValue);
				return;
			case ProductionPackage.RESERVOIR__HYDRO_POWER_PLANTS:
				getHydroPowerPlants().clear();
				getHydroPowerPlants().addAll((Collection<? extends HydroPowerPlant>)newValue);
				return;
			case ProductionPackage.RESERVOIR__NORMAL_MIN_OPERATE_LEVEL:
				setNormalMinOperateLevel((Float)newValue);
				return;
			case ProductionPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS:
				getUpstreamFromHydroPowerPlants().clear();
				getUpstreamFromHydroPowerPlants().addAll((Collection<? extends HydroPowerPlant>)newValue);
				return;
			case ProductionPackage.RESERVOIR__SPILLWAY_CREST_LENGTH:
				setSpillwayCrestLength((Float)newValue);
				return;
			case ProductionPackage.RESERVOIR__INFLOW_FORECASTS:
				getInflowForecasts().clear();
				getInflowForecasts().addAll((Collection<? extends InflowForecast>)newValue);
				return;
			case ProductionPackage.RESERVOIR__SPILL_TRAVEL_DELAY:
				setSpillTravelDelay((Float)newValue);
				return;
			case ProductionPackage.RESERVOIR__ACTIVE_STORAGE_CAPACITY:
				setActiveStorageCapacity((Float)newValue);
				return;
			case ProductionPackage.RESERVOIR__SPILLS_FROM_RESERVOIR:
				setSpillsFromReservoir((Reservoir)newValue);
				return;
			case ProductionPackage.RESERVOIR__SPILL_WAY_GATE_TYPE:
				setSpillWayGateType((SpillwayGateType)newValue);
				return;
			case ProductionPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS:
				getSpillsIntoReservoirs().clear();
				getSpillsIntoReservoirs().addAll((Collection<? extends Reservoir>)newValue);
				return;
			case ProductionPackage.RESERVOIR__FULL_SUPPLY_LEVEL:
				setFullSupplyLevel((Float)newValue);
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
			case ProductionPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES:
				getLevelVsVolumeCurves().clear();
				return;
			case ProductionPackage.RESERVOIR__SPILLWAY_CAPACITY:
				unsetSpillwayCapacity();
				return;
			case ProductionPackage.RESERVOIR__ENERGY_STORAGE_RATING:
				unsetEnergyStorageRating();
				return;
			case ProductionPackage.RESERVOIR__GROSS_CAPACITY:
				unsetGrossCapacity();
				return;
			case ProductionPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE:
				setTargetLevelSchedule((TargetLevelSchedule)null);
				return;
			case ProductionPackage.RESERVOIR__RIVER_OUTLET_WORKS:
				unsetRiverOutletWorks();
				return;
			case ProductionPackage.RESERVOIR__SPILLWAY_CREST_LEVEL:
				unsetSpillwayCrestLevel();
				return;
			case ProductionPackage.RESERVOIR__HYDRO_POWER_PLANTS:
				getHydroPowerPlants().clear();
				return;
			case ProductionPackage.RESERVOIR__NORMAL_MIN_OPERATE_LEVEL:
				unsetNormalMinOperateLevel();
				return;
			case ProductionPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS:
				getUpstreamFromHydroPowerPlants().clear();
				return;
			case ProductionPackage.RESERVOIR__SPILLWAY_CREST_LENGTH:
				unsetSpillwayCrestLength();
				return;
			case ProductionPackage.RESERVOIR__INFLOW_FORECASTS:
				getInflowForecasts().clear();
				return;
			case ProductionPackage.RESERVOIR__SPILL_TRAVEL_DELAY:
				unsetSpillTravelDelay();
				return;
			case ProductionPackage.RESERVOIR__ACTIVE_STORAGE_CAPACITY:
				unsetActiveStorageCapacity();
				return;
			case ProductionPackage.RESERVOIR__SPILLS_FROM_RESERVOIR:
				setSpillsFromReservoir((Reservoir)null);
				return;
			case ProductionPackage.RESERVOIR__SPILL_WAY_GATE_TYPE:
				unsetSpillWayGateType();
				return;
			case ProductionPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS:
				getSpillsIntoReservoirs().clear();
				return;
			case ProductionPackage.RESERVOIR__FULL_SUPPLY_LEVEL:
				unsetFullSupplyLevel();
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
			case ProductionPackage.RESERVOIR__LEVEL_VS_VOLUME_CURVES:
				return levelVsVolumeCurves != null && !levelVsVolumeCurves.isEmpty();
			case ProductionPackage.RESERVOIR__SPILLWAY_CAPACITY:
				return isSetSpillwayCapacity();
			case ProductionPackage.RESERVOIR__ENERGY_STORAGE_RATING:
				return isSetEnergyStorageRating();
			case ProductionPackage.RESERVOIR__GROSS_CAPACITY:
				return isSetGrossCapacity();
			case ProductionPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE:
				return targetLevelSchedule != null;
			case ProductionPackage.RESERVOIR__RIVER_OUTLET_WORKS:
				return isSetRiverOutletWorks();
			case ProductionPackage.RESERVOIR__SPILLWAY_CREST_LEVEL:
				return isSetSpillwayCrestLevel();
			case ProductionPackage.RESERVOIR__HYDRO_POWER_PLANTS:
				return hydroPowerPlants != null && !hydroPowerPlants.isEmpty();
			case ProductionPackage.RESERVOIR__NORMAL_MIN_OPERATE_LEVEL:
				return isSetNormalMinOperateLevel();
			case ProductionPackage.RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS:
				return upstreamFromHydroPowerPlants != null && !upstreamFromHydroPowerPlants.isEmpty();
			case ProductionPackage.RESERVOIR__SPILLWAY_CREST_LENGTH:
				return isSetSpillwayCrestLength();
			case ProductionPackage.RESERVOIR__INFLOW_FORECASTS:
				return inflowForecasts != null && !inflowForecasts.isEmpty();
			case ProductionPackage.RESERVOIR__SPILL_TRAVEL_DELAY:
				return isSetSpillTravelDelay();
			case ProductionPackage.RESERVOIR__ACTIVE_STORAGE_CAPACITY:
				return isSetActiveStorageCapacity();
			case ProductionPackage.RESERVOIR__SPILLS_FROM_RESERVOIR:
				return spillsFromReservoir != null;
			case ProductionPackage.RESERVOIR__SPILL_WAY_GATE_TYPE:
				return isSetSpillWayGateType();
			case ProductionPackage.RESERVOIR__SPILLS_INTO_RESERVOIRS:
				return spillsIntoReservoirs != null && !spillsIntoReservoirs.isEmpty();
			case ProductionPackage.RESERVOIR__FULL_SUPPLY_LEVEL:
				return isSetFullSupplyLevel();
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
		result.append(" (spillwayCapacity: ");
		if (spillwayCapacityESet) result.append(spillwayCapacity); else result.append("<unset>");
		result.append(", energyStorageRating: ");
		if (energyStorageRatingESet) result.append(energyStorageRating); else result.append("<unset>");
		result.append(", grossCapacity: ");
		if (grossCapacityESet) result.append(grossCapacity); else result.append("<unset>");
		result.append(", riverOutletWorks: ");
		if (riverOutletWorksESet) result.append(riverOutletWorks); else result.append("<unset>");
		result.append(", spillwayCrestLevel: ");
		if (spillwayCrestLevelESet) result.append(spillwayCrestLevel); else result.append("<unset>");
		result.append(", normalMinOperateLevel: ");
		if (normalMinOperateLevelESet) result.append(normalMinOperateLevel); else result.append("<unset>");
		result.append(", spillwayCrestLength: ");
		if (spillwayCrestLengthESet) result.append(spillwayCrestLength); else result.append("<unset>");
		result.append(", spillTravelDelay: ");
		if (spillTravelDelayESet) result.append(spillTravelDelay); else result.append("<unset>");
		result.append(", activeStorageCapacity: ");
		if (activeStorageCapacityESet) result.append(activeStorageCapacity); else result.append("<unset>");
		result.append(", spillWayGateType: ");
		if (spillWayGateTypeESet) result.append(spillWayGateType); else result.append("<unset>");
		result.append(", fullSupplyLevel: ");
		if (fullSupplyLevelESet) result.append(fullSupplyLevel); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Reservoir
