/**
 */
package CIM15.IEC61970.AuxiliaryEquipment;

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
 * @see CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipmentFactory
 * @generated
 */
public class AuxiliaryEquipmentPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "AuxiliaryEquipment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#AuxiliaryEquipment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimAuxiliaryEquipment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AuxiliaryEquipmentPackage eINSTANCE = CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipmentPackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipment <em>Auxiliary Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipment
	 * @see CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipmentPackage#getAuxiliaryEquipment()
	 * @generated
	 */
	public static final int AUXILIARY_EQUIPMENT = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__UUID = CorePackage.EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__NAMES = CorePackage.EQUIPMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__DIAGRAM_OBJECTS = CorePackage.EQUIPMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__MRID = CorePackage.EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__ALIAS_NAME = CorePackage.EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__NAME = CorePackage.EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__MODELING_AUTHORITY_SET = CorePackage.EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__CHANGE_ITEMS = CorePackage.EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__SCHEDULE_STEPS = CorePackage.EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__SAFETY_DOCUMENTS = CorePackage.EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__OPERATING_SHARE = CorePackage.EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__DOCUMENT_ROLES = CorePackage.EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__PSR_LISTS = CorePackage.EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__MEASUREMENTS = CorePackage.EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__REPORTING_GROUP = CorePackage.EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__PSR_TYPE = CorePackage.EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__ASSETS = CorePackage.EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__ERP_ORGANISATION_ROLES = CorePackage.EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__LOCATION = CorePackage.EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__PSR_EVENT = CorePackage.EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__NETWORK_DATA_SETS = CorePackage.EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__OUTAGE_SCHEDULE = CorePackage.EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__CONTINGENCY_EQUIPMENT = CorePackage.EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__CUSTOMER_AGREEMENTS = CorePackage.EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__NORMALLY_IN_SERVICE = CorePackage.EQUIPMENT__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__AGGREGATE = CorePackage.EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__EQUIPMENT_CONTAINER = CorePackage.EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT__TERMINAL = CorePackage.EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Auxiliary Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT_FEATURE_COUNT = CorePackage.EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Auxiliary Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_EQUIPMENT_OPERATION_COUNT = CorePackage.EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.AuxiliaryEquipment.Sensor <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.AuxiliaryEquipment.Sensor
	 * @see CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipmentPackage#getSensor()
	 * @generated
	 */
	public static final int SENSOR = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__UUID = AUXILIARY_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__NAMES = AUXILIARY_EQUIPMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__DIAGRAM_OBJECTS = AUXILIARY_EQUIPMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__MRID = AUXILIARY_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__ALIAS_NAME = AUXILIARY_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__NAME = AUXILIARY_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__MODELING_AUTHORITY_SET = AUXILIARY_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__CHANGE_ITEMS = AUXILIARY_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__SCHEDULE_STEPS = AUXILIARY_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__SAFETY_DOCUMENTS = AUXILIARY_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__OPERATING_SHARE = AUXILIARY_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__DOCUMENT_ROLES = AUXILIARY_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__PSR_LISTS = AUXILIARY_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__MEASUREMENTS = AUXILIARY_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__REPORTING_GROUP = AUXILIARY_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__PSR_TYPE = AUXILIARY_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__ASSETS = AUXILIARY_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__ERP_ORGANISATION_ROLES = AUXILIARY_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__LOCATION = AUXILIARY_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__PSR_EVENT = AUXILIARY_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__NETWORK_DATA_SETS = AUXILIARY_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__OUTAGE_SCHEDULE = AUXILIARY_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__CONTINGENCY_EQUIPMENT = AUXILIARY_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__CUSTOMER_AGREEMENTS = AUXILIARY_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__NORMALLY_IN_SERVICE = AUXILIARY_EQUIPMENT__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__AGGREGATE = AUXILIARY_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__EQUIPMENT_CONTAINER = AUXILIARY_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR__TERMINAL = AUXILIARY_EQUIPMENT__TERMINAL;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR_FEATURE_COUNT = AUXILIARY_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SENSOR_OPERATION_COUNT = AUXILIARY_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer <em>Potential Transformer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer
	 * @see CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipmentPackage#getPotentialTransformer()
	 * @generated
	 */
	public static final int POTENTIAL_TRANSFORMER = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__UUID = SENSOR__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__NAMES = SENSOR__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__DIAGRAM_OBJECTS = SENSOR__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__MRID = SENSOR__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__ALIAS_NAME = SENSOR__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__MODELING_AUTHORITY_SET = SENSOR__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__CHANGE_ITEMS = SENSOR__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__SCHEDULE_STEPS = SENSOR__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__SAFETY_DOCUMENTS = SENSOR__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__OPERATING_SHARE = SENSOR__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__DOCUMENT_ROLES = SENSOR__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__PSR_LISTS = SENSOR__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__MEASUREMENTS = SENSOR__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__REPORTING_GROUP = SENSOR__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__PSR_TYPE = SENSOR__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__ASSETS = SENSOR__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__ERP_ORGANISATION_ROLES = SENSOR__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__LOCATION = SENSOR__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__PSR_EVENT = SENSOR__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__NETWORK_DATA_SETS = SENSOR__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__OUTAGE_SCHEDULE = SENSOR__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__CONTINGENCY_EQUIPMENT = SENSOR__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__CUSTOMER_AGREEMENTS = SENSOR__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__NORMALLY_IN_SERVICE = SENSOR__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__AGGREGATE = SENSOR__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__EQUIPMENT_CONTAINER = SENSOR__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__TERMINAL = SENSOR__TERMINAL;

	/**
	 * The feature id for the '<em><b>PT Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__PT_INFO = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nominal Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__NOMINAL_RATIO = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Accuracy Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__ACCURACY_CLASS = SENSOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pt Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER__PT_CLASS = SENSOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Potential Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Potential Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer <em>Current Transformer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer
	 * @see CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipmentPackage#getCurrentTransformer()
	 * @generated
	 */
	public static final int CURRENT_TRANSFORMER = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__UUID = SENSOR__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__NAMES = SENSOR__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__DIAGRAM_OBJECTS = SENSOR__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__MRID = SENSOR__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__ALIAS_NAME = SENSOR__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__MODELING_AUTHORITY_SET = SENSOR__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__CHANGE_ITEMS = SENSOR__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__SCHEDULE_STEPS = SENSOR__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__SAFETY_DOCUMENTS = SENSOR__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__OPERATING_SHARE = SENSOR__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__DOCUMENT_ROLES = SENSOR__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__PSR_LISTS = SENSOR__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__MEASUREMENTS = SENSOR__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__REPORTING_GROUP = SENSOR__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__PSR_TYPE = SENSOR__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__ASSETS = SENSOR__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__ERP_ORGANISATION_ROLES = SENSOR__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__LOCATION = SENSOR__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__PSR_EVENT = SENSOR__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__NETWORK_DATA_SETS = SENSOR__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__OUTAGE_SCHEDULE = SENSOR__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__CONTINGENCY_EQUIPMENT = SENSOR__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__CUSTOMER_AGREEMENTS = SENSOR__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__NORMALLY_IN_SERVICE = SENSOR__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__AGGREGATE = SENSOR__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__EQUIPMENT_CONTAINER = SENSOR__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__TERMINAL = SENSOR__TERMINAL;

	/**
	 * The feature id for the '<em><b>Ct Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__CT_CLASS = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accuracy Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__ACCURACY_LIMIT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__USAGE = SENSOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Accuracy Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__ACCURACY_CLASS = SENSOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Core Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__CORE_COUNT = SENSOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__MAX_RATIO = SENSOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CT Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER__CT_INFO = SENSOR_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Current Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Current Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.AuxiliaryEquipment.SurgeProtector <em>Surge Protector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.AuxiliaryEquipment.SurgeProtector
	 * @see CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipmentPackage#getSurgeProtector()
	 * @generated
	 */
	public static final int SURGE_PROTECTOR = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__UUID = AUXILIARY_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__NAMES = AUXILIARY_EQUIPMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__DIAGRAM_OBJECTS = AUXILIARY_EQUIPMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__MRID = AUXILIARY_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__ALIAS_NAME = AUXILIARY_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__NAME = AUXILIARY_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__MODELING_AUTHORITY_SET = AUXILIARY_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__CHANGE_ITEMS = AUXILIARY_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__SCHEDULE_STEPS = AUXILIARY_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__SAFETY_DOCUMENTS = AUXILIARY_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__OPERATING_SHARE = AUXILIARY_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__DOCUMENT_ROLES = AUXILIARY_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__PSR_LISTS = AUXILIARY_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__MEASUREMENTS = AUXILIARY_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__REPORTING_GROUP = AUXILIARY_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__PSR_TYPE = AUXILIARY_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__ASSETS = AUXILIARY_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__ERP_ORGANISATION_ROLES = AUXILIARY_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__LOCATION = AUXILIARY_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__PSR_EVENT = AUXILIARY_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__NETWORK_DATA_SETS = AUXILIARY_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__OUTAGE_SCHEDULE = AUXILIARY_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__CONTINGENCY_EQUIPMENT = AUXILIARY_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__CUSTOMER_AGREEMENTS = AUXILIARY_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__NORMALLY_IN_SERVICE = AUXILIARY_EQUIPMENT__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__AGGREGATE = AUXILIARY_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__EQUIPMENT_CONTAINER = AUXILIARY_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__TERMINAL = AUXILIARY_EQUIPMENT__TERMINAL;

	/**
	 * The feature id for the '<em><b>Surge Protector Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR__SURGE_PROTECTOR_INFO = AUXILIARY_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Surge Protector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR_FEATURE_COUNT = AUXILIARY_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Surge Protector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR_OPERATION_COUNT = AUXILIARY_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.AuxiliaryEquipment.FaultIndicator <em>Fault Indicator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.AuxiliaryEquipment.FaultIndicator
	 * @see CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipmentPackage#getFaultIndicator()
	 * @generated
	 */
	public static final int FAULT_INDICATOR = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__UUID = AUXILIARY_EQUIPMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__NAMES = AUXILIARY_EQUIPMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__DIAGRAM_OBJECTS = AUXILIARY_EQUIPMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__MRID = AUXILIARY_EQUIPMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__ALIAS_NAME = AUXILIARY_EQUIPMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__NAME = AUXILIARY_EQUIPMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__MODELING_AUTHORITY_SET = AUXILIARY_EQUIPMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__CHANGE_ITEMS = AUXILIARY_EQUIPMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Schedule Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__SCHEDULE_STEPS = AUXILIARY_EQUIPMENT__SCHEDULE_STEPS;

	/**
	 * The feature id for the '<em><b>Safety Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__SAFETY_DOCUMENTS = AUXILIARY_EQUIPMENT__SAFETY_DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Operating Share</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__OPERATING_SHARE = AUXILIARY_EQUIPMENT__OPERATING_SHARE;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__DOCUMENT_ROLES = AUXILIARY_EQUIPMENT__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Psr Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__PSR_LISTS = AUXILIARY_EQUIPMENT__PSR_LISTS;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__MEASUREMENTS = AUXILIARY_EQUIPMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Reporting Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__REPORTING_GROUP = AUXILIARY_EQUIPMENT__REPORTING_GROUP;

	/**
	 * The feature id for the '<em><b>PSR Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__PSR_TYPE = AUXILIARY_EQUIPMENT__PSR_TYPE;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__ASSETS = AUXILIARY_EQUIPMENT__ASSETS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__ERP_ORGANISATION_ROLES = AUXILIARY_EQUIPMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__LOCATION = AUXILIARY_EQUIPMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>PSR Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__PSR_EVENT = AUXILIARY_EQUIPMENT__PSR_EVENT;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__NETWORK_DATA_SETS = AUXILIARY_EQUIPMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Outage Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__OUTAGE_SCHEDULE = AUXILIARY_EQUIPMENT__OUTAGE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Contingency Equipment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__CONTINGENCY_EQUIPMENT = AUXILIARY_EQUIPMENT__CONTINGENCY_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__CUSTOMER_AGREEMENTS = AUXILIARY_EQUIPMENT__CUSTOMER_AGREEMENTS;

	/**
	 * The feature id for the '<em><b>Normally In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__NORMALLY_IN_SERVICE = AUXILIARY_EQUIPMENT__NORMALLY_IN_SERVICE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__AGGREGATE = AUXILIARY_EQUIPMENT__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Equipment Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__EQUIPMENT_CONTAINER = AUXILIARY_EQUIPMENT__EQUIPMENT_CONTAINER;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__TERMINAL = AUXILIARY_EQUIPMENT__TERMINAL;

	/**
	 * The feature id for the '<em><b>Fault Indicator Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR__FAULT_INDICATOR_INFO = AUXILIARY_EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fault Indicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR_FEATURE_COUNT = AUXILIARY_EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fault Indicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR_OPERATION_COUNT = AUXILIARY_EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass potentialTransformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auxiliaryEquipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentTransformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surgeProtectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faultIndicatorEClass = null;

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
	 * @see CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipmentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AuxiliaryEquipmentPackage() {
		super(eNS_URI, AuxiliaryEquipmentFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link AuxiliaryEquipmentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static AuxiliaryEquipmentPackage init() {
		if (isInited) return (AuxiliaryEquipmentPackage)EPackage.Registry.INSTANCE.getEPackage(AuxiliaryEquipmentPackage.eNS_URI);

		// Obtain or create and register package
		AuxiliaryEquipmentPackage theAuxiliaryEquipmentPackage = (AuxiliaryEquipmentPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AuxiliaryEquipmentPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AuxiliaryEquipmentPackage());

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
		LoadModelPackage theLoadModelPackage = (LoadModelPackage)(EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI) instanceof LoadModelPackage ? EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI) : LoadModelPackage.eINSTANCE);
		WiresPhaseModelPackage theWiresPhaseModelPackage = (WiresPhaseModelPackage)(EPackage.Registry.INSTANCE.getEPackage(WiresPhaseModelPackage.eNS_URI) instanceof WiresPhaseModelPackage ? EPackage.Registry.INSTANCE.getEPackage(WiresPhaseModelPackage.eNS_URI) : WiresPhaseModelPackage.eINSTANCE);
		ControlAreaPackage theControlAreaPackage = (ControlAreaPackage)(EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI) instanceof ControlAreaPackage ? EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI) : ControlAreaPackage.eINSTANCE);
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
		theAuxiliaryEquipmentPackage.fixPackageContents();
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
		theLoadModelPackage.fixPackageContents();
		theWiresPhaseModelPackage.fixPackageContents();
		theControlAreaPackage.fixPackageContents();
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
		theAuxiliaryEquipmentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AuxiliaryEquipmentPackage.eNS_URI, theAuxiliaryEquipmentPackage);
		return theAuxiliaryEquipmentPackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer <em>Potential Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Potential Transformer</em>'.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer
	 * @generated
	 */
	public EClass getPotentialTransformer() {
		if (potentialTransformerEClass == null) {
			potentialTransformerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AuxiliaryEquipmentPackage.eNS_URI).getEClassifiers().get(0);
		}
		return potentialTransformerEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer#getPTInfo <em>PT Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>PT Info</em>'.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer#getPTInfo()
	 * @see #getPotentialTransformer()
	 * @generated
	 */
	public EReference getPotentialTransformer_PTInfo() {
        return (EReference)getPotentialTransformer().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer#getNominalRatio <em>Nominal Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal Ratio</em>'.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer#getNominalRatio()
	 * @see #getPotentialTransformer()
	 * @generated
	 */
	public EAttribute getPotentialTransformer_NominalRatio() {
        return (EAttribute)getPotentialTransformer().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer#getAccuracyClass <em>Accuracy Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy Class</em>'.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer#getAccuracyClass()
	 * @see #getPotentialTransformer()
	 * @generated
	 */
	public EAttribute getPotentialTransformer_AccuracyClass() {
        return (EAttribute)getPotentialTransformer().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer#getPtClass <em>Pt Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pt Class</em>'.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer#getPtClass()
	 * @see #getPotentialTransformer()
	 * @generated
	 */
	public EAttribute getPotentialTransformer_PtClass() {
        return (EAttribute)getPotentialTransformer().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.AuxiliaryEquipment.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.Sensor
	 * @generated
	 */
	public EClass getSensor() {
		if (sensorEClass == null) {
			sensorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AuxiliaryEquipmentPackage.eNS_URI).getEClassifiers().get(1);
		}
		return sensorEClass;
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipment <em>Auxiliary Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auxiliary Equipment</em>'.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipment
	 * @generated
	 */
	public EClass getAuxiliaryEquipment() {
		if (auxiliaryEquipmentEClass == null) {
			auxiliaryEquipmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AuxiliaryEquipmentPackage.eNS_URI).getEClassifiers().get(2);
		}
		return auxiliaryEquipmentEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipment#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipment#getTerminal()
	 * @see #getAuxiliaryEquipment()
	 * @generated
	 */
	public EReference getAuxiliaryEquipment_Terminal() {
        return (EReference)getAuxiliaryEquipment().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer <em>Current Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Transformer</em>'.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer
	 * @generated
	 */
	public EClass getCurrentTransformer() {
		if (currentTransformerEClass == null) {
			currentTransformerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AuxiliaryEquipmentPackage.eNS_URI).getEClassifiers().get(3);
		}
		return currentTransformerEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getCtClass <em>Ct Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ct Class</em>'.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getCtClass()
	 * @see #getCurrentTransformer()
	 * @generated
	 */
	public EAttribute getCurrentTransformer_CtClass() {
        return (EAttribute)getCurrentTransformer().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getAccuracyLimit <em>Accuracy Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy Limit</em>'.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getAccuracyLimit()
	 * @see #getCurrentTransformer()
	 * @generated
	 */
	public EAttribute getCurrentTransformer_AccuracyLimit() {
        return (EAttribute)getCurrentTransformer().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getUsage()
	 * @see #getCurrentTransformer()
	 * @generated
	 */
	public EAttribute getCurrentTransformer_Usage() {
        return (EAttribute)getCurrentTransformer().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getAccuracyClass <em>Accuracy Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy Class</em>'.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getAccuracyClass()
	 * @see #getCurrentTransformer()
	 * @generated
	 */
	public EAttribute getCurrentTransformer_AccuracyClass() {
        return (EAttribute)getCurrentTransformer().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getCoreCount <em>Core Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Count</em>'.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getCoreCount()
	 * @see #getCurrentTransformer()
	 * @generated
	 */
	public EAttribute getCurrentTransformer_CoreCount() {
        return (EAttribute)getCurrentTransformer().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getMaxRatio <em>Max Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Ratio</em>'.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getMaxRatio()
	 * @see #getCurrentTransformer()
	 * @generated
	 */
	public EAttribute getCurrentTransformer_MaxRatio() {
        return (EAttribute)getCurrentTransformer().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getCTInfo <em>CT Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CT Info</em>'.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getCTInfo()
	 * @see #getCurrentTransformer()
	 * @generated
	 */
	public EReference getCurrentTransformer_CTInfo() {
        return (EReference)getCurrentTransformer().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.AuxiliaryEquipment.SurgeProtector <em>Surge Protector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surge Protector</em>'.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.SurgeProtector
	 * @generated
	 */
	public EClass getSurgeProtector() {
		if (surgeProtectorEClass == null) {
			surgeProtectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AuxiliaryEquipmentPackage.eNS_URI).getEClassifiers().get(4);
		}
		return surgeProtectorEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.AuxiliaryEquipment.SurgeProtector#getSurgeProtectorInfo <em>Surge Protector Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Surge Protector Info</em>'.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.SurgeProtector#getSurgeProtectorInfo()
	 * @see #getSurgeProtector()
	 * @generated
	 */
	public EReference getSurgeProtector_SurgeProtectorInfo() {
        return (EReference)getSurgeProtector().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.AuxiliaryEquipment.FaultIndicator <em>Fault Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Indicator</em>'.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.FaultIndicator
	 * @generated
	 */
	public EClass getFaultIndicator() {
		if (faultIndicatorEClass == null) {
			faultIndicatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AuxiliaryEquipmentPackage.eNS_URI).getEClassifiers().get(5);
		}
		return faultIndicatorEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.AuxiliaryEquipment.FaultIndicator#getFaultIndicatorInfo <em>Fault Indicator Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault Indicator Info</em>'.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.FaultIndicator#getFaultIndicatorInfo()
	 * @see #getFaultIndicator()
	 * @generated
	 */
	public EReference getFaultIndicator_FaultIndicatorInfo() {
        return (EReference)getFaultIndicator().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public AuxiliaryEquipmentFactory getAuxiliaryEquipmentFactory() {
		return (AuxiliaryEquipmentFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM15.IEC61970.AuxiliaryEquipment." + eClassifier.getName());
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
		 * The meta object literal for the '{@link CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer <em>Potential Transformer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer
		 * @see CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipmentPackage#getPotentialTransformer()
		 * @generated
		 */
		public static final EClass POTENTIAL_TRANSFORMER = eINSTANCE.getPotentialTransformer();

		/**
		 * The meta object literal for the '<em><b>PT Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POTENTIAL_TRANSFORMER__PT_INFO = eINSTANCE.getPotentialTransformer_PTInfo();

		/**
		 * The meta object literal for the '<em><b>Nominal Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POTENTIAL_TRANSFORMER__NOMINAL_RATIO = eINSTANCE.getPotentialTransformer_NominalRatio();

		/**
		 * The meta object literal for the '<em><b>Accuracy Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POTENTIAL_TRANSFORMER__ACCURACY_CLASS = eINSTANCE.getPotentialTransformer_AccuracyClass();

		/**
		 * The meta object literal for the '<em><b>Pt Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POTENTIAL_TRANSFORMER__PT_CLASS = eINSTANCE.getPotentialTransformer_PtClass();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.AuxiliaryEquipment.Sensor <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.AuxiliaryEquipment.Sensor
		 * @see CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipmentPackage#getSensor()
		 * @generated
		 */
		public static final EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipment <em>Auxiliary Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipment
		 * @see CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipmentPackage#getAuxiliaryEquipment()
		 * @generated
		 */
		public static final EClass AUXILIARY_EQUIPMENT = eINSTANCE.getAuxiliaryEquipment();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AUXILIARY_EQUIPMENT__TERMINAL = eINSTANCE.getAuxiliaryEquipment_Terminal();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer <em>Current Transformer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer
		 * @see CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipmentPackage#getCurrentTransformer()
		 * @generated
		 */
		public static final EClass CURRENT_TRANSFORMER = eINSTANCE.getCurrentTransformer();

		/**
		 * The meta object literal for the '<em><b>Ct Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CURRENT_TRANSFORMER__CT_CLASS = eINSTANCE.getCurrentTransformer_CtClass();

		/**
		 * The meta object literal for the '<em><b>Accuracy Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CURRENT_TRANSFORMER__ACCURACY_LIMIT = eINSTANCE.getCurrentTransformer_AccuracyLimit();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CURRENT_TRANSFORMER__USAGE = eINSTANCE.getCurrentTransformer_Usage();

		/**
		 * The meta object literal for the '<em><b>Accuracy Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CURRENT_TRANSFORMER__ACCURACY_CLASS = eINSTANCE.getCurrentTransformer_AccuracyClass();

		/**
		 * The meta object literal for the '<em><b>Core Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CURRENT_TRANSFORMER__CORE_COUNT = eINSTANCE.getCurrentTransformer_CoreCount();

		/**
		 * The meta object literal for the '<em><b>Max Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CURRENT_TRANSFORMER__MAX_RATIO = eINSTANCE.getCurrentTransformer_MaxRatio();

		/**
		 * The meta object literal for the '<em><b>CT Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CURRENT_TRANSFORMER__CT_INFO = eINSTANCE.getCurrentTransformer_CTInfo();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.AuxiliaryEquipment.SurgeProtector <em>Surge Protector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.AuxiliaryEquipment.SurgeProtector
		 * @see CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipmentPackage#getSurgeProtector()
		 * @generated
		 */
		public static final EClass SURGE_PROTECTOR = eINSTANCE.getSurgeProtector();

		/**
		 * The meta object literal for the '<em><b>Surge Protector Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SURGE_PROTECTOR__SURGE_PROTECTOR_INFO = eINSTANCE.getSurgeProtector_SurgeProtectorInfo();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.AuxiliaryEquipment.FaultIndicator <em>Fault Indicator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.AuxiliaryEquipment.FaultIndicator
		 * @see CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipmentPackage#getFaultIndicator()
		 * @generated
		 */
		public static final EClass FAULT_INDICATOR = eINSTANCE.getFaultIndicator();

		/**
		 * The meta object literal for the '<em><b>Fault Indicator Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference FAULT_INDICATOR__FAULT_INDICATOR_INFO = eINSTANCE.getFaultIndicator_FaultIndicatorInfo();

	}

} //AuxiliaryEquipmentPackage
