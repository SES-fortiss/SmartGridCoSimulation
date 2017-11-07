/**
 */
package CIM15.IEC61970.OperationalLimits;

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
 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsFactory
 * @generated
 */
public class OperationalLimitsPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "OperationalLimits";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#OperationalLimits";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimOperationalLimits";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OperationalLimitsPackage eINSTANCE = CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.OperationalLimits.OperationalLimit <em>Operational Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimit
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getOperationalLimit()
	 * @generated
	 */
	public static final int OPERATIONAL_LIMIT = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Operational Limit Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operational Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operational Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.OperationalLimits.ApparentPowerLimit <em>Apparent Power Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.OperationalLimits.ApparentPowerLimit
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getApparentPowerLimit()
	 * @generated
	 */
	public static final int APPARENT_POWER_LIMIT = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT__UUID = OPERATIONAL_LIMIT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT__NAMES = OPERATIONAL_LIMIT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT__DIAGRAM_OBJECTS = OPERATIONAL_LIMIT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT__MRID = OPERATIONAL_LIMIT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT__ALIAS_NAME = OPERATIONAL_LIMIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT__NAME = OPERATIONAL_LIMIT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT__MODELING_AUTHORITY_SET = OPERATIONAL_LIMIT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Operational Limit Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT__OPERATIONAL_LIMIT_TYPE = OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT__OPERATIONAL_LIMIT_SET = OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Apparent Power Limit Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT__APPARENT_POWER_LIMIT_SET = OPERATIONAL_LIMIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT__VALUE = OPERATIONAL_LIMIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Apparent Power Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT_FEATURE_COUNT = OPERATIONAL_LIMIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Apparent Power Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT_OPERATION_COUNT = OPERATIONAL_LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.OperationalLimits.ActivePowerLimit <em>Active Power Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.OperationalLimits.ActivePowerLimit
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getActivePowerLimit()
	 * @generated
	 */
	public static final int ACTIVE_POWER_LIMIT = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT__UUID = OPERATIONAL_LIMIT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT__NAMES = OPERATIONAL_LIMIT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT__DIAGRAM_OBJECTS = OPERATIONAL_LIMIT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT__MRID = OPERATIONAL_LIMIT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT__ALIAS_NAME = OPERATIONAL_LIMIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT__NAME = OPERATIONAL_LIMIT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT__MODELING_AUTHORITY_SET = OPERATIONAL_LIMIT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Operational Limit Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT__OPERATIONAL_LIMIT_TYPE = OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT__OPERATIONAL_LIMIT_SET = OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Active Power Limit Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT__ACTIVE_POWER_LIMIT_SET = OPERATIONAL_LIMIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT__VALUE = OPERATIONAL_LIMIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Active Power Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT_FEATURE_COUNT = OPERATIONAL_LIMIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Active Power Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT_OPERATION_COUNT = OPERATIONAL_LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.OperationalLimits.OperationalLimitType <em>Operational Limit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitType
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getOperationalLimitType()
	 * @generated
	 */
	public static final int OPERATIONAL_LIMIT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_TYPE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_TYPE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_TYPE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_TYPE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_TYPE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_TYPE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_TYPE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_TYPE__DIRECTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operational Limit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Acceptable Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_TYPE__ACCEPTABLE_DURATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operational Limit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_TYPE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Operational Limit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_TYPE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.OperationalLimits.BranchGroup <em>Branch Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.OperationalLimits.BranchGroup
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getBranchGroup()
	 * @generated
	 */
	public static final int BRANCH_GROUP = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_GROUP__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_GROUP__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_GROUP__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_GROUP__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_GROUP__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_GROUP__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_GROUP__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Branch Group Terminal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_GROUP__BRANCH_GROUP_TERMINAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minimum Reactive Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_GROUP__MINIMUM_REACTIVE_POWER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maximum Reactive Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_GROUP__MAXIMUM_REACTIVE_POWER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Maximum Active Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_GROUP__MAXIMUM_ACTIVE_POWER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Minimum Active Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_GROUP__MINIMUM_ACTIVE_POWER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Monitor Active Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_GROUP__MONITOR_ACTIVE_POWER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Monitor Reactive Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_GROUP__MONITOR_REACTIVE_POWER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Branch Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_GROUP_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Branch Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_GROUP_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.OperationalLimits.OperationalLimitSet <em>Operational Limit Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitSet
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getOperationalLimitSet()
	 * @generated
	 */
	public static final int OPERATIONAL_LIMIT_SET = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_SET__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_SET__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_SET__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_SET__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_SET__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_SET__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_SET__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_SET__TERMINAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operational Limit Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operational Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_SET_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operational Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_LIMIT_SET_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.OperationalLimits.ActivePowerLimitSet <em>Active Power Limit Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.OperationalLimits.ActivePowerLimitSet
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getActivePowerLimitSet()
	 * @generated
	 */
	public static final int ACTIVE_POWER_LIMIT_SET = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT_SET__UUID = OPERATIONAL_LIMIT_SET__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT_SET__NAMES = OPERATIONAL_LIMIT_SET__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT_SET__DIAGRAM_OBJECTS = OPERATIONAL_LIMIT_SET__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT_SET__MRID = OPERATIONAL_LIMIT_SET__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT_SET__ALIAS_NAME = OPERATIONAL_LIMIT_SET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT_SET__NAME = OPERATIONAL_LIMIT_SET__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT_SET__MODELING_AUTHORITY_SET = OPERATIONAL_LIMIT_SET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT_SET__TERMINAL = OPERATIONAL_LIMIT_SET__TERMINAL;

	/**
	 * The feature id for the '<em><b>Operational Limit Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT_SET__OPERATIONAL_LIMIT_VALUE = OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE;

	/**
	 * The feature id for the '<em><b>Active Power Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT_SET__ACTIVE_POWER_LIMITS = OPERATIONAL_LIMIT_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Active Power Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT_SET_FEATURE_COUNT = OPERATIONAL_LIMIT_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Active Power Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_POWER_LIMIT_SET_OPERATION_COUNT = OPERATIONAL_LIMIT_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.OperationalLimits.CurrentLimit <em>Current Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.OperationalLimits.CurrentLimit
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getCurrentLimit()
	 * @generated
	 */
	public static final int CURRENT_LIMIT = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT__UUID = OPERATIONAL_LIMIT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT__NAMES = OPERATIONAL_LIMIT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT__DIAGRAM_OBJECTS = OPERATIONAL_LIMIT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT__MRID = OPERATIONAL_LIMIT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT__ALIAS_NAME = OPERATIONAL_LIMIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT__NAME = OPERATIONAL_LIMIT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT__MODELING_AUTHORITY_SET = OPERATIONAL_LIMIT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Operational Limit Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT__OPERATIONAL_LIMIT_TYPE = OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT__OPERATIONAL_LIMIT_SET = OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT__VALUE = OPERATIONAL_LIMIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current Limit Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT__CURRENT_LIMIT_SET = OPERATIONAL_LIMIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Current Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT_FEATURE_COUNT = OPERATIONAL_LIMIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Current Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT_OPERATION_COUNT = OPERATIONAL_LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.OperationalLimits.CurrentLimitSet <em>Current Limit Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.OperationalLimits.CurrentLimitSet
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getCurrentLimitSet()
	 * @generated
	 */
	public static final int CURRENT_LIMIT_SET = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT_SET__UUID = OPERATIONAL_LIMIT_SET__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT_SET__NAMES = OPERATIONAL_LIMIT_SET__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT_SET__DIAGRAM_OBJECTS = OPERATIONAL_LIMIT_SET__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT_SET__MRID = OPERATIONAL_LIMIT_SET__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT_SET__ALIAS_NAME = OPERATIONAL_LIMIT_SET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT_SET__NAME = OPERATIONAL_LIMIT_SET__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT_SET__MODELING_AUTHORITY_SET = OPERATIONAL_LIMIT_SET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT_SET__TERMINAL = OPERATIONAL_LIMIT_SET__TERMINAL;

	/**
	 * The feature id for the '<em><b>Operational Limit Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT_SET__OPERATIONAL_LIMIT_VALUE = OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE;

	/**
	 * The feature id for the '<em><b>Current Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT_SET__CURRENT_LIMITS = OPERATIONAL_LIMIT_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Current Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT_SET_FEATURE_COUNT = OPERATIONAL_LIMIT_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Current Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_LIMIT_SET_OPERATION_COUNT = OPERATIONAL_LIMIT_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.OperationalLimits.ApparentPowerLimitSet <em>Apparent Power Limit Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.OperationalLimits.ApparentPowerLimitSet
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getApparentPowerLimitSet()
	 * @generated
	 */
	public static final int APPARENT_POWER_LIMIT_SET = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT_SET__UUID = OPERATIONAL_LIMIT_SET__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT_SET__NAMES = OPERATIONAL_LIMIT_SET__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT_SET__DIAGRAM_OBJECTS = OPERATIONAL_LIMIT_SET__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT_SET__MRID = OPERATIONAL_LIMIT_SET__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT_SET__ALIAS_NAME = OPERATIONAL_LIMIT_SET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT_SET__NAME = OPERATIONAL_LIMIT_SET__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT_SET__MODELING_AUTHORITY_SET = OPERATIONAL_LIMIT_SET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT_SET__TERMINAL = OPERATIONAL_LIMIT_SET__TERMINAL;

	/**
	 * The feature id for the '<em><b>Operational Limit Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT_SET__OPERATIONAL_LIMIT_VALUE = OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE;

	/**
	 * The feature id for the '<em><b>Apparent Power Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT_SET__APPARENT_POWER_LIMITS = OPERATIONAL_LIMIT_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Apparent Power Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT_SET_FEATURE_COUNT = OPERATIONAL_LIMIT_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Apparent Power Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int APPARENT_POWER_LIMIT_SET_OPERATION_COUNT = OPERATIONAL_LIMIT_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.OperationalLimits.BranchGroupTerminal <em>Branch Group Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.OperationalLimits.BranchGroupTerminal
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getBranchGroupTerminal()
	 * @generated
	 */
	public static final int BRANCH_GROUP_TERMINAL = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_GROUP_TERMINAL__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Branch Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_GROUP_TERMINAL__BRANCH_GROUP = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_GROUP_TERMINAL__TERMINAL = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Positive Flow In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_GROUP_TERMINAL__POSITIVE_FLOW_IN = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Branch Group Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_GROUP_TERMINAL_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Branch Group Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BRANCH_GROUP_TERMINAL_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.OperationalLimits.VoltageLimitSet <em>Voltage Limit Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.OperationalLimits.VoltageLimitSet
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getVoltageLimitSet()
	 * @generated
	 */
	public static final int VOLTAGE_LIMIT_SET = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT_SET__UUID = OPERATIONAL_LIMIT_SET__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT_SET__NAMES = OPERATIONAL_LIMIT_SET__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT_SET__DIAGRAM_OBJECTS = OPERATIONAL_LIMIT_SET__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT_SET__MRID = OPERATIONAL_LIMIT_SET__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT_SET__ALIAS_NAME = OPERATIONAL_LIMIT_SET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT_SET__NAME = OPERATIONAL_LIMIT_SET__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT_SET__MODELING_AUTHORITY_SET = OPERATIONAL_LIMIT_SET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT_SET__TERMINAL = OPERATIONAL_LIMIT_SET__TERMINAL;

	/**
	 * The feature id for the '<em><b>Operational Limit Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT_SET__OPERATIONAL_LIMIT_VALUE = OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE;

	/**
	 * The feature id for the '<em><b>Voltage Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT_SET__VOLTAGE_LIMITS = OPERATIONAL_LIMIT_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Voltage Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT_SET_FEATURE_COUNT = OPERATIONAL_LIMIT_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Voltage Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT_SET_OPERATION_COUNT = OPERATIONAL_LIMIT_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.OperationalLimits.VoltageLimit <em>Voltage Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.OperationalLimits.VoltageLimit
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getVoltageLimit()
	 * @generated
	 */
	public static final int VOLTAGE_LIMIT = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT__UUID = OPERATIONAL_LIMIT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT__NAMES = OPERATIONAL_LIMIT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT__DIAGRAM_OBJECTS = OPERATIONAL_LIMIT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT__MRID = OPERATIONAL_LIMIT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT__ALIAS_NAME = OPERATIONAL_LIMIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT__NAME = OPERATIONAL_LIMIT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT__MODELING_AUTHORITY_SET = OPERATIONAL_LIMIT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Operational Limit Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT__OPERATIONAL_LIMIT_TYPE = OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE;

	/**
	 * The feature id for the '<em><b>Operational Limit Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT__OPERATIONAL_LIMIT_SET = OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT__VALUE = OPERATIONAL_LIMIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Voltage Limit Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT__VOLTAGE_LIMIT_SET = OPERATIONAL_LIMIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Voltage Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT_FEATURE_COUNT = OPERATIONAL_LIMIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Voltage Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_LIMIT_OPERATION_COUNT = OPERATIONAL_LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.OperationalLimits.OperationalLimitDirectionKind <em>Operational Limit Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitDirectionKind
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getOperationalLimitDirectionKind()
	 * @generated
	 */
	public static final int OPERATIONAL_LIMIT_DIRECTION_KIND = 13;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apparentPowerLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activePowerLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalLimitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalLimitSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activePowerLimitSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentLimitSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apparentPowerLimitSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchGroupTerminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voltageLimitSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voltageLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationalLimitDirectionKindEEnum = null;

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
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperationalLimitsPackage() {
		super(eNS_URI, OperationalLimitsFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link OperationalLimitsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static OperationalLimitsPackage init() {
		if (isInited) return (OperationalLimitsPackage)EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI);

		// Obtain or create and register package
		OperationalLimitsPackage theOperationalLimitsPackage = (OperationalLimitsPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OperationalLimitsPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OperationalLimitsPackage());

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
		theOperationalLimitsPackage.fixPackageContents();
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
		theOperationalLimitsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OperationalLimitsPackage.eNS_URI, theOperationalLimitsPackage);
		return theOperationalLimitsPackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.OperationalLimits.ApparentPowerLimit <em>Apparent Power Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apparent Power Limit</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.ApparentPowerLimit
	 * @generated
	 */
	public EClass getApparentPowerLimit() {
		if (apparentPowerLimitEClass == null) {
			apparentPowerLimitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI).getEClassifiers().get(1);
		}
		return apparentPowerLimitEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.OperationalLimits.ApparentPowerLimit#getApparentPowerLimitSet <em>Apparent Power Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Apparent Power Limit Set</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.ApparentPowerLimit#getApparentPowerLimitSet()
	 * @see #getApparentPowerLimit()
	 * @generated
	 */
	public EReference getApparentPowerLimit_ApparentPowerLimitSet() {
        return (EReference)getApparentPowerLimit().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.OperationalLimits.ApparentPowerLimit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.ApparentPowerLimit#getValue()
	 * @see #getApparentPowerLimit()
	 * @generated
	 */
	public EAttribute getApparentPowerLimit_Value() {
        return (EAttribute)getApparentPowerLimit().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.OperationalLimits.ActivePowerLimit <em>Active Power Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active Power Limit</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.ActivePowerLimit
	 * @generated
	 */
	public EClass getActivePowerLimit() {
		if (activePowerLimitEClass == null) {
			activePowerLimitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI).getEClassifiers().get(2);
		}
		return activePowerLimitEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.OperationalLimits.ActivePowerLimit#getActivePowerLimitSet <em>Active Power Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Power Limit Set</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.ActivePowerLimit#getActivePowerLimitSet()
	 * @see #getActivePowerLimit()
	 * @generated
	 */
	public EReference getActivePowerLimit_ActivePowerLimitSet() {
        return (EReference)getActivePowerLimit().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.OperationalLimits.ActivePowerLimit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.ActivePowerLimit#getValue()
	 * @see #getActivePowerLimit()
	 * @generated
	 */
	public EAttribute getActivePowerLimit_Value() {
        return (EAttribute)getActivePowerLimit().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.OperationalLimits.OperationalLimitType <em>Operational Limit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Limit Type</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitType
	 * @generated
	 */
	public EClass getOperationalLimitType() {
		if (operationalLimitTypeEClass == null) {
			operationalLimitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI).getEClassifiers().get(3);
		}
		return operationalLimitTypeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.OperationalLimits.OperationalLimitType#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitType#getDirection()
	 * @see #getOperationalLimitType()
	 * @generated
	 */
	public EAttribute getOperationalLimitType_Direction() {
        return (EAttribute)getOperationalLimitType().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.OperationalLimits.OperationalLimitType#getOperationalLimit <em>Operational Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operational Limit</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitType#getOperationalLimit()
	 * @see #getOperationalLimitType()
	 * @generated
	 */
	public EReference getOperationalLimitType_OperationalLimit() {
        return (EReference)getOperationalLimitType().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.OperationalLimits.OperationalLimitType#getAcceptableDuration <em>Acceptable Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acceptable Duration</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitType#getAcceptableDuration()
	 * @see #getOperationalLimitType()
	 * @generated
	 */
	public EAttribute getOperationalLimitType_AcceptableDuration() {
        return (EAttribute)getOperationalLimitType().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.OperationalLimits.BranchGroup <em>Branch Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch Group</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.BranchGroup
	 * @generated
	 */
	public EClass getBranchGroup() {
		if (branchGroupEClass == null) {
			branchGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI).getEClassifiers().get(4);
		}
		return branchGroupEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#getBranchGroupTerminal <em>Branch Group Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Branch Group Terminal</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.BranchGroup#getBranchGroupTerminal()
	 * @see #getBranchGroup()
	 * @generated
	 */
	public EReference getBranchGroup_BranchGroupTerminal() {
        return (EReference)getBranchGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#getMinimumReactivePower <em>Minimum Reactive Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Reactive Power</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.BranchGroup#getMinimumReactivePower()
	 * @see #getBranchGroup()
	 * @generated
	 */
	public EAttribute getBranchGroup_MinimumReactivePower() {
        return (EAttribute)getBranchGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#getMaximumReactivePower <em>Maximum Reactive Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Reactive Power</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.BranchGroup#getMaximumReactivePower()
	 * @see #getBranchGroup()
	 * @generated
	 */
	public EAttribute getBranchGroup_MaximumReactivePower() {
        return (EAttribute)getBranchGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#getMaximumActivePower <em>Maximum Active Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Active Power</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.BranchGroup#getMaximumActivePower()
	 * @see #getBranchGroup()
	 * @generated
	 */
	public EAttribute getBranchGroup_MaximumActivePower() {
        return (EAttribute)getBranchGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#getMinimumActivePower <em>Minimum Active Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Active Power</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.BranchGroup#getMinimumActivePower()
	 * @see #getBranchGroup()
	 * @generated
	 */
	public EAttribute getBranchGroup_MinimumActivePower() {
        return (EAttribute)getBranchGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#isMonitorActivePower <em>Monitor Active Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitor Active Power</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.BranchGroup#isMonitorActivePower()
	 * @see #getBranchGroup()
	 * @generated
	 */
	public EAttribute getBranchGroup_MonitorActivePower() {
        return (EAttribute)getBranchGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#isMonitorReactivePower <em>Monitor Reactive Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitor Reactive Power</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.BranchGroup#isMonitorReactivePower()
	 * @see #getBranchGroup()
	 * @generated
	 */
	public EAttribute getBranchGroup_MonitorReactivePower() {
        return (EAttribute)getBranchGroup().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.OperationalLimits.OperationalLimitSet <em>Operational Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Limit Set</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitSet
	 * @generated
	 */
	public EClass getOperationalLimitSet() {
		if (operationalLimitSetEClass == null) {
			operationalLimitSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI).getEClassifiers().get(5);
		}
		return operationalLimitSetEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.OperationalLimits.OperationalLimitSet#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitSet#getTerminal()
	 * @see #getOperationalLimitSet()
	 * @generated
	 */
	public EReference getOperationalLimitSet_Terminal() {
        return (EReference)getOperationalLimitSet().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.OperationalLimits.OperationalLimitSet#getOperationalLimitValue <em>Operational Limit Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operational Limit Value</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitSet#getOperationalLimitValue()
	 * @see #getOperationalLimitSet()
	 * @generated
	 */
	public EReference getOperationalLimitSet_OperationalLimitValue() {
        return (EReference)getOperationalLimitSet().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.OperationalLimits.ActivePowerLimitSet <em>Active Power Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active Power Limit Set</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.ActivePowerLimitSet
	 * @generated
	 */
	public EClass getActivePowerLimitSet() {
		if (activePowerLimitSetEClass == null) {
			activePowerLimitSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI).getEClassifiers().get(6);
		}
		return activePowerLimitSetEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.OperationalLimits.ActivePowerLimitSet#getActivePowerLimits <em>Active Power Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Active Power Limits</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.ActivePowerLimitSet#getActivePowerLimits()
	 * @see #getActivePowerLimitSet()
	 * @generated
	 */
	public EReference getActivePowerLimitSet_ActivePowerLimits() {
        return (EReference)getActivePowerLimitSet().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.OperationalLimits.CurrentLimit <em>Current Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Limit</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.CurrentLimit
	 * @generated
	 */
	public EClass getCurrentLimit() {
		if (currentLimitEClass == null) {
			currentLimitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI).getEClassifiers().get(7);
		}
		return currentLimitEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.OperationalLimits.CurrentLimit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.CurrentLimit#getValue()
	 * @see #getCurrentLimit()
	 * @generated
	 */
	public EAttribute getCurrentLimit_Value() {
        return (EAttribute)getCurrentLimit().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.OperationalLimits.CurrentLimit#getCurrentLimitSet <em>Current Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Limit Set</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.CurrentLimit#getCurrentLimitSet()
	 * @see #getCurrentLimit()
	 * @generated
	 */
	public EReference getCurrentLimit_CurrentLimitSet() {
        return (EReference)getCurrentLimit().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.OperationalLimits.CurrentLimitSet <em>Current Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Limit Set</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.CurrentLimitSet
	 * @generated
	 */
	public EClass getCurrentLimitSet() {
		if (currentLimitSetEClass == null) {
			currentLimitSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI).getEClassifiers().get(8);
		}
		return currentLimitSetEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.OperationalLimits.CurrentLimitSet#getCurrentLimits <em>Current Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Current Limits</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.CurrentLimitSet#getCurrentLimits()
	 * @see #getCurrentLimitSet()
	 * @generated
	 */
	public EReference getCurrentLimitSet_CurrentLimits() {
        return (EReference)getCurrentLimitSet().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.OperationalLimits.ApparentPowerLimitSet <em>Apparent Power Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apparent Power Limit Set</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.ApparentPowerLimitSet
	 * @generated
	 */
	public EClass getApparentPowerLimitSet() {
		if (apparentPowerLimitSetEClass == null) {
			apparentPowerLimitSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI).getEClassifiers().get(9);
		}
		return apparentPowerLimitSetEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.OperationalLimits.ApparentPowerLimitSet#getApparentPowerLimits <em>Apparent Power Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Apparent Power Limits</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.ApparentPowerLimitSet#getApparentPowerLimits()
	 * @see #getApparentPowerLimitSet()
	 * @generated
	 */
	public EReference getApparentPowerLimitSet_ApparentPowerLimits() {
        return (EReference)getApparentPowerLimitSet().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.OperationalLimits.BranchGroupTerminal <em>Branch Group Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch Group Terminal</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.BranchGroupTerminal
	 * @generated
	 */
	public EClass getBranchGroupTerminal() {
		if (branchGroupTerminalEClass == null) {
			branchGroupTerminalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI).getEClassifiers().get(10);
		}
		return branchGroupTerminalEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.OperationalLimits.BranchGroupTerminal#getBranchGroup <em>Branch Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Branch Group</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.BranchGroupTerminal#getBranchGroup()
	 * @see #getBranchGroupTerminal()
	 * @generated
	 */
	public EReference getBranchGroupTerminal_BranchGroup() {
        return (EReference)getBranchGroupTerminal().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.OperationalLimits.BranchGroupTerminal#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.BranchGroupTerminal#getTerminal()
	 * @see #getBranchGroupTerminal()
	 * @generated
	 */
	public EReference getBranchGroupTerminal_Terminal() {
        return (EReference)getBranchGroupTerminal().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.OperationalLimits.BranchGroupTerminal#isPositiveFlowIn <em>Positive Flow In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positive Flow In</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.BranchGroupTerminal#isPositiveFlowIn()
	 * @see #getBranchGroupTerminal()
	 * @generated
	 */
	public EAttribute getBranchGroupTerminal_PositiveFlowIn() {
        return (EAttribute)getBranchGroupTerminal().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.OperationalLimits.VoltageLimitSet <em>Voltage Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voltage Limit Set</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.VoltageLimitSet
	 * @generated
	 */
	public EClass getVoltageLimitSet() {
		if (voltageLimitSetEClass == null) {
			voltageLimitSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI).getEClassifiers().get(11);
		}
		return voltageLimitSetEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.OperationalLimits.VoltageLimitSet#getVoltageLimits <em>Voltage Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Voltage Limits</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.VoltageLimitSet#getVoltageLimits()
	 * @see #getVoltageLimitSet()
	 * @generated
	 */
	public EReference getVoltageLimitSet_VoltageLimits() {
        return (EReference)getVoltageLimitSet().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.OperationalLimits.VoltageLimit <em>Voltage Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voltage Limit</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.VoltageLimit
	 * @generated
	 */
	public EClass getVoltageLimit() {
		if (voltageLimitEClass == null) {
			voltageLimitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI).getEClassifiers().get(12);
		}
		return voltageLimitEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.OperationalLimits.VoltageLimit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.VoltageLimit#getValue()
	 * @see #getVoltageLimit()
	 * @generated
	 */
	public EAttribute getVoltageLimit_Value() {
        return (EAttribute)getVoltageLimit().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.OperationalLimits.VoltageLimit#getVoltageLimitSet <em>Voltage Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Voltage Limit Set</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.VoltageLimit#getVoltageLimitSet()
	 * @see #getVoltageLimit()
	 * @generated
	 */
	public EReference getVoltageLimit_VoltageLimitSet() {
        return (EReference)getVoltageLimit().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.OperationalLimits.OperationalLimit <em>Operational Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Limit</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimit
	 * @generated
	 */
	public EClass getOperationalLimit() {
		if (operationalLimitEClass == null) {
			operationalLimitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI).getEClassifiers().get(13);
		}
		return operationalLimitEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.OperationalLimits.OperationalLimit#getOperationalLimitType <em>Operational Limit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operational Limit Type</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimit#getOperationalLimitType()
	 * @see #getOperationalLimit()
	 * @generated
	 */
	public EReference getOperationalLimit_OperationalLimitType() {
        return (EReference)getOperationalLimit().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.OperationalLimits.OperationalLimit#getOperationalLimitSet <em>Operational Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operational Limit Set</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimit#getOperationalLimitSet()
	 * @see #getOperationalLimit()
	 * @generated
	 */
	public EReference getOperationalLimit_OperationalLimitSet() {
        return (EReference)getOperationalLimit().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.OperationalLimits.OperationalLimitDirectionKind <em>Operational Limit Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operational Limit Direction Kind</em>'.
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitDirectionKind
	 * @generated
	 */
	public EEnum getOperationalLimitDirectionKind() {
		if (operationalLimitDirectionKindEEnum == null) {
			operationalLimitDirectionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI).getEClassifiers().get(0);
		}
		return operationalLimitDirectionKindEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public OperationalLimitsFactory getOperationalLimitsFactory() {
		return (OperationalLimitsFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM15.IEC61970.OperationalLimits." + eClassifier.getName());
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
		 * The meta object literal for the '{@link CIM15.IEC61970.OperationalLimits.ApparentPowerLimit <em>Apparent Power Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.OperationalLimits.ApparentPowerLimit
		 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getApparentPowerLimit()
		 * @generated
		 */
		public static final EClass APPARENT_POWER_LIMIT = eINSTANCE.getApparentPowerLimit();

		/**
		 * The meta object literal for the '<em><b>Apparent Power Limit Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference APPARENT_POWER_LIMIT__APPARENT_POWER_LIMIT_SET = eINSTANCE.getApparentPowerLimit_ApparentPowerLimitSet();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute APPARENT_POWER_LIMIT__VALUE = eINSTANCE.getApparentPowerLimit_Value();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.OperationalLimits.ActivePowerLimit <em>Active Power Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.OperationalLimits.ActivePowerLimit
		 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getActivePowerLimit()
		 * @generated
		 */
		public static final EClass ACTIVE_POWER_LIMIT = eINSTANCE.getActivePowerLimit();

		/**
		 * The meta object literal for the '<em><b>Active Power Limit Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ACTIVE_POWER_LIMIT__ACTIVE_POWER_LIMIT_SET = eINSTANCE.getActivePowerLimit_ActivePowerLimitSet();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACTIVE_POWER_LIMIT__VALUE = eINSTANCE.getActivePowerLimit_Value();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.OperationalLimits.OperationalLimitType <em>Operational Limit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitType
		 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getOperationalLimitType()
		 * @generated
		 */
		public static final EClass OPERATIONAL_LIMIT_TYPE = eINSTANCE.getOperationalLimitType();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OPERATIONAL_LIMIT_TYPE__DIRECTION = eINSTANCE.getOperationalLimitType_Direction();

		/**
		 * The meta object literal for the '<em><b>Operational Limit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT = eINSTANCE.getOperationalLimitType_OperationalLimit();

		/**
		 * The meta object literal for the '<em><b>Acceptable Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute OPERATIONAL_LIMIT_TYPE__ACCEPTABLE_DURATION = eINSTANCE.getOperationalLimitType_AcceptableDuration();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.OperationalLimits.BranchGroup <em>Branch Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.OperationalLimits.BranchGroup
		 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getBranchGroup()
		 * @generated
		 */
		public static final EClass BRANCH_GROUP = eINSTANCE.getBranchGroup();

		/**
		 * The meta object literal for the '<em><b>Branch Group Terminal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BRANCH_GROUP__BRANCH_GROUP_TERMINAL = eINSTANCE.getBranchGroup_BranchGroupTerminal();

		/**
		 * The meta object literal for the '<em><b>Minimum Reactive Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BRANCH_GROUP__MINIMUM_REACTIVE_POWER = eINSTANCE.getBranchGroup_MinimumReactivePower();

		/**
		 * The meta object literal for the '<em><b>Maximum Reactive Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BRANCH_GROUP__MAXIMUM_REACTIVE_POWER = eINSTANCE.getBranchGroup_MaximumReactivePower();

		/**
		 * The meta object literal for the '<em><b>Maximum Active Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BRANCH_GROUP__MAXIMUM_ACTIVE_POWER = eINSTANCE.getBranchGroup_MaximumActivePower();

		/**
		 * The meta object literal for the '<em><b>Minimum Active Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BRANCH_GROUP__MINIMUM_ACTIVE_POWER = eINSTANCE.getBranchGroup_MinimumActivePower();

		/**
		 * The meta object literal for the '<em><b>Monitor Active Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BRANCH_GROUP__MONITOR_ACTIVE_POWER = eINSTANCE.getBranchGroup_MonitorActivePower();

		/**
		 * The meta object literal for the '<em><b>Monitor Reactive Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BRANCH_GROUP__MONITOR_REACTIVE_POWER = eINSTANCE.getBranchGroup_MonitorReactivePower();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.OperationalLimits.OperationalLimitSet <em>Operational Limit Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitSet
		 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getOperationalLimitSet()
		 * @generated
		 */
		public static final EClass OPERATIONAL_LIMIT_SET = eINSTANCE.getOperationalLimitSet();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OPERATIONAL_LIMIT_SET__TERMINAL = eINSTANCE.getOperationalLimitSet_Terminal();

		/**
		 * The meta object literal for the '<em><b>Operational Limit Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE = eINSTANCE.getOperationalLimitSet_OperationalLimitValue();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.OperationalLimits.ActivePowerLimitSet <em>Active Power Limit Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.OperationalLimits.ActivePowerLimitSet
		 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getActivePowerLimitSet()
		 * @generated
		 */
		public static final EClass ACTIVE_POWER_LIMIT_SET = eINSTANCE.getActivePowerLimitSet();

		/**
		 * The meta object literal for the '<em><b>Active Power Limits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ACTIVE_POWER_LIMIT_SET__ACTIVE_POWER_LIMITS = eINSTANCE.getActivePowerLimitSet_ActivePowerLimits();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.OperationalLimits.CurrentLimit <em>Current Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.OperationalLimits.CurrentLimit
		 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getCurrentLimit()
		 * @generated
		 */
		public static final EClass CURRENT_LIMIT = eINSTANCE.getCurrentLimit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CURRENT_LIMIT__VALUE = eINSTANCE.getCurrentLimit_Value();

		/**
		 * The meta object literal for the '<em><b>Current Limit Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CURRENT_LIMIT__CURRENT_LIMIT_SET = eINSTANCE.getCurrentLimit_CurrentLimitSet();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.OperationalLimits.CurrentLimitSet <em>Current Limit Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.OperationalLimits.CurrentLimitSet
		 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getCurrentLimitSet()
		 * @generated
		 */
		public static final EClass CURRENT_LIMIT_SET = eINSTANCE.getCurrentLimitSet();

		/**
		 * The meta object literal for the '<em><b>Current Limits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CURRENT_LIMIT_SET__CURRENT_LIMITS = eINSTANCE.getCurrentLimitSet_CurrentLimits();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.OperationalLimits.ApparentPowerLimitSet <em>Apparent Power Limit Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.OperationalLimits.ApparentPowerLimitSet
		 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getApparentPowerLimitSet()
		 * @generated
		 */
		public static final EClass APPARENT_POWER_LIMIT_SET = eINSTANCE.getApparentPowerLimitSet();

		/**
		 * The meta object literal for the '<em><b>Apparent Power Limits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference APPARENT_POWER_LIMIT_SET__APPARENT_POWER_LIMITS = eINSTANCE.getApparentPowerLimitSet_ApparentPowerLimits();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.OperationalLimits.BranchGroupTerminal <em>Branch Group Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.OperationalLimits.BranchGroupTerminal
		 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getBranchGroupTerminal()
		 * @generated
		 */
		public static final EClass BRANCH_GROUP_TERMINAL = eINSTANCE.getBranchGroupTerminal();

		/**
		 * The meta object literal for the '<em><b>Branch Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BRANCH_GROUP_TERMINAL__BRANCH_GROUP = eINSTANCE.getBranchGroupTerminal_BranchGroup();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BRANCH_GROUP_TERMINAL__TERMINAL = eINSTANCE.getBranchGroupTerminal_Terminal();

		/**
		 * The meta object literal for the '<em><b>Positive Flow In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BRANCH_GROUP_TERMINAL__POSITIVE_FLOW_IN = eINSTANCE.getBranchGroupTerminal_PositiveFlowIn();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.OperationalLimits.VoltageLimitSet <em>Voltage Limit Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.OperationalLimits.VoltageLimitSet
		 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getVoltageLimitSet()
		 * @generated
		 */
		public static final EClass VOLTAGE_LIMIT_SET = eINSTANCE.getVoltageLimitSet();

		/**
		 * The meta object literal for the '<em><b>Voltage Limits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference VOLTAGE_LIMIT_SET__VOLTAGE_LIMITS = eINSTANCE.getVoltageLimitSet_VoltageLimits();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.OperationalLimits.VoltageLimit <em>Voltage Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.OperationalLimits.VoltageLimit
		 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getVoltageLimit()
		 * @generated
		 */
		public static final EClass VOLTAGE_LIMIT = eINSTANCE.getVoltageLimit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute VOLTAGE_LIMIT__VALUE = eINSTANCE.getVoltageLimit_Value();

		/**
		 * The meta object literal for the '<em><b>Voltage Limit Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference VOLTAGE_LIMIT__VOLTAGE_LIMIT_SET = eINSTANCE.getVoltageLimit_VoltageLimitSet();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.OperationalLimits.OperationalLimit <em>Operational Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.OperationalLimits.OperationalLimit
		 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getOperationalLimit()
		 * @generated
		 */
		public static final EClass OPERATIONAL_LIMIT = eINSTANCE.getOperationalLimit();

		/**
		 * The meta object literal for the '<em><b>Operational Limit Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE = eINSTANCE.getOperationalLimit_OperationalLimitType();

		/**
		 * The meta object literal for the '<em><b>Operational Limit Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET = eINSTANCE.getOperationalLimit_OperationalLimitSet();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.OperationalLimits.OperationalLimitDirectionKind <em>Operational Limit Direction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitDirectionKind
		 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage#getOperationalLimitDirectionKind()
		 * @generated
		 */
		public static final EEnum OPERATIONAL_LIMIT_DIRECTION_KIND = eINSTANCE.getOperationalLimitDirectionKind();

	}

} //OperationalLimitsPackage
