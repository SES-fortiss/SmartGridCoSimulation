/**
 */
package CIM15.IEC61970.Informative.InfAssets;

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
 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsFactory
 * @generated
 */
public class InfAssetsPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "InfAssets";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#InfAssets";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimInfAssets";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfAssetsPackage eINSTANCE = CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.FACTSDevice <em>FACTS Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.FACTSDevice
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getFACTSDevice()
	 * @generated
	 */
	public static final int FACTS_DEVICE = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__UUID = AssetsPackage.ASSET__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__NAMES = AssetsPackage.ASSET__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__DIAGRAM_OBJECTS = AssetsPackage.ASSET__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__MRID = AssetsPackage.ASSET__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__ALIAS_NAME = AssetsPackage.ASSET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__NAME = AssetsPackage.ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__MODELING_AUTHORITY_SET = AssetsPackage.ASSET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__DOCUMENT_ROLES = AssetsPackage.ASSET__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__MEDIUMS = AssetsPackage.ASSET__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__RATINGS = AssetsPackage.ASSET__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__TO_ASSET_ROLES = AssetsPackage.ASSET__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__ELECTRONIC_ADDRESS = AssetsPackage.ASSET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__FROM_ASSET_ROLES = AssetsPackage.ASSET__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__ASSET_FUNCTIONS = AssetsPackage.ASSET__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__ERP_ITEM_MASTER = AssetsPackage.ASSET__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__CORPORATE_CODE = AssetsPackage.ASSET__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__ERP_INVENTORY = AssetsPackage.ASSET__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__RELIABILITY_INFOS = AssetsPackage.ASSET__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__UTC_NUMBER = AssetsPackage.ASSET__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__ASSET_INFO = AssetsPackage.ASSET__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__WORK_TASK = AssetsPackage.ASSET__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__INITIAL_CONDITION = AssetsPackage.ASSET__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__ACCEPTANCE_TEST = AssetsPackage.ASSET__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__SCHEDULED_EVENTS = AssetsPackage.ASSET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__ASSET_CONTAINER = AssetsPackage.ASSET__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__CATEGORY = AssetsPackage.ASSET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__SERIAL_NUMBER = AssetsPackage.ASSET__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__CHANGE_ITEMS = AssetsPackage.ASSET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__ACTIVITY_RECORDS = AssetsPackage.ASSET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__LOCATION = AssetsPackage.ASSET__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__CRITICAL = AssetsPackage.ASSET__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__STATUS = AssetsPackage.ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__APPLICATION = AssetsPackage.ASSET__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__PURCHASE_PRICE = AssetsPackage.ASSET__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__MANUFACTURED_DATE = AssetsPackage.ASSET__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__FINANCIAL_INFO = AssetsPackage.ASSET__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__INSTALLATION_DATE = AssetsPackage.ASSET__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__PROPERTIES = AssetsPackage.ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__MEASUREMENTS = AssetsPackage.ASSET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__LOT_NUMBER = AssetsPackage.ASSET__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE__KIND = AssetsPackage.ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FACTS Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE_FEATURE_COUNT = AssetsPackage.ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>FACTS Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACTS_DEVICE_OPERATION_COUNT = AssetsPackage.ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.DocAssetRole <em>Doc Asset Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.DocAssetRole
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getDocAssetRole()
	 * @generated
	 */
	public static final int DOC_ASSET_ROLE = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ASSET_ROLE__UUID = InfCommonPackage.ROLE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ASSET_ROLE__NAMES = InfCommonPackage.ROLE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ASSET_ROLE__DIAGRAM_OBJECTS = InfCommonPackage.ROLE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ASSET_ROLE__MRID = InfCommonPackage.ROLE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ASSET_ROLE__ALIAS_NAME = InfCommonPackage.ROLE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ASSET_ROLE__NAME = InfCommonPackage.ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ASSET_ROLE__MODELING_AUTHORITY_SET = InfCommonPackage.ROLE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ASSET_ROLE__CATEGORY = InfCommonPackage.ROLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ASSET_ROLE__STATUS = InfCommonPackage.ROLE__STATUS;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ASSET_ROLE__DOCUMENT = InfCommonPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ASSET_ROLE__ASSET = InfCommonPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Doc Asset Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ASSET_ROLE_FEATURE_COUNT = InfCommonPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Doc Asset Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOC_ASSET_ROLE_OPERATION_COUNT = InfCommonPackage.ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.DuctBank <em>Duct Bank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.DuctBank
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getDuctBank()
	 * @generated
	 */
	public static final int DUCT_BANK = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__UUID = AssetsPackage.ASSET_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__NAMES = AssetsPackage.ASSET_CONTAINER__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__DIAGRAM_OBJECTS = AssetsPackage.ASSET_CONTAINER__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__MRID = AssetsPackage.ASSET_CONTAINER__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__ALIAS_NAME = AssetsPackage.ASSET_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__NAME = AssetsPackage.ASSET_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_CONTAINER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__DOCUMENT_ROLES = AssetsPackage.ASSET_CONTAINER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__MEDIUMS = AssetsPackage.ASSET_CONTAINER__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET_CONTAINER__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__RATINGS = AssetsPackage.ASSET_CONTAINER__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__TO_ASSET_ROLES = AssetsPackage.ASSET_CONTAINER__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__ELECTRONIC_ADDRESS = AssetsPackage.ASSET_CONTAINER__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__FROM_ASSET_ROLES = AssetsPackage.ASSET_CONTAINER__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__ASSET_FUNCTIONS = AssetsPackage.ASSET_CONTAINER__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__ERP_ITEM_MASTER = AssetsPackage.ASSET_CONTAINER__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__CORPORATE_CODE = AssetsPackage.ASSET_CONTAINER__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__ERP_INVENTORY = AssetsPackage.ASSET_CONTAINER__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__RELIABILITY_INFOS = AssetsPackage.ASSET_CONTAINER__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__UTC_NUMBER = AssetsPackage.ASSET_CONTAINER__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__ASSET_INFO = AssetsPackage.ASSET_CONTAINER__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__WORK_TASK = AssetsPackage.ASSET_CONTAINER__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__INITIAL_CONDITION = AssetsPackage.ASSET_CONTAINER__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__ACCEPTANCE_TEST = AssetsPackage.ASSET_CONTAINER__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET_CONTAINER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__SCHEDULED_EVENTS = AssetsPackage.ASSET_CONTAINER__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__ASSET_CONTAINER = AssetsPackage.ASSET_CONTAINER__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__CATEGORY = AssetsPackage.ASSET_CONTAINER__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET_CONTAINER__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__SERIAL_NUMBER = AssetsPackage.ASSET_CONTAINER__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__CHANGE_ITEMS = AssetsPackage.ASSET_CONTAINER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__ACTIVITY_RECORDS = AssetsPackage.ASSET_CONTAINER__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__LOCATION = AssetsPackage.ASSET_CONTAINER__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__CRITICAL = AssetsPackage.ASSET_CONTAINER__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__STATUS = AssetsPackage.ASSET_CONTAINER__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__APPLICATION = AssetsPackage.ASSET_CONTAINER__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__PURCHASE_PRICE = AssetsPackage.ASSET_CONTAINER__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET_CONTAINER__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET_CONTAINER__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__MANUFACTURED_DATE = AssetsPackage.ASSET_CONTAINER__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__FINANCIAL_INFO = AssetsPackage.ASSET_CONTAINER__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__INSTALLATION_DATE = AssetsPackage.ASSET_CONTAINER__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__PROPERTIES = AssetsPackage.ASSET_CONTAINER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__MEASUREMENTS = AssetsPackage.ASSET_CONTAINER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__LOT_NUMBER = AssetsPackage.ASSET_CONTAINER__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Seals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__SEALS = AssetsPackage.ASSET_CONTAINER__SEALS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__ASSETS = AssetsPackage.ASSET_CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__LAND_PROPERTIES = AssetsPackage.ASSET_CONTAINER__LAND_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Duct Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__DUCT_INFOS = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Circuit Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK__CIRCUIT_COUNT = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Duct Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK_FEATURE_COUNT = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Duct Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_BANK_OPERATION_COUNT = AssetsPackage.ASSET_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset <em>Conductor Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.ConductorAsset
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getConductorAsset()
	 * @generated
	 */
	public static final int CONDUCTOR_ASSET = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__UUID = AssetsPackage.ASSET__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__NAMES = AssetsPackage.ASSET__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__DIAGRAM_OBJECTS = AssetsPackage.ASSET__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__MRID = AssetsPackage.ASSET__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__ALIAS_NAME = AssetsPackage.ASSET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__NAME = AssetsPackage.ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__MODELING_AUTHORITY_SET = AssetsPackage.ASSET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__DOCUMENT_ROLES = AssetsPackage.ASSET__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__MEDIUMS = AssetsPackage.ASSET__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__RATINGS = AssetsPackage.ASSET__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__TO_ASSET_ROLES = AssetsPackage.ASSET__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__ELECTRONIC_ADDRESS = AssetsPackage.ASSET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__FROM_ASSET_ROLES = AssetsPackage.ASSET__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__ASSET_FUNCTIONS = AssetsPackage.ASSET__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__ERP_ITEM_MASTER = AssetsPackage.ASSET__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__CORPORATE_CODE = AssetsPackage.ASSET__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__ERP_INVENTORY = AssetsPackage.ASSET__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__RELIABILITY_INFOS = AssetsPackage.ASSET__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__UTC_NUMBER = AssetsPackage.ASSET__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__ASSET_INFO = AssetsPackage.ASSET__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__WORK_TASK = AssetsPackage.ASSET__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__INITIAL_CONDITION = AssetsPackage.ASSET__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__ACCEPTANCE_TEST = AssetsPackage.ASSET__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__SCHEDULED_EVENTS = AssetsPackage.ASSET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__ASSET_CONTAINER = AssetsPackage.ASSET__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__CATEGORY = AssetsPackage.ASSET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__SERIAL_NUMBER = AssetsPackage.ASSET__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__CHANGE_ITEMS = AssetsPackage.ASSET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__ACTIVITY_RECORDS = AssetsPackage.ASSET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__LOCATION = AssetsPackage.ASSET__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__CRITICAL = AssetsPackage.ASSET__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__STATUS = AssetsPackage.ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__APPLICATION = AssetsPackage.ASSET__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__PURCHASE_PRICE = AssetsPackage.ASSET__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__MANUFACTURED_DATE = AssetsPackage.ASSET__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__FINANCIAL_INFO = AssetsPackage.ASSET__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__INSTALLATION_DATE = AssetsPackage.ASSET__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__PROPERTIES = AssetsPackage.ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__MEASUREMENTS = AssetsPackage.ASSET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__LOT_NUMBER = AssetsPackage.ASSET__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Is Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__IS_HORIZONTAL = AssetsPackage.ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Circuit Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__CIRCUIT_SECTION = AssetsPackage.ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Grounding Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__GROUNDING_METHOD = AssetsPackage.ASSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Insulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__INSULATED = AssetsPackage.ASSET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Conductor Segment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET__CONDUCTOR_SEGMENT = AssetsPackage.ASSET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Conductor Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET_FEATURE_COUNT = AssetsPackage.ASSET_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Conductor Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_ASSET_OPERATION_COUNT = AssetsPackage.ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo <em>Financial Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.FinancialInfo
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getFinancialInfo()
	 * @generated
	 */
	public static final int FINANCIAL_INFO = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINANCIAL_INFO__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINANCIAL_INFO__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINANCIAL_INFO__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINANCIAL_INFO__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINANCIAL_INFO__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINANCIAL_INFO__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINANCIAL_INFO__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Warranty End Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINANCIAL_INFO__WARRANTY_END_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cost Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINANCIAL_INFO__COST_DESCRIPTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Purchase Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINANCIAL_INFO__PURCHASE_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINANCIAL_INFO__ACCOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Financial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINANCIAL_INFO__FINANCIAL_VALUE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINANCIAL_INFO__ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Purchase Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINANCIAL_INFO__PURCHASE_ORDER_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Plant Transfer Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINANCIAL_INFO__PLANT_TRANSFER_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINANCIAL_INFO__QUANTITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Value Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINANCIAL_INFO__VALUE_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Cost Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINANCIAL_INFO__COST_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Actual Purchase Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINANCIAL_INFO__ACTUAL_PURCHASE_COST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Financial Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINANCIAL_INFO_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Financial Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FINANCIAL_INFO_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo <em>Protection Equipment Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getProtectionEquipmentInfo()
	 * @generated
	 */
	public static final int PROTECTION_EQUIPMENT_INFO = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTION_EQUIPMENT_INFO__UUID = AssetsPackage.ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTION_EQUIPMENT_INFO__NAMES = AssetsPackage.ASSET_INFO__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTION_EQUIPMENT_INFO__DIAGRAM_OBJECTS = AssetsPackage.ASSET_INFO__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTION_EQUIPMENT_INFO__MRID = AssetsPackage.ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTION_EQUIPMENT_INFO__ALIAS_NAME = AssetsPackage.ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTION_EQUIPMENT_INFO__NAME = AssetsPackage.ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTION_EQUIPMENT_INFO__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTION_EQUIPMENT_INFO__ASSETS = AssetsPackage.ASSET_INFO__ASSETS;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTION_EQUIPMENT_INFO__DIMENSIONS_INFO = AssetsPackage.ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTION_EQUIPMENT_INFO__ASSET_MODEL = AssetsPackage.ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Ground Trip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTION_EQUIPMENT_INFO__GROUND_TRIP = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Phase Trip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTION_EQUIPMENT_INFO__PHASE_TRIP = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Protection Equipment Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTION_EQUIPMENT_INFO_FEATURE_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Protection Equipment Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTION_EQUIPMENT_INFO_OPERATION_COUNT = AssetsPackage.ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet <em>Procedure Data Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getProcedureDataSet()
	 * @generated
	 */
	public static final int PROCEDURE_DATA_SET = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__PROPERTIES = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformer Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__TRANSFORMER_OBSERVATIONS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__PROCEDURE = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Completed Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__COMPLETED_DATE_TIME = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Measurement Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET__MEASUREMENT_VALUES = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Procedure Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Procedure Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_DATA_SET_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation <em>Winding Insulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.WindingInsulation
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getWindingInsulation()
	 * @generated
	 */
	public static final int WINDING_INSULATION = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WINDING_INSULATION__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WINDING_INSULATION__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WINDING_INSULATION__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WINDING_INSULATION__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WINDING_INSULATION__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WINDING_INSULATION__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WINDING_INSULATION__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Insulation PF Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WINDING_INSULATION__INSULATION_PF_STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ground</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WINDING_INSULATION__GROUND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transformer Observation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WINDING_INSULATION__TRANSFORMER_OBSERVATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Insulation Resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WINDING_INSULATION__INSULATION_RESISTANCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>To Winding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WINDING_INSULATION__TO_WINDING = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Leakage Reactance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WINDING_INSULATION__LEAKAGE_REACTANCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Winding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WINDING_INSULATION__FROM_WINDING = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WINDING_INSULATION__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Winding Insulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WINDING_INSULATION_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Winding Insulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WINDING_INSULATION_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.Specification <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.Specification
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getSpecification()
	 * @generated
	 */
	public static final int SPECIFICATION = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__ASSET_PROPERTY_CURVES = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__MEDIUMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Asset Properites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__ASSET_PROPERITES = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__RELIABILITY_INFOS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dimensions Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__DIMENSIONS_INFOS = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__RATINGS = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Qualification Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION__QUALIFICATION_REQUIREMENTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICATION_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.Structure <em>Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.Structure
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getStructure()
	 * @generated
	 */
	public static final int STRUCTURE = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__UUID = AssetsPackage.ASSET_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__NAMES = AssetsPackage.ASSET_CONTAINER__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__DIAGRAM_OBJECTS = AssetsPackage.ASSET_CONTAINER__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__MRID = AssetsPackage.ASSET_CONTAINER__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__ALIAS_NAME = AssetsPackage.ASSET_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__NAME = AssetsPackage.ASSET_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_CONTAINER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__DOCUMENT_ROLES = AssetsPackage.ASSET_CONTAINER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__MEDIUMS = AssetsPackage.ASSET_CONTAINER__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET_CONTAINER__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__RATINGS = AssetsPackage.ASSET_CONTAINER__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__TO_ASSET_ROLES = AssetsPackage.ASSET_CONTAINER__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__ELECTRONIC_ADDRESS = AssetsPackage.ASSET_CONTAINER__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__FROM_ASSET_ROLES = AssetsPackage.ASSET_CONTAINER__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__ASSET_FUNCTIONS = AssetsPackage.ASSET_CONTAINER__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__ERP_ITEM_MASTER = AssetsPackage.ASSET_CONTAINER__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__CORPORATE_CODE = AssetsPackage.ASSET_CONTAINER__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__ERP_INVENTORY = AssetsPackage.ASSET_CONTAINER__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__RELIABILITY_INFOS = AssetsPackage.ASSET_CONTAINER__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__UTC_NUMBER = AssetsPackage.ASSET_CONTAINER__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__ASSET_INFO = AssetsPackage.ASSET_CONTAINER__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__WORK_TASK = AssetsPackage.ASSET_CONTAINER__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__INITIAL_CONDITION = AssetsPackage.ASSET_CONTAINER__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__ACCEPTANCE_TEST = AssetsPackage.ASSET_CONTAINER__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET_CONTAINER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__SCHEDULED_EVENTS = AssetsPackage.ASSET_CONTAINER__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__ASSET_CONTAINER = AssetsPackage.ASSET_CONTAINER__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__CATEGORY = AssetsPackage.ASSET_CONTAINER__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET_CONTAINER__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__SERIAL_NUMBER = AssetsPackage.ASSET_CONTAINER__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__CHANGE_ITEMS = AssetsPackage.ASSET_CONTAINER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__ACTIVITY_RECORDS = AssetsPackage.ASSET_CONTAINER__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__LOCATION = AssetsPackage.ASSET_CONTAINER__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__CRITICAL = AssetsPackage.ASSET_CONTAINER__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__STATUS = AssetsPackage.ASSET_CONTAINER__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__APPLICATION = AssetsPackage.ASSET_CONTAINER__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__PURCHASE_PRICE = AssetsPackage.ASSET_CONTAINER__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET_CONTAINER__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET_CONTAINER__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__MANUFACTURED_DATE = AssetsPackage.ASSET_CONTAINER__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__FINANCIAL_INFO = AssetsPackage.ASSET_CONTAINER__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__INSTALLATION_DATE = AssetsPackage.ASSET_CONTAINER__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__PROPERTIES = AssetsPackage.ASSET_CONTAINER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__MEASUREMENTS = AssetsPackage.ASSET_CONTAINER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__LOT_NUMBER = AssetsPackage.ASSET_CONTAINER__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Seals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__SEALS = AssetsPackage.ASSET_CONTAINER__SEALS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__ASSETS = AssetsPackage.ASSET_CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__LAND_PROPERTIES = AssetsPackage.ASSET_CONTAINER__LAND_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__RATED_VOLTAGE = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Structure Support Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__STRUCTURE_SUPPORT_INFOS = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fumigant Applied Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__FUMIGANT_APPLIED_DATE = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Weed Removed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__WEED_REMOVED_DATE = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Remove Weed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__REMOVE_WEED = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__HEIGHT = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fumigant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__FUMIGANT_NAME = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mounting Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__MOUNTING_CONNECTIONS = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Material Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE__MATERIAL_KIND = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_FEATURE_COUNT = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_OPERATION_COUNT = AssetsPackage.ASSET_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructure <em>Underground Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.UndergroundStructure
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getUndergroundStructure()
	 * @generated
	 */
	public static final int UNDERGROUND_STRUCTURE = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__UUID = STRUCTURE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__NAMES = STRUCTURE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__DIAGRAM_OBJECTS = STRUCTURE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__MRID = STRUCTURE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__ALIAS_NAME = STRUCTURE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__NAME = STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__MODELING_AUTHORITY_SET = STRUCTURE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__DOCUMENT_ROLES = STRUCTURE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__MEDIUMS = STRUCTURE__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__ERP_REC_DELIVERY_ITEMS = STRUCTURE__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__RATINGS = STRUCTURE__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__TO_ASSET_ROLES = STRUCTURE__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__ELECTRONIC_ADDRESS = STRUCTURE__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__FROM_ASSET_ROLES = STRUCTURE__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__ASSET_FUNCTIONS = STRUCTURE__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__ERP_ITEM_MASTER = STRUCTURE__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__CORPORATE_CODE = STRUCTURE__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__ERP_INVENTORY = STRUCTURE__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__RELIABILITY_INFOS = STRUCTURE__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__UTC_NUMBER = STRUCTURE__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__ASSET_INFO = STRUCTURE__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__WORK_TASK = STRUCTURE__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__INITIAL_CONDITION = STRUCTURE__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__ACCEPTANCE_TEST = STRUCTURE__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__ERP_ORGANISATION_ROLES = STRUCTURE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__SCHEDULED_EVENTS = STRUCTURE__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__ASSET_CONTAINER = STRUCTURE__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__CATEGORY = STRUCTURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__ASSET_PROPERTY_CURVES = STRUCTURE__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__SERIAL_NUMBER = STRUCTURE__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__CHANGE_ITEMS = STRUCTURE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__ACTIVITY_RECORDS = STRUCTURE__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__LOCATION = STRUCTURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__CRITICAL = STRUCTURE__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__STATUS = STRUCTURE__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__APPLICATION = STRUCTURE__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__PURCHASE_PRICE = STRUCTURE__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__INITIAL_LOSS_OF_LIFE = STRUCTURE__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__POWER_SYSTEM_RESOURCES = STRUCTURE__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__MANUFACTURED_DATE = STRUCTURE__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__FINANCIAL_INFO = STRUCTURE__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__INSTALLATION_DATE = STRUCTURE__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__PROPERTIES = STRUCTURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__MEASUREMENTS = STRUCTURE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__LOT_NUMBER = STRUCTURE__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Seals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__SEALS = STRUCTURE__SEALS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__ASSETS = STRUCTURE__ASSETS;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__LAND_PROPERTIES = STRUCTURE__LAND_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__RATED_VOLTAGE = STRUCTURE__RATED_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Structure Support Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__STRUCTURE_SUPPORT_INFOS = STRUCTURE__STRUCTURE_SUPPORT_INFOS;

	/**
	 * The feature id for the '<em><b>Fumigant Applied Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__FUMIGANT_APPLIED_DATE = STRUCTURE__FUMIGANT_APPLIED_DATE;

	/**
	 * The feature id for the '<em><b>Weed Removed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__WEED_REMOVED_DATE = STRUCTURE__WEED_REMOVED_DATE;

	/**
	 * The feature id for the '<em><b>Remove Weed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__REMOVE_WEED = STRUCTURE__REMOVE_WEED;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__HEIGHT = STRUCTURE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Fumigant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__FUMIGANT_NAME = STRUCTURE__FUMIGANT_NAME;

	/**
	 * The feature id for the '<em><b>Mounting Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__MOUNTING_CONNECTIONS = STRUCTURE__MOUNTING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Material Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__MATERIAL_KIND = STRUCTURE__MATERIAL_KIND;

	/**
	 * The feature id for the '<em><b>Has Ventilation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__HAS_VENTILATION = STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__KIND = STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__MATERIAL = STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sealing Warranty Expires Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE__SEALING_WARRANTY_EXPIRES_DATE = STRUCTURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Underground Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE_FEATURE_COUNT = STRUCTURE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Underground Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_STRUCTURE_OPERATION_COUNT = STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo <em>Potential Transformer Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getPotentialTransformerInfo()
	 * @generated
	 */
	public static final int POTENTIAL_TRANSFORMER_INFO = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER_INFO__UUID = AssetsPackage.ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER_INFO__NAMES = AssetsPackage.ASSET_INFO__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER_INFO__DIAGRAM_OBJECTS = AssetsPackage.ASSET_INFO__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER_INFO__MRID = AssetsPackage.ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER_INFO__ALIAS_NAME = AssetsPackage.ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER_INFO__NAME = AssetsPackage.ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER_INFO__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER_INFO__ASSETS = AssetsPackage.ASSET_INFO__ASSETS;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER_INFO__DIMENSIONS_INFO = AssetsPackage.ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER_INFO__ASSET_MODEL = AssetsPackage.ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Nominal Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER_INFO__NOMINAL_RATIO = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pt Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER_INFO__PT_CLASS = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Primary Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER_INFO__PRIMARY_RATIO = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tertiary Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER_INFO__TERTIARY_RATIO = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Accuracy Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER_INFO__ACCURACY_CLASS = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>PTs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER_INFO__PTS = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Secondary Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER_INFO__SECONDARY_RATIO = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Potential Transformer Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER_INFO_FEATURE_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Potential Transformer Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POTENTIAL_TRANSFORMER_INFO_OPERATION_COUNT = AssetsPackage.ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo <em>Current Transformer Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getCurrentTransformerInfo()
	 * @generated
	 */
	public static final int CURRENT_TRANSFORMER_INFO = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__UUID = AssetsPackage.ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__NAMES = AssetsPackage.ASSET_INFO__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__DIAGRAM_OBJECTS = AssetsPackage.ASSET_INFO__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__MRID = AssetsPackage.ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__ALIAS_NAME = AssetsPackage.ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__NAME = AssetsPackage.ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__ASSETS = AssetsPackage.ASSET_INFO__ASSETS;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__DIMENSIONS_INFO = AssetsPackage.ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__ASSET_MODEL = AssetsPackage.ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Tertiary Fls Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__TERTIARY_FLS_RATING = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Core Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__CORE_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nominal Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__NOMINAL_RATIO = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Secondary Fls Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__SECONDARY_FLS_RATING = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__USAGE = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Accuracy Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__ACCURACY_CLASS = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Secondary Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__SECONDARY_RATIO = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CTs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__CTS = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ct Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__CT_CLASS = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Knee Point Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__KNEE_POINT_VOLTAGE = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Tertiary Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__TERTIARY_RATIO = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Core Burden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__CORE_BURDEN = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Max Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__MAX_RATIO = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Accuracy Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__ACCURACY_LIMIT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Knee Point Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__KNEE_POINT_CURRENT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Primary Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__PRIMARY_RATIO = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Primary Fls Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO__PRIMARY_FLS_RATING = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Current Transformer Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO_FEATURE_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Current Transformer Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_TRANSFORMER_INFO_OPERATION_COUNT = AssetsPackage.ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF <em>Bushing Insulation PF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getBushingInsulationPF()
	 * @generated
	 */
	public static final int BUSHING_INSULATION_PF = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING_INSULATION_PF__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING_INSULATION_PF__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING_INSULATION_PF__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING_INSULATION_PF__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING_INSULATION_PF__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING_INSULATION_PF__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING_INSULATION_PF__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING_INSULATION_PF__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformer Observation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING_INSULATION_PF__TRANSFORMER_OBSERVATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING_INSULATION_PF__TEST_KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bushing Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING_INSULATION_PF__BUSHING_INFO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bushing Insulation PF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING_INSULATION_PF_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Bushing Insulation PF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING_INSULATION_PF_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.Joint <em>Joint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.Joint
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getJoint()
	 * @generated
	 */
	public static final int JOINT = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__UUID = AssetsPackage.ASSET__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__NAMES = AssetsPackage.ASSET__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__DIAGRAM_OBJECTS = AssetsPackage.ASSET__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__MRID = AssetsPackage.ASSET__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__ALIAS_NAME = AssetsPackage.ASSET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__NAME = AssetsPackage.ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__MODELING_AUTHORITY_SET = AssetsPackage.ASSET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__DOCUMENT_ROLES = AssetsPackage.ASSET__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__MEDIUMS = AssetsPackage.ASSET__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__RATINGS = AssetsPackage.ASSET__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__TO_ASSET_ROLES = AssetsPackage.ASSET__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__ELECTRONIC_ADDRESS = AssetsPackage.ASSET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__FROM_ASSET_ROLES = AssetsPackage.ASSET__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__ASSET_FUNCTIONS = AssetsPackage.ASSET__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__ERP_ITEM_MASTER = AssetsPackage.ASSET__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__CORPORATE_CODE = AssetsPackage.ASSET__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__ERP_INVENTORY = AssetsPackage.ASSET__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__RELIABILITY_INFOS = AssetsPackage.ASSET__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__UTC_NUMBER = AssetsPackage.ASSET__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__ASSET_INFO = AssetsPackage.ASSET__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__WORK_TASK = AssetsPackage.ASSET__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__INITIAL_CONDITION = AssetsPackage.ASSET__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__ACCEPTANCE_TEST = AssetsPackage.ASSET__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__SCHEDULED_EVENTS = AssetsPackage.ASSET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__ASSET_CONTAINER = AssetsPackage.ASSET__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__CATEGORY = AssetsPackage.ASSET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__SERIAL_NUMBER = AssetsPackage.ASSET__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__CHANGE_ITEMS = AssetsPackage.ASSET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__ACTIVITY_RECORDS = AssetsPackage.ASSET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__LOCATION = AssetsPackage.ASSET__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__CRITICAL = AssetsPackage.ASSET__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__STATUS = AssetsPackage.ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__APPLICATION = AssetsPackage.ASSET__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__PURCHASE_PRICE = AssetsPackage.ASSET__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__MANUFACTURED_DATE = AssetsPackage.ASSET__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__FINANCIAL_INFO = AssetsPackage.ASSET__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__INSTALLATION_DATE = AssetsPackage.ASSET__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__PROPERTIES = AssetsPackage.ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__MEASUREMENTS = AssetsPackage.ASSET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__LOT_NUMBER = AssetsPackage.ASSET__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Insulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__INSULATION = AssetsPackage.ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fill Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__FILL_KIND = AssetsPackage.ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Configuration Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT__CONFIGURATION_KIND = AssetsPackage.ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Joint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT_FEATURE_COUNT = AssetsPackage.ASSET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Joint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOINT_OPERATION_COUNT = AssetsPackage.ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo <em>Electrical Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.ElectricalInfo
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalInfo()
	 * @generated
	 */
	public static final int ELECTRICAL_INFO = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__UUID = AssetsPackage.ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__NAMES = AssetsPackage.ASSET_INFO__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__DIAGRAM_OBJECTS = AssetsPackage.ASSET_INFO__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__MRID = AssetsPackage.ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__ALIAS_NAME = AssetsPackage.ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__NAME = AssetsPackage.ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__ASSETS = AssetsPackage.ASSET_INFO__ASSETS;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__DIMENSIONS_INFO = AssetsPackage.ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__ASSET_MODEL = AssetsPackage.ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__PHASE_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rated Apparent Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__RATED_APPARENT_POWER = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__PHASE_CODE = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__FREQUENCY = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__R0 = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__R = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__BIL = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__X0 = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__X = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__RATED_CURRENT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Wire Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__WIRE_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__B0 = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__B = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__RATED_VOLTAGE = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__G = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__G0 = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO__IS_CONNECTED = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Electrical Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO_FEATURE_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Electrical Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_INFO_OPERATION_COUNT = AssetsPackage.ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.WorkEquipment <em>Work Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.WorkEquipment
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getWorkEquipment()
	 * @generated
	 */
	public static final int WORK_EQUIPMENT = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__UUID = AssetsPackage.ASSET__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__NAMES = AssetsPackage.ASSET__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__DIAGRAM_OBJECTS = AssetsPackage.ASSET__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__MRID = AssetsPackage.ASSET__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__ALIAS_NAME = AssetsPackage.ASSET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__NAME = AssetsPackage.ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__MODELING_AUTHORITY_SET = AssetsPackage.ASSET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__DOCUMENT_ROLES = AssetsPackage.ASSET__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__MEDIUMS = AssetsPackage.ASSET__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__RATINGS = AssetsPackage.ASSET__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__TO_ASSET_ROLES = AssetsPackage.ASSET__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__ELECTRONIC_ADDRESS = AssetsPackage.ASSET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__FROM_ASSET_ROLES = AssetsPackage.ASSET__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__ASSET_FUNCTIONS = AssetsPackage.ASSET__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__ERP_ITEM_MASTER = AssetsPackage.ASSET__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__CORPORATE_CODE = AssetsPackage.ASSET__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__ERP_INVENTORY = AssetsPackage.ASSET__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__RELIABILITY_INFOS = AssetsPackage.ASSET__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__UTC_NUMBER = AssetsPackage.ASSET__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__ASSET_INFO = AssetsPackage.ASSET__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__WORK_TASK = AssetsPackage.ASSET__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__INITIAL_CONDITION = AssetsPackage.ASSET__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__ACCEPTANCE_TEST = AssetsPackage.ASSET__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__SCHEDULED_EVENTS = AssetsPackage.ASSET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__ASSET_CONTAINER = AssetsPackage.ASSET__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__CATEGORY = AssetsPackage.ASSET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__SERIAL_NUMBER = AssetsPackage.ASSET__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__CHANGE_ITEMS = AssetsPackage.ASSET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__ACTIVITY_RECORDS = AssetsPackage.ASSET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__LOCATION = AssetsPackage.ASSET__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__CRITICAL = AssetsPackage.ASSET__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__STATUS = AssetsPackage.ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__APPLICATION = AssetsPackage.ASSET__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__PURCHASE_PRICE = AssetsPackage.ASSET__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__MANUFACTURED_DATE = AssetsPackage.ASSET__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__FINANCIAL_INFO = AssetsPackage.ASSET__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__INSTALLATION_DATE = AssetsPackage.ASSET__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__PROPERTIES = AssetsPackage.ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__MEASUREMENTS = AssetsPackage.ASSET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__LOT_NUMBER = AssetsPackage.ASSET__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Crew</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__CREW = AssetsPackage.ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT__USAGES = AssetsPackage.ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Work Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT_FEATURE_COUNT = AssetsPackage.ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Work Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WORK_EQUIPMENT_OPERATION_COUNT = AssetsPackage.ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.FaultIndicatorInfo <em>Fault Indicator Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.FaultIndicatorInfo
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getFaultIndicatorInfo()
	 * @generated
	 */
	public static final int FAULT_INDICATOR_INFO = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR_INFO__UUID = AssetsPackage.ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR_INFO__NAMES = AssetsPackage.ASSET_INFO__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR_INFO__DIAGRAM_OBJECTS = AssetsPackage.ASSET_INFO__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR_INFO__MRID = AssetsPackage.ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR_INFO__ALIAS_NAME = AssetsPackage.ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR_INFO__NAME = AssetsPackage.ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR_INFO__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR_INFO__ASSETS = AssetsPackage.ASSET_INFO__ASSETS;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR_INFO__DIMENSIONS_INFO = AssetsPackage.ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR_INFO__ASSET_MODEL = AssetsPackage.ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Fault Indicators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR_INFO__FAULT_INDICATORS = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reset Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR_INFO__RESET_KIND = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fault Indicator Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR_INFO_FEATURE_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fault Indicator Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_INDICATOR_INFO_OPERATION_COUNT = AssetsPackage.ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.Duct <em>Duct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.Duct
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getDuct()
	 * @generated
	 */
	public static final int DUCT = 18;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__UUID = AssetsPackage.ASSET_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__NAMES = AssetsPackage.ASSET_CONTAINER__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__DIAGRAM_OBJECTS = AssetsPackage.ASSET_CONTAINER__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__MRID = AssetsPackage.ASSET_CONTAINER__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__ALIAS_NAME = AssetsPackage.ASSET_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__NAME = AssetsPackage.ASSET_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_CONTAINER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__DOCUMENT_ROLES = AssetsPackage.ASSET_CONTAINER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__MEDIUMS = AssetsPackage.ASSET_CONTAINER__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET_CONTAINER__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__RATINGS = AssetsPackage.ASSET_CONTAINER__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__TO_ASSET_ROLES = AssetsPackage.ASSET_CONTAINER__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__ELECTRONIC_ADDRESS = AssetsPackage.ASSET_CONTAINER__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__FROM_ASSET_ROLES = AssetsPackage.ASSET_CONTAINER__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__ASSET_FUNCTIONS = AssetsPackage.ASSET_CONTAINER__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__ERP_ITEM_MASTER = AssetsPackage.ASSET_CONTAINER__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__CORPORATE_CODE = AssetsPackage.ASSET_CONTAINER__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__ERP_INVENTORY = AssetsPackage.ASSET_CONTAINER__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__RELIABILITY_INFOS = AssetsPackage.ASSET_CONTAINER__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__UTC_NUMBER = AssetsPackage.ASSET_CONTAINER__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__ASSET_INFO = AssetsPackage.ASSET_CONTAINER__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__WORK_TASK = AssetsPackage.ASSET_CONTAINER__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__INITIAL_CONDITION = AssetsPackage.ASSET_CONTAINER__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__ACCEPTANCE_TEST = AssetsPackage.ASSET_CONTAINER__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET_CONTAINER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__SCHEDULED_EVENTS = AssetsPackage.ASSET_CONTAINER__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__ASSET_CONTAINER = AssetsPackage.ASSET_CONTAINER__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__CATEGORY = AssetsPackage.ASSET_CONTAINER__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET_CONTAINER__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__SERIAL_NUMBER = AssetsPackage.ASSET_CONTAINER__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__CHANGE_ITEMS = AssetsPackage.ASSET_CONTAINER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__ACTIVITY_RECORDS = AssetsPackage.ASSET_CONTAINER__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__LOCATION = AssetsPackage.ASSET_CONTAINER__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__CRITICAL = AssetsPackage.ASSET_CONTAINER__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__STATUS = AssetsPackage.ASSET_CONTAINER__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__APPLICATION = AssetsPackage.ASSET_CONTAINER__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__PURCHASE_PRICE = AssetsPackage.ASSET_CONTAINER__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET_CONTAINER__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET_CONTAINER__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__MANUFACTURED_DATE = AssetsPackage.ASSET_CONTAINER__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__FINANCIAL_INFO = AssetsPackage.ASSET_CONTAINER__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__INSTALLATION_DATE = AssetsPackage.ASSET_CONTAINER__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__PROPERTIES = AssetsPackage.ASSET_CONTAINER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__MEASUREMENTS = AssetsPackage.ASSET_CONTAINER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__LOT_NUMBER = AssetsPackage.ASSET_CONTAINER__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Seals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__SEALS = AssetsPackage.ASSET_CONTAINER__SEALS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__ASSETS = AssetsPackage.ASSET_CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__LAND_PROPERTIES = AssetsPackage.ASSET_CONTAINER__LAND_PROPERTIES;

	/**
	 * The feature id for the '<em><b>XCoord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__XCOORD = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YCoord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__YCOORD = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duct Bank Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__DUCT_BANK_INFO = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cable Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT__CABLE_INFOS = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Duct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_FEATURE_COUNT = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Duct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUCT_OPERATION_COUNT = AssetsPackage.ASSET_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.PowerRating <em>Power Rating</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.PowerRating
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getPowerRating()
	 * @generated
	 */
	public static final int POWER_RATING = 19;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_RATING__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_RATING__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_RATING__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_RATING__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_RATING__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_RATING__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_RATING__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Transformer Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_RATING__TRANSFORMER_ASSETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_RATING__STAGE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Power Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_RATING__POWER_RATING = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cooling Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_RATING__COOLING_KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Power Rating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_RATING_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Power Rating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_RATING_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.AssetAssetRole <em>Asset Asset Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.AssetAssetRole
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getAssetAssetRole()
	 * @generated
	 */
	public static final int ASSET_ASSET_ROLE = 20;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_ASSET_ROLE__UUID = InfCommonPackage.ROLE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_ASSET_ROLE__NAMES = InfCommonPackage.ROLE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_ASSET_ROLE__DIAGRAM_OBJECTS = InfCommonPackage.ROLE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_ASSET_ROLE__MRID = InfCommonPackage.ROLE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_ASSET_ROLE__ALIAS_NAME = InfCommonPackage.ROLE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_ASSET_ROLE__NAME = InfCommonPackage.ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_ASSET_ROLE__MODELING_AUTHORITY_SET = InfCommonPackage.ROLE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_ASSET_ROLE__CATEGORY = InfCommonPackage.ROLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_ASSET_ROLE__STATUS = InfCommonPackage.ROLE__STATUS;

	/**
	 * The feature id for the '<em><b>To Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_ASSET_ROLE__TO_ASSET = InfCommonPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_ASSET_ROLE__FROM_ASSET = InfCommonPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Asset Asset Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_ASSET_ROLE_FEATURE_COUNT = InfCommonPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Asset Asset Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_ASSET_ROLE_OPERATION_COUNT = InfCommonPackage.ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerAsset <em>Transformer Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerAsset
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerAsset()
	 * @generated
	 */
	public static final int TRANSFORMER_ASSET = 21;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__UUID = AssetsPackage.ASSET__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__NAMES = AssetsPackage.ASSET__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__DIAGRAM_OBJECTS = AssetsPackage.ASSET__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__MRID = AssetsPackage.ASSET__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__ALIAS_NAME = AssetsPackage.ASSET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__NAME = AssetsPackage.ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__MODELING_AUTHORITY_SET = AssetsPackage.ASSET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__DOCUMENT_ROLES = AssetsPackage.ASSET__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__MEDIUMS = AssetsPackage.ASSET__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__RATINGS = AssetsPackage.ASSET__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__TO_ASSET_ROLES = AssetsPackage.ASSET__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__ELECTRONIC_ADDRESS = AssetsPackage.ASSET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__FROM_ASSET_ROLES = AssetsPackage.ASSET__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__ASSET_FUNCTIONS = AssetsPackage.ASSET__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__ERP_ITEM_MASTER = AssetsPackage.ASSET__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__CORPORATE_CODE = AssetsPackage.ASSET__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__ERP_INVENTORY = AssetsPackage.ASSET__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__RELIABILITY_INFOS = AssetsPackage.ASSET__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__UTC_NUMBER = AssetsPackage.ASSET__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__ASSET_INFO = AssetsPackage.ASSET__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__WORK_TASK = AssetsPackage.ASSET__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__INITIAL_CONDITION = AssetsPackage.ASSET__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__ACCEPTANCE_TEST = AssetsPackage.ASSET__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__SCHEDULED_EVENTS = AssetsPackage.ASSET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__ASSET_CONTAINER = AssetsPackage.ASSET__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__CATEGORY = AssetsPackage.ASSET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__SERIAL_NUMBER = AssetsPackage.ASSET__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__CHANGE_ITEMS = AssetsPackage.ASSET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__ACTIVITY_RECORDS = AssetsPackage.ASSET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__LOCATION = AssetsPackage.ASSET__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__CRITICAL = AssetsPackage.ASSET__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__STATUS = AssetsPackage.ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__APPLICATION = AssetsPackage.ASSET__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__PURCHASE_PRICE = AssetsPackage.ASSET__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__MANUFACTURED_DATE = AssetsPackage.ASSET__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__FINANCIAL_INFO = AssetsPackage.ASSET__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__INSTALLATION_DATE = AssetsPackage.ASSET__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__PROPERTIES = AssetsPackage.ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__MEASUREMENTS = AssetsPackage.ASSET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__LOT_NUMBER = AssetsPackage.ASSET__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Power Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__POWER_RATINGS = AssetsPackage.ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformer Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__TRANSFORMER_OBSERVATIONS = AssetsPackage.ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reconditioned Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__RECONDITIONED_DATE_TIME = AssetsPackage.ASSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformer Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__TRANSFORMER_INFO = AssetsPackage.ASSET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transformer Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET__TRANSFORMER_ASSET_MODEL = AssetsPackage.ASSET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transformer Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_FEATURE_COUNT = AssetsPackage.ASSET_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Transformer Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_OPERATION_COUNT = AssetsPackage.ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.Procedure <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.Procedure
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getProcedure()
	 * @generated
	 */
	public static final int PROCEDURE = 22;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__CORPORATE_CODE = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Procedure Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__PROCEDURE_VALUES = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__SEQUENCE_NUMBER = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__PROCEDURE_DATA_SETS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Compatible Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__COMPATIBLE_UNITS = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__KIND = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__LIMITS = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE__INSTRUCTION = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo <em>Switch Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.SwitchInfo
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getSwitchInfo()
	 * @generated
	 */
	public static final int SWITCH_INFO = 52;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_INFO__UUID = AssetsPackage.ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_INFO__NAMES = AssetsPackage.ASSET_INFO__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_INFO__DIAGRAM_OBJECTS = AssetsPackage.ASSET_INFO__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_INFO__MRID = AssetsPackage.ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_INFO__ALIAS_NAME = AssetsPackage.ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_INFO__NAME = AssetsPackage.ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_INFO__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_INFO__ASSETS = AssetsPackage.ASSET_INFO__ASSETS;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_INFO__DIMENSIONS_INFO = AssetsPackage.ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_INFO__ASSET_MODEL = AssetsPackage.ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dielectric Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_INFO__DIELECTRIC_STRENGTH = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_INFO__GANG = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Making Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_INFO__MAKING_CAPACITY = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Withstand Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_INFO__WITHSTAND_CURRENT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Load Break</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_INFO__LOAD_BREAK = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Minimum Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_INFO__MINIMUM_CURRENT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Interrupting Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_INFO__INTERRUPTING_RATING = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_INFO__REMOTE = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pole Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_INFO__POLE_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Switch Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_INFO_FEATURE_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Switch Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_INFO_OPERATION_COUNT = AssetsPackage.ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.BreakerInfo <em>Breaker Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.BreakerInfo
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getBreakerInfo()
	 * @generated
	 */
	public static final int BREAKER_INFO = 23;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_INFO__UUID = SWITCH_INFO__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_INFO__NAMES = SWITCH_INFO__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_INFO__DIAGRAM_OBJECTS = SWITCH_INFO__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_INFO__MRID = SWITCH_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_INFO__ALIAS_NAME = SWITCH_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_INFO__NAME = SWITCH_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_INFO__MODELING_AUTHORITY_SET = SWITCH_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_INFO__ASSETS = SWITCH_INFO__ASSETS;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_INFO__DIMENSIONS_INFO = SWITCH_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_INFO__ASSET_MODEL = SWITCH_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dielectric Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_INFO__DIELECTRIC_STRENGTH = SWITCH_INFO__DIELECTRIC_STRENGTH;

	/**
	 * The feature id for the '<em><b>Gang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_INFO__GANG = SWITCH_INFO__GANG;

	/**
	 * The feature id for the '<em><b>Making Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_INFO__MAKING_CAPACITY = SWITCH_INFO__MAKING_CAPACITY;

	/**
	 * The feature id for the '<em><b>Withstand Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_INFO__WITHSTAND_CURRENT = SWITCH_INFO__WITHSTAND_CURRENT;

	/**
	 * The feature id for the '<em><b>Load Break</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_INFO__LOAD_BREAK = SWITCH_INFO__LOAD_BREAK;

	/**
	 * The feature id for the '<em><b>Minimum Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_INFO__MINIMUM_CURRENT = SWITCH_INFO__MINIMUM_CURRENT;

	/**
	 * The feature id for the '<em><b>Interrupting Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_INFO__INTERRUPTING_RATING = SWITCH_INFO__INTERRUPTING_RATING;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_INFO__REMOTE = SWITCH_INFO__REMOTE;

	/**
	 * The feature id for the '<em><b>Pole Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_INFO__POLE_COUNT = SWITCH_INFO__POLE_COUNT;

	/**
	 * The feature id for the '<em><b>Phase Trip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_INFO__PHASE_TRIP = SWITCH_INFO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Breaker Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_INFO_FEATURE_COUNT = SWITCH_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Breaker Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BREAKER_INFO_OPERATION_COUNT = SWITCH_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo <em>Composite Switch Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getCompositeSwitchInfo()
	 * @generated
	 */
	public static final int COMPOSITE_SWITCH_INFO = 24;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH_INFO__UUID = AssetsPackage.ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH_INFO__NAMES = AssetsPackage.ASSET_INFO__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH_INFO__DIAGRAM_OBJECTS = AssetsPackage.ASSET_INFO__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH_INFO__MRID = AssetsPackage.ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH_INFO__ALIAS_NAME = AssetsPackage.ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH_INFO__NAME = AssetsPackage.ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH_INFO__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH_INFO__ASSETS = AssetsPackage.ASSET_INFO__ASSETS;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH_INFO__DIMENSIONS_INFO = AssetsPackage.ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH_INFO__ASSET_MODEL = AssetsPackage.ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH_INFO__KIND = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH_INFO__PHASE_CODE = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH_INFO__REMOTE = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Switch State Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH_INFO__SWITCH_STATE_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH_INFO__RATED_VOLTAGE = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ganged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH_INFO__GANGED = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH_INFO__PHASE_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Init Op Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH_INFO__INIT_OP_MODE = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Interrupting Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH_INFO__INTERRUPTING_RATING = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Composite Switch Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH_INFO_FEATURE_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Composite Switch Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_SWITCH_INFO_OPERATION_COUNT = AssetsPackage.ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.Cabinet <em>Cabinet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.Cabinet
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getCabinet()
	 * @generated
	 */
	public static final int CABINET = 25;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__UUID = AssetsPackage.ASSET_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__NAMES = AssetsPackage.ASSET_CONTAINER__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__DIAGRAM_OBJECTS = AssetsPackage.ASSET_CONTAINER__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__MRID = AssetsPackage.ASSET_CONTAINER__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__ALIAS_NAME = AssetsPackage.ASSET_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__NAME = AssetsPackage.ASSET_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_CONTAINER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__DOCUMENT_ROLES = AssetsPackage.ASSET_CONTAINER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__MEDIUMS = AssetsPackage.ASSET_CONTAINER__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET_CONTAINER__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__RATINGS = AssetsPackage.ASSET_CONTAINER__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__TO_ASSET_ROLES = AssetsPackage.ASSET_CONTAINER__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__ELECTRONIC_ADDRESS = AssetsPackage.ASSET_CONTAINER__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__FROM_ASSET_ROLES = AssetsPackage.ASSET_CONTAINER__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__ASSET_FUNCTIONS = AssetsPackage.ASSET_CONTAINER__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__ERP_ITEM_MASTER = AssetsPackage.ASSET_CONTAINER__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__CORPORATE_CODE = AssetsPackage.ASSET_CONTAINER__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__ERP_INVENTORY = AssetsPackage.ASSET_CONTAINER__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__RELIABILITY_INFOS = AssetsPackage.ASSET_CONTAINER__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__UTC_NUMBER = AssetsPackage.ASSET_CONTAINER__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__ASSET_INFO = AssetsPackage.ASSET_CONTAINER__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__WORK_TASK = AssetsPackage.ASSET_CONTAINER__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__INITIAL_CONDITION = AssetsPackage.ASSET_CONTAINER__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__ACCEPTANCE_TEST = AssetsPackage.ASSET_CONTAINER__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET_CONTAINER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__SCHEDULED_EVENTS = AssetsPackage.ASSET_CONTAINER__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__ASSET_CONTAINER = AssetsPackage.ASSET_CONTAINER__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__CATEGORY = AssetsPackage.ASSET_CONTAINER__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET_CONTAINER__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__SERIAL_NUMBER = AssetsPackage.ASSET_CONTAINER__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__CHANGE_ITEMS = AssetsPackage.ASSET_CONTAINER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__ACTIVITY_RECORDS = AssetsPackage.ASSET_CONTAINER__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__LOCATION = AssetsPackage.ASSET_CONTAINER__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__CRITICAL = AssetsPackage.ASSET_CONTAINER__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__STATUS = AssetsPackage.ASSET_CONTAINER__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__APPLICATION = AssetsPackage.ASSET_CONTAINER__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__PURCHASE_PRICE = AssetsPackage.ASSET_CONTAINER__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET_CONTAINER__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET_CONTAINER__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__MANUFACTURED_DATE = AssetsPackage.ASSET_CONTAINER__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__FINANCIAL_INFO = AssetsPackage.ASSET_CONTAINER__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__INSTALLATION_DATE = AssetsPackage.ASSET_CONTAINER__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__PROPERTIES = AssetsPackage.ASSET_CONTAINER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__MEASUREMENTS = AssetsPackage.ASSET_CONTAINER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__LOT_NUMBER = AssetsPackage.ASSET_CONTAINER__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Seals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__SEALS = AssetsPackage.ASSET_CONTAINER__SEALS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__ASSETS = AssetsPackage.ASSET_CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET__LAND_PROPERTIES = AssetsPackage.ASSET_CONTAINER__LAND_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Cabinet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET_FEATURE_COUNT = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cabinet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABINET_OPERATION_COUNT = AssetsPackage.ASSET_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.Bushing <em>Bushing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.Bushing
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getBushing()
	 * @generated
	 */
	public static final int BUSHING = 26;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__UUID = AssetsPackage.ASSET__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__NAMES = AssetsPackage.ASSET__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__DIAGRAM_OBJECTS = AssetsPackage.ASSET__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__MRID = AssetsPackage.ASSET__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__ALIAS_NAME = AssetsPackage.ASSET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__NAME = AssetsPackage.ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__MODELING_AUTHORITY_SET = AssetsPackage.ASSET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__DOCUMENT_ROLES = AssetsPackage.ASSET__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__MEDIUMS = AssetsPackage.ASSET__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__RATINGS = AssetsPackage.ASSET__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__TO_ASSET_ROLES = AssetsPackage.ASSET__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__ELECTRONIC_ADDRESS = AssetsPackage.ASSET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__FROM_ASSET_ROLES = AssetsPackage.ASSET__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__ASSET_FUNCTIONS = AssetsPackage.ASSET__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__ERP_ITEM_MASTER = AssetsPackage.ASSET__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__CORPORATE_CODE = AssetsPackage.ASSET__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__ERP_INVENTORY = AssetsPackage.ASSET__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__RELIABILITY_INFOS = AssetsPackage.ASSET__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__UTC_NUMBER = AssetsPackage.ASSET__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__ASSET_INFO = AssetsPackage.ASSET__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__WORK_TASK = AssetsPackage.ASSET__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__INITIAL_CONDITION = AssetsPackage.ASSET__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__ACCEPTANCE_TEST = AssetsPackage.ASSET__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__SCHEDULED_EVENTS = AssetsPackage.ASSET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__ASSET_CONTAINER = AssetsPackage.ASSET__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__CATEGORY = AssetsPackage.ASSET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__SERIAL_NUMBER = AssetsPackage.ASSET__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__CHANGE_ITEMS = AssetsPackage.ASSET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__ACTIVITY_RECORDS = AssetsPackage.ASSET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__LOCATION = AssetsPackage.ASSET__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__CRITICAL = AssetsPackage.ASSET__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__STATUS = AssetsPackage.ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__APPLICATION = AssetsPackage.ASSET__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__PURCHASE_PRICE = AssetsPackage.ASSET__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__MANUFACTURED_DATE = AssetsPackage.ASSET__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__FINANCIAL_INFO = AssetsPackage.ASSET__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__INSTALLATION_DATE = AssetsPackage.ASSET__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__PROPERTIES = AssetsPackage.ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__MEASUREMENTS = AssetsPackage.ASSET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__LOT_NUMBER = AssetsPackage.ASSET__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>C2 Power Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__C2_POWER_FACTOR = AssetsPackage.ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>C2 Capacitance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__C2_CAPACITANCE = AssetsPackage.ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__TERMINAL = AssetsPackage.ASSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>C1 Power Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__C1_POWER_FACTOR = AssetsPackage.ASSET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Insulation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__INSULATION_KIND = AssetsPackage.ASSET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>C1 Capacitance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__C1_CAPACITANCE = AssetsPackage.ASSET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bushing Insulation PFs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING__BUSHING_INSULATION_PFS = AssetsPackage.ASSET_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Bushing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING_FEATURE_COUNT = AssetsPackage.ASSET_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Bushing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BUSHING_OPERATION_COUNT = AssetsPackage.ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.Vehicle <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.Vehicle
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getVehicle()
	 * @generated
	 */
	public static final int VEHICLE = 27;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__UUID = AssetsPackage.ASSET__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__NAMES = AssetsPackage.ASSET__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__DIAGRAM_OBJECTS = AssetsPackage.ASSET__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__MRID = AssetsPackage.ASSET__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__ALIAS_NAME = AssetsPackage.ASSET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__NAME = AssetsPackage.ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__MODELING_AUTHORITY_SET = AssetsPackage.ASSET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__DOCUMENT_ROLES = AssetsPackage.ASSET__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__MEDIUMS = AssetsPackage.ASSET__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__RATINGS = AssetsPackage.ASSET__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__TO_ASSET_ROLES = AssetsPackage.ASSET__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__ELECTRONIC_ADDRESS = AssetsPackage.ASSET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__FROM_ASSET_ROLES = AssetsPackage.ASSET__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__ASSET_FUNCTIONS = AssetsPackage.ASSET__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__ERP_ITEM_MASTER = AssetsPackage.ASSET__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__CORPORATE_CODE = AssetsPackage.ASSET__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__ERP_INVENTORY = AssetsPackage.ASSET__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__RELIABILITY_INFOS = AssetsPackage.ASSET__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__UTC_NUMBER = AssetsPackage.ASSET__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__ASSET_INFO = AssetsPackage.ASSET__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__WORK_TASK = AssetsPackage.ASSET__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__INITIAL_CONDITION = AssetsPackage.ASSET__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__ACCEPTANCE_TEST = AssetsPackage.ASSET__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__SCHEDULED_EVENTS = AssetsPackage.ASSET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__ASSET_CONTAINER = AssetsPackage.ASSET__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__CATEGORY = AssetsPackage.ASSET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__SERIAL_NUMBER = AssetsPackage.ASSET__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__CHANGE_ITEMS = AssetsPackage.ASSET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__ACTIVITY_RECORDS = AssetsPackage.ASSET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__LOCATION = AssetsPackage.ASSET__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__CRITICAL = AssetsPackage.ASSET__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__STATUS = AssetsPackage.ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__APPLICATION = AssetsPackage.ASSET__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__PURCHASE_PRICE = AssetsPackage.ASSET__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__MANUFACTURED_DATE = AssetsPackage.ASSET__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__FINANCIAL_INFO = AssetsPackage.ASSET__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__INSTALLATION_DATE = AssetsPackage.ASSET__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__PROPERTIES = AssetsPackage.ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__MEASUREMENTS = AssetsPackage.ASSET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__LOT_NUMBER = AssetsPackage.ASSET__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Odometer Reading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__ODOMETER_READING = AssetsPackage.ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Odometer Read Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__ODOMETER_READ_DATE_TIME = AssetsPackage.ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Crew</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__CREW = AssetsPackage.ASSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Usage Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE__USAGE_KIND = AssetsPackage.ASSET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE_FEATURE_COUNT = AssetsPackage.ASSET_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VEHICLE_OPERATION_COUNT = AssetsPackage.ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo <em>Surge Protector Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getSurgeProtectorInfo()
	 * @generated
	 */
	public static final int SURGE_PROTECTOR_INFO = 28;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR_INFO__UUID = AssetsPackage.ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR_INFO__NAMES = AssetsPackage.ASSET_INFO__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR_INFO__DIAGRAM_OBJECTS = AssetsPackage.ASSET_INFO__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR_INFO__MRID = AssetsPackage.ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR_INFO__ALIAS_NAME = AssetsPackage.ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR_INFO__NAME = AssetsPackage.ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR_INFO__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR_INFO__ASSETS = AssetsPackage.ASSET_INFO__ASSETS;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR_INFO__DIMENSIONS_INFO = AssetsPackage.ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR_INFO__ASSET_MODEL = AssetsPackage.ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Surge Protectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR_INFO__SURGE_PROTECTORS = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Current Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR_INFO__MAX_CURRENT_RATING = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Continous Operating Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR_INFO__MAX_CONTINOUS_OPERATING_VOLTAGE = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nominal Design Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR_INFO__NOMINAL_DESIGN_VOLTAGE = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Energy Absorption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR_INFO__MAX_ENERGY_ABSORPTION = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Surge Protector Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR_INFO_FEATURE_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Surge Protector Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SURGE_PROTECTOR_INFO_OPERATION_COUNT = AssetsPackage.ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport <em>Structure Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.StructureSupport
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getStructureSupport()
	 * @generated
	 */
	public static final int STRUCTURE_SUPPORT = 29;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__UUID = AssetsPackage.ASSET__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__NAMES = AssetsPackage.ASSET__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__DIAGRAM_OBJECTS = AssetsPackage.ASSET__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__MRID = AssetsPackage.ASSET__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__ALIAS_NAME = AssetsPackage.ASSET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__NAME = AssetsPackage.ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__MODELING_AUTHORITY_SET = AssetsPackage.ASSET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__DOCUMENT_ROLES = AssetsPackage.ASSET__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__MEDIUMS = AssetsPackage.ASSET__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__RATINGS = AssetsPackage.ASSET__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__TO_ASSET_ROLES = AssetsPackage.ASSET__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__ELECTRONIC_ADDRESS = AssetsPackage.ASSET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__FROM_ASSET_ROLES = AssetsPackage.ASSET__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__ASSET_FUNCTIONS = AssetsPackage.ASSET__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__ERP_ITEM_MASTER = AssetsPackage.ASSET__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__CORPORATE_CODE = AssetsPackage.ASSET__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__ERP_INVENTORY = AssetsPackage.ASSET__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__RELIABILITY_INFOS = AssetsPackage.ASSET__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__UTC_NUMBER = AssetsPackage.ASSET__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__ASSET_INFO = AssetsPackage.ASSET__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__WORK_TASK = AssetsPackage.ASSET__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__INITIAL_CONDITION = AssetsPackage.ASSET__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__ACCEPTANCE_TEST = AssetsPackage.ASSET__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__SCHEDULED_EVENTS = AssetsPackage.ASSET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__ASSET_CONTAINER = AssetsPackage.ASSET__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__CATEGORY = AssetsPackage.ASSET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__SERIAL_NUMBER = AssetsPackage.ASSET__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__CHANGE_ITEMS = AssetsPackage.ASSET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__ACTIVITY_RECORDS = AssetsPackage.ASSET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__LOCATION = AssetsPackage.ASSET__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__CRITICAL = AssetsPackage.ASSET__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__STATUS = AssetsPackage.ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__APPLICATION = AssetsPackage.ASSET__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__PURCHASE_PRICE = AssetsPackage.ASSET__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__MANUFACTURED_DATE = AssetsPackage.ASSET__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__FINANCIAL_INFO = AssetsPackage.ASSET__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__INSTALLATION_DATE = AssetsPackage.ASSET__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__PROPERTIES = AssetsPackage.ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__MEASUREMENTS = AssetsPackage.ASSET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__LOT_NUMBER = AssetsPackage.ASSET__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Anchor Rod Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__ANCHOR_ROD_COUNT = AssetsPackage.ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__LENGTH = AssetsPackage.ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Anchor Rod Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__ANCHOR_ROD_LENGTH = AssetsPackage.ASSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Secured Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__SECURED_STRUCTURE = AssetsPackage.ASSET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__DIRECTION = AssetsPackage.ASSET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Anchor Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__ANCHOR_KIND = AssetsPackage.ASSET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__KIND = AssetsPackage.ASSET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT__SIZE = AssetsPackage.ASSET_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Structure Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT_FEATURE_COUNT = AssetsPackage.ASSET_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Structure Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_SUPPORT_OPERATION_COUNT = AssetsPackage.ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.ComEquipment <em>Com Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.ComEquipment
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getComEquipment()
	 * @generated
	 */
	public static final int COM_EQUIPMENT = 30;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__UUID = AssetsPackage.ASSET__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__NAMES = AssetsPackage.ASSET__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__DIAGRAM_OBJECTS = AssetsPackage.ASSET__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__MRID = AssetsPackage.ASSET__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__ALIAS_NAME = AssetsPackage.ASSET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__NAME = AssetsPackage.ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__MODELING_AUTHORITY_SET = AssetsPackage.ASSET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__DOCUMENT_ROLES = AssetsPackage.ASSET__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__MEDIUMS = AssetsPackage.ASSET__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__RATINGS = AssetsPackage.ASSET__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__TO_ASSET_ROLES = AssetsPackage.ASSET__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__ELECTRONIC_ADDRESS = AssetsPackage.ASSET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__FROM_ASSET_ROLES = AssetsPackage.ASSET__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__ASSET_FUNCTIONS = AssetsPackage.ASSET__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__ERP_ITEM_MASTER = AssetsPackage.ASSET__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__CORPORATE_CODE = AssetsPackage.ASSET__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__ERP_INVENTORY = AssetsPackage.ASSET__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__RELIABILITY_INFOS = AssetsPackage.ASSET__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__UTC_NUMBER = AssetsPackage.ASSET__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__ASSET_INFO = AssetsPackage.ASSET__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__WORK_TASK = AssetsPackage.ASSET__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__INITIAL_CONDITION = AssetsPackage.ASSET__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__ACCEPTANCE_TEST = AssetsPackage.ASSET__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__SCHEDULED_EVENTS = AssetsPackage.ASSET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__ASSET_CONTAINER = AssetsPackage.ASSET__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__CATEGORY = AssetsPackage.ASSET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__SERIAL_NUMBER = AssetsPackage.ASSET__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__CHANGE_ITEMS = AssetsPackage.ASSET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__ACTIVITY_RECORDS = AssetsPackage.ASSET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__LOCATION = AssetsPackage.ASSET__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__CRITICAL = AssetsPackage.ASSET__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__STATUS = AssetsPackage.ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__APPLICATION = AssetsPackage.ASSET__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__PURCHASE_PRICE = AssetsPackage.ASSET__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__MANUFACTURED_DATE = AssetsPackage.ASSET__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__FINANCIAL_INFO = AssetsPackage.ASSET__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__INSTALLATION_DATE = AssetsPackage.ASSET__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__PROPERTIES = AssetsPackage.ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__MEASUREMENTS = AssetsPackage.ASSET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__LOT_NUMBER = AssetsPackage.ASSET__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>End Device Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT__END_DEVICE_FUNCTIONS = AssetsPackage.ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Com Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT_FEATURE_COUNT = AssetsPackage.ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Com Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_EQUIPMENT_OPERATION_COUNT = AssetsPackage.ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.AssetPropertyCurve <em>Asset Property Curve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.AssetPropertyCurve
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getAssetPropertyCurve()
	 * @generated
	 */
	public static final int ASSET_PROPERTY_CURVE = 31;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_PROPERTY_CURVE__UUID = CorePackage.CURVE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_PROPERTY_CURVE__NAMES = CorePackage.CURVE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_PROPERTY_CURVE__DIAGRAM_OBJECTS = CorePackage.CURVE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_PROPERTY_CURVE__MRID = CorePackage.CURVE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_PROPERTY_CURVE__ALIAS_NAME = CorePackage.CURVE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_PROPERTY_CURVE__NAME = CorePackage.CURVE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_PROPERTY_CURVE__MODELING_AUTHORITY_SET = CorePackage.CURVE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_PROPERTY_CURVE__XUNIT = CorePackage.CURVE__XUNIT;

	/**
	 * The feature id for the '<em><b>Y1 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_PROPERTY_CURVE__Y1_MULTIPLIER = CorePackage.CURVE__Y1_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y2 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_PROPERTY_CURVE__Y2_UNIT = CorePackage.CURVE__Y2_UNIT;

	/**
	 * The feature id for the '<em><b>Y3 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_PROPERTY_CURVE__Y3_MULTIPLIER = CorePackage.CURVE__Y3_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_PROPERTY_CURVE__CURVE_DATAS = CorePackage.CURVE__CURVE_DATAS;

	/**
	 * The feature id for the '<em><b>Y1 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_PROPERTY_CURVE__Y1_UNIT = CorePackage.CURVE__Y1_UNIT;

	/**
	 * The feature id for the '<em><b>XMultiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_PROPERTY_CURVE__XMULTIPLIER = CorePackage.CURVE__XMULTIPLIER;

	/**
	 * The feature id for the '<em><b>Y3 Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_PROPERTY_CURVE__Y3_UNIT = CorePackage.CURVE__Y3_UNIT;

	/**
	 * The feature id for the '<em><b>Y2 Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_PROPERTY_CURVE__Y2_MULTIPLIER = CorePackage.CURVE__Y2_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Curve Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_PROPERTY_CURVE__CURVE_STYLE = CorePackage.CURVE__CURVE_STYLE;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_PROPERTY_CURVE__SPECIFICATION = CorePackage.CURVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_PROPERTY_CURVE__ASSETS = CorePackage.CURVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Asset Property Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_PROPERTY_CURVE_FEATURE_COUNT = CorePackage.CURVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Asset Property Curve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_PROPERTY_CURVE_OPERATION_COUNT = CorePackage.CURVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.FailureEvent <em>Failure Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.FailureEvent
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getFailureEvent()
	 * @generated
	 */
	public static final int FAILURE_EVENT = 32;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_EVENT__UUID = CommonPackage.ACTIVITY_RECORD__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_EVENT__NAMES = CommonPackage.ACTIVITY_RECORD__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_EVENT__DIAGRAM_OBJECTS = CommonPackage.ACTIVITY_RECORD__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_EVENT__MRID = CommonPackage.ACTIVITY_RECORD__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_EVENT__ALIAS_NAME = CommonPackage.ACTIVITY_RECORD__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_EVENT__NAME = CommonPackage.ACTIVITY_RECORD__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_EVENT__MODELING_AUTHORITY_SET = CommonPackage.ACTIVITY_RECORD__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_EVENT__SEVERITY = CommonPackage.ACTIVITY_RECORD__SEVERITY;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_EVENT__CREATED_DATE_TIME = CommonPackage.ACTIVITY_RECORD__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_EVENT__ERP_PERSONS = CommonPackage.ACTIVITY_RECORD__ERP_PERSONS;

	/**
	 * The feature id for the '<em><b>Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_EVENT__ORGANISATIONS = CommonPackage.ACTIVITY_RECORD__ORGANISATIONS;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_EVENT__DOCUMENTS = CommonPackage.ACTIVITY_RECORD__DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_EVENT__ASSETS = CommonPackage.ACTIVITY_RECORD__ASSETS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_EVENT__STATUS = CommonPackage.ACTIVITY_RECORD__STATUS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_EVENT__REASON = CommonPackage.ACTIVITY_RECORD__REASON;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_EVENT__CATEGORY = CommonPackage.ACTIVITY_RECORD__CATEGORY;

	/**
	 * The feature id for the '<em><b>Scheduled Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_EVENT__SCHEDULED_EVENT = CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT;

	/**
	 * The feature id for the '<em><b>Failure Isolation Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_EVENT__FAILURE_ISOLATION_METHOD = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_EVENT__CORPORATE_CODE = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fault Locating Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_EVENT__FAULT_LOCATING_METHOD = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_EVENT__LOCATION = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Failure Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_EVENT_FEATURE_COUNT = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Failure Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_EVENT_OPERATION_COUNT = CommonPackage.ACTIVITY_RECORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo <em>Dimensions Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.DimensionsInfo
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getDimensionsInfo()
	 * @generated
	 */
	public static final int DIMENSIONS_INFO = 33;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIMENSIONS_INFO__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIMENSIONS_INFO__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIMENSIONS_INFO__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIMENSIONS_INFO__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIMENSIONS_INFO__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIMENSIONS_INFO__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIMENSIONS_INFO__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIMENSIONS_INFO__LOCATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Asset Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIMENSIONS_INFO__ASSET_INFOS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIMENSIONS_INFO__SIZE_WIDTH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIMENSIONS_INFO__SIZE_DIAMETER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIMENSIONS_INFO__SIZE_LENGTH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIMENSIONS_INFO__ORIENTATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Size Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIMENSIONS_INFO__SIZE_DEPTH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Specifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIMENSIONS_INFO__SPECIFICATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Dimensions Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIMENSIONS_INFO_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Dimensions Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIMENSIONS_INFO_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.Tower <em>Tower</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.Tower
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getTower()
	 * @generated
	 */
	public static final int TOWER = 34;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__UUID = STRUCTURE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__NAMES = STRUCTURE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__DIAGRAM_OBJECTS = STRUCTURE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__MRID = STRUCTURE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__ALIAS_NAME = STRUCTURE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__NAME = STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__MODELING_AUTHORITY_SET = STRUCTURE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__DOCUMENT_ROLES = STRUCTURE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__MEDIUMS = STRUCTURE__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__ERP_REC_DELIVERY_ITEMS = STRUCTURE__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__RATINGS = STRUCTURE__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__TO_ASSET_ROLES = STRUCTURE__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__ELECTRONIC_ADDRESS = STRUCTURE__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__FROM_ASSET_ROLES = STRUCTURE__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__ASSET_FUNCTIONS = STRUCTURE__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__ERP_ITEM_MASTER = STRUCTURE__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__CORPORATE_CODE = STRUCTURE__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__ERP_INVENTORY = STRUCTURE__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__RELIABILITY_INFOS = STRUCTURE__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__UTC_NUMBER = STRUCTURE__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__ASSET_INFO = STRUCTURE__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__WORK_TASK = STRUCTURE__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__INITIAL_CONDITION = STRUCTURE__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__ACCEPTANCE_TEST = STRUCTURE__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__ERP_ORGANISATION_ROLES = STRUCTURE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__SCHEDULED_EVENTS = STRUCTURE__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__ASSET_CONTAINER = STRUCTURE__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__CATEGORY = STRUCTURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__ASSET_PROPERTY_CURVES = STRUCTURE__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__SERIAL_NUMBER = STRUCTURE__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__CHANGE_ITEMS = STRUCTURE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__ACTIVITY_RECORDS = STRUCTURE__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__LOCATION = STRUCTURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__CRITICAL = STRUCTURE__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__STATUS = STRUCTURE__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__APPLICATION = STRUCTURE__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__PURCHASE_PRICE = STRUCTURE__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__INITIAL_LOSS_OF_LIFE = STRUCTURE__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__POWER_SYSTEM_RESOURCES = STRUCTURE__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__MANUFACTURED_DATE = STRUCTURE__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__FINANCIAL_INFO = STRUCTURE__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__INSTALLATION_DATE = STRUCTURE__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__PROPERTIES = STRUCTURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__MEASUREMENTS = STRUCTURE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__LOT_NUMBER = STRUCTURE__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Seals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__SEALS = STRUCTURE__SEALS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__ASSETS = STRUCTURE__ASSETS;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__LAND_PROPERTIES = STRUCTURE__LAND_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__RATED_VOLTAGE = STRUCTURE__RATED_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Structure Support Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__STRUCTURE_SUPPORT_INFOS = STRUCTURE__STRUCTURE_SUPPORT_INFOS;

	/**
	 * The feature id for the '<em><b>Fumigant Applied Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__FUMIGANT_APPLIED_DATE = STRUCTURE__FUMIGANT_APPLIED_DATE;

	/**
	 * The feature id for the '<em><b>Weed Removed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__WEED_REMOVED_DATE = STRUCTURE__WEED_REMOVED_DATE;

	/**
	 * The feature id for the '<em><b>Remove Weed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__REMOVE_WEED = STRUCTURE__REMOVE_WEED;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__HEIGHT = STRUCTURE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Fumigant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__FUMIGANT_NAME = STRUCTURE__FUMIGANT_NAME;

	/**
	 * The feature id for the '<em><b>Mounting Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__MOUNTING_CONNECTIONS = STRUCTURE__MOUNTING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Material Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__MATERIAL_KIND = STRUCTURE__MATERIAL_KIND;

	/**
	 * The feature id for the '<em><b>Construction Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER__CONSTRUCTION_KIND = STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER_FEATURE_COUNT = STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOWER_OPERATION_COUNT = STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.MountingConnection <em>Mounting Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.MountingConnection
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getMountingConnection()
	 * @generated
	 */
	public static final int MOUNTING_CONNECTION = 35;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_CONNECTION__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_CONNECTION__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_CONNECTION__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_CONNECTION__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_CONNECTION__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_CONNECTION__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_CONNECTION__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Structure Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_CONNECTION__STRUCTURE_INFOS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mounting Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_CONNECTION__MOUNTING_POINTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mounting Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_CONNECTION_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mounting Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_CONNECTION_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.Medium <em>Medium</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.Medium
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getMedium()
	 * @generated
	 */
	public static final int MEDIUM = 36;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM__SPECIFICATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM__KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM__ASSETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Volume Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM__VOLUME_SPEC = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo <em>Recloser Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.RecloserInfo
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getRecloserInfo()
	 * @generated
	 */
	public static final int RECLOSER_INFO = 37;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO__UUID = SWITCH_INFO__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO__NAMES = SWITCH_INFO__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO__DIAGRAM_OBJECTS = SWITCH_INFO__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO__MRID = SWITCH_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO__ALIAS_NAME = SWITCH_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO__NAME = SWITCH_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO__MODELING_AUTHORITY_SET = SWITCH_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO__ASSETS = SWITCH_INFO__ASSETS;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO__DIMENSIONS_INFO = SWITCH_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO__ASSET_MODEL = SWITCH_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Dielectric Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO__DIELECTRIC_STRENGTH = SWITCH_INFO__DIELECTRIC_STRENGTH;

	/**
	 * The feature id for the '<em><b>Gang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO__GANG = SWITCH_INFO__GANG;

	/**
	 * The feature id for the '<em><b>Making Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO__MAKING_CAPACITY = SWITCH_INFO__MAKING_CAPACITY;

	/**
	 * The feature id for the '<em><b>Withstand Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO__WITHSTAND_CURRENT = SWITCH_INFO__WITHSTAND_CURRENT;

	/**
	 * The feature id for the '<em><b>Load Break</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO__LOAD_BREAK = SWITCH_INFO__LOAD_BREAK;

	/**
	 * The feature id for the '<em><b>Minimum Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO__MINIMUM_CURRENT = SWITCH_INFO__MINIMUM_CURRENT;

	/**
	 * The feature id for the '<em><b>Interrupting Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO__INTERRUPTING_RATING = SWITCH_INFO__INTERRUPTING_RATING;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO__REMOTE = SWITCH_INFO__REMOTE;

	/**
	 * The feature id for the '<em><b>Pole Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO__POLE_COUNT = SWITCH_INFO__POLE_COUNT;

	/**
	 * The feature id for the '<em><b>Ground Trip Normal Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO__GROUND_TRIP_NORMAL_ENABLED = SWITCH_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ground Trip Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO__GROUND_TRIP_CAPABLE = SWITCH_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reclose Lockout Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO__RECLOSE_LOCKOUT_COUNT = SWITCH_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Phase Trip Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO__PHASE_TRIP_RATING = SWITCH_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ground Trip Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO__GROUND_TRIP_RATING = SWITCH_INFO_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Recloser Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO_FEATURE_COUNT = SWITCH_INFO_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Recloser Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECLOSER_INFO_OPERATION_COUNT = SWITCH_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.Facility <em>Facility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.Facility
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getFacility()
	 * @generated
	 */
	public static final int FACILITY = 38;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__UUID = AssetsPackage.ASSET_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__NAMES = AssetsPackage.ASSET_CONTAINER__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__DIAGRAM_OBJECTS = AssetsPackage.ASSET_CONTAINER__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__MRID = AssetsPackage.ASSET_CONTAINER__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__ALIAS_NAME = AssetsPackage.ASSET_CONTAINER__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__NAME = AssetsPackage.ASSET_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_CONTAINER__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__DOCUMENT_ROLES = AssetsPackage.ASSET_CONTAINER__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__MEDIUMS = AssetsPackage.ASSET_CONTAINER__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET_CONTAINER__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__RATINGS = AssetsPackage.ASSET_CONTAINER__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__TO_ASSET_ROLES = AssetsPackage.ASSET_CONTAINER__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__ELECTRONIC_ADDRESS = AssetsPackage.ASSET_CONTAINER__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__FROM_ASSET_ROLES = AssetsPackage.ASSET_CONTAINER__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__ASSET_FUNCTIONS = AssetsPackage.ASSET_CONTAINER__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__ERP_ITEM_MASTER = AssetsPackage.ASSET_CONTAINER__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__CORPORATE_CODE = AssetsPackage.ASSET_CONTAINER__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__ERP_INVENTORY = AssetsPackage.ASSET_CONTAINER__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__RELIABILITY_INFOS = AssetsPackage.ASSET_CONTAINER__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__UTC_NUMBER = AssetsPackage.ASSET_CONTAINER__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__ASSET_INFO = AssetsPackage.ASSET_CONTAINER__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__WORK_TASK = AssetsPackage.ASSET_CONTAINER__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__INITIAL_CONDITION = AssetsPackage.ASSET_CONTAINER__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__ACCEPTANCE_TEST = AssetsPackage.ASSET_CONTAINER__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET_CONTAINER__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__SCHEDULED_EVENTS = AssetsPackage.ASSET_CONTAINER__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__ASSET_CONTAINER = AssetsPackage.ASSET_CONTAINER__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__CATEGORY = AssetsPackage.ASSET_CONTAINER__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET_CONTAINER__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__SERIAL_NUMBER = AssetsPackage.ASSET_CONTAINER__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__CHANGE_ITEMS = AssetsPackage.ASSET_CONTAINER__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__ACTIVITY_RECORDS = AssetsPackage.ASSET_CONTAINER__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__LOCATION = AssetsPackage.ASSET_CONTAINER__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__CRITICAL = AssetsPackage.ASSET_CONTAINER__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__STATUS = AssetsPackage.ASSET_CONTAINER__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__APPLICATION = AssetsPackage.ASSET_CONTAINER__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__PURCHASE_PRICE = AssetsPackage.ASSET_CONTAINER__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET_CONTAINER__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET_CONTAINER__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__MANUFACTURED_DATE = AssetsPackage.ASSET_CONTAINER__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__FINANCIAL_INFO = AssetsPackage.ASSET_CONTAINER__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__INSTALLATION_DATE = AssetsPackage.ASSET_CONTAINER__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__PROPERTIES = AssetsPackage.ASSET_CONTAINER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__MEASUREMENTS = AssetsPackage.ASSET_CONTAINER__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__LOT_NUMBER = AssetsPackage.ASSET_CONTAINER__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Seals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__SEALS = AssetsPackage.ASSET_CONTAINER__SEALS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__ASSETS = AssetsPackage.ASSET_CONTAINER__ASSETS;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__LAND_PROPERTIES = AssetsPackage.ASSET_CONTAINER__LAND_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY__KIND = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Facility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY_FEATURE_COUNT = AssetsPackage.ASSET_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Facility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FACILITY_OPERATION_COUNT = AssetsPackage.ASSET_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo <em>Shunt Impedance Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntImpedanceInfo()
	 * @generated
	 */
	public static final int SHUNT_IMPEDANCE_INFO = 39;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__UUID = AssetsPackage.ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__NAMES = AssetsPackage.ASSET_INFO__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__DIAGRAM_OBJECTS = AssetsPackage.ASSET_INFO__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__MRID = AssetsPackage.ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__ALIAS_NAME = AssetsPackage.ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__NAME = AssetsPackage.ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__ASSETS = AssetsPackage.ASSET_INFO__ASSETS;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__DIMENSIONS_INFO = AssetsPackage.ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__ASSET_MODEL = AssetsPackage.ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Max Switch Operation Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__MAX_SWITCH_OPERATION_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Local Control Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__LOCAL_CONTROL_KIND = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Switch Operation Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__SWITCH_OPERATION_CYCLE = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>VReg Line Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__VREG_LINE_LINE = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>High Voltage Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__HIGH_VOLTAGE_OVERRIDE = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Low Voltage Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__LOW_VOLTAGE_OVERRIDE = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reg Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__REG_BRANCH = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cell Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__CELL_SIZE = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Local On Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__LOCAL_ON_LEVEL = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Reg Branch Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__REG_BRANCH_KIND = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__NORMAL_OPEN = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Control Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__CONTROL_KIND = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Shunt Compensator Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__SHUNT_COMPENSATOR_INFOS = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Reg Branch End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__REG_BRANCH_END = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Branch Direct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__BRANCH_DIRECT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Local Off Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__LOCAL_OFF_LEVEL = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Sensing Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__SENSING_PHASE_CODE = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Local Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO__LOCAL_OVERRIDE = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Shunt Impedance Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO_FEATURE_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>Shunt Impedance Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_IMPEDANCE_INFO_OPERATION_COUNT = AssetsPackage.ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntCompensatorInfo <em>Shunt Compensator Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntCompensatorInfo
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntCompensatorInfo()
	 * @generated
	 */
	public static final int SHUNT_COMPENSATOR_INFO = 40;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR_INFO__UUID = AssetsPackage.ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR_INFO__NAMES = AssetsPackage.ASSET_INFO__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR_INFO__DIAGRAM_OBJECTS = AssetsPackage.ASSET_INFO__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR_INFO__MRID = AssetsPackage.ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR_INFO__ALIAS_NAME = AssetsPackage.ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR_INFO__NAME = AssetsPackage.ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR_INFO__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR_INFO__ASSETS = AssetsPackage.ASSET_INFO__ASSETS;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR_INFO__DIMENSIONS_INFO = AssetsPackage.ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR_INFO__ASSET_MODEL = AssetsPackage.ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Max Power Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR_INFO__MAX_POWER_LOSS = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shunt Impedance Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR_INFO__SHUNT_IMPEDANCE_INFO = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shunt Compensator Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR_INFO_FEATURE_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Shunt Compensator Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHUNT_COMPENSATOR_INFO_OPERATION_COUNT = AssetsPackage.ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.MountingPoint <em>Mounting Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.MountingPoint
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getMountingPoint()
	 * @generated
	 */
	public static final int MOUNTING_POINT = 41;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_POINT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_POINT__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_POINT__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_POINT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_POINT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_POINT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_POINT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_POINT__CONNECTIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XCoord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_POINT__XCOORD = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Phase Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_POINT__PHASE_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>YCoord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_POINT__YCOORD = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Overhead Conductors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_POINT__OVERHEAD_CONDUCTORS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Mounting Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_POINT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Mounting Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTING_POINT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.SubstationAsset <em>Substation Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.SubstationAsset
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getSubstationAsset()
	 * @generated
	 */
	public static final int SUBSTATION_ASSET = 42;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__UUID = AssetsPackage.ASSET__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__NAMES = AssetsPackage.ASSET__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__DIAGRAM_OBJECTS = AssetsPackage.ASSET__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__MRID = AssetsPackage.ASSET__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__ALIAS_NAME = AssetsPackage.ASSET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__NAME = AssetsPackage.ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__MODELING_AUTHORITY_SET = AssetsPackage.ASSET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__DOCUMENT_ROLES = AssetsPackage.ASSET__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__MEDIUMS = AssetsPackage.ASSET__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__RATINGS = AssetsPackage.ASSET__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__TO_ASSET_ROLES = AssetsPackage.ASSET__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__ELECTRONIC_ADDRESS = AssetsPackage.ASSET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__FROM_ASSET_ROLES = AssetsPackage.ASSET__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__ASSET_FUNCTIONS = AssetsPackage.ASSET__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__ERP_ITEM_MASTER = AssetsPackage.ASSET__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__CORPORATE_CODE = AssetsPackage.ASSET__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__ERP_INVENTORY = AssetsPackage.ASSET__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__RELIABILITY_INFOS = AssetsPackage.ASSET__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__UTC_NUMBER = AssetsPackage.ASSET__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__ASSET_INFO = AssetsPackage.ASSET__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__WORK_TASK = AssetsPackage.ASSET__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__INITIAL_CONDITION = AssetsPackage.ASSET__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__ACCEPTANCE_TEST = AssetsPackage.ASSET__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__SCHEDULED_EVENTS = AssetsPackage.ASSET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__ASSET_CONTAINER = AssetsPackage.ASSET__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__CATEGORY = AssetsPackage.ASSET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__SERIAL_NUMBER = AssetsPackage.ASSET__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__CHANGE_ITEMS = AssetsPackage.ASSET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__ACTIVITY_RECORDS = AssetsPackage.ASSET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__LOCATION = AssetsPackage.ASSET__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__CRITICAL = AssetsPackage.ASSET__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__STATUS = AssetsPackage.ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__APPLICATION = AssetsPackage.ASSET__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__PURCHASE_PRICE = AssetsPackage.ASSET__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__MANUFACTURED_DATE = AssetsPackage.ASSET__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__FINANCIAL_INFO = AssetsPackage.ASSET__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__INSTALLATION_DATE = AssetsPackage.ASSET__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__PROPERTIES = AssetsPackage.ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__MEASUREMENTS = AssetsPackage.ASSET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__LOT_NUMBER = AssetsPackage.ASSET__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET__FUNCTION = AssetsPackage.ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Substation Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET_FEATURE_COUNT = AssetsPackage.ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Substation Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_ASSET_OPERATION_COUNT = AssetsPackage.ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.Streetlight <em>Streetlight</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.Streetlight
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getStreetlight()
	 * @generated
	 */
	public static final int STREETLIGHT = 43;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__UUID = AssetsPackage.ASSET__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__NAMES = AssetsPackage.ASSET__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__DIAGRAM_OBJECTS = AssetsPackage.ASSET__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__MRID = AssetsPackage.ASSET__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__ALIAS_NAME = AssetsPackage.ASSET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__NAME = AssetsPackage.ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__MODELING_AUTHORITY_SET = AssetsPackage.ASSET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__DOCUMENT_ROLES = AssetsPackage.ASSET__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__MEDIUMS = AssetsPackage.ASSET__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__RATINGS = AssetsPackage.ASSET__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__TO_ASSET_ROLES = AssetsPackage.ASSET__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__ELECTRONIC_ADDRESS = AssetsPackage.ASSET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__FROM_ASSET_ROLES = AssetsPackage.ASSET__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__ASSET_FUNCTIONS = AssetsPackage.ASSET__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__ERP_ITEM_MASTER = AssetsPackage.ASSET__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__CORPORATE_CODE = AssetsPackage.ASSET__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__ERP_INVENTORY = AssetsPackage.ASSET__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__RELIABILITY_INFOS = AssetsPackage.ASSET__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__UTC_NUMBER = AssetsPackage.ASSET__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__ASSET_INFO = AssetsPackage.ASSET__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__WORK_TASK = AssetsPackage.ASSET__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__INITIAL_CONDITION = AssetsPackage.ASSET__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__ACCEPTANCE_TEST = AssetsPackage.ASSET__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__SCHEDULED_EVENTS = AssetsPackage.ASSET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__ASSET_CONTAINER = AssetsPackage.ASSET__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__CATEGORY = AssetsPackage.ASSET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__SERIAL_NUMBER = AssetsPackage.ASSET__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__CHANGE_ITEMS = AssetsPackage.ASSET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__ACTIVITY_RECORDS = AssetsPackage.ASSET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__LOCATION = AssetsPackage.ASSET__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__CRITICAL = AssetsPackage.ASSET__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__STATUS = AssetsPackage.ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__APPLICATION = AssetsPackage.ASSET__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__PURCHASE_PRICE = AssetsPackage.ASSET__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__MANUFACTURED_DATE = AssetsPackage.ASSET__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__FINANCIAL_INFO = AssetsPackage.ASSET__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__INSTALLATION_DATE = AssetsPackage.ASSET__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__PROPERTIES = AssetsPackage.ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__MEASUREMENTS = AssetsPackage.ASSET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__LOT_NUMBER = AssetsPackage.ASSET__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Arm Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__ARM_LENGTH = AssetsPackage.ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__POLE = AssetsPackage.ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lamp Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__LAMP_KIND = AssetsPackage.ASSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Light Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT__LIGHT_RATING = AssetsPackage.ASSET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Streetlight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT_FEATURE_COUNT = AssetsPackage.ASSET_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Streetlight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT_OPERATION_COUNT = AssetsPackage.ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.Tool <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.Tool
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getTool()
	 * @generated
	 */
	public static final int TOOL = 44;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__UUID = AssetsPackage.ASSET__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__NAMES = AssetsPackage.ASSET__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__DIAGRAM_OBJECTS = AssetsPackage.ASSET__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__MRID = AssetsPackage.ASSET__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__ALIAS_NAME = AssetsPackage.ASSET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__NAME = AssetsPackage.ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__MODELING_AUTHORITY_SET = AssetsPackage.ASSET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__DOCUMENT_ROLES = AssetsPackage.ASSET__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__MEDIUMS = AssetsPackage.ASSET__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__ERP_REC_DELIVERY_ITEMS = AssetsPackage.ASSET__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__RATINGS = AssetsPackage.ASSET__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__TO_ASSET_ROLES = AssetsPackage.ASSET__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__ELECTRONIC_ADDRESS = AssetsPackage.ASSET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__FROM_ASSET_ROLES = AssetsPackage.ASSET__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__ASSET_FUNCTIONS = AssetsPackage.ASSET__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__ERP_ITEM_MASTER = AssetsPackage.ASSET__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__CORPORATE_CODE = AssetsPackage.ASSET__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__ERP_INVENTORY = AssetsPackage.ASSET__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__RELIABILITY_INFOS = AssetsPackage.ASSET__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__UTC_NUMBER = AssetsPackage.ASSET__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__ASSET_INFO = AssetsPackage.ASSET__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__WORK_TASK = AssetsPackage.ASSET__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__INITIAL_CONDITION = AssetsPackage.ASSET__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__ACCEPTANCE_TEST = AssetsPackage.ASSET__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__ERP_ORGANISATION_ROLES = AssetsPackage.ASSET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__SCHEDULED_EVENTS = AssetsPackage.ASSET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__ASSET_CONTAINER = AssetsPackage.ASSET__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__CATEGORY = AssetsPackage.ASSET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__ASSET_PROPERTY_CURVES = AssetsPackage.ASSET__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__SERIAL_NUMBER = AssetsPackage.ASSET__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__CHANGE_ITEMS = AssetsPackage.ASSET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__ACTIVITY_RECORDS = AssetsPackage.ASSET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__LOCATION = AssetsPackage.ASSET__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__CRITICAL = AssetsPackage.ASSET__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__STATUS = AssetsPackage.ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__APPLICATION = AssetsPackage.ASSET__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__PURCHASE_PRICE = AssetsPackage.ASSET__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__INITIAL_LOSS_OF_LIFE = AssetsPackage.ASSET__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__POWER_SYSTEM_RESOURCES = AssetsPackage.ASSET__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__MANUFACTURED_DATE = AssetsPackage.ASSET__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__FINANCIAL_INFO = AssetsPackage.ASSET__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__INSTALLATION_DATE = AssetsPackage.ASSET__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__PROPERTIES = AssetsPackage.ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__MEASUREMENTS = AssetsPackage.ASSET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__LOT_NUMBER = AssetsPackage.ASSET__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Last Calibration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__LAST_CALIBRATION_DATE = AssetsPackage.ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Crew</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL__CREW = AssetsPackage.ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL_FEATURE_COUNT = AssetsPackage.ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOOL_OPERATION_COUNT = AssetsPackage.ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.SVC <em>SVC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.SVC
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getSVC()
	 * @generated
	 */
	public static final int SVC = 45;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__UUID = FACTS_DEVICE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__NAMES = FACTS_DEVICE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__DIAGRAM_OBJECTS = FACTS_DEVICE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__MRID = FACTS_DEVICE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__ALIAS_NAME = FACTS_DEVICE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__NAME = FACTS_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__MODELING_AUTHORITY_SET = FACTS_DEVICE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__DOCUMENT_ROLES = FACTS_DEVICE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__MEDIUMS = FACTS_DEVICE__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__ERP_REC_DELIVERY_ITEMS = FACTS_DEVICE__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__RATINGS = FACTS_DEVICE__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__TO_ASSET_ROLES = FACTS_DEVICE__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__ELECTRONIC_ADDRESS = FACTS_DEVICE__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__FROM_ASSET_ROLES = FACTS_DEVICE__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__ASSET_FUNCTIONS = FACTS_DEVICE__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__ERP_ITEM_MASTER = FACTS_DEVICE__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__CORPORATE_CODE = FACTS_DEVICE__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__ERP_INVENTORY = FACTS_DEVICE__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__RELIABILITY_INFOS = FACTS_DEVICE__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__UTC_NUMBER = FACTS_DEVICE__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__ASSET_INFO = FACTS_DEVICE__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__WORK_TASK = FACTS_DEVICE__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__INITIAL_CONDITION = FACTS_DEVICE__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__ACCEPTANCE_TEST = FACTS_DEVICE__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__ERP_ORGANISATION_ROLES = FACTS_DEVICE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__SCHEDULED_EVENTS = FACTS_DEVICE__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__ASSET_CONTAINER = FACTS_DEVICE__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__CATEGORY = FACTS_DEVICE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__ASSET_PROPERTY_CURVES = FACTS_DEVICE__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__SERIAL_NUMBER = FACTS_DEVICE__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__CHANGE_ITEMS = FACTS_DEVICE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__ACTIVITY_RECORDS = FACTS_DEVICE__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__LOCATION = FACTS_DEVICE__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__CRITICAL = FACTS_DEVICE__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__STATUS = FACTS_DEVICE__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__APPLICATION = FACTS_DEVICE__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__PURCHASE_PRICE = FACTS_DEVICE__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__INITIAL_LOSS_OF_LIFE = FACTS_DEVICE__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__POWER_SYSTEM_RESOURCES = FACTS_DEVICE__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__MANUFACTURED_DATE = FACTS_DEVICE__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__FINANCIAL_INFO = FACTS_DEVICE__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__INSTALLATION_DATE = FACTS_DEVICE__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__PROPERTIES = FACTS_DEVICE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__MEASUREMENTS = FACTS_DEVICE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__LOT_NUMBER = FACTS_DEVICE__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__KIND = FACTS_DEVICE__KIND;

	/**
	 * The feature id for the '<em><b>Inductive Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__INDUCTIVE_RATING = FACTS_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacitive Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC__CAPACITIVE_RATING = FACTS_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SVC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC_FEATURE_COUNT = FACTS_DEVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SVC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SVC_OPERATION_COUNT = FACTS_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.OrgAssetRole <em>Org Asset Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.OrgAssetRole
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getOrgAssetRole()
	 * @generated
	 */
	public static final int ORG_ASSET_ROLE = 46;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ASSET_ROLE__UUID = InfCommonPackage.ROLE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ASSET_ROLE__NAMES = InfCommonPackage.ROLE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ASSET_ROLE__DIAGRAM_OBJECTS = InfCommonPackage.ROLE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ASSET_ROLE__MRID = InfCommonPackage.ROLE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ASSET_ROLE__ALIAS_NAME = InfCommonPackage.ROLE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ASSET_ROLE__NAME = InfCommonPackage.ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ASSET_ROLE__MODELING_AUTHORITY_SET = InfCommonPackage.ROLE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ASSET_ROLE__CATEGORY = InfCommonPackage.ROLE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ASSET_ROLE__STATUS = InfCommonPackage.ROLE__STATUS;

	/**
	 * The feature id for the '<em><b>Erp Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ASSET_ROLE__ERP_ORGANISATION = InfCommonPackage.ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ASSET_ROLE__ASSET = InfCommonPackage.ROLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Percent Ownership</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ASSET_ROLE__PERCENT_OWNERSHIP = InfCommonPackage.ROLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Org Asset Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ASSET_ROLE_FEATURE_COUNT = InfCommonPackage.ROLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Org Asset Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORG_ASSET_ROLE_OPERATION_COUNT = InfCommonPackage.ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.TestDataSet <em>Test Data Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.TestDataSet
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getTestDataSet()
	 * @generated
	 */
	public static final int TEST_DATA_SET = 47;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__UUID = PROCEDURE_DATA_SET__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__NAMES = PROCEDURE_DATA_SET__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__DIAGRAM_OBJECTS = PROCEDURE_DATA_SET__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__MRID = PROCEDURE_DATA_SET__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__ALIAS_NAME = PROCEDURE_DATA_SET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__NAME = PROCEDURE_DATA_SET__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__MODELING_AUTHORITY_SET = PROCEDURE_DATA_SET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__CHANGE_ITEMS = PROCEDURE_DATA_SET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__TO_DOCUMENT_ROLES = PROCEDURE_DATA_SET__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__ELECTRONIC_ADDRESS = PROCEDURE_DATA_SET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__REVISION_NUMBER = PROCEDURE_DATA_SET__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__NETWORK_DATA_SETS = PROCEDURE_DATA_SET__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__FROM_DOCUMENT_ROLES = PROCEDURE_DATA_SET__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__SCHEDULE_PARAMETER_INFOS = PROCEDURE_DATA_SET__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__ERP_ORGANISATION_ROLES = PROCEDURE_DATA_SET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__CREATED_DATE_TIME = PROCEDURE_DATA_SET__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__MEASUREMENTS = PROCEDURE_DATA_SET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__LAST_MODIFIED_DATE_TIME = PROCEDURE_DATA_SET__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__ACTIVITY_RECORDS = PROCEDURE_DATA_SET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__SUBJECT = PROCEDURE_DATA_SET__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__CHANGE_SETS = PROCEDURE_DATA_SET__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__ERP_PERSON_ROLES = PROCEDURE_DATA_SET__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__SCHEDULED_EVENTS = PROCEDURE_DATA_SET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__TITLE = PROCEDURE_DATA_SET__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__DOC_STATUS = PROCEDURE_DATA_SET__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__ASSET_ROLES = PROCEDURE_DATA_SET__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__STATUS = PROCEDURE_DATA_SET__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__POWER_SYSTEM_RESOURCE_ROLES = PROCEDURE_DATA_SET__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__CATEGORY = PROCEDURE_DATA_SET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__PROPERTIES = PROCEDURE_DATA_SET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Transformer Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__TRANSFORMER_OBSERVATIONS = PROCEDURE_DATA_SET__TRANSFORMER_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__PROCEDURE = PROCEDURE_DATA_SET__PROCEDURE;

	/**
	 * The feature id for the '<em><b>Completed Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__COMPLETED_DATE_TIME = PROCEDURE_DATA_SET__COMPLETED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurement Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__MEASUREMENT_VALUES = PROCEDURE_DATA_SET__MEASUREMENT_VALUES;

	/**
	 * The feature id for the '<em><b>Specimen To Lab Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__SPECIMEN_TO_LAB_DATE_TIME = PROCEDURE_DATA_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conclusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__CONCLUSION = PROCEDURE_DATA_SET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Specimen ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET__SPECIMEN_ID = PROCEDURE_DATA_SET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Test Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET_FEATURE_COUNT = PROCEDURE_DATA_SET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Test Data Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DATA_SET_OPERATION_COUNT = PROCEDURE_DATA_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial <em>Generic Asset Model Or Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getGenericAssetModelOrMaterial()
	 * @generated
	 */
	public static final int GENERIC_ASSET_MODEL_OR_MATERIAL = 48;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_ASSET_MODEL_OR_MATERIAL__UUID = AssetsPackage.ASSET_MODEL__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_ASSET_MODEL_OR_MATERIAL__NAMES = AssetsPackage.ASSET_MODEL__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_ASSET_MODEL_OR_MATERIAL__DIAGRAM_OBJECTS = AssetsPackage.ASSET_MODEL__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_ASSET_MODEL_OR_MATERIAL__MRID = AssetsPackage.ASSET_MODEL__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_ASSET_MODEL_OR_MATERIAL__ALIAS_NAME = AssetsPackage.ASSET_MODEL__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_ASSET_MODEL_OR_MATERIAL__NAME = AssetsPackage.ASSET_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_ASSET_MODEL_OR_MATERIAL__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_MODEL__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_ASSET_MODEL_OR_MATERIAL__ASSET_INFO = AssetsPackage.ASSET_MODEL__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Erp Inventory Counts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_INVENTORY_COUNTS = AssetsPackage.ASSET_MODEL__ERP_INVENTORY_COUNTS;

	/**
	 * The feature id for the '<em><b>Erp Req Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_REQ_LINE_ITEMS = AssetsPackage.ASSET_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Asset Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_ASSET_MODEL_OR_MATERIAL__PRODUCT_ASSET_MODELS = AssetsPackage.ASSET_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Inventory Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_INVENTORY_ISSUES = AssetsPackage.ASSET_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CU Work Equipment Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_ASSET_MODEL_OR_MATERIAL__CU_WORK_EQUIPMENT_ASSET = AssetsPackage.ASSET_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Estimated Unit Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_ASSET_MODEL_OR_MATERIAL__ESTIMATED_UNIT_COST = AssetsPackage.ASSET_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Stock Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_ASSET_MODEL_OR_MATERIAL__STOCK_ITEM = AssetsPackage.ASSET_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type Asset Catalogue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_ASSET_MODEL_OR_MATERIAL__TYPE_ASSET_CATALOGUE = AssetsPackage.ASSET_MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CU Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_ASSET_MODEL_OR_MATERIAL__CU_ASSET = AssetsPackage.ASSET_MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Erp Bom Item Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_BOM_ITEM_DATAS = AssetsPackage.ASSET_MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_ASSET_MODEL_OR_MATERIAL__QUANTITY = AssetsPackage.ASSET_MODEL_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Generic Asset Model Or Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_ASSET_MODEL_OR_MATERIAL_FEATURE_COUNT = AssetsPackage.ASSET_MODEL_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Generic Asset Model Or Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_ASSET_MODEL_OR_MATERIAL_OPERATION_COUNT = AssetsPackage.ASSET_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo <em>Reliability Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getReliabilityInfo()
	 * @generated
	 */
	public static final int RELIABILITY_INFO = 49;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELIABILITY_INFO__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELIABILITY_INFO__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELIABILITY_INFO__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELIABILITY_INFO__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELIABILITY_INFO__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELIABILITY_INFO__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELIABILITY_INFO__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Mom Failure Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELIABILITY_INFO__MOM_FAILURE_RATE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELIABILITY_INFO__SPECIFICATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MTTR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELIABILITY_INFO__MTTR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELIABILITY_INFO__ASSETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reliability Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELIABILITY_INFO_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Reliability Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELIABILITY_INFO_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation <em>Transformer Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getTransformerObservation()
	 * @generated
	 */
	public static final int TRANSFORMER_OBSERVATION = 50;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Bushing Insultation PFs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__BUSHING_INSULTATION_PFS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Oil Neutralization Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__OIL_NEUTRALIZATION_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Water Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__WATER_CONTENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Oil Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__OIL_LEVEL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Freq Resp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__FREQ_RESP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Oil Dielectric Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__OIL_DIELECTRIC_STRENGTH = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Oil Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__OIL_COLOR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Hot Spot Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__HOT_SPOT_TEMP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Dga</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__DGA = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Furfural DP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__FURFURAL_DP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Oil IFT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__OIL_IFT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__PROCEDURE_DATA_SETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Transformer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__TRANSFORMER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Winding Insulation PFs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__WINDING_INSULATION_PFS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Transformer Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__TRANSFORMER_ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Bushing Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__BUSHING_TEMP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Top Oil Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__TOP_OIL_TEMP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Pump Vibration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION__PUMP_VIBRATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Transformer Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Transformer Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_OBSERVATION_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.Pole <em>Pole</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.Pole
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getPole()
	 * @generated
	 */
	public static final int POLE = 51;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__UUID = STRUCTURE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__NAMES = STRUCTURE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__DIAGRAM_OBJECTS = STRUCTURE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__MRID = STRUCTURE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__ALIAS_NAME = STRUCTURE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__NAME = STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__MODELING_AUTHORITY_SET = STRUCTURE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__DOCUMENT_ROLES = STRUCTURE__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__MEDIUMS = STRUCTURE__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__ERP_REC_DELIVERY_ITEMS = STRUCTURE__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__RATINGS = STRUCTURE__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__TO_ASSET_ROLES = STRUCTURE__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__ELECTRONIC_ADDRESS = STRUCTURE__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__FROM_ASSET_ROLES = STRUCTURE__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__ASSET_FUNCTIONS = STRUCTURE__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__ERP_ITEM_MASTER = STRUCTURE__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__CORPORATE_CODE = STRUCTURE__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__ERP_INVENTORY = STRUCTURE__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__RELIABILITY_INFOS = STRUCTURE__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__UTC_NUMBER = STRUCTURE__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__ASSET_INFO = STRUCTURE__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__WORK_TASK = STRUCTURE__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__INITIAL_CONDITION = STRUCTURE__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__ACCEPTANCE_TEST = STRUCTURE__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__ERP_ORGANISATION_ROLES = STRUCTURE__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__SCHEDULED_EVENTS = STRUCTURE__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__ASSET_CONTAINER = STRUCTURE__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__CATEGORY = STRUCTURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__ASSET_PROPERTY_CURVES = STRUCTURE__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__SERIAL_NUMBER = STRUCTURE__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__CHANGE_ITEMS = STRUCTURE__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__ACTIVITY_RECORDS = STRUCTURE__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__LOCATION = STRUCTURE__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__CRITICAL = STRUCTURE__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__STATUS = STRUCTURE__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__APPLICATION = STRUCTURE__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__PURCHASE_PRICE = STRUCTURE__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__INITIAL_LOSS_OF_LIFE = STRUCTURE__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__POWER_SYSTEM_RESOURCES = STRUCTURE__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__MANUFACTURED_DATE = STRUCTURE__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__FINANCIAL_INFO = STRUCTURE__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__INSTALLATION_DATE = STRUCTURE__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__PROPERTIES = STRUCTURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__MEASUREMENTS = STRUCTURE__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__LOT_NUMBER = STRUCTURE__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Seals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__SEALS = STRUCTURE__SEALS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__ASSETS = STRUCTURE__ASSETS;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__LAND_PROPERTIES = STRUCTURE__LAND_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__RATED_VOLTAGE = STRUCTURE__RATED_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Structure Support Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__STRUCTURE_SUPPORT_INFOS = STRUCTURE__STRUCTURE_SUPPORT_INFOS;

	/**
	 * The feature id for the '<em><b>Fumigant Applied Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__FUMIGANT_APPLIED_DATE = STRUCTURE__FUMIGANT_APPLIED_DATE;

	/**
	 * The feature id for the '<em><b>Weed Removed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__WEED_REMOVED_DATE = STRUCTURE__WEED_REMOVED_DATE;

	/**
	 * The feature id for the '<em><b>Remove Weed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__REMOVE_WEED = STRUCTURE__REMOVE_WEED;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__HEIGHT = STRUCTURE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Fumigant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__FUMIGANT_NAME = STRUCTURE__FUMIGANT_NAME;

	/**
	 * The feature id for the '<em><b>Mounting Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__MOUNTING_CONNECTIONS = STRUCTURE__MOUNTING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Material Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__MATERIAL_KIND = STRUCTURE__MATERIAL_KIND;

	/**
	 * The feature id for the '<em><b>Breast Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__BREAST_BLOCK = STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__DIAMETER = STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__BASE_KIND = STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Jpa Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__JPA_REFERENCE = STRUCTURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Treatment Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__TREATMENT_KIND = STRUCTURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Preservative Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__PRESERVATIVE_KIND = STRUCTURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Streetlights</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__STREETLIGHTS = STRUCTURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__LENGTH = STRUCTURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Construction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__CONSTRUCTION = STRUCTURE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Species Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__SPECIES_TYPE = STRUCTURE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__CLASSIFICATION = STRUCTURE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Treated Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE__TREATED_DATE_TIME = STRUCTURE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Pole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE_FEATURE_COUNT = STRUCTURE_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Pole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POLE_OPERATION_COUNT = STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.AnchorKind <em>Anchor Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.AnchorKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getAnchorKind()
	 * @generated
	 */
	public static final int ANCHOR_KIND = 53;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.TowerConstructionKind <em>Tower Construction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.TowerConstructionKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getTowerConstructionKind()
	 * @generated
	 */
	public static final int TOWER_CONSTRUCTION_KIND = 54;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.ProcedureKind <em>Procedure Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.ProcedureKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getProcedureKind()
	 * @generated
	 */
	public static final int PROCEDURE_KIND = 55;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.FacilityKind <em>Facility Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.FacilityKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getFacilityKind()
	 * @generated
	 */
	public static final int FACILITY_KIND = 56;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.MediumKind <em>Medium Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.MediumKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getMediumKind()
	 * @generated
	 */
	public static final int MEDIUM_KIND = 57;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructureKind <em>Underground Structure Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.UndergroundStructureKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getUndergroundStructureKind()
	 * @generated
	 */
	public static final int UNDERGROUND_STRUCTURE_KIND = 58;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.PolePreservativeKind <em>Pole Preservative Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.PolePreservativeKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getPolePreservativeKind()
	 * @generated
	 */
	public static final int POLE_PRESERVATIVE_KIND = 59;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceLocalControlKind <em>Shunt Impedance Local Control Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceLocalControlKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntImpedanceLocalControlKind()
	 * @generated
	 */
	public static final int SHUNT_IMPEDANCE_LOCAL_CONTROL_KIND = 60;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.CoolingKind <em>Cooling Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.CoolingKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getCoolingKind()
	 * @generated
	 */
	public static final int COOLING_KIND = 61;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.RegulationBranchKind <em>Regulation Branch Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.RegulationBranchKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getRegulationBranchKind()
	 * @generated
	 */
	public static final int REGULATION_BRANCH_KIND = 62;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.VehicleUsageKind <em>Vehicle Usage Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.VehicleUsageKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getVehicleUsageKind()
	 * @generated
	 */
	public static final int VEHICLE_USAGE_KIND = 63;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.SubstationFunctionKind <em>Substation Function Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.SubstationFunctionKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getSubstationFunctionKind()
	 * @generated
	 */
	public static final int SUBSTATION_FUNCTION_KIND = 64;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.JointFillKind <em>Joint Fill Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.JointFillKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getJointFillKind()
	 * @generated
	 */
	public static final int JOINT_FILL_KIND = 65;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationPfTestKind <em>Bushing Insulation Pf Test Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.BushingInsulationPfTestKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getBushingInsulationPfTestKind()
	 * @generated
	 */
	public static final int BUSHING_INSULATION_PF_TEST_KIND = 66;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.PoleTreatmentKind <em>Pole Treatment Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.PoleTreatmentKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getPoleTreatmentKind()
	 * @generated
	 */
	public static final int POLE_TREATMENT_KIND = 67;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.FaultIndicatorResetKind <em>Fault Indicator Reset Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.FaultIndicatorResetKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getFaultIndicatorResetKind()
	 * @generated
	 */
	public static final int FAULT_INDICATOR_RESET_KIND = 68;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceControlKind <em>Shunt Impedance Control Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceControlKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntImpedanceControlKind()
	 * @generated
	 */
	public static final int SHUNT_IMPEDANCE_CONTROL_KIND = 69;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.JointConfigurationKind <em>Joint Configuration Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.JointConfigurationKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getJointConfigurationKind()
	 * @generated
	 */
	public static final int JOINT_CONFIGURATION_KIND = 70;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.PoleBaseKind <em>Pole Base Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.PoleBaseKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getPoleBaseKind()
	 * @generated
	 */
	public static final int POLE_BASE_KIND = 71;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.FACTSDeviceKind <em>FACTS Device Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.FACTSDeviceKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getFACTSDeviceKind()
	 * @generated
	 */
	public static final int FACTS_DEVICE_KIND = 72;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupportKind <em>Structure Support Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.StructureSupportKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getStructureSupportKind()
	 * @generated
	 */
	public static final int STRUCTURE_SUPPORT_KIND = 73;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationKind <em>Bushing Insulation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.BushingInsulationKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getBushingInsulationKind()
	 * @generated
	 */
	public static final int BUSHING_INSULATION_KIND = 74;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.StructureMaterialKind <em>Structure Material Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.StructureMaterialKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getStructureMaterialKind()
	 * @generated
	 */
	public static final int STRUCTURE_MATERIAL_KIND = 75;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.StreetlightLampKind <em>Streetlight Lamp Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.StreetlightLampKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getStreetlightLampKind()
	 * @generated
	 */
	public static final int STREETLIGHT_LAMP_KIND = 76;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchKind <em>Composite Switch Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.CompositeSwitchKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getCompositeSwitchKind()
	 * @generated
	 */
	public static final int COMPOSITE_SWITCH_KIND = 77;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssets.FailureIsolationMethodKind <em>Failure Isolation Method Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssets.FailureIsolationMethodKind
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#getFailureIsolationMethodKind()
	 * @generated
	 */
	public static final int FAILURE_ISOLATION_METHOD_KIND = 78;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factsDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass docAssetRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ductBankEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conductorAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass financialInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protectionEquipmentInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureDataSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windingInsulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass undergroundStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass potentialTransformerInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentTransformerInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bushingInsulationPFEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electricalInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEquipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faultIndicatorInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerRatingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetAssetRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformerAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakerInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeSwitchInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cabinetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bushingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surgeProtectorInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comEquipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetPropertyCurveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionsInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass towerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mountingConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recloserInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shuntImpedanceInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shuntCompensatorInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mountingPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substationAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streetlightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orgAssetRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testDataSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericAssetModelOrMaterialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reliabilityInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformerObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum anchorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum towerConstructionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum facilityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mediumKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum undergroundStructureKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum polePreservativeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shuntImpedanceLocalControlKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coolingKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum regulationBranchKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vehicleUsageKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum substationFunctionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jointFillKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bushingInsulationPfTestKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum poleTreatmentKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum faultIndicatorResetKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shuntImpedanceControlKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jointConfigurationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum poleBaseKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum factsDeviceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum structureSupportKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bushingInsulationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum structureMaterialKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum streetlightLampKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compositeSwitchKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum failureIsolationMethodKindEEnum = null;

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
	 * @see CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InfAssetsPackage() {
		super(eNS_URI, InfAssetsFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link InfAssetsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static InfAssetsPackage init() {
		if (isInited) return (InfAssetsPackage)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI);

		// Obtain or create and register package
		InfAssetsPackage theInfAssetsPackage = (InfAssetsPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InfAssetsPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InfAssetsPackage());

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
		theInfAssetsPackage.fixPackageContents();
		theCIM15Package.fixPackageContents();
		theIEC61970Package.fixPackageContents();
		theSCADAPackage.fixPackageContents();
		theProductionPackage.fixPackageContents();
		theGenerationDynamicsPackage.fixPackageContents();
		theInfWorkPackage.fixPackageContents();
		theInfERPSupportPackage.fixPackageContents();
		theInfCommonPackage.fixPackageContents();
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
		theInfAssetsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InfAssetsPackage.eNS_URI, theInfAssetsPackage);
		return theInfAssetsPackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.FACTSDevice <em>FACTS Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FACTS Device</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FACTSDevice
	 * @generated
	 */
	public EClass getFACTSDevice() {
		if (factsDeviceEClass == null) {
			factsDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(0);
		}
		return factsDeviceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.FACTSDevice#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FACTSDevice#getKind()
	 * @see #getFACTSDevice()
	 * @generated
	 */
	public EAttribute getFACTSDevice_Kind() {
        return (EAttribute)getFACTSDevice().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.DocAssetRole <em>Doc Asset Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc Asset Role</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.DocAssetRole
	 * @generated
	 */
	public EClass getDocAssetRole() {
		if (docAssetRoleEClass == null) {
			docAssetRoleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(1);
		}
		return docAssetRoleEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.DocAssetRole#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.DocAssetRole#getDocument()
	 * @see #getDocAssetRole()
	 * @generated
	 */
	public EReference getDocAssetRole_Document() {
        return (EReference)getDocAssetRole().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.DocAssetRole#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.DocAssetRole#getAsset()
	 * @see #getDocAssetRole()
	 * @generated
	 */
	public EReference getDocAssetRole_Asset() {
        return (EReference)getDocAssetRole().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.DuctBank <em>Duct Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duct Bank</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.DuctBank
	 * @generated
	 */
	public EClass getDuctBank() {
		if (ductBankEClass == null) {
			ductBankEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(2);
		}
		return ductBankEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.DuctBank#getDuctInfos <em>Duct Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Duct Infos</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.DuctBank#getDuctInfos()
	 * @see #getDuctBank()
	 * @generated
	 */
	public EReference getDuctBank_DuctInfos() {
        return (EReference)getDuctBank().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.DuctBank#getCircuitCount <em>Circuit Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Circuit Count</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.DuctBank#getCircuitCount()
	 * @see #getDuctBank()
	 * @generated
	 */
	public EAttribute getDuctBank_CircuitCount() {
        return (EAttribute)getDuctBank().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset <em>Conductor Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conductor Asset</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ConductorAsset
	 * @generated
	 */
	public EClass getConductorAsset() {
		if (conductorAssetEClass == null) {
			conductorAssetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(3);
		}
		return conductorAssetEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset#isIsHorizontal <em>Is Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Horizontal</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ConductorAsset#isIsHorizontal()
	 * @see #getConductorAsset()
	 * @generated
	 */
	public EAttribute getConductorAsset_IsHorizontal() {
        return (EAttribute)getConductorAsset().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset#getCircuitSection <em>Circuit Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Circuit Section</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ConductorAsset#getCircuitSection()
	 * @see #getConductorAsset()
	 * @generated
	 */
	public EReference getConductorAsset_CircuitSection() {
        return (EReference)getConductorAsset().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset#getGroundingMethod <em>Grounding Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grounding Method</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ConductorAsset#getGroundingMethod()
	 * @see #getConductorAsset()
	 * @generated
	 */
	public EAttribute getConductorAsset_GroundingMethod() {
        return (EAttribute)getConductorAsset().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset#isInsulated <em>Insulated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insulated</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ConductorAsset#isInsulated()
	 * @see #getConductorAsset()
	 * @generated
	 */
	public EAttribute getConductorAsset_Insulated() {
        return (EAttribute)getConductorAsset().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset#getConductorSegment <em>Conductor Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conductor Segment</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ConductorAsset#getConductorSegment()
	 * @see #getConductorAsset()
	 * @generated
	 */
	public EReference getConductorAsset_ConductorSegment() {
        return (EReference)getConductorAsset().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo <em>Financial Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Financial Info</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FinancialInfo
	 * @generated
	 */
	public EClass getFinancialInfo() {
		if (financialInfoEClass == null) {
			financialInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(5);
		}
		return financialInfoEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getWarrantyEndDateTime <em>Warranty End Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Warranty End Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getWarrantyEndDateTime()
	 * @see #getFinancialInfo()
	 * @generated
	 */
	public EAttribute getFinancialInfo_WarrantyEndDateTime() {
        return (EAttribute)getFinancialInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getCostDescription <em>Cost Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Description</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getCostDescription()
	 * @see #getFinancialInfo()
	 * @generated
	 */
	public EAttribute getFinancialInfo_CostDescription() {
        return (EAttribute)getFinancialInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getPurchaseDateTime <em>Purchase Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purchase Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getPurchaseDateTime()
	 * @see #getFinancialInfo()
	 * @generated
	 */
	public EAttribute getFinancialInfo_PurchaseDateTime() {
        return (EAttribute)getFinancialInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getAccount()
	 * @see #getFinancialInfo()
	 * @generated
	 */
	public EAttribute getFinancialInfo_Account() {
        return (EAttribute)getFinancialInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getFinancialValue <em>Financial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Financial Value</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getFinancialValue()
	 * @see #getFinancialInfo()
	 * @generated
	 */
	public EAttribute getFinancialInfo_FinancialValue() {
        return (EAttribute)getFinancialInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getAsset()
	 * @see #getFinancialInfo()
	 * @generated
	 */
	public EReference getFinancialInfo_Asset() {
        return (EReference)getFinancialInfo().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getPurchaseOrderNumber <em>Purchase Order Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purchase Order Number</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getPurchaseOrderNumber()
	 * @see #getFinancialInfo()
	 * @generated
	 */
	public EAttribute getFinancialInfo_PurchaseOrderNumber() {
        return (EAttribute)getFinancialInfo().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getPlantTransferDateTime <em>Plant Transfer Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plant Transfer Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getPlantTransferDateTime()
	 * @see #getFinancialInfo()
	 * @generated
	 */
	public EAttribute getFinancialInfo_PlantTransferDateTime() {
        return (EAttribute)getFinancialInfo().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getQuantity()
	 * @see #getFinancialInfo()
	 * @generated
	 */
	public EAttribute getFinancialInfo_Quantity() {
        return (EAttribute)getFinancialInfo().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getValueDateTime <em>Value Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getValueDateTime()
	 * @see #getFinancialInfo()
	 * @generated
	 */
	public EAttribute getFinancialInfo_ValueDateTime() {
        return (EAttribute)getFinancialInfo().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getCostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Type</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getCostType()
	 * @see #getFinancialInfo()
	 * @generated
	 */
	public EAttribute getFinancialInfo_CostType() {
        return (EAttribute)getFinancialInfo().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getActualPurchaseCost <em>Actual Purchase Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Purchase Cost</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FinancialInfo#getActualPurchaseCost()
	 * @see #getFinancialInfo()
	 * @generated
	 */
	public EAttribute getFinancialInfo_ActualPurchaseCost() {
        return (EAttribute)getFinancialInfo().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo <em>Protection Equipment Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protection Equipment Info</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo
	 * @generated
	 */
	public EClass getProtectionEquipmentInfo() {
		if (protectionEquipmentInfoEClass == null) {
			protectionEquipmentInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(6);
		}
		return protectionEquipmentInfoEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo#getGroundTrip <em>Ground Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ground Trip</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo#getGroundTrip()
	 * @see #getProtectionEquipmentInfo()
	 * @generated
	 */
	public EAttribute getProtectionEquipmentInfo_GroundTrip() {
        return (EAttribute)getProtectionEquipmentInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo#getPhaseTrip <em>Phase Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Trip</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo#getPhaseTrip()
	 * @see #getProtectionEquipmentInfo()
	 * @generated
	 */
	public EAttribute getProtectionEquipmentInfo_PhaseTrip() {
        return (EAttribute)getProtectionEquipmentInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet <em>Procedure Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Data Set</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet
	 * @generated
	 */
	public EClass getProcedureDataSet() {
		if (procedureDataSetEClass == null) {
			procedureDataSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(7);
		}
		return procedureDataSetEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getProperties()
	 * @see #getProcedureDataSet()
	 * @generated
	 */
	public EReference getProcedureDataSet_Properties() {
        return (EReference)getProcedureDataSet().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getTransformerObservations <em>Transformer Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer Observations</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getTransformerObservations()
	 * @see #getProcedureDataSet()
	 * @generated
	 */
	public EReference getProcedureDataSet_TransformerObservations() {
        return (EReference)getProcedureDataSet().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Procedure</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getProcedure()
	 * @see #getProcedureDataSet()
	 * @generated
	 */
	public EReference getProcedureDataSet_Procedure() {
        return (EReference)getProcedureDataSet().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getCompletedDateTime <em>Completed Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completed Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getCompletedDateTime()
	 * @see #getProcedureDataSet()
	 * @generated
	 */
	public EAttribute getProcedureDataSet_CompletedDateTime() {
        return (EAttribute)getProcedureDataSet().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getMeasurementValues <em>Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurement Values</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getMeasurementValues()
	 * @see #getProcedureDataSet()
	 * @generated
	 */
	public EReference getProcedureDataSet_MeasurementValues() {
        return (EReference)getProcedureDataSet().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation <em>Winding Insulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Winding Insulation</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.WindingInsulation
	 * @generated
	 */
	public EClass getWindingInsulation() {
		if (windingInsulationEClass == null) {
			windingInsulationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(8);
		}
		return windingInsulationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getInsulationPFStatus <em>Insulation PF Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insulation PF Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getInsulationPFStatus()
	 * @see #getWindingInsulation()
	 * @generated
	 */
	public EAttribute getWindingInsulation_InsulationPFStatus() {
        return (EAttribute)getWindingInsulation().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getGround <em>Ground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ground</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getGround()
	 * @see #getWindingInsulation()
	 * @generated
	 */
	public EReference getWindingInsulation_Ground() {
        return (EReference)getWindingInsulation().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getTransformerObservation <em>Transformer Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer Observation</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getTransformerObservation()
	 * @see #getWindingInsulation()
	 * @generated
	 */
	public EReference getWindingInsulation_TransformerObservation() {
        return (EReference)getWindingInsulation().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getInsulationResistance <em>Insulation Resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insulation Resistance</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getInsulationResistance()
	 * @see #getWindingInsulation()
	 * @generated
	 */
	public EAttribute getWindingInsulation_InsulationResistance() {
        return (EAttribute)getWindingInsulation().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getToWinding <em>To Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Winding</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getToWinding()
	 * @see #getWindingInsulation()
	 * @generated
	 */
	public EReference getWindingInsulation_ToWinding() {
        return (EReference)getWindingInsulation().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getLeakageReactance <em>Leakage Reactance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leakage Reactance</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getLeakageReactance()
	 * @see #getWindingInsulation()
	 * @generated
	 */
	public EAttribute getWindingInsulation_LeakageReactance() {
        return (EAttribute)getWindingInsulation().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getFromWinding <em>From Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Winding</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getFromWinding()
	 * @see #getWindingInsulation()
	 * @generated
	 */
	public EReference getWindingInsulation_FromWinding() {
        return (EReference)getWindingInsulation().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getStatus()
	 * @see #getWindingInsulation()
	 * @generated
	 */
	public EReference getWindingInsulation_Status() {
        return (EReference)getWindingInsulation().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Specification
	 * @generated
	 */
	public EClass getSpecification() {
		if (specificationEClass == null) {
			specificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(9);
		}
		return specificationEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.Specification#getAssetPropertyCurves <em>Asset Property Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asset Property Curves</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Specification#getAssetPropertyCurves()
	 * @see #getSpecification()
	 * @generated
	 */
	public EReference getSpecification_AssetPropertyCurves() {
        return (EReference)getSpecification().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.Specification#getMediums <em>Mediums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mediums</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Specification#getMediums()
	 * @see #getSpecification()
	 * @generated
	 */
	public EReference getSpecification_Mediums() {
        return (EReference)getSpecification().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.Specification#getAssetProperites <em>Asset Properites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asset Properites</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Specification#getAssetProperites()
	 * @see #getSpecification()
	 * @generated
	 */
	public EReference getSpecification_AssetProperites() {
        return (EReference)getSpecification().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.Specification#getReliabilityInfos <em>Reliability Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reliability Infos</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Specification#getReliabilityInfos()
	 * @see #getSpecification()
	 * @generated
	 */
	public EReference getSpecification_ReliabilityInfos() {
        return (EReference)getSpecification().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.Specification#getDimensionsInfos <em>Dimensions Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dimensions Infos</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Specification#getDimensionsInfos()
	 * @see #getSpecification()
	 * @generated
	 */
	public EReference getSpecification_DimensionsInfos() {
        return (EReference)getSpecification().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.Specification#getRatings <em>Ratings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ratings</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Specification#getRatings()
	 * @see #getSpecification()
	 * @generated
	 */
	public EReference getSpecification_Ratings() {
        return (EReference)getSpecification().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.Specification#getQualificationRequirements <em>Qualification Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Qualification Requirements</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Specification#getQualificationRequirements()
	 * @see #getSpecification()
	 * @generated
	 */
	public EReference getSpecification_QualificationRequirements() {
        return (EReference)getSpecification().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructure <em>Underground Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Underground Structure</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.UndergroundStructure
	 * @generated
	 */
	public EClass getUndergroundStructure() {
		if (undergroundStructureEClass == null) {
			undergroundStructureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(10);
		}
		return undergroundStructureEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructure#isHasVentilation <em>Has Ventilation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Ventilation</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.UndergroundStructure#isHasVentilation()
	 * @see #getUndergroundStructure()
	 * @generated
	 */
	public EAttribute getUndergroundStructure_HasVentilation() {
        return (EAttribute)getUndergroundStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructure#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.UndergroundStructure#getKind()
	 * @see #getUndergroundStructure()
	 * @generated
	 */
	public EAttribute getUndergroundStructure_Kind() {
        return (EAttribute)getUndergroundStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructure#getMaterial <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Material</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.UndergroundStructure#getMaterial()
	 * @see #getUndergroundStructure()
	 * @generated
	 */
	public EAttribute getUndergroundStructure_Material() {
        return (EAttribute)getUndergroundStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructure#getSealingWarrantyExpiresDate <em>Sealing Warranty Expires Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sealing Warranty Expires Date</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.UndergroundStructure#getSealingWarrantyExpiresDate()
	 * @see #getUndergroundStructure()
	 * @generated
	 */
	public EAttribute getUndergroundStructure_SealingWarrantyExpiresDate() {
        return (EAttribute)getUndergroundStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo <em>Potential Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Potential Transformer Info</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo
	 * @generated
	 */
	public EClass getPotentialTransformerInfo() {
		if (potentialTransformerInfoEClass == null) {
			potentialTransformerInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(11);
		}
		return potentialTransformerInfoEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getNominalRatio <em>Nominal Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nominal Ratio</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getNominalRatio()
	 * @see #getPotentialTransformerInfo()
	 * @generated
	 */
	public EReference getPotentialTransformerInfo_NominalRatio() {
        return (EReference)getPotentialTransformerInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getPtClass <em>Pt Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pt Class</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getPtClass()
	 * @see #getPotentialTransformerInfo()
	 * @generated
	 */
	public EAttribute getPotentialTransformerInfo_PtClass() {
        return (EAttribute)getPotentialTransformerInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getPrimaryRatio <em>Primary Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Ratio</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getPrimaryRatio()
	 * @see #getPotentialTransformerInfo()
	 * @generated
	 */
	public EReference getPotentialTransformerInfo_PrimaryRatio() {
        return (EReference)getPotentialTransformerInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getTertiaryRatio <em>Tertiary Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tertiary Ratio</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getTertiaryRatio()
	 * @see #getPotentialTransformerInfo()
	 * @generated
	 */
	public EReference getPotentialTransformerInfo_TertiaryRatio() {
        return (EReference)getPotentialTransformerInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getAccuracyClass <em>Accuracy Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy Class</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getAccuracyClass()
	 * @see #getPotentialTransformerInfo()
	 * @generated
	 */
	public EAttribute getPotentialTransformerInfo_AccuracyClass() {
        return (EAttribute)getPotentialTransformerInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getPTs <em>PTs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>PTs</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getPTs()
	 * @see #getPotentialTransformerInfo()
	 * @generated
	 */
	public EReference getPotentialTransformerInfo_PTs() {
        return (EReference)getPotentialTransformerInfo().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getSecondaryRatio <em>Secondary Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Secondary Ratio</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getSecondaryRatio()
	 * @see #getPotentialTransformerInfo()
	 * @generated
	 */
	public EReference getPotentialTransformerInfo_SecondaryRatio() {
        return (EReference)getPotentialTransformerInfo().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Structure
	 * @generated
	 */
	public EClass getStructure() {
		if (structureEClass == null) {
			structureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(12);
		}
		return structureEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getRatedVoltage <em>Rated Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Voltage</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Structure#getRatedVoltage()
	 * @see #getStructure()
	 * @generated
	 */
	public EAttribute getStructure_RatedVoltage() {
        return (EAttribute)getStructure().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getStructureSupportInfos <em>Structure Support Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Structure Support Infos</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Structure#getStructureSupportInfos()
	 * @see #getStructure()
	 * @generated
	 */
	public EReference getStructure_StructureSupportInfos() {
        return (EReference)getStructure().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getFumigantAppliedDate <em>Fumigant Applied Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fumigant Applied Date</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Structure#getFumigantAppliedDate()
	 * @see #getStructure()
	 * @generated
	 */
	public EAttribute getStructure_FumigantAppliedDate() {
        return (EAttribute)getStructure().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getWeedRemovedDate <em>Weed Removed Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weed Removed Date</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Structure#getWeedRemovedDate()
	 * @see #getStructure()
	 * @generated
	 */
	public EAttribute getStructure_WeedRemovedDate() {
        return (EAttribute)getStructure().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Structure#isRemoveWeed <em>Remove Weed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remove Weed</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Structure#isRemoveWeed()
	 * @see #getStructure()
	 * @generated
	 */
	public EAttribute getStructure_RemoveWeed() {
        return (EAttribute)getStructure().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Structure#getHeight()
	 * @see #getStructure()
	 * @generated
	 */
	public EAttribute getStructure_Height() {
        return (EAttribute)getStructure().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getFumigantName <em>Fumigant Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fumigant Name</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Structure#getFumigantName()
	 * @see #getStructure()
	 * @generated
	 */
	public EAttribute getStructure_FumigantName() {
        return (EAttribute)getStructure().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getMountingConnections <em>Mounting Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mounting Connections</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Structure#getMountingConnections()
	 * @see #getStructure()
	 * @generated
	 */
	public EReference getStructure_MountingConnections() {
        return (EReference)getStructure().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getMaterialKind <em>Material Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Material Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Structure#getMaterialKind()
	 * @see #getStructure()
	 * @generated
	 */
	public EAttribute getStructure_MaterialKind() {
        return (EAttribute)getStructure().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo <em>Current Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Transformer Info</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo
	 * @generated
	 */
	public EClass getCurrentTransformerInfo() {
		if (currentTransformerInfoEClass == null) {
			currentTransformerInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(14);
		}
		return currentTransformerInfoEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getTertiaryFlsRating <em>Tertiary Fls Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tertiary Fls Rating</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getTertiaryFlsRating()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	public EAttribute getCurrentTransformerInfo_TertiaryFlsRating() {
        return (EAttribute)getCurrentTransformerInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCoreCount <em>Core Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Count</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCoreCount()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	public EAttribute getCurrentTransformerInfo_CoreCount() {
        return (EAttribute)getCurrentTransformerInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getNominalRatio <em>Nominal Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nominal Ratio</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getNominalRatio()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	public EReference getCurrentTransformerInfo_NominalRatio() {
        return (EReference)getCurrentTransformerInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getSecondaryFlsRating <em>Secondary Fls Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secondary Fls Rating</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getSecondaryFlsRating()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	public EAttribute getCurrentTransformerInfo_SecondaryFlsRating() {
        return (EAttribute)getCurrentTransformerInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getUsage()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	public EAttribute getCurrentTransformerInfo_Usage() {
        return (EAttribute)getCurrentTransformerInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getAccuracyClass <em>Accuracy Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy Class</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getAccuracyClass()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	public EAttribute getCurrentTransformerInfo_AccuracyClass() {
        return (EAttribute)getCurrentTransformerInfo().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getSecondaryRatio <em>Secondary Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Secondary Ratio</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getSecondaryRatio()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	public EReference getCurrentTransformerInfo_SecondaryRatio() {
        return (EReference)getCurrentTransformerInfo().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCTs <em>CTs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>CTs</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCTs()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	public EReference getCurrentTransformerInfo_CTs() {
        return (EReference)getCurrentTransformerInfo().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCtClass <em>Ct Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ct Class</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCtClass()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	public EAttribute getCurrentTransformerInfo_CtClass() {
        return (EAttribute)getCurrentTransformerInfo().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getKneePointVoltage <em>Knee Point Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Knee Point Voltage</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getKneePointVoltage()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	public EAttribute getCurrentTransformerInfo_KneePointVoltage() {
        return (EAttribute)getCurrentTransformerInfo().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getTertiaryRatio <em>Tertiary Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tertiary Ratio</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getTertiaryRatio()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	public EReference getCurrentTransformerInfo_TertiaryRatio() {
        return (EReference)getCurrentTransformerInfo().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCoreBurden <em>Core Burden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Burden</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCoreBurden()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	public EAttribute getCurrentTransformerInfo_CoreBurden() {
        return (EAttribute)getCurrentTransformerInfo().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getMaxRatio <em>Max Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Ratio</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getMaxRatio()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	public EReference getCurrentTransformerInfo_MaxRatio() {
        return (EReference)getCurrentTransformerInfo().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getAccuracyLimit <em>Accuracy Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy Limit</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getAccuracyLimit()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	public EAttribute getCurrentTransformerInfo_AccuracyLimit() {
        return (EAttribute)getCurrentTransformerInfo().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getKneePointCurrent <em>Knee Point Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Knee Point Current</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getKneePointCurrent()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	public EAttribute getCurrentTransformerInfo_KneePointCurrent() {
        return (EAttribute)getCurrentTransformerInfo().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getPrimaryRatio <em>Primary Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Ratio</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getPrimaryRatio()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	public EReference getCurrentTransformerInfo_PrimaryRatio() {
        return (EReference)getCurrentTransformerInfo().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getPrimaryFlsRating <em>Primary Fls Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Fls Rating</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getPrimaryFlsRating()
	 * @see #getCurrentTransformerInfo()
	 * @generated
	 */
	public EAttribute getCurrentTransformerInfo_PrimaryFlsRating() {
        return (EAttribute)getCurrentTransformerInfo().getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF <em>Bushing Insulation PF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bushing Insulation PF</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF
	 * @generated
	 */
	public EClass getBushingInsulationPF() {
		if (bushingInsulationPFEClass == null) {
			bushingInsulationPFEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(15);
		}
		return bushingInsulationPFEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF#getStatus()
	 * @see #getBushingInsulationPF()
	 * @generated
	 */
	public EReference getBushingInsulationPF_Status() {
        return (EReference)getBushingInsulationPF().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF#getTransformerObservation <em>Transformer Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer Observation</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF#getTransformerObservation()
	 * @see #getBushingInsulationPF()
	 * @generated
	 */
	public EReference getBushingInsulationPF_TransformerObservation() {
        return (EReference)getBushingInsulationPF().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF#getTestKind <em>Test Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF#getTestKind()
	 * @see #getBushingInsulationPF()
	 * @generated
	 */
	public EAttribute getBushingInsulationPF_TestKind() {
        return (EAttribute)getBushingInsulationPF().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF#getBushingInfo <em>Bushing Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bushing Info</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.BushingInsulationPF#getBushingInfo()
	 * @see #getBushingInsulationPF()
	 * @generated
	 */
	public EReference getBushingInsulationPF_BushingInfo() {
        return (EReference)getBushingInsulationPF().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.Joint <em>Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joint</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Joint
	 * @generated
	 */
	public EClass getJoint() {
		if (jointEClass == null) {
			jointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(16);
		}
		return jointEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Joint#getInsulation <em>Insulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insulation</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Joint#getInsulation()
	 * @see #getJoint()
	 * @generated
	 */
	public EAttribute getJoint_Insulation() {
        return (EAttribute)getJoint().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Joint#getFillKind <em>Fill Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Joint#getFillKind()
	 * @see #getJoint()
	 * @generated
	 */
	public EAttribute getJoint_FillKind() {
        return (EAttribute)getJoint().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Joint#getConfigurationKind <em>Configuration Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Joint#getConfigurationKind()
	 * @see #getJoint()
	 * @generated
	 */
	public EAttribute getJoint_ConfigurationKind() {
        return (EAttribute)getJoint().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo <em>Electrical Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electrical Info</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ElectricalInfo
	 * @generated
	 */
	public EClass getElectricalInfo() {
		if (electricalInfoEClass == null) {
			electricalInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(17);
		}
		return electricalInfoEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getPhaseCount <em>Phase Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Count</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getPhaseCount()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	public EAttribute getElectricalInfo_PhaseCount() {
        return (EAttribute)getElectricalInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedApparentPower <em>Rated Apparent Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Apparent Power</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedApparentPower()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	public EAttribute getElectricalInfo_RatedApparentPower() {
        return (EAttribute)getElectricalInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getPhaseCode <em>Phase Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getPhaseCode()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	public EAttribute getElectricalInfo_PhaseCode() {
        return (EAttribute)getElectricalInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getFrequency()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	public EAttribute getElectricalInfo_Frequency() {
        return (EAttribute)getElectricalInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getR0 <em>R0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R0</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getR0()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	public EAttribute getElectricalInfo_R0() {
        return (EAttribute)getElectricalInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getR()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	public EAttribute getElectricalInfo_R() {
        return (EAttribute)getElectricalInfo().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getBil <em>Bil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bil</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getBil()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	public EAttribute getElectricalInfo_Bil() {
        return (EAttribute)getElectricalInfo().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getX0 <em>X0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X0</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getX0()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	public EAttribute getElectricalInfo_X0() {
        return (EAttribute)getElectricalInfo().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getX()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	public EAttribute getElectricalInfo_X() {
        return (EAttribute)getElectricalInfo().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedCurrent <em>Rated Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Current</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedCurrent()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	public EAttribute getElectricalInfo_RatedCurrent() {
        return (EAttribute)getElectricalInfo().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getWireCount <em>Wire Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wire Count</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getWireCount()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	public EAttribute getElectricalInfo_WireCount() {
        return (EAttribute)getElectricalInfo().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getB0 <em>B0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B0</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getB0()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	public EAttribute getElectricalInfo_B0() {
        return (EAttribute)getElectricalInfo().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getB()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	public EAttribute getElectricalInfo_B() {
        return (EAttribute)getElectricalInfo().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedVoltage <em>Rated Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Voltage</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getRatedVoltage()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	public EAttribute getElectricalInfo_RatedVoltage() {
        return (EAttribute)getElectricalInfo().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getG()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	public EAttribute getElectricalInfo_G() {
        return (EAttribute)getElectricalInfo().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getG0 <em>G0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G0</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#getG0()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	public EAttribute getElectricalInfo_G0() {
        return (EAttribute)getElectricalInfo().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#isIsConnected <em>Is Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Connected</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ElectricalInfo#isIsConnected()
	 * @see #getElectricalInfo()
	 * @generated
	 */
	public EAttribute getElectricalInfo_IsConnected() {
        return (EAttribute)getElectricalInfo().getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.WorkEquipment <em>Work Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Equipment</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.WorkEquipment
	 * @generated
	 */
	public EClass getWorkEquipment() {
		if (workEquipmentEClass == null) {
			workEquipmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(18);
		}
		return workEquipmentEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.WorkEquipment#getCrew <em>Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Crew</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.WorkEquipment#getCrew()
	 * @see #getWorkEquipment()
	 * @generated
	 */
	public EReference getWorkEquipment_Crew() {
        return (EReference)getWorkEquipment().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.WorkEquipment#getUsages <em>Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usages</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.WorkEquipment#getUsages()
	 * @see #getWorkEquipment()
	 * @generated
	 */
	public EReference getWorkEquipment_Usages() {
        return (EReference)getWorkEquipment().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.FaultIndicatorInfo <em>Fault Indicator Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Indicator Info</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FaultIndicatorInfo
	 * @generated
	 */
	public EClass getFaultIndicatorInfo() {
		if (faultIndicatorInfoEClass == null) {
			faultIndicatorInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(20);
		}
		return faultIndicatorInfoEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.FaultIndicatorInfo#getFaultIndicators <em>Fault Indicators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fault Indicators</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FaultIndicatorInfo#getFaultIndicators()
	 * @see #getFaultIndicatorInfo()
	 * @generated
	 */
	public EReference getFaultIndicatorInfo_FaultIndicators() {
        return (EReference)getFaultIndicatorInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.FaultIndicatorInfo#getResetKind <em>Reset Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FaultIndicatorInfo#getResetKind()
	 * @see #getFaultIndicatorInfo()
	 * @generated
	 */
	public EAttribute getFaultIndicatorInfo_ResetKind() {
        return (EAttribute)getFaultIndicatorInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.Duct <em>Duct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duct</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Duct
	 * @generated
	 */
	public EClass getDuct() {
		if (ductEClass == null) {
			ductEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(21);
		}
		return ductEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Duct#getXCoord <em>XCoord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XCoord</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Duct#getXCoord()
	 * @see #getDuct()
	 * @generated
	 */
	public EAttribute getDuct_XCoord() {
        return (EAttribute)getDuct().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Duct#getYCoord <em>YCoord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YCoord</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Duct#getYCoord()
	 * @see #getDuct()
	 * @generated
	 */
	public EAttribute getDuct_YCoord() {
        return (EAttribute)getDuct().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.Duct#getDuctBankInfo <em>Duct Bank Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Duct Bank Info</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Duct#getDuctBankInfo()
	 * @see #getDuct()
	 * @generated
	 */
	public EReference getDuct_DuctBankInfo() {
        return (EReference)getDuct().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.Duct#getCableInfos <em>Cable Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cable Infos</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Duct#getCableInfos()
	 * @see #getDuct()
	 * @generated
	 */
	public EReference getDuct_CableInfos() {
        return (EReference)getDuct().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.PowerRating <em>Power Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Rating</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.PowerRating
	 * @generated
	 */
	public EClass getPowerRating() {
		if (powerRatingEClass == null) {
			powerRatingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(22);
		}
		return powerRatingEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.PowerRating#getTransformerAssets <em>Transformer Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer Assets</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.PowerRating#getTransformerAssets()
	 * @see #getPowerRating()
	 * @generated
	 */
	public EReference getPowerRating_TransformerAssets() {
        return (EReference)getPowerRating().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.PowerRating#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stage</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.PowerRating#getStage()
	 * @see #getPowerRating()
	 * @generated
	 */
	public EAttribute getPowerRating_Stage() {
        return (EAttribute)getPowerRating().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.PowerRating#getPowerRating <em>Power Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Rating</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.PowerRating#getPowerRating()
	 * @see #getPowerRating()
	 * @generated
	 */
	public EAttribute getPowerRating_PowerRating() {
        return (EAttribute)getPowerRating().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.PowerRating#getCoolingKind <em>Cooling Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cooling Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.PowerRating#getCoolingKind()
	 * @see #getPowerRating()
	 * @generated
	 */
	public EAttribute getPowerRating_CoolingKind() {
        return (EAttribute)getPowerRating().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.AssetAssetRole <em>Asset Asset Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Asset Role</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.AssetAssetRole
	 * @generated
	 */
	public EClass getAssetAssetRole() {
		if (assetAssetRoleEClass == null) {
			assetAssetRoleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(23);
		}
		return assetAssetRoleEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.AssetAssetRole#getToAsset <em>To Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Asset</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.AssetAssetRole#getToAsset()
	 * @see #getAssetAssetRole()
	 * @generated
	 */
	public EReference getAssetAssetRole_ToAsset() {
        return (EReference)getAssetAssetRole().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.AssetAssetRole#getFromAsset <em>From Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Asset</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.AssetAssetRole#getFromAsset()
	 * @see #getAssetAssetRole()
	 * @generated
	 */
	public EReference getAssetAssetRole_FromAsset() {
        return (EReference)getAssetAssetRole().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.TransformerAsset <em>Transformer Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer Asset</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerAsset
	 * @generated
	 */
	public EClass getTransformerAsset() {
		if (transformerAssetEClass == null) {
			transformerAssetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(24);
		}
		return transformerAssetEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getPowerRatings <em>Power Ratings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power Ratings</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getPowerRatings()
	 * @see #getTransformerAsset()
	 * @generated
	 */
	public EReference getTransformerAsset_PowerRatings() {
        return (EReference)getTransformerAsset().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerObservations <em>Transformer Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer Observations</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerObservations()
	 * @see #getTransformerAsset()
	 * @generated
	 */
	public EReference getTransformerAsset_TransformerObservations() {
        return (EReference)getTransformerAsset().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getReconditionedDateTime <em>Reconditioned Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reconditioned Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getReconditionedDateTime()
	 * @see #getTransformerAsset()
	 * @generated
	 */
	public EAttribute getTransformerAsset_ReconditionedDateTime() {
        return (EAttribute)getTransformerAsset().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerInfo <em>Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer Info</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerInfo()
	 * @see #getTransformerAsset()
	 * @generated
	 */
	public EReference getTransformerAsset_TransformerInfo() {
        return (EReference)getTransformerAsset().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerAssetModel <em>Transformer Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer Asset Model</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerAssetModel()
	 * @see #getTransformerAsset()
	 * @generated
	 */
	public EReference getTransformerAsset_TransformerAssetModel() {
        return (EReference)getTransformerAsset().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Procedure
	 * @generated
	 */
	public EClass getProcedure() {
		if (procedureEClass == null) {
			procedureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(25);
		}
		return procedureEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Procedure#getCorporateCode <em>Corporate Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corporate Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Procedure#getCorporateCode()
	 * @see #getProcedure()
	 * @generated
	 */
	public EAttribute getProcedure_CorporateCode() {
        return (EAttribute)getProcedure().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.Procedure#getProcedureValues <em>Procedure Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Procedure Values</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Procedure#getProcedureValues()
	 * @see #getProcedure()
	 * @generated
	 */
	public EReference getProcedure_ProcedureValues() {
        return (EReference)getProcedure().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Procedure#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Procedure#getSequenceNumber()
	 * @see #getProcedure()
	 * @generated
	 */
	public EAttribute getProcedure_SequenceNumber() {
        return (EAttribute)getProcedure().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.Procedure#getProcedureDataSets <em>Procedure Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Procedure Data Sets</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Procedure#getProcedureDataSets()
	 * @see #getProcedure()
	 * @generated
	 */
	public EReference getProcedure_ProcedureDataSets() {
        return (EReference)getProcedure().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.Procedure#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compatible Units</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Procedure#getCompatibleUnits()
	 * @see #getProcedure()
	 * @generated
	 */
	public EReference getProcedure_CompatibleUnits() {
        return (EReference)getProcedure().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Procedure#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Procedure#getKind()
	 * @see #getProcedure()
	 * @generated
	 */
	public EAttribute getProcedure_Kind() {
        return (EAttribute)getProcedure().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.Procedure#getLimits <em>Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Limits</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Procedure#getLimits()
	 * @see #getProcedure()
	 * @generated
	 */
	public EReference getProcedure_Limits() {
        return (EReference)getProcedure().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Procedure#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instruction</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Procedure#getInstruction()
	 * @see #getProcedure()
	 * @generated
	 */
	public EAttribute getProcedure_Instruction() {
        return (EAttribute)getProcedure().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.BreakerInfo <em>Breaker Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Breaker Info</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.BreakerInfo
	 * @generated
	 */
	public EClass getBreakerInfo() {
		if (breakerInfoEClass == null) {
			breakerInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(26);
		}
		return breakerInfoEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.BreakerInfo#getPhaseTrip <em>Phase Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Trip</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.BreakerInfo#getPhaseTrip()
	 * @see #getBreakerInfo()
	 * @generated
	 */
	public EAttribute getBreakerInfo_PhaseTrip() {
        return (EAttribute)getBreakerInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo <em>Composite Switch Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Switch Info</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo
	 * @generated
	 */
	public EClass getCompositeSwitchInfo() {
		if (compositeSwitchInfoEClass == null) {
			compositeSwitchInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(27);
		}
		return compositeSwitchInfoEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getKind()
	 * @see #getCompositeSwitchInfo()
	 * @generated
	 */
	public EAttribute getCompositeSwitchInfo_Kind() {
        return (EAttribute)getCompositeSwitchInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getPhaseCode <em>Phase Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getPhaseCode()
	 * @see #getCompositeSwitchInfo()
	 * @generated
	 */
	public EAttribute getCompositeSwitchInfo_PhaseCode() {
        return (EAttribute)getCompositeSwitchInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#isRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#isRemote()
	 * @see #getCompositeSwitchInfo()
	 * @generated
	 */
	public EAttribute getCompositeSwitchInfo_Remote() {
        return (EAttribute)getCompositeSwitchInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getSwitchStateCount <em>Switch State Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Switch State Count</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getSwitchStateCount()
	 * @see #getCompositeSwitchInfo()
	 * @generated
	 */
	public EAttribute getCompositeSwitchInfo_SwitchStateCount() {
        return (EAttribute)getCompositeSwitchInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getRatedVoltage <em>Rated Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Voltage</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getRatedVoltage()
	 * @see #getCompositeSwitchInfo()
	 * @generated
	 */
	public EAttribute getCompositeSwitchInfo_RatedVoltage() {
        return (EAttribute)getCompositeSwitchInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#isGanged <em>Ganged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ganged</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#isGanged()
	 * @see #getCompositeSwitchInfo()
	 * @generated
	 */
	public EAttribute getCompositeSwitchInfo_Ganged() {
        return (EAttribute)getCompositeSwitchInfo().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getPhaseCount <em>Phase Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Count</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getPhaseCount()
	 * @see #getCompositeSwitchInfo()
	 * @generated
	 */
	public EAttribute getCompositeSwitchInfo_PhaseCount() {
        return (EAttribute)getCompositeSwitchInfo().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getInitOpMode <em>Init Op Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Op Mode</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getInitOpMode()
	 * @see #getCompositeSwitchInfo()
	 * @generated
	 */
	public EAttribute getCompositeSwitchInfo_InitOpMode() {
        return (EAttribute)getCompositeSwitchInfo().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getInterruptingRating <em>Interrupting Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interrupting Rating</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CompositeSwitchInfo#getInterruptingRating()
	 * @see #getCompositeSwitchInfo()
	 * @generated
	 */
	public EAttribute getCompositeSwitchInfo_InterruptingRating() {
        return (EAttribute)getCompositeSwitchInfo().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.Cabinet <em>Cabinet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cabinet</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Cabinet
	 * @generated
	 */
	public EClass getCabinet() {
		if (cabinetEClass == null) {
			cabinetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(28);
		}
		return cabinetEClass;
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.Bushing <em>Bushing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bushing</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Bushing
	 * @generated
	 */
	public EClass getBushing() {
		if (bushingEClass == null) {
			bushingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(32);
		}
		return bushingEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getC2PowerFactor <em>C2 Power Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C2 Power Factor</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Bushing#getC2PowerFactor()
	 * @see #getBushing()
	 * @generated
	 */
	public EAttribute getBushing_C2PowerFactor() {
        return (EAttribute)getBushing().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getC2Capacitance <em>C2 Capacitance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C2 Capacitance</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Bushing#getC2Capacitance()
	 * @see #getBushing()
	 * @generated
	 */
	public EAttribute getBushing_C2Capacitance() {
        return (EAttribute)getBushing().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Bushing#getTerminal()
	 * @see #getBushing()
	 * @generated
	 */
	public EReference getBushing_Terminal() {
        return (EReference)getBushing().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getC1PowerFactor <em>C1 Power Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C1 Power Factor</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Bushing#getC1PowerFactor()
	 * @see #getBushing()
	 * @generated
	 */
	public EAttribute getBushing_C1PowerFactor() {
        return (EAttribute)getBushing().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getInsulationKind <em>Insulation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insulation Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Bushing#getInsulationKind()
	 * @see #getBushing()
	 * @generated
	 */
	public EAttribute getBushing_InsulationKind() {
        return (EAttribute)getBushing().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getC1Capacitance <em>C1 Capacitance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C1 Capacitance</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Bushing#getC1Capacitance()
	 * @see #getBushing()
	 * @generated
	 */
	public EAttribute getBushing_C1Capacitance() {
        return (EAttribute)getBushing().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getBushingInsulationPFs <em>Bushing Insulation PFs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bushing Insulation PFs</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Bushing#getBushingInsulationPFs()
	 * @see #getBushing()
	 * @generated
	 */
	public EReference getBushing_BushingInsulationPFs() {
        return (EReference)getBushing().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Vehicle
	 * @generated
	 */
	public EClass getVehicle() {
		if (vehicleEClass == null) {
			vehicleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(33);
		}
		return vehicleEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Vehicle#getOdometerReading <em>Odometer Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Odometer Reading</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Vehicle#getOdometerReading()
	 * @see #getVehicle()
	 * @generated
	 */
	public EAttribute getVehicle_OdometerReading() {
        return (EAttribute)getVehicle().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Vehicle#getOdometerReadDateTime <em>Odometer Read Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Odometer Read Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Vehicle#getOdometerReadDateTime()
	 * @see #getVehicle()
	 * @generated
	 */
	public EAttribute getVehicle_OdometerReadDateTime() {
        return (EAttribute)getVehicle().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.Vehicle#getCrew <em>Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Crew</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Vehicle#getCrew()
	 * @see #getVehicle()
	 * @generated
	 */
	public EReference getVehicle_Crew() {
        return (EReference)getVehicle().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Vehicle#getUsageKind <em>Usage Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Vehicle#getUsageKind()
	 * @see #getVehicle()
	 * @generated
	 */
	public EAttribute getVehicle_UsageKind() {
        return (EAttribute)getVehicle().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo <em>Surge Protector Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surge Protector Info</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo
	 * @generated
	 */
	public EClass getSurgeProtectorInfo() {
		if (surgeProtectorInfoEClass == null) {
			surgeProtectorInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(34);
		}
		return surgeProtectorInfoEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getSurgeProtectors <em>Surge Protectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Surge Protectors</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getSurgeProtectors()
	 * @see #getSurgeProtectorInfo()
	 * @generated
	 */
	public EReference getSurgeProtectorInfo_SurgeProtectors() {
        return (EReference)getSurgeProtectorInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxCurrentRating <em>Max Current Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Current Rating</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxCurrentRating()
	 * @see #getSurgeProtectorInfo()
	 * @generated
	 */
	public EAttribute getSurgeProtectorInfo_MaxCurrentRating() {
        return (EAttribute)getSurgeProtectorInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxContinousOperatingVoltage <em>Max Continous Operating Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Continous Operating Voltage</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxContinousOperatingVoltage()
	 * @see #getSurgeProtectorInfo()
	 * @generated
	 */
	public EAttribute getSurgeProtectorInfo_MaxContinousOperatingVoltage() {
        return (EAttribute)getSurgeProtectorInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getNominalDesignVoltage <em>Nominal Design Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal Design Voltage</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getNominalDesignVoltage()
	 * @see #getSurgeProtectorInfo()
	 * @generated
	 */
	public EAttribute getSurgeProtectorInfo_NominalDesignVoltage() {
        return (EAttribute)getSurgeProtectorInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxEnergyAbsorption <em>Max Energy Absorption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Energy Absorption</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxEnergyAbsorption()
	 * @see #getSurgeProtectorInfo()
	 * @generated
	 */
	public EAttribute getSurgeProtectorInfo_MaxEnergyAbsorption() {
        return (EAttribute)getSurgeProtectorInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport <em>Structure Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Support</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.StructureSupport
	 * @generated
	 */
	public EClass getStructureSupport() {
		if (structureSupportEClass == null) {
			structureSupportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(35);
		}
		return structureSupportEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getAnchorRodCount <em>Anchor Rod Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Rod Count</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.StructureSupport#getAnchorRodCount()
	 * @see #getStructureSupport()
	 * @generated
	 */
	public EAttribute getStructureSupport_AnchorRodCount() {
        return (EAttribute)getStructureSupport().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.StructureSupport#getLength()
	 * @see #getStructureSupport()
	 * @generated
	 */
	public EAttribute getStructureSupport_Length() {
        return (EAttribute)getStructureSupport().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getAnchorRodLength <em>Anchor Rod Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Rod Length</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.StructureSupport#getAnchorRodLength()
	 * @see #getStructureSupport()
	 * @generated
	 */
	public EAttribute getStructureSupport_AnchorRodLength() {
        return (EAttribute)getStructureSupport().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getSecuredStructure <em>Secured Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Secured Structure</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.StructureSupport#getSecuredStructure()
	 * @see #getStructureSupport()
	 * @generated
	 */
	public EReference getStructureSupport_SecuredStructure() {
        return (EReference)getStructureSupport().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.StructureSupport#getDirection()
	 * @see #getStructureSupport()
	 * @generated
	 */
	public EAttribute getStructureSupport_Direction() {
        return (EAttribute)getStructureSupport().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getAnchorKind <em>Anchor Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.StructureSupport#getAnchorKind()
	 * @see #getStructureSupport()
	 * @generated
	 */
	public EAttribute getStructureSupport_AnchorKind() {
        return (EAttribute)getStructureSupport().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.StructureSupport#getKind()
	 * @see #getStructureSupport()
	 * @generated
	 */
	public EAttribute getStructureSupport_Kind() {
        return (EAttribute)getStructureSupport().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.StructureSupport#getSize()
	 * @see #getStructureSupport()
	 * @generated
	 */
	public EAttribute getStructureSupport_Size() {
        return (EAttribute)getStructureSupport().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.ComEquipment <em>Com Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Equipment</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ComEquipment
	 * @generated
	 */
	public EClass getComEquipment() {
		if (comEquipmentEClass == null) {
			comEquipmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(36);
		}
		return comEquipmentEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.ComEquipment#getEndDeviceFunctions <em>End Device Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Device Functions</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ComEquipment#getEndDeviceFunctions()
	 * @see #getComEquipment()
	 * @generated
	 */
	public EReference getComEquipment_EndDeviceFunctions() {
        return (EReference)getComEquipment().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.AssetPropertyCurve <em>Asset Property Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Property Curve</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.AssetPropertyCurve
	 * @generated
	 */
	public EClass getAssetPropertyCurve() {
		if (assetPropertyCurveEClass == null) {
			assetPropertyCurveEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(38);
		}
		return assetPropertyCurveEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.AssetPropertyCurve#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specification</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.AssetPropertyCurve#getSpecification()
	 * @see #getAssetPropertyCurve()
	 * @generated
	 */
	public EReference getAssetPropertyCurve_Specification() {
        return (EReference)getAssetPropertyCurve().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.AssetPropertyCurve#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.AssetPropertyCurve#getAssets()
	 * @see #getAssetPropertyCurve()
	 * @generated
	 */
	public EReference getAssetPropertyCurve_Assets() {
        return (EReference)getAssetPropertyCurve().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.FailureEvent <em>Failure Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Event</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FailureEvent
	 * @generated
	 */
	public EClass getFailureEvent() {
		if (failureEventEClass == null) {
			failureEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(40);
		}
		return failureEventEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.FailureEvent#getFailureIsolationMethod <em>Failure Isolation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Isolation Method</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FailureEvent#getFailureIsolationMethod()
	 * @see #getFailureEvent()
	 * @generated
	 */
	public EAttribute getFailureEvent_FailureIsolationMethod() {
        return (EAttribute)getFailureEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.FailureEvent#getCorporateCode <em>Corporate Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corporate Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FailureEvent#getCorporateCode()
	 * @see #getFailureEvent()
	 * @generated
	 */
	public EAttribute getFailureEvent_CorporateCode() {
        return (EAttribute)getFailureEvent().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.FailureEvent#getFaultLocatingMethod <em>Fault Locating Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Locating Method</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FailureEvent#getFaultLocatingMethod()
	 * @see #getFailureEvent()
	 * @generated
	 */
	public EAttribute getFailureEvent_FaultLocatingMethod() {
        return (EAttribute)getFailureEvent().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.FailureEvent#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FailureEvent#getLocation()
	 * @see #getFailureEvent()
	 * @generated
	 */
	public EAttribute getFailureEvent_Location() {
        return (EAttribute)getFailureEvent().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo <em>Dimensions Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimensions Info</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.DimensionsInfo
	 * @generated
	 */
	public EClass getDimensionsInfo() {
		if (dimensionsInfoEClass == null) {
			dimensionsInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(42);
		}
		return dimensionsInfoEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getLocations()
	 * @see #getDimensionsInfo()
	 * @generated
	 */
	public EReference getDimensionsInfo_Locations() {
        return (EReference)getDimensionsInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getAssetInfos <em>Asset Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asset Infos</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getAssetInfos()
	 * @see #getDimensionsInfo()
	 * @generated
	 */
	public EReference getDimensionsInfo_AssetInfos() {
        return (EReference)getDimensionsInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeWidth <em>Size Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Width</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeWidth()
	 * @see #getDimensionsInfo()
	 * @generated
	 */
	public EAttribute getDimensionsInfo_SizeWidth() {
        return (EAttribute)getDimensionsInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeDiameter <em>Size Diameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Diameter</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeDiameter()
	 * @see #getDimensionsInfo()
	 * @generated
	 */
	public EAttribute getDimensionsInfo_SizeDiameter() {
        return (EAttribute)getDimensionsInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeLength <em>Size Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Length</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeLength()
	 * @see #getDimensionsInfo()
	 * @generated
	 */
	public EAttribute getDimensionsInfo_SizeLength() {
        return (EAttribute)getDimensionsInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getOrientation()
	 * @see #getDimensionsInfo()
	 * @generated
	 */
	public EAttribute getDimensionsInfo_Orientation() {
        return (EAttribute)getDimensionsInfo().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeDepth <em>Size Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Depth</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSizeDepth()
	 * @see #getDimensionsInfo()
	 * @generated
	 */
	public EAttribute getDimensionsInfo_SizeDepth() {
        return (EAttribute)getDimensionsInfo().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specifications</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSpecifications()
	 * @see #getDimensionsInfo()
	 * @generated
	 */
	public EReference getDimensionsInfo_Specifications() {
        return (EReference)getDimensionsInfo().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.Tower <em>Tower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tower</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Tower
	 * @generated
	 */
	public EClass getTower() {
		if (towerEClass == null) {
			towerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(43);
		}
		return towerEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Tower#getConstructionKind <em>Construction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Construction Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Tower#getConstructionKind()
	 * @see #getTower()
	 * @generated
	 */
	public EAttribute getTower_ConstructionKind() {
        return (EAttribute)getTower().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.MountingConnection <em>Mounting Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mounting Connection</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.MountingConnection
	 * @generated
	 */
	public EClass getMountingConnection() {
		if (mountingConnectionEClass == null) {
			mountingConnectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(45);
		}
		return mountingConnectionEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.MountingConnection#getStructureInfos <em>Structure Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Structure Infos</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.MountingConnection#getStructureInfos()
	 * @see #getMountingConnection()
	 * @generated
	 */
	public EReference getMountingConnection_StructureInfos() {
        return (EReference)getMountingConnection().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.MountingConnection#getMountingPoints <em>Mounting Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mounting Points</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.MountingConnection#getMountingPoints()
	 * @see #getMountingConnection()
	 * @generated
	 */
	public EReference getMountingConnection_MountingPoints() {
        return (EReference)getMountingConnection().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.Medium <em>Medium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medium</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Medium
	 * @generated
	 */
	public EClass getMedium() {
		if (mediumEClass == null) {
			mediumEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(50);
		}
		return mediumEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.Medium#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specification</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Medium#getSpecification()
	 * @see #getMedium()
	 * @generated
	 */
	public EReference getMedium_Specification() {
        return (EReference)getMedium().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Medium#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Medium#getKind()
	 * @see #getMedium()
	 * @generated
	 */
	public EAttribute getMedium_Kind() {
        return (EAttribute)getMedium().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.Medium#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Medium#getAssets()
	 * @see #getMedium()
	 * @generated
	 */
	public EReference getMedium_Assets() {
        return (EReference)getMedium().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Medium#getVolumeSpec <em>Volume Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Spec</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Medium#getVolumeSpec()
	 * @see #getMedium()
	 * @generated
	 */
	public EAttribute getMedium_VolumeSpec() {
        return (EAttribute)getMedium().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo <em>Recloser Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recloser Info</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.RecloserInfo
	 * @generated
	 */
	public EClass getRecloserInfo() {
		if (recloserInfoEClass == null) {
			recloserInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(51);
		}
		return recloserInfoEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#isGroundTripNormalEnabled <em>Ground Trip Normal Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ground Trip Normal Enabled</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.RecloserInfo#isGroundTripNormalEnabled()
	 * @see #getRecloserInfo()
	 * @generated
	 */
	public EAttribute getRecloserInfo_GroundTripNormalEnabled() {
        return (EAttribute)getRecloserInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#isGroundTripCapable <em>Ground Trip Capable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ground Trip Capable</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.RecloserInfo#isGroundTripCapable()
	 * @see #getRecloserInfo()
	 * @generated
	 */
	public EAttribute getRecloserInfo_GroundTripCapable() {
        return (EAttribute)getRecloserInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#getRecloseLockoutCount <em>Reclose Lockout Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reclose Lockout Count</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.RecloserInfo#getRecloseLockoutCount()
	 * @see #getRecloserInfo()
	 * @generated
	 */
	public EAttribute getRecloserInfo_RecloseLockoutCount() {
        return (EAttribute)getRecloserInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#getPhaseTripRating <em>Phase Trip Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Trip Rating</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.RecloserInfo#getPhaseTripRating()
	 * @see #getRecloserInfo()
	 * @generated
	 */
	public EAttribute getRecloserInfo_PhaseTripRating() {
        return (EAttribute)getRecloserInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.RecloserInfo#getGroundTripRating <em>Ground Trip Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ground Trip Rating</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.RecloserInfo#getGroundTripRating()
	 * @see #getRecloserInfo()
	 * @generated
	 */
	public EAttribute getRecloserInfo_GroundTripRating() {
        return (EAttribute)getRecloserInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.Facility <em>Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facility</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Facility
	 * @generated
	 */
	public EClass getFacility() {
		if (facilityEClass == null) {
			facilityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(52);
		}
		return facilityEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Facility#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Facility#getKind()
	 * @see #getFacility()
	 * @generated
	 */
	public EAttribute getFacility_Kind() {
        return (EAttribute)getFacility().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo <em>Shunt Impedance Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shunt Impedance Info</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo
	 * @generated
	 */
	public EClass getShuntImpedanceInfo() {
		if (shuntImpedanceInfoEClass == null) {
			shuntImpedanceInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(53);
		}
		return shuntImpedanceInfoEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getMaxSwitchOperationCount <em>Max Switch Operation Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Switch Operation Count</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getMaxSwitchOperationCount()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	public EAttribute getShuntImpedanceInfo_MaxSwitchOperationCount() {
        return (EAttribute)getShuntImpedanceInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalControlKind <em>Local Control Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Control Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalControlKind()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	public EAttribute getShuntImpedanceInfo_LocalControlKind() {
        return (EAttribute)getShuntImpedanceInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getSwitchOperationCycle <em>Switch Operation Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Switch Operation Cycle</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getSwitchOperationCycle()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	public EAttribute getShuntImpedanceInfo_SwitchOperationCycle() {
        return (EAttribute)getShuntImpedanceInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isVRegLineLine <em>VReg Line Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VReg Line Line</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isVRegLineLine()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	public EAttribute getShuntImpedanceInfo_VRegLineLine() {
        return (EAttribute)getShuntImpedanceInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getHighVoltageOverride <em>High Voltage Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Voltage Override</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getHighVoltageOverride()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	public EAttribute getShuntImpedanceInfo_HighVoltageOverride() {
        return (EAttribute)getShuntImpedanceInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLowVoltageOverride <em>Low Voltage Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Voltage Override</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLowVoltageOverride()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	public EAttribute getShuntImpedanceInfo_LowVoltageOverride() {
        return (EAttribute)getShuntImpedanceInfo().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranch <em>Reg Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reg Branch</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranch()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	public EAttribute getShuntImpedanceInfo_RegBranch() {
        return (EAttribute)getShuntImpedanceInfo().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getCellSize <em>Cell Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Size</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getCellSize()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	public EAttribute getShuntImpedanceInfo_CellSize() {
        return (EAttribute)getShuntImpedanceInfo().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalOnLevel <em>Local On Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local On Level</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalOnLevel()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	public EAttribute getShuntImpedanceInfo_LocalOnLevel() {
        return (EAttribute)getShuntImpedanceInfo().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranchKind <em>Reg Branch Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reg Branch Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranchKind()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	public EAttribute getShuntImpedanceInfo_RegBranchKind() {
        return (EAttribute)getShuntImpedanceInfo().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isNormalOpen <em>Normal Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Open</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isNormalOpen()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	public EAttribute getShuntImpedanceInfo_NormalOpen() {
        return (EAttribute)getShuntImpedanceInfo().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getControlKind <em>Control Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getControlKind()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	public EAttribute getShuntImpedanceInfo_ControlKind() {
        return (EAttribute)getShuntImpedanceInfo().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getShuntCompensatorInfos <em>Shunt Compensator Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shunt Compensator Infos</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getShuntCompensatorInfos()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	public EReference getShuntImpedanceInfo_ShuntCompensatorInfos() {
        return (EReference)getShuntImpedanceInfo().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranchEnd <em>Reg Branch End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reg Branch End</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getRegBranchEnd()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	public EAttribute getShuntImpedanceInfo_RegBranchEnd() {
        return (EAttribute)getShuntImpedanceInfo().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getBranchDirect <em>Branch Direct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch Direct</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getBranchDirect()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	public EAttribute getShuntImpedanceInfo_BranchDirect() {
        return (EAttribute)getShuntImpedanceInfo().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalOffLevel <em>Local Off Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Off Level</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getLocalOffLevel()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	public EAttribute getShuntImpedanceInfo_LocalOffLevel() {
        return (EAttribute)getShuntImpedanceInfo().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getSensingPhaseCode <em>Sensing Phase Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensing Phase Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getSensingPhaseCode()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	public EAttribute getShuntImpedanceInfo_SensingPhaseCode() {
        return (EAttribute)getShuntImpedanceInfo().getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isLocalOverride <em>Local Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Override</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#isLocalOverride()
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	public EAttribute getShuntImpedanceInfo_LocalOverride() {
        return (EAttribute)getShuntImpedanceInfo().getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.ShuntCompensatorInfo <em>Shunt Compensator Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shunt Compensator Info</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntCompensatorInfo
	 * @generated
	 */
	public EClass getShuntCompensatorInfo() {
		if (shuntCompensatorInfoEClass == null) {
			shuntCompensatorInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(54);
		}
		return shuntCompensatorInfoEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ShuntCompensatorInfo#getMaxPowerLoss <em>Max Power Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Power Loss</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntCompensatorInfo#getMaxPowerLoss()
	 * @see #getShuntCompensatorInfo()
	 * @generated
	 */
	public EAttribute getShuntCompensatorInfo_MaxPowerLoss() {
        return (EAttribute)getShuntCompensatorInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.ShuntCompensatorInfo#getShuntImpedanceInfo <em>Shunt Impedance Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shunt Impedance Info</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntCompensatorInfo#getShuntImpedanceInfo()
	 * @see #getShuntCompensatorInfo()
	 * @generated
	 */
	public EReference getShuntCompensatorInfo_ShuntImpedanceInfo() {
        return (EReference)getShuntCompensatorInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.MountingPoint <em>Mounting Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mounting Point</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.MountingPoint
	 * @generated
	 */
	public EClass getMountingPoint() {
		if (mountingPointEClass == null) {
			mountingPointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(57);
		}
		return mountingPointEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.MountingPoint#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connections</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.MountingPoint#getConnections()
	 * @see #getMountingPoint()
	 * @generated
	 */
	public EReference getMountingPoint_Connections() {
        return (EReference)getMountingPoint().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.MountingPoint#getXCoord <em>XCoord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XCoord</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.MountingPoint#getXCoord()
	 * @see #getMountingPoint()
	 * @generated
	 */
	public EAttribute getMountingPoint_XCoord() {
        return (EAttribute)getMountingPoint().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.MountingPoint#getPhaseCode <em>Phase Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Code</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.MountingPoint#getPhaseCode()
	 * @see #getMountingPoint()
	 * @generated
	 */
	public EAttribute getMountingPoint_PhaseCode() {
        return (EAttribute)getMountingPoint().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.MountingPoint#getYCoord <em>YCoord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YCoord</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.MountingPoint#getYCoord()
	 * @see #getMountingPoint()
	 * @generated
	 */
	public EAttribute getMountingPoint_YCoord() {
        return (EAttribute)getMountingPoint().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.MountingPoint#getOverheadConductors <em>Overhead Conductors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Overhead Conductors</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.MountingPoint#getOverheadConductors()
	 * @see #getMountingPoint()
	 * @generated
	 */
	public EReference getMountingPoint_OverheadConductors() {
        return (EReference)getMountingPoint().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.SubstationAsset <em>Substation Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substation Asset</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.SubstationAsset
	 * @generated
	 */
	public EClass getSubstationAsset() {
		if (substationAssetEClass == null) {
			substationAssetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(58);
		}
		return substationAssetEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.SubstationAsset#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.SubstationAsset#getFunction()
	 * @see #getSubstationAsset()
	 * @generated
	 */
	public EAttribute getSubstationAsset_Function() {
        return (EAttribute)getSubstationAsset().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.Streetlight <em>Streetlight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Streetlight</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Streetlight
	 * @generated
	 */
	public EClass getStreetlight() {
		if (streetlightEClass == null) {
			streetlightEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(59);
		}
		return streetlightEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Streetlight#getArmLength <em>Arm Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arm Length</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Streetlight#getArmLength()
	 * @see #getStreetlight()
	 * @generated
	 */
	public EAttribute getStreetlight_ArmLength() {
        return (EAttribute)getStreetlight().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.Streetlight#getPole <em>Pole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pole</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Streetlight#getPole()
	 * @see #getStreetlight()
	 * @generated
	 */
	public EReference getStreetlight_Pole() {
        return (EReference)getStreetlight().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Streetlight#getLampKind <em>Lamp Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lamp Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Streetlight#getLampKind()
	 * @see #getStreetlight()
	 * @generated
	 */
	public EAttribute getStreetlight_LampKind() {
        return (EAttribute)getStreetlight().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Streetlight#getLightRating <em>Light Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Light Rating</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Streetlight#getLightRating()
	 * @see #getStreetlight()
	 * @generated
	 */
	public EAttribute getStreetlight_LightRating() {
        return (EAttribute)getStreetlight().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Tool
	 * @generated
	 */
	public EClass getTool() {
		if (toolEClass == null) {
			toolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(60);
		}
		return toolEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Tool#getLastCalibrationDate <em>Last Calibration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Calibration Date</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Tool#getLastCalibrationDate()
	 * @see #getTool()
	 * @generated
	 */
	public EAttribute getTool_LastCalibrationDate() {
        return (EAttribute)getTool().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.Tool#getCrew <em>Crew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Crew</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Tool#getCrew()
	 * @see #getTool()
	 * @generated
	 */
	public EReference getTool_Crew() {
        return (EReference)getTool().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.SVC <em>SVC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SVC</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.SVC
	 * @generated
	 */
	public EClass getSVC() {
		if (svcEClass == null) {
			svcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(61);
		}
		return svcEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.SVC#getInductiveRating <em>Inductive Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inductive Rating</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.SVC#getInductiveRating()
	 * @see #getSVC()
	 * @generated
	 */
	public EAttribute getSVC_InductiveRating() {
        return (EAttribute)getSVC().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.SVC#getCapacitiveRating <em>Capacitive Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacitive Rating</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.SVC#getCapacitiveRating()
	 * @see #getSVC()
	 * @generated
	 */
	public EAttribute getSVC_CapacitiveRating() {
        return (EAttribute)getSVC().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.OrgAssetRole <em>Org Asset Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Org Asset Role</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.OrgAssetRole
	 * @generated
	 */
	public EClass getOrgAssetRole() {
		if (orgAssetRoleEClass == null) {
			orgAssetRoleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(62);
		}
		return orgAssetRoleEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.OrgAssetRole#getErpOrganisation <em>Erp Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Organisation</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.OrgAssetRole#getErpOrganisation()
	 * @see #getOrgAssetRole()
	 * @generated
	 */
	public EReference getOrgAssetRole_ErpOrganisation() {
        return (EReference)getOrgAssetRole().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.OrgAssetRole#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.OrgAssetRole#getAsset()
	 * @see #getOrgAssetRole()
	 * @generated
	 */
	public EReference getOrgAssetRole_Asset() {
        return (EReference)getOrgAssetRole().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.OrgAssetRole#getPercentOwnership <em>Percent Ownership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent Ownership</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.OrgAssetRole#getPercentOwnership()
	 * @see #getOrgAssetRole()
	 * @generated
	 */
	public EAttribute getOrgAssetRole_PercentOwnership() {
        return (EAttribute)getOrgAssetRole().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.TestDataSet <em>Test Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Data Set</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TestDataSet
	 * @generated
	 */
	public EClass getTestDataSet() {
		if (testDataSetEClass == null) {
			testDataSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(63);
		}
		return testDataSetEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.TestDataSet#getSpecimenToLabDateTime <em>Specimen To Lab Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specimen To Lab Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TestDataSet#getSpecimenToLabDateTime()
	 * @see #getTestDataSet()
	 * @generated
	 */
	public EAttribute getTestDataSet_SpecimenToLabDateTime() {
        return (EAttribute)getTestDataSet().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.TestDataSet#getConclusion <em>Conclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conclusion</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TestDataSet#getConclusion()
	 * @see #getTestDataSet()
	 * @generated
	 */
	public EAttribute getTestDataSet_Conclusion() {
        return (EAttribute)getTestDataSet().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.TestDataSet#getSpecimenID <em>Specimen ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specimen ID</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TestDataSet#getSpecimenID()
	 * @see #getTestDataSet()
	 * @generated
	 */
	public EAttribute getTestDataSet_SpecimenID() {
        return (EAttribute)getTestDataSet().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial <em>Generic Asset Model Or Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Asset Model Or Material</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial
	 * @generated
	 */
	public EClass getGenericAssetModelOrMaterial() {
		if (genericAssetModelOrMaterialEClass == null) {
			genericAssetModelOrMaterialEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(66);
		}
		return genericAssetModelOrMaterialEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getErpReqLineItems <em>Erp Req Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Req Line Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getErpReqLineItems()
	 * @see #getGenericAssetModelOrMaterial()
	 * @generated
	 */
	public EReference getGenericAssetModelOrMaterial_ErpReqLineItems() {
        return (EReference)getGenericAssetModelOrMaterial().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getProductAssetModels <em>Product Asset Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Asset Models</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getProductAssetModels()
	 * @see #getGenericAssetModelOrMaterial()
	 * @generated
	 */
	public EReference getGenericAssetModelOrMaterial_ProductAssetModels() {
        return (EReference)getGenericAssetModelOrMaterial().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getErpInventoryIssues <em>Erp Inventory Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Inventory Issues</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getErpInventoryIssues()
	 * @see #getGenericAssetModelOrMaterial()
	 * @generated
	 */
	public EReference getGenericAssetModelOrMaterial_ErpInventoryIssues() {
        return (EReference)getGenericAssetModelOrMaterial().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getCUWorkEquipmentAsset <em>CU Work Equipment Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CU Work Equipment Asset</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getCUWorkEquipmentAsset()
	 * @see #getGenericAssetModelOrMaterial()
	 * @generated
	 */
	public EReference getGenericAssetModelOrMaterial_CUWorkEquipmentAsset() {
        return (EReference)getGenericAssetModelOrMaterial().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getEstimatedUnitCost <em>Estimated Unit Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Unit Cost</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getEstimatedUnitCost()
	 * @see #getGenericAssetModelOrMaterial()
	 * @generated
	 */
	public EAttribute getGenericAssetModelOrMaterial_EstimatedUnitCost() {
        return (EAttribute)getGenericAssetModelOrMaterial().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#isStockItem <em>Stock Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stock Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#isStockItem()
	 * @see #getGenericAssetModelOrMaterial()
	 * @generated
	 */
	public EAttribute getGenericAssetModelOrMaterial_StockItem() {
        return (EAttribute)getGenericAssetModelOrMaterial().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getTypeAssetCatalogue <em>Type Asset Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Asset Catalogue</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getTypeAssetCatalogue()
	 * @see #getGenericAssetModelOrMaterial()
	 * @generated
	 */
	public EReference getGenericAssetModelOrMaterial_TypeAssetCatalogue() {
        return (EReference)getGenericAssetModelOrMaterial().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getCUAsset <em>CU Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CU Asset</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getCUAsset()
	 * @see #getGenericAssetModelOrMaterial()
	 * @generated
	 */
	public EReference getGenericAssetModelOrMaterial_CUAsset() {
        return (EReference)getGenericAssetModelOrMaterial().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getErpBomItemDatas <em>Erp Bom Item Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Bom Item Datas</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getErpBomItemDatas()
	 * @see #getGenericAssetModelOrMaterial()
	 * @generated
	 */
	public EReference getGenericAssetModelOrMaterial_ErpBomItemDatas() {
        return (EReference)getGenericAssetModelOrMaterial().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getQuantity()
	 * @see #getGenericAssetModelOrMaterial()
	 * @generated
	 */
	public EAttribute getGenericAssetModelOrMaterial_Quantity() {
        return (EAttribute)getGenericAssetModelOrMaterial().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo <em>Reliability Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reliability Info</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo
	 * @generated
	 */
	public EClass getReliabilityInfo() {
		if (reliabilityInfoEClass == null) {
			reliabilityInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(73);
		}
		return reliabilityInfoEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo#getMomFailureRate <em>Mom Failure Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mom Failure Rate</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo#getMomFailureRate()
	 * @see #getReliabilityInfo()
	 * @generated
	 */
	public EAttribute getReliabilityInfo_MomFailureRate() {
        return (EAttribute)getReliabilityInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specification</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo#getSpecification()
	 * @see #getReliabilityInfo()
	 * @generated
	 */
	public EReference getReliabilityInfo_Specification() {
        return (EReference)getReliabilityInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo#getMTTR <em>MTTR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MTTR</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo#getMTTR()
	 * @see #getReliabilityInfo()
	 * @generated
	 */
	public EAttribute getReliabilityInfo_MTTR() {
        return (EAttribute)getReliabilityInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo#getAssets()
	 * @see #getReliabilityInfo()
	 * @generated
	 */
	public EReference getReliabilityInfo_Assets() {
        return (EReference)getReliabilityInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation <em>Transformer Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer Observation</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation
	 * @generated
	 */
	public EClass getTransformerObservation() {
		if (transformerObservationEClass == null) {
			transformerObservationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(74);
		}
		return transformerObservationEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getBushingInsultationPFs <em>Bushing Insultation PFs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bushing Insultation PFs</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getBushingInsultationPFs()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	public EReference getTransformerObservation_BushingInsultationPFs() {
        return (EReference)getTransformerObservation().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilNeutralizationNumber <em>Oil Neutralization Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oil Neutralization Number</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilNeutralizationNumber()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	public EAttribute getTransformerObservation_OilNeutralizationNumber() {
        return (EAttribute)getTransformerObservation().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getWaterContent <em>Water Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Water Content</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getWaterContent()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	public EAttribute getTransformerObservation_WaterContent() {
        return (EAttribute)getTransformerObservation().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilLevel <em>Oil Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oil Level</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilLevel()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	public EAttribute getTransformerObservation_OilLevel() {
        return (EAttribute)getTransformerObservation().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getFreqResp <em>Freq Resp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Freq Resp</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getFreqResp()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	public EAttribute getTransformerObservation_FreqResp() {
        return (EAttribute)getTransformerObservation().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilDielectricStrength <em>Oil Dielectric Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oil Dielectric Strength</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilDielectricStrength()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	public EAttribute getTransformerObservation_OilDielectricStrength() {
        return (EAttribute)getTransformerObservation().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilColor <em>Oil Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oil Color</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilColor()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	public EAttribute getTransformerObservation_OilColor() {
        return (EAttribute)getTransformerObservation().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getHotSpotTemp <em>Hot Spot Temp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hot Spot Temp</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getHotSpotTemp()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	public EAttribute getTransformerObservation_HotSpotTemp() {
        return (EAttribute)getTransformerObservation().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getDga <em>Dga</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dga</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getDga()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	public EAttribute getTransformerObservation_Dga() {
        return (EAttribute)getTransformerObservation().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getFurfuralDP <em>Furfural DP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Furfural DP</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getFurfuralDP()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	public EAttribute getTransformerObservation_FurfuralDP() {
        return (EAttribute)getTransformerObservation().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilIFT <em>Oil IFT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oil IFT</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getOilIFT()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	public EAttribute getTransformerObservation_OilIFT() {
        return (EAttribute)getTransformerObservation().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getProcedureDataSets <em>Procedure Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Procedure Data Sets</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getProcedureDataSets()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	public EReference getTransformerObservation_ProcedureDataSets() {
        return (EReference)getTransformerObservation().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getTransformer <em>Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getTransformer()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	public EReference getTransformerObservation_Transformer() {
        return (EReference)getTransformerObservation().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getStatus()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	public EReference getTransformerObservation_Status() {
        return (EReference)getTransformerObservation().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getWindingInsulationPFs <em>Winding Insulation PFs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Winding Insulation PFs</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getWindingInsulationPFs()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	public EReference getTransformerObservation_WindingInsulationPFs() {
        return (EReference)getTransformerObservation().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getTransformerAsset <em>Transformer Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer Asset</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getTransformerAsset()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	public EReference getTransformerObservation_TransformerAsset() {
        return (EReference)getTransformerObservation().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getBushingTemp <em>Bushing Temp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bushing Temp</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getBushingTemp()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	public EAttribute getTransformerObservation_BushingTemp() {
        return (EAttribute)getTransformerObservation().getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getTopOilTemp <em>Top Oil Temp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Oil Temp</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getTopOilTemp()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	public EAttribute getTransformerObservation_TopOilTemp() {
        return (EAttribute)getTransformerObservation().getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getPumpVibration <em>Pump Vibration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pump Vibration</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getPumpVibration()
	 * @see #getTransformerObservation()
	 * @generated
	 */
	public EAttribute getTransformerObservation_PumpVibration() {
        return (EAttribute)getTransformerObservation().getEStructuralFeatures().get(18);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.Pole <em>Pole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pole</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Pole
	 * @generated
	 */
	public EClass getPole() {
		if (poleEClass == null) {
			poleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(77);
		}
		return poleEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Pole#isBreastBlock <em>Breast Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Breast Block</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Pole#isBreastBlock()
	 * @see #getPole()
	 * @generated
	 */
	public EAttribute getPole_BreastBlock() {
        return (EAttribute)getPole().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getDiameter <em>Diameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diameter</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Pole#getDiameter()
	 * @see #getPole()
	 * @generated
	 */
	public EAttribute getPole_Diameter() {
        return (EAttribute)getPole().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getBaseKind <em>Base Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Pole#getBaseKind()
	 * @see #getPole()
	 * @generated
	 */
	public EAttribute getPole_BaseKind() {
        return (EAttribute)getPole().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getJpaReference <em>Jpa Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jpa Reference</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Pole#getJpaReference()
	 * @see #getPole()
	 * @generated
	 */
	public EAttribute getPole_JpaReference() {
        return (EAttribute)getPole().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getTreatmentKind <em>Treatment Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Treatment Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Pole#getTreatmentKind()
	 * @see #getPole()
	 * @generated
	 */
	public EAttribute getPole_TreatmentKind() {
        return (EAttribute)getPole().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getPreservativeKind <em>Preservative Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preservative Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Pole#getPreservativeKind()
	 * @see #getPole()
	 * @generated
	 */
	public EAttribute getPole_PreservativeKind() {
        return (EAttribute)getPole().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getStreetlights <em>Streetlights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Streetlights</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Pole#getStreetlights()
	 * @see #getPole()
	 * @generated
	 */
	public EReference getPole_Streetlights() {
        return (EReference)getPole().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Pole#getLength()
	 * @see #getPole()
	 * @generated
	 */
	public EAttribute getPole_Length() {
        return (EAttribute)getPole().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getConstruction <em>Construction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Construction</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Pole#getConstruction()
	 * @see #getPole()
	 * @generated
	 */
	public EAttribute getPole_Construction() {
        return (EAttribute)getPole().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getSpeciesType <em>Species Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Species Type</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Pole#getSpeciesType()
	 * @see #getPole()
	 * @generated
	 */
	public EAttribute getPole_SpeciesType() {
        return (EAttribute)getPole().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Pole#getClassification()
	 * @see #getPole()
	 * @generated
	 */
	public EAttribute getPole_Classification() {
        return (EAttribute)getPole().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.Pole#getTreatedDateTime <em>Treated Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Treated Date Time</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.Pole#getTreatedDateTime()
	 * @see #getPole()
	 * @generated
	 */
	public EAttribute getPole_TreatedDateTime() {
        return (EAttribute)getPole().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo <em>Switch Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Info</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.SwitchInfo
	 * @generated
	 */
	public EClass getSwitchInfo() {
		if (switchInfoEClass == null) {
			switchInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(78);
		}
		return switchInfoEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getDielectricStrength <em>Dielectric Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dielectric Strength</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getDielectricStrength()
	 * @see #getSwitchInfo()
	 * @generated
	 */
	public EAttribute getSwitchInfo_DielectricStrength() {
        return (EAttribute)getSwitchInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#isGang <em>Gang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gang</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.SwitchInfo#isGang()
	 * @see #getSwitchInfo()
	 * @generated
	 */
	public EAttribute getSwitchInfo_Gang() {
        return (EAttribute)getSwitchInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getMakingCapacity <em>Making Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Making Capacity</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getMakingCapacity()
	 * @see #getSwitchInfo()
	 * @generated
	 */
	public EAttribute getSwitchInfo_MakingCapacity() {
        return (EAttribute)getSwitchInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getWithstandCurrent <em>Withstand Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Withstand Current</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getWithstandCurrent()
	 * @see #getSwitchInfo()
	 * @generated
	 */
	public EAttribute getSwitchInfo_WithstandCurrent() {
        return (EAttribute)getSwitchInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#isLoadBreak <em>Load Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Break</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.SwitchInfo#isLoadBreak()
	 * @see #getSwitchInfo()
	 * @generated
	 */
	public EAttribute getSwitchInfo_LoadBreak() {
        return (EAttribute)getSwitchInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getMinimumCurrent <em>Minimum Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Current</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getMinimumCurrent()
	 * @see #getSwitchInfo()
	 * @generated
	 */
	public EAttribute getSwitchInfo_MinimumCurrent() {
        return (EAttribute)getSwitchInfo().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getInterruptingRating <em>Interrupting Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interrupting Rating</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getInterruptingRating()
	 * @see #getSwitchInfo()
	 * @generated
	 */
	public EAttribute getSwitchInfo_InterruptingRating() {
        return (EAttribute)getSwitchInfo().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#isRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.SwitchInfo#isRemote()
	 * @see #getSwitchInfo()
	 * @generated
	 */
	public EAttribute getSwitchInfo_Remote() {
        return (EAttribute)getSwitchInfo().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getPoleCount <em>Pole Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pole Count</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getPoleCount()
	 * @see #getSwitchInfo()
	 * @generated
	 */
	public EAttribute getSwitchInfo_PoleCount() {
        return (EAttribute)getSwitchInfo().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.AnchorKind <em>Anchor Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Anchor Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.AnchorKind
	 * @generated
	 */
	public EEnum getAnchorKind() {
		if (anchorKindEEnum == null) {
			anchorKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(4);
		}
		return anchorKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.TowerConstructionKind <em>Tower Construction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tower Construction Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.TowerConstructionKind
	 * @generated
	 */
	public EEnum getTowerConstructionKind() {
		if (towerConstructionKindEEnum == null) {
			towerConstructionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(13);
		}
		return towerConstructionKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.ProcedureKind <em>Procedure Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Procedure Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ProcedureKind
	 * @generated
	 */
	public EEnum getProcedureKind() {
		if (procedureKindEEnum == null) {
			procedureKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(19);
		}
		return procedureKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.FacilityKind <em>Facility Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Facility Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FacilityKind
	 * @generated
	 */
	public EEnum getFacilityKind() {
		if (facilityKindEEnum == null) {
			facilityKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(29);
		}
		return facilityKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.MediumKind <em>Medium Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medium Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.MediumKind
	 * @generated
	 */
	public EEnum getMediumKind() {
		if (mediumKindEEnum == null) {
			mediumKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(30);
		}
		return mediumKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.UndergroundStructureKind <em>Underground Structure Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Underground Structure Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.UndergroundStructureKind
	 * @generated
	 */
	public EEnum getUndergroundStructureKind() {
		if (undergroundStructureKindEEnum == null) {
			undergroundStructureKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(31);
		}
		return undergroundStructureKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.PolePreservativeKind <em>Pole Preservative Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pole Preservative Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.PolePreservativeKind
	 * @generated
	 */
	public EEnum getPolePreservativeKind() {
		if (polePreservativeKindEEnum == null) {
			polePreservativeKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(37);
		}
		return polePreservativeKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceLocalControlKind <em>Shunt Impedance Local Control Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shunt Impedance Local Control Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceLocalControlKind
	 * @generated
	 */
	public EEnum getShuntImpedanceLocalControlKind() {
		if (shuntImpedanceLocalControlKindEEnum == null) {
			shuntImpedanceLocalControlKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(39);
		}
		return shuntImpedanceLocalControlKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.CoolingKind <em>Cooling Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cooling Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CoolingKind
	 * @generated
	 */
	public EEnum getCoolingKind() {
		if (coolingKindEEnum == null) {
			coolingKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(41);
		}
		return coolingKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.RegulationBranchKind <em>Regulation Branch Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Regulation Branch Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.RegulationBranchKind
	 * @generated
	 */
	public EEnum getRegulationBranchKind() {
		if (regulationBranchKindEEnum == null) {
			regulationBranchKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(44);
		}
		return regulationBranchKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.VehicleUsageKind <em>Vehicle Usage Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vehicle Usage Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.VehicleUsageKind
	 * @generated
	 */
	public EEnum getVehicleUsageKind() {
		if (vehicleUsageKindEEnum == null) {
			vehicleUsageKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(46);
		}
		return vehicleUsageKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.SubstationFunctionKind <em>Substation Function Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Substation Function Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.SubstationFunctionKind
	 * @generated
	 */
	public EEnum getSubstationFunctionKind() {
		if (substationFunctionKindEEnum == null) {
			substationFunctionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(47);
		}
		return substationFunctionKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.JointFillKind <em>Joint Fill Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Joint Fill Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.JointFillKind
	 * @generated
	 */
	public EEnum getJointFillKind() {
		if (jointFillKindEEnum == null) {
			jointFillKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(48);
		}
		return jointFillKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationPfTestKind <em>Bushing Insulation Pf Test Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bushing Insulation Pf Test Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.BushingInsulationPfTestKind
	 * @generated
	 */
	public EEnum getBushingInsulationPfTestKind() {
		if (bushingInsulationPfTestKindEEnum == null) {
			bushingInsulationPfTestKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(49);
		}
		return bushingInsulationPfTestKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.PoleTreatmentKind <em>Pole Treatment Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pole Treatment Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.PoleTreatmentKind
	 * @generated
	 */
	public EEnum getPoleTreatmentKind() {
		if (poleTreatmentKindEEnum == null) {
			poleTreatmentKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(55);
		}
		return poleTreatmentKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.FaultIndicatorResetKind <em>Fault Indicator Reset Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fault Indicator Reset Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FaultIndicatorResetKind
	 * @generated
	 */
	public EEnum getFaultIndicatorResetKind() {
		if (faultIndicatorResetKindEEnum == null) {
			faultIndicatorResetKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(56);
		}
		return faultIndicatorResetKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceControlKind <em>Shunt Impedance Control Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shunt Impedance Control Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceControlKind
	 * @generated
	 */
	public EEnum getShuntImpedanceControlKind() {
		if (shuntImpedanceControlKindEEnum == null) {
			shuntImpedanceControlKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(64);
		}
		return shuntImpedanceControlKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.JointConfigurationKind <em>Joint Configuration Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Joint Configuration Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.JointConfigurationKind
	 * @generated
	 */
	public EEnum getJointConfigurationKind() {
		if (jointConfigurationKindEEnum == null) {
			jointConfigurationKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(65);
		}
		return jointConfigurationKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.PoleBaseKind <em>Pole Base Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pole Base Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.PoleBaseKind
	 * @generated
	 */
	public EEnum getPoleBaseKind() {
		if (poleBaseKindEEnum == null) {
			poleBaseKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(67);
		}
		return poleBaseKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.FACTSDeviceKind <em>FACTS Device Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>FACTS Device Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FACTSDeviceKind
	 * @generated
	 */
	public EEnum getFACTSDeviceKind() {
		if (factsDeviceKindEEnum == null) {
			factsDeviceKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(68);
		}
		return factsDeviceKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupportKind <em>Structure Support Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Structure Support Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.StructureSupportKind
	 * @generated
	 */
	public EEnum getStructureSupportKind() {
		if (structureSupportKindEEnum == null) {
			structureSupportKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(69);
		}
		return structureSupportKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.BushingInsulationKind <em>Bushing Insulation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bushing Insulation Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.BushingInsulationKind
	 * @generated
	 */
	public EEnum getBushingInsulationKind() {
		if (bushingInsulationKindEEnum == null) {
			bushingInsulationKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(70);
		}
		return bushingInsulationKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.StructureMaterialKind <em>Structure Material Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Structure Material Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.StructureMaterialKind
	 * @generated
	 */
	public EEnum getStructureMaterialKind() {
		if (structureMaterialKindEEnum == null) {
			structureMaterialKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(71);
		}
		return structureMaterialKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.StreetlightLampKind <em>Streetlight Lamp Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Streetlight Lamp Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.StreetlightLampKind
	 * @generated
	 */
	public EEnum getStreetlightLampKind() {
		if (streetlightLampKindEEnum == null) {
			streetlightLampKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(72);
		}
		return streetlightLampKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.CompositeSwitchKind <em>Composite Switch Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Composite Switch Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.CompositeSwitchKind
	 * @generated
	 */
	public EEnum getCompositeSwitchKind() {
		if (compositeSwitchKindEEnum == null) {
			compositeSwitchKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(75);
		}
		return compositeSwitchKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssets.FailureIsolationMethodKind <em>Failure Isolation Method Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Failure Isolation Method Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssets.FailureIsolationMethodKind
	 * @generated
	 */
	public EEnum getFailureIsolationMethodKind() {
		if (failureIsolationMethodKindEEnum == null) {
			failureIsolationMethodKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI).getEClassifiers().get(76);
		}
		return failureIsolationMethodKindEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public InfAssetsFactory getInfAssetsFactory() {
		return (InfAssetsFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM15.IEC61970.Informative.InfAssets." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //InfAssetsPackage
