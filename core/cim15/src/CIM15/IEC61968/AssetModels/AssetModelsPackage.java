/**
 */
package CIM15.IEC61968.AssetModels;

import CIM15.CIM15Package;

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
 * @see CIM15.IEC61968.AssetModels.AssetModelsFactory
 * @generated
 */
public class AssetModelsPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "AssetModels";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#AssetModels";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimAssetModels";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AssetModelsPackage eINSTANCE = CIM15.IEC61968.AssetModels.AssetModelsPackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.AssetModels.TransformerTest <em>Transformer Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.AssetModels.TransformerTest
	 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getTransformerTest()
	 * @generated
	 */
	public static final int TRANSFORMER_TEST = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TEST__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TEST__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TEST__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TEST__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TEST__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TEST__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TEST__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Base Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TEST__BASE_POWER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TEST__TEMPERATURE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transformer Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TEST_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transformer Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TEST_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest <em>Short Circuit Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.AssetModels.ShortCircuitTest
	 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getShortCircuitTest()
	 * @generated
	 */
	public static final int SHORT_CIRCUIT_TEST = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_CIRCUIT_TEST__UUID = TRANSFORMER_TEST__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_CIRCUIT_TEST__NAMES = TRANSFORMER_TEST__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_CIRCUIT_TEST__DIAGRAM_OBJECTS = TRANSFORMER_TEST__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_CIRCUIT_TEST__MRID = TRANSFORMER_TEST__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_CIRCUIT_TEST__ALIAS_NAME = TRANSFORMER_TEST__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_CIRCUIT_TEST__NAME = TRANSFORMER_TEST__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_CIRCUIT_TEST__MODELING_AUTHORITY_SET = TRANSFORMER_TEST__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Base Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_CIRCUIT_TEST__BASE_POWER = TRANSFORMER_TEST__BASE_POWER;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_CIRCUIT_TEST__TEMPERATURE = TRANSFORMER_TEST__TEMPERATURE;

	/**
	 * The feature id for the '<em><b>Grounded Ends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_CIRCUIT_TEST__GROUNDED_ENDS = TRANSFORMER_TEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loss Zero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_CIRCUIT_TEST__LOSS_ZERO = TRANSFORMER_TEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Leakage Impedance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE = TRANSFORMER_TEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_CIRCUIT_TEST__LOSS = TRANSFORMER_TEST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Grounded End Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_CIRCUIT_TEST__GROUNDED_END_STEP = TRANSFORMER_TEST_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Leakage Impedance Zero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE_ZERO = TRANSFORMER_TEST_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Energised End Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_CIRCUIT_TEST__ENERGISED_END_STEP = TRANSFORMER_TEST_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Energised End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_CIRCUIT_TEST__ENERGISED_END = TRANSFORMER_TEST_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Short Circuit Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_CIRCUIT_TEST_FEATURE_COUNT = TRANSFORMER_TEST_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Short Circuit Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_CIRCUIT_TEST_OPERATION_COUNT = TRANSFORMER_TEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.AssetModels.EndDeviceInfo <em>End Device Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.AssetModels.EndDeviceInfo
	 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getEndDeviceInfo()
	 * @generated
	 */
	public static final int END_DEVICE_INFO = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_INFO__UUID = AssetsPackage.ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_INFO__NAMES = AssetsPackage.ASSET_INFO__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_INFO__DIAGRAM_OBJECTS = AssetsPackage.ASSET_INFO__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_INFO__MRID = AssetsPackage.ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_INFO__ALIAS_NAME = AssetsPackage.ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_INFO__NAME = AssetsPackage.ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_INFO__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_INFO__ASSETS = AssetsPackage.ASSET_INFO__ASSETS;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_INFO__DIMENSIONS_INFO = AssetsPackage.ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_INFO__ASSET_MODEL = AssetsPackage.ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_INFO__PHASE_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_INFO__RATED_CURRENT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_INFO__RATED_VOLTAGE = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Devices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_INFO__END_DEVICES = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>End Device Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_INFO_FEATURE_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>End Device Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int END_DEVICE_INFO_OPERATION_COUNT = AssetsPackage.ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.AssetModels.WireType <em>Wire Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.AssetModels.WireType
	 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getWireType()
	 * @generated
	 */
	public static final int WIRE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_TYPE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_TYPE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_TYPE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_TYPE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_TYPE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_TYPE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_TYPE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Core Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_TYPE__CORE_RADIUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RAC50</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_TYPE__RAC50 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wire Arrangements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_TYPE__WIRE_ARRANGEMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Core Strand Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_TYPE__CORE_STRAND_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_TYPE__RADIUS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_TYPE__MATERIAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>RDC20</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_TYPE__RDC20 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Size Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_TYPE__SIZE_DESCRIPTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>RAC75</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_TYPE__RAC75 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Gmr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_TYPE__GMR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Concentric Neutral Cable Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_TYPE__CONCENTRIC_NEUTRAL_CABLE_INFOS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_TYPE__RATED_CURRENT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Strand Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_TYPE__STRAND_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>RAC25</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_TYPE__RAC25 = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Wire Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_TYPE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Wire Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_TYPE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.AssetModels.ConductorInfo <em>Conductor Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.AssetModels.ConductorInfo
	 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getConductorInfo()
	 * @generated
	 */
	public static final int CONDUCTOR_INFO = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_INFO__UUID = AssetsPackage.ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_INFO__NAMES = AssetsPackage.ASSET_INFO__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_INFO__DIAGRAM_OBJECTS = AssetsPackage.ASSET_INFO__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_INFO__MRID = AssetsPackage.ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_INFO__ALIAS_NAME = AssetsPackage.ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_INFO__NAME = AssetsPackage.ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_INFO__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_INFO__ASSETS = AssetsPackage.ASSET_INFO__ASSETS;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_INFO__DIMENSIONS_INFO = AssetsPackage.ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_INFO__ASSET_MODEL = AssetsPackage.ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Wire Arrangements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_INFO__WIRE_ARRANGEMENTS = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Insulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_INFO__INSULATED = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_INFO__USAGE = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Insulation Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_INFO__INSULATION_MATERIAL = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_INFO__PHASE_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Line Segments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_INFO__LINE_SEGMENTS = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Insulation Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_INFO__INSULATION_THICKNESS = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Conductor Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_INFO_FEATURE_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Conductor Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONDUCTOR_INFO_OPERATION_COUNT = AssetsPackage.ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.AssetModels.CableInfo <em>Cable Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.AssetModels.CableInfo
	 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getCableInfo()
	 * @generated
	 */
	public static final int CABLE_INFO = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__UUID = CONDUCTOR_INFO__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__NAMES = CONDUCTOR_INFO__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__DIAGRAM_OBJECTS = CONDUCTOR_INFO__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__MRID = CONDUCTOR_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__ALIAS_NAME = CONDUCTOR_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__NAME = CONDUCTOR_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__MODELING_AUTHORITY_SET = CONDUCTOR_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__ASSETS = CONDUCTOR_INFO__ASSETS;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__DIMENSIONS_INFO = CONDUCTOR_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__ASSET_MODEL = CONDUCTOR_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Wire Arrangements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__WIRE_ARRANGEMENTS = CONDUCTOR_INFO__WIRE_ARRANGEMENTS;

	/**
	 * The feature id for the '<em><b>Insulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__INSULATED = CONDUCTOR_INFO__INSULATED;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__USAGE = CONDUCTOR_INFO__USAGE;

	/**
	 * The feature id for the '<em><b>Insulation Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__INSULATION_MATERIAL = CONDUCTOR_INFO__INSULATION_MATERIAL;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__PHASE_COUNT = CONDUCTOR_INFO__PHASE_COUNT;

	/**
	 * The feature id for the '<em><b>Line Segments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__LINE_SEGMENTS = CONDUCTOR_INFO__LINE_SEGMENTS;

	/**
	 * The feature id for the '<em><b>Insulation Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__INSULATION_THICKNESS = CONDUCTOR_INFO__INSULATION_THICKNESS;

	/**
	 * The feature id for the '<em><b>Outer Jacket Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__OUTER_JACKET_KIND = CONDUCTOR_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sheath As Neutral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__SHEATH_AS_NEUTRAL = CONDUCTOR_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Strand Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__IS_STRAND_FILL = CONDUCTOR_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nominal Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__NOMINAL_TEMPERATURE = CONDUCTOR_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Construction Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__CONSTRUCTION_KIND = CONDUCTOR_INFO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Diameter Over Jacket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__DIAMETER_OVER_JACKET = CONDUCTOR_INFO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Diameter Over Insulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__DIAMETER_OVER_INSULATION = CONDUCTOR_INFO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Diameter Over Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__DIAMETER_OVER_SCREEN = CONDUCTOR_INFO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Duct Bank Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__DUCT_BANK_INFO = CONDUCTOR_INFO_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Shield Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__SHIELD_MATERIAL = CONDUCTOR_INFO_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Diameter Over Core</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO__DIAMETER_OVER_CORE = CONDUCTOR_INFO_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Cable Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO_FEATURE_COUNT = CONDUCTOR_INFO_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Cable Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_INFO_OPERATION_COUNT = CONDUCTOR_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.AssetModels.TapeShieldCableInfo <em>Tape Shield Cable Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.AssetModels.TapeShieldCableInfo
	 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getTapeShieldCableInfo()
	 * @generated
	 */
	public static final int TAPE_SHIELD_CABLE_INFO = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__UUID = CABLE_INFO__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__NAMES = CABLE_INFO__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__DIAGRAM_OBJECTS = CABLE_INFO__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__MRID = CABLE_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__ALIAS_NAME = CABLE_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__NAME = CABLE_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__MODELING_AUTHORITY_SET = CABLE_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__ASSETS = CABLE_INFO__ASSETS;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__DIMENSIONS_INFO = CABLE_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__ASSET_MODEL = CABLE_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Wire Arrangements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__WIRE_ARRANGEMENTS = CABLE_INFO__WIRE_ARRANGEMENTS;

	/**
	 * The feature id for the '<em><b>Insulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__INSULATED = CABLE_INFO__INSULATED;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__USAGE = CABLE_INFO__USAGE;

	/**
	 * The feature id for the '<em><b>Insulation Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__INSULATION_MATERIAL = CABLE_INFO__INSULATION_MATERIAL;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__PHASE_COUNT = CABLE_INFO__PHASE_COUNT;

	/**
	 * The feature id for the '<em><b>Line Segments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__LINE_SEGMENTS = CABLE_INFO__LINE_SEGMENTS;

	/**
	 * The feature id for the '<em><b>Insulation Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__INSULATION_THICKNESS = CABLE_INFO__INSULATION_THICKNESS;

	/**
	 * The feature id for the '<em><b>Outer Jacket Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__OUTER_JACKET_KIND = CABLE_INFO__OUTER_JACKET_KIND;

	/**
	 * The feature id for the '<em><b>Sheath As Neutral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__SHEATH_AS_NEUTRAL = CABLE_INFO__SHEATH_AS_NEUTRAL;

	/**
	 * The feature id for the '<em><b>Is Strand Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__IS_STRAND_FILL = CABLE_INFO__IS_STRAND_FILL;

	/**
	 * The feature id for the '<em><b>Nominal Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__NOMINAL_TEMPERATURE = CABLE_INFO__NOMINAL_TEMPERATURE;

	/**
	 * The feature id for the '<em><b>Construction Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__CONSTRUCTION_KIND = CABLE_INFO__CONSTRUCTION_KIND;

	/**
	 * The feature id for the '<em><b>Diameter Over Jacket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__DIAMETER_OVER_JACKET = CABLE_INFO__DIAMETER_OVER_JACKET;

	/**
	 * The feature id for the '<em><b>Diameter Over Insulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__DIAMETER_OVER_INSULATION = CABLE_INFO__DIAMETER_OVER_INSULATION;

	/**
	 * The feature id for the '<em><b>Diameter Over Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__DIAMETER_OVER_SCREEN = CABLE_INFO__DIAMETER_OVER_SCREEN;

	/**
	 * The feature id for the '<em><b>Duct Bank Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__DUCT_BANK_INFO = CABLE_INFO__DUCT_BANK_INFO;

	/**
	 * The feature id for the '<em><b>Shield Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__SHIELD_MATERIAL = CABLE_INFO__SHIELD_MATERIAL;

	/**
	 * The feature id for the '<em><b>Diameter Over Core</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__DIAMETER_OVER_CORE = CABLE_INFO__DIAMETER_OVER_CORE;

	/**
	 * The feature id for the '<em><b>Tape Lap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__TAPE_LAP = CABLE_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tape Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO__TAPE_THICKNESS = CABLE_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tape Shield Cable Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO_FEATURE_COUNT = CABLE_INFO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tape Shield Cable Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAPE_SHIELD_CABLE_INFO_OPERATION_COUNT = CABLE_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo <em>Tap Changer Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.AssetModels.TapChangerInfo
	 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getTapChangerInfo()
	 * @generated
	 */
	public static final int TAP_CHANGER_INFO = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__UUID = AssetsPackage.ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__NAMES = AssetsPackage.ASSET_INFO__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__DIAGRAM_OBJECTS = AssetsPackage.ASSET_INFO__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__MRID = AssetsPackage.ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__ALIAS_NAME = AssetsPackage.ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__NAME = AssetsPackage.ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__ASSETS = AssetsPackage.ASSET_INFO__ASSETS;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__DIMENSIONS_INFO = AssetsPackage.ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__ASSET_MODEL = AssetsPackage.ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Ct Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__CT_RATING = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Step Phase Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__STEP_PHASE_INCREMENT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rated Apparent Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__RATED_APPARENT_POWER = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__FREQUENCY = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Neutral U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__NEUTRAL_U = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ct Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__CT_RATIO = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Step Voltage Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__STEP_VOLTAGE_INCREMENT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Tcul</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__IS_TCUL = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Neutral Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__NEUTRAL_STEP = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__RATED_CURRENT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Tap Changers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__TAP_CHANGERS = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Low Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__LOW_STEP = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__RATED_VOLTAGE = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>High Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__HIGH_STEP = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Pt Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__PT_RATIO = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Bil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO__BIL = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Tap Changer Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO_FEATURE_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Tap Changer Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TAP_CHANGER_INFO_OPERATION_COUNT = AssetsPackage.ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.AssetModels.TransformerTankInfo <em>Transformer Tank Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.AssetModels.TransformerTankInfo
	 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getTransformerTankInfo()
	 * @generated
	 */
	public static final int TRANSFORMER_TANK_INFO = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_INFO__UUID = AssetsPackage.ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_INFO__NAMES = AssetsPackage.ASSET_INFO__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_INFO__DIAGRAM_OBJECTS = AssetsPackage.ASSET_INFO__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_INFO__MRID = AssetsPackage.ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_INFO__ALIAS_NAME = AssetsPackage.ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_INFO__NAME = AssetsPackage.ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_INFO__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_INFO__ASSETS = AssetsPackage.ASSET_INFO__ASSETS;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_INFO__DIMENSIONS_INFO = AssetsPackage.ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_INFO__ASSET_MODEL = AssetsPackage.ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Transformer Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_INFO__TRANSFORMER_ASSETS = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformer End Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_INFO__TRANSFORMER_END_INFOS = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Power Transformer Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_INFO__POWER_TRANSFORMER_INFO = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformer Asset Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_INFO__TRANSFORMER_ASSET_MODELS = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transformer Tanks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_INFO__TRANSFORMER_TANKS = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transformer Tank Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_INFO_FEATURE_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Transformer Tank Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_TANK_INFO_OPERATION_COUNT = AssetsPackage.ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.AssetModels.PowerTransformerInfo <em>Power Transformer Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.AssetModels.PowerTransformerInfo
	 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getPowerTransformerInfo()
	 * @generated
	 */
	public static final int POWER_TRANSFORMER_INFO = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_INFO__UUID = AssetsPackage.ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_INFO__NAMES = AssetsPackage.ASSET_INFO__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_INFO__DIAGRAM_OBJECTS = AssetsPackage.ASSET_INFO__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_INFO__MRID = AssetsPackage.ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_INFO__ALIAS_NAME = AssetsPackage.ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_INFO__NAME = AssetsPackage.ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_INFO__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_INFO__ASSETS = AssetsPackage.ASSET_INFO__ASSETS;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_INFO__DIMENSIONS_INFO = AssetsPackage.ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_INFO__ASSET_MODEL = AssetsPackage.ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Transformer Tank Info</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_INFO__TRANSFORMER_TANK_INFO = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Power Transformers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_INFO__POWER_TRANSFORMERS = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Power Transformer Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_INFO_FEATURE_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Power Transformer Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_TRANSFORMER_INFO_OPERATION_COUNT = AssetsPackage.ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest <em>Open Circuit Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.AssetModels.OpenCircuitTest
	 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getOpenCircuitTest()
	 * @generated
	 */
	public static final int OPEN_CIRCUIT_TEST = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_CIRCUIT_TEST__UUID = TRANSFORMER_TEST__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_CIRCUIT_TEST__NAMES = TRANSFORMER_TEST__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_CIRCUIT_TEST__DIAGRAM_OBJECTS = TRANSFORMER_TEST__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_CIRCUIT_TEST__MRID = TRANSFORMER_TEST__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_CIRCUIT_TEST__ALIAS_NAME = TRANSFORMER_TEST__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_CIRCUIT_TEST__NAME = TRANSFORMER_TEST__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_CIRCUIT_TEST__MODELING_AUTHORITY_SET = TRANSFORMER_TEST__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Base Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_CIRCUIT_TEST__BASE_POWER = TRANSFORMER_TEST__BASE_POWER;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_CIRCUIT_TEST__TEMPERATURE = TRANSFORMER_TEST__TEMPERATURE;

	/**
	 * The feature id for the '<em><b>Energised End Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_CIRCUIT_TEST__ENERGISED_END_STEP = TRANSFORMER_TEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Open End Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_CIRCUIT_TEST__OPEN_END_VOLTAGE = TRANSFORMER_TEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Open End Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_CIRCUIT_TEST__OPEN_END_STEP = TRANSFORMER_TEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Energised End Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_CIRCUIT_TEST__ENERGISED_END_VOLTAGE = TRANSFORMER_TEST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Phase Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_CIRCUIT_TEST__PHASE_SHIFT = TRANSFORMER_TEST_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Open End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_CIRCUIT_TEST__OPEN_END = TRANSFORMER_TEST_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Energised End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_CIRCUIT_TEST__ENERGISED_END = TRANSFORMER_TEST_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Open Circuit Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_CIRCUIT_TEST_FEATURE_COUNT = TRANSFORMER_TEST_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Open Circuit Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_CIRCUIT_TEST_OPERATION_COUNT = TRANSFORMER_TEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo <em>Transformer End Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo
	 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getTransformerEndInfo()
	 * @generated
	 */
	public static final int TRANSFORMER_END_INFO = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__UUID = AssetsPackage.ASSET_INFO__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__NAMES = AssetsPackage.ASSET_INFO__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__DIAGRAM_OBJECTS = AssetsPackage.ASSET_INFO__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__MRID = AssetsPackage.ASSET_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__ALIAS_NAME = AssetsPackage.ASSET_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__NAME = AssetsPackage.ASSET_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__MODELING_AUTHORITY_SET = AssetsPackage.ASSET_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__ASSETS = AssetsPackage.ASSET_INFO__ASSETS;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__DIMENSIONS_INFO = AssetsPackage.ASSET_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__ASSET_MODEL = AssetsPackage.ASSET_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>From Mesh Impedance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__FROM_MESH_IMPEDANCE = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Energised End No Load Test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__ENERGISED_END_NO_LOAD_TEST = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__R = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Open End Open Circuit Tests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__OPEN_END_OPEN_CIRCUIT_TESTS = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Insulation U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__INSULATION_U = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Emergency S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__EMERGENCY_S = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>To Mesh Impedance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__TO_MESH_IMPEDANCE = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Transformer End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__TRANSFORMER_END = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Transformer Tank Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__TRANSFORMER_TANK_INFO = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Energised End Open Circuit Tests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__ENERGISED_END_OPEN_CIRCUIT_TESTS = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Grounded End Short Circuit Tests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__GROUNDED_END_SHORT_CIRCUIT_TESTS = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Short Term S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__SHORT_TERM_S = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Energised End Short Circuit Tests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__ENERGISED_END_SHORT_CIRCUIT_TESTS = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Connection Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__CONNECTION_KIND = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Core Admittance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__CORE_ADMITTANCE = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>End Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__END_NUMBER = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Rated S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__RATED_S = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Rated U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__RATED_U = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Phase Angle Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO__PHASE_ANGLE_CLOCK = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Transformer End Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO_FEATURE_COUNT = AssetsPackage.ASSET_INFO_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Transformer End Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMER_END_INFO_OPERATION_COUNT = AssetsPackage.ASSET_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.AssetModels.NoLoadTest <em>No Load Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.AssetModels.NoLoadTest
	 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getNoLoadTest()
	 * @generated
	 */
	public static final int NO_LOAD_TEST = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NO_LOAD_TEST__UUID = TRANSFORMER_TEST__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NO_LOAD_TEST__NAMES = TRANSFORMER_TEST__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NO_LOAD_TEST__DIAGRAM_OBJECTS = TRANSFORMER_TEST__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NO_LOAD_TEST__MRID = TRANSFORMER_TEST__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NO_LOAD_TEST__ALIAS_NAME = TRANSFORMER_TEST__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NO_LOAD_TEST__NAME = TRANSFORMER_TEST__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NO_LOAD_TEST__MODELING_AUTHORITY_SET = TRANSFORMER_TEST__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Base Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NO_LOAD_TEST__BASE_POWER = TRANSFORMER_TEST__BASE_POWER;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NO_LOAD_TEST__TEMPERATURE = TRANSFORMER_TEST__TEMPERATURE;

	/**
	 * The feature id for the '<em><b>Exciting Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NO_LOAD_TEST__EXCITING_CURRENT = TRANSFORMER_TEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loss Zero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NO_LOAD_TEST__LOSS_ZERO = TRANSFORMER_TEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exciting Current Zero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NO_LOAD_TEST__EXCITING_CURRENT_ZERO = TRANSFORMER_TEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Energised End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NO_LOAD_TEST__ENERGISED_END = TRANSFORMER_TEST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Energised End Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NO_LOAD_TEST__ENERGISED_END_VOLTAGE = TRANSFORMER_TEST_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NO_LOAD_TEST__LOSS = TRANSFORMER_TEST_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>No Load Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NO_LOAD_TEST_FEATURE_COUNT = TRANSFORMER_TEST_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>No Load Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NO_LOAD_TEST_OPERATION_COUNT = TRANSFORMER_TEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.AssetModels.OverheadConductorInfo <em>Overhead Conductor Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.AssetModels.OverheadConductorInfo
	 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getOverheadConductorInfo()
	 * @generated
	 */
	public static final int OVERHEAD_CONDUCTOR_INFO = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_CONDUCTOR_INFO__UUID = CONDUCTOR_INFO__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_CONDUCTOR_INFO__NAMES = CONDUCTOR_INFO__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_CONDUCTOR_INFO__DIAGRAM_OBJECTS = CONDUCTOR_INFO__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_CONDUCTOR_INFO__MRID = CONDUCTOR_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_CONDUCTOR_INFO__ALIAS_NAME = CONDUCTOR_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_CONDUCTOR_INFO__NAME = CONDUCTOR_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_CONDUCTOR_INFO__MODELING_AUTHORITY_SET = CONDUCTOR_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_CONDUCTOR_INFO__ASSETS = CONDUCTOR_INFO__ASSETS;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_CONDUCTOR_INFO__DIMENSIONS_INFO = CONDUCTOR_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_CONDUCTOR_INFO__ASSET_MODEL = CONDUCTOR_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Wire Arrangements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_CONDUCTOR_INFO__WIRE_ARRANGEMENTS = CONDUCTOR_INFO__WIRE_ARRANGEMENTS;

	/**
	 * The feature id for the '<em><b>Insulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_CONDUCTOR_INFO__INSULATED = CONDUCTOR_INFO__INSULATED;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_CONDUCTOR_INFO__USAGE = CONDUCTOR_INFO__USAGE;

	/**
	 * The feature id for the '<em><b>Insulation Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_CONDUCTOR_INFO__INSULATION_MATERIAL = CONDUCTOR_INFO__INSULATION_MATERIAL;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_CONDUCTOR_INFO__PHASE_COUNT = CONDUCTOR_INFO__PHASE_COUNT;

	/**
	 * The feature id for the '<em><b>Line Segments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_CONDUCTOR_INFO__LINE_SEGMENTS = CONDUCTOR_INFO__LINE_SEGMENTS;

	/**
	 * The feature id for the '<em><b>Insulation Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_CONDUCTOR_INFO__INSULATION_THICKNESS = CONDUCTOR_INFO__INSULATION_THICKNESS;

	/**
	 * The feature id for the '<em><b>Mounting Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_CONDUCTOR_INFO__MOUNTING_POINT = CONDUCTOR_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Neutral Insulation Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_CONDUCTOR_INFO__NEUTRAL_INSULATION_THICKNESS = CONDUCTOR_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Phase Conductor Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_SPACING = CONDUCTOR_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Phase Conductor Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_COUNT = CONDUCTOR_INFO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Overhead Conductor Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_CONDUCTOR_INFO_FEATURE_COUNT = CONDUCTOR_INFO_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Overhead Conductor Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OVERHEAD_CONDUCTOR_INFO_OPERATION_COUNT = CONDUCTOR_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo <em>Concentric Neutral Cable Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo
	 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getConcentricNeutralCableInfo()
	 * @generated
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__UUID = CABLE_INFO__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__NAMES = CABLE_INFO__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__DIAGRAM_OBJECTS = CABLE_INFO__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__MRID = CABLE_INFO__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__ALIAS_NAME = CABLE_INFO__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__NAME = CABLE_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__MODELING_AUTHORITY_SET = CABLE_INFO__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__ASSETS = CABLE_INFO__ASSETS;

	/**
	 * The feature id for the '<em><b>Dimensions Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__DIMENSIONS_INFO = CABLE_INFO__DIMENSIONS_INFO;

	/**
	 * The feature id for the '<em><b>Asset Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__ASSET_MODEL = CABLE_INFO__ASSET_MODEL;

	/**
	 * The feature id for the '<em><b>Wire Arrangements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__WIRE_ARRANGEMENTS = CABLE_INFO__WIRE_ARRANGEMENTS;

	/**
	 * The feature id for the '<em><b>Insulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__INSULATED = CABLE_INFO__INSULATED;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__USAGE = CABLE_INFO__USAGE;

	/**
	 * The feature id for the '<em><b>Insulation Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__INSULATION_MATERIAL = CABLE_INFO__INSULATION_MATERIAL;

	/**
	 * The feature id for the '<em><b>Phase Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__PHASE_COUNT = CABLE_INFO__PHASE_COUNT;

	/**
	 * The feature id for the '<em><b>Line Segments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__LINE_SEGMENTS = CABLE_INFO__LINE_SEGMENTS;

	/**
	 * The feature id for the '<em><b>Insulation Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__INSULATION_THICKNESS = CABLE_INFO__INSULATION_THICKNESS;

	/**
	 * The feature id for the '<em><b>Outer Jacket Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__OUTER_JACKET_KIND = CABLE_INFO__OUTER_JACKET_KIND;

	/**
	 * The feature id for the '<em><b>Sheath As Neutral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__SHEATH_AS_NEUTRAL = CABLE_INFO__SHEATH_AS_NEUTRAL;

	/**
	 * The feature id for the '<em><b>Is Strand Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__IS_STRAND_FILL = CABLE_INFO__IS_STRAND_FILL;

	/**
	 * The feature id for the '<em><b>Nominal Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__NOMINAL_TEMPERATURE = CABLE_INFO__NOMINAL_TEMPERATURE;

	/**
	 * The feature id for the '<em><b>Construction Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__CONSTRUCTION_KIND = CABLE_INFO__CONSTRUCTION_KIND;

	/**
	 * The feature id for the '<em><b>Diameter Over Jacket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_JACKET = CABLE_INFO__DIAMETER_OVER_JACKET;

	/**
	 * The feature id for the '<em><b>Diameter Over Insulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_INSULATION = CABLE_INFO__DIAMETER_OVER_INSULATION;

	/**
	 * The feature id for the '<em><b>Diameter Over Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_SCREEN = CABLE_INFO__DIAMETER_OVER_SCREEN;

	/**
	 * The feature id for the '<em><b>Duct Bank Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__DUCT_BANK_INFO = CABLE_INFO__DUCT_BANK_INFO;

	/**
	 * The feature id for the '<em><b>Shield Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__SHIELD_MATERIAL = CABLE_INFO__SHIELD_MATERIAL;

	/**
	 * The feature id for the '<em><b>Diameter Over Core</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_CORE = CABLE_INFO__DIAMETER_OVER_CORE;

	/**
	 * The feature id for the '<em><b>Wire Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__WIRE_TYPE = CABLE_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Neutral Strand Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_COUNT = CABLE_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Diameter Over Neutral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_NEUTRAL = CABLE_INFO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Concentric Neutral Cable Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO_FEATURE_COUNT = CABLE_INFO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Concentric Neutral Cable Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRIC_NEUTRAL_CABLE_INFO_OPERATION_COUNT = CABLE_INFO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.AssetModels.WireArrangement <em>Wire Arrangement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.AssetModels.WireArrangement
	 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getWireArrangement()
	 * @generated
	 */
	public static final int WIRE_ARRANGEMENT = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_ARRANGEMENT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_ARRANGEMENT__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_ARRANGEMENT__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_ARRANGEMENT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_ARRANGEMENT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_ARRANGEMENT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_ARRANGEMENT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Conductor Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_ARRANGEMENT__CONDUCTOR_INFO = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mounting Point Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_ARRANGEMENT__MOUNTING_POINT_Y = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mounting Point X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_ARRANGEMENT__MOUNTING_POINT_X = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_ARRANGEMENT__POSITION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Wire Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_ARRANGEMENT__WIRE_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Wire Arrangement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_ARRANGEMENT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Wire Arrangement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WIRE_ARRANGEMENT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.AssetModels.CableOuterJacketKind <em>Cable Outer Jacket Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.AssetModels.CableOuterJacketKind
	 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getCableOuterJacketKind()
	 * @generated
	 */
	public static final int CABLE_OUTER_JACKET_KIND = 16;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.AssetModels.ConductorMaterialKind <em>Conductor Material Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.AssetModels.ConductorMaterialKind
	 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getConductorMaterialKind()
	 * @generated
	 */
	public static final int CONDUCTOR_MATERIAL_KIND = 17;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.AssetModels.ConductorUsageKind <em>Conductor Usage Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.AssetModels.ConductorUsageKind
	 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getConductorUsageKind()
	 * @generated
	 */
	public static final int CONDUCTOR_USAGE_KIND = 18;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.AssetModels.CableConstructionKind <em>Cable Construction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.AssetModels.CableConstructionKind
	 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getCableConstructionKind()
	 * @generated
	 */
	public static final int CABLE_CONSTRUCTION_KIND = 19;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.AssetModels.CableShieldMaterialKind <em>Cable Shield Material Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.AssetModels.CableShieldMaterialKind
	 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getCableShieldMaterialKind()
	 * @generated
	 */
	public static final int CABLE_SHIELD_MATERIAL_KIND = 20;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.AssetModels.ConductorInsulationKind <em>Conductor Insulation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.AssetModels.ConductorInsulationKind
	 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getConductorInsulationKind()
	 * @generated
	 */
	public static final int CONDUCTOR_INSULATION_KIND = 21;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortCircuitTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endDeviceInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wireTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tapeShieldCableInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conductorInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tapChangerInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformerTankInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerTransformerInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openCircuitTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cableInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformerEndInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noLoadTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overheadConductorInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concentricNeutralCableInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wireArrangementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformerTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cableOuterJacketKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conductorMaterialKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conductorUsageKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cableConstructionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cableShieldMaterialKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conductorInsulationKindEEnum = null;

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
	 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AssetModelsPackage() {
		super(eNS_URI, AssetModelsFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link AssetModelsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static AssetModelsPackage init() {
		if (isInited) return (AssetModelsPackage)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI);

		// Obtain or create and register package
		AssetModelsPackage theAssetModelsPackage = (AssetModelsPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AssetModelsPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AssetModelsPackage());

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
		theAssetModelsPackage.fixPackageContents();
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
		theMeteringPackage.fixPackageContents();
		thePaymentMeteringPackage.fixPackageContents();
		theAssetsPackage.fixPackageContents();
		theWorkPackage.fixPackageContents();
		theCustomersPackage.fixPackageContents();
		theLoadControlPackage.fixPackageContents();
		theIEC62325Package.fixPackageContents();
		thePackageDependenciesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theAssetModelsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AssetModelsPackage.eNS_URI, theAssetModelsPackage);
		return theAssetModelsPackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest <em>Short Circuit Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Circuit Test</em>'.
	 * @see CIM15.IEC61968.AssetModels.ShortCircuitTest
	 * @generated
	 */
	public EClass getShortCircuitTest() {
		if (shortCircuitTestEClass == null) {
			shortCircuitTestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(0);
		}
		return shortCircuitTestEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getGroundedEnds <em>Grounded Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grounded Ends</em>'.
	 * @see CIM15.IEC61968.AssetModels.ShortCircuitTest#getGroundedEnds()
	 * @see #getShortCircuitTest()
	 * @generated
	 */
	public EReference getShortCircuitTest_GroundedEnds() {
        return (EReference)getShortCircuitTest().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getLossZero <em>Loss Zero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loss Zero</em>'.
	 * @see CIM15.IEC61968.AssetModels.ShortCircuitTest#getLossZero()
	 * @see #getShortCircuitTest()
	 * @generated
	 */
	public EAttribute getShortCircuitTest_LossZero() {
        return (EAttribute)getShortCircuitTest().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getLeakageImpedance <em>Leakage Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leakage Impedance</em>'.
	 * @see CIM15.IEC61968.AssetModels.ShortCircuitTest#getLeakageImpedance()
	 * @see #getShortCircuitTest()
	 * @generated
	 */
	public EAttribute getShortCircuitTest_LeakageImpedance() {
        return (EAttribute)getShortCircuitTest().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getLoss <em>Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loss</em>'.
	 * @see CIM15.IEC61968.AssetModels.ShortCircuitTest#getLoss()
	 * @see #getShortCircuitTest()
	 * @generated
	 */
	public EAttribute getShortCircuitTest_Loss() {
        return (EAttribute)getShortCircuitTest().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getGroundedEndStep <em>Grounded End Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grounded End Step</em>'.
	 * @see CIM15.IEC61968.AssetModels.ShortCircuitTest#getGroundedEndStep()
	 * @see #getShortCircuitTest()
	 * @generated
	 */
	public EAttribute getShortCircuitTest_GroundedEndStep() {
        return (EAttribute)getShortCircuitTest().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getLeakageImpedanceZero <em>Leakage Impedance Zero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leakage Impedance Zero</em>'.
	 * @see CIM15.IEC61968.AssetModels.ShortCircuitTest#getLeakageImpedanceZero()
	 * @see #getShortCircuitTest()
	 * @generated
	 */
	public EAttribute getShortCircuitTest_LeakageImpedanceZero() {
        return (EAttribute)getShortCircuitTest().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getEnergisedEndStep <em>Energised End Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energised End Step</em>'.
	 * @see CIM15.IEC61968.AssetModels.ShortCircuitTest#getEnergisedEndStep()
	 * @see #getShortCircuitTest()
	 * @generated
	 */
	public EAttribute getShortCircuitTest_EnergisedEndStep() {
        return (EAttribute)getShortCircuitTest().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest#getEnergisedEnd <em>Energised End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Energised End</em>'.
	 * @see CIM15.IEC61968.AssetModels.ShortCircuitTest#getEnergisedEnd()
	 * @see #getShortCircuitTest()
	 * @generated
	 */
	public EReference getShortCircuitTest_EnergisedEnd() {
        return (EReference)getShortCircuitTest().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.AssetModels.EndDeviceInfo <em>End Device Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Device Info</em>'.
	 * @see CIM15.IEC61968.AssetModels.EndDeviceInfo
	 * @generated
	 */
	public EClass getEndDeviceInfo() {
		if (endDeviceInfoEClass == null) {
			endDeviceInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(1);
		}
		return endDeviceInfoEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.EndDeviceInfo#getPhaseCount <em>Phase Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Count</em>'.
	 * @see CIM15.IEC61968.AssetModels.EndDeviceInfo#getPhaseCount()
	 * @see #getEndDeviceInfo()
	 * @generated
	 */
	public EAttribute getEndDeviceInfo_PhaseCount() {
        return (EAttribute)getEndDeviceInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.EndDeviceInfo#getRatedCurrent <em>Rated Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Current</em>'.
	 * @see CIM15.IEC61968.AssetModels.EndDeviceInfo#getRatedCurrent()
	 * @see #getEndDeviceInfo()
	 * @generated
	 */
	public EAttribute getEndDeviceInfo_RatedCurrent() {
        return (EAttribute)getEndDeviceInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.EndDeviceInfo#getRatedVoltage <em>Rated Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Voltage</em>'.
	 * @see CIM15.IEC61968.AssetModels.EndDeviceInfo#getRatedVoltage()
	 * @see #getEndDeviceInfo()
	 * @generated
	 */
	public EAttribute getEndDeviceInfo_RatedVoltage() {
        return (EAttribute)getEndDeviceInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.AssetModels.EndDeviceInfo#getEndDevices <em>End Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Devices</em>'.
	 * @see CIM15.IEC61968.AssetModels.EndDeviceInfo#getEndDevices()
	 * @see #getEndDeviceInfo()
	 * @generated
	 */
	public EReference getEndDeviceInfo_EndDevices() {
        return (EReference)getEndDeviceInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.AssetModels.WireType <em>Wire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire Type</em>'.
	 * @see CIM15.IEC61968.AssetModels.WireType
	 * @generated
	 */
	public EClass getWireType() {
		if (wireTypeEClass == null) {
			wireTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(2);
		}
		return wireTypeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.WireType#getCoreRadius <em>Core Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Radius</em>'.
	 * @see CIM15.IEC61968.AssetModels.WireType#getCoreRadius()
	 * @see #getWireType()
	 * @generated
	 */
	public EAttribute getWireType_CoreRadius() {
        return (EAttribute)getWireType().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.WireType#getRAC50 <em>RAC50</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RAC50</em>'.
	 * @see CIM15.IEC61968.AssetModels.WireType#getRAC50()
	 * @see #getWireType()
	 * @generated
	 */
	public EAttribute getWireType_RAC50() {
        return (EAttribute)getWireType().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.AssetModels.WireType#getWireArrangements <em>Wire Arrangements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Wire Arrangements</em>'.
	 * @see CIM15.IEC61968.AssetModels.WireType#getWireArrangements()
	 * @see #getWireType()
	 * @generated
	 */
	public EReference getWireType_WireArrangements() {
        return (EReference)getWireType().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.WireType#getCoreStrandCount <em>Core Strand Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Strand Count</em>'.
	 * @see CIM15.IEC61968.AssetModels.WireType#getCoreStrandCount()
	 * @see #getWireType()
	 * @generated
	 */
	public EAttribute getWireType_CoreStrandCount() {
        return (EAttribute)getWireType().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.WireType#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see CIM15.IEC61968.AssetModels.WireType#getRadius()
	 * @see #getWireType()
	 * @generated
	 */
	public EAttribute getWireType_Radius() {
        return (EAttribute)getWireType().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.WireType#getMaterial <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Material</em>'.
	 * @see CIM15.IEC61968.AssetModels.WireType#getMaterial()
	 * @see #getWireType()
	 * @generated
	 */
	public EAttribute getWireType_Material() {
        return (EAttribute)getWireType().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.WireType#getRDC20 <em>RDC20</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RDC20</em>'.
	 * @see CIM15.IEC61968.AssetModels.WireType#getRDC20()
	 * @see #getWireType()
	 * @generated
	 */
	public EAttribute getWireType_RDC20() {
        return (EAttribute)getWireType().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.WireType#getSizeDescription <em>Size Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Description</em>'.
	 * @see CIM15.IEC61968.AssetModels.WireType#getSizeDescription()
	 * @see #getWireType()
	 * @generated
	 */
	public EAttribute getWireType_SizeDescription() {
        return (EAttribute)getWireType().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.WireType#getRAC75 <em>RAC75</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RAC75</em>'.
	 * @see CIM15.IEC61968.AssetModels.WireType#getRAC75()
	 * @see #getWireType()
	 * @generated
	 */
	public EAttribute getWireType_RAC75() {
        return (EAttribute)getWireType().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.WireType#getGmr <em>Gmr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gmr</em>'.
	 * @see CIM15.IEC61968.AssetModels.WireType#getGmr()
	 * @see #getWireType()
	 * @generated
	 */
	public EAttribute getWireType_Gmr() {
        return (EAttribute)getWireType().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.AssetModels.WireType#getConcentricNeutralCableInfos <em>Concentric Neutral Cable Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concentric Neutral Cable Infos</em>'.
	 * @see CIM15.IEC61968.AssetModels.WireType#getConcentricNeutralCableInfos()
	 * @see #getWireType()
	 * @generated
	 */
	public EReference getWireType_ConcentricNeutralCableInfos() {
        return (EReference)getWireType().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.WireType#getRatedCurrent <em>Rated Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Current</em>'.
	 * @see CIM15.IEC61968.AssetModels.WireType#getRatedCurrent()
	 * @see #getWireType()
	 * @generated
	 */
	public EAttribute getWireType_RatedCurrent() {
        return (EAttribute)getWireType().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.WireType#getStrandCount <em>Strand Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strand Count</em>'.
	 * @see CIM15.IEC61968.AssetModels.WireType#getStrandCount()
	 * @see #getWireType()
	 * @generated
	 */
	public EAttribute getWireType_StrandCount() {
        return (EAttribute)getWireType().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.WireType#getRAC25 <em>RAC25</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RAC25</em>'.
	 * @see CIM15.IEC61968.AssetModels.WireType#getRAC25()
	 * @see #getWireType()
	 * @generated
	 */
	public EAttribute getWireType_RAC25() {
        return (EAttribute)getWireType().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.AssetModels.TapeShieldCableInfo <em>Tape Shield Cable Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tape Shield Cable Info</em>'.
	 * @see CIM15.IEC61968.AssetModels.TapeShieldCableInfo
	 * @generated
	 */
	public EClass getTapeShieldCableInfo() {
		if (tapeShieldCableInfoEClass == null) {
			tapeShieldCableInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(3);
		}
		return tapeShieldCableInfoEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TapeShieldCableInfo#getTapeLap <em>Tape Lap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tape Lap</em>'.
	 * @see CIM15.IEC61968.AssetModels.TapeShieldCableInfo#getTapeLap()
	 * @see #getTapeShieldCableInfo()
	 * @generated
	 */
	public EAttribute getTapeShieldCableInfo_TapeLap() {
        return (EAttribute)getTapeShieldCableInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TapeShieldCableInfo#getTapeThickness <em>Tape Thickness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tape Thickness</em>'.
	 * @see CIM15.IEC61968.AssetModels.TapeShieldCableInfo#getTapeThickness()
	 * @see #getTapeShieldCableInfo()
	 * @generated
	 */
	public EAttribute getTapeShieldCableInfo_TapeThickness() {
        return (EAttribute)getTapeShieldCableInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.AssetModels.ConductorInfo <em>Conductor Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conductor Info</em>'.
	 * @see CIM15.IEC61968.AssetModels.ConductorInfo
	 * @generated
	 */
	public EClass getConductorInfo() {
		if (conductorInfoEClass == null) {
			conductorInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(4);
		}
		return conductorInfoEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.AssetModels.ConductorInfo#getWireArrangements <em>Wire Arrangements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Wire Arrangements</em>'.
	 * @see CIM15.IEC61968.AssetModels.ConductorInfo#getWireArrangements()
	 * @see #getConductorInfo()
	 * @generated
	 */
	public EReference getConductorInfo_WireArrangements() {
        return (EReference)getConductorInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.ConductorInfo#isInsulated <em>Insulated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insulated</em>'.
	 * @see CIM15.IEC61968.AssetModels.ConductorInfo#isInsulated()
	 * @see #getConductorInfo()
	 * @generated
	 */
	public EAttribute getConductorInfo_Insulated() {
        return (EAttribute)getConductorInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.ConductorInfo#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see CIM15.IEC61968.AssetModels.ConductorInfo#getUsage()
	 * @see #getConductorInfo()
	 * @generated
	 */
	public EAttribute getConductorInfo_Usage() {
        return (EAttribute)getConductorInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.ConductorInfo#getInsulationMaterial <em>Insulation Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insulation Material</em>'.
	 * @see CIM15.IEC61968.AssetModels.ConductorInfo#getInsulationMaterial()
	 * @see #getConductorInfo()
	 * @generated
	 */
	public EAttribute getConductorInfo_InsulationMaterial() {
        return (EAttribute)getConductorInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.ConductorInfo#getPhaseCount <em>Phase Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Count</em>'.
	 * @see CIM15.IEC61968.AssetModels.ConductorInfo#getPhaseCount()
	 * @see #getConductorInfo()
	 * @generated
	 */
	public EAttribute getConductorInfo_PhaseCount() {
        return (EAttribute)getConductorInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.AssetModels.ConductorInfo#getLineSegments <em>Line Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line Segments</em>'.
	 * @see CIM15.IEC61968.AssetModels.ConductorInfo#getLineSegments()
	 * @see #getConductorInfo()
	 * @generated
	 */
	public EReference getConductorInfo_LineSegments() {
        return (EReference)getConductorInfo().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.ConductorInfo#getInsulationThickness <em>Insulation Thickness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insulation Thickness</em>'.
	 * @see CIM15.IEC61968.AssetModels.ConductorInfo#getInsulationThickness()
	 * @see #getConductorInfo()
	 * @generated
	 */
	public EAttribute getConductorInfo_InsulationThickness() {
        return (EAttribute)getConductorInfo().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.AssetModels.TapChangerInfo <em>Tap Changer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tap Changer Info</em>'.
	 * @see CIM15.IEC61968.AssetModels.TapChangerInfo
	 * @generated
	 */
	public EClass getTapChangerInfo() {
		if (tapChangerInfoEClass == null) {
			tapChangerInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(5);
		}
		return tapChangerInfoEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getCtRating <em>Ct Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ct Rating</em>'.
	 * @see CIM15.IEC61968.AssetModels.TapChangerInfo#getCtRating()
	 * @see #getTapChangerInfo()
	 * @generated
	 */
	public EAttribute getTapChangerInfo_CtRating() {
        return (EAttribute)getTapChangerInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getStepPhaseIncrement <em>Step Phase Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Phase Increment</em>'.
	 * @see CIM15.IEC61968.AssetModels.TapChangerInfo#getStepPhaseIncrement()
	 * @see #getTapChangerInfo()
	 * @generated
	 */
	public EAttribute getTapChangerInfo_StepPhaseIncrement() {
        return (EAttribute)getTapChangerInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getRatedApparentPower <em>Rated Apparent Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Apparent Power</em>'.
	 * @see CIM15.IEC61968.AssetModels.TapChangerInfo#getRatedApparentPower()
	 * @see #getTapChangerInfo()
	 * @generated
	 */
	public EAttribute getTapChangerInfo_RatedApparentPower() {
        return (EAttribute)getTapChangerInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see CIM15.IEC61968.AssetModels.TapChangerInfo#getFrequency()
	 * @see #getTapChangerInfo()
	 * @generated
	 */
	public EAttribute getTapChangerInfo_Frequency() {
        return (EAttribute)getTapChangerInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getNeutralU <em>Neutral U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neutral U</em>'.
	 * @see CIM15.IEC61968.AssetModels.TapChangerInfo#getNeutralU()
	 * @see #getTapChangerInfo()
	 * @generated
	 */
	public EAttribute getTapChangerInfo_NeutralU() {
        return (EAttribute)getTapChangerInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getCtRatio <em>Ct Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ct Ratio</em>'.
	 * @see CIM15.IEC61968.AssetModels.TapChangerInfo#getCtRatio()
	 * @see #getTapChangerInfo()
	 * @generated
	 */
	public EAttribute getTapChangerInfo_CtRatio() {
        return (EAttribute)getTapChangerInfo().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getStepVoltageIncrement <em>Step Voltage Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Voltage Increment</em>'.
	 * @see CIM15.IEC61968.AssetModels.TapChangerInfo#getStepVoltageIncrement()
	 * @see #getTapChangerInfo()
	 * @generated
	 */
	public EAttribute getTapChangerInfo_StepVoltageIncrement() {
        return (EAttribute)getTapChangerInfo().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#isIsTcul <em>Is Tcul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Tcul</em>'.
	 * @see CIM15.IEC61968.AssetModels.TapChangerInfo#isIsTcul()
	 * @see #getTapChangerInfo()
	 * @generated
	 */
	public EAttribute getTapChangerInfo_IsTcul() {
        return (EAttribute)getTapChangerInfo().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getNeutralStep <em>Neutral Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neutral Step</em>'.
	 * @see CIM15.IEC61968.AssetModels.TapChangerInfo#getNeutralStep()
	 * @see #getTapChangerInfo()
	 * @generated
	 */
	public EAttribute getTapChangerInfo_NeutralStep() {
        return (EAttribute)getTapChangerInfo().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getRatedCurrent <em>Rated Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Current</em>'.
	 * @see CIM15.IEC61968.AssetModels.TapChangerInfo#getRatedCurrent()
	 * @see #getTapChangerInfo()
	 * @generated
	 */
	public EAttribute getTapChangerInfo_RatedCurrent() {
        return (EAttribute)getTapChangerInfo().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getTapChangers <em>Tap Changers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tap Changers</em>'.
	 * @see CIM15.IEC61968.AssetModels.TapChangerInfo#getTapChangers()
	 * @see #getTapChangerInfo()
	 * @generated
	 */
	public EReference getTapChangerInfo_TapChangers() {
        return (EReference)getTapChangerInfo().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getLowStep <em>Low Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Step</em>'.
	 * @see CIM15.IEC61968.AssetModels.TapChangerInfo#getLowStep()
	 * @see #getTapChangerInfo()
	 * @generated
	 */
	public EAttribute getTapChangerInfo_LowStep() {
        return (EAttribute)getTapChangerInfo().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getRatedVoltage <em>Rated Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Voltage</em>'.
	 * @see CIM15.IEC61968.AssetModels.TapChangerInfo#getRatedVoltage()
	 * @see #getTapChangerInfo()
	 * @generated
	 */
	public EAttribute getTapChangerInfo_RatedVoltage() {
        return (EAttribute)getTapChangerInfo().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getHighStep <em>High Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Step</em>'.
	 * @see CIM15.IEC61968.AssetModels.TapChangerInfo#getHighStep()
	 * @see #getTapChangerInfo()
	 * @generated
	 */
	public EAttribute getTapChangerInfo_HighStep() {
        return (EAttribute)getTapChangerInfo().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getPtRatio <em>Pt Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pt Ratio</em>'.
	 * @see CIM15.IEC61968.AssetModels.TapChangerInfo#getPtRatio()
	 * @see #getTapChangerInfo()
	 * @generated
	 */
	public EAttribute getTapChangerInfo_PtRatio() {
        return (EAttribute)getTapChangerInfo().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TapChangerInfo#getBil <em>Bil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bil</em>'.
	 * @see CIM15.IEC61968.AssetModels.TapChangerInfo#getBil()
	 * @see #getTapChangerInfo()
	 * @generated
	 */
	public EAttribute getTapChangerInfo_Bil() {
        return (EAttribute)getTapChangerInfo().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.AssetModels.TransformerTankInfo <em>Transformer Tank Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer Tank Info</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerTankInfo
	 * @generated
	 */
	public EClass getTransformerTankInfo() {
		if (transformerTankInfoEClass == null) {
			transformerTankInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(6);
		}
		return transformerTankInfoEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.AssetModels.TransformerTankInfo#getTransformerAssets <em>Transformer Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer Assets</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerTankInfo#getTransformerAssets()
	 * @see #getTransformerTankInfo()
	 * @generated
	 */
	public EReference getTransformerTankInfo_TransformerAssets() {
        return (EReference)getTransformerTankInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.AssetModels.TransformerTankInfo#getTransformerEndInfos <em>Transformer End Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer End Infos</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerTankInfo#getTransformerEndInfos()
	 * @see #getTransformerTankInfo()
	 * @generated
	 */
	public EReference getTransformerTankInfo_TransformerEndInfos() {
        return (EReference)getTransformerTankInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.AssetModels.TransformerTankInfo#getPowerTransformerInfo <em>Power Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Power Transformer Info</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerTankInfo#getPowerTransformerInfo()
	 * @see #getTransformerTankInfo()
	 * @generated
	 */
	public EReference getTransformerTankInfo_PowerTransformerInfo() {
        return (EReference)getTransformerTankInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.AssetModels.TransformerTankInfo#getTransformerAssetModels <em>Transformer Asset Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer Asset Models</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerTankInfo#getTransformerAssetModels()
	 * @see #getTransformerTankInfo()
	 * @generated
	 */
	public EReference getTransformerTankInfo_TransformerAssetModels() {
        return (EReference)getTransformerTankInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.AssetModels.TransformerTankInfo#getTransformerTanks <em>Transformer Tanks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer Tanks</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerTankInfo#getTransformerTanks()
	 * @see #getTransformerTankInfo()
	 * @generated
	 */
	public EReference getTransformerTankInfo_TransformerTanks() {
        return (EReference)getTransformerTankInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.AssetModels.PowerTransformerInfo <em>Power Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Transformer Info</em>'.
	 * @see CIM15.IEC61968.AssetModels.PowerTransformerInfo
	 * @generated
	 */
	public EClass getPowerTransformerInfo() {
		if (powerTransformerInfoEClass == null) {
			powerTransformerInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(9);
		}
		return powerTransformerInfoEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.AssetModels.PowerTransformerInfo#getTransformerTankInfo <em>Transformer Tank Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer Tank Info</em>'.
	 * @see CIM15.IEC61968.AssetModels.PowerTransformerInfo#getTransformerTankInfo()
	 * @see #getPowerTransformerInfo()
	 * @generated
	 */
	public EReference getPowerTransformerInfo_TransformerTankInfo() {
        return (EReference)getPowerTransformerInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.AssetModels.PowerTransformerInfo#getPowerTransformers <em>Power Transformers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power Transformers</em>'.
	 * @see CIM15.IEC61968.AssetModels.PowerTransformerInfo#getPowerTransformers()
	 * @see #getPowerTransformerInfo()
	 * @generated
	 */
	public EReference getPowerTransformerInfo_PowerTransformers() {
        return (EReference)getPowerTransformerInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest <em>Open Circuit Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Circuit Test</em>'.
	 * @see CIM15.IEC61968.AssetModels.OpenCircuitTest
	 * @generated
	 */
	public EClass getOpenCircuitTest() {
		if (openCircuitTestEClass == null) {
			openCircuitTestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(10);
		}
		return openCircuitTestEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getEnergisedEndStep <em>Energised End Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energised End Step</em>'.
	 * @see CIM15.IEC61968.AssetModels.OpenCircuitTest#getEnergisedEndStep()
	 * @see #getOpenCircuitTest()
	 * @generated
	 */
	public EAttribute getOpenCircuitTest_EnergisedEndStep() {
        return (EAttribute)getOpenCircuitTest().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getOpenEndVoltage <em>Open End Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open End Voltage</em>'.
	 * @see CIM15.IEC61968.AssetModels.OpenCircuitTest#getOpenEndVoltage()
	 * @see #getOpenCircuitTest()
	 * @generated
	 */
	public EAttribute getOpenCircuitTest_OpenEndVoltage() {
        return (EAttribute)getOpenCircuitTest().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getOpenEndStep <em>Open End Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open End Step</em>'.
	 * @see CIM15.IEC61968.AssetModels.OpenCircuitTest#getOpenEndStep()
	 * @see #getOpenCircuitTest()
	 * @generated
	 */
	public EAttribute getOpenCircuitTest_OpenEndStep() {
        return (EAttribute)getOpenCircuitTest().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getEnergisedEndVoltage <em>Energised End Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energised End Voltage</em>'.
	 * @see CIM15.IEC61968.AssetModels.OpenCircuitTest#getEnergisedEndVoltage()
	 * @see #getOpenCircuitTest()
	 * @generated
	 */
	public EAttribute getOpenCircuitTest_EnergisedEndVoltage() {
        return (EAttribute)getOpenCircuitTest().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getPhaseShift <em>Phase Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Shift</em>'.
	 * @see CIM15.IEC61968.AssetModels.OpenCircuitTest#getPhaseShift()
	 * @see #getOpenCircuitTest()
	 * @generated
	 */
	public EAttribute getOpenCircuitTest_PhaseShift() {
        return (EAttribute)getOpenCircuitTest().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getOpenEnd <em>Open End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Open End</em>'.
	 * @see CIM15.IEC61968.AssetModels.OpenCircuitTest#getOpenEnd()
	 * @see #getOpenCircuitTest()
	 * @generated
	 */
	public EReference getOpenCircuitTest_OpenEnd() {
        return (EReference)getOpenCircuitTest().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest#getEnergisedEnd <em>Energised End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Energised End</em>'.
	 * @see CIM15.IEC61968.AssetModels.OpenCircuitTest#getEnergisedEnd()
	 * @see #getOpenCircuitTest()
	 * @generated
	 */
	public EReference getOpenCircuitTest_EnergisedEnd() {
        return (EReference)getOpenCircuitTest().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.AssetModels.CableInfo <em>Cable Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cable Info</em>'.
	 * @see CIM15.IEC61968.AssetModels.CableInfo
	 * @generated
	 */
	public EClass getCableInfo() {
		if (cableInfoEClass == null) {
			cableInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(13);
		}
		return cableInfoEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.CableInfo#getOuterJacketKind <em>Outer Jacket Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outer Jacket Kind</em>'.
	 * @see CIM15.IEC61968.AssetModels.CableInfo#getOuterJacketKind()
	 * @see #getCableInfo()
	 * @generated
	 */
	public EAttribute getCableInfo_OuterJacketKind() {
        return (EAttribute)getCableInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.CableInfo#isSheathAsNeutral <em>Sheath As Neutral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheath As Neutral</em>'.
	 * @see CIM15.IEC61968.AssetModels.CableInfo#isSheathAsNeutral()
	 * @see #getCableInfo()
	 * @generated
	 */
	public EAttribute getCableInfo_SheathAsNeutral() {
        return (EAttribute)getCableInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.CableInfo#isIsStrandFill <em>Is Strand Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Strand Fill</em>'.
	 * @see CIM15.IEC61968.AssetModels.CableInfo#isIsStrandFill()
	 * @see #getCableInfo()
	 * @generated
	 */
	public EAttribute getCableInfo_IsStrandFill() {
        return (EAttribute)getCableInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.CableInfo#getNominalTemperature <em>Nominal Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal Temperature</em>'.
	 * @see CIM15.IEC61968.AssetModels.CableInfo#getNominalTemperature()
	 * @see #getCableInfo()
	 * @generated
	 */
	public EAttribute getCableInfo_NominalTemperature() {
        return (EAttribute)getCableInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.CableInfo#getConstructionKind <em>Construction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Construction Kind</em>'.
	 * @see CIM15.IEC61968.AssetModels.CableInfo#getConstructionKind()
	 * @see #getCableInfo()
	 * @generated
	 */
	public EAttribute getCableInfo_ConstructionKind() {
        return (EAttribute)getCableInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.CableInfo#getDiameterOverJacket <em>Diameter Over Jacket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diameter Over Jacket</em>'.
	 * @see CIM15.IEC61968.AssetModels.CableInfo#getDiameterOverJacket()
	 * @see #getCableInfo()
	 * @generated
	 */
	public EAttribute getCableInfo_DiameterOverJacket() {
        return (EAttribute)getCableInfo().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.CableInfo#getDiameterOverInsulation <em>Diameter Over Insulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diameter Over Insulation</em>'.
	 * @see CIM15.IEC61968.AssetModels.CableInfo#getDiameterOverInsulation()
	 * @see #getCableInfo()
	 * @generated
	 */
	public EAttribute getCableInfo_DiameterOverInsulation() {
        return (EAttribute)getCableInfo().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.CableInfo#getDiameterOverScreen <em>Diameter Over Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diameter Over Screen</em>'.
	 * @see CIM15.IEC61968.AssetModels.CableInfo#getDiameterOverScreen()
	 * @see #getCableInfo()
	 * @generated
	 */
	public EAttribute getCableInfo_DiameterOverScreen() {
        return (EAttribute)getCableInfo().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.AssetModels.CableInfo#getDuctBankInfo <em>Duct Bank Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Duct Bank Info</em>'.
	 * @see CIM15.IEC61968.AssetModels.CableInfo#getDuctBankInfo()
	 * @see #getCableInfo()
	 * @generated
	 */
	public EReference getCableInfo_DuctBankInfo() {
        return (EReference)getCableInfo().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.CableInfo#getShieldMaterial <em>Shield Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shield Material</em>'.
	 * @see CIM15.IEC61968.AssetModels.CableInfo#getShieldMaterial()
	 * @see #getCableInfo()
	 * @generated
	 */
	public EAttribute getCableInfo_ShieldMaterial() {
        return (EAttribute)getCableInfo().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.CableInfo#getDiameterOverCore <em>Diameter Over Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diameter Over Core</em>'.
	 * @see CIM15.IEC61968.AssetModels.CableInfo#getDiameterOverCore()
	 * @see #getCableInfo()
	 * @generated
	 */
	public EAttribute getCableInfo_DiameterOverCore() {
        return (EAttribute)getCableInfo().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo <em>Transformer End Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer End Info</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo
	 * @generated
	 */
	public EClass getTransformerEndInfo() {
		if (transformerEndInfoEClass == null) {
			transformerEndInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(14);
		}
		return transformerEndInfoEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getFromMeshImpedance <em>From Mesh Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Mesh Impedance</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getFromMeshImpedance()
	 * @see #getTransformerEndInfo()
	 * @generated
	 */
	public EReference getTransformerEndInfo_FromMeshImpedance() {
        return (EReference)getTransformerEndInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getEnergisedEndNoLoadTest <em>Energised End No Load Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energised End No Load Test</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getEnergisedEndNoLoadTest()
	 * @see #getTransformerEndInfo()
	 * @generated
	 */
	public EReference getTransformerEndInfo_EnergisedEndNoLoadTest() {
        return (EReference)getTransformerEndInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getR()
	 * @see #getTransformerEndInfo()
	 * @generated
	 */
	public EAttribute getTransformerEndInfo_R() {
        return (EAttribute)getTransformerEndInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getOpenEndOpenCircuitTests <em>Open End Open Circuit Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Open End Open Circuit Tests</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getOpenEndOpenCircuitTests()
	 * @see #getTransformerEndInfo()
	 * @generated
	 */
	public EReference getTransformerEndInfo_OpenEndOpenCircuitTests() {
        return (EReference)getTransformerEndInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getInsulationU <em>Insulation U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insulation U</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getInsulationU()
	 * @see #getTransformerEndInfo()
	 * @generated
	 */
	public EAttribute getTransformerEndInfo_InsulationU() {
        return (EAttribute)getTransformerEndInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getEmergencyS <em>Emergency S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emergency S</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getEmergencyS()
	 * @see #getTransformerEndInfo()
	 * @generated
	 */
	public EAttribute getTransformerEndInfo_EmergencyS() {
        return (EAttribute)getTransformerEndInfo().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getToMeshImpedance <em>To Mesh Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Mesh Impedance</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getToMeshImpedance()
	 * @see #getTransformerEndInfo()
	 * @generated
	 */
	public EReference getTransformerEndInfo_ToMeshImpedance() {
        return (EReference)getTransformerEndInfo().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getTransformerEnd <em>Transformer End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer End</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getTransformerEnd()
	 * @see #getTransformerEndInfo()
	 * @generated
	 */
	public EReference getTransformerEndInfo_TransformerEnd() {
        return (EReference)getTransformerEndInfo().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getTransformerTankInfo <em>Transformer Tank Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformer Tank Info</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getTransformerTankInfo()
	 * @see #getTransformerEndInfo()
	 * @generated
	 */
	public EReference getTransformerEndInfo_TransformerTankInfo() {
        return (EReference)getTransformerEndInfo().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getEnergisedEndOpenCircuitTests <em>Energised End Open Circuit Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energised End Open Circuit Tests</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getEnergisedEndOpenCircuitTests()
	 * @see #getTransformerEndInfo()
	 * @generated
	 */
	public EReference getTransformerEndInfo_EnergisedEndOpenCircuitTests() {
        return (EReference)getTransformerEndInfo().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getGroundedEndShortCircuitTests <em>Grounded End Short Circuit Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grounded End Short Circuit Tests</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getGroundedEndShortCircuitTests()
	 * @see #getTransformerEndInfo()
	 * @generated
	 */
	public EReference getTransformerEndInfo_GroundedEndShortCircuitTests() {
        return (EReference)getTransformerEndInfo().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getShortTermS <em>Short Term S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Term S</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getShortTermS()
	 * @see #getTransformerEndInfo()
	 * @generated
	 */
	public EAttribute getTransformerEndInfo_ShortTermS() {
        return (EAttribute)getTransformerEndInfo().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getEnergisedEndShortCircuitTests <em>Energised End Short Circuit Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Energised End Short Circuit Tests</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getEnergisedEndShortCircuitTests()
	 * @see #getTransformerEndInfo()
	 * @generated
	 */
	public EReference getTransformerEndInfo_EnergisedEndShortCircuitTests() {
        return (EReference)getTransformerEndInfo().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getConnectionKind <em>Connection Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Kind</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getConnectionKind()
	 * @see #getTransformerEndInfo()
	 * @generated
	 */
	public EAttribute getTransformerEndInfo_ConnectionKind() {
        return (EAttribute)getTransformerEndInfo().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getCoreAdmittance <em>Core Admittance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Core Admittance</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getCoreAdmittance()
	 * @see #getTransformerEndInfo()
	 * @generated
	 */
	public EReference getTransformerEndInfo_CoreAdmittance() {
        return (EReference)getTransformerEndInfo().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getEndNumber <em>End Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Number</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getEndNumber()
	 * @see #getTransformerEndInfo()
	 * @generated
	 */
	public EAttribute getTransformerEndInfo_EndNumber() {
        return (EAttribute)getTransformerEndInfo().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getRatedS <em>Rated S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated S</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getRatedS()
	 * @see #getTransformerEndInfo()
	 * @generated
	 */
	public EAttribute getTransformerEndInfo_RatedS() {
        return (EAttribute)getTransformerEndInfo().getEStructuralFeatures().get(16);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getRatedU <em>Rated U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated U</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getRatedU()
	 * @see #getTransformerEndInfo()
	 * @generated
	 */
	public EAttribute getTransformerEndInfo_RatedU() {
        return (EAttribute)getTransformerEndInfo().getEStructuralFeatures().get(17);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getPhaseAngleClock <em>Phase Angle Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Angle Clock</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getPhaseAngleClock()
	 * @see #getTransformerEndInfo()
	 * @generated
	 */
	public EAttribute getTransformerEndInfo_PhaseAngleClock() {
        return (EAttribute)getTransformerEndInfo().getEStructuralFeatures().get(18);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.AssetModels.NoLoadTest <em>No Load Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Load Test</em>'.
	 * @see CIM15.IEC61968.AssetModels.NoLoadTest
	 * @generated
	 */
	public EClass getNoLoadTest() {
		if (noLoadTestEClass == null) {
			noLoadTestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(16);
		}
		return noLoadTestEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.NoLoadTest#getExcitingCurrent <em>Exciting Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exciting Current</em>'.
	 * @see CIM15.IEC61968.AssetModels.NoLoadTest#getExcitingCurrent()
	 * @see #getNoLoadTest()
	 * @generated
	 */
	public EAttribute getNoLoadTest_ExcitingCurrent() {
        return (EAttribute)getNoLoadTest().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.NoLoadTest#getLossZero <em>Loss Zero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loss Zero</em>'.
	 * @see CIM15.IEC61968.AssetModels.NoLoadTest#getLossZero()
	 * @see #getNoLoadTest()
	 * @generated
	 */
	public EAttribute getNoLoadTest_LossZero() {
        return (EAttribute)getNoLoadTest().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.NoLoadTest#getExcitingCurrentZero <em>Exciting Current Zero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exciting Current Zero</em>'.
	 * @see CIM15.IEC61968.AssetModels.NoLoadTest#getExcitingCurrentZero()
	 * @see #getNoLoadTest()
	 * @generated
	 */
	public EAttribute getNoLoadTest_ExcitingCurrentZero() {
        return (EAttribute)getNoLoadTest().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.AssetModels.NoLoadTest#getEnergisedEnd <em>Energised End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Energised End</em>'.
	 * @see CIM15.IEC61968.AssetModels.NoLoadTest#getEnergisedEnd()
	 * @see #getNoLoadTest()
	 * @generated
	 */
	public EReference getNoLoadTest_EnergisedEnd() {
        return (EReference)getNoLoadTest().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.NoLoadTest#getEnergisedEndVoltage <em>Energised End Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energised End Voltage</em>'.
	 * @see CIM15.IEC61968.AssetModels.NoLoadTest#getEnergisedEndVoltage()
	 * @see #getNoLoadTest()
	 * @generated
	 */
	public EAttribute getNoLoadTest_EnergisedEndVoltage() {
        return (EAttribute)getNoLoadTest().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.NoLoadTest#getLoss <em>Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loss</em>'.
	 * @see CIM15.IEC61968.AssetModels.NoLoadTest#getLoss()
	 * @see #getNoLoadTest()
	 * @generated
	 */
	public EAttribute getNoLoadTest_Loss() {
        return (EAttribute)getNoLoadTest().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.AssetModels.OverheadConductorInfo <em>Overhead Conductor Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overhead Conductor Info</em>'.
	 * @see CIM15.IEC61968.AssetModels.OverheadConductorInfo
	 * @generated
	 */
	public EClass getOverheadConductorInfo() {
		if (overheadConductorInfoEClass == null) {
			overheadConductorInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(17);
		}
		return overheadConductorInfoEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.AssetModels.OverheadConductorInfo#getMountingPoint <em>Mounting Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mounting Point</em>'.
	 * @see CIM15.IEC61968.AssetModels.OverheadConductorInfo#getMountingPoint()
	 * @see #getOverheadConductorInfo()
	 * @generated
	 */
	public EReference getOverheadConductorInfo_MountingPoint() {
        return (EReference)getOverheadConductorInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.OverheadConductorInfo#getNeutralInsulationThickness <em>Neutral Insulation Thickness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neutral Insulation Thickness</em>'.
	 * @see CIM15.IEC61968.AssetModels.OverheadConductorInfo#getNeutralInsulationThickness()
	 * @see #getOverheadConductorInfo()
	 * @generated
	 */
	public EAttribute getOverheadConductorInfo_NeutralInsulationThickness() {
        return (EAttribute)getOverheadConductorInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.OverheadConductorInfo#getPhaseConductorSpacing <em>Phase Conductor Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Conductor Spacing</em>'.
	 * @see CIM15.IEC61968.AssetModels.OverheadConductorInfo#getPhaseConductorSpacing()
	 * @see #getOverheadConductorInfo()
	 * @generated
	 */
	public EAttribute getOverheadConductorInfo_PhaseConductorSpacing() {
        return (EAttribute)getOverheadConductorInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.OverheadConductorInfo#getPhaseConductorCount <em>Phase Conductor Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase Conductor Count</em>'.
	 * @see CIM15.IEC61968.AssetModels.OverheadConductorInfo#getPhaseConductorCount()
	 * @see #getOverheadConductorInfo()
	 * @generated
	 */
	public EAttribute getOverheadConductorInfo_PhaseConductorCount() {
        return (EAttribute)getOverheadConductorInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo <em>Concentric Neutral Cable Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concentric Neutral Cable Info</em>'.
	 * @see CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo
	 * @generated
	 */
	public EClass getConcentricNeutralCableInfo() {
		if (concentricNeutralCableInfoEClass == null) {
			concentricNeutralCableInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(19);
		}
		return concentricNeutralCableInfoEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo#getWireType <em>Wire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wire Type</em>'.
	 * @see CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo#getWireType()
	 * @see #getConcentricNeutralCableInfo()
	 * @generated
	 */
	public EReference getConcentricNeutralCableInfo_WireType() {
        return (EReference)getConcentricNeutralCableInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo#getNeutralStrandCount <em>Neutral Strand Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neutral Strand Count</em>'.
	 * @see CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo#getNeutralStrandCount()
	 * @see #getConcentricNeutralCableInfo()
	 * @generated
	 */
	public EAttribute getConcentricNeutralCableInfo_NeutralStrandCount() {
        return (EAttribute)getConcentricNeutralCableInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo#getDiameterOverNeutral <em>Diameter Over Neutral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diameter Over Neutral</em>'.
	 * @see CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo#getDiameterOverNeutral()
	 * @see #getConcentricNeutralCableInfo()
	 * @generated
	 */
	public EAttribute getConcentricNeutralCableInfo_DiameterOverNeutral() {
        return (EAttribute)getConcentricNeutralCableInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.AssetModels.WireArrangement <em>Wire Arrangement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire Arrangement</em>'.
	 * @see CIM15.IEC61968.AssetModels.WireArrangement
	 * @generated
	 */
	public EClass getWireArrangement() {
		if (wireArrangementEClass == null) {
			wireArrangementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(20);
		}
		return wireArrangementEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.AssetModels.WireArrangement#getConductorInfo <em>Conductor Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conductor Info</em>'.
	 * @see CIM15.IEC61968.AssetModels.WireArrangement#getConductorInfo()
	 * @see #getWireArrangement()
	 * @generated
	 */
	public EReference getWireArrangement_ConductorInfo() {
        return (EReference)getWireArrangement().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.WireArrangement#getMountingPointY <em>Mounting Point Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mounting Point Y</em>'.
	 * @see CIM15.IEC61968.AssetModels.WireArrangement#getMountingPointY()
	 * @see #getWireArrangement()
	 * @generated
	 */
	public EAttribute getWireArrangement_MountingPointY() {
        return (EAttribute)getWireArrangement().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.WireArrangement#getMountingPointX <em>Mounting Point X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mounting Point X</em>'.
	 * @see CIM15.IEC61968.AssetModels.WireArrangement#getMountingPointX()
	 * @see #getWireArrangement()
	 * @generated
	 */
	public EAttribute getWireArrangement_MountingPointX() {
        return (EAttribute)getWireArrangement().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.WireArrangement#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see CIM15.IEC61968.AssetModels.WireArrangement#getPosition()
	 * @see #getWireArrangement()
	 * @generated
	 */
	public EAttribute getWireArrangement_Position() {
        return (EAttribute)getWireArrangement().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.AssetModels.WireArrangement#getWireType <em>Wire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wire Type</em>'.
	 * @see CIM15.IEC61968.AssetModels.WireArrangement#getWireType()
	 * @see #getWireArrangement()
	 * @generated
	 */
	public EReference getWireArrangement_WireType() {
        return (EReference)getWireArrangement().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.AssetModels.TransformerTest <em>Transformer Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer Test</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerTest
	 * @generated
	 */
	public EClass getTransformerTest() {
		if (transformerTestEClass == null) {
			transformerTestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(21);
		}
		return transformerTestEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TransformerTest#getBasePower <em>Base Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Power</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerTest#getBasePower()
	 * @see #getTransformerTest()
	 * @generated
	 */
	public EAttribute getTransformerTest_BasePower() {
        return (EAttribute)getTransformerTest().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.AssetModels.TransformerTest#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see CIM15.IEC61968.AssetModels.TransformerTest#getTemperature()
	 * @see #getTransformerTest()
	 * @generated
	 */
	public EAttribute getTransformerTest_Temperature() {
        return (EAttribute)getTransformerTest().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61968.AssetModels.CableOuterJacketKind <em>Cable Outer Jacket Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cable Outer Jacket Kind</em>'.
	 * @see CIM15.IEC61968.AssetModels.CableOuterJacketKind
	 * @generated
	 */
	public EEnum getCableOuterJacketKind() {
		if (cableOuterJacketKindEEnum == null) {
			cableOuterJacketKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(7);
		}
		return cableOuterJacketKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61968.AssetModels.ConductorMaterialKind <em>Conductor Material Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conductor Material Kind</em>'.
	 * @see CIM15.IEC61968.AssetModels.ConductorMaterialKind
	 * @generated
	 */
	public EEnum getConductorMaterialKind() {
		if (conductorMaterialKindEEnum == null) {
			conductorMaterialKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(8);
		}
		return conductorMaterialKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61968.AssetModels.ConductorUsageKind <em>Conductor Usage Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conductor Usage Kind</em>'.
	 * @see CIM15.IEC61968.AssetModels.ConductorUsageKind
	 * @generated
	 */
	public EEnum getConductorUsageKind() {
		if (conductorUsageKindEEnum == null) {
			conductorUsageKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(11);
		}
		return conductorUsageKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61968.AssetModels.CableConstructionKind <em>Cable Construction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cable Construction Kind</em>'.
	 * @see CIM15.IEC61968.AssetModels.CableConstructionKind
	 * @generated
	 */
	public EEnum getCableConstructionKind() {
		if (cableConstructionKindEEnum == null) {
			cableConstructionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(12);
		}
		return cableConstructionKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61968.AssetModels.CableShieldMaterialKind <em>Cable Shield Material Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cable Shield Material Kind</em>'.
	 * @see CIM15.IEC61968.AssetModels.CableShieldMaterialKind
	 * @generated
	 */
	public EEnum getCableShieldMaterialKind() {
		if (cableShieldMaterialKindEEnum == null) {
			cableShieldMaterialKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(15);
		}
		return cableShieldMaterialKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61968.AssetModels.ConductorInsulationKind <em>Conductor Insulation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conductor Insulation Kind</em>'.
	 * @see CIM15.IEC61968.AssetModels.ConductorInsulationKind
	 * @generated
	 */
	public EEnum getConductorInsulationKind() {
		if (conductorInsulationKindEEnum == null) {
			conductorInsulationKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI).getEClassifiers().get(18);
		}
		return conductorInsulationKindEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public AssetModelsFactory getAssetModelsFactory() {
		return (AssetModelsFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM15.IEC61968.AssetModels." + eClassifier.getName());
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
		 * The meta object literal for the '{@link CIM15.IEC61968.AssetModels.ShortCircuitTest <em>Short Circuit Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.AssetModels.ShortCircuitTest
		 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getShortCircuitTest()
		 * @generated
		 */
		public static final EClass SHORT_CIRCUIT_TEST = eINSTANCE.getShortCircuitTest();

		/**
		 * The meta object literal for the '<em><b>Grounded Ends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SHORT_CIRCUIT_TEST__GROUNDED_ENDS = eINSTANCE.getShortCircuitTest_GroundedEnds();

		/**
		 * The meta object literal for the '<em><b>Loss Zero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHORT_CIRCUIT_TEST__LOSS_ZERO = eINSTANCE.getShortCircuitTest_LossZero();

		/**
		 * The meta object literal for the '<em><b>Leakage Impedance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE = eINSTANCE.getShortCircuitTest_LeakageImpedance();

		/**
		 * The meta object literal for the '<em><b>Loss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHORT_CIRCUIT_TEST__LOSS = eINSTANCE.getShortCircuitTest_Loss();

		/**
		 * The meta object literal for the '<em><b>Grounded End Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHORT_CIRCUIT_TEST__GROUNDED_END_STEP = eINSTANCE.getShortCircuitTest_GroundedEndStep();

		/**
		 * The meta object literal for the '<em><b>Leakage Impedance Zero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE_ZERO = eINSTANCE.getShortCircuitTest_LeakageImpedanceZero();

		/**
		 * The meta object literal for the '<em><b>Energised End Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHORT_CIRCUIT_TEST__ENERGISED_END_STEP = eINSTANCE.getShortCircuitTest_EnergisedEndStep();

		/**
		 * The meta object literal for the '<em><b>Energised End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SHORT_CIRCUIT_TEST__ENERGISED_END = eINSTANCE.getShortCircuitTest_EnergisedEnd();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.AssetModels.EndDeviceInfo <em>End Device Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.AssetModels.EndDeviceInfo
		 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getEndDeviceInfo()
		 * @generated
		 */
		public static final EClass END_DEVICE_INFO = eINSTANCE.getEndDeviceInfo();

		/**
		 * The meta object literal for the '<em><b>Phase Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute END_DEVICE_INFO__PHASE_COUNT = eINSTANCE.getEndDeviceInfo_PhaseCount();

		/**
		 * The meta object literal for the '<em><b>Rated Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute END_DEVICE_INFO__RATED_CURRENT = eINSTANCE.getEndDeviceInfo_RatedCurrent();

		/**
		 * The meta object literal for the '<em><b>Rated Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute END_DEVICE_INFO__RATED_VOLTAGE = eINSTANCE.getEndDeviceInfo_RatedVoltage();

		/**
		 * The meta object literal for the '<em><b>End Devices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference END_DEVICE_INFO__END_DEVICES = eINSTANCE.getEndDeviceInfo_EndDevices();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.AssetModels.WireType <em>Wire Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.AssetModels.WireType
		 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getWireType()
		 * @generated
		 */
		public static final EClass WIRE_TYPE = eINSTANCE.getWireType();

		/**
		 * The meta object literal for the '<em><b>Core Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WIRE_TYPE__CORE_RADIUS = eINSTANCE.getWireType_CoreRadius();

		/**
		 * The meta object literal for the '<em><b>RAC50</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WIRE_TYPE__RAC50 = eINSTANCE.getWireType_RAC50();

		/**
		 * The meta object literal for the '<em><b>Wire Arrangements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WIRE_TYPE__WIRE_ARRANGEMENTS = eINSTANCE.getWireType_WireArrangements();

		/**
		 * The meta object literal for the '<em><b>Core Strand Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WIRE_TYPE__CORE_STRAND_COUNT = eINSTANCE.getWireType_CoreStrandCount();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WIRE_TYPE__RADIUS = eINSTANCE.getWireType_Radius();

		/**
		 * The meta object literal for the '<em><b>Material</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WIRE_TYPE__MATERIAL = eINSTANCE.getWireType_Material();

		/**
		 * The meta object literal for the '<em><b>RDC20</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WIRE_TYPE__RDC20 = eINSTANCE.getWireType_RDC20();

		/**
		 * The meta object literal for the '<em><b>Size Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WIRE_TYPE__SIZE_DESCRIPTION = eINSTANCE.getWireType_SizeDescription();

		/**
		 * The meta object literal for the '<em><b>RAC75</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WIRE_TYPE__RAC75 = eINSTANCE.getWireType_RAC75();

		/**
		 * The meta object literal for the '<em><b>Gmr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WIRE_TYPE__GMR = eINSTANCE.getWireType_Gmr();

		/**
		 * The meta object literal for the '<em><b>Concentric Neutral Cable Infos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WIRE_TYPE__CONCENTRIC_NEUTRAL_CABLE_INFOS = eINSTANCE.getWireType_ConcentricNeutralCableInfos();

		/**
		 * The meta object literal for the '<em><b>Rated Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WIRE_TYPE__RATED_CURRENT = eINSTANCE.getWireType_RatedCurrent();

		/**
		 * The meta object literal for the '<em><b>Strand Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WIRE_TYPE__STRAND_COUNT = eINSTANCE.getWireType_StrandCount();

		/**
		 * The meta object literal for the '<em><b>RAC25</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WIRE_TYPE__RAC25 = eINSTANCE.getWireType_RAC25();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.AssetModels.TapeShieldCableInfo <em>Tape Shield Cable Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.AssetModels.TapeShieldCableInfo
		 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getTapeShieldCableInfo()
		 * @generated
		 */
		public static final EClass TAPE_SHIELD_CABLE_INFO = eINSTANCE.getTapeShieldCableInfo();

		/**
		 * The meta object literal for the '<em><b>Tape Lap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAPE_SHIELD_CABLE_INFO__TAPE_LAP = eINSTANCE.getTapeShieldCableInfo_TapeLap();

		/**
		 * The meta object literal for the '<em><b>Tape Thickness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAPE_SHIELD_CABLE_INFO__TAPE_THICKNESS = eINSTANCE.getTapeShieldCableInfo_TapeThickness();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.AssetModels.ConductorInfo <em>Conductor Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.AssetModels.ConductorInfo
		 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getConductorInfo()
		 * @generated
		 */
		public static final EClass CONDUCTOR_INFO = eINSTANCE.getConductorInfo();

		/**
		 * The meta object literal for the '<em><b>Wire Arrangements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONDUCTOR_INFO__WIRE_ARRANGEMENTS = eINSTANCE.getConductorInfo_WireArrangements();

		/**
		 * The meta object literal for the '<em><b>Insulated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONDUCTOR_INFO__INSULATED = eINSTANCE.getConductorInfo_Insulated();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONDUCTOR_INFO__USAGE = eINSTANCE.getConductorInfo_Usage();

		/**
		 * The meta object literal for the '<em><b>Insulation Material</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONDUCTOR_INFO__INSULATION_MATERIAL = eINSTANCE.getConductorInfo_InsulationMaterial();

		/**
		 * The meta object literal for the '<em><b>Phase Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONDUCTOR_INFO__PHASE_COUNT = eINSTANCE.getConductorInfo_PhaseCount();

		/**
		 * The meta object literal for the '<em><b>Line Segments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONDUCTOR_INFO__LINE_SEGMENTS = eINSTANCE.getConductorInfo_LineSegments();

		/**
		 * The meta object literal for the '<em><b>Insulation Thickness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONDUCTOR_INFO__INSULATION_THICKNESS = eINSTANCE.getConductorInfo_InsulationThickness();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.AssetModels.TapChangerInfo <em>Tap Changer Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.AssetModels.TapChangerInfo
		 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getTapChangerInfo()
		 * @generated
		 */
		public static final EClass TAP_CHANGER_INFO = eINSTANCE.getTapChangerInfo();

		/**
		 * The meta object literal for the '<em><b>Ct Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER_INFO__CT_RATING = eINSTANCE.getTapChangerInfo_CtRating();

		/**
		 * The meta object literal for the '<em><b>Step Phase Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER_INFO__STEP_PHASE_INCREMENT = eINSTANCE.getTapChangerInfo_StepPhaseIncrement();

		/**
		 * The meta object literal for the '<em><b>Rated Apparent Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER_INFO__RATED_APPARENT_POWER = eINSTANCE.getTapChangerInfo_RatedApparentPower();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER_INFO__FREQUENCY = eINSTANCE.getTapChangerInfo_Frequency();

		/**
		 * The meta object literal for the '<em><b>Neutral U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER_INFO__NEUTRAL_U = eINSTANCE.getTapChangerInfo_NeutralU();

		/**
		 * The meta object literal for the '<em><b>Ct Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER_INFO__CT_RATIO = eINSTANCE.getTapChangerInfo_CtRatio();

		/**
		 * The meta object literal for the '<em><b>Step Voltage Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER_INFO__STEP_VOLTAGE_INCREMENT = eINSTANCE.getTapChangerInfo_StepVoltageIncrement();

		/**
		 * The meta object literal for the '<em><b>Is Tcul</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER_INFO__IS_TCUL = eINSTANCE.getTapChangerInfo_IsTcul();

		/**
		 * The meta object literal for the '<em><b>Neutral Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER_INFO__NEUTRAL_STEP = eINSTANCE.getTapChangerInfo_NeutralStep();

		/**
		 * The meta object literal for the '<em><b>Rated Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER_INFO__RATED_CURRENT = eINSTANCE.getTapChangerInfo_RatedCurrent();

		/**
		 * The meta object literal for the '<em><b>Tap Changers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TAP_CHANGER_INFO__TAP_CHANGERS = eINSTANCE.getTapChangerInfo_TapChangers();

		/**
		 * The meta object literal for the '<em><b>Low Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER_INFO__LOW_STEP = eINSTANCE.getTapChangerInfo_LowStep();

		/**
		 * The meta object literal for the '<em><b>Rated Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER_INFO__RATED_VOLTAGE = eINSTANCE.getTapChangerInfo_RatedVoltage();

		/**
		 * The meta object literal for the '<em><b>High Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER_INFO__HIGH_STEP = eINSTANCE.getTapChangerInfo_HighStep();

		/**
		 * The meta object literal for the '<em><b>Pt Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER_INFO__PT_RATIO = eINSTANCE.getTapChangerInfo_PtRatio();

		/**
		 * The meta object literal for the '<em><b>Bil</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TAP_CHANGER_INFO__BIL = eINSTANCE.getTapChangerInfo_Bil();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.AssetModels.TransformerTankInfo <em>Transformer Tank Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.AssetModels.TransformerTankInfo
		 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getTransformerTankInfo()
		 * @generated
		 */
		public static final EClass TRANSFORMER_TANK_INFO = eINSTANCE.getTransformerTankInfo();

		/**
		 * The meta object literal for the '<em><b>Transformer Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_TANK_INFO__TRANSFORMER_ASSETS = eINSTANCE.getTransformerTankInfo_TransformerAssets();

		/**
		 * The meta object literal for the '<em><b>Transformer End Infos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_TANK_INFO__TRANSFORMER_END_INFOS = eINSTANCE.getTransformerTankInfo_TransformerEndInfos();

		/**
		 * The meta object literal for the '<em><b>Power Transformer Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_TANK_INFO__POWER_TRANSFORMER_INFO = eINSTANCE.getTransformerTankInfo_PowerTransformerInfo();

		/**
		 * The meta object literal for the '<em><b>Transformer Asset Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_TANK_INFO__TRANSFORMER_ASSET_MODELS = eINSTANCE.getTransformerTankInfo_TransformerAssetModels();

		/**
		 * The meta object literal for the '<em><b>Transformer Tanks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_TANK_INFO__TRANSFORMER_TANKS = eINSTANCE.getTransformerTankInfo_TransformerTanks();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.AssetModels.PowerTransformerInfo <em>Power Transformer Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.AssetModels.PowerTransformerInfo
		 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getPowerTransformerInfo()
		 * @generated
		 */
		public static final EClass POWER_TRANSFORMER_INFO = eINSTANCE.getPowerTransformerInfo();

		/**
		 * The meta object literal for the '<em><b>Transformer Tank Info</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_TRANSFORMER_INFO__TRANSFORMER_TANK_INFO = eINSTANCE.getPowerTransformerInfo_TransformerTankInfo();

		/**
		 * The meta object literal for the '<em><b>Power Transformers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_TRANSFORMER_INFO__POWER_TRANSFORMERS = eINSTANCE.getPowerTransformerInfo_PowerTransformers();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.AssetModels.OpenCircuitTest <em>Open Circuit Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.AssetModels.OpenCircuitTest
		 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getOpenCircuitTest()
		 * @generated
		 */
		public static final EClass OPEN_CIRCUIT_TEST = eINSTANCE.getOpenCircuitTest();

		/**
		 * The meta object literal for the '<em><b>Energised End Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OPEN_CIRCUIT_TEST__ENERGISED_END_STEP = eINSTANCE.getOpenCircuitTest_EnergisedEndStep();

		/**
		 * The meta object literal for the '<em><b>Open End Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OPEN_CIRCUIT_TEST__OPEN_END_VOLTAGE = eINSTANCE.getOpenCircuitTest_OpenEndVoltage();

		/**
		 * The meta object literal for the '<em><b>Open End Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OPEN_CIRCUIT_TEST__OPEN_END_STEP = eINSTANCE.getOpenCircuitTest_OpenEndStep();

		/**
		 * The meta object literal for the '<em><b>Energised End Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OPEN_CIRCUIT_TEST__ENERGISED_END_VOLTAGE = eINSTANCE.getOpenCircuitTest_EnergisedEndVoltage();

		/**
		 * The meta object literal for the '<em><b>Phase Shift</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OPEN_CIRCUIT_TEST__PHASE_SHIFT = eINSTANCE.getOpenCircuitTest_PhaseShift();

		/**
		 * The meta object literal for the '<em><b>Open End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OPEN_CIRCUIT_TEST__OPEN_END = eINSTANCE.getOpenCircuitTest_OpenEnd();

		/**
		 * The meta object literal for the '<em><b>Energised End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OPEN_CIRCUIT_TEST__ENERGISED_END = eINSTANCE.getOpenCircuitTest_EnergisedEnd();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.AssetModels.CableInfo <em>Cable Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.AssetModels.CableInfo
		 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getCableInfo()
		 * @generated
		 */
		public static final EClass CABLE_INFO = eINSTANCE.getCableInfo();

		/**
		 * The meta object literal for the '<em><b>Outer Jacket Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CABLE_INFO__OUTER_JACKET_KIND = eINSTANCE.getCableInfo_OuterJacketKind();

		/**
		 * The meta object literal for the '<em><b>Sheath As Neutral</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CABLE_INFO__SHEATH_AS_NEUTRAL = eINSTANCE.getCableInfo_SheathAsNeutral();

		/**
		 * The meta object literal for the '<em><b>Is Strand Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CABLE_INFO__IS_STRAND_FILL = eINSTANCE.getCableInfo_IsStrandFill();

		/**
		 * The meta object literal for the '<em><b>Nominal Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CABLE_INFO__NOMINAL_TEMPERATURE = eINSTANCE.getCableInfo_NominalTemperature();

		/**
		 * The meta object literal for the '<em><b>Construction Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CABLE_INFO__CONSTRUCTION_KIND = eINSTANCE.getCableInfo_ConstructionKind();

		/**
		 * The meta object literal for the '<em><b>Diameter Over Jacket</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CABLE_INFO__DIAMETER_OVER_JACKET = eINSTANCE.getCableInfo_DiameterOverJacket();

		/**
		 * The meta object literal for the '<em><b>Diameter Over Insulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CABLE_INFO__DIAMETER_OVER_INSULATION = eINSTANCE.getCableInfo_DiameterOverInsulation();

		/**
		 * The meta object literal for the '<em><b>Diameter Over Screen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CABLE_INFO__DIAMETER_OVER_SCREEN = eINSTANCE.getCableInfo_DiameterOverScreen();

		/**
		 * The meta object literal for the '<em><b>Duct Bank Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CABLE_INFO__DUCT_BANK_INFO = eINSTANCE.getCableInfo_DuctBankInfo();

		/**
		 * The meta object literal for the '<em><b>Shield Material</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CABLE_INFO__SHIELD_MATERIAL = eINSTANCE.getCableInfo_ShieldMaterial();

		/**
		 * The meta object literal for the '<em><b>Diameter Over Core</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CABLE_INFO__DIAMETER_OVER_CORE = eINSTANCE.getCableInfo_DiameterOverCore();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo <em>Transformer End Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo
		 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getTransformerEndInfo()
		 * @generated
		 */
		public static final EClass TRANSFORMER_END_INFO = eINSTANCE.getTransformerEndInfo();

		/**
		 * The meta object literal for the '<em><b>From Mesh Impedance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_END_INFO__FROM_MESH_IMPEDANCE = eINSTANCE.getTransformerEndInfo_FromMeshImpedance();

		/**
		 * The meta object literal for the '<em><b>Energised End No Load Test</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_END_INFO__ENERGISED_END_NO_LOAD_TEST = eINSTANCE.getTransformerEndInfo_EnergisedEndNoLoadTest();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_END_INFO__R = eINSTANCE.getTransformerEndInfo_R();

		/**
		 * The meta object literal for the '<em><b>Open End Open Circuit Tests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_END_INFO__OPEN_END_OPEN_CIRCUIT_TESTS = eINSTANCE.getTransformerEndInfo_OpenEndOpenCircuitTests();

		/**
		 * The meta object literal for the '<em><b>Insulation U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_END_INFO__INSULATION_U = eINSTANCE.getTransformerEndInfo_InsulationU();

		/**
		 * The meta object literal for the '<em><b>Emergency S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_END_INFO__EMERGENCY_S = eINSTANCE.getTransformerEndInfo_EmergencyS();

		/**
		 * The meta object literal for the '<em><b>To Mesh Impedance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_END_INFO__TO_MESH_IMPEDANCE = eINSTANCE.getTransformerEndInfo_ToMeshImpedance();

		/**
		 * The meta object literal for the '<em><b>Transformer End</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_END_INFO__TRANSFORMER_END = eINSTANCE.getTransformerEndInfo_TransformerEnd();

		/**
		 * The meta object literal for the '<em><b>Transformer Tank Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_END_INFO__TRANSFORMER_TANK_INFO = eINSTANCE.getTransformerEndInfo_TransformerTankInfo();

		/**
		 * The meta object literal for the '<em><b>Energised End Open Circuit Tests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_END_INFO__ENERGISED_END_OPEN_CIRCUIT_TESTS = eINSTANCE.getTransformerEndInfo_EnergisedEndOpenCircuitTests();

		/**
		 * The meta object literal for the '<em><b>Grounded End Short Circuit Tests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_END_INFO__GROUNDED_END_SHORT_CIRCUIT_TESTS = eINSTANCE.getTransformerEndInfo_GroundedEndShortCircuitTests();

		/**
		 * The meta object literal for the '<em><b>Short Term S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_END_INFO__SHORT_TERM_S = eINSTANCE.getTransformerEndInfo_ShortTermS();

		/**
		 * The meta object literal for the '<em><b>Energised End Short Circuit Tests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_END_INFO__ENERGISED_END_SHORT_CIRCUIT_TESTS = eINSTANCE.getTransformerEndInfo_EnergisedEndShortCircuitTests();

		/**
		 * The meta object literal for the '<em><b>Connection Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_END_INFO__CONNECTION_KIND = eINSTANCE.getTransformerEndInfo_ConnectionKind();

		/**
		 * The meta object literal for the '<em><b>Core Admittance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSFORMER_END_INFO__CORE_ADMITTANCE = eINSTANCE.getTransformerEndInfo_CoreAdmittance();

		/**
		 * The meta object literal for the '<em><b>End Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_END_INFO__END_NUMBER = eINSTANCE.getTransformerEndInfo_EndNumber();

		/**
		 * The meta object literal for the '<em><b>Rated S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_END_INFO__RATED_S = eINSTANCE.getTransformerEndInfo_RatedS();

		/**
		 * The meta object literal for the '<em><b>Rated U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_END_INFO__RATED_U = eINSTANCE.getTransformerEndInfo_RatedU();

		/**
		 * The meta object literal for the '<em><b>Phase Angle Clock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_END_INFO__PHASE_ANGLE_CLOCK = eINSTANCE.getTransformerEndInfo_PhaseAngleClock();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.AssetModels.NoLoadTest <em>No Load Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.AssetModels.NoLoadTest
		 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getNoLoadTest()
		 * @generated
		 */
		public static final EClass NO_LOAD_TEST = eINSTANCE.getNoLoadTest();

		/**
		 * The meta object literal for the '<em><b>Exciting Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NO_LOAD_TEST__EXCITING_CURRENT = eINSTANCE.getNoLoadTest_ExcitingCurrent();

		/**
		 * The meta object literal for the '<em><b>Loss Zero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NO_LOAD_TEST__LOSS_ZERO = eINSTANCE.getNoLoadTest_LossZero();

		/**
		 * The meta object literal for the '<em><b>Exciting Current Zero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NO_LOAD_TEST__EXCITING_CURRENT_ZERO = eINSTANCE.getNoLoadTest_ExcitingCurrentZero();

		/**
		 * The meta object literal for the '<em><b>Energised End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NO_LOAD_TEST__ENERGISED_END = eINSTANCE.getNoLoadTest_EnergisedEnd();

		/**
		 * The meta object literal for the '<em><b>Energised End Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NO_LOAD_TEST__ENERGISED_END_VOLTAGE = eINSTANCE.getNoLoadTest_EnergisedEndVoltage();

		/**
		 * The meta object literal for the '<em><b>Loss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NO_LOAD_TEST__LOSS = eINSTANCE.getNoLoadTest_Loss();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.AssetModels.OverheadConductorInfo <em>Overhead Conductor Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.AssetModels.OverheadConductorInfo
		 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getOverheadConductorInfo()
		 * @generated
		 */
		public static final EClass OVERHEAD_CONDUCTOR_INFO = eINSTANCE.getOverheadConductorInfo();

		/**
		 * The meta object literal for the '<em><b>Mounting Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OVERHEAD_CONDUCTOR_INFO__MOUNTING_POINT = eINSTANCE.getOverheadConductorInfo_MountingPoint();

		/**
		 * The meta object literal for the '<em><b>Neutral Insulation Thickness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OVERHEAD_CONDUCTOR_INFO__NEUTRAL_INSULATION_THICKNESS = eINSTANCE.getOverheadConductorInfo_NeutralInsulationThickness();

		/**
		 * The meta object literal for the '<em><b>Phase Conductor Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_SPACING = eINSTANCE.getOverheadConductorInfo_PhaseConductorSpacing();

		/**
		 * The meta object literal for the '<em><b>Phase Conductor Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OVERHEAD_CONDUCTOR_INFO__PHASE_CONDUCTOR_COUNT = eINSTANCE.getOverheadConductorInfo_PhaseConductorCount();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo <em>Concentric Neutral Cable Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.AssetModels.ConcentricNeutralCableInfo
		 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getConcentricNeutralCableInfo()
		 * @generated
		 */
		public static final EClass CONCENTRIC_NEUTRAL_CABLE_INFO = eINSTANCE.getConcentricNeutralCableInfo();

		/**
		 * The meta object literal for the '<em><b>Wire Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONCENTRIC_NEUTRAL_CABLE_INFO__WIRE_TYPE = eINSTANCE.getConcentricNeutralCableInfo_WireType();

		/**
		 * The meta object literal for the '<em><b>Neutral Strand Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_COUNT = eINSTANCE.getConcentricNeutralCableInfo_NeutralStrandCount();

		/**
		 * The meta object literal for the '<em><b>Diameter Over Neutral</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_NEUTRAL = eINSTANCE.getConcentricNeutralCableInfo_DiameterOverNeutral();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.AssetModels.WireArrangement <em>Wire Arrangement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.AssetModels.WireArrangement
		 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getWireArrangement()
		 * @generated
		 */
		public static final EClass WIRE_ARRANGEMENT = eINSTANCE.getWireArrangement();

		/**
		 * The meta object literal for the '<em><b>Conductor Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WIRE_ARRANGEMENT__CONDUCTOR_INFO = eINSTANCE.getWireArrangement_ConductorInfo();

		/**
		 * The meta object literal for the '<em><b>Mounting Point Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WIRE_ARRANGEMENT__MOUNTING_POINT_Y = eINSTANCE.getWireArrangement_MountingPointY();

		/**
		 * The meta object literal for the '<em><b>Mounting Point X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WIRE_ARRANGEMENT__MOUNTING_POINT_X = eINSTANCE.getWireArrangement_MountingPointX();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WIRE_ARRANGEMENT__POSITION = eINSTANCE.getWireArrangement_Position();

		/**
		 * The meta object literal for the '<em><b>Wire Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WIRE_ARRANGEMENT__WIRE_TYPE = eINSTANCE.getWireArrangement_WireType();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.AssetModels.TransformerTest <em>Transformer Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.AssetModels.TransformerTest
		 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getTransformerTest()
		 * @generated
		 */
		public static final EClass TRANSFORMER_TEST = eINSTANCE.getTransformerTest();

		/**
		 * The meta object literal for the '<em><b>Base Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_TEST__BASE_POWER = eINSTANCE.getTransformerTest_BasePower();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSFORMER_TEST__TEMPERATURE = eINSTANCE.getTransformerTest_Temperature();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.AssetModels.CableOuterJacketKind <em>Cable Outer Jacket Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.AssetModels.CableOuterJacketKind
		 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getCableOuterJacketKind()
		 * @generated
		 */
		public static final EEnum CABLE_OUTER_JACKET_KIND = eINSTANCE.getCableOuterJacketKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.AssetModels.ConductorMaterialKind <em>Conductor Material Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.AssetModels.ConductorMaterialKind
		 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getConductorMaterialKind()
		 * @generated
		 */
		public static final EEnum CONDUCTOR_MATERIAL_KIND = eINSTANCE.getConductorMaterialKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.AssetModels.ConductorUsageKind <em>Conductor Usage Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.AssetModels.ConductorUsageKind
		 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getConductorUsageKind()
		 * @generated
		 */
		public static final EEnum CONDUCTOR_USAGE_KIND = eINSTANCE.getConductorUsageKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.AssetModels.CableConstructionKind <em>Cable Construction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.AssetModels.CableConstructionKind
		 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getCableConstructionKind()
		 * @generated
		 */
		public static final EEnum CABLE_CONSTRUCTION_KIND = eINSTANCE.getCableConstructionKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.AssetModels.CableShieldMaterialKind <em>Cable Shield Material Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.AssetModels.CableShieldMaterialKind
		 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getCableShieldMaterialKind()
		 * @generated
		 */
		public static final EEnum CABLE_SHIELD_MATERIAL_KIND = eINSTANCE.getCableShieldMaterialKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.AssetModels.ConductorInsulationKind <em>Conductor Insulation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.AssetModels.ConductorInsulationKind
		 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getConductorInsulationKind()
		 * @generated
		 */
		public static final EEnum CONDUCTOR_INSULATION_KIND = eINSTANCE.getConductorInsulationKind();

	}

} //AssetModelsPackage
