/**
 */
package CIM15.IEC61970.Informative.InfTypeAsset;

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
 * @see CIM15.IEC61970.Informative.InfTypeAsset.InfTypeAssetFactory
 * @generated
 */
public class InfTypeAssetPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "InfTypeAsset";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#InfTypeAsset";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimInfTypeAsset";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfTypeAssetPackage eINSTANCE = CIM15.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue <em>Type Asset Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getTypeAssetCatalogue()
	 * @generated
	 */
	public static final int TYPE_ASSET_CATALOGUE = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_ASSET_CATALOGUE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_ASSET_CATALOGUE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_ASSET_CATALOGUE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_ASSET_CATALOGUE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_ASSET_CATALOGUE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_ASSET_CATALOGUE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_ASSET_CATALOGUE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Type Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_ASSET_CATALOGUE__TYPE_ASSETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_ASSET_CATALOGUE__STATUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Asset Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_ASSET_CATALOGUE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type Asset Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_ASSET_CATALOGUE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset <em>Generator Type Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getGeneratorTypeAsset()
	 * @generated
	 */
	public static final int GENERATOR_TYPE_ASSET = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__UUID = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__NAMES = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__DIAGRAM_OBJECTS = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__MRID = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__ALIAS_NAME = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__NAME = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__MODELING_AUTHORITY_SET = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Asset Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__ASSET_INFO = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ASSET_INFO;

	/**
	 * The feature id for the '<em><b>Erp Inventory Counts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__ERP_INVENTORY_COUNTS = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_INVENTORY_COUNTS;

	/**
	 * The feature id for the '<em><b>Erp Req Line Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__ERP_REQ_LINE_ITEMS = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_REQ_LINE_ITEMS;

	/**
	 * The feature id for the '<em><b>Product Asset Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__PRODUCT_ASSET_MODELS = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__PRODUCT_ASSET_MODELS;

	/**
	 * The feature id for the '<em><b>Erp Inventory Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__ERP_INVENTORY_ISSUES = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_INVENTORY_ISSUES;

	/**
	 * The feature id for the '<em><b>CU Work Equipment Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__CU_WORK_EQUIPMENT_ASSET = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__CU_WORK_EQUIPMENT_ASSET;

	/**
	 * The feature id for the '<em><b>Estimated Unit Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__ESTIMATED_UNIT_COST = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ESTIMATED_UNIT_COST;

	/**
	 * The feature id for the '<em><b>Stock Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__STOCK_ITEM = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__STOCK_ITEM;

	/**
	 * The feature id for the '<em><b>Type Asset Catalogue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__TYPE_ASSET_CATALOGUE = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__TYPE_ASSET_CATALOGUE;

	/**
	 * The feature id for the '<em><b>CU Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__CU_ASSET = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__CU_ASSET;

	/**
	 * The feature id for the '<em><b>Erp Bom Item Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__ERP_BOM_ITEM_DATAS = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__ERP_BOM_ITEM_DATAS;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__QUANTITY = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__QUANTITY;

	/**
	 * The feature id for the '<em><b>XDirect Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__XDIRECT_SYNC = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RQuad Subtrans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__RQUAD_SUBTRANS = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>RDirect Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__RDIRECT_SYNC = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>RDirect Subtrans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__RDIRECT_SUBTRANS = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__MAX_Q = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>XQuad Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__XQUAD_SYNC = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__MIN_Q = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__MIN_P = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__MAX_P = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>RQuad Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__RQUAD_SYNC = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>XQuad Subtrans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__XQUAD_SUBTRANS = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>RDirect Trans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__RDIRECT_TRANS = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>RQuad Trans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__RQUAD_TRANS = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>XDirect Subtrans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__XDIRECT_SUBTRANS = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>XDirect Trans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__XDIRECT_TRANS = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>XQuad Trans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET__XQUAD_TRANS = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Generator Type Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET_FEATURE_COUNT = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Generator Type Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GENERATOR_TYPE_ASSET_OPERATION_COUNT = InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL_OPERATION_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeAssetCatalogueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorTypeAssetEClass = null;

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
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InfTypeAssetPackage() {
		super(eNS_URI, InfTypeAssetFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link InfTypeAssetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static InfTypeAssetPackage init() {
		if (isInited) return (InfTypeAssetPackage)EPackage.Registry.INSTANCE.getEPackage(InfTypeAssetPackage.eNS_URI);

		// Obtain or create and register package
		InfTypeAssetPackage theInfTypeAssetPackage = (InfTypeAssetPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InfTypeAssetPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InfTypeAssetPackage());

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
		theInfTypeAssetPackage.fixPackageContents();
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
		theInfTypeAssetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InfTypeAssetPackage.eNS_URI, theInfTypeAssetPackage);
		return theInfTypeAssetPackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue <em>Type Asset Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Asset Catalogue</em>'.
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue
	 * @generated
	 */
	public EClass getTypeAssetCatalogue() {
		if (typeAssetCatalogueEClass == null) {
			typeAssetCatalogueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfTypeAssetPackage.eNS_URI).getEClassifiers().get(0);
		}
		return typeAssetCatalogueEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue#getTypeAssets <em>Type Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type Assets</em>'.
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue#getTypeAssets()
	 * @see #getTypeAssetCatalogue()
	 * @generated
	 */
	public EReference getTypeAssetCatalogue_TypeAssets() {
        return (EReference)getTypeAssetCatalogue().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue#getStatus()
	 * @see #getTypeAssetCatalogue()
	 * @generated
	 */
	public EReference getTypeAssetCatalogue_Status() {
        return (EReference)getTypeAssetCatalogue().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset <em>Generator Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Type Asset</em>'.
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset
	 * @generated
	 */
	public EClass getGeneratorTypeAsset() {
		if (generatorTypeAssetEClass == null) {
			generatorTypeAssetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfTypeAssetPackage.eNS_URI).getEClassifiers().get(1);
		}
		return generatorTypeAssetEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXDirectSync <em>XDirect Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDirect Sync</em>'.
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXDirectSync()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	public EAttribute getGeneratorTypeAsset_XDirectSync() {
        return (EAttribute)getGeneratorTypeAsset().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRQuadSubtrans <em>RQuad Subtrans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RQuad Subtrans</em>'.
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRQuadSubtrans()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	public EAttribute getGeneratorTypeAsset_RQuadSubtrans() {
        return (EAttribute)getGeneratorTypeAsset().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRDirectSync <em>RDirect Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RDirect Sync</em>'.
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRDirectSync()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	public EAttribute getGeneratorTypeAsset_RDirectSync() {
        return (EAttribute)getGeneratorTypeAsset().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRDirectSubtrans <em>RDirect Subtrans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RDirect Subtrans</em>'.
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRDirectSubtrans()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	public EAttribute getGeneratorTypeAsset_RDirectSubtrans() {
        return (EAttribute)getGeneratorTypeAsset().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getMaxQ <em>Max Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Q</em>'.
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getMaxQ()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	public EAttribute getGeneratorTypeAsset_MaxQ() {
        return (EAttribute)getGeneratorTypeAsset().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXQuadSync <em>XQuad Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XQuad Sync</em>'.
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXQuadSync()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	public EAttribute getGeneratorTypeAsset_XQuadSync() {
        return (EAttribute)getGeneratorTypeAsset().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getMinQ <em>Min Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Q</em>'.
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getMinQ()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	public EAttribute getGeneratorTypeAsset_MinQ() {
        return (EAttribute)getGeneratorTypeAsset().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getMinP <em>Min P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min P</em>'.
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getMinP()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	public EAttribute getGeneratorTypeAsset_MinP() {
        return (EAttribute)getGeneratorTypeAsset().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getMaxP <em>Max P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max P</em>'.
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getMaxP()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	public EAttribute getGeneratorTypeAsset_MaxP() {
        return (EAttribute)getGeneratorTypeAsset().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRQuadSync <em>RQuad Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RQuad Sync</em>'.
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRQuadSync()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	public EAttribute getGeneratorTypeAsset_RQuadSync() {
        return (EAttribute)getGeneratorTypeAsset().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXQuadSubtrans <em>XQuad Subtrans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XQuad Subtrans</em>'.
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXQuadSubtrans()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	public EAttribute getGeneratorTypeAsset_XQuadSubtrans() {
        return (EAttribute)getGeneratorTypeAsset().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRDirectTrans <em>RDirect Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RDirect Trans</em>'.
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRDirectTrans()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	public EAttribute getGeneratorTypeAsset_RDirectTrans() {
        return (EAttribute)getGeneratorTypeAsset().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRQuadTrans <em>RQuad Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RQuad Trans</em>'.
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getRQuadTrans()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	public EAttribute getGeneratorTypeAsset_RQuadTrans() {
        return (EAttribute)getGeneratorTypeAsset().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXDirectSubtrans <em>XDirect Subtrans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDirect Subtrans</em>'.
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXDirectSubtrans()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	public EAttribute getGeneratorTypeAsset_XDirectSubtrans() {
        return (EAttribute)getGeneratorTypeAsset().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXDirectTrans <em>XDirect Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDirect Trans</em>'.
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXDirectTrans()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	public EAttribute getGeneratorTypeAsset_XDirectTrans() {
        return (EAttribute)getGeneratorTypeAsset().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXQuadTrans <em>XQuad Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XQuad Trans</em>'.
	 * @see CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset#getXQuadTrans()
	 * @see #getGeneratorTypeAsset()
	 * @generated
	 */
	public EAttribute getGeneratorTypeAsset_XQuadTrans() {
        return (EAttribute)getGeneratorTypeAsset().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public InfTypeAssetFactory getInfTypeAssetFactory() {
		return (InfTypeAssetFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM15.IEC61970.Informative.InfTypeAsset." + eClassifier.getName());
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
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue <em>Type Asset Catalogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfTypeAsset.TypeAssetCatalogue
		 * @see CIM15.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getTypeAssetCatalogue()
		 * @generated
		 */
		public static final EClass TYPE_ASSET_CATALOGUE = eINSTANCE.getTypeAssetCatalogue();

		/**
		 * The meta object literal for the '<em><b>Type Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TYPE_ASSET_CATALOGUE__TYPE_ASSETS = eINSTANCE.getTypeAssetCatalogue_TypeAssets();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TYPE_ASSET_CATALOGUE__STATUS = eINSTANCE.getTypeAssetCatalogue_Status();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset <em>Generator Type Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfTypeAsset.GeneratorTypeAsset
		 * @see CIM15.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getGeneratorTypeAsset()
		 * @generated
		 */
		public static final EClass GENERATOR_TYPE_ASSET = eINSTANCE.getGeneratorTypeAsset();

		/**
		 * The meta object literal for the '<em><b>XDirect Sync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATOR_TYPE_ASSET__XDIRECT_SYNC = eINSTANCE.getGeneratorTypeAsset_XDirectSync();

		/**
		 * The meta object literal for the '<em><b>RQuad Subtrans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATOR_TYPE_ASSET__RQUAD_SUBTRANS = eINSTANCE.getGeneratorTypeAsset_RQuadSubtrans();

		/**
		 * The meta object literal for the '<em><b>RDirect Sync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATOR_TYPE_ASSET__RDIRECT_SYNC = eINSTANCE.getGeneratorTypeAsset_RDirectSync();

		/**
		 * The meta object literal for the '<em><b>RDirect Subtrans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATOR_TYPE_ASSET__RDIRECT_SUBTRANS = eINSTANCE.getGeneratorTypeAsset_RDirectSubtrans();

		/**
		 * The meta object literal for the '<em><b>Max Q</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATOR_TYPE_ASSET__MAX_Q = eINSTANCE.getGeneratorTypeAsset_MaxQ();

		/**
		 * The meta object literal for the '<em><b>XQuad Sync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATOR_TYPE_ASSET__XQUAD_SYNC = eINSTANCE.getGeneratorTypeAsset_XQuadSync();

		/**
		 * The meta object literal for the '<em><b>Min Q</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATOR_TYPE_ASSET__MIN_Q = eINSTANCE.getGeneratorTypeAsset_MinQ();

		/**
		 * The meta object literal for the '<em><b>Min P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATOR_TYPE_ASSET__MIN_P = eINSTANCE.getGeneratorTypeAsset_MinP();

		/**
		 * The meta object literal for the '<em><b>Max P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATOR_TYPE_ASSET__MAX_P = eINSTANCE.getGeneratorTypeAsset_MaxP();

		/**
		 * The meta object literal for the '<em><b>RQuad Sync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATOR_TYPE_ASSET__RQUAD_SYNC = eINSTANCE.getGeneratorTypeAsset_RQuadSync();

		/**
		 * The meta object literal for the '<em><b>XQuad Subtrans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATOR_TYPE_ASSET__XQUAD_SUBTRANS = eINSTANCE.getGeneratorTypeAsset_XQuadSubtrans();

		/**
		 * The meta object literal for the '<em><b>RDirect Trans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATOR_TYPE_ASSET__RDIRECT_TRANS = eINSTANCE.getGeneratorTypeAsset_RDirectTrans();

		/**
		 * The meta object literal for the '<em><b>RQuad Trans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATOR_TYPE_ASSET__RQUAD_TRANS = eINSTANCE.getGeneratorTypeAsset_RQuadTrans();

		/**
		 * The meta object literal for the '<em><b>XDirect Subtrans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATOR_TYPE_ASSET__XDIRECT_SUBTRANS = eINSTANCE.getGeneratorTypeAsset_XDirectSubtrans();

		/**
		 * The meta object literal for the '<em><b>XDirect Trans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATOR_TYPE_ASSET__XDIRECT_TRANS = eINSTANCE.getGeneratorTypeAsset_XDirectTrans();

		/**
		 * The meta object literal for the '<em><b>XQuad Trans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GENERATOR_TYPE_ASSET__XQUAD_TRANS = eINSTANCE.getGeneratorTypeAsset_XQuadTrans();

	}

} //InfTypeAssetPackage
