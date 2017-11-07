/**
 */
package CIM15.IEC61970.Informative.InfAssetModels;

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
 * @see CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsFactory
 * @generated
 */
public class InfAssetModelsPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "InfAssetModels";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#InfAssetModels";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimInfAssetModels";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfAssetModelsPackage eINSTANCE = CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogue <em>Asset Model Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogue
	 * @see CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getAssetModelCatalogue()
	 * @generated
	 */
	public static final int ASSET_MODEL_CATALOGUE = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Asset Model Catalogue Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE__ASSET_MODEL_CATALOGUE_ITEMS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Asset Model Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Asset Model Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel <em>Transformer Asset Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel
	 * @see CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerAssetModel()
	 * @generated
	 */
	public static final int TRANSFORMER_ASSET_MODEL = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__UUID = AssetsPackage.PRODUCT_ASSET_MODEL__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__NAMES = AssetsPackage.PRODUCT_ASSET_MODEL__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__DIAGRAM_OBJECTS = AssetsPackage.PRODUCT_ASSET_MODEL__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__MRID = AssetsPackage.PRODUCT_ASSET_MODEL__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__ALIAS_NAME = AssetsPackage.PRODUCT_ASSET_MODEL__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__NAME = AssetsPackage.PRODUCT_ASSET_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__MODELING_AUTHORITY_SET = AssetsPackage.PRODUCT_ASSET_MODEL__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__ASSET_INFO = AssetsPackage.PRODUCT_ASSET_MODEL__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Erp Inventory Counts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__ERP_INVENTORY_COUNTS = AssetsPackage.PRODUCT_ASSET_MODEL__ERP_INVENTORY_COUNTS;

	/**
	 * The feature id for the '<em><b>Model Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__MODEL_VERSION = AssetsPackage.PRODUCT_ASSET_MODEL__MODEL_VERSION;

	/**
	 * The feature id for the '<em><b>Usage Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__USAGE_KIND = AssetsPackage.PRODUCT_ASSET_MODEL__USAGE_KIND;

	/**
	 * The feature id for the '<em><b>Generic Asset Model Or Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__GENERIC_ASSET_MODEL_OR_MATERIAL = AssetsPackage.PRODUCT_ASSET_MODEL__GENERIC_ASSET_MODEL_OR_MATERIAL;

	/**
	 * The feature id for the '<em><b>Asset Model Catalogue Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS = AssetsPackage.PRODUCT_ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS;

	/**
	 * The feature id for the '<em><b>Corporate Standard Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__CORPORATE_STANDARD_KIND = AssetsPackage.PRODUCT_ASSET_MODEL__CORPORATE_STANDARD_KIND;

	/**
	 * The feature id for the '<em><b>Model Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__MODEL_NUMBER = AssetsPackage.PRODUCT_ASSET_MODEL__MODEL_NUMBER;

	/**
	 * The feature id for the '<em><b>Weight Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__WEIGHT_TOTAL = AssetsPackage.PRODUCT_ASSET_MODEL__WEIGHT_TOTAL;

	/**
	 * The feature id for the '<em><b>Neutral BIL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__NEUTRAL_BIL = AssetsPackage.PRODUCT_ASSET_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Construction Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__CONSTRUCTION_KIND = AssetsPackage.PRODUCT_ASSET_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Core Coils Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__CORE_COILS_WEIGHT = AssetsPackage.PRODUCT_ASSET_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Winding Insulation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__WINDING_INSULATION_KIND = AssetsPackage.PRODUCT_ASSET_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hour Over Load Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__HOUR_OVER_LOAD_RATING = AssetsPackage.PRODUCT_ASSET_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alt Primary Nom Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__ALT_PRIMARY_NOM_VOLTAGE = AssetsPackage.PRODUCT_ASSET_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Alt Secondary Nom Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__ALT_SECONDARY_NOM_VOLTAGE = AssetsPackage.PRODUCT_ASSET_MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reconfig Winding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__RECONFIG_WINDING = AssetsPackage.PRODUCT_ASSET_MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__FUNCTION = AssetsPackage.PRODUCT_ASSET_MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Oil Preservation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__OIL_PRESERVATION_KIND = AssetsPackage.PRODUCT_ASSET_MODEL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Day Over Load Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__DAY_OVER_LOAD_RATING = AssetsPackage.PRODUCT_ASSET_MODEL_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Core Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__CORE_KIND = AssetsPackage.PRODUCT_ASSET_MODEL_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Auto Transformer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__AUTO_TRANSFORMER = AssetsPackage.PRODUCT_ASSET_MODEL_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Solid Insulation Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__SOLID_INSULATION_WEIGHT = AssetsPackage.PRODUCT_ASSET_MODEL_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Transformer Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__TRANSFORMER_ASSETS = AssetsPackage.PRODUCT_ASSET_MODEL_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Transformer Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL__TRANSFORMER_INFO = AssetsPackage.PRODUCT_ASSET_MODEL_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Transformer Asset Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL_FEATURE_COUNT = AssetsPackage.PRODUCT_ASSET_MODEL_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Transformer Asset Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_ASSET_MODEL_OPERATION_COUNT = AssetsPackage.PRODUCT_ASSET_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem <em>Asset Model Catalogue Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem
	 * @see CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getAssetModelCatalogueItem()
	 * @generated
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Erp PO Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__ERP_PO_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Asset Model Catalogue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL_CATALOGUE = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Erp Quote Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__ERP_QUOTE_LINE_ITEMS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unit Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM__UNIT_COST = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Asset Model Catalogue Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Asset Model Catalogue Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ASSET_MODEL_CATALOGUE_ITEM_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssetModels.OilPreservationKind <em>Oil Preservation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssetModels.OilPreservationKind
	 * @see CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getOilPreservationKind()
	 * @generated
	 */
	public static final int OIL_PRESERVATION_KIND = 3;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerConstructionKind <em>Transformer Construction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerConstructionKind
	 * @see CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerConstructionKind()
	 * @generated
	 */
	public static final int TRANSFORMER_CONSTRUCTION_KIND = 4;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssetModels.WindingInsulationKind <em>Winding Insulation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssetModels.WindingInsulationKind
	 * @see CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getWindingInsulationKind()
	 * @generated
	 */
	public static final int WINDING_INSULATION_KIND = 5;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerCoreKind <em>Transformer Core Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerCoreKind
	 * @see CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerCoreKind()
	 * @generated
	 */
	public static final int TRANSFORMER_CORE_KIND = 6;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerFunctionKind <em>Transformer Function Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerFunctionKind
	 * @see CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerFunctionKind()
	 * @generated
	 */
	public static final int TRANSFORMER_FUNCTION_KIND = 7;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetModelCatalogueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformerAssetModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetModelCatalogueItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum oilPreservationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transformerConstructionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum windingInsulationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transformerCoreKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transformerFunctionKindEEnum = null;

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
	 * @see CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InfAssetModelsPackage() {
		super(eNS_URI, InfAssetModelsFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link InfAssetModelsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static InfAssetModelsPackage init() {
		if (isInited) return (InfAssetModelsPackage)EPackage.Registry.INSTANCE.getEPackage(InfAssetModelsPackage.eNS_URI);

		// Obtain or create and register package
		InfAssetModelsPackage theInfAssetModelsPackage = (InfAssetModelsPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InfAssetModelsPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InfAssetModelsPackage());

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
		theInfAssetModelsPackage.fixPackageContents();
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
		theInfAssetModelsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InfAssetModelsPackage.eNS_URI, theInfAssetModelsPackage);
		return theInfAssetModelsPackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogue <em>Asset Model Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Model Catalogue</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogue
	 * @generated
	 */
	public EClass getAssetModelCatalogue() {
		if (assetModelCatalogueEClass == null) {
			assetModelCatalogueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetModelsPackage.eNS_URI).getEClassifiers().get(1);
		}
		return assetModelCatalogueEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogue#getAssetModelCatalogueItems <em>Asset Model Catalogue Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Asset Model Catalogue Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogue#getAssetModelCatalogueItems()
	 * @see #getAssetModelCatalogue()
	 * @generated
	 */
	public EReference getAssetModelCatalogue_AssetModelCatalogueItems() {
        return (EReference)getAssetModelCatalogue().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogue#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogue#getStatus()
	 * @see #getAssetModelCatalogue()
	 * @generated
	 */
	public EReference getAssetModelCatalogue_Status() {
        return (EReference)getAssetModelCatalogue().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel <em>Transformer Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer Asset Model</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel
	 * @generated
	 */
	public EClass getTransformerAssetModel() {
		if (transformerAssetModelEClass == null) {
			transformerAssetModelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetModelsPackage.eNS_URI).getEClassifiers().get(2);
		}
		return transformerAssetModelEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getNeutralBIL <em>Neutral BIL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neutral BIL</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getNeutralBIL()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	public EAttribute getTransformerAssetModel_NeutralBIL() {
        return (EAttribute)getTransformerAssetModel().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getConstructionKind <em>Construction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Construction Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getConstructionKind()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	public EAttribute getTransformerAssetModel_ConstructionKind() {
        return (EAttribute)getTransformerAssetModel().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getCoreCoilsWeight <em>Core Coils Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Coils Weight</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getCoreCoilsWeight()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	public EAttribute getTransformerAssetModel_CoreCoilsWeight() {
        return (EAttribute)getTransformerAssetModel().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getWindingInsulationKind <em>Winding Insulation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Winding Insulation Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getWindingInsulationKind()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	public EAttribute getTransformerAssetModel_WindingInsulationKind() {
        return (EAttribute)getTransformerAssetModel().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getHourOverLoadRating <em>Hour Over Load Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour Over Load Rating</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getHourOverLoadRating()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	public EAttribute getTransformerAssetModel_HourOverLoadRating() {
        return (EAttribute)getTransformerAssetModel().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getAltPrimaryNomVoltage <em>Alt Primary Nom Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Primary Nom Voltage</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getAltPrimaryNomVoltage()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	public EAttribute getTransformerAssetModel_AltPrimaryNomVoltage() {
        return (EAttribute)getTransformerAssetModel().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getAltSecondaryNomVoltage <em>Alt Secondary Nom Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Secondary Nom Voltage</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getAltSecondaryNomVoltage()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	public EAttribute getTransformerAssetModel_AltSecondaryNomVoltage() {
        return (EAttribute)getTransformerAssetModel().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#isReconfigWinding <em>Reconfig Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reconfig Winding</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#isReconfigWinding()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	public EAttribute getTransformerAssetModel_ReconfigWinding() {
        return (EAttribute)getTransformerAssetModel().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getFunction()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	public EAttribute getTransformerAssetModel_Function() {
        return (EAttribute)getTransformerAssetModel().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getOilPreservationKind <em>Oil Preservation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oil Preservation Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getOilPreservationKind()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	public EAttribute getTransformerAssetModel_OilPreservationKind() {
        return (EAttribute)getTransformerAssetModel().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getDayOverLoadRating <em>Day Over Load Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Over Load Rating</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getDayOverLoadRating()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	public EAttribute getTransformerAssetModel_DayOverLoadRating() {
        return (EAttribute)getTransformerAssetModel().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getCoreKind <em>Core Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getCoreKind()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	public EAttribute getTransformerAssetModel_CoreKind() {
        return (EAttribute)getTransformerAssetModel().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#isAutoTransformer <em>Auto Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Transformer</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#isAutoTransformer()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	public EAttribute getTransformerAssetModel_AutoTransformer() {
        return (EAttribute)getTransformerAssetModel().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getSolidInsulationWeight <em>Solid Insulation Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solid Insulation Weight</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getSolidInsulationWeight()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	public EAttribute getTransformerAssetModel_SolidInsulationWeight() {
        return (EAttribute)getTransformerAssetModel().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getTransformerAssets <em>Transformer Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer Assets</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getTransformerAssets()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	public EReference getTransformerAssetModel_TransformerAssets() {
        return (EReference)getTransformerAssetModel().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getTransformerInfo <em>Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer Info</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getTransformerInfo()
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	public EReference getTransformerAssetModel_TransformerInfo() {
        return (EReference)getTransformerAssetModel().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem <em>Asset Model Catalogue Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Model Catalogue Item</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem
	 * @generated
	 */
	public EClass getAssetModelCatalogueItem() {
		if (assetModelCatalogueItemEClass == null) {
			assetModelCatalogueItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfAssetModelsPackage.eNS_URI).getEClassifiers().get(7);
		}
		return assetModelCatalogueItemEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getErpPOLineItems <em>Erp PO Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp PO Line Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getErpPOLineItems()
	 * @see #getAssetModelCatalogueItem()
	 * @generated
	 */
	public EReference getAssetModelCatalogueItem_ErpPOLineItems() {
        return (EReference)getAssetModelCatalogueItem().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getAssetModelCatalogue <em>Asset Model Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset Model Catalogue</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getAssetModelCatalogue()
	 * @see #getAssetModelCatalogueItem()
	 * @generated
	 */
	public EReference getAssetModelCatalogueItem_AssetModelCatalogue() {
        return (EReference)getAssetModelCatalogueItem().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getAssetModel <em>Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset Model</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getAssetModel()
	 * @see #getAssetModelCatalogueItem()
	 * @generated
	 */
	public EReference getAssetModelCatalogueItem_AssetModel() {
        return (EReference)getAssetModelCatalogueItem().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getErpQuoteLineItems <em>Erp Quote Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Erp Quote Line Items</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getErpQuoteLineItems()
	 * @see #getAssetModelCatalogueItem()
	 * @generated
	 */
	public EReference getAssetModelCatalogueItem_ErpQuoteLineItems() {
        return (EReference)getAssetModelCatalogueItem().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getUnitCost <em>Unit Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Cost</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getUnitCost()
	 * @see #getAssetModelCatalogueItem()
	 * @generated
	 */
	public EAttribute getAssetModelCatalogueItem_UnitCost() {
        return (EAttribute)getAssetModelCatalogueItem().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssetModels.OilPreservationKind <em>Oil Preservation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Oil Preservation Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.OilPreservationKind
	 * @generated
	 */
	public EEnum getOilPreservationKind() {
		if (oilPreservationKindEEnum == null) {
			oilPreservationKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetModelsPackage.eNS_URI).getEClassifiers().get(0);
		}
		return oilPreservationKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerConstructionKind <em>Transformer Construction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transformer Construction Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerConstructionKind
	 * @generated
	 */
	public EEnum getTransformerConstructionKind() {
		if (transformerConstructionKindEEnum == null) {
			transformerConstructionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetModelsPackage.eNS_URI).getEClassifiers().get(3);
		}
		return transformerConstructionKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssetModels.WindingInsulationKind <em>Winding Insulation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Winding Insulation Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.WindingInsulationKind
	 * @generated
	 */
	public EEnum getWindingInsulationKind() {
		if (windingInsulationKindEEnum == null) {
			windingInsulationKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetModelsPackage.eNS_URI).getEClassifiers().get(4);
		}
		return windingInsulationKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerCoreKind <em>Transformer Core Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transformer Core Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerCoreKind
	 * @generated
	 */
	public EEnum getTransformerCoreKind() {
		if (transformerCoreKindEEnum == null) {
			transformerCoreKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetModelsPackage.eNS_URI).getEClassifiers().get(5);
		}
		return transformerCoreKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerFunctionKind <em>Transformer Function Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transformer Function Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerFunctionKind
	 * @generated
	 */
	public EEnum getTransformerFunctionKind() {
		if (transformerFunctionKindEEnum == null) {
			transformerFunctionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfAssetModelsPackage.eNS_URI).getEClassifiers().get(6);
		}
		return transformerFunctionKindEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public InfAssetModelsFactory getInfAssetModelsFactory() {
		return (InfAssetModelsFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM15.IEC61970.Informative.InfAssetModels." + eClassifier.getName());
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
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogue <em>Asset Model Catalogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogue
		 * @see CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getAssetModelCatalogue()
		 * @generated
		 */
		public static final EClass ASSET_MODEL_CATALOGUE = eINSTANCE.getAssetModelCatalogue();

		/**
		 * The meta object literal for the '<em><b>Asset Model Catalogue Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET_MODEL_CATALOGUE__ASSET_MODEL_CATALOGUE_ITEMS = eINSTANCE.getAssetModelCatalogue_AssetModelCatalogueItems();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET_MODEL_CATALOGUE__STATUS = eINSTANCE.getAssetModelCatalogue_Status();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel <em>Transformer Asset Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel
		 * @see CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerAssetModel()
		 * @generated
		 */
		public static final EClass TRANSFORMER_ASSET_MODEL = eINSTANCE.getTransformerAssetModel();

		/**
		 * The meta object literal for the '<em><b>Neutral BIL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_ASSET_MODEL__NEUTRAL_BIL = eINSTANCE.getTransformerAssetModel_NeutralBIL();

		/**
		 * The meta object literal for the '<em><b>Construction Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_ASSET_MODEL__CONSTRUCTION_KIND = eINSTANCE.getTransformerAssetModel_ConstructionKind();

		/**
		 * The meta object literal for the '<em><b>Core Coils Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_ASSET_MODEL__CORE_COILS_WEIGHT = eINSTANCE.getTransformerAssetModel_CoreCoilsWeight();

		/**
		 * The meta object literal for the '<em><b>Winding Insulation Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_ASSET_MODEL__WINDING_INSULATION_KIND = eINSTANCE.getTransformerAssetModel_WindingInsulationKind();

		/**
		 * The meta object literal for the '<em><b>Hour Over Load Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_ASSET_MODEL__HOUR_OVER_LOAD_RATING = eINSTANCE.getTransformerAssetModel_HourOverLoadRating();

		/**
		 * The meta object literal for the '<em><b>Alt Primary Nom Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_ASSET_MODEL__ALT_PRIMARY_NOM_VOLTAGE = eINSTANCE.getTransformerAssetModel_AltPrimaryNomVoltage();

		/**
		 * The meta object literal for the '<em><b>Alt Secondary Nom Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_ASSET_MODEL__ALT_SECONDARY_NOM_VOLTAGE = eINSTANCE.getTransformerAssetModel_AltSecondaryNomVoltage();

		/**
		 * The meta object literal for the '<em><b>Reconfig Winding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_ASSET_MODEL__RECONFIG_WINDING = eINSTANCE.getTransformerAssetModel_ReconfigWinding();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_ASSET_MODEL__FUNCTION = eINSTANCE.getTransformerAssetModel_Function();

		/**
		 * The meta object literal for the '<em><b>Oil Preservation Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_ASSET_MODEL__OIL_PRESERVATION_KIND = eINSTANCE.getTransformerAssetModel_OilPreservationKind();

		/**
		 * The meta object literal for the '<em><b>Day Over Load Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_ASSET_MODEL__DAY_OVER_LOAD_RATING = eINSTANCE.getTransformerAssetModel_DayOverLoadRating();

		/**
		 * The meta object literal for the '<em><b>Core Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_ASSET_MODEL__CORE_KIND = eINSTANCE.getTransformerAssetModel_CoreKind();

		/**
		 * The meta object literal for the '<em><b>Auto Transformer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_ASSET_MODEL__AUTO_TRANSFORMER = eINSTANCE.getTransformerAssetModel_AutoTransformer();

		/**
		 * The meta object literal for the '<em><b>Solid Insulation Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_ASSET_MODEL__SOLID_INSULATION_WEIGHT = eINSTANCE.getTransformerAssetModel_SolidInsulationWeight();

		/**
		 * The meta object literal for the '<em><b>Transformer Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_ASSET_MODEL__TRANSFORMER_ASSETS = eINSTANCE.getTransformerAssetModel_TransformerAssets();

		/**
		 * The meta object literal for the '<em><b>Transformer Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_ASSET_MODEL__TRANSFORMER_INFO = eINSTANCE.getTransformerAssetModel_TransformerInfo();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem <em>Asset Model Catalogue Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem
		 * @see CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getAssetModelCatalogueItem()
		 * @generated
		 */
		public static final EClass ASSET_MODEL_CATALOGUE_ITEM = eINSTANCE.getAssetModelCatalogueItem();

		/**
		 * The meta object literal for the '<em><b>Erp PO Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET_MODEL_CATALOGUE_ITEM__ERP_PO_LINE_ITEMS = eINSTANCE.getAssetModelCatalogueItem_ErpPOLineItems();

		/**
		 * The meta object literal for the '<em><b>Asset Model Catalogue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL_CATALOGUE = eINSTANCE.getAssetModelCatalogueItem_AssetModelCatalogue();

		/**
		 * The meta object literal for the '<em><b>Asset Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET_MODEL_CATALOGUE_ITEM__ASSET_MODEL = eINSTANCE.getAssetModelCatalogueItem_AssetModel();

		/**
		 * The meta object literal for the '<em><b>Erp Quote Line Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ASSET_MODEL_CATALOGUE_ITEM__ERP_QUOTE_LINE_ITEMS = eINSTANCE.getAssetModelCatalogueItem_ErpQuoteLineItems();

		/**
		 * The meta object literal for the '<em><b>Unit Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ASSET_MODEL_CATALOGUE_ITEM__UNIT_COST = eINSTANCE.getAssetModelCatalogueItem_UnitCost();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfAssetModels.OilPreservationKind <em>Oil Preservation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfAssetModels.OilPreservationKind
		 * @see CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getOilPreservationKind()
		 * @generated
		 */
		public static final EEnum OIL_PRESERVATION_KIND = eINSTANCE.getOilPreservationKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerConstructionKind <em>Transformer Construction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerConstructionKind
		 * @see CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerConstructionKind()
		 * @generated
		 */
		public static final EEnum TRANSFORMER_CONSTRUCTION_KIND = eINSTANCE.getTransformerConstructionKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfAssetModels.WindingInsulationKind <em>Winding Insulation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfAssetModels.WindingInsulationKind
		 * @see CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getWindingInsulationKind()
		 * @generated
		 */
		public static final EEnum WINDING_INSULATION_KIND = eINSTANCE.getWindingInsulationKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerCoreKind <em>Transformer Core Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerCoreKind
		 * @see CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerCoreKind()
		 * @generated
		 */
		public static final EEnum TRANSFORMER_CORE_KIND = eINSTANCE.getTransformerCoreKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerFunctionKind <em>Transformer Function Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerFunctionKind
		 * @see CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getTransformerFunctionKind()
		 * @generated
		 */
		public static final EEnum TRANSFORMER_FUNCTION_KIND = eINSTANCE.getTransformerFunctionKind();

	}

} //InfAssetModelsPackage
