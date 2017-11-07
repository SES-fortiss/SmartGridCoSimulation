/**
 */
package CIM15.IEC61970.Informative.InfLoadControl;

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
 * @see CIM15.IEC61970.Informative.InfLoadControl.InfLoadControlFactory
 * @generated
 */
public class InfLoadControlPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "InfLoadControl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#InfLoadControl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimInfLoadControl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfLoadControlPackage eINSTANCE = CIM15.IEC61970.Informative.InfLoadControl.InfLoadControlPackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtRecord <em>Load Mgmt Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtRecord
	 * @see CIM15.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadMgmtRecord()
	 * @generated
	 */
	public static final int LOAD_MGMT_RECORD = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_RECORD__UUID = CommonPackage.ACTIVITY_RECORD__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_RECORD__NAMES = CommonPackage.ACTIVITY_RECORD__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_RECORD__DIAGRAM_OBJECTS = CommonPackage.ACTIVITY_RECORD__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_RECORD__MRID = CommonPackage.ACTIVITY_RECORD__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_RECORD__ALIAS_NAME = CommonPackage.ACTIVITY_RECORD__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_RECORD__NAME = CommonPackage.ACTIVITY_RECORD__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_RECORD__MODELING_AUTHORITY_SET = CommonPackage.ACTIVITY_RECORD__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_RECORD__SEVERITY = CommonPackage.ACTIVITY_RECORD__SEVERITY;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_RECORD__CREATED_DATE_TIME = CommonPackage.ACTIVITY_RECORD__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Erp Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_RECORD__ERP_PERSONS = CommonPackage.ACTIVITY_RECORD__ERP_PERSONS;

	/**
	 * The feature id for the '<em><b>Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_RECORD__ORGANISATIONS = CommonPackage.ACTIVITY_RECORD__ORGANISATIONS;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_RECORD__DOCUMENTS = CommonPackage.ACTIVITY_RECORD__DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_RECORD__ASSETS = CommonPackage.ACTIVITY_RECORD__ASSETS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_RECORD__STATUS = CommonPackage.ACTIVITY_RECORD__STATUS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_RECORD__REASON = CommonPackage.ACTIVITY_RECORD__REASON;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_RECORD__CATEGORY = CommonPackage.ACTIVITY_RECORD__CATEGORY;

	/**
	 * The feature id for the '<em><b>Scheduled Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_RECORD__SCHEDULED_EVENT = CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT;

	/**
	 * The feature id for the '<em><b>Load Mgmt Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_RECORD__LOAD_MGMT_FUNCTION = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Load Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_RECORD__LOAD_REDUCTION = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Load Mgmt Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_RECORD_FEATURE_COUNT = CommonPackage.ACTIVITY_RECORD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Load Mgmt Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_RECORD_OPERATION_COUNT = CommonPackage.ACTIVITY_RECORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction <em>Load Mgmt Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction
	 * @see CIM15.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadMgmtFunction()
	 * @generated
	 */
	public static final int LOAD_MGMT_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__UUID = MeteringPackage.END_DEVICE_FUNCTION__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__NAMES = MeteringPackage.END_DEVICE_FUNCTION__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__DIAGRAM_OBJECTS = MeteringPackage.END_DEVICE_FUNCTION__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__MRID = MeteringPackage.END_DEVICE_FUNCTION__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__ALIAS_NAME = MeteringPackage.END_DEVICE_FUNCTION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__NAME = MeteringPackage.END_DEVICE_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__MODELING_AUTHORITY_SET = MeteringPackage.END_DEVICE_FUNCTION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__ASSET = MeteringPackage.END_DEVICE_FUNCTION__ASSET;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__PASSWORD = MeteringPackage.END_DEVICE_FUNCTION__PASSWORD;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__HARDWARE_ID = MeteringPackage.END_DEVICE_FUNCTION__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Firmware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__FIRMWARE_ID = MeteringPackage.END_DEVICE_FUNCTION__FIRMWARE_ID;

	/**
	 * The feature id for the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__PROGRAM_ID = MeteringPackage.END_DEVICE_FUNCTION__PROGRAM_ID;

	/**
	 * The feature id for the '<em><b>Config ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__CONFIG_ID = MeteringPackage.END_DEVICE_FUNCTION__CONFIG_ID;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__REGISTERS = MeteringPackage.END_DEVICE_FUNCTION__REGISTERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__ENABLED = MeteringPackage.END_DEVICE_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Com Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__COM_EQUIPMENT = MeteringPackage.END_DEVICE_FUNCTION__COM_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__SUPPORTED = MeteringPackage.END_DEVICE_FUNCTION__SUPPORTED;

	/**
	 * The feature id for the '<em><b>End Device Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__END_DEVICE_EVENTS = MeteringPackage.END_DEVICE_FUNCTION__END_DEVICE_EVENTS;

	/**
	 * The feature id for the '<em><b>End Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__END_DEVICE = MeteringPackage.END_DEVICE_FUNCTION__END_DEVICE;

	/**
	 * The feature id for the '<em><b>Scheduling Basis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__SCHEDULING_BASIS = MeteringPackage.END_DEVICE_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remote Over Ride</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__REMOTE_OVER_RIDE = MeteringPackage.END_DEVICE_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Auto Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__IS_AUTO_OP = MeteringPackage.END_DEVICE_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Load Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__LOAD_STATUS = MeteringPackage.END_DEVICE_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Switches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__SWITCHES = MeteringPackage.END_DEVICE_FUNCTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Manual Over Ride</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__MANUAL_OVER_RIDE = MeteringPackage.END_DEVICE_FUNCTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Load Mgmt Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS = MeteringPackage.END_DEVICE_FUNCTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Over Ride Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION__OVER_RIDE_TIME_OUT = MeteringPackage.END_DEVICE_FUNCTION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Load Mgmt Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION_FEATURE_COUNT = MeteringPackage.END_DEVICE_FUNCTION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Load Mgmt Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_MGMT_FUNCTION_OPERATION_COUNT = MeteringPackage.END_DEVICE_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadShedFunction <em>Load Shed Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadShedFunction
	 * @see CIM15.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadShedFunction()
	 * @generated
	 */
	public static final int LOAD_SHED_FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__UUID = LOAD_MGMT_FUNCTION__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__NAMES = LOAD_MGMT_FUNCTION__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__DIAGRAM_OBJECTS = LOAD_MGMT_FUNCTION__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__MRID = LOAD_MGMT_FUNCTION__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__ALIAS_NAME = LOAD_MGMT_FUNCTION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__NAME = LOAD_MGMT_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__MODELING_AUTHORITY_SET = LOAD_MGMT_FUNCTION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__ASSET = LOAD_MGMT_FUNCTION__ASSET;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__PASSWORD = LOAD_MGMT_FUNCTION__PASSWORD;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__HARDWARE_ID = LOAD_MGMT_FUNCTION__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Firmware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__FIRMWARE_ID = LOAD_MGMT_FUNCTION__FIRMWARE_ID;

	/**
	 * The feature id for the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__PROGRAM_ID = LOAD_MGMT_FUNCTION__PROGRAM_ID;

	/**
	 * The feature id for the '<em><b>Config ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__CONFIG_ID = LOAD_MGMT_FUNCTION__CONFIG_ID;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__REGISTERS = LOAD_MGMT_FUNCTION__REGISTERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__ENABLED = LOAD_MGMT_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Com Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__COM_EQUIPMENT = LOAD_MGMT_FUNCTION__COM_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__SUPPORTED = LOAD_MGMT_FUNCTION__SUPPORTED;

	/**
	 * The feature id for the '<em><b>End Device Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__END_DEVICE_EVENTS = LOAD_MGMT_FUNCTION__END_DEVICE_EVENTS;

	/**
	 * The feature id for the '<em><b>End Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__END_DEVICE = LOAD_MGMT_FUNCTION__END_DEVICE;

	/**
	 * The feature id for the '<em><b>Scheduling Basis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__SCHEDULING_BASIS = LOAD_MGMT_FUNCTION__SCHEDULING_BASIS;

	/**
	 * The feature id for the '<em><b>Remote Over Ride</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__REMOTE_OVER_RIDE = LOAD_MGMT_FUNCTION__REMOTE_OVER_RIDE;

	/**
	 * The feature id for the '<em><b>Is Auto Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__IS_AUTO_OP = LOAD_MGMT_FUNCTION__IS_AUTO_OP;

	/**
	 * The feature id for the '<em><b>Load Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__LOAD_STATUS = LOAD_MGMT_FUNCTION__LOAD_STATUS;

	/**
	 * The feature id for the '<em><b>Switches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__SWITCHES = LOAD_MGMT_FUNCTION__SWITCHES;

	/**
	 * The feature id for the '<em><b>Manual Over Ride</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__MANUAL_OVER_RIDE = LOAD_MGMT_FUNCTION__MANUAL_OVER_RIDE;

	/**
	 * The feature id for the '<em><b>Load Mgmt Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__LOAD_MGMT_RECORDS = LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS;

	/**
	 * The feature id for the '<em><b>Over Ride Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__OVER_RIDE_TIME_OUT = LOAD_MGMT_FUNCTION__OVER_RIDE_TIME_OUT;

	/**
	 * The feature id for the '<em><b>Switched Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION__SWITCHED_LOAD = LOAD_MGMT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Load Shed Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION_FEATURE_COUNT = LOAD_MGMT_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Load Shed Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_SHED_FUNCTION_OPERATION_COUNT = LOAD_MGMT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction <em>Load Limit Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction
	 * @see CIM15.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadLimitFunction()
	 * @generated
	 */
	public static final int LOAD_LIMIT_FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__UUID = LOAD_MGMT_FUNCTION__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__NAMES = LOAD_MGMT_FUNCTION__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__DIAGRAM_OBJECTS = LOAD_MGMT_FUNCTION__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__MRID = LOAD_MGMT_FUNCTION__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__ALIAS_NAME = LOAD_MGMT_FUNCTION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__NAME = LOAD_MGMT_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__MODELING_AUTHORITY_SET = LOAD_MGMT_FUNCTION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__ASSET = LOAD_MGMT_FUNCTION__ASSET;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__PASSWORD = LOAD_MGMT_FUNCTION__PASSWORD;

	/**
	 * The feature id for the '<em><b>Hardware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__HARDWARE_ID = LOAD_MGMT_FUNCTION__HARDWARE_ID;

	/**
	 * The feature id for the '<em><b>Firmware ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__FIRMWARE_ID = LOAD_MGMT_FUNCTION__FIRMWARE_ID;

	/**
	 * The feature id for the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__PROGRAM_ID = LOAD_MGMT_FUNCTION__PROGRAM_ID;

	/**
	 * The feature id for the '<em><b>Config ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__CONFIG_ID = LOAD_MGMT_FUNCTION__CONFIG_ID;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__REGISTERS = LOAD_MGMT_FUNCTION__REGISTERS;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__ENABLED = LOAD_MGMT_FUNCTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Com Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__COM_EQUIPMENT = LOAD_MGMT_FUNCTION__COM_EQUIPMENT;

	/**
	 * The feature id for the '<em><b>Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__SUPPORTED = LOAD_MGMT_FUNCTION__SUPPORTED;

	/**
	 * The feature id for the '<em><b>End Device Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__END_DEVICE_EVENTS = LOAD_MGMT_FUNCTION__END_DEVICE_EVENTS;

	/**
	 * The feature id for the '<em><b>End Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__END_DEVICE = LOAD_MGMT_FUNCTION__END_DEVICE;

	/**
	 * The feature id for the '<em><b>Scheduling Basis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__SCHEDULING_BASIS = LOAD_MGMT_FUNCTION__SCHEDULING_BASIS;

	/**
	 * The feature id for the '<em><b>Remote Over Ride</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__REMOTE_OVER_RIDE = LOAD_MGMT_FUNCTION__REMOTE_OVER_RIDE;

	/**
	 * The feature id for the '<em><b>Is Auto Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__IS_AUTO_OP = LOAD_MGMT_FUNCTION__IS_AUTO_OP;

	/**
	 * The feature id for the '<em><b>Load Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__LOAD_STATUS = LOAD_MGMT_FUNCTION__LOAD_STATUS;

	/**
	 * The feature id for the '<em><b>Switches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__SWITCHES = LOAD_MGMT_FUNCTION__SWITCHES;

	/**
	 * The feature id for the '<em><b>Manual Over Ride</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__MANUAL_OVER_RIDE = LOAD_MGMT_FUNCTION__MANUAL_OVER_RIDE;

	/**
	 * The feature id for the '<em><b>Load Mgmt Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__LOAD_MGMT_RECORDS = LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS;

	/**
	 * The feature id for the '<em><b>Over Ride Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__OVER_RIDE_TIME_OUT = LOAD_MGMT_FUNCTION__OVER_RIDE_TIME_OUT;

	/**
	 * The feature id for the '<em><b>Disconnect Time Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__DISCONNECT_TIME_DELAY = LOAD_MGMT_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Auto Recon Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__IS_AUTO_RECON_OP = LOAD_MGMT_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reconnect Time Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__RECONNECT_TIME_DELAY = LOAD_MGMT_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Maximum Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION__MAXIMUM_LOAD = LOAD_MGMT_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Load Limit Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION_FEATURE_COUNT = LOAD_MGMT_FUNCTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Load Limit Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_LIMIT_FUNCTION_OPERATION_COUNT = LOAD_MGMT_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtKind <em>Load Mgmt Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtKind
	 * @see CIM15.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadMgmtKind()
	 * @generated
	 */
	public static final int LOAD_MGMT_KIND = 4;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadStateKind <em>Load State Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadStateKind
	 * @see CIM15.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadStateKind()
	 * @generated
	 */
	public static final int LOAD_STATE_KIND = 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadMgmtRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadShedFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadMgmtFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadLimitFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum loadMgmtKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum loadStateKindEEnum = null;

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
	 * @see CIM15.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InfLoadControlPackage() {
		super(eNS_URI, InfLoadControlFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link InfLoadControlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static InfLoadControlPackage init() {
		if (isInited) return (InfLoadControlPackage)EPackage.Registry.INSTANCE.getEPackage(InfLoadControlPackage.eNS_URI);

		// Obtain or create and register package
		InfLoadControlPackage theInfLoadControlPackage = (InfLoadControlPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InfLoadControlPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InfLoadControlPackage());

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
		theInfLoadControlPackage.fixPackageContents();
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
		theInfLoadControlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InfLoadControlPackage.eNS_URI, theInfLoadControlPackage);
		return theInfLoadControlPackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtRecord <em>Load Mgmt Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Mgmt Record</em>'.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtRecord
	 * @generated
	 */
	public EClass getLoadMgmtRecord() {
		if (loadMgmtRecordEClass == null) {
			loadMgmtRecordEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfLoadControlPackage.eNS_URI).getEClassifiers().get(1);
		}
		return loadMgmtRecordEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtRecord#getLoadMgmtFunction <em>Load Mgmt Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Mgmt Function</em>'.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtRecord#getLoadMgmtFunction()
	 * @see #getLoadMgmtRecord()
	 * @generated
	 */
	public EReference getLoadMgmtRecord_LoadMgmtFunction() {
        return (EReference)getLoadMgmtRecord().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtRecord#getLoadReduction <em>Load Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Reduction</em>'.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtRecord#getLoadReduction()
	 * @see #getLoadMgmtRecord()
	 * @generated
	 */
	public EAttribute getLoadMgmtRecord_LoadReduction() {
        return (EAttribute)getLoadMgmtRecord().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadShedFunction <em>Load Shed Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Shed Function</em>'.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadShedFunction
	 * @generated
	 */
	public EClass getLoadShedFunction() {
		if (loadShedFunctionEClass == null) {
			loadShedFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfLoadControlPackage.eNS_URI).getEClassifiers().get(2);
		}
		return loadShedFunctionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadShedFunction#getSwitchedLoad <em>Switched Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Switched Load</em>'.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadShedFunction#getSwitchedLoad()
	 * @see #getLoadShedFunction()
	 * @generated
	 */
	public EAttribute getLoadShedFunction_SwitchedLoad() {
        return (EAttribute)getLoadShedFunction().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction <em>Load Mgmt Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Mgmt Function</em>'.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction
	 * @generated
	 */
	public EClass getLoadMgmtFunction() {
		if (loadMgmtFunctionEClass == null) {
			loadMgmtFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfLoadControlPackage.eNS_URI).getEClassifiers().get(3);
		}
		return loadMgmtFunctionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getSchedulingBasis <em>Scheduling Basis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduling Basis</em>'.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getSchedulingBasis()
	 * @see #getLoadMgmtFunction()
	 * @generated
	 */
	public EAttribute getLoadMgmtFunction_SchedulingBasis() {
        return (EAttribute)getLoadMgmtFunction().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isRemoteOverRide <em>Remote Over Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Over Ride</em>'.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isRemoteOverRide()
	 * @see #getLoadMgmtFunction()
	 * @generated
	 */
	public EAttribute getLoadMgmtFunction_RemoteOverRide() {
        return (EAttribute)getLoadMgmtFunction().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isIsAutoOp <em>Is Auto Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Auto Op</em>'.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isIsAutoOp()
	 * @see #getLoadMgmtFunction()
	 * @generated
	 */
	public EAttribute getLoadMgmtFunction_IsAutoOp() {
        return (EAttribute)getLoadMgmtFunction().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getLoadStatus <em>Load Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Status</em>'.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getLoadStatus()
	 * @see #getLoadMgmtFunction()
	 * @generated
	 */
	public EAttribute getLoadMgmtFunction_LoadStatus() {
        return (EAttribute)getLoadMgmtFunction().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getSwitches <em>Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Switches</em>'.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getSwitches()
	 * @see #getLoadMgmtFunction()
	 * @generated
	 */
	public EReference getLoadMgmtFunction_Switches() {
        return (EReference)getLoadMgmtFunction().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isManualOverRide <em>Manual Over Ride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manual Over Ride</em>'.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isManualOverRide()
	 * @see #getLoadMgmtFunction()
	 * @generated
	 */
	public EAttribute getLoadMgmtFunction_ManualOverRide() {
        return (EAttribute)getLoadMgmtFunction().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getLoadMgmtRecords <em>Load Mgmt Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Load Mgmt Records</em>'.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getLoadMgmtRecords()
	 * @see #getLoadMgmtFunction()
	 * @generated
	 */
	public EReference getLoadMgmtFunction_LoadMgmtRecords() {
        return (EReference)getLoadMgmtFunction().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getOverRideTimeOut <em>Over Ride Time Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Over Ride Time Out</em>'.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getOverRideTimeOut()
	 * @see #getLoadMgmtFunction()
	 * @generated
	 */
	public EAttribute getLoadMgmtFunction_OverRideTimeOut() {
        return (EAttribute)getLoadMgmtFunction().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction <em>Load Limit Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Limit Function</em>'.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction
	 * @generated
	 */
	public EClass getLoadLimitFunction() {
		if (loadLimitFunctionEClass == null) {
			loadLimitFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(InfLoadControlPackage.eNS_URI).getEClassifiers().get(4);
		}
		return loadLimitFunctionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getDisconnectTimeDelay <em>Disconnect Time Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disconnect Time Delay</em>'.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getDisconnectTimeDelay()
	 * @see #getLoadLimitFunction()
	 * @generated
	 */
	public EAttribute getLoadLimitFunction_DisconnectTimeDelay() {
        return (EAttribute)getLoadLimitFunction().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction#isIsAutoReconOp <em>Is Auto Recon Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Auto Recon Op</em>'.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction#isIsAutoReconOp()
	 * @see #getLoadLimitFunction()
	 * @generated
	 */
	public EAttribute getLoadLimitFunction_IsAutoReconOp() {
        return (EAttribute)getLoadLimitFunction().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getReconnectTimeDelay <em>Reconnect Time Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reconnect Time Delay</em>'.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getReconnectTimeDelay()
	 * @see #getLoadLimitFunction()
	 * @generated
	 */
	public EAttribute getLoadLimitFunction_ReconnectTimeDelay() {
        return (EAttribute)getLoadLimitFunction().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getMaximumLoad <em>Maximum Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Load</em>'.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getMaximumLoad()
	 * @see #getLoadLimitFunction()
	 * @generated
	 */
	public EAttribute getLoadLimitFunction_MaximumLoad() {
        return (EAttribute)getLoadLimitFunction().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtKind <em>Load Mgmt Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Load Mgmt Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtKind
	 * @generated
	 */
	public EEnum getLoadMgmtKind() {
		if (loadMgmtKindEEnum == null) {
			loadMgmtKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfLoadControlPackage.eNS_URI).getEClassifiers().get(0);
		}
		return loadMgmtKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadStateKind <em>Load State Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Load State Kind</em>'.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadStateKind
	 * @generated
	 */
	public EEnum getLoadStateKind() {
		if (loadStateKindEEnum == null) {
			loadStateKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(InfLoadControlPackage.eNS_URI).getEClassifiers().get(5);
		}
		return loadStateKindEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public InfLoadControlFactory getInfLoadControlFactory() {
		return (InfLoadControlFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM15.IEC61970.Informative.InfLoadControl." + eClassifier.getName());
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
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtRecord <em>Load Mgmt Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtRecord
		 * @see CIM15.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadMgmtRecord()
		 * @generated
		 */
		public static final EClass LOAD_MGMT_RECORD = eINSTANCE.getLoadMgmtRecord();

		/**
		 * The meta object literal for the '<em><b>Load Mgmt Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOAD_MGMT_RECORD__LOAD_MGMT_FUNCTION = eINSTANCE.getLoadMgmtRecord_LoadMgmtFunction();

		/**
		 * The meta object literal for the '<em><b>Load Reduction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOAD_MGMT_RECORD__LOAD_REDUCTION = eINSTANCE.getLoadMgmtRecord_LoadReduction();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadShedFunction <em>Load Shed Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadShedFunction
		 * @see CIM15.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadShedFunction()
		 * @generated
		 */
		public static final EClass LOAD_SHED_FUNCTION = eINSTANCE.getLoadShedFunction();

		/**
		 * The meta object literal for the '<em><b>Switched Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOAD_SHED_FUNCTION__SWITCHED_LOAD = eINSTANCE.getLoadShedFunction_SwitchedLoad();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction <em>Load Mgmt Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction
		 * @see CIM15.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadMgmtFunction()
		 * @generated
		 */
		public static final EClass LOAD_MGMT_FUNCTION = eINSTANCE.getLoadMgmtFunction();

		/**
		 * The meta object literal for the '<em><b>Scheduling Basis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOAD_MGMT_FUNCTION__SCHEDULING_BASIS = eINSTANCE.getLoadMgmtFunction_SchedulingBasis();

		/**
		 * The meta object literal for the '<em><b>Remote Over Ride</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOAD_MGMT_FUNCTION__REMOTE_OVER_RIDE = eINSTANCE.getLoadMgmtFunction_RemoteOverRide();

		/**
		 * The meta object literal for the '<em><b>Is Auto Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOAD_MGMT_FUNCTION__IS_AUTO_OP = eINSTANCE.getLoadMgmtFunction_IsAutoOp();

		/**
		 * The meta object literal for the '<em><b>Load Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOAD_MGMT_FUNCTION__LOAD_STATUS = eINSTANCE.getLoadMgmtFunction_LoadStatus();

		/**
		 * The meta object literal for the '<em><b>Switches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOAD_MGMT_FUNCTION__SWITCHES = eINSTANCE.getLoadMgmtFunction_Switches();

		/**
		 * The meta object literal for the '<em><b>Manual Over Ride</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOAD_MGMT_FUNCTION__MANUAL_OVER_RIDE = eINSTANCE.getLoadMgmtFunction_ManualOverRide();

		/**
		 * The meta object literal for the '<em><b>Load Mgmt Records</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS = eINSTANCE.getLoadMgmtFunction_LoadMgmtRecords();

		/**
		 * The meta object literal for the '<em><b>Over Ride Time Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOAD_MGMT_FUNCTION__OVER_RIDE_TIME_OUT = eINSTANCE.getLoadMgmtFunction_OverRideTimeOut();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction <em>Load Limit Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction
		 * @see CIM15.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadLimitFunction()
		 * @generated
		 */
		public static final EClass LOAD_LIMIT_FUNCTION = eINSTANCE.getLoadLimitFunction();

		/**
		 * The meta object literal for the '<em><b>Disconnect Time Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOAD_LIMIT_FUNCTION__DISCONNECT_TIME_DELAY = eINSTANCE.getLoadLimitFunction_DisconnectTimeDelay();

		/**
		 * The meta object literal for the '<em><b>Is Auto Recon Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOAD_LIMIT_FUNCTION__IS_AUTO_RECON_OP = eINSTANCE.getLoadLimitFunction_IsAutoReconOp();

		/**
		 * The meta object literal for the '<em><b>Reconnect Time Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOAD_LIMIT_FUNCTION__RECONNECT_TIME_DELAY = eINSTANCE.getLoadLimitFunction_ReconnectTimeDelay();

		/**
		 * The meta object literal for the '<em><b>Maximum Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LOAD_LIMIT_FUNCTION__MAXIMUM_LOAD = eINSTANCE.getLoadLimitFunction_MaximumLoad();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtKind <em>Load Mgmt Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtKind
		 * @see CIM15.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadMgmtKind()
		 * @generated
		 */
		public static final EEnum LOAD_MGMT_KIND = eINSTANCE.getLoadMgmtKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadStateKind <em>Load State Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadStateKind
		 * @see CIM15.IEC61970.Informative.InfLoadControl.InfLoadControlPackage#getLoadStateKind()
		 * @generated
		 */
		public static final EEnum LOAD_STATE_KIND = eINSTANCE.getLoadStateKind();

	}

} //InfLoadControlPackage
