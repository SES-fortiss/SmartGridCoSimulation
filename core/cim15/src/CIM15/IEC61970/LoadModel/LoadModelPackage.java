/**
 */
package CIM15.IEC61970.LoadModel;

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

import CIM15.IEC61970.Generation.Production.ProductionPackage;

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
 * @see CIM15.IEC61970.LoadModel.LoadModelFactory
 * @generated
 */
public class LoadModelPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "LoadModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#LoadModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimLoadModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LoadModelPackage eINSTANCE = CIM15.IEC61970.LoadModel.LoadModelPackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.LoadModel.ConformLoad <em>Conform Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.LoadModel.ConformLoad
	 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getConformLoad()
	 * @generated
	 */
	public static final int CONFORM_LOAD = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__UUID = WiresPackage.ENERGY_CONSUMER__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__NAMES = WiresPackage.ENERGY_CONSUMER__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__DIAGRAM_OBJECTS = WiresPackage.ENERGY_CONSUMER__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__MRID = WiresPackage.ENERGY_CONSUMER__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__ALIAS_NAME = WiresPackage.ENERGY_CONSUMER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__NAME = WiresPackage.ENERGY_CONSUMER__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__MODELING_AUTHORITY_SET = WiresPackage.ENERGY_CONSUMER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__CHANGE_ITEMS = WiresPackage.ENERGY_CONSUMER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__SCHEDULE_STEPS = WiresPackage.ENERGY_CONSUMER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__SAFETY_DOCUMENTS = WiresPackage.ENERGY_CONSUMER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__OPERATING_SHARE = WiresPackage.ENERGY_CONSUMER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__DOCUMENT_ROLES = WiresPackage.ENERGY_CONSUMER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__PSR_LISTS = WiresPackage.ENERGY_CONSUMER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__MEASUREMENTS = WiresPackage.ENERGY_CONSUMER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__REPORTING_GROUP = WiresPackage.ENERGY_CONSUMER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__PSR_TYPE = WiresPackage.ENERGY_CONSUMER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__ASSETS = WiresPackage.ENERGY_CONSUMER__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__ERP_ORGANISATION_ROLES = WiresPackage.ENERGY_CONSUMER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__LOCATION = WiresPackage.ENERGY_CONSUMER__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__PSR_EVENT = WiresPackage.ENERGY_CONSUMER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__NETWORK_DATA_SETS = WiresPackage.ENERGY_CONSUMER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__OUTAGE_SCHEDULE = WiresPackage.ENERGY_CONSUMER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__CONTINGENCY_EQUIPMENT = WiresPackage.ENERGY_CONSUMER__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__CUSTOMER_AGREEMENTS = WiresPackage.ENERGY_CONSUMER__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__NORMALLY_IN_SERVICE = WiresPackage.ENERGY_CONSUMER__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__AGGREGATE = WiresPackage.ENERGY_CONSUMER__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__EQUIPMENT_CONTAINER = WiresPackage.ENERGY_CONSUMER__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__BASE_VOLTAGE = WiresPackage.ENERGY_CONSUMER__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__CLEARANCE_TAGS = WiresPackage.ENERGY_CONSUMER__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__PROTECTION_EQUIPMENTS = WiresPackage.ENERGY_CONSUMER__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__TERMINALS = WiresPackage.ENERGY_CONSUMER__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__OUTAGE_STEP_ROLES = WiresPackage.ENERGY_CONSUMER__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__SV_STATUS = WiresPackage.ENERGY_CONSUMER__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Qfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__QFIXED_PCT = WiresPackage.ENERGY_CONSUMER__QFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Service Delivery Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__SERVICE_DELIVERY_POINTS = WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS;

	/**
	 * The feature id for the '<em><b>Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__CUSTOMER_COUNT = WiresPackage.ENERGY_CONSUMER__CUSTOMER_COUNT;

	/**
	 * The feature id for the '<em><b>Pfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__PFIXED_PCT = WiresPackage.ENERGY_CONSUMER__PFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Pfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__PFIXED = WiresPackage.ENERGY_CONSUMER__PFIXED;

	/**
	 * The feature id for the '<em><b>Load Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__LOAD_RESPONSE = WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE;

	/**
	 * The feature id for the '<em><b>Qfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__QFIXED = WiresPackage.ENERGY_CONSUMER__QFIXED;

	/**
	 * The feature id for the '<em><b>Power Cut Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__POWER_CUT_ZONE = WiresPackage.ENERGY_CONSUMER__POWER_CUT_ZONE;

	/**
	 * The feature id for the '<em><b>Energy Consumer Phases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__ENERGY_CONSUMER_PHASES = WiresPackage.ENERGY_CONSUMER__ENERGY_CONSUMER_PHASES;

	/**
	 * The feature id for the '<em><b>Load Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD__LOAD_GROUP = WiresPackage.ENERGY_CONSUMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conform Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_FEATURE_COUNT = WiresPackage.ENERGY_CONSUMER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conform Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_OPERATION_COUNT = WiresPackage.ENERGY_CONSUMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.LoadModel.LoadGroup <em>Load Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.LoadModel.LoadGroup
	 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getLoadGroup()
	 * @generated
	 */
	public static final int LOAD_GROUP = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_GROUP__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_GROUP__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_GROUP__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_GROUP__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_GROUP__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_GROUP__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_GROUP__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Sub Load Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_GROUP__SUB_LOAD_AREA = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_GROUP_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_GROUP_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.LoadModel.ConformLoadGroup <em>Conform Load Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.LoadModel.ConformLoadGroup
	 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getConformLoadGroup()
	 * @generated
	 */
	public static final int CONFORM_LOAD_GROUP = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_GROUP__UUID = LOAD_GROUP__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_GROUP__NAMES = LOAD_GROUP__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_GROUP__DIAGRAM_OBJECTS = LOAD_GROUP__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_GROUP__MRID = LOAD_GROUP__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_GROUP__ALIAS_NAME = LOAD_GROUP__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_GROUP__NAME = LOAD_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_GROUP__MODELING_AUTHORITY_SET = LOAD_GROUP__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Sub Load Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_GROUP__SUB_LOAD_AREA = LOAD_GROUP__SUB_LOAD_AREA;

	/**
	 * The feature id for the '<em><b>Conform Load Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES = LOAD_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Energy Consumers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_GROUP__ENERGY_CONSUMERS = LOAD_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conform Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_GROUP_FEATURE_COUNT = LOAD_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conform Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_GROUP_OPERATION_COUNT = LOAD_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.LoadModel.SeasonDayTypeSchedule <em>Season Day Type Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.LoadModel.SeasonDayTypeSchedule
	 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getSeasonDayTypeSchedule()
	 * @generated
	 */
	public static final int SEASON_DAY_TYPE_SCHEDULE = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON_DAY_TYPE_SCHEDULE__UUID = CorePackage.REGULAR_INTERVAL_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON_DAY_TYPE_SCHEDULE__NAMES = CorePackage.REGULAR_INTERVAL_SCHEDULE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON_DAY_TYPE_SCHEDULE__DIAGRAM_OBJECTS = CorePackage.REGULAR_INTERVAL_SCHEDULE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON_DAY_TYPE_SCHEDULE__MRID = CorePackage.REGULAR_INTERVAL_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON_DAY_TYPE_SCHEDULE__ALIAS_NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON_DAY_TYPE_SCHEDULE__NAME = CorePackage.REGULAR_INTERVAL_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON_DAY_TYPE_SCHEDULE__MODELING_AUTHORITY_SET = CorePackage.REGULAR_INTERVAL_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON_DAY_TYPE_SCHEDULE__START_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON_DAY_TYPE_SCHEDULE__VALUE1_MULTIPLIER = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON_DAY_TYPE_SCHEDULE__VALUE2_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON_DAY_TYPE_SCHEDULE__VALUE1_UNIT = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON_DAY_TYPE_SCHEDULE__VALUE2_MULTIPLIER = CorePackage.REGULAR_INTERVAL_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON_DAY_TYPE_SCHEDULE__END_TIME = CorePackage.REGULAR_INTERVAL_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON_DAY_TYPE_SCHEDULE__TIME_STEP = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON_DAY_TYPE_SCHEDULE__TIME_POINTS = CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Season</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON_DAY_TYPE_SCHEDULE__SEASON = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Day Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Season Day Type Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Season Day Type Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON_DAY_TYPE_SCHEDULE_OPERATION_COUNT = CorePackage.REGULAR_INTERVAL_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.LoadModel.ConformLoadSchedule <em>Conform Load Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.LoadModel.ConformLoadSchedule
	 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getConformLoadSchedule()
	 * @generated
	 */
	public static final int CONFORM_LOAD_SCHEDULE = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_SCHEDULE__UUID = SEASON_DAY_TYPE_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_SCHEDULE__NAMES = SEASON_DAY_TYPE_SCHEDULE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_SCHEDULE__DIAGRAM_OBJECTS = SEASON_DAY_TYPE_SCHEDULE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_SCHEDULE__MRID = SEASON_DAY_TYPE_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_SCHEDULE__ALIAS_NAME = SEASON_DAY_TYPE_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_SCHEDULE__NAME = SEASON_DAY_TYPE_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_SCHEDULE__MODELING_AUTHORITY_SET = SEASON_DAY_TYPE_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_SCHEDULE__START_TIME = SEASON_DAY_TYPE_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_SCHEDULE__VALUE1_MULTIPLIER = SEASON_DAY_TYPE_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_SCHEDULE__VALUE2_UNIT = SEASON_DAY_TYPE_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_SCHEDULE__VALUE1_UNIT = SEASON_DAY_TYPE_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_SCHEDULE__VALUE2_MULTIPLIER = SEASON_DAY_TYPE_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_SCHEDULE__END_TIME = SEASON_DAY_TYPE_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_SCHEDULE__TIME_STEP = SEASON_DAY_TYPE_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_SCHEDULE__TIME_POINTS = SEASON_DAY_TYPE_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Season</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_SCHEDULE__SEASON = SEASON_DAY_TYPE_SCHEDULE__SEASON;

	/**
	 * The feature id for the '<em><b>Day Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_SCHEDULE__DAY_TYPE = SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE;

	/**
	 * The feature id for the '<em><b>Conform Load Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP = SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conform Load Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_SCHEDULE_FEATURE_COUNT = SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conform Load Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONFORM_LOAD_SCHEDULE_OPERATION_COUNT = SEASON_DAY_TYPE_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.LoadModel.EnergyArea <em>Energy Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.LoadModel.EnergyArea
	 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getEnergyArea()
	 * @generated
	 */
	public static final int ENERGY_AREA = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_AREA__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_AREA__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_AREA__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_AREA__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_AREA__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_AREA__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_AREA__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_AREA__CONTROL_AREA = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Energy Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_AREA_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Energy Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_AREA_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.LoadModel.LoadArea <em>Load Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.LoadModel.LoadArea
	 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getLoadArea()
	 * @generated
	 */
	public static final int LOAD_AREA = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_AREA__UUID = ENERGY_AREA__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_AREA__NAMES = ENERGY_AREA__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_AREA__DIAGRAM_OBJECTS = ENERGY_AREA__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_AREA__MRID = ENERGY_AREA__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_AREA__ALIAS_NAME = ENERGY_AREA__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_AREA__NAME = ENERGY_AREA__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_AREA__MODELING_AUTHORITY_SET = ENERGY_AREA__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_AREA__CONTROL_AREA = ENERGY_AREA__CONTROL_AREA;

	/**
	 * The feature id for the '<em><b>Sub Load Areas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_AREA__SUB_LOAD_AREAS = ENERGY_AREA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Load Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_AREA_FEATURE_COUNT = ENERGY_AREA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Load Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_AREA_OPERATION_COUNT = ENERGY_AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.LoadModel.PowerCutZone <em>Power Cut Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.LoadModel.PowerCutZone
	 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getPowerCutZone()
	 * @generated
	 */
	public static final int POWER_CUT_ZONE = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__UUID = CorePackage.POWER_SYSTEM_RESOURCE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__NAMES = CorePackage.POWER_SYSTEM_RESOURCE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__DIAGRAM_OBJECTS = CorePackage.POWER_SYSTEM_RESOURCE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__MRID = CorePackage.POWER_SYSTEM_RESOURCE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__ALIAS_NAME = CorePackage.POWER_SYSTEM_RESOURCE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__NAME = CorePackage.POWER_SYSTEM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__MODELING_AUTHORITY_SET = CorePackage.POWER_SYSTEM_RESOURCE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__CHANGE_ITEMS = CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__SCHEDULE_STEPS = CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__SAFETY_DOCUMENTS = CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__OPERATING_SHARE = CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__DOCUMENT_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__PSR_LISTS = CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__MEASUREMENTS = CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__REPORTING_GROUP = CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__PSR_TYPE = CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__ASSETS = CorePackage.POWER_SYSTEM_RESOURCE__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__ERP_ORGANISATION_ROLES = CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__LOCATION = CorePackage.POWER_SYSTEM_RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__PSR_EVENT = CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__NETWORK_DATA_SETS = CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__OUTAGE_SCHEDULE = CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Energy Consumers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__ENERGY_CONSUMERS = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cut Level2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__CUT_LEVEL2 = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cut Level1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE__CUT_LEVEL1 = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Power Cut Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE_FEATURE_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Power Cut Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CUT_ZONE_OPERATION_COUNT = CorePackage.POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic <em>Load Response Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.LoadModel.LoadResponseCharacteristic
	 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getLoadResponseCharacteristic()
	 * @generated
	 */
	public static final int LOAD_RESPONSE_CHARACTERISTIC = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_RESPONSE_CHARACTERISTIC__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_RESPONSE_CHARACTERISTIC__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_RESPONSE_CHARACTERISTIC__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_RESPONSE_CHARACTERISTIC__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_RESPONSE_CHARACTERISTIC__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_RESPONSE_CHARACTERISTIC__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_RESPONSE_CHARACTERISTIC__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>PFrequency Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>PConstant Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_POWER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exponent Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_RESPONSE_CHARACTERISTIC__EXPONENT_MODEL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>QFrequency Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Energy Consumer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>PVoltage Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>QConstant Impedance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_IMPEDANCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>QConstant Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_POWER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>PConstant Impedance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_IMPEDANCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>PConstant Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_CURRENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>QVoltage Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>QConstant Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_CURRENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Load Response Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_RESPONSE_CHARACTERISTIC_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Load Response Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_RESPONSE_CHARACTERISTIC_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.LoadModel.NonConformLoad <em>Non Conform Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.LoadModel.NonConformLoad
	 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getNonConformLoad()
	 * @generated
	 */
	public static final int NON_CONFORM_LOAD = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__UUID = WiresPackage.ENERGY_CONSUMER__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__NAMES = WiresPackage.ENERGY_CONSUMER__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__DIAGRAM_OBJECTS = WiresPackage.ENERGY_CONSUMER__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__MRID = WiresPackage.ENERGY_CONSUMER__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__ALIAS_NAME = WiresPackage.ENERGY_CONSUMER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__NAME = WiresPackage.ENERGY_CONSUMER__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__MODELING_AUTHORITY_SET = WiresPackage.ENERGY_CONSUMER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__CHANGE_ITEMS = WiresPackage.ENERGY_CONSUMER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__SCHEDULE_STEPS = WiresPackage.ENERGY_CONSUMER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__SAFETY_DOCUMENTS = WiresPackage.ENERGY_CONSUMER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__OPERATING_SHARE = WiresPackage.ENERGY_CONSUMER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__DOCUMENT_ROLES = WiresPackage.ENERGY_CONSUMER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__PSR_LISTS = WiresPackage.ENERGY_CONSUMER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__MEASUREMENTS = WiresPackage.ENERGY_CONSUMER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__REPORTING_GROUP = WiresPackage.ENERGY_CONSUMER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__PSR_TYPE = WiresPackage.ENERGY_CONSUMER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__ASSETS = WiresPackage.ENERGY_CONSUMER__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__ERP_ORGANISATION_ROLES = WiresPackage.ENERGY_CONSUMER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__LOCATION = WiresPackage.ENERGY_CONSUMER__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__PSR_EVENT = WiresPackage.ENERGY_CONSUMER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__NETWORK_DATA_SETS = WiresPackage.ENERGY_CONSUMER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__OUTAGE_SCHEDULE = WiresPackage.ENERGY_CONSUMER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__CONTINGENCY_EQUIPMENT = WiresPackage.ENERGY_CONSUMER__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__CUSTOMER_AGREEMENTS = WiresPackage.ENERGY_CONSUMER__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__NORMALLY_IN_SERVICE = WiresPackage.ENERGY_CONSUMER__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__AGGREGATE = WiresPackage.ENERGY_CONSUMER__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__EQUIPMENT_CONTAINER = WiresPackage.ENERGY_CONSUMER__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__BASE_VOLTAGE = WiresPackage.ENERGY_CONSUMER__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__CLEARANCE_TAGS = WiresPackage.ENERGY_CONSUMER__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__PROTECTION_EQUIPMENTS = WiresPackage.ENERGY_CONSUMER__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__TERMINALS = WiresPackage.ENERGY_CONSUMER__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__OUTAGE_STEP_ROLES = WiresPackage.ENERGY_CONSUMER__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__SV_STATUS = WiresPackage.ENERGY_CONSUMER__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Qfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__QFIXED_PCT = WiresPackage.ENERGY_CONSUMER__QFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Service Delivery Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__SERVICE_DELIVERY_POINTS = WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS;

	/**
	 * The feature id for the '<em><b>Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__CUSTOMER_COUNT = WiresPackage.ENERGY_CONSUMER__CUSTOMER_COUNT;

	/**
	 * The feature id for the '<em><b>Pfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__PFIXED_PCT = WiresPackage.ENERGY_CONSUMER__PFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Pfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__PFIXED = WiresPackage.ENERGY_CONSUMER__PFIXED;

	/**
	 * The feature id for the '<em><b>Load Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__LOAD_RESPONSE = WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE;

	/**
	 * The feature id for the '<em><b>Qfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__QFIXED = WiresPackage.ENERGY_CONSUMER__QFIXED;

	/**
	 * The feature id for the '<em><b>Power Cut Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__POWER_CUT_ZONE = WiresPackage.ENERGY_CONSUMER__POWER_CUT_ZONE;

	/**
	 * The feature id for the '<em><b>Energy Consumer Phases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__ENERGY_CONSUMER_PHASES = WiresPackage.ENERGY_CONSUMER__ENERGY_CONSUMER_PHASES;

	/**
	 * The feature id for the '<em><b>Load Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD__LOAD_GROUP = WiresPackage.ENERGY_CONSUMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Conform Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_FEATURE_COUNT = WiresPackage.ENERGY_CONSUMER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Non Conform Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_OPERATION_COUNT = WiresPackage.ENERGY_CONSUMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.LoadModel.StationSupply <em>Station Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.LoadModel.StationSupply
	 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getStationSupply()
	 * @generated
	 */
	public static final int STATION_SUPPLY = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__UUID = WiresPackage.ENERGY_CONSUMER__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__NAMES = WiresPackage.ENERGY_CONSUMER__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__DIAGRAM_OBJECTS = WiresPackage.ENERGY_CONSUMER__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__MRID = WiresPackage.ENERGY_CONSUMER__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__ALIAS_NAME = WiresPackage.ENERGY_CONSUMER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__NAME = WiresPackage.ENERGY_CONSUMER__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__MODELING_AUTHORITY_SET = WiresPackage.ENERGY_CONSUMER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__CHANGE_ITEMS = WiresPackage.ENERGY_CONSUMER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__SCHEDULE_STEPS = WiresPackage.ENERGY_CONSUMER__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__SAFETY_DOCUMENTS = WiresPackage.ENERGY_CONSUMER__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__OPERATING_SHARE = WiresPackage.ENERGY_CONSUMER__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__DOCUMENT_ROLES = WiresPackage.ENERGY_CONSUMER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__PSR_LISTS = WiresPackage.ENERGY_CONSUMER__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__MEASUREMENTS = WiresPackage.ENERGY_CONSUMER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__REPORTING_GROUP = WiresPackage.ENERGY_CONSUMER__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__PSR_TYPE = WiresPackage.ENERGY_CONSUMER__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__ASSETS = WiresPackage.ENERGY_CONSUMER__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__ERP_ORGANISATION_ROLES = WiresPackage.ENERGY_CONSUMER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__LOCATION = WiresPackage.ENERGY_CONSUMER__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__PSR_EVENT = WiresPackage.ENERGY_CONSUMER__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__NETWORK_DATA_SETS = WiresPackage.ENERGY_CONSUMER__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__OUTAGE_SCHEDULE = WiresPackage.ENERGY_CONSUMER__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__CONTINGENCY_EQUIPMENT = WiresPackage.ENERGY_CONSUMER__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__CUSTOMER_AGREEMENTS = WiresPackage.ENERGY_CONSUMER__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__NORMALLY_IN_SERVICE = WiresPackage.ENERGY_CONSUMER__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__AGGREGATE = WiresPackage.ENERGY_CONSUMER__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__EQUIPMENT_CONTAINER = WiresPackage.ENERGY_CONSUMER__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Base Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__BASE_VOLTAGE = WiresPackage.ENERGY_CONSUMER__BASE_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Clearance Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__CLEARANCE_TAGS = WiresPackage.ENERGY_CONSUMER__CLEARANCE_TAGS;

	/**
	 * The feature id for the '<em><b>Protection Equipments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__PROTECTION_EQUIPMENTS = WiresPackage.ENERGY_CONSUMER__PROTECTION_EQUIPMENTS;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__TERMINALS = WiresPackage.ENERGY_CONSUMER__TERMINALS;

	/**
	 * The feature id for the '<em><b>Outage Step Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__OUTAGE_STEP_ROLES = WiresPackage.ENERGY_CONSUMER__OUTAGE_STEP_ROLES;

	/**
	 * The feature id for the '<em><b>Sv Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__SV_STATUS = WiresPackage.ENERGY_CONSUMER__SV_STATUS;

	/**
	 * The feature id for the '<em><b>Qfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__QFIXED_PCT = WiresPackage.ENERGY_CONSUMER__QFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Service Delivery Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__SERVICE_DELIVERY_POINTS = WiresPackage.ENERGY_CONSUMER__SERVICE_DELIVERY_POINTS;

	/**
	 * The feature id for the '<em><b>Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__CUSTOMER_COUNT = WiresPackage.ENERGY_CONSUMER__CUSTOMER_COUNT;

	/**
	 * The feature id for the '<em><b>Pfixed Pct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__PFIXED_PCT = WiresPackage.ENERGY_CONSUMER__PFIXED_PCT;

	/**
	 * The feature id for the '<em><b>Pfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__PFIXED = WiresPackage.ENERGY_CONSUMER__PFIXED;

	/**
	 * The feature id for the '<em><b>Load Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__LOAD_RESPONSE = WiresPackage.ENERGY_CONSUMER__LOAD_RESPONSE;

	/**
	 * The feature id for the '<em><b>Qfixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__QFIXED = WiresPackage.ENERGY_CONSUMER__QFIXED;

	/**
	 * The feature id for the '<em><b>Power Cut Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__POWER_CUT_ZONE = WiresPackage.ENERGY_CONSUMER__POWER_CUT_ZONE;

	/**
	 * The feature id for the '<em><b>Energy Consumer Phases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY__ENERGY_CONSUMER_PHASES = WiresPackage.ENERGY_CONSUMER__ENERGY_CONSUMER_PHASES;

	/**
	 * The number of structural features of the '<em>Station Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY_FEATURE_COUNT = WiresPackage.ENERGY_CONSUMER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Station Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATION_SUPPLY_OPERATION_COUNT = WiresPackage.ENERGY_CONSUMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.LoadModel.NonConformLoadSchedule <em>Non Conform Load Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.LoadModel.NonConformLoadSchedule
	 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getNonConformLoadSchedule()
	 * @generated
	 */
	public static final int NON_CONFORM_LOAD_SCHEDULE = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_SCHEDULE__UUID = SEASON_DAY_TYPE_SCHEDULE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_SCHEDULE__NAMES = SEASON_DAY_TYPE_SCHEDULE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_SCHEDULE__DIAGRAM_OBJECTS = SEASON_DAY_TYPE_SCHEDULE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_SCHEDULE__MRID = SEASON_DAY_TYPE_SCHEDULE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_SCHEDULE__ALIAS_NAME = SEASON_DAY_TYPE_SCHEDULE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_SCHEDULE__NAME = SEASON_DAY_TYPE_SCHEDULE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_SCHEDULE__MODELING_AUTHORITY_SET = SEASON_DAY_TYPE_SCHEDULE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_SCHEDULE__START_TIME = SEASON_DAY_TYPE_SCHEDULE__START_TIME;

	/**
	 * The feature id for the '<em><b>Value1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_SCHEDULE__VALUE1_MULTIPLIER = SEASON_DAY_TYPE_SCHEDULE__VALUE1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Value2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_SCHEDULE__VALUE2_UNIT = SEASON_DAY_TYPE_SCHEDULE__VALUE2_UNIT;

	/**
	 * The feature id for the '<em><b>Value1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_SCHEDULE__VALUE1_UNIT = SEASON_DAY_TYPE_SCHEDULE__VALUE1_UNIT;

	/**
	 * The feature id for the '<em><b>Value2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_SCHEDULE__VALUE2_MULTIPLIER = SEASON_DAY_TYPE_SCHEDULE__VALUE2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_SCHEDULE__END_TIME = SEASON_DAY_TYPE_SCHEDULE__END_TIME;

	/**
	 * The feature id for the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_SCHEDULE__TIME_STEP = SEASON_DAY_TYPE_SCHEDULE__TIME_STEP;

	/**
	 * The feature id for the '<em><b>Time Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_SCHEDULE__TIME_POINTS = SEASON_DAY_TYPE_SCHEDULE__TIME_POINTS;

	/**
	 * The feature id for the '<em><b>Season</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_SCHEDULE__SEASON = SEASON_DAY_TYPE_SCHEDULE__SEASON;

	/**
	 * The feature id for the '<em><b>Day Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_SCHEDULE__DAY_TYPE = SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE;

	/**
	 * The feature id for the '<em><b>Non Conform Load Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP = SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Conform Load Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_SCHEDULE_FEATURE_COUNT = SEASON_DAY_TYPE_SCHEDULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Non Conform Load Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_SCHEDULE_OPERATION_COUNT = SEASON_DAY_TYPE_SCHEDULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.LoadModel.NonConformLoadGroup <em>Non Conform Load Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.LoadModel.NonConformLoadGroup
	 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getNonConformLoadGroup()
	 * @generated
	 */
	public static final int NON_CONFORM_LOAD_GROUP = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_GROUP__UUID = LOAD_GROUP__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_GROUP__NAMES = LOAD_GROUP__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_GROUP__DIAGRAM_OBJECTS = LOAD_GROUP__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_GROUP__MRID = LOAD_GROUP__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_GROUP__ALIAS_NAME = LOAD_GROUP__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_GROUP__NAME = LOAD_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_GROUP__MODELING_AUTHORITY_SET = LOAD_GROUP__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Sub Load Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_GROUP__SUB_LOAD_AREA = LOAD_GROUP__SUB_LOAD_AREA;

	/**
	 * The feature id for the '<em><b>Non Conform Load Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES = LOAD_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Energy Consumers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS = LOAD_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Non Conform Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_GROUP_FEATURE_COUNT = LOAD_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Non Conform Load Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONFORM_LOAD_GROUP_OPERATION_COUNT = LOAD_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.LoadModel.DayType <em>Day Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.LoadModel.DayType
	 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getDayType()
	 * @generated
	 */
	public static final int DAY_TYPE = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAY_TYPE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAY_TYPE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAY_TYPE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAY_TYPE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAY_TYPE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAY_TYPE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAY_TYPE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Season Day Type Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Day Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAY_TYPE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Day Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAY_TYPE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.LoadModel.SubLoadArea <em>Sub Load Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.LoadModel.SubLoadArea
	 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getSubLoadArea()
	 * @generated
	 */
	public static final int SUB_LOAD_AREA = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_LOAD_AREA__UUID = ENERGY_AREA__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_LOAD_AREA__NAMES = ENERGY_AREA__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_LOAD_AREA__DIAGRAM_OBJECTS = ENERGY_AREA__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_LOAD_AREA__MRID = ENERGY_AREA__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_LOAD_AREA__ALIAS_NAME = ENERGY_AREA__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_LOAD_AREA__NAME = ENERGY_AREA__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_LOAD_AREA__MODELING_AUTHORITY_SET = ENERGY_AREA__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Control Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_LOAD_AREA__CONTROL_AREA = ENERGY_AREA__CONTROL_AREA;

	/**
	 * The feature id for the '<em><b>Load Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_LOAD_AREA__LOAD_GROUPS = ENERGY_AREA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Load Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_LOAD_AREA__LOAD_AREA = ENERGY_AREA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sub Load Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_LOAD_AREA_FEATURE_COUNT = ENERGY_AREA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sub Load Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUB_LOAD_AREA_OPERATION_COUNT = ENERGY_AREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.LoadModel.Season <em>Season</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.LoadModel.Season
	 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getSeason()
	 * @generated
	 */
	public static final int SEASON = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON__NAME = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON__START_DATE = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON__END_DATE = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Season Day Type Schedules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON__SEASON_DAY_TYPE_SCHEDULES = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Season</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Season</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEASON_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.LoadModel.SeasonName <em>Season Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.LoadModel.SeasonName
	 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getSeasonName()
	 * @generated
	 */
	public static final int SEASON_NAME = 16;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformLoadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformLoadGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seasonDayTypeScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformLoadScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerCutZoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadResponseCharacteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonConformLoadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationSupplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energyAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonConformLoadScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonConformLoadGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subLoadAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seasonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum seasonNameEEnum = null;

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
	 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LoadModelPackage() {
		super(eNS_URI, LoadModelFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link LoadModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static LoadModelPackage init() {
		if (isInited) return (LoadModelPackage)EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI);

		// Obtain or create and register package
		LoadModelPackage theLoadModelPackage = (LoadModelPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LoadModelPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LoadModelPackage());

		isInited = true;

		// Obtain or create and register interdependencies
		CIM15Package theCIM15Package = (CIM15Package)(EPackage.Registry.INSTANCE.getEPackage(CIM15Package.eNS_URI) instanceof CIM15Package ? EPackage.Registry.INSTANCE.getEPackage(CIM15Package.eNS_URI) : CIM15Package.eINSTANCE);
		IEC61970Package theIEC61970Package = (IEC61970Package)(EPackage.Registry.INSTANCE.getEPackage(IEC61970Package.eNS_URI) instanceof IEC61970Package ? EPackage.Registry.INSTANCE.getEPackage(IEC61970Package.eNS_URI) : IEC61970Package.eINSTANCE);
		SCADAPackage theSCADAPackage = (SCADAPackage)(EPackage.Registry.INSTANCE.getEPackage(SCADAPackage.eNS_URI) instanceof SCADAPackage ? EPackage.Registry.INSTANCE.getEPackage(SCADAPackage.eNS_URI) : SCADAPackage.eINSTANCE);
		ProductionPackage theProductionPackage = (ProductionPackage)(EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) instanceof ProductionPackage ? EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) : ProductionPackage.eINSTANCE);
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
		theLoadModelPackage.fixPackageContents();
		theCIM15Package.fixPackageContents();
		theIEC61970Package.fixPackageContents();
		theSCADAPackage.fixPackageContents();
		theProductionPackage.fixPackageContents();
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
		theLoadModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LoadModelPackage.eNS_URI, theLoadModelPackage);
		return theLoadModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.LoadModel.ConformLoad <em>Conform Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conform Load</em>'.
	 * @see CIM15.IEC61970.LoadModel.ConformLoad
	 * @generated
	 */
	public EClass getConformLoad() {
		if (conformLoadEClass == null) {
			conformLoadEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI).getEClassifiers().get(0);
		}
		return conformLoadEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.LoadModel.ConformLoad#getLoadGroup <em>Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Group</em>'.
	 * @see CIM15.IEC61970.LoadModel.ConformLoad#getLoadGroup()
	 * @see #getConformLoad()
	 * @generated
	 */
	public EReference getConformLoad_LoadGroup() {
        return (EReference)getConformLoad().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.LoadModel.ConformLoadGroup <em>Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conform Load Group</em>'.
	 * @see CIM15.IEC61970.LoadModel.ConformLoadGroup
	 * @generated
	 */
	public EClass getConformLoadGroup() {
		if (conformLoadGroupEClass == null) {
			conformLoadGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI).getEClassifiers().get(1);
		}
		return conformLoadGroupEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.LoadModel.ConformLoadGroup#getConformLoadSchedules <em>Conform Load Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conform Load Schedules</em>'.
	 * @see CIM15.IEC61970.LoadModel.ConformLoadGroup#getConformLoadSchedules()
	 * @see #getConformLoadGroup()
	 * @generated
	 */
	public EReference getConformLoadGroup_ConformLoadSchedules() {
        return (EReference)getConformLoadGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.LoadModel.ConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energy Consumers</em>'.
	 * @see CIM15.IEC61970.LoadModel.ConformLoadGroup#getEnergyConsumers()
	 * @see #getConformLoadGroup()
	 * @generated
	 */
	public EReference getConformLoadGroup_EnergyConsumers() {
        return (EReference)getConformLoadGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.LoadModel.SeasonDayTypeSchedule <em>Season Day Type Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Season Day Type Schedule</em>'.
	 * @see CIM15.IEC61970.LoadModel.SeasonDayTypeSchedule
	 * @generated
	 */
	public EClass getSeasonDayTypeSchedule() {
		if (seasonDayTypeScheduleEClass == null) {
			seasonDayTypeScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI).getEClassifiers().get(2);
		}
		return seasonDayTypeScheduleEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.LoadModel.SeasonDayTypeSchedule#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Season</em>'.
	 * @see CIM15.IEC61970.LoadModel.SeasonDayTypeSchedule#getSeason()
	 * @see #getSeasonDayTypeSchedule()
	 * @generated
	 */
	public EReference getSeasonDayTypeSchedule_Season() {
        return (EReference)getSeasonDayTypeSchedule().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.LoadModel.SeasonDayTypeSchedule#getDayType <em>Day Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Day Type</em>'.
	 * @see CIM15.IEC61970.LoadModel.SeasonDayTypeSchedule#getDayType()
	 * @see #getSeasonDayTypeSchedule()
	 * @generated
	 */
	public EReference getSeasonDayTypeSchedule_DayType() {
        return (EReference)getSeasonDayTypeSchedule().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.LoadModel.LoadGroup <em>Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Group</em>'.
	 * @see CIM15.IEC61970.LoadModel.LoadGroup
	 * @generated
	 */
	public EClass getLoadGroup() {
		if (loadGroupEClass == null) {
			loadGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI).getEClassifiers().get(3);
		}
		return loadGroupEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.LoadModel.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Load Area</em>'.
	 * @see CIM15.IEC61970.LoadModel.LoadGroup#getSubLoadArea()
	 * @see #getLoadGroup()
	 * @generated
	 */
	public EReference getLoadGroup_SubLoadArea() {
        return (EReference)getLoadGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.LoadModel.ConformLoadSchedule <em>Conform Load Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conform Load Schedule</em>'.
	 * @see CIM15.IEC61970.LoadModel.ConformLoadSchedule
	 * @generated
	 */
	public EClass getConformLoadSchedule() {
		if (conformLoadScheduleEClass == null) {
			conformLoadScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI).getEClassifiers().get(4);
		}
		return conformLoadScheduleEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.LoadModel.ConformLoadSchedule#getConformLoadGroup <em>Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conform Load Group</em>'.
	 * @see CIM15.IEC61970.LoadModel.ConformLoadSchedule#getConformLoadGroup()
	 * @see #getConformLoadSchedule()
	 * @generated
	 */
	public EReference getConformLoadSchedule_ConformLoadGroup() {
        return (EReference)getConformLoadSchedule().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.LoadModel.LoadArea <em>Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Area</em>'.
	 * @see CIM15.IEC61970.LoadModel.LoadArea
	 * @generated
	 */
	public EClass getLoadArea() {
		if (loadAreaEClass == null) {
			loadAreaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI).getEClassifiers().get(5);
		}
		return loadAreaEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.LoadModel.LoadArea#getSubLoadAreas <em>Sub Load Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Load Areas</em>'.
	 * @see CIM15.IEC61970.LoadModel.LoadArea#getSubLoadAreas()
	 * @see #getLoadArea()
	 * @generated
	 */
	public EReference getLoadArea_SubLoadAreas() {
        return (EReference)getLoadArea().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.LoadModel.PowerCutZone <em>Power Cut Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Cut Zone</em>'.
	 * @see CIM15.IEC61970.LoadModel.PowerCutZone
	 * @generated
	 */
	public EClass getPowerCutZone() {
		if (powerCutZoneEClass == null) {
			powerCutZoneEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI).getEClassifiers().get(6);
		}
		return powerCutZoneEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.LoadModel.PowerCutZone#getEnergyConsumers <em>Energy Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energy Consumers</em>'.
	 * @see CIM15.IEC61970.LoadModel.PowerCutZone#getEnergyConsumers()
	 * @see #getPowerCutZone()
	 * @generated
	 */
	public EReference getPowerCutZone_EnergyConsumers() {
        return (EReference)getPowerCutZone().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.LoadModel.PowerCutZone#getCutLevel2 <em>Cut Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cut Level2</em>'.
	 * @see CIM15.IEC61970.LoadModel.PowerCutZone#getCutLevel2()
	 * @see #getPowerCutZone()
	 * @generated
	 */
	public EAttribute getPowerCutZone_CutLevel2() {
        return (EAttribute)getPowerCutZone().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.LoadModel.PowerCutZone#getCutLevel1 <em>Cut Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cut Level1</em>'.
	 * @see CIM15.IEC61970.LoadModel.PowerCutZone#getCutLevel1()
	 * @see #getPowerCutZone()
	 * @generated
	 */
	public EAttribute getPowerCutZone_CutLevel1() {
        return (EAttribute)getPowerCutZone().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic <em>Load Response Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Response Characteristic</em>'.
	 * @see CIM15.IEC61970.LoadModel.LoadResponseCharacteristic
	 * @generated
	 */
	public EClass getLoadResponseCharacteristic() {
		if (loadResponseCharacteristicEClass == null) {
			loadResponseCharacteristicEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI).getEClassifiers().get(7);
		}
		return loadResponseCharacteristicEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPFrequencyExponent <em>PFrequency Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PFrequency Exponent</em>'.
	 * @see CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPFrequencyExponent()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	public EAttribute getLoadResponseCharacteristic_PFrequencyExponent() {
        return (EAttribute)getLoadResponseCharacteristic().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantPower <em>PConstant Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PConstant Power</em>'.
	 * @see CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantPower()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	public EAttribute getLoadResponseCharacteristic_PConstantPower() {
        return (EAttribute)getLoadResponseCharacteristic().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#isExponentModel <em>Exponent Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exponent Model</em>'.
	 * @see CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#isExponentModel()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	public EAttribute getLoadResponseCharacteristic_ExponentModel() {
        return (EAttribute)getLoadResponseCharacteristic().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQFrequencyExponent <em>QFrequency Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QFrequency Exponent</em>'.
	 * @see CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQFrequencyExponent()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	public EAttribute getLoadResponseCharacteristic_QFrequencyExponent() {
        return (EAttribute)getLoadResponseCharacteristic().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getEnergyConsumer <em>Energy Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energy Consumer</em>'.
	 * @see CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getEnergyConsumer()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	public EReference getLoadResponseCharacteristic_EnergyConsumer() {
        return (EReference)getLoadResponseCharacteristic().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPVoltageExponent <em>PVoltage Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PVoltage Exponent</em>'.
	 * @see CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPVoltageExponent()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	public EAttribute getLoadResponseCharacteristic_PVoltageExponent() {
        return (EAttribute)getLoadResponseCharacteristic().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantImpedance <em>QConstant Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QConstant Impedance</em>'.
	 * @see CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantImpedance()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	public EAttribute getLoadResponseCharacteristic_QConstantImpedance() {
        return (EAttribute)getLoadResponseCharacteristic().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantPower <em>QConstant Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QConstant Power</em>'.
	 * @see CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantPower()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	public EAttribute getLoadResponseCharacteristic_QConstantPower() {
        return (EAttribute)getLoadResponseCharacteristic().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantImpedance <em>PConstant Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PConstant Impedance</em>'.
	 * @see CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantImpedance()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	public EAttribute getLoadResponseCharacteristic_PConstantImpedance() {
        return (EAttribute)getLoadResponseCharacteristic().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantCurrent <em>PConstant Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PConstant Current</em>'.
	 * @see CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantCurrent()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	public EAttribute getLoadResponseCharacteristic_PConstantCurrent() {
        return (EAttribute)getLoadResponseCharacteristic().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQVoltageExponent <em>QVoltage Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QVoltage Exponent</em>'.
	 * @see CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQVoltageExponent()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	public EAttribute getLoadResponseCharacteristic_QVoltageExponent() {
        return (EAttribute)getLoadResponseCharacteristic().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantCurrent <em>QConstant Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QConstant Current</em>'.
	 * @see CIM15.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantCurrent()
	 * @see #getLoadResponseCharacteristic()
	 * @generated
	 */
	public EAttribute getLoadResponseCharacteristic_QConstantCurrent() {
        return (EAttribute)getLoadResponseCharacteristic().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.LoadModel.NonConformLoad <em>Non Conform Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Conform Load</em>'.
	 * @see CIM15.IEC61970.LoadModel.NonConformLoad
	 * @generated
	 */
	public EClass getNonConformLoad() {
		if (nonConformLoadEClass == null) {
			nonConformLoadEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI).getEClassifiers().get(8);
		}
		return nonConformLoadEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.LoadModel.NonConformLoad#getLoadGroup <em>Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Group</em>'.
	 * @see CIM15.IEC61970.LoadModel.NonConformLoad#getLoadGroup()
	 * @see #getNonConformLoad()
	 * @generated
	 */
	public EReference getNonConformLoad_LoadGroup() {
        return (EReference)getNonConformLoad().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.LoadModel.StationSupply <em>Station Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station Supply</em>'.
	 * @see CIM15.IEC61970.LoadModel.StationSupply
	 * @generated
	 */
	public EClass getStationSupply() {
		if (stationSupplyEClass == null) {
			stationSupplyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI).getEClassifiers().get(9);
		}
		return stationSupplyEClass;
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.LoadModel.EnergyArea <em>Energy Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Area</em>'.
	 * @see CIM15.IEC61970.LoadModel.EnergyArea
	 * @generated
	 */
	public EClass getEnergyArea() {
		if (energyAreaEClass == null) {
			energyAreaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI).getEClassifiers().get(10);
		}
		return energyAreaEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.LoadModel.EnergyArea#getControlArea <em>Control Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Area</em>'.
	 * @see CIM15.IEC61970.LoadModel.EnergyArea#getControlArea()
	 * @see #getEnergyArea()
	 * @generated
	 */
	public EReference getEnergyArea_ControlArea() {
        return (EReference)getEnergyArea().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.LoadModel.NonConformLoadSchedule <em>Non Conform Load Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Conform Load Schedule</em>'.
	 * @see CIM15.IEC61970.LoadModel.NonConformLoadSchedule
	 * @generated
	 */
	public EClass getNonConformLoadSchedule() {
		if (nonConformLoadScheduleEClass == null) {
			nonConformLoadScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI).getEClassifiers().get(11);
		}
		return nonConformLoadScheduleEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.LoadModel.NonConformLoadSchedule#getNonConformLoadGroup <em>Non Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Non Conform Load Group</em>'.
	 * @see CIM15.IEC61970.LoadModel.NonConformLoadSchedule#getNonConformLoadGroup()
	 * @see #getNonConformLoadSchedule()
	 * @generated
	 */
	public EReference getNonConformLoadSchedule_NonConformLoadGroup() {
        return (EReference)getNonConformLoadSchedule().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.LoadModel.NonConformLoadGroup <em>Non Conform Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Conform Load Group</em>'.
	 * @see CIM15.IEC61970.LoadModel.NonConformLoadGroup
	 * @generated
	 */
	public EClass getNonConformLoadGroup() {
		if (nonConformLoadGroupEClass == null) {
			nonConformLoadGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI).getEClassifiers().get(12);
		}
		return nonConformLoadGroupEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.LoadModel.NonConformLoadGroup#getNonConformLoadSchedules <em>Non Conform Load Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Non Conform Load Schedules</em>'.
	 * @see CIM15.IEC61970.LoadModel.NonConformLoadGroup#getNonConformLoadSchedules()
	 * @see #getNonConformLoadGroup()
	 * @generated
	 */
	public EReference getNonConformLoadGroup_NonConformLoadSchedules() {
        return (EReference)getNonConformLoadGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.LoadModel.NonConformLoadGroup#getEnergyConsumers <em>Energy Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energy Consumers</em>'.
	 * @see CIM15.IEC61970.LoadModel.NonConformLoadGroup#getEnergyConsumers()
	 * @see #getNonConformLoadGroup()
	 * @generated
	 */
	public EReference getNonConformLoadGroup_EnergyConsumers() {
        return (EReference)getNonConformLoadGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.LoadModel.DayType <em>Day Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day Type</em>'.
	 * @see CIM15.IEC61970.LoadModel.DayType
	 * @generated
	 */
	public EClass getDayType() {
		if (dayTypeEClass == null) {
			dayTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI).getEClassifiers().get(13);
		}
		return dayTypeEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.LoadModel.DayType#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Season Day Type Schedules</em>'.
	 * @see CIM15.IEC61970.LoadModel.DayType#getSeasonDayTypeSchedules()
	 * @see #getDayType()
	 * @generated
	 */
	public EReference getDayType_SeasonDayTypeSchedules() {
        return (EReference)getDayType().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.LoadModel.SubLoadArea <em>Sub Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Load Area</em>'.
	 * @see CIM15.IEC61970.LoadModel.SubLoadArea
	 * @generated
	 */
	public EClass getSubLoadArea() {
		if (subLoadAreaEClass == null) {
			subLoadAreaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI).getEClassifiers().get(14);
		}
		return subLoadAreaEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.LoadModel.SubLoadArea#getLoadGroups <em>Load Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Load Groups</em>'.
	 * @see CIM15.IEC61970.LoadModel.SubLoadArea#getLoadGroups()
	 * @see #getSubLoadArea()
	 * @generated
	 */
	public EReference getSubLoadArea_LoadGroups() {
        return (EReference)getSubLoadArea().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.LoadModel.SubLoadArea#getLoadArea <em>Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Area</em>'.
	 * @see CIM15.IEC61970.LoadModel.SubLoadArea#getLoadArea()
	 * @see #getSubLoadArea()
	 * @generated
	 */
	public EReference getSubLoadArea_LoadArea() {
        return (EReference)getSubLoadArea().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.LoadModel.Season <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Season</em>'.
	 * @see CIM15.IEC61970.LoadModel.Season
	 * @generated
	 */
	public EClass getSeason() {
		if (seasonEClass == null) {
			seasonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI).getEClassifiers().get(15);
		}
		return seasonEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.LoadModel.Season#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CIM15.IEC61970.LoadModel.Season#getName()
	 * @see #getSeason()
	 * @generated
	 */
	public EAttribute getSeason_Name() {
        return (EAttribute)getSeason().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.LoadModel.Season#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see CIM15.IEC61970.LoadModel.Season#getStartDate()
	 * @see #getSeason()
	 * @generated
	 */
	public EAttribute getSeason_StartDate() {
        return (EAttribute)getSeason().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.LoadModel.Season#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see CIM15.IEC61970.LoadModel.Season#getEndDate()
	 * @see #getSeason()
	 * @generated
	 */
	public EAttribute getSeason_EndDate() {
        return (EAttribute)getSeason().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.LoadModel.Season#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Season Day Type Schedules</em>'.
	 * @see CIM15.IEC61970.LoadModel.Season#getSeasonDayTypeSchedules()
	 * @see #getSeason()
	 * @generated
	 */
	public EReference getSeason_SeasonDayTypeSchedules() {
        return (EReference)getSeason().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.LoadModel.SeasonName <em>Season Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Season Name</em>'.
	 * @see CIM15.IEC61970.LoadModel.SeasonName
	 * @generated
	 */
	public EEnum getSeasonName() {
		if (seasonNameEEnum == null) {
			seasonNameEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI).getEClassifiers().get(16);
		}
		return seasonNameEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public LoadModelFactory getLoadModelFactory() {
		return (LoadModelFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM15.IEC61970.LoadModel." + eClassifier.getName());
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
		 * The meta object literal for the '{@link CIM15.IEC61970.LoadModel.ConformLoad <em>Conform Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.LoadModel.ConformLoad
		 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getConformLoad()
		 * @generated
		 */
		public static final EClass CONFORM_LOAD = eINSTANCE.getConformLoad();

		/**
		 * The meta object literal for the '<em><b>Load Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONFORM_LOAD__LOAD_GROUP = eINSTANCE.getConformLoad_LoadGroup();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.LoadModel.ConformLoadGroup <em>Conform Load Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.LoadModel.ConformLoadGroup
		 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getConformLoadGroup()
		 * @generated
		 */
		public static final EClass CONFORM_LOAD_GROUP = eINSTANCE.getConformLoadGroup();

		/**
		 * The meta object literal for the '<em><b>Conform Load Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES = eINSTANCE.getConformLoadGroup_ConformLoadSchedules();

		/**
		 * The meta object literal for the '<em><b>Energy Consumers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONFORM_LOAD_GROUP__ENERGY_CONSUMERS = eINSTANCE.getConformLoadGroup_EnergyConsumers();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.LoadModel.SeasonDayTypeSchedule <em>Season Day Type Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.LoadModel.SeasonDayTypeSchedule
		 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getSeasonDayTypeSchedule()
		 * @generated
		 */
		public static final EClass SEASON_DAY_TYPE_SCHEDULE = eINSTANCE.getSeasonDayTypeSchedule();

		/**
		 * The meta object literal for the '<em><b>Season</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SEASON_DAY_TYPE_SCHEDULE__SEASON = eINSTANCE.getSeasonDayTypeSchedule_Season();

		/**
		 * The meta object literal for the '<em><b>Day Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE = eINSTANCE.getSeasonDayTypeSchedule_DayType();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.LoadModel.LoadGroup <em>Load Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.LoadModel.LoadGroup
		 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getLoadGroup()
		 * @generated
		 */
		public static final EClass LOAD_GROUP = eINSTANCE.getLoadGroup();

		/**
		 * The meta object literal for the '<em><b>Sub Load Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOAD_GROUP__SUB_LOAD_AREA = eINSTANCE.getLoadGroup_SubLoadArea();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.LoadModel.ConformLoadSchedule <em>Conform Load Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.LoadModel.ConformLoadSchedule
		 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getConformLoadSchedule()
		 * @generated
		 */
		public static final EClass CONFORM_LOAD_SCHEDULE = eINSTANCE.getConformLoadSchedule();

		/**
		 * The meta object literal for the '<em><b>Conform Load Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP = eINSTANCE.getConformLoadSchedule_ConformLoadGroup();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.LoadModel.LoadArea <em>Load Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.LoadModel.LoadArea
		 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getLoadArea()
		 * @generated
		 */
		public static final EClass LOAD_AREA = eINSTANCE.getLoadArea();

		/**
		 * The meta object literal for the '<em><b>Sub Load Areas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOAD_AREA__SUB_LOAD_AREAS = eINSTANCE.getLoadArea_SubLoadAreas();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.LoadModel.PowerCutZone <em>Power Cut Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.LoadModel.PowerCutZone
		 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getPowerCutZone()
		 * @generated
		 */
		public static final EClass POWER_CUT_ZONE = eINSTANCE.getPowerCutZone();

		/**
		 * The meta object literal for the '<em><b>Energy Consumers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_CUT_ZONE__ENERGY_CONSUMERS = eINSTANCE.getPowerCutZone_EnergyConsumers();

		/**
		 * The meta object literal for the '<em><b>Cut Level2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POWER_CUT_ZONE__CUT_LEVEL2 = eINSTANCE.getPowerCutZone_CutLevel2();

		/**
		 * The meta object literal for the '<em><b>Cut Level1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POWER_CUT_ZONE__CUT_LEVEL1 = eINSTANCE.getPowerCutZone_CutLevel1();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.LoadModel.LoadResponseCharacteristic <em>Load Response Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.LoadModel.LoadResponseCharacteristic
		 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getLoadResponseCharacteristic()
		 * @generated
		 */
		public static final EClass LOAD_RESPONSE_CHARACTERISTIC = eINSTANCE.getLoadResponseCharacteristic();

		/**
		 * The meta object literal for the '<em><b>PFrequency Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOAD_RESPONSE_CHARACTERISTIC__PFREQUENCY_EXPONENT = eINSTANCE.getLoadResponseCharacteristic_PFrequencyExponent();

		/**
		 * The meta object literal for the '<em><b>PConstant Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_POWER = eINSTANCE.getLoadResponseCharacteristic_PConstantPower();

		/**
		 * The meta object literal for the '<em><b>Exponent Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOAD_RESPONSE_CHARACTERISTIC__EXPONENT_MODEL = eINSTANCE.getLoadResponseCharacteristic_ExponentModel();

		/**
		 * The meta object literal for the '<em><b>QFrequency Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOAD_RESPONSE_CHARACTERISTIC__QFREQUENCY_EXPONENT = eINSTANCE.getLoadResponseCharacteristic_QFrequencyExponent();

		/**
		 * The meta object literal for the '<em><b>Energy Consumer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOAD_RESPONSE_CHARACTERISTIC__ENERGY_CONSUMER = eINSTANCE.getLoadResponseCharacteristic_EnergyConsumer();

		/**
		 * The meta object literal for the '<em><b>PVoltage Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOAD_RESPONSE_CHARACTERISTIC__PVOLTAGE_EXPONENT = eINSTANCE.getLoadResponseCharacteristic_PVoltageExponent();

		/**
		 * The meta object literal for the '<em><b>QConstant Impedance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_IMPEDANCE = eINSTANCE.getLoadResponseCharacteristic_QConstantImpedance();

		/**
		 * The meta object literal for the '<em><b>QConstant Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_POWER = eINSTANCE.getLoadResponseCharacteristic_QConstantPower();

		/**
		 * The meta object literal for the '<em><b>PConstant Impedance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_IMPEDANCE = eINSTANCE.getLoadResponseCharacteristic_PConstantImpedance();

		/**
		 * The meta object literal for the '<em><b>PConstant Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOAD_RESPONSE_CHARACTERISTIC__PCONSTANT_CURRENT = eINSTANCE.getLoadResponseCharacteristic_PConstantCurrent();

		/**
		 * The meta object literal for the '<em><b>QVoltage Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOAD_RESPONSE_CHARACTERISTIC__QVOLTAGE_EXPONENT = eINSTANCE.getLoadResponseCharacteristic_QVoltageExponent();

		/**
		 * The meta object literal for the '<em><b>QConstant Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOAD_RESPONSE_CHARACTERISTIC__QCONSTANT_CURRENT = eINSTANCE.getLoadResponseCharacteristic_QConstantCurrent();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.LoadModel.NonConformLoad <em>Non Conform Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.LoadModel.NonConformLoad
		 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getNonConformLoad()
		 * @generated
		 */
		public static final EClass NON_CONFORM_LOAD = eINSTANCE.getNonConformLoad();

		/**
		 * The meta object literal for the '<em><b>Load Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NON_CONFORM_LOAD__LOAD_GROUP = eINSTANCE.getNonConformLoad_LoadGroup();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.LoadModel.StationSupply <em>Station Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.LoadModel.StationSupply
		 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getStationSupply()
		 * @generated
		 */
		public static final EClass STATION_SUPPLY = eINSTANCE.getStationSupply();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.LoadModel.EnergyArea <em>Energy Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.LoadModel.EnergyArea
		 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getEnergyArea()
		 * @generated
		 */
		public static final EClass ENERGY_AREA = eINSTANCE.getEnergyArea();

		/**
		 * The meta object literal for the '<em><b>Control Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ENERGY_AREA__CONTROL_AREA = eINSTANCE.getEnergyArea_ControlArea();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.LoadModel.NonConformLoadSchedule <em>Non Conform Load Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.LoadModel.NonConformLoadSchedule
		 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getNonConformLoadSchedule()
		 * @generated
		 */
		public static final EClass NON_CONFORM_LOAD_SCHEDULE = eINSTANCE.getNonConformLoadSchedule();

		/**
		 * The meta object literal for the '<em><b>Non Conform Load Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP = eINSTANCE.getNonConformLoadSchedule_NonConformLoadGroup();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.LoadModel.NonConformLoadGroup <em>Non Conform Load Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.LoadModel.NonConformLoadGroup
		 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getNonConformLoadGroup()
		 * @generated
		 */
		public static final EClass NON_CONFORM_LOAD_GROUP = eINSTANCE.getNonConformLoadGroup();

		/**
		 * The meta object literal for the '<em><b>Non Conform Load Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES = eINSTANCE.getNonConformLoadGroup_NonConformLoadSchedules();

		/**
		 * The meta object literal for the '<em><b>Energy Consumers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NON_CONFORM_LOAD_GROUP__ENERGY_CONSUMERS = eINSTANCE.getNonConformLoadGroup_EnergyConsumers();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.LoadModel.DayType <em>Day Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.LoadModel.DayType
		 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getDayType()
		 * @generated
		 */
		public static final EClass DAY_TYPE = eINSTANCE.getDayType();

		/**
		 * The meta object literal for the '<em><b>Season Day Type Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES = eINSTANCE.getDayType_SeasonDayTypeSchedules();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.LoadModel.SubLoadArea <em>Sub Load Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.LoadModel.SubLoadArea
		 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getSubLoadArea()
		 * @generated
		 */
		public static final EClass SUB_LOAD_AREA = eINSTANCE.getSubLoadArea();

		/**
		 * The meta object literal for the '<em><b>Load Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SUB_LOAD_AREA__LOAD_GROUPS = eINSTANCE.getSubLoadArea_LoadGroups();

		/**
		 * The meta object literal for the '<em><b>Load Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SUB_LOAD_AREA__LOAD_AREA = eINSTANCE.getSubLoadArea_LoadArea();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.LoadModel.Season <em>Season</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.LoadModel.Season
		 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getSeason()
		 * @generated
		 */
		public static final EClass SEASON = eINSTANCE.getSeason();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SEASON__NAME = eINSTANCE.getSeason_Name();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SEASON__START_DATE = eINSTANCE.getSeason_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SEASON__END_DATE = eINSTANCE.getSeason_EndDate();

		/**
		 * The meta object literal for the '<em><b>Season Day Type Schedules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SEASON__SEASON_DAY_TYPE_SCHEDULES = eINSTANCE.getSeason_SeasonDayTypeSchedules();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.LoadModel.SeasonName <em>Season Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.LoadModel.SeasonName
		 * @see CIM15.IEC61970.LoadModel.LoadModelPackage#getSeasonName()
		 * @generated
		 */
		public static final EEnum SEASON_NAME = eINSTANCE.getSeasonName();

	}

} //LoadModelPackage
