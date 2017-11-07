/**
 */
package CIM15.IEC61970.Generation.Production;

import CIM15.CIM15Package;

import CIM15.IEC61968.AssetModels.AssetModelsPackage;

import CIM15.IEC61968.Assets.AssetsPackage;

import CIM15.IEC61968.Common.CommonPackage;

import CIM15.IEC61968.Customers.CustomersPackage;

import CIM15.IEC61968.IEC61968Package;

import CIM15.IEC61968.LoadControl.LoadControlPackage;

import CIM15.IEC61968.Metering.MeteringPackage;

import CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage;

import CIM15.IEC61968.Work.WorkPackage;

import CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipmentPackage;

import CIM15.IEC61970.Contingency.ContingencyPackage;

import CIM15.IEC61970.ControlArea.ControlAreaPackage;

import CIM15.IEC61970.Core.CorePackage;

import CIM15.IEC61970.CutsJumpers.CutsJumpersPackage;

import CIM15.IEC61970.Domain.DomainPackage;

import CIM15.IEC61970.Equivalents.EquivalentsPackage;

import CIM15.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage;

import CIM15.IEC61970.Graphics.GraphicsPackage;

import CIM15.IEC61970.IEC61970Package;

import CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage;

import CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage;

import CIM15.IEC61970.Informative.InfCommon.InfCommonPackage;

import CIM15.IEC61970.Informative.InfCore.InfCorePackage;

import CIM15.IEC61970.Informative.InfCustomers.InfCustomersPackage;

import CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;

import CIM15.IEC61970.Informative.InfLoadControl.InfLoadControlPackage;

import CIM15.IEC61970.Informative.InfLocations.InfLocationsPackage;

import CIM15.IEC61970.Informative.InfMetering.InfMeteringPackage;

import CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage;

import CIM15.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage;

import CIM15.IEC61970.Informative.InfWork.InfWorkPackage;

import CIM15.IEC61970.LoadModel.LoadModelPackage;

import CIM15.IEC61970.Meas.MeasPackage;

import CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage;

import CIM15.IEC61970.Outage.OutagePackage;

import CIM15.IEC61970.Protection.ProtectionPackage;

import CIM15.IEC61970.SCADA.SCADAPackage;

import CIM15.IEC61970.StateVariables.StateVariablesPackage;

import CIM15.IEC61970.Topology.TopologyPackage;

import CIM15.IEC61970.Wires.WiresPackage;

import CIM15.IEC61970.WiresPhaseModel.WiresPhaseModelPackage;

import CIM15.IEC62325.IEC62325Package;

import CIM15.PackageDependencies.PackageDependenciesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Generation.Production.ProductionFactory
 * @generated
 */
public class ProductionPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "Production";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#Production";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimProduction";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ProductionPackage eINSTANCE = CIM15.IEC61970.Generation.Production.ProductionPackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.Reservoir <em>Reservoir</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.Reservoir
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getReservoir()
	 * @generated
	 */
	public static final int RESERVOIR = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__NAMES = CorePackage.POWER_SYSTEM_RESOURCE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__DIAGRAM_OBJECTS = CorePackage.POWER_SYSTEM_RESOURCE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Level Vs Volume Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__LEVEL_VS_VOLUME_CURVES = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Spillway Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__SPILLWAY_CAPACITY = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Energy Storage Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__ENERGY_STORAGE_RATING = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gross Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__GROSS_CAPACITY = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Level Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__TARGET_LEVEL_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>River Outlet Works</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__RIVER_OUTLET_WORKS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Spillway Crest Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__SPILLWAY_CREST_LEVEL = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Hydro Power Plants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__HYDRO_POWER_PLANTS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Normal Min Operate Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__NORMAL_MIN_OPERATE_LEVEL = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Upstream From Hydro Power Plants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Spillway Crest Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__SPILLWAY_CREST_LENGTH = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Inflow Forecasts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__INFLOW_FORECASTS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Spill Travel Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__SPILL_TRAVEL_DELAY = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Active Storage Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__ACTIVE_STORAGE_CAPACITY = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Spills From Reservoir</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__SPILLS_FROM_RESERVOIR = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Spill Way Gate Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__SPILL_WAY_GATE_TYPE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Spills Into Reservoirs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__SPILLS_INTO_RESERVOIRS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Full Supply Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR__FULL_SUPPLY_LEVEL = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Reservoir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>Reservoir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESERVOIR_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant <em>Cogeneration Plant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.CogenerationPlant
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getCogenerationPlant()
	 * @generated
	 */
	public static final int COGENERATION_PLANT = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__NAMES = CorePackage.POWER_SYSTEM_RESOURCE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__DIAGRAM_OBJECTS = CorePackage.POWER_SYSTEM_RESOURCE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Steam Sendout Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cogen LP Steam Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__COGEN_LP_STEAM_RATING = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cogen LP Sendout Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__COGEN_LP_SENDOUT_RATING = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Thermal Generating Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__THERMAL_GENERATING_UNITS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rated P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__RATED_P = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cogen HP Sendout Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__COGEN_HP_SENDOUT_RATING = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cogen HP Steam Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT__COGEN_HP_STEAM_RATING = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Cogeneration Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Cogeneration Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COGENERATION_PLANT_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.GenUnitOpSchedule <em>Gen Unit Op Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.GenUnitOpSchedule
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getGenUnitOpSchedule()
	 * @generated
	 */
	public static final int GEN_UNIT_OP_SCHEDULE = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_SCHEDULE__UUID = CorePackage.REGULAR_INTERVAL_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_SCHEDULE__NAMES = CorePackage.REGULAR_INTERVAL_SCHEDULE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_SCHEDULE__DIAGRAM_OBJECTS = CorePackage.REGULAR_INTERVAL_SCHEDULE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_SCHEDULE__MRID = CorePackage.REGULAR_INTERVAL_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_SCHEDULE__ALIAS_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_SCHEDULE__NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_SCHEDULE__MODELING_AUTHORITY_SET = CorePackage.REGULAR_INTERVAL_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_SCHEDULE__START_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_SCHEDULE__VALUE1_MULTIPLIER = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_SCHEDULE__VALUE2_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_SCHEDULE__VALUE1_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_SCHEDULE__VALUE2_MULTIPLIER = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_SCHEDULE__END_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_SCHEDULE__TIME_STEP = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_SCHEDULE__TIME_POINTS = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_SCHEDULE__GENERATING_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gen Unit Op Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_SCHEDULE_FEATURE_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gen Unit Op Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_SCHEDULE_OPERATION_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule <em>Fuel Allocation Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.FuelAllocationSchedule
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getFuelAllocationSchedule()
	 * @generated
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE__NAMES = CorePackage.CURVE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE__DIAGRAM_OBJECTS = CorePackage.CURVE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Min Fuel Allocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE__MIN_FUEL_ALLOCATION = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fuel Allocation End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_END_DATE = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Fuel Allocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE__MAX_FUEL_ALLOCATION = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fuel Allocation Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_START_DATE = CorePackage.CURVE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fossil Fuel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE__FOSSIL_FUEL = CorePackage.CURVE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fuel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE__FUEL_TYPE = CorePackage.CURVE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE__THERMAL_GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Fuel Allocation Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Fuel Allocation Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_ALLOCATION_SCHEDULE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.GrossToNetActivePowerCurve <em>Gross To Net Active Power Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.GrossToNetActivePowerCurve
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getGrossToNetActivePowerCurve()
	 * @generated
	 */
	public static final int GROSS_TO_NET_ACTIVE_POWER_CURVE = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROSS_TO_NET_ACTIVE_POWER_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROSS_TO_NET_ACTIVE_POWER_CURVE__NAMES = CorePackage.CURVE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROSS_TO_NET_ACTIVE_POWER_CURVE__DIAGRAM_OBJECTS = CorePackage.CURVE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROSS_TO_NET_ACTIVE_POWER_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROSS_TO_NET_ACTIVE_POWER_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROSS_TO_NET_ACTIVE_POWER_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROSS_TO_NET_ACTIVE_POWER_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROSS_TO_NET_ACTIVE_POWER_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROSS_TO_NET_ACTIVE_POWER_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROSS_TO_NET_ACTIVE_POWER_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROSS_TO_NET_ACTIVE_POWER_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROSS_TO_NET_ACTIVE_POWER_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROSS_TO_NET_ACTIVE_POWER_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROSS_TO_NET_ACTIVE_POWER_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROSS_TO_NET_ACTIVE_POWER_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROSS_TO_NET_ACTIVE_POWER_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROSS_TO_NET_ACTIVE_POWER_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROSS_TO_NET_ACTIVE_POWER_CURVE__GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gross To Net Active Power Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROSS_TO_NET_ACTIVE_POWER_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gross To Net Active Power Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GROSS_TO_NET_ACTIVE_POWER_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.LevelVsVolumeCurve <em>Level Vs Volume Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.LevelVsVolumeCurve
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getLevelVsVolumeCurve()
	 * @generated
	 */
	public static final int LEVEL_VS_VOLUME_CURVE = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_VS_VOLUME_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_VS_VOLUME_CURVE__NAMES = CorePackage.CURVE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_VS_VOLUME_CURVE__DIAGRAM_OBJECTS = CorePackage.CURVE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_VS_VOLUME_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_VS_VOLUME_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_VS_VOLUME_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_VS_VOLUME_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_VS_VOLUME_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_VS_VOLUME_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_VS_VOLUME_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_VS_VOLUME_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_VS_VOLUME_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_VS_VOLUME_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_VS_VOLUME_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_VS_VOLUME_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_VS_VOLUME_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_VS_VOLUME_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Reservoir</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_VS_VOLUME_CURVE__RESERVOIR = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Level Vs Volume Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_VS_VOLUME_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Level Vs Volume Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_VS_VOLUME_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.StartRampCurve <em>Start Ramp Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.StartRampCurve
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getStartRampCurve()
	 * @generated
	 */
	public static final int START_RAMP_CURVE = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_RAMP_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_RAMP_CURVE__NAMES = CorePackage.CURVE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_RAMP_CURVE__DIAGRAM_OBJECTS = CorePackage.CURVE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_RAMP_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_RAMP_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_RAMP_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_RAMP_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_RAMP_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_RAMP_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_RAMP_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_RAMP_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_RAMP_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_RAMP_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_RAMP_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_RAMP_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_RAMP_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_RAMP_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Hot Standby Ramp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_RAMP_CURVE__HOT_STANDBY_RAMP = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Startup Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_RAMP_CURVE__STARTUP_MODEL = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Start Ramp Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_RAMP_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Start Ramp Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_RAMP_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit <em>Generating Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit()
	 * @generated
	 */
	public static final int GENERATING_UNIT = 22;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__UUID = CorePackage.EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__NAMES = CorePackage.EQUIPMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__DIAGRAM_OBJECTS = CorePackage.EQUIPMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__MRID = CorePackage.EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__ALIAS_NAME = CorePackage.EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__NAME = CorePackage.EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__MODELING_AUTHORITY_SET = CorePackage.EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__CHANGE_ITEMS = CorePackage.EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__SCHEDULE_STEPS = CorePackage.EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__SAFETY_DOCUMENTS = CorePackage.EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__OPERATING_SHARE = CorePackage.EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__DOCUMENT_ROLES = CorePackage.EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__PSR_LISTS = CorePackage.EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__MEASUREMENTS = CorePackage.EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__REPORTING_GROUP = CorePackage.EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__PSR_TYPE = CorePackage.EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__ASSETS = CorePackage.EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__ERP_ORGANISATION_ROLES = CorePackage.EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__LOCATION = CorePackage.EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__PSR_EVENT = CorePackage.EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__NETWORK_DATA_SETS = CorePackage.EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__OUTAGE_SCHEDULE = CorePackage.EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__CONTINGENCY_EQUIPMENT = CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__CUSTOMER_AGREEMENTS = CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__NORMALLY_IN_SERVICE = CorePackage.EQUIPMENT__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__AGGREGATE = CorePackage.EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__EQUIPMENT_CONTAINER = CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Rated Gross Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__RATED_GROSS_MIN_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__EFFICIENCY = CorePackage.EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Step Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__STEP_CHANGE = CorePackage.EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rated Net Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__RATED_NET_MAX_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tie Line PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__TIE_LINE_PF = CorePackage.EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Disp Reserve Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__DISP_RESERVE_FLAG = CorePackage.EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Control Pulse High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__CONTROL_PULSE_HIGH = CorePackage.EQUIPMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Startup Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__STARTUP_TIME = CorePackage.EQUIPMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Max Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__MAX_OPERATING_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Gen Control Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__GEN_CONTROL_SOURCE = CorePackage.EQUIPMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Normal PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__NORMAL_PF = CorePackage.EQUIPMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Initial P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__INITIAL_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Spin Reserve Ramp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__SPIN_RESERVE_RAMP = CorePackage.EQUIPMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Alloc Spin Res P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__ALLOC_SPIN_RES_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Min Economic P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__MIN_ECONOMIC_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Long PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__LONG_PF = CorePackage.EQUIPMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Nominal P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__NOMINAL_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Control Response Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__CONTROL_RESPONSE_RATE = CorePackage.EQUIPMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT = CorePackage.EQUIPMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Synchronous Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__SYNCHRONOUS_MACHINES = CorePackage.EQUIPMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Rated Gross Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__RATED_GROSS_MAX_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Penalty Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__PENALTY_FACTOR = CorePackage.EQUIPMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Fast Start Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__FAST_START_FLAG = CorePackage.EQUIPMENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Minimum Off Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__MINIMUM_OFF_TIME = CorePackage.EQUIPMENT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Short PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__SHORT_PF = CorePackage.EQUIPMENT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Governor MPL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__GOVERNOR_MPL = CorePackage.EQUIPMENT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Energy Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__ENERGY_MIN_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Fuel Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__FUEL_PRIORITY = CorePackage.EQUIPMENT_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Max Economic P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__MAX_ECONOMIC_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Auto Cntrl Margin P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__AUTO_CNTRL_MARGIN_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>High Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__HIGH_CONTROL_LIMIT = CorePackage.EQUIPMENT_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Model Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__MODEL_DETAIL = CorePackage.EQUIPMENT_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Control Pulse Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__CONTROL_PULSE_LOW = CorePackage.EQUIPMENT_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Raise Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__RAISE_RAMP_RATE = CorePackage.EQUIPMENT_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Gen Unit Op Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE = CorePackage.EQUIPMENT_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Control Deadband</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__CONTROL_DEADBAND = CorePackage.EQUIPMENT_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Base P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__BASE_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Startup Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__STARTUP_COST = CorePackage.EQUIPMENT_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Variable Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__VARIABLE_COST = CorePackage.EQUIPMENT_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Gen Operating Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__GEN_OPERATING_MODE = CorePackage.EQUIPMENT_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Lower Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__LOWER_RAMP_RATE = CorePackage.EQUIPMENT_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Min Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__MIN_OPERATING_P = CorePackage.EQUIPMENT_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Low Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__LOW_CONTROL_LIMIT = CorePackage.EQUIPMENT_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Gross To Net Active Power Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES = CorePackage.EQUIPMENT_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Maximum Allowable Spinning Reserve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE = CorePackage.EQUIPMENT_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Gen Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__GEN_CONTROL_MODE = CorePackage.EQUIPMENT_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Gen Unit Op Cost Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES = CorePackage.EQUIPMENT_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>Governor SCD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT__GOVERNOR_SCD = CorePackage.EQUIPMENT_FEATURE_COUNT + 47;

	/**
	 * The number of structural features of the '<em>Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT_FEATURE_COUNT = CorePackage.EQUIPMENT_FEATURE_COUNT + 48;

	/**
	 * The number of operations of the '<em>Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATING_UNIT_OPERATION_COUNT = CorePackage.EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.NuclearGeneratingUnit <em>Nuclear Generating Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.NuclearGeneratingUnit
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getNuclearGeneratingUnit()
	 * @generated
	 */
	public static final int NUCLEAR_GENERATING_UNIT = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__UUID = GENERATING_UNIT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__NAMES = GENERATING_UNIT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__DIAGRAM_OBJECTS = GENERATING_UNIT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__MRID = GENERATING_UNIT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__ALIAS_NAME = GENERATING_UNIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__NAME = GENERATING_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__MODELING_AUTHORITY_SET = GENERATING_UNIT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__CHANGE_ITEMS = GENERATING_UNIT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__SCHEDULE_STEPS = GENERATING_UNIT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__SAFETY_DOCUMENTS = GENERATING_UNIT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__OPERATING_SHARE = GENERATING_UNIT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__DOCUMENT_ROLES = GENERATING_UNIT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__PSR_LISTS = GENERATING_UNIT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__MEASUREMENTS = GENERATING_UNIT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__REPORTING_GROUP = GENERATING_UNIT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__PSR_TYPE = GENERATING_UNIT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__ASSETS = GENERATING_UNIT__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__ERP_ORGANISATION_ROLES = GENERATING_UNIT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__LOCATION = GENERATING_UNIT__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__PSR_EVENT = GENERATING_UNIT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__NETWORK_DATA_SETS = GENERATING_UNIT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__OUTAGE_SCHEDULE = GENERATING_UNIT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__CONTINGENCY_EQUIPMENT = GENERATING_UNIT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__CUSTOMER_AGREEMENTS = GENERATING_UNIT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__NORMALLY_IN_SERVICE = GENERATING_UNIT__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__AGGREGATE = GENERATING_UNIT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__EQUIPMENT_CONTAINER = GENERATING_UNIT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Rated Gross Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__RATED_GROSS_MIN_P = GENERATING_UNIT__RATED_GROSS_MIN_P;

	/**
	 * The feature id for the '<em><b>Efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__EFFICIENCY = GENERATING_UNIT__EFFICIENCY;

	/**
	 * The feature id for the '<em><b>Step Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__STEP_CHANGE = GENERATING_UNIT__STEP_CHANGE;

	/**
	 * The feature id for the '<em><b>Rated Net Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__RATED_NET_MAX_P = GENERATING_UNIT__RATED_NET_MAX_P;

	/**
	 * The feature id for the '<em><b>Tie Line PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__TIE_LINE_PF = GENERATING_UNIT__TIE_LINE_PF;

	/**
	 * The feature id for the '<em><b>Disp Reserve Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__DISP_RESERVE_FLAG = GENERATING_UNIT__DISP_RESERVE_FLAG;

	/**
	 * The feature id for the '<em><b>Control Pulse High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__CONTROL_PULSE_HIGH = GENERATING_UNIT__CONTROL_PULSE_HIGH;

	/**
	 * The feature id for the '<em><b>Startup Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__STARTUP_TIME = GENERATING_UNIT__STARTUP_TIME;

	/**
	 * The feature id for the '<em><b>Max Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__MAX_OPERATING_P = GENERATING_UNIT__MAX_OPERATING_P;

	/**
	 * The feature id for the '<em><b>Gen Control Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__GEN_CONTROL_SOURCE = GENERATING_UNIT__GEN_CONTROL_SOURCE;

	/**
	 * The feature id for the '<em><b>Normal PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__NORMAL_PF = GENERATING_UNIT__NORMAL_PF;

	/**
	 * The feature id for the '<em><b>Initial P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__INITIAL_P = GENERATING_UNIT__INITIAL_P;

	/**
	 * The feature id for the '<em><b>Spin Reserve Ramp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__SPIN_RESERVE_RAMP = GENERATING_UNIT__SPIN_RESERVE_RAMP;

	/**
	 * The feature id for the '<em><b>Alloc Spin Res P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__ALLOC_SPIN_RES_P = GENERATING_UNIT__ALLOC_SPIN_RES_P;

	/**
	 * The feature id for the '<em><b>Min Economic P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__MIN_ECONOMIC_P = GENERATING_UNIT__MIN_ECONOMIC_P;

	/**
	 * The feature id for the '<em><b>Long PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__LONG_PF = GENERATING_UNIT__LONG_PF;

	/**
	 * The feature id for the '<em><b>Nominal P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__NOMINAL_P = GENERATING_UNIT__NOMINAL_P;

	/**
	 * The feature id for the '<em><b>Control Response Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__CONTROL_RESPONSE_RATE = GENERATING_UNIT__CONTROL_RESPONSE_RATE;

	/**
	 * The feature id for the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT = GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT;

	/**
	 * The feature id for the '<em><b>Synchronous Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__SYNCHRONOUS_MACHINES = GENERATING_UNIT__SYNCHRONOUS_MACHINES;

	/**
	 * The feature id for the '<em><b>Rated Gross Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__RATED_GROSS_MAX_P = GENERATING_UNIT__RATED_GROSS_MAX_P;

	/**
	 * The feature id for the '<em><b>Penalty Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__PENALTY_FACTOR = GENERATING_UNIT__PENALTY_FACTOR;

	/**
	 * The feature id for the '<em><b>Fast Start Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__FAST_START_FLAG = GENERATING_UNIT__FAST_START_FLAG;

	/**
	 * The feature id for the '<em><b>Minimum Off Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__MINIMUM_OFF_TIME = GENERATING_UNIT__MINIMUM_OFF_TIME;

	/**
	 * The feature id for the '<em><b>Short PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__SHORT_PF = GENERATING_UNIT__SHORT_PF;

	/**
	 * The feature id for the '<em><b>Governor MPL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__GOVERNOR_MPL = GENERATING_UNIT__GOVERNOR_MPL;

	/**
	 * The feature id for the '<em><b>Energy Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__ENERGY_MIN_P = GENERATING_UNIT__ENERGY_MIN_P;

	/**
	 * The feature id for the '<em><b>Fuel Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__FUEL_PRIORITY = GENERATING_UNIT__FUEL_PRIORITY;

	/**
	 * The feature id for the '<em><b>Max Economic P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__MAX_ECONOMIC_P = GENERATING_UNIT__MAX_ECONOMIC_P;

	/**
	 * The feature id for the '<em><b>Auto Cntrl Margin P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__AUTO_CNTRL_MARGIN_P = GENERATING_UNIT__AUTO_CNTRL_MARGIN_P;

	/**
	 * The feature id for the '<em><b>High Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__HIGH_CONTROL_LIMIT = GENERATING_UNIT__HIGH_CONTROL_LIMIT;

	/**
	 * The feature id for the '<em><b>Model Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__MODEL_DETAIL = GENERATING_UNIT__MODEL_DETAIL;

	/**
	 * The feature id for the '<em><b>Control Pulse Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__CONTROL_PULSE_LOW = GENERATING_UNIT__CONTROL_PULSE_LOW;

	/**
	 * The feature id for the '<em><b>Raise Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__RAISE_RAMP_RATE = GENERATING_UNIT__RAISE_RAMP_RATE;

	/**
	 * The feature id for the '<em><b>Gen Unit Op Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE = GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Control Deadband</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__CONTROL_DEADBAND = GENERATING_UNIT__CONTROL_DEADBAND;

	/**
	 * The feature id for the '<em><b>Base P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__BASE_P = GENERATING_UNIT__BASE_P;

	/**
	 * The feature id for the '<em><b>Startup Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__STARTUP_COST = GENERATING_UNIT__STARTUP_COST;

	/**
	 * The feature id for the '<em><b>Variable Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__VARIABLE_COST = GENERATING_UNIT__VARIABLE_COST;

	/**
	 * The feature id for the '<em><b>Gen Operating Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__GEN_OPERATING_MODE = GENERATING_UNIT__GEN_OPERATING_MODE;

	/**
	 * The feature id for the '<em><b>Lower Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__LOWER_RAMP_RATE = GENERATING_UNIT__LOWER_RAMP_RATE;

	/**
	 * The feature id for the '<em><b>Min Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__MIN_OPERATING_P = GENERATING_UNIT__MIN_OPERATING_P;

	/**
	 * The feature id for the '<em><b>Low Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__LOW_CONTROL_LIMIT = GENERATING_UNIT__LOW_CONTROL_LIMIT;

	/**
	 * The feature id for the '<em><b>Gross To Net Active Power Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES = GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES;

	/**
	 * The feature id for the '<em><b>Maximum Allowable Spinning Reserve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE = GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE;

	/**
	 * The feature id for the '<em><b>Gen Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__GEN_CONTROL_MODE = GENERATING_UNIT__GEN_CONTROL_MODE;

	/**
	 * The feature id for the '<em><b>Gen Unit Op Cost Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES = GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES;

	/**
	 * The feature id for the '<em><b>Governor SCD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT__GOVERNOR_SCD = GENERATING_UNIT__GOVERNOR_SCD;

	/**
	 * The number of structural features of the '<em>Nuclear Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT_FEATURE_COUNT = GENERATING_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Nuclear Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUCLEAR_GENERATING_UNIT_OPERATION_COUNT = GENERATING_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.EmissionCurve <em>Emission Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.EmissionCurve
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getEmissionCurve()
	 * @generated
	 */
	public static final int EMISSION_CURVE = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_CURVE__NAMES = CorePackage.CURVE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_CURVE__DIAGRAM_OBJECTS = CorePackage.CURVE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Emission Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_CURVE__EMISSION_CONTENT = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_CURVE__THERMAL_GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Net Gross P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_CURVE__IS_NET_GROSS_P = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Emission Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_CURVE__EMISSION_TYPE = CorePackage.CURVE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Emission Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Emission Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.HydroPumpOpSchedule <em>Hydro Pump Op Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.HydroPumpOpSchedule
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getHydroPumpOpSchedule()
	 * @generated
	 */
	public static final int HYDRO_PUMP_OP_SCHEDULE = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP_OP_SCHEDULE__UUID = CorePackage.REGULAR_INTERVAL_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP_OP_SCHEDULE__NAMES = CorePackage.REGULAR_INTERVAL_SCHEDULE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP_OP_SCHEDULE__DIAGRAM_OBJECTS = CorePackage.REGULAR_INTERVAL_SCHEDULE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP_OP_SCHEDULE__MRID = CorePackage.REGULAR_INTERVAL_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP_OP_SCHEDULE__ALIAS_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP_OP_SCHEDULE__NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP_OP_SCHEDULE__MODELING_AUTHORITY_SET = CorePackage.REGULAR_INTERVAL_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP_OP_SCHEDULE__START_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP_OP_SCHEDULE__VALUE1_MULTIPLIER = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP_OP_SCHEDULE__VALUE2_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP_OP_SCHEDULE__VALUE1_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP_OP_SCHEDULE__VALUE2_MULTIPLIER = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP_OP_SCHEDULE__END_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP_OP_SCHEDULE__TIME_STEP = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP_OP_SCHEDULE__TIME_POINTS = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Hydro Pump</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hydro Pump Op Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP_OP_SCHEDULE_FEATURE_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hydro Pump Op Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP_OP_SCHEDULE_OPERATION_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.SteamSendoutSchedule <em>Steam Sendout Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.SteamSendoutSchedule
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getSteamSendoutSchedule()
	 * @generated
	 */
	public static final int STEAM_SENDOUT_SCHEDULE = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STEAM_SENDOUT_SCHEDULE__UUID = CorePackage.REGULAR_INTERVAL_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STEAM_SENDOUT_SCHEDULE__NAMES = CorePackage.REGULAR_INTERVAL_SCHEDULE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STEAM_SENDOUT_SCHEDULE__DIAGRAM_OBJECTS = CorePackage.REGULAR_INTERVAL_SCHEDULE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STEAM_SENDOUT_SCHEDULE__MRID = CorePackage.REGULAR_INTERVAL_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STEAM_SENDOUT_SCHEDULE__ALIAS_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STEAM_SENDOUT_SCHEDULE__NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STEAM_SENDOUT_SCHEDULE__MODELING_AUTHORITY_SET = CorePackage.REGULAR_INTERVAL_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STEAM_SENDOUT_SCHEDULE__START_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STEAM_SENDOUT_SCHEDULE__VALUE1_MULTIPLIER = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STEAM_SENDOUT_SCHEDULE__VALUE2_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STEAM_SENDOUT_SCHEDULE__VALUE1_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STEAM_SENDOUT_SCHEDULE__VALUE2_MULTIPLIER = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STEAM_SENDOUT_SCHEDULE__END_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STEAM_SENDOUT_SCHEDULE__TIME_STEP = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STEAM_SENDOUT_SCHEDULE__TIME_POINTS = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Cogeneration Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Steam Sendout Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STEAM_SENDOUT_SCHEDULE_FEATURE_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Steam Sendout Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STEAM_SENDOUT_SCHEDULE_OPERATION_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.TargetLevelSchedule <em>Target Level Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.TargetLevelSchedule
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getTargetLevelSchedule()
	 * @generated
	 */
	public static final int TARGET_LEVEL_SCHEDULE = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_LEVEL_SCHEDULE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_LEVEL_SCHEDULE__NAMES = CorePackage.CURVE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_LEVEL_SCHEDULE__DIAGRAM_OBJECTS = CorePackage.CURVE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_LEVEL_SCHEDULE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_LEVEL_SCHEDULE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_LEVEL_SCHEDULE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_LEVEL_SCHEDULE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_LEVEL_SCHEDULE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_LEVEL_SCHEDULE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_LEVEL_SCHEDULE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_LEVEL_SCHEDULE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_LEVEL_SCHEDULE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_LEVEL_SCHEDULE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_LEVEL_SCHEDULE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_LEVEL_SCHEDULE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_LEVEL_SCHEDULE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_LEVEL_SCHEDULE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Low Level Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_LEVEL_SCHEDULE__LOW_LEVEL_LIMIT = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reservoir</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_LEVEL_SCHEDULE__RESERVOIR = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>High Level Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_LEVEL_SCHEDULE__HIGH_LEVEL_LIMIT = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Target Level Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_LEVEL_SCHEDULE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Target Level Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_LEVEL_SCHEDULE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.CombinedCyclePlant <em>Combined Cycle Plant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.CombinedCyclePlant
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getCombinedCyclePlant()
	 * @generated
	 */
	public static final int COMBINED_CYCLE_PLANT = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT__NAMES = CorePackage.POWER_SYSTEM_RESOURCE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT__DIAGRAM_OBJECTS = CorePackage.POWER_SYSTEM_RESOURCE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Comb Cycle Plant Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT__COMB_CYCLE_PLANT_RATING = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Thermal Generating Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Combined Cycle Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Combined Cycle Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMBINED_CYCLE_PLANT_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.HeatRateCurve <em>Heat Rate Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.HeatRateCurve
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getHeatRateCurve()
	 * @generated
	 */
	public static final int HEAT_RATE_CURVE = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_RATE_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_RATE_CURVE__NAMES = CorePackage.CURVE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_RATE_CURVE__DIAGRAM_OBJECTS = CorePackage.CURVE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_RATE_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_RATE_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_RATE_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_RATE_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_RATE_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_RATE_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_RATE_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_RATE_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_RATE_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_RATE_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_RATE_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_RATE_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_RATE_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_RATE_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Is Net Gross P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_RATE_CURVE__IS_NET_GROSS_P = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Heat Rate Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_RATE_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Heat Rate Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_RATE_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit <em>Thermal Generating Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getThermalGeneratingUnit()
	 * @generated
	 */
	public static final int THERMAL_GENERATING_UNIT = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__UUID = GENERATING_UNIT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__NAMES = GENERATING_UNIT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__DIAGRAM_OBJECTS = GENERATING_UNIT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__MRID = GENERATING_UNIT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__ALIAS_NAME = GENERATING_UNIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__NAME = GENERATING_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__MODELING_AUTHORITY_SET = GENERATING_UNIT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__CHANGE_ITEMS = GENERATING_UNIT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__SCHEDULE_STEPS = GENERATING_UNIT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__SAFETY_DOCUMENTS = GENERATING_UNIT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__OPERATING_SHARE = GENERATING_UNIT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__DOCUMENT_ROLES = GENERATING_UNIT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__PSR_LISTS = GENERATING_UNIT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__MEASUREMENTS = GENERATING_UNIT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__REPORTING_GROUP = GENERATING_UNIT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__PSR_TYPE = GENERATING_UNIT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__ASSETS = GENERATING_UNIT__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__ERP_ORGANISATION_ROLES = GENERATING_UNIT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__LOCATION = GENERATING_UNIT__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__PSR_EVENT = GENERATING_UNIT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__NETWORK_DATA_SETS = GENERATING_UNIT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__OUTAGE_SCHEDULE = GENERATING_UNIT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__CONTINGENCY_EQUIPMENT = GENERATING_UNIT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__CUSTOMER_AGREEMENTS = GENERATING_UNIT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__NORMALLY_IN_SERVICE = GENERATING_UNIT__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__AGGREGATE = GENERATING_UNIT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__EQUIPMENT_CONTAINER = GENERATING_UNIT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Rated Gross Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__RATED_GROSS_MIN_P = GENERATING_UNIT__RATED_GROSS_MIN_P;

	/**
	 * The feature id for the '<em><b>Efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__EFFICIENCY = GENERATING_UNIT__EFFICIENCY;

	/**
	 * The feature id for the '<em><b>Step Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__STEP_CHANGE = GENERATING_UNIT__STEP_CHANGE;

	/**
	 * The feature id for the '<em><b>Rated Net Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__RATED_NET_MAX_P = GENERATING_UNIT__RATED_NET_MAX_P;

	/**
	 * The feature id for the '<em><b>Tie Line PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__TIE_LINE_PF = GENERATING_UNIT__TIE_LINE_PF;

	/**
	 * The feature id for the '<em><b>Disp Reserve Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__DISP_RESERVE_FLAG = GENERATING_UNIT__DISP_RESERVE_FLAG;

	/**
	 * The feature id for the '<em><b>Control Pulse High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__CONTROL_PULSE_HIGH = GENERATING_UNIT__CONTROL_PULSE_HIGH;

	/**
	 * The feature id for the '<em><b>Startup Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__STARTUP_TIME = GENERATING_UNIT__STARTUP_TIME;

	/**
	 * The feature id for the '<em><b>Max Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__MAX_OPERATING_P = GENERATING_UNIT__MAX_OPERATING_P;

	/**
	 * The feature id for the '<em><b>Gen Control Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__GEN_CONTROL_SOURCE = GENERATING_UNIT__GEN_CONTROL_SOURCE;

	/**
	 * The feature id for the '<em><b>Normal PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__NORMAL_PF = GENERATING_UNIT__NORMAL_PF;

	/**
	 * The feature id for the '<em><b>Initial P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__INITIAL_P = GENERATING_UNIT__INITIAL_P;

	/**
	 * The feature id for the '<em><b>Spin Reserve Ramp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__SPIN_RESERVE_RAMP = GENERATING_UNIT__SPIN_RESERVE_RAMP;

	/**
	 * The feature id for the '<em><b>Alloc Spin Res P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__ALLOC_SPIN_RES_P = GENERATING_UNIT__ALLOC_SPIN_RES_P;

	/**
	 * The feature id for the '<em><b>Min Economic P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__MIN_ECONOMIC_P = GENERATING_UNIT__MIN_ECONOMIC_P;

	/**
	 * The feature id for the '<em><b>Long PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__LONG_PF = GENERATING_UNIT__LONG_PF;

	/**
	 * The feature id for the '<em><b>Nominal P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__NOMINAL_P = GENERATING_UNIT__NOMINAL_P;

	/**
	 * The feature id for the '<em><b>Control Response Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__CONTROL_RESPONSE_RATE = GENERATING_UNIT__CONTROL_RESPONSE_RATE;

	/**
	 * The feature id for the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT = GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT;

	/**
	 * The feature id for the '<em><b>Synchronous Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__SYNCHRONOUS_MACHINES = GENERATING_UNIT__SYNCHRONOUS_MACHINES;

	/**
	 * The feature id for the '<em><b>Rated Gross Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__RATED_GROSS_MAX_P = GENERATING_UNIT__RATED_GROSS_MAX_P;

	/**
	 * The feature id for the '<em><b>Penalty Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__PENALTY_FACTOR = GENERATING_UNIT__PENALTY_FACTOR;

	/**
	 * The feature id for the '<em><b>Fast Start Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__FAST_START_FLAG = GENERATING_UNIT__FAST_START_FLAG;

	/**
	 * The feature id for the '<em><b>Minimum Off Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__MINIMUM_OFF_TIME = GENERATING_UNIT__MINIMUM_OFF_TIME;

	/**
	 * The feature id for the '<em><b>Short PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__SHORT_PF = GENERATING_UNIT__SHORT_PF;

	/**
	 * The feature id for the '<em><b>Governor MPL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__GOVERNOR_MPL = GENERATING_UNIT__GOVERNOR_MPL;

	/**
	 * The feature id for the '<em><b>Energy Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__ENERGY_MIN_P = GENERATING_UNIT__ENERGY_MIN_P;

	/**
	 * The feature id for the '<em><b>Fuel Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__FUEL_PRIORITY = GENERATING_UNIT__FUEL_PRIORITY;

	/**
	 * The feature id for the '<em><b>Max Economic P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__MAX_ECONOMIC_P = GENERATING_UNIT__MAX_ECONOMIC_P;

	/**
	 * The feature id for the '<em><b>Auto Cntrl Margin P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__AUTO_CNTRL_MARGIN_P = GENERATING_UNIT__AUTO_CNTRL_MARGIN_P;

	/**
	 * The feature id for the '<em><b>High Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__HIGH_CONTROL_LIMIT = GENERATING_UNIT__HIGH_CONTROL_LIMIT;

	/**
	 * The feature id for the '<em><b>Model Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__MODEL_DETAIL = GENERATING_UNIT__MODEL_DETAIL;

	/**
	 * The feature id for the '<em><b>Control Pulse Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__CONTROL_PULSE_LOW = GENERATING_UNIT__CONTROL_PULSE_LOW;

	/**
	 * The feature id for the '<em><b>Raise Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__RAISE_RAMP_RATE = GENERATING_UNIT__RAISE_RAMP_RATE;

	/**
	 * The feature id for the '<em><b>Gen Unit Op Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE = GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Control Deadband</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__CONTROL_DEADBAND = GENERATING_UNIT__CONTROL_DEADBAND;

	/**
	 * The feature id for the '<em><b>Base P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__BASE_P = GENERATING_UNIT__BASE_P;

	/**
	 * The feature id for the '<em><b>Startup Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__STARTUP_COST = GENERATING_UNIT__STARTUP_COST;

	/**
	 * The feature id for the '<em><b>Variable Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__VARIABLE_COST = GENERATING_UNIT__VARIABLE_COST;

	/**
	 * The feature id for the '<em><b>Gen Operating Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__GEN_OPERATING_MODE = GENERATING_UNIT__GEN_OPERATING_MODE;

	/**
	 * The feature id for the '<em><b>Lower Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__LOWER_RAMP_RATE = GENERATING_UNIT__LOWER_RAMP_RATE;

	/**
	 * The feature id for the '<em><b>Min Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__MIN_OPERATING_P = GENERATING_UNIT__MIN_OPERATING_P;

	/**
	 * The feature id for the '<em><b>Low Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__LOW_CONTROL_LIMIT = GENERATING_UNIT__LOW_CONTROL_LIMIT;

	/**
	 * The feature id for the '<em><b>Gross To Net Active Power Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES = GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES;

	/**
	 * The feature id for the '<em><b>Maximum Allowable Spinning Reserve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE = GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE;

	/**
	 * The feature id for the '<em><b>Gen Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__GEN_CONTROL_MODE = GENERATING_UNIT__GEN_CONTROL_MODE;

	/**
	 * The feature id for the '<em><b>Gen Unit Op Cost Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES = GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES;

	/**
	 * The feature id for the '<em><b>Governor SCD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__GOVERNOR_SCD = GENERATING_UNIT__GOVERNOR_SCD;

	/**
	 * The feature id for the '<em><b>CAES Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__CAES_PLANT = GENERATING_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cogeneration Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__COGENERATION_PLANT = GENERATING_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shutdown Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE = GENERATING_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fossil Fuels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__FOSSIL_FUELS = GENERATING_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Heat Rate Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE = GENERATING_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fuel Allocation Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES = GENERATING_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Emission Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__EMISSION_CURVES = GENERATING_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Heat Input Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE = GENERATING_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Combined Cycle Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT = GENERATING_UNIT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Incremental Heat Rate Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE = GENERATING_UNIT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Startup Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__STARTUP_MODEL = GENERATING_UNIT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Emmission Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS = GENERATING_UNIT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>OM Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT__OM_COST = GENERATING_UNIT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Thermal Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT_FEATURE_COUNT = GENERATING_UNIT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Thermal Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_GENERATING_UNIT_OPERATION_COUNT = GENERATING_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.EmissionAccount <em>Emission Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.EmissionAccount
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getEmissionAccount()
	 * @generated
	 */
	public static final int EMISSION_ACCOUNT = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_ACCOUNT__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_ACCOUNT__NAMES = CorePackage.CURVE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_ACCOUNT__DIAGRAM_OBJECTS = CorePackage.CURVE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_ACCOUNT__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_ACCOUNT__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_ACCOUNT__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_ACCOUNT__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_ACCOUNT__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_ACCOUNT__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_ACCOUNT__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_ACCOUNT__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_ACCOUNT__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_ACCOUNT__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_ACCOUNT__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_ACCOUNT__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_ACCOUNT__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_ACCOUNT__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Emission Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_ACCOUNT__EMISSION_TYPE = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Emission Value Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_ACCOUNT__EMISSION_VALUE_SOURCE = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_ACCOUNT__THERMAL_GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Emission Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_ACCOUNT_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Emission Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMISSION_ACCOUNT_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.PenstockLossCurve <em>Penstock Loss Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.PenstockLossCurve
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getPenstockLossCurve()
	 * @generated
	 */
	public static final int PENSTOCK_LOSS_CURVE = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENSTOCK_LOSS_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENSTOCK_LOSS_CURVE__NAMES = CorePackage.CURVE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENSTOCK_LOSS_CURVE__DIAGRAM_OBJECTS = CorePackage.CURVE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENSTOCK_LOSS_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENSTOCK_LOSS_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENSTOCK_LOSS_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENSTOCK_LOSS_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENSTOCK_LOSS_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENSTOCK_LOSS_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENSTOCK_LOSS_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENSTOCK_LOSS_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENSTOCK_LOSS_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENSTOCK_LOSS_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENSTOCK_LOSS_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENSTOCK_LOSS_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENSTOCK_LOSS_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENSTOCK_LOSS_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Hydro Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENSTOCK_LOSS_CURVE__HYDRO_GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Penstock Loss Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENSTOCK_LOSS_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Penstock Loss Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PENSTOCK_LOSS_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.StartupModel <em>Startup Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.StartupModel
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getStartupModel()
	 * @generated
	 */
	public static final int STARTUP_MODEL = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STARTUP_MODEL__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STARTUP_MODEL__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STARTUP_MODEL__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STARTUP_MODEL__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STARTUP_MODEL__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STARTUP_MODEL__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STARTUP_MODEL__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Startup Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STARTUP_MODEL__STARTUP_COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stby Aux P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STARTUP_MODEL__STBY_AUX_P = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Ramp Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STARTUP_MODEL__START_RAMP_CURVE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Minimum Run Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STARTUP_MODEL__MINIMUM_RUN_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Start Main Fuel Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STARTUP_MODEL__START_MAIN_FUEL_CURVE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Risk Factor Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STARTUP_MODEL__RISK_FACTOR_COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Minimum Down Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STARTUP_MODEL__MINIMUM_DOWN_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fixed Maint Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STARTUP_MODEL__FIXED_MAINT_COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Startup Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STARTUP_MODEL__STARTUP_DATE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Start Ign Fuel Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STARTUP_MODEL__START_IGN_FUEL_CURVE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Hot Standby Heat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STARTUP_MODEL__HOT_STANDBY_HEAT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Startup Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STARTUP_MODEL__STARTUP_PRIORITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Incremental Maint Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STARTUP_MODEL__INCREMENTAL_MAINT_COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STARTUP_MODEL__THERMAL_GENERATING_UNIT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Startup Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STARTUP_MODEL_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Startup Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STARTUP_MODEL_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit <em>Hydro Generating Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.HydroGeneratingUnit
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getHydroGeneratingUnit()
	 * @generated
	 */
	public static final int HYDRO_GENERATING_UNIT = 18;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__UUID = GENERATING_UNIT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__NAMES = GENERATING_UNIT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__DIAGRAM_OBJECTS = GENERATING_UNIT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__MRID = GENERATING_UNIT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__ALIAS_NAME = GENERATING_UNIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__NAME = GENERATING_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__MODELING_AUTHORITY_SET = GENERATING_UNIT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__CHANGE_ITEMS = GENERATING_UNIT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__SCHEDULE_STEPS = GENERATING_UNIT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__SAFETY_DOCUMENTS = GENERATING_UNIT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__OPERATING_SHARE = GENERATING_UNIT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__DOCUMENT_ROLES = GENERATING_UNIT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__PSR_LISTS = GENERATING_UNIT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__MEASUREMENTS = GENERATING_UNIT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__REPORTING_GROUP = GENERATING_UNIT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__PSR_TYPE = GENERATING_UNIT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__ASSETS = GENERATING_UNIT__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__ERP_ORGANISATION_ROLES = GENERATING_UNIT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__LOCATION = GENERATING_UNIT__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__PSR_EVENT = GENERATING_UNIT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__NETWORK_DATA_SETS = GENERATING_UNIT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__OUTAGE_SCHEDULE = GENERATING_UNIT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__CONTINGENCY_EQUIPMENT = GENERATING_UNIT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__CUSTOMER_AGREEMENTS = GENERATING_UNIT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__NORMALLY_IN_SERVICE = GENERATING_UNIT__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__AGGREGATE = GENERATING_UNIT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__EQUIPMENT_CONTAINER = GENERATING_UNIT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Rated Gross Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__RATED_GROSS_MIN_P = GENERATING_UNIT__RATED_GROSS_MIN_P;

	/**
	 * The feature id for the '<em><b>Efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__EFFICIENCY = GENERATING_UNIT__EFFICIENCY;

	/**
	 * The feature id for the '<em><b>Step Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__STEP_CHANGE = GENERATING_UNIT__STEP_CHANGE;

	/**
	 * The feature id for the '<em><b>Rated Net Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__RATED_NET_MAX_P = GENERATING_UNIT__RATED_NET_MAX_P;

	/**
	 * The feature id for the '<em><b>Tie Line PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__TIE_LINE_PF = GENERATING_UNIT__TIE_LINE_PF;

	/**
	 * The feature id for the '<em><b>Disp Reserve Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__DISP_RESERVE_FLAG = GENERATING_UNIT__DISP_RESERVE_FLAG;

	/**
	 * The feature id for the '<em><b>Control Pulse High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__CONTROL_PULSE_HIGH = GENERATING_UNIT__CONTROL_PULSE_HIGH;

	/**
	 * The feature id for the '<em><b>Startup Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__STARTUP_TIME = GENERATING_UNIT__STARTUP_TIME;

	/**
	 * The feature id for the '<em><b>Max Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__MAX_OPERATING_P = GENERATING_UNIT__MAX_OPERATING_P;

	/**
	 * The feature id for the '<em><b>Gen Control Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__GEN_CONTROL_SOURCE = GENERATING_UNIT__GEN_CONTROL_SOURCE;

	/**
	 * The feature id for the '<em><b>Normal PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__NORMAL_PF = GENERATING_UNIT__NORMAL_PF;

	/**
	 * The feature id for the '<em><b>Initial P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__INITIAL_P = GENERATING_UNIT__INITIAL_P;

	/**
	 * The feature id for the '<em><b>Spin Reserve Ramp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__SPIN_RESERVE_RAMP = GENERATING_UNIT__SPIN_RESERVE_RAMP;

	/**
	 * The feature id for the '<em><b>Alloc Spin Res P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__ALLOC_SPIN_RES_P = GENERATING_UNIT__ALLOC_SPIN_RES_P;

	/**
	 * The feature id for the '<em><b>Min Economic P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__MIN_ECONOMIC_P = GENERATING_UNIT__MIN_ECONOMIC_P;

	/**
	 * The feature id for the '<em><b>Long PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__LONG_PF = GENERATING_UNIT__LONG_PF;

	/**
	 * The feature id for the '<em><b>Nominal P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__NOMINAL_P = GENERATING_UNIT__NOMINAL_P;

	/**
	 * The feature id for the '<em><b>Control Response Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__CONTROL_RESPONSE_RATE = GENERATING_UNIT__CONTROL_RESPONSE_RATE;

	/**
	 * The feature id for the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT = GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT;

	/**
	 * The feature id for the '<em><b>Synchronous Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__SYNCHRONOUS_MACHINES = GENERATING_UNIT__SYNCHRONOUS_MACHINES;

	/**
	 * The feature id for the '<em><b>Rated Gross Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__RATED_GROSS_MAX_P = GENERATING_UNIT__RATED_GROSS_MAX_P;

	/**
	 * The feature id for the '<em><b>Penalty Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__PENALTY_FACTOR = GENERATING_UNIT__PENALTY_FACTOR;

	/**
	 * The feature id for the '<em><b>Fast Start Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__FAST_START_FLAG = GENERATING_UNIT__FAST_START_FLAG;

	/**
	 * The feature id for the '<em><b>Minimum Off Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__MINIMUM_OFF_TIME = GENERATING_UNIT__MINIMUM_OFF_TIME;

	/**
	 * The feature id for the '<em><b>Short PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__SHORT_PF = GENERATING_UNIT__SHORT_PF;

	/**
	 * The feature id for the '<em><b>Governor MPL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__GOVERNOR_MPL = GENERATING_UNIT__GOVERNOR_MPL;

	/**
	 * The feature id for the '<em><b>Energy Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__ENERGY_MIN_P = GENERATING_UNIT__ENERGY_MIN_P;

	/**
	 * The feature id for the '<em><b>Fuel Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__FUEL_PRIORITY = GENERATING_UNIT__FUEL_PRIORITY;

	/**
	 * The feature id for the '<em><b>Max Economic P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__MAX_ECONOMIC_P = GENERATING_UNIT__MAX_ECONOMIC_P;

	/**
	 * The feature id for the '<em><b>Auto Cntrl Margin P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__AUTO_CNTRL_MARGIN_P = GENERATING_UNIT__AUTO_CNTRL_MARGIN_P;

	/**
	 * The feature id for the '<em><b>High Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__HIGH_CONTROL_LIMIT = GENERATING_UNIT__HIGH_CONTROL_LIMIT;

	/**
	 * The feature id for the '<em><b>Model Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__MODEL_DETAIL = GENERATING_UNIT__MODEL_DETAIL;

	/**
	 * The feature id for the '<em><b>Control Pulse Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__CONTROL_PULSE_LOW = GENERATING_UNIT__CONTROL_PULSE_LOW;

	/**
	 * The feature id for the '<em><b>Raise Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__RAISE_RAMP_RATE = GENERATING_UNIT__RAISE_RAMP_RATE;

	/**
	 * The feature id for the '<em><b>Gen Unit Op Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE = GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Control Deadband</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__CONTROL_DEADBAND = GENERATING_UNIT__CONTROL_DEADBAND;

	/**
	 * The feature id for the '<em><b>Base P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__BASE_P = GENERATING_UNIT__BASE_P;

	/**
	 * The feature id for the '<em><b>Startup Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__STARTUP_COST = GENERATING_UNIT__STARTUP_COST;

	/**
	 * The feature id for the '<em><b>Variable Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__VARIABLE_COST = GENERATING_UNIT__VARIABLE_COST;

	/**
	 * The feature id for the '<em><b>Gen Operating Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__GEN_OPERATING_MODE = GENERATING_UNIT__GEN_OPERATING_MODE;

	/**
	 * The feature id for the '<em><b>Lower Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__LOWER_RAMP_RATE = GENERATING_UNIT__LOWER_RAMP_RATE;

	/**
	 * The feature id for the '<em><b>Min Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__MIN_OPERATING_P = GENERATING_UNIT__MIN_OPERATING_P;

	/**
	 * The feature id for the '<em><b>Low Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__LOW_CONTROL_LIMIT = GENERATING_UNIT__LOW_CONTROL_LIMIT;

	/**
	 * The feature id for the '<em><b>Gross To Net Active Power Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES = GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES;

	/**
	 * The feature id for the '<em><b>Maximum Allowable Spinning Reserve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE = GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE;

	/**
	 * The feature id for the '<em><b>Gen Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__GEN_CONTROL_MODE = GENERATING_UNIT__GEN_CONTROL_MODE;

	/**
	 * The feature id for the '<em><b>Gen Unit Op Cost Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES = GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES;

	/**
	 * The feature id for the '<em><b>Governor SCD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__GOVERNOR_SCD = GENERATING_UNIT__GOVERNOR_SCD;

	/**
	 * The feature id for the '<em><b>Energy Conversion Capability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY = GENERATING_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Penstock Loss Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE = GENERATING_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hydro Power Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT = GENERATING_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hydro Unit Water Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__HYDRO_UNIT_WATER_COST = GENERATING_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tailbay Loss Curve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE = GENERATING_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hydro Generating Efficiency Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES = GENERATING_UNIT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Hydro Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT_FEATURE_COUNT = GENERATING_UNIT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Hydro Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_UNIT_OPERATION_COUNT = GENERATING_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.GenUnitOpCostCurve <em>Gen Unit Op Cost Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.GenUnitOpCostCurve
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getGenUnitOpCostCurve()
	 * @generated
	 */
	public static final int GEN_UNIT_OP_COST_CURVE = 19;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_COST_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_COST_CURVE__NAMES = CorePackage.CURVE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_COST_CURVE__DIAGRAM_OBJECTS = CorePackage.CURVE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_COST_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_COST_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_COST_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_COST_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_COST_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_COST_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_COST_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_COST_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_COST_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_COST_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_COST_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_COST_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_COST_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_COST_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Is Net Gross P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_COST_CURVE__IS_NET_GROSS_P = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gen Unit Op Cost Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_COST_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gen Unit Op Cost Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GEN_UNIT_OP_COST_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.IncrementalHeatRateCurve <em>Incremental Heat Rate Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.IncrementalHeatRateCurve
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getIncrementalHeatRateCurve()
	 * @generated
	 */
	public static final int INCREMENTAL_HEAT_RATE_CURVE = 20;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENTAL_HEAT_RATE_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENTAL_HEAT_RATE_CURVE__NAMES = CorePackage.CURVE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENTAL_HEAT_RATE_CURVE__DIAGRAM_OBJECTS = CorePackage.CURVE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENTAL_HEAT_RATE_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENTAL_HEAT_RATE_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENTAL_HEAT_RATE_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENTAL_HEAT_RATE_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENTAL_HEAT_RATE_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENTAL_HEAT_RATE_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENTAL_HEAT_RATE_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENTAL_HEAT_RATE_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENTAL_HEAT_RATE_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENTAL_HEAT_RATE_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENTAL_HEAT_RATE_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENTAL_HEAT_RATE_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENTAL_HEAT_RATE_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENTAL_HEAT_RATE_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENTAL_HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Net Gross P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENTAL_HEAT_RATE_CURVE__IS_NET_GROSS_P = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Incremental Heat Rate Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENTAL_HEAT_RATE_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Incremental Heat Rate Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INCREMENTAL_HEAT_RATE_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.FossilFuel <em>Fossil Fuel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.FossilFuel
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getFossilFuel()
	 * @generated
	 */
	public static final int FOSSIL_FUEL = 21;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FOSSIL_FUEL__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FOSSIL_FUEL__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FOSSIL_FUEL__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FOSSIL_FUEL__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FOSSIL_FUEL__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FOSSIL_FUEL__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FOSSIL_FUEL__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Fuel Sulfur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FOSSIL_FUEL__FUEL_SULFUR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fuel Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FOSSIL_FUEL__FUEL_COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fossil Fuel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FOSSIL_FUEL__FOSSIL_FUEL_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Low Breakpoint P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FOSSIL_FUEL__LOW_BREAKPOINT_P = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fuel Dispatch Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FOSSIL_FUEL__FUEL_DISPATCH_COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fuel Handling Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FOSSIL_FUEL__FUEL_HANDLING_COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FOSSIL_FUEL__THERMAL_GENERATING_UNIT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fuel Heat Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FOSSIL_FUEL__FUEL_HEAT_CONTENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fuel Eff Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FOSSIL_FUEL__FUEL_EFF_FACTOR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Fuel Mixture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FOSSIL_FUEL__FUEL_MIXTURE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Fuel Allocation Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>High Breakpoint P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FOSSIL_FUEL__HIGH_BREAKPOINT_P = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Fossil Fuel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FOSSIL_FUEL_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Fossil Fuel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FOSSIL_FUEL_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.StartIgnFuelCurve <em>Start Ign Fuel Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.StartIgnFuelCurve
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getStartIgnFuelCurve()
	 * @generated
	 */
	public static final int START_IGN_FUEL_CURVE = 23;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_IGN_FUEL_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_IGN_FUEL_CURVE__NAMES = CorePackage.CURVE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_IGN_FUEL_CURVE__DIAGRAM_OBJECTS = CorePackage.CURVE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_IGN_FUEL_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_IGN_FUEL_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_IGN_FUEL_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_IGN_FUEL_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_IGN_FUEL_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_IGN_FUEL_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_IGN_FUEL_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_IGN_FUEL_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_IGN_FUEL_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_IGN_FUEL_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_IGN_FUEL_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_IGN_FUEL_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_IGN_FUEL_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_IGN_FUEL_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Startup Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_IGN_FUEL_CURVE__STARTUP_MODEL = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ignition Fuel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_IGN_FUEL_CURVE__IGNITION_FUEL_TYPE = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Start Ign Fuel Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_IGN_FUEL_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Start Ign Fuel Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_IGN_FUEL_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.StartMainFuelCurve <em>Start Main Fuel Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.StartMainFuelCurve
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getStartMainFuelCurve()
	 * @generated
	 */
	public static final int START_MAIN_FUEL_CURVE = 24;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_MAIN_FUEL_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_MAIN_FUEL_CURVE__NAMES = CorePackage.CURVE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_MAIN_FUEL_CURVE__DIAGRAM_OBJECTS = CorePackage.CURVE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_MAIN_FUEL_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_MAIN_FUEL_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_MAIN_FUEL_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_MAIN_FUEL_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_MAIN_FUEL_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_MAIN_FUEL_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_MAIN_FUEL_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_MAIN_FUEL_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_MAIN_FUEL_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_MAIN_FUEL_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_MAIN_FUEL_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_MAIN_FUEL_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_MAIN_FUEL_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_MAIN_FUEL_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Main Fuel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_MAIN_FUEL_CURVE__MAIN_FUEL_TYPE = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Startup Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_MAIN_FUEL_CURVE__STARTUP_MODEL = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Start Main Fuel Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_MAIN_FUEL_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Start Main Fuel Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int START_MAIN_FUEL_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.TailbayLossCurve <em>Tailbay Loss Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.TailbayLossCurve
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getTailbayLossCurve()
	 * @generated
	 */
	public static final int TAILBAY_LOSS_CURVE = 25;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAILBAY_LOSS_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAILBAY_LOSS_CURVE__NAMES = CorePackage.CURVE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAILBAY_LOSS_CURVE__DIAGRAM_OBJECTS = CorePackage.CURVE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAILBAY_LOSS_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAILBAY_LOSS_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAILBAY_LOSS_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAILBAY_LOSS_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAILBAY_LOSS_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAILBAY_LOSS_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAILBAY_LOSS_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAILBAY_LOSS_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAILBAY_LOSS_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAILBAY_LOSS_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAILBAY_LOSS_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAILBAY_LOSS_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAILBAY_LOSS_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAILBAY_LOSS_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Hydro Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAILBAY_LOSS_CURVE__HYDRO_GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tailbay Loss Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAILBAY_LOSS_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tailbay Loss Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAILBAY_LOSS_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.HydroPump <em>Hydro Pump</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.HydroPump
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getHydroPump()
	 * @generated
	 */
	public static final int HYDRO_PUMP = 26;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__NAMES = CorePackage.POWER_SYSTEM_RESOURCE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__DIAGRAM_OBJECTS = CorePackage.POWER_SYSTEM_RESOURCE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Pump Disch At Max Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__PUMP_DISCH_AT_MAX_HEAD = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hydro Power Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__HYDRO_POWER_PLANT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pump Disch At Min Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__PUMP_DISCH_AT_MIN_HEAD = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pump Power At Min Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__PUMP_POWER_AT_MIN_HEAD = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hydro Pump Op Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pump Power At Max Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__PUMP_POWER_AT_MAX_HEAD = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Synchronous Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP__SYNCHRONOUS_MACHINE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Hydro Pump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Hydro Pump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_PUMP_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.InflowForecast <em>Inflow Forecast</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.InflowForecast
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getInflowForecast()
	 * @generated
	 */
	public static final int INFLOW_FORECAST = 27;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFLOW_FORECAST__UUID = CorePackage.REGULAR_INTERVAL_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFLOW_FORECAST__NAMES = CorePackage.REGULAR_INTERVAL_SCHEDULE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFLOW_FORECAST__DIAGRAM_OBJECTS = CorePackage.REGULAR_INTERVAL_SCHEDULE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFLOW_FORECAST__MRID = CorePackage.REGULAR_INTERVAL_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFLOW_FORECAST__ALIAS_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFLOW_FORECAST__NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFLOW_FORECAST__MODELING_AUTHORITY_SET = CorePackage.REGULAR_INTERVAL_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFLOW_FORECAST__START_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFLOW_FORECAST__VALUE1_MULTIPLIER = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFLOW_FORECAST__VALUE2_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFLOW_FORECAST__VALUE1_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFLOW_FORECAST__VALUE2_MULTIPLIER = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFLOW_FORECAST__END_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFLOW_FORECAST__TIME_STEP = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFLOW_FORECAST__TIME_POINTS = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Reservoir</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFLOW_FORECAST__RESERVOIR = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inflow Forecast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFLOW_FORECAST_FEATURE_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Inflow Forecast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INFLOW_FORECAST_OPERATION_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingEfficiencyCurve <em>Hydro Generating Efficiency Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.HydroGeneratingEfficiencyCurve
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getHydroGeneratingEfficiencyCurve()
	 * @generated
	 */
	public static final int HYDRO_GENERATING_EFFICIENCY_CURVE = 28;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_EFFICIENCY_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_EFFICIENCY_CURVE__NAMES = CorePackage.CURVE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_EFFICIENCY_CURVE__DIAGRAM_OBJECTS = CorePackage.CURVE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_EFFICIENCY_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_EFFICIENCY_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_EFFICIENCY_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_EFFICIENCY_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_EFFICIENCY_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_EFFICIENCY_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_EFFICIENCY_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_EFFICIENCY_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_EFFICIENCY_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_EFFICIENCY_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_EFFICIENCY_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_EFFICIENCY_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_EFFICIENCY_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_EFFICIENCY_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Hydro Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hydro Generating Efficiency Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_EFFICIENCY_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hydro Generating Efficiency Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_GENERATING_EFFICIENCY_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.ShutdownCurve <em>Shutdown Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.ShutdownCurve
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getShutdownCurve()
	 * @generated
	 */
	public static final int SHUTDOWN_CURVE = 29;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN_CURVE__NAMES = CorePackage.CURVE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN_CURVE__DIAGRAM_OBJECTS = CorePackage.CURVE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Shutdown Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN_CURVE__SHUTDOWN_DATE = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shutdown Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN_CURVE__SHUTDOWN_COST = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Shutdown Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Shutdown Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant <em>Hydro Power Plant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.HydroPowerPlant
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getHydroPowerPlant()
	 * @generated
	 */
	public static final int HYDRO_POWER_PLANT = 30;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__NAMES = CorePackage.POWER_SYSTEM_RESOURCE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__DIAGRAM_OBJECTS = CorePackage.POWER_SYSTEM_RESOURCE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Penstock Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__PENSTOCK_TYPE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pump Rated P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__PUMP_RATED_P = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hydro Plant Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__HYDRO_PLANT_TYPE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Surge Tank Crest Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__SURGE_TANK_CREST_LEVEL = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hydro Generating Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gen Source Pump Discharge Reservoir</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Discharge Travel Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__DISCHARGE_TRAVEL_DELAY = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reservoir</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__RESERVOIR = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Plant Discharge Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__PLANT_DISCHARGE_CAPACITY = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Hydro Pumps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__HYDRO_PUMPS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Plant Rated Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__PLANT_RATED_HEAD = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Gen Rated P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__GEN_RATED_P = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Surge Tank Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT__SURGE_TANK_CODE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Hydro Power Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Hydro Power Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HYDRO_POWER_PLANT_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.CAESPlant <em>CAES Plant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.CAESPlant
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getCAESPlant()
	 * @generated
	 */
	public static final int CAES_PLANT = 31;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__NAMES = CorePackage.POWER_SYSTEM_RESOURCE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__DIAGRAM_OBJECTS = CorePackage.POWER_SYSTEM_RESOURCE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Air Compressor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__AIR_COMPRESSOR = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rated Capacity P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__RATED_CAPACITY_P = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__THERMAL_GENERATING_UNIT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Energy Storage Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT__ENERGY_STORAGE_CAPACITY = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>CAES Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>CAES Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAES_PLANT_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.AirCompressor <em>Air Compressor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.AirCompressor
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getAirCompressor()
	 * @generated
	 */
	public static final int AIR_COMPRESSOR = 32;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__NAMES = CorePackage.POWER_SYSTEM_RESOURCE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__DIAGRAM_OBJECTS = CorePackage.POWER_SYSTEM_RESOURCE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Air Compressor Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__AIR_COMPRESSOR_RATING = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Combustion Turbine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__COMBUSTION_TURBINE = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CAES Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR__CAES_PLANT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Air Compressor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Air Compressor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AIR_COMPRESSOR_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve <em>Heat Input Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.HeatInputCurve
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getHeatInputCurve()
	 * @generated
	 */
	public static final int HEAT_INPUT_CURVE = 33;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE__NAMES = CorePackage.CURVE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE__DIAGRAM_OBJECTS = CorePackage.CURVE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Is Net Gross P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE__IS_NET_GROSS_P = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Heat Input Eff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE__HEAT_INPUT_EFF = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Heat Input Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE__HEAT_INPUT_OFFSET = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Thermal Generating Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT = CorePackage.CURVE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Aux Power Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE__AUX_POWER_OFFSET = CorePackage.CURVE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Aux Power Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE__AUX_POWER_MULT = CorePackage.CURVE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Heat Input Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Heat Input Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_INPUT_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.WindGeneratingUnit <em>Wind Generating Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.WindGeneratingUnit
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getWindGeneratingUnit()
	 * @generated
	 */
	public static final int WIND_GENERATING_UNIT = 34;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__UUID = GENERATING_UNIT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__NAMES = GENERATING_UNIT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__DIAGRAM_OBJECTS = GENERATING_UNIT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__MRID = GENERATING_UNIT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__ALIAS_NAME = GENERATING_UNIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__NAME = GENERATING_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__MODELING_AUTHORITY_SET = GENERATING_UNIT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__CHANGE_ITEMS = GENERATING_UNIT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__SCHEDULE_STEPS = GENERATING_UNIT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__SAFETY_DOCUMENTS = GENERATING_UNIT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__OPERATING_SHARE = GENERATING_UNIT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__DOCUMENT_ROLES = GENERATING_UNIT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__PSR_LISTS = GENERATING_UNIT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__MEASUREMENTS = GENERATING_UNIT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__REPORTING_GROUP = GENERATING_UNIT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__PSR_TYPE = GENERATING_UNIT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__ASSETS = GENERATING_UNIT__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__ERP_ORGANISATION_ROLES = GENERATING_UNIT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__LOCATION = GENERATING_UNIT__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__PSR_EVENT = GENERATING_UNIT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__NETWORK_DATA_SETS = GENERATING_UNIT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__OUTAGE_SCHEDULE = GENERATING_UNIT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__CONTINGENCY_EQUIPMENT = GENERATING_UNIT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__CUSTOMER_AGREEMENTS = GENERATING_UNIT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__NORMALLY_IN_SERVICE = GENERATING_UNIT__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__AGGREGATE = GENERATING_UNIT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__EQUIPMENT_CONTAINER = GENERATING_UNIT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Rated Gross Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__RATED_GROSS_MIN_P = GENERATING_UNIT__RATED_GROSS_MIN_P;

	/**
	 * The feature id for the '<em><b>Efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__EFFICIENCY = GENERATING_UNIT__EFFICIENCY;

	/**
	 * The feature id for the '<em><b>Step Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__STEP_CHANGE = GENERATING_UNIT__STEP_CHANGE;

	/**
	 * The feature id for the '<em><b>Rated Net Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__RATED_NET_MAX_P = GENERATING_UNIT__RATED_NET_MAX_P;

	/**
	 * The feature id for the '<em><b>Tie Line PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__TIE_LINE_PF = GENERATING_UNIT__TIE_LINE_PF;

	/**
	 * The feature id for the '<em><b>Disp Reserve Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__DISP_RESERVE_FLAG = GENERATING_UNIT__DISP_RESERVE_FLAG;

	/**
	 * The feature id for the '<em><b>Control Pulse High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__CONTROL_PULSE_HIGH = GENERATING_UNIT__CONTROL_PULSE_HIGH;

	/**
	 * The feature id for the '<em><b>Startup Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__STARTUP_TIME = GENERATING_UNIT__STARTUP_TIME;

	/**
	 * The feature id for the '<em><b>Max Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__MAX_OPERATING_P = GENERATING_UNIT__MAX_OPERATING_P;

	/**
	 * The feature id for the '<em><b>Gen Control Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__GEN_CONTROL_SOURCE = GENERATING_UNIT__GEN_CONTROL_SOURCE;

	/**
	 * The feature id for the '<em><b>Normal PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__NORMAL_PF = GENERATING_UNIT__NORMAL_PF;

	/**
	 * The feature id for the '<em><b>Initial P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__INITIAL_P = GENERATING_UNIT__INITIAL_P;

	/**
	 * The feature id for the '<em><b>Spin Reserve Ramp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__SPIN_RESERVE_RAMP = GENERATING_UNIT__SPIN_RESERVE_RAMP;

	/**
	 * The feature id for the '<em><b>Alloc Spin Res P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__ALLOC_SPIN_RES_P = GENERATING_UNIT__ALLOC_SPIN_RES_P;

	/**
	 * The feature id for the '<em><b>Min Economic P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__MIN_ECONOMIC_P = GENERATING_UNIT__MIN_ECONOMIC_P;

	/**
	 * The feature id for the '<em><b>Long PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__LONG_PF = GENERATING_UNIT__LONG_PF;

	/**
	 * The feature id for the '<em><b>Nominal P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__NOMINAL_P = GENERATING_UNIT__NOMINAL_P;

	/**
	 * The feature id for the '<em><b>Control Response Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__CONTROL_RESPONSE_RATE = GENERATING_UNIT__CONTROL_RESPONSE_RATE;

	/**
	 * The feature id for the '<em><b>Control Area Generating Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT = GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT;

	/**
	 * The feature id for the '<em><b>Synchronous Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__SYNCHRONOUS_MACHINES = GENERATING_UNIT__SYNCHRONOUS_MACHINES;

	/**
	 * The feature id for the '<em><b>Rated Gross Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__RATED_GROSS_MAX_P = GENERATING_UNIT__RATED_GROSS_MAX_P;

	/**
	 * The feature id for the '<em><b>Penalty Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__PENALTY_FACTOR = GENERATING_UNIT__PENALTY_FACTOR;

	/**
	 * The feature id for the '<em><b>Fast Start Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__FAST_START_FLAG = GENERATING_UNIT__FAST_START_FLAG;

	/**
	 * The feature id for the '<em><b>Minimum Off Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__MINIMUM_OFF_TIME = GENERATING_UNIT__MINIMUM_OFF_TIME;

	/**
	 * The feature id for the '<em><b>Short PF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__SHORT_PF = GENERATING_UNIT__SHORT_PF;

	/**
	 * The feature id for the '<em><b>Governor MPL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__GOVERNOR_MPL = GENERATING_UNIT__GOVERNOR_MPL;

	/**
	 * The feature id for the '<em><b>Energy Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__ENERGY_MIN_P = GENERATING_UNIT__ENERGY_MIN_P;

	/**
	 * The feature id for the '<em><b>Fuel Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__FUEL_PRIORITY = GENERATING_UNIT__FUEL_PRIORITY;

	/**
	 * The feature id for the '<em><b>Max Economic P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__MAX_ECONOMIC_P = GENERATING_UNIT__MAX_ECONOMIC_P;

	/**
	 * The feature id for the '<em><b>Auto Cntrl Margin P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__AUTO_CNTRL_MARGIN_P = GENERATING_UNIT__AUTO_CNTRL_MARGIN_P;

	/**
	 * The feature id for the '<em><b>High Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__HIGH_CONTROL_LIMIT = GENERATING_UNIT__HIGH_CONTROL_LIMIT;

	/**
	 * The feature id for the '<em><b>Model Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__MODEL_DETAIL = GENERATING_UNIT__MODEL_DETAIL;

	/**
	 * The feature id for the '<em><b>Control Pulse Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__CONTROL_PULSE_LOW = GENERATING_UNIT__CONTROL_PULSE_LOW;

	/**
	 * The feature id for the '<em><b>Raise Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__RAISE_RAMP_RATE = GENERATING_UNIT__RAISE_RAMP_RATE;

	/**
	 * The feature id for the '<em><b>Gen Unit Op Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE = GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Control Deadband</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__CONTROL_DEADBAND = GENERATING_UNIT__CONTROL_DEADBAND;

	/**
	 * The feature id for the '<em><b>Base P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__BASE_P = GENERATING_UNIT__BASE_P;

	/**
	 * The feature id for the '<em><b>Startup Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__STARTUP_COST = GENERATING_UNIT__STARTUP_COST;

	/**
	 * The feature id for the '<em><b>Variable Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__VARIABLE_COST = GENERATING_UNIT__VARIABLE_COST;

	/**
	 * The feature id for the '<em><b>Gen Operating Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__GEN_OPERATING_MODE = GENERATING_UNIT__GEN_OPERATING_MODE;

	/**
	 * The feature id for the '<em><b>Lower Ramp Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__LOWER_RAMP_RATE = GENERATING_UNIT__LOWER_RAMP_RATE;

	/**
	 * The feature id for the '<em><b>Min Operating P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__MIN_OPERATING_P = GENERATING_UNIT__MIN_OPERATING_P;

	/**
	 * The feature id for the '<em><b>Low Control Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__LOW_CONTROL_LIMIT = GENERATING_UNIT__LOW_CONTROL_LIMIT;

	/**
	 * The feature id for the '<em><b>Gross To Net Active Power Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES = GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES;

	/**
	 * The feature id for the '<em><b>Maximum Allowable Spinning Reserve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE = GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE;

	/**
	 * The feature id for the '<em><b>Gen Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__GEN_CONTROL_MODE = GENERATING_UNIT__GEN_CONTROL_MODE;

	/**
	 * The feature id for the '<em><b>Gen Unit Op Cost Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES = GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES;

	/**
	 * The feature id for the '<em><b>Governor SCD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT__GOVERNOR_SCD = GENERATING_UNIT__GOVERNOR_SCD;

	/**
	 * The number of structural features of the '<em>Wind Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT_FEATURE_COUNT = GENERATING_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Wind Generating Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIND_GENERATING_UNIT_OPERATION_COUNT = GENERATING_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.FuelType <em>Fuel Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.FuelType
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getFuelType()
	 * @generated
	 */
	public static final int FUEL_TYPE = 35;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.GeneratorOperatingMode <em>Generator Operating Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.GeneratorOperatingMode
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getGeneratorOperatingMode()
	 * @generated
	 */
	public static final int GENERATOR_OPERATING_MODE = 36;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.GeneratorControlMode <em>Generator Control Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.GeneratorControlMode
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getGeneratorControlMode()
	 * @generated
	 */
	public static final int GENERATOR_CONTROL_MODE = 37;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.HydroPlantType <em>Hydro Plant Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.HydroPlantType
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getHydroPlantType()
	 * @generated
	 */
	public static final int HYDRO_PLANT_TYPE = 38;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.HydroEnergyConversionKind <em>Hydro Energy Conversion Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.HydroEnergyConversionKind
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getHydroEnergyConversionKind()
	 * @generated
	 */
	public static final int HYDRO_ENERGY_CONVERSION_KIND = 39;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.PenstockType <em>Penstock Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.PenstockType
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getPenstockType()
	 * @generated
	 */
	public static final int PENSTOCK_TYPE = 40;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.EmissionValueSource <em>Emission Value Source</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.EmissionValueSource
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getEmissionValueSource()
	 * @generated
	 */
	public static final int EMISSION_VALUE_SOURCE = 41;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.GeneratorControlSource <em>Generator Control Source</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.GeneratorControlSource
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getGeneratorControlSource()
	 * @generated
	 */
	public static final int GENERATOR_CONTROL_SOURCE = 42;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.SpillwayGateType <em>Spillway Gate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.SpillwayGateType
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getSpillwayGateType()
	 * @generated
	 */
	public static final int SPILLWAY_GATE_TYPE = 43;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.SurgeTankCode <em>Surge Tank Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.SurgeTankCode
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getSurgeTankCode()
	 * @generated
	 */
	public static final int SURGE_TANK_CODE = 44;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Generation.Production.EmissionType <em>Emission Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.EmissionType
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getEmissionType()
	 * @generated
	 */
	public static final int EMISSION_TYPE = 45;

	/**
	 * The meta object id for the '<em>Classification</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getClassification()
	 * @generated
	 */
	public static final int CLASSIFICATION = 46;

	/**
	 * The meta object id for the '<em>Heat Rate</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getHeatRate()
	 * @generated
	 */
	public static final int HEAT_RATE = 47;

	/**
	 * The meta object id for the '<em>Cost Per Heat Unit</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getCostPerHeatUnit()
	 * @generated
	 */
	public static final int COST_PER_HEAT_UNIT = 48;

	/**
	 * The meta object id for the '<em>Emission</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getEmission()
	 * @generated
	 */
	public static final int EMISSION = 49;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservoirEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cogenerationPlantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genUnitOpScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fuelAllocationScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grossToNetActivePowerCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelVsVolumeCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startRampCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuclearGeneratingUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emissionCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hydroPumpOpScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass steamSendoutScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetLevelScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinedCyclePlantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass heatRateCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thermalGeneratingUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emissionAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass penstockLossCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startupModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hydroGeneratingUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genUnitOpCostCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incrementalHeatRateCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fossilFuelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatingUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startIgnFuelCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startMainFuelCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tailbayLossCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hydroPumpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inflowForecastEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hydroGeneratingEfficiencyCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shutdownCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hydroPowerPlantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caesPlantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass airCompressorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass heatInputCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windGeneratingUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fuelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum generatorOperatingModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum generatorControlModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hydroPlantTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hydroEnergyConversionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum penstockTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum emissionValueSourceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum generatorControlSourceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum spillwayGateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum surgeTankCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum emissionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType classificationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType heatRateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType costPerHeatUnitEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType emissionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProductionPackage() {
		super(eNS_URI, ProductionFactory.INSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ProductionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static ProductionPackage init() {
		if (isInited) return (ProductionPackage)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI);

		// Obtain or create and register package
		ProductionPackage theProductionPackage = (ProductionPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProductionPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProductionPackage());

		isInited = true;

		// Obtain or create and register interdependencies
		CIM15Package theCIM15Package = (CIM15Package)(EPackage.Registry.INSTANCE.getEPackage(CIM15Package.eNS_URI) instanceof CIM15Package ? EPackage.Registry.INSTANCE.getEPackage(CIM15Package.eNS_URI) : CIM15Package.eINSTANCE);
		IEC61970Package theIEC61970Package = (IEC61970Package)(EPackage.Registry.INSTANCE.getEPackage(IEC61970Package.eNS_URI) instanceof IEC61970Package ? EPackage.Registry.INSTANCE.getEPackage(IEC61970Package.eNS_URI) : IEC61970Package.eINSTANCE);
		SCADAPackage theSCADAPackage = (SCADAPackage)(EPackage.Registry.INSTANCE.getEPackage(SCADAPackage.eNS_URI) instanceof SCADAPackage ? EPackage.Registry.INSTANCE.getEPackage(SCADAPackage.eNS_URI) : SCADAPackage.eINSTANCE);
		GenerationDynamicsPackage theGenerationDynamicsPackage = (GenerationDynamicsPackage)(EPackage.Registry.INSTANCE.getEPackage(GenerationDynamicsPackage.eNS_URI) instanceof GenerationDynamicsPackage ? EPackage.Registry.INSTANCE.getEPackage(GenerationDynamicsPackage.eNS_URI) : GenerationDynamicsPackage.eINSTANCE);
		InfWorkPackage theInfWorkPackage = (InfWorkPackage)(EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI) instanceof InfWorkPackage ? EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI) : InfWorkPackage.eINSTANCE);
		InfERPSupportPackage theInfERPSupportPackage = (InfERPSupportPackage)(EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI) instanceof InfERPSupportPackage ? EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI) : InfERPSupportPackage.eINSTANCE);
		InfCommonPackage theInfCommonPackage = (InfCommonPackage)(EPackage.Registry.INSTANCE.getEPackage(InfCommonPackage.eNS_URI) instanceof InfCommonPackage ? EPackage.Registry.INSTANCE.getEPackage(InfCommonPackage.eNS_URI) : InfCommonPackage.eINSTANCE);
		InfAssetsPackage theInfAssetsPackage = (InfAssetsPackage)(EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI) instanceof InfAssetsPackage ? EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI) : InfAssetsPackage.eINSTANCE);
		InfCustomersPackage theInfCustomersPackage = (InfCustomersPackage)(EPackage.Registry.INSTANCE.getEPackage(InfCustomersPackage.eNS_URI) instanceof InfCustomersPackage ? EPackage.Registry.INSTANCE.getEPackage(InfCustomersPackage.eNS_URI) : InfCustomersPackage.eINSTANCE);
		InfOperationsPackage theInfOperationsPackage = (InfOperationsPackage)(EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI) instanceof InfOperationsPackage ? EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI) : InfOperationsPackage.eINSTANCE);
		InfLocationsPackage theInfLocationsPackage = (InfLocationsPackage)(EPackage.Registry.INSTANCE.getEPackage(InfLocationsPackage.eNS_URI) instanceof InfLocationsPackage ? EPackage.Registry.INSTANCE.getEPackage(InfLocationsPackage.eNS_URI) : InfLocationsPackage.eINSTANCE);
		InfGMLSupportPackage theInfGMLSupportPackage = (InfGMLSupportPackage)(EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI) instanceof InfGMLSupportPackage ? EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI) : InfGMLSupportPackage.eINSTANCE);
		InfCorePackage theInfCorePackage = (InfCorePackage)(EPackage.Registry.INSTANCE.getEPackage(InfCorePackage.eNS_URI) instanceof InfCorePackage ? EPackage.Registry.INSTANCE.getEPackage(InfCorePackage.eNS_URI) : InfCorePackage.eINSTANCE);
		InfLoadControlPackage theInfLoadControlPackage = (InfLoadControlPackage)(EPackage.Registry.INSTANCE.getEPackage(InfLoadControlPackage.eNS_URI) instanceof InfLoadControlPackage ? EPackage.Registry.INSTANCE.getEPackage(InfLoadControlPackage.eNS_URI) : InfLoadControlPackage.eINSTANCE);
		InfMeteringPackage theInfMeteringPackage = (InfMeteringPackage)(EPackage.Registry.INSTANCE.getEPackage(InfMeteringPackage.eNS_URI) instanceof InfMeteringPackage ? EPackage.Registry.INSTANCE.getEPackage(InfMeteringPackage.eNS_URI) : InfMeteringPackage.eINSTANCE);
		InfAssetModelsPackage theInfAssetModelsPackage = (InfAssetModelsPackage)(EPackage.Registry.INSTANCE.getEPackage(InfAssetModelsPackage.eNS_URI) instanceof InfAssetModelsPackage ? EPackage.Registry.INSTANCE.getEPackage(InfAssetModelsPackage.eNS_URI) : InfAssetModelsPackage.eINSTANCE);
		InfTypeAssetPackage theInfTypeAssetPackage = (InfTypeAssetPackage)(EPackage.Registry.INSTANCE.getEPackage(InfTypeAssetPackage.eNS_URI) instanceof InfTypeAssetPackage ? EPackage.Registry.INSTANCE.getEPackage(InfTypeAssetPackage.eNS_URI) : InfTypeAssetPackage.eINSTANCE);
		StateVariablesPackage theStateVariablesPackage = (StateVariablesPackage)(EPackage.Registry.INSTANCE.getEPackage(StateVariablesPackage.eNS_URI) instanceof StateVariablesPackage ? EPackage.Registry.INSTANCE.getEPackage(StateVariablesPackage.eNS_URI) : StateVariablesPackage.eINSTANCE);
		WiresPackage theWiresPackage = (WiresPackage)(EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI) instanceof WiresPackage ? EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI) : WiresPackage.eINSTANCE);
		MeasPackage theMeasPackage = (MeasPackage)(EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI) instanceof MeasPackage ? EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI) : MeasPackage.eINSTANCE);
		LoadModelPackage theLoadModelPackage = (LoadModelPackage)(EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI) instanceof LoadModelPackage ? EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI) : LoadModelPackage.eINSTANCE);
		WiresPhaseModelPackage theWiresPhaseModelPackage = (WiresPhaseModelPackage)(EPackage.Registry.INSTANCE.getEPackage(WiresPhaseModelPackage.eNS_URI) instanceof WiresPhaseModelPackage ? EPackage.Registry.INSTANCE.getEPackage(WiresPhaseModelPackage.eNS_URI) : WiresPhaseModelPackage.eINSTANCE);
		ControlAreaPackage theControlAreaPackage = (ControlAreaPackage)(EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI) instanceof ControlAreaPackage ? EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI) : ControlAreaPackage.eINSTANCE);
		AuxiliaryEquipmentPackage theAuxiliaryEquipmentPackage = (AuxiliaryEquipmentPackage)(EPackage.Registry.INSTANCE.getEPackage(AuxiliaryEquipmentPackage.eNS_URI) instanceof AuxiliaryEquipmentPackage ? EPackage.Registry.INSTANCE.getEPackage(AuxiliaryEquipmentPackage.eNS_URI) : AuxiliaryEquipmentPackage.eINSTANCE);
		DomainPackage theDomainPackage = (DomainPackage)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackage ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		CorePackage theCorePackage = (CorePackage)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackage ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		GraphicsPackage theGraphicsPackage = (GraphicsPackage)(EPackage.Registry.INSTANCE.getEPackage(GraphicsPackage.eNS_URI) instanceof GraphicsPackage ? EPackage.Registry.INSTANCE.getEPackage(GraphicsPackage.eNS_URI) : GraphicsPackage.eINSTANCE);
		OperationalLimitsPackage theOperationalLimitsPackage = (OperationalLimitsPackage)(EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI) instanceof OperationalLimitsPackage ? EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI) : OperationalLimitsPackage.eINSTANCE);
		OutagePackage theOutagePackage = (OutagePackage)(EPackage.Registry.INSTANCE.getEPackage(OutagePackage.eNS_URI) instanceof OutagePackage ? EPackage.Registry.INSTANCE.getEPackage(OutagePackage.eNS_URI) : OutagePackage.eINSTANCE);
		CutsJumpersPackage theCutsJumpersPackage = (CutsJumpersPackage)(EPackage.Registry.INSTANCE.getEPackage(CutsJumpersPackage.eNS_URI) instanceof CutsJumpersPackage ? EPackage.Registry.INSTANCE.getEPackage(CutsJumpersPackage.eNS_URI) : CutsJumpersPackage.eINSTANCE);
		ProtectionPackage theProtectionPackage = (ProtectionPackage)(EPackage.Registry.INSTANCE.getEPackage(ProtectionPackage.eNS_URI) instanceof ProtectionPackage ? EPackage.Registry.INSTANCE.getEPackage(ProtectionPackage.eNS_URI) : ProtectionPackage.eINSTANCE);
		EquivalentsPackage theEquivalentsPackage = (EquivalentsPackage)(EPackage.Registry.INSTANCE.getEPackage(EquivalentsPackage.eNS_URI) instanceof EquivalentsPackage ? EPackage.Registry.INSTANCE.getEPackage(EquivalentsPackage.eNS_URI) : EquivalentsPackage.eINSTANCE);
		ContingencyPackage theContingencyPackage = (ContingencyPackage)(EPackage.Registry.INSTANCE.getEPackage(ContingencyPackage.eNS_URI) instanceof ContingencyPackage ? EPackage.Registry.INSTANCE.getEPackage(ContingencyPackage.eNS_URI) : ContingencyPackage.eINSTANCE);
		TopologyPackage theTopologyPackage = (TopologyPackage)(EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) instanceof TopologyPackage ? EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) : TopologyPackage.eINSTANCE);
		IEC61968Package theIEC61968Package = (IEC61968Package)(EPackage.Registry.INSTANCE.getEPackage(IEC61968Package.eNS_URI) instanceof IEC61968Package ? EPackage.Registry.INSTANCE.getEPackage(IEC61968Package.eNS_URI) : IEC61968Package.eINSTANCE);
		CommonPackage theCommonPackage = (CommonPackage)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackage ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		AssetModelsPackage theAssetModelsPackage = (AssetModelsPackage)(EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI) instanceof AssetModelsPackage ? EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI) : AssetModelsPackage.eINSTANCE);
		MeteringPackage theMeteringPackage = (MeteringPackage)(EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI) instanceof MeteringPackage ? EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI) : MeteringPackage.eINSTANCE);
		PaymentMeteringPackage thePaymentMeteringPackage = (PaymentMeteringPackage)(EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI) instanceof PaymentMeteringPackage ? EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI) : PaymentMeteringPackage.eINSTANCE);
		AssetsPackage theAssetsPackage = (AssetsPackage)(EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI) instanceof AssetsPackage ? EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI) : AssetsPackage.eINSTANCE);
		WorkPackage theWorkPackage = (WorkPackage)(EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI) instanceof WorkPackage ? EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI) : WorkPackage.eINSTANCE);
		CustomersPackage theCustomersPackage = (CustomersPackage)(EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) instanceof CustomersPackage ? EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) : CustomersPackage.eINSTANCE);
		LoadControlPackage theLoadControlPackage = (LoadControlPackage)(EPackage.Registry.INSTANCE.getEPackage(LoadControlPackage.eNS_URI) instanceof LoadControlPackage ? EPackage.Registry.INSTANCE.getEPackage(LoadControlPackage.eNS_URI) : LoadControlPackage.eINSTANCE);
		IEC62325Package theIEC62325Package = (IEC62325Package)(EPackage.Registry.INSTANCE.getEPackage(IEC62325Package.eNS_URI) instanceof IEC62325Package ? EPackage.Registry.INSTANCE.getEPackage(IEC62325Package.eNS_URI) : IEC62325Package.eINSTANCE);
		PackageDependenciesPackage thePackageDependenciesPackage = (PackageDependenciesPackage)(EPackage.Registry.INSTANCE.getEPackage(PackageDependenciesPackage.eNS_URI) instanceof PackageDependenciesPackage ? EPackage.Registry.INSTANCE.getEPackage(PackageDependenciesPackage.eNS_URI) : PackageDependenciesPackage.eINSTANCE);

		// Load packages
		theCIM15Package.loadPackage();

		// Fix loaded packages
		theProductionPackage.fixPackageContents();
		theCIM15Package.fixPackageContents();
		theIEC61970Package.fixPackageContents();
		theSCADAPackage.fixPackageContents();
		theGenerationDynamicsPackage.fixPackageContents();
		theInfWorkPackage.fixPackageContents();
		theInfERPSupportPackage.fixPackageContents();
		theInfCommonPackage.fixPackageContents();
		theInfAssetsPackage.fixPackageContents();
		theInfCustomersPackage.fixPackageContents();
		theInfOperationsPackage.fixPackageContents();
		theInfLocationsPackage.fixPackageContents();
		theInfGMLSupportPackage.fixPackageContents();
		theInfCorePackage.fixPackageContents();
		theInfLoadControlPackage.fixPackageContents();
		theInfMeteringPackage.fixPackageContents();
		theInfAssetModelsPackage.fixPackageContents();
		theInfTypeAssetPackage.fixPackageContents();
		theStateVariablesPackage.fixPackageContents();
		theWiresPackage.fixPackageContents();
		theMeasPackage.fixPackageContents();
		theLoadModelPackage.fixPackageContents();
		theWiresPhaseModelPackage.fixPackageContents();
		theControlAreaPackage.fixPackageContents();
		theAuxiliaryEquipmentPackage.fixPackageContents();
		theDomainPackage.fixPackageContents();
		theCorePackage.fixPackageContents();
		theGraphicsPackage.fixPackageContents();
		theOperationalLimitsPackage.fixPackageContents();
		theOutagePackage.fixPackageContents();
		theCutsJumpersPackage.fixPackageContents();
		theProtectionPackage.fixPackageContents();
		theEquivalentsPackage.fixPackageContents();
		theContingencyPackage.fixPackageContents();
		theTopologyPackage.fixPackageContents();
		theIEC61968Package.fixPackageContents();
		theCommonPackage.fixPackageContents();
		theAssetModelsPackage.fixPackageContents();
		theMeteringPackage.fixPackageContents();
		thePaymentMeteringPackage.fixPackageContents();
		theAssetsPackage.fixPackageContents();
		theWorkPackage.fixPackageContents();
		theCustomersPackage.fixPackageContents();
		theLoadControlPackage.fixPackageContents();
		theIEC62325Package.fixPackageContents();
		thePackageDependenciesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theProductionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProductionPackage.eNS_URI, theProductionPackage);
		return theProductionPackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.Reservoir <em>Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservoir</em>'.
	 * @see CIM15.IEC61970.Generation.Production.Reservoir
	 * @generated
	 */
	public EClass getReservoir() {
		if (reservoirEClass == null) {
			reservoirEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(4);
		}
		return reservoirEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Generation.Production.Reservoir#getLevelVsVolumeCurves <em>Level Vs Volume Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Level Vs Volume Curves</em>'.
	 * @see CIM15.IEC61970.Generation.Production.Reservoir#getLevelVsVolumeCurves()
	 * @see #getReservoir()
	 * @generated
	 */
	public EReference getReservoir_LevelVsVolumeCurves() {
        return (EReference)getReservoir().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillwayCapacity <em>Spillway Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spillway Capacity</em>'.
	 * @see CIM15.IEC61970.Generation.Production.Reservoir#getSpillwayCapacity()
	 * @see #getReservoir()
	 * @generated
	 */
	public EAttribute getReservoir_SpillwayCapacity() {
        return (EAttribute)getReservoir().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.Reservoir#getEnergyStorageRating <em>Energy Storage Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Storage Rating</em>'.
	 * @see CIM15.IEC61970.Generation.Production.Reservoir#getEnergyStorageRating()
	 * @see #getReservoir()
	 * @generated
	 */
	public EAttribute getReservoir_EnergyStorageRating() {
        return (EAttribute)getReservoir().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.Reservoir#getGrossCapacity <em>Gross Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gross Capacity</em>'.
	 * @see CIM15.IEC61970.Generation.Production.Reservoir#getGrossCapacity()
	 * @see #getReservoir()
	 * @generated
	 */
	public EAttribute getReservoir_GrossCapacity() {
        return (EAttribute)getReservoir().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.Reservoir#getTargetLevelSchedule <em>Target Level Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Level Schedule</em>'.
	 * @see CIM15.IEC61970.Generation.Production.Reservoir#getTargetLevelSchedule()
	 * @see #getReservoir()
	 * @generated
	 */
	public EReference getReservoir_TargetLevelSchedule() {
        return (EReference)getReservoir().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.Reservoir#getRiverOutletWorks <em>River Outlet Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>River Outlet Works</em>'.
	 * @see CIM15.IEC61970.Generation.Production.Reservoir#getRiverOutletWorks()
	 * @see #getReservoir()
	 * @generated
	 */
	public EAttribute getReservoir_RiverOutletWorks() {
        return (EAttribute)getReservoir().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillwayCrestLevel <em>Spillway Crest Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spillway Crest Level</em>'.
	 * @see CIM15.IEC61970.Generation.Production.Reservoir#getSpillwayCrestLevel()
	 * @see #getReservoir()
	 * @generated
	 */
	public EAttribute getReservoir_SpillwayCrestLevel() {
        return (EAttribute)getReservoir().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Generation.Production.Reservoir#getHydroPowerPlants <em>Hydro Power Plants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hydro Power Plants</em>'.
	 * @see CIM15.IEC61970.Generation.Production.Reservoir#getHydroPowerPlants()
	 * @see #getReservoir()
	 * @generated
	 */
	public EReference getReservoir_HydroPowerPlants() {
        return (EReference)getReservoir().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.Reservoir#getNormalMinOperateLevel <em>Normal Min Operate Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Min Operate Level</em>'.
	 * @see CIM15.IEC61970.Generation.Production.Reservoir#getNormalMinOperateLevel()
	 * @see #getReservoir()
	 * @generated
	 */
	public EAttribute getReservoir_NormalMinOperateLevel() {
        return (EAttribute)getReservoir().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Generation.Production.Reservoir#getUpstreamFromHydroPowerPlants <em>Upstream From Hydro Power Plants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Upstream From Hydro Power Plants</em>'.
	 * @see CIM15.IEC61970.Generation.Production.Reservoir#getUpstreamFromHydroPowerPlants()
	 * @see #getReservoir()
	 * @generated
	 */
	public EReference getReservoir_UpstreamFromHydroPowerPlants() {
        return (EReference)getReservoir().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillwayCrestLength <em>Spillway Crest Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spillway Crest Length</em>'.
	 * @see CIM15.IEC61970.Generation.Production.Reservoir#getSpillwayCrestLength()
	 * @see #getReservoir()
	 * @generated
	 */
	public EAttribute getReservoir_SpillwayCrestLength() {
        return (EAttribute)getReservoir().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Generation.Production.Reservoir#getInflowForecasts <em>Inflow Forecasts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inflow Forecasts</em>'.
	 * @see CIM15.IEC61970.Generation.Production.Reservoir#getInflowForecasts()
	 * @see #getReservoir()
	 * @generated
	 */
	public EReference getReservoir_InflowForecasts() {
        return (EReference)getReservoir().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillTravelDelay <em>Spill Travel Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spill Travel Delay</em>'.
	 * @see CIM15.IEC61970.Generation.Production.Reservoir#getSpillTravelDelay()
	 * @see #getReservoir()
	 * @generated
	 */
	public EAttribute getReservoir_SpillTravelDelay() {
        return (EAttribute)getReservoir().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.Reservoir#getActiveStorageCapacity <em>Active Storage Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Storage Capacity</em>'.
	 * @see CIM15.IEC61970.Generation.Production.Reservoir#getActiveStorageCapacity()
	 * @see #getReservoir()
	 * @generated
	 */
	public EAttribute getReservoir_ActiveStorageCapacity() {
        return (EAttribute)getReservoir().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillsFromReservoir <em>Spills From Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Spills From Reservoir</em>'.
	 * @see CIM15.IEC61970.Generation.Production.Reservoir#getSpillsFromReservoir()
	 * @see #getReservoir()
	 * @generated
	 */
	public EReference getReservoir_SpillsFromReservoir() {
        return (EReference)getReservoir().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillWayGateType <em>Spill Way Gate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spill Way Gate Type</em>'.
	 * @see CIM15.IEC61970.Generation.Production.Reservoir#getSpillWayGateType()
	 * @see #getReservoir()
	 * @generated
	 */
	public EAttribute getReservoir_SpillWayGateType() {
        return (EAttribute)getReservoir().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Generation.Production.Reservoir#getSpillsIntoReservoirs <em>Spills Into Reservoirs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Spills Into Reservoirs</em>'.
	 * @see CIM15.IEC61970.Generation.Production.Reservoir#getSpillsIntoReservoirs()
	 * @see #getReservoir()
	 * @generated
	 */
	public EReference getReservoir_SpillsIntoReservoirs() {
        return (EReference)getReservoir().getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.Reservoir#getFullSupplyLevel <em>Full Supply Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Supply Level</em>'.
	 * @see CIM15.IEC61970.Generation.Production.Reservoir#getFullSupplyLevel()
	 * @see #getReservoir()
	 * @generated
	 */
	public EAttribute getReservoir_FullSupplyLevel() {
        return (EAttribute)getReservoir().getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant <em>Cogeneration Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cogeneration Plant</em>'.
	 * @see CIM15.IEC61970.Generation.Production.CogenerationPlant
	 * @generated
	 */
	public EClass getCogenerationPlant() {
		if (cogenerationPlantEClass == null) {
			cogenerationPlantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(5);
		}
		return cogenerationPlantEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getSteamSendoutSchedule <em>Steam Sendout Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Steam Sendout Schedule</em>'.
	 * @see CIM15.IEC61970.Generation.Production.CogenerationPlant#getSteamSendoutSchedule()
	 * @see #getCogenerationPlant()
	 * @generated
	 */
	public EReference getCogenerationPlant_SteamSendoutSchedule() {
        return (EReference)getCogenerationPlant().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getCogenLPSteamRating <em>Cogen LP Steam Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cogen LP Steam Rating</em>'.
	 * @see CIM15.IEC61970.Generation.Production.CogenerationPlant#getCogenLPSteamRating()
	 * @see #getCogenerationPlant()
	 * @generated
	 */
	public EAttribute getCogenerationPlant_CogenLPSteamRating() {
        return (EAttribute)getCogenerationPlant().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getCogenLPSendoutRating <em>Cogen LP Sendout Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cogen LP Sendout Rating</em>'.
	 * @see CIM15.IEC61970.Generation.Production.CogenerationPlant#getCogenLPSendoutRating()
	 * @see #getCogenerationPlant()
	 * @generated
	 */
	public EAttribute getCogenerationPlant_CogenLPSendoutRating() {
        return (EAttribute)getCogenerationPlant().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Thermal Generating Units</em>'.
	 * @see CIM15.IEC61970.Generation.Production.CogenerationPlant#getThermalGeneratingUnits()
	 * @see #getCogenerationPlant()
	 * @generated
	 */
	public EReference getCogenerationPlant_ThermalGeneratingUnits() {
        return (EReference)getCogenerationPlant().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getRatedP <em>Rated P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.CogenerationPlant#getRatedP()
	 * @see #getCogenerationPlant()
	 * @generated
	 */
	public EAttribute getCogenerationPlant_RatedP() {
        return (EAttribute)getCogenerationPlant().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getCogenHPSendoutRating <em>Cogen HP Sendout Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cogen HP Sendout Rating</em>'.
	 * @see CIM15.IEC61970.Generation.Production.CogenerationPlant#getCogenHPSendoutRating()
	 * @see #getCogenerationPlant()
	 * @generated
	 */
	public EAttribute getCogenerationPlant_CogenHPSendoutRating() {
        return (EAttribute)getCogenerationPlant().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant#getCogenHPSteamRating <em>Cogen HP Steam Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cogen HP Steam Rating</em>'.
	 * @see CIM15.IEC61970.Generation.Production.CogenerationPlant#getCogenHPSteamRating()
	 * @see #getCogenerationPlant()
	 * @generated
	 */
	public EAttribute getCogenerationPlant_CogenHPSteamRating() {
        return (EAttribute)getCogenerationPlant().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.GenUnitOpSchedule <em>Gen Unit Op Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Unit Op Schedule</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GenUnitOpSchedule
	 * @generated
	 */
	public EClass getGenUnitOpSchedule() {
		if (genUnitOpScheduleEClass == null) {
			genUnitOpScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(7);
		}
		return genUnitOpScheduleEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.GenUnitOpSchedule#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generating Unit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GenUnitOpSchedule#getGeneratingUnit()
	 * @see #getGenUnitOpSchedule()
	 * @generated
	 */
	public EReference getGenUnitOpSchedule_GeneratingUnit() {
        return (EReference)getGenUnitOpSchedule().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule <em>Fuel Allocation Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuel Allocation Schedule</em>'.
	 * @see CIM15.IEC61970.Generation.Production.FuelAllocationSchedule
	 * @generated
	 */
	public EClass getFuelAllocationSchedule() {
		if (fuelAllocationScheduleEClass == null) {
			fuelAllocationScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(8);
		}
		return fuelAllocationScheduleEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getMinFuelAllocation <em>Min Fuel Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Fuel Allocation</em>'.
	 * @see CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getMinFuelAllocation()
	 * @see #getFuelAllocationSchedule()
	 * @generated
	 */
	public EAttribute getFuelAllocationSchedule_MinFuelAllocation() {
        return (EAttribute)getFuelAllocationSchedule().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelAllocationEndDate <em>Fuel Allocation End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Allocation End Date</em>'.
	 * @see CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelAllocationEndDate()
	 * @see #getFuelAllocationSchedule()
	 * @generated
	 */
	public EAttribute getFuelAllocationSchedule_FuelAllocationEndDate() {
        return (EAttribute)getFuelAllocationSchedule().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getMaxFuelAllocation <em>Max Fuel Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Fuel Allocation</em>'.
	 * @see CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getMaxFuelAllocation()
	 * @see #getFuelAllocationSchedule()
	 * @generated
	 */
	public EAttribute getFuelAllocationSchedule_MaxFuelAllocation() {
        return (EAttribute)getFuelAllocationSchedule().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelAllocationStartDate <em>Fuel Allocation Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Allocation Start Date</em>'.
	 * @see CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelAllocationStartDate()
	 * @see #getFuelAllocationSchedule()
	 * @generated
	 */
	public EAttribute getFuelAllocationSchedule_FuelAllocationStartDate() {
        return (EAttribute)getFuelAllocationSchedule().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getFossilFuel <em>Fossil Fuel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fossil Fuel</em>'.
	 * @see CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getFossilFuel()
	 * @see #getFuelAllocationSchedule()
	 * @generated
	 */
	public EReference getFuelAllocationSchedule_FossilFuel() {
        return (EReference)getFuelAllocationSchedule().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelType <em>Fuel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Type</em>'.
	 * @see CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getFuelType()
	 * @see #getFuelAllocationSchedule()
	 * @generated
	 */
	public EAttribute getFuelAllocationSchedule_FuelType() {
        return (EAttribute)getFuelAllocationSchedule().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thermal Generating Unit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.FuelAllocationSchedule#getThermalGeneratingUnit()
	 * @see #getFuelAllocationSchedule()
	 * @generated
	 */
	public EReference getFuelAllocationSchedule_ThermalGeneratingUnit() {
        return (EReference)getFuelAllocationSchedule().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.GrossToNetActivePowerCurve <em>Gross To Net Active Power Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gross To Net Active Power Curve</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GrossToNetActivePowerCurve
	 * @generated
	 */
	public EClass getGrossToNetActivePowerCurve() {
		if (grossToNetActivePowerCurveEClass == null) {
			grossToNetActivePowerCurveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(9);
		}
		return grossToNetActivePowerCurveEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.GrossToNetActivePowerCurve#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generating Unit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GrossToNetActivePowerCurve#getGeneratingUnit()
	 * @see #getGrossToNetActivePowerCurve()
	 * @generated
	 */
	public EReference getGrossToNetActivePowerCurve_GeneratingUnit() {
        return (EReference)getGrossToNetActivePowerCurve().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.LevelVsVolumeCurve <em>Level Vs Volume Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level Vs Volume Curve</em>'.
	 * @see CIM15.IEC61970.Generation.Production.LevelVsVolumeCurve
	 * @generated
	 */
	public EClass getLevelVsVolumeCurve() {
		if (levelVsVolumeCurveEClass == null) {
			levelVsVolumeCurveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(10);
		}
		return levelVsVolumeCurveEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.LevelVsVolumeCurve#getReservoir <em>Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservoir</em>'.
	 * @see CIM15.IEC61970.Generation.Production.LevelVsVolumeCurve#getReservoir()
	 * @see #getLevelVsVolumeCurve()
	 * @generated
	 */
	public EReference getLevelVsVolumeCurve_Reservoir() {
        return (EReference)getLevelVsVolumeCurve().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.StartRampCurve <em>Start Ramp Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Ramp Curve</em>'.
	 * @see CIM15.IEC61970.Generation.Production.StartRampCurve
	 * @generated
	 */
	public EClass getStartRampCurve() {
		if (startRampCurveEClass == null) {
			startRampCurveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(11);
		}
		return startRampCurveEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.StartRampCurve#getHotStandbyRamp <em>Hot Standby Ramp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hot Standby Ramp</em>'.
	 * @see CIM15.IEC61970.Generation.Production.StartRampCurve#getHotStandbyRamp()
	 * @see #getStartRampCurve()
	 * @generated
	 */
	public EAttribute getStartRampCurve_HotStandbyRamp() {
        return (EAttribute)getStartRampCurve().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.StartRampCurve#getStartupModel <em>Startup Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Startup Model</em>'.
	 * @see CIM15.IEC61970.Generation.Production.StartRampCurve#getStartupModel()
	 * @see #getStartRampCurve()
	 * @generated
	 */
	public EReference getStartRampCurve_StartupModel() {
        return (EReference)getStartRampCurve().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.NuclearGeneratingUnit <em>Nuclear Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nuclear Generating Unit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.NuclearGeneratingUnit
	 * @generated
	 */
	public EClass getNuclearGeneratingUnit() {
		if (nuclearGeneratingUnitEClass == null) {
			nuclearGeneratingUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(12);
		}
		return nuclearGeneratingUnitEClass;
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.EmissionCurve <em>Emission Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emission Curve</em>'.
	 * @see CIM15.IEC61970.Generation.Production.EmissionCurve
	 * @generated
	 */
	public EClass getEmissionCurve() {
		if (emissionCurveEClass == null) {
			emissionCurveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(13);
		}
		return emissionCurveEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.EmissionCurve#getEmissionContent <em>Emission Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emission Content</em>'.
	 * @see CIM15.IEC61970.Generation.Production.EmissionCurve#getEmissionContent()
	 * @see #getEmissionCurve()
	 * @generated
	 */
	public EAttribute getEmissionCurve_EmissionContent() {
        return (EAttribute)getEmissionCurve().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.EmissionCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thermal Generating Unit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.EmissionCurve#getThermalGeneratingUnit()
	 * @see #getEmissionCurve()
	 * @generated
	 */
	public EReference getEmissionCurve_ThermalGeneratingUnit() {
        return (EReference)getEmissionCurve().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.EmissionCurve#isIsNetGrossP <em>Is Net Gross P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Net Gross P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.EmissionCurve#isIsNetGrossP()
	 * @see #getEmissionCurve()
	 * @generated
	 */
	public EAttribute getEmissionCurve_IsNetGrossP() {
        return (EAttribute)getEmissionCurve().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.EmissionCurve#getEmissionType <em>Emission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emission Type</em>'.
	 * @see CIM15.IEC61970.Generation.Production.EmissionCurve#getEmissionType()
	 * @see #getEmissionCurve()
	 * @generated
	 */
	public EAttribute getEmissionCurve_EmissionType() {
        return (EAttribute)getEmissionCurve().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.HydroPumpOpSchedule <em>Hydro Pump Op Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hydro Pump Op Schedule</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPumpOpSchedule
	 * @generated
	 */
	public EClass getHydroPumpOpSchedule() {
		if (hydroPumpOpScheduleEClass == null) {
			hydroPumpOpScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(14);
		}
		return hydroPumpOpScheduleEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.HydroPumpOpSchedule#getHydroPump <em>Hydro Pump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hydro Pump</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPumpOpSchedule#getHydroPump()
	 * @see #getHydroPumpOpSchedule()
	 * @generated
	 */
	public EReference getHydroPumpOpSchedule_HydroPump() {
        return (EReference)getHydroPumpOpSchedule().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.SteamSendoutSchedule <em>Steam Sendout Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Steam Sendout Schedule</em>'.
	 * @see CIM15.IEC61970.Generation.Production.SteamSendoutSchedule
	 * @generated
	 */
	public EClass getSteamSendoutSchedule() {
		if (steamSendoutScheduleEClass == null) {
			steamSendoutScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(15);
		}
		return steamSendoutScheduleEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.SteamSendoutSchedule#getCogenerationPlant <em>Cogeneration Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cogeneration Plant</em>'.
	 * @see CIM15.IEC61970.Generation.Production.SteamSendoutSchedule#getCogenerationPlant()
	 * @see #getSteamSendoutSchedule()
	 * @generated
	 */
	public EReference getSteamSendoutSchedule_CogenerationPlant() {
        return (EReference)getSteamSendoutSchedule().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.TargetLevelSchedule <em>Target Level Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Level Schedule</em>'.
	 * @see CIM15.IEC61970.Generation.Production.TargetLevelSchedule
	 * @generated
	 */
	public EClass getTargetLevelSchedule() {
		if (targetLevelScheduleEClass == null) {
			targetLevelScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(16);
		}
		return targetLevelScheduleEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.TargetLevelSchedule#getLowLevelLimit <em>Low Level Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Level Limit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.TargetLevelSchedule#getLowLevelLimit()
	 * @see #getTargetLevelSchedule()
	 * @generated
	 */
	public EAttribute getTargetLevelSchedule_LowLevelLimit() {
        return (EAttribute)getTargetLevelSchedule().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.TargetLevelSchedule#getReservoir <em>Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservoir</em>'.
	 * @see CIM15.IEC61970.Generation.Production.TargetLevelSchedule#getReservoir()
	 * @see #getTargetLevelSchedule()
	 * @generated
	 */
	public EReference getTargetLevelSchedule_Reservoir() {
        return (EReference)getTargetLevelSchedule().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.TargetLevelSchedule#getHighLevelLimit <em>High Level Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Level Limit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.TargetLevelSchedule#getHighLevelLimit()
	 * @see #getTargetLevelSchedule()
	 * @generated
	 */
	public EAttribute getTargetLevelSchedule_HighLevelLimit() {
        return (EAttribute)getTargetLevelSchedule().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.CombinedCyclePlant <em>Combined Cycle Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combined Cycle Plant</em>'.
	 * @see CIM15.IEC61970.Generation.Production.CombinedCyclePlant
	 * @generated
	 */
	public EClass getCombinedCyclePlant() {
		if (combinedCyclePlantEClass == null) {
			combinedCyclePlantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(18);
		}
		return combinedCyclePlantEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.CombinedCyclePlant#getCombCyclePlantRating <em>Comb Cycle Plant Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comb Cycle Plant Rating</em>'.
	 * @see CIM15.IEC61970.Generation.Production.CombinedCyclePlant#getCombCyclePlantRating()
	 * @see #getCombinedCyclePlant()
	 * @generated
	 */
	public EAttribute getCombinedCyclePlant_CombCyclePlantRating() {
        return (EAttribute)getCombinedCyclePlant().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Generation.Production.CombinedCyclePlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Thermal Generating Units</em>'.
	 * @see CIM15.IEC61970.Generation.Production.CombinedCyclePlant#getThermalGeneratingUnits()
	 * @see #getCombinedCyclePlant()
	 * @generated
	 */
	public EReference getCombinedCyclePlant_ThermalGeneratingUnits() {
        return (EReference)getCombinedCyclePlant().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.HeatRateCurve <em>Heat Rate Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heat Rate Curve</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HeatRateCurve
	 * @generated
	 */
	public EClass getHeatRateCurve() {
		if (heatRateCurveEClass == null) {
			heatRateCurveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(19);
		}
		return heatRateCurveEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.HeatRateCurve#isIsNetGrossP <em>Is Net Gross P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Net Gross P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HeatRateCurve#isIsNetGrossP()
	 * @see #getHeatRateCurve()
	 * @generated
	 */
	public EAttribute getHeatRateCurve_IsNetGrossP() {
        return (EAttribute)getHeatRateCurve().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.HeatRateCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thermal Generating Unit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HeatRateCurve#getThermalGeneratingUnit()
	 * @see #getHeatRateCurve()
	 * @generated
	 */
	public EReference getHeatRateCurve_ThermalGeneratingUnit() {
        return (EReference)getHeatRateCurve().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thermal Generating Unit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit
	 * @generated
	 */
	public EClass getThermalGeneratingUnit() {
		if (thermalGeneratingUnitEClass == null) {
			thermalGeneratingUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(21);
		}
		return thermalGeneratingUnitEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getCAESPlant <em>CAES Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CAES Plant</em>'.
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getCAESPlant()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	public EReference getThermalGeneratingUnit_CAESPlant() {
        return (EReference)getThermalGeneratingUnit().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getCogenerationPlant <em>Cogeneration Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cogeneration Plant</em>'.
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getCogenerationPlant()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	public EReference getThermalGeneratingUnit_CogenerationPlant() {
        return (EReference)getThermalGeneratingUnit().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getShutdownCurve <em>Shutdown Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shutdown Curve</em>'.
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getShutdownCurve()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	public EReference getThermalGeneratingUnit_ShutdownCurve() {
        return (EReference)getThermalGeneratingUnit().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getFossilFuels <em>Fossil Fuels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fossil Fuels</em>'.
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getFossilFuels()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	public EReference getThermalGeneratingUnit_FossilFuels() {
        return (EReference)getThermalGeneratingUnit().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getHeatRateCurve <em>Heat Rate Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Heat Rate Curve</em>'.
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getHeatRateCurve()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	public EReference getThermalGeneratingUnit_HeatRateCurve() {
        return (EReference)getThermalGeneratingUnit().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getFuelAllocationSchedules <em>Fuel Allocation Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuel Allocation Schedules</em>'.
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getFuelAllocationSchedules()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	public EReference getThermalGeneratingUnit_FuelAllocationSchedules() {
        return (EReference)getThermalGeneratingUnit().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getEmissionCurves <em>Emission Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Emission Curves</em>'.
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getEmissionCurves()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	public EReference getThermalGeneratingUnit_EmissionCurves() {
        return (EReference)getThermalGeneratingUnit().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getHeatInputCurve <em>Heat Input Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Heat Input Curve</em>'.
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getHeatInputCurve()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	public EReference getThermalGeneratingUnit_HeatInputCurve() {
        return (EReference)getThermalGeneratingUnit().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getCombinedCyclePlant <em>Combined Cycle Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Combined Cycle Plant</em>'.
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getCombinedCyclePlant()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	public EReference getThermalGeneratingUnit_CombinedCyclePlant() {
        return (EReference)getThermalGeneratingUnit().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getIncrementalHeatRateCurve <em>Incremental Heat Rate Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incremental Heat Rate Curve</em>'.
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getIncrementalHeatRateCurve()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	public EReference getThermalGeneratingUnit_IncrementalHeatRateCurve() {
        return (EReference)getThermalGeneratingUnit().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getStartupModel <em>Startup Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Startup Model</em>'.
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getStartupModel()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	public EReference getThermalGeneratingUnit_StartupModel() {
        return (EReference)getThermalGeneratingUnit().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getEmmissionAccounts <em>Emmission Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Emmission Accounts</em>'.
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getEmmissionAccounts()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	public EReference getThermalGeneratingUnit_EmmissionAccounts() {
        return (EReference)getThermalGeneratingUnit().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getOMCost <em>OM Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OM Cost</em>'.
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getOMCost()
	 * @see #getThermalGeneratingUnit()
	 * @generated
	 */
	public EAttribute getThermalGeneratingUnit_OMCost() {
        return (EAttribute)getThermalGeneratingUnit().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.EmissionAccount <em>Emission Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emission Account</em>'.
	 * @see CIM15.IEC61970.Generation.Production.EmissionAccount
	 * @generated
	 */
	public EClass getEmissionAccount() {
		if (emissionAccountEClass == null) {
			emissionAccountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(22);
		}
		return emissionAccountEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.EmissionAccount#getEmissionType <em>Emission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emission Type</em>'.
	 * @see CIM15.IEC61970.Generation.Production.EmissionAccount#getEmissionType()
	 * @see #getEmissionAccount()
	 * @generated
	 */
	public EAttribute getEmissionAccount_EmissionType() {
        return (EAttribute)getEmissionAccount().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.EmissionAccount#getEmissionValueSource <em>Emission Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emission Value Source</em>'.
	 * @see CIM15.IEC61970.Generation.Production.EmissionAccount#getEmissionValueSource()
	 * @see #getEmissionAccount()
	 * @generated
	 */
	public EAttribute getEmissionAccount_EmissionValueSource() {
        return (EAttribute)getEmissionAccount().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.EmissionAccount#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thermal Generating Unit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.EmissionAccount#getThermalGeneratingUnit()
	 * @see #getEmissionAccount()
	 * @generated
	 */
	public EReference getEmissionAccount_ThermalGeneratingUnit() {
        return (EReference)getEmissionAccount().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.PenstockLossCurve <em>Penstock Loss Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Penstock Loss Curve</em>'.
	 * @see CIM15.IEC61970.Generation.Production.PenstockLossCurve
	 * @generated
	 */
	public EClass getPenstockLossCurve() {
		if (penstockLossCurveEClass == null) {
			penstockLossCurveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(24);
		}
		return penstockLossCurveEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.PenstockLossCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hydro Generating Unit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.PenstockLossCurve#getHydroGeneratingUnit()
	 * @see #getPenstockLossCurve()
	 * @generated
	 */
	public EReference getPenstockLossCurve_HydroGeneratingUnit() {
        return (EReference)getPenstockLossCurve().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.StartupModel <em>Startup Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Startup Model</em>'.
	 * @see CIM15.IEC61970.Generation.Production.StartupModel
	 * @generated
	 */
	public EClass getStartupModel() {
		if (startupModelEClass == null) {
			startupModelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(25);
		}
		return startupModelEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartupCost <em>Startup Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startup Cost</em>'.
	 * @see CIM15.IEC61970.Generation.Production.StartupModel#getStartupCost()
	 * @see #getStartupModel()
	 * @generated
	 */
	public EAttribute getStartupModel_StartupCost() {
        return (EAttribute)getStartupModel().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.StartupModel#getStbyAuxP <em>Stby Aux P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stby Aux P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.StartupModel#getStbyAuxP()
	 * @see #getStartupModel()
	 * @generated
	 */
	public EAttribute getStartupModel_StbyAuxP() {
        return (EAttribute)getStartupModel().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartRampCurve <em>Start Ramp Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Ramp Curve</em>'.
	 * @see CIM15.IEC61970.Generation.Production.StartupModel#getStartRampCurve()
	 * @see #getStartupModel()
	 * @generated
	 */
	public EReference getStartupModel_StartRampCurve() {
        return (EReference)getStartupModel().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.StartupModel#getMinimumRunTime <em>Minimum Run Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Run Time</em>'.
	 * @see CIM15.IEC61970.Generation.Production.StartupModel#getMinimumRunTime()
	 * @see #getStartupModel()
	 * @generated
	 */
	public EAttribute getStartupModel_MinimumRunTime() {
        return (EAttribute)getStartupModel().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartMainFuelCurve <em>Start Main Fuel Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Main Fuel Curve</em>'.
	 * @see CIM15.IEC61970.Generation.Production.StartupModel#getStartMainFuelCurve()
	 * @see #getStartupModel()
	 * @generated
	 */
	public EReference getStartupModel_StartMainFuelCurve() {
        return (EReference)getStartupModel().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.StartupModel#getRiskFactorCost <em>Risk Factor Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk Factor Cost</em>'.
	 * @see CIM15.IEC61970.Generation.Production.StartupModel#getRiskFactorCost()
	 * @see #getStartupModel()
	 * @generated
	 */
	public EAttribute getStartupModel_RiskFactorCost() {
        return (EAttribute)getStartupModel().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.StartupModel#getMinimumDownTime <em>Minimum Down Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Down Time</em>'.
	 * @see CIM15.IEC61970.Generation.Production.StartupModel#getMinimumDownTime()
	 * @see #getStartupModel()
	 * @generated
	 */
	public EAttribute getStartupModel_MinimumDownTime() {
        return (EAttribute)getStartupModel().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.StartupModel#getFixedMaintCost <em>Fixed Maint Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Maint Cost</em>'.
	 * @see CIM15.IEC61970.Generation.Production.StartupModel#getFixedMaintCost()
	 * @see #getStartupModel()
	 * @generated
	 */
	public EAttribute getStartupModel_FixedMaintCost() {
        return (EAttribute)getStartupModel().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartupDate <em>Startup Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startup Date</em>'.
	 * @see CIM15.IEC61970.Generation.Production.StartupModel#getStartupDate()
	 * @see #getStartupModel()
	 * @generated
	 */
	public EAttribute getStartupModel_StartupDate() {
        return (EAttribute)getStartupModel().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartIgnFuelCurve <em>Start Ign Fuel Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Ign Fuel Curve</em>'.
	 * @see CIM15.IEC61970.Generation.Production.StartupModel#getStartIgnFuelCurve()
	 * @see #getStartupModel()
	 * @generated
	 */
	public EReference getStartupModel_StartIgnFuelCurve() {
        return (EReference)getStartupModel().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.StartupModel#getHotStandbyHeat <em>Hot Standby Heat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hot Standby Heat</em>'.
	 * @see CIM15.IEC61970.Generation.Production.StartupModel#getHotStandbyHeat()
	 * @see #getStartupModel()
	 * @generated
	 */
	public EAttribute getStartupModel_HotStandbyHeat() {
        return (EAttribute)getStartupModel().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.StartupModel#getStartupPriority <em>Startup Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startup Priority</em>'.
	 * @see CIM15.IEC61970.Generation.Production.StartupModel#getStartupPriority()
	 * @see #getStartupModel()
	 * @generated
	 */
	public EAttribute getStartupModel_StartupPriority() {
        return (EAttribute)getStartupModel().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.StartupModel#getIncrementalMaintCost <em>Incremental Maint Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incremental Maint Cost</em>'.
	 * @see CIM15.IEC61970.Generation.Production.StartupModel#getIncrementalMaintCost()
	 * @see #getStartupModel()
	 * @generated
	 */
	public EAttribute getStartupModel_IncrementalMaintCost() {
        return (EAttribute)getStartupModel().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.StartupModel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thermal Generating Unit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.StartupModel#getThermalGeneratingUnit()
	 * @see #getStartupModel()
	 * @generated
	 */
	public EReference getStartupModel_ThermalGeneratingUnit() {
        return (EReference)getStartupModel().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit <em>Hydro Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hydro Generating Unit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroGeneratingUnit
	 * @generated
	 */
	public EClass getHydroGeneratingUnit() {
		if (hydroGeneratingUnitEClass == null) {
			hydroGeneratingUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(26);
		}
		return hydroGeneratingUnitEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getEnergyConversionCapability <em>Energy Conversion Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Conversion Capability</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getEnergyConversionCapability()
	 * @see #getHydroGeneratingUnit()
	 * @generated
	 */
	public EAttribute getHydroGeneratingUnit_EnergyConversionCapability() {
        return (EAttribute)getHydroGeneratingUnit().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getPenstockLossCurve <em>Penstock Loss Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Penstock Loss Curve</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getPenstockLossCurve()
	 * @see #getHydroGeneratingUnit()
	 * @generated
	 */
	public EReference getHydroGeneratingUnit_PenstockLossCurve() {
        return (EReference)getHydroGeneratingUnit().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroPowerPlant <em>Hydro Power Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hydro Power Plant</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroPowerPlant()
	 * @see #getHydroGeneratingUnit()
	 * @generated
	 */
	public EReference getHydroGeneratingUnit_HydroPowerPlant() {
        return (EReference)getHydroGeneratingUnit().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroUnitWaterCost <em>Hydro Unit Water Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hydro Unit Water Cost</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroUnitWaterCost()
	 * @see #getHydroGeneratingUnit()
	 * @generated
	 */
	public EAttribute getHydroGeneratingUnit_HydroUnitWaterCost() {
        return (EAttribute)getHydroGeneratingUnit().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getTailbayLossCurve <em>Tailbay Loss Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tailbay Loss Curve</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getTailbayLossCurve()
	 * @see #getHydroGeneratingUnit()
	 * @generated
	 */
	public EReference getHydroGeneratingUnit_TailbayLossCurve() {
        return (EReference)getHydroGeneratingUnit().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroGeneratingEfficiencyCurves <em>Hydro Generating Efficiency Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hydro Generating Efficiency Curves</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroGeneratingUnit#getHydroGeneratingEfficiencyCurves()
	 * @see #getHydroGeneratingUnit()
	 * @generated
	 */
	public EReference getHydroGeneratingUnit_HydroGeneratingEfficiencyCurves() {
        return (EReference)getHydroGeneratingUnit().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.GenUnitOpCostCurve <em>Gen Unit Op Cost Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Unit Op Cost Curve</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GenUnitOpCostCurve
	 * @generated
	 */
	public EClass getGenUnitOpCostCurve() {
		if (genUnitOpCostCurveEClass == null) {
			genUnitOpCostCurveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(28);
		}
		return genUnitOpCostCurveEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GenUnitOpCostCurve#isIsNetGrossP <em>Is Net Gross P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Net Gross P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GenUnitOpCostCurve#isIsNetGrossP()
	 * @see #getGenUnitOpCostCurve()
	 * @generated
	 */
	public EAttribute getGenUnitOpCostCurve_IsNetGrossP() {
        return (EAttribute)getGenUnitOpCostCurve().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.GenUnitOpCostCurve#getGeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generating Unit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GenUnitOpCostCurve#getGeneratingUnit()
	 * @see #getGenUnitOpCostCurve()
	 * @generated
	 */
	public EReference getGenUnitOpCostCurve_GeneratingUnit() {
        return (EReference)getGenUnitOpCostCurve().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.IncrementalHeatRateCurve <em>Incremental Heat Rate Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incremental Heat Rate Curve</em>'.
	 * @see CIM15.IEC61970.Generation.Production.IncrementalHeatRateCurve
	 * @generated
	 */
	public EClass getIncrementalHeatRateCurve() {
		if (incrementalHeatRateCurveEClass == null) {
			incrementalHeatRateCurveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(29);
		}
		return incrementalHeatRateCurveEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.IncrementalHeatRateCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thermal Generating Unit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.IncrementalHeatRateCurve#getThermalGeneratingUnit()
	 * @see #getIncrementalHeatRateCurve()
	 * @generated
	 */
	public EReference getIncrementalHeatRateCurve_ThermalGeneratingUnit() {
        return (EReference)getIncrementalHeatRateCurve().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.IncrementalHeatRateCurve#isIsNetGrossP <em>Is Net Gross P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Net Gross P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.IncrementalHeatRateCurve#isIsNetGrossP()
	 * @see #getIncrementalHeatRateCurve()
	 * @generated
	 */
	public EAttribute getIncrementalHeatRateCurve_IsNetGrossP() {
        return (EAttribute)getIncrementalHeatRateCurve().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.FossilFuel <em>Fossil Fuel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fossil Fuel</em>'.
	 * @see CIM15.IEC61970.Generation.Production.FossilFuel
	 * @generated
	 */
	public EClass getFossilFuel() {
		if (fossilFuelEClass == null) {
			fossilFuelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(30);
		}
		return fossilFuelEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelSulfur <em>Fuel Sulfur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Sulfur</em>'.
	 * @see CIM15.IEC61970.Generation.Production.FossilFuel#getFuelSulfur()
	 * @see #getFossilFuel()
	 * @generated
	 */
	public EAttribute getFossilFuel_FuelSulfur() {
        return (EAttribute)getFossilFuel().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelCost <em>Fuel Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Cost</em>'.
	 * @see CIM15.IEC61970.Generation.Production.FossilFuel#getFuelCost()
	 * @see #getFossilFuel()
	 * @generated
	 */
	public EAttribute getFossilFuel_FuelCost() {
        return (EAttribute)getFossilFuel().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFossilFuelType <em>Fossil Fuel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fossil Fuel Type</em>'.
	 * @see CIM15.IEC61970.Generation.Production.FossilFuel#getFossilFuelType()
	 * @see #getFossilFuel()
	 * @generated
	 */
	public EAttribute getFossilFuel_FossilFuelType() {
        return (EAttribute)getFossilFuel().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getLowBreakpointP <em>Low Breakpoint P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Breakpoint P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.FossilFuel#getLowBreakpointP()
	 * @see #getFossilFuel()
	 * @generated
	 */
	public EAttribute getFossilFuel_LowBreakpointP() {
        return (EAttribute)getFossilFuel().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelDispatchCost <em>Fuel Dispatch Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Dispatch Cost</em>'.
	 * @see CIM15.IEC61970.Generation.Production.FossilFuel#getFuelDispatchCost()
	 * @see #getFossilFuel()
	 * @generated
	 */
	public EAttribute getFossilFuel_FuelDispatchCost() {
        return (EAttribute)getFossilFuel().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelHandlingCost <em>Fuel Handling Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Handling Cost</em>'.
	 * @see CIM15.IEC61970.Generation.Production.FossilFuel#getFuelHandlingCost()
	 * @see #getFossilFuel()
	 * @generated
	 */
	public EAttribute getFossilFuel_FuelHandlingCost() {
        return (EAttribute)getFossilFuel().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thermal Generating Unit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.FossilFuel#getThermalGeneratingUnit()
	 * @see #getFossilFuel()
	 * @generated
	 */
	public EReference getFossilFuel_ThermalGeneratingUnit() {
        return (EReference)getFossilFuel().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelHeatContent <em>Fuel Heat Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Heat Content</em>'.
	 * @see CIM15.IEC61970.Generation.Production.FossilFuel#getFuelHeatContent()
	 * @see #getFossilFuel()
	 * @generated
	 */
	public EAttribute getFossilFuel_FuelHeatContent() {
        return (EAttribute)getFossilFuel().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelEffFactor <em>Fuel Eff Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Eff Factor</em>'.
	 * @see CIM15.IEC61970.Generation.Production.FossilFuel#getFuelEffFactor()
	 * @see #getFossilFuel()
	 * @generated
	 */
	public EAttribute getFossilFuel_FuelEffFactor() {
        return (EAttribute)getFossilFuel().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelMixture <em>Fuel Mixture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Mixture</em>'.
	 * @see CIM15.IEC61970.Generation.Production.FossilFuel#getFuelMixture()
	 * @see #getFossilFuel()
	 * @generated
	 */
	public EAttribute getFossilFuel_FuelMixture() {
        return (EAttribute)getFossilFuel().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getFuelAllocationSchedules <em>Fuel Allocation Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuel Allocation Schedules</em>'.
	 * @see CIM15.IEC61970.Generation.Production.FossilFuel#getFuelAllocationSchedules()
	 * @see #getFossilFuel()
	 * @generated
	 */
	public EReference getFossilFuel_FuelAllocationSchedules() {
        return (EReference)getFossilFuel().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.FossilFuel#getHighBreakpointP <em>High Breakpoint P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Breakpoint P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.FossilFuel#getHighBreakpointP()
	 * @see #getFossilFuel()
	 * @generated
	 */
	public EAttribute getFossilFuel_HighBreakpointP() {
        return (EAttribute)getFossilFuel().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit <em>Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generating Unit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit
	 * @generated
	 */
	public EClass getGeneratingUnit() {
		if (generatingUnitEClass == null) {
			generatingUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(32);
		}
		return generatingUnitEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getRatedGrossMinP <em>Rated Gross Min P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Gross Min P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getRatedGrossMinP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_RatedGrossMinP() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getEfficiency <em>Efficiency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Efficiency</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getEfficiency()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_Efficiency() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getStepChange <em>Step Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Change</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getStepChange()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_StepChange() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getRatedNetMaxP <em>Rated Net Max P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Net Max P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getRatedNetMaxP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_RatedNetMaxP() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getTieLinePF <em>Tie Line PF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tie Line PF</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getTieLinePF()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_TieLinePF() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#isDispReserveFlag <em>Disp Reserve Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disp Reserve Flag</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#isDispReserveFlag()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_DispReserveFlag() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlPulseHigh <em>Control Pulse High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Pulse High</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlPulseHigh()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_ControlPulseHigh() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getStartupTime <em>Startup Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startup Time</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getStartupTime()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_StartupTime() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMaxOperatingP <em>Max Operating P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Operating P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getMaxOperatingP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_MaxOperatingP() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenControlSource <em>Gen Control Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gen Control Source</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenControlSource()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_GenControlSource() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getNormalPF <em>Normal PF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal PF</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getNormalPF()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_NormalPF() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getInitialP <em>Initial P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getInitialP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_InitialP() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getSpinReserveRamp <em>Spin Reserve Ramp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spin Reserve Ramp</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getSpinReserveRamp()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_SpinReserveRamp() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getAllocSpinResP <em>Alloc Spin Res P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alloc Spin Res P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getAllocSpinResP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_AllocSpinResP() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMinEconomicP <em>Min Economic P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Economic P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getMinEconomicP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_MinEconomicP() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getLongPF <em>Long PF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long PF</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getLongPF()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_LongPF() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getNominalP <em>Nominal P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getNominalP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_NominalP() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlResponseRate <em>Control Response Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Response Rate</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlResponseRate()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_ControlResponseRate() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Control Area Generating Unit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlAreaGeneratingUnit()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EReference getGeneratingUnit_ControlAreaGeneratingUnit() {
        return (EReference)getGeneratingUnit().getEStructuralFeatures().get(18);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getSynchronousMachines <em>Synchronous Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Synchronous Machines</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getSynchronousMachines()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EReference getGeneratingUnit_SynchronousMachines() {
        return (EReference)getGeneratingUnit().getEStructuralFeatures().get(19);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getRatedGrossMaxP <em>Rated Gross Max P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Gross Max P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getRatedGrossMaxP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_RatedGrossMaxP() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(20);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getPenaltyFactor <em>Penalty Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Penalty Factor</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getPenaltyFactor()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_PenaltyFactor() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(21);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#isFastStartFlag <em>Fast Start Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fast Start Flag</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#isFastStartFlag()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_FastStartFlag() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(22);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMinimumOffTime <em>Minimum Off Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Off Time</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getMinimumOffTime()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_MinimumOffTime() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(23);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getShortPF <em>Short PF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short PF</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getShortPF()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_ShortPF() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(24);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGovernorMPL <em>Governor MPL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Governor MPL</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getGovernorMPL()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_GovernorMPL() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(25);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getEnergyMinP <em>Energy Min P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Min P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getEnergyMinP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_EnergyMinP() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(26);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getFuelPriority <em>Fuel Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Priority</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getFuelPriority()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_FuelPriority() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(27);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMaxEconomicP <em>Max Economic P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Economic P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getMaxEconomicP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_MaxEconomicP() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(28);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getAutoCntrlMarginP <em>Auto Cntrl Margin P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Cntrl Margin P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getAutoCntrlMarginP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_AutoCntrlMarginP() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(29);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getHighControlLimit <em>High Control Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Control Limit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getHighControlLimit()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_HighControlLimit() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(30);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getModelDetail <em>Model Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Detail</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getModelDetail()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_ModelDetail() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(31);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlPulseLow <em>Control Pulse Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Pulse Low</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlPulseLow()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_ControlPulseLow() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(32);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getRaiseRampRate <em>Raise Ramp Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raise Ramp Rate</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getRaiseRampRate()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_RaiseRampRate() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(33);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenUnitOpSchedule <em>Gen Unit Op Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Unit Op Schedule</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenUnitOpSchedule()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EReference getGeneratingUnit_GenUnitOpSchedule() {
        return (EReference)getGeneratingUnit().getEStructuralFeatures().get(34);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlDeadband <em>Control Deadband</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Deadband</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getControlDeadband()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_ControlDeadband() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(35);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getBaseP <em>Base P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getBaseP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_BaseP() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(36);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getStartupCost <em>Startup Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startup Cost</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getStartupCost()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_StartupCost() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(37);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getVariableCost <em>Variable Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Cost</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getVariableCost()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_VariableCost() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(38);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenOperatingMode <em>Gen Operating Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gen Operating Mode</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenOperatingMode()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_GenOperatingMode() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(39);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getLowerRampRate <em>Lower Ramp Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Ramp Rate</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getLowerRampRate()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_LowerRampRate() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(40);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMinOperatingP <em>Min Operating P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Operating P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getMinOperatingP()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_MinOperatingP() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(41);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getLowControlLimit <em>Low Control Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Control Limit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getLowControlLimit()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_LowControlLimit() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(42);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGrossToNetActivePowerCurves <em>Gross To Net Active Power Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gross To Net Active Power Curves</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getGrossToNetActivePowerCurves()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EReference getGeneratingUnit_GrossToNetActivePowerCurves() {
        return (EReference)getGeneratingUnit().getEStructuralFeatures().get(43);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getMaximumAllowableSpinningReserve <em>Maximum Allowable Spinning Reserve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Allowable Spinning Reserve</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getMaximumAllowableSpinningReserve()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_MaximumAllowableSpinningReserve() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(44);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenControlMode <em>Gen Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gen Control Mode</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenControlMode()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_GenControlMode() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(45);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenUnitOpCostCurves <em>Gen Unit Op Cost Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gen Unit Op Cost Curves</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getGenUnitOpCostCurves()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EReference getGeneratingUnit_GenUnitOpCostCurves() {
        return (EReference)getGeneratingUnit().getEStructuralFeatures().get(46);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getGovernorSCD <em>Governor SCD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Governor SCD</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getGovernorSCD()
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public EAttribute getGeneratingUnit_GovernorSCD() {
        return (EAttribute)getGeneratingUnit().getEStructuralFeatures().get(47);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.StartIgnFuelCurve <em>Start Ign Fuel Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Ign Fuel Curve</em>'.
	 * @see CIM15.IEC61970.Generation.Production.StartIgnFuelCurve
	 * @generated
	 */
	public EClass getStartIgnFuelCurve() {
		if (startIgnFuelCurveEClass == null) {
			startIgnFuelCurveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(33);
		}
		return startIgnFuelCurveEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.StartIgnFuelCurve#getStartupModel <em>Startup Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Startup Model</em>'.
	 * @see CIM15.IEC61970.Generation.Production.StartIgnFuelCurve#getStartupModel()
	 * @see #getStartIgnFuelCurve()
	 * @generated
	 */
	public EReference getStartIgnFuelCurve_StartupModel() {
        return (EReference)getStartIgnFuelCurve().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.StartIgnFuelCurve#getIgnitionFuelType <em>Ignition Fuel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignition Fuel Type</em>'.
	 * @see CIM15.IEC61970.Generation.Production.StartIgnFuelCurve#getIgnitionFuelType()
	 * @see #getStartIgnFuelCurve()
	 * @generated
	 */
	public EAttribute getStartIgnFuelCurve_IgnitionFuelType() {
        return (EAttribute)getStartIgnFuelCurve().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.StartMainFuelCurve <em>Start Main Fuel Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Main Fuel Curve</em>'.
	 * @see CIM15.IEC61970.Generation.Production.StartMainFuelCurve
	 * @generated
	 */
	public EClass getStartMainFuelCurve() {
		if (startMainFuelCurveEClass == null) {
			startMainFuelCurveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(34);
		}
		return startMainFuelCurveEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.StartMainFuelCurve#getMainFuelType <em>Main Fuel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Fuel Type</em>'.
	 * @see CIM15.IEC61970.Generation.Production.StartMainFuelCurve#getMainFuelType()
	 * @see #getStartMainFuelCurve()
	 * @generated
	 */
	public EAttribute getStartMainFuelCurve_MainFuelType() {
        return (EAttribute)getStartMainFuelCurve().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.StartMainFuelCurve#getStartupModel <em>Startup Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Startup Model</em>'.
	 * @see CIM15.IEC61970.Generation.Production.StartMainFuelCurve#getStartupModel()
	 * @see #getStartMainFuelCurve()
	 * @generated
	 */
	public EReference getStartMainFuelCurve_StartupModel() {
        return (EReference)getStartMainFuelCurve().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.TailbayLossCurve <em>Tailbay Loss Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tailbay Loss Curve</em>'.
	 * @see CIM15.IEC61970.Generation.Production.TailbayLossCurve
	 * @generated
	 */
	public EClass getTailbayLossCurve() {
		if (tailbayLossCurveEClass == null) {
			tailbayLossCurveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(35);
		}
		return tailbayLossCurveEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.TailbayLossCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hydro Generating Unit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.TailbayLossCurve#getHydroGeneratingUnit()
	 * @see #getTailbayLossCurve()
	 * @generated
	 */
	public EReference getTailbayLossCurve_HydroGeneratingUnit() {
        return (EReference)getTailbayLossCurve().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.HydroPump <em>Hydro Pump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hydro Pump</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPump
	 * @generated
	 */
	public EClass getHydroPump() {
		if (hydroPumpEClass == null) {
			hydroPumpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(36);
		}
		return hydroPumpEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.HydroPump#getPumpDischAtMaxHead <em>Pump Disch At Max Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pump Disch At Max Head</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPump#getPumpDischAtMaxHead()
	 * @see #getHydroPump()
	 * @generated
	 */
	public EAttribute getHydroPump_PumpDischAtMaxHead() {
        return (EAttribute)getHydroPump().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.HydroPump#getHydroPowerPlant <em>Hydro Power Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hydro Power Plant</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPump#getHydroPowerPlant()
	 * @see #getHydroPump()
	 * @generated
	 */
	public EReference getHydroPump_HydroPowerPlant() {
        return (EReference)getHydroPump().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.HydroPump#getPumpDischAtMinHead <em>Pump Disch At Min Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pump Disch At Min Head</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPump#getPumpDischAtMinHead()
	 * @see #getHydroPump()
	 * @generated
	 */
	public EAttribute getHydroPump_PumpDischAtMinHead() {
        return (EAttribute)getHydroPump().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.HydroPump#getPumpPowerAtMinHead <em>Pump Power At Min Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pump Power At Min Head</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPump#getPumpPowerAtMinHead()
	 * @see #getHydroPump()
	 * @generated
	 */
	public EAttribute getHydroPump_PumpPowerAtMinHead() {
        return (EAttribute)getHydroPump().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.HydroPump#getHydroPumpOpSchedule <em>Hydro Pump Op Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hydro Pump Op Schedule</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPump#getHydroPumpOpSchedule()
	 * @see #getHydroPump()
	 * @generated
	 */
	public EReference getHydroPump_HydroPumpOpSchedule() {
        return (EReference)getHydroPump().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.HydroPump#getPumpPowerAtMaxHead <em>Pump Power At Max Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pump Power At Max Head</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPump#getPumpPowerAtMaxHead()
	 * @see #getHydroPump()
	 * @generated
	 */
	public EAttribute getHydroPump_PumpPowerAtMaxHead() {
        return (EAttribute)getHydroPump().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.HydroPump#getSynchronousMachine <em>Synchronous Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronous Machine</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPump#getSynchronousMachine()
	 * @see #getHydroPump()
	 * @generated
	 */
	public EReference getHydroPump_SynchronousMachine() {
        return (EReference)getHydroPump().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.InflowForecast <em>Inflow Forecast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inflow Forecast</em>'.
	 * @see CIM15.IEC61970.Generation.Production.InflowForecast
	 * @generated
	 */
	public EClass getInflowForecast() {
		if (inflowForecastEClass == null) {
			inflowForecastEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(37);
		}
		return inflowForecastEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.InflowForecast#getReservoir <em>Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservoir</em>'.
	 * @see CIM15.IEC61970.Generation.Production.InflowForecast#getReservoir()
	 * @see #getInflowForecast()
	 * @generated
	 */
	public EReference getInflowForecast_Reservoir() {
        return (EReference)getInflowForecast().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingEfficiencyCurve <em>Hydro Generating Efficiency Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hydro Generating Efficiency Curve</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroGeneratingEfficiencyCurve
	 * @generated
	 */
	public EClass getHydroGeneratingEfficiencyCurve() {
		if (hydroGeneratingEfficiencyCurveEClass == null) {
			hydroGeneratingEfficiencyCurveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(38);
		}
		return hydroGeneratingEfficiencyCurveEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingEfficiencyCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hydro Generating Unit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroGeneratingEfficiencyCurve#getHydroGeneratingUnit()
	 * @see #getHydroGeneratingEfficiencyCurve()
	 * @generated
	 */
	public EReference getHydroGeneratingEfficiencyCurve_HydroGeneratingUnit() {
        return (EReference)getHydroGeneratingEfficiencyCurve().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.ShutdownCurve <em>Shutdown Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shutdown Curve</em>'.
	 * @see CIM15.IEC61970.Generation.Production.ShutdownCurve
	 * @generated
	 */
	public EClass getShutdownCurve() {
		if (shutdownCurveEClass == null) {
			shutdownCurveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(40);
		}
		return shutdownCurveEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.ShutdownCurve#getShutdownDate <em>Shutdown Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shutdown Date</em>'.
	 * @see CIM15.IEC61970.Generation.Production.ShutdownCurve#getShutdownDate()
	 * @see #getShutdownCurve()
	 * @generated
	 */
	public EAttribute getShutdownCurve_ShutdownDate() {
        return (EAttribute)getShutdownCurve().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.ShutdownCurve#getShutdownCost <em>Shutdown Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shutdown Cost</em>'.
	 * @see CIM15.IEC61970.Generation.Production.ShutdownCurve#getShutdownCost()
	 * @see #getShutdownCurve()
	 * @generated
	 */
	public EAttribute getShutdownCurve_ShutdownCost() {
        return (EAttribute)getShutdownCurve().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.ShutdownCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thermal Generating Unit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.ShutdownCurve#getThermalGeneratingUnit()
	 * @see #getShutdownCurve()
	 * @generated
	 */
	public EReference getShutdownCurve_ThermalGeneratingUnit() {
        return (EReference)getShutdownCurve().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant <em>Hydro Power Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hydro Power Plant</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPowerPlant
	 * @generated
	 */
	public EClass getHydroPowerPlant() {
		if (hydroPowerPlantEClass == null) {
			hydroPowerPlantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(41);
		}
		return hydroPowerPlantEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getPenstockType <em>Penstock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Penstock Type</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPowerPlant#getPenstockType()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	public EAttribute getHydroPowerPlant_PenstockType() {
        return (EAttribute)getHydroPowerPlant().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getPumpRatedP <em>Pump Rated P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pump Rated P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPowerPlant#getPumpRatedP()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	public EAttribute getHydroPowerPlant_PumpRatedP() {
        return (EAttribute)getHydroPowerPlant().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getHydroPlantType <em>Hydro Plant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hydro Plant Type</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPowerPlant#getHydroPlantType()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	public EAttribute getHydroPowerPlant_HydroPlantType() {
        return (EAttribute)getHydroPowerPlant().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getSurgeTankCrestLevel <em>Surge Tank Crest Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surge Tank Crest Level</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPowerPlant#getSurgeTankCrestLevel()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	public EAttribute getHydroPowerPlant_SurgeTankCrestLevel() {
        return (EAttribute)getHydroPowerPlant().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getHydroGeneratingUnits <em>Hydro Generating Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hydro Generating Units</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPowerPlant#getHydroGeneratingUnits()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	public EReference getHydroPowerPlant_HydroGeneratingUnits() {
        return (EReference)getHydroPowerPlant().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getGenSourcePumpDischargeReservoir <em>Gen Source Pump Discharge Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Source Pump Discharge Reservoir</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPowerPlant#getGenSourcePumpDischargeReservoir()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	public EReference getHydroPowerPlant_GenSourcePumpDischargeReservoir() {
        return (EReference)getHydroPowerPlant().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getDischargeTravelDelay <em>Discharge Travel Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discharge Travel Delay</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPowerPlant#getDischargeTravelDelay()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	public EAttribute getHydroPowerPlant_DischargeTravelDelay() {
        return (EAttribute)getHydroPowerPlant().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getReservoir <em>Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservoir</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPowerPlant#getReservoir()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	public EReference getHydroPowerPlant_Reservoir() {
        return (EReference)getHydroPowerPlant().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getPlantDischargeCapacity <em>Plant Discharge Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plant Discharge Capacity</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPowerPlant#getPlantDischargeCapacity()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	public EAttribute getHydroPowerPlant_PlantDischargeCapacity() {
        return (EAttribute)getHydroPowerPlant().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getHydroPumps <em>Hydro Pumps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hydro Pumps</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPowerPlant#getHydroPumps()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	public EReference getHydroPowerPlant_HydroPumps() {
        return (EReference)getHydroPowerPlant().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getPlantRatedHead <em>Plant Rated Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plant Rated Head</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPowerPlant#getPlantRatedHead()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	public EAttribute getHydroPowerPlant_PlantRatedHead() {
        return (EAttribute)getHydroPowerPlant().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getGenRatedP <em>Gen Rated P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gen Rated P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPowerPlant#getGenRatedP()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	public EAttribute getHydroPowerPlant_GenRatedP() {
        return (EAttribute)getHydroPowerPlant().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getSurgeTankCode <em>Surge Tank Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surge Tank Code</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPowerPlant#getSurgeTankCode()
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	public EAttribute getHydroPowerPlant_SurgeTankCode() {
        return (EAttribute)getHydroPowerPlant().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.CAESPlant <em>CAES Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CAES Plant</em>'.
	 * @see CIM15.IEC61970.Generation.Production.CAESPlant
	 * @generated
	 */
	public EClass getCAESPlant() {
		if (caesPlantEClass == null) {
			caesPlantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(42);
		}
		return caesPlantEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.CAESPlant#getAirCompressor <em>Air Compressor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Air Compressor</em>'.
	 * @see CIM15.IEC61970.Generation.Production.CAESPlant#getAirCompressor()
	 * @see #getCAESPlant()
	 * @generated
	 */
	public EReference getCAESPlant_AirCompressor() {
        return (EReference)getCAESPlant().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.CAESPlant#getRatedCapacityP <em>Rated Capacity P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Capacity P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.CAESPlant#getRatedCapacityP()
	 * @see #getCAESPlant()
	 * @generated
	 */
	public EAttribute getCAESPlant_RatedCapacityP() {
        return (EAttribute)getCAESPlant().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.CAESPlant#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thermal Generating Unit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.CAESPlant#getThermalGeneratingUnit()
	 * @see #getCAESPlant()
	 * @generated
	 */
	public EReference getCAESPlant_ThermalGeneratingUnit() {
        return (EReference)getCAESPlant().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.CAESPlant#getEnergyStorageCapacity <em>Energy Storage Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Storage Capacity</em>'.
	 * @see CIM15.IEC61970.Generation.Production.CAESPlant#getEnergyStorageCapacity()
	 * @see #getCAESPlant()
	 * @generated
	 */
	public EAttribute getCAESPlant_EnergyStorageCapacity() {
        return (EAttribute)getCAESPlant().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.AirCompressor <em>Air Compressor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Air Compressor</em>'.
	 * @see CIM15.IEC61970.Generation.Production.AirCompressor
	 * @generated
	 */
	public EClass getAirCompressor() {
		if (airCompressorEClass == null) {
			airCompressorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(43);
		}
		return airCompressorEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.AirCompressor#getAirCompressorRating <em>Air Compressor Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Air Compressor Rating</em>'.
	 * @see CIM15.IEC61970.Generation.Production.AirCompressor#getAirCompressorRating()
	 * @see #getAirCompressor()
	 * @generated
	 */
	public EAttribute getAirCompressor_AirCompressorRating() {
        return (EAttribute)getAirCompressor().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.AirCompressor#getCombustionTurbine <em>Combustion Turbine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Combustion Turbine</em>'.
	 * @see CIM15.IEC61970.Generation.Production.AirCompressor#getCombustionTurbine()
	 * @see #getAirCompressor()
	 * @generated
	 */
	public EReference getAirCompressor_CombustionTurbine() {
        return (EReference)getAirCompressor().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.AirCompressor#getCAESPlant <em>CAES Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CAES Plant</em>'.
	 * @see CIM15.IEC61970.Generation.Production.AirCompressor#getCAESPlant()
	 * @see #getAirCompressor()
	 * @generated
	 */
	public EReference getAirCompressor_CAESPlant() {
        return (EReference)getAirCompressor().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve <em>Heat Input Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heat Input Curve</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HeatInputCurve
	 * @generated
	 */
	public EClass getHeatInputCurve() {
		if (heatInputCurveEClass == null) {
			heatInputCurveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(44);
		}
		return heatInputCurveEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#isIsNetGrossP <em>Is Net Gross P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Net Gross P</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HeatInputCurve#isIsNetGrossP()
	 * @see #getHeatInputCurve()
	 * @generated
	 */
	public EAttribute getHeatInputCurve_IsNetGrossP() {
        return (EAttribute)getHeatInputCurve().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#getHeatInputEff <em>Heat Input Eff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heat Input Eff</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HeatInputCurve#getHeatInputEff()
	 * @see #getHeatInputCurve()
	 * @generated
	 */
	public EAttribute getHeatInputCurve_HeatInputEff() {
        return (EAttribute)getHeatInputCurve().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#getHeatInputOffset <em>Heat Input Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heat Input Offset</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HeatInputCurve#getHeatInputOffset()
	 * @see #getHeatInputCurve()
	 * @generated
	 */
	public EAttribute getHeatInputCurve_HeatInputOffset() {
        return (EAttribute)getHeatInputCurve().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thermal Generating Unit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HeatInputCurve#getThermalGeneratingUnit()
	 * @see #getHeatInputCurve()
	 * @generated
	 */
	public EReference getHeatInputCurve_ThermalGeneratingUnit() {
        return (EReference)getHeatInputCurve().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#getAuxPowerOffset <em>Aux Power Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux Power Offset</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HeatInputCurve#getAuxPowerOffset()
	 * @see #getHeatInputCurve()
	 * @generated
	 */
	public EAttribute getHeatInputCurve_AuxPowerOffset() {
        return (EAttribute)getHeatInputCurve().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve#getAuxPowerMult <em>Aux Power Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux Power Mult</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HeatInputCurve#getAuxPowerMult()
	 * @see #getHeatInputCurve()
	 * @generated
	 */
	public EAttribute getHeatInputCurve_AuxPowerMult() {
        return (EAttribute)getHeatInputCurve().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Generation.Production.WindGeneratingUnit <em>Wind Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wind Generating Unit</em>'.
	 * @see CIM15.IEC61970.Generation.Production.WindGeneratingUnit
	 * @generated
	 */
	public EClass getWindGeneratingUnit() {
		if (windGeneratingUnitEClass == null) {
			windGeneratingUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(45);
		}
		return windGeneratingUnitEClass;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Generation.Production.FuelType <em>Fuel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fuel Type</em>'.
	 * @see CIM15.IEC61970.Generation.Production.FuelType
	 * @generated
	 */
	public EEnum getFuelType() {
		if (fuelTypeEEnum == null) {
			fuelTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(0);
		}
		return fuelTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Generation.Production.GeneratorOperatingMode <em>Generator Operating Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generator Operating Mode</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratorOperatingMode
	 * @generated
	 */
	public EEnum getGeneratorOperatingMode() {
		if (generatorOperatingModeEEnum == null) {
			generatorOperatingModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(1);
		}
		return generatorOperatingModeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Generation.Production.GeneratorControlMode <em>Generator Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generator Control Mode</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratorControlMode
	 * @generated
	 */
	public EEnum getGeneratorControlMode() {
		if (generatorControlModeEEnum == null) {
			generatorControlModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(2);
		}
		return generatorControlModeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Generation.Production.HydroPlantType <em>Hydro Plant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hydro Plant Type</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroPlantType
	 * @generated
	 */
	public EEnum getHydroPlantType() {
		if (hydroPlantTypeEEnum == null) {
			hydroPlantTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(3);
		}
		return hydroPlantTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Generation.Production.HydroEnergyConversionKind <em>Hydro Energy Conversion Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hydro Energy Conversion Kind</em>'.
	 * @see CIM15.IEC61970.Generation.Production.HydroEnergyConversionKind
	 * @generated
	 */
	public EEnum getHydroEnergyConversionKind() {
		if (hydroEnergyConversionKindEEnum == null) {
			hydroEnergyConversionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(6);
		}
		return hydroEnergyConversionKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Generation.Production.PenstockType <em>Penstock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Penstock Type</em>'.
	 * @see CIM15.IEC61970.Generation.Production.PenstockType
	 * @generated
	 */
	public EEnum getPenstockType() {
		if (penstockTypeEEnum == null) {
			penstockTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(17);
		}
		return penstockTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Generation.Production.EmissionValueSource <em>Emission Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Emission Value Source</em>'.
	 * @see CIM15.IEC61970.Generation.Production.EmissionValueSource
	 * @generated
	 */
	public EEnum getEmissionValueSource() {
		if (emissionValueSourceEEnum == null) {
			emissionValueSourceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(20);
		}
		return emissionValueSourceEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Generation.Production.GeneratorControlSource <em>Generator Control Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generator Control Source</em>'.
	 * @see CIM15.IEC61970.Generation.Production.GeneratorControlSource
	 * @generated
	 */
	public EEnum getGeneratorControlSource() {
		if (generatorControlSourceEEnum == null) {
			generatorControlSourceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(23);
		}
		return generatorControlSourceEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Generation.Production.SpillwayGateType <em>Spillway Gate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Spillway Gate Type</em>'.
	 * @see CIM15.IEC61970.Generation.Production.SpillwayGateType
	 * @generated
	 */
	public EEnum getSpillwayGateType() {
		if (spillwayGateTypeEEnum == null) {
			spillwayGateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(27);
		}
		return spillwayGateTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Generation.Production.SurgeTankCode <em>Surge Tank Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Surge Tank Code</em>'.
	 * @see CIM15.IEC61970.Generation.Production.SurgeTankCode
	 * @generated
	 */
	public EEnum getSurgeTankCode() {
		if (surgeTankCodeEEnum == null) {
			surgeTankCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(31);
		}
		return surgeTankCodeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Generation.Production.EmissionType <em>Emission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Emission Type</em>'.
	 * @see CIM15.IEC61970.Generation.Production.EmissionType
	 * @generated
	 */
	public EEnum getEmissionType() {
		if (emissionTypeEEnum == null) {
			emissionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(39);
		}
		return emissionTypeEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Classification</em>'.
	 * @see java.math.BigInteger
	 * @generated
	 */
	public EDataType getClassification() {
		if (classificationEDataType == null) {
			classificationEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(46);
		}
		return classificationEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Heat Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Heat Rate</em>'.
	 * @generated
	 */
	public EDataType getHeatRate() {
		if (heatRateEDataType == null) {
			heatRateEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(47);
		}
		return heatRateEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Cost Per Heat Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cost Per Heat Unit</em>'.
	 * @generated
	 */
	public EDataType getCostPerHeatUnit() {
		if (costPerHeatUnitEDataType == null) {
			costPerHeatUnitEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(48);
		}
		return costPerHeatUnitEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Emission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Emission</em>'.
	 * @generated
	 */
	public EDataType getEmission() {
		if (emissionEDataType == null) {
			emissionEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI).getEClassifiers().get(49);
		}
		return emissionEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public ProductionFactory getProductionFactory() {
		return (ProductionFactory)getEFactoryInstance();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("CIM15.IEC61970.Generation.Production." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals {
		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.Reservoir <em>Reservoir</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.Reservoir
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getReservoir()
		 * @generated
		 */
		public static final EClass RESERVOIR = eINSTANCE.getReservoir();

		/**
		 * The meta object literal for the '<em><b>Level Vs Volume Curves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RESERVOIR__LEVEL_VS_VOLUME_CURVES = eINSTANCE.getReservoir_LevelVsVolumeCurves();

		/**
		 * The meta object literal for the '<em><b>Spillway Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RESERVOIR__SPILLWAY_CAPACITY = eINSTANCE.getReservoir_SpillwayCapacity();

		/**
		 * The meta object literal for the '<em><b>Energy Storage Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RESERVOIR__ENERGY_STORAGE_RATING = eINSTANCE.getReservoir_EnergyStorageRating();

		/**
		 * The meta object literal for the '<em><b>Gross Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RESERVOIR__GROSS_CAPACITY = eINSTANCE.getReservoir_GrossCapacity();

		/**
		 * The meta object literal for the '<em><b>Target Level Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RESERVOIR__TARGET_LEVEL_SCHEDULE = eINSTANCE.getReservoir_TargetLevelSchedule();

		/**
		 * The meta object literal for the '<em><b>River Outlet Works</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RESERVOIR__RIVER_OUTLET_WORKS = eINSTANCE.getReservoir_RiverOutletWorks();

		/**
		 * The meta object literal for the '<em><b>Spillway Crest Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RESERVOIR__SPILLWAY_CREST_LEVEL = eINSTANCE.getReservoir_SpillwayCrestLevel();

		/**
		 * The meta object literal for the '<em><b>Hydro Power Plants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RESERVOIR__HYDRO_POWER_PLANTS = eINSTANCE.getReservoir_HydroPowerPlants();

		/**
		 * The meta object literal for the '<em><b>Normal Min Operate Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RESERVOIR__NORMAL_MIN_OPERATE_LEVEL = eINSTANCE.getReservoir_NormalMinOperateLevel();

		/**
		 * The meta object literal for the '<em><b>Upstream From Hydro Power Plants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RESERVOIR__UPSTREAM_FROM_HYDRO_POWER_PLANTS = eINSTANCE.getReservoir_UpstreamFromHydroPowerPlants();

		/**
		 * The meta object literal for the '<em><b>Spillway Crest Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RESERVOIR__SPILLWAY_CREST_LENGTH = eINSTANCE.getReservoir_SpillwayCrestLength();

		/**
		 * The meta object literal for the '<em><b>Inflow Forecasts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RESERVOIR__INFLOW_FORECASTS = eINSTANCE.getReservoir_InflowForecasts();

		/**
		 * The meta object literal for the '<em><b>Spill Travel Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RESERVOIR__SPILL_TRAVEL_DELAY = eINSTANCE.getReservoir_SpillTravelDelay();

		/**
		 * The meta object literal for the '<em><b>Active Storage Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RESERVOIR__ACTIVE_STORAGE_CAPACITY = eINSTANCE.getReservoir_ActiveStorageCapacity();

		/**
		 * The meta object literal for the '<em><b>Spills From Reservoir</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RESERVOIR__SPILLS_FROM_RESERVOIR = eINSTANCE.getReservoir_SpillsFromReservoir();

		/**
		 * The meta object literal for the '<em><b>Spill Way Gate Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RESERVOIR__SPILL_WAY_GATE_TYPE = eINSTANCE.getReservoir_SpillWayGateType();

		/**
		 * The meta object literal for the '<em><b>Spills Into Reservoirs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RESERVOIR__SPILLS_INTO_RESERVOIRS = eINSTANCE.getReservoir_SpillsIntoReservoirs();

		/**
		 * The meta object literal for the '<em><b>Full Supply Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RESERVOIR__FULL_SUPPLY_LEVEL = eINSTANCE.getReservoir_FullSupplyLevel();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.CogenerationPlant <em>Cogeneration Plant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.CogenerationPlant
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getCogenerationPlant()
		 * @generated
		 */
		public static final EClass COGENERATION_PLANT = eINSTANCE.getCogenerationPlant();

		/**
		 * The meta object literal for the '<em><b>Steam Sendout Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE = eINSTANCE.getCogenerationPlant_SteamSendoutSchedule();

		/**
		 * The meta object literal for the '<em><b>Cogen LP Steam Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COGENERATION_PLANT__COGEN_LP_STEAM_RATING = eINSTANCE.getCogenerationPlant_CogenLPSteamRating();

		/**
		 * The meta object literal for the '<em><b>Cogen LP Sendout Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COGENERATION_PLANT__COGEN_LP_SENDOUT_RATING = eINSTANCE.getCogenerationPlant_CogenLPSendoutRating();

		/**
		 * The meta object literal for the '<em><b>Thermal Generating Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COGENERATION_PLANT__THERMAL_GENERATING_UNITS = eINSTANCE.getCogenerationPlant_ThermalGeneratingUnits();

		/**
		 * The meta object literal for the '<em><b>Rated P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COGENERATION_PLANT__RATED_P = eINSTANCE.getCogenerationPlant_RatedP();

		/**
		 * The meta object literal for the '<em><b>Cogen HP Sendout Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COGENERATION_PLANT__COGEN_HP_SENDOUT_RATING = eINSTANCE.getCogenerationPlant_CogenHPSendoutRating();

		/**
		 * The meta object literal for the '<em><b>Cogen HP Steam Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COGENERATION_PLANT__COGEN_HP_STEAM_RATING = eINSTANCE.getCogenerationPlant_CogenHPSteamRating();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.GenUnitOpSchedule <em>Gen Unit Op Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.GenUnitOpSchedule
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getGenUnitOpSchedule()
		 * @generated
		 */
		public static final EClass GEN_UNIT_OP_SCHEDULE = eINSTANCE.getGenUnitOpSchedule();

		/**
		 * The meta object literal for the '<em><b>Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GEN_UNIT_OP_SCHEDULE__GENERATING_UNIT = eINSTANCE.getGenUnitOpSchedule_GeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.FuelAllocationSchedule <em>Fuel Allocation Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.FuelAllocationSchedule
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getFuelAllocationSchedule()
		 * @generated
		 */
		public static final EClass FUEL_ALLOCATION_SCHEDULE = eINSTANCE.getFuelAllocationSchedule();

		/**
		 * The meta object literal for the '<em><b>Min Fuel Allocation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FUEL_ALLOCATION_SCHEDULE__MIN_FUEL_ALLOCATION = eINSTANCE.getFuelAllocationSchedule_MinFuelAllocation();

		/**
		 * The meta object literal for the '<em><b>Fuel Allocation End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_END_DATE = eINSTANCE.getFuelAllocationSchedule_FuelAllocationEndDate();

		/**
		 * The meta object literal for the '<em><b>Max Fuel Allocation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FUEL_ALLOCATION_SCHEDULE__MAX_FUEL_ALLOCATION = eINSTANCE.getFuelAllocationSchedule_MaxFuelAllocation();

		/**
		 * The meta object literal for the '<em><b>Fuel Allocation Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_START_DATE = eINSTANCE.getFuelAllocationSchedule_FuelAllocationStartDate();

		/**
		 * The meta object literal for the '<em><b>Fossil Fuel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference FUEL_ALLOCATION_SCHEDULE__FOSSIL_FUEL = eINSTANCE.getFuelAllocationSchedule_FossilFuel();

		/**
		 * The meta object literal for the '<em><b>Fuel Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FUEL_ALLOCATION_SCHEDULE__FUEL_TYPE = eINSTANCE.getFuelAllocationSchedule_FuelType();

		/**
		 * The meta object literal for the '<em><b>Thermal Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference FUEL_ALLOCATION_SCHEDULE__THERMAL_GENERATING_UNIT = eINSTANCE.getFuelAllocationSchedule_ThermalGeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.GrossToNetActivePowerCurve <em>Gross To Net Active Power Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.GrossToNetActivePowerCurve
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getGrossToNetActivePowerCurve()
		 * @generated
		 */
		public static final EClass GROSS_TO_NET_ACTIVE_POWER_CURVE = eINSTANCE.getGrossToNetActivePowerCurve();

		/**
		 * The meta object literal for the '<em><b>Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GROSS_TO_NET_ACTIVE_POWER_CURVE__GENERATING_UNIT = eINSTANCE.getGrossToNetActivePowerCurve_GeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.LevelVsVolumeCurve <em>Level Vs Volume Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.LevelVsVolumeCurve
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getLevelVsVolumeCurve()
		 * @generated
		 */
		public static final EClass LEVEL_VS_VOLUME_CURVE = eINSTANCE.getLevelVsVolumeCurve();

		/**
		 * The meta object literal for the '<em><b>Reservoir</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LEVEL_VS_VOLUME_CURVE__RESERVOIR = eINSTANCE.getLevelVsVolumeCurve_Reservoir();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.StartRampCurve <em>Start Ramp Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.StartRampCurve
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getStartRampCurve()
		 * @generated
		 */
		public static final EClass START_RAMP_CURVE = eINSTANCE.getStartRampCurve();

		/**
		 * The meta object literal for the '<em><b>Hot Standby Ramp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute START_RAMP_CURVE__HOT_STANDBY_RAMP = eINSTANCE.getStartRampCurve_HotStandbyRamp();

		/**
		 * The meta object literal for the '<em><b>Startup Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference START_RAMP_CURVE__STARTUP_MODEL = eINSTANCE.getStartRampCurve_StartupModel();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.NuclearGeneratingUnit <em>Nuclear Generating Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.NuclearGeneratingUnit
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getNuclearGeneratingUnit()
		 * @generated
		 */
		public static final EClass NUCLEAR_GENERATING_UNIT = eINSTANCE.getNuclearGeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.EmissionCurve <em>Emission Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.EmissionCurve
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getEmissionCurve()
		 * @generated
		 */
		public static final EClass EMISSION_CURVE = eINSTANCE.getEmissionCurve();

		/**
		 * The meta object literal for the '<em><b>Emission Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EMISSION_CURVE__EMISSION_CONTENT = eINSTANCE.getEmissionCurve_EmissionContent();

		/**
		 * The meta object literal for the '<em><b>Thermal Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EMISSION_CURVE__THERMAL_GENERATING_UNIT = eINSTANCE.getEmissionCurve_ThermalGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Is Net Gross P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EMISSION_CURVE__IS_NET_GROSS_P = eINSTANCE.getEmissionCurve_IsNetGrossP();

		/**
		 * The meta object literal for the '<em><b>Emission Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EMISSION_CURVE__EMISSION_TYPE = eINSTANCE.getEmissionCurve_EmissionType();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.HydroPumpOpSchedule <em>Hydro Pump Op Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.HydroPumpOpSchedule
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getHydroPumpOpSchedule()
		 * @generated
		 */
		public static final EClass HYDRO_PUMP_OP_SCHEDULE = eINSTANCE.getHydroPumpOpSchedule();

		/**
		 * The meta object literal for the '<em><b>Hydro Pump</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP = eINSTANCE.getHydroPumpOpSchedule_HydroPump();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.SteamSendoutSchedule <em>Steam Sendout Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.SteamSendoutSchedule
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getSteamSendoutSchedule()
		 * @generated
		 */
		public static final EClass STEAM_SENDOUT_SCHEDULE = eINSTANCE.getSteamSendoutSchedule();

		/**
		 * The meta object literal for the '<em><b>Cogeneration Plant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT = eINSTANCE.getSteamSendoutSchedule_CogenerationPlant();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.TargetLevelSchedule <em>Target Level Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.TargetLevelSchedule
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getTargetLevelSchedule()
		 * @generated
		 */
		public static final EClass TARGET_LEVEL_SCHEDULE = eINSTANCE.getTargetLevelSchedule();

		/**
		 * The meta object literal for the '<em><b>Low Level Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TARGET_LEVEL_SCHEDULE__LOW_LEVEL_LIMIT = eINSTANCE.getTargetLevelSchedule_LowLevelLimit();

		/**
		 * The meta object literal for the '<em><b>Reservoir</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TARGET_LEVEL_SCHEDULE__RESERVOIR = eINSTANCE.getTargetLevelSchedule_Reservoir();

		/**
		 * The meta object literal for the '<em><b>High Level Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TARGET_LEVEL_SCHEDULE__HIGH_LEVEL_LIMIT = eINSTANCE.getTargetLevelSchedule_HighLevelLimit();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.CombinedCyclePlant <em>Combined Cycle Plant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.CombinedCyclePlant
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getCombinedCyclePlant()
		 * @generated
		 */
		public static final EClass COMBINED_CYCLE_PLANT = eINSTANCE.getCombinedCyclePlant();

		/**
		 * The meta object literal for the '<em><b>Comb Cycle Plant Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COMBINED_CYCLE_PLANT__COMB_CYCLE_PLANT_RATING = eINSTANCE.getCombinedCyclePlant_CombCyclePlantRating();

		/**
		 * The meta object literal for the '<em><b>Thermal Generating Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS = eINSTANCE.getCombinedCyclePlant_ThermalGeneratingUnits();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.HeatRateCurve <em>Heat Rate Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.HeatRateCurve
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getHeatRateCurve()
		 * @generated
		 */
		public static final EClass HEAT_RATE_CURVE = eINSTANCE.getHeatRateCurve();

		/**
		 * The meta object literal for the '<em><b>Is Net Gross P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HEAT_RATE_CURVE__IS_NET_GROSS_P = eINSTANCE.getHeatRateCurve_IsNetGrossP();

		/**
		 * The meta object literal for the '<em><b>Thermal Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT = eINSTANCE.getHeatRateCurve_ThermalGeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit <em>Thermal Generating Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getThermalGeneratingUnit()
		 * @generated
		 */
		public static final EClass THERMAL_GENERATING_UNIT = eINSTANCE.getThermalGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>CAES Plant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference THERMAL_GENERATING_UNIT__CAES_PLANT = eINSTANCE.getThermalGeneratingUnit_CAESPlant();

		/**
		 * The meta object literal for the '<em><b>Cogeneration Plant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference THERMAL_GENERATING_UNIT__COGENERATION_PLANT = eINSTANCE.getThermalGeneratingUnit_CogenerationPlant();

		/**
		 * The meta object literal for the '<em><b>Shutdown Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference THERMAL_GENERATING_UNIT__SHUTDOWN_CURVE = eINSTANCE.getThermalGeneratingUnit_ShutdownCurve();

		/**
		 * The meta object literal for the '<em><b>Fossil Fuels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference THERMAL_GENERATING_UNIT__FOSSIL_FUELS = eINSTANCE.getThermalGeneratingUnit_FossilFuels();

		/**
		 * The meta object literal for the '<em><b>Heat Rate Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference THERMAL_GENERATING_UNIT__HEAT_RATE_CURVE = eINSTANCE.getThermalGeneratingUnit_HeatRateCurve();

		/**
		 * The meta object literal for the '<em><b>Fuel Allocation Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference THERMAL_GENERATING_UNIT__FUEL_ALLOCATION_SCHEDULES = eINSTANCE.getThermalGeneratingUnit_FuelAllocationSchedules();

		/**
		 * The meta object literal for the '<em><b>Emission Curves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference THERMAL_GENERATING_UNIT__EMISSION_CURVES = eINSTANCE.getThermalGeneratingUnit_EmissionCurves();

		/**
		 * The meta object literal for the '<em><b>Heat Input Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference THERMAL_GENERATING_UNIT__HEAT_INPUT_CURVE = eINSTANCE.getThermalGeneratingUnit_HeatInputCurve();

		/**
		 * The meta object literal for the '<em><b>Combined Cycle Plant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference THERMAL_GENERATING_UNIT__COMBINED_CYCLE_PLANT = eINSTANCE.getThermalGeneratingUnit_CombinedCyclePlant();

		/**
		 * The meta object literal for the '<em><b>Incremental Heat Rate Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference THERMAL_GENERATING_UNIT__INCREMENTAL_HEAT_RATE_CURVE = eINSTANCE.getThermalGeneratingUnit_IncrementalHeatRateCurve();

		/**
		 * The meta object literal for the '<em><b>Startup Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference THERMAL_GENERATING_UNIT__STARTUP_MODEL = eINSTANCE.getThermalGeneratingUnit_StartupModel();

		/**
		 * The meta object literal for the '<em><b>Emmission Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference THERMAL_GENERATING_UNIT__EMMISSION_ACCOUNTS = eINSTANCE.getThermalGeneratingUnit_EmmissionAccounts();

		/**
		 * The meta object literal for the '<em><b>OM Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute THERMAL_GENERATING_UNIT__OM_COST = eINSTANCE.getThermalGeneratingUnit_OMCost();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.EmissionAccount <em>Emission Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.EmissionAccount
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getEmissionAccount()
		 * @generated
		 */
		public static final EClass EMISSION_ACCOUNT = eINSTANCE.getEmissionAccount();

		/**
		 * The meta object literal for the '<em><b>Emission Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EMISSION_ACCOUNT__EMISSION_TYPE = eINSTANCE.getEmissionAccount_EmissionType();

		/**
		 * The meta object literal for the '<em><b>Emission Value Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EMISSION_ACCOUNT__EMISSION_VALUE_SOURCE = eINSTANCE.getEmissionAccount_EmissionValueSource();

		/**
		 * The meta object literal for the '<em><b>Thermal Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EMISSION_ACCOUNT__THERMAL_GENERATING_UNIT = eINSTANCE.getEmissionAccount_ThermalGeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.PenstockLossCurve <em>Penstock Loss Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.PenstockLossCurve
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getPenstockLossCurve()
		 * @generated
		 */
		public static final EClass PENSTOCK_LOSS_CURVE = eINSTANCE.getPenstockLossCurve();

		/**
		 * The meta object literal for the '<em><b>Hydro Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PENSTOCK_LOSS_CURVE__HYDRO_GENERATING_UNIT = eINSTANCE.getPenstockLossCurve_HydroGeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.StartupModel <em>Startup Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.StartupModel
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getStartupModel()
		 * @generated
		 */
		public static final EClass STARTUP_MODEL = eINSTANCE.getStartupModel();

		/**
		 * The meta object literal for the '<em><b>Startup Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STARTUP_MODEL__STARTUP_COST = eINSTANCE.getStartupModel_StartupCost();

		/**
		 * The meta object literal for the '<em><b>Stby Aux P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STARTUP_MODEL__STBY_AUX_P = eINSTANCE.getStartupModel_StbyAuxP();

		/**
		 * The meta object literal for the '<em><b>Start Ramp Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STARTUP_MODEL__START_RAMP_CURVE = eINSTANCE.getStartupModel_StartRampCurve();

		/**
		 * The meta object literal for the '<em><b>Minimum Run Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STARTUP_MODEL__MINIMUM_RUN_TIME = eINSTANCE.getStartupModel_MinimumRunTime();

		/**
		 * The meta object literal for the '<em><b>Start Main Fuel Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STARTUP_MODEL__START_MAIN_FUEL_CURVE = eINSTANCE.getStartupModel_StartMainFuelCurve();

		/**
		 * The meta object literal for the '<em><b>Risk Factor Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STARTUP_MODEL__RISK_FACTOR_COST = eINSTANCE.getStartupModel_RiskFactorCost();

		/**
		 * The meta object literal for the '<em><b>Minimum Down Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STARTUP_MODEL__MINIMUM_DOWN_TIME = eINSTANCE.getStartupModel_MinimumDownTime();

		/**
		 * The meta object literal for the '<em><b>Fixed Maint Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STARTUP_MODEL__FIXED_MAINT_COST = eINSTANCE.getStartupModel_FixedMaintCost();

		/**
		 * The meta object literal for the '<em><b>Startup Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STARTUP_MODEL__STARTUP_DATE = eINSTANCE.getStartupModel_StartupDate();

		/**
		 * The meta object literal for the '<em><b>Start Ign Fuel Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STARTUP_MODEL__START_IGN_FUEL_CURVE = eINSTANCE.getStartupModel_StartIgnFuelCurve();

		/**
		 * The meta object literal for the '<em><b>Hot Standby Heat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STARTUP_MODEL__HOT_STANDBY_HEAT = eINSTANCE.getStartupModel_HotStandbyHeat();

		/**
		 * The meta object literal for the '<em><b>Startup Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STARTUP_MODEL__STARTUP_PRIORITY = eINSTANCE.getStartupModel_StartupPriority();

		/**
		 * The meta object literal for the '<em><b>Incremental Maint Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STARTUP_MODEL__INCREMENTAL_MAINT_COST = eINSTANCE.getStartupModel_IncrementalMaintCost();

		/**
		 * The meta object literal for the '<em><b>Thermal Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STARTUP_MODEL__THERMAL_GENERATING_UNIT = eINSTANCE.getStartupModel_ThermalGeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingUnit <em>Hydro Generating Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.HydroGeneratingUnit
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getHydroGeneratingUnit()
		 * @generated
		 */
		public static final EClass HYDRO_GENERATING_UNIT = eINSTANCE.getHydroGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Energy Conversion Capability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HYDRO_GENERATING_UNIT__ENERGY_CONVERSION_CAPABILITY = eINSTANCE.getHydroGeneratingUnit_EnergyConversionCapability();

		/**
		 * The meta object literal for the '<em><b>Penstock Loss Curve</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HYDRO_GENERATING_UNIT__PENSTOCK_LOSS_CURVE = eINSTANCE.getHydroGeneratingUnit_PenstockLossCurve();

		/**
		 * The meta object literal for the '<em><b>Hydro Power Plant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HYDRO_GENERATING_UNIT__HYDRO_POWER_PLANT = eINSTANCE.getHydroGeneratingUnit_HydroPowerPlant();

		/**
		 * The meta object literal for the '<em><b>Hydro Unit Water Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HYDRO_GENERATING_UNIT__HYDRO_UNIT_WATER_COST = eINSTANCE.getHydroGeneratingUnit_HydroUnitWaterCost();

		/**
		 * The meta object literal for the '<em><b>Tailbay Loss Curve</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HYDRO_GENERATING_UNIT__TAILBAY_LOSS_CURVE = eINSTANCE.getHydroGeneratingUnit_TailbayLossCurve();

		/**
		 * The meta object literal for the '<em><b>Hydro Generating Efficiency Curves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES = eINSTANCE.getHydroGeneratingUnit_HydroGeneratingEfficiencyCurves();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.GenUnitOpCostCurve <em>Gen Unit Op Cost Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.GenUnitOpCostCurve
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getGenUnitOpCostCurve()
		 * @generated
		 */
		public static final EClass GEN_UNIT_OP_COST_CURVE = eINSTANCE.getGenUnitOpCostCurve();

		/**
		 * The meta object literal for the '<em><b>Is Net Gross P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GEN_UNIT_OP_COST_CURVE__IS_NET_GROSS_P = eINSTANCE.getGenUnitOpCostCurve_IsNetGrossP();

		/**
		 * The meta object literal for the '<em><b>Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT = eINSTANCE.getGenUnitOpCostCurve_GeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.IncrementalHeatRateCurve <em>Incremental Heat Rate Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.IncrementalHeatRateCurve
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getIncrementalHeatRateCurve()
		 * @generated
		 */
		public static final EClass INCREMENTAL_HEAT_RATE_CURVE = eINSTANCE.getIncrementalHeatRateCurve();

		/**
		 * The meta object literal for the '<em><b>Thermal Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference INCREMENTAL_HEAT_RATE_CURVE__THERMAL_GENERATING_UNIT = eINSTANCE.getIncrementalHeatRateCurve_ThermalGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Is Net Gross P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute INCREMENTAL_HEAT_RATE_CURVE__IS_NET_GROSS_P = eINSTANCE.getIncrementalHeatRateCurve_IsNetGrossP();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.FossilFuel <em>Fossil Fuel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.FossilFuel
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getFossilFuel()
		 * @generated
		 */
		public static final EClass FOSSIL_FUEL = eINSTANCE.getFossilFuel();

		/**
		 * The meta object literal for the '<em><b>Fuel Sulfur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FOSSIL_FUEL__FUEL_SULFUR = eINSTANCE.getFossilFuel_FuelSulfur();

		/**
		 * The meta object literal for the '<em><b>Fuel Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FOSSIL_FUEL__FUEL_COST = eINSTANCE.getFossilFuel_FuelCost();

		/**
		 * The meta object literal for the '<em><b>Fossil Fuel Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FOSSIL_FUEL__FOSSIL_FUEL_TYPE = eINSTANCE.getFossilFuel_FossilFuelType();

		/**
		 * The meta object literal for the '<em><b>Low Breakpoint P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FOSSIL_FUEL__LOW_BREAKPOINT_P = eINSTANCE.getFossilFuel_LowBreakpointP();

		/**
		 * The meta object literal for the '<em><b>Fuel Dispatch Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FOSSIL_FUEL__FUEL_DISPATCH_COST = eINSTANCE.getFossilFuel_FuelDispatchCost();

		/**
		 * The meta object literal for the '<em><b>Fuel Handling Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FOSSIL_FUEL__FUEL_HANDLING_COST = eINSTANCE.getFossilFuel_FuelHandlingCost();

		/**
		 * The meta object literal for the '<em><b>Thermal Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference FOSSIL_FUEL__THERMAL_GENERATING_UNIT = eINSTANCE.getFossilFuel_ThermalGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Fuel Heat Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FOSSIL_FUEL__FUEL_HEAT_CONTENT = eINSTANCE.getFossilFuel_FuelHeatContent();

		/**
		 * The meta object literal for the '<em><b>Fuel Eff Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FOSSIL_FUEL__FUEL_EFF_FACTOR = eINSTANCE.getFossilFuel_FuelEffFactor();

		/**
		 * The meta object literal for the '<em><b>Fuel Mixture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FOSSIL_FUEL__FUEL_MIXTURE = eINSTANCE.getFossilFuel_FuelMixture();

		/**
		 * The meta object literal for the '<em><b>Fuel Allocation Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES = eINSTANCE.getFossilFuel_FuelAllocationSchedules();

		/**
		 * The meta object literal for the '<em><b>High Breakpoint P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FOSSIL_FUEL__HIGH_BREAKPOINT_P = eINSTANCE.getFossilFuel_HighBreakpointP();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit <em>Generating Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getGeneratingUnit()
		 * @generated
		 */
		public static final EClass GENERATING_UNIT = eINSTANCE.getGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Rated Gross Min P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__RATED_GROSS_MIN_P = eINSTANCE.getGeneratingUnit_RatedGrossMinP();

		/**
		 * The meta object literal for the '<em><b>Efficiency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__EFFICIENCY = eINSTANCE.getGeneratingUnit_Efficiency();

		/**
		 * The meta object literal for the '<em><b>Step Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__STEP_CHANGE = eINSTANCE.getGeneratingUnit_StepChange();

		/**
		 * The meta object literal for the '<em><b>Rated Net Max P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__RATED_NET_MAX_P = eINSTANCE.getGeneratingUnit_RatedNetMaxP();

		/**
		 * The meta object literal for the '<em><b>Tie Line PF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__TIE_LINE_PF = eINSTANCE.getGeneratingUnit_TieLinePF();

		/**
		 * The meta object literal for the '<em><b>Disp Reserve Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__DISP_RESERVE_FLAG = eINSTANCE.getGeneratingUnit_DispReserveFlag();

		/**
		 * The meta object literal for the '<em><b>Control Pulse High</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__CONTROL_PULSE_HIGH = eINSTANCE.getGeneratingUnit_ControlPulseHigh();

		/**
		 * The meta object literal for the '<em><b>Startup Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__STARTUP_TIME = eINSTANCE.getGeneratingUnit_StartupTime();

		/**
		 * The meta object literal for the '<em><b>Max Operating P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__MAX_OPERATING_P = eINSTANCE.getGeneratingUnit_MaxOperatingP();

		/**
		 * The meta object literal for the '<em><b>Gen Control Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__GEN_CONTROL_SOURCE = eINSTANCE.getGeneratingUnit_GenControlSource();

		/**
		 * The meta object literal for the '<em><b>Normal PF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__NORMAL_PF = eINSTANCE.getGeneratingUnit_NormalPF();

		/**
		 * The meta object literal for the '<em><b>Initial P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__INITIAL_P = eINSTANCE.getGeneratingUnit_InitialP();

		/**
		 * The meta object literal for the '<em><b>Spin Reserve Ramp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__SPIN_RESERVE_RAMP = eINSTANCE.getGeneratingUnit_SpinReserveRamp();

		/**
		 * The meta object literal for the '<em><b>Alloc Spin Res P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__ALLOC_SPIN_RES_P = eINSTANCE.getGeneratingUnit_AllocSpinResP();

		/**
		 * The meta object literal for the '<em><b>Min Economic P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__MIN_ECONOMIC_P = eINSTANCE.getGeneratingUnit_MinEconomicP();

		/**
		 * The meta object literal for the '<em><b>Long PF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__LONG_PF = eINSTANCE.getGeneratingUnit_LongPF();

		/**
		 * The meta object literal for the '<em><b>Nominal P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__NOMINAL_P = eINSTANCE.getGeneratingUnit_NominalP();

		/**
		 * The meta object literal for the '<em><b>Control Response Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__CONTROL_RESPONSE_RATE = eINSTANCE.getGeneratingUnit_ControlResponseRate();

		/**
		 * The meta object literal for the '<em><b>Control Area Generating Unit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT = eINSTANCE.getGeneratingUnit_ControlAreaGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Synchronous Machines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GENERATING_UNIT__SYNCHRONOUS_MACHINES = eINSTANCE.getGeneratingUnit_SynchronousMachines();

		/**
		 * The meta object literal for the '<em><b>Rated Gross Max P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__RATED_GROSS_MAX_P = eINSTANCE.getGeneratingUnit_RatedGrossMaxP();

		/**
		 * The meta object literal for the '<em><b>Penalty Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__PENALTY_FACTOR = eINSTANCE.getGeneratingUnit_PenaltyFactor();

		/**
		 * The meta object literal for the '<em><b>Fast Start Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__FAST_START_FLAG = eINSTANCE.getGeneratingUnit_FastStartFlag();

		/**
		 * The meta object literal for the '<em><b>Minimum Off Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__MINIMUM_OFF_TIME = eINSTANCE.getGeneratingUnit_MinimumOffTime();

		/**
		 * The meta object literal for the '<em><b>Short PF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__SHORT_PF = eINSTANCE.getGeneratingUnit_ShortPF();

		/**
		 * The meta object literal for the '<em><b>Governor MPL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__GOVERNOR_MPL = eINSTANCE.getGeneratingUnit_GovernorMPL();

		/**
		 * The meta object literal for the '<em><b>Energy Min P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__ENERGY_MIN_P = eINSTANCE.getGeneratingUnit_EnergyMinP();

		/**
		 * The meta object literal for the '<em><b>Fuel Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__FUEL_PRIORITY = eINSTANCE.getGeneratingUnit_FuelPriority();

		/**
		 * The meta object literal for the '<em><b>Max Economic P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__MAX_ECONOMIC_P = eINSTANCE.getGeneratingUnit_MaxEconomicP();

		/**
		 * The meta object literal for the '<em><b>Auto Cntrl Margin P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__AUTO_CNTRL_MARGIN_P = eINSTANCE.getGeneratingUnit_AutoCntrlMarginP();

		/**
		 * The meta object literal for the '<em><b>High Control Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__HIGH_CONTROL_LIMIT = eINSTANCE.getGeneratingUnit_HighControlLimit();

		/**
		 * The meta object literal for the '<em><b>Model Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__MODEL_DETAIL = eINSTANCE.getGeneratingUnit_ModelDetail();

		/**
		 * The meta object literal for the '<em><b>Control Pulse Low</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__CONTROL_PULSE_LOW = eINSTANCE.getGeneratingUnit_ControlPulseLow();

		/**
		 * The meta object literal for the '<em><b>Raise Ramp Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__RAISE_RAMP_RATE = eINSTANCE.getGeneratingUnit_RaiseRampRate();

		/**
		 * The meta object literal for the '<em><b>Gen Unit Op Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE = eINSTANCE.getGeneratingUnit_GenUnitOpSchedule();

		/**
		 * The meta object literal for the '<em><b>Control Deadband</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__CONTROL_DEADBAND = eINSTANCE.getGeneratingUnit_ControlDeadband();

		/**
		 * The meta object literal for the '<em><b>Base P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__BASE_P = eINSTANCE.getGeneratingUnit_BaseP();

		/**
		 * The meta object literal for the '<em><b>Startup Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__STARTUP_COST = eINSTANCE.getGeneratingUnit_StartupCost();

		/**
		 * The meta object literal for the '<em><b>Variable Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__VARIABLE_COST = eINSTANCE.getGeneratingUnit_VariableCost();

		/**
		 * The meta object literal for the '<em><b>Gen Operating Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__GEN_OPERATING_MODE = eINSTANCE.getGeneratingUnit_GenOperatingMode();

		/**
		 * The meta object literal for the '<em><b>Lower Ramp Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__LOWER_RAMP_RATE = eINSTANCE.getGeneratingUnit_LowerRampRate();

		/**
		 * The meta object literal for the '<em><b>Min Operating P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__MIN_OPERATING_P = eINSTANCE.getGeneratingUnit_MinOperatingP();

		/**
		 * The meta object literal for the '<em><b>Low Control Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__LOW_CONTROL_LIMIT = eINSTANCE.getGeneratingUnit_LowControlLimit();

		/**
		 * The meta object literal for the '<em><b>Gross To Net Active Power Curves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES = eINSTANCE.getGeneratingUnit_GrossToNetActivePowerCurves();

		/**
		 * The meta object literal for the '<em><b>Maximum Allowable Spinning Reserve</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE = eINSTANCE.getGeneratingUnit_MaximumAllowableSpinningReserve();

		/**
		 * The meta object literal for the '<em><b>Gen Control Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__GEN_CONTROL_MODE = eINSTANCE.getGeneratingUnit_GenControlMode();

		/**
		 * The meta object literal for the '<em><b>Gen Unit Op Cost Curves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES = eINSTANCE.getGeneratingUnit_GenUnitOpCostCurves();

		/**
		 * The meta object literal for the '<em><b>Governor SCD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATING_UNIT__GOVERNOR_SCD = eINSTANCE.getGeneratingUnit_GovernorSCD();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.StartIgnFuelCurve <em>Start Ign Fuel Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.StartIgnFuelCurve
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getStartIgnFuelCurve()
		 * @generated
		 */
		public static final EClass START_IGN_FUEL_CURVE = eINSTANCE.getStartIgnFuelCurve();

		/**
		 * The meta object literal for the '<em><b>Startup Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference START_IGN_FUEL_CURVE__STARTUP_MODEL = eINSTANCE.getStartIgnFuelCurve_StartupModel();

		/**
		 * The meta object literal for the '<em><b>Ignition Fuel Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute START_IGN_FUEL_CURVE__IGNITION_FUEL_TYPE = eINSTANCE.getStartIgnFuelCurve_IgnitionFuelType();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.StartMainFuelCurve <em>Start Main Fuel Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.StartMainFuelCurve
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getStartMainFuelCurve()
		 * @generated
		 */
		public static final EClass START_MAIN_FUEL_CURVE = eINSTANCE.getStartMainFuelCurve();

		/**
		 * The meta object literal for the '<em><b>Main Fuel Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute START_MAIN_FUEL_CURVE__MAIN_FUEL_TYPE = eINSTANCE.getStartMainFuelCurve_MainFuelType();

		/**
		 * The meta object literal for the '<em><b>Startup Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference START_MAIN_FUEL_CURVE__STARTUP_MODEL = eINSTANCE.getStartMainFuelCurve_StartupModel();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.TailbayLossCurve <em>Tailbay Loss Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.TailbayLossCurve
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getTailbayLossCurve()
		 * @generated
		 */
		public static final EClass TAILBAY_LOSS_CURVE = eINSTANCE.getTailbayLossCurve();

		/**
		 * The meta object literal for the '<em><b>Hydro Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TAILBAY_LOSS_CURVE__HYDRO_GENERATING_UNIT = eINSTANCE.getTailbayLossCurve_HydroGeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.HydroPump <em>Hydro Pump</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.HydroPump
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getHydroPump()
		 * @generated
		 */
		public static final EClass HYDRO_PUMP = eINSTANCE.getHydroPump();

		/**
		 * The meta object literal for the '<em><b>Pump Disch At Max Head</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HYDRO_PUMP__PUMP_DISCH_AT_MAX_HEAD = eINSTANCE.getHydroPump_PumpDischAtMaxHead();

		/**
		 * The meta object literal for the '<em><b>Hydro Power Plant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HYDRO_PUMP__HYDRO_POWER_PLANT = eINSTANCE.getHydroPump_HydroPowerPlant();

		/**
		 * The meta object literal for the '<em><b>Pump Disch At Min Head</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HYDRO_PUMP__PUMP_DISCH_AT_MIN_HEAD = eINSTANCE.getHydroPump_PumpDischAtMinHead();

		/**
		 * The meta object literal for the '<em><b>Pump Power At Min Head</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HYDRO_PUMP__PUMP_POWER_AT_MIN_HEAD = eINSTANCE.getHydroPump_PumpPowerAtMinHead();

		/**
		 * The meta object literal for the '<em><b>Hydro Pump Op Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE = eINSTANCE.getHydroPump_HydroPumpOpSchedule();

		/**
		 * The meta object literal for the '<em><b>Pump Power At Max Head</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HYDRO_PUMP__PUMP_POWER_AT_MAX_HEAD = eINSTANCE.getHydroPump_PumpPowerAtMaxHead();

		/**
		 * The meta object literal for the '<em><b>Synchronous Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HYDRO_PUMP__SYNCHRONOUS_MACHINE = eINSTANCE.getHydroPump_SynchronousMachine();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.InflowForecast <em>Inflow Forecast</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.InflowForecast
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getInflowForecast()
		 * @generated
		 */
		public static final EClass INFLOW_FORECAST = eINSTANCE.getInflowForecast();

		/**
		 * The meta object literal for the '<em><b>Reservoir</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference INFLOW_FORECAST__RESERVOIR = eINSTANCE.getInflowForecast_Reservoir();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.HydroGeneratingEfficiencyCurve <em>Hydro Generating Efficiency Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.HydroGeneratingEfficiencyCurve
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getHydroGeneratingEfficiencyCurve()
		 * @generated
		 */
		public static final EClass HYDRO_GENERATING_EFFICIENCY_CURVE = eINSTANCE.getHydroGeneratingEfficiencyCurve();

		/**
		 * The meta object literal for the '<em><b>Hydro Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT = eINSTANCE.getHydroGeneratingEfficiencyCurve_HydroGeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.ShutdownCurve <em>Shutdown Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.ShutdownCurve
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getShutdownCurve()
		 * @generated
		 */
		public static final EClass SHUTDOWN_CURVE = eINSTANCE.getShutdownCurve();

		/**
		 * The meta object literal for the '<em><b>Shutdown Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHUTDOWN_CURVE__SHUTDOWN_DATE = eINSTANCE.getShutdownCurve_ShutdownDate();

		/**
		 * The meta object literal for the '<em><b>Shutdown Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHUTDOWN_CURVE__SHUTDOWN_COST = eINSTANCE.getShutdownCurve_ShutdownCost();

		/**
		 * The meta object literal for the '<em><b>Thermal Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SHUTDOWN_CURVE__THERMAL_GENERATING_UNIT = eINSTANCE.getShutdownCurve_ThermalGeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant <em>Hydro Power Plant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.HydroPowerPlant
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getHydroPowerPlant()
		 * @generated
		 */
		public static final EClass HYDRO_POWER_PLANT = eINSTANCE.getHydroPowerPlant();

		/**
		 * The meta object literal for the '<em><b>Penstock Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HYDRO_POWER_PLANT__PENSTOCK_TYPE = eINSTANCE.getHydroPowerPlant_PenstockType();

		/**
		 * The meta object literal for the '<em><b>Pump Rated P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HYDRO_POWER_PLANT__PUMP_RATED_P = eINSTANCE.getHydroPowerPlant_PumpRatedP();

		/**
		 * The meta object literal for the '<em><b>Hydro Plant Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HYDRO_POWER_PLANT__HYDRO_PLANT_TYPE = eINSTANCE.getHydroPowerPlant_HydroPlantType();

		/**
		 * The meta object literal for the '<em><b>Surge Tank Crest Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HYDRO_POWER_PLANT__SURGE_TANK_CREST_LEVEL = eINSTANCE.getHydroPowerPlant_SurgeTankCrestLevel();

		/**
		 * The meta object literal for the '<em><b>Hydro Generating Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HYDRO_POWER_PLANT__HYDRO_GENERATING_UNITS = eINSTANCE.getHydroPowerPlant_HydroGeneratingUnits();

		/**
		 * The meta object literal for the '<em><b>Gen Source Pump Discharge Reservoir</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HYDRO_POWER_PLANT__GEN_SOURCE_PUMP_DISCHARGE_RESERVOIR = eINSTANCE.getHydroPowerPlant_GenSourcePumpDischargeReservoir();

		/**
		 * The meta object literal for the '<em><b>Discharge Travel Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HYDRO_POWER_PLANT__DISCHARGE_TRAVEL_DELAY = eINSTANCE.getHydroPowerPlant_DischargeTravelDelay();

		/**
		 * The meta object literal for the '<em><b>Reservoir</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HYDRO_POWER_PLANT__RESERVOIR = eINSTANCE.getHydroPowerPlant_Reservoir();

		/**
		 * The meta object literal for the '<em><b>Plant Discharge Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HYDRO_POWER_PLANT__PLANT_DISCHARGE_CAPACITY = eINSTANCE.getHydroPowerPlant_PlantDischargeCapacity();

		/**
		 * The meta object literal for the '<em><b>Hydro Pumps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HYDRO_POWER_PLANT__HYDRO_PUMPS = eINSTANCE.getHydroPowerPlant_HydroPumps();

		/**
		 * The meta object literal for the '<em><b>Plant Rated Head</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HYDRO_POWER_PLANT__PLANT_RATED_HEAD = eINSTANCE.getHydroPowerPlant_PlantRatedHead();

		/**
		 * The meta object literal for the '<em><b>Gen Rated P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HYDRO_POWER_PLANT__GEN_RATED_P = eINSTANCE.getHydroPowerPlant_GenRatedP();

		/**
		 * The meta object literal for the '<em><b>Surge Tank Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HYDRO_POWER_PLANT__SURGE_TANK_CODE = eINSTANCE.getHydroPowerPlant_SurgeTankCode();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.CAESPlant <em>CAES Plant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.CAESPlant
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getCAESPlant()
		 * @generated
		 */
		public static final EClass CAES_PLANT = eINSTANCE.getCAESPlant();

		/**
		 * The meta object literal for the '<em><b>Air Compressor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CAES_PLANT__AIR_COMPRESSOR = eINSTANCE.getCAESPlant_AirCompressor();

		/**
		 * The meta object literal for the '<em><b>Rated Capacity P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CAES_PLANT__RATED_CAPACITY_P = eINSTANCE.getCAESPlant_RatedCapacityP();

		/**
		 * The meta object literal for the '<em><b>Thermal Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CAES_PLANT__THERMAL_GENERATING_UNIT = eINSTANCE.getCAESPlant_ThermalGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Energy Storage Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CAES_PLANT__ENERGY_STORAGE_CAPACITY = eINSTANCE.getCAESPlant_EnergyStorageCapacity();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.AirCompressor <em>Air Compressor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.AirCompressor
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getAirCompressor()
		 * @generated
		 */
		public static final EClass AIR_COMPRESSOR = eINSTANCE.getAirCompressor();

		/**
		 * The meta object literal for the '<em><b>Air Compressor Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute AIR_COMPRESSOR__AIR_COMPRESSOR_RATING = eINSTANCE.getAirCompressor_AirCompressorRating();

		/**
		 * The meta object literal for the '<em><b>Combustion Turbine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AIR_COMPRESSOR__COMBUSTION_TURBINE = eINSTANCE.getAirCompressor_CombustionTurbine();

		/**
		 * The meta object literal for the '<em><b>CAES Plant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AIR_COMPRESSOR__CAES_PLANT = eINSTANCE.getAirCompressor_CAESPlant();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.HeatInputCurve <em>Heat Input Curve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.HeatInputCurve
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getHeatInputCurve()
		 * @generated
		 */
		public static final EClass HEAT_INPUT_CURVE = eINSTANCE.getHeatInputCurve();

		/**
		 * The meta object literal for the '<em><b>Is Net Gross P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HEAT_INPUT_CURVE__IS_NET_GROSS_P = eINSTANCE.getHeatInputCurve_IsNetGrossP();

		/**
		 * The meta object literal for the '<em><b>Heat Input Eff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HEAT_INPUT_CURVE__HEAT_INPUT_EFF = eINSTANCE.getHeatInputCurve_HeatInputEff();

		/**
		 * The meta object literal for the '<em><b>Heat Input Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HEAT_INPUT_CURVE__HEAT_INPUT_OFFSET = eINSTANCE.getHeatInputCurve_HeatInputOffset();

		/**
		 * The meta object literal for the '<em><b>Thermal Generating Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HEAT_INPUT_CURVE__THERMAL_GENERATING_UNIT = eINSTANCE.getHeatInputCurve_ThermalGeneratingUnit();

		/**
		 * The meta object literal for the '<em><b>Aux Power Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HEAT_INPUT_CURVE__AUX_POWER_OFFSET = eINSTANCE.getHeatInputCurve_AuxPowerOffset();

		/**
		 * The meta object literal for the '<em><b>Aux Power Mult</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HEAT_INPUT_CURVE__AUX_POWER_MULT = eINSTANCE.getHeatInputCurve_AuxPowerMult();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.WindGeneratingUnit <em>Wind Generating Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.WindGeneratingUnit
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getWindGeneratingUnit()
		 * @generated
		 */
		public static final EClass WIND_GENERATING_UNIT = eINSTANCE.getWindGeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.FuelType <em>Fuel Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.FuelType
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getFuelType()
		 * @generated
		 */
		public static final EEnum FUEL_TYPE = eINSTANCE.getFuelType();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.GeneratorOperatingMode <em>Generator Operating Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.GeneratorOperatingMode
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getGeneratorOperatingMode()
		 * @generated
		 */
		public static final EEnum GENERATOR_OPERATING_MODE = eINSTANCE.getGeneratorOperatingMode();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.GeneratorControlMode <em>Generator Control Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.GeneratorControlMode
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getGeneratorControlMode()
		 * @generated
		 */
		public static final EEnum GENERATOR_CONTROL_MODE = eINSTANCE.getGeneratorControlMode();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.HydroPlantType <em>Hydro Plant Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.HydroPlantType
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getHydroPlantType()
		 * @generated
		 */
		public static final EEnum HYDRO_PLANT_TYPE = eINSTANCE.getHydroPlantType();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.HydroEnergyConversionKind <em>Hydro Energy Conversion Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.HydroEnergyConversionKind
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getHydroEnergyConversionKind()
		 * @generated
		 */
		public static final EEnum HYDRO_ENERGY_CONVERSION_KIND = eINSTANCE.getHydroEnergyConversionKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.PenstockType <em>Penstock Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.PenstockType
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getPenstockType()
		 * @generated
		 */
		public static final EEnum PENSTOCK_TYPE = eINSTANCE.getPenstockType();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.EmissionValueSource <em>Emission Value Source</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.EmissionValueSource
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getEmissionValueSource()
		 * @generated
		 */
		public static final EEnum EMISSION_VALUE_SOURCE = eINSTANCE.getEmissionValueSource();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.GeneratorControlSource <em>Generator Control Source</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.GeneratorControlSource
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getGeneratorControlSource()
		 * @generated
		 */
		public static final EEnum GENERATOR_CONTROL_SOURCE = eINSTANCE.getGeneratorControlSource();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.SpillwayGateType <em>Spillway Gate Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.SpillwayGateType
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getSpillwayGateType()
		 * @generated
		 */
		public static final EEnum SPILLWAY_GATE_TYPE = eINSTANCE.getSpillwayGateType();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.SurgeTankCode <em>Surge Tank Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.SurgeTankCode
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getSurgeTankCode()
		 * @generated
		 */
		public static final EEnum SURGE_TANK_CODE = eINSTANCE.getSurgeTankCode();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Generation.Production.EmissionType <em>Emission Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.EmissionType
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getEmissionType()
		 * @generated
		 */
		public static final EEnum EMISSION_TYPE = eINSTANCE.getEmissionType();

		/**
		 * The meta object literal for the '<em>Classification</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getClassification()
		 * @generated
		 */
		public static final EDataType CLASSIFICATION = eINSTANCE.getClassification();

		/**
		 * The meta object literal for the '<em>Heat Rate</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getHeatRate()
		 * @generated
		 */
		public static final EDataType HEAT_RATE = eINSTANCE.getHeatRate();

		/**
		 * The meta object literal for the '<em>Cost Per Heat Unit</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getCostPerHeatUnit()
		 * @generated
		 */
		public static final EDataType COST_PER_HEAT_UNIT = eINSTANCE.getCostPerHeatUnit();

		/**
		 * The meta object literal for the '<em>Emission</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Generation.Production.ProductionPackage#getEmission()
		 * @generated
		 */
		public static final EDataType EMISSION = eINSTANCE.getEmission();

	}

} //ProductionPackage
