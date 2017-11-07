/**
 */
package CIM15.IEC61970.StateVariables;

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

import CIM15.IEC61970.LoadModel.LoadModelPackage;

import CIM15.IEC61970.Meas.MeasPackage;

import CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage;

import CIM15.IEC61970.Outage.OutagePackage;

import CIM15.IEC61970.Protection.ProtectionPackage;

import CIM15.IEC61970.SCADA.SCADAPackage;

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
 * @see CIM15.IEC61970.StateVariables.StateVariablesFactory
 * @generated
 */
public class StateVariablesPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "StateVariables";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#StateVariables";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimStateVariables";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StateVariablesPackage eINSTANCE = CIM15.IEC61970.StateVariables.StateVariablesPackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.StateVariables.StateVariable <em>State Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.StateVariables.StateVariable
	 * @see CIM15.IEC61970.StateVariables.StateVariablesPackage#getStateVariable()
	 * @generated
	 */
	public static final int STATE_VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_VARIABLE__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The number of structural features of the '<em>State Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_VARIABLE_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>State Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STATE_VARIABLE_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.StateVariables.SvVoltage <em>Sv Voltage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.StateVariables.SvVoltage
	 * @see CIM15.IEC61970.StateVariables.StateVariablesPackage#getSvVoltage()
	 * @generated
	 */
	public static final int SV_VOLTAGE = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_VOLTAGE__UUID = STATE_VARIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_VOLTAGE__ANGLE = STATE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_VOLTAGE__TOPOLOGICAL_NODE = STATE_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_VOLTAGE__V = STATE_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sv Voltage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_VOLTAGE_FEATURE_COUNT = STATE_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sv Voltage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_VOLTAGE_OPERATION_COUNT = STATE_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.StateVariables.SvShortCircuit <em>Sv Short Circuit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.StateVariables.SvShortCircuit
	 * @see CIM15.IEC61970.StateVariables.StateVariablesPackage#getSvShortCircuit()
	 * @generated
	 */
	public static final int SV_SHORT_CIRCUIT = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_SHORT_CIRCUIT__UUID = STATE_VARIABLE__UUID;

	/**
	 * The feature id for the '<em><b>SShort Circuit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_SHORT_CIRCUIT__SSHORT_CIRCUIT = STATE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>R0 Per R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_SHORT_CIRCUIT__R0_PER_R = STATE_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>X0 Per X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_SHORT_CIRCUIT__X0_PER_X = STATE_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>XPer R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_SHORT_CIRCUIT__XPER_R = STATE_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_SHORT_CIRCUIT__TOPOLOGICAL_NODE = STATE_VARIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Sv Short Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_SHORT_CIRCUIT_FEATURE_COUNT = STATE_VARIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Sv Short Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_SHORT_CIRCUIT_OPERATION_COUNT = STATE_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.StateVariables.SvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.StateVariables.SvShuntCompensatorSections
	 * @see CIM15.IEC61970.StateVariables.StateVariablesPackage#getSvShuntCompensatorSections()
	 * @generated
	 */
	public static final int SV_SHUNT_COMPENSATOR_SECTIONS = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_SHUNT_COMPENSATOR_SECTIONS__UUID = STATE_VARIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_SHUNT_COMPENSATOR_SECTIONS__SECTIONS = STATE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shunt Compensator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR = STATE_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sv Shunt Compensator Sections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_SHUNT_COMPENSATOR_SECTIONS_FEATURE_COUNT = STATE_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sv Shunt Compensator Sections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_SHUNT_COMPENSATOR_SECTIONS_OPERATION_COUNT = STATE_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.StateVariables.SvTapStep <em>Sv Tap Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.StateVariables.SvTapStep
	 * @see CIM15.IEC61970.StateVariables.StateVariablesPackage#getSvTapStep()
	 * @generated
	 */
	public static final int SV_TAP_STEP = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_TAP_STEP__UUID = STATE_VARIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Tap Changer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_TAP_STEP__TAP_CHANGER = STATE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_TAP_STEP__POSITION = STATE_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sv Tap Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_TAP_STEP_FEATURE_COUNT = STATE_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sv Tap Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_TAP_STEP_OPERATION_COUNT = STATE_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.StateVariables.SvStatus <em>Sv Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.StateVariables.SvStatus
	 * @see CIM15.IEC61970.StateVariables.StateVariablesPackage#getSvStatus()
	 * @generated
	 */
	public static final int SV_STATUS = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_STATUS__UUID = STATE_VARIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Conducting Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_STATUS__CONDUCTING_EQUIPMENT = STATE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_STATUS__IN_SERVICE = STATE_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sv Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_STATUS_FEATURE_COUNT = STATE_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sv Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_STATUS_OPERATION_COUNT = STATE_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.StateVariables.SvInjection <em>Sv Injection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.StateVariables.SvInjection
	 * @see CIM15.IEC61970.StateVariables.StateVariablesPackage#getSvInjection()
	 * @generated
	 */
	public static final int SV_INJECTION = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_INJECTION__UUID = STATE_VARIABLE__UUID;

	/**
	 * The feature id for the '<em><b>PNet Injection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_INJECTION__PNET_INJECTION = STATE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>QNet Injection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_INJECTION__QNET_INJECTION = STATE_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Topological Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_INJECTION__TOPOLOGICAL_NODE = STATE_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sv Injection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_INJECTION_FEATURE_COUNT = STATE_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sv Injection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_INJECTION_OPERATION_COUNT = STATE_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.StateVariables.SvPowerFlow <em>Sv Power Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.StateVariables.SvPowerFlow
	 * @see CIM15.IEC61970.StateVariables.StateVariablesPackage#getSvPowerFlow()
	 * @generated
	 */
	public static final int SV_POWER_FLOW = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_POWER_FLOW__UUID = STATE_VARIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_POWER_FLOW__TERMINAL = STATE_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_POWER_FLOW__P = STATE_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_POWER_FLOW__Q = STATE_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sv Power Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_POWER_FLOW_FEATURE_COUNT = STATE_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sv Power Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SV_POWER_FLOW_OPERATION_COUNT = STATE_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.StateVariables.TopologicalIsland <em>Topological Island</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.StateVariables.TopologicalIsland
	 * @see CIM15.IEC61970.StateVariables.StateVariablesPackage#getTopologicalIsland()
	 * @generated
	 */
	public static final int TOPOLOGICAL_ISLAND = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOPOLOGICAL_ISLAND__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOPOLOGICAL_ISLAND__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOPOLOGICAL_ISLAND__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOPOLOGICAL_ISLAND__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOPOLOGICAL_ISLAND__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOPOLOGICAL_ISLAND__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOPOLOGICAL_ISLAND__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Angle Ref Topological Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Topological Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Topological Island</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOPOLOGICAL_ISLAND_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Topological Island</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TOPOLOGICAL_ISLAND_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svVoltageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svShortCircuitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svShuntCompensatorSectionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svTapStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svInjectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svPowerFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topologicalIslandEClass = null;

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
	 * @see CIM15.IEC61970.StateVariables.StateVariablesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StateVariablesPackage() {
		super(eNS_URI, StateVariablesFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link StateVariablesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static StateVariablesPackage init() {
		if (isInited) return (StateVariablesPackage)EPackage.Registry.INSTANCE.getEPackage(StateVariablesPackage.eNS_URI);

		// Obtain or create and register package
		StateVariablesPackage theStateVariablesPackage = (StateVariablesPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StateVariablesPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StateVariablesPackage());

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
		theStateVariablesPackage.fixPackageContents();
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
		theStateVariablesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StateVariablesPackage.eNS_URI, theStateVariablesPackage);
		return theStateVariablesPackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.StateVariables.SvVoltage <em>Sv Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sv Voltage</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvVoltage
	 * @generated
	 */
	public EClass getSvVoltage() {
		if (svVoltageEClass == null) {
			svVoltageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StateVariablesPackage.eNS_URI).getEClassifiers().get(0);
		}
		return svVoltageEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.StateVariables.SvVoltage#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvVoltage#getAngle()
	 * @see #getSvVoltage()
	 * @generated
	 */
	public EAttribute getSvVoltage_Angle() {
        return (EAttribute)getSvVoltage().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.StateVariables.SvVoltage#getTopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topological Node</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvVoltage#getTopologicalNode()
	 * @see #getSvVoltage()
	 * @generated
	 */
	public EReference getSvVoltage_TopologicalNode() {
        return (EReference)getSvVoltage().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.StateVariables.SvVoltage#getV <em>V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvVoltage#getV()
	 * @see #getSvVoltage()
	 * @generated
	 */
	public EAttribute getSvVoltage_V() {
        return (EAttribute)getSvVoltage().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.StateVariables.SvShortCircuit <em>Sv Short Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sv Short Circuit</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvShortCircuit
	 * @generated
	 */
	public EClass getSvShortCircuit() {
		if (svShortCircuitEClass == null) {
			svShortCircuitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StateVariablesPackage.eNS_URI).getEClassifiers().get(1);
		}
		return svShortCircuitEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.StateVariables.SvShortCircuit#getSShortCircuit <em>SShort Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SShort Circuit</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvShortCircuit#getSShortCircuit()
	 * @see #getSvShortCircuit()
	 * @generated
	 */
	public EAttribute getSvShortCircuit_SShortCircuit() {
        return (EAttribute)getSvShortCircuit().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.StateVariables.SvShortCircuit#getR0PerR <em>R0 Per R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R0 Per R</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvShortCircuit#getR0PerR()
	 * @see #getSvShortCircuit()
	 * @generated
	 */
	public EAttribute getSvShortCircuit_R0PerR() {
        return (EAttribute)getSvShortCircuit().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.StateVariables.SvShortCircuit#getX0PerX <em>X0 Per X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X0 Per X</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvShortCircuit#getX0PerX()
	 * @see #getSvShortCircuit()
	 * @generated
	 */
	public EAttribute getSvShortCircuit_X0PerX() {
        return (EAttribute)getSvShortCircuit().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.StateVariables.SvShortCircuit#getXPerR <em>XPer R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPer R</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvShortCircuit#getXPerR()
	 * @see #getSvShortCircuit()
	 * @generated
	 */
	public EAttribute getSvShortCircuit_XPerR() {
        return (EAttribute)getSvShortCircuit().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.StateVariables.SvShortCircuit#getTopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topological Node</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvShortCircuit#getTopologicalNode()
	 * @see #getSvShortCircuit()
	 * @generated
	 */
	public EReference getSvShortCircuit_TopologicalNode() {
        return (EReference)getSvShortCircuit().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.StateVariables.SvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sv Shunt Compensator Sections</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvShuntCompensatorSections
	 * @generated
	 */
	public EClass getSvShuntCompensatorSections() {
		if (svShuntCompensatorSectionsEClass == null) {
			svShuntCompensatorSectionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StateVariablesPackage.eNS_URI).getEClassifiers().get(2);
		}
		return svShuntCompensatorSectionsEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.StateVariables.SvShuntCompensatorSections#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sections</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvShuntCompensatorSections#getSections()
	 * @see #getSvShuntCompensatorSections()
	 * @generated
	 */
	public EAttribute getSvShuntCompensatorSections_Sections() {
        return (EAttribute)getSvShuntCompensatorSections().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.StateVariables.SvShuntCompensatorSections#getShuntCompensator <em>Shunt Compensator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shunt Compensator</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvShuntCompensatorSections#getShuntCompensator()
	 * @see #getSvShuntCompensatorSections()
	 * @generated
	 */
	public EReference getSvShuntCompensatorSections_ShuntCompensator() {
        return (EReference)getSvShuntCompensatorSections().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.StateVariables.StateVariable <em>State Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Variable</em>'.
	 * @see CIM15.IEC61970.StateVariables.StateVariable
	 * @generated
	 */
	public EClass getStateVariable() {
		if (stateVariableEClass == null) {
			stateVariableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StateVariablesPackage.eNS_URI).getEClassifiers().get(3);
		}
		return stateVariableEClass;
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.StateVariables.SvTapStep <em>Sv Tap Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sv Tap Step</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvTapStep
	 * @generated
	 */
	public EClass getSvTapStep() {
		if (svTapStepEClass == null) {
			svTapStepEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StateVariablesPackage.eNS_URI).getEClassifiers().get(4);
		}
		return svTapStepEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.StateVariables.SvTapStep#getTapChanger <em>Tap Changer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tap Changer</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvTapStep#getTapChanger()
	 * @see #getSvTapStep()
	 * @generated
	 */
	public EReference getSvTapStep_TapChanger() {
        return (EReference)getSvTapStep().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.StateVariables.SvTapStep#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvTapStep#getPosition()
	 * @see #getSvTapStep()
	 * @generated
	 */
	public EAttribute getSvTapStep_Position() {
        return (EAttribute)getSvTapStep().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.StateVariables.SvStatus <em>Sv Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sv Status</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvStatus
	 * @generated
	 */
	public EClass getSvStatus() {
		if (svStatusEClass == null) {
			svStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StateVariablesPackage.eNS_URI).getEClassifiers().get(5);
		}
		return svStatusEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.StateVariables.SvStatus#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conducting Equipment</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvStatus#getConductingEquipment()
	 * @see #getSvStatus()
	 * @generated
	 */
	public EReference getSvStatus_ConductingEquipment() {
        return (EReference)getSvStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.StateVariables.SvStatus#isInService <em>In Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Service</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvStatus#isInService()
	 * @see #getSvStatus()
	 * @generated
	 */
	public EAttribute getSvStatus_InService() {
        return (EAttribute)getSvStatus().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.StateVariables.SvInjection <em>Sv Injection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sv Injection</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvInjection
	 * @generated
	 */
	public EClass getSvInjection() {
		if (svInjectionEClass == null) {
			svInjectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StateVariablesPackage.eNS_URI).getEClassifiers().get(6);
		}
		return svInjectionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.StateVariables.SvInjection#getPNetInjection <em>PNet Injection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PNet Injection</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvInjection#getPNetInjection()
	 * @see #getSvInjection()
	 * @generated
	 */
	public EAttribute getSvInjection_PNetInjection() {
        return (EAttribute)getSvInjection().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.StateVariables.SvInjection#getQNetInjection <em>QNet Injection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QNet Injection</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvInjection#getQNetInjection()
	 * @see #getSvInjection()
	 * @generated
	 */
	public EAttribute getSvInjection_QNetInjection() {
        return (EAttribute)getSvInjection().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.StateVariables.SvInjection#getTopologicalNode <em>Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topological Node</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvInjection#getTopologicalNode()
	 * @see #getSvInjection()
	 * @generated
	 */
	public EReference getSvInjection_TopologicalNode() {
        return (EReference)getSvInjection().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.StateVariables.SvPowerFlow <em>Sv Power Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sv Power Flow</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvPowerFlow
	 * @generated
	 */
	public EClass getSvPowerFlow() {
		if (svPowerFlowEClass == null) {
			svPowerFlowEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StateVariablesPackage.eNS_URI).getEClassifiers().get(7);
		}
		return svPowerFlowEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.StateVariables.SvPowerFlow#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvPowerFlow#getTerminal()
	 * @see #getSvPowerFlow()
	 * @generated
	 */
	public EReference getSvPowerFlow_Terminal() {
        return (EReference)getSvPowerFlow().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.StateVariables.SvPowerFlow#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>P</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvPowerFlow#getP()
	 * @see #getSvPowerFlow()
	 * @generated
	 */
	public EAttribute getSvPowerFlow_P() {
        return (EAttribute)getSvPowerFlow().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.StateVariables.SvPowerFlow#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Q</em>'.
	 * @see CIM15.IEC61970.StateVariables.SvPowerFlow#getQ()
	 * @see #getSvPowerFlow()
	 * @generated
	 */
	public EAttribute getSvPowerFlow_Q() {
        return (EAttribute)getSvPowerFlow().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.StateVariables.TopologicalIsland <em>Topological Island</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topological Island</em>'.
	 * @see CIM15.IEC61970.StateVariables.TopologicalIsland
	 * @generated
	 */
	public EClass getTopologicalIsland() {
		if (topologicalIslandEClass == null) {
			topologicalIslandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(StateVariablesPackage.eNS_URI).getEClassifiers().get(8);
		}
		return topologicalIslandEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.StateVariables.TopologicalIsland#getAngleRef_TopologicalNode <em>Angle Ref Topological Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Angle Ref Topological Node</em>'.
	 * @see CIM15.IEC61970.StateVariables.TopologicalIsland#getAngleRef_TopologicalNode()
	 * @see #getTopologicalIsland()
	 * @generated
	 */
	public EReference getTopologicalIsland_AngleRef_TopologicalNode() {
        return (EReference)getTopologicalIsland().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.StateVariables.TopologicalIsland#getTopologicalNodes <em>Topological Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Topological Nodes</em>'.
	 * @see CIM15.IEC61970.StateVariables.TopologicalIsland#getTopologicalNodes()
	 * @see #getTopologicalIsland()
	 * @generated
	 */
	public EReference getTopologicalIsland_TopologicalNodes() {
        return (EReference)getTopologicalIsland().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public StateVariablesFactory getStateVariablesFactory() {
		return (StateVariablesFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM15.IEC61970.StateVariables." + eClassifier.getName());
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
		 * The meta object literal for the '{@link CIM15.IEC61970.StateVariables.SvVoltage <em>Sv Voltage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.StateVariables.SvVoltage
		 * @see CIM15.IEC61970.StateVariables.StateVariablesPackage#getSvVoltage()
		 * @generated
		 */
		public static final EClass SV_VOLTAGE = eINSTANCE.getSvVoltage();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SV_VOLTAGE__ANGLE = eINSTANCE.getSvVoltage_Angle();

		/**
		 * The meta object literal for the '<em><b>Topological Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SV_VOLTAGE__TOPOLOGICAL_NODE = eINSTANCE.getSvVoltage_TopologicalNode();

		/**
		 * The meta object literal for the '<em><b>V</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SV_VOLTAGE__V = eINSTANCE.getSvVoltage_V();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.StateVariables.SvShortCircuit <em>Sv Short Circuit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.StateVariables.SvShortCircuit
		 * @see CIM15.IEC61970.StateVariables.StateVariablesPackage#getSvShortCircuit()
		 * @generated
		 */
		public static final EClass SV_SHORT_CIRCUIT = eINSTANCE.getSvShortCircuit();

		/**
		 * The meta object literal for the '<em><b>SShort Circuit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SV_SHORT_CIRCUIT__SSHORT_CIRCUIT = eINSTANCE.getSvShortCircuit_SShortCircuit();

		/**
		 * The meta object literal for the '<em><b>R0 Per R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SV_SHORT_CIRCUIT__R0_PER_R = eINSTANCE.getSvShortCircuit_R0PerR();

		/**
		 * The meta object literal for the '<em><b>X0 Per X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SV_SHORT_CIRCUIT__X0_PER_X = eINSTANCE.getSvShortCircuit_X0PerX();

		/**
		 * The meta object literal for the '<em><b>XPer R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SV_SHORT_CIRCUIT__XPER_R = eINSTANCE.getSvShortCircuit_XPerR();

		/**
		 * The meta object literal for the '<em><b>Topological Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SV_SHORT_CIRCUIT__TOPOLOGICAL_NODE = eINSTANCE.getSvShortCircuit_TopologicalNode();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.StateVariables.SvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.StateVariables.SvShuntCompensatorSections
		 * @see CIM15.IEC61970.StateVariables.StateVariablesPackage#getSvShuntCompensatorSections()
		 * @generated
		 */
		public static final EClass SV_SHUNT_COMPENSATOR_SECTIONS = eINSTANCE.getSvShuntCompensatorSections();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SV_SHUNT_COMPENSATOR_SECTIONS__SECTIONS = eINSTANCE.getSvShuntCompensatorSections_Sections();

		/**
		 * The meta object literal for the '<em><b>Shunt Compensator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR = eINSTANCE.getSvShuntCompensatorSections_ShuntCompensator();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.StateVariables.StateVariable <em>State Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.StateVariables.StateVariable
		 * @see CIM15.IEC61970.StateVariables.StateVariablesPackage#getStateVariable()
		 * @generated
		 */
		public static final EClass STATE_VARIABLE = eINSTANCE.getStateVariable();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.StateVariables.SvTapStep <em>Sv Tap Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.StateVariables.SvTapStep
		 * @see CIM15.IEC61970.StateVariables.StateVariablesPackage#getSvTapStep()
		 * @generated
		 */
		public static final EClass SV_TAP_STEP = eINSTANCE.getSvTapStep();

		/**
		 * The meta object literal for the '<em><b>Tap Changer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SV_TAP_STEP__TAP_CHANGER = eINSTANCE.getSvTapStep_TapChanger();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SV_TAP_STEP__POSITION = eINSTANCE.getSvTapStep_Position();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.StateVariables.SvStatus <em>Sv Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.StateVariables.SvStatus
		 * @see CIM15.IEC61970.StateVariables.StateVariablesPackage#getSvStatus()
		 * @generated
		 */
		public static final EClass SV_STATUS = eINSTANCE.getSvStatus();

		/**
		 * The meta object literal for the '<em><b>Conducting Equipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SV_STATUS__CONDUCTING_EQUIPMENT = eINSTANCE.getSvStatus_ConductingEquipment();

		/**
		 * The meta object literal for the '<em><b>In Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SV_STATUS__IN_SERVICE = eINSTANCE.getSvStatus_InService();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.StateVariables.SvInjection <em>Sv Injection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.StateVariables.SvInjection
		 * @see CIM15.IEC61970.StateVariables.StateVariablesPackage#getSvInjection()
		 * @generated
		 */
		public static final EClass SV_INJECTION = eINSTANCE.getSvInjection();

		/**
		 * The meta object literal for the '<em><b>PNet Injection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SV_INJECTION__PNET_INJECTION = eINSTANCE.getSvInjection_PNetInjection();

		/**
		 * The meta object literal for the '<em><b>QNet Injection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SV_INJECTION__QNET_INJECTION = eINSTANCE.getSvInjection_QNetInjection();

		/**
		 * The meta object literal for the '<em><b>Topological Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SV_INJECTION__TOPOLOGICAL_NODE = eINSTANCE.getSvInjection_TopologicalNode();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.StateVariables.SvPowerFlow <em>Sv Power Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.StateVariables.SvPowerFlow
		 * @see CIM15.IEC61970.StateVariables.StateVariablesPackage#getSvPowerFlow()
		 * @generated
		 */
		public static final EClass SV_POWER_FLOW = eINSTANCE.getSvPowerFlow();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SV_POWER_FLOW__TERMINAL = eINSTANCE.getSvPowerFlow_Terminal();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SV_POWER_FLOW__P = eINSTANCE.getSvPowerFlow_P();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SV_POWER_FLOW__Q = eINSTANCE.getSvPowerFlow_Q();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.StateVariables.TopologicalIsland <em>Topological Island</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.StateVariables.TopologicalIsland
		 * @see CIM15.IEC61970.StateVariables.StateVariablesPackage#getTopologicalIsland()
		 * @generated
		 */
		public static final EClass TOPOLOGICAL_ISLAND = eINSTANCE.getTopologicalIsland();

		/**
		 * The meta object literal for the '<em><b>Angle Ref Topological Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE = eINSTANCE.getTopologicalIsland_AngleRef_TopologicalNode();

		/**
		 * The meta object literal for the '<em><b>Topological Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES = eINSTANCE.getTopologicalIsland_TopologicalNodes();

	}

} //StateVariablesPackage
