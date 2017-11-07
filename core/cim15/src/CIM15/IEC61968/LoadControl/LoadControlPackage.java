/**
 */
package CIM15.IEC61968.LoadControl;

import CIM15.CIM15Package;

import CIM15.IEC61968.AssetModels.AssetModelsPackage;

import CIM15.IEC61968.Assets.AssetsPackage;

import CIM15.IEC61968.Common.CommonPackage;

import CIM15.IEC61968.Customers.CustomersPackage;

import CIM15.IEC61968.IEC61968Package;

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
 * @see CIM15.IEC61968.LoadControl.LoadControlFactory
 * @generated
 */
public class LoadControlPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "LoadControl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#LoadControl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimLoadControl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LoadControlPackage eINSTANCE = CIM15.IEC61968.LoadControl.LoadControlPackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction <em>Connect Disconnect Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.LoadControl.ConnectDisconnectFunction
	 * @see CIM15.IEC61968.LoadControl.LoadControlPackage#getConnectDisconnectFunction()
	 * @generated
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__UUID = MeteringPackage.END_DEVICE_FUNCTION__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__NAMES = MeteringPackage.END_DEVICE_FUNCTION__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__DIAGRAM_OBJECTS = MeteringPackage.END_DEVICE_FUNCTION__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__MRID = MeteringPackage.END_DEVICE_FUNCTION__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__ALIAS_NAME = MeteringPackage.END_DEVICE_FUNCTION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__NAME = MeteringPackage.END_DEVICE_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__MODELING_AUTHORITY_SET = MeteringPackage.END_DEVICE_FUNCTION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__ASSET = MeteringPackage.END_DEVICE_FUNCTION__ASSET;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__PASSWORD = MeteringPackage.END_DEVICE_FUNCTION__PASSWORD;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__HARDWARE_ID = MeteringPackage.END_DEVICE_FUNCTION__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Firmware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__FIRMWARE_ID = MeteringPackage.END_DEVICE_FUNCTION__FIRMWARE_ID;

	/**
	 * The feature id for the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__PROGRAM_ID = MeteringPackage.END_DEVICE_FUNCTION__PROGRAM_ID;

	/**
	 * The feature id for the '<em><b>Config ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__CONFIG_ID = MeteringPackage.END_DEVICE_FUNCTION__CONFIG_ID;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__REGISTERS = MeteringPackage.END_DEVICE_FUNCTION__REGISTERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__ENABLED = MeteringPackage.END_DEVICE_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Com Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__COM_EQUIPMENT = MeteringPackage.END_DEVICE_FUNCTION__COM_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__SUPPORTED = MeteringPackage.END_DEVICE_FUNCTION__SUPPORTED;

	/**
	 * The feature id for the '<em><b>End Device Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__END_DEVICE_EVENTS = MeteringPackage.END_DEVICE_FUNCTION__END_DEVICE_EVENTS;

	/**
	 * The feature id for the '<em><b>End Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__END_DEVICE = MeteringPackage.END_DEVICE_FUNCTION__END_DEVICE;

	/**
	 * The feature id for the '<em><b>Is Delayed Discon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__IS_DELAYED_DISCON = MeteringPackage.END_DEVICE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rcd Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__RCD_INFO = MeteringPackage.END_DEVICE_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__EVENT_COUNT = MeteringPackage.END_DEVICE_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Remote Auto Recon Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_RECON_OP = MeteringPackage.END_DEVICE_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Remote Auto Discon Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_DISCON_OP = MeteringPackage.END_DEVICE_FUNCTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Switches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__SWITCHES = MeteringPackage.END_DEVICE_FUNCTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Local Auto Discon Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_DISCON_OP = MeteringPackage.END_DEVICE_FUNCTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Local Auto Recon Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_RECON_OP = MeteringPackage.END_DEVICE_FUNCTION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION__IS_CONNECTED = MeteringPackage.END_DEVICE_FUNCTION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Connect Disconnect Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION_FEATURE_COUNT = MeteringPackage.END_DEVICE_FUNCTION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Connect Disconnect Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_DISCONNECT_FUNCTION_OPERATION_COUNT = MeteringPackage.END_DEVICE_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo <em>Remote Connect Disconnect Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo
	 * @see CIM15.IEC61968.LoadControl.LoadControlPackage#getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	public static final int REMOTE_CONNECT_DISCONNECT_INFO = 1;

	/**
	 * The feature id for the '<em><b>Is Arm Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_CONNECT = 0;

	/**
	 * The feature id for the '<em><b>Energy Usage Warning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_WARNING = 1;

	/**
	 * The feature id for the '<em><b>Needs Voltage Limit Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_VOLTAGE_LIMIT_CHECK = 2;

	/**
	 * The feature id for the '<em><b>Customer Voltage Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_CONNECT_DISCONNECT_INFO__CUSTOMER_VOLTAGE_LIMIT = 3;

	/**
	 * The feature id for the '<em><b>Is Arm Disconnect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_DISCONNECT = 4;

	/**
	 * The feature id for the '<em><b>Is Energy Limiting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_CONNECT_DISCONNECT_INFO__IS_ENERGY_LIMITING = 5;

	/**
	 * The feature id for the '<em><b>Armed Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_CONNECT_DISCONNECT_INFO__ARMED_TIMEOUT = 6;

	/**
	 * The feature id for the '<em><b>Power Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_CONNECT_DISCONNECT_INFO__POWER_LIMIT = 7;

	/**
	 * The feature id for the '<em><b>Needs Power Limit Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_POWER_LIMIT_CHECK = 8;

	/**
	 * The feature id for the '<em><b>Use Pushbutton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_CONNECT_DISCONNECT_INFO__USE_PUSHBUTTON = 9;

	/**
	 * The feature id for the '<em><b>Energy Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_LIMIT = 10;

	/**
	 * The feature id for the '<em><b>Energy Usage Start Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_START_DATE_TIME = 11;

	/**
	 * The number of structural features of the '<em>Remote Connect Disconnect Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_CONNECT_DISCONNECT_INFO_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Remote Connect Disconnect Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_CONNECT_DISCONNECT_INFO_OPERATION_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectDisconnectFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteConnectDisconnectInfoEClass = null;

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
	 * @see CIM15.IEC61968.LoadControl.LoadControlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LoadControlPackage() {
		super(eNS_URI, LoadControlFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link LoadControlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static LoadControlPackage init() {
		if (isInited) return (LoadControlPackage)EPackage.Registry.INSTANCE.getEPackage(LoadControlPackage.eNS_URI);

		// Obtain or create and register package
		LoadControlPackage theLoadControlPackage = (LoadControlPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LoadControlPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LoadControlPackage());

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
		AssetsPackage theAssetsPackage = (AssetsPackage)(EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI) instanceof AssetsPackage ? EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI) : AssetsPackage.eINSTANCE);
		WorkPackage theWorkPackage = (WorkPackage)(EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI) instanceof WorkPackage ? EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI) : WorkPackage.eINSTANCE);
		CustomersPackage theCustomersPackage = (CustomersPackage)(EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) instanceof CustomersPackage ? EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) : CustomersPackage.eINSTANCE);
		IEC62325Package theIEC62325Package = (IEC62325Package)(EPackage.Registry.INSTANCE.getEPackage(IEC62325Package.eNS_URI) instanceof IEC62325Package ? EPackage.Registry.INSTANCE.getEPackage(IEC62325Package.eNS_URI) : IEC62325Package.eINSTANCE);
		PackageDependenciesPackage thePackageDependenciesPackage = (PackageDependenciesPackage)(EPackage.Registry.INSTANCE.getEPackage(PackageDependenciesPackage.eNS_URI) instanceof PackageDependenciesPackage ? EPackage.Registry.INSTANCE.getEPackage(PackageDependenciesPackage.eNS_URI) : PackageDependenciesPackage.eINSTANCE);

		// Load packages
		theCIM15Package.loadPackage();

		// Fix loaded packages
		theLoadControlPackage.fixPackageContents();
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
		theAssetsPackage.fixPackageContents();
		theWorkPackage.fixPackageContents();
		theCustomersPackage.fixPackageContents();
		theIEC62325Package.fixPackageContents();
		thePackageDependenciesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theLoadControlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LoadControlPackage.eNS_URI, theLoadControlPackage);
		return theLoadControlPackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction <em>Connect Disconnect Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connect Disconnect Function</em>'.
	 * @see CIM15.IEC61968.LoadControl.ConnectDisconnectFunction
	 * @generated
	 */
	public EClass getConnectDisconnectFunction() {
		if (connectDisconnectFunctionEClass == null) {
			connectDisconnectFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LoadControlPackage.eNS_URI).getEClassifiers().get(0);
		}
		return connectDisconnectFunctionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsDelayedDiscon <em>Is Delayed Discon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Delayed Discon</em>'.
	 * @see CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsDelayedDiscon()
	 * @see #getConnectDisconnectFunction()
	 * @generated
	 */
	public EAttribute getConnectDisconnectFunction_IsDelayedDiscon() {
        return (EAttribute)getConnectDisconnectFunction().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#getRcdInfo <em>Rcd Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rcd Info</em>'.
	 * @see CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#getRcdInfo()
	 * @see #getConnectDisconnectFunction()
	 * @generated
	 */
	public EReference getConnectDisconnectFunction_RcdInfo() {
        return (EReference)getConnectDisconnectFunction().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#getEventCount <em>Event Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Count</em>'.
	 * @see CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#getEventCount()
	 * @see #getConnectDisconnectFunction()
	 * @generated
	 */
	public EAttribute getConnectDisconnectFunction_EventCount() {
        return (EAttribute)getConnectDisconnectFunction().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsRemoteAutoReconOp <em>Is Remote Auto Recon Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Remote Auto Recon Op</em>'.
	 * @see CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsRemoteAutoReconOp()
	 * @see #getConnectDisconnectFunction()
	 * @generated
	 */
	public EAttribute getConnectDisconnectFunction_IsRemoteAutoReconOp() {
        return (EAttribute)getConnectDisconnectFunction().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsRemoteAutoDisconOp <em>Is Remote Auto Discon Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Remote Auto Discon Op</em>'.
	 * @see CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsRemoteAutoDisconOp()
	 * @see #getConnectDisconnectFunction()
	 * @generated
	 */
	public EAttribute getConnectDisconnectFunction_IsRemoteAutoDisconOp() {
        return (EAttribute)getConnectDisconnectFunction().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#getSwitches <em>Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switches</em>'.
	 * @see CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#getSwitches()
	 * @see #getConnectDisconnectFunction()
	 * @generated
	 */
	public EReference getConnectDisconnectFunction_Switches() {
        return (EReference)getConnectDisconnectFunction().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsLocalAutoDisconOp <em>Is Local Auto Discon Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Local Auto Discon Op</em>'.
	 * @see CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsLocalAutoDisconOp()
	 * @see #getConnectDisconnectFunction()
	 * @generated
	 */
	public EAttribute getConnectDisconnectFunction_IsLocalAutoDisconOp() {
        return (EAttribute)getConnectDisconnectFunction().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsLocalAutoReconOp <em>Is Local Auto Recon Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Local Auto Recon Op</em>'.
	 * @see CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsLocalAutoReconOp()
	 * @see #getConnectDisconnectFunction()
	 * @generated
	 */
	public EAttribute getConnectDisconnectFunction_IsLocalAutoReconOp() {
        return (EAttribute)getConnectDisconnectFunction().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsConnected <em>Is Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Connected</em>'.
	 * @see CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsConnected()
	 * @see #getConnectDisconnectFunction()
	 * @generated
	 */
	public EAttribute getConnectDisconnectFunction_IsConnected() {
        return (EAttribute)getConnectDisconnectFunction().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo <em>Remote Connect Disconnect Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Connect Disconnect Info</em>'.
	 * @see CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo
	 * @generated
	 */
	public EClass getRemoteConnectDisconnectInfo() {
		if (remoteConnectDisconnectInfoEClass == null) {
			remoteConnectDisconnectInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(LoadControlPackage.eNS_URI).getEClassifiers().get(1);
		}
		return remoteConnectDisconnectInfoEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsArmConnect <em>Is Arm Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Arm Connect</em>'.
	 * @see CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsArmConnect()
	 * @see #getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	public EAttribute getRemoteConnectDisconnectInfo_IsArmConnect() {
        return (EAttribute)getRemoteConnectDisconnectInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyUsageWarning <em>Energy Usage Warning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Usage Warning</em>'.
	 * @see CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyUsageWarning()
	 * @see #getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	public EAttribute getRemoteConnectDisconnectInfo_EnergyUsageWarning() {
        return (EAttribute)getRemoteConnectDisconnectInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isNeedsVoltageLimitCheck <em>Needs Voltage Limit Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Voltage Limit Check</em>'.
	 * @see CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isNeedsVoltageLimitCheck()
	 * @see #getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	public EAttribute getRemoteConnectDisconnectInfo_NeedsVoltageLimitCheck() {
        return (EAttribute)getRemoteConnectDisconnectInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getCustomerVoltageLimit <em>Customer Voltage Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Voltage Limit</em>'.
	 * @see CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getCustomerVoltageLimit()
	 * @see #getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	public EAttribute getRemoteConnectDisconnectInfo_CustomerVoltageLimit() {
        return (EAttribute)getRemoteConnectDisconnectInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsArmDisconnect <em>Is Arm Disconnect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Arm Disconnect</em>'.
	 * @see CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsArmDisconnect()
	 * @see #getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	public EAttribute getRemoteConnectDisconnectInfo_IsArmDisconnect() {
        return (EAttribute)getRemoteConnectDisconnectInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsEnergyLimiting <em>Is Energy Limiting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Energy Limiting</em>'.
	 * @see CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isIsEnergyLimiting()
	 * @see #getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	public EAttribute getRemoteConnectDisconnectInfo_IsEnergyLimiting() {
        return (EAttribute)getRemoteConnectDisconnectInfo().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getArmedTimeout <em>Armed Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Armed Timeout</em>'.
	 * @see CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getArmedTimeout()
	 * @see #getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	public EAttribute getRemoteConnectDisconnectInfo_ArmedTimeout() {
        return (EAttribute)getRemoteConnectDisconnectInfo().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getPowerLimit <em>Power Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Limit</em>'.
	 * @see CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getPowerLimit()
	 * @see #getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	public EAttribute getRemoteConnectDisconnectInfo_PowerLimit() {
        return (EAttribute)getRemoteConnectDisconnectInfo().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isNeedsPowerLimitCheck <em>Needs Power Limit Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Power Limit Check</em>'.
	 * @see CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isNeedsPowerLimitCheck()
	 * @see #getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	public EAttribute getRemoteConnectDisconnectInfo_NeedsPowerLimitCheck() {
        return (EAttribute)getRemoteConnectDisconnectInfo().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isUsePushbutton <em>Use Pushbutton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Pushbutton</em>'.
	 * @see CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#isUsePushbutton()
	 * @see #getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	public EAttribute getRemoteConnectDisconnectInfo_UsePushbutton() {
        return (EAttribute)getRemoteConnectDisconnectInfo().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyLimit <em>Energy Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Limit</em>'.
	 * @see CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyLimit()
	 * @see #getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	public EAttribute getRemoteConnectDisconnectInfo_EnergyLimit() {
        return (EAttribute)getRemoteConnectDisconnectInfo().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyUsageStartDateTime <em>Energy Usage Start Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Usage Start Date Time</em>'.
	 * @see CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo#getEnergyUsageStartDateTime()
	 * @see #getRemoteConnectDisconnectInfo()
	 * @generated
	 */
	public EAttribute getRemoteConnectDisconnectInfo_EnergyUsageStartDateTime() {
        return (EAttribute)getRemoteConnectDisconnectInfo().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public LoadControlFactory getLoadControlFactory() {
		return (LoadControlFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM15.IEC61968.LoadControl." + eClassifier.getName());
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
		 * The meta object literal for the '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction <em>Connect Disconnect Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.LoadControl.ConnectDisconnectFunction
		 * @see CIM15.IEC61968.LoadControl.LoadControlPackage#getConnectDisconnectFunction()
		 * @generated
		 */
		public static final EClass CONNECT_DISCONNECT_FUNCTION = eINSTANCE.getConnectDisconnectFunction();

		/**
		 * The meta object literal for the '<em><b>Is Delayed Discon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONNECT_DISCONNECT_FUNCTION__IS_DELAYED_DISCON = eINSTANCE.getConnectDisconnectFunction_IsDelayedDiscon();

		/**
		 * The meta object literal for the '<em><b>Rcd Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONNECT_DISCONNECT_FUNCTION__RCD_INFO = eINSTANCE.getConnectDisconnectFunction_RcdInfo();

		/**
		 * The meta object literal for the '<em><b>Event Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONNECT_DISCONNECT_FUNCTION__EVENT_COUNT = eINSTANCE.getConnectDisconnectFunction_EventCount();

		/**
		 * The meta object literal for the '<em><b>Is Remote Auto Recon Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_RECON_OP = eINSTANCE.getConnectDisconnectFunction_IsRemoteAutoReconOp();

		/**
		 * The meta object literal for the '<em><b>Is Remote Auto Discon Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_DISCON_OP = eINSTANCE.getConnectDisconnectFunction_IsRemoteAutoDisconOp();

		/**
		 * The meta object literal for the '<em><b>Switches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONNECT_DISCONNECT_FUNCTION__SWITCHES = eINSTANCE.getConnectDisconnectFunction_Switches();

		/**
		 * The meta object literal for the '<em><b>Is Local Auto Discon Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_DISCON_OP = eINSTANCE.getConnectDisconnectFunction_IsLocalAutoDisconOp();

		/**
		 * The meta object literal for the '<em><b>Is Local Auto Recon Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_RECON_OP = eINSTANCE.getConnectDisconnectFunction_IsLocalAutoReconOp();

		/**
		 * The meta object literal for the '<em><b>Is Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONNECT_DISCONNECT_FUNCTION__IS_CONNECTED = eINSTANCE.getConnectDisconnectFunction_IsConnected();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo <em>Remote Connect Disconnect Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.LoadControl.RemoteConnectDisconnectInfo
		 * @see CIM15.IEC61968.LoadControl.LoadControlPackage#getRemoteConnectDisconnectInfo()
		 * @generated
		 */
		public static final EClass REMOTE_CONNECT_DISCONNECT_INFO = eINSTANCE.getRemoteConnectDisconnectInfo();

		/**
		 * The meta object literal for the '<em><b>Is Arm Connect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_CONNECT = eINSTANCE.getRemoteConnectDisconnectInfo_IsArmConnect();

		/**
		 * The meta object literal for the '<em><b>Energy Usage Warning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_WARNING = eINSTANCE.getRemoteConnectDisconnectInfo_EnergyUsageWarning();

		/**
		 * The meta object literal for the '<em><b>Needs Voltage Limit Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_VOLTAGE_LIMIT_CHECK = eINSTANCE.getRemoteConnectDisconnectInfo_NeedsVoltageLimitCheck();

		/**
		 * The meta object literal for the '<em><b>Customer Voltage Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_CONNECT_DISCONNECT_INFO__CUSTOMER_VOLTAGE_LIMIT = eINSTANCE.getRemoteConnectDisconnectInfo_CustomerVoltageLimit();

		/**
		 * The meta object literal for the '<em><b>Is Arm Disconnect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_CONNECT_DISCONNECT_INFO__IS_ARM_DISCONNECT = eINSTANCE.getRemoteConnectDisconnectInfo_IsArmDisconnect();

		/**
		 * The meta object literal for the '<em><b>Is Energy Limiting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_CONNECT_DISCONNECT_INFO__IS_ENERGY_LIMITING = eINSTANCE.getRemoteConnectDisconnectInfo_IsEnergyLimiting();

		/**
		 * The meta object literal for the '<em><b>Armed Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_CONNECT_DISCONNECT_INFO__ARMED_TIMEOUT = eINSTANCE.getRemoteConnectDisconnectInfo_ArmedTimeout();

		/**
		 * The meta object literal for the '<em><b>Power Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_CONNECT_DISCONNECT_INFO__POWER_LIMIT = eINSTANCE.getRemoteConnectDisconnectInfo_PowerLimit();

		/**
		 * The meta object literal for the '<em><b>Needs Power Limit Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_CONNECT_DISCONNECT_INFO__NEEDS_POWER_LIMIT_CHECK = eINSTANCE.getRemoteConnectDisconnectInfo_NeedsPowerLimitCheck();

		/**
		 * The meta object literal for the '<em><b>Use Pushbutton</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_CONNECT_DISCONNECT_INFO__USE_PUSHBUTTON = eINSTANCE.getRemoteConnectDisconnectInfo_UsePushbutton();

		/**
		 * The meta object literal for the '<em><b>Energy Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_LIMIT = eINSTANCE.getRemoteConnectDisconnectInfo_EnergyLimit();

		/**
		 * The meta object literal for the '<em><b>Energy Usage Start Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_CONNECT_DISCONNECT_INFO__ENERGY_USAGE_START_DATE_TIME = eINSTANCE.getRemoteConnectDisconnectInfo_EnergyUsageStartDateTime();

	}

} //LoadControlPackage
