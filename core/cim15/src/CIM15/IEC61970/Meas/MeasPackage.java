/**
 */
package CIM15.IEC61970.Meas;

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
 * @see CIM15.IEC61970.Meas.MeasFactory
 * @generated
 */
public class MeasPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "Meas";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#Meas";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimMeas";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MeasPackage eINSTANCE = CIM15.IEC61970.Meas.MeasPackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.Limit <em>Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.Limit
	 * @see CIM15.IEC61970.Meas.MeasPackage#getLimit()
	 * @generated
	 */
	public static final int LIMIT = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Procedures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT__PROCEDURES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.AccumulatorLimit <em>Accumulator Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.AccumulatorLimit
	 * @see CIM15.IEC61970.Meas.MeasPackage#getAccumulatorLimit()
	 * @generated
	 */
	public static final int ACCUMULATOR_LIMIT = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_LIMIT__UUID = LIMIT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_LIMIT__NAMES = LIMIT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_LIMIT__DIAGRAM_OBJECTS = LIMIT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_LIMIT__MRID = LIMIT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_LIMIT__ALIAS_NAME = LIMIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_LIMIT__NAME = LIMIT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_LIMIT__MODELING_AUTHORITY_SET = LIMIT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Procedures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_LIMIT__PROCEDURES = LIMIT__PROCEDURES;

	/**
	 * The feature id for the '<em><b>Limit Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_LIMIT__LIMIT_SET = LIMIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_LIMIT__VALUE = LIMIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Accumulator Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_LIMIT_FEATURE_COUNT = LIMIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Accumulator Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_LIMIT_OPERATION_COUNT = LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.ValueToAlias <em>Value To Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.ValueToAlias
	 * @see CIM15.IEC61970.Meas.MeasPackage#getValueToAlias()
	 * @generated
	 */
	public static final int VALUE_TO_ALIAS = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_TO_ALIAS__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_TO_ALIAS__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_TO_ALIAS__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_TO_ALIAS__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_TO_ALIAS__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_TO_ALIAS__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_TO_ALIAS__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_TO_ALIAS__VALUE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Alias Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_TO_ALIAS__VALUE_ALIAS_SET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value To Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_TO_ALIAS_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Value To Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_TO_ALIAS_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.MeasurementValueSource <em>Measurement Value Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.MeasurementValueSource
	 * @see CIM15.IEC61970.Meas.MeasPackage#getMeasurementValueSource()
	 * @generated
	 */
	public static final int MEASUREMENT_VALUE_SOURCE = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_SOURCE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_SOURCE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_SOURCE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_SOURCE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_SOURCE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_SOURCE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_SOURCE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Measurement Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measurement Value Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_SOURCE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Measurement Value Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_SOURCE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.Measurement <em>Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.Measurement
	 * @see CIM15.IEC61970.Meas.MeasPackage#getMeasurement()
	 * @generated
	 */
	public static final int MEASUREMENT = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT__TERMINAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT__PHASES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Measurement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT__MEASUREMENT_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT__UNIT_MULTIPLIER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unit Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT__UNIT_SYMBOL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Power System Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT__POWER_SYSTEM_RESOURCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT__LOCATIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT__ASSET = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT__DOCUMENTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.Analog <em>Analog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.Analog
	 * @see CIM15.IEC61970.Meas.MeasPackage#getAnalog()
	 * @generated
	 */
	public static final int ANALOG = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG__UUID = MEASUREMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG__NAMES = MEASUREMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG__DIAGRAM_OBJECTS = MEASUREMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG__MRID = MEASUREMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG__ALIAS_NAME = MEASUREMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG__NAME = MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG__MODELING_AUTHORITY_SET = MEASUREMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG__TERMINAL = MEASUREMENT__TERMINAL;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG__PHASES = MEASUREMENT__PHASES;

	/**
	 * The feature id for the '<em><b>Measurement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG__MEASUREMENT_TYPE = MEASUREMENT__MEASUREMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Unit Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG__UNIT_MULTIPLIER = MEASUREMENT__UNIT_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Unit Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG__UNIT_SYMBOL = MEASUREMENT__UNIT_SYMBOL;

	/**
	 * The feature id for the '<em><b>Power System Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG__POWER_SYSTEM_RESOURCE = MEASUREMENT__POWER_SYSTEM_RESOURCE;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG__LOCATIONS = MEASUREMENT__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG__ASSET = MEASUREMENT__ASSET;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG__DOCUMENTS = MEASUREMENT__DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Limit Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG__LIMIT_SETS = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG__MAX_VALUE = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Analog Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG__ANALOG_VALUES = MEASUREMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Set Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG__SET_POINT = MEASUREMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Normal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG__NORMAL_VALUE = MEASUREMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Positive Flow In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG__POSITIVE_FLOW_IN = MEASUREMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG__MIN_VALUE = MEASUREMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Analog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Analog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_OPERATION_COUNT = MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.MeasurementValue <em>Measurement Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.MeasurementValue
	 * @see CIM15.IEC61970.Meas.MeasPackage#getMeasurementValue()
	 * @generated
	 */
	public static final int MEASUREMENT_VALUE = 19;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Gml Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE__GML_VALUES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measurement Value Quality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sensor Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE__SENSOR_ACCURACY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE__PROCEDURE_DATA_SETS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Measurement Value Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Erp Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE__ERP_PERSON = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Remote Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE__REMOTE_SOURCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE__TIME_STAMP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Measurement Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Measurement Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.AnalogValue <em>Analog Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.AnalogValue
	 * @see CIM15.IEC61970.Meas.MeasPackage#getAnalogValue()
	 * @generated
	 */
	public static final int ANALOG_VALUE = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VALUE__UUID = MEASUREMENT_VALUE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VALUE__NAMES = MEASUREMENT_VALUE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VALUE__DIAGRAM_OBJECTS = MEASUREMENT_VALUE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VALUE__MRID = MEASUREMENT_VALUE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VALUE__ALIAS_NAME = MEASUREMENT_VALUE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VALUE__NAME = MEASUREMENT_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VALUE__MODELING_AUTHORITY_SET = MEASUREMENT_VALUE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Gml Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VALUE__GML_VALUES = MEASUREMENT_VALUE__GML_VALUES;

	/**
	 * The feature id for the '<em><b>Measurement Value Quality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VALUE__MEASUREMENT_VALUE_QUALITY = MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY;

	/**
	 * The feature id for the '<em><b>Sensor Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VALUE__SENSOR_ACCURACY = MEASUREMENT_VALUE__SENSOR_ACCURACY;

	/**
	 * The feature id for the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VALUE__PROCEDURE_DATA_SETS = MEASUREMENT_VALUE__PROCEDURE_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Measurement Value Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VALUE__MEASUREMENT_VALUE_SOURCE = MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE;

	/**
	 * The feature id for the '<em><b>Erp Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VALUE__ERP_PERSON = MEASUREMENT_VALUE__ERP_PERSON;

	/**
	 * The feature id for the '<em><b>Remote Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VALUE__REMOTE_SOURCE = MEASUREMENT_VALUE__REMOTE_SOURCE;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VALUE__TIME_STAMP = MEASUREMENT_VALUE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VALUE__VALUE = MEASUREMENT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alt Tie Meas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VALUE__ALT_TIE_MEAS = MEASUREMENT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Analog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VALUE__ANALOG = MEASUREMENT_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alt Generating Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VALUE__ALT_GENERATING_UNIT = MEASUREMENT_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Analog Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VALUE_FEATURE_COUNT = MEASUREMENT_VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Analog Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_VALUE_OPERATION_COUNT = MEASUREMENT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.ControlType <em>Control Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.ControlType
	 * @see CIM15.IEC61970.Meas.MeasPackage#getControlType()
	 * @generated
	 */
	public static final int CONTROL_TYPE = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_TYPE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_TYPE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_TYPE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_TYPE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_TYPE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_TYPE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_TYPE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_TYPE__CONTROLS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_TYPE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_TYPE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.StringMeasurementValue <em>String Measurement Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.StringMeasurementValue
	 * @see CIM15.IEC61970.Meas.MeasPackage#getStringMeasurementValue()
	 * @generated
	 */
	public static final int STRING_MEASUREMENT_VALUE = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT_VALUE__UUID = MEASUREMENT_VALUE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT_VALUE__NAMES = MEASUREMENT_VALUE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT_VALUE__DIAGRAM_OBJECTS = MEASUREMENT_VALUE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT_VALUE__MRID = MEASUREMENT_VALUE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT_VALUE__ALIAS_NAME = MEASUREMENT_VALUE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT_VALUE__NAME = MEASUREMENT_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT_VALUE__MODELING_AUTHORITY_SET = MEASUREMENT_VALUE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Gml Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT_VALUE__GML_VALUES = MEASUREMENT_VALUE__GML_VALUES;

	/**
	 * The feature id for the '<em><b>Measurement Value Quality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY = MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY;

	/**
	 * The feature id for the '<em><b>Sensor Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT_VALUE__SENSOR_ACCURACY = MEASUREMENT_VALUE__SENSOR_ACCURACY;

	/**
	 * The feature id for the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT_VALUE__PROCEDURE_DATA_SETS = MEASUREMENT_VALUE__PROCEDURE_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Measurement Value Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE = MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE;

	/**
	 * The feature id for the '<em><b>Erp Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT_VALUE__ERP_PERSON = MEASUREMENT_VALUE__ERP_PERSON;

	/**
	 * The feature id for the '<em><b>Remote Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT_VALUE__REMOTE_SOURCE = MEASUREMENT_VALUE__REMOTE_SOURCE;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT_VALUE__TIME_STAMP = MEASUREMENT_VALUE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT_VALUE__VALUE = MEASUREMENT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>String Measurement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT = MEASUREMENT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Measurement Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT_VALUE_FEATURE_COUNT = MEASUREMENT_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>String Measurement Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT_VALUE_OPERATION_COUNT = MEASUREMENT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.StringMeasurement <em>String Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.StringMeasurement
	 * @see CIM15.IEC61970.Meas.MeasPackage#getStringMeasurement()
	 * @generated
	 */
	public static final int STRING_MEASUREMENT = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT__UUID = MEASUREMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT__NAMES = MEASUREMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT__DIAGRAM_OBJECTS = MEASUREMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT__MRID = MEASUREMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT__ALIAS_NAME = MEASUREMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT__NAME = MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT__MODELING_AUTHORITY_SET = MEASUREMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT__TERMINAL = MEASUREMENT__TERMINAL;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT__PHASES = MEASUREMENT__PHASES;

	/**
	 * The feature id for the '<em><b>Measurement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT__MEASUREMENT_TYPE = MEASUREMENT__MEASUREMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Unit Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT__UNIT_MULTIPLIER = MEASUREMENT__UNIT_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Unit Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT__UNIT_SYMBOL = MEASUREMENT__UNIT_SYMBOL;

	/**
	 * The feature id for the '<em><b>Power System Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT__POWER_SYSTEM_RESOURCE = MEASUREMENT__POWER_SYSTEM_RESOURCE;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT__LOCATIONS = MEASUREMENT__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT__ASSET = MEASUREMENT__ASSET;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT__DOCUMENTS = MEASUREMENT__DOCUMENTS;

	/**
	 * The feature id for the '<em><b>String Measurement Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_MEASUREMENT_OPERATION_COUNT = MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.AnalogLimit <em>Analog Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.AnalogLimit
	 * @see CIM15.IEC61970.Meas.MeasPackage#getAnalogLimit()
	 * @generated
	 */
	public static final int ANALOG_LIMIT = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_LIMIT__UUID = LIMIT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_LIMIT__NAMES = LIMIT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_LIMIT__DIAGRAM_OBJECTS = LIMIT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_LIMIT__MRID = LIMIT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_LIMIT__ALIAS_NAME = LIMIT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_LIMIT__NAME = LIMIT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_LIMIT__MODELING_AUTHORITY_SET = LIMIT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Procedures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_LIMIT__PROCEDURES = LIMIT__PROCEDURES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_LIMIT__VALUE = LIMIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Limit Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_LIMIT__LIMIT_SET = LIMIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Analog Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_LIMIT_FEATURE_COUNT = LIMIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Analog Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_LIMIT_OPERATION_COUNT = LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.Control <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.Control
	 * @see CIM15.IEC61970.Meas.MeasPackage#getControl()
	 * @generated
	 */
	public static final int CONTROL = 24;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Remote Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL__REMOTE_CONTROL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Regulating Cond Eq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL__REGULATING_COND_EQ = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Control Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL__CONTROL_TYPE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL__UNIT_SYMBOL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unit Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL__UNIT_MULTIPLIER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Operation In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL__OPERATION_IN_PROGRESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL__TIME_STAMP = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.SetPoint <em>Set Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.SetPoint
	 * @see CIM15.IEC61970.Meas.MeasPackage#getSetPoint()
	 * @generated
	 */
	public static final int SET_POINT = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET_POINT__UUID = CONTROL__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET_POINT__NAMES = CONTROL__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET_POINT__DIAGRAM_OBJECTS = CONTROL__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET_POINT__MRID = CONTROL__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET_POINT__ALIAS_NAME = CONTROL__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET_POINT__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET_POINT__MODELING_AUTHORITY_SET = CONTROL__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Remote Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET_POINT__REMOTE_CONTROL = CONTROL__REMOTE_CONTROL;

	/**
	 * The feature id for the '<em><b>Regulating Cond Eq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET_POINT__REGULATING_COND_EQ = CONTROL__REGULATING_COND_EQ;

	/**
	 * The feature id for the '<em><b>Control Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET_POINT__CONTROL_TYPE = CONTROL__CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Unit Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET_POINT__UNIT_SYMBOL = CONTROL__UNIT_SYMBOL;

	/**
	 * The feature id for the '<em><b>Unit Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET_POINT__UNIT_MULTIPLIER = CONTROL__UNIT_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Operation In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET_POINT__OPERATION_IN_PROGRESS = CONTROL__OPERATION_IN_PROGRESS;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET_POINT__TIME_STAMP = CONTROL__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Analog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET_POINT__ANALOG = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET_POINT__MAX_VALUE = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET_POINT__MIN_VALUE = CONTROL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Normal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET_POINT__NORMAL_VALUE = CONTROL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET_POINT__VALUE = CONTROL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Set Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET_POINT_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Set Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SET_POINT_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.Discrete <em>Discrete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.Discrete
	 * @see CIM15.IEC61970.Meas.MeasPackage#getDiscrete()
	 * @generated
	 */
	public static final int DISCRETE = 12;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE__UUID = MEASUREMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE__NAMES = MEASUREMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE__DIAGRAM_OBJECTS = MEASUREMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE__MRID = MEASUREMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE__ALIAS_NAME = MEASUREMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE__NAME = MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE__MODELING_AUTHORITY_SET = MEASUREMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE__TERMINAL = MEASUREMENT__TERMINAL;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE__PHASES = MEASUREMENT__PHASES;

	/**
	 * The feature id for the '<em><b>Measurement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE__MEASUREMENT_TYPE = MEASUREMENT__MEASUREMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Unit Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE__UNIT_MULTIPLIER = MEASUREMENT__UNIT_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Unit Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE__UNIT_SYMBOL = MEASUREMENT__UNIT_SYMBOL;

	/**
	 * The feature id for the '<em><b>Power System Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE__POWER_SYSTEM_RESOURCE = MEASUREMENT__POWER_SYSTEM_RESOURCE;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE__LOCATIONS = MEASUREMENT__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE__ASSET = MEASUREMENT__ASSET;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE__DOCUMENTS = MEASUREMENT__DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Normal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE__NORMAL_VALUE = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE__MIN_VALUE = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE__COMMAND = MEASUREMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Discrete Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE__DISCRETE_VALUES = MEASUREMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value Alias Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE__VALUE_ALIAS_SET = MEASUREMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE__MAX_VALUE = MEASUREMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Discrete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Discrete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_OPERATION_COUNT = MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.ValueAliasSet <em>Value Alias Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.ValueAliasSet
	 * @see CIM15.IEC61970.Meas.MeasPackage#getValueAliasSet()
	 * @generated
	 */
	public static final int VALUE_ALIAS_SET = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_ALIAS_SET__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_ALIAS_SET__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_ALIAS_SET__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_ALIAS_SET__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_ALIAS_SET__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_ALIAS_SET__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_ALIAS_SET__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Discretes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_ALIAS_SET__DISCRETES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_ALIAS_SET__COMMANDS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_ALIAS_SET__VALUES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Value Alias Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_ALIAS_SET_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Value Alias Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_ALIAS_SET_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.Quality61850 <em>Quality61850</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.Quality61850
	 * @see CIM15.IEC61970.Meas.MeasPackage#getQuality61850()
	 * @generated
	 */
	public static final int QUALITY61850 = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALITY61850__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Over Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALITY61850__OVER_FLOW = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Estimator Replaced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALITY61850__ESTIMATOR_REPLACED = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALITY61850__VALIDITY = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operator Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALITY61850__OPERATOR_BLOCKED = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Old Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALITY61850__OLD_DATA = CIM15Package.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALITY61850__FAILURE = CIM15Package.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALITY61850__SOURCE = CIM15Package.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Out Of Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALITY61850__OUT_OF_RANGE = CIM15Package.ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Bad Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALITY61850__BAD_REFERENCE = CIM15Package.ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Suspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALITY61850__SUSPECT = CIM15Package.ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALITY61850__TEST = CIM15Package.ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Oscillatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALITY61850__OSCILLATORY = CIM15Package.ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Quality61850</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALITY61850_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Quality61850</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int QUALITY61850_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.AccumulatorValue <em>Accumulator Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.AccumulatorValue
	 * @see CIM15.IEC61970.Meas.MeasPackage#getAccumulatorValue()
	 * @generated
	 */
	public static final int ACCUMULATOR_VALUE = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_VALUE__UUID = MEASUREMENT_VALUE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_VALUE__NAMES = MEASUREMENT_VALUE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_VALUE__DIAGRAM_OBJECTS = MEASUREMENT_VALUE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_VALUE__MRID = MEASUREMENT_VALUE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_VALUE__ALIAS_NAME = MEASUREMENT_VALUE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_VALUE__NAME = MEASUREMENT_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_VALUE__MODELING_AUTHORITY_SET = MEASUREMENT_VALUE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Gml Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_VALUE__GML_VALUES = MEASUREMENT_VALUE__GML_VALUES;

	/**
	 * The feature id for the '<em><b>Measurement Value Quality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_VALUE__MEASUREMENT_VALUE_QUALITY = MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY;

	/**
	 * The feature id for the '<em><b>Sensor Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_VALUE__SENSOR_ACCURACY = MEASUREMENT_VALUE__SENSOR_ACCURACY;

	/**
	 * The feature id for the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_VALUE__PROCEDURE_DATA_SETS = MEASUREMENT_VALUE__PROCEDURE_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Measurement Value Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_VALUE__MEASUREMENT_VALUE_SOURCE = MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE;

	/**
	 * The feature id for the '<em><b>Erp Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_VALUE__ERP_PERSON = MEASUREMENT_VALUE__ERP_PERSON;

	/**
	 * The feature id for the '<em><b>Remote Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_VALUE__REMOTE_SOURCE = MEASUREMENT_VALUE__REMOTE_SOURCE;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_VALUE__TIME_STAMP = MEASUREMENT_VALUE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_VALUE__VALUE = MEASUREMENT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_VALUE__ACCUMULATOR = MEASUREMENT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Accumulator Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_VALUE_FEATURE_COUNT = MEASUREMENT_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Accumulator Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_VALUE_OPERATION_COUNT = MEASUREMENT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.Command <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.Command
	 * @see CIM15.IEC61970.Meas.MeasPackage#getCommand()
	 * @generated
	 */
	public static final int COMMAND = 16;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND__UUID = CONTROL__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND__NAMES = CONTROL__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND__DIAGRAM_OBJECTS = CONTROL__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND__MRID = CONTROL__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND__ALIAS_NAME = CONTROL__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND__MODELING_AUTHORITY_SET = CONTROL__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Remote Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND__REMOTE_CONTROL = CONTROL__REMOTE_CONTROL;

	/**
	 * The feature id for the '<em><b>Regulating Cond Eq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND__REGULATING_COND_EQ = CONTROL__REGULATING_COND_EQ;

	/**
	 * The feature id for the '<em><b>Control Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND__CONTROL_TYPE = CONTROL__CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Unit Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND__UNIT_SYMBOL = CONTROL__UNIT_SYMBOL;

	/**
	 * The feature id for the '<em><b>Unit Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND__UNIT_MULTIPLIER = CONTROL__UNIT_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Operation In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND__OPERATION_IN_PROGRESS = CONTROL__OPERATION_IN_PROGRESS;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND__TIME_STAMP = CONTROL__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Discrete</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND__DISCRETE = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Alias Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND__VALUE_ALIAS_SET = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND__VALUE = CONTROL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Normal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND__NORMAL_VALUE = CONTROL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.Accumulator <em>Accumulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.Accumulator
	 * @see CIM15.IEC61970.Meas.MeasPackage#getAccumulator()
	 * @generated
	 */
	public static final int ACCUMULATOR = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR__UUID = MEASUREMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR__NAMES = MEASUREMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR__DIAGRAM_OBJECTS = MEASUREMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR__MRID = MEASUREMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR__ALIAS_NAME = MEASUREMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR__NAME = MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR__MODELING_AUTHORITY_SET = MEASUREMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR__TERMINAL = MEASUREMENT__TERMINAL;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR__PHASES = MEASUREMENT__PHASES;

	/**
	 * The feature id for the '<em><b>Measurement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR__MEASUREMENT_TYPE = MEASUREMENT__MEASUREMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Unit Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR__UNIT_MULTIPLIER = MEASUREMENT__UNIT_MULTIPLIER;

	/**
	 * The feature id for the '<em><b>Unit Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR__UNIT_SYMBOL = MEASUREMENT__UNIT_SYMBOL;

	/**
	 * The feature id for the '<em><b>Power System Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR__POWER_SYSTEM_RESOURCE = MEASUREMENT__POWER_SYSTEM_RESOURCE;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR__LOCATIONS = MEASUREMENT__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR__ASSET = MEASUREMENT__ASSET;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR__DOCUMENTS = MEASUREMENT__DOCUMENTS;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR__MAX_VALUE = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Limit Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR__LIMIT_SETS = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Accumulator Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR__ACCUMULATOR_VALUES = MEASUREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Accumulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Accumulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_OPERATION_COUNT = MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.MeasurementValueQuality <em>Measurement Value Quality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.MeasurementValueQuality
	 * @see CIM15.IEC61970.Meas.MeasPackage#getMeasurementValueQuality()
	 * @generated
	 */
	public static final int MEASUREMENT_VALUE_QUALITY = 18;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_QUALITY__UUID = QUALITY61850__UUID;

	/**
	 * The feature id for the '<em><b>Over Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_QUALITY__OVER_FLOW = QUALITY61850__OVER_FLOW;

	/**
	 * The feature id for the '<em><b>Estimator Replaced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_QUALITY__ESTIMATOR_REPLACED = QUALITY61850__ESTIMATOR_REPLACED;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_QUALITY__VALIDITY = QUALITY61850__VALIDITY;

	/**
	 * The feature id for the '<em><b>Operator Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_QUALITY__OPERATOR_BLOCKED = QUALITY61850__OPERATOR_BLOCKED;

	/**
	 * The feature id for the '<em><b>Old Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_QUALITY__OLD_DATA = QUALITY61850__OLD_DATA;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_QUALITY__FAILURE = QUALITY61850__FAILURE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_QUALITY__SOURCE = QUALITY61850__SOURCE;

	/**
	 * The feature id for the '<em><b>Out Of Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_QUALITY__OUT_OF_RANGE = QUALITY61850__OUT_OF_RANGE;

	/**
	 * The feature id for the '<em><b>Bad Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_QUALITY__BAD_REFERENCE = QUALITY61850__BAD_REFERENCE;

	/**
	 * The feature id for the '<em><b>Suspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_QUALITY__SUSPECT = QUALITY61850__SUSPECT;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_QUALITY__TEST = QUALITY61850__TEST;

	/**
	 * The feature id for the '<em><b>Oscillatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_QUALITY__OSCILLATORY = QUALITY61850__OSCILLATORY;

	/**
	 * The feature id for the '<em><b>Measurement Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE = QUALITY61850_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measurement Value Quality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_QUALITY_FEATURE_COUNT = QUALITY61850_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Measurement Value Quality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_VALUE_QUALITY_OPERATION_COUNT = QUALITY61850_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.DiscreteValue <em>Discrete Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.DiscreteValue
	 * @see CIM15.IEC61970.Meas.MeasPackage#getDiscreteValue()
	 * @generated
	 */
	public static final int DISCRETE_VALUE = 20;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_VALUE__UUID = MEASUREMENT_VALUE__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_VALUE__NAMES = MEASUREMENT_VALUE__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_VALUE__DIAGRAM_OBJECTS = MEASUREMENT_VALUE__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_VALUE__MRID = MEASUREMENT_VALUE__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_VALUE__ALIAS_NAME = MEASUREMENT_VALUE__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_VALUE__NAME = MEASUREMENT_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_VALUE__MODELING_AUTHORITY_SET = MEASUREMENT_VALUE__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Gml Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_VALUE__GML_VALUES = MEASUREMENT_VALUE__GML_VALUES;

	/**
	 * The feature id for the '<em><b>Measurement Value Quality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_VALUE__MEASUREMENT_VALUE_QUALITY = MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY;

	/**
	 * The feature id for the '<em><b>Sensor Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_VALUE__SENSOR_ACCURACY = MEASUREMENT_VALUE__SENSOR_ACCURACY;

	/**
	 * The feature id for the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_VALUE__PROCEDURE_DATA_SETS = MEASUREMENT_VALUE__PROCEDURE_DATA_SETS;

	/**
	 * The feature id for the '<em><b>Measurement Value Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_VALUE__MEASUREMENT_VALUE_SOURCE = MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE;

	/**
	 * The feature id for the '<em><b>Erp Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_VALUE__ERP_PERSON = MEASUREMENT_VALUE__ERP_PERSON;

	/**
	 * The feature id for the '<em><b>Remote Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_VALUE__REMOTE_SOURCE = MEASUREMENT_VALUE__REMOTE_SOURCE;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_VALUE__TIME_STAMP = MEASUREMENT_VALUE__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Discrete</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_VALUE__DISCRETE = MEASUREMENT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_VALUE__VALUE = MEASUREMENT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Discrete Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_VALUE_FEATURE_COUNT = MEASUREMENT_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Discrete Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETE_VALUE_OPERATION_COUNT = MEASUREMENT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.LimitSet <em>Limit Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.LimitSet
	 * @see CIM15.IEC61970.Meas.MeasPackage#getLimitSet()
	 * @generated
	 */
	public static final int LIMIT_SET = 22;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT_SET__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT_SET__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT_SET__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT_SET__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT_SET__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT_SET__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT_SET__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Is Percentage Limits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT_SET__IS_PERCENTAGE_LIMITS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT_SET_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT_SET_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.AnalogLimitSet <em>Analog Limit Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.AnalogLimitSet
	 * @see CIM15.IEC61970.Meas.MeasPackage#getAnalogLimitSet()
	 * @generated
	 */
	public static final int ANALOG_LIMIT_SET = 21;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_LIMIT_SET__UUID = LIMIT_SET__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_LIMIT_SET__NAMES = LIMIT_SET__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_LIMIT_SET__DIAGRAM_OBJECTS = LIMIT_SET__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_LIMIT_SET__MRID = LIMIT_SET__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_LIMIT_SET__ALIAS_NAME = LIMIT_SET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_LIMIT_SET__NAME = LIMIT_SET__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_LIMIT_SET__MODELING_AUTHORITY_SET = LIMIT_SET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Is Percentage Limits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_LIMIT_SET__IS_PERCENTAGE_LIMITS = LIMIT_SET__IS_PERCENTAGE_LIMITS;

	/**
	 * The feature id for the '<em><b>Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_LIMIT_SET__LIMITS = LIMIT_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_LIMIT_SET__MEASUREMENTS = LIMIT_SET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Analog Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_LIMIT_SET_FEATURE_COUNT = LIMIT_SET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Analog Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_LIMIT_SET_OPERATION_COUNT = LIMIT_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.AccumulatorLimitSet <em>Accumulator Limit Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.AccumulatorLimitSet
	 * @see CIM15.IEC61970.Meas.MeasPackage#getAccumulatorLimitSet()
	 * @generated
	 */
	public static final int ACCUMULATOR_LIMIT_SET = 23;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_LIMIT_SET__UUID = LIMIT_SET__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_LIMIT_SET__NAMES = LIMIT_SET__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_LIMIT_SET__DIAGRAM_OBJECTS = LIMIT_SET__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_LIMIT_SET__MRID = LIMIT_SET__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_LIMIT_SET__ALIAS_NAME = LIMIT_SET__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_LIMIT_SET__NAME = LIMIT_SET__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_LIMIT_SET__MODELING_AUTHORITY_SET = LIMIT_SET__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Is Percentage Limits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_LIMIT_SET__IS_PERCENTAGE_LIMITS = LIMIT_SET__IS_PERCENTAGE_LIMITS;

	/**
	 * The feature id for the '<em><b>Limits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_LIMIT_SET__LIMITS = LIMIT_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_LIMIT_SET__MEASUREMENTS = LIMIT_SET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Accumulator Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_LIMIT_SET_FEATURE_COUNT = LIMIT_SET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Accumulator Limit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCUMULATOR_LIMIT_SET_OPERATION_COUNT = LIMIT_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Meas.Validity <em>Validity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Meas.Validity
	 * @see CIM15.IEC61970.Meas.MeasPackage#getValidity()
	 * @generated
	 */
	public static final int VALIDITY = 25;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accumulatorLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueToAliasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementValueSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringMeasurementValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass limitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueAliasSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quality61850EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accumulatorValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accumulatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementValueQualityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogLimitSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass limitSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accumulatorLimitSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum validityEEnum = null;

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
	 * @see CIM15.IEC61970.Meas.MeasPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MeasPackage() {
		super(eNS_URI, MeasFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link MeasPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static MeasPackage init() {
		if (isInited) return (MeasPackage)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI);

		// Obtain or create and register package
		MeasPackage theMeasPackage = (MeasPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MeasPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MeasPackage());

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
		theMeasPackage.fixPackageContents();
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
		theMeasPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MeasPackage.eNS_URI, theMeasPackage);
		return theMeasPackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.AccumulatorLimit <em>Accumulator Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accumulator Limit</em>'.
	 * @see CIM15.IEC61970.Meas.AccumulatorLimit
	 * @generated
	 */
	public EClass getAccumulatorLimit() {
		if (accumulatorLimitEClass == null) {
			accumulatorLimitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(0);
		}
		return accumulatorLimitEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Meas.AccumulatorLimit#getLimitSet <em>Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Limit Set</em>'.
	 * @see CIM15.IEC61970.Meas.AccumulatorLimit#getLimitSet()
	 * @see #getAccumulatorLimit()
	 * @generated
	 */
	public EReference getAccumulatorLimit_LimitSet() {
        return (EReference)getAccumulatorLimit().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.AccumulatorLimit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM15.IEC61970.Meas.AccumulatorLimit#getValue()
	 * @see #getAccumulatorLimit()
	 * @generated
	 */
	public EAttribute getAccumulatorLimit_Value() {
        return (EAttribute)getAccumulatorLimit().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.ValueToAlias <em>Value To Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value To Alias</em>'.
	 * @see CIM15.IEC61970.Meas.ValueToAlias
	 * @generated
	 */
	public EClass getValueToAlias() {
		if (valueToAliasEClass == null) {
			valueToAliasEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(1);
		}
		return valueToAliasEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.ValueToAlias#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM15.IEC61970.Meas.ValueToAlias#getValue()
	 * @see #getValueToAlias()
	 * @generated
	 */
	public EAttribute getValueToAlias_Value() {
        return (EAttribute)getValueToAlias().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Meas.ValueToAlias#getValueAliasSet <em>Value Alias Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Alias Set</em>'.
	 * @see CIM15.IEC61970.Meas.ValueToAlias#getValueAliasSet()
	 * @see #getValueToAlias()
	 * @generated
	 */
	public EReference getValueToAlias_ValueAliasSet() {
        return (EReference)getValueToAlias().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.MeasurementValueSource <em>Measurement Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Value Source</em>'.
	 * @see CIM15.IEC61970.Meas.MeasurementValueSource
	 * @generated
	 */
	public EClass getMeasurementValueSource() {
		if (measurementValueSourceEClass == null) {
			measurementValueSourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(2);
		}
		return measurementValueSourceEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Meas.MeasurementValueSource#getMeasurementValues <em>Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurement Values</em>'.
	 * @see CIM15.IEC61970.Meas.MeasurementValueSource#getMeasurementValues()
	 * @see #getMeasurementValueSource()
	 * @generated
	 */
	public EReference getMeasurementValueSource_MeasurementValues() {
        return (EReference)getMeasurementValueSource().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.Analog <em>Analog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog</em>'.
	 * @see CIM15.IEC61970.Meas.Analog
	 * @generated
	 */
	public EClass getAnalog() {
		if (analogEClass == null) {
			analogEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(3);
		}
		return analogEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Meas.Analog#getLimitSets <em>Limit Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Limit Sets</em>'.
	 * @see CIM15.IEC61970.Meas.Analog#getLimitSets()
	 * @see #getAnalog()
	 * @generated
	 */
	public EReference getAnalog_LimitSets() {
        return (EReference)getAnalog().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Analog#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see CIM15.IEC61970.Meas.Analog#getMaxValue()
	 * @see #getAnalog()
	 * @generated
	 */
	public EAttribute getAnalog_MaxValue() {
        return (EAttribute)getAnalog().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Meas.Analog#getAnalogValues <em>Analog Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Analog Values</em>'.
	 * @see CIM15.IEC61970.Meas.Analog#getAnalogValues()
	 * @see #getAnalog()
	 * @generated
	 */
	public EReference getAnalog_AnalogValues() {
        return (EReference)getAnalog().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Meas.Analog#getSetPoint <em>Set Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set Point</em>'.
	 * @see CIM15.IEC61970.Meas.Analog#getSetPoint()
	 * @see #getAnalog()
	 * @generated
	 */
	public EReference getAnalog_SetPoint() {
        return (EReference)getAnalog().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Analog#getNormalValue <em>Normal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Value</em>'.
	 * @see CIM15.IEC61970.Meas.Analog#getNormalValue()
	 * @see #getAnalog()
	 * @generated
	 */
	public EAttribute getAnalog_NormalValue() {
        return (EAttribute)getAnalog().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Analog#isPositiveFlowIn <em>Positive Flow In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positive Flow In</em>'.
	 * @see CIM15.IEC61970.Meas.Analog#isPositiveFlowIn()
	 * @see #getAnalog()
	 * @generated
	 */
	public EAttribute getAnalog_PositiveFlowIn() {
        return (EAttribute)getAnalog().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Analog#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see CIM15.IEC61970.Meas.Analog#getMinValue()
	 * @see #getAnalog()
	 * @generated
	 */
	public EAttribute getAnalog_MinValue() {
        return (EAttribute)getAnalog().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.AnalogValue <em>Analog Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Value</em>'.
	 * @see CIM15.IEC61970.Meas.AnalogValue
	 * @generated
	 */
	public EClass getAnalogValue() {
		if (analogValueEClass == null) {
			analogValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(4);
		}
		return analogValueEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.AnalogValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM15.IEC61970.Meas.AnalogValue#getValue()
	 * @see #getAnalogValue()
	 * @generated
	 */
	public EAttribute getAnalogValue_Value() {
        return (EAttribute)getAnalogValue().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Meas.AnalogValue#getAltTieMeas <em>Alt Tie Meas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alt Tie Meas</em>'.
	 * @see CIM15.IEC61970.Meas.AnalogValue#getAltTieMeas()
	 * @see #getAnalogValue()
	 * @generated
	 */
	public EReference getAnalogValue_AltTieMeas() {
        return (EReference)getAnalogValue().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Meas.AnalogValue#getAnalog <em>Analog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analog</em>'.
	 * @see CIM15.IEC61970.Meas.AnalogValue#getAnalog()
	 * @see #getAnalogValue()
	 * @generated
	 */
	public EReference getAnalogValue_Analog() {
        return (EReference)getAnalogValue().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Meas.AnalogValue#getAltGeneratingUnit <em>Alt Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alt Generating Unit</em>'.
	 * @see CIM15.IEC61970.Meas.AnalogValue#getAltGeneratingUnit()
	 * @see #getAnalogValue()
	 * @generated
	 */
	public EReference getAnalogValue_AltGeneratingUnit() {
        return (EReference)getAnalogValue().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement</em>'.
	 * @see CIM15.IEC61970.Meas.Measurement
	 * @generated
	 */
	public EClass getMeasurement() {
		if (measurementEClass == null) {
			measurementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(5);
		}
		return measurementEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Meas.Measurement#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see CIM15.IEC61970.Meas.Measurement#getTerminal()
	 * @see #getMeasurement()
	 * @generated
	 */
	public EReference getMeasurement_Terminal() {
        return (EReference)getMeasurement().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Measurement#getPhases <em>Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phases</em>'.
	 * @see CIM15.IEC61970.Meas.Measurement#getPhases()
	 * @see #getMeasurement()
	 * @generated
	 */
	public EAttribute getMeasurement_Phases() {
        return (EAttribute)getMeasurement().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Measurement#getMeasurementType <em>Measurement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement Type</em>'.
	 * @see CIM15.IEC61970.Meas.Measurement#getMeasurementType()
	 * @see #getMeasurement()
	 * @generated
	 */
	public EAttribute getMeasurement_MeasurementType() {
        return (EAttribute)getMeasurement().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Measurement#getUnitMultiplier <em>Unit Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Multiplier</em>'.
	 * @see CIM15.IEC61970.Meas.Measurement#getUnitMultiplier()
	 * @see #getMeasurement()
	 * @generated
	 */
	public EAttribute getMeasurement_UnitMultiplier() {
        return (EAttribute)getMeasurement().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Measurement#getUnitSymbol <em>Unit Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Symbol</em>'.
	 * @see CIM15.IEC61970.Meas.Measurement#getUnitSymbol()
	 * @see #getMeasurement()
	 * @generated
	 */
	public EAttribute getMeasurement_UnitSymbol() {
        return (EAttribute)getMeasurement().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Meas.Measurement#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Power System Resource</em>'.
	 * @see CIM15.IEC61970.Meas.Measurement#getPowerSystemResource()
	 * @see #getMeasurement()
	 * @generated
	 */
	public EReference getMeasurement_PowerSystemResource() {
        return (EReference)getMeasurement().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Meas.Measurement#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see CIM15.IEC61970.Meas.Measurement#getLocations()
	 * @see #getMeasurement()
	 * @generated
	 */
	public EReference getMeasurement_Locations() {
        return (EReference)getMeasurement().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Meas.Measurement#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see CIM15.IEC61970.Meas.Measurement#getAsset()
	 * @see #getMeasurement()
	 * @generated
	 */
	public EReference getMeasurement_Asset() {
        return (EReference)getMeasurement().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Meas.Measurement#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documents</em>'.
	 * @see CIM15.IEC61970.Meas.Measurement#getDocuments()
	 * @see #getMeasurement()
	 * @generated
	 */
	public EReference getMeasurement_Documents() {
        return (EReference)getMeasurement().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.ControlType <em>Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Type</em>'.
	 * @see CIM15.IEC61970.Meas.ControlType
	 * @generated
	 */
	public EClass getControlType() {
		if (controlTypeEClass == null) {
			controlTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(6);
		}
		return controlTypeEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Meas.ControlType#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controls</em>'.
	 * @see CIM15.IEC61970.Meas.ControlType#getControls()
	 * @see #getControlType()
	 * @generated
	 */
	public EReference getControlType_Controls() {
        return (EReference)getControlType().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.StringMeasurementValue <em>String Measurement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Measurement Value</em>'.
	 * @see CIM15.IEC61970.Meas.StringMeasurementValue
	 * @generated
	 */
	public EClass getStringMeasurementValue() {
		if (stringMeasurementValueEClass == null) {
			stringMeasurementValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(7);
		}
		return stringMeasurementValueEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.StringMeasurementValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM15.IEC61970.Meas.StringMeasurementValue#getValue()
	 * @see #getStringMeasurementValue()
	 * @generated
	 */
	public EAttribute getStringMeasurementValue_Value() {
        return (EAttribute)getStringMeasurementValue().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Meas.StringMeasurementValue#getStringMeasurement <em>String Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>String Measurement</em>'.
	 * @see CIM15.IEC61970.Meas.StringMeasurementValue#getStringMeasurement()
	 * @see #getStringMeasurementValue()
	 * @generated
	 */
	public EReference getStringMeasurementValue_StringMeasurement() {
        return (EReference)getStringMeasurementValue().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.StringMeasurement <em>String Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Measurement</em>'.
	 * @see CIM15.IEC61970.Meas.StringMeasurement
	 * @generated
	 */
	public EClass getStringMeasurement() {
		if (stringMeasurementEClass == null) {
			stringMeasurementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(8);
		}
		return stringMeasurementEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Meas.StringMeasurement#getStringMeasurementValues <em>String Measurement Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>String Measurement Values</em>'.
	 * @see CIM15.IEC61970.Meas.StringMeasurement#getStringMeasurementValues()
	 * @see #getStringMeasurement()
	 * @generated
	 */
	public EReference getStringMeasurement_StringMeasurementValues() {
        return (EReference)getStringMeasurement().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.AnalogLimit <em>Analog Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Limit</em>'.
	 * @see CIM15.IEC61970.Meas.AnalogLimit
	 * @generated
	 */
	public EClass getAnalogLimit() {
		if (analogLimitEClass == null) {
			analogLimitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(9);
		}
		return analogLimitEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.AnalogLimit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM15.IEC61970.Meas.AnalogLimit#getValue()
	 * @see #getAnalogLimit()
	 * @generated
	 */
	public EAttribute getAnalogLimit_Value() {
        return (EAttribute)getAnalogLimit().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Meas.AnalogLimit#getLimitSet <em>Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Limit Set</em>'.
	 * @see CIM15.IEC61970.Meas.AnalogLimit#getLimitSet()
	 * @see #getAnalogLimit()
	 * @generated
	 */
	public EReference getAnalogLimit_LimitSet() {
        return (EReference)getAnalogLimit().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.SetPoint <em>Set Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Point</em>'.
	 * @see CIM15.IEC61970.Meas.SetPoint
	 * @generated
	 */
	public EClass getSetPoint() {
		if (setPointEClass == null) {
			setPointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(10);
		}
		return setPointEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Meas.SetPoint#getAnalog <em>Analog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analog</em>'.
	 * @see CIM15.IEC61970.Meas.SetPoint#getAnalog()
	 * @see #getSetPoint()
	 * @generated
	 */
	public EReference getSetPoint_Analog() {
        return (EReference)getSetPoint().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.SetPoint#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see CIM15.IEC61970.Meas.SetPoint#getMaxValue()
	 * @see #getSetPoint()
	 * @generated
	 */
	public EAttribute getSetPoint_MaxValue() {
        return (EAttribute)getSetPoint().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.SetPoint#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see CIM15.IEC61970.Meas.SetPoint#getMinValue()
	 * @see #getSetPoint()
	 * @generated
	 */
	public EAttribute getSetPoint_MinValue() {
        return (EAttribute)getSetPoint().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.SetPoint#getNormalValue <em>Normal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Value</em>'.
	 * @see CIM15.IEC61970.Meas.SetPoint#getNormalValue()
	 * @see #getSetPoint()
	 * @generated
	 */
	public EAttribute getSetPoint_NormalValue() {
        return (EAttribute)getSetPoint().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.SetPoint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM15.IEC61970.Meas.SetPoint#getValue()
	 * @see #getSetPoint()
	 * @generated
	 */
	public EAttribute getSetPoint_Value() {
        return (EAttribute)getSetPoint().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.Limit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limit</em>'.
	 * @see CIM15.IEC61970.Meas.Limit
	 * @generated
	 */
	public EClass getLimit() {
		if (limitEClass == null) {
			limitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(11);
		}
		return limitEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Meas.Limit#getProcedures <em>Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Procedures</em>'.
	 * @see CIM15.IEC61970.Meas.Limit#getProcedures()
	 * @see #getLimit()
	 * @generated
	 */
	public EReference getLimit_Procedures() {
        return (EReference)getLimit().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.Discrete <em>Discrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete</em>'.
	 * @see CIM15.IEC61970.Meas.Discrete
	 * @generated
	 */
	public EClass getDiscrete() {
		if (discreteEClass == null) {
			discreteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(12);
		}
		return discreteEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Discrete#getNormalValue <em>Normal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Value</em>'.
	 * @see CIM15.IEC61970.Meas.Discrete#getNormalValue()
	 * @see #getDiscrete()
	 * @generated
	 */
	public EAttribute getDiscrete_NormalValue() {
        return (EAttribute)getDiscrete().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Discrete#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see CIM15.IEC61970.Meas.Discrete#getMinValue()
	 * @see #getDiscrete()
	 * @generated
	 */
	public EAttribute getDiscrete_MinValue() {
        return (EAttribute)getDiscrete().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Meas.Discrete#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Command</em>'.
	 * @see CIM15.IEC61970.Meas.Discrete#getCommand()
	 * @see #getDiscrete()
	 * @generated
	 */
	public EReference getDiscrete_Command() {
        return (EReference)getDiscrete().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Meas.Discrete#getDiscreteValues <em>Discrete Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Discrete Values</em>'.
	 * @see CIM15.IEC61970.Meas.Discrete#getDiscreteValues()
	 * @see #getDiscrete()
	 * @generated
	 */
	public EReference getDiscrete_DiscreteValues() {
        return (EReference)getDiscrete().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Meas.Discrete#getValueAliasSet <em>Value Alias Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Alias Set</em>'.
	 * @see CIM15.IEC61970.Meas.Discrete#getValueAliasSet()
	 * @see #getDiscrete()
	 * @generated
	 */
	public EReference getDiscrete_ValueAliasSet() {
        return (EReference)getDiscrete().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Discrete#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see CIM15.IEC61970.Meas.Discrete#getMaxValue()
	 * @see #getDiscrete()
	 * @generated
	 */
	public EAttribute getDiscrete_MaxValue() {
        return (EAttribute)getDiscrete().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.ValueAliasSet <em>Value Alias Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Alias Set</em>'.
	 * @see CIM15.IEC61970.Meas.ValueAliasSet
	 * @generated
	 */
	public EClass getValueAliasSet() {
		if (valueAliasSetEClass == null) {
			valueAliasSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(13);
		}
		return valueAliasSetEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Meas.ValueAliasSet#getDiscretes <em>Discretes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Discretes</em>'.
	 * @see CIM15.IEC61970.Meas.ValueAliasSet#getDiscretes()
	 * @see #getValueAliasSet()
	 * @generated
	 */
	public EReference getValueAliasSet_Discretes() {
        return (EReference)getValueAliasSet().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Meas.ValueAliasSet#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commands</em>'.
	 * @see CIM15.IEC61970.Meas.ValueAliasSet#getCommands()
	 * @see #getValueAliasSet()
	 * @generated
	 */
	public EReference getValueAliasSet_Commands() {
        return (EReference)getValueAliasSet().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Meas.ValueAliasSet#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see CIM15.IEC61970.Meas.ValueAliasSet#getValues()
	 * @see #getValueAliasSet()
	 * @generated
	 */
	public EReference getValueAliasSet_Values() {
        return (EReference)getValueAliasSet().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.Quality61850 <em>Quality61850</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality61850</em>'.
	 * @see CIM15.IEC61970.Meas.Quality61850
	 * @generated
	 */
	public EClass getQuality61850() {
		if (quality61850EClass == null) {
			quality61850EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(14);
		}
		return quality61850EClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Quality61850#isOverFlow <em>Over Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Over Flow</em>'.
	 * @see CIM15.IEC61970.Meas.Quality61850#isOverFlow()
	 * @see #getQuality61850()
	 * @generated
	 */
	public EAttribute getQuality61850_OverFlow() {
        return (EAttribute)getQuality61850().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Quality61850#isEstimatorReplaced <em>Estimator Replaced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimator Replaced</em>'.
	 * @see CIM15.IEC61970.Meas.Quality61850#isEstimatorReplaced()
	 * @see #getQuality61850()
	 * @generated
	 */
	public EAttribute getQuality61850_EstimatorReplaced() {
        return (EAttribute)getQuality61850().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Quality61850#getValidity <em>Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validity</em>'.
	 * @see CIM15.IEC61970.Meas.Quality61850#getValidity()
	 * @see #getQuality61850()
	 * @generated
	 */
	public EAttribute getQuality61850_Validity() {
        return (EAttribute)getQuality61850().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Quality61850#isOperatorBlocked <em>Operator Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator Blocked</em>'.
	 * @see CIM15.IEC61970.Meas.Quality61850#isOperatorBlocked()
	 * @see #getQuality61850()
	 * @generated
	 */
	public EAttribute getQuality61850_OperatorBlocked() {
        return (EAttribute)getQuality61850().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Quality61850#isOldData <em>Old Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Data</em>'.
	 * @see CIM15.IEC61970.Meas.Quality61850#isOldData()
	 * @see #getQuality61850()
	 * @generated
	 */
	public EAttribute getQuality61850_OldData() {
        return (EAttribute)getQuality61850().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Quality61850#isFailure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure</em>'.
	 * @see CIM15.IEC61970.Meas.Quality61850#isFailure()
	 * @see #getQuality61850()
	 * @generated
	 */
	public EAttribute getQuality61850_Failure() {
        return (EAttribute)getQuality61850().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Quality61850#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see CIM15.IEC61970.Meas.Quality61850#getSource()
	 * @see #getQuality61850()
	 * @generated
	 */
	public EAttribute getQuality61850_Source() {
        return (EAttribute)getQuality61850().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Quality61850#isOutOfRange <em>Out Of Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Of Range</em>'.
	 * @see CIM15.IEC61970.Meas.Quality61850#isOutOfRange()
	 * @see #getQuality61850()
	 * @generated
	 */
	public EAttribute getQuality61850_OutOfRange() {
        return (EAttribute)getQuality61850().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Quality61850#isBadReference <em>Bad Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bad Reference</em>'.
	 * @see CIM15.IEC61970.Meas.Quality61850#isBadReference()
	 * @see #getQuality61850()
	 * @generated
	 */
	public EAttribute getQuality61850_BadReference() {
        return (EAttribute)getQuality61850().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Quality61850#isSuspect <em>Suspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspect</em>'.
	 * @see CIM15.IEC61970.Meas.Quality61850#isSuspect()
	 * @see #getQuality61850()
	 * @generated
	 */
	public EAttribute getQuality61850_Suspect() {
        return (EAttribute)getQuality61850().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Quality61850#isTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test</em>'.
	 * @see CIM15.IEC61970.Meas.Quality61850#isTest()
	 * @see #getQuality61850()
	 * @generated
	 */
	public EAttribute getQuality61850_Test() {
        return (EAttribute)getQuality61850().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Quality61850#isOscillatory <em>Oscillatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oscillatory</em>'.
	 * @see CIM15.IEC61970.Meas.Quality61850#isOscillatory()
	 * @see #getQuality61850()
	 * @generated
	 */
	public EAttribute getQuality61850_Oscillatory() {
        return (EAttribute)getQuality61850().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.AccumulatorValue <em>Accumulator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accumulator Value</em>'.
	 * @see CIM15.IEC61970.Meas.AccumulatorValue
	 * @generated
	 */
	public EClass getAccumulatorValue() {
		if (accumulatorValueEClass == null) {
			accumulatorValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(15);
		}
		return accumulatorValueEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.AccumulatorValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM15.IEC61970.Meas.AccumulatorValue#getValue()
	 * @see #getAccumulatorValue()
	 * @generated
	 */
	public EAttribute getAccumulatorValue_Value() {
        return (EAttribute)getAccumulatorValue().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Meas.AccumulatorValue#getAccumulator <em>Accumulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accumulator</em>'.
	 * @see CIM15.IEC61970.Meas.AccumulatorValue#getAccumulator()
	 * @see #getAccumulatorValue()
	 * @generated
	 */
	public EReference getAccumulatorValue_Accumulator() {
        return (EReference)getAccumulatorValue().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see CIM15.IEC61970.Meas.Command
	 * @generated
	 */
	public EClass getCommand() {
		if (commandEClass == null) {
			commandEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(16);
		}
		return commandEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Meas.Command#getDiscrete <em>Discrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Discrete</em>'.
	 * @see CIM15.IEC61970.Meas.Command#getDiscrete()
	 * @see #getCommand()
	 * @generated
	 */
	public EReference getCommand_Discrete() {
        return (EReference)getCommand().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Meas.Command#getValueAliasSet <em>Value Alias Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Alias Set</em>'.
	 * @see CIM15.IEC61970.Meas.Command#getValueAliasSet()
	 * @see #getCommand()
	 * @generated
	 */
	public EReference getCommand_ValueAliasSet() {
        return (EReference)getCommand().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Command#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM15.IEC61970.Meas.Command#getValue()
	 * @see #getCommand()
	 * @generated
	 */
	public EAttribute getCommand_Value() {
        return (EAttribute)getCommand().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Command#getNormalValue <em>Normal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal Value</em>'.
	 * @see CIM15.IEC61970.Meas.Command#getNormalValue()
	 * @see #getCommand()
	 * @generated
	 */
	public EAttribute getCommand_NormalValue() {
        return (EAttribute)getCommand().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.Accumulator <em>Accumulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accumulator</em>'.
	 * @see CIM15.IEC61970.Meas.Accumulator
	 * @generated
	 */
	public EClass getAccumulator() {
		if (accumulatorEClass == null) {
			accumulatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(17);
		}
		return accumulatorEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Accumulator#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see CIM15.IEC61970.Meas.Accumulator#getMaxValue()
	 * @see #getAccumulator()
	 * @generated
	 */
	public EAttribute getAccumulator_MaxValue() {
        return (EAttribute)getAccumulator().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Meas.Accumulator#getLimitSets <em>Limit Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Limit Sets</em>'.
	 * @see CIM15.IEC61970.Meas.Accumulator#getLimitSets()
	 * @see #getAccumulator()
	 * @generated
	 */
	public EReference getAccumulator_LimitSets() {
        return (EReference)getAccumulator().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Meas.Accumulator#getAccumulatorValues <em>Accumulator Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accumulator Values</em>'.
	 * @see CIM15.IEC61970.Meas.Accumulator#getAccumulatorValues()
	 * @see #getAccumulator()
	 * @generated
	 */
	public EReference getAccumulator_AccumulatorValues() {
        return (EReference)getAccumulator().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.MeasurementValueQuality <em>Measurement Value Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Value Quality</em>'.
	 * @see CIM15.IEC61970.Meas.MeasurementValueQuality
	 * @generated
	 */
	public EClass getMeasurementValueQuality() {
		if (measurementValueQualityEClass == null) {
			measurementValueQualityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(18);
		}
		return measurementValueQualityEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Meas.MeasurementValueQuality#getMeasurementValue <em>Measurement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurement Value</em>'.
	 * @see CIM15.IEC61970.Meas.MeasurementValueQuality#getMeasurementValue()
	 * @see #getMeasurementValueQuality()
	 * @generated
	 */
	public EReference getMeasurementValueQuality_MeasurementValue() {
        return (EReference)getMeasurementValueQuality().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.MeasurementValue <em>Measurement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Value</em>'.
	 * @see CIM15.IEC61970.Meas.MeasurementValue
	 * @generated
	 */
	public EClass getMeasurementValue() {
		if (measurementValueEClass == null) {
			measurementValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(20);
		}
		return measurementValueEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Meas.MeasurementValue#getGmlValues <em>Gml Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gml Values</em>'.
	 * @see CIM15.IEC61970.Meas.MeasurementValue#getGmlValues()
	 * @see #getMeasurementValue()
	 * @generated
	 */
	public EReference getMeasurementValue_GmlValues() {
        return (EReference)getMeasurementValue().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Meas.MeasurementValue#getMeasurementValueQuality <em>Measurement Value Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurement Value Quality</em>'.
	 * @see CIM15.IEC61970.Meas.MeasurementValue#getMeasurementValueQuality()
	 * @see #getMeasurementValue()
	 * @generated
	 */
	public EReference getMeasurementValue_MeasurementValueQuality() {
        return (EReference)getMeasurementValue().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.MeasurementValue#getSensorAccuracy <em>Sensor Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Accuracy</em>'.
	 * @see CIM15.IEC61970.Meas.MeasurementValue#getSensorAccuracy()
	 * @see #getMeasurementValue()
	 * @generated
	 */
	public EAttribute getMeasurementValue_SensorAccuracy() {
        return (EAttribute)getMeasurementValue().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Meas.MeasurementValue#getProcedureDataSets <em>Procedure Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Procedure Data Sets</em>'.
	 * @see CIM15.IEC61970.Meas.MeasurementValue#getProcedureDataSets()
	 * @see #getMeasurementValue()
	 * @generated
	 */
	public EReference getMeasurementValue_ProcedureDataSets() {
        return (EReference)getMeasurementValue().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Meas.MeasurementValue#getMeasurementValueSource <em>Measurement Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurement Value Source</em>'.
	 * @see CIM15.IEC61970.Meas.MeasurementValue#getMeasurementValueSource()
	 * @see #getMeasurementValue()
	 * @generated
	 */
	public EReference getMeasurementValue_MeasurementValueSource() {
        return (EReference)getMeasurementValue().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Meas.MeasurementValue#getErpPerson <em>Erp Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Erp Person</em>'.
	 * @see CIM15.IEC61970.Meas.MeasurementValue#getErpPerson()
	 * @see #getMeasurementValue()
	 * @generated
	 */
	public EReference getMeasurementValue_ErpPerson() {
        return (EReference)getMeasurementValue().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Meas.MeasurementValue#getRemoteSource <em>Remote Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Remote Source</em>'.
	 * @see CIM15.IEC61970.Meas.MeasurementValue#getRemoteSource()
	 * @see #getMeasurementValue()
	 * @generated
	 */
	public EReference getMeasurementValue_RemoteSource() {
        return (EReference)getMeasurementValue().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.MeasurementValue#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see CIM15.IEC61970.Meas.MeasurementValue#getTimeStamp()
	 * @see #getMeasurementValue()
	 * @generated
	 */
	public EAttribute getMeasurementValue_TimeStamp() {
        return (EAttribute)getMeasurementValue().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.DiscreteValue <em>Discrete Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Value</em>'.
	 * @see CIM15.IEC61970.Meas.DiscreteValue
	 * @generated
	 */
	public EClass getDiscreteValue() {
		if (discreteValueEClass == null) {
			discreteValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(21);
		}
		return discreteValueEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Meas.DiscreteValue#getDiscrete <em>Discrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Discrete</em>'.
	 * @see CIM15.IEC61970.Meas.DiscreteValue#getDiscrete()
	 * @see #getDiscreteValue()
	 * @generated
	 */
	public EReference getDiscreteValue_Discrete() {
        return (EReference)getDiscreteValue().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.DiscreteValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM15.IEC61970.Meas.DiscreteValue#getValue()
	 * @see #getDiscreteValue()
	 * @generated
	 */
	public EAttribute getDiscreteValue_Value() {
        return (EAttribute)getDiscreteValue().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.AnalogLimitSet <em>Analog Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Limit Set</em>'.
	 * @see CIM15.IEC61970.Meas.AnalogLimitSet
	 * @generated
	 */
	public EClass getAnalogLimitSet() {
		if (analogLimitSetEClass == null) {
			analogLimitSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(22);
		}
		return analogLimitSetEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Meas.AnalogLimitSet#getLimits <em>Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Limits</em>'.
	 * @see CIM15.IEC61970.Meas.AnalogLimitSet#getLimits()
	 * @see #getAnalogLimitSet()
	 * @generated
	 */
	public EReference getAnalogLimitSet_Limits() {
        return (EReference)getAnalogLimitSet().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Meas.AnalogLimitSet#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurements</em>'.
	 * @see CIM15.IEC61970.Meas.AnalogLimitSet#getMeasurements()
	 * @see #getAnalogLimitSet()
	 * @generated
	 */
	public EReference getAnalogLimitSet_Measurements() {
        return (EReference)getAnalogLimitSet().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.LimitSet <em>Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limit Set</em>'.
	 * @see CIM15.IEC61970.Meas.LimitSet
	 * @generated
	 */
	public EClass getLimitSet() {
		if (limitSetEClass == null) {
			limitSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(23);
		}
		return limitSetEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.LimitSet#isIsPercentageLimits <em>Is Percentage Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Percentage Limits</em>'.
	 * @see CIM15.IEC61970.Meas.LimitSet#isIsPercentageLimits()
	 * @see #getLimitSet()
	 * @generated
	 */
	public EAttribute getLimitSet_IsPercentageLimits() {
        return (EAttribute)getLimitSet().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.AccumulatorLimitSet <em>Accumulator Limit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accumulator Limit Set</em>'.
	 * @see CIM15.IEC61970.Meas.AccumulatorLimitSet
	 * @generated
	 */
	public EClass getAccumulatorLimitSet() {
		if (accumulatorLimitSetEClass == null) {
			accumulatorLimitSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(24);
		}
		return accumulatorLimitSetEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Meas.AccumulatorLimitSet#getLimits <em>Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Limits</em>'.
	 * @see CIM15.IEC61970.Meas.AccumulatorLimitSet#getLimits()
	 * @see #getAccumulatorLimitSet()
	 * @generated
	 */
	public EReference getAccumulatorLimitSet_Limits() {
        return (EReference)getAccumulatorLimitSet().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61970.Meas.AccumulatorLimitSet#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurements</em>'.
	 * @see CIM15.IEC61970.Meas.AccumulatorLimitSet#getMeasurements()
	 * @see #getAccumulatorLimitSet()
	 * @generated
	 */
	public EReference getAccumulatorLimitSet_Measurements() {
        return (EReference)getAccumulatorLimitSet().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Meas.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see CIM15.IEC61970.Meas.Control
	 * @generated
	 */
	public EClass getControl() {
		if (controlEClass == null) {
			controlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(25);
		}
		return controlEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Meas.Control#getRemoteControl <em>Remote Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Remote Control</em>'.
	 * @see CIM15.IEC61970.Meas.Control#getRemoteControl()
	 * @see #getControl()
	 * @generated
	 */
	public EReference getControl_RemoteControl() {
        return (EReference)getControl().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Meas.Control#getRegulatingCondEq <em>Regulating Cond Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Regulating Cond Eq</em>'.
	 * @see CIM15.IEC61970.Meas.Control#getRegulatingCondEq()
	 * @see #getControl()
	 * @generated
	 */
	public EReference getControl_RegulatingCondEq() {
        return (EReference)getControl().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61970.Meas.Control#getControlType <em>Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Type</em>'.
	 * @see CIM15.IEC61970.Meas.Control#getControlType()
	 * @see #getControl()
	 * @generated
	 */
	public EReference getControl_ControlType() {
        return (EReference)getControl().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Control#getUnitSymbol <em>Unit Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Symbol</em>'.
	 * @see CIM15.IEC61970.Meas.Control#getUnitSymbol()
	 * @see #getControl()
	 * @generated
	 */
	public EAttribute getControl_UnitSymbol() {
        return (EAttribute)getControl().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Control#getUnitMultiplier <em>Unit Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Multiplier</em>'.
	 * @see CIM15.IEC61970.Meas.Control#getUnitMultiplier()
	 * @see #getControl()
	 * @generated
	 */
	public EAttribute getControl_UnitMultiplier() {
        return (EAttribute)getControl().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Control#isOperationInProgress <em>Operation In Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation In Progress</em>'.
	 * @see CIM15.IEC61970.Meas.Control#isOperationInProgress()
	 * @see #getControl()
	 * @generated
	 */
	public EAttribute getControl_OperationInProgress() {
        return (EAttribute)getControl().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Meas.Control#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see CIM15.IEC61970.Meas.Control#getTimeStamp()
	 * @see #getControl()
	 * @generated
	 */
	public EAttribute getControl_TimeStamp() {
        return (EAttribute)getControl().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Meas.Validity <em>Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Validity</em>'.
	 * @see CIM15.IEC61970.Meas.Validity
	 * @generated
	 */
	public EEnum getValidity() {
		if (validityEEnum == null) {
			validityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI).getEClassifiers().get(19);
		}
		return validityEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public MeasFactory getMeasFactory() {
		return (MeasFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM15.IEC61970.Meas." + eClassifier.getName());
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
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.AccumulatorLimit <em>Accumulator Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.AccumulatorLimit
		 * @see CIM15.IEC61970.Meas.MeasPackage#getAccumulatorLimit()
		 * @generated
		 */
		public static final EClass ACCUMULATOR_LIMIT = eINSTANCE.getAccumulatorLimit();

		/**
		 * The meta object literal for the '<em><b>Limit Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ACCUMULATOR_LIMIT__LIMIT_SET = eINSTANCE.getAccumulatorLimit_LimitSet();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACCUMULATOR_LIMIT__VALUE = eINSTANCE.getAccumulatorLimit_Value();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.ValueToAlias <em>Value To Alias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.ValueToAlias
		 * @see CIM15.IEC61970.Meas.MeasPackage#getValueToAlias()
		 * @generated
		 */
		public static final EClass VALUE_TO_ALIAS = eINSTANCE.getValueToAlias();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute VALUE_TO_ALIAS__VALUE = eINSTANCE.getValueToAlias_Value();

		/**
		 * The meta object literal for the '<em><b>Value Alias Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference VALUE_TO_ALIAS__VALUE_ALIAS_SET = eINSTANCE.getValueToAlias_ValueAliasSet();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.MeasurementValueSource <em>Measurement Value Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.MeasurementValueSource
		 * @see CIM15.IEC61970.Meas.MeasPackage#getMeasurementValueSource()
		 * @generated
		 */
		public static final EClass MEASUREMENT_VALUE_SOURCE = eINSTANCE.getMeasurementValueSource();

		/**
		 * The meta object literal for the '<em><b>Measurement Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MEASUREMENT_VALUE_SOURCE__MEASUREMENT_VALUES = eINSTANCE.getMeasurementValueSource_MeasurementValues();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.Analog <em>Analog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.Analog
		 * @see CIM15.IEC61970.Meas.MeasPackage#getAnalog()
		 * @generated
		 */
		public static final EClass ANALOG = eINSTANCE.getAnalog();

		/**
		 * The meta object literal for the '<em><b>Limit Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ANALOG__LIMIT_SETS = eINSTANCE.getAnalog_LimitSets();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ANALOG__MAX_VALUE = eINSTANCE.getAnalog_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Analog Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ANALOG__ANALOG_VALUES = eINSTANCE.getAnalog_AnalogValues();

		/**
		 * The meta object literal for the '<em><b>Set Point</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ANALOG__SET_POINT = eINSTANCE.getAnalog_SetPoint();

		/**
		 * The meta object literal for the '<em><b>Normal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ANALOG__NORMAL_VALUE = eINSTANCE.getAnalog_NormalValue();

		/**
		 * The meta object literal for the '<em><b>Positive Flow In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ANALOG__POSITIVE_FLOW_IN = eINSTANCE.getAnalog_PositiveFlowIn();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ANALOG__MIN_VALUE = eINSTANCE.getAnalog_MinValue();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.AnalogValue <em>Analog Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.AnalogValue
		 * @see CIM15.IEC61970.Meas.MeasPackage#getAnalogValue()
		 * @generated
		 */
		public static final EClass ANALOG_VALUE = eINSTANCE.getAnalogValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ANALOG_VALUE__VALUE = eINSTANCE.getAnalogValue_Value();

		/**
		 * The meta object literal for the '<em><b>Alt Tie Meas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ANALOG_VALUE__ALT_TIE_MEAS = eINSTANCE.getAnalogValue_AltTieMeas();

		/**
		 * The meta object literal for the '<em><b>Analog</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ANALOG_VALUE__ANALOG = eINSTANCE.getAnalogValue_Analog();

		/**
		 * The meta object literal for the '<em><b>Alt Generating Unit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ANALOG_VALUE__ALT_GENERATING_UNIT = eINSTANCE.getAnalogValue_AltGeneratingUnit();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.Measurement <em>Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.Measurement
		 * @see CIM15.IEC61970.Meas.MeasPackage#getMeasurement()
		 * @generated
		 */
		public static final EClass MEASUREMENT = eINSTANCE.getMeasurement();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MEASUREMENT__TERMINAL = eINSTANCE.getMeasurement_Terminal();

		/**
		 * The meta object literal for the '<em><b>Phases</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MEASUREMENT__PHASES = eINSTANCE.getMeasurement_Phases();

		/**
		 * The meta object literal for the '<em><b>Measurement Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MEASUREMENT__MEASUREMENT_TYPE = eINSTANCE.getMeasurement_MeasurementType();

		/**
		 * The meta object literal for the '<em><b>Unit Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MEASUREMENT__UNIT_MULTIPLIER = eINSTANCE.getMeasurement_UnitMultiplier();

		/**
		 * The meta object literal for the '<em><b>Unit Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MEASUREMENT__UNIT_SYMBOL = eINSTANCE.getMeasurement_UnitSymbol();

		/**
		 * The meta object literal for the '<em><b>Power System Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MEASUREMENT__POWER_SYSTEM_RESOURCE = eINSTANCE.getMeasurement_PowerSystemResource();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MEASUREMENT__LOCATIONS = eINSTANCE.getMeasurement_Locations();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MEASUREMENT__ASSET = eINSTANCE.getMeasurement_Asset();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MEASUREMENT__DOCUMENTS = eINSTANCE.getMeasurement_Documents();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.ControlType <em>Control Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.ControlType
		 * @see CIM15.IEC61970.Meas.MeasPackage#getControlType()
		 * @generated
		 */
		public static final EClass CONTROL_TYPE = eINSTANCE.getControlType();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONTROL_TYPE__CONTROLS = eINSTANCE.getControlType_Controls();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.StringMeasurementValue <em>String Measurement Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.StringMeasurementValue
		 * @see CIM15.IEC61970.Meas.MeasPackage#getStringMeasurementValue()
		 * @generated
		 */
		public static final EClass STRING_MEASUREMENT_VALUE = eINSTANCE.getStringMeasurementValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STRING_MEASUREMENT_VALUE__VALUE = eINSTANCE.getStringMeasurementValue_Value();

		/**
		 * The meta object literal for the '<em><b>String Measurement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT = eINSTANCE.getStringMeasurementValue_StringMeasurement();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.StringMeasurement <em>String Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.StringMeasurement
		 * @see CIM15.IEC61970.Meas.MeasPackage#getStringMeasurement()
		 * @generated
		 */
		public static final EClass STRING_MEASUREMENT = eINSTANCE.getStringMeasurement();

		/**
		 * The meta object literal for the '<em><b>String Measurement Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES = eINSTANCE.getStringMeasurement_StringMeasurementValues();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.AnalogLimit <em>Analog Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.AnalogLimit
		 * @see CIM15.IEC61970.Meas.MeasPackage#getAnalogLimit()
		 * @generated
		 */
		public static final EClass ANALOG_LIMIT = eINSTANCE.getAnalogLimit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ANALOG_LIMIT__VALUE = eINSTANCE.getAnalogLimit_Value();

		/**
		 * The meta object literal for the '<em><b>Limit Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ANALOG_LIMIT__LIMIT_SET = eINSTANCE.getAnalogLimit_LimitSet();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.SetPoint <em>Set Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.SetPoint
		 * @see CIM15.IEC61970.Meas.MeasPackage#getSetPoint()
		 * @generated
		 */
		public static final EClass SET_POINT = eINSTANCE.getSetPoint();

		/**
		 * The meta object literal for the '<em><b>Analog</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SET_POINT__ANALOG = eINSTANCE.getSetPoint_Analog();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SET_POINT__MAX_VALUE = eINSTANCE.getSetPoint_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SET_POINT__MIN_VALUE = eINSTANCE.getSetPoint_MinValue();

		/**
		 * The meta object literal for the '<em><b>Normal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SET_POINT__NORMAL_VALUE = eINSTANCE.getSetPoint_NormalValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SET_POINT__VALUE = eINSTANCE.getSetPoint_Value();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.Limit <em>Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.Limit
		 * @see CIM15.IEC61970.Meas.MeasPackage#getLimit()
		 * @generated
		 */
		public static final EClass LIMIT = eINSTANCE.getLimit();

		/**
		 * The meta object literal for the '<em><b>Procedures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIMIT__PROCEDURES = eINSTANCE.getLimit_Procedures();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.Discrete <em>Discrete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.Discrete
		 * @see CIM15.IEC61970.Meas.MeasPackage#getDiscrete()
		 * @generated
		 */
		public static final EClass DISCRETE = eINSTANCE.getDiscrete();

		/**
		 * The meta object literal for the '<em><b>Normal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DISCRETE__NORMAL_VALUE = eINSTANCE.getDiscrete_NormalValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DISCRETE__MIN_VALUE = eINSTANCE.getDiscrete_MinValue();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DISCRETE__COMMAND = eINSTANCE.getDiscrete_Command();

		/**
		 * The meta object literal for the '<em><b>Discrete Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DISCRETE__DISCRETE_VALUES = eINSTANCE.getDiscrete_DiscreteValues();

		/**
		 * The meta object literal for the '<em><b>Value Alias Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DISCRETE__VALUE_ALIAS_SET = eINSTANCE.getDiscrete_ValueAliasSet();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DISCRETE__MAX_VALUE = eINSTANCE.getDiscrete_MaxValue();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.ValueAliasSet <em>Value Alias Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.ValueAliasSet
		 * @see CIM15.IEC61970.Meas.MeasPackage#getValueAliasSet()
		 * @generated
		 */
		public static final EClass VALUE_ALIAS_SET = eINSTANCE.getValueAliasSet();

		/**
		 * The meta object literal for the '<em><b>Discretes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference VALUE_ALIAS_SET__DISCRETES = eINSTANCE.getValueAliasSet_Discretes();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference VALUE_ALIAS_SET__COMMANDS = eINSTANCE.getValueAliasSet_Commands();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference VALUE_ALIAS_SET__VALUES = eINSTANCE.getValueAliasSet_Values();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.Quality61850 <em>Quality61850</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.Quality61850
		 * @see CIM15.IEC61970.Meas.MeasPackage#getQuality61850()
		 * @generated
		 */
		public static final EClass QUALITY61850 = eINSTANCE.getQuality61850();

		/**
		 * The meta object literal for the '<em><b>Over Flow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute QUALITY61850__OVER_FLOW = eINSTANCE.getQuality61850_OverFlow();

		/**
		 * The meta object literal for the '<em><b>Estimator Replaced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute QUALITY61850__ESTIMATOR_REPLACED = eINSTANCE.getQuality61850_EstimatorReplaced();

		/**
		 * The meta object literal for the '<em><b>Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute QUALITY61850__VALIDITY = eINSTANCE.getQuality61850_Validity();

		/**
		 * The meta object literal for the '<em><b>Operator Blocked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute QUALITY61850__OPERATOR_BLOCKED = eINSTANCE.getQuality61850_OperatorBlocked();

		/**
		 * The meta object literal for the '<em><b>Old Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute QUALITY61850__OLD_DATA = eINSTANCE.getQuality61850_OldData();

		/**
		 * The meta object literal for the '<em><b>Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute QUALITY61850__FAILURE = eINSTANCE.getQuality61850_Failure();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute QUALITY61850__SOURCE = eINSTANCE.getQuality61850_Source();

		/**
		 * The meta object literal for the '<em><b>Out Of Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute QUALITY61850__OUT_OF_RANGE = eINSTANCE.getQuality61850_OutOfRange();

		/**
		 * The meta object literal for the '<em><b>Bad Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute QUALITY61850__BAD_REFERENCE = eINSTANCE.getQuality61850_BadReference();

		/**
		 * The meta object literal for the '<em><b>Suspect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute QUALITY61850__SUSPECT = eINSTANCE.getQuality61850_Suspect();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute QUALITY61850__TEST = eINSTANCE.getQuality61850_Test();

		/**
		 * The meta object literal for the '<em><b>Oscillatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute QUALITY61850__OSCILLATORY = eINSTANCE.getQuality61850_Oscillatory();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.AccumulatorValue <em>Accumulator Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.AccumulatorValue
		 * @see CIM15.IEC61970.Meas.MeasPackage#getAccumulatorValue()
		 * @generated
		 */
		public static final EClass ACCUMULATOR_VALUE = eINSTANCE.getAccumulatorValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACCUMULATOR_VALUE__VALUE = eINSTANCE.getAccumulatorValue_Value();

		/**
		 * The meta object literal for the '<em><b>Accumulator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ACCUMULATOR_VALUE__ACCUMULATOR = eINSTANCE.getAccumulatorValue_Accumulator();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.Command <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.Command
		 * @see CIM15.IEC61970.Meas.MeasPackage#getCommand()
		 * @generated
		 */
		public static final EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Discrete</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMMAND__DISCRETE = eINSTANCE.getCommand_Discrete();

		/**
		 * The meta object literal for the '<em><b>Value Alias Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COMMAND__VALUE_ALIAS_SET = eINSTANCE.getCommand_ValueAliasSet();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COMMAND__VALUE = eINSTANCE.getCommand_Value();

		/**
		 * The meta object literal for the '<em><b>Normal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COMMAND__NORMAL_VALUE = eINSTANCE.getCommand_NormalValue();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.Accumulator <em>Accumulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.Accumulator
		 * @see CIM15.IEC61970.Meas.MeasPackage#getAccumulator()
		 * @generated
		 */
		public static final EClass ACCUMULATOR = eINSTANCE.getAccumulator();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACCUMULATOR__MAX_VALUE = eINSTANCE.getAccumulator_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Limit Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ACCUMULATOR__LIMIT_SETS = eINSTANCE.getAccumulator_LimitSets();

		/**
		 * The meta object literal for the '<em><b>Accumulator Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ACCUMULATOR__ACCUMULATOR_VALUES = eINSTANCE.getAccumulator_AccumulatorValues();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.MeasurementValueQuality <em>Measurement Value Quality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.MeasurementValueQuality
		 * @see CIM15.IEC61970.Meas.MeasPackage#getMeasurementValueQuality()
		 * @generated
		 */
		public static final EClass MEASUREMENT_VALUE_QUALITY = eINSTANCE.getMeasurementValueQuality();

		/**
		 * The meta object literal for the '<em><b>Measurement Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MEASUREMENT_VALUE_QUALITY__MEASUREMENT_VALUE = eINSTANCE.getMeasurementValueQuality_MeasurementValue();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.MeasurementValue <em>Measurement Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.MeasurementValue
		 * @see CIM15.IEC61970.Meas.MeasPackage#getMeasurementValue()
		 * @generated
		 */
		public static final EClass MEASUREMENT_VALUE = eINSTANCE.getMeasurementValue();

		/**
		 * The meta object literal for the '<em><b>Gml Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MEASUREMENT_VALUE__GML_VALUES = eINSTANCE.getMeasurementValue_GmlValues();

		/**
		 * The meta object literal for the '<em><b>Measurement Value Quality</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MEASUREMENT_VALUE__MEASUREMENT_VALUE_QUALITY = eINSTANCE.getMeasurementValue_MeasurementValueQuality();

		/**
		 * The meta object literal for the '<em><b>Sensor Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MEASUREMENT_VALUE__SENSOR_ACCURACY = eINSTANCE.getMeasurementValue_SensorAccuracy();

		/**
		 * The meta object literal for the '<em><b>Procedure Data Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MEASUREMENT_VALUE__PROCEDURE_DATA_SETS = eINSTANCE.getMeasurementValue_ProcedureDataSets();

		/**
		 * The meta object literal for the '<em><b>Measurement Value Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MEASUREMENT_VALUE__MEASUREMENT_VALUE_SOURCE = eINSTANCE.getMeasurementValue_MeasurementValueSource();

		/**
		 * The meta object literal for the '<em><b>Erp Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MEASUREMENT_VALUE__ERP_PERSON = eINSTANCE.getMeasurementValue_ErpPerson();

		/**
		 * The meta object literal for the '<em><b>Remote Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MEASUREMENT_VALUE__REMOTE_SOURCE = eINSTANCE.getMeasurementValue_RemoteSource();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MEASUREMENT_VALUE__TIME_STAMP = eINSTANCE.getMeasurementValue_TimeStamp();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.DiscreteValue <em>Discrete Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.DiscreteValue
		 * @see CIM15.IEC61970.Meas.MeasPackage#getDiscreteValue()
		 * @generated
		 */
		public static final EClass DISCRETE_VALUE = eINSTANCE.getDiscreteValue();

		/**
		 * The meta object literal for the '<em><b>Discrete</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DISCRETE_VALUE__DISCRETE = eINSTANCE.getDiscreteValue_Discrete();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DISCRETE_VALUE__VALUE = eINSTANCE.getDiscreteValue_Value();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.AnalogLimitSet <em>Analog Limit Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.AnalogLimitSet
		 * @see CIM15.IEC61970.Meas.MeasPackage#getAnalogLimitSet()
		 * @generated
		 */
		public static final EClass ANALOG_LIMIT_SET = eINSTANCE.getAnalogLimitSet();

		/**
		 * The meta object literal for the '<em><b>Limits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ANALOG_LIMIT_SET__LIMITS = eINSTANCE.getAnalogLimitSet_Limits();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ANALOG_LIMIT_SET__MEASUREMENTS = eINSTANCE.getAnalogLimitSet_Measurements();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.LimitSet <em>Limit Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.LimitSet
		 * @see CIM15.IEC61970.Meas.MeasPackage#getLimitSet()
		 * @generated
		 */
		public static final EClass LIMIT_SET = eINSTANCE.getLimitSet();

		/**
		 * The meta object literal for the '<em><b>Is Percentage Limits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LIMIT_SET__IS_PERCENTAGE_LIMITS = eINSTANCE.getLimitSet_IsPercentageLimits();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.AccumulatorLimitSet <em>Accumulator Limit Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.AccumulatorLimitSet
		 * @see CIM15.IEC61970.Meas.MeasPackage#getAccumulatorLimitSet()
		 * @generated
		 */
		public static final EClass ACCUMULATOR_LIMIT_SET = eINSTANCE.getAccumulatorLimitSet();

		/**
		 * The meta object literal for the '<em><b>Limits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ACCUMULATOR_LIMIT_SET__LIMITS = eINSTANCE.getAccumulatorLimitSet_Limits();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ACCUMULATOR_LIMIT_SET__MEASUREMENTS = eINSTANCE.getAccumulatorLimitSet_Measurements();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.Control <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.Control
		 * @see CIM15.IEC61970.Meas.MeasPackage#getControl()
		 * @generated
		 */
		public static final EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Remote Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONTROL__REMOTE_CONTROL = eINSTANCE.getControl_RemoteControl();

		/**
		 * The meta object literal for the '<em><b>Regulating Cond Eq</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONTROL__REGULATING_COND_EQ = eINSTANCE.getControl_RegulatingCondEq();

		/**
		 * The meta object literal for the '<em><b>Control Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONTROL__CONTROL_TYPE = eINSTANCE.getControl_ControlType();

		/**
		 * The meta object literal for the '<em><b>Unit Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONTROL__UNIT_SYMBOL = eINSTANCE.getControl_UnitSymbol();

		/**
		 * The meta object literal for the '<em><b>Unit Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONTROL__UNIT_MULTIPLIER = eINSTANCE.getControl_UnitMultiplier();

		/**
		 * The meta object literal for the '<em><b>Operation In Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONTROL__OPERATION_IN_PROGRESS = eINSTANCE.getControl_OperationInProgress();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONTROL__TIME_STAMP = eINSTANCE.getControl_TimeStamp();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Meas.Validity <em>Validity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Meas.Validity
		 * @see CIM15.IEC61970.Meas.MeasPackage#getValidity()
		 * @generated
		 */
		public static final EEnum VALIDITY = eINSTANCE.getValidity();

	}

} //MeasPackage
