/**
 */
package CIM15.IEC61968.Assets;

import CIM15.CIM15Package;

import CIM15.IEC61968.AssetModels.AssetModelsPackage;

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
 * @see CIM15.IEC61968.Assets.AssetsFactory
 * @generated
 */
public class AssetsPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "Assets";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#Assets";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimAssets";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AssetsPackage eINSTANCE = CIM15.IEC61968.Assets.AssetsPackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Assets.AssetModel <em>Asset Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Assets.AssetModel
	 * @see CIM15.IEC61968.Assets.AssetsPackage#getAssetModel()
	 * @generated
	 */
	public static final int ASSET_MODEL = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL__ASSET_INFO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Erp Inventory Counts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL__ERP_INVENTORY_COUNTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Asset Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Asset Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Assets.ProductAssetModel <em>Product Asset Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Assets.ProductAssetModel
	 * @see CIM15.IEC61968.Assets.AssetsPackage#getProductAssetModel()
	 * @generated
	 */
	public static final int PRODUCT_ASSET_MODEL = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_ASSET_MODEL__UUID = ASSET_MODEL__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_ASSET_MODEL__NAMES = ASSET_MODEL__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_ASSET_MODEL__DIAGRAM_OBJECTS = ASSET_MODEL__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_ASSET_MODEL__MRID = ASSET_MODEL__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_ASSET_MODEL__ALIAS_NAME = ASSET_MODEL__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_ASSET_MODEL__NAME = ASSET_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_ASSET_MODEL__MODELING_AUTHORITY_SET = ASSET_MODEL__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_ASSET_MODEL__ASSET_INFO = ASSET_MODEL__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Erp Inventory Counts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_ASSET_MODEL__ERP_INVENTORY_COUNTS = ASSET_MODEL__ERP_INVENTORY_COUNTS;

	/**
	 * The feature id for the '<em><b>Model Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_ASSET_MODEL__MODEL_VERSION = ASSET_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usage Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_ASSET_MODEL__USAGE_KIND = ASSET_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generic Asset Model Or Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_ASSET_MODEL__GENERIC_ASSET_MODEL_OR_MATERIAL = ASSET_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Asset Model Catalogue Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS = ASSET_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Corporate Standard Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_ASSET_MODEL__CORPORATE_STANDARD_KIND = ASSET_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Model Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_ASSET_MODEL__MODEL_NUMBER = ASSET_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Weight Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_ASSET_MODEL__WEIGHT_TOTAL = ASSET_MODEL_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Product Asset Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_ASSET_MODEL_FEATURE_COUNT = ASSET_MODEL_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Product Asset Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_ASSET_MODEL_OPERATION_COUNT = ASSET_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Assets.Asset <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Assets.Asset
	 * @see CIM15.IEC61968.Assets.AssetsPackage#getAsset()
	 * @generated
	 */
	public static final int ASSET = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__DOCUMENT_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__MEDIUMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__ERP_REC_DELIVERY_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__RATINGS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__TO_ASSET_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__ELECTRONIC_ADDRESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__FROM_ASSET_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__ASSET_FUNCTIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__ERP_ITEM_MASTER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__CORPORATE_CODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__ERP_INVENTORY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__RELIABILITY_INFOS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__UTC_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__ASSET_INFO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__WORK_TASK = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__INITIAL_CONDITION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__ACCEPTANCE_TEST = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__ERP_ORGANISATION_ROLES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__SCHEDULED_EVENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__ASSET_CONTAINER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__CATEGORY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__ASSET_PROPERTY_CURVES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__SERIAL_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__CHANGE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__ACTIVITY_RECORDS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__LOCATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__CRITICAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__APPLICATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__PURCHASE_PRICE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__INITIAL_LOSS_OF_LIFE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__POWER_SYSTEM_RESOURCES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__MANUFACTURED_DATE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__FINANCIAL_INFO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__INSTALLATION_DATE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__PROPERTIES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__MEASUREMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET__LOT_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 37;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 38;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Assets.ComMedia <em>Com Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Assets.ComMedia
	 * @see CIM15.IEC61968.Assets.AssetsPackage#getComMedia()
	 * @generated
	 */
	public static final int COM_MEDIA = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__UUID = ASSET__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__NAMES = ASSET__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__DIAGRAM_OBJECTS = ASSET__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__MRID = ASSET__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__ALIAS_NAME = ASSET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__MODELING_AUTHORITY_SET = ASSET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__DOCUMENT_ROLES = ASSET__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__MEDIUMS = ASSET__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__ERP_REC_DELIVERY_ITEMS = ASSET__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__RATINGS = ASSET__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__TO_ASSET_ROLES = ASSET__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__ELECTRONIC_ADDRESS = ASSET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__FROM_ASSET_ROLES = ASSET__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__ASSET_FUNCTIONS = ASSET__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__ERP_ITEM_MASTER = ASSET__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__CORPORATE_CODE = ASSET__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__ERP_INVENTORY = ASSET__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__RELIABILITY_INFOS = ASSET__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__UTC_NUMBER = ASSET__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__ASSET_INFO = ASSET__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__WORK_TASK = ASSET__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__INITIAL_CONDITION = ASSET__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__ACCEPTANCE_TEST = ASSET__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__ERP_ORGANISATION_ROLES = ASSET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__SCHEDULED_EVENTS = ASSET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__ASSET_CONTAINER = ASSET__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__CATEGORY = ASSET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__ASSET_PROPERTY_CURVES = ASSET__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__SERIAL_NUMBER = ASSET__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__CHANGE_ITEMS = ASSET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__ACTIVITY_RECORDS = ASSET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__LOCATION = ASSET__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__CRITICAL = ASSET__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__STATUS = ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__APPLICATION = ASSET__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__PURCHASE_PRICE = ASSET__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__INITIAL_LOSS_OF_LIFE = ASSET__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__POWER_SYSTEM_RESOURCES = ASSET__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__MANUFACTURED_DATE = ASSET__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__FINANCIAL_INFO = ASSET__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__INSTALLATION_DATE = ASSET__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__PROPERTIES = ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__MEASUREMENTS = ASSET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA__LOT_NUMBER = ASSET__LOT_NUMBER;

	/**
	 * The number of structural features of the '<em>Com Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA_FEATURE_COUNT = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Com Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COM_MEDIA_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Assets.AssetContainer <em>Asset Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Assets.AssetContainer
	 * @see CIM15.IEC61968.Assets.AssetsPackage#getAssetContainer()
	 * @generated
	 */
	public static final int ASSET_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__UUID = ASSET__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__NAMES = ASSET__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__DIAGRAM_OBJECTS = ASSET__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__MRID = ASSET__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__ALIAS_NAME = ASSET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__MODELING_AUTHORITY_SET = ASSET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__DOCUMENT_ROLES = ASSET__DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Mediums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__MEDIUMS = ASSET__MEDIUMS;

	/**
	 * The feature id for the '<em><b>Erp Rec Delivery Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__ERP_REC_DELIVERY_ITEMS = ASSET__ERP_REC_DELIVERY_ITEMS;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__RATINGS = ASSET__RATINGS;

	/**
	 * The feature id for the '<em><b>To Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__TO_ASSET_ROLES = ASSET__TO_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__ELECTRONIC_ADDRESS = ASSET__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>From Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__FROM_ASSET_ROLES = ASSET__FROM_ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Asset Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__ASSET_FUNCTIONS = ASSET__ASSET_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Erp Item Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__ERP_ITEM_MASTER = ASSET__ERP_ITEM_MASTER;

	/**
	 * The feature id for the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__CORPORATE_CODE = ASSET__CORPORATE_CODE;

	/**
	 * The feature id for the '<em><b>Erp Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__ERP_INVENTORY = ASSET__ERP_INVENTORY;

	/**
	 * The feature id for the '<em><b>Reliability Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__RELIABILITY_INFOS = ASSET__RELIABILITY_INFOS;

	/**
	 * The feature id for the '<em><b>Utc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__UTC_NUMBER = ASSET__UTC_NUMBER;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__ASSET_INFO = ASSET__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Work Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__WORK_TASK = ASSET__WORK_TASK;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__INITIAL_CONDITION = ASSET__INITIAL_CONDITION;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__ACCEPTANCE_TEST = ASSET__ACCEPTANCE_TEST;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__ERP_ORGANISATION_ROLES = ASSET__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__SCHEDULED_EVENTS = ASSET__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__ASSET_CONTAINER = ASSET__ASSET_CONTAINER;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__CATEGORY = ASSET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Asset Property Curves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__ASSET_PROPERTY_CURVES = ASSET__ASSET_PROPERTY_CURVES;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__SERIAL_NUMBER = ASSET__SERIAL_NUMBER;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__CHANGE_ITEMS = ASSET__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__ACTIVITY_RECORDS = ASSET__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__LOCATION = ASSET__LOCATION;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__CRITICAL = ASSET__CRITICAL;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__STATUS = ASSET__STATUS;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__APPLICATION = ASSET__APPLICATION;

	/**
	 * The feature id for the '<em><b>Purchase Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__PURCHASE_PRICE = ASSET__PURCHASE_PRICE;

	/**
	 * The feature id for the '<em><b>Initial Loss Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__INITIAL_LOSS_OF_LIFE = ASSET__INITIAL_LOSS_OF_LIFE;

	/**
	 * The feature id for the '<em><b>Power System Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__POWER_SYSTEM_RESOURCES = ASSET__POWER_SYSTEM_RESOURCES;

	/**
	 * The feature id for the '<em><b>Manufactured Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__MANUFACTURED_DATE = ASSET__MANUFACTURED_DATE;

	/**
	 * The feature id for the '<em><b>Financial Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__FINANCIAL_INFO = ASSET__FINANCIAL_INFO;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__INSTALLATION_DATE = ASSET__INSTALLATION_DATE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__PROPERTIES = ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__MEASUREMENTS = ASSET__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Lot Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__LOT_NUMBER = ASSET__LOT_NUMBER;

	/**
	 * The feature id for the '<em><b>Seals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__SEALS = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__ASSETS = ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Land Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER__LAND_PROPERTIES = ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Asset Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER_FEATURE_COUNT = ASSET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Asset Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_CONTAINER_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Assets.AssetFunction <em>Asset Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Assets.AssetFunction
	 * @see CIM15.IEC61968.Assets.AssetsPackage#getAssetFunction()
	 * @generated
	 */
	public static final int ASSET_FUNCTION = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_FUNCTION__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_FUNCTION__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_FUNCTION__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_FUNCTION__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_FUNCTION__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_FUNCTION__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_FUNCTION__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_FUNCTION__ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_FUNCTION__PASSWORD = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_FUNCTION__HARDWARE_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Firmware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_FUNCTION__FIRMWARE_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_FUNCTION__PROGRAM_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Config ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_FUNCTION__CONFIG_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Asset Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_FUNCTION_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Asset Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_FUNCTION_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Assets.Seal <em>Seal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Assets.Seal
	 * @see CIM15.IEC61968.Assets.AssetsPackage#getSeal()
	 * @generated
	 */
	public static final int SEAL = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEAL__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEAL__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEAL__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEAL__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEAL__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEAL__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEAL__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Applied Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEAL__APPLIED_DATE_TIME = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Seal Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEAL__SEAL_NUMBER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEAL__KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEAL__CONDITION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Asset Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEAL__ASSET_CONTAINER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Seal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEAL_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Seal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEAL_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Assets.AssetInfo <em>Asset Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Assets.AssetInfo
	 * @see CIM15.IEC61968.Assets.AssetsPackage#getAssetInfo()
	 * @generated
	 */
	public static final int ASSET_INFO = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_INFO__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_INFO__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_INFO__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_INFO__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_INFO__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_INFO__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_INFO__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_INFO__ASSETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_INFO__DIMENSIONS_INFO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_INFO__ASSET_MODEL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Asset Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_INFO_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Asset Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_INFO_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Assets.AcceptanceTest <em>Acceptance Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Assets.AcceptanceTest
	 * @see CIM15.IEC61968.Assets.AssetsPackage#getAcceptanceTest()
	 * @generated
	 */
	public static final int ACCEPTANCE_TEST = 8;

	/**
	 * The feature id for the '<em><b>Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPTANCE_TEST__SUCCESS = 0;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPTANCE_TEST__DATE_TIME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPTANCE_TEST__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Acceptance Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPTANCE_TEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Acceptance Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPTANCE_TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Assets.CorporateStandardKind <em>Corporate Standard Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Assets.CorporateStandardKind
	 * @see CIM15.IEC61968.Assets.AssetsPackage#getCorporateStandardKind()
	 * @generated
	 */
	public static final int CORPORATE_STANDARD_KIND = 9;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Assets.SealConditionKind <em>Seal Condition Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Assets.SealConditionKind
	 * @see CIM15.IEC61968.Assets.AssetsPackage#getSealConditionKind()
	 * @generated
	 */
	public static final int SEAL_CONDITION_KIND = 10;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Assets.SealKind <em>Seal Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Assets.SealKind
	 * @see CIM15.IEC61968.Assets.AssetsPackage#getSealKind()
	 * @generated
	 */
	public static final int SEAL_KIND = 11;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.Assets.AssetModelUsageKind <em>Asset Model Usage Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.Assets.AssetModelUsageKind
	 * @see CIM15.IEC61968.Assets.AssetsPackage#getAssetModelUsageKind()
	 * @generated
	 */
	public static final int ASSET_MODEL_USAGE_KIND = 12;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productAssetModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comMediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptanceTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum corporateStandardKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sealConditionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sealKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assetModelUsageKindEEnum = null;

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
	 * @see CIM15.IEC61968.Assets.AssetsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AssetsPackage() {
		super(eNS_URI, AssetsFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link AssetsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static AssetsPackage init() {
		if (isInited) return (AssetsPackage)EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI);

		// Obtain or create and register package
		AssetsPackage theAssetsPackage = (AssetsPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AssetsPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AssetsPackage());

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
		WorkPackage theWorkPackage = (WorkPackage)(EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI) instanceof WorkPackage ? EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI) : WorkPackage.eINSTANCE);
		CustomersPackage theCustomersPackage = (CustomersPackage)(EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) instanceof CustomersPackage ? EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) : CustomersPackage.eINSTANCE);
		LoadControlPackage theLoadControlPackage = (LoadControlPackage)(EPackage.Registry.INSTANCE.getEPackage(LoadControlPackage.eNS_URI) instanceof LoadControlPackage ? EPackage.Registry.INSTANCE.getEPackage(LoadControlPackage.eNS_URI) : LoadControlPackage.eINSTANCE);
		IEC62325Package theIEC62325Package = (IEC62325Package)(EPackage.Registry.INSTANCE.getEPackage(IEC62325Package.eNS_URI) instanceof IEC62325Package ? EPackage.Registry.INSTANCE.getEPackage(IEC62325Package.eNS_URI) : IEC62325Package.eINSTANCE);
		PackageDependenciesPackage thePackageDependenciesPackage = (PackageDependenciesPackage)(EPackage.Registry.INSTANCE.getEPackage(PackageDependenciesPackage.eNS_URI) instanceof PackageDependenciesPackage ? EPackage.Registry.INSTANCE.getEPackage(PackageDependenciesPackage.eNS_URI) : PackageDependenciesPackage.eINSTANCE);

		// Load packages
		theCIM15Package.loadPackage();

		// Fix loaded packages
		theAssetsPackage.fixPackageContents();
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
		theWorkPackage.fixPackageContents();
		theCustomersPackage.fixPackageContents();
		theLoadControlPackage.fixPackageContents();
		theIEC62325Package.fixPackageContents();
		thePackageDependenciesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theAssetsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AssetsPackage.eNS_URI, theAssetsPackage);
		return theAssetsPackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Assets.ProductAssetModel <em>Product Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Asset Model</em>'.
	 * @see CIM15.IEC61968.Assets.ProductAssetModel
	 * @generated
	 */
	public EClass getProductAssetModel() {
		if (productAssetModelEClass == null) {
			productAssetModelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI).getEClassifiers().get(0);
		}
		return productAssetModelEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.ProductAssetModel#getModelVersion <em>Model Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Version</em>'.
	 * @see CIM15.IEC61968.Assets.ProductAssetModel#getModelVersion()
	 * @see #getProductAssetModel()
	 * @generated
	 */
	public EAttribute getProductAssetModel_ModelVersion() {
        return (EAttribute)getProductAssetModel().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.ProductAssetModel#getUsageKind <em>Usage Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Kind</em>'.
	 * @see CIM15.IEC61968.Assets.ProductAssetModel#getUsageKind()
	 * @see #getProductAssetModel()
	 * @generated
	 */
	public EAttribute getProductAssetModel_UsageKind() {
        return (EAttribute)getProductAssetModel().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Assets.ProductAssetModel#getGenericAssetModelOrMaterial <em>Generic Asset Model Or Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generic Asset Model Or Material</em>'.
	 * @see CIM15.IEC61968.Assets.ProductAssetModel#getGenericAssetModelOrMaterial()
	 * @see #getProductAssetModel()
	 * @generated
	 */
	public EReference getProductAssetModel_GenericAssetModelOrMaterial() {
        return (EReference)getProductAssetModel().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Assets.ProductAssetModel#getAssetModelCatalogueItems <em>Asset Model Catalogue Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asset Model Catalogue Items</em>'.
	 * @see CIM15.IEC61968.Assets.ProductAssetModel#getAssetModelCatalogueItems()
	 * @see #getProductAssetModel()
	 * @generated
	 */
	public EReference getProductAssetModel_AssetModelCatalogueItems() {
        return (EReference)getProductAssetModel().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.ProductAssetModel#getCorporateStandardKind <em>Corporate Standard Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corporate Standard Kind</em>'.
	 * @see CIM15.IEC61968.Assets.ProductAssetModel#getCorporateStandardKind()
	 * @see #getProductAssetModel()
	 * @generated
	 */
	public EAttribute getProductAssetModel_CorporateStandardKind() {
        return (EAttribute)getProductAssetModel().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.ProductAssetModel#getModelNumber <em>Model Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Number</em>'.
	 * @see CIM15.IEC61968.Assets.ProductAssetModel#getModelNumber()
	 * @see #getProductAssetModel()
	 * @generated
	 */
	public EAttribute getProductAssetModel_ModelNumber() {
        return (EAttribute)getProductAssetModel().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.ProductAssetModel#getWeightTotal <em>Weight Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight Total</em>'.
	 * @see CIM15.IEC61968.Assets.ProductAssetModel#getWeightTotal()
	 * @see #getProductAssetModel()
	 * @generated
	 */
	public EAttribute getProductAssetModel_WeightTotal() {
        return (EAttribute)getProductAssetModel().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Assets.AssetModel <em>Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Model</em>'.
	 * @see CIM15.IEC61968.Assets.AssetModel
	 * @generated
	 */
	public EClass getAssetModel() {
		if (assetModelEClass == null) {
			assetModelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI).getEClassifiers().get(1);
		}
		return assetModelEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Assets.AssetModel#getAssetInfo <em>Asset Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset Info</em>'.
	 * @see CIM15.IEC61968.Assets.AssetModel#getAssetInfo()
	 * @see #getAssetModel()
	 * @generated
	 */
	public EReference getAssetModel_AssetInfo() {
        return (EReference)getAssetModel().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Assets.AssetModel#getErpInventoryCounts <em>Erp Inventory Counts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Inventory Counts</em>'.
	 * @see CIM15.IEC61968.Assets.AssetModel#getErpInventoryCounts()
	 * @see #getAssetModel()
	 * @generated
	 */
	public EReference getAssetModel_ErpInventoryCounts() {
        return (EReference)getAssetModel().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Assets.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see CIM15.IEC61968.Assets.Asset
	 * @generated
	 */
	public EClass getAsset() {
		if (assetEClass == null) {
			assetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI).getEClassifiers().get(3);
		}
		return assetEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Assets.Asset#getDocumentRoles <em>Document Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Document Roles</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getDocumentRoles()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_DocumentRoles() {
        return (EReference)getAsset().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Assets.Asset#getMediums <em>Mediums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mediums</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getMediums()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_Mediums() {
        return (EReference)getAsset().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Assets.Asset#getErpRecDeliveryItems <em>Erp Rec Delivery Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Rec Delivery Items</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getErpRecDeliveryItems()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_ErpRecDeliveryItems() {
        return (EReference)getAsset().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Assets.Asset#getRatings <em>Ratings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ratings</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getRatings()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_Ratings() {
        return (EReference)getAsset().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Assets.Asset#getToAssetRoles <em>To Asset Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Asset Roles</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getToAssetRoles()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_ToAssetRoles() {
        return (EReference)getAsset().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Assets.Asset#getElectronicAddress <em>Electronic Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Electronic Address</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getElectronicAddress()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_ElectronicAddress() {
        return (EReference)getAsset().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Assets.Asset#getFromAssetRoles <em>From Asset Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Asset Roles</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getFromAssetRoles()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_FromAssetRoles() {
        return (EReference)getAsset().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Assets.Asset#getAssetFunctions <em>Asset Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asset Functions</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getAssetFunctions()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_AssetFunctions() {
        return (EReference)getAsset().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Assets.Asset#getErpItemMaster <em>Erp Item Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Item Master</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getErpItemMaster()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_ErpItemMaster() {
        return (EReference)getAsset().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.Asset#getCorporateCode <em>Corporate Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corporate Code</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getCorporateCode()
	 * @see #getAsset()
	 * @generated
	 */
	public EAttribute getAsset_CorporateCode() {
        return (EAttribute)getAsset().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Assets.Asset#getErpInventory <em>Erp Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Inventory</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getErpInventory()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_ErpInventory() {
        return (EReference)getAsset().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Assets.Asset#getReliabilityInfos <em>Reliability Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reliability Infos</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getReliabilityInfos()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_ReliabilityInfos() {
        return (EReference)getAsset().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.Asset#getUtcNumber <em>Utc Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utc Number</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getUtcNumber()
	 * @see #getAsset()
	 * @generated
	 */
	public EAttribute getAsset_UtcNumber() {
        return (EAttribute)getAsset().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Assets.Asset#getAssetInfo <em>Asset Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset Info</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getAssetInfo()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_AssetInfo() {
        return (EReference)getAsset().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Assets.Asset#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Task</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getWorkTask()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_WorkTask() {
        return (EReference)getAsset().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.Asset#getInitialCondition <em>Initial Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Condition</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getInitialCondition()
	 * @see #getAsset()
	 * @generated
	 */
	public EAttribute getAsset_InitialCondition() {
        return (EAttribute)getAsset().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Assets.Asset#getAcceptanceTest <em>Acceptance Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acceptance Test</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getAcceptanceTest()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_AcceptanceTest() {
        return (EReference)getAsset().getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Assets.Asset#getErpOrganisationRoles <em>Erp Organisation Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Organisation Roles</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getErpOrganisationRoles()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_ErpOrganisationRoles() {
        return (EReference)getAsset().getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Assets.Asset#getScheduledEvents <em>Scheduled Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scheduled Events</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getScheduledEvents()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_ScheduledEvents() {
        return (EReference)getAsset().getEStructuralFeatures().get(18);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Assets.Asset#getAssetContainer <em>Asset Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset Container</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getAssetContainer()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_AssetContainer() {
        return (EReference)getAsset().getEStructuralFeatures().get(19);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.Asset#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getCategory()
	 * @see #getAsset()
	 * @generated
	 */
	public EAttribute getAsset_Category() {
        return (EAttribute)getAsset().getEStructuralFeatures().get(20);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Assets.Asset#getAssetPropertyCurves <em>Asset Property Curves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asset Property Curves</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getAssetPropertyCurves()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_AssetPropertyCurves() {
        return (EReference)getAsset().getEStructuralFeatures().get(21);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.Asset#getSerialNumber <em>Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Number</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getSerialNumber()
	 * @see #getAsset()
	 * @generated
	 */
	public EAttribute getAsset_SerialNumber() {
        return (EAttribute)getAsset().getEStructuralFeatures().get(22);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Assets.Asset#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Change Items</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getChangeItems()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_ChangeItems() {
        return (EReference)getAsset().getEStructuralFeatures().get(23);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Assets.Asset#getActivityRecords <em>Activity Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Records</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getActivityRecords()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_ActivityRecords() {
        return (EReference)getAsset().getEStructuralFeatures().get(24);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Assets.Asset#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getLocation()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_Location() {
        return (EReference)getAsset().getEStructuralFeatures().get(25);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.Asset#isCritical <em>Critical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Critical</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#isCritical()
	 * @see #getAsset()
	 * @generated
	 */
	public EAttribute getAsset_Critical() {
        return (EAttribute)getAsset().getEStructuralFeatures().get(26);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.Assets.Asset#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getStatus()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_Status() {
        return (EReference)getAsset().getEStructuralFeatures().get(27);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.Asset#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getApplication()
	 * @see #getAsset()
	 * @generated
	 */
	public EAttribute getAsset_Application() {
        return (EAttribute)getAsset().getEStructuralFeatures().get(28);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.Asset#getPurchasePrice <em>Purchase Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purchase Price</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getPurchasePrice()
	 * @see #getAsset()
	 * @generated
	 */
	public EAttribute getAsset_PurchasePrice() {
        return (EAttribute)getAsset().getEStructuralFeatures().get(29);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.Asset#getInitialLossOfLife <em>Initial Loss Of Life</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Loss Of Life</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getInitialLossOfLife()
	 * @see #getAsset()
	 * @generated
	 */
	public EAttribute getAsset_InitialLossOfLife() {
        return (EAttribute)getAsset().getEStructuralFeatures().get(30);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Assets.Asset#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power System Resources</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getPowerSystemResources()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_PowerSystemResources() {
        return (EReference)getAsset().getEStructuralFeatures().get(31);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.Asset#getManufacturedDate <em>Manufactured Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufactured Date</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getManufacturedDate()
	 * @see #getAsset()
	 * @generated
	 */
	public EAttribute getAsset_ManufacturedDate() {
        return (EAttribute)getAsset().getEStructuralFeatures().get(32);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Assets.Asset#getFinancialInfo <em>Financial Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Financial Info</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getFinancialInfo()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_FinancialInfo() {
        return (EReference)getAsset().getEStructuralFeatures().get(33);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.Asset#getInstallationDate <em>Installation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Installation Date</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getInstallationDate()
	 * @see #getAsset()
	 * @generated
	 */
	public EAttribute getAsset_InstallationDate() {
        return (EAttribute)getAsset().getEStructuralFeatures().get(34);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Assets.Asset#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getProperties()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_Properties() {
        return (EReference)getAsset().getEStructuralFeatures().get(35);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Assets.Asset#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurements</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getMeasurements()
	 * @see #getAsset()
	 * @generated
	 */
	public EReference getAsset_Measurements() {
        return (EReference)getAsset().getEStructuralFeatures().get(36);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.Asset#getLotNumber <em>Lot Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lot Number</em>'.
	 * @see CIM15.IEC61968.Assets.Asset#getLotNumber()
	 * @see #getAsset()
	 * @generated
	 */
	public EAttribute getAsset_LotNumber() {
        return (EAttribute)getAsset().getEStructuralFeatures().get(37);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Assets.ComMedia <em>Com Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Media</em>'.
	 * @see CIM15.IEC61968.Assets.ComMedia
	 * @generated
	 */
	public EClass getComMedia() {
		if (comMediaEClass == null) {
			comMediaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI).getEClassifiers().get(4);
		}
		return comMediaEClass;
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Assets.AssetContainer <em>Asset Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Container</em>'.
	 * @see CIM15.IEC61968.Assets.AssetContainer
	 * @generated
	 */
	public EClass getAssetContainer() {
		if (assetContainerEClass == null) {
			assetContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI).getEClassifiers().get(6);
		}
		return assetContainerEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Assets.AssetContainer#getSeals <em>Seals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Seals</em>'.
	 * @see CIM15.IEC61968.Assets.AssetContainer#getSeals()
	 * @see #getAssetContainer()
	 * @generated
	 */
	public EReference getAssetContainer_Seals() {
        return (EReference)getAssetContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Assets.AssetContainer#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see CIM15.IEC61968.Assets.AssetContainer#getAssets()
	 * @see #getAssetContainer()
	 * @generated
	 */
	public EReference getAssetContainer_Assets() {
        return (EReference)getAssetContainer().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.Assets.AssetContainer#getLandProperties <em>Land Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Land Properties</em>'.
	 * @see CIM15.IEC61968.Assets.AssetContainer#getLandProperties()
	 * @see #getAssetContainer()
	 * @generated
	 */
	public EReference getAssetContainer_LandProperties() {
        return (EReference)getAssetContainer().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Assets.AssetFunction <em>Asset Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Function</em>'.
	 * @see CIM15.IEC61968.Assets.AssetFunction
	 * @generated
	 */
	public EClass getAssetFunction() {
		if (assetFunctionEClass == null) {
			assetFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI).getEClassifiers().get(8);
		}
		return assetFunctionEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Assets.AssetFunction#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see CIM15.IEC61968.Assets.AssetFunction#getAsset()
	 * @see #getAssetFunction()
	 * @generated
	 */
	public EReference getAssetFunction_Asset() {
        return (EReference)getAssetFunction().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.AssetFunction#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see CIM15.IEC61968.Assets.AssetFunction#getPassword()
	 * @see #getAssetFunction()
	 * @generated
	 */
	public EAttribute getAssetFunction_Password() {
        return (EAttribute)getAssetFunction().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.AssetFunction#getHardwareID <em>Hardware ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware ID</em>'.
	 * @see CIM15.IEC61968.Assets.AssetFunction#getHardwareID()
	 * @see #getAssetFunction()
	 * @generated
	 */
	public EAttribute getAssetFunction_HardwareID() {
        return (EAttribute)getAssetFunction().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.AssetFunction#getFirmwareID <em>Firmware ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firmware ID</em>'.
	 * @see CIM15.IEC61968.Assets.AssetFunction#getFirmwareID()
	 * @see #getAssetFunction()
	 * @generated
	 */
	public EAttribute getAssetFunction_FirmwareID() {
        return (EAttribute)getAssetFunction().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.AssetFunction#getProgramID <em>Program ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program ID</em>'.
	 * @see CIM15.IEC61968.Assets.AssetFunction#getProgramID()
	 * @see #getAssetFunction()
	 * @generated
	 */
	public EAttribute getAssetFunction_ProgramID() {
        return (EAttribute)getAssetFunction().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.AssetFunction#getConfigID <em>Config ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config ID</em>'.
	 * @see CIM15.IEC61968.Assets.AssetFunction#getConfigID()
	 * @see #getAssetFunction()
	 * @generated
	 */
	public EAttribute getAssetFunction_ConfigID() {
        return (EAttribute)getAssetFunction().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Assets.Seal <em>Seal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seal</em>'.
	 * @see CIM15.IEC61968.Assets.Seal
	 * @generated
	 */
	public EClass getSeal() {
		if (sealEClass == null) {
			sealEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI).getEClassifiers().get(9);
		}
		return sealEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.Seal#getAppliedDateTime <em>Applied Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applied Date Time</em>'.
	 * @see CIM15.IEC61968.Assets.Seal#getAppliedDateTime()
	 * @see #getSeal()
	 * @generated
	 */
	public EAttribute getSeal_AppliedDateTime() {
        return (EAttribute)getSeal().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.Seal#getSealNumber <em>Seal Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seal Number</em>'.
	 * @see CIM15.IEC61968.Assets.Seal#getSealNumber()
	 * @see #getSeal()
	 * @generated
	 */
	public EAttribute getSeal_SealNumber() {
        return (EAttribute)getSeal().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.Seal#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM15.IEC61968.Assets.Seal#getKind()
	 * @see #getSeal()
	 * @generated
	 */
	public EAttribute getSeal_Kind() {
        return (EAttribute)getSeal().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.Seal#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see CIM15.IEC61968.Assets.Seal#getCondition()
	 * @see #getSeal()
	 * @generated
	 */
	public EAttribute getSeal_Condition() {
        return (EAttribute)getSeal().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Assets.Seal#getAssetContainer <em>Asset Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset Container</em>'.
	 * @see CIM15.IEC61968.Assets.Seal#getAssetContainer()
	 * @see #getSeal()
	 * @generated
	 */
	public EReference getSeal_AssetContainer() {
        return (EReference)getSeal().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Assets.AssetInfo <em>Asset Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Info</em>'.
	 * @see CIM15.IEC61968.Assets.AssetInfo
	 * @generated
	 */
	public EClass getAssetInfo() {
		if (assetInfoEClass == null) {
			assetInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI).getEClassifiers().get(11);
		}
		return assetInfoEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Assets.AssetInfo#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assets</em>'.
	 * @see CIM15.IEC61968.Assets.AssetInfo#getAssets()
	 * @see #getAssetInfo()
	 * @generated
	 */
	public EReference getAssetInfo_Assets() {
        return (EReference)getAssetInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Assets.AssetInfo#getDimensionsInfo <em>Dimensions Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dimensions Info</em>'.
	 * @see CIM15.IEC61968.Assets.AssetInfo#getDimensionsInfo()
	 * @see #getAssetInfo()
	 * @generated
	 */
	public EReference getAssetInfo_DimensionsInfo() {
        return (EReference)getAssetInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.Assets.AssetInfo#getAssetModel <em>Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset Model</em>'.
	 * @see CIM15.IEC61968.Assets.AssetInfo#getAssetModel()
	 * @see #getAssetInfo()
	 * @generated
	 */
	public EReference getAssetInfo_AssetModel() {
        return (EReference)getAssetInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.Assets.AcceptanceTest <em>Acceptance Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acceptance Test</em>'.
	 * @see CIM15.IEC61968.Assets.AcceptanceTest
	 * @generated
	 */
	public EClass getAcceptanceTest() {
		if (acceptanceTestEClass == null) {
			acceptanceTestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI).getEClassifiers().get(12);
		}
		return acceptanceTestEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.AcceptanceTest#isSuccess <em>Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success</em>'.
	 * @see CIM15.IEC61968.Assets.AcceptanceTest#isSuccess()
	 * @see #getAcceptanceTest()
	 * @generated
	 */
	public EAttribute getAcceptanceTest_Success() {
        return (EAttribute)getAcceptanceTest().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.AcceptanceTest#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see CIM15.IEC61968.Assets.AcceptanceTest#getDateTime()
	 * @see #getAcceptanceTest()
	 * @generated
	 */
	public EAttribute getAcceptanceTest_DateTime() {
        return (EAttribute)getAcceptanceTest().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.Assets.AcceptanceTest#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CIM15.IEC61968.Assets.AcceptanceTest#getType()
	 * @see #getAcceptanceTest()
	 * @generated
	 */
	public EAttribute getAcceptanceTest_Type() {
        return (EAttribute)getAcceptanceTest().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61968.Assets.CorporateStandardKind <em>Corporate Standard Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Corporate Standard Kind</em>'.
	 * @see CIM15.IEC61968.Assets.CorporateStandardKind
	 * @generated
	 */
	public EEnum getCorporateStandardKind() {
		if (corporateStandardKindEEnum == null) {
			corporateStandardKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI).getEClassifiers().get(2);
		}
		return corporateStandardKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61968.Assets.SealConditionKind <em>Seal Condition Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Seal Condition Kind</em>'.
	 * @see CIM15.IEC61968.Assets.SealConditionKind
	 * @generated
	 */
	public EEnum getSealConditionKind() {
		if (sealConditionKindEEnum == null) {
			sealConditionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI).getEClassifiers().get(5);
		}
		return sealConditionKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61968.Assets.SealKind <em>Seal Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Seal Kind</em>'.
	 * @see CIM15.IEC61968.Assets.SealKind
	 * @generated
	 */
	public EEnum getSealKind() {
		if (sealKindEEnum == null) {
			sealKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI).getEClassifiers().get(7);
		}
		return sealKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61968.Assets.AssetModelUsageKind <em>Asset Model Usage Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Asset Model Usage Kind</em>'.
	 * @see CIM15.IEC61968.Assets.AssetModelUsageKind
	 * @generated
	 */
	public EEnum getAssetModelUsageKind() {
		if (assetModelUsageKindEEnum == null) {
			assetModelUsageKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI).getEClassifiers().get(10);
		}
		return assetModelUsageKindEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public AssetsFactory getAssetsFactory() {
		return (AssetsFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM15.IEC61968.Assets." + eClassifier.getName());
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
		 * The meta object literal for the '{@link CIM15.IEC61968.Assets.ProductAssetModel <em>Product Asset Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Assets.ProductAssetModel
		 * @see CIM15.IEC61968.Assets.AssetsPackage#getProductAssetModel()
		 * @generated
		 */
		public static final EClass PRODUCT_ASSET_MODEL = eINSTANCE.getProductAssetModel();

		/**
		 * The meta object literal for the '<em><b>Model Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PRODUCT_ASSET_MODEL__MODEL_VERSION = eINSTANCE.getProductAssetModel_ModelVersion();

		/**
		 * The meta object literal for the '<em><b>Usage Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PRODUCT_ASSET_MODEL__USAGE_KIND = eINSTANCE.getProductAssetModel_UsageKind();

		/**
		 * The meta object literal for the '<em><b>Generic Asset Model Or Material</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PRODUCT_ASSET_MODEL__GENERIC_ASSET_MODEL_OR_MATERIAL = eINSTANCE.getProductAssetModel_GenericAssetModelOrMaterial();

		/**
		 * The meta object literal for the '<em><b>Asset Model Catalogue Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PRODUCT_ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS = eINSTANCE.getProductAssetModel_AssetModelCatalogueItems();

		/**
		 * The meta object literal for the '<em><b>Corporate Standard Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PRODUCT_ASSET_MODEL__CORPORATE_STANDARD_KIND = eINSTANCE.getProductAssetModel_CorporateStandardKind();

		/**
		 * The meta object literal for the '<em><b>Model Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PRODUCT_ASSET_MODEL__MODEL_NUMBER = eINSTANCE.getProductAssetModel_ModelNumber();

		/**
		 * The meta object literal for the '<em><b>Weight Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PRODUCT_ASSET_MODEL__WEIGHT_TOTAL = eINSTANCE.getProductAssetModel_WeightTotal();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Assets.AssetModel <em>Asset Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Assets.AssetModel
		 * @see CIM15.IEC61968.Assets.AssetsPackage#getAssetModel()
		 * @generated
		 */
		public static final EClass ASSET_MODEL = eINSTANCE.getAssetModel();

		/**
		 * The meta object literal for the '<em><b>Asset Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET_MODEL__ASSET_INFO = eINSTANCE.getAssetModel_AssetInfo();

		/**
		 * The meta object literal for the '<em><b>Erp Inventory Counts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET_MODEL__ERP_INVENTORY_COUNTS = eINSTANCE.getAssetModel_ErpInventoryCounts();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Assets.Asset <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Assets.Asset
		 * @see CIM15.IEC61968.Assets.AssetsPackage#getAsset()
		 * @generated
		 */
		public static final EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Document Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__DOCUMENT_ROLES = eINSTANCE.getAsset_DocumentRoles();

		/**
		 * The meta object literal for the '<em><b>Mediums</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__MEDIUMS = eINSTANCE.getAsset_Mediums();

		/**
		 * The meta object literal for the '<em><b>Erp Rec Delivery Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__ERP_REC_DELIVERY_ITEMS = eINSTANCE.getAsset_ErpRecDeliveryItems();

		/**
		 * The meta object literal for the '<em><b>Ratings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__RATINGS = eINSTANCE.getAsset_Ratings();

		/**
		 * The meta object literal for the '<em><b>To Asset Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__TO_ASSET_ROLES = eINSTANCE.getAsset_ToAssetRoles();

		/**
		 * The meta object literal for the '<em><b>Electronic Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__ELECTRONIC_ADDRESS = eINSTANCE.getAsset_ElectronicAddress();

		/**
		 * The meta object literal for the '<em><b>From Asset Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__FROM_ASSET_ROLES = eINSTANCE.getAsset_FromAssetRoles();

		/**
		 * The meta object literal for the '<em><b>Asset Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__ASSET_FUNCTIONS = eINSTANCE.getAsset_AssetFunctions();

		/**
		 * The meta object literal for the '<em><b>Erp Item Master</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__ERP_ITEM_MASTER = eINSTANCE.getAsset_ErpItemMaster();

		/**
		 * The meta object literal for the '<em><b>Corporate Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ASSET__CORPORATE_CODE = eINSTANCE.getAsset_CorporateCode();

		/**
		 * The meta object literal for the '<em><b>Erp Inventory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__ERP_INVENTORY = eINSTANCE.getAsset_ErpInventory();

		/**
		 * The meta object literal for the '<em><b>Reliability Infos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__RELIABILITY_INFOS = eINSTANCE.getAsset_ReliabilityInfos();

		/**
		 * The meta object literal for the '<em><b>Utc Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ASSET__UTC_NUMBER = eINSTANCE.getAsset_UtcNumber();

		/**
		 * The meta object literal for the '<em><b>Asset Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__ASSET_INFO = eINSTANCE.getAsset_AssetInfo();

		/**
		 * The meta object literal for the '<em><b>Work Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__WORK_TASK = eINSTANCE.getAsset_WorkTask();

		/**
		 * The meta object literal for the '<em><b>Initial Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ASSET__INITIAL_CONDITION = eINSTANCE.getAsset_InitialCondition();

		/**
		 * The meta object literal for the '<em><b>Acceptance Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__ACCEPTANCE_TEST = eINSTANCE.getAsset_AcceptanceTest();

		/**
		 * The meta object literal for the '<em><b>Erp Organisation Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__ERP_ORGANISATION_ROLES = eINSTANCE.getAsset_ErpOrganisationRoles();

		/**
		 * The meta object literal for the '<em><b>Scheduled Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__SCHEDULED_EVENTS = eINSTANCE.getAsset_ScheduledEvents();

		/**
		 * The meta object literal for the '<em><b>Asset Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__ASSET_CONTAINER = eINSTANCE.getAsset_AssetContainer();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ASSET__CATEGORY = eINSTANCE.getAsset_Category();

		/**
		 * The meta object literal for the '<em><b>Asset Property Curves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__ASSET_PROPERTY_CURVES = eINSTANCE.getAsset_AssetPropertyCurves();

		/**
		 * The meta object literal for the '<em><b>Serial Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ASSET__SERIAL_NUMBER = eINSTANCE.getAsset_SerialNumber();

		/**
		 * The meta object literal for the '<em><b>Change Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__CHANGE_ITEMS = eINSTANCE.getAsset_ChangeItems();

		/**
		 * The meta object literal for the '<em><b>Activity Records</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__ACTIVITY_RECORDS = eINSTANCE.getAsset_ActivityRecords();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__LOCATION = eINSTANCE.getAsset_Location();

		/**
		 * The meta object literal for the '<em><b>Critical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ASSET__CRITICAL = eINSTANCE.getAsset_Critical();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__STATUS = eINSTANCE.getAsset_Status();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ASSET__APPLICATION = eINSTANCE.getAsset_Application();

		/**
		 * The meta object literal for the '<em><b>Purchase Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ASSET__PURCHASE_PRICE = eINSTANCE.getAsset_PurchasePrice();

		/**
		 * The meta object literal for the '<em><b>Initial Loss Of Life</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ASSET__INITIAL_LOSS_OF_LIFE = eINSTANCE.getAsset_InitialLossOfLife();

		/**
		 * The meta object literal for the '<em><b>Power System Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__POWER_SYSTEM_RESOURCES = eINSTANCE.getAsset_PowerSystemResources();

		/**
		 * The meta object literal for the '<em><b>Manufactured Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ASSET__MANUFACTURED_DATE = eINSTANCE.getAsset_ManufacturedDate();

		/**
		 * The meta object literal for the '<em><b>Financial Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__FINANCIAL_INFO = eINSTANCE.getAsset_FinancialInfo();

		/**
		 * The meta object literal for the '<em><b>Installation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ASSET__INSTALLATION_DATE = eINSTANCE.getAsset_InstallationDate();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__PROPERTIES = eINSTANCE.getAsset_Properties();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET__MEASUREMENTS = eINSTANCE.getAsset_Measurements();

		/**
		 * The meta object literal for the '<em><b>Lot Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ASSET__LOT_NUMBER = eINSTANCE.getAsset_LotNumber();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Assets.ComMedia <em>Com Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Assets.ComMedia
		 * @see CIM15.IEC61968.Assets.AssetsPackage#getComMedia()
		 * @generated
		 */
		public static final EClass COM_MEDIA = eINSTANCE.getComMedia();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Assets.AssetContainer <em>Asset Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Assets.AssetContainer
		 * @see CIM15.IEC61968.Assets.AssetsPackage#getAssetContainer()
		 * @generated
		 */
		public static final EClass ASSET_CONTAINER = eINSTANCE.getAssetContainer();

		/**
		 * The meta object literal for the '<em><b>Seals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET_CONTAINER__SEALS = eINSTANCE.getAssetContainer_Seals();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET_CONTAINER__ASSETS = eINSTANCE.getAssetContainer_Assets();

		/**
		 * The meta object literal for the '<em><b>Land Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET_CONTAINER__LAND_PROPERTIES = eINSTANCE.getAssetContainer_LandProperties();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Assets.AssetFunction <em>Asset Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Assets.AssetFunction
		 * @see CIM15.IEC61968.Assets.AssetsPackage#getAssetFunction()
		 * @generated
		 */
		public static final EClass ASSET_FUNCTION = eINSTANCE.getAssetFunction();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET_FUNCTION__ASSET = eINSTANCE.getAssetFunction_Asset();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ASSET_FUNCTION__PASSWORD = eINSTANCE.getAssetFunction_Password();

		/**
		 * The meta object literal for the '<em><b>Hardware ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ASSET_FUNCTION__HARDWARE_ID = eINSTANCE.getAssetFunction_HardwareID();

		/**
		 * The meta object literal for the '<em><b>Firmware ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ASSET_FUNCTION__FIRMWARE_ID = eINSTANCE.getAssetFunction_FirmwareID();

		/**
		 * The meta object literal for the '<em><b>Program ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ASSET_FUNCTION__PROGRAM_ID = eINSTANCE.getAssetFunction_ProgramID();

		/**
		 * The meta object literal for the '<em><b>Config ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ASSET_FUNCTION__CONFIG_ID = eINSTANCE.getAssetFunction_ConfigID();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Assets.Seal <em>Seal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Assets.Seal
		 * @see CIM15.IEC61968.Assets.AssetsPackage#getSeal()
		 * @generated
		 */
		public static final EClass SEAL = eINSTANCE.getSeal();

		/**
		 * The meta object literal for the '<em><b>Applied Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SEAL__APPLIED_DATE_TIME = eINSTANCE.getSeal_AppliedDateTime();

		/**
		 * The meta object literal for the '<em><b>Seal Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SEAL__SEAL_NUMBER = eINSTANCE.getSeal_SealNumber();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SEAL__KIND = eINSTANCE.getSeal_Kind();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SEAL__CONDITION = eINSTANCE.getSeal_Condition();

		/**
		 * The meta object literal for the '<em><b>Asset Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SEAL__ASSET_CONTAINER = eINSTANCE.getSeal_AssetContainer();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Assets.AssetInfo <em>Asset Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Assets.AssetInfo
		 * @see CIM15.IEC61968.Assets.AssetsPackage#getAssetInfo()
		 * @generated
		 */
		public static final EClass ASSET_INFO = eINSTANCE.getAssetInfo();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET_INFO__ASSETS = eINSTANCE.getAssetInfo_Assets();

		/**
		 * The meta object literal for the '<em><b>Dimensions Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET_INFO__DIMENSIONS_INFO = eINSTANCE.getAssetInfo_DimensionsInfo();

		/**
		 * The meta object literal for the '<em><b>Asset Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET_INFO__ASSET_MODEL = eINSTANCE.getAssetInfo_AssetModel();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Assets.AcceptanceTest <em>Acceptance Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Assets.AcceptanceTest
		 * @see CIM15.IEC61968.Assets.AssetsPackage#getAcceptanceTest()
		 * @generated
		 */
		public static final EClass ACCEPTANCE_TEST = eINSTANCE.getAcceptanceTest();

		/**
		 * The meta object literal for the '<em><b>Success</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACCEPTANCE_TEST__SUCCESS = eINSTANCE.getAcceptanceTest_Success();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACCEPTANCE_TEST__DATE_TIME = eINSTANCE.getAcceptanceTest_DateTime();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACCEPTANCE_TEST__TYPE = eINSTANCE.getAcceptanceTest_Type();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Assets.CorporateStandardKind <em>Corporate Standard Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Assets.CorporateStandardKind
		 * @see CIM15.IEC61968.Assets.AssetsPackage#getCorporateStandardKind()
		 * @generated
		 */
		public static final EEnum CORPORATE_STANDARD_KIND = eINSTANCE.getCorporateStandardKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Assets.SealConditionKind <em>Seal Condition Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Assets.SealConditionKind
		 * @see CIM15.IEC61968.Assets.AssetsPackage#getSealConditionKind()
		 * @generated
		 */
		public static final EEnum SEAL_CONDITION_KIND = eINSTANCE.getSealConditionKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Assets.SealKind <em>Seal Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Assets.SealKind
		 * @see CIM15.IEC61968.Assets.AssetsPackage#getSealKind()
		 * @generated
		 */
		public static final EEnum SEAL_KIND = eINSTANCE.getSealKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.Assets.AssetModelUsageKind <em>Asset Model Usage Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.Assets.AssetModelUsageKind
		 * @see CIM15.IEC61968.Assets.AssetsPackage#getAssetModelUsageKind()
		 * @generated
		 */
		public static final EEnum ASSET_MODEL_USAGE_KIND = eINSTANCE.getAssetModelUsageKind();

	}

} //AssetsPackage
